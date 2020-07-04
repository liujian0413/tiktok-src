package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11494ac;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7599l;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$selectSubscribeInternal$$inlined$selectSubscribeMapped$10 */
public final class C11611x58ff9a95 extends Lambda implements C7562b<C11494ac<A, B, C, D, E>, C7581n> {
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ C7599l $prop1$inlined;
    final /* synthetic */ C7599l $prop2$inlined;
    final /* synthetic */ C7599l $prop3$inlined;
    final /* synthetic */ C7599l $prop4$inlined;
    final /* synthetic */ C7599l $prop5$inlined;
    final /* synthetic */ C48008s $subscriber$inlined$1;
    final /* synthetic */ JediViewModel $this_selectSubscribeMapped$inlined;
    final /* synthetic */ C11672v $this_with$inlined;

    public C11611x58ff9a95(C11672v vVar, JediViewModel jediViewModel, C0043i iVar, C7599l lVar, C7599l lVar2, C7599l lVar3, C7599l lVar4, C7599l lVar5, C48008s sVar) {
        this.$this_with$inlined = vVar;
        this.$this_selectSubscribeMapped$inlined = jediViewModel;
        this.$owner$inlined = iVar;
        this.$prop1$inlined = lVar;
        this.$prop2$inlined = lVar2;
        this.$prop3$inlined = lVar3;
        this.$prop4$inlined = lVar4;
        this.$prop5$inlined = lVar5;
        this.$subscriber$inlined$1 = sVar;
        super(1);
    }

    public final void invoke(C11494ac<A, B, C, D, E> acVar) {
        C11494ac acVar2 = acVar;
        this.$subscriber$inlined$1.invoke(acVar2.f31088a, acVar2.f31089b, acVar2.f31090c, acVar2.f31091d, acVar2.f31092e);
    }
}
