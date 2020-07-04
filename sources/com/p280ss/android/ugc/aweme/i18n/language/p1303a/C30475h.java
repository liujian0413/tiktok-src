package com.p280ss.android.ugc.aweme.i18n.language.p1303a;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.h */
public abstract class C30475h<T> {

    /* renamed from: a */
    private T f80070a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo80150a();

    /* renamed from: b */
    public final T mo80151b() {
        T t;
        synchronized (this) {
            if (this.f80070a == null) {
                this.f80070a = mo80150a();
            }
            t = this.f80070a;
        }
        return t;
    }
}
