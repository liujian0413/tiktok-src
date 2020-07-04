package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14793ay;
import org.json.JSONObject;

@C6505uv
public final class btr implements bua {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final btf f43559a;

    /* renamed from: b */
    private final Context f43560b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C15755ic f43561c;

    /* renamed from: d */
    private C15879ms f43562d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f43563e;

    /* renamed from: f */
    private final C15742hq<C15889nb> f43564f = new btw(this);

    /* renamed from: g */
    private final C15742hq<C15889nb> f43565g = new btx(this);

    /* renamed from: h */
    private final C15742hq<C15889nb> f43566h = new bty(this);

    /* renamed from: i */
    private final C15742hq<C15889nb> f43567i = new btz(this);

    public btr(btf btf, C15863mc mcVar, Context context) {
        this.f43559a = btf;
        this.f43560b = context;
        this.f43561c = new C15755ic(this.f43560b);
        this.f43562d = mcVar.mo41752b((bdt) null);
        this.f43562d.mo39339a(new bts(this), new btt(this));
        String str = "Core JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f43559a.f43519a.f43508c);
        acd.m45777b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    public final void mo41311a(JSONObject jSONObject, boolean z) {
        this.f43562d.mo39339a(new btu(this, jSONObject), new agy());
    }

    /* renamed from: a */
    public final boolean mo41312a() {
        return this.f43563e;
    }

    /* renamed from: b */
    public final void mo41313b() {
        this.f43562d.mo39339a(new btv(this), new agy());
        this.f43562d.mo41761a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41314a(C15889nb nbVar) {
        nbVar.mo41741a("/updateActiveView", this.f43564f);
        nbVar.mo41741a("/untrackActiveViewUnit", this.f43565g);
        nbVar.mo41741a("/visibilityChanged", this.f43566h);
        if (C14793ay.m42913s().mo39043a(this.f43560b)) {
            nbVar.mo41741a("/logScionEvent", this.f43567i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo41315b(C15889nb nbVar) {
        nbVar.mo41742b("/visibilityChanged", this.f43566h);
        nbVar.mo41742b("/untrackActiveViewUnit", this.f43565g);
        nbVar.mo41742b("/updateActiveView", this.f43564f);
        if (C14793ay.m42913s().mo39043a(this.f43560b)) {
            nbVar.mo41742b("/logScionEvent", this.f43567i);
        }
    }
}
