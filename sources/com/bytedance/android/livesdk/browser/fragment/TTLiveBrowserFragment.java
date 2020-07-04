package com.bytedance.android.livesdk.browser.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.C1346ai.C1347a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C2379k;
import com.bytedance.android.live.base.model.user.IUser.Status;
import com.bytedance.android.live.browser.C3142b;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.rxutils.autodispose.C3242aa;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3361af;
import com.bytedance.android.live.core.utils.p161c.C3382a;
import com.bytedance.android.live.uikit.layout.FullscreenVideoFrame;
import com.bytedance.android.live.uikit.p174b.C3510a;
import com.bytedance.android.live.uikit.p175c.C3511a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.C3951b;
import com.bytedance.android.livesdk.browser.C3970c;
import com.bytedance.android.livesdk.browser.C3987d;
import com.bytedance.android.livesdk.browser.jsbridge.C4030a;
import com.bytedance.android.livesdk.browser.jsbridge.C4037b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4116at;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4116at.C4117a;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4119au;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4135bb;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4139bc;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4145bf;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4171i;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4171i.C4172a;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4192q;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4047e;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4047e.C4048a;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.C4059k;
import com.bytedance.android.livesdk.browser.p191a.C3948a;
import com.bytedance.android.livesdk.browser.p191a.C3949b;
import com.bytedance.android.livesdk.browser.p192b.C3966a;
import com.bytedance.android.livesdk.browser.p193c.C3980d;
import com.bytedance.android.livesdk.browser.p194d.C3988a;
import com.bytedance.android.livesdk.browser.p197g.C4025b;
import com.bytedance.android.livesdk.browser.p198h.C4029a;
import com.bytedance.android.livesdk.browser.view.C4223a;
import com.bytedance.android.livesdk.browser.view.C4224b;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.sign.C8950a;
import com.bytedance.android.livesdk.utils.C9020a;
import com.bytedance.android.livesdk.utils.C9041ai;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.share.C9388a;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.bytedance.android.livesdkapi.p436c.C9292a;
import com.bytedance.android.livesdkapi.p436c.C9293b;
import com.bytedance.android.monitor.webview.C9541j;
import com.bytedance.common.p479c.C9682a;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.C11152c.C11154b;
import com.bytedance.ies.web.p582a.C11093e;
import com.facebook.datasource.C13345b;
import com.facebook.datasource.C13346c;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.p717d.C13606i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C47579f;
import p346io.reactivex.C7494t;
import p346io.reactivex.p348d.C7326g;

public class TTLiveBrowserFragment extends BaseFragment implements OnClickListener, C4030a, C4048a, C4117a, C4172a, C9293b, C6310a {

    /* renamed from: A */
    public long f11888A;

    /* renamed from: B */
    public long f11889B;

    /* renamed from: C */
    public long f11890C;

    /* renamed from: D */
    public Map<String, Object> f11891D = new HashMap();

    /* renamed from: E */
    private View f11892E;

    /* renamed from: F */
    private FrameLayout f11893F;

    /* renamed from: G */
    private View f11894G;

    /* renamed from: H */
    private View f11895H;

    /* renamed from: I */
    private boolean f11896I;

    /* renamed from: J */
    private boolean f11897J;

    /* renamed from: K */
    private boolean f11898K = true;

    /* renamed from: L */
    private boolean f11899L;

    /* renamed from: M */
    private String f11900M;

    /* renamed from: N */
    private String f11901N;

    /* renamed from: O */
    private int f11902O;

    /* renamed from: P */
    private int f11903P = -1;

    /* renamed from: Q */
    private C3511a f11904Q;

    /* renamed from: R */
    private C4025b f11905R;

    /* renamed from: S */
    private C4002b f11906S;

    /* renamed from: T */
    private C3966a f11907T;

    /* renamed from: U */
    private C4135bb f11908U;

    /* renamed from: V */
    private C4145bf f11909V;

    /* renamed from: W */
    private C4139bc f11910W;

    /* renamed from: X */
    private C4192q f11911X;

    /* renamed from: Y */
    private boolean f11912Y;

    /* renamed from: Z */
    private boolean f11913Z;

    /* renamed from: a */
    public String f11914a;

