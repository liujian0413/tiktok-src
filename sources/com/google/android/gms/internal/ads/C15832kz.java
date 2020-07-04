package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.internal.C14816bu;
import com.google.android.gms.ads.internal.C14832n;
import com.google.android.gms.dynamic.C15345b;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.kz */
public final class C15832kz extends C15725h {

    /* renamed from: a */
    private final String f44579a;

    /* renamed from: b */
    private boolean f44580b;

    /* renamed from: c */
    private final C15795jp f44581c;

    /* renamed from: d */
    private C14832n f44582d;

    /* renamed from: e */
    private final C15824kr f44583e;

    private C15832kz(String str, C15795jp jpVar) {
        this.f44579a = str;
        this.f44581c = jpVar;
        this.f44583e = new C15824kr();
        C14793ay.m42906l().mo41698a(jpVar);
    }

    /* renamed from: a */
    public final void mo37603a(String str) {
    }

    /* renamed from: b */
    public final void mo37612b(String str) {
    }

    public C15832kz(Context context, String str, C15931oq oqVar, zzbgz zzbgz, C14816bu buVar) {
        this(str, new C15795jp(context, oqVar, zzbgz, buVar));
    }

    /* renamed from: h */
    public final C15345b mo37618h() throws RemoteException {
        if (this.f44582d != null) {
            return this.f44582d.mo37618h();
        }
        return null;
    }

    /* renamed from: g */
    public final void mo37617g() throws RemoteException {
        if (this.f44582d != null) {
            this.f44582d.mo37617g();
        }
    }

    /* renamed from: j */
    public final boolean mo37620j() throws RemoteException {
        return this.f44582d != null && this.f44582d.mo37620j();
    }

    /* renamed from: b */
    public final boolean mo37614b(zzyv zzyv) throws RemoteException {
        if (!C15827ku.m51184a(zzyv).contains("gw")) {
            m51215c();
        }
        if (C15827ku.m51184a(zzyv).contains("_skipMediation")) {
            m51215c();
        }
        if (zzyv.f45786j != null) {
            m51215c();
        }
        if (this.f44582d != null) {
            return this.f44582d.mo37614b(zzyv);
        }
        C15827ku l = C14793ay.m42906l();
        if (C15827ku.m51184a(zzyv).contains("_ad")) {
            l.mo41699b(zzyv, this.f44579a);
        }
        C15830kx a = l.mo41696a(zzyv, this.f44579a);
        if (a != null) {
            if (!a.f44570e) {
                a.mo41710a();
                C15831ky.m51208a().mo41715e();
            } else {
                C15831ky.m51208a().mo41714d();
            }
            this.f44582d = a.f44566a;
            a.f44568c.mo41680a(this.f44583e);
            this.f44583e.mo41694a(this.f44582d);
            return a.f44571f;
        }
        m51215c();
        C15831ky.m51208a().mo41715e();
        return this.f44582d.mo37614b(zzyv);
    }

    /* renamed from: l */
    public final void mo37622l() throws RemoteException {
        if (this.f44582d != null) {
            this.f44582d.mo37622l();
        }
    }

    /* renamed from: m */
    public final void mo37623m() throws RemoteException {
        if (this.f44582d != null) {
            this.f44582d.mo37623m();
        }
    }

    /* renamed from: a */
    public final void mo37589a(bys bys) throws RemoteException {
        this.f44583e.f44549a = bys;
        if (this.f44582d != null) {
            this.f44583e.mo41694a(this.f44582d);
        }
    }

    /* renamed from: a */
    public final void mo37598a(C16194yk ykVar) {
        this.f44583e.f44554f = ykVar;
        if (this.f44582d != null) {
            this.f44583e.mo41694a(this.f44582d);
        }
    }

    /* renamed from: a */
    public final void mo37593a(C15914o oVar) throws RemoteException {
        this.f44583e.f44551c = oVar;
        if (this.f44582d != null) {
            this.f44583e.mo41694a(this.f44582d);
        }
    }

