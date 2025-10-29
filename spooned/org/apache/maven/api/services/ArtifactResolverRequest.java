package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
@org.apache.maven.api.annotations.Immutable
public interface ArtifactResolverRequest {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session getSession();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<? extends org.apache.maven.api.ArtifactCoordinates> getCoordinates();

    @org.apache.maven.api.annotations.Nonnull
    java.util.List<org.apache.maven.api.RemoteRepository> getRepositories();

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ArtifactResolverRequest.ArtifactResolverRequestBuilder builder() {
        return new org.apache.maven.api.services.ArtifactResolverRequest.ArtifactResolverRequestBuilder();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ArtifactResolverRequest build(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<? extends org.apache.maven.api.ArtifactCoordinates> coordinates) {
        return org.apache.maven.api.services.ArtifactResolverRequest.builder().session(java.util.Objects.requireNonNull(session, "session cannot be null")).coordinates(java.util.Objects.requireNonNull(coordinates, "coordinates cannot be null")).build();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ArtifactResolverRequest build(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<? extends org.apache.maven.api.ArtifactCoordinates> coordinates, java.util.List<org.apache.maven.api.RemoteRepository> repositories) {
        return org.apache.maven.api.services.ArtifactResolverRequest.builder().session(java.util.Objects.requireNonNull(session, "session cannot be null")).coordinates(java.util.Objects.requireNonNull(coordinates, "coordinates cannot be null")).repositories(repositories).build();
    }

    @org.apache.maven.api.annotations.NotThreadSafe
    class ArtifactResolverRequestBuilder {
        org.apache.maven.api.Session session;

        java.util.Collection<? extends org.apache.maven.api.ArtifactCoordinates> coordinates;

        java.util.List<org.apache.maven.api.RemoteRepository> repositories;

        ArtifactResolverRequestBuilder() {
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.ArtifactResolverRequest.ArtifactResolverRequestBuilder session(org.apache.maven.api.Session session) {
            this.session = session;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.ArtifactResolverRequest.ArtifactResolverRequestBuilder coordinates(java.util.Collection<? extends org.apache.maven.api.ArtifactCoordinates> coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.ArtifactResolverRequest.ArtifactResolverRequestBuilder repositories(java.util.List<org.apache.maven.api.RemoteRepository> repositories) {
            this.repositories = repositories;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.ArtifactResolverRequest build() {
            return new org.apache.maven.api.services.ArtifactResolverRequest.ArtifactResolverRequestBuilder.DefaultArtifactResolverRequest(session, coordinates, repositories);
        }

        private static class DefaultArtifactResolverRequest extends org.apache.maven.api.services.BaseRequest<org.apache.maven.api.Session> implements org.apache.maven.api.services.ArtifactResolverRequest {
            @org.apache.maven.api.annotations.Nonnull
            private final java.util.Collection<? extends org.apache.maven.api.ArtifactCoordinates> coordinates;

            @org.apache.maven.api.annotations.Nullable
            private final java.util.List<org.apache.maven.api.RemoteRepository> repositories;

            DefaultArtifactResolverRequest(@org.apache.maven.api.annotations.Nonnull
            org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
            java.util.Collection<? extends org.apache.maven.api.ArtifactCoordinates> coordinates, @org.apache.maven.api.annotations.Nonnull
            java.util.List<org.apache.maven.api.RemoteRepository> repositories) {
                super(session);
                this.coordinates = java.util.List.copyOf(java.util.Objects.requireNonNull(coordinates, "coordinates cannot be null"));
                this.repositories = repositories;
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public java.util.Collection<? extends org.apache.maven.api.ArtifactCoordinates> getCoordinates() {
                return coordinates;
            }

            @org.apache.maven.api.annotations.Nullable
            @java.lang.Override
            public java.util.List<org.apache.maven.api.RemoteRepository> getRepositories() {
                return repositories;
            }
        }
    }
}
