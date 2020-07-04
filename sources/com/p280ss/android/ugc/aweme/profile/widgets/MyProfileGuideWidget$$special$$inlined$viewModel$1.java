package com.p280ss.android.ugc.aweme.profile.widgets;

import com.bytedance.widget.Widget;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7584c;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$$special$$inlined$viewModel$1 */
public final class MyProfileGuideWidget$$special$$inlined$viewModel$1 extends Lambda implements C7561a<String> {
    final /* synthetic */ Widget $this_viewModel;
    final /* synthetic */ C7584c $viewModelClass;

    public MyProfileGuideWidget$$special$$inlined$viewModel$1(Widget widget, C7584c cVar) {
        this.$this_viewModel = widget;
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
