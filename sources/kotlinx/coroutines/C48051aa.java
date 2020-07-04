package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C47885a;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.aa */
public final class C48051aa {
    /* renamed from: a */
    public static final Throwable m149011a(Throwable th, Throwable th2) {
        C7573i.m23587b(th, "originalException");
        C7573i.m23587b(th2, "thrownException");
        if (th == th2) {
            return th;
        }
        Throwable runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C47885a.m148820a(runtimeException, th);
        return runtimeException;
    }

    /* renamed from: a */
    public static final void m149012a(C47924e eVar, Throwable th) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(th, "exception");
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) eVar.get(CoroutineExceptionHandler.f122896b);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(eVar, th);
            } else {
                C48223z.m149613a(eVar, th);
            }
        } catch (Throwable th2) {
            C48223z.m149613a(eVar, m149011a(th, th2));
        }
    }

    /* renamed from: a */
    public static final void m149013a(C47924e eVar, Throwable th, C48100bi biVar) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(th, "exception");
        if (!(th instanceof CancellationException)) {
            C48100bi biVar2 = (C48100bi) eVar.get(C48100bi.f122964b);
            if (biVar2 == null || biVar2 == biVar || !biVar2.mo120327b(th)) {
                m149012a(eVar, th);
            }
        }
    }
}
