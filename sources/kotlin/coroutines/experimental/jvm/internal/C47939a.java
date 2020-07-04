package kotlin.coroutines.experimental.jvm.internal;

import kotlin.coroutines.experimental.C47930a;
import kotlin.coroutines.experimental.C47934b;
import kotlin.coroutines.experimental.C47936c;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.coroutines.experimental.jvm.internal.a */
public final class C47939a {
    /* renamed from: a */
    public static final <T> C47930a<T> m148876a(C47936c cVar, C47930a<? super T> aVar) {
        C7573i.m23587b(cVar, "context");
        C7573i.m23587b(aVar, "continuation");
        C47934b bVar = (C47934b) cVar.mo120146a(C47934b.f122780a);
        if (bVar != null) {
            C47930a<T> a = bVar.mo120145a(aVar);
            if (a != null) {
                return a;
            }
        }
        return aVar;
    }
}
