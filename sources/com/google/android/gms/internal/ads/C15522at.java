package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C14732b;
import com.google.android.gms.ads.C14745e;
import com.google.android.gms.ads.C14766h;
import com.google.android.gms.ads.C14871k;
import com.google.android.gms.ads.C14873l;
import com.google.android.gms.ads.p741a.C14725a;
import com.google.android.gms.ads.p741a.C14726b;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.concurrent.atomic.AtomicBoolean;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.at */
public final class C15522at {

    /* renamed from: a */
    public final C14871k f41002a;

    /* renamed from: b */
    public C14732b f41003b;

    /* renamed from: c */
    public C14745e[] f41004c;

    /* renamed from: d */
    public C14725a f41005d;

    /* renamed from: e */
    public C14726b f41006e;

    /* renamed from: f */
    public C14873l f41007f;

    /* renamed from: g */
    private final C15930op f41008g;

    /* renamed from: h */
    private final bya f41009h;

    /* renamed from: i */
    private final AtomicBoolean f41010i;

    /* renamed from: j */
    private final byo f41011j;

    /* renamed from: k */
    private bxr f41012k;

    /* renamed from: l */
    private C14766h f41013l;

    /* renamed from: m */
    private C15698g f41014m;

    /* renamed from: n */
    private String f41015n;

    /* renamed from: o */
    private ViewGroup f41016o;

    /* renamed from: p */
    private int f41017p;

    /* renamed from: q */
    private boolean f41018q;

    /* renamed from: a */
    private static boolean m47165a(int i) {
        return i == 1;
    }

