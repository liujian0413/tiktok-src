package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ap */
public abstract class C31870ap<T> {

    /* renamed from: a */
    private T f83335a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo18004a();

    /* renamed from: b */
    public final T mo82721b() {
        T t;
        synchronized (this) {
            if (this.f83335a == null) {
                this.f83335a = mo18004a();
            }
            t = this.f83335a;
        }
        return t;
    }
}
