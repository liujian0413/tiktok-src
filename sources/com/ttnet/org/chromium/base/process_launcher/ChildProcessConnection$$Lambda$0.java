package com.ttnet.org.chromium.base.process_launcher;

import java.util.concurrent.Executor;

final /* synthetic */ class ChildProcessConnection$$Lambda$0 implements Executor {
    private final ChildProcessConnection arg$1;

    ChildProcessConnection$$Lambda$0(ChildProcessConnection childProcessConnection) {
        this.arg$1 = childProcessConnection;
    }

    public final void execute(Runnable runnable) {
        this.arg$1.lambda$new$0$ChildProcessConnection(runnable);
    }
}