    public C15522at(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, bya.f44160a, i);
    }

    private C15522at(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, bya bya, C15698g gVar, int i) {
        this.f41008g = new C15930op();
        this.f41002a = new C14871k();
        this.f41011j = new C15537au(this);
        this.f41016o = viewGroup;
        this.f41009h = bya;
        this.f41014m = null;
        this.f41010i = new AtomicBoolean(false);
        this.f41017p = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzzc zzzc = new zzzc(context, attributeSet);
                this.f41004c = zzzc.mo42402a(z);
                this.f41015n = zzzc.f45808a;
                if (viewGroup.isInEditMode()) {
                    afb a = bym.m50296a();
                    C14745e eVar = this.f41004c[0];
                    int i2 = this.f41017p;
                    zzyz zzyz = new zzyz(context, eVar);
                    zzyz.f45807j = m47165a(i2);
                    a.mo39274a(viewGroup, zzyz, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                bym.m50296a().mo39275a(viewGroup, new zzyz(context, C14745e.f38096a), e.getMessage(), e.getMessage());
            }
        }
    }

    private C15522at(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, bya bya, int i) {
        this(viewGroup, null, false, bya, null, i);
    }

    /* renamed from: a */
    public final void mo39999a() {
        try {
            if (this.f41014m != null) {
                this.f41014m.mo37617g();
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final C14745e mo40010b() {
        try {
            if (this.f41014m != null) {
                zzyz i = this.f41014m.mo37619i();
                if (i != null) {
                    return i.mo42401b();
                }
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
        if (this.f41004c != null) {
            return this.f41004c[0];
        }
        return null;
    }

    /* renamed from: c */
    public final String mo40012c() {
        if (this.f41015n == null && this.f41014m != null) {
            try {
                this.f41015n = this.f41014m.mo37576A();
            } catch (RemoteException e) {
                afm.m45782d("#007 Could not call remote method.", e);
            }
        }
        return this.f41015n;
    }

    /* renamed from: a */
    public final void mo40005a(C15499ar arVar) {
        C15698g gVar;
        try {
            if (this.f41014m == null) {
                if ((this.f41004c == null || this.f41015n == null) && this.f41014m == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f41016o.getContext();
                zzyz a = m47164a(context, this.f41004c, this.f41017p);
                if ("search_v2".equals(a.f45798a)) {
                    gVar = (C15698g) new byh(bym.m50297b(), context, a, this.f41015n).mo41442a(context, false);
                } else {
                    byf byf = new byf(bym.m50297b(), context, a, this.f41015n, this.f41008g);
                    gVar = (C15698g) byf.mo41442a(context, false);
                }
                this.f41014m = gVar;
                this.f41014m.mo37589a((bys) new bxu(this.f41011j));
                if (this.f41012k != null) {
                    this.f41014m.mo37588a((byp) new bxs(this.f41012k));
                }
                if (this.f41005d != null) {
                    this.f41014m.mo37593a((C15914o) new byd(this.f41005d));
                }
                if (this.f41006e != null) {
                    this.f41014m.mo37591a((C15606cq) new C15609ct(this.f41006e));
                }
                if (this.f41013l != null) {
                    this.f41014m.mo37596a((C16076u) this.f41013l.f38134a);
                }
                if (this.f41007f != null) {
                    this.f41014m.mo37600a(new zzacq(this.f41007f));
                }
                this.f41014m.mo37607a(this.f41018q);
                try {
                    C15345b h = this.f41014m.mo37618h();
                    if (h != null) {
                        this.f41016o.addView((View) C15349d.m44669a(h));
                    }
                } catch (RemoteException e) {
                    afm.m45782d("#007 Could not call remote method.", e);
                }
            }
            if (this.f41014m.mo37614b(bya.m50259a(this.f41016o.getContext(), arVar))) {
                this.f41008g.f44828a = arVar.f40937h;
            }
        } catch (RemoteException e2) {
            afm.m45782d("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: d */
    public final void mo40013d() {
        try {
            if (this.f41014m != null) {
                this.f41014m.mo37622l();
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo40014e() {
        try {
            if (this.f41014m != null) {
                this.f41014m.mo37623m();
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo40002a(C14732b bVar) {
        this.f41003b = bVar;
        this.f41011j.mo41444a(bVar);
    }

    /* renamed from: a */
    public final void mo40006a(bxr bxr) {
        try {
            this.f41012k = bxr;
            if (this.f41014m != null) {
                this.f41014m.mo37588a((byp) bxr != null ? new bxs(bxr) : null);
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo40009a(C14745e... eVarArr) {
        if (this.f41004c == null) {
            mo40011b(eVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    /* renamed from: b */
    public final void mo40011b(C14745e... eVarArr) {
        this.f41004c = eVarArr;
        try {
            if (this.f41014m != null) {
                this.f41014m.mo37602a(m47164a(this.f41016o.getContext(), this.f41004c, this.f41017p));
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
        this.f41016o.requestLayout();
    }

    /* renamed from: a */
    public final void mo40007a(String str) {
        if (this.f41015n == null) {
            this.f41015n = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    /* renamed from: a */
    public final void mo40000a(C14725a aVar) {
        try {
            this.f41005d = aVar;
            if (this.f41014m != null) {
                this.f41014m.mo37593a((C15914o) aVar != null ? new byd(aVar) : null);
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo40001a(C14726b bVar) {
        this.f41006e = bVar;
        try {
            if (this.f41014m != null) {
                this.f41014m.mo37591a((C15606cq) bVar != null ? new C15609ct(bVar) : null);
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo40008a(boolean z) {
        this.f41018q = z;
        try {
            if (this.f41014m != null) {
                this.f41014m.mo37607a(this.f41018q);
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo40003a(C14766h hVar) {
        this.f41013l = hVar;
        try {
            if (this.f41014m != null) {
                this.f41014m.mo37596a((C16076u) this.f41013l == null ? null : this.f41013l.f38134a);
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final String mo40015f() {
        try {
            if (this.f41014m != null) {
                return this.f41014m.mo37689y_();
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
        return null;
    }

    /* renamed from: g */
    public final C15488ak mo40016g() {
        if (this.f41014m == null) {
            return null;
        }
        try {
            return this.f41014m.mo37627q();
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo40004a(C14873l lVar) {
        zzacq zzacq;
        this.f41007f = lVar;
        try {
            if (this.f41014m != null) {
                C15698g gVar = this.f41014m;
                if (lVar == null) {
                    zzacq = null;
                } else {
                    zzacq = new zzacq(lVar);
                }
                gVar.mo37600a(zzacq);
            }
        } catch (RemoteException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    private static zzyz m47164a(Context context, C14745e[] eVarArr, int i) {
        zzyz zzyz = new zzyz(context, eVarArr);
        zzyz.f45807j = m47165a(i);
        return zzyz;
    }
}
