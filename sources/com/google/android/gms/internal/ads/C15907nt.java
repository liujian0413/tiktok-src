package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.nt */
final class C15907nt implements C15760ih {

    /* renamed from: a */
    private final C15879ms f44706a;

    /* renamed from: b */
    private final agu f44707b;

    /* renamed from: c */
    private final /* synthetic */ C15903np f44708c;

    public C15907nt(C15903np npVar, C15879ms msVar, agu agu) {
        this.f44708c = npVar;
        this.f44706a = msVar;
        this.f44707b = agu;
    }

    /* renamed from: a */
    public final void mo41654a(JSONObject jSONObject) {
        try {
            this.f44707b.mo39333b(this.f44708c.f44696a.mo41770a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f44707b.mo39333b(e);
        } finally {
            this.f44706a.mo41761a();
        }
    }

    /* renamed from: a */
    public final void mo41653a(String str) {
        if (str == null) {
            try {
                this.f44707b.mo39332a(new zzaon());
            } catch (IllegalStateException unused) {
                this.f44706a.mo41761a();
                return;
            } catch (Throwable th) {
                this.f44706a.mo41761a();
                throw th;
            }
        } else {
            this.f44707b.mo39332a(new zzaon(str));
        }
        this.f44706a.mo41761a();
    }
}
