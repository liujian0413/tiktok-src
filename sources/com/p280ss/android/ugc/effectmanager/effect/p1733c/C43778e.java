package com.p280ss.android.ugc.effectmanager.effect.p1733c;

import android.os.Handler;
import android.os.Message;
import com.p280ss.android.ugc.effectmanager.C43846k;
import com.p280ss.android.ugc.effectmanager.common.C43740i;
import com.p280ss.android.ugc.effectmanager.common.C43743j;
import com.p280ss.android.ugc.effectmanager.common.C43743j.C43744a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43724a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43736h;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43767q;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43771u;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43796m;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43799p;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43823r;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43826u;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.c.e */
public final class C43778e implements C43744a {

    /* renamed from: a */
    private final String f113265a = "UpdateTagRepository";

    /* renamed from: b */
    private HashMap<String, String> f113266b;

    /* renamed from: c */
    private C43680a f113267c;

    /* renamed from: d */
    private Handler f113268d;

    public C43778e(C43680a aVar) {
        this.f113267c = aVar;
        this.f113268d = new C43743j(this);
    }

    /* renamed from: a */
    public final void mo105789a(Message message) {
        switch (message.what) {
            case 51:
                if (message.obj instanceof C43799p) {
                    C43799p pVar = (C43799p) message.obj;
                    if (this.f113267c != null) {
                        C43771u n = this.f113267c.f113068a.f113508B.mo106057n(pVar.f113219a);
                        if (n != null) {
                            n.mo105806a();
                        }
                        this.f113267c.f113068a.f113508B.mo106058o(pVar.f113219a);
                        break;
                    } else {
                        return;
                    }
                }
                break;
            case 52:
                if (message.obj instanceof C43796m) {
                    C43796m mVar = (C43796m) message.obj;
                    if (this.f113267c != null) {
                        C43767q l = this.f113267c.f113068a.f113508B.mo106055l(mVar.f113219a);
                        if (this.f113266b == null) {
                            this.f113266b = new HashMap<>();
                        }
                        if (mVar.f113312c == null) {
                            this.f113266b.putAll(mVar.f113311b);
                            if (l != null) {
                                l.mo105803a();
                            }
                        } else if (l != null) {
                            l.mo105804a(mVar.f113312c);
                        }
                        if (l != null) {
                            l.mo105805b();
                        }
                        this.f113267c.f113068a.f113508B.mo106056m(mVar.f113219a);
                        return;
                    }
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final void mo105830a(String str, String str2, C43765o oVar) {
        if (this.f113266b == null) {
            oVar.mo9278a();
        } else if (!this.f113266b.containsKey(str) || C43736h.m138610a(str2, -1) > C43736h.m138610a((String) this.f113266b.get(str), -1)) {
            oVar.mo9278a();
        } else {
            oVar.mo9279b();
        }
    }

    /* renamed from: b */
    public final void mo105833b(String str, String str2, String str3, C43770t tVar) {
        if (this.f113266b != null) {
            mo105832a(str, str2, str3, tVar);
        } else if (this.f113267c == null) {
            if (tVar != null) {
                tVar.mo9402a();
            }
        } else {
            C43846k kVar = this.f113267c.f113068a.f113508B;
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            final C43770t tVar2 = tVar;
            C437802 r1 = new C43767q() {
                /* renamed from: a */
                public final void mo105803a() {
                }

                /* renamed from: a */
                public final void mo105804a(C43726c cVar) {
                }

                /* renamed from: b */
                public final void mo105805b() {
                    C43778e.this.mo105832a(str4, str5, str6, tVar2);
                }
            };
            kVar.mo106043a(str, (C43767q) r1);
            C43740i iVar = this.f113267c.f113068a.f113527r;
            C43823r rVar = new C43823r(this.f113268d, this.f113267c, str4, str5, str6);
            iVar.mo105782a((C43724a) rVar);
        }
    }

    /* renamed from: a */
    public final void mo105831a(String str, final String str2, final String str3, final C43765o oVar) {
        if (this.f113266b != null) {
            mo105830a(str2, str3, oVar);
        } else if (this.f113267c == null) {
            if (oVar != null) {
                oVar.mo9279b();
            }
        } else {
            this.f113267c.f113068a.f113508B.mo106043a(str, (C43767q) new C43767q() {
                /* renamed from: b */
                public final void mo105805b() {
                }

                /* renamed from: a */
                public final void mo105803a() {
                    C43778e.this.mo105830a(str2, str3, oVar);
                }

                /* renamed from: a */
                public final void mo105804a(C43726c cVar) {
                    oVar.mo9278a();
                }
            });
            C43740i iVar = this.f113267c.f113068a.f113527r;
            C43823r rVar = new C43823r(this.f113268d, this.f113267c, str, str2, str3);
            iVar.mo105782a((C43724a) rVar);
        }
    }

    /* renamed from: a */
    public final void mo105832a(String str, String str2, String str3, final C43770t tVar) {
        if (this.f113267c == null) {
            if (tVar != null) {
                tVar.mo9402a();
            }
            return;
        }
        if (this.f113266b == null) {
            tVar.mo9402a();
        }
        this.f113266b.put(str2, str3);
        this.f113267c.f113068a.f113508B.mo106044a(str, (C43771u) new C43771u() {
            /* renamed from: a */
            public final void mo105806a() {
                if (tVar != null) {
                    tVar.mo9402a();
                }
            }
        });
        this.f113267c.f113068a.f113527r.mo105782a((C43724a) new C43826u(this.f113268d, this.f113267c, str, this.f113266b));
    }
}
