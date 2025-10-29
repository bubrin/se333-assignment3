package org.apache.maven.api.cli;
@org.apache.maven.api.annotations.Experimental
public interface Invoker extends java.lang.AutoCloseable {
    int invoke(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.InvokerRequest invokerRequest) throws org.apache.maven.api.cli.InvokerException;

    @java.lang.Override
    default void close() throws org.apache.maven.api.cli.InvokerException {
    }
}
