package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface MessageBuilderFactory extends org.apache.maven.api.Service {
    boolean isColorEnabled();

    int getTerminalWidth();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.MessageBuilder builder();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.MessageBuilder builder(int size);
}
