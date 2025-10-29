package org.apache.maven.api.services;
import org.apache.maven.api.model.Profile;
@org.apache.maven.api.annotations.Experimental
@org.apache.maven.api.annotations.Immutable
public interface ModelBuilderRequest {
    enum RequestType {

        BUILD_PROJECT,
        BUILD_EFFECTIVE,
        BUILD_CONSUMER,
        CONSUMER_PARENT,
        CONSUMER_DEPENDENCY;
    }

    enum RepositoryMerging {

        POM_DOMINANT,
        REQUEST_DOMINANT;
    }

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session getSession();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelSource getSource();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelBuilderRequest.RequestType getRequestType();

    boolean isLocationTracking();

    boolean isRecursive();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.model.Profile> getProfiles();

    @org.apache.maven.api.annotations.Nonnull
    java.util.List<java.lang.String> getActiveProfileIds();

    @org.apache.maven.api.annotations.Nonnull
    java.util.List<java.lang.String> getInactiveProfileIds();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Map<java.lang.String, java.lang.String> getSystemProperties();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Map<java.lang.String, java.lang.String> getUserProperties();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelBuilderRequest.RepositoryMerging getRepositoryMerging();

    @org.apache.maven.api.annotations.Nullable
    java.util.List<org.apache.maven.api.RemoteRepository> getRepositories();

