package com.p280ss.android.ugc.aweme.commercialize;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.model.EasterEggInfo;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25174a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26025c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2 */
public final class EasterEggActivityV2 extends AmeSSActivity implements OnClickListener {

    /* renamed from: d */
    public static final C24492a f64628d = new C24492a(null);

    /* renamed from: a */
    public long f64629a;

    /* renamed from: b */
    public boolean f64630b;

    /* renamed from: c */
    public boolean f64631c;

    /* renamed from: e */
    private FrameLayout f64632e;

    /* renamed from: f */
    private CrossPlatformWebView f64633f;

    /* renamed from: g */
    private AnimatedImageView f64634g;

    /* renamed from: h */
    private ImageView f64635h;

    /* renamed from: i */
    private EasterEggPageParams f64636i;

    /* renamed from: j */
    private C25965c f64637j;

    /* renamed from: k */
    private C25174a f64638k;

    /* renamed from: l */
    private final Runnable f64639l = new C24493b(this);

    /* renamed from: m */
    private final Runnable f64640m = new C24496e(this);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$a */
    public static final class C24492a {
        private C24492a() {
        }

        public /* synthetic */ C24492a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m80467a(Context context, EasterEggPageParams easterEggPageParams) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(easterEggPageParams, "pageParams");
            Intent intent = new Intent(context, EasterEggActivityV2.class);
            intent.putExtra("pageParams", easterEggPageParams);
            context.startActivity(intent);
        }

        /* renamed from: a */
        public static void m80466a(Activity activity, EasterEggPageParams easterEggPageParams, int i) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(easterEggPageParams, "pageParams");
            Intent intent = new Intent(activity, EasterEggActivityV2.class);
            intent.putExtra("pageParams", easterEggPageParams);
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$b */
    static final class C24493b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV2 f64641a;

        C24493b(EasterEggActivityV2 easterEggActivityV2) {
            this.f64641a = easterEggActivityV2;
        }

