package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.collections.af */
public class C7508af {
    /* renamed from: a */
    public static final <K, V> V m23382a(Map<K, ? extends V> map, K k) {
        C7573i.m23587b(map, "$this$getOrImplicitDefault");
        if (map instanceof C47899ad) {
            return ((C47899ad) map).mo120056a(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        StringBuilder sb = new StringBuilder("Key ");
        sb.append(k);
        sb.append(" is missing in the map.");
        throw new NoSuchElementException(sb.toString());
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m23383a(Map<K, V> map, C7562b<? super K, ? extends V> bVar) {
        C7573i.m23587b(map, "$this$withDefault");
        C7573i.m23587b(bVar, "defaultValue");
        if (map instanceof C47900aj) {
            return C7507ae.m23383a(((C47900aj) map).mo120057a(), bVar);
        }
        return new C47901ak<>(map, bVar);
    }
}