    @org.apache.maven.api.annotations.Nullable
    org.apache.maven.api.services.ModelTransformer getLifecycleBindingsInjector();

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ModelBuilderRequest build(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelBuilderRequest request, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelSource source) {
        return org.apache.maven.api.services.ModelBuilderRequest.builder(java.util.Objects.requireNonNull(request, "request cannot be null")).source(java.util.Objects.requireNonNull(source, "source cannot be null")).build();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ModelBuilderRequest build(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelSource source) {
        return org.apache.maven.api.services.ModelBuilderRequest.builder().session(java.util.Objects.requireNonNull(session, "session cannot be null")).source(java.util.Objects.requireNonNull(source, "source cannot be null")).build();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ModelBuilderRequest build(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path path) {
        return org.apache.maven.api.services.ModelBuilderRequest.builder().session(java.util.Objects.requireNonNull(session, "session cannot be null")).source(org.apache.maven.api.services.ModelSource.fromPath(path)).build();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder builder() {
        return new org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder builder(org.apache.maven.api.services.ModelBuilderRequest request) {
        return new org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder(request);
    }

    @org.apache.maven.api.annotations.NotThreadSafe
    class ModelBuilderRequestBuilder {
        org.apache.maven.api.Session session;

        org.apache.maven.api.services.ModelBuilderRequest.RequestType requestType;

        boolean locationTracking;

        boolean recursive;

        org.apache.maven.api.services.ModelSource source;

        java.util.Collection<org.apache.maven.api.model.Profile> profiles;

        java.util.List<java.lang.String> activeProfileIds;

        java.util.List<java.lang.String> inactiveProfileIds;

        java.util.Map<java.lang.String, java.lang.String> systemProperties;

        java.util.Map<java.lang.String, java.lang.String> userProperties;

        org.apache.maven.api.services.ModelBuilderRequest.RepositoryMerging repositoryMerging;

        java.util.List<org.apache.maven.api.RemoteRepository> repositories;

        org.apache.maven.api.services.ModelTransformer lifecycleBindingsInjector;

        ModelBuilderRequestBuilder() {
        }

        ModelBuilderRequestBuilder(org.apache.maven.api.services.ModelBuilderRequest request) {
            this.session = request.getSession();
            this.requestType = request.getRequestType();
            this.locationTracking = request.isLocationTracking();
            this.recursive = request.isRecursive();
            this.source = request.getSource();
            this.profiles = request.getProfiles();
            this.activeProfileIds = request.getActiveProfileIds();
            this.inactiveProfileIds = request.getInactiveProfileIds();
            this.systemProperties = request.getSystemProperties();
            this.userProperties = request.getUserProperties();
            this.repositoryMerging = request.getRepositoryMerging();
            this.repositories = request.getRepositories();
            this.lifecycleBindingsInjector = request.getLifecycleBindingsInjector();
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder session(org.apache.maven.api.Session session) {
            this.session = session;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder requestType(org.apache.maven.api.services.ModelBuilderRequest.RequestType requestType) {
            this.requestType = requestType;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder locationTracking(boolean locationTracking) {
            this.locationTracking = locationTracking;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder recursive(boolean recursive) {
            this.recursive = recursive;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder source(org.apache.maven.api.services.ModelSource source) {
            this.source = source;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder profiles(java.util.List<org.apache.maven.api.model.Profile> profiles) {
            this.profiles = profiles;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder activeProfileIds(java.util.List<java.lang.String> activeProfileIds) {
            this.activeProfileIds = activeProfileIds;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder inactiveProfileIds(java.util.List<java.lang.String> inactiveProfileIds) {
            this.inactiveProfileIds = inactiveProfileIds;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder systemProperties(java.util.Map<java.lang.String, java.lang.String> systemProperties) {
            this.systemProperties = systemProperties;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder userProperties(java.util.Map<java.lang.String, java.lang.String> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder repositoryMerging(org.apache.maven.api.services.ModelBuilderRequest.RepositoryMerging repositoryMerging) {
            this.repositoryMerging = repositoryMerging;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder repositories(java.util.List<org.apache.maven.api.RemoteRepository> repositories) {
            this.repositories = repositories;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder lifecycleBindingsInjector(org.apache.maven.api.services.ModelTransformer lifecycleBindingsInjector) {
            this.lifecycleBindingsInjector = lifecycleBindingsInjector;
            return this;
        }

        public org.apache.maven.api.services.ModelBuilderRequest build() {
            return new org.apache.maven.api.services.ModelBuilderRequest.ModelBuilderRequestBuilder.DefaultModelBuilderRequest(session, requestType, locationTracking, recursive, source, profiles, activeProfileIds, inactiveProfileIds, systemProperties, userProperties, repositoryMerging, repositories, lifecycleBindingsInjector);
        }

        private static class DefaultModelBuilderRequest extends org.apache.maven.api.services.BaseRequest<org.apache.maven.api.Session> implements org.apache.maven.api.services.ModelBuilderRequest {
            private final org.apache.maven.api.services.ModelBuilderRequest.RequestType requestType;

            private final boolean locationTracking;

            private final boolean recursive;

            private final org.apache.maven.api.services.ModelSource source;

            private final java.util.Collection<org.apache.maven.api.model.Profile> profiles;

            private final java.util.List<java.lang.String> activeProfileIds;

            private final java.util.List<java.lang.String> inactiveProfileIds;

            private final java.util.Map<java.lang.String, java.lang.String> systemProperties;

            private final java.util.Map<java.lang.String, java.lang.String> userProperties;

            private final org.apache.maven.api.services.ModelBuilderRequest.RepositoryMerging repositoryMerging;

            private final java.util.List<org.apache.maven.api.RemoteRepository> repositories;

            private final org.apache.maven.api.services.ModelTransformer lifecycleBindingsInjector;

            @java.lang.SuppressWarnings("checkstyle:ParameterNumber")
            DefaultModelBuilderRequest(@org.apache.maven.api.annotations.Nonnull
            org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
            org.apache.maven.api.services.ModelBuilderRequest.RequestType requestType, boolean locationTracking, boolean recursive, @org.apache.maven.api.annotations.Nonnull
            org.apache.maven.api.services.ModelSource source, java.util.Collection<org.apache.maven.api.model.Profile> profiles, java.util.List<java.lang.String> activeProfileIds, java.util.List<java.lang.String> inactiveProfileIds, java.util.Map<java.lang.String, java.lang.String> systemProperties, java.util.Map<java.lang.String, java.lang.String> userProperties, org.apache.maven.api.services.ModelBuilderRequest.RepositoryMerging repositoryMerging, java.util.List<org.apache.maven.api.RemoteRepository> repositories, org.apache.maven.api.services.ModelTransformer lifecycleBindingsInjector) {
                super(session);
                this.requestType = java.util.Objects.requireNonNull(requestType, "requestType cannot be null");
                this.locationTracking = locationTracking;
                this.recursive = recursive;
                this.source = source;
                this.profiles = (profiles != null) ? java.util.List.copyOf(profiles) : java.util.List.of();
                this.activeProfileIds = (activeProfileIds != null) ? java.util.List.copyOf(activeProfileIds) : java.util.List.of();
                this.inactiveProfileIds = (inactiveProfileIds != null) ? java.util.List.copyOf(inactiveProfileIds) : java.util.List.of();
                this.systemProperties = (systemProperties != null) ? java.util.Map.copyOf(systemProperties) : session.getSystemProperties();
                this.userProperties = (userProperties != null) ? java.util.Map.copyOf(userProperties) : session.getUserProperties();
                this.repositoryMerging = repositoryMerging;
                this.repositories = (repositories != null) ? java.util.List.copyOf(repositories) : null;
                this.lifecycleBindingsInjector = lifecycleBindingsInjector;
            }

            @java.lang.Override
            public org.apache.maven.api.services.ModelBuilderRequest.RequestType getRequestType() {
                return requestType;
            }

            @java.lang.Override
            public boolean isLocationTracking() {
                return locationTracking;
            }

            @java.lang.Override
            public boolean isRecursive() {
                return recursive;
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public org.apache.maven.api.services.ModelSource getSource() {
                return source;
            }

            @java.lang.Override
            public java.util.Collection<org.apache.maven.api.model.Profile> getProfiles() {
                return profiles;
            }

            @java.lang.Override
            public java.util.List<java.lang.String> getActiveProfileIds() {
                return activeProfileIds;
            }

            @java.lang.Override
            public java.util.List<java.lang.String> getInactiveProfileIds() {
                return inactiveProfileIds;
            }

            @java.lang.Override
            public java.util.Map<java.lang.String, java.lang.String> getSystemProperties() {
                return systemProperties;
            }

            @java.lang.Override
            public java.util.Map<java.lang.String, java.lang.String> getUserProperties() {
                return userProperties;
            }

            @java.lang.Override
            public org.apache.maven.api.services.ModelBuilderRequest.RepositoryMerging getRepositoryMerging() {
                return repositoryMerging;
            }

            @java.lang.Override
            public java.util.List<org.apache.maven.api.RemoteRepository> getRepositories() {
                return repositories;
            }

            @java.lang.Override
            public org.apache.maven.api.services.ModelTransformer getLifecycleBindingsInjector() {
                return lifecycleBindingsInjector;
            }
        }
    }
}
