package dev.ninjdai.doaddoncreate.reflection;

import dev.ninjdai.doaddoncreate.DoAddonExpectPlatform;
import dev.ninjdai.doaddoncreate.reflection.annotations.SupportsMod;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class ModDependantMixinPlugin implements IMixinConfigPlugin {

    public void onLoad(String mixinPackage) {}

    public String getRefMapperConfig() { return null; }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        try {
            Class<?> clazz = Class.forName(mixinClassName);
            return !clazz.isAnnotationPresent(SupportsMod.class) ||
            DoAddonExpectPlatform.isModLoaded(
                            clazz.getAnnotation(SupportsMod.class).value()
            );
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {}

    @Override
    public List<String> getMixins() { return null; }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}
}
