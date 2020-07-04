package com.bytedance.android.livesdk.browser.p193c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.C3951b;
import com.bytedance.android.livesdk.browser.C3970c;
import com.bytedance.android.livesdk.browser.C3987d;
import com.bytedance.android.livesdk.browser.fragment.FullWebDialogFragment.C3998a;
import com.bytedance.android.livesdk.browser.fragment.WebDialogFragment;
import com.bytedance.android.livesdk.browser.jsbridge.C4030a;
import com.bytedance.android.livesdk.browser.jsbridge.C4037b;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3974a;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3975b;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3976c;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3977d;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3978e;
import com.bytedance.android.livesdk.browser.p194d.C3988a;
import com.bytedance.android.livesdk.browser.p196f.C3996a;
import com.bytedance.android.livesdk.browser.p196f.C3997b;
import com.bytedance.android.livesdk.browser.view.C4224b;
import com.bytedance.android.livesdk.browser.view.RoundRectWebView;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b;
import com.bytedance.android.livesdk.p428w.C9171h.C9174b.C9175a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9020a;
import com.bytedance.android.monitor.webview.C9541j;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.web.p582a.C11092d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.c.e */
public final class C3982e implements C3972b {

    /* renamed from: a */
    private List<C4030a> f11858a;

    /* renamed from: b */
    private List<DialogFragment> f11859b;

    /* renamed from: c */
    private Set<C3996a> f11860c;

    /* renamed from: d */
    private C3976c f11861d;

    /* renamed from: com.bytedance.android.livesdk.browser.c.e$a */
    static class C3984a extends WebChromeClient {

        /* renamed from: a */
        public C4037b f11862a;

        C3984a() {
        }

        public final void onConsoleMessage(String str, int i, String str2) {
        }

        public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        }

