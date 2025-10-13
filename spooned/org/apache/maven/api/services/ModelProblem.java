package org.apache.maven.api.services;
public interface ModelProblem extends org.apache.maven.api.services.BuilderProblem {
    enum Version {

        BASE,
        V20,
        V30,
        V31,
        V40,
        V41;
    }

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String getModelId();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelProblem.Version getVersion();
}