    /* renamed from: aa */
    private Handler f11915aa;

    /* renamed from: ab */
    private JSONObject f11916ab;

    /* renamed from: ac */
    private boolean f11917ac;

    /* renamed from: ad */
    private String f11918ad;

    /* renamed from: ae */
    private String f11919ae;

    /* renamed from: af */
    private String f11920af;

    /* renamed from: ag */
    private OnClickListener f11921ag = new C4007b(this);

    /* renamed from: ah */
    private C1347a f11922ah = new C4008c(this);

    /* renamed from: b */
    public String f11923b = "";

    /* renamed from: c */
    public C4004d f11924c;

    /* renamed from: d */
    public C4005e f11925d;

    /* renamed from: e */
    public C4001a f11926e;

    /* renamed from: f */
    public C3142b f11927f;

    /* renamed from: g */
    public boolean f11928g = true;

    /* renamed from: h */
    protected View f11929h;

    /* renamed from: i */
    public TextView f11930i;

    /* renamed from: j */
    public FullscreenVideoFrame f11931j;

    /* renamed from: k */
    public View f11932k;

    /* renamed from: l */
    public CustomViewCallback f11933l;

    /* renamed from: m */
    public WebView f11934m;

    /* renamed from: q */
    public ViewGroup f11935q;

    /* renamed from: r */
    public View f11936r;

    /* renamed from: s */
    public boolean f11937s = true;

    /* renamed from: t */
    public boolean f11938t = true;

    /* renamed from: u */
    public long f11939u;

    /* renamed from: v */
    public boolean f11940v = true;

    /* renamed from: w */
    public C4037b f11941w;

    /* renamed from: x */
    public boolean f11942x;

    /* renamed from: y */
    public C4029a f11943y;

    /* renamed from: z */
    public long f11944z;

    /* renamed from: com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment$a */
    public interface C4001a {
        /* renamed from: a */
        void mo11591a(C4037b bVar);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment$b */
    class C4002b extends C3949b {
        public final void onConsoleMessage(String str, int i, String str2) {
        }

        public final void onGeolocationPermissionsHidePrompt() {
            if (TTLiveBrowserFragment.this.f11941w != null) {
                TTLiveBrowserFragment.this.f11941w.mo11658d();
            }
        }

        public final void onHideCustomView() {
            if (TTLiveBrowserFragment.this.f11932k == null) {
                TTLiveBrowserFragment.this.f11933l = null;
                return;
            }
            TTLiveBrowserFragment.this.mo11611d();
            TTLiveBrowserFragment.this.f11931j.setVisibility(8);
            TTLiveBrowserFragment.this.f11931j.removeView(TTLiveBrowserFragment.this.f11932k);
            C9738o.m28692a((Activity) TTLiveBrowserFragment.this.getActivity(), false);
            TTLiveBrowserFragment.this.f11932k = null;
            TTLiveBrowserFragment.this.f11933l.onCustomViewHidden();
        }

        C4002b() {
            super(TTLiveBrowserFragment.this);
        }

        public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
            if (TTLiveBrowserFragment.this.f11941w != null) {
                TTLiveBrowserFragment.this.f11941w.mo11656a(str, callback);
            }
        }

