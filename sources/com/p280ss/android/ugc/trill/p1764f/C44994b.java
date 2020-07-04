package com.p280ss.android.ugc.trill.p1764f;

/* renamed from: com.ss.android.ugc.trill.f.b */
public abstract class C44994b<T> {

    /* renamed from: a */
    private T f115667a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo107510a();

    /* renamed from: b */
    public final T mo107511b() {
        T t;
        synchronized (this) {
            if (this.f115667a != null) {
                t = this.f115667a;
            } else {
                t = mo107510a();
                this.f115667a = t;
            }
        }
        return t;
    }
}
