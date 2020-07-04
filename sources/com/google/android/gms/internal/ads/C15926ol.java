package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.ol */
final class C15926ol implements Callable<C15922oh> {

    /* renamed from: a */
    private final /* synthetic */ C15919oe f44807a;

    /* renamed from: b */
    private final /* synthetic */ C15925ok f44808b;

    C15926ol(C15925ok okVar, C15919oe oeVar) {
        this.f44808b = okVar;
        this.f44807a = oeVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C15922oh call() throws Exception {
        synchronized (this.f44808b.f44800i) {
            if (this.f44808b.f44801j) {
                return null;
            }
            return this.f44807a.mo41802a(this.f44808b.f44797f, this.f44808b.f44798g);
        }
    }
}
