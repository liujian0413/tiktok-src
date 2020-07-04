package com.bytedance.jedi.model.p608h;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.model.h.m */
public final class C11969m<K, V> extends WeakReference<V> {

    /* renamed from: a */
    public final K f31888a;

    public C11969m(K k, V v, ReferenceQueue<V> referenceQueue) {
        C7573i.m23587b(referenceQueue, "q");
        super(v, referenceQueue);
        this.f31888a = k;
    }
}
