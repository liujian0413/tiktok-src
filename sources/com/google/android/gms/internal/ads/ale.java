package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class ale implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40553a;

    /* renamed from: b */
    private final /* synthetic */ String f40554b;

    /* renamed from: c */
    private final /* synthetic */ long f40555c;

    /* renamed from: d */
    private final /* synthetic */ long f40556d;

    /* renamed from: e */
    private final /* synthetic */ boolean f40557e;

    /* renamed from: f */
    private final /* synthetic */ alb f40558f;

    ale(alb alb, String str, String str2, long j, long j2, boolean z) {
        this.f40558f = alb;
        this.f40553a = str;
        this.f40554b = str2;
        this.f40555c = j;
        this.f40556d = j2;
        this.f40557e = z;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f40553a);
        hashMap.put("cachedSrc", this.f40554b);
        hashMap.put("bufferedDuration", Long.toString(this.f40555c));
        hashMap.put("totalDuration", Long.toString(this.f40556d));
        hashMap.put("cacheReady", this.f40557e ? "1" : "0");
        this.f40558f.m46257a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
