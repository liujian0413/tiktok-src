package com.ttnet.org.chromium.net1;

public abstract class ExperimentalBidirectionalStream extends BidirectionalStream {

    public static abstract class Builder extends com.ttnet.org.chromium.net1.BidirectionalStream.Builder {
        public abstract Builder addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        public abstract ExperimentalBidirectionalStream build();

        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean z);

        public abstract Builder setHttpMethod(String str);

        public abstract Builder setPriority(int i);
    }
}
