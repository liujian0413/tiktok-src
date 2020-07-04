package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.net.RequestFinishedInfo.Listener;
import java.util.concurrent.Executor;

public abstract class ExperimentalUrlRequest extends UrlRequest {

    public static abstract class Builder extends com.ttnet.org.chromium.net.UrlRequest.Builder {
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

        public Builder setRequestFinishedListener(Listener listener) {
            return this;
        }

        public Builder setTrafficStatsTag(int i) {
            return this;
        }

        public Builder setTrafficStatsUid(int i) {
            return this;
        }

        public abstract Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }
}
