package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$middlewareSelectSubscribeInternal$$inlined$middlewareSelectSubscribeMapped$8 */
public final class C11602x934942c2 extends Lambda implements C7562b<C11493ab<A, B, C, D>, C7581n> {
    final /* synthetic */ boolean $force$inlined;
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ C48007r $subscriber$inlined$1;
    final /* synthetic */ JediViewModel $this_middlewareSelectSubscribeMapped$inlined;
    final /* synthetic */ boolean $uniqueOnly$inlined;

    public C11602x934942c2(JediViewModel jediViewModel, C0043i iVar, boolean z, boolean z2, C48007r rVar) {
        this.$this_middlewareSelectSubscribeMapped$inlined = jediViewModel;
        this.$owner$inlined = iVar;
        this.$uniqueOnly$inlined = z;
        this.$force$inlined = z2;
        this.$subscriber$inlined$1 = rVar;
        super(1);
    }

    public final void invoke(C11493ab<A, B, C, D> abVar) {
        C11493ab abVar2 = abVar;
        this.$subscriber$inlined$1.invoke(abVar2.f31084a, abVar2.f31085b, abVar2.f31086c, abVar2.f31087d);
    }
}
