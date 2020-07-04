package com.p280ss.android.ugc.effectmanager.effect.p1733c;

import android.os.Handler;
import android.os.Message;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43740i;
import com.p280ss.android.ugc.effectmanager.common.C43743j;
import com.p280ss.android.ugc.effectmanager.common.C43743j.C43744a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43724a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43752b;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43753c;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43755e;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43758h;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43764n;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43769s;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43784a;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43787d;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43788e;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43791h;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43794k;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43798o;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43805c;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43806d;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43808e;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43810f;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43817l;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43822q;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43824s;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.c.b */
public final class C43774b implements C43744a {

    /* renamed from: a */
    public C43775a f113254a;

    /* renamed from: b */
    public Handler f113255b;

    /* renamed from: c */
    private C43834g f113256c;

    /* renamed from: d */
    private C43680a f113257d;

    /* renamed from: e */
    private HashMap<Effect, C43724a> f113258e = new HashMap<>();

    /* renamed from: com.ss.android.ugc.effectmanager.effect.c.b$a */
    public interface C43775a {
        /* renamed from: a */
        void mo105821a(String str, Effect effect, int i, C43726c cVar);

        /* renamed from: a */
        void mo105822a(String str, List<Effect> list, C43726c cVar);
    }

    public C43774b(C43680a aVar) {
        this.f113257d = aVar;
        this.f113256c = this.f113257d.f113068a;
        this.f113255b = new C43743j(this);
    }

    /* renamed from: a */
    public final void mo105789a(Message message) {
        if (this.f113254a != null) {
            if (message.what == 15 && (message.obj instanceof C43788e)) {
                C43788e eVar = (C43788e) message.obj;
                Effect effect = eVar.f113292b;
                C43726c cVar = eVar.f113293c;
                if (cVar == null) {
                    this.f113254a.mo105821a(eVar.f113219a, effect, 20, null);
                } else {
                    this.f113254a.mo105821a(eVar.f113219a, effect, 26, cVar);
                }
                this.f113258e.remove(effect);
            }
            if (message.what == 17 && (message.obj instanceof C43787d)) {
                C43787d dVar = (C43787d) message.obj;
                C43726c cVar2 = dVar.f113291c;
                if (cVar2 == null) {
                    this.f113254a.mo105822a(dVar.f113219a, dVar.f113290b, null);
                } else {
                    this.f113254a.mo105822a(dVar.f113219a, dVar.f113290b, cVar2);
                }
            }
            if (message.what == 23 && (message.obj instanceof C43791h)) {
                C43791h hVar = (C43791h) message.obj;
                C43726c cVar3 = hVar.f113302c;
                C43758h c = this.f113256c.f113508B.mo106046c(hVar.f113219a);
                if (c != null) {
                    if (cVar3 == null) {
                        c.mo101876a(hVar.f113301b);
                    } else {
                        c.mo101875a(cVar3);
                    }
                }
            }
            if (message.what == 24 && (message.obj instanceof C43794k)) {
                C43794k kVar = (C43794k) message.obj;
                C43726c cVar4 = kVar.f113307b;
                C43764n nVar = (C43764n) this.f113256c.f113508B.mo106052i(kVar.f113219a);
                if (cVar4 == null) {
                    nVar.mo100238a(kVar.f113308c);
                } else {
                    nVar.mo100237a(cVar4);
                }
            }
            if (message.what == 60 && (message.obj instanceof C43798o)) {
                C43798o oVar = (C43798o) message.obj;
                C43726c cVar5 = oVar.f113316c;
                C43769s sVar = (C43769s) this.f113256c.f113508B.mo106052i(oVar.f113219a);
                if (cVar5 == null) {
                    sVar.mo70695a(oVar.f113315b);
                } else {
                    sVar.mo70694a(cVar5);
                }
            }
            if (message.what == 19 && (message.obj instanceof C43784a)) {
                C43784a aVar = (C43784a) message.obj;
                C43726c cVar6 = aVar.f113283c;
                C43752b q = this.f113256c.f113508B.mo106060q(aVar.f113219a);
                if (q != null) {
                    if (cVar6 == null) {
                        q.mo100797a(aVar.f113282b);
                    } else {
                        q.mo100799a(aVar.f113282b, aVar.f113283c);
                    }
                }
            }
            if (message.what == 54 && (message.obj instanceof C43784a)) {
                C43784a aVar2 = (C43784a) message.obj;
                C43752b q2 = this.f113256c.f113508B.mo106060q(aVar2.f113219a);
                if (q2 != null && (q2 instanceof C43753c)) {
                    ((C43753c) q2).mo100798a(aVar2.f113282b, aVar2.f113285e, aVar2.f113284d);
                }
            }
            if (message.what == 42 && (message.obj instanceof C43788e)) {
                C43788e eVar2 = (C43788e) message.obj;
                C43760j d = this.f113256c.f113508B.mo106047d(eVar2.f113219a);
                if (d != null) {
                    d.mo9282b(eVar2.f113292b);
                }
            }
            if (message.what == 53 && (message.obj instanceof C43788e)) {
                C43788e eVar3 = (C43788e) message.obj;
                C43760j d2 = this.f113256c.f113508B.mo106047d(eVar3.f113219a);
                if (d2 instanceof C43755e) {
                    ((C43755e) d2).mo70696a(eVar3.f113292b, eVar3.f113294d, eVar3.f113295e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo105814a(Effect effect, String str) {
        C43808e eVar = new C43808e(effect, this.f113257d, str, this.f113255b);
        this.f113254a.mo105821a("", effect, 21, null);
        this.f113258e.put(effect, eVar);
        this.f113256c.f113527r.mo105782a((C43724a) eVar);
    }

    /* renamed from: a */
    public final void mo105815a(ProviderEffect providerEffect, String str) {
        this.f113256c.f113527r.mo105782a((C43724a) new C43810f(this.f113257d, str, providerEffect, this.f113255b));
    }

    /* renamed from: a */
    public final void mo105819a(Map<String, String> map, String str) {
        this.f113256c.f113527r.mo105782a((C43724a) new C43822q(this.f113257d, this.f113255b, str, map));
    }

    /* renamed from: b */
    public final void mo105820b(List<String> list, String str, Map<String, String> map) {
        C43740i iVar = this.f113256c.f113527r;
        C43817l lVar = new C43817l(this.f113257d, list, this.f113255b, str, map);
        iVar.mo105782a((C43724a) lVar);
    }

    /* renamed from: a */
    public final void mo105817a(List<Effect> list, String str, DownloadEffectExtra downloadEffectExtra) {
        for (Effect a : list) {
            this.f113254a.mo105821a("", a, 21, null);
        }
        C43740i iVar = this.f113256c.f113527r;
        C43806d dVar = new C43806d(this.f113257d, list, str, this.f113255b, downloadEffectExtra);
        iVar.mo105782a((C43724a) dVar);
    }

    /* renamed from: a */
    public final void mo105818a(List<String> list, String str, Map<String, String> map) {
        C43740i iVar = this.f113256c.f113527r;
        C43805c cVar = new C43805c(this.f113257d, list, this.f113255b, str, map);
        iVar.mo105782a((C43724a) cVar);
    }

    /* renamed from: a */
    public final void mo105816a(String str, String str2, int i, int i2, Map<String, String> map, String str3) {
        C43740i iVar = this.f113256c.f113527r;
        C43824s sVar = new C43824s(this.f113257d, str, str2, i, i2, map, this.f113255b, str3);
        iVar.mo105782a((C43724a) sVar);
    }
}
