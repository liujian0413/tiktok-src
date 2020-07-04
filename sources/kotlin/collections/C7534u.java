package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7549c;

/* renamed from: kotlin.collections.u */
public class C7534u extends C7533t {
    /* renamed from: d */
    public static final <T> List<T> m23485d(List<T> list) {
        C7573i.m23587b(list, "$this$asReversed");
        return new C7512al<>(list);
    }

    /* renamed from: a */
    public static final int m23483a(List<?> list, int i) {
        int a = C7525m.m23459a(list);
        if (i >= 0 && a >= i) {
            return C7525m.m23459a(list) - i;
        }
        StringBuilder sb = new StringBuilder("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C7549c(0, C7525m.m23459a(list)));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: b */
    public static final int m23484b(List<?> list, int i) {
        int size = list.size();
        if (i >= 0 && size >= i) {
            return list.size() - i;
        }
        StringBuilder sb = new StringBuilder("Position index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C7549c(0, list.size()));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
