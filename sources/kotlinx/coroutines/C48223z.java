package kotlinx.coroutines;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.collections.C7525m;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.z */
public final class C48223z {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f123128a;

    static {
        Class<CoroutineExceptionHandler> cls = CoroutineExceptionHandler.class;
        ServiceLoader load = ServiceLoader.load(cls, cls.getClassLoader());
        C7573i.m23582a((Object) load, "ServiceLoader.load(servi…serviceClass.classLoader)");
        f123128a = C7525m.m23516h((Iterable<? extends T>) load);
    }

    /* renamed from: a */
    public static final void m149613a(C47924e eVar, Throwable th) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(th, "exception");
        for (CoroutineExceptionHandler handleException : f123128a) {
            try {
                handleException.handleException(eVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                C7573i.m23582a((Object) currentThread, "currentThread");
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C48051aa.m149011a(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        C7573i.m23582a((Object) currentThread2, "currentThread");
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
