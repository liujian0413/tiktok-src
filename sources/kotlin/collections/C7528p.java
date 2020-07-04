package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.collections.p */
public class C7528p extends C7527o {
    /* renamed from: b */
    private static final <T> boolean m23472b(Collection<? extends T> collection) {
        if (collection.size() <= 2 || !(collection instanceof ArrayList)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final <T> Integer m23470a(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$collectionSizeOrNull");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* renamed from: a */
    public static final <T> int m23469a(Iterable<? extends T> iterable, int i) {
        C7573i.m23587b(iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    /* renamed from: a */
    public static final <T> Collection<T> m23471a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Collection<T> collection;
        C7573i.m23587b(iterable, "$this$convertToSetForSetOperationWith");
        C7573i.m23587b(iterable2, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            collection = C7525m.m23514g(iterable);
        } else if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        } else {
            Collection<T> collection2 = (Collection) iterable;
            if (!m23472b(collection2)) {
                return collection2;
            }
            collection = C7525m.m23514g(iterable);
        }
        return collection;
    }
}
