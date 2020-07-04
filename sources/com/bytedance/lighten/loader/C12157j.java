package com.bytedance.lighten.loader;

import com.facebook.common.p685b.C13276b;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.lighten.loader.j */
final class C12157j extends C13276b {
    public final synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }

    public C12157j(Executor executor, int i) {
        super("FixSizeSerialExecutor", 1, executor, new C12156i(10));
    }
}
