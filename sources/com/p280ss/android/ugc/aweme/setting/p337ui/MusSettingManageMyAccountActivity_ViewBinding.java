package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.MusSettingManageMyAccountActivity_ViewBinding */
public class MusSettingManageMyAccountActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusSettingManageMyAccountActivity f98472a;

    public void unbind() {
        MusSettingManageMyAccountActivity musSettingManageMyAccountActivity = this.f98472a;
        if (musSettingManageMyAccountActivity != null) {
            this.f98472a = null;
            musSettingManageMyAccountActivity.mTitleBar = null;
            musSettingManageMyAccountActivity.mMyQrCodeItem = null;
            musSettingManageMyAccountActivity.mPhoneNumberItem = null;
            musSettingManageMyAccountActivity.mEmailItem = null;
            musSettingManageMyAccountActivity.mChangePwdItem = null;
            musSettingManageMyAccountActivity.mLinkAccount = null;
            musSettingManageMyAccountActivity.mLoginDeviceManagerItem = null;
            musSettingManageMyAccountActivity.mSaveLoginInfoItem = null;
            musSettingManageMyAccountActivity.mRequestVerificationItem = null;
            musSettingManageMyAccountActivity.mSetResidence = null;
            musSettingManageMyAccountActivity.mDeleteAccount = null;
            musSettingManageMyAccountActivity.mSwitchAccount = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusSettingManageMyAccountActivity_ViewBinding(MusSettingManageMyAccountActivity musSettingManageMyAccountActivity, View view) {
        this.f98472a = musSettingManageMyAccountActivity;
        musSettingManageMyAccountActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
        musSettingManageMyAccountActivity.mMyQrCodeItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c2r, "field 'mMyQrCodeItem'", CommonItemView.class);
        musSettingManageMyAccountActivity.mPhoneNumberItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cb4, "field 'mPhoneNumberItem'", CommonItemView.class);
        musSettingManageMyAccountActivity.mEmailItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bwf, "field 'mEmailItem'", CommonItemView.class);
        musSettingManageMyAccountActivity.mChangePwdItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.uy, "field 'mChangePwdItem'", CommonItemView.class);
        musSettingManageMyAccountActivity.mLinkAccount = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.me, "field 'mLinkAccount'", CommonItemView.class);
        musSettingManageMyAccountActivity.mLoginDeviceManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bvg, "field 'mLoginDeviceManagerItem'", CommonItemView.class);
        musSettingManageMyAccountActivity.mSaveLoginInfoItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cy9, "field 'mSaveLoginInfoItem'", CommonItemView.class);
        musSettingManageMyAccountActivity.mRequestVerificationItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cs7, "field 'mRequestVerificationItem'", CommonItemView.class);
        musSettingManageMyAccountActivity.mSetResidence = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b56, "field 'mSetResidence'", CommonItemView.class);
        musSettingManageMyAccountActivity.mDeleteAccount = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.a72, "field 'mDeleteAccount'", DmtTextView.class);
        musSettingManageMyAccountActivity.mSwitchAccount = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.del, "field 'mSwitchAccount'", CommonItemView.class);
    }
}
