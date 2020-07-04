package androidx.work.impl.utils.p039b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.work.impl.utils.b.b */
public final class C1567b implements C1566a {

    /* renamed from: a */
    volatile Thread f5910a;

    /* renamed from: b */
    private final Handler f5911b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Executor f5912c = new Executor() {
        public final void execute(Runnable runnable) {
            C1567b.this.mo6843b(runnable);
        }
    };

    /* renamed from: d */
    private final ThreadFactory f5913d = new ThreadFactory() {
        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            C1567b.this.f5910a = newThread;
            return newThread;
        }
    };

    /* renamed from: e */
    private final ExecutorService f5914e = C1570c.m7662a(this.f5913d);

    /* renamed from: a */
    public final Executor mo6839a() {
        return this.f5912c;
    }

    /* renamed from: b */
    public final Thread mo6841b() {
        return this.f5910a;
    }

    /* renamed from: c */
    public final Executor mo6842c() {
        return this.f5914e;
    }

    /* renamed from: a */
    public final void mo6840a(Runnable runnable) {
        this.f5914e.execute(runnable);
    }

    /* renamed from: b */
    public final void mo6843b(Runnable runnable) {
        this.f5911b.post(runnable);
    }
}
