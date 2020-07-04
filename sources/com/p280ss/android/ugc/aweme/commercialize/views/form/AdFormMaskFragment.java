package com.p280ss.android.ugc.aweme.commercialize.views.form;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.commerce.p1104a.C24411a;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24563d;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24567h;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.C25539a;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment */
public final class AdFormMaskFragment extends AbsFragment {

    /* renamed from: k */
    public static final C25576a f67357k = new C25576a(null);

    /* renamed from: e */
    public CrossPlatformWebView f67358e;

    /* renamed from: f */
    public Aweme f67359f;

    /* renamed from: g */
    public C24723e f67360g = new C24723e();

    /* renamed from: h */
    public C25584a f67361h;

    /* renamed from: i */
    public boolean f67362i;

    /* renamed from: j */
    public boolean f67363j;

    /* renamed from: l */
    private ViewGroup f67364l;

    /* renamed from: m */
    private DmtTextView f67365m;

    /* renamed from: n */
    private DmtTextView f67366n;

    /* renamed from: o */
    private String f67367o = "";

    /* renamed from: p */
    private boolean f67368p;

    /* renamed from: q */
    private boolean f67369q;

    /* renamed from: r */
    private HashMap f67370r;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment$a */
    public static final class C25576a {
        private C25576a() {
        }

        public /* synthetic */ C25576a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static AdFormMaskFragment m84090a(Bundle bundle) {
            C7573i.m23587b(bundle, "args");
            AdFormMaskFragment adFormMaskFragment = new AdFormMaskFragment();
            adFormMaskFragment.setArguments(bundle);
            return adFormMaskFragment;
        }

        /* renamed from: a */
        public static void m84092a(C0608j jVar, ViewGroup viewGroup, int i, boolean z) {
            C7573i.m23587b(jVar, "fragmentManager");
            C7573i.m23587b(viewGroup, "containerLayout");
            Fragment a = jVar.mo2642a(i);
            if (a != null) {
                C0633q a2 = jVar.mo2645a();
                C7573i.m23582a((Object) a2, "fragmentManager.beginTransaction()");
                a2.mo2587a(a);
                a2.mo2606d();
            }
            viewGroup.removeView((FrameLayout) viewGroup.findViewById(i));
            if (z && !C43316v.m137250H()) {
                C43316v.m137450K().mo104946v();
            }
        }

