package com.twitter.sdk.android.tweetui;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.twitter.sdk.android.tweetui.af */
final class C47013af {

    /* renamed from: a */
    C47008ac f120643a;

    /* renamed from: b */
    C47008ac f120644b;

    /* renamed from: c */
    public final AtomicBoolean f120645c;

    /* renamed from: c */
    public final void mo118218c() {
        this.f120645c.set(false);
    }

    /* renamed from: a */
    public final Long mo118215a() {
        if (this.f120644b == null) {
            return null;
        }
        return this.f120644b.f120631a;
    }

    /* renamed from: b */
    public final boolean mo118217b() {
        return this.f120645c.compareAndSet(false, true);
    }

    /* renamed from: a */
    public final void mo118216a(C47008ac acVar) {
        this.f120644b = acVar;
        m146984b(acVar);
    }

    /* renamed from: b */
    private void m146984b(C47008ac acVar) {
        if (this.f120643a == null) {
            this.f120643a = acVar;
        }
        if (this.f120644b == null) {
            this.f120644b = acVar;
        }
    }
}
