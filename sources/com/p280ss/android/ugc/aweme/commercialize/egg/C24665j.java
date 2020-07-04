package com.p280ss.android.ugc.aweme.commercialize.egg;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1123a.C24638b;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1124b.C24642a;
import com.p280ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.j */
public final class C24665j extends C24642a {

    /* renamed from: a */
    public CrossPlatformWebView f65032a;

    /* renamed from: b */
    public long f65033b;

    /* renamed from: c */
    public boolean f65034c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.j$a */
    static final class C24666a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24665j f65035a;

        /* renamed from: b */
        final /* synthetic */ String f65036b;

        /* renamed from: c */
        final /* synthetic */ FragmentActivity f65037c;

        C24666a(C24665j jVar, String str, FragmentActivity fragmentActivity) {
            this.f65035a = jVar;
            this.f65036b = str;
            this.f65037c = fragmentActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f65035a.f65033b);
            C24638b bVar = this.f65035a.f64984f;
            if (bVar != null) {
                C7573i.m23582a((Object) view, "v");
                bVar.mo64486a(view, currentTimeMillis);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.j$b */
    public static final class C24667b implements C25965c {

        /* renamed from: a */
        final /* synthetic */ C24665j f65038a;

        /* renamed from: b */
        final /* synthetic */ String f65039b;

        /* renamed from: c */
        final /* synthetic */ FragmentActivity f65040c;

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

        /* renamed from: a */
        public final void mo64223a(WebView webView, String str) {
            C24638b bVar = this.f65038a.f64984f;
            if (bVar != null) {
                bVar.mo64485a();
            }
            if (!this.f65038a.f65034c) {
                this.f65038a.f65034c = true;
                this.f65038a.mo64514c();
            }
        }

        C24667b(C24665j jVar, String str, FragmentActivity fragmentActivity) {
            this.f65038a = jVar;
            this.f65039b = str;
            this.f65040c = fragmentActivity;
        }

        /* renamed from: a */
        public final void mo64221a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            CharSequence charSequence;
            C24638b bVar = this.f65038a.f64984f;
            if (bVar != null) {
                bVar.mo64489b();
            }
            String str = null;
            if (VERSION.SDK_INT >= 23) {
                if (webResourceError != null) {
                    charSequence = webResourceError.getDescription();
                } else {
                    charSequence = null;
                }
                if (!(charSequence instanceof String)) {
                    charSequence = null;
                }
                str = (String) charSequence;
            }
            this.f65038a.mo64512a(str);
        }

        /* renamed from: a */
        public final void mo64219a(WebView webView, int i, String str, String str2) {
            C24638b bVar = this.f65038a.f64984f;
            if (bVar != null) {
                bVar.mo64489b();
            }
            this.f65038a.mo64512a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.j$c */
    static final class C24668c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24665j f65041a;

        C24668c(C24665j jVar) {
            this.f65041a = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C24638b bVar = this.f65041a.f64984f;
            if (bVar != null) {
                View view2 = this.f65041a.f65032a;
                C7573i.m23582a((Object) view, "v");
                bVar.mo64487a(view2, view);
            }
        }
    }

    /* renamed from: b */
    public final void mo64513b() {
        if (this.f65032a != null) {
            this.f64987i.removeView(this.f65032a);
            this.f64987i.setVisibility(8);
            CrossPlatformWebView crossPlatformWebView = this.f65032a;
            if (crossPlatformWebView != null) {
                crossPlatformWebView.setVisibility(8);
            }
            this.f65032a = null;
        }
    }

    /* renamed from: a */
    public final void mo64511a() {
        String str;
        boolean z;
        C24641b bVar = this.f64983e;
        if (bVar != null) {
            str = bVar.f64975a;
        } else {
            str = null;
        }
        String str2 = str;
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C24638b bVar2 = this.f64984f;
            if (bVar2 != null) {
                bVar2.mo64489b();
            }
            mo64512a("materialUrl为空");
            return;
        }
        m80836b(str2);
        this.f64987i.setVisibility(0);
        CrossPlatformWebView crossPlatformWebView = this.f65032a;
        if (crossPlatformWebView != null) {
            crossPlatformWebView.setVisibility(0);
        }
        this.f65033b = System.currentTimeMillis();
        CrossPlatformWebView crossPlatformWebView2 = this.f65032a;
        if (crossPlatformWebView2 != null) {
            this.f65034c = false;
            CrossPlatformWebView.m85411a(crossPlatformWebView2, str2, false, (Map) null, 6, (Object) null);
        }
    }

    public C24665j(CommerceEggLayout commerceEggLayout) {
        C7573i.m23587b(commerceEggLayout, "eggLayout");
        super(commerceEggLayout);
    }

    /* renamed from: a */
    private static SingleWebView m80835a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView b = ((C26039m) crossPlatformWebView.mo67463a(C26039m.class)).mo67531b();
        C7573i.m23582a((Object) b, "getViewWrap(WebViewWrap::class.java).webView");
        return b;
    }

    /* renamed from: b */
    private final void m80836b(String str) {
        Context context = this.f64982d;
        if (!(context instanceof FragmentActivity)) {
            context = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity != null) {
            if (this.f65032a == null) {
                CrossPlatformWebView crossPlatformWebView = new CrossPlatformWebView(fragmentActivity, null, 0, 6, null);
                this.f65032a = crossPlatformWebView;
                this.f64987i.addView(this.f65032a);
            }
            CrossPlatformWebView crossPlatformWebView2 = this.f65032a;
            if (crossPlatformWebView2 != null) {
                C24638b bVar = this.f64984f;
                if (bVar != null) {
                    bVar.mo64490b(crossPlatformWebView2, this.f64987i);
                }
                if (VERSION.SDK_INT >= 17) {
                    WebSettings settings = m80835a(crossPlatformWebView2).getSettings();
                    C7573i.m23582a((Object) settings, "it.getRawWebView().settings");
                    settings.setMediaPlaybackRequiresUserGesture(false);
                    m80835a(crossPlatformWebView2).setCanTouch(false);
                }
                crossPlatformWebView2.setOnClickListener(new C24666a(this, str, fragmentActivity));
                C24667b bVar2 = new C24667b(this, str, fragmentActivity);
                Bundle bundle = new Bundle();
                bundle.putString("url", str);
                CommercializeWebViewHelper.m82757a(crossPlatformWebView2, bVar2, fragmentActivity, fragmentActivity, bundle);
            }
            this.f64987i.setOnClickListener(new C24668c(this));
        }
    }
}
