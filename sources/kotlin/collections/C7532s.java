package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.collections.s */
public class C7532s extends C7531r {
    /* renamed from: c */
    public static final <T extends Comparable<? super T>> void m23475c(List<T> list) {
        C7573i.m23587b(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: a */
    public static final <T> void m23474a(List<T> list, Comparator<? super T> comparator) {
        C7573i.m23587b(list, "$this$sortWith");
        C7573i.m23587b(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
