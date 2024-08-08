package dev.ninjdai.doaddoncreate.reflection.annotations;

import dev.ninjdai.doaddoncreate.reflection.ModSupport;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to mark methods to be run in addition to the methods statically invoked by classes annotated by {@link ModSupport}.
 * They must be static and housed by a class matching the aforementioned criteria.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RunFirst {
}
