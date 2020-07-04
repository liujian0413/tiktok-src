package com.p280ss.android.ugc.aweme.commercialize.views.form;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24563d;
import com.p280ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26025c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2 */
public final class BottomFormDialogV2 extends AmeSSActivity {

    /* renamed from: a */
    public Aweme f67376a;

    /* renamed from: b */
    public int f67377b;

    /* renamed from: c */
    public boolean f67378c;

    /* renamed from: d */
    private CrossPlatformWebView f67379d;

    /* renamed from: e */
    private ImageView f67380e;

    /* renamed from: f */
    private String f67381f = "";

    /* renamed from: g */
    private boolean f67382g;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2$a */
    static final class C25582a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomFormDialogV2 f67383a;

        C25582a(BottomFormDialogV2 bottomFormDialogV2) {
            this.f67383a = bottomFormDialogV2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f67383a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2$b */
    public static final class C25583b implements C25965c {

        /* renamed from: a */
        final /* synthetic */ BottomFormDialogV2 f67384a;

        /* renamed from: a */
        public final void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
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

        C25583b(BottomFormDialogV2 bottomFormDialogV2) {
            this.f67384a = bottomFormDialogV2;
        }

        /* renamed from: a */
        public final void mo64221a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (this.f67384a.f67377b == 8) {
                C24976t.m82122ai(this.f67384a, this.f67384a.f67376a);
                return;
            }
            if (this.f67384a.f67377b == 2 || this.f67384a.f67377b == 10) {
                C24976t.m82127an(this.f67384a, this.f67384a.f67376a);
            }
        }

        /* renamed from: a */
        public final void mo64222a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (!this.f67384a.f67378c) {
                if (this.f67384a.f67377b == 8) {
                    C24976t.m82122ai(this.f67384a, this.f67384a.f67376a);
                    this.f67384a.f67378c = true;
                    return;
                }
                if (this.f67384a.f67377b == 2 || this.f67384a.f67377b == 10) {
                    C24976t.m82127an(this.f67384a, this.f67384a.f67376a);
                    this.f67384a.f67378c = true;
                }
            }
        }

        /* renamed from: a */
        public final void mo64219a(WebView webView, int i, String str, String str2) {
            if (this.f67384a.f67377b == 8) {
                C24976t.m82122ai(this.f67384a, this.f67384a.f67376a);
                return;
            }
            if (this.f67384a.f67377b == 2 || this.f67384a.f67377b == 10) {
                C24976t.m82127an(this.f67384a, this.f67384a.f67376a);
            }
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        View currentFocus = getCurrentFocus();
        C25713b.m84474a((Activity) this, currentFocus);
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        super.finish();
        overridePendingTransition(R.anim.ae, R.anim.af);
    }

    /* renamed from: a */
    private final void m84101a() {
        View findViewById = findViewById(R.id.egh);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.webview)");
        this.f67379d = (CrossPlatformWebView) findViewById;
        View findViewById2 = findViewById(R.id.x_);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.close)");
        this.f67380e = (ImageView) findViewById2;
        ImageView imageView = this.f67380e;
        if (imageView == null) {
            C7573i.m23583a("mCloseBtn");
        }
        imageView.setOnClickListener(new C25582a(this));
    }

    public final void onDestroy() {
        super.onDestroy();
        if (!this.f67382g) {
            if (this.f67377b == 8) {
                C24976t.m82121ah(this, this.f67376a);
            } else if (this.f67377b == 2 || this.f67377b == 10) {
                C24976t.m82126am(this, this.f67376a);
            }
        }
        C42961az.m136383d(this);
    }

    /* renamed from: b */
    private final void m84102b() {
        C25583b bVar = new C25583b(this);
        CrossPlatformWebView crossPlatformWebView = this.f67379d;
        if (crossPlatformWebView == null) {
            C7573i.m23583a("mWebView");
        }
        C26025c cVar = crossPlatformWebView;
        C25965c cVar2 = bVar;
        C0043i iVar = this;
        Activity activity = this;
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        CommercializeWebViewHelper.m82757a(cVar, cVar2, iVar, activity, intent.getExtras());
        CrossPlatformWebView crossPlatformWebView2 = this.f67379d;
        if (crossPlatformWebView2 == null) {
            C7573i.m23583a("mWebView");
        }
        SingleWebView a = m84100a(crossPlatformWebView2);
        WebSettings settings = a.getSettings();
        C7573i.m23582a((Object) settings, "settings");
        String userAgentString = settings.getUserAgentString();
        StringBuilder sb = new StringBuilder();
        sb.append(userAgentString);
        sb.append("/RevealType/Dialog");
        settings.setUserAgentString(sb.toString());
        a.setLayerType(1, null);
        CrossPlatformWebView crossPlatformWebView3 = this.f67379d;
        if (crossPlatformWebView3 == null) {
            C7573i.m23583a("mWebView");
        }
        CrossPlatformWebView.m85411a(crossPlatformWebView3, this.f67381f, false, (Map) null, 6, (Object) null);
    }

    /* renamed from: c */
    private final void m84103c() {
        Aweme aweme;
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("url", "");
            C7573i.m23582a((Object) string, "getString(CrossPlatformParams.BUNDLE_URL, \"\")");
            if (string != null) {
                this.f67381f = C7634n.m23762b(string).toString();
                this.f67377b = extras.getInt("click_from");
                String string2 = extras.getString("aweme_id", "");
                if (((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(string2) != null) {
                    aweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(string2);
                } else {
                    aweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(string2);
                }
                this.f67376a = aweme;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    public final void dismiss(View view) {
        C7573i.m23587b(view, "view");
        finish();
    }

    /* renamed from: a */
    private static SingleWebView m84100a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView b = ((C26039m) crossPlatformWebView.mo67463a(C26039m.class)).mo67531b();
        C7573i.m23582a((Object) b, "getViewWrap(WebViewWrap::class.java).webView");
        return b;
    }

    @C7709l
    public final void onEvent(C24563d dVar) {
        C7573i.m23587b(dVar, "event");
        C10761a.m31387a((Context) AwemeApplication.m21341a(), getString(R.string.e3j)).mo25750a();
        this.f67382g = true;
        finish();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.an);
        getWindow().setSoftInputMode(19);
        C42961az.m136382c(this);
        m84103c();
        m84101a();
        m84102b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onCreate", false);
    }
}
