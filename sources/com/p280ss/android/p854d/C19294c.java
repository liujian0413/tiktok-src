package com.p280ss.android.p854d;

/* renamed from: com.ss.android.d.c */
public abstract class C19294c<T> {

    /* renamed from: a */
    private volatile T f52197a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo29755a();

    /* renamed from: b */
    public final T mo51193b() {
        if (this.f52197a == null) {
            synchronized (this) {
                if (this.f52197a == null) {
                    this.f52197a = mo29755a();
                }
            }
        }
        return this.f52197a;
    }
}
