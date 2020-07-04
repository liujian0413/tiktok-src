package bolts;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bolts.a */
final class C1581a {

    /* renamed from: a */
    static final int f5936a;

    /* renamed from: b */
    static final int f5937b = ((f5939e * 2) + 1);

    /* renamed from: c */
    private static final C1581a f5938c = new C1581a();

    /* renamed from: e */
    private static final int f5939e;

    /* renamed from: d */
    private final Executor f5940d = new C1583a();

    /* renamed from: bolts.a$a */
    static class C1583a implements Executor {
        private C1583a() {
        }

        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* renamed from: b */
    public static Executor m7827b() {
        return f5938c.f5940d;
    }

    private C1581a() {
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f5939e = availableProcessors;
        f5936a = availableProcessors + 1;
    }

    /* renamed from: a */
    public static ExecutorService m7825a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f5936a, f5937b, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m7826a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    /* renamed from: a */
    private static void m7826a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
    }
}
