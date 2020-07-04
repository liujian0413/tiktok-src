package com.p280ss.android.ugc.aweme.filter;

import com.google.common.base.C17440n;
import com.google.common.collect.C17794bt;
import com.google.common.collect.C17862by;
import com.google.common.collect.C17863bz;
import com.google.common.collect.C17873ca;
import com.google.common.collect.C17882cb;
import com.p280ss.android.ugc.aweme.effectplatform.C27480d;
import com.p280ss.android.ugc.aweme.filter.p1244c.C29276a;
import com.p280ss.android.ugc.aweme.filter.p1244c.C29277b;
import com.p280ss.android.ugc.aweme.filter.p1247f.C29293a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.vesdk.C45323k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.r */
public final class C29327r {

    /* renamed from: a */
    public static final C29328a f77322a = new C29328a(null);

    /* renamed from: com.ss.android.ugc.aweme.filter.r$a */
    public static final class C29328a {

        /* renamed from: com.ss.android.ugc.aweme.filter.r$a$a */
        static final class C29329a<T> implements C17440n<Entry<K, V>> {

            /* renamed from: a */
            final /* synthetic */ C29293a f77323a;

            /* renamed from: b */
            final /* synthetic */ C17794bt f77324b;

            C29329a(C29293a aVar, C17794bt btVar) {
                this.f77323a = aVar;
                this.f77324b = btVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public boolean apply(Entry<EffectCategoryModel, C29324o> entry) {
                C17862by b = this.f77323a.mo74974b();
                if (entry == null) {
                    C7573i.m23580a();
                }
                if (b.containsEntry(entry.getKey(), entry.getValue()) || this.f77324b.containsValue(entry.getValue())) {
                    return true;
                }
                return false;
            }
        }

        private C29328a() {
        }

        /* renamed from: a */
        public final void mo75003a(C29324o oVar, C29331t tVar) {
            if (oVar != null && tVar != null) {
                C17862by a = tVar.mo74973a();
                List list = (List) C35574k.m114859a().mo70097l().mo74951d().mo74818a().getValue();
                if (list == null) {
                    list = new ArrayList();
                }
                C7573i.m23582a((Object) list, "CameraClient.getAPI().fi….value ?: mutableListOf()");
                C29296g gVar = oVar;
                if (m96185b(list, gVar) == -1 && m96177a(oVar, tVar.mo74973a()) != null) {
                    Collection values = a.values();
                    C7573i.m23582a((Object) values, "allItems.values()");
                    C35574k.m114859a().mo70097l().mo74951d().mo74818a().setValue(m96178a(C7525m.m23516h((Iterable<? extends T>) values), list, gVar, new C29276a()));
                }
            }
        }

