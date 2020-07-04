package com.bytedance.common.utility.collection;

import com.bytedance.common.utility.reflect.C6320a;
import java.util.Collection;

/* renamed from: com.bytedance.common.utility.collection.b */
public final class C6307b {
    /* renamed from: a */
    public static void m19565a(Object obj) {
        C6320a.m19600a(obj, "clear", new Object[0]);
    }

    /* renamed from: a */
    public static <T> boolean m19566a(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }
}
