package org.apache.maven.api.annotations;
@org.apache.maven.api.annotations.Experimental
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface Config {
    org.apache.maven.api.annotations.Config.Source source() default org.apache.maven.api.annotations.Config.Source.USER_PROPERTIES;

    java.lang.String type() default "java.lang.String";

    java.lang.String defaultValue() default "";

    boolean readOnly() default false;

    enum Source {

        USER_PROPERTIES,
        MODEL;
    }
}
