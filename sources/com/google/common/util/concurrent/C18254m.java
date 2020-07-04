package com.google.common.util.concurrent;

import com.google.common.base.C17439m;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.common.util.concurrent.m */
public final class C18254m {

    /* renamed from: com.google.common.util.concurrent.m$a */
    enum C18257a implements Executor {
        INSTANCE;

        public final String toString() {
            return "MoreExecutors.directExecutor()";
        }

        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m60217a() {
        return C18257a.INSTANCE;
    }

    /* renamed from: a */
    static Executor m60218a(final Executor executor, final C18225b<?> bVar) {
        C17439m.m57962a(executor);
        C17439m.m57962a(bVar);
        if (executor == m60217a()) {
            return executor;
        }
        return new Executor() {

            /* renamed from: a */
            boolean f49636a = true;

            public final void execute(final Runnable runnable) {
                try {
                    executor.execute(new Runnable() {
                        public final void run() {
                            C182551.this.f49636a = false;
                            runnable.run();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    if (this.f49636a) {
                        bVar.mo47087a((Throwable) e);
                    }
                }
            }
        };
    }
}
