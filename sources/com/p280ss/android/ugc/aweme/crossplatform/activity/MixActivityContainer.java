package com.p280ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Space;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.C23255b;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.commerce.service.logs.C24465c;
import com.p280ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25833b;
import com.p280ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.C25862i;
import com.p280ss.android.ugc.aweme.crossplatform.business.C25862i.C25863a;
import com.p280ss.android.ugc.aweme.crossplatform.business.DownloadBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.OpenUrlHintBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.QuickShopBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.ReportBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.ShareBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.WalletBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.p1151a.C25809a;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25964b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.crossplatform.prefetch.C25996d;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26025c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26035i;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26036j;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26038l;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.C26004a;
import com.p280ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.p1003am.C22491a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.p1216fe.method.CloseMethod.C27880b;
import com.p280ss.android.ugc.aweme.p1216fe.method.GetWebViewInfo.C27890b;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43020co;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer */
public class MixActivityContainer extends AbsActivityContainer implements DefaultHardwareBackBtnHandler, C26036j {

    /* renamed from: a */
    public final Activity f68256a;

    /* renamed from: b */
    public final C25886b f68257b;

    /* renamed from: c */
    public final C25862i f68258c;

    /* renamed from: d */
    public C25821f f68259d;

    /* renamed from: e */
    public C25965c f68260e;

    /* renamed from: f */
    public String f68261f;

    /* renamed from: g */
    public C25824i f68262g;

    /* renamed from: h */
    public CrossPlatformTitleBar f68263h;

    /* renamed from: i */
    public Space f68264i;

    /* renamed from: j */
    private C26025c f68265j;

    /* renamed from: k */
    private C25965c f68266k;

    /* renamed from: l */
    private String f68267l;

    /* renamed from: m */
    private long f68268m;

    /* renamed from: n */
    private boolean f68269n;

    /* renamed from: o */
    private ImmersionBar f68270o;

    /* renamed from: p */
    private OpenURLHintLayout f68271p;

    /* renamed from: q */
    private GradualChangeLinearLayout f68272q;

    /* renamed from: r */
    private long f68273r;

    /* renamed from: s */
    private final Set<C23255b> f68274s = new HashSet();

    /* renamed from: e */
    public final C25965c mo65876e() {
        return this.f68266k;
    }

    /* renamed from: f */
    public final C26025c mo65877f() {
        return this.f68265j;
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return this.f68256a;
    }

    public final C25862i getCrossPlatformBusiness() {
        return this.f68258c;
    }

    public final C25886b getCrossPlatformParams() {
        return this.f68257b;
    }

