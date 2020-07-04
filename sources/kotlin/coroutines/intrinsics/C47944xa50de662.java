package kotlin.coroutines.intrinsics;

import kotlin.TypeCastException;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.C7577n;
import kotlin.jvm.p357a.C7563m;

/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3 */
public final class C47944xa50de662 extends RestrictedContinuationImpl {
    final /* synthetic */ C47919b $completion;
    final /* synthetic */ Object $receiver$inlined;
    final /* synthetic */ C7563m $this_createCoroutineUnintercepted$inlined;
    private int label;

    public final Object invokeSuspend(Object obj) {
        switch (this.label) {
            case 0:
                this.label = 1;
                C47919b bVar = this;
                C7563m mVar = this.$this_createCoroutineUnintercepted$inlined;
                if (mVar != null) {
                    return ((C7563m) C7577n.m23617a((Object) mVar, 2)).invoke(this.$receiver$inlined, bVar);
                }
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            case 1:
                this.label = 2;
                return obj;
            default:
                throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }

    public C47944xa50de662(C47919b bVar, C47919b bVar2, C7563m mVar, Object obj) {
        this.$completion = bVar;
        this.$this_createCoroutineUnintercepted$inlined = mVar;
        this.$receiver$inlined = obj;
        super(bVar2);
    }
}
