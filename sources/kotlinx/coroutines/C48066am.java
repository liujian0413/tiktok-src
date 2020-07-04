package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.am */
public interface C48066am {

    /* renamed from: kotlinx.coroutines.am$a */
    public static final class C48067a {
        /* renamed from: a */
        public static C48081at m149041a(C48066am amVar, long j, Runnable runnable) {
            C7573i.m23587b(runnable, "block");
            return C48061ai.m149030a().mo120266a(j, runnable);
        }
    }

    /* renamed from: a */
    C48081at mo120266a(long j, Runnable runnable);

    /* renamed from: a */
    void mo120274a(long j, C48187j<? super C7581n> jVar);
}
