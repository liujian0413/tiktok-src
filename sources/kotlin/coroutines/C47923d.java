package kotlin.coroutines;

import kotlin.C7581n;
import kotlin.Result;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: kotlin.coroutines.d */
public final class C47923d {
    /* renamed from: a */
    public static final <T> void m148865a(C7562b<? super C47919b<? super T>, ? extends Object> bVar, C47919b<? super T> bVar2) {
        C7573i.m23587b(bVar, "$this$startCoroutine");
        C7573i.m23587b(bVar2, "completion");
        C47948a.m148878a(C47948a.m148879a(bVar, bVar2)).resumeWith(Result.m150902constructorimpl(C7581n.f20898a));
    }

    /* renamed from: a */
    public static final <R, T> void m148866a(C7563m<? super R, ? super C47919b<? super T>, ? extends Object> mVar, R r, C47919b<? super T> bVar) {
        C7573i.m23587b(mVar, "$this$startCoroutine");
        C7573i.m23587b(bVar, "completion");
        C47948a.m148878a(C47948a.m148880a(mVar, r, bVar)).resumeWith(Result.m150902constructorimpl(C7581n.f20898a));
    }
}
