package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.C0043i;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.p1121d.C24611a;
import com.p280ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p280ss.android.ugc.aweme.commercialize.views.cards.C25568n.C25569a;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
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
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2 */
public final class AdHalfWebPageFragmentV2 extends AbsFragment implements C25568n {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f67273e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdHalfWebPageFragmentV2.class), "mWebView", "getMWebView()Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdHalfWebPageFragmentV2.class), "mWebViewCover", "getMWebViewCover()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdHalfWebPageFragmentV2.class), "mCloseBtn", "getMCloseBtn()Landroid/widget/ImageView;"))};

    /* renamed from: h */
    public static final C25540a f67274h = new C25540a(null);

    /* renamed from: f */
    public int f67275f = R.drawable.ao_;

    /* renamed from: g */
    public C25569a f67276g;

    /* renamed from: i */
    private final C7541d f67277i = C7546e.m23569a(new C25544e(this));

    /* renamed from: j */
    private final C7541d f67278j = C7546e.m23569a(new C25545f(this));

    /* renamed from: k */
    private final C7541d f67279k = C7546e.m23569a(new C25543d(this));

    /* renamed from: l */
    private String f67280l = "";

    /* renamed from: m */
    private final C24611a f67281m = new C24611a(false);

    /* renamed from: n */
    private HashMap f67282n;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2$a */
    public static final class C25540a {
        private C25540a() {
        }

        public /* synthetic */ C25540a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static AdHalfWebPageFragmentV2 m83972a(Bundle bundle) {
            C7573i.m23587b(bundle, "args");
            AdHalfWebPageFragmentV2 adHalfWebPageFragmentV2 = new AdHalfWebPageFragmentV2();
            adHalfWebPageFragmentV2.setArguments(bundle);
            return adHalfWebPageFragmentV2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2$b */
    static final class C25541b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageFragmentV2 f67283a;

        C25541b(AdHalfWebPageFragmentV2 adHalfWebPageFragmentV2) {
            this.f67283a = adHalfWebPageFragmentV2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25569a aVar = this.f67283a.f67276g;
            if (aVar != null) {
                aVar.mo66333a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2$c */
    static final class C25542c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageFragmentV2 f67284a;

        C25542c(AdHalfWebPageFragmentV2 adHalfWebPageFragmentV2) {
            this.f67284a = adHalfWebPageFragmentV2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C25569a aVar = this.f67284a.f67276g;
            if (aVar != null) {
                aVar.mo66334b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2$d */
    static final class C25543d extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageFragmentV2 f67285a;

        C25543d(AdHalfWebPageFragmentV2 adHalfWebPageFragmentV2) {
            this.f67285a = adHalfWebPageFragmentV2;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f67285a.mo66303b((int) R.id.x_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2$e */
    static final class C25544e extends Lambda implements C7561a<CrossPlatformWebView> {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageFragmentV2 f67286a;

        C25544e(AdHalfWebPageFragmentV2 adHalfWebPageFragmentV2) {
            this.f67286a = adHalfWebPageFragmentV2;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CrossPlatformWebView invoke() {
            return (CrossPlatformWebView) this.f67286a.mo66303b((int) R.id.egh);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2$f */
    static final class C25545f extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageFragmentV2 f67287a;

        C25545f(AdHalfWebPageFragmentV2 adHalfWebPageFragmentV2) {
            this.f67287a = adHalfWebPageFragmentV2;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return this.f67287a.mo66303b((int) R.id.egj);
        }
    }

    /* renamed from: a */
    public static final AdHalfWebPageFragmentV2 m83953a(Bundle bundle) {
        return C25540a.m83972a(bundle);
    }

    /* renamed from: g */
    private final CrossPlatformWebView m83958g() {
        return (CrossPlatformWebView) this.f67277i.getValue();
    }

    /* renamed from: h */
    private final View m83959h() {
        return (View) this.f67278j.getValue();
    }

    /* renamed from: i */
    private final ImageView m83960i() {
        return (ImageView) this.f67279k.getValue();
    }

    /* renamed from: j */
    private void m83961j() {
        if (this.f67282n != null) {
            this.f67282n.clear();
        }
    }

    /* renamed from: a */
    public final C0043i mo66298a() {
        return this;
    }

    /* renamed from: b */
    public final View mo66303b(int i) {
        if (this.f67282n == null) {
            this.f67282n = new HashMap();
        }
        View view = (View) this.f67282n.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f67282n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: d */
    public final Fragment mo66305d() {
        return this;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m83961j();
    }

    /* renamed from: f */
    public final boolean mo66307f() {
        return this.f67281m.mo64462a();
    }

    /* renamed from: e */
    public final WebView mo66306e() {
        return m83954a(m83958g());
    }

    /* renamed from: c */
    private void m83956c(int i) {
        if (i != 0) {
            this.f67275f = i;
        }
    }

    /* renamed from: a */
    public final void mo66299a(int i) {
        m83956c(i);
    }

    /* renamed from: a */
    private static SingleWebView m83954a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView b = ((C26039m) crossPlatformWebView.mo67463a(C26039m.class)).mo67531b();
        C7573i.m23582a((Object) b, "getViewWrap(WebViewWrap::class.java).webView");
        return b;
    }

    /* renamed from: d */
    private final Drawable m83957d(int i) {
        Drawable drawable = getResources().getDrawable(i);
        if (VERSION.SDK_INT >= 19 && drawable != null) {
            drawable.setAutoMirrored(true);
        }
        C7573i.m23582a((Object) drawable, "image");
        return drawable;
    }

    /* renamed from: b */
    public final void mo66304b(boolean z) {
        if (isViewValid()) {
            m83954a(m83958g()).setCanScrollVertically(z);
        }
    }

    /* renamed from: a */
    public final void mo66300a(C25569a aVar) {
        C7573i.m23587b(aVar, "callback");
        this.f67276g = aVar;
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
            r2.f67280l = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo66301a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C25567m.m84065a(mo66306e(), str);
        }
    }

    /* renamed from: a */
    public final void mo66302a(boolean z) {
        if (isViewValid()) {
            if (z) {
                m83959h().setVisibility(8);
            } else {
                m83959h().setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    private final void m83955a(View view) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            CommercializeWebViewHelper.m82757a(m83958g(), this.f67281m, this, activity, getArguments());
        }
        m83954a(m83958g()).setEnableScrollControl(true);
        m83954a(m83958g()).setCanScrollVertically(false);
        WebSettings settings = m83954a(m83958g()).getSettings();
        C7573i.m23582a((Object) settings, "mWebView.getRawWebView().settings");
        settings.setTextZoom(100);
        SingleWebChromeClient singleWebChromeClient = m83954a(m83958g()).getSingleWebChromeClient();
        if (singleWebChromeClient != null) {
            singleWebChromeClient.f68664b = false;
        }
        m83959h().setOnClickListener(new C25541b(this));
        m83960i().setImageResource(this.f67275f);
        int i = this.f67275f;
        if (i == R.drawable.aoc) {
            m83960i().setPadding(C23486n.m77122a(12.0d), C23486n.m77122a(4.0d), C23486n.m77122a(4.0d), C23486n.m77122a(7.0d));
        } else if (i == R.drawable.aoa) {
            LayoutParams layoutParams = m83960i().getLayoutParams();
            layoutParams.width = C23486n.m77122a(28.0d);
            layoutParams.height = C23486n.m77122a(28.0d);
            m83960i().setLayoutParams(layoutParams);
            m83960i().setPadding(C23486n.m77122a(8.0d), C23486n.m77122a(10.0d), C23486n.m77122a(8.0d), C23486n.m77122a(6.0d));
        } else if (i == R.drawable.aob) {
            Drawable d = m83957d(this.f67275f);
            if (d != null && C43127fh.m136806a(getContext())) {
                m83960i().setImageDrawable(d);
            }
            LayoutParams layoutParams2 = m83960i().getLayoutParams();
            int a = C23486n.m77122a(40.0d);
            layoutParams2.width = a;
            layoutParams2.height = a;
            m83960i().setPadding(0, 0, 0, 0);
        }
        m83960i().setOnClickListener(new C25542c(this));
        C43081e.m136670a(m83960i());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m83955a(view);
        CrossPlatformWebView.m85411a(m83958g(), this.f67280l, false, (Map) null, 6, (Object) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.n3, viewGroup, false);
    }
}
