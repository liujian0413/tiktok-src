package com.bytedance.jedi.model.p608h;

import com.p280ss.android.vesdk.C45323k;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.model.h.n */
public final class C11970n<T> {

    /* renamed from: a */
    private final ConcurrentHashMap<String, WeakReference<T>> f31889a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final ReferenceQueue<T> f31890b = new ReferenceQueue<>();

    /* renamed from: a */
    public final T mo29573a(String str) {
        C7573i.m23587b(str, C45323k.f116730a);
        WeakReference weakReference = (WeakReference) this.f31889a.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo29574a(String str, T t) {
        C7573i.m23587b(str, C45323k.f116730a);
        C7573i.m23587b(t, "v");
        this.f31889a.put(str, new C11969m(str, t, this.f31890b));
    }
}
