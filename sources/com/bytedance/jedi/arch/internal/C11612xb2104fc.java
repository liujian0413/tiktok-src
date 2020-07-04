package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7599l;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$selectSubscribeInternal$$inlined$selectSubscribeMapped$2 */
public final class C11612xb2104fc extends Lambda implements C7562b<C11675y<A>, C7581n> {
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ C7599l $prop1$inlined;
    final /* synthetic */ C7562b $subscriber$inlined$1;
    final /* synthetic */ JediViewModel $this_selectSubscribeMapped$inlined;
    final /* synthetic */ C11672v $this_with$inlined;

    public C11612xb2104fc(C11672v vVar, JediViewModel jediViewModel, C0043i iVar, C7599l lVar, C7562b bVar) {
        this.$this_with$inlined = vVar;
        this.$this_selectSubscribeMapped$inlined = jediViewModel;
        this.$owner$inlined = iVar;
        this.$prop1$inlined = lVar;
        this.$subscriber$inlined$1 = bVar;
        super(1);
    }

    public final void invoke(C11675y<A> yVar) {
        this.$subscriber$inlined$1.invoke(yVar.f31361a);
    }
}
