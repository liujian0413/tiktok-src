package com.bytedance.common.utility.p254b;

import com.bytedance.common.utility.C6312h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.common.utility.b.f */
public class C6304f implements Runnable {
    private static ExecutorService CACHED_EXECUTOR = C9714c.m28650a();
    private static ExecutorService FIXED_EXECUTOR = C9714c.m28650a();
    protected static final AtomicInteger sCount = new AtomicInteger();
    private final boolean mBackground;
    private Runnable runnable;

    public static void shutdown() {
    }

    public C6304f() {
        this(false);
    }

    public void run() {
        if (this.runnable != null) {
            this.runnable.run();
        }
    }

    public void start() {
        Runnable runnable2;
        if (C6312h.m19578b()) {
            runnable2 = new Runnable() {
                public final void run() {
                    try {
                        C6304f.this.run();
                    } catch (Exception unused) {
                    }
                }
            };
        } else {
            runnable2 = this;
        }
        if (this.mBackground) {
            FIXED_EXECUTOR.submit(runnable2);
        } else {
            CACHED_EXECUTOR.submit(runnable2);
        }
    }

    public static void setExecutorService(ExecutorService executorService) {
        CACHED_EXECUTOR = executorService;
        FIXED_EXECUTOR = executorService;
    }

    public static void submitRunnable(Runnable runnable2) {
        if (runnable2 != null) {
            CACHED_EXECUTOR.submit(runnable2);
        }
    }

    public C6304f(String str) {
        this(false);
    }

    public C6304f(boolean z) {
        this.mBackground = z;
    }

    public C6304f(Runnable runnable2, String str, boolean z) {
        this.runnable = runnable2;
        this.mBackground = z;
    }
}
