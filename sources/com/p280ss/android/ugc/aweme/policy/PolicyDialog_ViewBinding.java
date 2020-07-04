package com.p280ss.android.ugc.aweme.policy;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.policy.PolicyDialog_ViewBinding */
public class PolicyDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PolicyDialog f93141a;

    public void unbind() {
        PolicyDialog policyDialog = this.f93141a;
        if (policyDialog != null) {
            this.f93141a = null;
            policyDialog.mTvAccept = null;
            policyDialog.mWebView = null;
            policyDialog.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PolicyDialog_ViewBinding(PolicyDialog policyDialog, View view) {
        this.f93141a = policyDialog;
        policyDialog.mTvAccept = (TextView) Utils.findRequiredViewAsType(view, R.id.dqa, "field 'mTvAccept'", TextView.class);
        policyDialog.mWebView = (WebView) Utils.findRequiredViewAsType(view, R.id.egh, "field 'mWebView'", WebView.class);
        policyDialog.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.dav, "field 'mStatusView'", DmtStatusView.class);
    }
}