        /* renamed from: a */
        private static boolean m96184a(List<? extends C29296g> list, C29296g gVar) {
            if (list == null || gVar == null) {
                return true;
            }
            for (C29296g gVar2 : list) {
                if (gVar2.f77266a == gVar.f77266a) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final void mo75002a(C29324o oVar) {
            if (oVar != null) {
                C29296g gVar = oVar;
                if (C29341z.m96266c(gVar)) {
                    List list = (List) C35574k.m114859a().mo70097l().mo74951d().mo74818a().getValue();
                    if (list != null) {
                        C7573i.m23582a((Object) list, "CameraClient.getAPI().fi…Sources().value ?: return");
                        if (m96184a(list, gVar)) {
                            C35574k.m114859a().mo70097l().mo74951d().mo74818a().setValue(m96187c(list, gVar));
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private static void m96183a(Map<String, Effect> map, C29293a aVar) {
            for (Entry entry : aVar.mo74974b().entries()) {
                EffectCategoryModel effectCategoryModel = (EffectCategoryModel) entry.getKey();
                C29324o oVar = (C29324o) entry.getValue();
                C7573i.m23582a((Object) effectCategoryModel, C45323k.f116730a);
                String str = effectCategoryModel.name;
                C7573i.m23582a((Object) str, "k.name");
                C7573i.m23582a((Object) oVar, "v");
                map.put(str, C27480d.m90098a(oVar));
            }
        }

        public /* synthetic */ C29328a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m96179a(C17794bt<EffectCategoryResponse, C29296g> btVar) {
            if (btVar != null) {
                synchronized (btVar) {
                    C17794bt b = C17863bz.m59388a().mo46190b().mo46189b();
                    b.putAll(btVar);
                    int i = 0;
                    Collection<C29296g> values = b.values();
                    C7573i.m23582a((Object) values, "filters.values()");
                    for (C29296g gVar : values) {
                        C7573i.m23582a((Object) gVar, "filterBean");
                        int i2 = i + 1;
                        gVar.f77270e = i;
                        i = i2;
                    }
                }
            }
        }

        /* renamed from: a */
        private static void m96181a(C29296g gVar) {
            boolean z;
            if (gVar != null) {
                CharSequence b = gVar.mo74978b();
                if (b == null || b.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    gVar.mo74977a(C29340y.m96241a().mo75014a(gVar));
                }
            }
        }

        /* renamed from: a */
        public static void m96182a(List<C29296g> list) {
            C7573i.m23587b(list, "values");
            synchronized (list) {
                int i = 0;
                for (C29296g gVar : list) {
                    int i2 = i + 1;
                    gVar.f77270e = i;
                    i = i2;
                }
            }
        }

        /* renamed from: a */
        private static EffectCategoryModel m96177a(C29324o oVar, C17862by<EffectCategoryModel, C29324o> byVar) {
            if (oVar == null || byVar == null) {
                return null;
            }
            Set<EffectCategoryModel> keySet = byVar.keySet();
            if (keySet != null) {
                for (EffectCategoryModel effectCategoryModel : keySet) {
                    C7573i.m23582a((Object) effectCategoryModel, "effectCategoryModel");
                    if (C7573i.m23585a((Object) effectCategoryModel.name, (Object) oVar.f77319n)) {
                        return effectCategoryModel;
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        private static int m96185b(List<? extends C29296g> list, C29296g gVar) {
            if (list == null || gVar == null) {
                return -1;
            }
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                if (((C29296g) next).f77266a == gVar.f77266a) {
                    return i;
                }
                i = i2;
            }
            return -1;
        }

        /* renamed from: c */
        private static List<C29296g> m96187c(List<? extends C29296g> list, C29296g gVar) {
            List<C29296g> arrayList = new ArrayList<>();
            for (C29296g gVar2 : list) {
                int i = gVar2.f77266a;
                if (gVar == null || i != gVar.f77266a) {
                    arrayList.add(gVar2);
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        private static void m96186b(C17794bt<EffectCategoryResponse, C29296g> btVar, C29293a aVar) {
            for (Entry entry : aVar.mo74975c().entries()) {
                EffectCategoryModel effectCategoryModel = (EffectCategoryModel) entry.getKey();
                C29324o oVar = (C29324o) entry.getValue();
                C7573i.m23582a((Object) effectCategoryModel, C45323k.f116730a);
                C7573i.m23582a((Object) oVar, "v");
                C29330s.m96193a(btVar, effectCategoryModel, oVar);
            }
        }

        /* renamed from: a */
        private static void m96180a(C17794bt<EffectCategoryResponse, C29296g> btVar, C29293a aVar) {
            Object obj;
            boolean z;
            C17862by a = C17873ca.m59404a(aVar.mo74973a(), (C17440n<? super Entry<K, V>>) new C29329a<Object>(aVar, btVar));
            C17794bt b = C17863bz.m59388a().mo46190b().mo46189b();
            b.putAll(a);
            Collection values = b.values();
            C7573i.m23582a((Object) values, "filteredEntries.values()");
            Iterator it = values.iterator();
            while (true) {
                Object obj2 = null;
                if (!it.hasNext()) {
                    break;
                }
                C29324o oVar = (C29324o) it.next();
                List j = FilterManager.m95700a().mo74726j();
                C7573i.m23582a((Object) j, "FilterManager.getInstance().getFilterList()");
                Iterator it2 = j.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    C29296g gVar = (C29296g) next;
                    C7573i.m23582a((Object) gVar, "it");
                    String str = gVar.f77268c;
                    C7573i.m23582a((Object) oVar, "filter");
                    if (C7573i.m23585a((Object) str, (Object) oVar.f77268c)) {
                        obj2 = next;
                        break;
                    }
                }
                C29296g gVar2 = (C29296g) obj2;
                if (gVar2 != null) {
                    C7573i.m23582a((Object) oVar, "filter");
                    oVar.mo74977a(gVar2.mo74978b());
                }
                C7573i.m23582a((Object) oVar, "filter");
                String b2 = oVar.mo74978b();
                if (b2 != null) {
                    if (b2.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                    }
                }
                oVar.mo74977a(C29340y.m96241a().mo75014a((C29296g) oVar));
            }
            C17882cb keys = btVar.keys();
            btVar.clear();
            for (Entry entry : b.asMap().entrySet()) {
                C7573i.m23582a((Object) keys, "existingCategories");
                Iterator it3 = keys.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) obj;
                    C7573i.m23582a((Object) effectCategoryResponse, "it");
                    String str2 = effectCategoryResponse.f113500id;
                    Object key = entry.getKey();
                    C7573i.m23582a(key, "entry.key");
                    if (C7573i.m23585a((Object) str2, (Object) ((EffectCategoryModel) key).f113499id)) {
                        break;
                    }
                }
                EffectCategoryResponse effectCategoryResponse2 = (EffectCategoryResponse) obj;
                if (effectCategoryResponse2 == null) {
                    Object key2 = entry.getKey();
                    C7573i.m23582a(key2, "entry.key");
                    effectCategoryResponse2 = C29330s.m96192a((EffectCategoryModel) key2);
                }
                btVar.putAll(effectCategoryResponse2, (Iterable) entry.getValue());
            }
        }

        /* renamed from: a */
        public final void mo75004a(Map<String, Effect> map, C17794bt<EffectCategoryResponse, C29296g> btVar, C29293a aVar) {
            C7573i.m23587b(map, "categoryEffectMap");
            C7573i.m23587b(btVar, "categorySourcesValue");
            C7573i.m23587b(aVar, "patch");
            m96183a(map, aVar);
            m96180a(btVar, aVar);
            m96186b(btVar, aVar);
        }

        /* renamed from: a */
        private List<C29296g> m96178a(List<? extends C29296g> list, List<? extends C29296g> list2, C29296g gVar, C29277b bVar) {
            C7573i.m23587b(list, "allFilters");
            C7573i.m23587b(list2, "prepared");
            C7573i.m23587b(gVar, "filtersToMerge");
            if (m96184a(list2, gVar)) {
                return list2;
            }
            int indexOf = list.indexOf(gVar);
            int i = 0;
            C29296g gVar2 = null;
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C7525m.m23465b();
                }
                C29296g gVar3 = (C29296g) next;
                if (i2 < indexOf && bVar.mo74938a(gVar3)) {
                    gVar2 = gVar3;
                }
                i2 = i3;
            }
            List<C29296g> arrayList = new ArrayList<>();
            if (gVar2 == null) {
                arrayList.add(gVar);
                arrayList.addAll(list2);
            } else {
                int b = m96185b(list2, gVar2);
                for (Object next2 : list2) {
                    int i4 = i + 1;
                    if (i < 0) {
                        C7525m.m23465b();
                    }
                    C29296g gVar4 = (C29296g) next2;
                    if (i != b) {
                        m96181a(gVar4);
                        arrayList.add(gVar4);
                    } else {
                        m96181a(gVar4);
                        arrayList.add(gVar4);
                        m96181a(gVar);
                        arrayList.add(gVar);
                    }
                    i = i4;
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static final void m96174a(C17794bt<EffectCategoryResponse, C29296g> btVar) {
        C29328a.m96179a(btVar);
    }

    /* renamed from: a */
    public static final void m96175a(List<C29296g> list) {
        C29328a.m96182a(list);
    }

    /* renamed from: a */
    public static final void m96176a(Map<String, Effect> map, C17794bt<EffectCategoryResponse, C29296g> btVar, C29293a aVar) {
        f77322a.mo75004a(map, btVar, aVar);
    }
}
