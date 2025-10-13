package org.apache.maven.api.cli;
@org.apache.maven.api.annotations.Experimental
public interface Executor extends java.lang.AutoCloseable {
    boolean IS_WINDOWS = java.lang.System.getProperty("os.name", "unknown").startsWith("Windows");

    java.lang.String UNKNOWN_VERSION = "unknown";

    int execute(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.ExecutorRequest executorRequest) throws org.apache.maven.api.cli.ExecutorException;

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String mavenVersion(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.ExecutorRequest executorRequest) throws org.apache.maven.api.cli.ExecutorException;

    @java.lang.Override
    default void close() throws org.apache.maven.api.cli.ExecutorException {
    }
}