        public final void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            C9541j.m28227b().mo23586a(webView, i);
        }

        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (TTLiveBrowserFragment.this.f11938t && TTLiveBrowserFragment.this.getActivity() != null && !C6319n.m19593a(str) && !TextUtils.equals("about:blank", str)) {
                TTLiveBrowserFragment.this.mo11606a((CharSequence) str);
                if (TTLiveBrowserFragment.this.f11925d != null) {
                    TTLiveBrowserFragment.this.f11925d.mo11592a(str);
                }
            }
        }

        public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
            if (TTLiveBrowserFragment.this.f11940v) {
                if (TTLiveBrowserFragment.this.f11932k != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                TTLiveBrowserFragment.this.mo11610c();
                TTLiveBrowserFragment.this.f11933l = customViewCallback;
                TTLiveBrowserFragment.this.f11931j.addView(view);
                TTLiveBrowserFragment.this.f11932k = view;
                C9738o.m28692a((Activity) TTLiveBrowserFragment.this.getActivity(), true);
                TTLiveBrowserFragment.this.f11931j.setVisibility(0);
                TTLiveBrowserFragment.this.f11931j.requestFocus();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment$c */
    class C4003c extends C3948a {
        C4003c(WebViewClient webViewClient) {
            super(null);
        }

        public final void onLoadResource(WebView webView, String str) {
            if (C6312h.m19578b()) {
                C9020a.m26959a(str);
            }
            super.onLoadResource(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            TTLiveBrowserFragment.this.f11939u = System.currentTimeMillis();
            if (TTLiveBrowserFragment.this.f11924c != null) {
                TTLiveBrowserFragment.this.f11924c.mo11594c();
            }
            if (TTLiveBrowserFragment.this.f11928g) {
                webView.clearHistory();
                TTLiveBrowserFragment.this.f11928g = false;
            }
            super.onPageFinished(webView, str);
            if (TextUtils.isEmpty(TTLiveBrowserFragment.this.f11923b) && TTLiveBrowserFragment.this.f11934m != null) {
                TTLiveBrowserFragment.this.f11923b = TTLiveBrowserFragment.this.f11934m.getTitle();
                TTLiveBrowserFragment.this.f11930i.setText(TTLiveBrowserFragment.this.f11923b);
            }
            if (TTLiveBrowserFragment.this.f11942x && TTLiveBrowserFragment.this.f11934m != null) {
                C4020o.m14083a(TTLiveBrowserFragment.this.f11934m, "about:blank");
            }
            if (!TTLiveBrowserFragment.this.f11937s) {
                TTLiveBrowserFragment.this.mo11615h();
            }
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (C9178j.m27302j().mo22374c().mo11545a(webView, str) || super.shouldOverrideUrlLoading(webView, str)) {
                return true;
            }
            try {
                Uri parse = Uri.parse(str);
                String lowerCase = parse.getScheme().toLowerCase();
                if (!TextUtils.isEmpty(lowerCase) && !"about".equals(lowerCase) && !WebKitApi.SCHEME_HTTP.equals(lowerCase) && !WebKitApi.SCHEME_HTTPS.equals(lowerCase)) {
                    return C9178j.m27302j().mo22380i().handle(TTLiveBrowserFragment.this.getContext(), parse);
                }
            } catch (Exception unused) {
            }
            return false;
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            C3988a.m13984b();
            if (!TextUtils.isEmpty(str)) {
                WebResourceResponse a = C9178j.m27302j().mo22375d().mo22384d().mo11587a(str, webView);
                if (a != null) {
                    if (TextUtils.equals("text/html", a.getMimeType())) {
                        TTLiveBrowserFragment.this.f11890C = System.currentTimeMillis();
                        TTLiveBrowserFragment.this.f11891D.put("intercept_delay", Long.valueOf((TTLiveBrowserFragment.this.f11890C - TTLiveBrowserFragment.this.f11889B) / 1000));
                    }
                    if (TTLiveBrowserFragment.m14014c(str)) {
                        C3988a.m13982a(TTLiveBrowserFragment.this.f11914a, str, 0);
                    }
                    C9541j.m28227b().mo23591a(webView, str, true);
                    if (TTLiveBrowserFragment.m14013b(str)) {
                        TTLiveBrowserFragment.this.mo11602a(webView, str);
                    }
                    return a;
                }
                if (TTLiveBrowserFragment.m14014c(str)) {
                    C3988a.m13982a(TTLiveBrowserFragment.this.f11914a, str, 1);
                }
                C9541j.m28227b().mo23591a(webView, str, false);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.proceed();
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "webview_receive_ssl_error");
            hashMap.put("error_detail", sslError.toString());
            C8444d.m25673b().mo10003c("ttlive_exception", (Map<String, ?>) hashMap);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C9541j.m28227b().mo23588a(webView, str, bitmap);
            TTLiveBrowserFragment.this.f11888A = System.currentTimeMillis();
            TTLiveBrowserFragment.this.f11942x = false;
            TextUtils.equals(str, "about:blank");
            TTLiveBrowserFragment.this.f11891D.put("constrution_duration", Long.valueOf((TTLiveBrowserFragment.this.f11888A - TTLiveBrowserFragment.this.f11944z) / 1000));
            if (TTLiveBrowserFragment.this.f11924c != null) {
                TTLiveBrowserFragment.this.f11924c.mo11593b();
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            TTLiveBrowserFragment.this.f11939u = System.currentTimeMillis();
            TTLiveBrowserFragment.this.mo11615h();
            TTLiveBrowserFragment.this.f11942x = true;
            if (TTLiveBrowserFragment.this.f11924c != null) {
                TTLiveBrowserFragment.this.f11924c.mo11589a(i);
            }
            if (TTLiveBrowserFragment.this.f11943y != null) {
                TTLiveBrowserFragment.this.f11943y.mo11652a(i, str);
            }
            TTLiveBrowserFragment.this.mo11599a(1);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment$d */
    public interface C4004d {
        /* renamed from: a */
        void mo11589a(int i);

        /* renamed from: b */
        void mo11593b();

        /* renamed from: c */
        void mo11594c();
    }

    /* renamed from: com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment$e */
    public interface C4005e {
        /* renamed from: a */
        void mo11592a(String str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11598a() {
        m14017u();
    }

    /* renamed from: e */
    public final Fragment mo11612e() {
        return this;
    }

    /* renamed from: f */
    public final C4025b mo11613f() {
        return this.f11905R;
    }

    /* renamed from: g */
    public final void mo11614g() {
        mo11615h();
    }

    /* renamed from: a */
    public final void mo11573a(String str, JSONObject jSONObject) {
        if (this.f11941w != null) {
            this.f11941w.mo11529a().mo27206a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo11607a(String str) {
        this.f11920af = str;
    }

    /* renamed from: a */
    public final void mo11608a(String str, Object obj) {
        this.f11891D.put(str, obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ C11152c mo11621o() {
        return new C4171i(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ C11152c mo11623p() {
        return new C4119au(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final /* synthetic */ C11152c mo11624q() {
        return new C4116at(this);
    }

    /* renamed from: s */
    private void mo22122s() {
        FragmentActivity activity = getActivity();
        if (activity instanceof C9292a) {
            activity.finish();
        }
    }

    /* renamed from: c */
    public final void mo11610c() {
        if (this.f11892E != null) {
            this.f11892E.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo11611d() {
        if (this.f11892E != null && !this.f11896I) {
            this.f11892E.setVisibility(0);
        }
    }

    /* renamed from: h */
    public final void mo11615h() {
        if (this.f11893F != null) {
            this.f11893F.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ C11152c mo11617j() {
        this.f11911X = new C4192q(this);
        return this.f11911X;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ C11152c mo11618k() {
        this.f11909V = new C4145bf(this);
        return this.f11909V;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ C11152c mo11619m() {
        this.f11910W = new C4139bc(this);
        return this.f11910W;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ C11152c mo11620n() {
        this.f11908U = new C4135bb(this);
        return this.f11908U;
    }

    public void onStop() {
        super.onStop();
        if (this.f11904Q != null) {
            this.f11904Q.mo10602d();
            this.f11904Q = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final /* synthetic */ void mo11625r() {
        if (this.f11906S != null) {
            this.f11906S.onHideCustomView();
        }
    }

    /* renamed from: t */
    private void m14016t() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("code", "1");
            jSONObject.put("args", jSONObject2);
            mo11573a("H5_loginStatus", jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public final void mo11609b() {
        if (this.f11934m == null || !this.f11934m.canGoBack()) {
            mo22122s();
        } else {
            this.f11934m.goBack();
        }
    }

    /* renamed from: i */
    public final void mo11616i() {
        this.f11891D.put("first_loaded", Long.valueOf((System.currentTimeMillis() - this.f11944z) / 1000));
    }

    /* renamed from: u */
    private void m14017u() {
        if (this.f11934m != null) {
            this.f11934m.clearCache(false);
            if (this.f11916ab == null || this.f11916ab.length() <= 0) {
                C9020a.m26955a(this.f11919ae, this.f11934m, this.f11918ad, true);
            } else {
                HashMap hashMap = new HashMap();
                C9020a.m26958a(hashMap, (String) null, this.f11916ab);
                C9020a.m26956a(this.f11919ae, this.f11934m, (Map<String, String>) hashMap);
            }
        }
    }

    public void onPause() {
        super.onPause();
        FragmentActivity activity = getActivity();
        C9682a.m28609a(this.f11934m);
        C3987d.m13977a(getActivity(), this.f11907T, this.f11934m);
        if (this.f11915aa != null && activity != null && !activity.isFinishing()) {
            this.f11915aa.sendEmptyMessageDelayed(10011, 120000);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f11934m != null) {
            this.f11934m.getSettings().setBlockNetworkLoads(false);
            if (this.f11915aa != null) {
                this.f11915aa.removeMessages(10011);
            }
        }
        super.onResume();
        C9682a.m28610b(this.f11934m);
        if (this.f11904Q != null) {
            this.f11904Q.mo10604e();
        }
        if (this.f11934m != null && this.f11903P != -1) {
            this.f11934m.reload();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f11943y != null && this.f11939u == 0) {
            this.f11943y.mo11654c();
        }
        mo11599a(0);
        C9178j.m27302j().mo22374c().mo11549b((C4030a) this);
        C9178j.m27302j().mo22375d().mo22382b().mo11650a(getActivity());
        if (this.f11941w != null) {
            this.f11941w.mo11530b();
        }
        if (this.f11934m != null) {
            try {
                C9178j.m27302j().mo22374c().mo11537a(this.f11934m);
            } catch (Exception unused) {
            }
        }
        if (this.f11915aa != null) {
            this.f11915aa.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: v */
    private void m14018v() {
        this.f11941w.mo11529a().mo27203a("shareInfo", (C11154b) new C4016k(this));
        this.f11941w.mo11529a().mo27203a("sharePanel", (C11154b) new C4017l(this));
        this.f11941w.mo11529a().mo27203a("cancelLoading", (C11154b) new C4018m(this));
        this.f11941w.mo11529a().mo27203a("uploadPhoto", (C11154b) new C4019n(this));
        this.f11941w.mo11529a().mo27203a("uploadPicture", (C11154b) new C4009d(this));
        this.f11941w.mo11529a().mo27203a("uploadVideo", (C11154b) new C4010e(this));
        this.f11941w.mo11529a().mo27203a("upload", (C11154b) new C4011f(this));
        C4047e eVar = new C4047e(new WeakReference(this));
        this.f11941w.mo11657c().mo27210a("openHostVerify", (C11093e) new C8950a(getActivity(), null));
        this.f11941w.mo11657c().mo27210a("ttliveMonitorPage", (C11093e) eVar).mo27210a("share", (C11093e) new C4059k(new WeakReference(getContext()), this));
    }

    /* renamed from: a */
    public final void mo11600a(long j) {
        this.f11943y.mo11653b();
    }

    /* renamed from: a */
    public static TTLiveBrowserFragment m14008a(Bundle bundle) {
        TTLiveBrowserFragment tTLiveBrowserFragment = new TTLiveBrowserFragment();
        tTLiveBrowserFragment.setArguments(bundle);
        return tTLiveBrowserFragment;
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m14012b(C2379k kVar) throws Exception {
        if (kVar.f7832a == Status.Login) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo11599a(int i) {
        if (!TextUtils.isEmpty(this.f11920af)) {
            C3172e.m12001a(this.f11920af, i, this.f11891D);
            this.f11920af = null;
            this.f11891D = null;
        }
    }

    public void handleMsg(Message message) {
        if (message.what == 10011 && !this.f10102n && this.f11934m != null) {
            try {
                this.f11934m.getSettings().setBlockNetworkLoads(true);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo11605a(FollowPair followPair) {
        if (followPair != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("type", "follow");
                jSONObject2.put("user_id", String.valueOf(followPair.f25593a));
                jSONObject2.put("follow_status", followPair.mo22844a());
                jSONObject.put("args", jSONObject2);
                mo11573a("H5_userStatusChange", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: c */
    public static boolean m14014c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String path = new URL(str).getPath();
            if (path.endsWith(".htm") || path.endsWith(".html") || path.endsWith(".css") || path.endsWith(".js")) {
                return true;
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11601a(View view) {
        int id = view.getId();
        if (id == R.id.jn) {
            mo11609b();
            return;
        }
        if (id == R.id.eg5) {
            mo11598a();
        }
    }

    /* renamed from: b */
    public static boolean m14013b(String str) {
        String str2;
        Uri parse = Uri.parse(str);
        if (parse.getPath() == null) {
            str2 = "";
        } else {
            str2 = parse.getPath();
        }
        if (str2.endsWith("jpg") || str2.endsWith("jpeg") || str2.endsWith("png") || str2.endsWith("gif") || str2.endsWith("ico")) {
            return true;
        }
        return false;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.rj || id == R.id.rt) {
            if (this.f11905R != null) {
                TTLiveSDKContext.getHostService().mo22364e().mo22110a((Activity) getActivity(), C9389b.m27846a().mo23106d(this.f11905R.f11998d).mo23104b(this.f11905R.f11996b).mo23105c(this.f11905R.f11997c).mo23102a(), (C9388a) new C9388a() {
                    /* renamed from: a */
                    public final void mo11626a(String str, String str2) {
                    }

                    /* renamed from: a */
                    public final void mo11627a(Throwable th) {
                    }
                });
            }
        } else if (id == R.id.rs) {
            mo11609b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11603a(C2379k kVar) throws Exception {
        m14016t();
    }

    /* renamed from: b */
    private void m14009b(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.getBoolean("from_notification", false);
        String string = bundle.getString("url");
        if (!TextUtils.isEmpty(string)) {
            Uri parse = Uri.parse(string);
            if (!this.f11897J) {
                this.f11897J = bundle.getBoolean("hide_status_bar", false);
            }
            if (!this.f11896I) {
                this.f11896I = bundle.getBoolean("hide_nav_bar", false);
            }
            if (!this.f11898K) {
                this.f11898K = bundle.getBoolean("hide_more", false);
            }
            if (!this.f11899L) {
                this.f11899L = bundle.getBoolean("trans_status_bar", false);
            }
            this.f11902O = bundle.getInt("bundle_web_view_background_color", Color.parseColor("#ffffff"));
            if (parse != null) {
                try {
                    if (!TextUtils.isEmpty(parse.getQueryParameter("web_bg_color"))) {
                        String queryParameter = parse.getQueryParameter("web_bg_color");
                        if (!queryParameter.startsWith("#")) {
                            StringBuilder sb = new StringBuilder("#");
                            sb.append(queryParameter);
                            queryParameter = sb.toString();
                        }
                        this.f11902O = Color.parseColor(queryParameter);
                    }
                } catch (Exception unused) {
                }
            }
            boolean z5 = true;
            if (parse != null) {
                try {
                    if (parse.getQueryParameter("hide_nav_bar") != null) {
                        if (Integer.parseInt(parse.getQueryParameter("hide_nav_bar")) == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.f11896I = z4;
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            if (!(parse == null || parse.getQueryParameter("hide_status_bar") == null)) {
                if (Integer.parseInt(parse.getQueryParameter("hide_status_bar")) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f11897J = z3;
            }
            if (!(parse == null || parse.getQueryParameter("hide_more") == null)) {
                if (Integer.parseInt(parse.getQueryParameter("hide_more")) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f11898K = z2;
            }
            if (!(parse == null || parse.getQueryParameter("trans_status_bar") == null)) {
                if (Integer.parseInt(parse.getQueryParameter("trans_status_bar")) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f11899L = z;
            }
            if (!(parse == null || parse.getQueryParameter("hide_loading") == null)) {
                if (C9041ai.m27008a(parse.getQueryParameter("hide_loading")) != 1) {
                    z5 = false;
                }
                this.f11937s = z5;
            }
            if (parse != null) {
                this.f11900M = parse.getQueryParameter("status_bar_color");
                this.f11901N = parse.getQueryParameter("status_bar_bg_color");
            }
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            if (arguments != null) {
                this.f11918ad = arguments.getString("referer");
            }
            if (arguments != null) {
                this.f11923b = arguments.getString("title");
            }
            if (parse != null && !TextUtils.isEmpty(parse.getQueryParameter("title"))) {
                this.f11923b = parse.getQueryParameter("title");
            }
            if (!(parse == null || parse.getQueryParameter("bundle_sale_show_status") == null)) {
                this.f11903P = Integer.parseInt(parse.getQueryParameter("bundle_sale_show_status"));
            }
        }
    }

    /* renamed from: a */
    public final void mo11604a(C4025b bVar) {
        this.f11905R = bVar;
        this.f11894G.setVisibility(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (TTLiveSDKContext.getHostService() == null) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        this.f11907T = C9178j.m27302j().mo22375d().mo22381a();
        if (VERSION.SDK_INT >= 19 && ((Boolean) C3970c.f11824i.mo10240a()).booleanValue()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        ((C3245ad) TTLiveSDKContext.getHostService().mo22367h().mo22187g().mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10182a((C7326g<? super T>) new C4012g<Object>(this));
        m14009b(getArguments());
        if ("black".equals(this.f11900M)) {
            C3382a.m12569a((Activity) getActivity());
        } else if ("white".equals(this.f11900M)) {
            C3382a.m12572a(getActivity().getWindow());
        }
        if (!C6319n.m19593a(this.f11901N)) {
            try {
                C3510a.m12932a(getActivity(), Color.parseColor(this.f11901N));
            } catch (Exception unused) {
            }
        }
        if (this.f11897J) {
            C3361af.m12534b(getActivity());
        }
        this.f11915aa = new C6309f(this);
        this.f11940v = ((Boolean) C3970c.f11819d.mo10240a()).booleanValue();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f11917ac = arguments.getBoolean("bundle_no_hw_acceleration", false);
            this.f11913Z = arguments.getBoolean("bundle_enable_app_cache", false);
            this.f11919ae = arguments.getString("url");
            if (this.f11919ae == null) {
                this.f11919ae = "";
            }
            this.f11918ad = arguments.getString("referer");
            this.f11938t = arguments.getBoolean("bundle_user_webview_title", false);
            String string = arguments.getString("wap_headers");
            try {
                if (!C6319n.m19593a(string)) {
                    this.f11916ab = new JSONObject(string);
                }
            } catch (JSONException unused2) {
            }
            this.f11912Y = arguments.getBoolean("bundle_load_no_cache", false);
        }
        if (!this.f11917ac) {
            this.f11917ac = false;
        }
    }

    /* renamed from: b */
    private void m14010b(View view) {
        this.f11929h = view.findViewById(R.id.cws);
        this.f11892E = view.findViewById(R.id.djz);
        View findViewById = view.findViewById(R.id.dk7);
        view.findViewById(R.id.dnm).setVisibility(8);
        this.f11892E.findViewById(R.id.jn).setOnClickListener(this.f11921ag);
        this.f11930i = (TextView) this.f11892E.findViewById(R.id.title);
        this.f11930i.setText(this.f11923b);
        this.f11935q = (ViewGroup) view.findViewById(R.id.egb);
        this.f11936r = view.findViewById(R.id.egc);
        this.f11895H = view.findViewById(R.id.eg5);
        this.f11893F = (FrameLayout) view.findViewById(R.id.d9y);
        this.f11893F.addView(new C4223a(getActivity()), new LayoutParams(-2, -1));
        if (!this.f11937s) {
            int i = VERSION.SDK_INT;
        } else {
            this.f11893F.setVisibility(8);
        }
        this.f11931j = (FullscreenVideoFrame) view.findViewById(R.id.a5s);
        this.f11931j.setListener(new C4013h(this));
        this.f11894G = view.findViewById(R.id.rj);
        this.f11894G.setOnClickListener(this);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f11930i.getLayoutParams();
        marginLayoutParams.leftMargin = (int) C9738o.m28708b(getContext(), 50.0f);
        marginLayoutParams.rightMargin = (int) C9738o.m28708b(getContext(), 50.0f);
        this.f11930i.setLayoutParams(marginLayoutParams);
        this.f11930i.setSingleLine(true);
        this.f11930i.setEllipsize(TruncateAt.END);
        if (this.f11896I) {
            this.f11892E.setVisibility(8);
            findViewById.setVisibility(8);
            this.f11930i.setVisibility(8);
        }
        ((C3242aa) TTLiveSDKContext.getHostService().mo22367h().mo22183d().mo19164d().mo19150a(C4014i.f11986a).mo19153a((C47579f<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10179a(new C4015j(this));
    }

    /* renamed from: a */
    public final void mo11606a(CharSequence charSequence) {
        if (this.f11930i != null) {
            this.f11930i.setText(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo11602a(final WebView webView, final String str) {
        Uri parse = Uri.parse(str);
        C13606i c = C13380c.m39172c();
        if (c.mo33184c(parse)) {
            C9541j.m28227b().mo23595b(webView, str, true);
        } else {
            c.mo33188e(parse).mo32633a(new C13345b<Boolean>() {
                public final void onFailureImpl(C13346c<Boolean> cVar) {
                    C9541j.m28227b().mo23595b(webView, str, false);
                }

                public final void onNewResultImpl(C13346c<Boolean> cVar) {
                    if (!cVar.mo32639b() || cVar.mo32641d() == null) {
                        C9541j.m28227b().mo23595b(webView, str, false);
                    } else if (((Boolean) cVar.mo32641d()).booleanValue()) {
                        C9541j.m28227b().mo23595b(webView, str, true);
                    } else {
                        C9541j.m28227b().mo23595b(webView, str, false);
                    }
                }
            }, AsyncTask.THREAD_POOL_EXECUTOR);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f11906S != null) {
            this.f11906S.mo11511a(i, i2, intent);
        }
        if (this.f11908U != null) {
            this.f11908U.mo11697a(i, i2, intent);
        }
        if (this.f11910W != null) {
            this.f11910W.mo11703a(i, i2, intent);
        }
        if (this.f11909V != null) {
            this.f11909V.mo11706a(i, i2, intent);
        }
        if (this.f11911X != null) {
            this.f11911X.mo11732a(i, i2, intent);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebSettings webSettings;
        int i;
        try {
            View inflate = layoutInflater.inflate(R.layout.alw, viewGroup, false);
            m14010b(inflate);
            C9178j.m27302j().mo22374c().mo11542a((C4030a) this);
            C3980d.m13953a();
            this.f11944z = System.currentTimeMillis();
            this.f11891D.put("webview_cache", Integer.valueOf(C9178j.m27302j().mo22374c().mo11544a() ? 1 : 0));
            try {
                this.f11934m = C9178j.m27302j().mo22374c().mo11531a(getContext());
            } catch (Exception unused) {
            }
            if (this.f11934m == null) {
                return inflate;
            }
            this.f11935q.addView(this.f11934m);
            this.f11934m.setScrollBarStyle(0);
            this.f11934m.setBackgroundColor(this.f11902O);
            CookieManager.getInstance().setAcceptCookie(true);
            this.f11934m.setVerticalScrollBarEnabled(false);
            C4224b.m14355a((Context) getActivity()).mo11781a(!this.f11917ac).mo11782a(this.f11934m);
            this.f11906S = new C4002b();
            if (this.f11912Y) {
                webSettings = this.f11934m.getSettings();
                i = 2;
            } else {
                webSettings = this.f11934m.getSettings();
                if (this.f11913Z) {
                    i = 1;
                } else {
                    i = -1;
                }
            }
            webSettings.setCacheMode(i);
            this.f11891D.put("page_cache", Integer.valueOf(this.f11934m.getSettings().getCacheMode()));
            this.f11941w = C4037b.m14094a((Activity) getActivity(), this.f11934m, (WebViewClient) new C4003c(null), (WebChromeClient) this.f11906S);
            C3951b.m13876a(this.f11941w.mo11529a());
            if (this.f11926e != null) {
                this.f11926e.mo11591a(this.f11941w);
            }
            m14018v();
            this.f11889B = System.currentTimeMillis();
            if (this.f11916ab == null || this.f11916ab.length() <= 0) {
                C9020a.m26955a(this.f11919ae, this.f11934m, this.f11918ad, true);
            } else {
                HashMap hashMap = new HashMap();
                C9020a.m26958a(hashMap, (String) null, this.f11916ab);
                C9020a.m26956a(this.f11919ae, this.f11934m, (Map<String, String>) hashMap);
            }
            this.f11943y = new C4029a(this.f11914a, this.f11919ae, this.f11927f);
            this.f11943y.mo11651a();
            return inflate;
        } catch (Exception e) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            C8444d.m25673b();
            C8444d.m11969a(6, e.getStackTrace());
            return new View(getContext());
        }
    }
}
