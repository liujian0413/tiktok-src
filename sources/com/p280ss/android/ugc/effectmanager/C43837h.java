package com.p280ss.android.ugc.effectmanager;

import android.text.TextUtils;
import com.p280ss.android.ugc.effectmanager.common.C43737f;
import com.p280ss.android.ugc.effectmanager.common.C43740i;
import com.p280ss.android.ugc.effectmanager.common.C43740i.C43742a;
import com.p280ss.android.ugc.effectmanager.common.p1726a.C43703a;
import com.p280ss.android.ugc.effectmanager.common.p1726a.C43705c;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43730b;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c;
import com.p280ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43751a;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43752b;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43758h;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43759i;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43761k;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43762l;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43763m;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43764n;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43766p;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43769s;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import com.p280ss.android.ugc.effectmanager.effect.p1733c.C43772a;
import com.p280ss.android.ugc.effectmanager.effect.p1733c.C43772a.C43773a;
import com.p280ss.android.ugc.effectmanager.effect.p1733c.C43774b;
import com.p280ss.android.ugc.effectmanager.effect.p1733c.C43774b.C43775a;
import com.p280ss.android.ugc.effectmanager.effect.p1733c.C43776c;
import com.p280ss.android.ugc.effectmanager.effect.p1733c.C43777d;
import com.p280ss.android.ugc.effectmanager.effect.p1733c.C43778e;
import com.p280ss.android.ugc.effectmanager.link.C43849a;
import com.p280ss.android.ugc.effectmanager.network.p1741a.C43861b;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.effectmanager.h */
public final class C43837h {

    /* renamed from: a */
    C43772a f113562a;

    /* renamed from: b */
    C43774b f113563b;

    /* renamed from: c */
    C43777d f113564c;

    /* renamed from: d */
    C43778e f113565d;

    /* renamed from: e */
    C43776c f113566e;

    /* renamed from: f */
    C43719a f113567f;

    /* renamed from: g */
    boolean f113568g;

    /* renamed from: h */
    C43680a f113569h;

    /* renamed from: i */
    C43849a f113570i;

