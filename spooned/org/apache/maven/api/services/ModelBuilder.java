package org.apache.maven.api.services;
import org.apache.maven.api.model.Model;
public interface ModelBuilder extends org.apache.maven.api.Service {
    java.lang.String MODEL_VERSION_4_0_0 = "4.0.0";

    java.lang.String MODEL_VERSION_4_1_0 = "4.1.0";

    java.util.List<java.lang.String> VALID_MODEL_VERSIONS = java.util.List.of(org.apache.maven.api.services.ModelBuilder.MODEL_VERSION_4_0_0, org.apache.maven.api.services.ModelBuilder.MODEL_VERSION_4_1_0);

    org.apache.maven.api.services.ModelBuilder.ModelBuilderSession newSession();

    interface ModelBuilderSession {
        org.apache.maven.api.services.ModelBuilderResult build(org.apache.maven.api.services.ModelBuilderRequest request) throws org.apache.maven.api.services.ModelBuilderException;
    }

    org.apache.maven.api.model.Model buildRawModel(org.apache.maven.api.services.ModelBuilderRequest request) throws org.apache.maven.api.services.ModelBuilderException;
}
