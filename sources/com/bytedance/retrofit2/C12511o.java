package com.bytedance.retrofit2;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.retrofit2.C12467c.C12468a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import retrofit2.C48517m.C48519a;

/* renamed from: com.bytedance.retrofit2.o */
class C12511o {

    /* renamed from: a */
    private static final C12511o f33178a = m36354d();

    /* renamed from: b */
    private static final boolean f33179b = m36355e();

    /* renamed from: com.bytedance.retrofit2.o$a */
    static class C12512a extends C12511o {

        /* renamed from: com.bytedance.retrofit2.o$a$a */
        static class C12513a implements Executor {

            /* renamed from: a */
            private final Handler f33180a = new Handler(Looper.getMainLooper());

            C12513a() {
            }

            public final void execute(Runnable runnable) {
                this.f33180a.post(runnable);
            }
        }

        C12512a() {
        }

        /* renamed from: c */
        public final Executor mo30485c() {
            return new C12513a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C12468a mo30484a(Executor executor) {
            return new C12482j(executor);
        }
    }

    /* renamed from: com.bytedance.retrofit2.o$b */
    static class C12514b extends C12511o {

        /* renamed from: com.bytedance.retrofit2.o$b$a */
        static class C12515a implements Executor {

            /* renamed from: a */
            private static Object f33181a;

            /* renamed from: b */
            private static Method f33182b;

            C12515a() {
            }

            static {
                try {
                    Class cls = Class.forName("org.robovm.apple.foundation.NSOperationQueue");
                    f33181a = cls.getDeclaredMethod("getMainQueue", new Class[0]).invoke(null, new Object[0]);
                    f33182b = cls.getDeclaredMethod("addOperation", new Class[]{Runnable.class});
                } catch (Exception e) {
                    throw new AssertionError(e);
                }
            }

            public final void execute(Runnable runnable) {
                try {
                    f33182b.invoke(f33181a, new Object[]{runnable});
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    throw new AssertionError(e);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    } else if (cause instanceof Error) {
                        throw ((Error) cause);
                    } else {
                        throw new RuntimeException(cause);
                    }
                }
            }
        }

        C12514b() {
        }

        /* renamed from: c */
        public final Executor mo30485c() {
            return new C12515a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C12468a mo30484a(Executor executor) {
            return new C12482j(executor);
        }
    }

    C12511o() {
    }

    /* renamed from: a */
    static C12511o m36352a() {
        return f33178a;
    }

    /* renamed from: b */
    static boolean m36353b() {
        return f33179b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Executor mo30485c() {
        return null;
    }

    /* renamed from: e */
    private static boolean m36355e() {
        try {
            new C48519a();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static C12511o m36354d() {
        try {
            Class.forName("android.os.Build");
            if (VERSION.SDK_INT != 0) {
                return new C12512a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("org.robovm.apple.foundation.NSObject");
            return new C12514b();
        } catch (ClassNotFoundException unused2) {
            return new C12511o();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C12468a mo30484a(Executor executor) {
        if (executor != null) {
            return new C12482j(executor);
        }
        return C12477g.f33130a;
    }
}
