package dev.ninjdai.doaddoncreate.reflection.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SupportsMod {
    String value();
}
