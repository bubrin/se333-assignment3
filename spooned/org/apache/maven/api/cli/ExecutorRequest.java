package org.apache.maven.api.cli;
@org.apache.maven.api.annotations.Immutable
@org.apache.maven.api.annotations.Experimental
public interface ExecutorRequest {
    java.lang.String MVN = "mvn";

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String command();

    @org.apache.maven.api.annotations.Nonnull
    java.util.List<java.lang.String> arguments();

    @org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path cwd();

    @org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path installationDirectory();

    @org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path userHomeDirectory();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.util.Map<java.lang.String, java.lang.String>> jvmSystemProperties();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.util.Map<java.lang.String, java.lang.String>> environmentVariables();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.util.List<java.lang.String>> jvmArguments();

    java.util.Optional<java.io.OutputStream> stdoutConsumer();

    java.util.Optional<java.io.OutputStream> stderrConsumer();

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.cli.ExecutorRequest.Builder toBuilder() {
        return new org.apache.maven.api.cli.ExecutorRequest.Builder(command(), arguments(), cwd(), installationDirectory(), userHomeDirectory(), jvmSystemProperties().orElse(null), environmentVariables().orElse(null), jvmArguments().orElse(null), stdoutConsumer().orElse(null), stderrConsumer().orElse(null));
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.cli.ExecutorRequest.Builder mavenBuilder(@org.apache.maven.api.annotations.Nullable
    java.nio.file.Path installationDirectory) {
        return new org.apache.maven.api.cli.ExecutorRequest.Builder(org.apache.maven.api.cli.ExecutorRequest.MVN, null, org.apache.maven.api.cli.ExecutorRequest.getCanonicalPath(java.nio.file.Paths.get(java.lang.System.getProperty("user.dir"))), installationDirectory != null ? org.apache.maven.api.cli.ExecutorRequest.getCanonicalPath(installationDirectory) : org.apache.maven.api.cli.ExecutorRequest.discoverInstallationDirectory(), org.apache.maven.api.cli.ExecutorRequest.getCanonicalPath(java.nio.file.Paths.get(java.lang.System.getProperty("user.home"))), null, null, null, null, null);
    }

    class Builder {
        private java.lang.String command;

        private java.util.List<java.lang.String> arguments;

        private java.nio.file.Path cwd;

        private java.nio.file.Path installationDirectory;

        private java.nio.file.Path userHomeDirectory;

        private java.util.Map<java.lang.String, java.lang.String> jvmSystemProperties;

        private java.util.Map<java.lang.String, java.lang.String> environmentVariables;

        private java.util.List<java.lang.String> jvmArguments;

        private java.io.OutputStream stdoutConsumer;

        private java.io.OutputStream stderrConsumer;

        private Builder() {
        }

        @java.lang.SuppressWarnings("ParameterNumber")
        private Builder(java.lang.String command, java.util.List<java.lang.String> arguments, java.nio.file.Path cwd, java.nio.file.Path installationDirectory, java.nio.file.Path userHomeDirectory, java.util.Map<java.lang.String, java.lang.String> jvmSystemProperties, java.util.Map<java.lang.String, java.lang.String> environmentVariables, java.util.List<java.lang.String> jvmArguments, java.io.OutputStream stdoutConsumer, java.io.OutputStream stderrConsumer) {
            this.command = command;
            this.arguments = arguments;
            this.cwd = cwd;
            this.installationDirectory = installationDirectory;
            this.userHomeDirectory = userHomeDirectory;
            this.jvmSystemProperties = jvmSystemProperties;
            this.environmentVariables = environmentVariables;
            this.jvmArguments = jvmArguments;
            this.stdoutConsumer = stdoutConsumer;
            this.stderrConsumer = stderrConsumer;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder command(java.lang.String command) {
            this.command = java.util.Objects.requireNonNull(command, "command");
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder arguments(java.util.List<java.lang.String> arguments) {
            this.arguments = java.util.Objects.requireNonNull(arguments, "arguments");
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder argument(java.lang.String argument) {
            if (arguments == null) {
                arguments = new java.util.ArrayList<>();
            }
            this.arguments.add(java.util.Objects.requireNonNull(argument, "argument"));
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder cwd(java.nio.file.Path cwd) {
            this.cwd = org.apache.maven.api.cli.ExecutorRequest.getCanonicalPath(java.util.Objects.requireNonNull(cwd, "cwd"));
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder installationDirectory(java.nio.file.Path installationDirectory) {
            this.installationDirectory = org.apache.maven.api.cli.ExecutorRequest.getCanonicalPath(java.util.Objects.requireNonNull(installationDirectory, "installationDirectory"));
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder userHomeDirectory(java.nio.file.Path userHomeDirectory) {
            this.userHomeDirectory = org.apache.maven.api.cli.ExecutorRequest.getCanonicalPath(java.util.Objects.requireNonNull(userHomeDirectory, "userHomeDirectory"));
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder jvmSystemProperties(java.util.Map<java.lang.String, java.lang.String> jvmSystemProperties) {
            this.jvmSystemProperties = jvmSystemProperties;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder jvmSystemProperty(java.lang.String key, java.lang.String value) {
            java.util.Objects.requireNonNull(key, "env key");
            java.util.Objects.requireNonNull(value, "env value");
            if (jvmSystemProperties == null) {
                this.jvmSystemProperties = new java.util.HashMap<>();
            }
            this.jvmSystemProperties.put(key, value);
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder environmentVariables(java.util.Map<java.lang.String, java.lang.String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder environmentVariable(java.lang.String key, java.lang.String value) {
            java.util.Objects.requireNonNull(key, "env key");
            java.util.Objects.requireNonNull(value, "env value");
            if (environmentVariables == null) {
                this.environmentVariables = new java.util.HashMap<>();
            }
            this.environmentVariables.put(key, value);
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder jvmArguments(java.util.List<java.lang.String> jvmArguments) {
            this.jvmArguments = jvmArguments;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder jvmArgument(java.lang.String jvmArgument) {
            if (jvmArguments == null) {
                jvmArguments = new java.util.ArrayList<>();
            }
            this.jvmArguments.add(java.util.Objects.requireNonNull(jvmArgument, "jvmArgument"));
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder stdoutConsumer(java.io.OutputStream stdoutConsumer) {
            this.stdoutConsumer = stdoutConsumer;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest.Builder stderrConsumer(java.io.OutputStream stderrConsumer) {
            this.stderrConsumer = stderrConsumer;
            return this;
        }

        @org.apache.maven.api.annotations.Nonnull
        public org.apache.maven.api.cli.ExecutorRequest build() {
            return new org.apache.maven.api.cli.ExecutorRequest.Builder.Impl(command, arguments, cwd, installationDirectory, userHomeDirectory, jvmSystemProperties, environmentVariables, jvmArguments, stdoutConsumer, stderrConsumer);
        }

        private static class Impl implements org.apache.maven.api.cli.ExecutorRequest {
            private final java.lang.String command;

            private final java.util.List<java.lang.String> arguments;

            private final java.nio.file.Path cwd;

            private final java.nio.file.Path installationDirectory;

            private final java.nio.file.Path userHomeDirectory;

            private final java.util.Map<java.lang.String, java.lang.String> jvmSystemProperties;

            private final java.util.Map<java.lang.String, java.lang.String> environmentVariables;

            private final java.util.List<java.lang.String> jvmArguments;

            private final java.io.OutputStream stdoutConsumer;

            private final java.io.OutputStream stderrConsumer;

            @java.lang.SuppressWarnings("ParameterNumber")
            private Impl(java.lang.String command, java.util.List<java.lang.String> arguments, java.nio.file.Path cwd, java.nio.file.Path installationDirectory, java.nio.file.Path userHomeDirectory, java.util.Map<java.lang.String, java.lang.String> jvmSystemProperties, java.util.Map<java.lang.String, java.lang.String> environmentVariables, java.util.List<java.lang.String> jvmArguments, java.io.OutputStream stdoutConsumer, java.io.OutputStream stderrConsumer) {
                this.command = java.util.Objects.requireNonNull(command);
                this.arguments = (arguments == null) ? java.util.List.of() : java.util.List.copyOf(arguments);
                this.cwd = org.apache.maven.api.cli.ExecutorRequest.getCanonicalPath(java.util.Objects.requireNonNull(cwd));
                this.installationDirectory = org.apache.maven.api.cli.ExecutorRequest.getCanonicalPath(java.util.Objects.requireNonNull(installationDirectory));
                this.userHomeDirectory = org.apache.maven.api.cli.ExecutorRequest.getCanonicalPath(java.util.Objects.requireNonNull(userHomeDirectory));
                this.jvmSystemProperties = (jvmSystemProperties != null) ? java.util.Map.copyOf(jvmSystemProperties) : null;
                this.environmentVariables = (environmentVariables != null) ? java.util.Map.copyOf(environmentVariables) : null;
                this.jvmArguments = (jvmArguments != null) ? java.util.List.copyOf(jvmArguments) : null;
                this.stdoutConsumer = stdoutConsumer;
                this.stderrConsumer = stderrConsumer;
            }

            @java.lang.Override
            public java.lang.String command() {
                return command;
            }

            @java.lang.Override
            public java.util.List<java.lang.String> arguments() {
                return arguments;
            }

            @java.lang.Override
            public java.nio.file.Path cwd() {
                return cwd;
            }

            @java.lang.Override
            public java.nio.file.Path installationDirectory() {
                return installationDirectory;
            }

            @java.lang.Override
            public java.nio.file.Path userHomeDirectory() {
                return userHomeDirectory;
            }

            @java.lang.Override
            public java.util.Optional<java.util.Map<java.lang.String, java.lang.String>> jvmSystemProperties() {
                return java.util.Optional.ofNullable(jvmSystemProperties);
            }

            @java.lang.Override
            public java.util.Optional<java.util.Map<java.lang.String, java.lang.String>> environmentVariables() {
                return java.util.Optional.ofNullable(environmentVariables);
            }

            @java.lang.Override
            public java.util.Optional<java.util.List<java.lang.String>> jvmArguments() {
                return java.util.Optional.ofNullable(jvmArguments);
            }

            @java.lang.Override
            public java.util.Optional<java.io.OutputStream> stdoutConsumer() {
                return java.util.Optional.ofNullable(stdoutConsumer);
            }

            @java.lang.Override
            public java.util.Optional<java.io.OutputStream> stderrConsumer() {
                return java.util.Optional.ofNullable(stderrConsumer);
            }

            @java.lang.Override
            public java.lang.String toString() {
                return ((((((((((((((((((((("Impl{" + "command='") + command) + '\'') + ", arguments=") + arguments) + ", cwd=") + cwd) + ", installationDirectory=") + installationDirectory) + ", userHomeDirectory=") + userHomeDirectory) + ", jvmSystemProperties=") + jvmSystemProperties) + ", environmentVariables=") + environmentVariables) + ", jvmArguments=") + jvmArguments) + ", stdoutConsumer=") + stdoutConsumer) + ", stderrConsumer=") + stderrConsumer) + '}';
            }
        }
    }

    @org.apache.maven.api.annotations.Nonnull
    static java.nio.file.Path discoverInstallationDirectory() {
        java.lang.String mavenHome = java.lang.System.getProperty("maven.home");
        if (mavenHome == null) {
            throw new org.apache.maven.api.cli.ExecutorException("requires maven.home Java System Property set");
        }
        return org.apache.maven.api.cli.ExecutorRequest.getCanonicalPath(java.nio.file.Paths.get(mavenHome));
    }

    @org.apache.maven.api.annotations.Nonnull
    static java.nio.file.Path discoverUserHomeDirectory() {
        java.lang.String userHome = java.lang.System.getProperty("user.home");
        if (userHome == null) {
            throw new org.apache.maven.api.cli.ExecutorException("requires user.home Java System Property set");
        }
        return org.apache.maven.api.cli.ExecutorRequest.getCanonicalPath(java.nio.file.Paths.get(userHome));
    }

    @org.apache.maven.api.annotations.Nonnull
    static java.nio.file.Path getCanonicalPath(java.nio.file.Path path) {
        java.util.Objects.requireNonNull(path, "path");
        try {
            return path.toRealPath();
        } catch (java.io.IOException e) {
            return org.apache.maven.api.cli.ExecutorRequest.getCanonicalPath(path.getParent()).resolve(path.getFileName());
        }
    }
}
