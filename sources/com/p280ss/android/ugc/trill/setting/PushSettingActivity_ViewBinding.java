package com.p280ss.android.ugc.trill.setting;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.setting.PushSettingActivity_ViewBinding */
public class PushSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PushSettingActivity f115814a;

    public void unbind() {
        PushSettingActivity pushSettingActivity = this.f115814a;
        if (pushSettingActivity != null) {
            this.f115814a = null;
            pushSettingActivity.mTitleBar = null;
            pushSettingActivity.mLikeMeItem = null;
            pushSettingActivity.mFollowMeItem = null;
            pushSettingActivity.mCommentMeItem = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PushSettingActivity_ViewBinding(PushSettingActivity pushSettingActivity, View view) {
        this.f115814a = pushSettingActivity;
        pushSettingActivity.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, R.id.dke, "field 'mTitleBar'", ButtonTitleBar.class);
        pushSettingActivity.mLikeMeItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.blx, "field 'mLikeMeItem'", CommonItemView.class);
        pushSettingActivity.mFollowMeItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.anu, "field 'mFollowMeItem'", CommonItemView.class);
        pushSettingActivity.mCommentMeItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.zi, "field 'mCommentMeItem'", CommonItemView.class);
    }
}
