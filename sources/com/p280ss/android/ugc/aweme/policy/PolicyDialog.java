package com.p280ss.android.ugc.aweme.policy;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.example.p266a.C6490c;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.policy.PolicyDialog */
public class PolicyDialog extends AppCompatDialog {

    /* renamed from: a */
    C35491b f93138a;

    /* renamed from: b */
    private OnClickListener f93139b;
    DmtStatusView mStatusView;
    TextView mTvAccept;
    WebView mWebView;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo90291a(View view) {
        dismiss();
        if (this.f93139b != null) {
            this.f93139b.onClick(view);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        setContentView((int) R.layout.a9y);
        ButterKnife.bind((Dialog) this);
        Window window = getWindow();
        if (window != null) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.heightPixels - C23486n.m77122a(291.5d);
                i2 = displayMetrics.widthPixels - C23486n.m77122a(105.0d);
            } else {
                i2 = 0;
                i = 0;
            }
            window.setLayout(Math.max(C23486n.m77122a(270.0d), i2), Math.max(C23486n.m77122a(375.5d), i));
        }
        this.mTvAccept.setOnClickListener(new C35493a(this));
        this.mStatusView.setBuilder(C10803a.m31631a(getContext()));
        this.mStatusView.setBackgroundColor(0);
        this.mStatusView.setVisibility(8);
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.setWebViewClient(C6490c.m20171a((WebViewClient) new WebViewClient() {
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return C6490c.m20174a(webView, renderProcessGoneDetail);
            }

            public final void onPageFinished(WebView webView, String str) {
                PolicyDialog.this.mStatusView.mo25939d();
            }

            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                PolicyDialog.this.mStatusView.mo25942f();
            }

            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                PolicyDialog.this.mStatusView.mo25944h();
            }
        }));
        C35494b.m114656a(this.mWebView, this.f93138a.f93133a);
    }

    public PolicyDialog(Context context, C35491b bVar, OnClickListener onClickListener) {
        super(context);
        this.f93138a = bVar;
        this.f93139b = onClickListener;
        requestWindowFeature(1);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
