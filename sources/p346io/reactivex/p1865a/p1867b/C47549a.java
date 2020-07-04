package p346io.reactivex.p1865a.p1867b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p346io.reactivex.C7499z;
import p346io.reactivex.p1865a.p1866a.C47548a;

/* renamed from: io.reactivex.a.b.a */
public final class C47549a {

    /* renamed from: a */
    private static final C7499z f122002a = C47548a.m148324a((Callable<C7499z>) new Callable<C7499z>() {
        /* renamed from: a */
        private static C7499z m148330a() throws Exception {
            return C47551a.f122003a;
        }

        public final /* synthetic */ Object call() throws Exception {
            return m148330a();
        }
    });

    /* renamed from: io.reactivex.a.b.a$a */
    static final class C47551a {

        /* renamed from: a */
        static final C7499z f122003a = new C47552b(new Handler(Looper.getMainLooper()), false);
    }

    /* renamed from: a */
    public static C7499z m148327a() {
        return C47548a.m148323a(f122002a);
    }

    /* renamed from: a */
    public static C7499z m148328a(Looper looper) {
        return m148329a(looper, false);
    }

    /* renamed from: a */
    private static C7499z m148329a(Looper looper, boolean z) {
        if (looper != null) {
            return new C47552b(new Handler(looper), false);
        }
        throw new NullPointerException("looper == null");
    }
}
