package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class agq implements Executor {
    agq() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
