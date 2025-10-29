package org.apache.maven.api.cli;
@org.apache.maven.api.annotations.Experimental
public class InvokerException extends org.apache.maven.api.services.MavenException {
    public InvokerException(@org.apache.maven.api.annotations.Nullable
    java.lang.String message) {
        super(message);
    }

    public InvokerException(@org.apache.maven.api.annotations.Nullable
    java.lang.String message, @org.apache.maven.api.annotations.Nullable
    java.lang.Throwable cause) {
        super(message, cause);
    }

    public static final class ExitException extends org.apache.maven.api.cli.InvokerException {
        private final int exitCode;

        public ExitException(int exitCode) {
            super("EXIT");
            this.exitCode = exitCode;
        }

        public int getExitCode() {
            return exitCode;
        }
    }
}
