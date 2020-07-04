package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

final class bjb implements Executor {

    /* renamed from: a */
    private final /* synthetic */ Handler f42262a;

    bjb(bia bia, Handler handler) {
        this.f42262a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f42262a.post(runnable);
    }
}
