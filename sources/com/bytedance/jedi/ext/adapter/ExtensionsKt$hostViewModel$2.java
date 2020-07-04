package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.jedi.arch.C11498b;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ViewModelNotCreatedException;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7584c;

public final class ExtensionsKt$hostViewModel$2 extends Lambda implements C7561a<VM> {
    final /* synthetic */ C7561a $keyFactory;
    final /* synthetic */ JediViewHolder $this_hostViewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public ExtensionsKt$hostViewModel$2(JediViewHolder jediViewHolder, C7561a aVar, C7584c cVar) {
        this.$this_hostViewModel = jediViewHolder;
        this.$keyFactory = aVar;
        this.$viewModelClass = cVar;
        super(0);
    }

    public final VM invoke() {
        VM vm;
        Object a = C11678a.m34219a(this.$this_hostViewModel.mo29227n());
        String str = (String) this.$keyFactory.invoke();
        if (a instanceof Fragment) {
            Fragment fragment = (Fragment) a;
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
        } else if (a instanceof FragmentActivity) {
            VM a2 = C0069x.m160a((FragmentActivity) a, C11498b.m33903a()).mo148a(str, C7560a.m23571a(this.$viewModelClass));
            C7573i.m23582a((Object) a2, "ViewModelProviders\n     …key, viewModelClass.java)");
            return (JediViewModel) a2;
        } else {
            throw new IllegalStateException();
        }
    }
}
