package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class alg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40567a;

    /* renamed from: b */
    private final /* synthetic */ String f40568b;

    /* renamed from: c */
    private final /* synthetic */ int f40569c;

    /* renamed from: d */
    private final /* synthetic */ int f40570d;

    /* renamed from: e */
    private final /* synthetic */ long f40571e;

    /* renamed from: f */
    private final /* synthetic */ long f40572f;

    /* renamed from: g */
    private final /* synthetic */ boolean f40573g;

    /* renamed from: h */
    private final /* synthetic */ int f40574h;

    /* renamed from: i */
    private final /* synthetic */ int f40575i;

    /* renamed from: j */
    private final /* synthetic */ alb f40576j;

    alg(alb alb, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f40576j = alb;
        this.f40567a = str;
        this.f40568b = str2;
        this.f40569c = i;
        this.f40570d = i2;
        this.f40571e = j;
        this.f40572f = j2;
        this.f40573g = z;
        this.f40574h = i3;
        this.f40575i = i4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f40567a);
        hashMap.put("cachedSrc", this.f40568b);
        hashMap.put("bytesLoaded", Integer.toString(this.f40569c));
        hashMap.put("totalBytes", Integer.toString(this.f40570d));
        hashMap.put("bufferedDuration", Long.toString(this.f40571e));
        hashMap.put("totalDuration", Long.toString(this.f40572f));
        hashMap.put("cacheReady", this.f40573g ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f40574h));
        hashMap.put("playerPreparedCount", Integer.toString(this.f40575i));
        this.f40576j.m46257a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
