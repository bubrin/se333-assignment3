package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public class MavenException extends java.lang.RuntimeException {
    @java.io.Serial
    private static final long serialVersionUID = 9027638326336093132L;

    public MavenException() {
    }

    public MavenException(java.lang.String message) {
        super(message);
    }

    public MavenException(java.lang.String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public MavenException(java.lang.Throwable cause) {
        super(cause);
    }
}
