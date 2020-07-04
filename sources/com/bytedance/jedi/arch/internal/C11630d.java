package com.bytedance.jedi.arch.internal;

import com.bytedance.jedi.arch.C11587g;
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

/* renamed from: com.bytedance.jedi.arch.internal.d */
public final class C11630d implements Executor {

    /* renamed from: a */
    public static final C7541d f31278a = C7546e.m23569a(C11633c.f31285a);

    /* renamed from: b */
    public static final C7541d f31279b = C7546e.m23569a(C11632b.f31284a);

    /* renamed from: c */
    public static final C11631a f31280c = new C11631a(null);

    /* renamed from: d */
    private final LinkedBlockingQueue<Runnable> f31281d = new LinkedBlockingQueue<>();

    /* renamed from: e */
    private Runnable f31282e;

    /* renamed from: com.bytedance.jedi.arch.internal.d$a */
    public static final class C11631a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f31283a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11631a.class), "WORKER", "getWORKER()Ljava/util/concurrent/Executor;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11631a.class), "UNBOUND_EXECUTOR", "getUNBOUND_EXECUTOR$arch_release()Ljava/util/concurrent/ThreadPoolExecutor;"))};

        private C11631a() {
        }

        /* renamed from: b */
        public static Executor m34096b() {
            return (Executor) C11630d.f31278a.getValue();
        }

        /* renamed from: c */
        public static ThreadPoolExecutor m34097c() {
            return (ThreadPoolExecutor) C11630d.f31279b.getValue();
        }

        /* renamed from: a */
        public static int m34095a() {
            return (m34098d() * 2) + 1;
        }

        /* renamed from: d */
        private static int m34098d() {
            return Runtime.getRuntime().availableProcessors();
        }

        public /* synthetic */ C11631a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.d$b */
    static final class C11632b extends Lambda implements C7561a<ThreadPoolExecutor> {

        /* renamed from: a */
        public static final C11632b f31284a = new C11632b();

        C11632b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m34099a();
        }

        /* renamed from: a */
        private static ThreadPoolExecutor m34099a() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C11631a.m34095a(), C11631a.m34095a(), 0, TimeUnit.SECONDS, new LinkedBlockingQueue());
            return threadPoolExecutor;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.d$c */
    static final class C11633c extends Lambda implements C7561a<Executor> {

        /* renamed from: a */
        public static final C11633c f31285a = new C11633c();

        C11633c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m34100a();
        }

        /* renamed from: a */
        private static Executor m34100a() {
            return (Executor) C11587g.m34063d().invoke();
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.d$d */
    static final class C11634d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11630d f31286a;

        /* renamed from: b */
        final /* synthetic */ Runnable f31287b;

        C11634d(C11630d dVar, Runnable runnable) {
            this.f31286a = dVar;
            this.f31287b = runnable;
        }

        public final void run() {
            try {
                this.f31287b.run();
            } finally {
                this.f31286a.mo29169a();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo29169a() {
        Runnable runnable = (Runnable) this.f31281d.poll();
        if (runnable != null) {
            C11631a.m34096b().execute(runnable);
        } else {
            runnable = null;
        }
        this.f31282e = runnable;
    }

    public final synchronized void execute(Runnable runnable) {
        C7573i.m23587b(runnable, "r");
        this.f31281d.offer(new C11634d(this, runnable));
        if (this.f31282e == null) {
            mo29169a();
        }
    }
}
