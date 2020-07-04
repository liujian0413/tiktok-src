package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7584c;

public final class ExtensionsKt$activityViewModel$2 extends Lambda implements C7561a<VM> {
    final /* synthetic */ C7561a $keyFactory;
    final /* synthetic */ Fragment $this_activityViewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public ExtensionsKt$activityViewModel$2(Fragment fragment, C7561a aVar, C7584c cVar) {
        this.$this_activityViewModel = fragment;
        this.$keyFactory = aVar;
        this.$viewModelClass = cVar;
        super(0);
    }

    public final VM invoke() {
        return (JediViewModel) C0069x.m160a(this.$this_activityViewModel.requireActivity(), C11498b.m33903a()).mo148a((String) this.$keyFactory.invoke(), C7560a.m23571a(this.$viewModelClass));
    }
}
