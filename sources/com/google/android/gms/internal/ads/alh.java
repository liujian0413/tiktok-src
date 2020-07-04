package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class alh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40577a;

    /* renamed from: b */
    private final /* synthetic */ String f40578b;

    /* renamed from: c */
    private final /* synthetic */ int f40579c;

    /* renamed from: d */
    private final /* synthetic */ alb f40580d;

    alh(alb alb, String str, String str2, int i) {
        this.f40580d = alb;
        this.f40577a = str;
        this.f40578b = str2;
        this.f40579c = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f40577a);
        hashMap.put("cachedSrc", this.f40578b);
        hashMap.put("totalBytes", Integer.toString(this.f40579c));
        this.f40580d.m46257a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
