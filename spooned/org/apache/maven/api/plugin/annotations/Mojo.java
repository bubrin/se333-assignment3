package org.apache.maven.api.plugin.annotations;
@org.apache.maven.api.annotations.Experimental
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
@java.lang.annotation.Inherited
public @interface Mojo {
    @org.apache.maven.api.annotations.Nonnull
    java.lang.String name();

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String defaultPhase() default "";

    boolean projectRequired() default true;

    boolean aggregator() default false;

    boolean onlineRequired() default false;

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String configurator() default "";

    @org.apache.maven.api.annotations.Nonnull
    boolean dependencyCollection() default false;

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String dependencyResolutionPathScopes() default "";
}
