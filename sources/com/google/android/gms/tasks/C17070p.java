package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.p */
final class C17070p<TResult> implements C17076v<TResult> {

    /* renamed from: a */
    private final Executor f47747a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f47748b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C17054c<TResult> f47749c;

    public C17070p(Executor executor, C17054c<TResult> cVar) {
        this.f47747a = executor;
        this.f47749c = cVar;
    }

    /* renamed from: a */
    public final void mo44305a(C17057f<TResult> fVar) {
        synchronized (this.f47748b) {
            if (this.f47749c != null) {
                this.f47747a.execute(new C17071q(this, fVar));
            }
        }
    }
}
