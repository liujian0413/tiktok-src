package p1896pl.droidsonroids.gif;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

/* renamed from: pl.droidsonroids.gif.b */
final class C48429b extends ScheduledThreadPoolExecutor {

    /* renamed from: pl.droidsonroids.gif.b$a */
    static final class C48431a {

        /* renamed from: a */
        public static final C48429b f123542a = new C48429b();
    }

    /* renamed from: a */
    static C48429b m150102a() {
        return C48431a.f123542a;
    }

    private C48429b() {
        super(1, new DiscardPolicy());
    }
}
