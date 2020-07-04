package com.google.android.play.core.internal;

import android.os.IBinder.DeathRecipient;

/* renamed from: com.google.android.play.core.internal.bf */
final /* synthetic */ class C17115bf implements DeathRecipient {

    /* renamed from: a */
    private final C17112bc f47829a;

    C17115bf(C17112bc bcVar) {
        this.f47829a = bcVar;
    }

    public final void binderDied() {
        this.f47829a.mo44388b();
    }
}
