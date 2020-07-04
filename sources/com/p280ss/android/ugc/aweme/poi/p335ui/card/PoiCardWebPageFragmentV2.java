package com.p280ss.android.ugc.aweme.poi.p335ui.card;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25571p;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.poi.p335ui.card.PoiWebCardContainer.C35297a;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.card.PoiCardWebPageFragmentV2 */
public final class PoiCardWebPageFragmentV2 extends AbsFragment implements C25965c {

    /* renamed from: f */
    public static final C35294a f92507f = new C35294a(null);

    /* renamed from: e */
    public C25571p f92508e;

    /* renamed from: g */
    private CrossPlatformWebView f92509g;

    /* renamed from: h */
    private View f92510h;

    /* renamed from: i */
    private ImageView f92511i;

    /* renamed from: j */
    private String f92512j = "";

    /* renamed from: k */
    private HashMap f92513k;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.card.PoiCardWebPageFragmentV2$a */
    public static final class C35294a {
        private C35294a() {
        }

        public /* synthetic */ C35294a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static PoiCardWebPageFragmentV2 m113937a(Bundle bundle) {
            C7573i.m23587b(bundle, "args");
            PoiCardWebPageFragmentV2 poiCardWebPageFragmentV2 = new PoiCardWebPageFragmentV2();
            poiCardWebPageFragmentV2.setArguments(bundle);
            return poiCardWebPageFragmentV2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.card.PoiCardWebPageFragmentV2$b */
    static final class C35295b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiCardWebPageFragmentV2 f92514a;

        C35295b(PoiCardWebPageFragmentV2 poiCardWebPageFragmentV2) {
            this.f92514a = poiCardWebPageFragmentV2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25571p pVar = this.f92514a.f92508e;
            if (pVar != null) {
                pVar.mo60991a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.card.PoiCardWebPageFragmentV2$c */
    static final class C35296c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiCardWebPageFragmentV2 f92515a;

        C35296c(PoiCardWebPageFragmentV2 poiCardWebPageFragmentV2) {
            this.f92515a = poiCardWebPageFragmentV2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25571p pVar = this.f92515a.f92508e;
            if (pVar != null) {
                pVar.mo60992b();
            }
        }
    }

    /* renamed from: a */
    public static final PoiCardWebPageFragmentV2 m113926a(Bundle bundle) {
        return C35294a.m113937a(bundle);
    }

    /* renamed from: a */
    private void m113927a() {
        if (this.f92513k != null) {
            this.f92513k.clear();
        }
    }

    /* renamed from: a */
    public final void mo64219a(WebView webView, int i, String str, String str2) {
    }

    /* renamed from: a */
    public final void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    /* renamed from: a */
    public final void mo64221a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    /* renamed from: a */
    public final void mo64222a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    /* renamed from: a */
    public final void mo64223a(WebView webView, String str) {
    }

    /* renamed from: a */
    public final void mo64224a(WebView webView, String str, Bitmap bitmap) {
    }

    /* renamed from: b */
    public final boolean mo64225b(WebView webView, String str) {
        return false;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m113927a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r3 == null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto L_0x002a
            java.lang.String r0 = "url"
            java.lang.String r1 = ""
            java.lang.String r3 = r3.getString(r0, r1)
            if (r3 == 0) goto L_0x002a
            if (r3 == 0) goto L_0x0022
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r3 = kotlin.text.C7634n.m23762b(r3)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x002c
            goto L_0x002a
        L_0x0022:
            kotlin.TypeCastException r3 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
            r3.<init>(r0)
            throw r3
        L_0x002a:
            java.lang.String r3 = ""
        L_0x002c:
            r2.f92512j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p335ui.card.PoiCardWebPageFragmentV2.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private final void m113928a(View view) {
        View findViewById = view.findViewById(R.id.egh);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.webview)");
        this.f92509g = (CrossPlatformWebView) findViewById;
        View findViewById2 = view.findViewById(R.id.egj);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.webview_cover)");
        this.f92510h = findViewById2;
        View findViewById3 = view.findViewById(R.id.x_);
        C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.close)");
        this.f92511i = (ImageView) findViewById3;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C7573i.m23582a((Object) activity, "this");
            Activity activity2 = activity;
            CrossPlatformWebView crossPlatformWebView = this.f92509g;
            if (crossPlatformWebView == null) {
                C7573i.m23583a("mWebView");
            }
            C35297a.m113938a(activity2, crossPlatformWebView, this, getArguments(), this);
        }
        View view2 = this.f92510h;
        if (view2 == null) {
            C7573i.m23583a("mWebViewCover");
        }
        view2.setOnClickListener(new C35295b(this));
        ImageView imageView = this.f92511i;
        if (imageView == null) {
            C7573i.m23583a("mCloseBtn");
        }
        imageView.setOnClickListener(new C35296c(this));
        ImageView imageView2 = this.f92511i;
        if (imageView2 == null) {
            C7573i.m23583a("mCloseBtn");
        }
        C43081e.m136670a(imageView2);
    }

    /* renamed from: a */
    public final void mo89830a(C25571p pVar) {
        C7573i.m23587b(pVar, "listener");
        this.f92508e = pVar;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m113928a(view);
        CrossPlatformWebView crossPlatformWebView = this.f92509g;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("mWebView");
        }
        CrossPlatformWebView.m85411a(crossPlatformWebView, this.f92512j, false, (Map) null, 6, (Object) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.pv, viewGroup, false);
    }
}
