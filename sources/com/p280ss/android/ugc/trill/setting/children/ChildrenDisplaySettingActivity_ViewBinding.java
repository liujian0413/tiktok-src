package com.p280ss.android.ugc.trill.setting.children;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity_ViewBinding */
public class ChildrenDisplaySettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChildrenDisplaySettingActivity f115822a;

    public void unbind() {
        ChildrenDisplaySettingActivity childrenDisplaySettingActivity = this.f115822a;
        if (childrenDisplaySettingActivity != null) {
            this.f115822a = null;
            childrenDisplaySettingActivity.rootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChildrenDisplaySettingActivity_ViewBinding(ChildrenDisplaySettingActivity childrenDisplaySettingActivity, View view) {
        this.f115822a = childrenDisplaySettingActivity;
        childrenDisplaySettingActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cwi, "field 'rootView'", ViewGroup.class);
    }
}
