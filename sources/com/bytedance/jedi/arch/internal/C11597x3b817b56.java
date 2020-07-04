package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11500c;
import com.bytedance.jedi.arch.C11649l;
import com.bytedance.jedi.arch.C11674x;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.arch.internal.SubscriptioinExtensionsKt$middlewareAsyncSubscribeInternal$$inlined$middlewareSelectSubscribeMapped$2 */
public final class C11597x3b817b56 extends Lambda implements C7562b<C11675y<C11491a<? extends T>>, C7581n> {
    final /* synthetic */ boolean $force$inlined;
    final /* synthetic */ C7562b $onError$inlined;
    final /* synthetic */ C7561a $onLoading$inlined;
    final /* synthetic */ C7562b $onSuccess$inlined;
    final /* synthetic */ C0043i $owner$inlined;
    final /* synthetic */ JediViewModel $this_middlewareSelectSubscribeMapped$inlined;
    final /* synthetic */ boolean $uniqueOnly$inlined;

    public C11597x3b817b56(JediViewModel jediViewModel, C0043i iVar, boolean z, boolean z2, C7562b bVar, C7562b bVar2, C7561a aVar) {
        this.$this_middlewareSelectSubscribeMapped$inlined = jediViewModel;
        this.$owner$inlined = iVar;
        this.$uniqueOnly$inlined = z;
        this.$force$inlined = z2;
        this.$onSuccess$inlined = bVar;
        this.$onError$inlined = bVar2;
        this.$onLoading$inlined = aVar;
        super(1);
    }

    public final void invoke(C11675y<C11491a<? extends T>> yVar) {
        C11491a aVar = (C11491a) yVar.f31361a;
        if (aVar instanceof C11674x) {
            C7562b bVar = this.$onSuccess$inlined;
            if (bVar != null) {
                bVar.invoke(((C11674x) aVar).mo29046a());
            }
        } else if (aVar instanceof C11500c) {
            C7562b bVar2 = this.$onError$inlined;
            if (bVar2 != null) {
                bVar2.invoke(((C11500c) aVar).f31096a);
            }
        } else if (aVar instanceof C11649l) {
            C7561a aVar2 = this.$onLoading$inlined;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
    }
}
