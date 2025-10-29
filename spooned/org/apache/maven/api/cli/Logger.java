package org.apache.maven.api.cli;
@org.apache.maven.api.annotations.Experimental
public interface Logger {
    enum Level {

        DEBUG,
        INFO,
        WARN,
        ERROR;
    }

    default void log(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.Logger.Level level, @org.apache.maven.api.annotations.Nonnull
    java.lang.String message) {
        log(level, message, null);
    }

    void log(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.Logger.Level level, @org.apache.maven.api.annotations.Nonnull
    java.lang.String message, @org.apache.maven.api.annotations.Nullable
    java.lang.Throwable error);

    default void debug(java.lang.String message) {
        log(org.apache.maven.api.cli.Logger.Level.DEBUG, message);
    }

    default void debug(@org.apache.maven.api.annotations.Nonnull
    java.lang.String message, @org.apache.maven.api.annotations.Nullable
    java.lang.Throwable error) {
        log(org.apache.maven.api.cli.Logger.Level.DEBUG, message, error);
    }

    default void info(@org.apache.maven.api.annotations.Nonnull
    java.lang.String message) {
        log(org.apache.maven.api.cli.Logger.Level.INFO, message);
    }

    default void info(@org.apache.maven.api.annotations.Nonnull
    java.lang.String message, @org.apache.maven.api.annotations.Nullable
    java.lang.Throwable error) {
        log(org.apache.maven.api.cli.Logger.Level.INFO, message, error);
    }

    default void warn(@org.apache.maven.api.annotations.Nonnull
    java.lang.String message) {
        log(org.apache.maven.api.cli.Logger.Level.WARN, message);
    }

    default void warn(@org.apache.maven.api.annotations.Nonnull
    java.lang.String message, @org.apache.maven.api.annotations.Nullable
    java.lang.Throwable error) {
        log(org.apache.maven.api.cli.Logger.Level.WARN, message, error);
    }

    default void error(@org.apache.maven.api.annotations.Nonnull
    java.lang.String message) {
        log(org.apache.maven.api.cli.Logger.Level.ERROR, message);
    }

    default void error(@org.apache.maven.api.annotations.Nonnull
    java.lang.String message, @org.apache.maven.api.annotations.Nullable
    java.lang.Throwable error) {
        log(org.apache.maven.api.cli.Logger.Level.ERROR, message, error);
    }
}
