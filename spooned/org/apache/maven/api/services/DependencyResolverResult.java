package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface DependencyResolverResult {
    @org.apache.maven.api.annotations.Nonnull
    java.util.List<java.lang.Exception> getExceptions();

    @org.apache.maven.api.annotations.Nullable
    org.apache.maven.api.Node getRoot();

    @org.apache.maven.api.annotations.Nonnull
    java.util.List<org.apache.maven.api.Node> getNodes();

    @org.apache.maven.api.annotations.Nonnull
    java.util.List<java.nio.file.Path> getPaths();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Map<org.apache.maven.api.PathType, java.util.List<java.nio.file.Path>> getDispatchedPaths();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Map<org.apache.maven.api.Dependency, java.nio.file.Path> getDependencies();

    java.util.Optional<java.lang.String> getModuleName(@org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path dependency) throws java.io.IOException;

    java.util.Optional<java.lang.module.ModuleDescriptor> getModuleDescriptor(@org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path dependency) throws java.io.IOException;

    java.util.Optional<java.lang.String> warningForFilenameBasedAutomodules();
}
