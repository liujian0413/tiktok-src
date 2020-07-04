package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tq */
final /* synthetic */ class C16066tq implements Runnable {

    /* renamed from: a */
    private final C16065tp f45065a;

    /* renamed from: b */
    private final boolean f45066b;

    /* renamed from: c */
    private final JSONObject f45067c;

    /* renamed from: d */
    private final agu f45068d;

    C16066tq(C16065tp tpVar, boolean z, JSONObject jSONObject, agu agu) {
        this.f45065a = tpVar;
        this.f45066b = z;
        this.f45067c = jSONObject;
        this.f45068d = agu;
    }

    public final void run() {
        this.f45065a.mo41996a(this.f45066b, this.f45067c, this.f45068d);
    }
}
