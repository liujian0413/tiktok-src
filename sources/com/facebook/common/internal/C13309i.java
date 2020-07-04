package com.facebook.common.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.common.internal.i */
public final class C13309i {
    /* renamed from: b */
    public static <E> CopyOnWriteArraySet<E> m38952b() {
        return new CopyOnWriteArraySet<>();
    }

    /* renamed from: a */
    public static <E> Set<E> m38950a() {
        return m38951a(new IdentityHashMap());
    }

    /* renamed from: a */
    private static <E> Set<E> m38951a(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }
}
