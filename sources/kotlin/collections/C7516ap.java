package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.collections.ap */
public class C7516ap extends C7515ao {
    /* renamed from: a */
    public static final <T> Set<T> m23413a(Set<? extends T> set, T t) {
        C7573i.m23587b(set, "$this$plus");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C7507ae.m23386a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    /* renamed from: a */
    public static final <T> Set<T> m23412a(Set<? extends T> set, Iterable<? extends T> iterable) {
        int i;
        C7573i.m23587b(set, "$this$plus");
        C7573i.m23587b(iterable, "elements");
        Integer a = C7525m.m23470a(iterable);
        if (a != null) {
            i = set.size() + a.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C7507ae.m23386a(i));
        linkedHashSet.addAll(set);
        C7525m.m23478a((Collection) linkedHashSet, (Iterable) iterable);
        return linkedHashSet;
    }
}
