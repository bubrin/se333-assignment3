package org.apache.maven.api.plugin.annotations;
@org.apache.maven.api.annotations.Experimental
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
@java.lang.annotation.Inherited
public @interface Execute {
    @org.apache.maven.api.annotations.Nonnull
    java.lang.String phase() default "";

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String goal() default "";

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String lifecycle() default "";
}
