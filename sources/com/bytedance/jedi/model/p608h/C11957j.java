package com.bytedance.jedi.model.p608h;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.bytedance.jedi.model.h.j */
public final class C11957j implements Executor {

    /* renamed from: a */
    public static final C7541d f31861a = C7546e.m23569a(C11959b.f31866a);

    /* renamed from: b */
    public static final C11958a f31862b = new C11958a(null);

    /* renamed from: c */
    private final LinkedBlockingQueue<Runnable> f31863c = new LinkedBlockingQueue<>();

    /* renamed from: d */
    private Runnable f31864d;

    /* renamed from: com.bytedance.jedi.model.h.j$a */
    public static final class C11958a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f31865a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11958a.class), "THREAD_POOL_EXECUTOR", "getTHREAD_POOL_EXECUTOR()Ljava/util/concurrent/ThreadPoolExecutor;"))};

        private C11958a() {
        }

        /* renamed from: b */
        public static ThreadPoolExecutor m35038b() {
            return (ThreadPoolExecutor) C11957j.f31861a.getValue();
        }

        /* renamed from: a */
        public static int m35037a() {
            return (m35039c() * 2) + 1;
        }

        /* renamed from: c */
        private static int m35039c() {
            return Runtime.getRuntime().availableProcessors();
        }

        public /* synthetic */ C11958a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.jedi.model.h.j$b */
    static final class C11959b extends Lambda implements C7561a<ThreadPoolExecutor> {

        /* renamed from: a */
        public static final C11959b f31866a = new C11959b();

        C11959b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m35040a();
        }

        /* renamed from: a */
        private static ThreadPoolExecutor m35040a() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C11958a.m35037a(), C11958a.m35037a(), 0, TimeUnit.SECONDS, new LinkedBlockingQueue());
            return threadPoolExecutor;
        }
    }

    /* renamed from: com.bytedance.jedi.model.h.j$c */
    static final class C11960c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11957j f31867a;

        /* renamed from: b */
        final /* synthetic */ Runnable f31868b;

        C11960c(C11957j jVar, Runnable runnable) {
            this.f31867a = jVar;
            this.f31868b = runnable;
        }

        public final void run() {
            try {
                this.f31868b.run();
            } finally {
                this.f31867a.mo29567a();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo29567a() {
        Runnable runnable = (Runnable) this.f31863c.poll();
        if (runnable != null) {
            C11958a.m35038b().execute(runnable);
        } else {
            runnable = null;
        }
        this.f31864d = runnable;
    }

    public final synchronized void execute(Runnable runnable) {
        C7573i.m23587b(runnable, "r");
        this.f31863c.offer(new C11960c(this, runnable));
        if (this.f31864d == null) {
            mo29567a();
        }
    }
}