        public final void onGeolocationPermissionsHidePrompt() {
            if (this.f11862a != null) {
                this.f11862a.mo11658d();
            }
        }

        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
        }

        public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
            if (this.f11862a != null) {
                this.f11862a.mo11656a(str, callback);
            }
        }

        public final void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            C9541j.m28227b().mo23586a(webView, i);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.e$b */
    static class C3985b extends C11092d {

        /* renamed from: a */
        private C3977d f11863a;

        C3985b(C3977d dVar) {
            this.f11863a = dVar;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f11863a != null) {
                this.f11863a.mo9661a(webView, str);
            }
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (!TextUtils.isEmpty(str) && ((Boolean) LiveConfigSettingKeys.WEB_OFFLINE_ENABLED.mo10240a()).booleanValue()) {
                WebResourceResponse c = TTLiveSDKContext.getHostService().mo22368i().mo23275c(str);
                if (c != null) {
                    return c;
                }
            }
            WebResourceResponse a = C9178j.m27302j().mo22375d().mo22384d().mo11587a(str, webView);
            if (a != null) {
                return a;
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            if (super.shouldOverrideUrlLoading(webView, str)) {
                return true;
            }
            try {
                Uri parse = Uri.parse(str);
                if (parse.getScheme() == null) {
                    str2 = "";
                } else {
                    str2 = parse.getScheme().toLowerCase();
                }
                if (!TextUtils.isEmpty(str2) && !"about".equals(str2) && !str2.equals(WebKitApi.SCHEME_HTTPS)) {
                    if (!str2.equals(WebKitApi.SCHEME_HTTP)) {
                        return C9178j.m27302j().mo22380i().handle(webView.getContext(), str);
                    }
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C9541j.m28227b().mo23588a(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.e$c */
    public static final class C3986c implements C9174b<C3972b> {
        /* renamed from: a */
        public final C9175a<C3972b> mo11528a(C9175a<C3972b> aVar) {
            return aVar.mo22388a(new C3982e()).mo22387a();
        }
    }

    /* renamed from: a */
    public final void mo11541a(C3978e eVar, String str, JSONObject jSONObject) {
        if (eVar != null && eVar.f11854b != null) {
            eVar.mo11573a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final boolean mo11545a(WebView webView, String str) {
        if (this.f11860c != null && this.f11860c.size() > 0) {
            for (C3996a a : this.f11860c) {
                if (a.mo11588a(webView, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo11542a(C4030a aVar) {
        this.f11858a.add(aVar);
    }

    /* renamed from: a */
    public final void mo11543a(String str, JSONObject jSONObject) {
        for (C4030a a : this.f11858a) {
            a.mo11573a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final boolean mo11544a() {
        return this.f11861d == null || this.f11861d.mo11569a();
    }

    /* renamed from: b */
    public final void mo11546b() {
        for (DialogFragment dismissAllowingStateLoss : this.f11859b) {
            dismissAllowingStateLoss.dismissAllowingStateLoss();
        }
        this.f11859b.clear();
    }

    private C3982e() {
        this.f11858a = new CopyOnWriteArrayList();
        this.f11859b = new CopyOnWriteArrayList();
        this.f11860c = new HashSet();
        this.f11860c.add(new C3997b());
        C3980d.m13953a();
    }

    /* renamed from: a */
    public final void mo11538a(C3976c cVar) {
        this.f11861d = cVar;
    }

    /* renamed from: a */
    public final void mo11536a(DialogFragment dialogFragment) {
        this.f11859b.add(dialogFragment);
    }

    /* renamed from: b */
    public final void mo11547b(DialogFragment dialogFragment) {
        this.f11859b.remove(dialogFragment);
    }

    /* renamed from: a */
    public final BaseDialogFragment mo11533a(C3975b bVar) {
        C3951b.m13877a(bVar.f11833a);
        return WebDialogFragment.m14054a(bVar);
    }

    /* renamed from: b */
    public final void mo11548b(C3976c cVar) {
        if (this.f11861d == cVar) {
            this.f11861d = null;
        }
    }

    /* renamed from: a */
    public final WebView mo11531a(Context context) {
        C3978e eVar;
        String str;
        if (this.f11861d == null) {
            eVar = null;
        } else {
            eVar = this.f11861d.mo11571b();
        }
        if (eVar != null) {
            return eVar.f11853a;
        }
        C3988a.m13980a();
        RoundRectWebView roundRectWebView = new RoundRectWebView(context);
        if (context != null) {
            str = context.getClass().getName();
        } else {
            str = "other";
        }
        C3988a.m13981a(str);
        C9178j.m27302j().mo22375d().mo22381a().mo11527a(roundRectWebView);
        return roundRectWebView;
    }

    /* renamed from: b */
    public final void mo11549b(C4030a aVar) {
        this.f11858a.remove(aVar);
    }

    /* renamed from: a */
    public final void mo11537a(WebView webView) {
        if (webView.getParent() instanceof ViewGroup) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        if (this.f11861d == null || !this.f11861d.mo11570a(webView)) {
            C3987d.m13978a(webView);
        }
        C9541j.m28227b().mo23594b(webView);
    }

    /* renamed from: a */
    public final void mo11539a(C3978e eVar) {
        if (eVar != null) {
            mo11549b((C4030a) eVar);
            C3987d.m13978a(eVar.f11853a);
            if (eVar.f11854b != null) {
                eVar.f11854b.mo11530b();
            }
            C9541j.m28227b().mo23594b((WebView) eVar.f11853a);
            eVar.mo11572a();
        }
    }

    /* renamed from: a */
    public final C3978e mo11534a(Activity activity, C3977d dVar) {
        String str;
        C3988a.m13980a();
        RoundRectWebView roundRectWebView = new RoundRectWebView(activity);
        if (activity != null) {
            str = activity.getClass().getName();
        } else {
            str = "other";
        }
        C3988a.m13981a(str);
        roundRectWebView.setHorizontalScrollBarEnabled(false);
        roundRectWebView.setVerticalScrollBarEnabled(false);
        if (VERSION.SDK_INT >= 21) {
            roundRectWebView.getSettings().setMixedContentMode(2);
        }
        C9178j.m27302j().mo22375d().mo22381a().mo11527a(roundRectWebView);
        C3985b bVar = new C3985b(dVar);
        C3984a aVar = new C3984a();
        C4037b a = C4037b.m14094a(activity, (WebView) roundRectWebView, (WebViewClient) bVar, (WebChromeClient) aVar);
        aVar.f11862a = a;
        bVar.f30167b = a.mo11657c().f30326a;
        C4224b.m14355a((Context) activity).mo11781a(true).mo11782a((WebView) roundRectWebView);
        if (VERSION.SDK_INT >= 19 && ((Boolean) C3970c.f11824i.mo10240a()).booleanValue()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        C3978e eVar = new C3978e(roundRectWebView, a, aVar, bVar);
        mo11542a((C4030a) eVar);
        return eVar;
    }

    /* renamed from: a */
    public final void mo11535a(Context context, C3974a aVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", aVar.f11828c);
        bundle.putBoolean("hide_status_bar", aVar.f11829d);
        bundle.putString("title", aVar.f11827b);
        bundle.putBoolean("show_progress", aVar.f11830e);
        bundle.putBoolean("bundle_user_webview_title", true);
        bundle.putString("status_bar_color", aVar.f11831f);
        bundle.putString("status_bar_bg_color", aVar.f11832g);
        bundle.putInt("bundle_web_view_background_color", C3358ac.m12521b((int) R.color.acu));
        TTLiveSDKContext.getHostService().mo22365f().mo22045a(aVar.f11826a, bundle, context);
    }

    /* renamed from: a */
    public final void mo11540a(C3978e eVar, String str) {
        if (eVar != null && eVar.f11853a != null) {
            C9020a.m26956a(str, (WebView) eVar.f11853a, TTLiveSDKContext.getHostService().mo22368i().mo23274b(str));
        }
    }

    /* renamed from: a */
    public final BaseDialogFragment mo11532a(Context context, String str, String str2) {
        C3951b.m13877a(str);
        return C3998a.m14004a(str).mo11596a(false).mo11597b(str2).mo11595a();
    }
}
