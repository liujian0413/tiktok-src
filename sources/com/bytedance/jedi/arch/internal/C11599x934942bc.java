package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$middlewareSelectSubscribeInternal$$inlined$middlewareSelectSubscribeMapped$2 */
public final class C11599x934942bc extends Lambda implements C7562b<C11675y<A>, C7581n> {
    final /* synthetic */ boolean $force$inlined;
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ C7562b $subscriber$inlined$1;
    final /* synthetic */ JediViewModel $this_middlewareSelectSubscribeMapped$inlined;
    final /* synthetic */ boolean $uniqueOnly$inlined;

    public C11599x934942bc(JediViewModel jediViewModel, C0043i iVar, boolean z, boolean z2, C7562b bVar) {
        this.$this_middlewareSelectSubscribeMapped$inlined = jediViewModel;
        this.$owner$inlined = iVar;
        this.$uniqueOnly$inlined = z;
        this.$force$inlined = z2;
        this.$subscriber$inlined$1 = bVar;
        super(1);
    }

    public final void invoke(C11675y<A> yVar) {
        this.$subscriber$inlined$1.invoke(yVar.f31361a);
    }
}
