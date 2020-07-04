package com.p280ss.android.ugc.aweme.i18n.p1299a;

/* renamed from: com.ss.android.ugc.aweme.i18n.a.b */
public abstract class C30433b<T> {

    /* renamed from: a */
    private T f79967a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo80108a();

    /* renamed from: b */
    public final T mo80109b() {
        T t;
        synchronized (this) {
            if (this.f79967a != null) {
                t = this.f79967a;
            } else {
                t = mo80108a();
                this.f79967a = t;
            }
        }
        return t;
    }
}
