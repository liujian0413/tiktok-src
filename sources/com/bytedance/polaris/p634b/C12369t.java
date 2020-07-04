package com.bytedance.polaris.p634b;

/* renamed from: com.bytedance.polaris.b.t */
public abstract class C12369t<T> {

    /* renamed from: a */
    private T f32808a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo30173a();

    /* renamed from: b */
    public final T mo30198b() {
        T t;
        synchronized (this) {
            if (this.f32808a == null) {
                this.f32808a = mo30173a();
            }
            t = this.f32808a;
        }
        return t;
    }
}
