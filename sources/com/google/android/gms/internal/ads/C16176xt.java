package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14794az;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15349d;
import java.util.HashMap;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.xt */
public final class C16176xt {

    /* renamed from: c */
    private static final C15930op f45409c = new C15930op();

    /* renamed from: a */
    public final C15721gw f45410a;

    /* renamed from: b */
    public final C16043su f45411b;

    /* renamed from: d */
    private final C15931oq f45412d;

    /* renamed from: e */
    private final C14794az f45413e;

    /* renamed from: f */
    private final Map<String, C16218zh> f45414f = new HashMap();

    /* renamed from: g */
    private final C16211za f45415g;

    public C16176xt(C14794az azVar, C15931oq oqVar, C16211za zaVar, C15721gw gwVar, C16043su suVar) {
        this.f45413e = azVar;
        this.f45412d = oqVar;
        this.f45415g = zaVar;
        this.f45410a = gwVar;
        this.f45411b = suVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C16218zh mo42068a(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.zh> r0 = r4.f45414f
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.ads.zh r0 = (com.google.android.gms.internal.ads.C16218zh) r0
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.internal.ads.oq r1 = r4.f45412d     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x002b }
            if (r2 == 0) goto L_0x0016
            com.google.android.gms.internal.ads.op r1 = f45409c     // Catch:{ Exception -> 0x002b }
        L_0x0016:
            com.google.android.gms.internal.ads.zh r2 = new com.google.android.gms.internal.ads.zh     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.ou r1 = r1.mo41811a(r5)     // Catch:{ Exception -> 0x002b }
            com.google.android.gms.internal.ads.za r3 = r4.f45415g     // Catch:{ Exception -> 0x002b }
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x002b }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.zh> r0 = r4.f45414f     // Catch:{ Exception -> 0x0028 }
            r0.put(r5, r2)     // Catch:{ Exception -> 0x0028 }
            r0 = r2
            goto L_0x0045
        L_0x0028:
            r1 = move-exception
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r1 = move-exception
        L_0x002c:
            java.lang.String r2 = "Fail to instantiate adapter "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x003d
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0042
        L_0x003d:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0042:
            com.google.android.gms.internal.ads.acd.m45780c(r5, r1)
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16176xt.mo42068a(java.lang.String):com.google.android.gms.internal.ads.zh");
    }

    /* renamed from: a */
    public final void mo42070a() {
        this.f45413e.f38257L = 0;
        C14794az azVar = this.f45413e;
        C16214zd zdVar = new C16214zd(this.f45413e.f38268c, this.f45413e.f38276k, this);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(zdVar.getClass().getName());
        acd.m45777b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        zdVar.mo39128c();
        azVar.f38273h = zdVar;
    }

    /* renamed from: a */
    public final void mo42072a(boolean z) {
        C16218zh a = mo42068a(this.f45413e.f38275j.f39877q);
        if (!(a == null || a.f45478a == null)) {
            try {
                a.f45478a.mo41827a(z);
                a.f45478a.mo41834f();
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo42073b() {
        C15267r.m44393b("pause must be called on the main UI thread.");
        for (String str : this.f45414f.keySet()) {
            try {
                C16218zh zhVar = (C16218zh) this.f45414f.get(str);
                if (!(zhVar == null || zhVar.f45478a == null)) {
                    zhVar.f45478a.mo41832d();
                }
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo42074c() {
        C15267r.m44393b("resume must be called on the main UI thread.");
        for (String str : this.f45414f.keySet()) {
            try {
                C16218zh zhVar = (C16218zh) this.f45414f.get(str);
                if (!(zhVar == null || zhVar.f45478a == null)) {
                    zhVar.f45478a.mo41833e();
                }
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo42075d() {
        C15267r.m44393b("destroy must be called on the main UI thread.");
        for (String str : this.f45414f.keySet()) {
            try {
                C16218zh zhVar = (C16218zh) this.f45414f.get(str);
                if (!(zhVar == null || zhVar.f45478a == null)) {
                    zhVar.f45478a.mo41831c();
                }
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo42071a(Context context) {
        for (C16218zh zhVar : this.f45414f.values()) {
            try {
                zhVar.f45478a.mo41816a(C15349d.m44668a(context));
            } catch (RemoteException e) {
                acd.m45778b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    /* renamed from: e */
    public final void mo42076e() {
        if (this.f45413e.f38275j != null && this.f45413e.f38275j.f39875o != null) {
            C15924oj.m51488a(this.f45413e.f38268c, this.f45413e.f38270e.f45677a, this.f45413e.f38275j, this.f45413e.f38267b, false, this.f45413e.f38275j.f39875o.f44726l);
        }
    }

    /* renamed from: f */
    public final void mo42077f() {
        if (this.f45413e.f38275j != null && this.f45413e.f38275j.f39875o != null) {
            C15924oj.m51488a(this.f45413e.f38268c, this.f45413e.f38270e.f45677a, this.f45413e.f38275j, this.f45413e.f38267b, false, this.f45413e.f38275j.f39875o.f44728n);
        }
    }

    /* renamed from: a */
    public final zzbaz mo42069a(zzbaz zzbaz) {
        if (!(this.f45413e.f38275j == null || this.f45413e.f38275j.f39878r == null || TextUtils.isEmpty(this.f45413e.f38275j.f39878r.f44748k))) {
            zzbaz = new zzbaz(this.f45413e.f38275j.f39878r.f44748k, this.f45413e.f38275j.f39878r.f44749l);
        }
        if (!(this.f45413e.f38275j == null || this.f45413e.f38275j.f39875o == null)) {
            C15924oj.m51489a(this.f45413e.f38268c, this.f45413e.f38270e.f45677a, this.f45413e.f38275j.f39875o.f44727m, this.f45413e.f38252G, this.f45413e.f38253H, zzbaz);
        }
        return zzbaz;
    }
}
