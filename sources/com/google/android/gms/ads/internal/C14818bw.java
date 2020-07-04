package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.p022v4.util.ArrayMap;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;
import com.google.android.gms.ads.C14745e;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C15488ak;
import com.google.android.gms.internal.ads.C15931oq;
import com.google.android.gms.internal.ads.C15945pd;
import com.google.android.gms.internal.ads.C15948pg;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.aag;
import com.google.android.gms.internal.ads.aak;
import com.google.android.gms.internal.ads.abj;
import com.google.android.gms.internal.ads.abk;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.ami;
import com.google.android.gms.internal.ads.ant;
import com.google.android.gms.internal.ads.anv;
import com.google.android.gms.internal.ads.bub;
import com.google.android.gms.internal.ads.buf;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzyz;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.bw */
public final class C14818bw extends C14802bg implements OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: j */
    private boolean f38336j;

    /* renamed from: k */
    private boolean f38337k;

    /* renamed from: l */
    private WeakReference<Object> f38338l = new WeakReference<>(null);

    public C14818bw(Context context, zzyz zzyz, String str, C15931oq oqVar, zzbgz zzbgz, C14816bu buVar) {
        super(context, zzyz, str, oqVar, zzbgz, buVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ami mo37737a(abk abk, C14817bv bvVar, aag aag) throws zzbnv {
        zzyz zzyz;
        C14745e eVar;
        if (this.f38140e.f38274i.f45804g == null && this.f38140e.f38274i.f45806i) {
            C14794az azVar = this.f38140e;
            if (abk.f39888b.f45648y) {
                zzyz = this.f38140e.f38274i;
            } else {
                String str = abk.f39888b.f45635l;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    eVar = new C14745e(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    eVar = this.f38140e.f38274i.mo42401b();
                }
                zzyz = new zzyz(this.f38140e.f38268c, eVar);
            }
            azVar.f38274i = zzyz;
        }
        return super.mo37737a(abk, bvVar, aag);
    }

    /* renamed from: b */
    public final boolean mo37614b(zzyv zzyv) {
        zzyv zzyv2 = zzyv;
        this.f38337k = false;
        this.f38143h = null;
        if (zzyv2.f45784h != this.f38336j) {
            zzyv zzyv3 = new zzyv(zzyv2.f45777a, zzyv2.f45778b, zzyv2.f45779c, zzyv2.f45780d, zzyv2.f45781e, zzyv2.f45782f, zzyv2.f45783g, zzyv2.f45784h || this.f38336j, zzyv2.f45785i, zzyv2.f45786j, zzyv2.f45787k, zzyv2.f45788l, zzyv2.f45789m, zzyv2.f45790n, zzyv2.f45791o, zzyv2.f45792p, zzyv2.f45793q, zzyv2.f45794r, null, zzyv2.f45796t, zzyv2.f45797u);
            zzyv2 = zzyv3;
        }
        return super.mo37614b(zzyv2);
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.bt.a(com.google.android.gms.internal.ads.bl):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.bym.m50299d().mo41272a((com.google.android.gms.internal.ads.C15573bl) com.google.android.gms.internal.ads.C15585bw.f43817bK)).booleanValue() != false) goto L_0x006f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo37609a(com.google.android.gms.internal.ads.abj r5, com.google.android.gms.internal.ads.abj r6) {
        /*
            r4 = this;
            boolean r0 = super.mo37609a(r5, r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            com.google.android.gms.ads.internal.az r0 = r4.f38140e
            boolean r0 = r0.mo37702c()
            if (r0 == 0) goto L_0x001c
            boolean r5 = r4.m43017b(r5, r6)
            if (r5 != 0) goto L_0x001c
            com.google.android.gms.internal.ads.bwl r5 = r6.f39850K
            r4.mo37583a(r1, r5)
            return r1
        L_0x001c:
            r4.mo37727b(r6, r1)
            boolean r5 = r6.f39872l
            r0 = 0
            if (r5 == 0) goto L_0x0055
            r4.mo37763d(r6)
            com.google.android.gms.ads.internal.az r5 = r4.f38140e
            com.google.android.gms.ads.internal.ba r5 = r5.f38271f
            com.google.android.gms.internal.ads.ahd.m45860a(r5, r4)
            com.google.android.gms.ads.internal.az r5 = r4.f38140e
            com.google.android.gms.ads.internal.ba r5 = r5.f38271f
            com.google.android.gms.internal.ads.ahd.m45861a(r5, r4)
            boolean r5 = r6.f39873m
            if (r5 != 0) goto L_0x0072
            com.google.android.gms.ads.internal.bx r5 = new com.google.android.gms.ads.internal.bx
            r5.<init>(r4)
            com.google.android.gms.internal.ads.ami r1 = r6.f39862b
            if (r1 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.ami r1 = r6.f39862b
            com.google.android.gms.internal.ads.anp r1 = r1.mo39761w()
            goto L_0x004a
        L_0x0049:
            r1 = r0
        L_0x004a:
            if (r1 == 0) goto L_0x0072
            com.google.android.gms.ads.internal.by r2 = new com.google.android.gms.ads.internal.by
            r2.<init>(r6, r5)
            r1.mo39774a(r2)
            goto L_0x0072
        L_0x0055:
            com.google.android.gms.ads.internal.az r5 = r4.f38140e
            boolean r5 = r5.mo37703d()
            if (r5 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.C15585bw.f43817bK
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r5 = r2.mo41272a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0072
        L_0x006f:
            r4.mo37723a(r6, r1)
        L_0x0072:
            com.google.android.gms.internal.ads.ami r5 = r6.f39862b
            if (r5 == 0) goto L_0x0096
            com.google.android.gms.internal.ads.ami r5 = r6.f39862b
            com.google.android.gms.internal.ads.amy r5 = r5.mo39464b()
            com.google.android.gms.internal.ads.ami r1 = r6.f39862b
            com.google.android.gms.internal.ads.anp r1 = r1.mo39761w()
            if (r1 == 0) goto L_0x0087
            r1.mo39787g()
        L_0x0087:
            com.google.android.gms.ads.internal.az r1 = r4.f38140e
            com.google.android.gms.internal.ads.zzacq r1 = r1.f38290y
            if (r1 == 0) goto L_0x0096
            if (r5 == 0) goto L_0x0096
            com.google.android.gms.ads.internal.az r1 = r4.f38140e
            com.google.android.gms.internal.ads.zzacq r1 = r1.f38290y
            r5.mo39831a(r1)
        L_0x0096:
            com.google.android.gms.ads.internal.az r5 = r4.f38140e
            boolean r5 = r5.mo37702c()
            if (r5 == 0) goto L_0x0136
            com.google.android.gms.internal.ads.ami r5 = r6.f39862b
            if (r5 == 0) goto L_0x0151
            org.json.JSONObject r5 = r6.f39871k
            if (r5 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.bte r5 = r4.f38142g
            com.google.android.gms.ads.internal.az r0 = r4.f38140e
            com.google.android.gms.internal.ads.zzyz r0 = r0.f38274i
            r5.mo41281a(r0, r6)
        L_0x00af:
            com.google.android.gms.internal.ads.ami r5 = r6.f39862b
            android.view.View r0 = r5.getView()
            com.google.android.gms.internal.ads.bub r5 = new com.google.android.gms.internal.ads.bub
            com.google.android.gms.ads.internal.az r1 = r4.f38140e
            android.content.Context r1 = r1.f38268c
            r5.<init>(r1, r0)
            com.google.android.gms.internal.ads.aal r1 = com.google.android.gms.ads.internal.C14793ay.m42913s()
            com.google.android.gms.ads.internal.az r2 = r4.f38140e
            android.content.Context r2 = r2.f38268c
            boolean r1 = r1.mo39043a(r2)
            if (r1 == 0) goto L_0x00ee
            com.google.android.gms.internal.ads.zzyv r1 = r6.f39861a
            boolean r1 = m42719a(r1)
            if (r1 == 0) goto L_0x00ee
            com.google.android.gms.ads.internal.az r1 = r4.f38140e
            java.lang.String r1 = r1.f38267b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00ee
            com.google.android.gms.internal.ads.aak r1 = new com.google.android.gms.internal.ads.aak
            com.google.android.gms.ads.internal.az r2 = r4.f38140e
            android.content.Context r2 = r2.f38268c
            com.google.android.gms.ads.internal.az r3 = r4.f38140e
            java.lang.String r3 = r3.f38267b
            r1.<init>(r2, r3)
            r5.mo41319a(r1)
        L_0x00ee:
            boolean r1 = r6.mo39073a()
            if (r1 == 0) goto L_0x00fa
            com.google.android.gms.internal.ads.ami r1 = r6.f39862b
            r5.mo41319a(r1)
            goto L_0x0108
        L_0x00fa:
            com.google.android.gms.internal.ads.ami r1 = r6.f39862b
            com.google.android.gms.internal.ads.anp r1 = r1.mo39761w()
            com.google.android.gms.ads.internal.b r2 = new com.google.android.gms.ads.internal.b
            r2.<init>(r5, r6)
            r1.mo39773a(r2)
        L_0x0108:
            boolean r1 = r6.f39856Q
            if (r1 == 0) goto L_0x0132
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C15585bw.f43841bi
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r1 = r2.mo41272a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0132
            com.google.android.gms.internal.ads.bl<java.lang.Long> r1 = com.google.android.gms.internal.ads.C15585bw.f43840bh
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r1 = r2.mo41272a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r5.mo41318a(r1)
            goto L_0x0151
        L_0x0132:
            r5.mo41320b()
            goto L_0x0151
        L_0x0136:
            com.google.android.gms.ads.internal.az r5 = r4.f38140e
            android.view.View r5 = r5.f38256K
            if (r5 == 0) goto L_0x0151
            org.json.JSONObject r5 = r6.f39871k
            if (r5 == 0) goto L_0x0151
            com.google.android.gms.internal.ads.bte r5 = r4.f38142g
            com.google.android.gms.ads.internal.az r0 = r4.f38140e
            com.google.android.gms.internal.ads.zzyz r0 = r0.f38274i
            com.google.android.gms.ads.internal.az r1 = r4.f38140e
            android.view.View r1 = r1.f38256K
            r5.mo41282a(r0, r6, r1)
            com.google.android.gms.ads.internal.az r5 = r4.f38140e
            android.view.View r0 = r5.f38256K
        L_0x0151:
            boolean r5 = r6.f39874n
            if (r5 != 0) goto L_0x015a
            com.google.android.gms.ads.internal.az r5 = r4.f38140e
            r5.mo37699a(r0)
        L_0x015a:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C14818bw.mo37609a(com.google.android.gms.internal.ads.abj, com.google.android.gms.internal.ads.abj):boolean");
    }

    /* renamed from: b */
    private final boolean m43017b(abj abj, abj abj2) {
        if (abj2.f39874n) {
            View a = C14863t.m43168a(abj2);
            if (a == null) {
                acd.m45783e("Could not get mediation view");
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
                    if (C14793ay.m42913s().mo39043a(this.f38140e.f38268c)) {
                        new bub(this.f38140e.f38268c, a).mo41319a((buf) new aak(this.f38140e.f38268c, this.f38140e.f38267b));
                    }
                    if (abj2.f39881u != null) {
                        this.f38140e.f38271f.setMinimumWidth(abj2.f39881u.f45803f);
                        this.f38140e.f38271f.setMinimumHeight(abj2.f39881u.f45800c);
                    }
                    mo37585a(a);
                } catch (Exception e) {
                    C14793ay.m42898d().mo39089a((Throwable) e, "BannerAdManager.swapViews");
                    acd.m45780c("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (!(abj2.f39881u == null || abj2.f39862b == null)) {
            abj2.f39862b.mo39717a(anv.m46664a(abj2.f39881u));
            this.f38140e.f38271f.removeAllViews();
            this.f38140e.f38271f.setMinimumWidth(abj2.f39881u.f45803f);
            this.f38140e.f38271f.setMinimumHeight(abj2.f39881u.f45800c);
            mo37585a(abj2.f39862b.getView());
        }
        if (this.f38140e.f38271f.getChildCount() > 1) {
            this.f38140e.f38271f.showNext();
        }
        if (abj != null) {
            View nextView2 = this.f38140e.f38271f.getNextView();
            if (nextView2 instanceof ami) {
                ((ami) nextView2).destroy();
            } else if (nextView2 != null) {
                this.f38140e.f38271f.removeView(nextView2);
            }
            this.f38140e.mo37701b();
        }
        this.f38140e.f38271f.setVisibility(0);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo37631u() {
        ami ami = this.f38140e.f38275j != null ? this.f38140e.f38275j.f39862b : null;
        if (!this.f38337k && ami != null) {
            m43018c(ami);
        }
        super.mo37631u();
    }

    /* renamed from: c */
    private final void m43018c(ami ami) {
        if (mo37735J()) {
            WebView webView = ami.getWebView();
            if (webView != null) {
                View view = ami.getView();
                if (view != null && C14793ay.m42909o().mo41959a(this.f38140e.f38268c)) {
                    int i = this.f38140e.f38270e.f45678b;
                    int i2 = this.f38140e.f38270e.f45679c;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb.append(i2);
                    this.f38143h = C14793ay.m42909o().mo41955a(sb.toString(), webView, "", "javascript", mo37579D());
                    if (this.f38143h != null) {
                        C14793ay.m42909o().mo41958a(this.f38143h, view);
                        ami.mo39716a(this.f38143h);
                        C14793ay.m42909o().mo41957a(this.f38143h);
                        this.f38337k = true;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final boolean mo37717U() {
        boolean z;
        if (!acl.m45535a(this.f38140e.f38268c, "android.permission.INTERNET")) {
            bym.m50296a().mo39275a(this.f38140e.f38271f, this.f38140e.f38274i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        } else {
            z = true;
        }
        if (!acl.m45534a(this.f38140e.f38268c)) {
            bym.m50296a().mo39275a(this.f38140e.f38271f, this.f38140e.f38274i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && this.f38140e.f38271f != null) {
            this.f38140e.f38271f.setVisibility(0);
        }
        return z;
    }

    /* renamed from: a */
    public final void mo37607a(boolean z) {
        C15267r.m44393b("setManualImpressionsEnabled must be called from the main thread.");
        this.f38336j = z;
    }

    /* renamed from: E */
    public final void mo37640E() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    public final void onGlobalLayout() {
        mo37763d(this.f38140e.f38275j);
    }

    public final void onScrollChanged() {
        mo37763d(this.f38140e.f38275j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo37723a(abj abj, boolean z) {
        acl.f40003a.post(new C14821c(this, abj));
        super.mo37723a(abj, z);
        if (C14863t.m43180b(abj)) {
            C14822d dVar = new C14822d(this);
            if (abj != null && C14863t.m43180b(abj)) {
                ami ami = abj.f39862b;
                Object view = ami != null ? ami.getView() : null;
                if (view == null) {
                    acd.m45783e("AdWebView is null");
                    return;
                }
                try {
                    List list = abj.f39875o != null ? abj.f39875o.f44734t : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            C15945pd h = abj.f39876p != null ? abj.f39876p.mo41836h() : null;
                            C15948pg i = abj.f39876p != null ? abj.f39876p.mo41837i() : null;
                            if (list.contains("2") && h != null) {
                                h.mo41849b(C15349d.m44668a(view));
                                if (!h.mo41858j()) {
                                    h.mo41857i();
                                }
                                ami.mo39721a("/nativeExpressViewClicked", C14863t.m43170a(h, (C15948pg) null, dVar));
                                return;
                            } else if (!list.contains("1") || i == null) {
                                acd.m45783e("No matching template id and mapper");
                                return;
                            } else {
                                i.mo41870b(C15349d.m44668a(view));
                                if (!i.mo41877h()) {
                                    i.mo41876g();
                                }
                                ami.mo39721a("/nativeExpressViewClicked", C14863t.m43170a((C15945pd) null, i, dVar));
                                return;
                            }
                        }
                    }
                    acd.m45783e("No template ids present in mediation response");
                } catch (RemoteException e) {
                    acd.m45780c("Error occurred while recording impression and registering for clicks", e);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo37763d(abj abj) {
        if (abj != null && !abj.f39873m && this.f38140e.f38271f != null && C14793ay.m42895a().mo39175a((View) this.f38140e.f38271f, this.f38140e.f38268c) && this.f38140e.f38271f.getGlobalVisibleRect(new Rect(), null)) {
            if (!(abj == null || abj.f39862b == null || abj.f39862b.mo39761w() == null)) {
                abj.f39862b.mo39761w().mo39774a((ant) null);
            }
            mo37723a(abj, false);
            abj.f39873m = true;
        }
    }

    /* renamed from: q */
    public final C15488ak mo37627q() {
        C15267r.m44393b("getVideoController must be called from the main thread.");
        if (this.f38140e.f38275j == null || this.f38140e.f38275j.f39862b == null) {
            return null;
        }
        return this.f38140e.f38275j.f39862b.mo39464b();
    }

    /* renamed from: I */
    public final void mo37762I() {
        this.f38139d.mo37678d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo37764e(abj abj) {
        if (mo37735J()) {
            ami ami = abj != null ? abj.f39862b : null;
            if (ami != null) {
                if (!this.f38337k) {
                    m43018c(ami);
                }
                if (this.f38143h != null) {
                    ami.mo39809a("onSdkImpression", (Map) new ArrayMap());
                }
            }
        }
    }
}
