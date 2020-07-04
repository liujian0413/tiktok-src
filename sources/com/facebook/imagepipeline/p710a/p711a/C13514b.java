package com.facebook.imagepipeline.p710a.p711a;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.common.C13593a;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p724k.C13683ai.C13684a;
import com.facebook.imagepipeline.p724k.C13700an;
import com.facebook.imagepipeline.p724k.C13736c;
import com.facebook.imagepipeline.p724k.C13738e;
import com.facebook.imagepipeline.p724k.C13748k;
import com.facebook.imagepipeline.p724k.C13767t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Call.Factory;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.facebook.imagepipeline.a.a.b */
public class C13514b extends C13736c<C13518a> {
    private final CacheControl mCacheControl;
    private final Factory mCallFactory;
    public Executor mCancellationExecutor;

    /* renamed from: com.facebook.imagepipeline.a.a.b$a */
    public static class C13518a extends C13767t {

        /* renamed from: a */
        public long f35850a;

        /* renamed from: b */
        public long f35851b;

        /* renamed from: c */
        public long f35852c;

        public C13518a(C13748k<C13647e> kVar, C13700an anVar) {
            super(kVar, anVar);
        }
    }

    public C13514b(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.dispatcher.executorService());
    }

    public C13514b(Factory factory, Executor executor) {
        this(factory, executor, true);
    }

    public C13518a createFetchState(C13748k<C13647e> kVar, C13700an anVar) {
        return new C13518a(kVar, anVar);
    }

    public void onFetchCompletion(C13518a aVar, int i) {
        aVar.f35852c = SystemClock.elapsedRealtime();
    }

    public Map<String, String> getExtraMap(C13518a aVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(aVar.f35851b - aVar.f35850a));
        hashMap.put("fetch_time", Long.toString(aVar.f35852c - aVar.f35851b));
        hashMap.put("total_time", Long.toString(aVar.f35852c - aVar.f35850a));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    public void fetch(C13518a aVar, C13684a aVar2) {
        aVar.f35850a = System.currentTimeMillis();
        try {
            Builder builder = new Builder().url(aVar.mo33371c().toString()).get();
            if (this.mCacheControl != null) {
                builder.cacheControl(this.mCacheControl);
            }
            C13593a aVar3 = aVar.f36544e.mo33333a().mBytesRange;
            if (aVar3 != null) {
                builder.addHeader("Range", aVar3.mo33143a());
            }
            fetchWithRequest(aVar, aVar2, builder.build());
        } catch (Exception e) {
            aVar2.mo33325a(e);
        }
    }

    public void handleException(Call call, Exception exc, C13684a aVar) {
        if (call.isCanceled()) {
            aVar.mo33323a();
        } else {
            aVar.mo33325a(exc);
        }
    }

    public C13514b(Factory factory, Executor executor, boolean z) {
        CacheControl cacheControl;
        this.mCallFactory = factory;
        this.mCancellationExecutor = executor;
        if (z) {
            cacheControl = new CacheControl.Builder().noStore().build();
        } else {
            cacheControl = null;
        }
        this.mCacheControl = cacheControl;
    }

    /* access modifiers changed from: protected */
    public void fetchWithRequest(final C13518a aVar, final C13684a aVar2, Request request) {
        final Call newCall = this.mCallFactory.newCall(request);
        aVar.f36544e.mo33334a(new C13738e() {
            /* renamed from: a */
            public final void mo29896a() {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    newCall.cancel();
                } else {
                    C13514b.this.mCancellationExecutor.execute(new Runnable() {
                        public final void run() {
                            newCall.cancel();
                        }
                    });
                }
            }
        });
        newCall.enqueue(new Callback() {
            public final void onFailure(Call call, IOException iOException) {
                C13514b.this.handleException(call, iOException, aVar2);
            }

            public final void onResponse(Call call, Response response) throws IOException {
                aVar.f35851b = System.currentTimeMillis();
                ResponseBody responseBody = response.body;
                try {
                    if (!response.isSuccessful()) {
                        C13514b bVar = C13514b.this;
                        StringBuilder sb = new StringBuilder("Unexpected HTTP code ");
                        sb.append(response);
                        bVar.handleException(call, new IOException(sb.toString()), aVar2);
                        return;
                    }
                    C13593a a = C13593a.m39998a(response.header("Content-Range"));
                    if (!(a == null || (a.f35999a == 0 && a.f36000b == Integer.MAX_VALUE))) {
                        aVar.f36547h = a;
                        aVar.f36546g = 8;
                    }
                    long contentLength = responseBody.contentLength();
                    if (contentLength < 0) {
                        contentLength = 0;
                    }
                    aVar2.mo33324a(responseBody.byteStream(), (int) contentLength);
                    responseBody.close();
                } catch (Exception e) {
                    C13514b.this.handleException(call, e, aVar2);
                } finally {
                    responseBody.close();
                }
            }
        });
    }
}
