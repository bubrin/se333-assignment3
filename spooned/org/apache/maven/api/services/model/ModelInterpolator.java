package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Model;
public interface ModelInterpolator {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.model.Model interpolateModel(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.model.Model model, @org.apache.maven.api.annotations.Nullable
    java.nio.file.Path projectDir, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelBuilderRequest request, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelProblemCollector problems);
}
