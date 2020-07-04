package com.p280ss.android.ugc.aweme.filter.p1243b;

import com.bytedance.apm.util.C9653q;
import com.google.common.collect.C17794bt;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29341z;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.b.a */
public final class C29237a {

    /* renamed from: a */
    private final List<C29296g> f77157a = new ArrayList();

    public C29237a(List<? extends C29296g> list) {
        boolean z;
        if (list != null) {
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (((C29296g) next).f77266a > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            this.f77157a.addAll((List) arrayList);
        }
    }

    /* renamed from: a */
    public final void mo74855a(C29296g gVar) {
        if (gVar != null && !m95899a(this.f77157a, gVar)) {
            C17794bt btVar = (C17794bt) C35574k.m114859a().mo70097l().mo74951d().mo74827c().getValue();
            if (btVar != null) {
                C7573i.m23582a((Object) btVar, "CameraClient.getAPI().fi…Sources().value ?: return");
                Collection values = btVar.values();
                C7573i.m23582a((Object) values, "categorySources.values()");
                Iterable h = C7525m.m23516h((Iterable<? extends T>) values);
                Collection arrayList = new ArrayList();
                for (Object next : h) {
                    if (C29341z.m96266c((C29296g) next)) {
                        arrayList.add(next);
                    }
                }
                List list = (List) arrayList;
                if (C9653q.m28546a()) {
                    C35574k.m114859a().mo70097l().mo74951d().mo74818a().setValue(list);
                } else {
                    C35574k.m114859a().mo70097l().mo74951d().mo74818a().postValue(list);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m95899a(List<? extends C29296g> list, C29296g gVar) {
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
}
