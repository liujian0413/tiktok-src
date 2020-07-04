package com.bytedance.widget.ext.list;

import com.bytedance.jedi.arch.C11497af;
import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.C11665o;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.widget.ext.list.C13039b.C13040a;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7584c;

public final class ExtensionsKt$listViewModel$3 extends Lambda implements C7561a<VM> {
    final /* synthetic */ C7562b $argumentsAcceptor;
    final /* synthetic */ C7561a $keyFactory;
    final /* synthetic */ ItemWidget $this_listViewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public ExtensionsKt$listViewModel$3(ItemWidget itemWidget, C7561a aVar, C7584c cVar, C7562b bVar) {
        this.$this_listViewModel = itemWidget;
        this.$keyFactory = aVar;
        this.$viewModelClass = cVar;
        this.$argumentsAcceptor = bVar;
        super(0);
    }

    public final VM invoke() {
        VM vm = (JediViewModel) C13040a.m38054a(((C11497af) this.$this_listViewModel).mo29056f(), this.$this_listViewModel.mo31610a()).mo31611a((String) this.$keyFactory.invoke(), C7560a.m23571a(this.$viewModelClass));
        C11665o oVar = vm.f31065b;
        C7573i.m23581a(4, "VM");
        C11664n a = oVar.mo29189a(JediViewModel.class);
        if (a != null) {
            a.binding(vm);
        }
        vm.mo29034a(this.$argumentsAcceptor);
        return vm;
    }
}
