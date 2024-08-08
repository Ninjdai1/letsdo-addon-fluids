package dev.ninjdai.doaddoncreate.reflection.annotations;

import dev.ninjdai.doaddoncreate.reflection.ModSupport;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to mark methods to be run in addition to methods inherited from {@link ModSupport}.
 * They must be static and housed by a class extending {@link ModSupport} and annotated by {@link SupportsMod}.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RunFirst {
}
