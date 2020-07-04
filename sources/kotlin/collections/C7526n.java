package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.collections.n */
public class C7526n {
    /* renamed from: a */
    public static final <T> List<T> m23457a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C7573i.m23582a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: a */
    public static final <T> Object[] m23458a(T[] tArr, boolean z) {
        C7573i.m23587b(tArr, "$this$copyToArrayOfAny");
        if (z && C7573i.m23585a((Object) tArr.getClass(), (Object) Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C7573i.m23582a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
