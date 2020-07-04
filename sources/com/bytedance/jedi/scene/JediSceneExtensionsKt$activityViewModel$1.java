package com.bytedance.jedi.scene;

import kotlin.jvm.C7560a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7584c;

public final class JediSceneExtensionsKt$activityViewModel$1 extends Lambda implements C7561a<String> {
    final /* synthetic */ C7584c $viewModelClass;

    public JediSceneExtensionsKt$activityViewModel$1(C7584c cVar) {
        this.$viewModelClass = cVar;
        super(0);
    }

    public final String invoke() {
        String name = C7560a.m23571a(this.$viewModelClass).getName();
        C7573i.m23582a((Object) name, "viewModelClass.java.name");
        return name;
    }
}
