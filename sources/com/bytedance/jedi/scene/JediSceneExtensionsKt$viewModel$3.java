package com.bytedance.jedi.scene;

import com.bytedance.jedi.arch.C11497af;
import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.C11665o;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12674s;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;

public final class JediSceneExtensionsKt$viewModel$3 extends Lambda implements C7561a<VM> {
    final /* synthetic */ C7563m $argumentsAcceptor;
    final /* synthetic */ C7561a $keyFactory;
    final /* synthetic */ C12629j $this_viewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public JediSceneExtensionsKt$viewModel$3(C12629j jVar, C7561a aVar, C7584c cVar, C7563m mVar) {
        this.$this_viewModel = jVar;
        this.$keyFactory = aVar;
        this.$viewModelClass = cVar;
        this.$argumentsAcceptor = mVar;
        super(0);
    }

    public final VM invoke() {
        VM vm = (JediViewModel) C12674s.m36851a(this.$this_viewModel, ((C11497af) this.$this_viewModel).mo29056f()).mo148a((String) this.$keyFactory.invoke(), C7560a.m23571a(this.$viewModelClass));
        C11665o oVar = vm.f31065b;
        C7573i.m23581a(4, "VM");
        C11664n a = oVar.mo29189a(JediViewModel.class);
        if (a != null) {
            C7573i.m23582a((Object) vm, "this");
            a.binding(vm);
        }
        vm.mo29034a((C7562b<? super S, ? extends S>) new C11996xf085e5a4<Object,Object>(this));
        return vm;
    }
}
