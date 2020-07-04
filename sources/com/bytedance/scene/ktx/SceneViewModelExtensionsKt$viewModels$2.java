package com.bytedance.scene.ktx;

import android.arch.lifecycle.C0070y;
import android.arch.lifecycle.C0071z;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

public final class SceneViewModelExtensionsKt$viewModels$2 extends Lambda implements C7561a<C0070y> {
    final /* synthetic */ C7561a $ownerProducer;

    public SceneViewModelExtensionsKt$viewModels$2(C7561a aVar) {
        this.$ownerProducer = aVar;
        super(0);
    }

    public final C0070y invoke() {
        C0070y viewModelStore = ((C0071z) this.$ownerProducer.invoke()).getViewModelStore();
        C7573i.m23582a((Object) viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }
}