    @C0054q(mo125a = Event.ON_STOP)
    public final void onStop() {
        this.f68269n = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo67088a() {
        if (TextUtils.isEmpty(this.f68257b.f68473a.f68430c)) {
            return false;
        }
        boolean t = m84862t();
        this.f68258c.mo67232a(this.f68257b);
        return t;
    }

    /* renamed from: a */
    public final boolean mo67089a(String str, int i) {
        return C7195s.m22438a().mo18680a(this.f68256a, str, i);
    }

    /* renamed from: a */
    public final boolean mo60523a(int i, int i2, Intent intent) {
        this.f68258c.mo67230a(WalletBusiness.class);
        WalletBusiness.m85078a(mo65877f().getCurrentUrl(), i, i2, intent);
        HashSet<C23255b> hashSet = new HashSet<>();
        synchronized (this.f68274s) {
            hashSet.addAll(this.f68274s);
        }
        if (!hashSet.isEmpty()) {
            for (C23255b a : hashSet) {
                a.mo60523a(i, i2, intent);
            }
        }
        return false;
    }

    /* renamed from: A */
    private int m84854A() {
        return C25833b.m84943a(this.f68256a);
    }

    /* renamed from: g */
    public final void mo65878g() {
        this.f68265j.mo65878g();
    }

    /* renamed from: h */
    public final boolean mo65882h() {
        return this.f68265j.mo65882h();
    }

    public final void invokeDefaultOnBackPressed() {
        this.f68256a.finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo67093j() {
        C22491a.m74384a(this.f68256a);
    }

    /* renamed from: l */
    public final void mo67095l() {
        this.f68256a.finish();
    }

    /* renamed from: B */
    private void m84855B() {
        mo65877f().setFullScreen(new C25964b() {
            /* renamed from: a */
            public final void mo67131a() {
                MixActivityContainer.this.mo65875d();
            }

            /* renamed from: b */
            public final void mo67132b() {
                MixActivityContainer.this.mo67122p();
            }
        });
    }

    /* renamed from: d */
    public final void mo65875d() {
        this.f68263h.setVisibility(8);
        this.f68264i.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo67092i() {
        mo65877f().mo67479b(this.f68256a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo67094k() {
        m84863u();
        mo65877f().mo67465a(this.f68256a);
        m84868z();
    }

    /* renamed from: q */
    public final void mo67123q() {
        if (!mo65877f().mo67477a()) {
            m84858E();
        }
    }

    /* renamed from: F */
    private static boolean m84859F() {
        try {
            return C30199h.m98861a().getAdLandingPageConfig().getEnableDynamicNavbar().booleanValue();
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: u */
    private void m84863u() {
        this.f68265j = (C26025c) m84860a((int) R.id.a5b);
        this.f68265j.setCrossPlatformActivityContainer(this);
        m84864v();
        m84865w();
    }

    /* renamed from: y */
    private void m84867y() {
        if (getCrossPlatformParams().f68476d.f68515j) {
            this.f68262g.mo67142a("copylink", 4);
        }
    }

    /* renamed from: m */
    public final void mo67109m() {
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f68258c.mo67230a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.mo67203c();
        }
        PreRenderWebViewBusiness a = PreRenderWebViewBusiness.m85051a(this.f68258c, this.f68257b);
        if (a != null) {
            a.mo67205a();
        }
    }

    /* renamed from: o */
    public final void mo67111o() {
        this.f68267l = "1";
        this.f68264i.setVisibility(8);
        ((GradualChangeLinearLayout) m84860a((int) R.id.brg)).setGradualChangeMode(false);
        this.f68263h.mo67446a();
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
        this.f68268m = System.currentTimeMillis();
        C42961az.m136382c(this);
        QuickShopBusiness quickShopBusiness = (QuickShopBusiness) getCrossPlatformBusiness().mo67230a(QuickShopBusiness.class);
        if (quickShopBusiness != null) {
            quickShopBusiness.mo67210a();
        }
    }

    /* renamed from: r */
    public final void mo67124r() {
        ((ShareBusiness) getCrossPlatformBusiness().mo67230a(ShareBusiness.class)).mo67158a(mo65877f().getCurrentUrl());
    }

    /* renamed from: C */
    private void m84856C() {
        this.f68267l = "2";
        this.f68264i.setVisibility(0);
        GradualChangeLinearLayout gradualChangeLinearLayout = (GradualChangeLinearLayout) m84860a((int) R.id.brg);
        gradualChangeLinearLayout.setTitleBar(this.f68263h);
        gradualChangeLinearLayout.setGradualChangeMode(true);
        this.f68263h.mo67447b();
    }

    /* renamed from: D */
    private void m84857D() {
        this.f68267l = "3";
        if (getCrossPlatformParams().f68476d.f68521p) {
            mo65875d();
            return;
        }
        ((GradualChangeLinearLayout) m84860a((int) R.id.brg)).setGradualChangeMode(false);
        this.f68264i.setVisibility(0);
        this.f68263h.mo67448c();
    }

    /* renamed from: E */
    private void m84858E() {
        String str = getCrossPlatformParams().f68473a.f68440m;
        QuickShopBusiness quickShopBusiness = (QuickShopBusiness) getCrossPlatformBusiness().mo67230a(QuickShopBusiness.class);
        if (quickShopBusiness != null) {
            quickShopBusiness.mo67214a(str);
        }
        C22984d a = C22984d.m75611a();
        a.mo59973a("method", this.f68261f);
        C6907h.m21524a("h5_leave_detail", (Map) a.f60753a);
        if (this.f68259d != null) {
            this.f68259d.mo67133a();
        }
    }

    /* renamed from: v */
    private void m84864v() {
        this.f68266k = new C25965c() {
            /* renamed from: b */
            public final boolean mo64225b(WebView webView, String str) {
                if (MixActivityContainer.this.f68260e != null) {
                    return MixActivityContainer.this.f68260e.mo64225b(webView, str);
                }
                return false;
            }

            /* renamed from: a */
            public final void mo64223a(WebView webView, String str) {
                if (MixActivityContainer.this.f68260e != null) {
                    MixActivityContainer.this.f68260e.mo64223a(webView, str);
                }
            }

            /* renamed from: a */
            public final void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                if (MixActivityContainer.this.f68260e != null) {
                    MixActivityContainer.this.f68260e.mo64220a(webView, sslErrorHandler, sslError);
                }
            }

            /* renamed from: a */
            public final void mo64222a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (MixActivityContainer.this.f68260e != null) {
                    MixActivityContainer.this.f68260e.mo64222a(webView, webResourceRequest, webResourceResponse);
                }
            }

            /* renamed from: a */
            public final void mo64221a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame() && MixActivityContainer.this.getCrossPlatformParams().f68476d.f68521p) {
                    if (!MixActivityContainer.this.f68257b.f68476d.f68517l) {
                        MixActivityContainer.this.mo67111o();
                        return;
                    } else {
                        MixActivityContainer.this.f68263h.setVisibility(0);
                        MixActivityContainer.this.f68264i.setVisibility(0);
                    }
                }
                if (MixActivityContainer.this.f68260e != null) {
                    MixActivityContainer.this.f68260e.mo64221a(webView, webResourceRequest, webResourceError);
                }
            }

            /* renamed from: a */
            public final void mo64224a(WebView webView, String str, Bitmap bitmap) {
                if (MixActivityContainer.this.f68260e != null) {
                    MixActivityContainer.this.f68260e.mo64224a(webView, str, bitmap);
                }
            }

            /* renamed from: a */
            public final void mo64219a(WebView webView, int i, String str, String str2) {
                if (MixActivityContainer.this.getCrossPlatformParams().f68476d.f68521p) {
                    if (!MixActivityContainer.this.f68257b.f68476d.f68517l) {
                        MixActivityContainer.this.mo67111o();
                        return;
                    } else {
                        MixActivityContainer.this.f68263h.setVisibility(0);
                        MixActivityContainer.this.f68264i.setVisibility(0);
                    }
                }
                if (MixActivityContainer.this.f68260e != null) {
                    MixActivityContainer.this.f68260e.mo64219a(webView, i, str, str2);
                }
            }
        };
        if (TextUtils.equals("1", this.f68257b.f68477e.f68532a)) {
            ((C26039m) mo65877f().mo67463a(C26039m.class)).mo67531b().setLoadNoCache();
        }
    }

    /* renamed from: x */
    private void m84866x() {
        this.f68263h = (CrossPlatformTitleBar) m84860a((int) R.id.a5d);
        this.f68264i = (Space) m84860a((int) R.id.c3a);
        this.f68263h.setCrossPlatformParams(getCrossPlatformParams());
        this.f68263h.setTitleWrap(new C26004a() {
            /* renamed from: a */
            public final void mo67126a() {
                MixActivityContainer.this.f68261f = "click_button";
                MixActivityContainer.this.mo67123q();
            }

            /* renamed from: d */
            public final void mo67130d() {
                if (MixActivityContainer.this.f68259d != null) {
                    MixActivityContainer.this.f68259d.mo67133a();
                }
            }

            /* renamed from: b */
            public final void mo67128b() {
                ((ReportBusiness) MixActivityContainer.this.f68258c.mo67230a(ReportBusiness.class)).mo67215a(MixActivityContainer.this.f68256a);
            }

            /* renamed from: c */
            public final void mo67129c() {
                if (MixActivityContainer.this.mo65882h()) {
                    ((ShareBusiness) MixActivityContainer.this.f68258c.mo67230a(ShareBusiness.class)).mo67162b(((C26039m) MixActivityContainer.this.mo65877f().mo67463a(C26039m.class)).mo67531b());
                } else {
                    ((ShareBusiness) MixActivityContainer.this.f68258c.mo67230a(ShareBusiness.class)).mo67164c();
                }
            }

            /* renamed from: a */
            public final void mo67127a(View view) {
                if (MixActivityContainer.this.f68262g.mo67143b()) {
                    MixActivityContainer.this.f68262g.mo67140a().showAsDropDown(view, 0, -12);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo67090b() {
        if (getCrossPlatformParams().f68473a.f68428a.intValue() == 1) {
            this.f68261f = "phone_press";
            mo67123q();
            return;
        }
        if (!mo65877f().mo67477a() && this.f68259d != null) {
            this.f68259d.mo67133a();
        }
    }

    /* renamed from: c */
    public final void mo65874c() {
        if (this.f68270o != null) {
            this.f68270o.destroy();
            this.f68270o = null;
        }
        this.f68270o = C25833b.m84947a(getCrossPlatformParams(), this.f68256a);
        if (C6399b.m19944t()) {
            C43020co.m136533a(this.f68256a, this.f68256a.getResources().getColor(R.color.a5o));
        }
    }

    /* renamed from: n */
    public final void mo67110n() {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f68258c.mo67230a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo67172a(true);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f68258c.mo67230a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.mo67204d();
        }
        PreRenderWebViewBusiness a = PreRenderWebViewBusiness.m85051a(this.f68258c, this.f68257b);
        if (a != null) {
            a.mo67209b();
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.f68270o != null) {
            this.f68270o.destroy();
        }
        if (this.f68265j != null) {
            this.f68265j.mo67493g(this.f68256a);
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f68258c.mo67230a(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.mo67195d();
        }
        C42961az.m136383d(this);
    }

    /* renamed from: p */
    public final void mo67122p() {
        if (!this.f68257b.f68476d.f68517l) {
            mo67111o();
        } else if (!getCrossPlatformParams().f68476d.f68521p) {
            this.f68263h.setVisibility(0);
            this.f68264i.setVisibility(0);
        }
    }

    /* renamed from: s */
    public final void mo67125s() {
        if (!this.f68256a.isFinishing()) {
            this.f68272q.setBackgroundColor(this.f68257b.f68476d.f68529x);
            if (((C26039m) mo65877f().mo67463a(C26039m.class)).mo67531b().canGoBack()) {
                this.f68263h.mo67449d();
            } else {
                this.f68263h.mo67450e();
            }
        }
    }

    /* renamed from: z */
    private void m84868z() {
        if (!getCrossPlatformParams().f68473a.f68438k) {
            if (getCrossPlatformParams().f68473a.f68428a.intValue() == 2) {
                mo65877f().setDefaultHardwareBackBtnHandler(this);
                ((C26035i) mo65877f().mo67463a(C26035i.class)).mo67528a(getCrossPlatformParams());
                return;
            }
            ((C26039m) mo65877f().mo67463a(C26039m.class)).mo67530a(C25833b.m84955a(getCrossPlatformParams().f68473a.f68430c, m84854A()));
        }
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public final void onPause() {
        mo65877f().mo67488d(this.f68256a);
        long currentTimeMillis = System.currentTimeMillis() - this.f68273r;
        this.f68273r = 0;
        C22984d a = C22984d.m75611a();
        a.mo59971a("duration", currentTimeMillis);
        C6907h.m21524a("h5_stay_time", (Map) a.f60753a);
        ((DownloadBusiness) this.f68258c.mo67230a(DownloadBusiness.class)).mo67180a(this.f68256a);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f68258c.mo67230a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo67172a(false);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f68258c.mo67230a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.mo67202b();
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        mo65877f().mo67484c(this.f68256a);
        this.f68258c.mo67231a();
        this.f68273r = System.currentTimeMillis();
        ((DownloadBusiness) this.f68258c.mo67230a(DownloadBusiness.class)).mo67181a(this.f68256a, (C26039m) mo65877f().mo67463a(C26039m.class));
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f68258c.mo67230a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo67166a();
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f68258c.mo67230a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.mo67200a();
        }
        this.f68269n = true;
    }

    /* renamed from: t */
    private boolean m84862t() {
        JSONObject jSONObject;
        if (getCrossPlatformParams().f68473a.f68428a.intValue() == 1) {
            if (getCrossPlatformParams().f68473a.f68436i) {
                C19282c.m63182a(this.f68256a, C22912d.f60642b, "push");
            }
            if (!C6319n.m19593a(getCrossPlatformParams().f68474b.f68455j)) {
                if (!C6319n.m19593a(getCrossPlatformParams().f68474b.f68456k)) {
                    try {
                        jSONObject = new JSONObject(getCrossPlatformParams().f68474b.f68456k);
                    } catch (Exception unused) {
                    }
                    C19282c.m63185a(this.f68256a.getApplicationContext(), "wap_stat", "wap_enter", getCrossPlatformParams().f68474b.f68455j, 0, 0, jSONObject);
                }
                jSONObject = null;
                C19282c.m63185a(this.f68256a.getApplicationContext(), "wap_stat", "wap_enter", getCrossPlatformParams().f68474b.f68455j, 0, 0, jSONObject);
            }
            if (TextUtils.isEmpty(getCrossPlatformParams().f68473a.f68430c)) {
                return false;
            }
            return C19929d.m65759a(getCrossPlatformParams().f68473a.f68430c);
        } else if (getCrossPlatformParams().f68475c.f68499j != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: w */
    private void m84865w() {
        this.f68271p = (OpenURLHintLayout) m84860a((int) R.id.a5c);
        this.f68272q = (GradualChangeLinearLayout) m84860a((int) R.id.brg);
        if (this.f68257b.f68476d.f68511f != -2) {
            this.f68272q.setBackgroundColor(this.f68257b.f68476d.f68511f);
        } else {
            this.f68272q.setBackgroundColor(this.f68256a.getResources().getColor(R.color.a6c));
        }
        m84866x();
        this.f68262g = new C25824i(this.f68256a, this);
        new C25827l(this.f68256a, this).mo67145a();
        new C25818c(this.f68256a, this).mo67134a();
        ((ShareBusiness) this.f68258c.mo67230a(ShareBusiness.class)).mo67157a((WebView) ((C26039m) mo65877f().mo67463a(C26039m.class)).mo67531b());
        if (this.f68257b.f68476d.f68525t) {
            C10741a aVar = new C10741a(this.f68256a);
            aVar.mo25657b((int) R.string.cnn).mo25658b((int) R.string.afy, C25823h.f68286a);
            aVar.mo25656a().mo25637a();
        }
        m84867y();
        mo65877f().getViewStatusRegistry().mo67540a((C26036j) this);
        this.f68258c.mo67230a(OpenUrlHintBusiness.class);
        OpenUrlHintBusiness.m85018a(this.f68271p, this.f68257b.f68473a.f68437j);
        m84855B();
        if (getCrossPlatformParams().f68476d.f68521p) {
            mo65875d();
        }
        if (this.f68257b.f68476d.f68518m == null || C6399b.m19944t() || !m84859F()) {
            if (!this.f68257b.f68476d.f68517l) {
                mo67111o();
            }
        } else if ("1".equals(this.f68257b.f68476d.f68518m)) {
            mo67111o();
        } else if ("2".equals(this.f68257b.f68476d.f68518m)) {
            m84856C();
        }
        if (getCrossPlatformParams().f68476d.f68519n) {
            m84860a((int) R.id.a5c).setPadding(0, C43098ej.m136713b(), 0, 0);
        }
    }

    /* renamed from: a */
    private <T extends View> T m84860a(int i) {
        return this.f68256a.findViewById(i);
    }

    /* renamed from: a */
    public final <T extends C26038l> T mo67082a(Class<T> cls) {
        return mo65877f().mo67463a(cls);
    }

    /* renamed from: b */
    public final void mo67091b(C23255b bVar) {
        synchronized (this.f68274s) {
            this.f68274s.remove(bVar);
        }
    }

    /* renamed from: b */
    public final void mo65873b(String str) {
        ((C26039m) mo65877f().mo67463a(C26039m.class)).mo67530a(str);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f68258c.mo67230a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo67166a();
        }
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        if (this.f68269n && aVar != null && aVar.f61317a != null && aVar.f61317a.contains("/aweme/v1/poi/aweme/?")) {
            C42961az.m136385f(aVar);
            mo65877f().mo67466a(aVar);
        }
    }

    @C7709l
    public final void onEvent(ShareCompleteEvent shareCompleteEvent) {
        if (TextUtils.equals("web", shareCompleteEvent.itemType)) {
            C43091ed.m136696a(this.f68256a, this.f68263h, shareCompleteEvent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67084a(Configuration configuration) {
        this.f68271p.setLayoutParams(new LayoutParams(Double.valueOf((double) C9738o.m28708b((Context) this.f68256a, (float) configuration.screenWidthDp)).intValue(), Double.valueOf((double) C9738o.m28708b((Context) this.f68256a, (float) configuration.screenHeightDp)).intValue()));
    }

    @C7709l
    public final void onEvent(C25809a aVar) {
        if (aVar != null && aVar.f68237a != null && m84859F()) {
            String str = aVar.f68237a;
            char c = 65535;
            if (str.hashCode() == 51 && str.equals("3")) {
                c = 0;
            }
            if (c == 0 && "1".equals(this.f68267l)) {
                m84857D();
            }
        }
    }

    /* renamed from: a */
    public final void mo67085a(C23255b bVar) {
        synchronized (this.f68274s) {
            this.f68274s.add(bVar);
        }
    }

    @C7709l
    public void onEvent(C27880b bVar) {
        if (bVar != null && bVar.f73455a != 0) {
            C26025c f = mo65877f();
            if (f != null) {
                C26039m mVar = (C26039m) f.mo67463a(C26039m.class);
                if (mVar != null) {
                    SingleWebView b = mVar.mo67531b();
                    if (!(b == null || this.f68259d == null || b.hashCode() != bVar.f73455a)) {
                        this.f68259d.mo67133a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67086a(C25821f fVar) {
        this.f68259d = fVar;
    }

    @C7709l
    public final void invokeRenderTimeEvent(C27994k kVar) {
        if (this.f68269n && kVar.f73730b != null) {
            if (TextUtils.equals("goods_rn_page_monitor", kVar.f73730b.optString("eventName"))) {
                C24465c cVar = new C24465c();
                try {
                    JSONObject jSONObject = kVar.f73730b.getJSONObject("data");
                    cVar.mo63547b(Long.valueOf(jSONObject.optString("interact_render_ts")).longValue() - this.f68268m);
                    cVar.mo63548b(jSONObject.optString("page_id"));
                    cVar.mo63545a(Long.valueOf(jSONObject.optString("ender_render_ts")).longValue() - this.f68268m);
                    cVar.mo63546a(jSONObject.optString("session_id"));
                    cVar.mo63549c();
                } catch (Exception unused) {
                }
            } else if (TextUtils.equals("hybrid_prefetch_duration_monitor", kVar.f73730b.optString("eventName"))) {
                C25996d dVar = new C25996d();
                try {
                    JSONObject jSONObject2 = kVar.f73730b.getJSONObject("data");
                    dVar.mo67437a(Long.valueOf(jSONObject2.optString("duration")).longValue());
                    dVar.mo67439b(jSONObject2.optString("duration_type"));
                    dVar.mo67440c(jSONObject2.optString("is_cache"));
                    dVar.mo67438a(jSONObject2.optString("page_id"));
                    if (this.f68265j != null) {
                        dVar.f68719d = this.f68265j.getMonitorSession();
                    }
                    dVar.mo63537a();
                } catch (Exception unused2) {
                }
            }
        }
    }

    @C7709l
    public void onEvent(C27890b bVar) {
        PreRenderWebViewBusiness a = PreRenderWebViewBusiness.m85051a(this.f68258c, this.f68257b);
        if (a != null) {
            a.mo67207a(mo65877f(), bVar);
        } else if (bVar != null && bVar.f73474b != null && bVar.f73473a != 0) {
            SingleWebView b = ((C26039m) mo65877f().mo67463a(C26039m.class)).mo67531b();
            if (b != null && b.hashCode() == bVar.f73473a) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", C29956a.f78750c);
                    jSONObject.put("preloadType", 0);
                } catch (JSONException unused) {
                }
                bVar.f73474b.mo71365a(jSONObject);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67087a(C25965c cVar) {
        this.f68260e = cVar;
    }

    /* renamed from: a */
    public final void mo65872a(String str) {
        mo65871a((CharSequence) str, true);
    }

    MixActivityContainer(Activity activity, C25886b bVar) {
        this.f68256a = activity;
        this.f68257b = bVar;
        this.f68258c = C25863a.m85098a(this);
    }

    /* renamed from: a */
    public final void mo67083a(int i, Intent intent) {
        this.f68256a.setResult(50000, intent);
    }

    /* renamed from: a */
    public final void mo65871a(CharSequence charSequence, boolean z) {
        if (this.f68263h != null) {
            if ((TextUtils.isEmpty(charSequence) || !C25833b.m84961a(charSequence)) && this.f68257b.f68473a.f68428a != null && this.f68257b.f68473a.f68428a.intValue() == 1 && (this.f68257b.f68476d.f68526u || z)) {
                this.f68263h.setTitle(charSequence);
            }
        }
    }
}
