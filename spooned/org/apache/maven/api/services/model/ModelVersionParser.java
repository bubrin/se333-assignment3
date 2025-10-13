package org.apache.maven.api.services.model;
public interface ModelVersionParser {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Version parseVersion(@org.apache.maven.api.annotations.Nonnull
    java.lang.String version);

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.VersionRange parseVersionRange(@org.apache.maven.api.annotations.Nonnull
    java.lang.String range);

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.VersionConstraint parseVersionConstraint(@org.apache.maven.api.annotations.Nonnull
    java.lang.String constraint);

    boolean isSnapshot(@org.apache.maven.api.annotations.Nonnull
    java.lang.String version);
}
