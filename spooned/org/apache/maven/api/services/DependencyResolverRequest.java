package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
@org.apache.maven.api.annotations.Immutable
public interface DependencyResolverRequest {
    enum RequestType {

        COLLECT,
        FLATTEN,
        RESOLVE;
    }

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session getSession();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.DependencyResolverRequest.RequestType getRequestType();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<org.apache.maven.api.Project> getProject();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<org.apache.maven.api.Artifact> getRootArtifact();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<org.apache.maven.api.DependencyCoordinates> getRoot();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.DependencyCoordinates> getDependencies();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.DependencyCoordinates> getManagedDependencies();

    boolean getVerbose();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.PathScope getPathScope();

    @org.apache.maven.api.annotations.Nullable
    java.util.function.Predicate<org.apache.maven.api.PathType> getPathTypeFilter();

    @org.apache.maven.api.annotations.Nullable
    java.util.List<org.apache.maven.api.RemoteRepository> getRepositories();

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder builder() {
        return new org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyResolverRequest build(org.apache.maven.api.Session session, org.apache.maven.api.services.DependencyResolverRequest.RequestType requestType, org.apache.maven.api.Artifact rootArtifact) {
        return org.apache.maven.api.services.DependencyResolverRequest.build(session, requestType, rootArtifact, org.apache.maven.api.PathScope.MAIN_RUNTIME);
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyResolverRequest build(org.apache.maven.api.Session session, org.apache.maven.api.services.DependencyResolverRequest.RequestType requestType, org.apache.maven.api.Artifact rootArtifact, org.apache.maven.api.PathScope scope) {
        return new org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder().session(session).requestType(requestType).rootArtifact(rootArtifact).pathScope(scope).build();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyResolverRequest build(org.apache.maven.api.Session session, org.apache.maven.api.services.DependencyResolverRequest.RequestType requestType, org.apache.maven.api.Project project) {
        return org.apache.maven.api.services.DependencyResolverRequest.build(session, requestType, project, org.apache.maven.api.PathScope.MAIN_RUNTIME);
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyResolverRequest build(org.apache.maven.api.Session session, org.apache.maven.api.services.DependencyResolverRequest.RequestType requestType, org.apache.maven.api.Project project, org.apache.maven.api.PathScope scope) {
        return new org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder().session(session).requestType(requestType).project(project).pathScope(scope).build();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyResolverRequest build(org.apache.maven.api.Session session, org.apache.maven.api.services.DependencyResolverRequest.RequestType requestType, org.apache.maven.api.DependencyCoordinates dependency) {
        return org.apache.maven.api.services.DependencyResolverRequest.build(session, requestType, dependency, org.apache.maven.api.PathScope.MAIN_RUNTIME);
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyResolverRequest build(org.apache.maven.api.Session session, org.apache.maven.api.services.DependencyResolverRequest.RequestType requestType, org.apache.maven.api.DependencyCoordinates dependency, org.apache.maven.api.PathScope scope) {
        return new org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder().session(session).requestType(requestType).dependency(dependency).pathScope(scope).build();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyResolverRequest build(org.apache.maven.api.Session session, org.apache.maven.api.services.DependencyResolverRequest.RequestType requestType, java.util.List<org.apache.maven.api.DependencyCoordinates> dependencies) {
        return org.apache.maven.api.services.DependencyResolverRequest.build(session, requestType, dependencies, org.apache.maven.api.PathScope.MAIN_RUNTIME);
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyResolverRequest build(org.apache.maven.api.Session session, org.apache.maven.api.services.DependencyResolverRequest.RequestType requestType, java.util.List<org.apache.maven.api.DependencyCoordinates> dependencies, org.apache.maven.api.PathScope scope) {
        return new org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder().session(session).requestType(requestType).dependencies(dependencies).pathScope(scope).build();
    }

    @org.apache.maven.api.annotations.NotThreadSafe
    class DependencyResolverRequestBuilder {
        org.apache.maven.api.Session session;

        org.apache.maven.api.services.DependencyResolverRequest.RequestType requestType;

        org.apache.maven.api.Project project;

        org.apache.maven.api.Artifact rootArtifact;

        org.apache.maven.api.DependencyCoordinates root;

        java.util.List<org.apache.maven.api.DependencyCoordinates> dependencies = java.util.Collections.emptyList();

        java.util.List<org.apache.maven.api.DependencyCoordinates> managedDependencies = java.util.Collections.emptyList();

        boolean verbose;

        org.apache.maven.api.PathScope pathScope;

        java.util.function.Predicate<org.apache.maven.api.PathType> pathTypeFilter;

        java.util.List<org.apache.maven.api.RemoteRepository> repositories;

        DependencyResolverRequestBuilder() {
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder session(@org.apache.maven.api.annotations.Nonnull
        org.apache.maven.api.Session session) {
            this.session = session;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder requestType(@org.apache.maven.api.annotations.Nonnull
        org.apache.maven.api.services.DependencyResolverRequest.RequestType requestType) {
            this.requestType = requestType;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder project(@org.apache.maven.api.annotations.Nullable
        org.apache.maven.api.Project project) {
            this.project = project;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder rootArtifact(@org.apache.maven.api.annotations.Nullable
        org.apache.maven.api.Artifact rootArtifact) {
            this.rootArtifact = rootArtifact;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder root(@org.apache.maven.api.annotations.Nonnull
        org.apache.maven.api.DependencyCoordinates root) {
            this.root = root;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder dependencies(@org.apache.maven.api.annotations.Nullable
        java.util.List<org.apache.maven.api.DependencyCoordinates> dependencies) {
            this.dependencies = (dependencies != null) ? dependencies : java.util.Collections.emptyList();
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder dependency(@org.apache.maven.api.annotations.Nullable
        org.apache.maven.api.DependencyCoordinates dependency) {
            if (dependency != null) {
                if (this.dependencies.isEmpty()) {
                    this.dependencies = new java.util.ArrayList<>();
                }
                this.dependencies.add(dependency);
            }
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder managedDependencies(@org.apache.maven.api.annotations.Nullable
        java.util.List<org.apache.maven.api.DependencyCoordinates> managedDependencies) {
            this.managedDependencies = (managedDependencies != null) ? managedDependencies : java.util.Collections.emptyList();
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder managedDependency(@org.apache.maven.api.annotations.Nullable
        org.apache.maven.api.DependencyCoordinates managedDependency) {
            if (managedDependency != null) {
                if (this.managedDependencies.isEmpty()) {
                    this.managedDependencies = new java.util.ArrayList<>();
                }
                this.managedDependencies.add(managedDependency);
            }
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder verbose(boolean verbose) {
            this.verbose = verbose;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder pathScope(@org.apache.maven.api.annotations.Nullable
        org.apache.maven.api.PathScope pathScope) {
            this.pathScope = pathScope;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder pathTypeFilter(@org.apache.maven.api.annotations.Nonnull
        java.util.function.Predicate<org.apache.maven.api.PathType> pathTypeFilter) {
            this.pathTypeFilter = pathTypeFilter;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder pathTypeFilter(@org.apache.maven.api.annotations.Nonnull
        java.util.Collection<? extends org.apache.maven.api.PathType> desiredTypes) {
            return pathTypeFilter(desiredTypes::contains);
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder repositories(@org.apache.maven.api.annotations.Nonnull
        java.util.List<org.apache.maven.api.RemoteRepository> repositories) {
            this.repositories = repositories;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.services.DependencyResolverRequest build() {
            return new org.apache.maven.api.services.DependencyResolverRequest.DependencyResolverRequestBuilder.DefaultDependencyResolverRequest(session, requestType, project, rootArtifact, root, dependencies, managedDependencies, verbose, pathScope, pathTypeFilter, repositories);
        }

        static class DefaultDependencyResolverRequest extends org.apache.maven.api.services.BaseRequest<org.apache.maven.api.Session> implements org.apache.maven.api.services.DependencyResolverRequest {
            private final org.apache.maven.api.services.DependencyResolverRequest.RequestType requestType;

            private final org.apache.maven.api.Project project;

            private final org.apache.maven.api.Artifact rootArtifact;

            private final org.apache.maven.api.DependencyCoordinates root;

            private final java.util.Collection<org.apache.maven.api.DependencyCoordinates> dependencies;

            private final java.util.Collection<org.apache.maven.api.DependencyCoordinates> managedDependencies;

            private final boolean verbose;

            private final org.apache.maven.api.PathScope pathScope;

            private final java.util.function.Predicate<org.apache.maven.api.PathType> pathTypeFilter;

            private final java.util.List<org.apache.maven.api.RemoteRepository> repositories;

            @java.lang.SuppressWarnings("checkstyle:ParameterNumber")
            DefaultDependencyResolverRequest(@org.apache.maven.api.annotations.Nonnull
            org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
            org.apache.maven.api.services.DependencyResolverRequest.RequestType requestType, @org.apache.maven.api.annotations.Nullable
            org.apache.maven.api.Project project, @org.apache.maven.api.annotations.Nullable
            org.apache.maven.api.Artifact rootArtifact, @org.apache.maven.api.annotations.Nullable
            org.apache.maven.api.DependencyCoordinates root, @org.apache.maven.api.annotations.Nonnull
            java.util.Collection<org.apache.maven.api.DependencyCoordinates> dependencies, @org.apache.maven.api.annotations.Nonnull
            java.util.Collection<org.apache.maven.api.DependencyCoordinates> managedDependencies, boolean verbose, @org.apache.maven.api.annotations.Nullable
            org.apache.maven.api.PathScope pathScope, @org.apache.maven.api.annotations.Nullable
            java.util.function.Predicate<org.apache.maven.api.PathType> pathTypeFilter, @org.apache.maven.api.annotations.Nullable
            java.util.List<org.apache.maven.api.RemoteRepository> repositories) {
                super(session);
                this.requestType = java.util.Objects.requireNonNull(requestType, "requestType cannot be null");
                this.project = project;
                this.rootArtifact = rootArtifact;
                this.root = root;
                this.dependencies = java.util.List.copyOf(java.util.Objects.requireNonNull(dependencies, "dependencies cannot be null"));
                this.managedDependencies = java.util.List.copyOf(java.util.Objects.requireNonNull(managedDependencies, "managedDependencies cannot be null"));
                this.verbose = verbose;
                this.pathScope = java.util.Objects.requireNonNull(pathScope, "pathScope cannot be null");
                this.pathTypeFilter = (pathTypeFilter != null) ? pathTypeFilter : t -> true;
                this.repositories = repositories;
                if (verbose && (requestType != org.apache.maven.api.services.DependencyResolverRequest.RequestType.COLLECT)) {
                    throw new java.lang.IllegalArgumentException("verbose cannot only be true when collecting dependencies");
                }
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public org.apache.maven.api.services.DependencyResolverRequest.RequestType getRequestType() {
                return requestType;
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public java.util.Optional<org.apache.maven.api.Project> getProject() {
                return java.util.Optional.ofNullable(project);
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public java.util.Optional<org.apache.maven.api.Artifact> getRootArtifact() {
                return java.util.Optional.ofNullable(rootArtifact);
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public java.util.Optional<org.apache.maven.api.DependencyCoordinates> getRoot() {
                return java.util.Optional.ofNullable(root);
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public java.util.Collection<org.apache.maven.api.DependencyCoordinates> getDependencies() {
                return dependencies;
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public java.util.Collection<org.apache.maven.api.DependencyCoordinates> getManagedDependencies() {
                return managedDependencies;
            }

            @java.lang.Override
            public boolean getVerbose() {
                return verbose;
            }

            @java.lang.Override
            public org.apache.maven.api.PathScope getPathScope() {
                return pathScope;
            }

            @java.lang.Override
            public java.util.function.Predicate<org.apache.maven.api.PathType> getPathTypeFilter() {
                return pathTypeFilter;
            }

            @java.lang.Override
            public java.util.List<org.apache.maven.api.RemoteRepository> getRepositories() {
                return repositories;
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public java.lang.String toString() {
                return (getRoot() + " -> ") + getDependencies();
            }
        }
    }
}
