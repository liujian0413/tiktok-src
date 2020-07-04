package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.collections.ag */
public class C7509ag extends C7508af {
    /* renamed from: a */
    public static final <K, V> Map<K, V> m23385a(Pair<? extends K, ? extends V> pair) {
        C7573i.m23587b(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        C7573i.m23582a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m23384a(Map<? extends K, ? extends V> map) {
        C7573i.m23587b(map, "$this$toSingletonMap");
        Entry entry = (Entry) map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C7573i.m23582a((Object) singletonMap, "java.util.Collections.singletonMap(key, value)");
        C7573i.m23582a((Object) singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