    /* renamed from: a */
    public final void mo37592a(C15833l lVar) throws RemoteException {
        this.f44583e.f44550b = lVar;
        if (this.f44582d != null) {
            this.f44583e.mo41694a(this.f44582d);
        }
    }

    /* renamed from: n */
    public final Bundle mo37624n() throws RemoteException {
        if (this.f44582d != null) {
            return this.f44582d.mo37624n();
        }
        return new Bundle();
    }

    /* renamed from: E */
    public final void mo37640E() throws RemoteException {
        if (this.f44582d != null) {
            this.f44582d.mo37613b(this.f44580b);
            this.f44582d.mo37640E();
            return;
        }
        acd.m45783e("Interstitial ad must be loaded before showInterstitial().");
    }

    /* renamed from: o */
    public final void mo37625o() throws RemoteException {
        if (this.f44582d != null) {
            this.f44582d.mo37625o();
        }
    }

    /* renamed from: k */
    public final void mo37621k() throws RemoteException {
        if (this.f44582d != null) {
            this.f44582d.mo37621k();
        } else {
            acd.m45783e("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    /* renamed from: i */
    public final zzyz mo37619i() throws RemoteException {
        if (this.f44582d != null) {
            return this.f44582d.mo37619i();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo37602a(zzyz zzyz) throws RemoteException {
        if (this.f44582d != null) {
            this.f44582d.mo37602a(zzyz);
        }
    }

    /* renamed from: a */
    public final void mo37594a(C16027se seVar) throws RemoteException {
        acd.m45783e("setInAppPurchaseListener is deprecated and should not be called.");
    }

    /* renamed from: a */
    public final void mo37595a(C16033sk skVar, String str) throws RemoteException {
        acd.m45783e("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    /* renamed from: a */
    public final String mo37684a() throws RemoteException {
        if (this.f44582d != null) {
            return this.f44582d.mo37684a();
        }
        return null;
    }

    /* renamed from: y_ */
    public final String mo37689y_() throws RemoteException {
        if (this.f44582d != null) {
            return this.f44582d.mo37689y_();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo37591a(C15606cq cqVar) throws RemoteException {
        this.f44583e.f44552d = cqVar;
        if (this.f44582d != null) {
            this.f44583e.mo41694a(this.f44582d);
        }
    }

    /* renamed from: a */
    public final void mo37588a(byp byp) throws RemoteException {
        this.f44583e.f44553e = byp;
        if (this.f44582d != null) {
            this.f44583e.mo41694a(this.f44582d);
        }
    }

    /* renamed from: a */
    public final void mo37596a(C16076u uVar) throws RemoteException {
        m51215c();
        if (this.f44582d != null) {
            this.f44582d.mo37596a(uVar);
        }
    }

    /* renamed from: a */
    public final void mo37607a(boolean z) throws RemoteException {
        m51215c();
        if (this.f44582d != null) {
            this.f44582d.mo37607a(z);
        }
    }

    /* renamed from: p */
    public final boolean mo37626p() throws RemoteException {
        return this.f44582d != null && this.f44582d.mo37626p();
    }

    /* renamed from: q */
    public final C15488ak mo37627q() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    /* renamed from: A */
    public final String mo37576A() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    /* renamed from: B */
    public final C15914o mo37577B() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    /* renamed from: C */
    public final bys mo37578C() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* renamed from: a */
    public final void mo37600a(zzacq zzacq) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    /* renamed from: a */
    public final void mo37599a(zzabp zzabp) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: b */
    public final void mo37613b(boolean z) {
        this.f44580b = z;
    }

    /* renamed from: c */
    private final void m51215c() {
        if (this.f44582d == null) {
            this.f44582d = this.f44581c.mo41677a(this.f44579a);
            this.f44583e.mo41694a(this.f44582d);
        }
    }
}
