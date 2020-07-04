package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.collections.j */
public class C7522j extends C7521i {
    /* renamed from: a */
    public static final <T> List<T> m23418a(T[] tArr) {
        C7573i.m23587b(tArr, "$this$asList");
        List<T> a = C47910l.m148851a(tArr);
        C7573i.m23582a((Object) a, "ArraysUtilJVM.asList(this)");
        return a;
    }

    /* renamed from: a */
    public static final <T> void m23419a(T[] tArr, Comparator<? super T> comparator) {
        C7573i.m23587b(tArr, "$this$sortWith");
        C7573i.m23587b(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* renamed from: a */
    public static final <T> T[] m23421a(T[] tArr, T t) {
        C7573i.m23587b(tArr, "$this$plus");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t;
        C7573i.m23582a((Object) copyOf, "result");
        return copyOf;
    }

    /* renamed from: a */
    public static final <T> T[] m23422a(T[] tArr, T[] tArr2) {
        C7573i.m23587b(tArr, "$this$plus");
        C7573i.m23587b(tArr2, "elements");
        int length = tArr2.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        System.arraycopy(tArr2, 0, copyOf, 1, length);
        C7573i.m23582a((Object) copyOf, "result");
        return copyOf;
    }

    /* renamed from: a */
    public static final char[] m23420a(char[] cArr, int i, int i2) {
        C7573i.m23587b(cArr, "$this$copyOfRangeImpl");
        C7519g.m23417a(i2, cArr.length);
        char[] copyOfRange = Arrays.copyOfRange(cArr, i, i2);
        C7573i.m23582a((Object) copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }
}
