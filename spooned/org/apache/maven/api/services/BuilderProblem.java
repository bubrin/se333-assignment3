package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
@org.apache.maven.api.annotations.Immutable
public interface BuilderProblem {
    @org.apache.maven.api.annotations.Nonnull
    java.lang.String getSource();

    int getLineNumber();

    int getColumnNumber();

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String getLocation();

    @org.apache.maven.api.annotations.Nullable
    java.lang.Exception getException();

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String getMessage();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.BuilderProblem.Severity getSeverity();

    @org.apache.maven.api.annotations.Experimental
    enum Severity {

        FATAL,
        ERROR,
        WARNING;
    }
}
