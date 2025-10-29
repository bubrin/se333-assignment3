package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public class ModelBuilderException extends org.apache.maven.api.services.MavenException {
    @java.io.Serial
    private static final long serialVersionUID = -1865447022070650896L;

    private final org.apache.maven.api.services.ModelBuilderResult result;

    public ModelBuilderException(org.apache.maven.api.services.ModelBuilderResult result) {
        super(result.toString());
        this.result = result;
    }

    public org.apache.maven.api.services.ModelBuilderResult getResult() {
        return result;
    }

    public java.lang.String getModelId() {
        if (result == null) {
            return "";
        } else if (result.getEffectiveModel() != null) {
            return result.getEffectiveModel().getId();
        } else if (result.getRawModel() != null) {
            return result.getRawModel().getId();
        } else if (result.getFileModel() != null) {
            return result.getFileModel().getId();
        } else {
            return "";
        }
    }

    public org.apache.maven.api.services.ProblemCollector<org.apache.maven.api.services.ModelProblem> getProblemCollector() {
        if (result == null) {
            return org.apache.maven.api.services.ProblemCollector.empty();
        }
        return result.getProblemCollector();
    }
}
