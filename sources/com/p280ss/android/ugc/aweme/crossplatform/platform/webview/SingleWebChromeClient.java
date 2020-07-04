package com.p280ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.p280ss.android.sdk.webview.C20144k;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25220ac;
import com.p280ss.android.ugc.aweme.crossplatform.activity.C25822g;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient */
public final class SingleWebChromeClient extends C25961a {

    /* renamed from: d */
    public C20144k f68630d;

    /* renamed from: e */
    public C25822g f68631e;

    /* renamed from: f */
    public final List<C25966d> f68632f = new ArrayList();

    /* renamed from: g */
    public C30388i f68633g;

    /* renamed from: h */
    public C25966d f68634h = new C25945a(this);

    /* renamed from: i */
    private UploadFileFragment f68635i;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient$a */
    public static final class C25945a implements C25966d {

        /* renamed from: a */
        final /* synthetic */ SingleWebChromeClient f68636a;

        /* renamed from: a */
        public final void mo67355a() {
            for (C25966d a : this.f68636a.f68632f) {
                a.mo67355a();
            }
        }

        C25945a(SingleWebChromeClient singleWebChromeClient) {
            this.f68636a = singleWebChromeClient;
        }

        /* renamed from: a */
        public final void mo67356a(View view, CustomViewCallback customViewCallback) {
            for (C25966d a : this.f68636a.f68632f) {
                a.mo67356a(view, customViewCallback);
            }
        }

        /* renamed from: a */
        public final void mo67357a(WebView webView, int i) {
            for (C25966d a : this.f68636a.f68632f) {
                a.mo67357a(webView, i);
            }
        }
    }

    public final void onGeolocationPermissionsHidePrompt() {
        C20144k kVar = this.f68630d;
        if (kVar != null) {
            kVar.mo53915e();
        }
    }

    public final void onHideCustomView() {
        super.onHideCustomView();
        this.f68634h.mo67355a();
    }

    public final View getVideoLoadingProgressView() {
        Context context;
        C25822g gVar = this.f68631e;
        Context context2 = null;
        if (gVar != null) {
            context = gVar.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            return null;
        }
        C25822g gVar2 = this.f68631e;
        if (gVar2 != null) {
            context2 = gVar2.getContext();
        }
        if (context2 == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) context2, "iCrossPlatformActivityContainer?.context!!");
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        return frameLayout;
    }

    /* renamed from: a */
    private static AppCompatActivity m85253a(Context context) {
        if (context == null) {
            return null;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback) {
        C7573i.m23587b(valueCallback, "uploadMsg");
        this.f68635i.f68654a = valueCallback;
        this.f68635i.mo67415a("", "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SingleWebChromeClient(android.webkit.WebView r3) {
        /*
            r2 = this;
            java.lang.String r0 = "targetWebView"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r2.f68632f = r0
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient$a r0 = new com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient$a
            r0.<init>(r2)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r0 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25966d) r0
            r2.f68634h = r0
            android.content.Context r3 = r3.getContext()
            android.support.v7.app.AppCompatActivity r3 = m85253a(r3)
            if (r3 == 0) goto L_0x0031
            android.support.v4.app.j r0 = r3.getSupportFragmentManager()
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = "web_view_upload_file"
            android.support.v4.app.Fragment r0 = r0.mo2644a(r1)
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            boolean r1 = r0 instanceof com.p280ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment
            if (r1 != 0) goto L_0x0058
            com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment r0 = new com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment
            r0.<init>()
            r2.f68635i = r0
            if (r3 == 0) goto L_0x0057
            android.support.v4.app.j r3 = r3.getSupportFragmentManager()
            if (r3 == 0) goto L_0x0057
            android.support.v4.app.q r3 = r3.mo2645a()
            com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment r0 = r2.f68635i
            android.support.v4.app.Fragment r0 = (android.support.p022v4.app.Fragment) r0
            java.lang.String r1 = "web_view_upload_file"
            android.support.v4.app.q r3 = r3.mo2588a(r0, r1)
            r3.mo2606d()
            goto L_0x005c
        L_0x0057:
            return
        L_0x0058:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment r0 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment) r0
            r2.f68635i = r0
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient.<init>(android.webkit.WebView):void");
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        this.f68634h.mo67356a(view, customViewCallback);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        C7573i.m23587b(str, "origin");
        C7573i.m23587b(callback, "callback");
        C20144k kVar = this.f68630d;
        if (kVar != null) {
            kVar.mo53912a(str, callback);
        }
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C30388i iVar = this.f68633g;
        if (iVar != null) {
            C30391k kVar = (C30391k) iVar.mo80008a(C30391k.class);
            if (kVar != null) {
                kVar.mo79992a(webView, i);
            }
        }
        this.f68634h.mo67357a(webView, i);
    }

    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        C25822g gVar = this.f68631e;
        if (gVar != null) {
            gVar.mo65871a(str, false);
        }
        C30388i iVar = this.f68633g;
        if (iVar != null) {
            C30391k kVar = (C30391k) iVar.mo80008a(C30391k.class);
            if (kVar != null) {
                kVar.mo80004d();
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        C7573i.m23587b(valueCallback, "uploadMsg");
        C7573i.m23587b(str, "acceptType");
        this.f68635i.f68654a = valueCallback;
        this.f68635i.mo67415a(str, "");
    }

    public final void onConsoleMessage(String str, int i, String str2) {
        try {
            C20144k kVar = this.f68630d;
            if (kVar != null) {
                kVar.mo53914d(str);
            }
            C25220ac.f66537b.mo65835a(str);
        } catch (Exception unused) {
        }
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
        Context context;
        if (fileChooserParams == null) {
            return false;
        }
        if (webView != null) {
            context = webView.getContext();
        } else {
            context = null;
        }
        if (m85253a(context) == null) {
            return false;
        }
        this.f68635i.mo67416a(webView, valueCallback, fileChooserParams);
        return true;
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        C7573i.m23587b(valueCallback, "uploadMsg");
        C7573i.m23587b(str, "acceptType");
        C7573i.m23587b(str2, "capture");
        this.f68635i.f68654a = valueCallback;
        this.f68635i.mo67415a(str, str2);
    }
}
