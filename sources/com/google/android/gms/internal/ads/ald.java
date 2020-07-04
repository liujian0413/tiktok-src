package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class ald implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40545a;

    /* renamed from: b */
    private final /* synthetic */ String f40546b;

    /* renamed from: c */
    private final /* synthetic */ int f40547c;

    /* renamed from: d */
    private final /* synthetic */ int f40548d;

    /* renamed from: e */
    private final /* synthetic */ boolean f40549e;

    /* renamed from: f */
    private final /* synthetic */ int f40550f;

    /* renamed from: g */
    private final /* synthetic */ int f40551g;

    /* renamed from: h */
    private final /* synthetic */ alb f40552h;

    ald(alb alb, String str, String str2, int i, int i2, boolean z, int i3, int i4) {
        this.f40552h = alb;
        this.f40545a = str;
        this.f40546b = str2;
        this.f40547c = i;
        this.f40549e = z;
        this.f40550f = i3;
        this.f40551g = i4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f40545a);
        hashMap.put("cachedSrc", this.f40546b);
        hashMap.put("bytesLoaded", Integer.toString(this.f40547c));
        hashMap.put("totalBytes", Integer.toString(this.f40548d));
        hashMap.put("cacheReady", this.f40549e ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f40550f));
        hashMap.put("playerPreparedCount", Integer.toString(this.f40551g));
        this.f40552h.m46257a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
