package com.ttnet.org.chromium.net;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public abstract class UrlRequest {

    public static abstract class Builder {
        public abstract Builder addHeader(String str, String str2);

        public abstract Builder allowDirectExecutor();

        public abstract UrlRequest build();

        public abstract Builder disableCache();

        public abstract Builder setHttpMethod(String str);

        public abstract Builder setPriority(int i);

        public abstract Builder setRequestTimeout(int i);

        public abstract Builder setSocketConnectTimeout(int i);

        public abstract Builder setSocketReadTimeout(int i);

        public abstract Builder setSocketWriteTimeout(int i);

        public abstract Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }

    public static abstract class Callback {
        public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        }

        public abstract void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException);

        public void onMetricsCollected(UrlRequest urlRequest, RequestFinishedInfo requestFinishedInfo) {
        }

        public abstract void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception;

        public abstract void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception;

        public abstract void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws Exception;

        public abstract void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo);
    }

    public static class Status {
        private Status() {
        }
    }

    public static abstract class StatusListener {
        public abstract void onStatus(int i);
    }

    public void appTimeout() {
    }

    public abstract void cancel();

    public abstract void followRedirect();

    public abstract String getRequestLog();

    public abstract void getStatus(StatusListener statusListener);

    public abstract boolean isDone();

    public abstract void read(ByteBuffer byteBuffer);

    public void setRequestFlag(int i) {
    }

    public abstract void start();

    public abstract void stopRedirect();
}
