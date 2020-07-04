package com.p280ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.geckoclient.C10873f;
import com.bytedance.ies.p555c.C10713b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.newmedia.C19927c;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.p848c.p849a.C19235b;
import com.p280ss.android.sdk.webview.C20140h;
import com.p280ss.android.sdk.webview.C20140h.C20141a;
import com.p280ss.android.sdk.webview.C20142i;
import com.p280ss.android.sdk.webview.C20143j;
import com.p280ss.android.sdk.webview.C20145l;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25301by;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25330a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25337b;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d;
import com.p280ss.android.ugc.aweme.crossplatform.C25870d.C25871a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.C25822g;
import com.p280ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.C25862i;
import com.p280ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness.C25851a;
import com.p280ss.android.ugc.aweme.crossplatform.business.QuickShopBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25884b;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30373ac;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30402t;
import com.p280ss.android.ugc.aweme.login.larksso.LarkSsoHelper;
import com.p280ss.android.ugc.aweme.web.C43440c;
import com.p280ss.android.ugc.aweme.web.C43447i;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.f */
public final class C25968f extends C20143j {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f68668a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25968f.class), "intercept", "getIntercept()Lcom/ss/android/sdk/webview/IESUrlIntercept;"))};

    /* renamed from: h */
    public static final C25969a f68669h = new C25969a(null);

    /* renamed from: c */
    public final List<C25965c> f68670c = new ArrayList();

    /* renamed from: d */
    public C7563m<? super WebView, ? super String, Boolean> f68671d;

    /* renamed from: e */
    public C25977i f68672e;

    /* renamed from: f */
    public C30388i f68673f;

    /* renamed from: g */
    public C25822g f68674g;

    /* renamed from: i */
    private final C25965c f68675i = new C25973e(this);

    /* renamed from: j */
    private C20140h f68676j;

    /* renamed from: k */
    private final C19927c f68677k = new C19927c();

    /* renamed from: l */
    private final C7541d f68678l = C7546e.m23569a(C25972d.f68681a);

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.f$a */
    public static final class C25969a {
        private C25969a() {
        }

        public /* synthetic */ C25969a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.f$b */
    static final class C25970b implements C10713b {

        /* renamed from: a */
        public static final C25970b f68679a = new C25970b();

        C25970b() {
        }

        /* renamed from: a */
        public final boolean mo25528a(String str) {
            return C10873f.m31910d(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.f$c */
    static final class C25971c implements C20141a {

        /* renamed from: a */
        final /* synthetic */ C25968f f68680a;

        C25971c(C25968f fVar) {
            this.f68680a = fVar;
        }

        /* renamed from: a */
        public final WebResourceResponse mo53904a(String str) {
            return this.f68680a.mo67421a().mo53904a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.f$d */
    static final class C25972d extends Lambda implements C7561a<C20142i> {

        /* renamed from: a */
        public static final C25972d f68681a = new C25972d();

        C25972d() {
            super(0);
        }

        /* renamed from: a */
        private static C20142i m85316a() {
            return C20142i.m66380a();
        }

        public final /* synthetic */ Object invoke() {
            return m85316a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.f$e */
    public static final class C25973e implements C25965c {

        /* renamed from: a */
        final /* synthetic */ C25968f f68682a;

        C25973e(C25968f fVar) {
            this.f68682a = fVar;
        }

        /* renamed from: b */
        public final boolean mo64225b(WebView webView, String str) {
            boolean z = false;
            for (C25965c b : this.f68682a.f68670c) {
                if (b.mo64225b(webView, str)) {
                    z = true;
                }
            }
            return z;
        }

        /* renamed from: a */
        public final void mo64223a(WebView webView, String str) {
            for (C25965c a : this.f68682a.f68670c) {
                a.mo64223a(webView, str);
            }
        }

        /* renamed from: a */
        public final void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            for (C25965c a : this.f68682a.f68670c) {
                a.mo64220a(webView, sslErrorHandler, sslError);
            }
        }

        /* renamed from: a */
        public final void mo64221a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            for (C25965c a : this.f68682a.f68670c) {
                a.mo64221a(webView, webResourceRequest, webResourceError);
            }
        }

        /* renamed from: a */
        public final void mo64222a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            for (C25965c a : this.f68682a.f68670c) {
                a.mo64222a(webView, webResourceRequest, webResourceResponse);
            }
        }

        /* renamed from: a */
        public final void mo64224a(WebView webView, String str, Bitmap bitmap) {
            for (C25965c a : this.f68682a.f68670c) {
                a.mo64224a(webView, str, bitmap);
            }
        }

        /* renamed from: a */
        public final void mo64219a(WebView webView, int i, String str, String str2) {
            for (C25965c a : this.f68682a.f68670c) {
                a.mo64219a(webView, i, str, str2);
            }
        }
    }

    /* renamed from: a */
    public final C20142i mo67421a() {
        return (C20142i) this.f68678l.getValue();
    }

    /* renamed from: a */
    public final void mo67422a(C25822g gVar) {
        C25884b bVar;
        this.f68674g = gVar;
        AwemeAppData a = C19936f.m65765a();
        C7573i.m23582a((Object) a, "BaseAppData.inst()");
        C20145l g = a.mo53441g();
        if (g != null) {
            C25822g gVar2 = this.f68674g;
            if (gVar2 != null) {
                C25862i crossPlatformBusiness = gVar2.getCrossPlatformBusiness();
                if (crossPlatformBusiness != null) {
                    AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.mo67230a(AdWebStatBusiness.class);
                    if (adWebStatBusiness != null) {
                        adWebStatBusiness.mo67170a(mo67421a(), g);
                    }
                }
            }
            List b = g.mo53918b();
            C25822g gVar3 = this.f68674g;
            if (gVar3 != null) {
                C25862i crossPlatformBusiness2 = gVar3.getCrossPlatformBusiness();
                if (crossPlatformBusiness2 != null) {
                    AdWebStatBusiness adWebStatBusiness2 = (AdWebStatBusiness) crossPlatformBusiness2.mo67230a(AdWebStatBusiness.class);
                    if (adWebStatBusiness2 != null) {
                        adWebStatBusiness2.mo67171a(b);
                    }
                }
            }
            C20140h hVar = this.f68676j;
            if (hVar != null) {
                hVar.mo53902a(b);
            }
        }
        PassBackWebInfoBusiness e = m85309e();
        if (e != null) {
            C25822g gVar4 = this.f68674g;
            if (gVar4 != null) {
                C25886b crossPlatformParams = gVar4.getCrossPlatformParams();
                if (crossPlatformParams != null) {
                    bVar = crossPlatformParams.f68474b;
                    e.mo67190a(bVar);
                }
            }
            bVar = null;
            e.mo67190a(bVar);
        }
    }

    /* renamed from: c */
    private static C19535g m85305c() {
        C19535g a = DownloaderManagerHolder.m75524a();
        C7573i.m23582a((Object) a, "DownloaderManagerHolder.getDownloader()");
        return a;
    }

    /* renamed from: d */
    private final C19235b m85307d() {
        C19235b b = m85305c().mo51671b();
        C7573i.m23582a((Object) b, "getDownloader().adWebViewDownloadManager");
        return b;
    }

    /* renamed from: e */
    private final PassBackWebInfoBusiness m85309e() {
        C25822g gVar = this.f68674g;
        if (gVar != null) {
            C25862i crossPlatformBusiness = gVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                return (PassBackWebInfoBusiness) crossPlatformBusiness.mo67230a(PassBackWebInfoBusiness.class);
            }
        }
        return null;
    }

    /* renamed from: f */
    private final PlayableBusiness m85310f() {
        C25822g gVar = this.f68674g;
        if (gVar != null) {
            C25862i crossPlatformBusiness = gVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                return (PlayableBusiness) crossPlatformBusiness.mo67230a(PlayableBusiness.class);
            }
        }
        return null;
    }

    /* renamed from: g */
    private final QuickShopBusiness m85311g() {
        C25822g gVar = this.f68674g;
        if (gVar != null) {
            C25862i crossPlatformBusiness = gVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                return (QuickShopBusiness) crossPlatformBusiness.mo67230a(QuickShopBusiness.class);
            }
        }
        return null;
    }

    public C25968f() {
        m85302b();
    }

    /* renamed from: b */
    private final void m85302b() {
        ServiceManager.get().getService(C43440c.class);
        AwemeAppData a = C19936f.m65765a();
        C7573i.m23582a((Object) a, "BaseAppData.inst()");
        C20145l g = a.mo53441g();
        if (g != null) {
            this.f68676j = new C20140h(g.mo53916a()).mo53900a((C10713b) C25970b.f68679a).mo53903a(C43447i.m137873d()).mo53902a(g.mo53918b()).mo53901a((C20141a) new C25971c(this));
        }
    }

    /* renamed from: c */
    private static void m85306c(String str) {
        Context a = C6399b.m19921a();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        a.startActivity(intent);
    }

    /* renamed from: a */
    private static String m85295a(String str) {
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence) || !C7634n.m23776c(charSequence, (CharSequence) "__back_url__", false)) {
            return str;
        }
        String encode = Uri.encode("snssdk1233://adx");
        C7573i.m23582a((Object) encode, "Uri.encode(AbsConstants.…Constants.AID + \"://adx\")");
        return C7634n.m23711a(str, "__back_url__", encode, false);
    }

    /* renamed from: b */
    private final boolean m85304b(String str) {
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        C7573i.m23582a((Object) parse, "uri");
        if (!TextUtils.equals(parse.getScheme(), "bytedance") || !TextUtils.equals(parse.getHost(), "adPageHtmlContent")) {
            return false;
        }
        PassBackWebInfoBusiness e = m85309e();
        if (e != null) {
            e.mo67188a(parse);
        }
        return true;
    }

    /* renamed from: d */
    private final void m85308d(String str) {
        C30391k kVar;
        if (str != null) {
            C25870d a = C25871a.m85133a();
            C30388i iVar = this.f68673f;
            if (iVar != null) {
                kVar = (C30391k) iVar.mo80008a(C30391k.class);
            } else {
                kVar = null;
            }
            Uri parse = Uri.parse(str);
            C7573i.m23582a((Object) parse, "Uri.parse(it)");
            C30402t tVar = new C30402t(parse, "intent_scheme_", null, null, 12, null);
            C25870d.m85112a(a, kVar, "webview_safe_log", "filter_scheme", tVar.getFormatData(), null, null, 48, null);
        }
    }

    /* renamed from: a */
    private final void m85296a(WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null && webResourceRequest.getUrl() != null && webResourceRequest.getRequestHeaders() != null) {
            PassBackWebInfoBusiness e = m85309e();
            if (e != null) {
                String uri = webResourceRequest.getUrl().toString();
                C7573i.m23582a((Object) uri, "request.url.toString()");
                Map requestHeaders = webResourceRequest.getRequestHeaders();
                C7573i.m23582a((Object) requestHeaders, "request.requestHeaders");
                e.mo67192a(uri, requestHeaders);
            }
        }
    }

    /* renamed from: a */
    private final boolean m85297a(Context context, String str) {
        return this.f68677k.mo53433a(context, str);
    }

    /* renamed from: b */
    private final boolean m85303b(WebView webView, String str) {
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        m85296a(webResourceRequest);
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r3, java.lang.String r4) {
        /*
            r2 = this;
            super.onPageFinished(r3, r4)
            if (r4 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.hybrid.monitor.i r0 = r2.f68673f
            if (r0 == 0) goto L_0x001a
            java.lang.Class<com.ss.android.ugc.aweme.hybrid.monitor.k> r1 = com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k.class
            com.ss.android.ugc.aweme.hybrid.monitor.q r0 = r0.mo80008a(r1)
            com.ss.android.ugc.aweme.hybrid.monitor.k r0 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k) r0
            if (r0 == 0) goto L_0x001a
            android.net.Uri r1 = com.p280ss.android.ugc.aweme.hybrid.monitor.C30373ac.m99256a(r4)
            r0.mo79999b(r1)
        L_0x001a:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r2.f68675i
            r0.mo64223a(r3, r4)
            com.ss.android.ugc.aweme.crossplatform.activity.g r0 = r2.f68674g
            if (r0 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.crossplatform.business.i r0 = r0.getCrossPlatformBusiness()
            if (r0 == 0) goto L_0x0036
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness> r1 = com.p280ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness.class
            com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business r0 = r0.mo67230a(r1)
            com.ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness r0 = (com.p280ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness) r0
            if (r0 == 0) goto L_0x0036
            r0.mo67179b(r4)
        L_0x0036:
            com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness r0 = r2.m85310f()
            if (r0 == 0) goto L_0x0041
            com.bytedance.ies.web.a.a r1 = r2.f30167b
            r0.mo67201a(r3, r4, r1)
        L_0x0041:
            com.ss.android.ugc.aweme.crossplatform.activity.g r0 = r2.f68674g
            if (r0 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.crossplatform.params.base.b r0 = r0.getCrossPlatformParams()
            if (r0 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.crossplatform.params.a r0 = r0.f68473a
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = r0.f68440m
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            com.ss.android.ugc.aweme.crossplatform.business.QuickShopBusiness r1 = r2.m85311g()
            if (r1 == 0) goto L_0x005c
            r1.mo67213a(r3, r4, r0)
        L_0x005c:
            com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness r4 = r2.m85309e()
            if (r4 == 0) goto L_0x0066
            r4.mo67189a(r3)
            return
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25968f.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        LarkSsoHelper.m105776a(str);
        C30388i iVar = this.f68673f;
        if (iVar != null) {
            C30391k kVar = (C30391k) iVar.mo80008a(C30391k.class);
            if (kVar != null) {
                kVar.mo80003c(str);
            }
        }
        C20140h hVar = this.f68676j;
        if (hVar != null) {
            WebResourceResponse a = hVar.mo53899a(webView, str);
            if (a != null) {
                C30388i iVar2 = this.f68673f;
                if (iVar2 != null) {
                    C30391k kVar2 = (C30391k) iVar2.mo80008a(C30391k.class);
                    if (kVar2 != null) {
                        kVar2.mo80005d(str);
                    }
                }
                return a;
            }
        }
        new StringBuilder("originall:").append(str);
        C25977i iVar3 = this.f68672e;
        if (iVar3 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            WebResourceResponse a2 = iVar3.mo67428a(sb.toString());
            if (a2 != null) {
                new StringBuilder("return:").append(str);
                C30388i iVar4 = this.f68673f;
                if (iVar4 != null) {
                    C30391k kVar3 = (C30391k) iVar4.mo80008a(C30391k.class);
                    if (kVar3 != null) {
                        kVar3.mo80006e(str);
                    }
                }
                return a2;
            }
        }
        C30388i iVar5 = this.f68673f;
        if (iVar5 != null) {
            C30391k kVar4 = (C30391k) iVar5.mo80008a(C30391k.class);
            if (kVar4 != null) {
                kVar4.mo80007f(str);
            }
        }
        C30388i iVar6 = this.f68673f;
        if (iVar6 != null) {
            C30391k kVar5 = (C30391k) iVar6.mo80008a(C30391k.class);
            if (kVar5 != null) {
                kVar5.mo79994a(str);
            }
        }
        new StringBuilder("no intercept:").append(str);
        return super.shouldInterceptRequest(webView, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            kotlin.jvm.a.m<? super android.webkit.WebView, ? super java.lang.String, java.lang.Boolean> r0 = r5.f68671d
            r1 = 1
            if (r0 == 0) goto L_0x0028
            boolean r0 = r5.m85303b(r6, r7)
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            kotlin.jvm.a.m<? super android.webkit.WebView, ? super java.lang.String, java.lang.Boolean> r0 = r5.f68671d
            if (r0 != 0) goto L_0x001d
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x001d:
            java.lang.Object r6 = r0.invoke(r6, r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x0028:
            com.ss.android.ugc.aweme.crossplatform.activity.g r0 = r5.f68674g
            r2 = 0
            if (r0 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.crossplatform.params.base.b r0 = r0.getCrossPlatformParams()
            if (r0 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.crossplatform.params.b r0 = r0.f68474b
            if (r0 == 0) goto L_0x003d
            boolean r0 = r0.f68468w
            if (r0 != r1) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = com.p280ss.android.newmedia.eplatform.C19932a.m65762a(r6, r7, r0)
            java.lang.String r3 = "BlockPolicy.ePlatformFil…terceptEPlatform == true)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0052
            return r1
        L_0x0052:
            com.ss.android.ugc.aweme.crossplatform.activity.g r0 = r5.f68674g
            if (r0 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.crossplatform.params.base.b r0 = r0.getCrossPlatformParams()
            if (r0 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.crossplatform.params.b r0 = r0.f68474b
            if (r0 == 0) goto L_0x0072
            boolean r0 = r0.f68445E
            if (r0 != r1) goto L_0x0072
            java.lang.String r0 = ".apk"
            r3 = 2
            r4 = 0
            boolean r0 = kotlin.text.C7634n.m23723c(r7, r0, false)
            if (r0 == 0) goto L_0x0072
            m85306c(r7)
            return r1
        L_0x0072:
            java.lang.String r0 = m85295a(r7)
            boolean r6 = r5.m85299a(r6, r0)
            if (r6 != 0) goto L_0x008d
            com.ss.android.ugc.aweme.hybrid.monitor.i r0 = r5.f68673f
            if (r0 == 0) goto L_0x008d
            java.lang.Class<com.ss.android.ugc.aweme.hybrid.monitor.k> r1 = com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k.class
            com.ss.android.ugc.aweme.hybrid.monitor.q r0 = r0.mo80008a(r1)
            com.ss.android.ugc.aweme.hybrid.monitor.k r0 = (com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k) r0
            if (r0 == 0) goto L_0x008d
            r0.mo80001b(r7)
        L_0x008d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25968f.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x01e7 A[Catch:{ Exception -> 0x022c }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01e8 A[Catch:{ Exception -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x022b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x022c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b0 A[Catch:{ Exception -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b5 A[Catch:{ Exception -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bc A[Catch:{ Exception -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d0 A[ADDED_TO_REGION, Catch:{ Exception -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0122 A[Catch:{ Exception -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0146 A[Catch:{ Exception -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0147 A[Catch:{ Exception -> 0x022c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m85299a(android.webkit.WebView r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "commerce_jump"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "filterUrl = "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.p280ss.android.agilelogger.ALog.m20862b(r0, r1)
            android.content.Context r0 = r19.getContext()
            java.lang.String r1 = "webView.context"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r8.m85297a(r0, r10)
            r11 = 1
            if (r0 == 0) goto L_0x002a
            return r11
        L_0x002a:
            boolean r0 = r18.m85303b(r19, r20)
            if (r0 == 0) goto L_0x0031
            return r11
        L_0x0031:
            android.content.Context r0 = r19.getContext()
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83491g(r0, r10)
            if (r0 == 0) goto L_0x003c
            return r11
        L_0x003c:
            boolean r0 = r8.m85304b(r10)
            if (r0 == 0) goto L_0x0043
            return r11
        L_0x0043:
            r12 = 0
            android.net.Uri r6 = android.net.Uri.parse(r20)     // Catch:{ Exception -> 0x022c }
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.C7573i.m23582a(r6, r0)     // Catch:{ Exception -> 0x022c }
            java.lang.String r0 = r6.getScheme()     // Catch:{ Exception -> 0x022c }
            r13 = 0
            if (r0 == 0) goto L_0x0072
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x022c }
            java.lang.String r2 = "Locale.getDefault()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch:{ Exception -> 0x022c }
            java.lang.String r1 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ Exception -> 0x022c }
            r7 = r0
            goto L_0x0073
        L_0x006a:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x022c }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)     // Catch:{ Exception -> 0x022c }
            throw r0     // Catch:{ Exception -> 0x022c }
        L_0x0072:
            r7 = r13
        L_0x0073:
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x022c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x007d
            return r12
        L_0x007d:
            java.lang.String r0 = "about"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r7)     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x0086
            return r12
        L_0x0086:
            com.ss.android.sdk.activity.model.AdLandingPageConfig r14 = com.p280ss.android.ugc.aweme.commercialize.utils.C25368l.m83415a()     // Catch:{ Exception -> 0x022c }
            boolean r0 = r9 instanceof com.p280ss.android.ugc.aweme.crossplatform.platform.webview.TryCatchWebView     // Catch:{ Exception -> 0x022c }
            if (r0 != 0) goto L_0x0090
            r0 = r13
            goto L_0x0091
        L_0x0090:
            r0 = r9
        L_0x0091:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.TryCatchWebView r0 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.TryCatchWebView) r0     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x009b
            boolean r0 = r0.hasClickInTimeInterval()     // Catch:{ Exception -> 0x022c }
            r15 = r0
            goto L_0x009c
        L_0x009b:
            r15 = 1
        L_0x009c:
            com.ss.android.ugc.aweme.crossplatform.activity.g r0 = r8.f68674g     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.crossplatform.params.base.b r0 = r0.getCrossPlatformParams()     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.crossplatform.params.b r0 = r0.f68474b     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r0.f68460o     // Catch:{ Exception -> 0x022c }
            goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            if (r14 == 0) goto L_0x00b5
            java.util.List r1 = r14.getClickJumpAllowList()     // Catch:{ Exception -> 0x022c }
            goto L_0x00b6
        L_0x00b5:
            r1 = r13
        L_0x00b6:
            boolean r1 = com.p280ss.android.newmedia.C19944k.m65785a(r10, r7, r1)     // Catch:{ Exception -> 0x022c }
            if (r1 != 0) goto L_0x00cd
            if (r14 == 0) goto L_0x00c3
            java.util.List r1 = r14.getAutoJumpAllowList()     // Catch:{ Exception -> 0x022c }
            goto L_0x00c4
        L_0x00c3:
            r1 = r13
        L_0x00c4:
            boolean r1 = com.p280ss.android.newmedia.C19944k.m65785a(r10, r7, r1)     // Catch:{ Exception -> 0x022c }
            if (r1 == 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r5 = 0
            goto L_0x00ce
        L_0x00cd:
            r5 = 1
        L_0x00ce:
            if (r14 == 0) goto L_0x00dc
            if (r0 == 0) goto L_0x00dc
            boolean r1 = r14.isJumpControlEnabled()     // Catch:{ Exception -> 0x022c }
            if (r1 == 0) goto L_0x00dc
            if (r5 != 0) goto L_0x00dc
            if (r15 == 0) goto L_0x00e4
        L_0x00dc:
            if (r14 != 0) goto L_0x00e6
            if (r0 == 0) goto L_0x00e6
            if (r5 != 0) goto L_0x00e6
            if (r15 != 0) goto L_0x00e6
        L_0x00e4:
            r4 = 1
            goto L_0x00e7
        L_0x00e6:
            r4 = 0
        L_0x00e7:
            java.lang.String r1 = "commerce_jump"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022c }
            java.lang.String r3 = "【filterUrl】 = "
            r2.<init>(r3)     // Catch:{ Exception -> 0x022c }
            r2.append(r10)     // Catch:{ Exception -> 0x022c }
            java.lang.String r3 = " 【forbidJump】= "
            r2.append(r3)     // Catch:{ Exception -> 0x022c }
            r2.append(r0)     // Catch:{ Exception -> 0x022c }
            java.lang.String r0 = " 【inWhiteList】= "
            r2.append(r0)     // Catch:{ Exception -> 0x022c }
            r2.append(r5)     // Catch:{ Exception -> 0x022c }
            java.lang.String r0 = " 【blockJump】= "
            r2.append(r0)     // Catch:{ Exception -> 0x022c }
            r2.append(r4)     // Catch:{ Exception -> 0x022c }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x022c }
            com.p280ss.android.agilelogger.ALog.m20862b(r1, r0)     // Catch:{ Exception -> 0x022c }
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Exception -> 0x022c }
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r1 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r0.getService(r1)     // Catch:{ Exception -> 0x022c }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0     // Catch:{ Exception -> 0x022c }
            com.ss.android.ugc.aweme.crossplatform.activity.g r1 = r8.f68674g     // Catch:{ Exception -> 0x022c }
            if (r1 == 0) goto L_0x0133
            com.ss.android.ugc.aweme.crossplatform.params.base.b r1 = r1.getCrossPlatformParams()     // Catch:{ Exception -> 0x022c }
            if (r1 == 0) goto L_0x0133
            com.ss.android.ugc.aweme.crossplatform.params.b r1 = r1.f68474b     // Catch:{ Exception -> 0x022c }
            if (r1 == 0) goto L_0x0133
            long r1 = r1.f68446a     // Catch:{ Exception -> 0x022c }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x022c }
            goto L_0x0134
        L_0x0133:
            r1 = r13
        L_0x0134:
            com.ss.android.ugc.aweme.feed.model.Aweme r16 = r0.getRawAdAwemeByAdId(r1)     // Catch:{ Exception -> 0x022c }
            if (r4 == 0) goto L_0x014a
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83156e(r16)     // Catch:{ Exception -> 0x022c }
            if (r0 != 0) goto L_0x014a
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83157f(r16)     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x0147
            goto L_0x014a
        L_0x0147:
            r17 = r4
            goto L_0x017f
        L_0x014a:
            if (r7 != 0) goto L_0x014f
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x022c }
        L_0x014f:
            android.content.Context r2 = r19.getContext()     // Catch:{ Exception -> 0x022c }
            java.lang.String r0 = "webView.context"
            kotlin.jvm.internal.C7573i.m23582a(r2, r0)     // Catch:{ Exception -> 0x022c }
            r0 = r6
            r1 = r7
            r3 = r20
            r17 = r4
            r4 = r16
            boolean r0 = m85298a(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = "commerce_jump"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022c }
            java.lang.String r2 = "【filterUrl】 = "
            r1.<init>(r2)     // Catch:{ Exception -> 0x022c }
            r1.append(r10)     // Catch:{ Exception -> 0x022c }
            java.lang.String r2 = " 【handleOpenVastApp】= true"
            r1.append(r2)     // Catch:{ Exception -> 0x022c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022c }
            com.p280ss.android.agilelogger.ALog.m20862b(r0, r1)     // Catch:{ Exception -> 0x022c }
            return r11
        L_0x017f:
            java.lang.String r0 = "http"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r7)     // Catch:{ Exception -> 0x022c }
            r0 = r0 ^ r11
            if (r0 == 0) goto L_0x0223
            java.lang.String r0 = "https"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r7)     // Catch:{ Exception -> 0x022c }
            r0 = r0 ^ r11
            if (r0 == 0) goto L_0x0223
            boolean r0 = m85301a(r7, r15, r10, r9)     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x0198
            return r11
        L_0x0198:
            if (r17 == 0) goto L_0x019e
            com.p280ss.android.ugc.aweme.crossplatform.platform.C25899a.m85177a(r10, r15)     // Catch:{ Exception -> 0x022c }
            return r11
        L_0x019e:
            if (r14 == 0) goto L_0x01a6
            boolean r0 = r14.isClickControlEnabled()     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x01ba
        L_0x01a6:
            if (r15 != 0) goto L_0x01ba
            if (r10 != 0) goto L_0x01ad
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x022c }
        L_0x01ad:
            java.lang.String r0 = ".apk"
            r1 = 2
            boolean r0 = kotlin.text.C7634n.m23723c(r10, r0, false)     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x01ba
            com.p280ss.android.ugc.aweme.crossplatform.platform.C25899a.m85178b(r10, r15)     // Catch:{ Exception -> 0x022c }
            return r11
        L_0x01ba:
            com.p280ss.android.ugc.aweme.crossplatform.platform.C25899a.m85179c(r10, r15)     // Catch:{ Exception -> 0x022c }
            java.lang.String r0 = "sslocal"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r7)     // Catch:{ Exception -> 0x022c }
            if (r0 != 0) goto L_0x01d0
            java.lang.String r0 = "localsdk"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r7)     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x01ce
            goto L_0x01d0
        L_0x01ce:
            r14 = r10
            goto L_0x01d5
        L_0x01d0:
            java.lang.String r0 = com.p280ss.android.newmedia.p892b.C19926a.m65747a(r20)     // Catch:{ Exception -> 0x022c }
            r14 = r0
        L_0x01d5:
            r0 = r18
            r1 = r16
            r2 = r20
            r3 = r6
            r4 = r7
            r5 = r15
            r6 = r14
            r7 = r19
            boolean r0 = r0.m85300a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x01e8
            return r11
        L_0x01e8:
            android.content.Context r0 = r19.getContext()     // Catch:{ Exception -> 0x022c }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x022c }
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r3 = android.net.Uri.parse(r14)     // Catch:{ Exception -> 0x022c }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x022c }
            boolean r0 = com.p280ss.android.common.util.C6776h.m20944a(r0, r1)     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x0203
            com.p280ss.android.ugc.aweme.commercialize.utils.C25252aw.m83007b()     // Catch:{ Exception -> 0x022c }
            com.p280ss.android.ugc.aweme.commercialize.utils.C25252aw.m83004a()     // Catch:{ Exception -> 0x022c }
        L_0x0203:
            android.content.Context r0 = r19.getContext()     // Catch:{ Exception -> 0x020a }
            com.p280ss.android.newmedia.p892b.C19926a.m65748a(r0, r14, r13)     // Catch:{ Exception -> 0x020a }
        L_0x020a:
            java.lang.String r0 = "commerce_jump"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022c }
            java.lang.String r2 = "【filterUrl】 = "
            r1.<init>(r2)     // Catch:{ Exception -> 0x022c }
            r1.append(r10)     // Catch:{ Exception -> 0x022c }
            java.lang.String r2 = " 【open scheme final】"
            r1.append(r2)     // Catch:{ Exception -> 0x022c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x022c }
            com.p280ss.android.agilelogger.ALog.m20862b(r0, r1)     // Catch:{ Exception -> 0x022c }
            return r11
        L_0x0223:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r8.f68675i     // Catch:{ Exception -> 0x022c }
            boolean r0 = r0.mo64225b(r9, r10)     // Catch:{ Exception -> 0x022c }
            if (r0 == 0) goto L_0x022c
            return r11
        L_0x022c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25968f.m85299a(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C30388i iVar = this.f68673f;
        if (iVar != null) {
            C30391k kVar = (C30391k) iVar.mo80008a(C30391k.class);
            if (kVar != null) {
                kVar.mo79991a(webResourceRequest, webResourceResponse);
            }
        }
        this.f68675i.mo64222a(webView, webResourceRequest, webResourceResponse);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C30388i iVar = this.f68673f;
        if (iVar != null) {
            C30391k kVar = (C30391k) iVar.mo80008a(C30391k.class);
            if (kVar != null) {
                kVar.mo79988a(sslError);
            }
        }
        this.f68675i.mo64220a(webView, sslErrorHandler, sslError);
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C30388i iVar = this.f68673f;
        if (iVar != null) {
            C30391k kVar = (C30391k) iVar.mo80008a(C30391k.class);
            if (kVar != null) {
                kVar.mo79990a(webResourceRequest, webResourceError);
            }
        }
        this.f68675i.mo64221a(webView, webResourceRequest, webResourceError);
        C25822g gVar = this.f68674g;
        if (gVar != null) {
            C25862i crossPlatformBusiness = gVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                DouPlusMonitorBusiness douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.mo67230a(DouPlusMonitorBusiness.class);
                if (douPlusMonitorBusiness != null) {
                    douPlusMonitorBusiness.mo67177a(webResourceRequest, webResourceError);
                }
            }
        }
        QuickShopBusiness g = m85311g();
        if (g != null) {
            g.mo67212a(webResourceError);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C25862i iVar;
        super.onPageStarted(webView, str, bitmap);
        if (str != null) {
            C30388i iVar2 = this.f68673f;
            if (iVar2 != null) {
                C30391k kVar = (C30391k) iVar2.mo80008a(C30391k.class);
                if (kVar != null) {
                    kVar.mo79987a(C30373ac.m99256a(str));
                }
            }
        }
        this.f68675i.mo64224a(webView, str, bitmap);
        C25822g gVar = this.f68674g;
        if (gVar != null) {
            C25862i crossPlatformBusiness = gVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                DouPlusMonitorBusiness douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.mo67230a(DouPlusMonitorBusiness.class);
                if (douPlusMonitorBusiness != null) {
                    douPlusMonitorBusiness.mo67178a(str);
                }
            }
        }
        C25822g gVar2 = this.f68674g;
        C25886b bVar = null;
        if (gVar2 != null) {
            iVar = gVar2.getCrossPlatformBusiness();
        } else {
            iVar = null;
        }
        C25822g gVar3 = this.f68674g;
        if (gVar3 != null) {
            bVar = gVar3.getCrossPlatformParams();
        }
        PreRenderWebViewBusiness a = C25851a.m85059a(iVar, bVar);
        if (a != null) {
            C11087a aVar = this.f30167b;
            C7573i.m23582a((Object) aVar, "jsBridge");
            a.mo67206a(webView, str, aVar);
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (VERSION.SDK_INT < 23) {
            C30388i iVar = this.f68673f;
            if (iVar != null) {
                C30391k kVar = (C30391k) iVar.mo80008a(C30391k.class);
                if (kVar != null) {
                    kVar.mo79986a(i, str2);
                }
            }
        }
        this.f68675i.mo64219a(webView, i, str, str2);
        C25822g gVar = this.f68674g;
        if (gVar != null) {
            C25862i crossPlatformBusiness = gVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                DouPlusMonitorBusiness douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.mo67230a(DouPlusMonitorBusiness.class);
                if (douPlusMonitorBusiness != null) {
                    douPlusMonitorBusiness.mo67176a(i, str2);
                }
            }
        }
        QuickShopBusiness g = m85311g();
        if (g != null) {
            g.mo67211a(i, str, str2);
        }
    }

    /* renamed from: a */
    private static boolean m85301a(String str, boolean z, String str2, WebView webView) {
        Intent intent;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !C7573i.m23585a((Object) "intent", (Object) str) || z) {
            return false;
        }
        String str3 = null;
        try {
            intent = Intent.parseUri(str2, 1);
        } catch (URISyntaxException unused) {
            intent = null;
        }
        if (intent != null) {
            str3 = intent.getStringExtra("browser_fallback_url");
        }
        if (str3 == null) {
            return false;
        }
        C25974g.m85324a(webView, str3);
        return true;
    }

    /* renamed from: a */
    private static boolean m85298a(Uri uri, String str, Context context, String str2, Aweme aweme, boolean z) {
        if (!C6399b.m19944t()) {
            return false;
        }
        if (C7573i.m23585a((Object) uri.getScheme(), (Object) "market")) {
            if (!C25337b.m83261a(context)) {
                C25330a.m83246a(context, aweme, str2);
            } else if (C25337b.m83262a(context, uri)) {
                C25330a.m83248b(context, aweme, str2);
            }
            return true;
        } else if (C25337b.m83265a(uri)) {
            if (!C25337b.m83261a(context)) {
                return false;
            }
            if (C25337b.m83266b(context, uri)) {
                C25330a.m83248b(context, aweme, str2);
            }
            return true;
        } else if (C25371n.m83464a(uri)) {
            if ((!C25301by.m83156e(aweme) && !C25301by.m83157f(aweme)) || !C25330a.m83251c(context, uri)) {
                return false;
            }
            if (!z) {
                C25330a.m83250c(context, aweme, str2);
                return false;
            }
            if (C25330a.m83247a(context, uri)) {
                C25330a.m83248b(context, aweme, str2);
            }
            return true;
        } else if (!C25301by.m83156e(aweme) && !C25301by.m83157f(aweme)) {
            return false;
        } else {
            if (!C25330a.m83252d(context, uri)) {
                if ((!C7573i.m23585a((Object) C22909c.f60637a, (Object) str)) && (!C7573i.m23585a((Object) C22909c.f60639c, (Object) str))) {
                    C25330a.m83246a(context, aweme, str2);
                }
                return false;
            } else if (!z) {
                C25330a.m83250c(context, aweme, str2);
                return false;
            } else {
                if (C25330a.m83249b(context, uri)) {
                    C25330a.m83248b(context, aweme, str2);
                }
                return true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r7 == null) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0100  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m85300a(com.p280ss.android.ugc.aweme.feed.model.Aweme r17, java.lang.String r18, android.net.Uri r19, java.lang.String r20, boolean r21, java.lang.String r22, android.webkit.WebView r23) {
        /*
            r16 = this;
            r0 = r16
            r8 = r18
            r10 = r19
            r1 = r20
            r2 = r22
            r3 = r8
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 0
            if (r3 != 0) goto L_0x01d3
            if (r10 == 0) goto L_0x01d3
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x01d3
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x002a
            goto L_0x01d3
        L_0x002a:
            com.ss.android.ugc.aweme.crossplatform.activity.g r3 = r0.f68674g
            r9 = 0
            if (r3 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.crossplatform.params.base.b r3 = r3.getCrossPlatformParams()
            if (r3 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.crossplatform.params.b r3 = r3.f68474b
            r11 = r3
            goto L_0x003a
        L_0x0039:
            r11 = r9
        L_0x003a:
            com.ss.android.ugc.aweme.crossplatform.activity.g r3 = r0.f68674g
            if (r3 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.crossplatform.params.base.b r3 = r3.getCrossPlatformParams()
            if (r3 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.crossplatform.params.a r3 = r3.f68473a
            goto L_0x0048
        L_0x0047:
            r3 = r9
        L_0x0048:
            r5 = 0
            if (r11 == 0) goto L_0x004f
            long r12 = r11.f68446a
            goto L_0x0050
        L_0x004f:
            r12 = r5
        L_0x0050:
            if (r17 == 0) goto L_0x0068
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r17.getAwemeRawAd()
            if (r7 == 0) goto L_0x0068
            java.lang.Long r7 = r7.getGroupId()
            if (r7 == 0) goto L_0x0068
            long r14 = r7.longValue()
            java.lang.String r7 = java.lang.String.valueOf(r14)
            if (r7 != 0) goto L_0x006a
        L_0x0068:
            java.lang.String r7 = ""
        L_0x006a:
            r14 = r7
            java.lang.String r7 = "market"
            boolean r7 = kotlin.jvm.internal.C7573i.m23585a(r7, r1)
            r15 = 1
            if (r7 == 0) goto L_0x0100
            java.lang.String r1 = "commerce_jump"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "【filterUrl】 = "
            r4.<init>(r7)
            r4.append(r8)
            java.lang.String r7 = " 【market】 special handle"
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.p280ss.android.agilelogger.ALog.m20862b(r1, r4)
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19945u()
            if (r1 == 0) goto L_0x00e6
            int r1 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e6
            android.content.Context r1 = r23.getContext()
            if (r11 == 0) goto L_0x00a0
            java.lang.String r2 = r11.f68454i
            r4 = r2
            goto L_0x00a1
        L_0x00a0:
            r4 = r9
        L_0x00a1:
            r6 = 0
            if (r3 == 0) goto L_0x00a8
            java.lang.String r2 = r3.f68430c
            r7 = r2
            goto L_0x00a9
        L_0x00a8:
            r7 = r9
        L_0x00a9:
            r2 = r12
            r5 = r18
            org.json.JSONObject r12 = com.p280ss.android.sdk.activity.C20102a.m66290a(r1, r2, r4, r5, r6, r7)
            if (r11 == 0) goto L_0x00b5
            java.lang.String r1 = r11.f68458m
            goto L_0x00b6
        L_0x00b5:
            r1 = r9
        L_0x00b6:
            if (r11 == 0) goto L_0x00bc
            java.lang.String r2 = r11.f68454i
            r3 = r2
            goto L_0x00bd
        L_0x00bc:
            r3 = r9
        L_0x00bd:
            if (r11 == 0) goto L_0x00c3
            java.lang.String r2 = r11.f68451f
            r4 = r2
            goto L_0x00c4
        L_0x00c3:
            r4 = r9
        L_0x00c4:
            r6 = 0
            r7 = 0
            if (r11 == 0) goto L_0x00cb
            java.lang.String r2 = r11.f68464s
            r9 = r2
        L_0x00cb:
            r2 = r14
            r5 = r18
            r8 = r12
            com.ss.android.c.a.a.c r1 = com.p280ss.android.sdk.activity.model.C20107a.m66301a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = "WebAppAd.createDownloadM…ommerceInfo?.quickAppUrl)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.c.a.b r2 = r16.m85307d()
            android.content.Context r3 = r23.getContext()
            com.ss.android.download.api.b.c r1 = (com.p280ss.android.download.api.p858b.C19387c) r1
            r2.mo51038a(r3, r10, r1)
            goto L_0x00ff
        L_0x00e6:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            r1.<init>(r3)
            r1.setData(r10)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r3)
            r0.m85308d(r2)
            android.content.Context r2 = r23.getContext()
            r2.startActivity(r1)
        L_0x00ff:
            return r15
        L_0x0100:
            java.lang.String r3 = "intent"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r3, r1)
            if (r1 == 0) goto L_0x01d2
            if (r21 == 0) goto L_0x01d2
            java.lang.String r1 = "commerce_jump"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "【filterUrl】 = "
            r3.<init>(r5)
            r3.append(r8)
            java.lang.String r5 = " 【intent】 special handle"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.p280ss.android.agilelogger.ALog.m20862b(r1, r3)
            android.content.Intent r1 = android.content.Intent.parseUri(r2, r15)     // Catch:{ URISyntaxException -> 0x0127 }
            goto L_0x0128
        L_0x0127:
            r1 = r9
        L_0x0128:
            android.content.Context r3 = r23.getContext()
            android.app.Activity r3 = com.p280ss.android.ugc.aweme.base.utils.C23487o.m77130a(r3)
            if (r3 == 0) goto L_0x0137
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            goto L_0x0138
        L_0x0137:
            r3 = r9
        L_0x0138:
            if (r3 == 0) goto L_0x0154
            if (r1 == 0) goto L_0x0141
            android.content.ComponentName r5 = r1.resolveActivity(r3)
            goto L_0x0142
        L_0x0141:
            r5 = r9
        L_0x0142:
            if (r5 == 0) goto L_0x0154
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r5)
            r0.m85308d(r2)
            android.content.Context r2 = r23.getContext()
            r2.startActivity(r1)
            return r15
        L_0x0154:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r5.<init>(r6)
            boolean r6 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r6 == 0) goto L_0x019e
            if (r1 == 0) goto L_0x019e
            android.content.Context r6 = r23.getContext()
            boolean r6 = com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25337b.m83261a(r6)
            if (r6 == 0) goto L_0x019e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "market://details?id="
            r6.<init>(r7)
            java.lang.String r7 = r1.getPackage()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r5.setData(r6)
            if (r3 == 0) goto L_0x019e
            android.content.ComponentName r3 = r5.resolveActivity(r3)
            if (r3 == 0) goto L_0x019e
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r3)
            r0.m85308d(r2)
            android.content.Context r1 = r23.getContext()
            r1.startActivity(r5)
            return r15
        L_0x019e:
            if (r1 == 0) goto L_0x01a7
            java.lang.String r2 = "browser_fallback_url"
            java.lang.String r2 = r1.getStringExtra(r2)
            goto L_0x01a8
        L_0x01a7:
            r2 = r9
        L_0x01a8:
            if (r2 == 0) goto L_0x01b0
            r3 = r23
            com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25974g.m85324a(r3, r2)
            return r15
        L_0x01b0:
            r3 = r23
            boolean r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r2 == 0) goto L_0x01d1
            android.content.Context r2 = r23.getContext()
            boolean r2 = com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.C25337b.m83261a(r2)
            if (r2 != 0) goto L_0x01d1
            android.content.Context r2 = r23.getContext()
            if (r1 == 0) goto L_0x01cc
            java.lang.String r9 = r1.getPackage()
        L_0x01cc:
            boolean r1 = com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a.C25335c.m83259a(r2, r9)
            return r1
        L_0x01d1:
            return r4
        L_0x01d2:
            return r4
        L_0x01d3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25968f.m85300a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, android.net.Uri, java.lang.String, boolean, java.lang.String, android.webkit.WebView):boolean");
    }
}
