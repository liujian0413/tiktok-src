package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11494ac;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$middlewareSelectSubscribeInternal$$inlined$middlewareSelectSubscribeMapped$10 */
public final class C11598xd5df14d5 extends Lambda implements C7562b<C11494ac<A, B, C, D, E>, C7581n> {
    final /* synthetic */ boolean $force$inlined;
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ C48008s $subscriber$inlined$1;
    final /* synthetic */ JediViewModel $this_middlewareSelectSubscribeMapped$inlined;
    final /* synthetic */ boolean $uniqueOnly$inlined;

    public C11598xd5df14d5(JediViewModel jediViewModel, C0043i iVar, boolean z, boolean z2, C48008s sVar) {
        this.$this_middlewareSelectSubscribeMapped$inlined = jediViewModel;
        this.$owner$inlined = iVar;
        this.$uniqueOnly$inlined = z;
        this.$force$inlined = z2;
        this.$subscriber$inlined$1 = sVar;
        super(1);
    }

    public final void invoke(C11494ac<A, B, C, D, E> acVar) {
        C11494ac acVar2 = acVar;
        this.$subscriber$inlined$1.invoke(acVar2.f31088a, acVar2.f31089b, acVar2.f31090c, acVar2.f31091d, acVar2.f31092e);
    }
}
