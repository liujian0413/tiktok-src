package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class alc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40539a;

    /* renamed from: b */
    private final /* synthetic */ String f40540b;

    /* renamed from: c */
    private final /* synthetic */ int f40541c;

    /* renamed from: d */
    private final /* synthetic */ int f40542d;

    /* renamed from: e */
    private final /* synthetic */ boolean f40543e;

    /* renamed from: f */
    private final /* synthetic */ alb f40544f;

    alc(alb alb, String str, String str2, int i, int i2, boolean z) {
        this.f40544f = alb;
        this.f40539a = str;
        this.f40540b = str2;
        this.f40541c = i;
        this.f40542d = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f40539a);
        hashMap.put("cachedSrc", this.f40540b);
        hashMap.put("bytesLoaded", Integer.toString(this.f40541c));
        hashMap.put("totalBytes", Integer.toString(this.f40542d));
        hashMap.put("cacheReady", this.f40543e ? "1" : "0");
        this.f40544f.m46257a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