    /* renamed from: a */
    public final boolean mo106022a(C43834g gVar) {
        if (!m138814b(gVar)) {
            return false;
        }
        this.f113569h = new C43680a(gVar);
        this.f113570i = this.f113569h.f113069b;
        m138813a(gVar.f113535z);
        m138816d();
        m138815c();
        this.f113569h.f113068a.f113533x.f113631b = this.f113570i;
        this.f113568g = true;
        if (!this.f113570i.f113610i) {
            m138817e();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo106015a(String str, final boolean z, final C43757g gVar) {
        if (this.f113569h == null || this.f113562a == null) {
            if (gVar != null) {
                gVar.mo9274a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        C438403 r0 = new C43757g() {
            /* renamed from: a */
            public final void mo9274a(C43726c cVar) {
                if (gVar != null) {
                    gVar.mo9274a(cVar);
                }
            }

            /* renamed from: a */
            public final void mo9275a(final EffectChannelResponse effectChannelResponse) {
                if (z) {
                    final String a = C43730b.m138576a(C43837h.this.f113569h.f113068a.f113515f, effectChannelResponse.panel);
                    final String a2 = C43837h.this.f113567f.mo105729a(a);
                    C43837h.this.f113567f.mo105736c(a);
                    C43837h.this.mo106017a(C43837h.this.mo105998a(effectChannelResponse.allCategoryEffects), (C43759i) new C43759i() {
                        /* renamed from: a */
                        public final void mo95925a(C43726c cVar) {
                            if (gVar != null) {
                                gVar.mo9274a(cVar);
                            }
                        }

                        /* renamed from: a */
                        public final void mo95926a(List<Effect> list) {
                            EffectChannelResponse a = C43837h.m138810a(effectChannelResponse, list);
                            if (gVar != null) {
                                gVar.mo9275a(a);
                            }
                            C43837h.this.f113567f.mo105732a(a, a2);
                        }
                    });
                    return;
                }
                if (gVar != null) {
                    gVar.mo9275a(effectChannelResponse);
                }
            }
        };
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106035a(f, (C43757g) r0);
        if (!TextUtils.isEmpty(str)) {
            this.f113562a.mo105811a(str, f, false);
        } else {
            this.f113562a.mo105811a("default", f, false);
        }
    }

    /* renamed from: a */
    public final void mo106004a(String str, C43757g gVar) {
        if (this.f113569h == null || this.f113562a == null) {
            if (gVar != null) {
                gVar.mo9274a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106035a(f, gVar);
        if (!TextUtils.isEmpty(str)) {
            this.f113562a.mo105811a(str, f, true);
        } else {
            this.f113562a.mo105811a("default", f, true);
        }
    }

    /* renamed from: a */
    public final void mo106016a(String str, boolean z, String str2, int i, int i2, C43762l lVar) {
        C43762l lVar2 = lVar;
        if (this.f113569h == null || this.f113562a == null) {
            if (lVar2 != null) {
                lVar2.mo70697a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106040a(f, lVar2);
        this.f113562a.mo105812a(str, f, z, str2, i, i2, false, lVar);
    }

    /* renamed from: a */
    public final void mo106009a(String str, String str2, C43751a aVar) {
        m138811a(str, str2, 1, aVar);
    }

    /* renamed from: a */
    public final void mo106006a(String str, String str2, int i, int i2, int i3, String str3, C43756f fVar) {
        C43756f fVar2 = fVar;
        if (this.f113569h == null || this.f113562a == null) {
            if (fVar2 != null) {
                fVar2.mo70686a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106034a(f, fVar2);
        this.f113562a.mo105810a(str, f, str2, i, i2, i3, str3, false);
    }

    /* renamed from: a */
    public final void mo106013a(String str, Map<String, String> map, final C43760j jVar) {
        if (this.f113569h == null) {
            if (jVar != null) {
                jVar.mo9281a(null, new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        C438424 r0 = new C43759i() {
            /* renamed from: a */
            public final void mo95925a(C43726c cVar) {
                jVar.mo9281a(null, cVar);
            }

            /* renamed from: a */
            public final void mo95926a(List<Effect> list) {
                if (!list.isEmpty()) {
                    jVar.mo9280a((Effect) list.get(0));
                } else {
                    jVar.mo9281a(null, new C43726c(1));
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        mo106019a((List<String>) arrayList, true, map, (C43759i) r0);
    }

    /* renamed from: a */
    public final void mo106019a(List<String> list, final boolean z, Map<String, String> map, final C43759i iVar) {
        if (this.f113569h == null || this.f113563b == null) {
            if (iVar != null) {
                iVar.mo95925a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        C438435 r0 = new C43759i() {
            /* renamed from: a */
            public final void mo95925a(C43726c cVar) {
                iVar.mo95925a(cVar);
            }

            /* renamed from: a */
            public final void mo95926a(List<Effect> list) {
                if (z) {
                    C43837h.this.mo106017a(list, iVar);
                } else {
                    iVar.mo95926a(list);
                }
            }
        };
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106037a(f, (C43759i) r0);
        this.f113563b.mo105818a(list, f, map);
    }

    /* renamed from: a */
    public final void mo106018a(List<String> list, Map<String, String> map, C43758h hVar) {
        if (this.f113569h == null || this.f113563b == null) {
            if (hVar != null) {
                hVar.mo101875a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106036a(f, hVar);
        this.f113563b.mo105820b(list, f, map);
    }

    /* renamed from: a */
    public final void mo106020a(Map<String, String> map, C43764n nVar) {
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106030a(f, (Object) nVar);
        this.f113563b.mo105819a(map, f);
    }

    /* renamed from: a */
    public final void mo106007a(String str, String str2, int i, int i2, Map<String, String> map, C43769s sVar) {
        if (this.f113569h == null || this.f113562a == null) {
            if (sVar != null) {
                sVar.mo70694a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106030a(f, (Object) sVar);
        this.f113563b.mo105816a(str, str2, i, i2, map, f);
    }

    /* renamed from: a */
    public final boolean mo106021a(Effect effect) {
        boolean d = this.f113567f == null ? false : this.f113567f.mo105737d(effect.getId());
        if (this.f113566e == null || !C43731c.m138586a(effect) || !this.f113566e.mo105826a(effect) || !d) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo106011a(String str, String str2, C43770t tVar) {
        if (this.f113565d == null) {
            if (tVar != null) {
                tVar.mo9402a();
            }
            return;
        }
        this.f113565d.mo105833b(m138818f(), str, str2, tVar);
    }

    /* renamed from: a */
    public final void mo106010a(String str, String str2, C43765o oVar) {
        if (this.f113565d == null) {
            oVar.mo9279b();
            return;
        }
        this.f113565d.mo105831a(m138818f(), str, str2, oVar);
    }

    /* renamed from: a */
    public final void mo106012a(String str, List<String> list, Boolean bool, C43766p pVar) {
        if (this.f113569h == null || this.f113564c == null) {
            if (pVar != null) {
                pVar.mo101169a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106042a(f, pVar);
        this.f113564c.mo105829a(str, list, bool, f);
    }

    /* renamed from: a */
    public final void mo106005a(String str, C43761k kVar) {
        if (this.f113569h == null || this.f113564c == null) {
            if (kVar != null) {
                kVar.mo101300a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106039a(f, kVar);
        this.f113564c.mo105828a(str, f);
    }

    /* renamed from: a */
    public final void mo106014a(String str, boolean z, int i, int i2, C43763m mVar) {
        if (this.f113569h == null || this.f113562a == null) {
            if (mVar != null) {
                mVar.mo100795a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106041a(f, mVar);
        this.f113562a.mo105807a(str, i, i2, f);
    }

    /* renamed from: a */
    public final void mo106008a(String str, String str2, int i, int i2, boolean z, C43763m mVar) {
        if (this.f113569h == null || this.f113562a == null) {
            if (mVar != null) {
                mVar.mo100795a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106041a(f, mVar);
        this.f113562a.mo105808a(str, str2, i, i2, f);
    }

    /* renamed from: a */
    public final void mo106001a(ProviderEffect providerEffect, C43752b bVar) {
        if (this.f113569h == null || this.f113562a == null) {
            if (bVar != null) {
                bVar.mo100799a(providerEffect, new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106033a(f, bVar);
        this.f113563b.mo105815a(providerEffect, f);
    }

    /* renamed from: a */
    public final void mo106017a(List<Effect> list, C43759i iVar) {
        m138812a(list, iVar, (DownloadEffectExtra) null);
    }

    /* renamed from: e */
    private void m138817e() {
        this.f113570i.mo106070b();
    }

    /* renamed from: f */
    private static String m138818f() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public final void mo105999a() {
        if (this.f113569h != null) {
            this.f113569h.f113068a.f113508B.mo106031a();
        }
    }

    /* renamed from: c */
    private void m138815c() {
        if (this.f113569h.f113068a.f113528s == null) {
            String absolutePath = this.f113569h.f113068a.f113519j.getAbsolutePath();
            if (C43703a.m138485a().mo105727a(absolutePath) == null) {
                C43703a.m138485a().mo105728a(absolutePath, new C43705c(this.f113569h.f113068a));
            }
            this.f113567f = C43703a.m138485a().mo105727a(absolutePath);
            this.f113569h.f113068a.f113528s = this.f113567f;
            return;
        }
        this.f113567f = this.f113569h.f113068a.f113528s;
    }

    /* renamed from: d */
    private void m138816d() {
        this.f113566e = new C43776c(this.f113569h.f113068a);
        this.f113562a = new C43772a(this.f113569h);
        this.f113563b = new C43774b(this.f113569h);
        this.f113564c = new C43777d(this.f113569h);
        this.f113562a.f113250a = new C43773a() {
            /* renamed from: a */
            public final void mo105813a(String str, EffectChannelResponse effectChannelResponse, int i, C43726c cVar) {
                C43837h.this.f113566e.mo105824a(str, effectChannelResponse, i, cVar);
            }
        };
        this.f113563b.f113254a = new C43775a() {
            /* renamed from: a */
            public final void mo105822a(String str, List<Effect> list, C43726c cVar) {
                C43837h.this.f113566e.mo105825a(str, list, cVar);
            }

            /* renamed from: a */
            public final void mo105821a(String str, Effect effect, int i, C43726c cVar) {
                C43837h.this.f113566e.mo105823a(str, effect, i, cVar);
            }
        };
        this.f113565d = new C43778e(this.f113569h);
    }

    /* renamed from: b */
    public final void mo106023b() {
        if (this.f113568g && this.f113569h != null) {
            this.f113569h.f113068a.f113527r.mo105781a();
            this.f113569h.f113068a.f113508B.mo106031a();
            this.f113570i.mo106072d();
            this.f113568g = false;
        }
    }

    /* renamed from: a */
    public final void mo106002a(String str) {
        this.f113567f.mo105734a(C43730b.m138579b(str));
    }

    /* renamed from: b */
    public final boolean mo106027b(Effect effect) {
        if (this.f113566e == null || !C43731c.m138586a(effect) || !this.f113566e.mo105827b(effect)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m138814b(C43834g gVar) {
        if (gVar == null || gVar.f113531v.mOriginHosts == null || gVar.f113531v.mOriginHosts.isEmpty() || gVar.f113531v.mContext == null || gVar.f113532w == null || gVar.f113533x == null || gVar.f113519j == null || !gVar.f113519j.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo106028c(Effect effect) {
        if (effect != null) {
            this.f113567f.mo105736c(effect.getId());
            C43719a aVar = this.f113567f;
            StringBuilder sb = new StringBuilder();
            sb.append(effect.getId());
            sb.append(".zip");
            aVar.mo105736c(sb.toString());
        }
    }

    /* renamed from: a */
    private void m138813a(ExecutorService executorService) {
        ExecutorService executorService2;
        boolean z;
        C43740i iVar = new C43740i();
        C43742a aVar = new C43742a();
        if (executorService == null) {
            executorService2 = C43844i.m138861a(new C43737f("EffectManager", true));
        } else {
            executorService2 = executorService;
        }
        if (executorService == null) {
            z = true;
        } else {
            z = false;
        }
        iVar.mo105783a(aVar.mo105787a(executorService2, z).mo105786a(this.f113569h));
        C43861b bVar = new C43861b(this.f113570i);
        bVar.f113632a = true;
        iVar.mo105784a("LINK_SELECTOR", bVar);
        this.f113569h.f113068a.f113527r = iVar;
    }

    /* renamed from: a */
    public final List<Effect> mo105998a(List<Effect> list) {
        ArrayList arrayList = new ArrayList();
        List<Effect> list2 = this.f113566e.f113259a;
        for (Effect effect : list) {
            if (!list2.contains(effect)) {
                arrayList.add(effect);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo106003a(String str, C43751a aVar) {
        m138811a(str, (String) null, 0, aVar);
    }

    /* renamed from: b */
    public final void mo106024b(String str, C43751a aVar) {
        m138811a(str, (String) null, 2, aVar);
    }

    /* renamed from: a */
    public static EffectChannelResponse m138810a(EffectChannelResponse effectChannelResponse, List<Effect> list) {
        effectChannelResponse.allCategoryEffects = list;
        for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.categoryResponseList) {
            ArrayList arrayList = new ArrayList();
            for (Effect effect : effectCategoryResponse.totalEffects) {
                if (list.contains(effect)) {
                    arrayList.add(effect);
                }
            }
            effectCategoryResponse.totalEffects = arrayList;
        }
        return effectChannelResponse;
    }

    /* renamed from: a */
    public final void mo106000a(Effect effect, C43760j jVar) {
        if (this.f113569h == null || this.f113563b == null) {
            if (jVar != null) {
                jVar.mo9281a(effect, new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106038a(f, jVar);
        if (!mo106027b(effect)) {
            this.f113563b.mo105814a(effect, f);
        }
    }

    /* renamed from: a */
    private void m138812a(List<Effect> list, C43759i iVar, DownloadEffectExtra downloadEffectExtra) {
        if (this.f113569h == null || this.f113563b == null) {
            if (iVar != null) {
                iVar.mo95925a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106037a(f, iVar);
        this.f113563b.mo105817a(list, f, (DownloadEffectExtra) null);
    }

    /* renamed from: a */
    private void m138811a(String str, String str2, int i, C43751a aVar) {
        if (this.f113569h == null || this.f113562a == null) {
            if (aVar != null) {
                aVar.mo9276a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106032a(f, aVar);
        this.f113562a.mo105809a(str, str2, i, f);
    }

    /* renamed from: b */
    public final void mo106026b(String str, boolean z, String str2, int i, int i2, C43762l lVar) {
        C43762l lVar2 = lVar;
        if (this.f113569h == null || this.f113562a == null) {
            if (lVar2 != null) {
                lVar2.mo70697a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            }
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106040a(f, lVar2);
        this.f113562a.mo105812a(str, f, z, str2, i, i2, true, lVar);
    }

    /* renamed from: b */
    public final void mo106025b(String str, String str2, int i, int i2, int i3, String str3, C43756f fVar) {
        C43756f fVar2 = fVar;
        if (this.f113569h == null || this.f113562a == null) {
            fVar2.mo70686a(new C43726c((Exception) new IllegalStateException("请先初始化")));
            return;
        }
        String f = m138818f();
        this.f113569h.f113068a.f113508B.mo106034a(f, fVar2);
        this.f113562a.mo105810a(str, f, str2, i, i2, i3, str3, true);
    }
}
