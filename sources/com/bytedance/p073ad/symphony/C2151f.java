package com.bytedance.p073ad.symphony;

import android.content.Context;
import com.bytedance.p073ad.symphony.p076b.p077a.C2096a;
import com.bytedance.p073ad.symphony.p084g.C2156a;
import com.bytedance.p073ad.symphony.p084g.C2157b;
import com.bytedance.p073ad.symphony.p085h.C2159a;
import com.bytedance.p073ad.symphony.provider.AbsNativeAdProvider;
import com.bytedance.p073ad.symphony.provider.C2195b;
import com.bytedance.p073ad.symphony.provider.C2195b.C2196a;
import com.bytedance.p073ad.symphony.util.C2203f;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.ad.symphony.f */
public final class C2151f {
    /* renamed from: a */
    private static void m9382a(List<C2157b> list) {
        if (C2114c.m9317b()) {
            StringBuilder sb = new StringBuilder();
            List arrayList = new ArrayList(list);
            List arrayList2 = new ArrayList();
            int i = 0;
            while (arrayList != null && !arrayList.isEmpty()) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append("-->");
                }
                sb.append("[");
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    C2157b bVar = (C2157b) arrayList.get(i3);
                    if (i3 > 0) {
                        sb.append(", ");
                    } else {
                        arrayList2 = bVar.mo7846e();
                    }
                    sb.append(bVar.mo7844d());
                }
                sb.append("]");
                arrayList = arrayList2;
                i = i2;
            }
            new StringBuilder("requestQueue: ").append(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m9383a(List<C2157b> list, List<C2157b> list2) {
        if (!C2203f.m9514a(list) && !C2203f.m9514a(list2)) {
            for (C2157b bVar : list) {
                for (C2157b a : list2) {
                    a.mo7838a(bVar);
                    bVar.mo7837a();
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m9384a(List<C2157b> list, String str, C2096a aVar) {
        for (C2157b bVar : list) {
            if (!AbsNativeAdProvider.isInhouseNativeAdProvider(bVar.mo7844d())) {
                C2195b bVar2 = (C2195b) aVar.f7188c.get(Integer.valueOf(bVar.mo7844d()));
                if (bVar2 != null && bVar2.hasValidAd(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static List<C2157b> m9380a(Context context, C2159a aVar, String str, C2196a aVar2, C2096a aVar3) {
        if (aVar == null) {
            return null;
        }
        List c = aVar.mo7849c();
        List<C2157b> b = m9385b(context, aVar.mo7851e(), str, aVar2, aVar3);
        b.addAll(m9381a(context, c, str, aVar2, aVar3));
        return b;
    }

    /* renamed from: a */
    private static C2156a m9379a(Context context, int i, String str, C2196a aVar, C2096a aVar2) {
        C2156a aVar3;
        C2195b bVar = (C2195b) aVar2.f7188c.get(Integer.valueOf(i));
        C2159a a = aVar2.mo7788b().mo7853a(str);
        if (bVar == null || a == null) {
            aVar3 = null;
        } else {
            aVar3 = new C2156a(str, bVar, a, aVar);
        }
        if (aVar3 == null || !aVar3.mo7840a(context)) {
            return null;
        }
        new StringBuilder("handler-->").append(aVar3.mo7844d());
        return aVar3;
    }

    /* renamed from: b */
    private static List<C2157b> m9385b(Context context, List<Integer> list, String str, C2196a aVar, C2096a aVar2) {
        LinkedList linkedList = new LinkedList();
        if (list == null) {
            return linkedList;
        }
        for (Integer intValue : list) {
            C2156a a = m9379a(context, intValue.intValue(), str, aVar, aVar2);
            if (a != null) {
                linkedList.add(a);
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    private static List<C2157b> m9381a(Context context, List<List<Integer>> list, String str, C2196a aVar, C2096a aVar2) {
        LinkedList linkedList = new LinkedList();
        if (C2203f.m9514a(list) || C2203f.m9514a((List) list.get(0))) {
            return linkedList;
        }
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            List list2 = (List) list.get(i);
            linkedList3.clear();
            for (int i2 = 0; i2 < list2.size(); i2++) {
                C2156a a = m9379a(context, ((Integer) list2.get(i2)).intValue(), str, aVar, aVar2);
                if (a != null) {
                    linkedList3.add(a);
                }
            }
            if (!linkedList3.isEmpty()) {
                if (m9384a(linkedList3, str, aVar2)) {
                    break;
                } else if (linkedList.isEmpty()) {
                    linkedList.addAll(linkedList3);
                    linkedList2.clear();
                    linkedList2.addAll(linkedList3);
                } else {
                    m9383a(linkedList3, linkedList2);
                    linkedList2.clear();
                    linkedList2.addAll(linkedList3);
                }
            }
        }
        m9382a(linkedList);
        return linkedList;
    }
}
