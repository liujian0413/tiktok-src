package com.p280ss.android.ugc.trill.setting;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.setting.DisplaySettingActivity_ViewBinding */
public class DisplaySettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DisplaySettingActivity f115797a;

    public void unbind() {
        DisplaySettingActivity displaySettingActivity = this.f115797a;
        if (displaySettingActivity != null) {
            this.f115797a = null;
            displaySettingActivity.rootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DisplaySettingActivity_ViewBinding(DisplaySettingActivity displaySettingActivity, View view) {
        this.f115797a = displaySettingActivity;
        displaySettingActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cwi, "field 'rootView'", ViewGroup.class);
    }
}
