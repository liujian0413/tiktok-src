package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.C47924e.C47927b;
import kotlin.coroutines.C47924e.C47927b.C47928a;
import kotlin.coroutines.C47924e.C47929c;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: kotlinx.coroutines.bi */
public interface C48100bi extends C47927b {

    /* renamed from: b */
    public static final C48102b f122964b = C48102b.f122965a;

    /* renamed from: kotlinx.coroutines.bi$a */
    public static final class C48101a {
        /* renamed from: a */
        public static <R> R m149137a(C48100bi biVar, R r, C7563m<? super R, ? super C47927b, ? extends R> mVar) {
            C7573i.m23587b(mVar, "operation");
            return C47928a.m148869a(biVar, r, mVar);
        }

        /* renamed from: a */
        public static <E extends C47927b> E m149138a(C48100bi biVar, C47929c<E> cVar) {
            C7573i.m23587b(cVar, "key");
            return C47928a.m148870a((C47927b) biVar, cVar);
        }

        /* renamed from: a */
        public static C47924e m149139a(C48100bi biVar, C47924e eVar) {
            C7573i.m23587b(eVar, "context");
            return C47928a.m148871a((C47927b) biVar, eVar);
        }

        /* renamed from: b */
        public static C47924e m149141b(C48100bi biVar, C47929c<?> cVar) {
            C7573i.m23587b(cVar, "key");
            return C47928a.m148872b(biVar, cVar);
        }

        /* renamed from: a */
        public static /* synthetic */ C48081at m149140a(C48100bi biVar, boolean z, boolean z2, C7562b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return biVar.mo120324a(z, z2, bVar);
        }
    }

    /* renamed from: kotlinx.coroutines.bi$b */
    public static final class C48102b implements C47929c<C48100bi> {

        /* renamed from: a */
        static final /* synthetic */ C48102b f122965a = new C48102b();

        private C48102b() {
        }
    }

    /* renamed from: a */
    C48081at mo120323a(C7562b<? super Throwable, C7581n> bVar);

    /* renamed from: a */
    C48081at mo120324a(boolean z, boolean z2, C7562b<? super Throwable, C7581n> bVar);

    /* renamed from: a */
    C48192o mo120325a(C48194q qVar);

    /* renamed from: b */
    Object mo120326b(C47919b<? super C7581n> bVar);

    /* renamed from: b */
    boolean mo120251b();

    /* renamed from: b */
    boolean mo120327b(Throwable th);

    /* renamed from: j */
    boolean mo120328j();

    /* renamed from: k */
    boolean mo120329k();

    /* renamed from: l */
    CancellationException mo120330l();

    /* renamed from: m */
    boolean mo120331m();

    /* renamed from: n */
    void mo120332n();
}
