package dev.ninjdai.doaddoncreate.reflection;


import dev.ninjdai.doaddoncreate.DoAddonCreate;
import dev.ninjdai.doaddoncreate.DoAddonExpectPlatform;
import dev.ninjdai.doaddoncreate.reflection.annotations.RunFirst;
import dev.ninjdai.doaddoncreate.reflection.annotations.SupportsMod;
import org.reflections.Reflections;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.function.Consumer;

public class SupportLoader {

    static ArrayList<Class<? extends ModSupport>> MOD_SUPPORT_CLASSES = new ArrayList<>();

    public static void loadAllSupports() {
        Reflections reflections = new Reflections(
                "dev.ninjdai.doaddoncreate.dependant"
        );

        Set<Class<? extends ModSupport>> modSupportClasses = reflections.getSubTypesOf(ModSupport.class);

        for (Class<? extends ModSupport> clazz : modSupportClasses) {
            if (!clazz.isAnnotationPresent(SupportsMod.class)) {
                DoAddonCreate.LOGGER.error("Class {} extends ModSupport but does not have a @SupportsMod annotation, ignoring.", clazz.getName());
                continue;
            }

            if (!DoAddonExpectPlatform.isModLoaded(clazz.getAnnotation(SupportsMod.class).value())) {
                continue;
            }

            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(RunFirst.class)) {
                    try {
                        method.setAccessible(true);
                        method.invoke(null);
                    } catch (Exception e) {
                        DoAddonCreate.LOGGER.error("Error invoking method {}: {}", method.getName(), e.getMessage());
                    }
                }
            }

            MOD_SUPPORT_CLASSES.add(clazz);
        }
    }

    public static void forAllLoadedDo(Consumer<ModSupport> todo) {
        MOD_SUPPORT_CLASSES.forEach((clazz) -> {
            try {
                todo.accept(clazz.getDeclaredConstructor().newInstance());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static String[] classList() {
        return MOD_SUPPORT_CLASSES.stream().map(Class::getName).toArray(String[]::new);
    }

}
