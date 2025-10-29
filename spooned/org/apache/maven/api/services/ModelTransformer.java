package org.apache.maven.api.services;
import org.apache.maven.api.model.Model;
@org.apache.maven.api.annotations.Experimental
public interface ModelTransformer {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.model.Model transform(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.model.Model model, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelBuilderRequest request, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelProblemCollector problems);
}
