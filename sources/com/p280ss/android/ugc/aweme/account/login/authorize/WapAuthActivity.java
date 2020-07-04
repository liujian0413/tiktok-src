package com.p280ss.android.ugc.aweme.account.login.authorize;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.example.p266a.C6490c;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity */
public class WapAuthActivity extends BaseThirdPartyWapAuthActivity {

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity$a */
    public class C21301a extends WebViewClient {
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C6490c.m20174a(webView, renderProcessGoneDetail);
        }

        public C21301a() {
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return WapAuthActivity.this.mo57319a(str);
        }

        public final void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
            C10741a aVar = new C10741a(webView.getContext());
            aVar.mo25660b("notification error ssl cert invalid").mo25654a("continue", (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    sslErrorHandler.proceed();
                }
            }).mo25661b("cancel", (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    sslErrorHandler.cancel();
                }
            });
            aVar.mo25656a().mo25637a();
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            WapAuthActivity.this.mo57320e();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57318a(WebView webView) {
        webView.setWebViewClient(C6490c.m20171a((WebViewClient) new C21301a()));
    }
}
