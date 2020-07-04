package com.p280ss.android.ugc.aweme.hybrid.monitor;

import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.ad */
public final class C30374ad<T> implements C30390j<T> {

    /* renamed from: a */
    private WeakReference<T> f79860a;

    /* renamed from: a */
    public final T mo79978a() {
        WeakReference<T> weakReference = this.f79860a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo79979b() {
        WeakReference<T> weakReference = this.f79860a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f79860a = null;
    }

    public C30374ad(T t) {
        WeakReference<T> weakReference;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(t);
        }
        this.f79860a = weakReference;
    }
}
