package org.apache.maven.api.services;
public interface Lookup extends org.apache.maven.api.Service {
    @org.apache.maven.api.annotations.Nonnull
    <T> T lookup(java.lang.Class<T> type);

    @org.apache.maven.api.annotations.Nonnull
    <T> T lookup(java.lang.Class<T> type, java.lang.String name);

    @org.apache.maven.api.annotations.Nonnull
    <T> java.util.Optional<T> lookupOptional(java.lang.Class<T> type);

    @org.apache.maven.api.annotations.Nonnull
    <T> java.util.Optional<T> lookupOptional(java.lang.Class<T> type, java.lang.String name);

    @org.apache.maven.api.annotations.Nonnull
    <T> java.util.List<T> lookupList(java.lang.Class<T> type);

    @org.apache.maven.api.annotations.Nonnull
    <T> java.util.Map<java.lang.String, T> lookupMap(java.lang.Class<T> type);
}
