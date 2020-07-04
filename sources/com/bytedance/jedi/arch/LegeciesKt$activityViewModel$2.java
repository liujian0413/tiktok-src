package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.widget.Widget;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7584c;

public final class LegeciesKt$activityViewModel$2 extends Lambda implements C7561a<VM> {
    final /* synthetic */ C7561a $keyFactory;
    final /* synthetic */ Widget $this_activityViewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public LegeciesKt$activityViewModel$2(Widget widget, C7561a aVar, C7584c cVar) {
        this.$this_activityViewModel = widget;
        this.$keyFactory = aVar;
        this.$viewModelClass = cVar;
        super(0);
    }

    public final VM invoke() {
        C0065w wVar;
        Object n = this.$this_activityViewModel.mo31589n();
        if (n instanceof Fragment) {
            wVar = C0069x.m160a(((Fragment) n).requireActivity(), C11498b.m33903a());
        } else if (n instanceof FragmentActivity) {
            wVar = C0069x.m160a((FragmentActivity) n, C11498b.m33903a());
        } else {
            throw new IllegalStateException();
        }
        return (JediViewModel) wVar.mo148a((String) this.$keyFactory.invoke(), C7560a.m23571a(this.$viewModelClass));
    }
}
