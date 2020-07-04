package com.bytedance.common.utility.collection;

import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.common.utility.collection.e */
public final class C9727e<T> extends WeakReference<T> {

    /* renamed from: a */
    int f26466a;

    public final int hashCode() {
        return this.f26466a;
    }

    public C9727e(T t) {
        int i;
        super(t);
        if (t == null) {
            i = 0;
        } else {
            i = t.hashCode();
        }
        this.f26466a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9727e)) {
            return false;
        }
        C9727e eVar = (C9727e) obj;
        Object obj2 = super.get();
        Object obj3 = eVar.get();
        if (obj2 != null) {
            return obj2.equals(obj3);
        }
        if (obj2 == obj3) {
            return true;
        }
        return false;
    }
}
