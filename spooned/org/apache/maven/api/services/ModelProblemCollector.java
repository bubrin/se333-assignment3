package org.apache.maven.api.services;
import org.apache.maven.api.model.Model;
public interface ModelProblemCollector {
    org.apache.maven.api.services.ProblemCollector<org.apache.maven.api.services.ModelProblem> getProblemCollector();

    default boolean hasErrors() {
        return getProblemCollector().hasErrorProblems();
    }

    default boolean hasFatalErrors() {
        return getProblemCollector().hasFatalProblems();
    }

    default void add(org.apache.maven.api.services.BuilderProblem.Severity severity, org.apache.maven.api.services.ModelProblem.Version version, java.lang.String message) {
        add(severity, version, message, null, null);
    }

    default void add(org.apache.maven.api.services.BuilderProblem.Severity severity, org.apache.maven.api.services.ModelProblem.Version version, java.lang.String message, org.apache.maven.api.model.InputLocation location) {
        add(severity, version, message, location, null);
    }

    default void add(org.apache.maven.api.services.BuilderProblem.Severity severity, org.apache.maven.api.services.ModelProblem.Version version, java.lang.String message, java.lang.Exception exception) {
        add(severity, version, message, null, exception);
    }

    void add(org.apache.maven.api.services.BuilderProblem.Severity severity, org.apache.maven.api.services.ModelProblem.Version version, java.lang.String message, org.apache.maven.api.model.InputLocation location, java.lang.Exception exception);

    default void add(org.apache.maven.api.services.ModelProblem problem) {
        getProblemCollector().reportProblem(problem);
    }

    org.apache.maven.api.services.ModelBuilderException newModelBuilderException();

    void setSource(java.lang.String location);

    void setSource(org.apache.maven.api.model.Model model);

    java.lang.String getSource();

    void setRootModel(org.apache.maven.api.model.Model model);

    org.apache.maven.api.model.Model getRootModel();
}
