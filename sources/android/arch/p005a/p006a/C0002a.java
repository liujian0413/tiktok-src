package android.arch.p005a.p006a;

import java.util.concurrent.Executor;

/* renamed from: android.arch.a.a.a */
public class C0002a extends C0007d {

    /* renamed from: a */
    private static volatile C0002a f5a;

    /* renamed from: d */
    private static final Executor f6d = new Executor() {
        public final void execute(Runnable runnable) {
            C0002a.m4a().mo16b(runnable);
        }
    };

    /* renamed from: e */
    private static final Executor f7e = new Executor() {
        public final void execute(Runnable runnable) {
            C0002a.m4a().mo15a(runnable);
        }
    };

    /* renamed from: b */
    private C0007d f8b = this.f9c;

    /* renamed from: c */
    private C0007d f9c = new C0005b();

    /* renamed from: b */
    public static Executor m5b() {
        return f6d;
    }

    /* renamed from: c */
    public static Executor m6c() {
        return f7e;
    }

    /* renamed from: d */
    public final boolean mo17d() {
        return this.f8b.mo17d();
    }

    private C0002a() {
    }

    /* renamed from: a */
    public static C0002a m4a() {
        if (f5a != null) {
            return f5a;
        }
        synchronized (C0002a.class) {
            if (f5a == null) {
                f5a = new C0002a();
            }
        }
        return f5a;
    }

    /* renamed from: a */
    public final void mo15a(Runnable runnable) {
        this.f8b.mo15a(runnable);
    }

    /* renamed from: b */
    public final void mo16b(Runnable runnable) {
        this.f8b.mo16b(runnable);
    }
}
