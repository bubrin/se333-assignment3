package org.apache.maven.api.services.model;
public interface RootLocator extends org.apache.maven.api.Service {
    java.lang.String UNABLE_TO_FIND_ROOT_PROJECT_MESSAGE = ("Unable to find the root directory. " + "Create a .mvn directory in the root directory or add the root=\"true\"") + " attribute on the root project's model to identify it.";

    @org.apache.maven.api.annotations.Nullable
    java.nio.file.Path findRoot(@org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path basedir);

    @org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path findMandatoryRoot(@org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path basedir);

    @org.apache.maven.api.annotations.Nonnull
    default java.lang.String getNoRootMessage() {
        return org.apache.maven.api.services.model.RootLocator.UNABLE_TO_FIND_ROOT_PROJECT_MESSAGE;
    }
}
