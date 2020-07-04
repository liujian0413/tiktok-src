package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class ali implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40581a;

    /* renamed from: b */
    private final /* synthetic */ String f40582b;

    /* renamed from: c */
    private final /* synthetic */ long f40583c;

    /* renamed from: d */
    private final /* synthetic */ alb f40584d;

    ali(alb alb, String str, String str2, long j) {
        this.f40584d = alb;
        this.f40581a = str;
        this.f40582b = str2;
        this.f40583c = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f40581a);
        hashMap.put("cachedSrc", this.f40582b);
        hashMap.put("totalDuration", Long.toString(this.f40583c));
        this.f40584d.m46257a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
