package com.ttnet.org.chromium.base.task;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

final class ChoreographerTaskRunner implements SingleThreadTaskRunner {
    private final Choreographer mChoreographer;

    public final void destroy() {
    }

    public final void disableLifetimeCheck() {
    }

    public final void initNativeTaskRunner() {
    }

    public final boolean belongsToCurrentThread() {
        boolean z = false;
        try {
            if (this.mChoreographer == Choreographer.getInstance()) {
                z = true;
            }
            return z;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    ChoreographerTaskRunner(Choreographer choreographer) {
        this.mChoreographer = choreographer;
    }

    public final void postTask(final Runnable runnable) {
        this.mChoreographer.postFrameCallback(new FrameCallback() {
            public void doFrame(long j) {
                runnable.run();
            }
        });
    }

    public final void postDelayedTask(final Runnable runnable, long j) {
        this.mChoreographer.postFrameCallbackDelayed(new FrameCallback() {
            public void doFrame(long j) {
                runnable.run();
            }
        }, j);
    }
}
