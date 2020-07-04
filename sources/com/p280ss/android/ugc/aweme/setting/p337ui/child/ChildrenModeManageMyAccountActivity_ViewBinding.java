package com.p280ss.android.ugc.aweme.setting.p337ui.child;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeManageMyAccountActivity_ViewBinding */
public class ChildrenModeManageMyAccountActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChildrenModeManageMyAccountActivity f98748a;

    public void unbind() {
        ChildrenModeManageMyAccountActivity childrenModeManageMyAccountActivity = this.f98748a;
        if (childrenModeManageMyAccountActivity != null) {
            this.f98748a = null;
            childrenModeManageMyAccountActivity.mTitleBar = null;
            childrenModeManageMyAccountActivity.mChangePwdItem = null;
            childrenModeManageMyAccountActivity.mLoginDeviceManagerItem = null;
            childrenModeManageMyAccountActivity.mSaveLoginInfoItem = null;
            childrenModeManageMyAccountActivity.mDeleteAccount = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChildrenModeManageMyAccountActivity_ViewBinding(ChildrenModeManageMyAccountActivity childrenModeManageMyAccountActivity, View view) {
        this.f98748a = childrenModeManageMyAccountActivity;
        childrenModeManageMyAccountActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
        childrenModeManageMyAccountActivity.mChangePwdItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.uy, "field 'mChangePwdItem'", CommonItemView.class);
        childrenModeManageMyAccountActivity.mLoginDeviceManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bvg, "field 'mLoginDeviceManagerItem'", CommonItemView.class);
        childrenModeManageMyAccountActivity.mSaveLoginInfoItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cy9, "field 'mSaveLoginInfoItem'", CommonItemView.class);
        childrenModeManageMyAccountActivity.mDeleteAccount = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.a72, "field 'mDeleteAccount'", DmtTextView.class);
    }
}
