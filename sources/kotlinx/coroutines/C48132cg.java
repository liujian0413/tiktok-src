package kotlinx.coroutines;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C47955f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.p1885a.C48050b;

/* renamed from: kotlinx.coroutines.cg */
public final class C48132cg {
    /* renamed from: a */
    private static <U, T extends U> Object m149260a(C48131cf<U, ? super T> cfVar, C7563m<? super C48056ad, ? super C47919b<? super T>, ? extends Object> mVar) {
        C48105bl.m149144a(cfVar, C48068an.m149043a(cfVar.f122991d.getContext()).mo120266a(cfVar.f122990c, (Runnable) cfVar));
        return C48050b.m149010b(cfVar, cfVar, mVar);
    }

    /* renamed from: a */
    public static final TimeoutCancellationException m149261a(long j, C48100bi biVar) {
        C7573i.m23587b(biVar, "coroutine");
        StringBuilder sb = new StringBuilder("Timed out waiting for ");
        sb.append(j);
        sb.append(" ms");
        return new TimeoutCancellationException(sb.toString(), biVar);
    }

    /* renamed from: a */
    public static final <T> Object m149259a(long j, C7563m<? super C48056ad, ? super C47919b<? super T>, ? extends Object> mVar, C47919b<? super T> bVar) {
        Object a = m149260a(new C48131cf<>(3000, bVar), mVar);
        if (a == C47948a.m148881a()) {
            C47955f.m148891c(bVar);
        }
        return a;
    }
}
