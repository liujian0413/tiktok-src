package retrofit2;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import retrofit2.C48476c.C48477a;

/* renamed from: retrofit2.j */
class C48510j {

    /* renamed from: a */
    private static final C48510j f123648a = m150243c();

    /* renamed from: retrofit2.j$a */
    static class C48511a extends C48510j {

        /* renamed from: retrofit2.j$a$a */
        static class C48512a implements Executor {

            /* renamed from: a */
            private final Handler f123649a = new Handler(Looper.getMainLooper());

            C48512a() {
            }

            public final void execute(Runnable runnable) {
                this.f123649a.post(runnable);
            }
        }

        C48511a() {
        }

        /* renamed from: b */
        public final Executor mo123297b() {
            return new C48512a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C48477a mo123295a(Executor executor) {
            if (executor != null) {
                return new C48483g(executor);
            }
            throw new AssertionError();
        }
    }

    /* renamed from: retrofit2.j$b */
    static class C48513b extends C48510j {
        C48513b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo123296a(Method method) {
            return method.isDefault();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Object mo123294a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            Constructor declaredConstructor = Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return ((Lookup) declaredConstructor.newInstance(new Object[]{cls, Integer.valueOf(-1)})).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    C48510j() {
    }

    /* renamed from: a */
    static C48510j m150242a() {
        return f123648a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo123296a(Method method) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Executor mo123297b() {
        return null;
    }

    /* renamed from: c */
    private static C48510j m150243c() {
        try {
            Class.forName("android.os.Build");
            if (VERSION.SDK_INT != 0) {
                return new C48511a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C48513b();
        } catch (ClassNotFoundException unused2) {
            return new C48510j();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C48477a mo123295a(Executor executor) {
        if (executor != null) {
            return new C48483g(executor);
        }
        return C48481f.f123595a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo123294a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }
}
