package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$selectSubscribeMapped$$inlined$with$lambda$14 */
public final class C11618x374942ab extends Lambda implements C7562b<R, C7581n> {
    final /* synthetic */ C7562b $mapper$inlined;
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ C7562b $subscriber$inlined;
    final /* synthetic */ JediViewModel $this_selectSubscribeMapped$inlined;
    final /* synthetic */ C11672v $this_with$inlined;

    public C11618x374942ab(C11672v vVar, JediViewModel jediViewModel, C7562b bVar, C0043i iVar, C7562b bVar2) {
        this.$this_with$inlined = vVar;
        this.$this_selectSubscribeMapped$inlined = jediViewModel;
        this.$mapper$inlined = bVar;
        this.$owner$inlined = iVar;
        this.$subscriber$inlined = bVar2;
        super(1);
    }

    public final void invoke(R r) {
        this.$subscriber$inlined.invoke(r);
    }
}
