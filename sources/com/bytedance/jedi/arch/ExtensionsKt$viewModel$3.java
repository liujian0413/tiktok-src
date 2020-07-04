package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;

public final class ExtensionsKt$viewModel$3 extends Lambda implements C7561a<VM> {
    final /* synthetic */ C7563m $argumentsAcceptor;
    final /* synthetic */ C7561a $keyFactory;
    final /* synthetic */ AppCompatActivity $this_viewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public ExtensionsKt$viewModel$3(AppCompatActivity appCompatActivity, C7561a aVar, C7584c cVar, C7563m mVar) {
        this.$this_viewModel = appCompatActivity;
        this.$keyFactory = aVar;
        this.$viewModelClass = cVar;
        this.$argumentsAcceptor = mVar;
        super(0);
    }

    public final VM invoke() {
        VM vm = (JediViewModel) C0069x.m160a((FragmentActivity) this.$this_viewModel, ((C11497af) this.$this_viewModel).mo29056f()).mo148a((String) this.$keyFactory.invoke(), C7560a.m23571a(this.$viewModelClass));
        C11665o oVar = vm.f31065b;
        C7573i.m23581a(4, "VM");
        C11664n a = oVar.mo29189a(JediViewModel.class);
        if (a != null) {
            C7573i.m23582a((Object) vm, "this");
            a.binding(vm);
        }
        vm.mo29034a((C7562b<? super S, ? extends S>) new ExtensionsKt$viewModel$3$$special$$inlined$apply$lambda$1<Object,Object>(this));
        return vm;
    }
}
