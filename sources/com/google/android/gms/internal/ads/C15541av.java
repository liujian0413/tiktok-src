package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.C14732b;
import com.google.android.gms.ads.C14766h;
import com.google.android.gms.ads.p741a.C14725a;
import com.google.android.gms.ads.p741a.C14726b;
import com.google.android.gms.ads.p741a.C14730e;
import com.google.android.gms.ads.reward.C14915a;
import com.google.android.gms.ads.reward.C14917c;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.av */
public final class C15541av {

    /* renamed from: a */
    public C14732b f41075a;

    /* renamed from: b */
    public String f41076b;

    /* renamed from: c */
    public C14725a f41077c;

    /* renamed from: d */
    public C14726b f41078d;

    /* renamed from: e */
    private final C15930op f41079e;

    /* renamed from: f */
    private final Context f41080f;

    /* renamed from: g */
    private final bya f41081g;

    /* renamed from: h */
    private bxr f41082h;

    /* renamed from: i */
    private C15698g f41083i;

    /* renamed from: j */
    private C14915a f41084j;

    /* renamed from: k */
    private C14766h f41085k;

    /* renamed from: l */
    private C14917c f41086l;

    /* renamed from: m */
    private boolean f41087m;

    /* renamed from: n */
    private boolean f41088n;

    public C15541av(Context context) {
        this(context, bya.f44160a, null);
    }

    private C15541av(Context context, bya bya, C14730e eVar) {
        this.f41079e = new C15930op();
        this.f41080f = context;
        this.f41081g = bya;
    }

    /* renamed from: a */
    public final void mo40064a(C15499ar arVar) {
        try {
            if (this.f41083i == null) {
                String str = "loadAd";
                if (this.f41076b == null) {
                    m47351b(str);
                }
                zzyz a = this.f41087m ? zzyz.m53263a() : new zzyz();
                bye b = bym.m50297b();
                Context context = this.f41080f;
                byi byi = new byi(b, context, a, this.f41076b, this.f41079e);
                this.f41083i = (C15698g) byi.mo41442a(context, false);
                if (this.f41075a != null) {
                    this.f41083i.mo37589a((bys) new bxu(this.f41075a));
                }
                if (this.f41082h != null) {
                    this.f41083i.mo37588a((byp) new bxs(this.f41082h));
                }
                if (this.f41084j != null) {
                    this.f41083i.mo37592a((C15833l) new bxx(this.f41084j));
                }
                if (this.f41077c != null) {
                    this.f41083i.mo37593a((C15914o) new byd(this.f41077c));
                }
                if (this.f41078d != null) {
                    this.f41083i.mo37591a((C15606cq) new C15609ct(this.f41078d));
                }
                if (this.f41085k != null) {
                    this.f41083i.mo37596a((C16076u) this.f41085k.f38134a);
                }
                if (this.f41086l != null) {
                    this.f41083i.mo37598a((C16194yk) new C16201yr(this.f41086l));
                }
                this.f41083i.mo37613b(this.f41088n);
            }
            if (this.f41083i.mo37614b(bya.m50259a(this.f41080f, arVar))) {
                this.f41079e.f44828a = arVar.f40937h;
            }
        } catch (RemoteException e) {
            afm.m45782d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo40061a(C14732b bVar) {
        try {
            this.f41075a = bVar;
            if (this.f41083i != null) {
                this.f41083i.mo37589a((bys) bVar != null ? new bxu(bVar) : null);
            }
        } catch (RemoteException e) {
            afm.m45782d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo40065a(bxr bxr) {
        try {
            this.f41082h = bxr;
            if (this.f41083i != null) {
                this.f41083i.mo37588a((byp) bxr != null ? new bxs(bxr) : null);
            }
        } catch (RemoteException e) {
            afm.m45782d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo40066a(String str) {
        if (this.f41076b == null) {
            this.f41076b = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    /* renamed from: a */
    public final void mo40062a(C14915a aVar) {
        try {
            this.f41084j = aVar;
            if (this.f41083i != null) {
                this.f41083i.mo37592a((C15833l) aVar != null ? new bxx(aVar) : null);
            }
        } catch (RemoteException e) {
            afm.m45782d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final Bundle mo40060a() {
        try {
            if (this.f41083i != null) {
                return this.f41083i.mo37624n();
            }
        } catch (RemoteException e) {
            afm.m45782d("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo40063a(C14917c cVar) {
        try {
            this.f41086l = cVar;
            if (this.f41083i != null) {
                this.f41083i.mo37598a((C16194yk) cVar != null ? new C16201yr(cVar) : null);
            }
        } catch (RemoteException e) {
            afm.m45782d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo40067a(boolean z) {
        this.f41087m = true;
    }

    /* renamed from: b */
    public final void mo40068b() {
        try {
            m47351b("show");
            this.f41083i.mo37640E();
        } catch (RemoteException e) {
            afm.m45782d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: b */
    public final void mo40069b(boolean z) {
        try {
            this.f41088n = z;
            if (this.f41083i != null) {
                this.f41083i.mo37613b(z);
            }
        } catch (RemoteException e) {
            afm.m45782d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: b */
    private final void m47351b(String str) {
        if (this.f41083i == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }
}
