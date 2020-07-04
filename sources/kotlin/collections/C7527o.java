package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7549c;

/* renamed from: kotlin.collections.o */
public class C7527o extends C7526n {
    /* renamed from: a */
    public static final <T> List<T> m23461a() {
        return EmptyList.INSTANCE;
    }

    /* renamed from: b */
    public static final void m23465b() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: c */
    public static final void m23467c() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: a */
    public static final <T> int m23459a(List<? extends T> list) {
        C7573i.m23587b(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: a */
    public static final <T> Collection<T> m23460a(T[] tArr) {
        C7573i.m23587b(tArr, "$this$asCollection");
        return new C7518f<>(tArr, false);
    }

    /* renamed from: b */
    public static final <T> List<T> m23464b(T... tArr) {
        C7573i.m23587b(tArr, "elements");
        if (tArr.length > 0) {
            return C7519g.m23418a(tArr);
        }
        return C7525m.m23461a();
    }

    /* renamed from: c */
    public static final <T> List<T> m23466c(T... tArr) {
        C7573i.m23587b(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C7518f(tArr, true));
    }

    /* renamed from: d */
    public static final <T> ArrayList<T> m23468d(T... tArr) {
        C7573i.m23587b(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C7518f(tArr, true));
    }

    /* renamed from: a */
    public static final C7549c m23462a(Collection<?> collection) {
        C7573i.m23587b(collection, "$this$indices");
        return new C7549c(0, collection.size() - 1);
    }

    /* renamed from: b */
    public static final <T> List<T> m23463b(List<? extends T> list) {
        C7573i.m23587b(list, "$this$optimizeReadOnlyList");
        switch (list.size()) {
            case 0:
                return C7525m.m23461a();
            case 1:
                return C7525m.m23457a(list.get(0));
            default:
                return list;
        }
    }
}
