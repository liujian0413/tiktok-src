package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.CommunityAgreementActivity_ViewBinding */
public class CommunityAgreementActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommunityAgreementActivity f70909a;

    public void unbind() {
        CommunityAgreementActivity communityAgreementActivity = this.f70909a;
        if (communityAgreementActivity != null) {
            this.f70909a = null;
            communityAgreementActivity.mWebView = null;
            communityAgreementActivity.mBtn = null;
            communityAgreementActivity.mBackBtn = null;
            communityAgreementActivity.mTextView = null;
            communityAgreementActivity.mStatusBarView = null;
            communityAgreementActivity.mLoadingView = null;
            communityAgreementActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommunityAgreementActivity_ViewBinding(CommunityAgreementActivity communityAgreementActivity, View view) {
        this.f70909a = communityAgreementActivity;
        communityAgreementActivity.mWebView = (WebView) Utils.findRequiredViewAsType(view, R.id.c0s, "field 'mWebView'", WebView.class);
        communityAgreementActivity.mBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.es, "field 'mBtn'", TextView.class);
        communityAgreementActivity.mBackBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.jo, "field 'mBackBtn'", ImageView.class);
        communityAgreementActivity.mTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTextView'", TextView.class);
        communityAgreementActivity.mStatusBarView = Utils.findRequiredView(view, R.id.dal, "field 'mStatusBarView'");
        communityAgreementActivity.mLoadingView = Utils.findRequiredView(view, R.id.bty, "field 'mLoadingView'");
        communityAgreementActivity.mTitleBar = Utils.findRequiredView(view, R.id.dke, "field 'mTitleBar'");
    }
}
