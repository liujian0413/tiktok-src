package android.arch.p005a.p006a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* renamed from: android.arch.a.a.b */
public final class C0005b extends C0007d {

    /* renamed from: a */
    private final Object f10a = new Object();

    /* renamed from: b */
    private ExecutorService f11b = C0006c.m13a(2);

    /* renamed from: c */
    private volatile Handler f12c;

    /* renamed from: d */
    public final boolean mo17d() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo15a(Runnable runnable) {
        this.f11b.execute(runnable);
    }

    /* renamed from: b */
    public final void mo16b(Runnable runnable) {
        if (this.f12c == null) {
            synchronized (this.f10a) {
                if (this.f12c == null) {
                    this.f12c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f12c.post(runnable);
    }
}
