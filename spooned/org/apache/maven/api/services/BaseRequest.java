package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
abstract class BaseRequest<S extends org.apache.maven.api.ProtoSession> {
    private final S session;

    protected BaseRequest(@org.apache.maven.api.annotations.Nonnull
    S session) {
        this.session = java.util.Objects.requireNonNull(session, "session cannot be null");
    }

    @org.apache.maven.api.annotations.Nonnull
    public S getSession() {
        return session;
    }
}
