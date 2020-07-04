package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@C6505uv
public final class btn implements bua {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final btf f43551a;

    /* renamed from: b */
    private final ami f43552b;

    /* renamed from: c */
    private final C15742hq<ami> f43553c = new bto(this);

    /* renamed from: d */
    private final C15742hq<ami> f43554d = new btp(this);

    /* renamed from: e */
    private final C15742hq<ami> f43555e = new btq(this);

    public btn(btf btf, ami ami) {
        this.f43551a = btf;
        this.f43552b = ami;
        ami ami2 = this.f43552b;
        ami2.mo39721a("/updateActiveView", this.f43553c);
        ami2.mo39721a("/untrackActiveViewUnit", this.f43554d);
        ami2.mo39721a("/visibilityChanged", this.f43555e);
        String str = "Custom JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f43551a.f43519a.f43508c);
        acd.m45777b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    public final boolean mo41312a() {
        return true;
    }

    /* renamed from: a */
    public final void mo41311a(JSONObject jSONObject, boolean z) {
        if (!z) {
            this.f43552b.mo39814b("AFMA_updateActiveView", jSONObject);
        } else {
            this.f43551a.mo41296b((bua) this);
        }
    }

    /* renamed from: b */
    public final void mo41313b() {
        ami ami = this.f43552b;
        ami.mo39725b("/visibilityChanged", this.f43555e);
        ami.mo39725b("/untrackActiveViewUnit", this.f43554d);
        ami.mo39725b("/updateActiveView", this.f43553c);
    }
}
