package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Dependency;
import org.apache.maven.api.model.Parent;
public interface ModelResolver extends org.apache.maven.api.Service {
    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.ModelSource resolveModel(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nullable
    java.util.List<org.apache.maven.api.RemoteRepository> repositories, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.model.Parent parent, @org.apache.maven.api.annotations.Nonnull
    java.util.concurrent.atomic.AtomicReference<org.apache.maven.api.model.Parent> modified) throws org.apache.maven.api.services.model.ModelResolverException {
        return resolveModel(session, repositories, parent.getGroupId(), parent.getArtifactId(), parent.getVersion(), null, version -> modified.set(parent.withVersion(version)));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.ModelSource resolveModel(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nullable
    java.util.List<org.apache.maven.api.RemoteRepository> repositories, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.model.Dependency dependency, @org.apache.maven.api.annotations.Nonnull
    java.util.concurrent.atomic.AtomicReference<org.apache.maven.api.model.Dependency> modified) throws org.apache.maven.api.services.model.ModelResolverException {
        return resolveModel(session, repositories, dependency.getGroupId(), dependency.getArtifactId(), dependency.getVersion(), dependency.getClassifier(), version -> modified.set(dependency.withVersion(version)));
    }

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelSource resolveModel(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nullable
    java.util.List<org.apache.maven.api.RemoteRepository> repositories, @org.apache.maven.api.annotations.Nonnull
    java.lang.String groupId, @org.apache.maven.api.annotations.Nonnull
    java.lang.String artifactId, @org.apache.maven.api.annotations.Nonnull
    java.lang.String version, @org.apache.maven.api.annotations.Nullable
    java.lang.String classifier, @org.apache.maven.api.annotations.Nonnull
    java.util.function.Consumer<java.lang.String> resolvedVersion) throws org.apache.maven.api.services.model.ModelResolverException;
}
