package kotlin.coroutines.intrinsics;

import kotlin.TypeCastException;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.C7577n;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1 */
public final class C47942xa50de660 extends RestrictedContinuationImpl {
    final /* synthetic */ C47919b $completion;
    final /* synthetic */ C7562b $this_createCoroutineUnintercepted$inlined;
    private int label;

    public final Object invokeSuspend(Object obj) {
        switch (this.label) {
            case 0:
                this.label = 1;
                C47919b bVar = this;
                C7562b bVar2 = this.$this_createCoroutineUnintercepted$inlined;
                if (bVar2 != null) {
                    return ((C7562b) C7577n.m23617a((Object) bVar2, 1)).invoke(bVar);
                }
                throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            case 1:
                this.label = 2;
                return obj;
            default:
                throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }

    public C47942xa50de660(C47919b bVar, C47919b bVar2, C7562b bVar3) {
        this.$completion = bVar;
        this.$this_createCoroutineUnintercepted$inlined = bVar3;
        super(bVar2);
    }
}
