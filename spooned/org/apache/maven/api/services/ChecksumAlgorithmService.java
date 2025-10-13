package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface ChecksumAlgorithmService extends org.apache.maven.api.Service {
    @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<java.lang.String> getChecksumAlgorithmNames();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ChecksumAlgorithmService.ChecksumAlgorithm select(@org.apache.maven.api.annotations.Nonnull
    java.lang.String algorithmName);

    @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.services.ChecksumAlgorithmService.ChecksumAlgorithm> select(@org.apache.maven.api.annotations.Nonnull
    java.util.Collection<java.lang.String> algorithmNames);

    @org.apache.maven.api.annotations.Nonnull
    java.util.Map<org.apache.maven.api.services.ChecksumAlgorithmService.ChecksumAlgorithm, java.lang.String> calculate(@org.apache.maven.api.annotations.Nonnull
    byte[] data, @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.services.ChecksumAlgorithmService.ChecksumAlgorithm> algorithms);

    @org.apache.maven.api.annotations.Nonnull
    java.util.Map<org.apache.maven.api.services.ChecksumAlgorithmService.ChecksumAlgorithm, java.lang.String> calculate(@org.apache.maven.api.annotations.Nonnull
    java.nio.ByteBuffer data, @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.services.ChecksumAlgorithmService.ChecksumAlgorithm> algorithms);

    @org.apache.maven.api.annotations.Nonnull
    java.util.Map<org.apache.maven.api.services.ChecksumAlgorithmService.ChecksumAlgorithm, java.lang.String> calculate(@org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path file, @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.services.ChecksumAlgorithmService.ChecksumAlgorithm> algorithms) throws java.io.IOException;

    @org.apache.maven.api.annotations.Nonnull
    java.util.Map<org.apache.maven.api.services.ChecksumAlgorithmService.ChecksumAlgorithm, java.lang.String> calculate(@org.apache.maven.api.annotations.Nonnull
    java.io.InputStream stream, @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.services.ChecksumAlgorithmService.ChecksumAlgorithm> algorithms) throws java.io.IOException;

    interface ChecksumAlgorithm {
        @org.apache.maven.api.annotations.Nonnull
        java.lang.String getName();

        @org.apache.maven.api.annotations.Nonnull
        java.lang.String getFileExtension();

        @org.apache.maven.api.annotations.Nonnull
        org.apache.maven.api.services.ChecksumAlgorithmService.ChecksumCalculator getCalculator();
    }

    interface ChecksumCalculator {
        void update(@org.apache.maven.api.annotations.Nonnull
        java.nio.ByteBuffer input);

        @org.apache.maven.api.annotations.Nonnull
        java.lang.String checksum();
    }
}
