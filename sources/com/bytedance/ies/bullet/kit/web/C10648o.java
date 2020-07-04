package com.bytedance.ies.bullet.kit.web;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.bullet.core.C10336c;
import com.bytedance.ies.bullet.core.common.C10348b;
import com.bytedance.ies.bullet.core.common.YieldError;
import com.bytedance.ies.bullet.core.kit.BulletKitType;
import com.bytedance.ies.bullet.core.kit.C10379d;
import com.bytedance.ies.bullet.core.kit.C10386k;
import com.bytedance.ies.bullet.core.kit.C10400u;
import com.bytedance.ies.bullet.core.kit.bridge.C10375f;
import com.bytedance.ies.bullet.core.kit.bridge.C10377h;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge.C10360a;
import com.bytedance.ies.bullet.core.kit.p541a.C10356b;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.monitor.C10420a;
import com.bytedance.ies.bullet.core.monitor.C10425c;
import com.bytedance.ies.bullet.core.p539b.C10334a;
import com.bytedance.ies.bullet.core.p539b.C10335b;
import com.bytedance.ies.bullet.core.params.C10471n;
import com.bytedance.ies.bullet.kit.web.p547a.C10621a;
import com.bytedance.ies.bullet.kit.web.p547a.C10621a.C10622a;
import com.bytedance.ies.bullet.kit.web.p548b.C10627a;
import com.bytedance.ies.bullet.kit.web.p549c.C10630a;
import com.bytedance.ies.bullet.kit.web.p549c.C10631b;
import com.bytedance.ies.bullet.kit.web.p549c.C10631b.C10633b;
import com.bytedance.ies.bullet.p551ui.common.C10675a;
import com.bytedance.ies.bullet.p551ui.common.C10689d;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10680b;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10682c;
import com.bytedance.ies.bullet.p551ui.common.params.C10697a;
import com.bytedance.ies.bullet.p551ui.common.params.C10699c;
import com.bytedance.ies.p555c.C10713b;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.example.p266a.C6490c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.kit.web.o */
public final class C10648o extends C10680b<WebView> {

    /* renamed from: c */
    public C10626b f28491c;

    /* renamed from: d */
    public final List<C10634d> f28492d = new ArrayList();

    /* renamed from: e */
    public final List<C10638e> f28493e = new ArrayList();

    /* renamed from: f */
    public final List<C10647n> f28494f = new ArrayList();

    /* renamed from: g */
    public final List<C10640g> f28495g = new ArrayList();

    /* renamed from: h */
    public C10631b f28496h;

    /* renamed from: i */
    public final List<String> f28497i = new ArrayList();

    /* renamed from: j */
    public final List<String> f28498j = new ArrayList();

    /* renamed from: k */
    public final List<String> f28499k = new ArrayList();

    /* renamed from: l */
    public C10621a f28500l;

    /* renamed from: n */
    private final BulletKitType f28501n = BulletKitType.WEB;

    /* renamed from: o */
    private WebViewClient f28502o;

    /* renamed from: p */
    private WebChromeClient f28503p;

    /* renamed from: q */
    private final C10649a f28504q = new C10649a(this);

    /* renamed from: com.bytedance.ies.bullet.kit.web.o$a */
    public static final class C10649a extends C10675a {

        /* renamed from: a */
        final /* synthetic */ C10648o f28505a;

        C10649a(C10648o oVar) {
            this.f28505a = oVar;
        }

