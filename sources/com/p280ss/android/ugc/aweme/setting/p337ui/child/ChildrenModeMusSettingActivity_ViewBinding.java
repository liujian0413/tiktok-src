package com.p280ss.android.ugc.aweme.setting.p337ui.child;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeMusSettingActivity_ViewBinding */
public class ChildrenModeMusSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChildrenModeMusSettingActivity f98758a;

    /* renamed from: b */
    private View f98759b;

    public void unbind() {
        ChildrenModeMusSettingActivity childrenModeMusSettingActivity = this.f98758a;
        if (childrenModeMusSettingActivity != null) {
            this.f98758a = null;
            childrenModeMusSettingActivity.statusBar = null;
            childrenModeMusSettingActivity.rootView = null;
            childrenModeMusSettingActivity.mTitleBar = null;
            childrenModeMusSettingActivity.mAccountAndSafetyItem = null;
            childrenModeMusSettingActivity.mUnderAgeProtection = null;
            childrenModeMusSettingActivity.mCommonProtocolItem = null;
            childrenModeMusSettingActivity.mHelperCenter = null;
            childrenModeMusSettingActivity.mFeedbackAndHelpItem = null;
            childrenModeMusSettingActivity.mProtocolItem = null;
            childrenModeMusSettingActivity.mPrivacyPolicyItem = null;
            childrenModeMusSettingActivity.mCopyRightPolicyItem = null;
            childrenModeMusSettingActivity.mClearCacheItem = null;
            childrenModeMusSettingActivity.mUserInfo = null;
            childrenModeMusSettingActivity.mVersionView = null;
            childrenModeMusSettingActivity.mOpenDebugTest = null;
            childrenModeMusSettingActivity.mLogout = null;
            childrenModeMusSettingActivity.mCommunityPolicyItem = null;
            childrenModeMusSettingActivity.mSafetyCenter = null;
            childrenModeMusSettingActivity.mDataSaver = null;
            this.f98759b.setOnClickListener(null);
            this.f98759b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChildrenModeMusSettingActivity_ViewBinding(final ChildrenModeMusSettingActivity childrenModeMusSettingActivity, View view) {
        this.f98758a = childrenModeMusSettingActivity;
        childrenModeMusSettingActivity.statusBar = Utils.findRequiredView(view, R.id.dal, "field 'statusBar'");
        childrenModeMusSettingActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.cwi, "field 'rootView'", ViewGroup.class);
        childrenModeMusSettingActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mTitleBar'", TextTitleBar.class);
        childrenModeMusSettingActivity.mAccountAndSafetyItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.x, "field 'mAccountAndSafetyItem'", CommonItemView.class);
        childrenModeMusSettingActivity.mUnderAgeProtection = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.e7m, "field 'mUnderAgeProtection'", CommonItemView.class);
        childrenModeMusSettingActivity.mCommonProtocolItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.a0t, "field 'mCommonProtocolItem'", CommonItemView.class);
        childrenModeMusSettingActivity.mHelperCenter = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.avd, "field 'mHelperCenter'", CommonItemView.class);
        childrenModeMusSettingActivity.mFeedbackAndHelpItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.ajq, "field 'mFeedbackAndHelpItem'", CommonItemView.class);
        childrenModeMusSettingActivity.mProtocolItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.dh5, "field 'mProtocolItem'", CommonItemView.class);
        childrenModeMusSettingActivity.mPrivacyPolicyItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cjs, "field 'mPrivacyPolicyItem'", CommonItemView.class);
        childrenModeMusSettingActivity.mCopyRightPolicyItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.a33, "field 'mCopyRightPolicyItem'", CommonItemView.class);
        childrenModeMusSettingActivity.mClearCacheItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.wm, "field 'mClearCacheItem'", CommonItemView.class);
        childrenModeMusSettingActivity.mUserInfo = (TextView) Utils.findRequiredViewAsType(view, R.id.e9c, "field 'mUserInfo'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.e_s, "field 'mVersionView' and method 'onVersionClick'");
        childrenModeMusSettingActivity.mVersionView = (TextView) Utils.castView(findRequiredView, R.id.e_s, "field 'mVersionView'", TextView.class);
        this.f98759b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                childrenModeMusSettingActivity.onVersionClick(view);
            }
        });
        childrenModeMusSettingActivity.mOpenDebugTest = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.c8v, "field 'mOpenDebugTest'", CommonItemView.class);
        childrenModeMusSettingActivity.mLogout = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.bvv, "field 'mLogout'", CommonItemView.class);
        childrenModeMusSettingActivity.mCommunityPolicyItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.a0u, "field 'mCommunityPolicyItem'", CommonItemView.class);
        childrenModeMusSettingActivity.mSafetyCenter = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cxw, "field 'mSafetyCenter'", CommonItemView.class);
        childrenModeMusSettingActivity.mDataSaver = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.a69, "field 'mDataSaver'", CommonItemView.class);
    }
}
