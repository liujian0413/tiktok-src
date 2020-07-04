package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.concurrent.Future;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.yt */
public final class C16203yt extends abz implements C16209yz, C16213zc, C16217zg {

    /* renamed from: a */
    public final String f45433a;

    /* renamed from: b */
    public final C15915oa f45434b;

    /* renamed from: c */
    public volatile C15721gw f45435c;

    /* renamed from: d */
    private final abk f45436d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f45437e;

    /* renamed from: f */
    private final C16218zh f45438f;

    /* renamed from: g */
    private final C16213zc f45439g;

    /* renamed from: h */
    private final Object f45440h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final String f45441i;

    /* renamed from: j */
    private final long f45442j;

    /* renamed from: k */
    private int f45443k;

    /* renamed from: l */
    private int f45444l = 3;

    /* renamed from: m */
    private C16206yw f45445m;

    /* renamed from: n */
    private Future f45446n;

    public C16203yt(Context context, String str, String str2, C15915oa oaVar, abk abk, C16218zh zhVar, C16213zc zcVar, long j) {
        this.f45437e = context;
        this.f45433a = str;
        this.f45441i = str2;
        this.f45434b = oaVar;
        this.f45436d = abk;
        this.f45438f = zhVar;
        this.f45440h = new Object();
        this.f45439g = zcVar;
        this.f45442j = j;
    }

    /* renamed from: u_ */
    public final void mo37836u_() {
    }

    /* renamed from: a */
    public final void mo37835a() {
        int i;
        if (this.f45438f != null && this.f45438f.f45479b != null && this.f45438f.f45478a != null) {
            C16212zb zbVar = this.f45438f.f45479b;
            zbVar.f45463b = null;
            zbVar.f45462a = this;
            zbVar.f45464c = this;
            zzyv zzyv = this.f45436d.f39887a.f45573c;
            C15935ou ouVar = this.f45438f.f45478a;
            try {
                if (ouVar.mo41835g()) {
                    afb.f40136a.post(new C16204yu(this, zzyv, ouVar));
                } else {
                    afb.f40136a.post(new C16205yv(this, ouVar, zzyv, zbVar));
                }
            } catch (RemoteException e) {
                acd.m45780c("Fail to check if adapter is initialized.", e);
                mo42117a(this.f45433a, 0);
            }
            long b = C14793ay.m42901g().mo38685b();
            while (true) {
                synchronized (this.f45440h) {
                    if (this.f45443k != 0) {
                        C16208yy a = new C16208yy().mo42125a(C14793ay.m42901g().mo38685b() - b);
                        if (1 == this.f45443k) {
                            i = 6;
                        } else {
                            i = this.f45444l;
                        }
                        this.f45445m = a.mo42124a(i).mo42126a(this.f45433a).mo42127b(this.f45434b.f44718d).mo42123a();
                    } else if (!m52529a(b)) {
                        this.f45445m = new C16208yy().mo42124a(this.f45444l).mo42125a(C14793ay.m42901g().mo38685b() - b).mo42126a(this.f45433a).mo42127b(this.f45434b.f44718d).mo42123a();
                    }
                }
            }
            zbVar.f45463b = null;
            zbVar.f45462a = null;
            if (this.f45443k == 1) {
                this.f45439g.mo42116a(this.f45433a);
            } else {
                this.f45439g.mo42117a(this.f45433a, this.f45444l);
            }
        }
    }

    /* renamed from: d */
    public final Future mo42118d() {
        if (this.f45446n != null) {
            return this.f45446n;
        }
        agj agj = (agj) mo39128c();
        this.f45446n = agj;
        return agj;
    }

    /* renamed from: e */
    public final C16206yw mo42119e() {
        C16206yw ywVar;
        synchronized (this.f45440h) {
            ywVar = this.f45445m;
        }
        return ywVar;
    }

    /* renamed from: a */
    private final boolean m52529a(long j) {
        long b = this.f45442j - (C14793ay.m42901g().mo38685b() - j);
        if (b <= 0) {
            this.f45444l = 4;
            return false;
        }
        try {
            this.f45440h.wait(b);
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f45444l = 5;
            return false;
        }
    }

    /* renamed from: a */
    public final void mo42116a(String str) {
        synchronized (this.f45440h) {
            this.f45443k = 1;
            this.f45440h.notify();
        }
    }

    /* renamed from: a */
    public final void mo42117a(String str, int i) {
        synchronized (this.f45440h) {
            this.f45443k = 2;
            this.f45444l = i;
            this.f45440h.notify();
        }
    }

    /* renamed from: f */
    public final void mo42120f() {
        m52528a(this.f45436d.f39887a.f45573c, this.f45438f.f45478a);
    }

    /* renamed from: a */
    public final void mo42114a(int i) {
        mo42117a(this.f45433a, 0);
    }

    /* renamed from: a */
    public final void mo42115a(Bundle bundle) {
        C15721gw gwVar = this.f45435c;
        if (gwVar != null) {
            gwVar.mo37604a("", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m52528a(zzyv zzyv, C15935ou ouVar) {
        this.f45438f.f45479b.f45463b = this;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f45433a)) {
                ouVar.mo41826a(zzyv, this.f45441i, this.f45434b.f44715a);
            } else {
                ouVar.mo41825a(zzyv, this.f45441i);
            }
        } catch (RemoteException e) {
            acd.m45780c("Fail to load ad from adapter.", e);
            mo42117a(this.f45433a, 0);
        }
    }
}
