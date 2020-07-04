package kotlinx.coroutines;

import kotlin.C47965i;
import kotlin.Result;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.internal.C48177u;
import kotlinx.coroutines.internal.C48178v;
import kotlinx.coroutines.internal.C48180x;

/* renamed from: kotlinx.coroutines.aq */
public final class C48078aq {

    /* renamed from: a */
    public static final C48178v f122934a = new C48178v("UNDEFINED");

    /* renamed from: a */
    private static final void m149062a(C48079ar<?> arVar) {
        C48085ax a = C48128cc.m149247a();
        if (a.mo120303f()) {
            a.mo120296a(arVar);
            return;
        }
        a.mo120297a(true);
        try {
            m149064a(arVar, arVar.mo120284d(), 3);
            do {
            } while (a.mo120302e());
            a.mo120299b(true);
        } catch (Throwable th) {
            a.mo120299b(true);
            throw th;
        }
    }

    /* renamed from: b */
    public static final <T> void m149065b(C47919b<? super T> bVar, T t) {
        C7573i.m23587b(bVar, "receiver$0");
        if (bVar instanceof C48076ao) {
            ((C48076ao) bVar).f122931d.resumeWith(Result.m150902constructorimpl(t));
        } else {
            bVar.resumeWith(Result.m150902constructorimpl(t));
        }
    }

    /* renamed from: b */
    public static final <T> void m149066b(C47919b<? super T> bVar, Throwable th) {
        C7573i.m23587b(bVar, "receiver$0");
        C7573i.m23587b(th, "exception");
        if (bVar instanceof C48076ao) {
            C47919b<T> bVar2 = ((C48076ao) bVar).f122931d;
            bVar2.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(C48177u.m149466a(th, bVar2))));
            return;
        }
        bVar.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(C48177u.m149466a(th, bVar))));
    }

    /* renamed from: a */
    public static final <T> void m149063a(C48079ar<? super T> arVar, int i) {
        C7573i.m23587b(arVar, "receiver$0");
        C47919b d = arVar.mo120284d();
        if (!C48122by.m149236b(i) || !(d instanceof C48076ao) || C48122by.m149233a(i) != C48122by.m149233a(arVar.f122935e)) {
            m149064a(arVar, d, i);
            return;
        }
        C48222y yVar = ((C48076ao) d).f122930c;
        C47924e context = d.getContext();
        if (yVar.mo83490a(context)) {
            yVar.mo83489a(context, arVar);
        } else {
            m149062a(arVar);
        }
    }

    /* renamed from: a */
    public static final <T> void m149060a(C47919b<? super T> bVar, T t) {
        boolean z;
        C47924e context;
        Object a;
        C7573i.m23587b(bVar, "receiver$0");
        if (bVar instanceof C48076ao) {
            C48076ao aoVar = (C48076ao) bVar;
            if (aoVar.f122930c.mo83490a(aoVar.getContext())) {
                aoVar.f122928a = t;
                aoVar.f122935e = 1;
                aoVar.f122930c.mo83489a(aoVar.getContext(), aoVar);
                return;
            }
            C48085ax a2 = C48128cc.m149247a();
            if (a2.mo120303f()) {
                aoVar.f122928a = t;
                aoVar.f122935e = 1;
                a2.mo120296a((C48079ar<?>) aoVar);
                return;
            }
            a2.mo120297a(true);
            try {
                C48100bi biVar = (C48100bi) aoVar.getContext().get(C48100bi.f122964b);
                if (biVar == null || biVar.mo120251b()) {
                    z = false;
                } else {
                    aoVar.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(biVar.mo120330l())));
                    z = true;
                }
                if (!z) {
                    context = aoVar.getContext();
                    a = C48180x.m149482a(context, aoVar.f122929b);
                    aoVar.f122931d.resumeWith(Result.m150902constructorimpl(t));
                    C48180x.m149483b(context, a);
                }
                do {
                } while (a2.mo120302e());
                a2.mo120299b(true);
            } catch (Throwable th) {
                try {
                    throw new DispatchException("Unexpected exception in unconfined event loop", th);
                } catch (Throwable th2) {
                    a2.mo120299b(true);
                    throw th2;
                }
            }
        } else {
            bVar.resumeWith(Result.m150902constructorimpl(t));
        }
    }

    /* renamed from: a */
    public static final <T> void m149061a(C47919b<? super T> bVar, Throwable th) {
        boolean z;
        C47924e context;
        Object a;
        C7573i.m23587b(bVar, "receiver$0");
        C7573i.m23587b(th, "exception");
        if (bVar instanceof C48076ao) {
            C48076ao aoVar = (C48076ao) bVar;
            C47924e context2 = aoVar.f122931d.getContext();
            C48217t tVar = new C48217t(th);
            if (aoVar.f122930c.mo83490a(context2)) {
                aoVar.f122928a = new C48217t(th);
                aoVar.f122935e = 1;
                aoVar.f122930c.mo83489a(context2, aoVar);
                return;
            }
            C48085ax a2 = C48128cc.m149247a();
            if (a2.mo120303f()) {
                aoVar.f122928a = tVar;
                aoVar.f122935e = 1;
                a2.mo120296a((C48079ar<?>) aoVar);
                return;
            }
            a2.mo120297a(true);
            try {
                C48100bi biVar = (C48100bi) aoVar.getContext().get(C48100bi.f122964b);
                if (biVar == null || biVar.mo120251b()) {
                    z = false;
                } else {
                    aoVar.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(biVar.mo120330l())));
                    z = true;
                }
                if (!z) {
                    context = aoVar.getContext();
                    a = C48180x.m149482a(context, aoVar.f122929b);
                    C47919b<T> bVar2 = aoVar.f122931d;
                    bVar2.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(C48177u.m149466a(th, bVar2))));
                    C48180x.m149483b(context, a);
                }
                do {
                } while (a2.mo120302e());
                a2.mo120299b(true);
            } catch (Throwable th2) {
                try {
                    throw new DispatchException("Unexpected exception in unconfined event loop", th2);
                } catch (Throwable th3) {
                    a2.mo120299b(true);
                    throw th3;
                }
            }
        } else {
            bVar.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(C48177u.m149466a(th, bVar))));
        }
    }

    /* renamed from: a */
    private static <T> void m149064a(C48079ar<? super T> arVar, C47919b<? super T> bVar, int i) {
        C7573i.m23587b(arVar, "receiver$0");
        C7573i.m23587b(bVar, "delegate");
        Object a = arVar.mo120283a();
        Throwable b = C48079ar.m149067b(a);
        if (b != null) {
            C48122by.m149232a(bVar, b, i);
        } else {
            C48122by.m149231a(bVar, arVar.mo120287a(a), i);
        }
    }
}
