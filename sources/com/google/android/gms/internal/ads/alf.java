package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class alf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40559a;

    /* renamed from: b */
    private final /* synthetic */ String f40560b;

    /* renamed from: c */
    private final /* synthetic */ long f40561c;

    /* renamed from: d */
    private final /* synthetic */ long f40562d;

    /* renamed from: e */
    private final /* synthetic */ boolean f40563e;

    /* renamed from: f */
    private final /* synthetic */ int f40564f;

    /* renamed from: g */
    private final /* synthetic */ int f40565g;

    /* renamed from: h */
    private final /* synthetic */ alb f40566h;

    alf(alb alb, String str, String str2, long j, long j2, boolean z, int i, int i2) {
        this.f40566h = alb;
        this.f40559a = str;
        this.f40560b = str2;
        this.f40561c = j;
        this.f40562d = j2;
        this.f40563e = z;
        this.f40564f = i;
        this.f40565g = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f40559a);
        hashMap.put("cachedSrc", this.f40560b);
        hashMap.put("bufferedDuration", Long.toString(this.f40561c));
        hashMap.put("totalDuration", Long.toString(this.f40562d));
        hashMap.put("cacheReady", this.f40563e ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f40564f));
        hashMap.put("playerPreparedCount", Integer.toString(this.f40565g));
        this.f40566h.m46257a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
