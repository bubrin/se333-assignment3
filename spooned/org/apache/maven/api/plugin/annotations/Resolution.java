package org.apache.maven.api.plugin.annotations;
@org.apache.maven.api.annotations.Experimental
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(java.lang.annotation.ElementType.FIELD)
public @interface Resolution {
    java.lang.String pathScope() default "";

    java.lang.String requestType() default "";
}
