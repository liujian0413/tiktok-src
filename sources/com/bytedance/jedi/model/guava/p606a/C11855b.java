package com.bytedance.jedi.model.guava.p606a;

import com.bytedance.jedi.model.guava.base.C11864b;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.bytedance.jedi.model.guava.a.b */
public final class C11855b {
    /* renamed from: a */
    public static <T> boolean m34634a(Collection<T> collection, Iterator<? extends T> it) {
        C11864b.m34655a(collection);
        C11864b.m34655a(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}
