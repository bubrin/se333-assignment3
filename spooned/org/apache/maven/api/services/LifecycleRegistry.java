package org.apache.maven.api.services;
public interface LifecycleRegistry extends org.apache.maven.api.services.ExtensibleEnumRegistry<org.apache.maven.api.Lifecycle> , java.lang.Iterable<org.apache.maven.api.Lifecycle> {
    default java.util.stream.Stream<org.apache.maven.api.Lifecycle> stream() {
        return java.util.stream.StreamSupport.stream(spliterator(), false);
    }

    java.util.List<java.lang.String> computePhases(org.apache.maven.api.Lifecycle lifecycle);
}
