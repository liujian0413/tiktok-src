package com.facebook.react.shell;

import com.facebook.imagepipeline.p717d.C13613j;

public class MainPackageConfig {
    private C13613j mFrescoConfig;

    public static class Builder {
        public C13613j mFrescoConfig;

        public MainPackageConfig build() {
            return new MainPackageConfig(this);
        }

        public Builder setFrescoConfig(C13613j jVar) {
            this.mFrescoConfig = jVar;
            return this;
        }
    }

    public C13613j getFrescoConfig() {
        return this.mFrescoConfig;
    }

    private MainPackageConfig(Builder builder) {
        this.mFrescoConfig = builder.mFrescoConfig;
    }
}
