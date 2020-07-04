package kotlinx.coroutines.channels;

import java.util.Map;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C7540d(mo19421b = "Channels.common.kt", mo19422c = {2580, 2580}, mo19423d = "associateBy", mo19424e = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt")
public final class ChannelsKt__Channels_commonKt$associateBy$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__Channels_commonKt$associateBy$2(C47919b bVar) {
        super(bVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C48136c.m149276a(null, null, null, (C47919b<? super Map<K, ? extends V>>) this);
    }
}
