package com.p280ss.videoarch.liveplayer.p1838e;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.videoarch.liveplayer.e.a */
public class C46332a {

    /* renamed from: a */
    private static volatile ThreadPoolExecutor f119134a;

    /* renamed from: b */
    private static Deque<C46333a> f119135b = new ArrayDeque();

    /* renamed from: c */
    private static Deque<C46333a> f119136c = new ArrayDeque();

    /* renamed from: com.ss.videoarch.liveplayer.e.a$a */
    public static class C46333a implements Runnable {

        /* renamed from: a */
        private Runnable f119137a;

        public final void run() {
            this.f119137a.run();
            C46332a.m145440a(this);
        }

        public C46333a(Runnable runnable) {
            this.f119137a = runnable;
        }
    }

    /* renamed from: b */
    private static int m145441b() {
        if (f119134a == null) {
            m145439a();
        }
        return f119134a.getPoolSize();
    }

    /* renamed from: c */
    private static void m145442c() {
        if (f119135b.size() > 0) {
            Iterator it = f119135b.iterator();
            if (it.hasNext()) {
                C46333a aVar = (C46333a) it.next();
                it.remove();
                f119136c.add(aVar);
                f119134a.execute(aVar);
            }
        }
    }

    /* renamed from: a */
    private static ThreadPoolExecutor m145439a() {
        if (f119134a == null) {
            synchronized (C46332a.class) {
                if (f119134a == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                    f119134a = threadPoolExecutor;
                }
            }
        }
        return f119134a;
    }

    /* renamed from: a */
    public static synchronized void m145440a(C46333a aVar) {
        synchronized (C46332a.class) {
            f119136c.remove(aVar);
            m145442c();
        }
    }

    /* renamed from: a */
    public static synchronized Future m145438a(Runnable runnable) {
        synchronized (C46332a.class) {
            if (f119134a == null) {
                m145439a();
            }
            new StringBuilder("addExecuteTask,cur thread num:").append(m145441b());
            C46333a aVar = new C46333a(runnable);
            if (f119136c.size() >= 5) {
                f119135b.add(aVar);
                return null;
            }
            f119136c.add(aVar);
            Future submit = f119134a.submit(aVar);
            return submit;
        }
    }
}
