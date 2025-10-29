package org.apache.maven.api.services.model;
@org.apache.maven.api.annotations.Experimental
@org.apache.maven.api.annotations.ThreadSafe
public interface ModelCache {
    <T> T computeIfAbsent(java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.String tag, java.util.function.Supplier<T> data);

    <T> T computeIfAbsent(org.apache.maven.api.services.Source path, java.lang.String tag, java.util.function.Supplier<T> data);

    void clear();
}
