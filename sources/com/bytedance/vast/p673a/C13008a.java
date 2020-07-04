package com.bytedance.vast.p673a;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.vast.a.a */
public final class C13008a {
    /* renamed from: a */
    public static final <T> List<T> m37957a(List<T> list, T t) {
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(t);
        return list;
    }

    /* renamed from: b */
    public static final <T> List<T> m37959b(List<T> list, T t) {
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(0, t);
        return list;
    }

    /* renamed from: a */
    public static final <T> Set<T> m37958a(Set<T> set, T t) {
        if (set == null) {
            set = new HashSet<>();
        }
        set.add(t);
        return set;
    }
}
