package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public abstract class MavenBuilderException extends org.apache.maven.api.services.MavenException {
    private final org.apache.maven.api.services.ProblemCollector<org.apache.maven.api.services.BuilderProblem> problems;

    public MavenBuilderException(java.lang.String message, java.lang.Throwable cause) {
        super(message, cause);
        problems = org.apache.maven.api.services.ProblemCollector.empty();
    }

    public MavenBuilderException(java.lang.String message, org.apache.maven.api.services.ProblemCollector<org.apache.maven.api.services.BuilderProblem> problems) {
        super(org.apache.maven.api.services.MavenBuilderException.buildMessage(message, problems), null);
        this.problems = problems;
    }

    protected static java.lang.String buildMessage(java.lang.String message, org.apache.maven.api.services.ProblemCollector<org.apache.maven.api.services.BuilderProblem> problems) {
        java.lang.StringBuilder msg = new java.lang.StringBuilder(message);
        problems.problems().forEach(problem -> msg.append("\n * ").append(problem.getSeverity().name()).append(": ").append(problem.getMessage()));
        return msg.toString();
    }

    public org.apache.maven.api.services.ProblemCollector<org.apache.maven.api.services.BuilderProblem> getProblemCollector() {
        return problems;
    }
}
