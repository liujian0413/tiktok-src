package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.example.p266a.C6490c;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.newmedia.p897ui.webview.SSWebView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.web.C43443g;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.views.e */
public final class C43367e {
    /* renamed from: a */
    private static SSWebView m137650a(View view) {
        return (SSWebView) view.findViewById(R.id.ega);
    }

    /* renamed from: a */
    public static RemoteImageView m137651a(String str, Context context) {
        RemoteImageView remoteImageView = new RemoteImageView(context);
        ((C13438a) remoteImageView.getHierarchy()).mo32902c((int) R.drawable.b8r);
        C23323e.m76514a(remoteImageView, str);
        return remoteImageView;
    }

    /* renamed from: a */
    public static View m137649a(Context context, String str, String str2) {
        View inflate = View.inflate(context, R.layout.b55, null);
        SSWebView a = m137650a(inflate);
        WebSettings settings = a.getSettings();
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        a.setBackgroundColor(0);
        a.setWebViewClient(C6490c.m20171a((WebViewClient) new C43443g() {
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Intent webUriIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getWebUriIntent(webView.getContext(), Uri.parse(str));
                if (webUriIntent != null) {
                    webView.getContext().startActivity(webUriIntent);
                }
                return true;
            }
        }));
        if (str != null) {
            a.loadUrl(str);
        } else if (!TextUtils.isEmpty(str2)) {
            a.loadData(str2, "text/html;charset=UTF-8", null);
        }
        return inflate;
    }

    /* renamed from: a */
    public static void m137652a(SSWebView sSWebView, Context context, String str, String str2) {
        WebSettings settings = sSWebView.getSettings();
        sSWebView.getSettings().setTextZoom(100);
        sSWebView.getSettings().setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        sSWebView.setBackgroundColor(0);
        sSWebView.setWebViewClient(C6490c.m20171a((WebViewClient) new C43443g() {
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Intent webUriIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getWebUriIntent(webView.getContext(), Uri.parse(str));
                if (webUriIntent != null) {
                    webView.getContext().startActivity(webUriIntent);
                }
                return true;
            }
        }));
        if (str != null) {
            sSWebView.loadUrl(str);
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            sSWebView.loadData(str2, "text/html;charset=UTF-8", null);
        }
    }
}
