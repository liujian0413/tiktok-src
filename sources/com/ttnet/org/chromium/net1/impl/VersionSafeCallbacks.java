package com.ttnet.org.chromium.net1.impl;

import com.ttnet.org.chromium.net1.BidirectionalStream;
import com.ttnet.org.chromium.net1.BidirectionalStream.Callback;
import com.ttnet.org.chromium.net1.CronetException;
import com.ttnet.org.chromium.net1.NetworkQualityRttListener;
import com.ttnet.org.chromium.net1.NetworkQualityThroughputListener;
import com.ttnet.org.chromium.net1.RequestFinishedInfo;
import com.ttnet.org.chromium.net1.RequestFinishedInfo.Listener;
import com.ttnet.org.chromium.net1.UploadDataProvider;
import com.ttnet.org.chromium.net1.UploadDataSink;
import com.ttnet.org.chromium.net1.UrlRequest;
import com.ttnet.org.chromium.net1.UrlRequest.StatusListener;
import com.ttnet.org.chromium.net1.UrlResponseInfo;
import com.ttnet.org.chromium.net1.UrlResponseInfo.HeaderBlock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public class VersionSafeCallbacks {

    public static final class BidirectionalStreamCallback extends Callback {
        private final Callback mWrappedCallback;

        public BidirectionalStreamCallback(Callback callback) {
            this.mWrappedCallback = callback;
        }

        public final void onStreamReady(BidirectionalStream bidirectionalStream) {
            this.mWrappedCallback.onStreamReady(bidirectionalStream);
        }

        public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onCanceled(bidirectionalStream, urlResponseInfo);
        }

        public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onResponseHeadersReceived(bidirectionalStream, urlResponseInfo);
        }

        public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onSucceeded(bidirectionalStream, urlResponseInfo);
        }

        public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            this.mWrappedCallback.onFailed(bidirectionalStream, urlResponseInfo, cronetException);
        }

        public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
            this.mWrappedCallback.onResponseTrailersReceived(bidirectionalStream, urlResponseInfo, headerBlock);
        }

        public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
            this.mWrappedCallback.onReadCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z);
        }

        public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
            this.mWrappedCallback.onWriteCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z);
        }
    }

    public static final class LibraryLoader extends com.ttnet.org.chromium.net1.CronetEngine.Builder.LibraryLoader {
        private final com.ttnet.org.chromium.net1.CronetEngine.Builder.LibraryLoader mWrappedLoader;

        public LibraryLoader(com.ttnet.org.chromium.net1.CronetEngine.Builder.LibraryLoader libraryLoader) {
            this.mWrappedLoader = libraryLoader;
        }

        public final void loadLibrary(String str) {
            this.mWrappedLoader.loadLibrary(str);
        }
    }

    public static final class NetworkQualityRttListenerWrapper extends NetworkQualityRttListener {
        private final NetworkQualityRttListener mWrappedListener;

        public final Executor getExecutor() {
            return this.mWrappedListener.getExecutor();
        }

        public final int hashCode() {
            return this.mWrappedListener.hashCode();
        }

        public NetworkQualityRttListenerWrapper(NetworkQualityRttListener networkQualityRttListener) {
            super(networkQualityRttListener.getExecutor());
            this.mWrappedListener = networkQualityRttListener;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof NetworkQualityRttListenerWrapper)) {
                return false;
            }
            return this.mWrappedListener.equals(((NetworkQualityRttListenerWrapper) obj).mWrappedListener);
        }

        public final void onRttObservation(int i, long j, int i2) {
            this.mWrappedListener.onRttObservation(i, j, i2);
        }
    }

    public static final class NetworkQualityThroughputListenerWrapper extends NetworkQualityThroughputListener {
        private final NetworkQualityThroughputListener mWrappedListener;

        public final Executor getExecutor() {
            return this.mWrappedListener.getExecutor();
        }

        public final int hashCode() {
            return this.mWrappedListener.hashCode();
        }

        public NetworkQualityThroughputListenerWrapper(NetworkQualityThroughputListener networkQualityThroughputListener) {
            super(networkQualityThroughputListener.getExecutor());
            this.mWrappedListener = networkQualityThroughputListener;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof NetworkQualityThroughputListenerWrapper)) {
                return false;
            }
            return this.mWrappedListener.equals(((NetworkQualityThroughputListenerWrapper) obj).mWrappedListener);
        }

        public final void onThroughputObservation(int i, long j, int i2) {
            this.mWrappedListener.onThroughputObservation(i, j, i2);
        }
    }

    public static final class RequestFinishedInfoListener extends Listener {
        private final Listener mWrappedListener;

        public final Executor getExecutor() {
            return this.mWrappedListener.getExecutor();
        }

        public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
            this.mWrappedListener.onRequestFinished(requestFinishedInfo);
        }

        public RequestFinishedInfoListener(Listener listener) {
            super(listener.getExecutor());
            this.mWrappedListener = listener;
        }
    }

    public static final class UploadDataProviderWrapper extends UploadDataProvider {
        private final UploadDataProvider mWrappedProvider;

        public final void close() throws IOException {
            this.mWrappedProvider.close();
        }

        public final long getLength() throws IOException {
            return this.mWrappedProvider.getLength();
        }

        public UploadDataProviderWrapper(UploadDataProvider uploadDataProvider) {
            this.mWrappedProvider = uploadDataProvider;
        }

        public final void rewind(UploadDataSink uploadDataSink) throws IOException {
            this.mWrappedProvider.rewind(uploadDataSink);
        }

        public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            this.mWrappedProvider.read(uploadDataSink, byteBuffer);
        }
    }

    public static final class UrlRequestCallback extends UrlRequest.Callback {
        private final UrlRequest.Callback mWrappedCallback;

        public UrlRequestCallback(UrlRequest.Callback callback) {
            this.mWrappedCallback = callback;
        }

        public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onCanceled(urlRequest, urlResponseInfo);
        }

        public final void onMetricsCollected(UrlRequest urlRequest, RequestFinishedInfo requestFinishedInfo) {
            this.mWrappedCallback.onMetricsCollected(urlRequest, requestFinishedInfo);
        }

        public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws Exception {
            this.mWrappedCallback.onResponseStarted(urlRequest, urlResponseInfo);
        }

        public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onSucceeded(urlRequest, urlResponseInfo);
        }

        public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            this.mWrappedCallback.onFailed(urlRequest, urlResponseInfo, cronetException);
        }

        public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
            this.mWrappedCallback.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
        }

        public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
            this.mWrappedCallback.onRedirectReceived(urlRequest, urlResponseInfo, str);
        }
    }

    public static final class UrlRequestStatusListener extends StatusListener {
        private final StatusListener mWrappedListener;

        public UrlRequestStatusListener(StatusListener statusListener) {
            this.mWrappedListener = statusListener;
        }

        public final void onStatus(int i) {
            this.mWrappedListener.onStatus(i);
        }
    }
}
