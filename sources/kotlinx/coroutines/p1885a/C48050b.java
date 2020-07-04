package kotlinx.coroutines.p1885a;

import kotlin.C47965i;
import kotlin.Result;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C47955f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7577n;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.C48048a;
import kotlinx.coroutines.C48113bp;
import kotlinx.coroutines.C48217t;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.C48176t;
import kotlinx.coroutines.internal.C48180x;

/* renamed from: kotlinx.coroutines.a.b */
public final class C48050b {
    /* renamed from: a */
    public static final <T> void m149008a(C7562b<? super C47919b<? super T>, ? extends Object> bVar, C47919b<? super T> bVar2) {
        C47924e context;
        Object a;
        C7573i.m23587b(bVar, "receiver$0");
        C7573i.m23587b(bVar2, "completion");
        C47919b a2 = C47955f.m148889a(bVar2);
        try {
            context = bVar2.getContext();
            a = C48180x.m149482a(context, null);
            Object invoke = ((C7562b) C7577n.m23617a((Object) bVar, 1)).invoke(a2);
            C48180x.m149483b(context, a);
            if (invoke != C47948a.m148881a()) {
                a2.resumeWith(Result.m150902constructorimpl(invoke));
            }
        } catch (Throwable th) {
            a2.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(th)));
        }
    }

    /* renamed from: a */
    public static final <T, R> Object m149007a(C48048a<? super T> aVar, R r, C7563m<? super R, ? super C47919b<? super T>, ? extends Object> mVar) {
        Object obj;
        C7573i.m23587b(aVar, "receiver$0");
        C7573i.m23587b(mVar, "block");
        aVar.ca_();
        try {
            obj = ((C7563m) C7577n.m23617a((Object) mVar, 2)).invoke(r, aVar);
        } catch (Throwable th) {
            obj = new C48217t(th);
        }
        if (obj == C47948a.m148881a() || !aVar.mo120339a(obj, 4)) {
            return C47948a.m148881a();
        }
        Object o = aVar.mo120343o();
        if (!(o instanceof C48217t)) {
            return C48113bp.m149222b(o);
        }
        throw C48176t.m149460a(aVar, ((C48217t) o).f123124a);
    }

    /* renamed from: b */
    public static final <T, R> Object m149010b(C48048a<? super T> aVar, R r, C7563m<? super R, ? super C47919b<? super T>, ? extends Object> mVar) {
        Object obj;
        boolean z;
        C7573i.m23587b(aVar, "receiver$0");
        C7573i.m23587b(mVar, "block");
        aVar.ca_();
        try {
            obj = ((C7563m) C7577n.m23617a((Object) mVar, 2)).invoke(r, aVar);
        } catch (Throwable th) {
            obj = new C48217t(th);
        }
        if (obj == C47948a.m148881a() || !aVar.mo120339a(obj, 4)) {
            return C47948a.m148881a();
        }
        Object o = aVar.mo120343o();
        if (!(o instanceof C48217t)) {
            return C48113bp.m149222b(o);
        }
        C48217t tVar = (C48217t) o;
        Throwable th2 = tVar.f123124a;
        if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).coroutine != aVar) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            throw C48176t.m149460a(aVar, tVar.f123124a);
        } else if (!(obj instanceof C48217t)) {
            return obj;
        } else {
            throw C48176t.m149460a(aVar, ((C48217t) obj).f123124a);
        }
    }

    /* renamed from: a */
    public static final <R, T> void m149009a(C7563m<? super R, ? super C47919b<? super T>, ? extends Object> mVar, R r, C47919b<? super T> bVar) {
        C47924e context;
        Object a;
        C7573i.m23587b(mVar, "receiver$0");
        C7573i.m23587b(bVar, "completion");
        C47919b a2 = C47955f.m148889a(bVar);
        try {
            context = bVar.getContext();
            a = C48180x.m149482a(context, null);
            Object invoke = ((C7563m) C7577n.m23617a((Object) mVar, 2)).invoke(r, a2);
            C48180x.m149483b(context, a);
            if (invoke != C47948a.m148881a()) {
                a2.resumeWith(Result.m150902constructorimpl(invoke));
            }
        } catch (Throwable th) {
            a2.resumeWith(Result.m150902constructorimpl(C47965i.m148906a(th)));
        }
    }
}
