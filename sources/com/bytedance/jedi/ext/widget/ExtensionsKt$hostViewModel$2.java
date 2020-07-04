package com.bytedance.jedi.ext.widget;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.jedi.arch.C11498b;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ViewModelNotCreatedException;
import com.bytedance.widget.Widget;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7584c;

public final class ExtensionsKt$hostViewModel$2 extends Lambda implements C7561a<VM> {
    final /* synthetic */ C7561a $keyFactory;
    final /* synthetic */ Widget $this_hostViewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public ExtensionsKt$hostViewModel$2(Widget widget, C7561a aVar, C7584c cVar) {
        this.$this_hostViewModel = widget;
        this.$keyFactory = aVar;
        this.$viewModelClass = cVar;
        super(0);
    }

    public final VM invoke() {
        VM vm;
        Object n = this.$this_hostViewModel.mo31589n();
        String str = (String) this.$keyFactory.invoke();
        if (n instanceof Fragment) {
            Fragment fragment = (Fragment) n;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    vm = null;
                    break;
                }
                try {
                    vm = (JediViewModel) C0069x.m158a(fragment2, C11498b.m33903a()).mo148a(str, C7560a.m23571a(this.$viewModelClass));
                    break;
                } catch (ViewModelNotCreatedException unused) {
                    fragment2 = fragment2.mParentFragment;
                }
            }
            if (vm == null) {
                vm = (JediViewModel) C0069x.m160a(fragment.requireActivity(), C11498b.m33903a()).mo148a(str, C7560a.m23571a(this.$viewModelClass));
            }
            return vm;
        } else if (n instanceof FragmentActivity) {
            VM a = C0069x.m160a((FragmentActivity) n, C11498b.m33903a()).mo148a(str, C7560a.m23571a(this.$viewModelClass));
            C7573i.m23582a((Object) a, "ViewModelProviders\n     …key, viewModelClass.java)");
            return (JediViewModel) a;
        } else {
            throw new IllegalStateException();
        }
    }
}
