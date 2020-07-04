package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.b */
public final class C31636b {
    /* renamed from: a */
    public static final <R> List<R> m102799a(LinkedHashMap<C31643e<R>, List<R>> linkedHashMap) {
        C7573i.m23587b(linkedHashMap, "$this$toResultList");
        List<R> arrayList = new ArrayList<>();
        Collection<List> values = linkedHashMap.values();
        C7573i.m23582a((Object) values, "values");
        for (List list : values) {
            C7573i.m23582a((Object) list, "list");
            arrayList.addAll(list);
        }
        return arrayList;
    }
}
