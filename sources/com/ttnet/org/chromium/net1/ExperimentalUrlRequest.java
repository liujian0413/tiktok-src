package com.ttnet.org.chromium.net1;

import java.util.concurrent.Executor;

public abstract class ExperimentalUrlRequest extends UrlRequest {

    public static abstract class Builder extends com.ttnet.org.chromium.net1.UrlRequest.Builder {
        public abstract Builder addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        public abstract Builder allowDirectExecutor();

        public abstract ExperimentalUrlRequest build();

        public abstract Builder disableCache();

        public Builder disableConnectionMigration() {
            return this;
        }

        public abstract Builder setHttpMethod(String str);

        public abstract Builder setPriority(int i);

        public abstract Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }
}
