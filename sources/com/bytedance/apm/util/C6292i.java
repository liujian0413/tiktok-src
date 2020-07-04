package com.bytedance.apm.util;

import android.util.Pair;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.apm.util.i */
public final class C6292i {

    /* renamed from: com.bytedance.apm.util.i$a */
    public interface C6293a<A, B> {
        /* renamed from: a */
        boolean mo15075a(A a, B b);
    }

    /* renamed from: a */
    public static boolean m19525a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Map<String, String> m19527b(List<Pair<String, String>> list) {
        if (m19525a(list)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Pair pair : list) {
            if (!(pair == null || pair.first == null)) {
                hashMap.put(pair.first, pair.second);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String[] m19526a(Set<String> set) {
        String[] strArr = new String[set.size()];
        int i = 0;
        for (String str : set) {
            int i2 = i + 1;
            strArr[i] = str;
            i = i2;
        }
        return strArr;
    }

    /* renamed from: a */
    public static String m19523a(Collection collection, String str) {
        if (collection == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object next : collection) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(next.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static <L, O> boolean m19524a(Collection<L> collection, O o, C6293a<? super L, O> aVar) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (aVar.mo15075a(it.next(), o)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
