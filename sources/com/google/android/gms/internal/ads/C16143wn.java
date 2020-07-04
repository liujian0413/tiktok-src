package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.wn */
final class C16143wn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JSONObject f45247a;

    /* renamed from: b */
    final /* synthetic */ String f45248b;

    /* renamed from: c */
    private final /* synthetic */ C16140wk f45249c;

    C16143wn(C16140wk wkVar, JSONObject jSONObject, String str) {
        this.f45249c = wkVar;
        this.f45247a = jSONObject;
        this.f45248b = str;
    }

    public final void run() {
        this.f45249c.f45243l = C16140wk.f45235d.mo41752b((bdt) null);
        this.f45249c.f45243l.mo39339a(new C16144wo(this), new C16145wp(this));
    }
}
