package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7577n;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.collections.t */
public class C7533t extends C7532s {
    /* renamed from: a */
    public static final <T> boolean m23476a(Iterable<? extends T> iterable, C7562b<? super T, Boolean> bVar) {
        C7573i.m23587b(iterable, "$this$retainAll");
        C7573i.m23587b(bVar, "predicate");
        return m23477a(iterable, bVar, false);
    }

    /* renamed from: a */
    public static final <T> boolean m23479a(Collection<? super T> collection, T[] tArr) {
        C7573i.m23587b(collection, "$this$addAll");
        C7573i.m23587b(tArr, "elements");
        return collection.addAll(C7519g.m23418a(tArr));
    }

    /* renamed from: b */
    public static final <T> boolean m23482b(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C7573i.m23587b(collection, "$this$removeAll");
        C7573i.m23587b(iterable, "elements");
        return C7577n.m23621b(collection).removeAll(C7525m.m23471a(iterable, (Iterable<? extends T>) collection));
    }

    /* renamed from: a */
    public static final <T> boolean m23478a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C7573i.m23587b(collection, "$this$addAll");
        C7573i.m23587b(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static final <T> boolean m23480a(List<T> list, C7562b<? super T, Boolean> bVar) {
        C7573i.m23587b(list, "$this$removeAll");
        C7573i.m23587b(bVar, "predicate");
        return m23481a(list, bVar, true);
    }

    /* renamed from: a */
    private static final <T> boolean m23477a(Iterable<? extends T> iterable, C7562b<? super T, Boolean> bVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) bVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: a */
    private static final <T> boolean m23481a(List<T> list, C7562b<? super T, Boolean> bVar, boolean z) {
        int i;
        if (list instanceof RandomAccess) {
            int a = C7525m.m23459a(list);
            if (a >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    Object obj = list.get(i2);
                    if (!((Boolean) bVar.invoke(obj)).booleanValue()) {
                        if (i != i2) {
                            list.set(i, obj);
                        }
                        i++;
                    }
                    if (i2 == a) {
                        break;
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i >= list.size()) {
                return false;
            }
            int a2 = C7525m.m23459a(list);
            if (a2 >= i) {
                while (true) {
                    list.remove(a2);
                    if (a2 == i) {
                        break;
                    }
                    a2--;
                }
            }
            return true;
        } else if (list != null) {
            return m23477a(C7577n.m23616a((Object) list), bVar, true);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
    }
}
