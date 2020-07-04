package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hu */
final class C15746hu implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ JSONObject f44484a;

    /* renamed from: b */
    private final /* synthetic */ C15745ht f44485b;

    C15746hu(C15745ht htVar, JSONObject jSONObject) {
        this.f44485b = htVar;
        this.f44484a = jSONObject;
    }

    public final void run() {
        this.f44485b.f44481a.mo39810a("fetchHttpRequestCompleted", this.f44484a);
        acd.m45777b("Dispatched http response.");
    }
}
