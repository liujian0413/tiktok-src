package kotlinx.coroutines;

import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.internal.C48178v;

/* renamed from: kotlinx.coroutines.az */
public final class C48090az {

    /* renamed from: a */
    public static final C48178v f122954a = new C48178v("REMOVED_TASK");

    /* renamed from: b */
    public static final C48178v f122955b = new C48178v("CLOSED_EMPTY");

    /* renamed from: a */
    public static final long m149118a(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }

    /* renamed from: a */
    public static final C48085ax m149119a() {
        Thread currentThread = Thread.currentThread();
        C7573i.m23582a((Object) currentThread, "Thread.currentThread()");
        return new C48142d(currentThread);
    }
}
