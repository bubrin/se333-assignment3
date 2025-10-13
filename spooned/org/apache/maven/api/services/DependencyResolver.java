package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface DependencyResolver extends org.apache.maven.api.Service {
    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.DependencyResolverResult collect(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.DependencyCoordinates root, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.PathScope scope) {
        return collect(org.apache.maven.api.services.DependencyResolverRequest.build(session, org.apache.maven.api.services.DependencyResolverRequest.RequestType.COLLECT, root, scope));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.DependencyResolverResult collect(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Project project, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.PathScope scope) {
        return collect(org.apache.maven.api.services.DependencyResolverRequest.build(session, org.apache.maven.api.services.DependencyResolverRequest.RequestType.COLLECT, project, scope));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.DependencyResolverResult collect(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Artifact artifact, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.PathScope scope) {
        return collect(org.apache.maven.api.services.DependencyResolverRequest.build(session, org.apache.maven.api.services.DependencyResolverRequest.RequestType.COLLECT, artifact, scope));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.DependencyResolverResult collect(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.DependencyResolverRequest request) {
        if (request.getRequestType() != org.apache.maven.api.services.DependencyResolverRequest.RequestType.COLLECT) {
            throw new java.lang.IllegalArgumentException("requestType should be COLLECT when calling collect()");
        }
        return resolve(request);
    }

    java.util.List<org.apache.maven.api.Node> flatten(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Node node, @org.apache.maven.api.annotations.Nullable
    org.apache.maven.api.PathScope scope) throws org.apache.maven.api.services.DependencyResolverException;

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.DependencyResolverResult flatten(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Project project, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.PathScope scope) {
        return flatten(org.apache.maven.api.services.DependencyResolverRequest.build(session, org.apache.maven.api.services.DependencyResolverRequest.RequestType.FLATTEN, project, scope));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.DependencyResolverResult flatten(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.DependencyResolverRequest request) {
        if (request.getRequestType() != org.apache.maven.api.services.DependencyResolverRequest.RequestType.FLATTEN) {
            throw new java.lang.IllegalArgumentException("requestType should be FLATTEN when calling flatten()");
        }
        return resolve(request);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.DependencyResolverResult resolve(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Project project) {
        return resolve(org.apache.maven.api.services.DependencyResolverRequest.build(session, org.apache.maven.api.services.DependencyResolverRequest.RequestType.RESOLVE, project));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.DependencyResolverResult resolve(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Project project, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.PathScope scope) {
        return resolve(org.apache.maven.api.services.DependencyResolverRequest.build(session, org.apache.maven.api.services.DependencyResolverRequest.RequestType.RESOLVE, project, scope));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.DependencyResolverResult resolve(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.DependencyCoordinates dependency) {
        return resolve(org.apache.maven.api.services.DependencyResolverRequest.build(session, org.apache.maven.api.services.DependencyResolverRequest.RequestType.RESOLVE, dependency));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.DependencyResolverResult resolve(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.DependencyCoordinates dependency, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.PathScope scope) {
        return resolve(org.apache.maven.api.services.DependencyResolverRequest.build(session, org.apache.maven.api.services.DependencyResolverRequest.RequestType.RESOLVE, dependency, scope));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.DependencyResolverResult resolve(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    java.util.List<org.apache.maven.api.DependencyCoordinates> dependencies) {
        return resolve(org.apache.maven.api.services.DependencyResolverRequest.build(session, org.apache.maven.api.services.DependencyResolverRequest.RequestType.RESOLVE, dependencies));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.DependencyResolverResult resolve(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    java.util.List<org.apache.maven.api.DependencyCoordinates> dependencies, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.PathScope scope) {
        return resolve(org.apache.maven.api.services.DependencyResolverRequest.build(session, org.apache.maven.api.services.DependencyResolverRequest.RequestType.RESOLVE, dependencies, scope));
    }

    org.apache.maven.api.services.DependencyResolverResult resolve(org.apache.maven.api.services.DependencyResolverRequest request) throws org.apache.maven.api.services.DependencyResolverException, org.apache.maven.api.services.ArtifactResolverException;
}
