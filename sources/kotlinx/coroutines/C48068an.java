package kotlinx.coroutines;

import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47920c;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.C47924e.C47927b;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C47955f;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.an */
public final class C48068an {
    /* renamed from: a */
    public static final C48066am m149043a(C47924e eVar) {
        C7573i.m23587b(eVar, "receiver$0");
        C47927b bVar = eVar.get(C47920c.f122777a);
        if (!(bVar instanceof C48066am)) {
            bVar = null;
        }
        C48066am amVar = (C48066am) bVar;
        if (amVar == null) {
            return C48061ai.m149030a();
        }
        return amVar;
    }

    /* renamed from: a */
    public static final Object m149042a(long j, C47919b<? super C7581n> bVar) {
        if (j <= 0) {
            return C7581n.f20898a;
        }
        C48188k kVar = new C48188k(C47948a.m148878a(bVar), 1);
        C48187j jVar = kVar;
        m149043a(jVar.getContext()).mo120274a(j, jVar);
        Object b = kVar.mo120408b();
        if (b == C47948a.m148881a()) {
            C47955f.m148891c(bVar);
        }
        return b;
    }
}
