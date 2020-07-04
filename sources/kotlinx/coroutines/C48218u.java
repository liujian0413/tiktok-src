package kotlinx.coroutines;

import kotlin.Result;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.u */
public final class C48218u {
    /* renamed from: a */
    public static final <T> Object m149604a(Object obj) {
        if (Result.m150909isSuccessimpl(obj)) {
            return obj;
        }
        Throwable r1 = Result.m150905exceptionOrNullimpl(obj);
        if (r1 == null) {
            C7573i.m23580a();
        }
        return new C48217t(r1);
    }
}
