package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.aj */
public final class C48062aj implements C48129cd {

    /* renamed from: a */
    public static final C48062aj f122911a = new C48062aj();

    private C48062aj() {
    }

    /* renamed from: a */
    public final Runnable mo120269a(Runnable runnable) {
        C7573i.m23587b(runnable, "block");
        return runnable;
    }

    /* renamed from: a */
    public final long mo120268a() {
        return System.nanoTime();
    }

    /* renamed from: a */
    public final void mo120271a(Thread thread) {
        C7573i.m23587b(thread, "thread");
        LockSupport.unpark(thread);
    }

    /* renamed from: a */
    public final void mo120270a(Object obj, long j) {
        C7573i.m23587b(obj, "blocker");
        LockSupport.parkNanos(obj, j);
    }
}
