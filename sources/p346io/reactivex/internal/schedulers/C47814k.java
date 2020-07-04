package p346io.reactivex.internal.schedulers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.k */
public final class C47814k {

    /* renamed from: a */
    public static final boolean f122578a;

    /* renamed from: b */
    public static final int f122579b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f122580c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f122581d = new ConcurrentHashMap();

    /* renamed from: io.reactivex.internal.schedulers.k$a */
    static final class C47815a {

        /* renamed from: a */
        boolean f122582a;

        /* renamed from: b */
        int f122583b;

        C47815a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo119832a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f122582a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f122582a = true;
            }
            if (this.f122582a && properties.containsKey("rx2.purge-period-seconds")) {
                try {
                    this.f122583b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            this.f122583b = 1;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.k$b */
    static final class C47816b implements Runnable {
        C47816b() {
        }

        public final void run() {
            Iterator it = new ArrayList(C47814k.f122581d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C47814k.f122581d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m148677a() {
        m148678a(f122578a);
    }

    static {
        Properties properties = System.getProperties();
        C47815a aVar = new C47815a();
        aVar.mo119832a(properties);
        f122578a = aVar.f122582a;
        f122579b = aVar.f122583b;
        m148677a();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m148676a(ThreadFactory threadFactory) {
        ScheduledExecutorService a = C47817l.m148681a(1, threadFactory);
        m148679a(f122578a, a);
        return a;
    }

    /* renamed from: a */
    private static void m148678a(boolean z) {
        if (z) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f122580c.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService a = C47817l.m148681a(1, new RxThreadFactory("RxSchedulerPurge"));
                    if (f122580c.compareAndSet(scheduledExecutorService, a)) {
                        a.scheduleAtFixedRate(new C47816b(), (long) f122579b, (long) f122579b, TimeUnit.SECONDS);
                        return;
                    }
                    a.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m148679a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f122581d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }
}
