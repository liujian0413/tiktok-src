package kotlinx.coroutines.internal;

import kotlin.coroutines.C47919b;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.C48048a;

/* renamed from: kotlinx.coroutines.internal.t */
public final class C48176t {
    /* renamed from: a */
    public static final Throwable m149460a(C48048a<?> aVar, Throwable th) {
        C7573i.m23587b(aVar, "receiver$0");
        C7573i.m23587b(th, "exception");
        if (!(aVar instanceof C48175s)) {
            aVar = null;
        }
        C48175s sVar = (C48175s) aVar;
        if (sVar != null) {
            C47919b<T> bVar = sVar.f123034c;
            if (bVar != null) {
                return C48177u.m149466a(th, bVar);
            }
        }
        return th;
    }
}
