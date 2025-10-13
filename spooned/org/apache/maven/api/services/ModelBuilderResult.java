package org.apache.maven.api.services;
import org.apache.maven.api.model.Model;
import org.apache.maven.api.model.Profile;
@org.apache.maven.api.annotations.Experimental
public interface ModelBuilderResult {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelSource getSource();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.model.Model getFileModel();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.model.Model getRawModel();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.model.Model getParentModel();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.model.Model getEffectiveModel();

    @org.apache.maven.api.annotations.Nonnull
    java.util.List<org.apache.maven.api.model.Profile> getActivePomProfiles();

    @org.apache.maven.api.annotations.Nonnull
    java.util.List<org.apache.maven.api.model.Profile> getActiveExternalProfiles();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ProblemCollector<org.apache.maven.api.services.ModelProblem> getProblemCollector();

    @org.apache.maven.api.annotations.Nonnull
    java.util.List<? extends org.apache.maven.api.services.ModelBuilderResult> getChildren();

    java.lang.String toString();
}
