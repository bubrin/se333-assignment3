package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public class LookupException extends org.apache.maven.api.services.MavenException {
    @java.io.Serial
    private static final long serialVersionUID = -6259322450070320286L;

    public LookupException(java.lang.String message) {
        super(message);
    }

    public LookupException(java.lang.String message, java.lang.Exception e) {
        super(message, e);
    }

    public LookupException(java.lang.Exception e) {
        super(e);
    }
}
