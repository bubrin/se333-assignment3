package org.apache.maven.api.plugin.annotations;
@org.apache.maven.api.annotations.Experimental
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target({ java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD })
@java.lang.annotation.Inherited
public @interface Parameter {
    @org.apache.maven.api.annotations.Nonnull
    java.lang.String name() default "";

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String alias() default "";

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String property() default "";

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String defaultValue() default "";

    boolean required() default false;

    boolean readonly() default false;
}
