package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C15488ak;
import com.google.android.gms.internal.ads.C15600ck;
import com.google.android.gms.internal.ads.C15606cq;
import com.google.android.gms.internal.ads.C15621de;
import com.google.android.gms.internal.ads.C15623dg;
import com.google.android.gms.internal.ads.C15628dl;
import com.google.android.gms.internal.ads.C15630dn;
import com.google.android.gms.internal.ads.C15631do;
import com.google.android.gms.internal.ads.C15632dp;
import com.google.android.gms.internal.ads.C15635dr;
import com.google.android.gms.internal.ads.C15636ds;
import com.google.android.gms.internal.ads.C15658en;
import com.google.android.gms.internal.ads.C15682fk;
import com.google.android.gms.internal.ads.C15693fv;
import com.google.android.gms.internal.ads.C15916ob;
import com.google.android.gms.internal.ads.C15931oq;
import com.google.android.gms.internal.ads.C15945pd;
import com.google.android.gms.internal.ads.C15948pg;
import com.google.android.gms.internal.ads.C15951pj;
import com.google.android.gms.internal.ads.C16042st;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.abj;
import com.google.android.gms.internal.ads.abk;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.ami;
import com.google.android.gms.internal.ads.bwl;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.bo */
public final class C14810bo extends C14797bb implements C15635dr {

    /* renamed from: j */
    private boolean f38316j;

    /* renamed from: k */
    private abj f38317k;

    /* renamed from: l */
    private boolean f38318l;

