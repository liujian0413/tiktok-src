package kotlin.coroutines.intrinsics;

import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.C47955f;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: kotlin.coroutines.intrinsics.b */
public class C47949b {
    /* renamed from: a */
    public static final <T> C47919b<T> m148878a(C47919b<? super T> bVar) {
        C47919b<? super T> bVar2;
        C7573i.m23587b(bVar, "$this$intercepted");
        if (!(bVar instanceof ContinuationImpl)) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        ContinuationImpl continuationImpl = (ContinuationImpl) bVar2;
        if (continuationImpl == null) {
            return bVar;
        }
        C47919b intercepted = continuationImpl.intercepted();
        if (intercepted == null) {
            return bVar;
        }
        return intercepted;
    }

    /* renamed from: a */
    public static final <T> C47919b<C7581n> m148879a(C7562b<? super C47919b<? super T>, ? extends Object> bVar, C47919b<? super T> bVar2) {
        C7573i.m23587b(bVar, "$this$createCoroutineUnintercepted");
        C7573i.m23587b(bVar2, "completion");
        C47919b a = C47955f.m148889a(bVar2);
        if (bVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) bVar).create(a);
        }
        C47924e context = a.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            if (a != null) {
                return new C47942xa50de660<>(a, a, bVar);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (a != null) {
            C47943xa50de661 intrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2 = new C47943xa50de661(a, context, a, context, bVar);
            return intrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }

    /* renamed from: a */
    public static final <R, T> C47919b<C7581n> m148880a(C7563m<? super R, ? super C47919b<? super T>, ? extends Object> mVar, R r, C47919b<? super T> bVar) {
        C7573i.m23587b(mVar, "$this$createCoroutineUnintercepted");
        C7573i.m23587b(bVar, "completion");
        C47919b a = C47955f.m148889a(bVar);
        if (mVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) mVar).create(r, a);
        }
        C47924e context = a.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            if (a != null) {
                return new C47944xa50de662<>(a, a, mVar, r);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (a != null) {
            C47945xa50de663 intrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 = new C47945xa50de663(a, context, a, context, mVar, r);
            return intrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }
}
