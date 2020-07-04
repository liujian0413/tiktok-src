package com.bytedance.jedi.arch;

import android.content.Intent;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

public final class ExtensionsKt$viewModel$3$$special$$inlined$apply$lambda$1 extends Lambda implements C7562b<S, S> {
    final /* synthetic */ ExtensionsKt$viewModel$3 this$0;

    public ExtensionsKt$viewModel$3$$special$$inlined$apply$lambda$1(ExtensionsKt$viewModel$3 extensionsKt$viewModel$3) {
        this.this$0 = extensionsKt$viewModel$3;
        super(1);
    }

    public final S invoke(S s) {
        C7573i.m23587b(s, "$this$initialize");
        C7563m mVar = this.this$0.$argumentsAcceptor;
        Intent intent = this.this$0.$this_viewModel.getIntent();
        C7573i.m23582a((Object) intent, "this@viewModel.intent");
        return (C11670t) mVar.invoke(s, intent.getExtras());
    }
}