    public C14810bo(Context context, C14816bu buVar, zzyz zzyz, String str, C15931oq oqVar, zzbgz zzbgz) {
        super(context, zzyz, str, oqVar, zzbgz, buVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo37660a(zzyv zzyv, abj abj, boolean z) {
        return false;
    }

    /* renamed from: q */
    public final C15488ak mo37627q() {
        return null;
    }

    /* renamed from: b */
    public final boolean mo37614b(zzyv zzyv) {
        zzyv zzyv2 = zzyv;
        if (this.f38140e.f38248C != null && this.f38140e.f38248C.size() == 1 && ((Integer) this.f38140e.f38248C.get(0)).intValue() == 2) {
            acd.m45779c("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            bwl bwl = null;
            if (this.f38140e.f38275j != null) {
                bwl = this.f38140e.f38275j.f39850K;
            }
            mo37583a(0, bwl);
            return false;
        } else if (this.f38140e.f38247B == null) {
            return super.mo37614b(zzyv);
        } else {
            if (zzyv2.f45784h != this.f38316j) {
                zzyv zzyv3 = new zzyv(zzyv2.f45777a, zzyv2.f45778b, zzyv2.f45779c, zzyv2.f45780d, zzyv2.f45781e, zzyv2.f45782f, zzyv2.f45783g, zzyv2.f45784h || this.f38316j, zzyv2.f45785i, zzyv2.f45786j, zzyv2.f45787k, zzyv2.f45788l, zzyv2.f45789m, zzyv2.f45790n, zzyv2.f45791o, zzyv2.f45792p, zzyv2.f45793q, zzyv2.f45794r, null, zzyv2.f45796t, zzyv2.f45797u);
                zzyv2 = zzyv3;
            }
            return super.mo37614b(zzyv2);
        }
    }

    /* renamed from: a */
    public final void mo37587a(abk abk, C15600ck ckVar) {
        this.f38317k = null;
        if (abk.f39891e != -2) {
            this.f38317k = m42981a(abk, abk.f39891e);
        } else if (!abk.f39888b.f45630g) {
            acd.m45783e("partialAdState is not mediation");
            this.f38317k = m42981a(abk, 0);
        }
        if (this.f38317k != null) {
            acl.f40003a.post(new C14811bp(this));
            return;
        }
        if (abk.f39890d != null) {
            this.f38140e.f38274i = abk.f39890d;
        }
        this.f38140e.f38257L = 0;
        this.f38140e.f38273h = C16042st.m52127a(this.f38140e.f38268c, this, abk, this.f38140e.f38269d, null, this.f38298n, this, ckVar);
    }

    /* renamed from: a */
    private static abj m42981a(abk abk, int i) {
        abk abk2 = abk;
        abj abj = new abj(abk2.f39887a.f45573c, null, abk2.f39888b.f45626c, i, abk2.f39888b.f45628e, abk2.f39888b.f45632i, abk2.f39888b.f45634k, abk2.f39888b.f45633j, abk2.f39887a.f45579i, abk2.f39888b.f45630g, null, null, null, abk2.f39889c, null, abk2.f39888b.f45631h, abk2.f39890d, abk2.f39888b.f45629f, abk2.f39892f, abk2.f39893g, abk2.f39888b.f45637n, abk2.f39894h, null, abk2.f39888b.f45597A, abk2.f39888b.f45598B, abk2.f39888b.f45598B, abk2.f39888b.f45600D, abk2.f39888b.f45601E, null, abk2.f39888b.f45604H, abk2.f39888b.f45608L, abk2.f39895i, abk2.f39888b.f45611O, abk2.f39896j, abk2.f39888b.f45613Q, abk2.f39888b.f45614R, abk2.f39888b.f45615S, abk2.f39888b.f45616T, abk2.f39888b.f45618V, abk2.f39888b.f45619W);
        return abj;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo37609a(com.google.android.gms.internal.ads.abj r5, com.google.android.gms.internal.ads.abj r6) {
        /*
            r4 = this;
            com.google.android.gms.ads.internal.az r0 = r4.f38140e
            boolean r0 = r0.mo37702c()
            if (r0 == 0) goto L_0x009f
            boolean r0 = r6.f39874n
            r1 = 0
            if (r0 != 0) goto L_0x0018
            com.google.android.gms.internal.ads.bwl r5 = r6.f39850K
            r4.mo37583a(r1, r5)
            java.lang.String r5 = "newState is not mediation."
            com.google.android.gms.internal.ads.acd.m45783e(r5)
            return r1
        L_0x0018:
            com.google.android.gms.internal.ads.oa r0 = r6.f39875o
            r2 = 1
            if (r0 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.oa r0 = r6.f39875o
            boolean r0 = r0.mo41778a()
            if (r0 == 0) goto L_0x006b
            com.google.android.gms.ads.internal.az r0 = r4.f38140e
            boolean r0 = r0.mo37702c()
            if (r0 == 0) goto L_0x003d
            com.google.android.gms.ads.internal.az r0 = r4.f38140e
            com.google.android.gms.ads.internal.ba r0 = r0.f38271f
            if (r0 == 0) goto L_0x003d
            com.google.android.gms.ads.internal.az r0 = r4.f38140e
            com.google.android.gms.ads.internal.ba r0 = r0.f38271f
            com.google.android.gms.internal.ads.adj r0 = r0.f38294a
            java.lang.String r3 = r6.f39840A
            r0.f40029a = r3
        L_0x003d:
            boolean r0 = super.mo37609a(r5, r6)
            if (r0 != 0) goto L_0x0045
        L_0x0043:
            r5 = 0
            goto L_0x0065
        L_0x0045:
            com.google.android.gms.ads.internal.az r0 = r4.f38140e
            boolean r0 = r0.mo37702c()
            if (r0 == 0) goto L_0x0059
            boolean r5 = r4.m42984c(r5, r6)
            if (r5 != 0) goto L_0x0059
            com.google.android.gms.internal.ads.bwl r5 = r6.f39850K
            r4.mo37583a(r1, r5)
            goto L_0x0043
        L_0x0059:
            com.google.android.gms.ads.internal.az r5 = r4.f38140e
            boolean r5 = r5.mo37703d()
            if (r5 != 0) goto L_0x0064
            super.mo37723a(r6, r1)
        L_0x0064:
            r5 = 1
        L_0x0065:
            if (r5 != 0) goto L_0x0068
            return r1
        L_0x0068:
            r4.f38318l = r2
            goto L_0x007e
        L_0x006b:
            com.google.android.gms.internal.ads.oa r0 = r6.f39875o
            if (r0 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.oa r0 = r6.f39875o
            boolean r0 = r0.mo41779b()
            if (r0 == 0) goto L_0x0094
            boolean r5 = r4.m42983b(r5, r6)
            if (r5 != 0) goto L_0x007e
            return r1
        L_0x007e:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Integer[] r6 = new java.lang.Integer[r2]
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r1] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            r5.<init>(r6)
            r4.mo37753c(r5)
            return r2
        L_0x0094:
            com.google.android.gms.internal.ads.bwl r5 = r6.f39850K
            r4.mo37583a(r1, r5)
            java.lang.String r5 = "Response is neither banner nor native."
            com.google.android.gms.internal.ads.acd.m45783e(r5)
            return r1
        L_0x009f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "AdLoader API does not support custom rendering."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14810bo.mo37609a(com.google.android.gms.internal.ads.abj, com.google.android.gms.internal.ads.abj):boolean");
    }

    /* renamed from: b */
    private final boolean m42983b(abj abj, abj abj2) {
        abj abj3 = abj2;
        View view = null;
        mo37752b(null);
        if (!this.f38140e.mo37702c()) {
            acd.m45783e("Native ad does not have custom rendering mode.");
            mo37583a(0, abj3.f39850K);
            return false;
        }
        try {
            C15951pj p = abj3.f39876p != null ? abj3.f39876p.mo41844p() : null;
            C15945pd h = abj3.f39876p != null ? abj3.f39876p.mo41836h() : null;
            C15948pg i = abj3.f39876p != null ? abj3.f39876p.mo41837i() : null;
            C15682fk n = abj3.f39876p != null ? abj3.f39876p.mo41842n() : null;
            String c = m42927c(abj2);
            if (p != null && this.f38140e.f38285t != null) {
                String a = p.mo41885a();
                List b = p.mo41888b();
                String c2 = p.mo41890c();
                C15658en d = p.mo41891d() != null ? p.mo41891d() : null;
                String e = p.mo41892e();
                String f = p.mo41893f();
                double g = p.mo41894g();
                String h2 = p.mo41895h();
                String i2 = p.mo41896i();
                C15488ak j = p.mo41897j();
                if (p.mo41900m() != null) {
                    view = (View) C15349d.m44669a(p.mo41900m());
                }
                C15628dl dlVar = new C15628dl(a, b, c2, d, e, f, g, h2, i2, null, j, view, p.mo41901n(), c, p.mo41902o());
                C15631do doVar = new C15631do(this.f38140e.f38268c, (C15635dr) this, this.f38140e.f38269d, p, (C15636ds) dlVar);
                dlVar.mo41480a((C15632dp) doVar);
                m42982a(dlVar);
            } else if (h != null && this.f38140e.f38285t != null) {
                String a2 = h.mo41845a();
                List b2 = h.mo41848b();
                String c3 = h.mo41850c();
                C15658en d2 = h.mo41852d() != null ? h.mo41852d() : null;
                String e2 = h.mo41853e();
                double f2 = h.mo41854f();
                String g2 = h.mo41855g();
                String h3 = h.mo41856h();
                C15488ak m = h.mo41861m();
                if (h.mo41864p() != null) {
                    view = (View) C15349d.m44669a(h.mo41864p());
                }
                C15628dl dlVar2 = new C15628dl(a2, b2, c3, d2, e2, null, f2, g2, h3, null, m, view, h.mo41865q(), c, h.mo41860l());
                C15631do doVar2 = new C15631do(this.f38140e.f38268c, (C15635dr) this, this.f38140e.f38269d, h, (C15636ds) dlVar2);
                dlVar2.mo41480a((C15632dp) doVar2);
                m42982a(dlVar2);
            } else if (h != null && this.f38140e.f38283r != null) {
                String a3 = h.mo41845a();
                List b3 = h.mo41848b();
                String c4 = h.mo41850c();
                C15658en d3 = h.mo41852d() != null ? h.mo41852d() : null;
                String e3 = h.mo41853e();
                double f3 = h.mo41854f();
                String g3 = h.mo41855g();
                String h4 = h.mo41856h();
                Bundle l = h.mo41860l();
                C15488ak m2 = h.mo41861m();
                if (h.mo41864p() != null) {
                    view = (View) C15349d.m44669a(h.mo41864p());
                }
                C15621de deVar = new C15621de(a3, b3, c4, d3, e3, f3, g3, h4, null, l, m2, view, h.mo41865q(), c);
                C15631do doVar3 = new C15631do(this.f38140e.f38268c, (C15635dr) this, this.f38140e.f38269d, h, (C15636ds) deVar);
                deVar.mo41480a((C15632dp) doVar3);
                acl.f40003a.post(new C14813br(this, deVar));
            } else if (i != null && this.f38140e.f38285t != null) {
                String a4 = i.mo41866a();
                List b4 = i.mo41869b();
                String c5 = i.mo41871c();
                C15658en d4 = i.mo41873d() != null ? i.mo41873d() : null;
                String e4 = i.mo41874e();
                String f4 = i.mo41875f();
                C15488ak l2 = i.mo41881l();
                if (i.mo41883n() != null) {
                    view = (View) C15349d.m44669a(i.mo41883n());
                }
                C15628dl dlVar3 = new C15628dl(a4, b4, c5, d4, e4, f4, -1.0d, null, null, null, l2, view, i.mo41884o(), c, i.mo41879j());
                C15948pg pgVar = i;
                C15628dl dlVar4 = dlVar3;
                C15631do doVar4 = new C15631do(this.f38140e.f38268c, (C15635dr) this, this.f38140e.f38269d, pgVar, (C15636ds) dlVar3);
                dlVar4.mo41480a((C15632dp) doVar4);
                m42982a(dlVar4);
            } else if (i != null && this.f38140e.f38284s != null) {
                String a5 = i.mo41866a();
                List b5 = i.mo41869b();
                String c6 = i.mo41871c();
                C15658en d5 = i.mo41873d() != null ? i.mo41873d() : null;
                String e5 = i.mo41874e();
                String f5 = i.mo41875f();
                Bundle j2 = i.mo41879j();
                C15488ak l3 = i.mo41881l();
                if (i.mo41883n() != null) {
                    view = (View) C15349d.m44669a(i.mo41883n());
                }
                C15623dg dgVar = new C15623dg(a5, b5, c6, d5, e5, f5, null, j2, l3, view, i.mo41884o(), c);
                C15948pg pgVar2 = i;
                C15623dg dgVar2 = dgVar;
                C15631do doVar5 = new C15631do(this.f38140e.f38268c, (C15635dr) this, this.f38140e.f38269d, pgVar2, (C15636ds) dgVar);
                dgVar2.mo41480a((C15632dp) doVar5);
                acl.f40003a.post(new C14814bs(this, dgVar2));
            } else if (n == null || this.f38140e.f38288w == null || this.f38140e.f38288w.get(n.mo41482c()) == null) {
                acd.m45783e("No matching mapper/listener for retrieved native ad template.");
                mo37583a(0, abj3.f39850K);
                return false;
            } else {
                acl.f40003a.post(new C14815bt(this, n));
            }
            return super.mo37609a(abj, abj2);
        } catch (RemoteException e6) {
            acd.m45782d("#007 Could not call remote method.", e6);
            mo37583a(0, abj3.f39850K);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37751a(C15345b bVar) {
        Object a = bVar != null ? C15349d.m44669a(bVar) : null;
        if (a instanceof C15632dp) {
            ((C15632dp) a).mo41584e();
        }
        super.mo37727b(this.f38140e.f38275j, false);
    }

    /* renamed from: a */
    private final void m42982a(C15628dl dlVar) {
        acl.f40003a.post(new C14812bq(this, dlVar));
    }

    /* renamed from: b */
    public final void mo37661b(View view) {
        afm.m45782d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: H */
    public final void mo37643H() {
        afm.m45782d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: M */
    public final void mo37648M() {
        afm.m45782d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: a */
    public final void mo37659a(C15632dp dpVar) {
        afm.m45782d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: L */
    public final void mo37647L() {
        afm.m45782d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: a */
    public final void mo37658a(C15630dn dnVar) {
        afm.m45782d("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    /* renamed from: O */
    public final boolean mo37650O() {
        if (m42979G() != null) {
            return m42979G().f44753p;
        }
        return false;
    }

    /* renamed from: P */
    public final boolean mo37651P() {
        if (m42979G() != null) {
            return m42979G().f44754q;
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean mo37652Q() {
        if (m42979G() != null) {
            return m42979G().f44755r;
        }
        return false;
    }

    /* renamed from: G */
    private final C15916ob m42979G() {
        if (this.f38140e.f38275j == null || !this.f38140e.f38275j.f39874n) {
            return null;
        }
        return this.f38140e.f38275j.f39878r;
    }

    /* renamed from: c */
    private final boolean m42984c(abj abj, abj abj2) {
        View a = C14863t.m43168a(abj2);
        if (a == null) {
            return false;
        }
        View nextView = this.f38140e.f38271f.getNextView();
        if (nextView != null) {
            if (nextView instanceof ami) {
                ((ami) nextView).destroy();
            }
            this.f38140e.f38271f.removeView(nextView);
        }
        if (!C14863t.m43180b(abj2)) {
            try {
                mo37585a(a);
            } catch (Throwable th) {
                C14793ay.m42898d().mo39089a(th, "AdLoaderManager.swapBannerViews");
                acd.m45780c("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.f38140e.f38271f.getChildCount() > 1) {
            this.f38140e.f38271f.showNext();
        }
        if (abj != null) {
            View nextView2 = this.f38140e.f38271f.getNextView();
            if (nextView2 != null) {
                this.f38140e.f38271f.removeView(nextView2);
            }
            this.f38140e.mo37701b();
        }
        this.f38140e.f38271f.setMinimumWidth(mo37619i().f45803f);
        this.f38140e.f38271f.setMinimumHeight(mo37619i().f45800c);
        this.f38140e.f38271f.requestLayout();
        this.f38140e.f38271f.setVisibility(0);
        return true;
    }

    /* renamed from: l */
    public final void mo37622l() {
        if (this.f38318l) {
            super.mo37622l();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
    }

    /* renamed from: m */
    public final void mo37623m() {
        if (this.f38318l) {
            super.mo37623m();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    /* renamed from: b */
    public final void mo37752b(List<String> list) {
        C15267r.m44393b("setNativeTemplates must be called on the main UI thread.");
        this.f38140e.f38254I = list;
    }

    /* renamed from: c */
    public final C15693fv mo37663c(String str) {
        C15267r.m44393b("getOnCustomClickListener must be called on the main UI thread.");
        return (C15693fv) this.f38140e.f38287v.get(str);
    }

    /* renamed from: a */
    public final void mo37607a(boolean z) {
        C15267r.m44393b("setManualImpressionsEnabled must be called from the main thread.");
        this.f38316j = z;
    }

    /* renamed from: a */
    public final void mo37591a(C15606cq cqVar) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    /* renamed from: E */
    public final void mo37640E() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    /* renamed from: c */
    public final void mo37753c(List<Integer> list) {
        C15267r.m44393b("setAllowedAdTypes must be called on the main UI thread.");
        this.f38140e.f38248C = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo37631u() {
        super.mo37631u();
        abj abj = this.f38140e.f38275j;
        if (!(abj == null || abj.f39875o == null || !abj.f39875o.mo41778a() || this.f38140e.f38247B == null)) {
            try {
                this.f38140e.f38247B.mo41640a(this, C15349d.m44668a(this.f38140e.f38268c));
                super.mo37727b(this.f38140e.f38275j, false);
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: R */
    public final void mo37653R() {
        if (this.f38140e.f38275j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f38140e.f38275j.f39877q) || !m42980I()) {
            super.mo37653R();
            if (m42980I()) {
                mo37633w();
            }
            return;
        }
        mo37633w();
    }

    /* renamed from: S */
    public final void mo37654S() {
        if (this.f38140e.f38275j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.f38140e.f38275j.f39877q) || !m42980I()) {
            super.mo37654S();
        } else {
            mo37632v();
        }
    }

    /* renamed from: I */
    private final boolean m42980I() {
        return (this.f38140e.f38275j == null || this.f38140e.f38275j.f39875o == null || !this.f38140e.f38275j.f39875o.mo41779b()) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final /* synthetic */ void mo37750F() {
        mo37611b(this.f38317k);
    }
}
