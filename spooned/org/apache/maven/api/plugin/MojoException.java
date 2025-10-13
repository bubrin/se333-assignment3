package org.apache.maven.api.plugin;
@org.apache.maven.api.annotations.Experimental
public class MojoException extends org.apache.maven.api.services.MavenException {
    protected java.lang.Object source;

    protected java.lang.String longMessage;

    public MojoException(java.lang.Object source, java.lang.String shortMessage, java.lang.String longMessage) {
        super(shortMessage);
        this.source = source;
        this.longMessage = longMessage;
    }

    public MojoException(java.lang.String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public MojoException(java.lang.String message) {
        super(message);
    }

    public MojoException(java.lang.Throwable cause) {
        super(cause);
    }

    public java.lang.String getLongMessage() {
        return longMessage;
    }

    public java.lang.Object getSource() {
        return source;
    }
}
