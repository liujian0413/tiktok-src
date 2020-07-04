package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7599l;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$selectSubscribeInternal$$inlined$selectSubscribeMapped$8 */
public final class C11615xb210502 extends Lambda implements C7562b<C11493ab<A, B, C, D>, C7581n> {
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ C7599l $prop1$inlined;
    final /* synthetic */ C7599l $prop2$inlined;
    final /* synthetic */ C7599l $prop3$inlined;
    final /* synthetic */ C7599l $prop4$inlined;
    final /* synthetic */ C48007r $subscriber$inlined$1;
    final /* synthetic */ JediViewModel $this_selectSubscribeMapped$inlined;
    final /* synthetic */ C11672v $this_with$inlined;

    public C11615xb210502(C11672v vVar, JediViewModel jediViewModel, C0043i iVar, C7599l lVar, C7599l lVar2, C7599l lVar3, C7599l lVar4, C48007r rVar) {
        this.$this_with$inlined = vVar;
        this.$this_selectSubscribeMapped$inlined = jediViewModel;
        this.$owner$inlined = iVar;
        this.$prop1$inlined = lVar;
        this.$prop2$inlined = lVar2;
        this.$prop3$inlined = lVar3;
        this.$prop4$inlined = lVar4;
        this.$subscriber$inlined$1 = rVar;
        super(1);
    }

    public final void invoke(C11493ab<A, B, C, D> abVar) {
        C11493ab abVar2 = abVar;
        this.$subscriber$inlined$1.invoke(abVar2.f31084a, abVar2.f31085b, abVar2.f31086c, abVar2.f31087d);
    }
}
