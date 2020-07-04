package com.bytedance.opensdk.core.base.p628ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p029v7.widget.AppCompatImageView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.opensdk.core.grant.web.C12328a;
import com.bytedance.opensdk.core.grant.web.C12331b;
import com.bytedance.opensdk.core.grant.web.WebPageStatusView;
import com.bytedance.opensdk.core.grant.web.p632a.C12329a;
import com.bytedance.opensdk.core.grant.web.p632a.C12329a.C12330a;
import com.bytedance.opensdk.p619b.C12278i;
import com.bytedance.opensdk.p619b.C12280k;
import com.example.p266a.C6490c;
import com.google.gson.C6711m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.opensdk.core.base.ui.HeloSdkBaseWebActivity */
public abstract class HeloSdkBaseWebActivity extends Activity implements C12328a {

    /* renamed from: a */
    public C12315a f32683a;

    /* renamed from: b */
    public final String f32684b = getClass().getSimpleName();

    /* renamed from: c */
    private HashMap f32685c;

    /* renamed from: com.bytedance.opensdk.core.base.ui.HeloSdkBaseWebActivity$a */
    public final class C12312a extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ HeloSdkBaseWebActivity f32686a;

        /* renamed from: b */
        private final C12328a f32687b;

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C6490c.m20174a(webView, renderProcessGoneDetail);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return this.f32687b.mo30125a(webView, webResourceRequest);
        }

        public C12312a(HeloSdkBaseWebActivity heloSdkBaseWebActivity, C12328a aVar) {
            C7573i.m23587b(aVar, "webViewHandler");
            this.f32686a = heloSdkBaseWebActivity;
            this.f32687b = aVar;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f32687b.mo30128b(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return this.f32687b.mo30126a(webView, str);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f32687b.mo30122a(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            this.f32687b.mo30120a(webView, webResourceRequest, webResourceError);
        }

        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            this.f32687b.mo30121a(webView, webResourceRequest, webResourceResponse);
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            this.f32687b.mo30119a(webView, sslErrorHandler, sslError);
        }
    }

    /* renamed from: com.bytedance.opensdk.core.base.ui.HeloSdkBaseWebActivity$b */
    static final class C12313b extends Lambda implements C7562b<C12330a, C7581n> {

        /* renamed from: a */
        final /* synthetic */ HeloSdkBaseWebActivity f32688a;

        C12313b(HeloSdkBaseWebActivity heloSdkBaseWebActivity) {
            this.f32688a = heloSdkBaseWebActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m35770a((C12330a) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m35770a(C12330a aVar) {
            C7573i.m23587b(aVar, "jsMsg");
            this.f32688a.mo30129b(aVar);
        }
    }

    /* renamed from: com.bytedance.opensdk.core.base.ui.HeloSdkBaseWebActivity$c */
    static final class C12314c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ HeloSdkBaseWebActivity f32689a;

        C12314c(HeloSdkBaseWebActivity heloSdkBaseWebActivity) {
            this.f32689a = heloSdkBaseWebActivity;
        }

        public final void onClick(View view) {
            this.f32689a.onBackPressed();
        }
    }

    /* renamed from: a */
    public View mo30116a(int i) {
        if (this.f32685c == null) {
            this.f32685c = new HashMap();
        }
        View view = (View) this.f32685c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f32685c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public abstract String mo30117a();

    /* renamed from: a */
    public abstract void mo30118a(Intent intent);

    /* renamed from: a */
    public abstract boolean mo30124a(Uri uri);

    /* renamed from: a */
    public abstract boolean mo30127a(C12330a aVar);

    /* renamed from: a */
    public final boolean mo30126a(WebView webView, String str) {
        if (str == null || webView == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        C7573i.m23582a((Object) parse, "uri");
        return m35752b(parse);
    }

    /* renamed from: c */
    private final void m35753c() {
        C12315a aVar = this.f32683a;
        if (aVar != null) {
            aVar.mo30146a(mo30117a());
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12315a aVar = this.f32683a;
        if (aVar != null) {
            aVar.mo30148c();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12315a aVar = this.f32683a;
        if (aVar != null) {
            aVar.mo30147b();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12315a aVar = this.f32683a;
        if (aVar != null) {
            aVar.mo30144a();
        }
    }

    /* renamed from: d */
    private WebPageStatusView m35755d() {
        WebPageStatusView webPageStatusView = new WebPageStatusView(this, null, 0, 6, null);
        webPageStatusView.setId(R.id.egf);
        webPageStatusView.setLayoutParams(new LayoutParams(-1, -1));
        return webPageStatusView;
    }

    public void onBackPressed() {
        WebView webView = (WebView) ((FrameLayout) mo30116a((int) R.id.eg6)).findViewById(R.id.egk);
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            webView.goBack();
        }
    }

    /* renamed from: b */
    private final void m35750b() {
        WebView a = C12331b.f32731a.mo30168a((Context) this);
        ViewParent parent = a.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(a);
        }
        View findViewById = ((FrameLayout) mo30116a((int) R.id.eg6)).findViewById(R.id.egk);
        if (findViewById != null) {
            ((FrameLayout) mo30116a((int) R.id.eg6)).removeView(findViewById);
        }
        a.setLayoutParams(new LayoutParams(-1, -1));
        a.setWebViewClient(C6490c.m20171a((WebViewClient) new C12312a(this, this)));
        ((FrameLayout) mo30116a((int) R.id.eg6)).addView(a);
        WebPageStatusView d = m35755d();
        ((FrameLayout) mo30116a((int) R.id.eg6)).addView(d);
        this.f32683a = new C12315a(a, d);
        ((AppCompatImageView) mo30116a((int) R.id.dk0)).setOnClickListener(new C12314c(this));
    }

    /* renamed from: b */
    private final void m35751b(Intent intent) {
        mo30118a(intent);
    }

    /* renamed from: b */
    public final void mo30129b(C12330a aVar) {
        mo30127a(aVar);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.s3);
        setRequestedOrientation(1);
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        m35751b(intent);
        m35750b();
        m35753c();
    }

    /* renamed from: b */
    private final boolean m35752b(Uri uri) {
        String str = this.f32684b;
        C7573i.m23582a((Object) str, "TAG");
        StringBuilder sb = new StringBuilder("handleUri, uri = ");
        sb.append(uri);
        C12278i.m35691a(str, sb.toString());
        try {
            if (!C12329a.m35803a(uri)) {
                return false;
            }
            if (m35754c(uri)) {
                return true;
            }
            return mo30124a(uri);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m35754c(Uri uri) {
        String uri2 = uri.toString();
        C7573i.m23582a((Object) uri2, "uri.toString()");
        List arrayList = new ArrayList();
        if (C12329a.m35804a(uri2)) {
            C12315a aVar = this.f32683a;
            if (aVar != null) {
                WebView webView = aVar.f32691a;
                if (webView != null) {
                    C12329a.m35801a(webView);
                }
            }
            return true;
        } else if (!C12329a.m35805a(uri2, arrayList)) {
            return false;
        } else {
            String str = (String) C7525m.m23513g(arrayList);
            if (str != null) {
                C12329a.m35802a(str, (C7562b<? super C12330a, C7581n>) new C12313b<Object,C7581n>(this));
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo30128b(WebView webView, String str) {
        C12315a aVar = this.f32683a;
        if (aVar != null) {
            aVar.mo30145a(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30123a(String str, C6711m mVar) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(mVar, "params");
        C12315a aVar = this.f32683a;
        if (aVar != null) {
            WebView webView = aVar.f32691a;
            if (webView != null) {
                C12329a.f32724a.mo30164a(webView, str, mVar);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo30125a(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webView == null) {
            return false;
        }
        Uri url = webResourceRequest.getUrl();
        C7573i.m23582a((Object) url, "uri");
        return m35752b(url);
    }

    /* renamed from: a */
    public final void mo30119a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C12315a aVar = this.f32683a;
        if (aVar != null) {
            aVar.mo30145a(4);
        }
    }

    /* renamed from: a */
    public final void mo30120a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (C12280k.f32621a.mo30085a((Context) this)) {
            C12315a aVar = this.f32683a;
            if (aVar != null) {
                aVar.mo30145a(1000);
            }
        } else {
            C12315a aVar2 = this.f32683a;
            if (aVar2 != null) {
                aVar2.mo30145a(2);
            }
        }
    }

    /* renamed from: a */
    public final void mo30121a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C12315a aVar = this.f32683a;
        if (aVar != null) {
            aVar.mo30145a(3);
        }
    }

    /* renamed from: a */
    public final void mo30122a(WebView webView, String str, Bitmap bitmap) {
        C12315a aVar = this.f32683a;
        if (aVar != null) {
            aVar.mo30145a(0);
        }
    }
}
