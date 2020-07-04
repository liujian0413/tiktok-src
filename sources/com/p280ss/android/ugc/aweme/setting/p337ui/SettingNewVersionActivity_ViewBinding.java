package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.SettingNewVersionActivity_ViewBinding */
public class SettingNewVersionActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SettingNewVersionActivity f98554a;

    /* renamed from: b */
    private View f98555b;

    /* renamed from: c */
    private View f98556c;

    public void unbind() {
        SettingNewVersionActivity settingNewVersionActivity = this.f98554a;
        if (settingNewVersionActivity != null) {
            this.f98554a = null;
            settingNewVersionActivity.statusBar = null;
            settingNewVersionActivity.rootView = null;
            settingNewVersionActivity.mTitleBar = null;
            settingNewVersionActivity.mEditUserProfile = null;
            settingNewVersionActivity.mContentPreferenceItem = null;
            settingNewVersionActivity.mAccountAndSafetyItem = null;
            settingNewVersionActivity.mNotificationManagerItem = null;
            settingNewVersionActivity.mPrivacyManagerItem = null;
            settingNewVersionActivity.mUnderAgeProtection = null;
            settingNewVersionActivity.mCommonProtocolItem = null;
            settingNewVersionActivity.mHelperCenter = null;
            settingNewVersionActivity.mFeedbackAndHelpItem = null;
            settingNewVersionActivity.mProtocolItem = null;
            settingNewVersionActivity.mAboutAmeItem = null;
            settingNewVersionActivity.mPrivacyPolicyItem = null;
            settingNewVersionActivity.mCopyRightPolicyItem = null;
            settingNewVersionActivity.mClearCacheItem = null;
            settingNewVersionActivity.mUserInfo = null;
            settingNewVersionActivity.mVersionView = null;
            settingNewVersionActivity.mOpenDebugTest = null;
            settingNewVersionActivity.mLocalLiveWallpaper = null;
            settingNewVersionActivity.mAddAccount = null;
            settingNewVersionActivity.mLogout = null;
            settingNewVersionActivity.mMyWalletItem = null;
            settingNewVersionActivity.mShareProfileItem = null;
            settingNewVersionActivity.mMyQrCode = null;
            settingNewVersionActivity.mCommunityPolicyItem = null;
            settingNewVersionActivity.mGuidanceForParentsItem = null;
            settingNewVersionActivity.mInsights = null;
            settingNewVersionActivity.mMicroApp = null;
            settingNewVersionActivity.mSafetyCenter = null;
            settingNewVersionActivity.mMusInviteFriend = null;
            settingNewVersionActivity.mAccessibility = null;
            settingNewVersionActivity.mDataSaver = null;
            settingNewVersionActivity.mCheckUpdate = null;
            settingNewVersionActivity.mImPressumItem = null;
            settingNewVersionActivity.mJoinTesters = null;
            this.f98555b.setOnClickListener(null);
            this.f98555b = null;
            this.f98556c.setOnClickListener(null);
            this.f98556c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SettingNewVersionActivity_ViewBinding(final SettingNewVersionActivity settingNewVersionActivity, View view) {
        this.f98554a = settingNewVersionActivity;
        settingNewVersionActivity.statusBar = Utils.findRequiredView(view, R.id.dal, "field 'statusBar'");
        settingNewVersionActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cwi, "field 'rootView'", ViewGroup.class);
        settingNewVersionActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
        settingNewVersionActivity.mEditUserProfile = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.acq, "field 'mEditUserProfile'", CommonItemView.class);
        settingNewVersionActivity.mContentPreferenceItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.a2b, "field 'mContentPreferenceItem'", CommonItemView.class);
        settingNewVersionActivity.mAccountAndSafetyItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.x, "field 'mAccountAndSafetyItem'", CommonItemView.class);
        settingNewVersionActivity.mNotificationManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c7c, "field 'mNotificationManagerItem'", CommonItemView.class);
        settingNewVersionActivity.mPrivacyManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cjj, "field 'mPrivacyManagerItem'", CommonItemView.class);
        settingNewVersionActivity.mUnderAgeProtection = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.e7m, "field 'mUnderAgeProtection'", CommonItemView.class);
        settingNewVersionActivity.mCommonProtocolItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.a0t, "field 'mCommonProtocolItem'", CommonItemView.class);
        settingNewVersionActivity.mHelperCenter = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.avd, "field 'mHelperCenter'", CommonItemView.class);
        settingNewVersionActivity.mFeedbackAndHelpItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.ajq, "field 'mFeedbackAndHelpItem'", CommonItemView.class);
        settingNewVersionActivity.mProtocolItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.dh5, "field 'mProtocolItem'", CommonItemView.class);
        settingNewVersionActivity.mAboutAmeItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.v, "field 'mAboutAmeItem'", CommonItemView.class);
        settingNewVersionActivity.mPrivacyPolicyItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cjs, "field 'mPrivacyPolicyItem'", CommonItemView.class);
        settingNewVersionActivity.mCopyRightPolicyItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.a33, "field 'mCopyRightPolicyItem'", CommonItemView.class);
        settingNewVersionActivity.mClearCacheItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.wm, "field 'mClearCacheItem'", CommonItemView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.e9c, "field 'mUserInfo' and method 'onUserInfoClick'");
        settingNewVersionActivity.mUserInfo = (TextView) Utils.castView(findRequiredView, R.id.e9c, "field 'mUserInfo'", TextView.class);
        this.f98555b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                settingNewVersionActivity.onUserInfoClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.e_s, "field 'mVersionView' and method 'onVersionClick'");
        settingNewVersionActivity.mVersionView = (TextView) Utils.castView(findRequiredView2, R.id.e_s, "field 'mVersionView'", TextView.class);
        this.f98556c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                settingNewVersionActivity.onVersionClick(view);
            }
        });
        settingNewVersionActivity.mOpenDebugTest = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c8v, "field 'mOpenDebugTest'", CommonItemView.class);
        settingNewVersionActivity.mLocalLiveWallpaper = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bue, "field 'mLocalLiveWallpaper'", CommonItemView.class);
        settingNewVersionActivity.mAddAccount = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.dz, "field 'mAddAccount'", CommonItemView.class);
        settingNewVersionActivity.mLogout = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bvv, "field 'mLogout'", CommonItemView.class);
        settingNewVersionActivity.mMyWalletItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c31, "field 'mMyWalletItem'", CommonItemView.class);
        settingNewVersionActivity.mShareProfileItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.d5y, "field 'mShareProfileItem'", CommonItemView.class);
        settingNewVersionActivity.mMyQrCode = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c2r, "field 'mMyQrCode'", CommonItemView.class);
        settingNewVersionActivity.mCommunityPolicyItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.a0u, "field 'mCommunityPolicyItem'", CommonItemView.class);
        settingNewVersionActivity.mGuidanceForParentsItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.ate, "field 'mGuidanceForParentsItem'", CommonItemView.class);
        settingNewVersionActivity.mInsights = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b23, "field 'mInsights'", CommonItemView.class);
        settingNewVersionActivity.mMicroApp = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.byg, "field 'mMicroApp'", CommonItemView.class);
        settingNewVersionActivity.mSafetyCenter = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cxw, "field 'mSafetyCenter'", CommonItemView.class);
        settingNewVersionActivity.mMusInviteFriend = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b2v, "field 'mMusInviteFriend'", CommonItemView.class);
        settingNewVersionActivity.mAccessibility = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.w, "field 'mAccessibility'", CommonItemView.class);
        settingNewVersionActivity.mDataSaver = (CommonItemView) Utils.findOptionalViewAsType(view, R.id.a69, "field 'mDataSaver'", CommonItemView.class);
        settingNewVersionActivity.mCheckUpdate = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.ve, "field 'mCheckUpdate'", CommonItemView.class);
        settingNewVersionActivity.mImPressumItem = (CommonItemView) Utils.findOptionalViewAsType(view, R.id.b0d, "field 'mImPressumItem'", CommonItemView.class);
        settingNewVersionActivity.mJoinTesters = (CommonItemView) Utils.findOptionalViewAsType(view, R.id.bff, "field 'mJoinTesters'", CommonItemView.class);
    }
}
