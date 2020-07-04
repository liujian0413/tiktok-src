package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$selectSubscribeInternal$$inlined$selectSubscribeMapped$4 */
public final class C11613xb2104fe extends Lambda implements C7562b<C11676z<A, B>, C7581n> {
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ C7599l $prop1$inlined;
    final /* synthetic */ C7599l $prop2$inlined;
    final /* synthetic */ C7563m $subscriber$inlined$1;
    final /* synthetic */ JediViewModel $this_selectSubscribeMapped$inlined;
    final /* synthetic */ C11672v $this_with$inlined;

    public C11613xb2104fe(C11672v vVar, JediViewModel jediViewModel, C0043i iVar, C7599l lVar, C7599l lVar2, C7563m mVar) {
        this.$this_with$inlined = vVar;
        this.$this_selectSubscribeMapped$inlined = jediViewModel;
        this.$owner$inlined = iVar;
        this.$prop1$inlined = lVar;
        this.$prop2$inlined = lVar2;
        this.$subscriber$inlined$1 = mVar;
        super(1);
    }

    public final void invoke(C11676z<A, B> zVar) {
        C11676z zVar2 = zVar;
        this.$subscriber$inlined$1.invoke(zVar2.f31362a, zVar2.f31363b);
    }
}
