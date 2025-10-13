package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
@org.apache.maven.api.annotations.Immutable
public interface ArtifactDeployerRequest {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session getSession();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.RemoteRepository getRepository();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.ProducedArtifact> getArtifacts();

    int getRetryFailedDeploymentCount();

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ArtifactDeployerRequest.ArtifactDeployerRequestBuilder builder() {
        return new org.apache.maven.api.services.ArtifactDeployerRequest.ArtifactDeployerRequestBuilder();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ArtifactDeployerRequest build(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.RemoteRepository repository, @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.ProducedArtifact> artifacts) {
        return org.apache.maven.api.services.ArtifactDeployerRequest.builder().session(java.util.Objects.requireNonNull(session, "session cannot be null")).repository(java.util.Objects.requireNonNull(repository, "repository cannot be null")).artifacts(java.util.Objects.requireNonNull(artifacts, "artifacts cannot be null")).build();
    }

    class ArtifactDeployerRequestBuilder {
        org.apache.maven.api.Session session;

        org.apache.maven.api.RemoteRepository repository;

        java.util.Collection<org.apache.maven.api.ProducedArtifact> artifacts;

        int retryFailedDeploymentCount;

        ArtifactDeployerRequestBuilder() {
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.ArtifactDeployerRequest.ArtifactDeployerRequestBuilder session(org.apache.maven.api.Session session) {
            this.session = session;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.ArtifactDeployerRequest.ArtifactDeployerRequestBuilder repository(org.apache.maven.api.RemoteRepository repository) {
            this.repository = repository;
            return this;
        }

        public org.apache.maven.api.services.ArtifactDeployerRequest.ArtifactDeployerRequestBuilder artifacts(java.util.Collection<org.apache.maven.api.ProducedArtifact> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public org.apache.maven.api.services.ArtifactDeployerRequest.ArtifactDeployerRequestBuilder retryFailedDeploymentCount(int retryFailedDeploymentCount) {
            this.retryFailedDeploymentCount = retryFailedDeploymentCount;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.ArtifactDeployerRequest build() {
            return new org.apache.maven.api.services.ArtifactDeployerRequest.ArtifactDeployerRequestBuilder.DefaultArtifactDeployerRequest(session, repository, artifacts, retryFailedDeploymentCount);
        }

        private static class DefaultArtifactDeployerRequest extends org.apache.maven.api.services.BaseRequest<org.apache.maven.api.Session> implements org.apache.maven.api.services.ArtifactDeployerRequest {
            private final org.apache.maven.api.RemoteRepository repository;

            private final java.util.Collection<org.apache.maven.api.ProducedArtifact> artifacts;

            private final int retryFailedDeploymentCount;

            DefaultArtifactDeployerRequest(@org.apache.maven.api.annotations.Nonnull
            org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
            org.apache.maven.api.RemoteRepository repository, @org.apache.maven.api.annotations.Nonnull
            java.util.Collection<org.apache.maven.api.ProducedArtifact> artifacts, int retryFailedDeploymentCount) {
                super(session);
                this.repository = java.util.Objects.requireNonNull(repository, "repository cannot be null");
                this.artifacts = java.util.List.copyOf(java.util.Objects.requireNonNull(artifacts, "artifacts cannot be null"));
                this.retryFailedDeploymentCount = retryFailedDeploymentCount;
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public org.apache.maven.api.RemoteRepository getRepository() {
                return repository;
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public java.util.Collection<org.apache.maven.api.ProducedArtifact> getArtifacts() {
                return artifacts;
            }

            @java.lang.Override
            public int getRetryFailedDeploymentCount() {
                return retryFailedDeploymentCount;
            }
        }
    }
}
