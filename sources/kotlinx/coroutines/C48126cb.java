package kotlinx.coroutines;

import kotlin.coroutines.C47924e;
import kotlin.coroutines.C47924e.C47927b;
import kotlin.coroutines.C47924e.C47927b.C47928a;
import kotlin.coroutines.C47924e.C47929c;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: kotlinx.coroutines.cb */
public interface C48126cb<S> extends C47927b {

    /* renamed from: kotlinx.coroutines.cb$a */
    public static final class C48127a {
        /* renamed from: a */
        public static <S, R> R m149243a(C48126cb<S> cbVar, R r, C7563m<? super R, ? super C47927b, ? extends R> mVar) {
            C7573i.m23587b(mVar, "operation");
            return C47928a.m148869a(cbVar, r, mVar);
        }

        /* renamed from: a */
        public static <S, E extends C47927b> E m149244a(C48126cb<S> cbVar, C47929c<E> cVar) {
            C7573i.m23587b(cVar, "key");
            return C47928a.m148870a((C47927b) cbVar, cVar);
        }

        /* renamed from: a */
        public static <S> C47924e m149245a(C48126cb<S> cbVar, C47924e eVar) {
            C7573i.m23587b(eVar, "context");
            return C47928a.m148871a((C47927b) cbVar, eVar);
        }

        /* renamed from: b */
        public static <S> C47924e m149246b(C48126cb<S> cbVar, C47929c<?> cVar) {
            C7573i.m23587b(cVar, "key");
            return C47928a.m148872b(cbVar, cVar);
        }
    }

    /* renamed from: a */
    S mo120257a(C47924e eVar);

    /* renamed from: a */
    void mo120258a(C47924e eVar, S s);
}
