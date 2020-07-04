package com.p280ss.android.ugc.aweme.main;

import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.main.dr */
public abstract class C32998dr<T> implements Runnable {

    /* renamed from: a */
    protected WeakReference<T> f85967a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo84484a(T t);

    public void run() {
        if (this.f85967a != null && this.f85967a.get() != null) {
            mo84484a(this.f85967a.get());
        }
    }

    public C32998dr(T t) {
        this.f85967a = new WeakReference<>(t);
    }
}
