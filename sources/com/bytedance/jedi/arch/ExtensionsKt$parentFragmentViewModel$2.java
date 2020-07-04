package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7584c;

public final class ExtensionsKt$parentFragmentViewModel$2 extends Lambda implements C7561a<VM> {
    final /* synthetic */ C7561a $keyFactory;
    final /* synthetic */ Fragment $this_parentFragmentViewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public ExtensionsKt$parentFragmentViewModel$2(Fragment fragment, C7561a aVar, C7584c cVar) {
        this.$this_parentFragmentViewModel = fragment;
        this.$keyFactory = aVar;
        this.$viewModelClass = cVar;
        super(0);
    }

    public final VM invoke() {
        Fragment fragment = this.$this_parentFragmentViewModel.mParentFragment;
        if (fragment == null) {
            C7573i.m23580a();
        }
        return (JediViewModel) C0069x.m158a(fragment, C11498b.m33903a()).mo148a((String) this.$keyFactory.invoke(), C7560a.m23571a(this.$viewModelClass));
    }
}
