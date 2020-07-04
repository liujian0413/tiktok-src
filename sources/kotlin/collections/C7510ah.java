package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.sequences.C7604g;

/* renamed from: kotlin.collections.ah */
public class C7510ah extends C7509ag {
    /* renamed from: a */
    public static final <K, V> void m23397a(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        C7573i.m23587b(map, "$this$putAll");
        C7573i.m23587b(pairArr, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.component1(), pair.component2());
        }
    }

    /* renamed from: a */
    public static final <K, V> void m23395a(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        C7573i.m23587b(map, "$this$putAll");
        C7573i.m23587b(iterable, "pairs");
        for (Pair pair : iterable) {
            map.put(pair.component1(), pair.component2());
        }
    }

    /* renamed from: a */
    public static final <K, V> void m23396a(Map<? super K, ? super V> map, C7604g<? extends Pair<? extends K, ? extends V>> gVar) {
        C7573i.m23587b(map, "$this$putAll");
        C7573i.m23587b(gVar, "pairs");
        Iterator a = gVar.mo19416a();
        while (a.hasNext()) {
            Pair pair = (Pair) a.next();
            map.put(pair.component1(), pair.component2());
        }
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m23394a(Pair<? extends K, ? extends V>[] pairArr, M m) {
        C7573i.m23587b(pairArr, "$this$toMap");
        C7573i.m23587b(m, "destination");
        C7507ae.m23397a((Map<? super K, ? super V>) m, pairArr);
        return m;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m23387a() {
        C47912y yVar = C47912y.f122769a;
        if (yVar != null) {
            return yVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m23402c(Map<? extends K, ? extends V> map) {
        C7573i.m23587b(map, "$this$toMutableMap");
        return new LinkedHashMap<>(map);
    }

    /* renamed from: a */
    public static final int m23386a(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return i + (i / 3);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m23400b(Pair<? extends K, ? extends V>... pairArr) {
        C7573i.m23587b(pairArr, "pairs");
        Map<K, V> linkedHashMap = new LinkedHashMap<>(C7507ae.m23386a(pairArr.length));
        C7507ae.m23397a(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* renamed from: c */
    public static final <K, V> HashMap<K, V> m23401c(Pair<? extends K, ? extends V>... pairArr) {
        C7573i.m23587b(pairArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(C7507ae.m23386a(pairArr.length));
        C7507ae.m23397a((Map<? super K, ? super V>) hashMap, pairArr);
        return hashMap;
    }

    /* renamed from: d */
    public static final <K, V> Map<K, V> m23403d(Map<K, ? extends V> map) {
        C7573i.m23587b(map, "$this$optimizeReadOnlyMap");
        switch (map.size()) {
            case 0:
                return C7507ae.m23387a();
            case 1:
                return C7507ae.m23384a(map);
            default:
                return map;
        }
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m23399b(Map<? extends K, ? extends V> map) {
        C7573i.m23587b(map, "$this$toMap");
        switch (map.size()) {
            case 0:
                return C7507ae.m23387a();
            case 1:
                return C7507ae.m23384a(map);
            default:
                return C7507ae.m23402c(map);
        }
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m23388a(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Object next;
        C7573i.m23587b(iterable, "$this$toMap");
        if (!(iterable instanceof Collection)) {
            return C7507ae.m23403d(C7507ae.m23389a(iterable, (M) new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        switch (collection.size()) {
            case 0:
                return C7507ae.m23387a();
            case 1:
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return C7507ae.m23385a((Pair) next);
            default:
                return C7507ae.m23389a(iterable, (M) new LinkedHashMap(C7507ae.m23386a(collection.size())));
        }
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m23391a(C7604g<? extends Pair<? extends K, ? extends V>> gVar) {
        C7573i.m23587b(gVar, "$this$toMap");
        return C7507ae.m23403d(C7507ae.m23392a(gVar, (M) new LinkedHashMap()));
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m23393a(Pair<? extends K, ? extends V>... pairArr) {
        C7573i.m23587b(pairArr, "pairs");
        if (pairArr.length > 0) {
            return C7507ae.m23394a(pairArr, (M) new LinkedHashMap(C7507ae.m23386a(pairArr.length)));
        }
        return C7507ae.m23387a();
    }

    /* renamed from: b */
    public static final <K, V> V m23398b(Map<K, ? extends V> map, K k) {
        C7573i.m23587b(map, "$this$getValue");
        return C7507ae.m23382a(map, k);
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m23389a(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M m) {
        C7573i.m23587b(iterable, "$this$toMap");
        C7573i.m23587b(m, "destination");
        C7507ae.m23395a((Map<? super K, ? super V>) m, iterable);
        return m;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m23390a(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        C7573i.m23587b(map, "$this$plus");
        C7573i.m23587b(pair, "pair");
        if (map.isEmpty()) {
            return C7507ae.m23385a(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m23392a(C7604g<? extends Pair<? extends K, ? extends V>> gVar, M m) {
        C7573i.m23587b(gVar, "$this$toMap");
        C7573i.m23587b(m, "destination");
        C7507ae.m23396a((Map<? super K, ? super V>) m, gVar);
        return m;
    }
}
