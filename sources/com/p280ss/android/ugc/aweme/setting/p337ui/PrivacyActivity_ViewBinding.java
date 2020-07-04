package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.PrivacyActivity_ViewBinding */
public class PrivacyActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PrivacyActivity f98500a;

    /* renamed from: b */
    private View f98501b;

    public void unbind() {
        PrivacyActivity privacyActivity = this.f98500a;
        if (privacyActivity != null) {
            this.f98500a = null;
            privacyActivity.mTitle = null;
            privacyActivity.mBack = null;
            privacyActivity.contactItem = null;
            privacyActivity.mPrivacyManagerItem = null;
            privacyActivity.mBlockListItem = null;
            privacyActivity.mReactItem = null;
            privacyActivity.mDuetItem = null;
            privacyActivity.mDownloadItem = null;
            privacyActivity.mCommentManagerItem = null;
            privacyActivity.mPrivateAccount = null;
            privacyActivity.mCommentFilterItem = null;
            privacyActivity.mPrivacyParent = null;
            privacyActivity.mWhoCanSeeMyLikeListItem = null;
            privacyActivity.mPersonalizationItem = null;
            privacyActivity.personalizationDiv = null;
            privacyActivity.safeDivider = null;
            this.f98501b.setOnClickListener(null);
            this.f98501b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PrivacyActivity_ViewBinding(final PrivacyActivity privacyActivity, View view) {
        this.f98500a = privacyActivity;
        privacyActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "field 'mBack' and method 'back'");
        privacyActivity.mBack = (ImageView) Utils.castView(findRequiredView, R.id.jo, "field 'mBack'", ImageView.class);
        this.f98501b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                privacyActivity.back();
            }
        });
        privacyActivity.contactItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cjl, "field 'contactItem'", CommonItemView.class);
        privacyActivity.mPrivacyManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cjq, "field 'mPrivacyManagerItem'", CommonItemView.class);
        privacyActivity.mBlockListItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cjk, "field 'mBlockListItem'", CommonItemView.class);
        privacyActivity.mReactItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cjp, "field 'mReactItem'", CommonItemView.class);
        privacyActivity.mDuetItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cjn, "field 'mDuetItem'", CommonItemView.class);
        privacyActivity.mDownloadItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cjm, "field 'mDownloadItem'", CommonItemView.class);
        privacyActivity.mCommentManagerItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.zh, "field 'mCommentManagerItem'", CommonItemView.class);
        privacyActivity.mPrivateAccount = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cjo, "field 'mPrivateAccount'", CommonItemView.class);
        privacyActivity.mCommentFilterItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.za, "field 'mCommentFilterItem'", CommonItemView.class);
        privacyActivity.mPrivacyParent = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.cjr, "field 'mPrivacyParent'", LinearLayout.class);
        privacyActivity.mWhoCanSeeMyLikeListItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.eh2, "field 'mWhoCanSeeMyLikeListItem'", CommonItemView.class);
        privacyActivity.mPersonalizationItem = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.cao, "field 'mPersonalizationItem'", CommonItemView.class);
        privacyActivity.personalizationDiv = Utils.findRequiredView(view, R.id.cam, "field 'personalizationDiv'");
        privacyActivity.safeDivider = Utils.findRequiredView(view, R.id.cxv, "field 'safeDivider'");
    }
}
