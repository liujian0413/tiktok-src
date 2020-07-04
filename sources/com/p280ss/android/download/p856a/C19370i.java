package com.p280ss.android.download.p856a;

import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.download.a.i */
final class C19370i<K, T, E, V, R> extends C19361c<K, T, E, V, R, V, C19370i<K, T, E, V, R>> {

    /* renamed from: g */
    WeakReference<V> f52417g;

    C19370i() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51332a() {
        this.f52417g = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final V mo51334b() {
        if (this.f52417g != null) {
            return this.f52417g.get();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51333a(V v) {
        if (v != null) {
            this.f52417g = new WeakReference<>(v);
        } else {
            this.f52417g = null;
        }
    }
}
