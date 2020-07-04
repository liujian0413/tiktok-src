package bolts;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bolts.b */
final class C1584b {

    /* renamed from: a */
    private static final C1584b f5941a = new C1584b();

    /* renamed from: b */
    private final ExecutorService f5942b;

    /* renamed from: c */
    private final ScheduledExecutorService f5943c;

    /* renamed from: d */
    private final Executor f5944d;

    /* renamed from: bolts.b$a */
    static class C1586a implements Executor {

        /* renamed from: a */
        private ThreadLocal<Integer> f5945a;

        private C1586a() {
            this.f5945a = new ThreadLocal<>();
        }

        /* renamed from: a */
        private int m7832a() {
            Integer num = (Integer) this.f5945a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() + 1;
            this.f5945a.set(Integer.valueOf(intValue));
            return intValue;
        }

        /* renamed from: b */
        private int m7833b() {
            Integer num = (Integer) this.f5945a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f5945a.remove();
            } else {
                this.f5945a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        public final void execute(Runnable runnable) {
            if (m7832a() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    m7833b();
                    throw th;
                }
            } else {
                C1584b.m7828a().execute(runnable);
            }
            m7833b();
        }
    }

    /* renamed from: a */
    public static ExecutorService m7828a() {
        return C1587c.m7835b();
    }

    /* renamed from: b */
    static ScheduledExecutorService m7829b() {
        return C1587c.m7836c();
    }

    /* renamed from: c */
    static Executor m7830c() {
        return f5941a.f5944d;
    }

    /* renamed from: d */
    private static boolean m7831d() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }

    private C1584b() {
        ExecutorService executorService;
        if (!m7831d()) {
            executorService = Executors.newCachedThreadPool();
        } else {
            executorService = C1581a.m7825a();
        }
        this.f5942b = executorService;
        this.f5943c = C1587c.m7834a();
        this.f5944d = new C1586a();
    }
}
