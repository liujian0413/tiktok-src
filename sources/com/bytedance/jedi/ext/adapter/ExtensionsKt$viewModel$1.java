package com.bytedance.jedi.ext.adapter;

import kotlin.jvm.C7560a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7584c;

public final class ExtensionsKt$viewModel$1 extends Lambda implements C7561a<String> {
    final /* synthetic */ JediViewHolder $this_viewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public ExtensionsKt$viewModel$1(JediViewHolder jediViewHolder, C7584c cVar) {
        this.$this_viewModel = jediViewHolder;
        this.$viewModelClass = cVar;
        super(0);
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.$this_viewModel.getClass().getName());
        sb.append('_');
        sb.append(C7560a.m23571a(this.$viewModelClass).getName());
        return sb.toString();
    }
}
