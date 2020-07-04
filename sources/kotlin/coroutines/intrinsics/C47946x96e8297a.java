package kotlin.coroutines.intrinsics;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 */
public final class C47946x96e8297a extends RestrictedContinuationImpl {
    final /* synthetic */ C7562b $block;
    final /* synthetic */ C47919b $completion;
    private int label;

    public final Object invokeSuspend(Object obj) {
        switch (this.label) {
            case 0:
                this.label = 1;
                return this.$block.invoke(this);
            case 1:
                this.label = 2;
                return obj;
            default:
                throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }

    public C47946x96e8297a(C7562b bVar, C47919b bVar2, C47919b bVar3) {
        this.$block = bVar;
        this.$completion = bVar2;
        super(bVar3);
    }
}
