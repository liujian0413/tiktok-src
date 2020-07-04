package com.p280ss.android.ugc.aweme.tools.draft;

import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1641a.C41896a;
import com.p280ss.android.ugc.aweme.tools.draft.p1667b.C42278a;
import com.p280ss.android.ugc.aweme.tools.draft.p1668c.C42281b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.o */
final class C42298o {
    /* renamed from: a */
    static ArrayList<C27311c> m134544a() {
        ArrayList<C27311c> arrayList = new ArrayList<>();
        C42297n a = C42297n.m134523a();
        if (a != null) {
            C41530am.m132280a("Before DraftDataProvider.queryMusicAwemeCollection()");
            List d = a.mo103782d();
            C41530am.m132280a("After DraftDataProvider.queryMusicAwemeCollection()");
            arrayList.addAll(m134546a(d, false));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m134547a(List<C27311c> list) {
        if (!C6311g.m19573a(list)) {
            C41896a aVar = new C41896a();
            for (C27311c cVar : list) {
                if (cVar != null) {
                    aVar.mo102935a(cVar);
                    cVar.f72057z = aVar.mo102934a();
                }
            }
        }
    }

    /* renamed from: a */
    static ArrayList<C27311c> m134545a(boolean z, String str) {
        ArrayList<C27311c> arrayList = new ArrayList<>();
        C42297n a = C42297n.m134523a();
        if (a != null) {
            C41530am.m132280a("Before DraftDataProvider.queryMusicAwemeCollectionV2()");
            List<C42281b> a2 = a.mo103775a(str);
            C41530am.m132280a("After DraftDataProvider.queryMusicAwemeCollection()");
            for (C42281b bVar : a2) {
                List b = bVar.mo103764b();
                if (!C6311g.m19573a(b)) {
                    C27311c cVar = new C27311c();
                    cVar.f72053v = 3;
                    cVar.f72056y = bVar.mo103762a();
                    arrayList.add(cVar);
                    arrayList.addAll(m134546a(b, z));
                    if (z && arrayList.size() > 0) {
                        ((C27311c) arrayList.get(arrayList.size() - 1)).f72055x = true;
                    }
                }
            }
        }
        if (z) {
            m134547a(arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<C27311c> m134546a(List<C42278a> list, boolean z) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C42278a aVar = (C42278a) list.get(i);
            if (!(aVar == null || aVar.mo103759a() == null)) {
                List a = aVar.mo103759a();
                for (int i2 = 0; i2 < a.size(); i2++) {
                    C27311c cVar = (C27311c) a.get(i2);
                    if (cVar != null) {
                        if (i2 == 0 && !z && cVar.f72036e != null && !TextUtils.isEmpty(cVar.f72036e.getName())) {
                            C27311c cVar2 = new C27311c();
                            cVar2.f72036e = cVar.f72036e;
                            cVar2.f72053v = 1;
                            arrayList.add(cVar2);
                        }
                        if (i2 != a.size() - 1 || z) {
                            cVar.f72055x = false;
                        } else {
                            cVar.f72055x = true;
                        }
                        arrayList.add(cVar);
                    }
                }
            }
        }
        return arrayList;
    }
}
