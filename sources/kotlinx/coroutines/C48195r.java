package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;
import kotlin.text.C7634n;

/* renamed from: kotlinx.coroutines.r */
public final class C48195r extends C48092ba {

    /* renamed from: b */
    public static final C48195r f123055b = new C48195r();

    /* renamed from: c */
    private static final int f123056c;

    /* renamed from: d */
    private static boolean f123057d;
    private static volatile Executor pool;

    /* renamed from: kotlinx.coroutines.r$a */
    static final class C48196a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ AtomicInteger f123058a;

        C48196a(AtomicInteger atomicInteger) {
            this.f123058a = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("CommonPool-worker-");
            sb.append(this.f123058a.incrementAndGet());
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* renamed from: kotlinx.coroutines.r$b */
    static final class C48197b implements Runnable {

        /* renamed from: a */
        public static final C48197b f123059a = new C48197b();

        C48197b() {
        }

        public final void run() {
        }
    }

    private C48195r() {
    }

    public final String toString() {
        return "CommonPool";
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    /* renamed from: c */
    private final ExecutorService m149536c() {
        ExecutorService a = C48198s.m149539a(m149533a(), new C48196a(new AtomicInteger()));
        C7573i.m23582a((Object) a, "Executors.newFixedThread…Daemon = true }\n        }");
        return a;
    }

    /* renamed from: d */
    private final synchronized Executor m149537d() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            ExecutorService b = m149535b();
            pool = b;
            executor = b;
        }
        return executor;
    }

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            i = -1;
        } else {
            Integer d = C7634n.m23706d(str);
            if (d == null || d.intValue() <= 0) {
                StringBuilder sb = new StringBuilder("Expected positive number in kotlinx.coroutines.default.parallelism, but has ");
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            i = d.intValue();
        }
        f123056c = i;
    }

    /* renamed from: a */
    private static int m149533a() {
        boolean z;
        Integer valueOf = Integer.valueOf(f123056c);
        if (valueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return C7551d.m23566c(Runtime.getRuntime().availableProcessors() - 1, 1);
    }

    /* renamed from: b */
    private final ExecutorService m149535b() {
        Class cls;
        ExecutorService executorService;
        Object obj;
        if (System.getSecurityManager() != null) {
            return m149536c();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return m149536c();
        }
        if (!f123057d && f123056c < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                if (method != null) {
                    obj = method.invoke(null, new Object[0]);
                } else {
                    obj = null;
                }
                if (!(obj instanceof ExecutorService)) {
                    obj = null;
                }
                executorService = (ExecutorService) obj;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (!f123055b.m149534a(cls, executorService)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(m149533a())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused3) {
        }
        if (executorService2 != null) {
            return executorService2;
        }
        return m149536c();
    }

    /* renamed from: a */
    private boolean m149534a(Class<?> cls, ExecutorService executorService) {
        Integer num;
        C7573i.m23587b(cls, "fjpClass");
        C7573i.m23587b(executorService, "executor");
        executorService.submit(C48197b.f123059a);
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
            num = null;
        }
        if (num == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo83489a(C47924e eVar, Runnable runnable) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(runnable, "block");
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = m149537d();
            }
            executor.execute(C48130ce.m149255a().mo120269a(runnable));
        } catch (RejectedExecutionException unused) {
            C48060ah.f122908b.mo120306a(runnable);
        }
    }
}
