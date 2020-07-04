package kotlin.collections;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;
import kotlin.sequences.C7604g;

/* renamed from: kotlin.collections.ai */
public class C7511ai extends C7510ah {
    /* renamed from: e */
    public static final <K, V> C7604g<Entry<K, V>> m23404e(Map<? extends K, ? extends V> map) {
        C7573i.m23587b(map, "$this$asSequence");
        return C7525m.m23526p(map.entrySet());
    }
}
