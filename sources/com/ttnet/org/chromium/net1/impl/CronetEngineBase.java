package com.ttnet.org.chromium.net1.impl;

import com.ttnet.org.chromium.net1.BidirectionalStream.Callback;
import com.ttnet.org.chromium.net1.ExperimentalBidirectionalStream;
import com.ttnet.org.chromium.net1.ExperimentalCronetEngine;
import com.ttnet.org.chromium.net1.ExperimentalUrlRequest;
import com.ttnet.org.chromium.net1.TTWebsocketConnection;
import com.ttnet.org.chromium.net1.TTWebsocketConnection.Builder;
import com.ttnet.org.chromium.net1.UrlRequest;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

public abstract class CronetEngineBase extends ExperimentalCronetEngine {

    @Retention(RetentionPolicy.SOURCE)
    public @interface RequestPriority {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamPriority {
    }

    /* access modifiers changed from: protected */
    public abstract ExperimentalBidirectionalStream createBidirectionalStream(String str, Callback callback, Executor executor, String str2, List<Entry<String, String>> list, int i, boolean z, Collection<Object> collection);

    /* access modifiers changed from: protected */
    public abstract UrlRequestBase createRequest(String str, UrlRequest.Callback callback, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: protected */
    public abstract TTWebsocketConnection createWebsocketConnection(TTWebsocketConnection.Callback callback, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z);

    /* access modifiers changed from: protected */
    public abstract TTWebsocketConnection createWebsocketConnection(TTWebsocketConnection.Callback callback, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z);

    public Builder newWebsocketConnectionBuilder(TTWebsocketConnection.Callback callback, Executor executor) {
        return new TTWebsocketConnectionBuilderImpl(callback, executor, this);
    }

    public ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new UrlRequestBuilderImpl(str, callback, executor, this);
    }
}
