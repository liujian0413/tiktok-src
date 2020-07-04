package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11500c;
import com.bytedance.jedi.arch.C11649l;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11674x;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7599l;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$asyncSubscribeInternal$$inlined$selectSubscribeMapped$2 */
public final class C11596x6665a93a extends Lambda implements C7562b<C11675y<C11491a<? extends T>>, C7581n> {
    final /* synthetic */ C7562b $onError$inlined;
    final /* synthetic */ C7561a $onLoading$inlined;
    final /* synthetic */ C7562b $onSuccess$inlined;
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ C7599l $prop1$inlined;
    final /* synthetic */ JediViewModel $this_selectSubscribeMapped$inlined;
    final /* synthetic */ C11672v $this_with$inlined;

    public C11596x6665a93a(C11672v vVar, JediViewModel jediViewModel, C0043i iVar, C7599l lVar, C7561a aVar, C7562b bVar, C7562b bVar2) {
        this.$this_with$inlined = vVar;
        this.$this_selectSubscribeMapped$inlined = jediViewModel;
        this.$owner$inlined = iVar;
        this.$prop1$inlined = lVar;
        this.$onLoading$inlined = aVar;
        this.$onError$inlined = bVar;
        this.$onSuccess$inlined = bVar2;
        super(1);
    }

    public final void invoke(C11675y<C11491a<? extends T>> yVar) {
        C11491a aVar = (C11491a) yVar.f31361a;
        if (aVar instanceof C11649l) {
            C7561a aVar2 = this.$onLoading$inlined;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (aVar instanceof C11500c) {
            C7562b bVar = this.$onError$inlined;
            if (bVar != null) {
                bVar.invoke(((C11500c) aVar).f31096a);
            }
        } else if (aVar instanceof C11674x) {
            C7562b bVar2 = this.$onSuccess$inlined;
            if (bVar2 != null) {
                bVar2.invoke(((C11674x) aVar).mo29046a());
            }
        }
    }
}
