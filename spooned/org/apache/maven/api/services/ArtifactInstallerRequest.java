package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
@org.apache.maven.api.annotations.Immutable
public interface ArtifactInstallerRequest {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session getSession();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.ProducedArtifact> getArtifacts();

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ArtifactInstallerRequest.ArtifactInstallerRequestBuilder builder() {
        return new org.apache.maven.api.services.ArtifactInstallerRequest.ArtifactInstallerRequestBuilder();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ArtifactInstallerRequest build(org.apache.maven.api.Session session, java.util.Collection<org.apache.maven.api.ProducedArtifact> artifacts) {
        return org.apache.maven.api.services.ArtifactInstallerRequest.builder().session(java.util.Objects.requireNonNull(session, "session cannot be null")).artifacts(java.util.Objects.requireNonNull(artifacts, "artifacts cannot be null")).build();
    }

    @org.apache.maven.api.annotations.NotThreadSafe
    class ArtifactInstallerRequestBuilder {
        org.apache.maven.api.Session session;

        java.util.Collection<org.apache.maven.api.ProducedArtifact> artifacts = java.util.Collections.emptyList();

        ArtifactInstallerRequestBuilder() {
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.ArtifactInstallerRequest.ArtifactInstallerRequestBuilder session(@org.apache.maven.api.annotations.Nonnull
        org.apache.maven.api.Session session) {
            this.session = session;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.ArtifactInstallerRequest.ArtifactInstallerRequestBuilder artifacts(@org.apache.maven.api.annotations.Nullable
        java.util.Collection<org.apache.maven.api.ProducedArtifact> artifacts) {
            this.artifacts = (artifacts != null) ? artifacts : java.util.Collections.emptyList();
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.ArtifactInstallerRequest build() {
            return new org.apache.maven.api.services.ArtifactInstallerRequest.ArtifactInstallerRequestBuilder.DefaultArtifactInstallerRequest(session, artifacts);
        }

        static class DefaultArtifactInstallerRequest extends org.apache.maven.api.services.BaseRequest<org.apache.maven.api.Session> implements org.apache.maven.api.services.ArtifactInstallerRequest {
            private final java.util.Collection<org.apache.maven.api.ProducedArtifact> artifacts;

            DefaultArtifactInstallerRequest(@org.apache.maven.api.annotations.Nonnull
            org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
            java.util.Collection<org.apache.maven.api.ProducedArtifact> artifacts) {
                super(session);
                this.artifacts = java.util.List.copyOf(java.util.Objects.requireNonNull(artifacts, "artifacts cannot be null"));
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public java.util.Collection<org.apache.maven.api.ProducedArtifact> getArtifacts() {
                return artifacts;
            }
        }
    }
}
