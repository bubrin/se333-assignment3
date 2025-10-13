package org.apache.maven.api.cli;
@org.apache.maven.api.annotations.Immutable
@org.apache.maven.api.annotations.Experimental
public interface ParserRequest {
    @org.apache.maven.api.annotations.Nonnull
    java.lang.String command();

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String commandName();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.Logger logger();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory();

    @org.apache.maven.api.annotations.Nonnull
    java.util.List<java.lang.String> args();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.Lookup lookup();

    @org.apache.maven.api.annotations.Nullable
    java.nio.file.Path cwd();

    @org.apache.maven.api.annotations.Nullable
    java.nio.file.Path mavenHome();

    @org.apache.maven.api.annotations.Nullable
    java.nio.file.Path userHome();

    @org.apache.maven.api.annotations.Nullable
    java.io.InputStream in();

    @org.apache.maven.api.annotations.Nullable
    java.io.OutputStream out();

    @org.apache.maven.api.annotations.Nullable
    java.io.OutputStream err();

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.cli.ParserRequest.Builder mvn(@org.apache.maven.api.annotations.Nonnull
    java.lang.String[] args, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.Logger logger, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory) {
        return org.apache.maven.api.cli.ParserRequest.mvn(java.util.Arrays.asList(args), logger, messageBuilderFactory);
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.cli.ParserRequest.Builder mvn(@org.apache.maven.api.annotations.Nonnull
    java.util.List<java.lang.String> args, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.Logger logger, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory) {
        return org.apache.maven.api.cli.ParserRequest.builder(org.apache.maven.api.cli.Tools.MVN_CMD, org.apache.maven.api.cli.Tools.MVN_NAME, args, logger, messageBuilderFactory);
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.cli.ParserRequest.Builder mvnenc(@org.apache.maven.api.annotations.Nonnull
    java.lang.String[] args, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.Logger logger, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory) {
        return org.apache.maven.api.cli.ParserRequest.mvnenc(java.util.Arrays.asList(args), logger, messageBuilderFactory);
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.cli.ParserRequest.Builder mvnenc(@org.apache.maven.api.annotations.Nonnull
    java.util.List<java.lang.String> args, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.Logger logger, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory) {
        return org.apache.maven.api.cli.ParserRequest.builder(org.apache.maven.api.cli.Tools.MVNENC_CMD, org.apache.maven.api.cli.Tools.MVNENC_NAME, args, logger, messageBuilderFactory);
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.cli.ParserRequest.Builder mvnsh(@org.apache.maven.api.annotations.Nonnull
    java.lang.String[] args, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.Logger logger, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory) {
        return org.apache.maven.api.cli.ParserRequest.mvnsh(java.util.Arrays.asList(args), logger, messageBuilderFactory);
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.cli.ParserRequest.Builder mvnsh(@org.apache.maven.api.annotations.Nonnull
    java.util.List<java.lang.String> args, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.Logger logger, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory) {
        return org.apache.maven.api.cli.ParserRequest.builder(org.apache.maven.api.cli.Tools.MVNSHELL_CMD, org.apache.maven.api.cli.Tools.MVNSHELL_NAME, args, logger, messageBuilderFactory);
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.cli.ParserRequest.Builder builder(@org.apache.maven.api.annotations.Nonnull
    java.lang.String command, @org.apache.maven.api.annotations.Nonnull
    java.lang.String commandName, @org.apache.maven.api.annotations.Nonnull
    java.util.List<java.lang.String> args, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.Logger logger, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory) {
        return new org.apache.maven.api.cli.ParserRequest.Builder(command, commandName, args, logger, messageBuilderFactory);
    }

    class Builder {
        private final java.lang.String command;

        private final java.lang.String commandName;

        private final java.util.List<java.lang.String> args;

        private final org.apache.maven.api.cli.Logger logger;

        private final org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory;

        private org.apache.maven.api.services.Lookup lookup = org.apache.maven.api.cli.ParserRequest.Builder.EMPTY_LOOKUP;

        private java.nio.file.Path cwd;

        private java.nio.file.Path mavenHome;

        private java.nio.file.Path userHome;

        private java.io.InputStream in;

        private java.io.OutputStream out;

        private java.io.OutputStream err;

        private Builder(java.lang.String command, java.lang.String commandName, java.util.List<java.lang.String> args, org.apache.maven.api.cli.Logger logger, org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory) {
            this.command = java.util.Objects.requireNonNull(command, "command");
            this.commandName = java.util.Objects.requireNonNull(commandName, "commandName");
            this.args = java.util.Objects.requireNonNull(args, "args");
            this.logger = java.util.Objects.requireNonNull(logger, "logger");
            this.messageBuilderFactory = java.util.Objects.requireNonNull(messageBuilderFactory, "messageBuilderFactory");
        }

        public org.apache.maven.api.cli.ParserRequest.Builder lookup(@org.apache.maven.api.annotations.Nonnull
        org.apache.maven.api.services.Lookup lookup) {
            this.lookup = java.util.Objects.requireNonNull(lookup);
            return this;
        }

        public org.apache.maven.api.cli.ParserRequest.Builder cwd(java.nio.file.Path cwd) {
            this.cwd = cwd;
            return this;
        }

        public org.apache.maven.api.cli.ParserRequest.Builder mavenHome(java.nio.file.Path mavenHome) {
            this.mavenHome = mavenHome;
            return this;
        }

        public org.apache.maven.api.cli.ParserRequest.Builder userHome(java.nio.file.Path userHome) {
            this.userHome = userHome;
            return this;
        }

        public org.apache.maven.api.cli.ParserRequest.Builder in(java.io.InputStream in) {
            this.in = in;
            return this;
        }

        public org.apache.maven.api.cli.ParserRequest.Builder out(java.io.OutputStream out) {
            this.out = out;
            return this;
        }

        public org.apache.maven.api.cli.ParserRequest.Builder err(java.io.OutputStream err) {
            this.err = err;
            return this;
        }

        public org.apache.maven.api.cli.ParserRequest build() {
            return new org.apache.maven.api.cli.ParserRequest.Builder.ParserRequestImpl(command, commandName, args, logger, messageBuilderFactory, lookup, cwd, mavenHome, userHome, in, out, err);
        }

        @java.lang.SuppressWarnings("ParameterNumber")
        private static class ParserRequestImpl implements org.apache.maven.api.cli.ParserRequest {
            private final java.lang.String command;

            private final java.lang.String commandName;

            private final org.apache.maven.api.cli.Logger logger;

            private final org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory;

            private final java.util.List<java.lang.String> args;

            private final org.apache.maven.api.services.Lookup lookup;

            private final java.nio.file.Path cwd;

            private final java.nio.file.Path mavenHome;

            private final java.nio.file.Path userHome;

            private final java.io.InputStream in;

            private final java.io.OutputStream out;

            private final java.io.OutputStream err;

            private ParserRequestImpl(java.lang.String command, java.lang.String commandName, java.util.List<java.lang.String> args, org.apache.maven.api.cli.Logger logger, org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory, org.apache.maven.api.services.Lookup lookup, java.nio.file.Path cwd, java.nio.file.Path mavenHome, java.nio.file.Path userHome, java.io.InputStream in, java.io.OutputStream out, java.io.OutputStream err) {
                this.command = java.util.Objects.requireNonNull(command, "command");
                this.commandName = java.util.Objects.requireNonNull(commandName, "commandName");
                this.args = java.util.List.copyOf(java.util.Objects.requireNonNull(args, "args"));
                this.logger = java.util.Objects.requireNonNull(logger, "logger");
                this.messageBuilderFactory = java.util.Objects.requireNonNull(messageBuilderFactory, "messageBuilderFactory");
                this.lookup = java.util.Objects.requireNonNull(lookup, "lookup");
                this.cwd = cwd;
                this.mavenHome = mavenHome;
                this.userHome = userHome;
                this.in = in;
                this.out = out;
                this.err = err;
            }

            @java.lang.Override
            public java.lang.String command() {
                return command;
            }

            @java.lang.Override
            public java.lang.String commandName() {
                return commandName;
            }

            @java.lang.Override
            public org.apache.maven.api.cli.Logger logger() {
                return logger;
            }

            @java.lang.Override
            public org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory() {
                return messageBuilderFactory;
            }

            @java.lang.Override
            public java.util.List<java.lang.String> args() {
                return args;
            }

            @java.lang.Override
            public org.apache.maven.api.services.Lookup lookup() {
                return lookup;
            }

            @java.lang.Override
            public java.nio.file.Path cwd() {
                return cwd;
            }

            @java.lang.Override
            public java.nio.file.Path mavenHome() {
                return mavenHome;
            }

            @java.lang.Override
            public java.nio.file.Path userHome() {
                return userHome;
            }

            @java.lang.Override
            public java.io.InputStream in() {
                return in;
            }

            @java.lang.Override
            public java.io.OutputStream out() {
                return out;
            }

            @java.lang.Override
            public java.io.OutputStream err() {
                return err;
            }
        }

        private static final org.apache.maven.api.services.Lookup EMPTY_LOOKUP = new org.apache.maven.api.services.Lookup() {
            @java.lang.Override
            public <T> T lookup(java.lang.Class<T> type) {
                throw new org.apache.maven.api.services.LookupException("empty lookup");
            }

            @java.lang.Override
            public <T> T lookup(java.lang.Class<T> type, java.lang.String name) {
                throw new org.apache.maven.api.services.LookupException("empty lookup");
            }

            @java.lang.Override
            public <T> java.util.Optional<T> lookupOptional(java.lang.Class<T> type) {
                return java.util.Optional.empty();
            }

            @java.lang.Override
            public <T> java.util.Optional<T> lookupOptional(java.lang.Class<T> type, java.lang.String name) {
                return java.util.Optional.empty();
            }

            @java.lang.Override
            public <T> java.util.List<T> lookupList(java.lang.Class<T> type) {
                return java.util.List.of();
            }

            @java.lang.Override
            public <T> java.util.Map<java.lang.String, T> lookupMap(java.lang.Class<T> type) {
                return java.util.Map.of();
            }
        };
    }
}
