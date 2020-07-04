package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.C16509er;
import com.google.android.gms.internal.measurement.C16510es;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.tagmanager.ar */
final class C17000ar implements C17002at {

    /* renamed from: a */
    private final /* synthetic */ Map f47630a;

    /* renamed from: b */
    private final /* synthetic */ Map f47631b;

    /* renamed from: c */
    private final /* synthetic */ Map f47632c;

    /* renamed from: d */
    private final /* synthetic */ Map f47633d;

    C17000ar(C16999aq aqVar, Map map, Map map2, Map map3, Map map4) {
        this.f47630a = map;
        this.f47631b = map2;
        this.f47632c = map3;
        this.f47633d = map4;
    }

    /* renamed from: a */
    public final void mo44225a(C16510es esVar, Set<C16509er> set, Set<C16509er> set2, C16997ao aoVar) {
        List list = (List) this.f47630a.get(esVar);
        this.f47631b.get(esVar);
        if (list != null) {
            set.addAll(list);
            aoVar.mo44212c();
        }
        List list2 = (List) this.f47632c.get(esVar);
        this.f47633d.get(esVar);
        if (list2 != null) {
            set2.addAll(list2);
            aoVar.mo44213d();
        }
    }
}
