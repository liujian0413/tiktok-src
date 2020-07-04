package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11492aa;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$middlewareSelectSubscribeInternal$$inlined$middlewareSelectSubscribeMapped$6 */
public final class C11601x934942c0 extends Lambda implements C7562b<C11492aa<A, B, C>, C7581n> {
    final /* synthetic */ boolean $force$inlined;
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ C48006q $subscriber$inlined$1;
    final /* synthetic */ JediViewModel $this_middlewareSelectSubscribeMapped$inlined;
    final /* synthetic */ boolean $uniqueOnly$inlined;

    public C11601x934942c0(JediViewModel jediViewModel, C0043i iVar, boolean z, boolean z2, C48006q qVar) {
        this.$this_middlewareSelectSubscribeMapped$inlined = jediViewModel;
        this.$owner$inlined = iVar;
        this.$uniqueOnly$inlined = z;
        this.$force$inlined = z2;
        this.$subscriber$inlined$1 = qVar;
        super(1);
    }

    public final void invoke(C11492aa<A, B, C> aaVar) {
        C11492aa aaVar2 = aaVar;
        this.$subscriber$inlined$1.invoke(aaVar2.f31081a, aaVar2.f31082b, aaVar2.f31083c);
    }
}