        /* renamed from: f */
        public final boolean mo25097f(Activity activity) {
            C7573i.m23587b(activity, "activity");
            WebView s = this.f28505a.mo25365s();
            if (s == null) {
                return false;
            }
            s.goBack();
            return true;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.o$b */
    static final class C10650b extends Lambda implements C7562b<File, C7581n> {

        /* renamed from: a */
        public static final C10650b f28506a = new C10650b();

        C10650b() {
            super(1);
        }

        /* renamed from: a */
        private static void m31133a(File file) {
            C7573i.m23587b(file, "it");
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m31133a((File) obj);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.o$c */
    static final class C10651c extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        public static final C10651c f28507a = new C10651c();

        C10651c() {
            super(1);
        }

        /* renamed from: a */
        private static void m31134a(Throwable th) {
            C7573i.m23587b(th, "it");
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m31134a((Throwable) obj);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.o$d */
    static final class C10652d extends Lambda implements C7563m<String, IBridge, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10648o f28508a;

        C10652d(C10648o oVar) {
            this.f28508a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m31135a((String) obj, (IBridge) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m31135a(String str, final IBridge iBridge) {
            C7573i.m23587b(str, "name");
            C7573i.m23587b(iBridge, "iBridge");
            C10621a aVar = this.f28508a.f28500l;
            if (aVar != null) {
                aVar.mo25467a(str, (C11093e) new C11093e(this) {

                    /* renamed from: a */
                    final /* synthetic */ C10652d f28509a;

                    {
                        this.f28509a = r1;
                    }

                    public final void call(final C11097i iVar, JSONObject jSONObject) {
                        String str;
                        JSONObject jSONObject2;
                        JSONObject jSONObject3;
                        Object obj;
                        StringBuilder sb = new StringBuilder("bullet web fuc: ");
                        String str2 = null;
                        if (iVar != null) {
                            str = iVar.f30170c;
                        } else {
                            str = null;
                        }
                        sb.append(str);
                        iVar.f30173f = false;
                        if (iVar != null) {
                            jSONObject2 = iVar.f30171d;
                        } else {
                            jSONObject2 = null;
                        }
                        if (jSONObject2 != null) {
                            jSONObject3 = iVar.f30171d;
                        } else {
                            jSONObject3 = new JSONObject();
                        }
                        String str3 = "func";
                        if (iVar != null) {
                            try {
                                obj = iVar.f30170c;
                            } catch (JSONException unused) {
                            }
                        } else {
                            obj = null;
                        }
                        jSONObject3.put(str3, obj);
                        String str4 = "callback_id";
                        if (iVar != null) {
                            str2 = iVar.f30169b;
                        }
                        jSONObject3.put(str4, str2);
                        jSONObject3.put("res", jSONObject);
                        IBridge iBridge = iBridge;
                        C7573i.m23582a((Object) jSONObject3, "params");
                        iBridge.mo25125a(jSONObject3, new C10360a(this) {

                            /* renamed from: a */
                            final /* synthetic */ C106531 f28511a;

                            /* renamed from: a */
                            public final void mo25129a(JSONObject jSONObject) {
                                C7573i.m23587b(jSONObject, "data");
                                C10621a aVar = this.f28511a.f28509a.f28508a.f28500l;
                                if (aVar != null) {
                                    aVar.mo25473b(iVar.f30169b, jSONObject);
                                }
                            }

                            {
                                this.f28511a = r1;
                            }

                            /* renamed from: a */
                            public final void mo25128a(int i, String str) {
                                C7573i.m23587b(str, "message");
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("code", i);
                                    jSONObject.put("msg", str);
                                    C10621a aVar = this.f28511a.f28509a.f28508a.f28500l;
                                    if (aVar != null) {
                                        aVar.mo25473b(iVar.f30169b, jSONObject);
                                    }
                                } catch (JSONException unused) {
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.o$e */
    static final class C10655e implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C10648o f28513a;

        /* renamed from: b */
        final /* synthetic */ WebView f28514b;

        C10655e(C10648o oVar, WebView webView) {
            this.f28513a = oVar;
            this.f28514b = webView;
        }

        public final boolean onLongClick(View view) {
            for (C10638e eVar : this.f28513a.f28493e) {
                try {
                    C10641h rVar = new C10665r(this.f28513a);
                    C7573i.m23582a((Object) view, "view");
                    return eVar.mo25490a(rVar, view);
                } catch (YieldError unused) {
                }
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.o$f */
    public static final class C10656f extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ C10648o f28515a;

        public final View getVideoLoadingProgressView() {
            for (C10640g a : this.f28515a.f28495g) {
                try {
                    return a.mo25491a(new C10665r(this.f28515a));
                } catch (YieldError unused) {
                }
            }
            return super.getVideoLoadingProgressView();
        }

        public final void onGeolocationPermissionsHidePrompt() {
            super.onGeolocationPermissionsHidePrompt();
            Iterator it = this.f28515a.f28495g.iterator();
            while (it.hasNext()) {
                it.next();
                try {
                    new C10665r(this.f28515a);
                } catch (YieldError unused) {
                }
            }
        }

        public final void onHideCustomView() {
            super.onHideCustomView();
            Iterator it = this.f28515a.f28495g.iterator();
            while (it.hasNext()) {
                it.next();
                try {
                    new C10665r(this.f28515a);
                } catch (YieldError unused) {
                }
            }
        }

        C10656f(C10648o oVar) {
            this.f28515a = oVar;
        }

        public final void onPermissionRequest(PermissionRequest permissionRequest) {
            super.onPermissionRequest(permissionRequest);
            Iterator it = this.f28515a.f28495g.iterator();
            while (it.hasNext()) {
                it.next();
                try {
                    new C10665r(this.f28515a);
                    if (permissionRequest != null) {
                        C10616a.m31052a(permissionRequest);
                    }
                } catch (YieldError unused) {
                }
            }
        }

        public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
            Iterator it = this.f28515a.f28495g.iterator();
            while (it.hasNext()) {
                it.next();
                try {
                    new C10665r(this.f28515a);
                } catch (YieldError unused) {
                }
            }
        }

        public final void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            Iterator it = this.f28515a.f28495g.iterator();
            while (it.hasNext()) {
                it.next();
                try {
                    new C10665r(this.f28515a);
                } catch (YieldError unused) {
                }
            }
        }

        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            Iterator it = this.f28515a.f28495g.iterator();
            while (it.hasNext()) {
                it.next();
                try {
                    new C10665r(this.f28515a);
                } catch (YieldError unused) {
                }
            }
        }

        public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
            super.onShowCustomView(view, customViewCallback);
            Iterator it = this.f28515a.f28495g.iterator();
            while (it.hasNext()) {
                it.next();
                try {
                    new C10665r(this.f28515a);
                } catch (YieldError unused) {
                }
            }
        }

        public final void onConsoleMessage(String str, int i, String str2) {
            super.onConsoleMessage(str, i, str2);
            Iterator it = this.f28515a.f28495g.iterator();
            while (it.hasNext()) {
                it.next();
                try {
                    new C10665r(this.f28515a);
                } catch (YieldError unused) {
                }
            }
        }

        public final void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
            super.onShowCustomView(view, i, customViewCallback);
            Iterator it = this.f28515a.f28495g.iterator();
            while (it.hasNext()) {
                it.next();
                try {
                    new C10665r(this.f28515a);
                } catch (YieldError unused) {
                }
            }
        }

        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
            C10629c cVar;
            for (C10640g gVar : this.f28515a.f28495g) {
                try {
                    C10641h rVar = new C10665r(this.f28515a);
                    if (fileChooserParams != null) {
                        cVar = C10616a.m31051a(fileChooserParams);
                    } else {
                        cVar = null;
                    }
                    return gVar.mo25492a(rVar, valueCallback, cVar);
                } catch (YieldError unused) {
                }
            }
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }

        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            for (C10640g a : this.f28515a.f28495g) {
                try {
                    return a.mo25493a(new C10665r(this.f28515a), str, str2, jsResult);
                } catch (YieldError unused) {
                }
            }
            return super.onJsAlert(webView, str, str2, jsResult);
        }

        public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            for (C10640g c : this.f28515a.f28495g) {
                try {
                    return c.mo25496c(new C10665r(this.f28515a), str, str2, jsResult);
                } catch (YieldError unused) {
                }
            }
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }

        public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            for (C10640g b : this.f28515a.f28495g) {
                try {
                    return b.mo25495b(new C10665r(this.f28515a), str, str2, jsResult);
                } catch (YieldError unused) {
                }
            }
            return super.onJsConfirm(webView, str, str2, jsResult);
        }

        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            for (C10640g a : this.f28515a.f28495g) {
                try {
                    return a.mo25494a(new C10665r(this.f28515a), str, str2, str3, jsPromptResult);
                } catch (YieldError unused) {
                }
            }
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.o$g */
    public static final class C10657g extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ C10648o f28516a;

        /* renamed from: b */
        final /* synthetic */ WebView f28517b;

        /* renamed from: c */
        final /* synthetic */ C10682c f28518c;

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C6490c.m20174a(webView, renderProcessGoneDetail);
        }

        public final void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
            C10621a aVar = this.f28516a.f28500l;
            if (aVar != null) {
                C11087a aVar2 = aVar.f28462b;
                if (aVar2 != null) {
                    aVar2.mo27037c(str);
                }
            }
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            C10646m mVar;
            for (C10647n nVar : this.f28516a.f28494f) {
                try {
                    C10641h rVar = new C10665r(this.f28516a);
                    if (webResourceRequest != null) {
                        mVar = C10616a.m31054a(webResourceRequest);
                    } else {
                        mVar = null;
                    }
                    return nVar.mo25062b(rVar, mVar);
                } catch (YieldError unused) {
                }
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C10646m mVar;
            for (C10647n nVar : this.f28516a.f28494f) {
                try {
                    C10641h rVar = new C10665r(this.f28516a);
                    if (webResourceRequest != null) {
                        mVar = C10616a.m31054a(webResourceRequest);
                    } else {
                        mVar = null;
                    }
                    return nVar.mo25061a(rVar, mVar);
                } catch (YieldError unused) {
                }
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (str != null) {
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    C10627a t = this.f28516a.mo25499t();
                    if (t != null) {
                        t.mo25477b(parse);
                    }
                    this.f28518c.mo25560b(parse);
                }
            }
            C10622a.m31067a(this.f28517b, this.f28516a.mo25158a().f28131a);
            for (C10647n a : this.f28516a.f28494f) {
                try {
                    a.mo25059a((C10641h) new C10665r(this.f28516a), str);
                } catch (YieldError unused) {
                }
            }
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (str != null) {
                C10631b bVar = this.f28516a.f28496h;
                if (bVar != null) {
                    WebResourceResponse a = bVar.mo25483a(webView, str);
                    if (a != null) {
                        return a;
                    }
                }
            }
            for (C10647n c : this.f28516a.f28494f) {
                try {
                    return c.mo25064c(new C10665r(this.f28516a), str);
                } catch (YieldError unused) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C10621a aVar = this.f28516a.f28500l;
            if (aVar != null) {
                C11087a aVar2 = aVar.f28462b;
                if (aVar2 != null) {
                    Boolean valueOf = Boolean.valueOf(aVar2.mo27035b(str));
                    if (!valueOf.booleanValue()) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        return valueOf.booleanValue();
                    }
                }
            }
            for (C10647n b : this.f28516a.f28494f) {
                try {
                    return b.mo25063b((C10641h) new C10665r(this.f28516a), str);
                } catch (YieldError unused) {
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        C10657g(C10648o oVar, WebView webView, C10682c cVar) {
            this.f28516a = oVar;
            this.f28517b = webView;
            this.f28518c = cVar;
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (str != null) {
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    C10627a t = this.f28516a.mo25499t();
                    if (t != null) {
                        t.mo25476a(parse);
                    }
                }
            }
            for (C10647n a : this.f28516a.f28494f) {
                try {
                    a.mo25060a((C10641h) new C10665r(this.f28516a), str, bitmap);
                } catch (YieldError unused) {
                }
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            for (C10647n a : this.f28516a.f28494f) {
                try {
                    a.mo25057a((C10641h) new C10665r(this.f28516a), sslErrorHandler, sslError);
                } catch (YieldError unused) {
                }
            }
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C10646m mVar;
            C10645l lVar;
            int i;
            CharSequence charSequence;
            CharSequence charSequence2;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            String url = this.f28517b.getUrl();
            if (url != null) {
                C10682c cVar = this.f28518c;
                Uri parse = Uri.parse(url);
                C7573i.m23582a((Object) parse, "Uri.parse(it)");
                if (webResourceError != null) {
                    i = webResourceError.getErrorCode();
                } else {
                    i = 0;
                }
                if (webResourceError != null) {
                    charSequence = webResourceError.getDescription();
                } else {
                    charSequence = null;
                }
                if (webResourceRequest != null) {
                    Uri url2 = webResourceRequest.getUrl();
                    if (url2 != null) {
                        charSequence2 = url2.toString();
                        cVar.mo25558a(parse, new WebLoadError(i, charSequence, charSequence2));
                    }
                }
                charSequence2 = null;
                cVar.mo25558a(parse, new WebLoadError(i, charSequence, charSequence2));
            }
            for (C10647n nVar : this.f28516a.f28494f) {
                try {
                    C10641h rVar = new C10665r(this.f28516a);
                    if (webResourceRequest != null) {
                        mVar = C10616a.m31054a(webResourceRequest);
                    } else {
                        mVar = null;
                    }
                    if (webResourceError != null) {
                        lVar = C10616a.m31053a(webResourceError);
                    } else {
                        lVar = null;
                    }
                    nVar.mo25058a(rVar, mVar, lVar);
                } catch (YieldError unused) {
                }
            }
        }

        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            for (C10647n a : this.f28516a.f28494f) {
                try {
                    a.mo25056a((C10641h) new C10665r(this.f28516a), httpAuthHandler, str, str2);
                } catch (YieldError unused) {
                }
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (VERSION.SDK_INT < 23) {
                C10682c cVar = this.f28518c;
                Uri parse = Uri.parse(this.f28517b.getUrl());
                C7573i.m23582a((Object) parse, "Uri.parse(url)");
                cVar.mo25558a(parse, new WebLoadError(i, str, str2));
            }
            for (C10647n a : this.f28516a.f28494f) {
                try {
                    a.mo25055a((C10641h) new C10665r(this.f28516a), i, str, str2);
                } catch (YieldError unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.o$h */
    static final class C10658h extends Lambda implements C7563m<String, IBridge, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10648o f28519a;

        C10658h(C10648o oVar) {
            this.f28519a = oVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m31138a((String) obj, (IBridge) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m31138a(String str, IBridge iBridge) {
            C7573i.m23587b(str, "s");
            C7573i.m23587b(iBridge, "iBridge");
            switch (C10663p.f28524a[iBridge.mo25126b().ordinal()]) {
                case 1:
                    this.f28519a.f28497i.add(str);
                    return;
                case 2:
                    this.f28519a.f28498j.add(str);
                    break;
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.o$i */
    static final class C10659i extends Lambda implements C7562b<C10642i, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10648o f28520a;

        C10659i(C10648o oVar) {
            this.f28520a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m31139a((C10642i) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m31139a(C10642i iVar) {
            C7573i.m23587b(iVar, "$receiver");
            this.f28520a.f28494f.add(iVar.mo25497a());
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.o$j */
    static final class C10660j extends Lambda implements C7562b<C10644k, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10648o f28521a;

        /* renamed from: com.bytedance.ies.bullet.kit.web.o$j$a */
        static final class C10661a implements C10713b {

            /* renamed from: a */
            final /* synthetic */ C10630a f28522a;

            C10661a(C10630a aVar) {
                this.f28522a = aVar;
            }

            /* renamed from: a */
            public final boolean mo25528a(String str) {
                C7562b c = this.f28522a.mo25480c();
                C7573i.m23582a((Object) str, "str");
                return ((Boolean) c.invoke(str)).booleanValue();
            }
        }

        /* renamed from: com.bytedance.ies.bullet.kit.web.o$j$b */
        public static final class C10662b implements C10633b {

            /* renamed from: a */
            final /* synthetic */ C10630a f28523a;

            C10662b(C10630a aVar) {
                this.f28523a = aVar;
            }

            /* renamed from: a */
            public final WebResourceResponse mo25488a(String str) {
                C7573i.m23587b(str, "url");
                return (WebResourceResponse) this.f28523a.mo25481d().invoke(str);
            }
        }

        C10660j(C10648o oVar) {
            this.f28521a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m31140a((C10644k) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m31140a(C10644k kVar) {
            C7573i.m23587b(kVar, "$receiver");
            boolean z = false;
            if (this.f28521a.f28491c == null) {
                this.f28521a.f28491c = kVar.mo25052a();
            } else {
                C10626b a = kVar.mo25052a();
                C10626b bVar = this.f28521a.f28491c;
                if (bVar != null) {
                    bVar.mo25123a(a, false);
                }
            }
            C10626b bVar2 = this.f28521a.f28491c;
            if (bVar2 != null) {
                C10356b<List<String>> bVar3 = bVar2.f28476c;
                if (!bVar3.mo25121a()) {
                    bVar3 = null;
                }
                if (bVar3 != null) {
                    List list = (List) bVar3.mo25122b();
                    if (list != null) {
                        this.f28521a.f28499k.addAll(list);
                    }
                }
            }
            C10630a b = kVar.mo25054b();
            if (b != null) {
                if (this.f28521a.f28496h == null) {
                    z = true;
                }
                if (!z) {
                    b = null;
                }
                if (b != null) {
                    Application application = (Application) this.f28521a.mo25185r().mo25202b(Application.class);
                    C10348b bVar4 = (C10348b) this.f28521a.mo25185r().mo25202b(C10348b.class);
                    if (!(application == null || bVar4 == null)) {
                        this.f28521a.f28496h = new C10631b(application, bVar4.f28053b, bVar4.f28052a, b.mo25478a()).mo25485a((C10713b) new C10661a(b)).mo25487a(b.mo25479b()).mo25486a(b.mo25482e()).mo25484a((C10633b) new C10662b(b));
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo25173c(List<String> list, C10336c cVar) {
        C7573i.m23587b(list, "packageNames");
        C7573i.m23587b(cVar, "newRegistryBundle");
    }

    /* renamed from: d */
    public final BulletKitType mo25162d() {
        return this.f28501n;
    }

    /* renamed from: w */
    private final C10697a m31119w() {
        C10471n m = mo25180m();
        if (m == null) {
            C7573i.m23580a();
        }
        if (m != null) {
            return (C10697a) m;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.params.CommonParamsBundle");
    }

    /* renamed from: p */
    public final void mo25183p() {
        C10689d v = mo25556v();
        if (v != null) {
            v.mo25553b(this.f28504q);
        }
        C10621a aVar = this.f28500l;
        if (aVar != null) {
            aVar.mo25475c();
        }
        this.f28500l = null;
    }

    /* renamed from: t */
    public final C10627a mo25499t() {
        C10420a n = mo25181n();
        if (n == null) {
            return null;
        }
        if (n != null) {
            return (C10627a) n;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.kit.web.monitor.WebKitMonitorSession");
    }

    /* renamed from: o */
    public final void mo25182o() {
        C10689d v = mo25556v();
        if (v != null) {
            v.mo25552a(this.f28504q);
        }
        C10334a k = mo25178k();
        if (k != null) {
            k.mo25100b(C10335b.m30619a(""), C10650b.f28506a, C10651c.f28507a);
        }
    }

    /* renamed from: s */
    public final WebView mo25365s() {
        for (C10682c cVar : mo25555u()) {
            WebView webView = (WebView) cVar.f28561a;
            if (webView.canGoBack()) {
                return webView;
            }
        }
        return null;
    }

    /* renamed from: d */
    private final void m31117d(WebView webView) {
        this.f28503p = new C10656f(this);
        webView.setWebChromeClient(this.f28503p);
    }

    /* renamed from: a */
    private final void m31113a(WebView webView) {
        C10699c cVar = (C10699c) m31119w().f28589v.mo25251b();
        if (cVar != null) {
            webView.setBackgroundColor(cVar.f28594a);
        }
    }

    public final void onEvent(C10377h hVar) {
        C7573i.m23587b(hVar, "event");
        C10621a aVar = this.f28500l;
        if (aVar != null) {
            aVar.mo25470a(hVar.mo25151a(), hVar.mo25152b());
        }
    }

    /* renamed from: b */
    public final void mo25170b(Uri uri) {
        C7573i.m23587b(uri, "input");
        for (C10682c cVar : mo25555u()) {
            cVar.mo25557a(uri);
            C10664q.m31143a((WebView) cVar.f28561a, String.valueOf(uri));
        }
    }

    /* renamed from: c */
    private final void m31116c(WebView webView) {
        for (C10634d a : this.f28492d) {
            for (Entry entry : a.mo25489a(new C10665r(this)).entrySet()) {
                webView.addJavascriptInterface(entry.getValue(), (String) entry.getKey());
            }
        }
        C10626b bVar = this.f28491c;
        if (bVar != null) {
            C10356b<Boolean> bVar2 = bVar.f28475b;
            if (bVar2 != null) {
                if (!bVar2.mo25121a()) {
                    bVar2 = null;
                }
                if (bVar2 != null) {
                    Boolean bool = (Boolean) bVar2.mo25122b();
                    if (bool != null && bool.booleanValue()) {
                        webView.setOnLongClickListener(new C10655e(this, webView));
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private final void m31118e(WebView webView) {
        C10621a b = C10622a.m31066a(webView).mo25465a(this.f28503p).mo25466a(this.f28502o).mo25472b(this.f28497i).mo25474c(this.f28498j).mo25468a(this.f28499k).mo25471b();
        mo25185r().mo25201a(C11087a.class, b.f28462b);
        this.f28500l = b;
        C10375f c = mo25161c();
        if (c != null) {
            c.mo25143a(new C10652d(this));
        }
    }

    /* renamed from: b */
    private final void m31115b(WebView webView) {
        for (C10386k kVar : C7525m.m23512f((Iterable<? extends T>) mo25176i())) {
            if (!(kVar instanceof C10644k)) {
                kVar = null;
            }
            C10644k kVar2 = (C10644k) kVar;
            if (kVar2 != null) {
                WebSettings settings = webView.getSettings();
                C7573i.m23582a((Object) settings, "settings");
                kVar2.mo25053a(settings, webView);
            }
        }
        C10386k g = mo25174g();
        if (!(g instanceof C10644k)) {
            g = null;
        }
        C10644k kVar3 = (C10644k) g;
        if (kVar3 != null) {
            WebSettings settings2 = webView.getSettings();
            C7573i.m23582a((Object) settings2, "settings");
            kVar3.mo25053a(settings2, webView);
        }
        C10626b bVar = this.f28491c;
        if (bVar != null) {
            C10356b<Boolean> bVar2 = bVar.f28474a;
            if (!bVar2.mo25121a()) {
                bVar2 = null;
            }
            if (bVar2 != null) {
                Boolean bool = (Boolean) bVar2.mo25122b();
                if (bool != null && !bool.booleanValue()) {
                    webView.setLayerType(1, null);
                }
            }
            C10356b<Boolean> bVar3 = bVar.f28475b;
            if (!bVar3.mo25121a()) {
                bVar3 = null;
            }
            if (bVar3 != null) {
                Boolean bool2 = (Boolean) bVar3.mo25122b();
                if (bool2 != null) {
                    webView.setLongClickable(bool2.booleanValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo25363a(C10682c<WebView> cVar) {
        C7573i.m23587b(cVar, "viewComponent");
        WebView webView = (WebView) cVar.f28561a;
        m31113a(webView);
        m31115b(webView);
        m31116c(webView);
        m31114a(webView, cVar);
        m31117d(webView);
        m31118e(webView);
    }

    /* renamed from: a */
    public final void mo25364a(C7562b<? super List<C10682c<WebView>>, C7581n> bVar) {
        C7573i.m23587b(bVar, "provider");
        bVar.invoke(C7525m.m23457a(new C10682c(new WebView((Context) mo25185r().mo25202b(Context.class)), null, 2, null)));
    }

    /* renamed from: a */
    private final void m31114a(WebView webView, C10682c<WebView> cVar) {
        this.f28502o = new C10657g(this, webView, cVar);
        webView.setWebViewClient(C6490c.m20171a(this.f28502o));
    }

    /* renamed from: a */
    public final C10420a mo25167a(Uri uri, Uri uri2) {
        C7573i.m23587b(uri, "uri");
        C10403b bVar = new C10403b();
        bVar.mo25201a(C10425c.class, mo25179l());
        bVar.mo25203b(Uri.class, uri2);
        return new C10627a(uri, bVar);
    }

    /* renamed from: b */
    public final void mo25172b(List<String> list, C10336c cVar) {
        C7573i.m23587b(list, "packageNames");
        C7573i.m23587b(cVar, "kitPackageRegistryBundle");
        super.mo25172b(list, cVar);
        C7562b jVar = new C10660j(this);
        for (C10386k kVar : mo25176i()) {
            if (!(kVar instanceof C10644k)) {
                kVar = null;
            }
            C10644k kVar2 = (C10644k) kVar;
            if (kVar2 != null) {
                jVar.invoke(kVar2);
            }
        }
        C10386k g = mo25174g();
        if (!(g instanceof C10644k)) {
            g = null;
        }
        C10644k kVar3 = (C10644k) g;
        if (kVar3 != null) {
            jVar.invoke(kVar3);
        }
        C7562b iVar = new C10659i(this);
        for (C10379d dVar : mo25177j()) {
            if (!(dVar instanceof C10642i)) {
                dVar = null;
            }
            C10642i iVar2 = (C10642i) dVar;
            if (iVar2 != null) {
                iVar.invoke(iVar2);
            }
        }
        C10379d h = mo25175h();
        if (!(h instanceof C10642i)) {
            h = null;
        }
        C10642i iVar3 = (C10642i) h;
        if (iVar3 != null) {
            iVar.invoke(iVar3);
        }
        C10375f c = mo25161c();
        if (c != null) {
            c.mo25143a(new C10658h(this));
        }
    }

    /* renamed from: b */
    public final void mo25171b(Uri uri, C7562b<? super Uri, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
        C7573i.m23587b(uri, "input");
        C7573i.m23587b(bVar, "resolve");
        C7573i.m23587b(bVar2, "reject");
        bVar.invoke(uri);
    }

    public C10648o(WebKitApi webKitApi, C10400u uVar, List<String> list, C10336c cVar, C10403b bVar) {
        C7573i.m23587b(webKitApi, "kitApi");
        C7573i.m23587b(uVar, "sessionInfo");
        C7573i.m23587b(list, "packageNames");
        C7573i.m23587b(cVar, "kitPackageRegistryBundle");
        C7573i.m23587b(bVar, "providerFactory");
        super(webKitApi, uVar, list, cVar, bVar);
    }
}
