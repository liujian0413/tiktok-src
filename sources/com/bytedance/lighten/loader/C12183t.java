package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import com.bytedance.lighten.core.C12091a;
import com.bytedance.lighten.core.C12134o;
import com.bytedance.lighten.core.p612c.C12107e;
import com.facebook.cache.p683a.C13244c;
import com.facebook.cache.p683a.C13244c.C13246a;
import com.facebook.common.internal.C13310j;
import com.facebook.common.memory.C13318c;
import com.facebook.common.p684a.C13273b;
import com.facebook.common.p684a.C13274c;
import com.facebook.fresco.animation.p702a.C13460a;
import com.facebook.fresco.animation.p702a.C13461b;
import com.facebook.fresco.animation.p703b.C13466a;
import com.facebook.fresco.animation.p707c.C13480a;
import com.facebook.fresco.animation.p709d.C13487a;
import com.facebook.fresco.animation.p709d.C13488b;
import com.facebook.imagepipeline.animated.p712a.C13520b;
import com.facebook.imagepipeline.memory.C13799ab;
import com.facebook.imagepipeline.memory.C13802ac;
import com.facebook.imagepipeline.p716c.C13586q;
import com.facebook.imagepipeline.p717d.C13613j;
import com.facebook.imagepipeline.p717d.C13613j.C13615a;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.p724k.C13683ai;
import com.facebook.imageutils.C6492b;
import com.facebook.imageutils.C6492b.C6493a;
import com.optimize.statistics.C18619b;
import com.optimize.statistics.C18620c;
import com.optimize.statistics.C18629f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.bytedance.lighten.loader.t */
final class C12183t {
    /* renamed from: b */
    private static void m35432b(final C12134o oVar) {
        if (oVar.f32240r != null) {
            C6492b.m20176a((C6493a) new C6493a() {
                /* renamed from: a */
                public final void mo15842a(String str) {
                }
            });
        }
    }

    /* renamed from: c */
    private static void m35434c(C12134o oVar) {
        if (oVar.f32225c >= 0) {
            C13520b.m39770a(oVar.f32225c);
        }
    }

    /* renamed from: g */
    private static void m35440g(final C12134o oVar) {
        C13480a.m39653a((C13488b) new C13488b() {
            /* renamed from: a */
            public final C13487a mo29906a(C13460a aVar, Object obj) {
                C12091a aVar2;
                C12107e eVar = null;
                if (!(obj instanceof HashMap) || oVar.f32238p == null || oVar.f32238p.isEmpty()) {
                    return null;
                }
                HashMap hashMap = (HashMap) obj;
                Object obj2 = hashMap.get("frame_scheduler_id");
                if (!(obj2 instanceof Integer)) {
                    return null;
                }
                Object obj3 = hashMap.get("frame_scheduler_listener");
                Iterator it = oVar.f32238p.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar2 = null;
                        break;
                    }
                    aVar2 = (C12091a) it.next();
                    if (((Integer) obj2).intValue() == aVar2.f32190b) {
                        break;
                    }
                }
                if (aVar2 == null) {
                    return null;
                }
                C13466a aVar3 = (C13466a) ((C13461b) aVar).f35693a;
                if (aVar3 == null) {
                    return null;
                }
                int[] iArr = aVar2.f32192d;
                if (obj3 instanceof C12107e) {
                    eVar = (C12107e) obj3;
                }
                int[] a = C12183t.m35431a(aVar, iArr, eVar);
                C12152f fVar = new C12152f(aVar, a);
                aVar3.f35707a = new C12151e(a, fVar);
                return fVar;
            }
        });
    }

    /* renamed from: f */
    private static void m35439f(C12134o oVar) {
        C18619b.m61074a(oVar.f32223a);
        C18619b.m61075a((C18629f) new C12186u(oVar.f32237o));
        C18619b.m61076a(false);
        C18619b.m61079b(true);
        C18619b.m61082c(oVar.f32236n);
    }

    /* renamed from: a */
    static C13613j m35429a(C12134o oVar) {
        m35434c(oVar);
        C13615a a = C13613j.m40072a(oVar.f32223a).mo33193a(m35436d(oVar)).mo33201b(m35438e(oVar)).mo33192a(oVar.f32224b).mo33199a(true);
        m35430a(oVar, a);
        m35433b(oVar, a);
        m35435c(oVar, a);
        m35437d(oVar, a);
        m35440g(oVar);
        m35432b(oVar);
        return a.mo33200a();
    }

    /* renamed from: d */
    private static C13244c m35436d(C12134o oVar) {
        C13246a a = C13244c.m38715a(oVar.f32223a).mo32456a(oVar.f32227e).mo32457a("fresco_cache");
        if (oVar.f32230h > 0) {
            a.mo32454a(oVar.f32230h);
        }
        a.mo32455a((C13273b) C13274c.m38814a());
        return a.mo32458a();
    }

    /* renamed from: e */
    private static C13244c m35438e(C12134o oVar) {
        C13246a a = C13244c.m38715a(oVar.f32223a).mo32456a(oVar.f32227e).mo32457a("fresco_small_cache");
        if (oVar.f32231i > 0) {
            a.mo32454a(oVar.f32231i);
        }
        a.mo32455a((C13273b) C13274c.m38814a());
        return a.mo32458a();
    }

    /* renamed from: b */
    private static void m35433b(C12134o oVar, C13615a aVar) {
        if (oVar.f32226d != null) {
            aVar.mo33196a((C13683ai) new C12163o(oVar.f32226d));
        }
    }

    /* renamed from: d */
    private static void m35437d(C12134o oVar, C13615a aVar) {
        if (oVar.f32235m) {
            HashSet hashSet = new HashSet();
            C12179r.m35427a(new C18620c());
            hashSet.add(C12179r.m35426a());
            aVar.mo33198a((Set<C13653c>) hashSet);
            m35439f(oVar);
        }
    }

    /* renamed from: c */
    private static void m35435c(C12134o oVar, C13615a aVar) {
        aVar.mo33194a((C13310j<C13586q>) new C12148b<C13586q>((ActivityManager) oVar.f32223a.getSystemService("activity"), (int) oVar.f32228f));
        aVar.mo33202b((C13310j<C13586q>) new C12155h<C13586q>((int) oVar.f32229g));
    }

    /* renamed from: a */
    private static void m35430a(C12134o oVar, C13615a aVar) {
        if (oVar.f32239q) {
            aVar.mo33195a((C13318c) C12176q.m35423a());
            aVar.mo33197a(new C13802ac(C13799ab.m40732a().mo33425a(C12176q.m35423a()).mo33426a()));
        }
    }

    /* renamed from: a */
    public static int[] m35431a(C13460a aVar, int[] iArr, C12107e eVar) {
        boolean z;
        int d = aVar.mo32995d();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        int i = -1;
        for (int i2 : iArr) {
            if (i2 >= d || i2 < 0 || i2 == i) {
                z2 = true;
            } else {
                arrayList.add(Integer.valueOf(i2));
                i = i2;
            }
        }
        if (!z2) {
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = false;
                    break;
                } else if (iArr[i3] == d - 1) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            z2 = !z;
        }
        if (z2 && eVar != null) {
            eVar.mo29805a(d, iArr);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
        return iArr2;
    }
}