        /* renamed from: a */
        public static void m84091a(C0608j jVar, ViewGroup viewGroup, int i, AdFormMaskFragment adFormMaskFragment) {
            C7573i.m23587b(jVar, "fragmentManager");
            C7573i.m23587b(viewGroup, "containerLayout");
            C7573i.m23587b(adFormMaskFragment, "fragment");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setId(i);
            frameLayout.setLayoutParams(new LayoutParams(-1, -1));
            viewGroup.addView(frameLayout);
            C0633q a = jVar.mo2645a();
            C7573i.m23582a((Object) a, "fragmentManager.beginTransaction()");
            if (!C43316v.m137250H()) {
                C43316v.m137450K().mo104948x();
            }
            a.mo2585a(i, (Fragment) adFormMaskFragment);
            a.mo2606d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment$b */
    static final class C25577b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdFormMaskFragment f67371a;

        C25577b(AdFormMaskFragment adFormMaskFragment) {
            this.f67371a = adFormMaskFragment;
        }

        public final void run() {
            AdFormMaskFragment.m84085a(this.f67371a).setVisibility(0);
            this.f67371a.mo66357d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment$c */
    static final class C25578c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdFormMaskFragment f67372a;

        C25578c(AdFormMaskFragment adFormMaskFragment) {
            this.f67372a = adFormMaskFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C24976t.m82289x(this.f67372a.getContext(), this.f67372a.f67359f);
            C24411a.m80259a();
            C24411a.m80261a(this.f67372a.getContext(), this.f67372a.f67359f);
            C25584a aVar = this.f67372a.f67361h;
            if (aVar != null) {
                aVar.mo64609c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment$d */
    static final class C25579d implements OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ AdFormMaskFragment f67373a;

        C25579d(AdFormMaskFragment adFormMaskFragment) {
            this.f67373a = adFormMaskFragment;
        }

        public final void onFocusChange(View view, boolean z) {
            C24567h hVar = new C24567h(z);
            FragmentActivity activity = this.f67373a.getActivity();
            if (activity != null) {
                hVar.f64808b = activity.hashCode();
                C42961az.m136380a(hVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment$e */
    static final class C25580e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdFormMaskFragment f67374a;

        C25580e(AdFormMaskFragment adFormMaskFragment) {
            this.f67374a = adFormMaskFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f67374a.f67360g.mo64706a(3);
            if (this.f67374a.f67360g.mo64708c() && C25371n.m83468b(this.f67374a.getContext(), this.f67374a.f67359f)) {
                return;
            }
            if (C25371n.m83447a(this.f67374a.getContext(), this.f67374a.f67359f, 3) || C25371n.m83444a(this.f67374a.getContext(), 3)) {
                C25584a aVar = this.f67374a.f67361h;
                if (aVar != null) {
                    aVar.mo64609c();
                    return;
                }
                return;
            }
            C25371n.m83474c(this.f67374a.getContext(), this.f67374a.f67359f);
            C25584a aVar2 = this.f67374a.f67361h;
            if (aVar2 != null) {
                aVar2.mo64609c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment$f */
    public static final class C25581f implements C25965c {

        /* renamed from: a */
        final /* synthetic */ AdFormMaskFragment f67375a;

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

        C25581f(AdFormMaskFragment adFormMaskFragment) {
            this.f67375a = adFormMaskFragment;
        }

        /* renamed from: a */
        public final void mo64223a(WebView webView, String str) {
            C25584a aVar = this.f67375a.f67361h;
            if (aVar != null && this.f67375a.f67362i) {
                this.f67375a.mo66356a();
                aVar.mo64606a();
            }
        }

        /* renamed from: a */
        public final void mo64221a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f67375a.f67363j = true;
            C25584a aVar = this.f67375a.f67361h;
            if (aVar != null) {
                aVar.mo64608b();
            }
        }

        /* renamed from: a */
        public final void mo64219a(WebView webView, int i, String str, String str2) {
            this.f67375a.f67363j = true;
            C25584a aVar = this.f67375a.f67361h;
            if (aVar != null) {
                aVar.mo64608b();
            }
        }
    }

    /* renamed from: e */
    private void m84087e() {
        if (this.f67370r != null) {
            this.f67370r.clear();
        }
    }

    /* renamed from: d */
    public final void mo66357d() {
        if (!this.f67363j && !this.f67368p) {
            C24976t.m82155b(getContext(), this.f67359f, null);
            C24976t.m82124ak(getContext(), this.f67359f);
            this.f67368p = true;
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C42961az.m136383d(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(18);
            }
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C25584a aVar = this.f67361h;
        if (aVar != null && !this.f67363j) {
            aVar.mo64607a(this.f67369q);
        }
        m84087e();
    }

    /* renamed from: a */
    public final void mo66356a() {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:(function extra(){");
        sb.append("var aa =document.createElement(\"link\");aa.type='text/css'; aa.rel='stylesheet'; aa.href='https://s3b.bytecdn.cn/ies/static/style/douyin/form.css?=12344567771';document.getElementsByTagName(\"head\")[0].appendChild(aa);");
        sb.append("})();");
        CrossPlatformWebView crossPlatformWebView = this.f67358e;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("mWebView");
        }
        m84084a(crossPlatformWebView).loadUrl(sb.toString());
        CrossPlatformWebView crossPlatformWebView2 = this.f67358e;
        if (crossPlatformWebView2 == null) {
            C7573i.m23583a("mWebView");
        }
        crossPlatformWebView2.postDelayed(new C25577b(this), 3000);
    }

    /* renamed from: a */
    public static final /* synthetic */ CrossPlatformWebView m84085a(AdFormMaskFragment adFormMaskFragment) {
        CrossPlatformWebView crossPlatformWebView = adFormMaskFragment.f67358e;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("mWebView");
        }
        return crossPlatformWebView;
    }

    @C7709l
    public final void onEvent(C25539a aVar) {
        C7573i.m23587b(aVar, "adCardClose");
        C25584a aVar2 = this.f67361h;
        if (aVar2 != null) {
            aVar2.mo64609c();
        }
    }

    /* renamed from: a */
    private static SingleWebView m84084a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView b = ((C26039m) crossPlatformWebView.mo67463a(C26039m.class)).mo67531b();
        C7573i.m23582a((Object) b, "getViewWrap(WebViewWrap::class.java).webView");
        return b;
    }

    @C7709l
    public final void onEvent(C24563d dVar) {
        C7573i.m23587b(dVar, "event");
        if (getActivity() != null) {
            C10761a.m31387a((Context) getActivity(), getString(R.string.e3j)).mo25750a();
        }
        this.f67369q = true;
        C25584a aVar = this.f67361h;
        if (aVar != null) {
            aVar.mo64609c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return;
     */
    @org.greenrobot.eventbus.C7709l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(com.p280ss.android.ugc.aweme.commercialize.views.cards.C25548b r2) {
        /*
            r1 = this;
            java.lang.String r0 = "adCardStatus"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            com.ss.android.ugc.aweme.commercialize.views.form.a r0 = r1.f67361h
            if (r0 == 0) goto L_0x0027
            int r2 = r2.f67299a
            switch(r2) {
                case 0: goto L_0x0023;
                case 1: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0026
        L_0x000f:
            r0.mo64606a()
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = r1.f67358e
            if (r2 != 0) goto L_0x001b
            java.lang.String r0 = "mWebView"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x001b:
            r0 = 0
            r2.setVisibility(r0)
            r1.mo66357d()
            goto L_0x0027
        L_0x0023:
            r0.mo64608b()
        L_0x0026:
            return
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment.onEvent(com.ss.android.ugc.aweme.commercialize.views.cards.b):void");
    }

    public final void onCreate(Bundle bundle) {
        Aweme aweme;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(32);
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("url", "");
            C7573i.m23582a((Object) string, "getString(CrossPlatformParams.BUNDLE_URL, \"\")");
            if (string != null) {
                this.f67367o = C7634n.m23762b(string).toString();
                this.f67362i = arguments.getBoolean("use_css_injection", false);
                String string2 = arguments.getString("aweme_id", "");
                if (((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(string2) != null) {
                    aweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(string2);
                } else {
                    aweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(string2);
                }
                this.f67359f = aweme;
                this.f67360g = new C24723e();
                this.f67360g.mo64699a(getContext(), this.f67359f);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        C42961az.m136382c(this);
    }

    /* renamed from: a */
    private final void m84086a(View view) {
        if (view != null) {
            this.f67364l = (ViewGroup) view;
            ViewGroup viewGroup = this.f67364l;
            if (viewGroup == null) {
                C7573i.m23583a("mRootView");
            }
            viewGroup.setOnClickListener(new C25578c(this));
            View findViewById = view.findViewById(R.id.egh);
            C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.webview)");
            this.f67358e = (CrossPlatformWebView) findViewById;
            CrossPlatformWebView crossPlatformWebView = this.f67358e;
            if (crossPlatformWebView == null) {
                C7573i.m23583a("mWebView");
            }
            crossPlatformWebView.setOnFocusChangeListener(new C25579d(this));
            C25581f fVar = new C25581f(this);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                CrossPlatformWebView crossPlatformWebView2 = this.f67358e;
                if (crossPlatformWebView2 == null) {
                    C7573i.m23583a("mWebView");
                }
                CommercializeWebViewHelper.m82757a(crossPlatformWebView2, fVar, this, activity, getArguments());
            }
            CrossPlatformWebView crossPlatformWebView3 = this.f67358e;
            if (crossPlatformWebView3 == null) {
                C7573i.m23583a("mWebView");
            }
            m84084a(crossPlatformWebView3).setEnableScrollControl(true);
            CrossPlatformWebView crossPlatformWebView4 = this.f67358e;
            if (crossPlatformWebView4 == null) {
                C7573i.m23583a("mWebView");
            }
            m84084a(crossPlatformWebView4).setCanScrollVertically(false);
            CrossPlatformWebView crossPlatformWebView5 = this.f67358e;
            if (crossPlatformWebView5 == null) {
                C7573i.m23583a("mWebView");
            }
            SingleWebChromeClient singleWebChromeClient = m84084a(crossPlatformWebView5).getSingleWebChromeClient();
            if (singleWebChromeClient != null) {
                singleWebChromeClient.f68664b = false;
            }
            if (this.f67362i) {
                CrossPlatformWebView crossPlatformWebView6 = this.f67358e;
                if (crossPlatformWebView6 == null) {
                    C7573i.m23583a("mWebView");
                }
                WebSettings settings = m84084a(crossPlatformWebView6).getSettings();
                String userAgentString = settings.getUserAgentString();
                StringBuilder sb = new StringBuilder();
                sb.append(userAgentString);
                sb.append("/RevealType/Dialog");
                settings.setUserAgentString(sb.toString());
            }
            View findViewById2 = view.findViewById(R.id.bh);
            C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.ad_button)");
            this.f67365m = (DmtTextView) findViewById2;
            DmtTextView dmtTextView = this.f67365m;
            if (dmtTextView == null) {
                C7573i.m23583a("mAdBtn");
            }
            dmtTextView.setOnClickListener(new C25580e(this));
            DmtTextView dmtTextView2 = this.f67365m;
            if (dmtTextView2 == null) {
                C7573i.m23583a("mAdBtn");
            }
            C43081e.m136670a(dmtTextView2);
            View findViewById3 = view.findViewById(R.id.crs);
            C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.replay_button)");
            this.f67366n = (DmtTextView) findViewById3;
            DmtTextView dmtTextView3 = this.f67366n;
            if (dmtTextView3 == null) {
                C7573i.m23583a("mReplayBtn");
            }
            C43081e.m136670a(dmtTextView3);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m84086a(view);
        CrossPlatformWebView crossPlatformWebView = this.f67358e;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("mWebView");
        }
        CrossPlatformWebView.m85411a(crossPlatformWebView, this.f67367o, false, (Map) null, 6, (Object) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.n2, viewGroup, false);
    }
}
