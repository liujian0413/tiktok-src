package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.example.p266a.C6490c;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.C46830i;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;

/* renamed from: com.twitter.sdk.android.core.identity.c */
final class C46837c implements C46845a {

    /* renamed from: a */
    final C46840a f120144a;

    /* renamed from: b */
    TwitterAuthToken f120145b;

    /* renamed from: c */
    public final WebView f120146c;

    /* renamed from: d */
    public final TwitterAuthConfig f120147d;

    /* renamed from: e */
    public final OAuth1aService f120148e;

    /* renamed from: f */
    private final ProgressBar f120149f;

    /* renamed from: com.twitter.sdk.android.core.identity.c$a */
    interface C46840a {
        /* renamed from: a */
        void mo117918a(int i, Intent intent);
    }

    /* renamed from: b */
    private C46821b<OAuthResponse> m146522b() {
        return new C46821b<OAuthResponse>() {
            /* renamed from: a */
            public final void mo29989a(TwitterException twitterException) {
                C46837c.this.mo117939a(1, new TwitterAuthException("Failed to get request token"));
            }

            /* renamed from: a */
            public final void mo29990a(C46830i<OAuthResponse> iVar) {
                C46837c.this.f120145b = ((OAuthResponse) iVar.f120123a).f120218a;
                C46837c.m146521a(C46837c.this.f120146c, new C46844g(C46837c.this.f120148e.mo117984a(C46837c.this.f120147d), C46837c.this), C46837c.this.f120148e.mo117985a(C46837c.this.f120145b), new C46843f());
            }
        };
    }

    /* renamed from: c */
    private C46821b<OAuthResponse> m146525c() {
        return new C46821b<OAuthResponse>() {
            /* renamed from: a */
            public final void mo29989a(TwitterException twitterException) {
                C46837c.this.mo117939a(1, new TwitterAuthException("Failed to get access token"));
            }

            /* renamed from: a */
            public final void mo29990a(C46830i<OAuthResponse> iVar) {
                Intent intent = new Intent();
                OAuthResponse oAuthResponse = (OAuthResponse) iVar.f120123a;
                intent.putExtra("screen_name", oAuthResponse.f120219b);
                intent.putExtra("user_id", oAuthResponse.f120220c);
                intent.putExtra("tk", oAuthResponse.f120218a.f120106b);
                intent.putExtra("ts", oAuthResponse.f120218a.f120107c);
                C46837c.this.f120144a.mo117918a(-1, intent);
            }
        };
    }

    /* renamed from: e */
    private void m146527e() {
        this.f120149f.setVisibility(8);
    }

    /* renamed from: d */
    private void m146526d() {
        this.f120146c.stopLoading();
        m146527e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo117938a() {
        this.f120148e.mo117986a(m146522b());
    }

    /* renamed from: a */
    public final void mo117940a(Bundle bundle) {
        m146523b(bundle);
        m146526d();
    }

    /* renamed from: b */
    private void m146524b(C46847i iVar) {
        mo117939a(1, new TwitterAuthException("OAuth web view completed with an error"));
    }

    /* renamed from: b */
    private void m146523b(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("oauth_verifier");
            if (string != null) {
                this.f120148e.mo117987a(m146525c(), this.f120145b, string);
                return;
            }
        }
        new StringBuilder("Failed to get authorization, bundle incomplete ").append(bundle);
        mo117939a(1, new TwitterAuthException("Failed to get authorization, bundle incomplete"));
    }

    /* renamed from: a */
    public final void mo117942a(C46847i iVar) {
        m146524b(iVar);
        m146526d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117939a(int i, TwitterAuthException twitterAuthException) {
        Intent intent = new Intent();
        intent.putExtra("auth_error", twitterAuthException);
        this.f120144a.mo117918a(i, intent);
    }

    /* renamed from: a */
    public final void mo117941a(WebView webView, String str) {
        m146527e();
        webView.setVisibility(0);
    }

    /* renamed from: a */
    static void m146521a(WebView webView, WebViewClient webViewClient, String str, WebChromeClient webChromeClient) {
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(false);
        settings.setSaveFormData(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(C6490c.m20171a(webViewClient));
        C46841d.m146538a(webView, str);
        webView.setVisibility(4);
        webView.setWebChromeClient(webChromeClient);
    }

    C46837c(ProgressBar progressBar, WebView webView, TwitterAuthConfig twitterAuthConfig, OAuth1aService oAuth1aService, C46840a aVar) {
        this.f120149f = progressBar;
        this.f120146c = webView;
        this.f120147d = twitterAuthConfig;
        this.f120148e = oAuth1aService;
        this.f120144a = aVar;
    }
}
