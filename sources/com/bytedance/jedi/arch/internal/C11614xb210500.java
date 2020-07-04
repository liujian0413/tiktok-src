package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11492aa;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7599l;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$selectSubscribeInternal$$inlined$selectSubscribeMapped$6 */
public final class C11614xb210500 extends Lambda implements C7562b<C11492aa<A, B, C>, C7581n> {
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ C7599l $prop1$inlined;
    final /* synthetic */ C7599l $prop2$inlined;
    final /* synthetic */ C7599l $prop3$inlined;
    final /* synthetic */ C48006q $subscriber$inlined$1;
    final /* synthetic */ JediViewModel $this_selectSubscribeMapped$inlined;
    final /* synthetic */ C11672v $this_with$inlined;

    public C11614xb210500(C11672v vVar, JediViewModel jediViewModel, C0043i iVar, C7599l lVar, C7599l lVar2, C7599l lVar3, C48006q qVar) {
        this.$this_with$inlined = vVar;
        this.$this_selectSubscribeMapped$inlined = jediViewModel;
        this.$owner$inlined = iVar;
        this.$prop1$inlined = lVar;
        this.$prop2$inlined = lVar2;
        this.$prop3$inlined = lVar3;
        this.$subscriber$inlined$1 = qVar;
        super(1);
    }

    public final void invoke(C11492aa<A, B, C> aaVar) {
        C11492aa aaVar2 = aaVar;
        this.$subscriber$inlined$1.invoke(aaVar2.f31081a, aaVar2.f31082b, aaVar2.f31083c);
    }
}
