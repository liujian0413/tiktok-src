package kotlinx.coroutines;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47920c;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: kotlinx.coroutines.f */
final /* synthetic */ class C48144f {
    /* renamed from: a */
    public static final <T> T m149381a(C47924e eVar, C7563m<? super C48056ad, ? super C47919b<? super T>, ? extends Object> mVar) throws InterruptedException {
        C47924e eVar2;
        C48085ax axVar;
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(mVar, "block");
        Thread currentThread = Thread.currentThread();
        if (((C47920c) eVar.get(C47920c.f122777a)) == null) {
            axVar = C48128cc.m149247a();
            eVar2 = C48221x.m149607a(C48093bb.f122957a, eVar.plus(axVar));
        } else {
            axVar = C48128cc.m149249b();
            eVar2 = C48221x.m149607a(C48093bb.f122957a, eVar);
        }
        C7573i.m23582a((Object) currentThread, "currentThread");
        C48124c cVar = new C48124c(eVar2, currentThread, axVar);
        cVar.mo120250a(CoroutineStart.DEFAULT, cVar, mVar);
        return cVar.cc_();
    }

    /* renamed from: a */
    public static /* synthetic */ Object m149382a(C47924e eVar, C7563m mVar, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            eVar = EmptyCoroutineContext.INSTANCE;
        }
        return C48143e.m149374a(eVar, mVar);
    }
}
