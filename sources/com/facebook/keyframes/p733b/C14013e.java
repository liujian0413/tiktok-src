package com.facebook.keyframes.p733b;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.facebook.keyframes.b.e */
public final class C14013e {
    /* renamed from: a */
    public static List m41371a(List list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public static void m41372a(List list, Comparator comparator) {
        if (list != null && !list.isEmpty()) {
            Collections.sort(list, comparator);
        }
    }
}
