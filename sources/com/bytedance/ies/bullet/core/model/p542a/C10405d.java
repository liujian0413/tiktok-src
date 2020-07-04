package com.bytedance.ies.bullet.core.model.p542a;

import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ies.bullet.core.model.a.d */
public final class C10405d<T> implements C10404c<T> {

    /* renamed from: a */
    private WeakReference<T> f28134a;

    /* renamed from: a */
    public final void mo25110a() {
        WeakReference<T> weakReference = this.f28134a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f28134a = null;
    }

    /* renamed from: b */
    public final T mo25197b() {
        WeakReference<T> weakReference = this.f28134a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public C10405d(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.f28134a = weakReference;
    }
}
