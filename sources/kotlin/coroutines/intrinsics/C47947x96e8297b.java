package kotlin.coroutines.intrinsics;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 */
public final class C47947x96e8297b extends ContinuationImpl {
    final /* synthetic */ C7562b $block;
    final /* synthetic */ C47919b $completion;
    final /* synthetic */ C47924e $context;
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

    public C47947x96e8297b(C7562b bVar, C47919b bVar2, C47924e eVar, C47919b bVar3, C47924e eVar2) {
        this.$block = bVar;
        this.$completion = bVar2;
        this.$context = eVar;
        super(bVar3, eVar2);
    }
}