        public final void run() {
            if (!this.f64641a.isFinishing()) {
                Map c = this.f64641a.mo64215c();
                c.put("disappear_method", "auto_disappear");
                c.put("duration", String.valueOf(System.currentTimeMillis() - this.f64641a.f64629a));
                C6907h.m21524a("egg_ad_disappear", c);
                this.f64641a.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$c */
    public static final class C24494c implements C25965c {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV2 f64642a;

        /* renamed from: a */
        public final void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        /* renamed from: a */
        public final void mo64222a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        /* renamed from: a */
        public final void mo64224a(WebView webView, String str, Bitmap bitmap) {
        }

        /* renamed from: b */
        public final boolean mo64225b(WebView webView, String str) {
            return false;
        }

        C24494c(EasterEggActivityV2 easterEggActivityV2) {
            this.f64642a = easterEggActivityV2;
        }

        /* renamed from: a */
        public final void mo64223a(WebView webView, String str) {
            if (!this.f64642a.f64630b && !this.f64642a.f64631c) {
                this.f64642a.f64630b = true;
                this.f64642a.mo64212a();
            }
        }

        /* renamed from: a */
        public final void mo64221a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f64642a.mo64214b();
        }

        /* renamed from: a */
        public final void mo64219a(WebView webView, int i, String str, String str2) {
            this.f64642a.mo64214b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$d */
    public static final class C24495d extends C25174a {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV2 f64643a;

        public final void onFailure(String str, Throwable th) {
            C7573i.m23587b(str, "id");
            C7573i.m23587b(th, "throwable");
            super.onFailure(str, th);
            this.f64643a.mo64214b();
        }

        C24495d(EasterEggActivityV2 easterEggActivityV2, boolean z, RemoteImageView remoteImageView) {
            this.f64643a = easterEggActivityV2;
            super(true, remoteImageView);
        }

        /* renamed from: a */
        public final void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            C7573i.m23587b(str, "id");
            super.onFinalImageSet(str, fVar, animatable);
            if (!this.f64643a.f64630b && !this.f64643a.f64631c) {
                this.f64643a.f64630b = true;
                this.f64643a.mo64212a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$e */
    static final class C24496e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV2 f64644a;

        C24496e(EasterEggActivityV2 easterEggActivityV2) {
            this.f64644a = easterEggActivityV2;
        }

        public final void run() {
            if (!this.f64644a.isFinishing() && !this.f64644a.f64630b) {
                this.f64644a.mo64213a("overtime");
                this.f64644a.finish();
            }
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final void mo64214b() {
        mo64213a("load_fail");
        finish();
    }

    public final void finish() {
        setResult(1002);
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FrameLayout frameLayout = this.f64632e;
        if (frameLayout == null) {
            C7573i.m23583a("mRootView");
        }
        frameLayout.removeCallbacks(this.f64639l);
        FrameLayout frameLayout2 = this.f64632e;
        if (frameLayout2 == null) {
            C7573i.m23583a("mRootView");
        }
        frameLayout2.removeCallbacks(this.f64640m);
    }

    /* renamed from: a */
    public final void mo64212a() {
        C6907h.m21524a("show_egg_ad", (Map) mo64215c());
        FrameLayout frameLayout = this.f64632e;
        if (frameLayout == null) {
            C7573i.m23583a("mRootView");
        }
        frameLayout.postDelayed(this.f64639l, 7000);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        finish();
        C6907h.onEvent(MobClick.obtain().setEventName("result_ad").setLabelName("close").setJsonObject(C6869c.m21381a().mo16887a("refer", "egg").mo16888b()));
    }

    /* renamed from: e */
    private final void m80459e() {
        String str;
        Serializable serializableExtra = getIntent().getSerializableExtra("pageParams");
        if (serializableExtra != null) {
            EasterEggPageParams easterEggPageParams = (EasterEggPageParams) serializableExtra;
            if (easterEggPageParams.getEasterEggInfo() != null) {
                this.f64636i = easterEggPageParams;
                if (TextUtils.equals(C25352e.m83322a(easterEggPageParams.getEasterEggInfo()), "web")) {
                    str = C25352e.m83363d(easterEggPageParams.getEasterEggInfo());
                    C7573i.m23582a((Object) str, "AdDataUtils.getSearchEas…pageParams.easterEggInfo)");
                } else {
                    str = "";
                }
                getIntent().putExtra("url", str);
                return;
            }
            finish();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.EasterEggPageParams");
    }

    /* renamed from: f */
    private final void m80460f() {
        this.f64637j = new C24494c(this);
        CrossPlatformWebView crossPlatformWebView = this.f64633f;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("mWebView");
        }
        C26025c cVar = crossPlatformWebView;
        C25965c cVar2 = this.f64637j;
        if (cVar2 == null) {
            C7573i.m23583a("webViewLoadListener");
        }
        C0043i iVar = this;
        Activity activity = this;
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        CommercializeWebViewHelper.m82757a(cVar, cVar2, iVar, activity, intent.getExtras());
        AnimatedImageView animatedImageView = this.f64634g;
        if (animatedImageView == null) {
            C7573i.m23583a("mGifView");
        }
        this.f64638k = new C24495d(this, true, animatedImageView);
    }

    /* renamed from: c */
    public final HashMap<String, String> mo64215c() {
        HashMap<String, String> hashMap = new HashMap<>();
        Map map = hashMap;
        String str = "enter_from";
        EasterEggPageParams easterEggPageParams = this.f64636i;
        if (easterEggPageParams == null) {
            C7573i.m23583a("pageParams");
        }
        map.put(str, easterEggPageParams.getEnterFrom());
        String str2 = "search_keyword";
        EasterEggPageParams easterEggPageParams2 = this.f64636i;
        if (easterEggPageParams2 == null) {
            C7573i.m23583a("pageParams");
        }
        map.put(str2, easterEggPageParams2.getKeyWords());
        String str3 = "egg_ad_id";
        EasterEggPageParams easterEggPageParams3 = this.f64636i;
        if (easterEggPageParams3 == null) {
            C7573i.m23583a("pageParams");
        }
        map.put(str3, C25352e.m83357c(easterEggPageParams3.getEasterEggInfo()));
        return hashMap;
    }

    /* renamed from: d */
    private final void m80458d() {
        View findViewById = findViewById(R.id.cws);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.root_view)");
        this.f64632e = (FrameLayout) findViewById;
        FrameLayout frameLayout = this.f64632e;
        if (frameLayout == null) {
            C7573i.m23583a("mRootView");
        }
        OnClickListener onClickListener = this;
        frameLayout.setOnClickListener(onClickListener);
        View findViewById2 = findViewById(R.id.egh);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.webview)");
        this.f64633f = (CrossPlatformWebView) findViewById2;
        if (VERSION.SDK_INT >= 17) {
            CrossPlatformWebView crossPlatformWebView = this.f64633f;
            if (crossPlatformWebView == null) {
                C7573i.m23583a("mWebView");
            }
            WebSettings settings = m80457a(crossPlatformWebView).getSettings();
            C7573i.m23582a((Object) settings, "mWebView.getRawWebView().settings");
            settings.setMediaPlaybackRequiresUserGesture(false);
            CrossPlatformWebView crossPlatformWebView2 = this.f64633f;
            if (crossPlatformWebView2 == null) {
                C7573i.m23583a("mWebView");
            }
            m80457a(crossPlatformWebView2).setCanTouch(false);
        }
        View findViewById3 = findViewById(R.id.aqi);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.gif_view)");
        this.f64634g = (AnimatedImageView) findViewById3;
        View findViewById4 = findViewById(R.id.x_);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.close)");
        this.f64635h = (ImageView) findViewById4;
        ImageView imageView = this.f64635h;
        if (imageView == null) {
            C7573i.m23583a("mCloseBtn");
        }
        imageView.setOnClickListener(onClickListener);
        ImageView imageView2 = this.f64635h;
        if (imageView2 == null) {
            C7573i.m23583a("mCloseBtn");
        }
        C43081e.m136670a(imageView2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r0.equals("webp") == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r0 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b6, code lost:
        if (r0.equals("gif") != false) goto L_0x00b8;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m80461g() {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.commercialize.EasterEggPageParams r0 = r10.f64636i
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "pageParams"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            com.ss.android.ugc.aweme.commercialize.model.EasterEggInfo r0 = r0.getEasterEggInfo()
            java.lang.String r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83322a(r0)
            com.ss.android.ugc.aweme.commercialize.EasterEggPageParams r1 = r10.f64636i
            if (r1 != 0) goto L_0x001a
            java.lang.String r2 = "pageParams"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x001a:
            com.ss.android.ugc.aweme.commercialize.model.EasterEggInfo r1 = r1.getEasterEggInfo()
            boolean r1 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83353b(r1)
            if (r1 != 0) goto L_0x0028
            r10.mo64214b()
            return
        L_0x0028:
            long r1 = java.lang.System.currentTimeMillis()
            r10.f64629a = r1
            if (r0 != 0) goto L_0x0032
            goto L_0x00f9
        L_0x0032:
            int r1 = r0.hashCode()
            r2 = 102340(0x18fc4, float:1.43409E-40)
            r3 = 0
            if (r1 == r2) goto L_0x00b0
            r2 = 117588(0x1cb54, float:1.64776E-40)
            if (r1 == r2) goto L_0x0051
            r2 = 3645340(0x379f9c, float:5.10821E-39)
            if (r1 == r2) goto L_0x0048
            goto L_0x00f9
        L_0x0048:
            java.lang.String r1 = "webp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f9
            goto L_0x00b8
        L_0x0051:
            java.lang.String r1 = "web"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f9
            com.ss.android.ugc.aweme.commercialize.EasterEggPageParams r0 = r10.f64636i
            if (r0 != 0) goto L_0x0062
            java.lang.String r1 = "pageParams"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0062:
            com.ss.android.ugc.aweme.commercialize.model.EasterEggInfo r0 = r0.getEasterEggInfo()
            java.lang.String r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83363d(r0)
            if (r0 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x007b
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.C7634n.m23762b(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0085
            goto L_0x0083
        L_0x007b:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x0083:
            java.lang.String r0 = ""
        L_0x0085:
            r5 = r0
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0093
            r10.mo64214b()
            goto L_0x00f9
        L_0x0093:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r10.f64633f
            if (r0 != 0) goto L_0x009c
            java.lang.String r1 = "mWebView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x009c:
            r0.setVisibility(r3)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r4 = r10.f64633f
            if (r4 != 0) goto L_0x00a8
            java.lang.String r0 = "mWebView"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x00a8:
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.m85411a(r4, r5, r6, r7, r8, r9)
            goto L_0x00f9
        L_0x00b0:
            java.lang.String r1 = "gif"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f9
        L_0x00b8:
            com.ss.android.ugc.aweme.commercialize.EasterEggPageParams r0 = r10.f64636i
            if (r0 != 0) goto L_0x00c1
            java.lang.String r1 = "pageParams"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00c1:
            com.ss.android.ugc.aweme.commercialize.model.EasterEggInfo r0 = r0.getEasterEggInfo()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83367e(r0)
            boolean r1 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83326a(r0)
            if (r1 != 0) goto L_0x00d3
            r10.mo64214b()
            goto L_0x00f9
        L_0x00d3:
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r1 = r10.f64634g
            if (r1 != 0) goto L_0x00dc
            java.lang.String r2 = "mGifView"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00dc:
            r1.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r1 = r10.f64634g
            if (r1 != 0) goto L_0x00e8
            java.lang.String r2 = "mGifView"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00e8:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r1
            r2 = 1
            com.ss.android.ugc.aweme.commercialize.utils.a r3 = r10.f64638k
            if (r3 != 0) goto L_0x00f4
            java.lang.String r4 = "gifViewLoadListener"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x00f4:
            com.facebook.drawee.controller.d r3 = (com.facebook.drawee.controller.C13401d) r3
            com.p280ss.android.ugc.aweme.commercialize.utils.C25354g.m83376a(r1, r0, r2, r3)
        L_0x00f9:
            android.widget.FrameLayout r0 = r10.f64632e
            if (r0 != 0) goto L_0x0102
            java.lang.String r1 = "mRootView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0102:
            java.lang.Runnable r1 = r10.f64640m
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            com.ss.android.ugc.aweme.setting.d r3 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r4 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            int r3 = r3.mo18781at()
            long r3 = (long) r3
            long r2 = r2.toMillis(r3)
            r0.postDelayed(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.EasterEggActivityV2.m80461g():void");
    }

    /* renamed from: a */
    private static SingleWebView m80457a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView b = ((C26039m) crossPlatformWebView.mo67463a(C26039m.class)).mo67531b();
        C7573i.m23582a((Object) b, "getViewWrap(WebViewWrap::class.java).webView");
        return b;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView((int) R.layout.ek);
        m80459e();
        m80458d();
        m80460f();
        m80461g();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo64213a(String str) {
        if (!this.f64631c && !this.f64630b) {
            this.f64631c = true;
            Map c = mo64215c();
            c.put("fail_type", str);
            C6907h.m21524a("show_egg_ad_fail", c);
        }
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.x_) {
            Map c = mo64215c();
            c.put("disappear_method", "click_close_button");
            c.put("duration", String.valueOf(System.currentTimeMillis() - this.f64629a));
            C6907h.m21524a("egg_ad_disappear", c);
            finish();
            return;
        }
        EasterEggPageParams easterEggPageParams = this.f64636i;
        if (easterEggPageParams == null) {
            C7573i.m23583a("pageParams");
        }
        EasterEggInfo easterEggInfo = easterEggPageParams.getEasterEggInfo();
        C25371n.m83439a((Context) this, C25352e.m83369g(easterEggInfo), C25352e.m83368f(easterEggInfo), C25352e.m83370h(easterEggInfo));
        Map c2 = mo64215c();
        c2.put("duration", String.valueOf(System.currentTimeMillis() - this.f64629a));
        c2.put("enter_method", "click_carton");
        C6907h.m21524a("click_egg_ad", c2);
        finish();
    }
}
