package com.bytedance.android.livesdkapi.depend.p441d;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.android.livesdkapi.depend.d.a */
public class C9303a implements Executor {

    /* renamed from: a */
    public static final String f25481a = "a";

    /* renamed from: b */
    private ArrayBlockingQueue<Runnable> f25482b;

    /* renamed from: c */
    private C9307c f25483c;

    /* renamed from: d */
    private C9306b f25484d;

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.a$a */
    public static class C9305a {

        /* renamed from: a */
        private int f25485a;

        /* renamed from: b */
        private C9307c f25486b;

        /* renamed from: c */
        private String f25487c;

        /* renamed from: a */
        public final C9303a mo22785a() {
            return new C9303a(this.f25485a, new C9308d(this.f25487c), this.f25486b);
        }

        /* renamed from: a */
        public final C9305a mo22782a(int i) {
            this.f25485a = i;
            return this;
        }

        /* renamed from: a */
        public final C9305a mo22783a(C9307c cVar) {
            this.f25486b = cVar;
            return this;
        }

        /* renamed from: a */
        public final C9305a mo22784a(String str) {
            this.f25487c = str;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.a$b */
    public static class C9306b implements Runnable {

        /* renamed from: a */
        public boolean f25488a;

        /* renamed from: b */
        private ArrayBlockingQueue<Runnable> f25489b;

        public final void run() {
            while (!this.f25488a) {
                try {
                    ((Runnable) this.f25489b.take()).run();
                } catch (InterruptedException unused) {
                }
            }
        }

        private C9306b(ArrayBlockingQueue<Runnable> arrayBlockingQueue) {
            this.f25489b = arrayBlockingQueue;
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.a$c */
    public interface C9307c {
        /* renamed from: a */
        void mo21812a();
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.d.a$d */
    static class C9308d implements ThreadFactory {

        /* renamed from: a */
        private String f25490a;

        /* renamed from: b */
        private AtomicInteger f25491b;

        private C9308d(String str) {
            this.f25491b = new AtomicInteger();
            this.f25490a = str;
        }

        public final Thread newThread(Runnable runnable) {
            int incrementAndGet = this.f25491b.incrementAndGet();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f25490a);
            sb.append("-");
            sb.append(incrementAndGet);
            Thread thread = new Thread(runnable, sb.toString());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            return thread;
        }
    }

    public void execute(Runnable runnable) {
        if (!this.f25482b.offer(runnable) && this.f25483c != null) {
            this.f25483c.mo21812a();
        }
    }

    private C9303a(int i, ThreadFactory threadFactory, C9307c cVar) {
        this.f25482b = new ArrayBlockingQueue<>(i);
        this.f25484d = new C9306b(this.f25482b);
        threadFactory.newThread(this.f25484d).start();
        this.f25483c = cVar;
    }
}
