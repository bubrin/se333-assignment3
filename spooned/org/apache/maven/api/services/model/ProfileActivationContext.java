package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Model;
public interface ProfileActivationContext {
    boolean isProfileActive(@org.apache.maven.api.annotations.Nonnull
    java.lang.String profileId);

    boolean isProfileInactive(@org.apache.maven.api.annotations.Nonnull
    java.lang.String profileId);

    @org.apache.maven.api.annotations.Nullable
    java.lang.String getSystemProperty(@org.apache.maven.api.annotations.Nonnull
    java.lang.String key);

    @org.apache.maven.api.annotations.Nullable
    java.lang.String getUserProperty(@org.apache.maven.api.annotations.Nonnull
    java.lang.String key);

    @org.apache.maven.api.annotations.Nullable
    java.lang.String getModelProperty(@org.apache.maven.api.annotations.Nonnull
    java.lang.String key);

    @org.apache.maven.api.annotations.Nullable
    java.lang.String getModelArtifactId();

    @org.apache.maven.api.annotations.Nullable
    java.lang.String getModelPackaging();

    @org.apache.maven.api.annotations.Nullable
    java.lang.String getModelRootDirectory();

    @org.apache.maven.api.annotations.Nullable
    java.lang.String getModelBaseDirectory();

    @org.apache.maven.api.annotations.Nullable
    java.lang.String interpolatePath(@org.apache.maven.api.annotations.Nullable
    java.lang.String path);

    boolean exists(@org.apache.maven.api.annotations.Nullable
    java.lang.String path, boolean glob);
}
