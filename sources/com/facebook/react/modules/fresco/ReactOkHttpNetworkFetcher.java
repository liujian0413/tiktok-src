package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.p710a.p711a.C13514b;
import com.facebook.imagepipeline.p710a.p711a.C13514b.C13518a;
import com.facebook.imagepipeline.p724k.C13683ai.C13684a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;

class ReactOkHttpNetworkFetcher extends C13514b {
    private final Executor mCancellationExecutor;
    private final OkHttpClient mOkHttpClient;

    public ReactOkHttpNetworkFetcher(OkHttpClient okHttpClient) {
        super(okHttpClient);
        this.mOkHttpClient = okHttpClient;
        this.mCancellationExecutor = okHttpClient.dispatcher.executorService();
    }

    private Map<String, String> getHeaders(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    public void fetch(C13518a aVar, C13684a aVar2) {
        Map map;
        aVar.f35850a = SystemClock.elapsedRealtime();
        Uri c = aVar.mo33371c();
        if (aVar.f36544e.mo33333a() instanceof ReactNetworkImageRequest) {
            map = getHeaders(((ReactNetworkImageRequest) aVar.f36544e.mo33333a()).getHeaders());
        } else {
            map = null;
        }
        if (map == null) {
            map = Collections.emptyMap();
        }
        fetchWithRequest(aVar, aVar2, new Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(c.toString()).headers(Headers.m23791of(map)).get().build());
    }
}
