package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.np */
public final class C15903np<I, O> implements C15892ne<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C15894ng<O> f44696a;

    /* renamed from: b */
    private final C15895nh<I> f44697b;

    /* renamed from: c */
    private final C15863mc f44698c;

    /* renamed from: d */
    private final String f44699d;

    C15903np(C15863mc mcVar, String str, C15895nh<I> nhVar, C15894ng<O> ngVar) {
        this.f44698c = mcVar;
        this.f44699d = str;
        this.f44697b = nhVar;
        this.f44696a = ngVar;
    }

    /* renamed from: b */
    public final agj<O> mo41767b(I i) {
        agu agu = new agu();
        C15879ms b = this.f44698c.mo41752b((bdt) null);
        b.mo39339a(new C15905nr(this, b, i, agu), new C15906ns(this, agu, b));
        return agu;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m51387a(C15879ms msVar, C15889nb nbVar, I i, agu<O> agu) {
        try {
            String a = acl.m45518a();
            C15726ha.f44466o.mo41652a(a, (C15760ih) new C15907nt(this, msVar, agu));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", a);
            jSONObject.put("args", this.f44697b.mo41771a(i));
            nbVar.mo39814b(this.f44699d, jSONObject);
        } catch (Exception e) {
            agu.mo39332a(e);
            acd.m45778b("Unable to invokeJavascript", e);
            msVar.mo41761a();
        } catch (Throwable th) {
            msVar.mo41761a();
            throw th;
        }
    }

    /* renamed from: a */
    public final agj<O> mo37772a(I i) throws Exception {
        return mo41767b(i);
    }
}
