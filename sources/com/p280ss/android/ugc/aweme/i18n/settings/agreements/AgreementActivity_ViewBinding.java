package com.p280ss.android.ugc.aweme.i18n.settings.agreements;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity_ViewBinding */
public class AgreementActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AgreementActivity f80239a;

    public void unbind() {
        AgreementActivity agreementActivity = this.f80239a;
        if (agreementActivity != null) {
            this.f80239a = null;
            agreementActivity.mWebView = null;
            agreementActivity.mBtn = null;
            agreementActivity.mBackBtn = null;
            agreementActivity.mTextView = null;
            agreementActivity.mStatusBarView = null;
            agreementActivity.mLoadingView = null;
            agreementActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AgreementActivity_ViewBinding(AgreementActivity agreementActivity, View view) {
        this.f80239a = agreementActivity;
        agreementActivity.mWebView = (WebView) Utils.findRequiredViewAsType(view, R.id.c0s, "field 'mWebView'", WebView.class);
        agreementActivity.mBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.es, "field 'mBtn'", TextView.class);
        agreementActivity.mBackBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.jo, "field 'mBackBtn'", ImageView.class);
        agreementActivity.mTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTextView'", TextView.class);
        agreementActivity.mStatusBarView = Utils.findRequiredView(view, R.id.dal, "field 'mStatusBarView'");
        agreementActivity.mLoadingView = Utils.findRequiredView(view, R.id.bty, "field 'mLoadingView'");
        agreementActivity.mTitleBar = Utils.findRequiredView(view, R.id.dke, "field 'mTitleBar'");
    }
}
