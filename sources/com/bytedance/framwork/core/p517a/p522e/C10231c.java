package com.bytedance.framwork.core.p517a.p522e;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.framwork.core.a.e.c */
public final class C10231c {

    /* renamed from: com.bytedance.framwork.core.a.e.c$a */
    public interface C10232a<A, B> {
        /* renamed from: a */
        boolean mo24938a(A a, B b);
    }

    /* renamed from: a */
    public static boolean m30354a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <L, O> boolean m30353a(Collection<L> collection, O o, C10232a<? super L, O> aVar) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (aVar.mo24938a(it.next(), o)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
