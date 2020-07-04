package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.widget.Widget;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7584c;

public final class LegeciesKt$viewModel$3 extends Lambda implements C7561a<VM> {
    final /* synthetic */ C7562b $argumentsAcceptor;
    final /* synthetic */ C7561a $keyFactory;
    final /* synthetic */ Widget $this_viewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public LegeciesKt$viewModel$3(Widget widget, C7561a aVar, C7584c cVar, C7562b bVar) {
        this.$this_viewModel = widget;
        this.$keyFactory = aVar;
        this.$viewModelClass = cVar;
        this.$argumentsAcceptor = bVar;
        super(0);
    }

    public final VM invoke() {
        C0065w wVar;
        Object n = this.$this_viewModel.mo31589n();
        if (n instanceof Fragment) {
            wVar = C0069x.m158a((Fragment) n, ((C11497af) this.$this_viewModel).mo29056f());
        } else if (n instanceof FragmentActivity) {
            wVar = C0069x.m160a((FragmentActivity) n, ((C11497af) this.$this_viewModel).mo29056f());
        } else {
            throw new IllegalStateException();
        }
        VM vm = (JediViewModel) wVar.mo148a((String) this.$keyFactory.invoke(), C7560a.m23571a(this.$viewModelClass));
        C11665o oVar = vm.f31065b;
        C7573i.m23581a(4, "VM");
        C11664n a = oVar.mo29189a(JediViewModel.class);
        if (a != null) {
            C7573i.m23582a((Object) vm, "this");
            a.binding(vm);
        }
        vm.mo29034a(this.$argumentsAcceptor);
        return vm;
    }
}
