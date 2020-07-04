package kotlinx.coroutines.p1885a;

import kotlin.C47965i;
import kotlin.C7581n;
import kotlin.Result;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.C48078aq;

/* renamed from: kotlinx.coroutines.a.a */
public final class C48049a {
    /* renamed from: a */
    public static final <T> void m149005a(C7562b<? super C47919b<? super T>, ? extends Object> bVar, C47919b<? super T> bVar2) {
        C7573i.m23587b(bVar, "receiver$0");
        C7573i.m23587b(bVar2, "completion");
        try {
            C48078aq.m149060a(C47948a.m148878a(C47948a.m148879a(bVar, bVar2)), C7581n.f20898a);
        } catch (Throwable th) {
            bVar2.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(th)));
        }
    }

    /* renamed from: a */
    public static final <R, T> void m149006a(C7563m<? super R, ? super C47919b<? super T>, ? extends Object> mVar, R r, C47919b<? super T> bVar) {
        C7573i.m23587b(mVar, "receiver$0");
        C7573i.m23587b(bVar, "completion");
        try {
            C48078aq.m149060a(C47948a.m148878a(C47948a.m148880a(mVar, r, bVar)), C7581n.f20898a);
        } catch (Throwable th) {
            bVar.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(th)));
        }
    }
}
