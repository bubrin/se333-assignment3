package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Model;
public interface ModelValidator {
    int VALIDATION_LEVEL_MINIMAL = 0;

    int VALIDATION_LEVEL_MAVEN_2_0 = 20;

    int VALIDATION_LEVEL_MAVEN_3_0 = 30;

    int VALIDATION_LEVEL_MAVEN_3_1 = 31;

    int VALIDATION_LEVEL_MAVEN_4_0 = 40;

    int VALIDATION_LEVEL_STRICT = org.apache.maven.api.services.model.ModelValidator.VALIDATION_LEVEL_MAVEN_4_0;

    void validateFileModel(org.apache.maven.api.model.Model model, int validationLevel, org.apache.maven.api.services.ModelProblemCollector problems);

    void validateRawModel(org.apache.maven.api.model.Model model, int validationLevel, org.apache.maven.api.services.ModelProblemCollector problems);

    void validateEffectiveModel(org.apache.maven.api.model.Model model, int validationLevel, org.apache.maven.api.services.ModelProblemCollector problems);
}
