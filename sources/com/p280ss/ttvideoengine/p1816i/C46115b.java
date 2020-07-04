package com.p280ss.ttvideoengine.p1816i;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.ttvideoengine.i.b */
public class C46115b {

    /* renamed from: a */
    private static volatile ThreadPoolExecutor f118000a;

    /* renamed from: b */
    private static Deque<C46116a> f118001b = new ArrayDeque();

    /* renamed from: c */
    private static Deque<C46116a> f118002c = new ArrayDeque();

    /* renamed from: com.ss.ttvideoengine.i.b$a */
    public static class C46116a implements Runnable {

        /* renamed from: a */
        private Runnable f118003a;

        public final void run() {
            this.f118003a.run();
            C46115b.m144503a(this);
        }

        public C46116a(Runnable runnable) {
            this.f118003a = runnable;
        }
    }

    /* renamed from: b */
    private static int m144505b() {
        if (f118000a == null) {
            m144502a();
        }
        return f118000a.getPoolSize();
    }

    /* renamed from: a */
    private static ThreadPoolExecutor m144502a() {
        if (f118000a == null) {
            synchronized (C46115b.class) {
                if (f118000a == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                    f118000a = threadPoolExecutor;
                }
            }
        }
        return f118000a;
    }

    /* renamed from: c */
    private static void m144506c() {
        if (f118001b.size() > 0) {
            Iterator it = f118001b.iterator();
            if (it.hasNext()) {
                C46116a aVar = (C46116a) it.next();
                it.remove();
                f118002c.add(aVar);
                f118000a.execute(aVar);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m144503a(C46116a aVar) {
        synchronized (C46115b.class) {
            f118002c.remove(aVar);
            m144506c();
        }
    }

    /* renamed from: a */
    public static void m144504a(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (C46115b.class) {
            f118000a = threadPoolExecutor;
        }
    }

    /* renamed from: a */
    public static synchronized Future m144501a(Runnable runnable) {
        synchronized (C46115b.class) {
            if (f118000a == null) {
                m144502a();
            }
            StringBuilder sb = new StringBuilder("addExecuteTask,cur thread num:");
            sb.append(m144505b());
            C46123h.m144545a("EngineThreadPool", sb.toString());
            C46116a aVar = new C46116a(runnable);
            if (f118002c.size() >= 5) {
                f118001b.add(aVar);
                return null;
            }
            f118002c.add(aVar);
            Future submit = f118000a.submit(aVar);
            return submit;
        }
    }
}
