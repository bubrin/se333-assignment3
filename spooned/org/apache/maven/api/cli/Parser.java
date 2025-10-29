package org.apache.maven.api.cli;
@org.apache.maven.api.annotations.Experimental
public interface Parser {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.InvokerRequest parseInvocation(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.ParserRequest parserRequest) throws org.apache.maven.api.cli.ParserException, java.io.IOException;
}
