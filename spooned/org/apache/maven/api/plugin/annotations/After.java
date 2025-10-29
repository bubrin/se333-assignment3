package org.apache.maven.api.plugin.annotations;
@org.apache.maven.api.annotations.Experimental
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE)
@java.lang.annotation.Inherited
public @interface After {
    enum Type {

        PROJECT,
        DEPENDENCIES,
        CHILDREN;
    }

    java.lang.String phase();

    org.apache.maven.api.plugin.annotations.After.Type type();

    java.lang.String scope() default "";
}
