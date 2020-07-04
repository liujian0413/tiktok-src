package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class alj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40585a;

    /* renamed from: b */
    private final /* synthetic */ String f40586b;

    /* renamed from: c */
    private final /* synthetic */ String f40587c;

    /* renamed from: d */
    private final /* synthetic */ String f40588d;

    /* renamed from: e */
    private final /* synthetic */ alb f40589e;

    alj(alb alb, String str, String str2, String str3, String str4) {
        this.f40589e = alb;
        this.f40585a = str;
        this.f40586b = str2;
        this.f40587c = str3;
        this.f40588d = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f40585a);
        if (!TextUtils.isEmpty(this.f40586b)) {
            hashMap.put("cachedSrc", this.f40586b);
        }
        hashMap.put("type", alb.mo39672c(this.f40587c));
        hashMap.put("reason", this.f40587c);
        if (!TextUtils.isEmpty(this.f40588d)) {
            hashMap.put("message", this.f40588d);
        }
        this.f40589e.m46257a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
