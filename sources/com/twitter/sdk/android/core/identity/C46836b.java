package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.twitter.sdk.android.core.identity.b */
final class C46836b {

    /* renamed from: a */
    final AtomicReference<C46835a> f120143a = new AtomicReference<>(null);

    /* renamed from: a */
    public final void mo117934a() {
        this.f120143a.set(null);
    }

    C46836b() {
    }

    /* renamed from: b */
    public final boolean mo117936b() {
        if (this.f120143a.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C46835a mo117937c() {
        return (C46835a) this.f120143a.get();
    }

    /* renamed from: a */
    public final boolean mo117935a(Activity activity, C46835a aVar) {
        if (mo117936b() || !aVar.mo117933a(activity)) {
            return false;
        }
        return this.f120143a.compareAndSet(null, aVar);
    }
}
