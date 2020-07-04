package com.p280ss.android.ugc.aweme.commercialize.views;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnScrollChangeListener;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.sdk.webview.DMTJsBridge;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.model.C24990c;
import com.p280ss.android.ugc.aweme.commercialize.model.C24990c.C24991a;
import com.p280ss.android.ugc.aweme.commercialize.model.C25004m;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25215ab;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25215ab.C25216a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25267bf;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25271bj;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25367k;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25369m;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25369m.C25370a;
import com.p280ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p280ss.android.ugc.aweme.commercialize.views.AdBottomSheetContainer.C25389b;
import com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog;
import com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog.C25513a;
import com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog.C25515c;
import com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog;
import com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog.OptionListPickerDialog.C25524a;
import com.p280ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26025c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.p1216fe.method.GetWebViewInfo.C27890b;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView */
public final class AdLightWebPageView extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f66884a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdLightWebPageView.class), "mBottomSheet", "getMBottomSheet()Lcom/ss/android/ugc/aweme/commercialize/views/AdBottomSheetContainer;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdLightWebPageView.class), "mLightWebPage", "getMLightWebPage()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdLightWebPageView.class), "mWebView", "getMWebView()Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdLightWebPageView.class), "mCloseView", "getMCloseView()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdLightWebPageView.class), "mErrorView", "getMErrorView()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdLightWebPageView.class), "mRetryView", "getMRetryView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: j */
    public static final C25420c f66885j = new C25420c(null);

    /* renamed from: b */
    public View f66886b;

    /* renamed from: c */
    public C25215ab f66887c;

    /* renamed from: d */
    public C25271bj f66888d;

    /* renamed from: e */
    public CommercializeWebViewHelper f66889e;

    /* renamed from: f */
    public String f66890f;

    /* renamed from: g */
    public long f66891g;

    /* renamed from: h */
    public boolean f66892h;

    /* renamed from: i */
    public String f66893i;

    /* renamed from: k */
    private final C7541d f66894k;

    /* renamed from: l */
    private final C7541d f66895l;

    /* renamed from: m */
    private final C7541d f66896m;

    /* renamed from: n */
    private final C7541d f66897n;

    /* renamed from: o */
    private final C7541d f66898o;

    /* renamed from: p */
    private final C7541d f66899p;

    /* renamed from: q */
    private C25421d f66900q;

    /* renamed from: r */
    private C25419b f66901r;

    /* renamed from: s */
    private final C25369m f66902s;

    /* renamed from: t */
    private boolean f66903t;

    /* renamed from: u */
    private C25423e f66904u;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$a */
    public static final class C25418a implements C25370a {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66905a;

        /* renamed from: c */
        public final void mo65930c() {
            m83608a("preload_break", null);
        }

        /* renamed from: a */
        public final void mo65927a() {
            this.f66905a.getMErrorView().setVisibility(8);
            View findViewById = this.f66905a.getMWebView().findViewById(R.id.afp);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            m83608a("preload_start", null);
        }

        /* renamed from: b */
        public final void mo65929b() {
            this.f66905a.getMErrorView().setVisibility(0);
            View findViewById = this.f66905a.getMWebView().findViewById(R.id.afp);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            m83608a("preload_fail", null);
        }

        C25418a(AdLightWebPageView adLightWebPageView) {
            this.f66905a = adLightWebPageView;
        }

        /* renamed from: a */
        public final void mo65928a(long j) {
            m83608a("preload_success", Long.valueOf(j));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m83608a(String str, Long l) {
            Aweme aweme;
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("light_page", Integer.valueOf(1));
            if (l != null) {
                linkedHashMap.put("duration", l);
            }
            C24961b a = C24958f.m81905a().mo65266a("ad_wap_stat").mo65276b(str).mo65267a(new JSONObject(linkedHashMap));
            C25421d params = this.f66905a.getParams();
            if (params != null) {
                aweme = params.f66908c;
            } else {
                aweme = null;
            }
            a.mo65273b(aweme).mo65278b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$b */
    public interface C25419b {
        /* renamed from: a */
        void mo66037a();

        /* renamed from: b */
        void mo66038b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$c */
    public static final class C25420c {
        private C25420c() {
        }

        public /* synthetic */ C25420c(C7571f fVar) {
            this();
        }

        /* renamed from: b */
        private final AdLightWebPageView m83615b(Activity activity) {
            AdLightWebPageView adLightWebPageView;
            FrameLayout c = m83616c(activity);
            if (c != null) {
                adLightWebPageView = (AdLightWebPageView) c.findViewById(R.id.cb);
            } else {
                adLightWebPageView = null;
            }
            if (!(adLightWebPageView instanceof AdLightWebPageView)) {
                return null;
            }
            return adLightWebPageView;
        }

        /* renamed from: a */
        public final void mo66040a(Activity activity) {
            C7573i.m23587b(activity, "activity");
            AdLightWebPageView b = m83615b(activity);
            if (b != null) {
                b.mo66022a();
                FrameLayout c = m83616c(activity);
                if (c != null) {
                    c.removeView(b);
                }
            }
        }

        public final boolean dismiss(Activity activity) {
            C7573i.m23587b(activity, "activity");
            AdLightWebPageView b = m83615b(activity);
            if (b == null || !b.mo66026b()) {
                return false;
            }
            b.dismiss();
            return true;
        }

        /* renamed from: c */
        private static FrameLayout m83616c(Activity activity) {
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.bw);
            if (viewStub == null) {
                return (FrameLayout) activity.findViewById(R.id.bv);
            }
            View inflate = viewStub.inflate();
            if (inflate != null) {
                return (FrameLayout) inflate;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }

        /* renamed from: a */
        public final AdLightWebPageView mo66039a(Activity activity, C25421d dVar) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(dVar, "params");
            AdLightWebPageView b = m83615b(activity);
            if (b == null) {
                b = new AdLightWebPageView(activity, null, 0, 6, null);
                b.setId(R.id.cb);
                b.setParams(dVar);
                FrameLayout c = m83616c(activity);
                if (c != null) {
                    c.addView(b);
                }
            }
            return b;
        }

        /* renamed from: a */
        public final boolean mo66041a(Activity activity, String str) {
            C7573i.m23587b(activity, "activity");
            AdLightWebPageView b = m83615b(activity);
            if (b == null || b.mo66026b()) {
                return false;
            }
            b.mo66025a(str);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$d */
    public static final class C25421d {

        /* renamed from: a */
        public String f66906a;

        /* renamed from: b */
        public C0043i f66907b;

        /* renamed from: c */
        public Aweme f66908c;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$d$a */
        public static final class C25422a extends C25267bf<C25421d> {
            public C25422a() {
                C25421d dVar = new C25421d(null, null, null, 7, null);
                super(dVar);
            }
        }

        public C25421d() {
            this(null, null, null, 7, null);
        }

        /* renamed from: a */
        public final void mo66043a(String str) {
            C7573i.m23587b(str, "<set-?>");
            this.f66906a = str;
        }

        private C25421d(String str, C0043i iVar, Aweme aweme) {
            C7573i.m23587b(str, "url");
            this.f66906a = str;
            this.f66907b = iVar;
            this.f66908c = aweme;
        }

        public /* synthetic */ C25421d(String str, C0043i iVar, Aweme aweme, int i, C7571f fVar) {
            this("", null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$e */
    public static final class C25423e {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66909a;

        C25423e(AdLightWebPageView adLightWebPageView) {
            this.f66909a = adLightWebPageView;
        }

        @C7709l
        public final void onEvent(C27890b bVar) {
            if (bVar != null) {
                CommercializeWebViewHelper commercializeWebViewHelper = this.f66909a.f66889e;
                if (commercializeWebViewHelper != null) {
                    PreRenderWebViewBusiness b = commercializeWebViewHelper.mo65718b();
                    if (b != null) {
                        b.mo67207a((C26025c) this.f66909a.getMWebView(), bVar);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$f */
    public static final class C25424f implements C25216a {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66910a;

        C25424f(AdLightWebPageView adLightWebPageView) {
            this.f66910a = adLightWebPageView;
        }

        /* renamed from: a */
        public final void mo65832a(int i, int i2, int i3) {
            boolean z;
            String str;
            AdLightWebPageView adLightWebPageView = this.f66910a;
            if (i2 < i) {
                z = true;
            } else {
                z = false;
            }
            adLightWebPageView.f66892h = z;
            if (this.f66910a.f66892h) {
                str = "keyboardDidShow";
            } else {
                str = "keyboardDidHide";
            }
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("height", Integer.valueOf(C23486n.m77125b((double) (i3 - i2))));
            this.f66910a.getMWebView().mo67472a(str, new JSONObject(linkedHashMap));
            StringBuilder sb = new StringBuilder("send event ");
            sb.append(str);
            sb.append(' ');
            sb.append(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$g */
    public static final class C25425g extends C25271bj {

        /* renamed from: b */
        final /* synthetic */ AdLightWebPageView f66911b;

        /* renamed from: c */
        final /* synthetic */ Activity f66912c;

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f66911b.mo66026b()) {
                return false;
            }
            this.f66911b.f66890f = "back";
            this.f66911b.dismiss();
            return true;
        }

        C25425g(AdLightWebPageView adLightWebPageView, Activity activity, Activity activity2) {
            this.f66911b = adLightWebPageView;
            this.f66912c = activity;
            super(activity2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$h */
    public static final class C25426h implements C25389b {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66913a;

        /* renamed from: b */
        private boolean f66914b;

        /* renamed from: c */
        public final void mo65958c() {
            if (this.f66913a.getMBottomSheet().getHideable() && this.f66913a.f66892h) {
                this.f66913a.f66892h = false;
                C25367k.m83412a(this.f66913a.getContext(), null, 2, null);
            }
        }

        /* renamed from: a */
        public final void mo65956a() {
            Aweme aweme;
            if (!this.f66914b) {
                this.f66914b = true;
                this.f66913a.f66891g = System.currentTimeMillis();
                C25215ab abVar = this.f66913a.f66887c;
                if (abVar != null) {
                    abVar.mo65829a();
                }
                ((C26039m) this.f66913a.getMWebView().mo67463a(C26039m.class)).mo67531b().loadUrl("javascript:window.dialogPopUp()");
                CommercializeWebViewHelper commercializeWebViewHelper = this.f66913a.f66889e;
                if (commercializeWebViewHelper != null) {
                    PreRenderWebViewBusiness b = commercializeWebViewHelper.mo65718b();
                    if (b != null) {
                        b.mo67208a(this.f66913a.f66893i);
                    }
                }
                C24961b b2 = C24958f.m81905a().mo65266a("light_ad").mo65276b("detail_show");
                C25421d params = this.f66913a.getParams();
                if (params != null) {
                    aweme = params.f66908c;
                } else {
                    aweme = null;
                }
                b2.mo65273b(aweme).mo65278b();
                C25419b callback = this.f66913a.getCallback();
                if (callback != null) {
                    callback.mo66037a();
                }
                C25271bj bjVar = this.f66913a.f66888d;
                if (bjVar != null) {
                    bjVar.mo65885a(true);
                }
            }
        }

        /* renamed from: b */
        public final void mo65957b() {
            Aweme aweme;
            if (this.f66914b) {
                this.f66914b = false;
                C25215ab abVar = this.f66913a.f66887c;
                if (abVar != null) {
                    abVar.mo65830b();
                }
                CommercializeWebViewHelper commercializeWebViewHelper = this.f66913a.f66889e;
                if (commercializeWebViewHelper != null) {
                    PreRenderWebViewBusiness b = commercializeWebViewHelper.mo65718b();
                    if (b != null) {
                        b.mo67209b();
                    }
                }
                C24961b b2 = C24958f.m81905a().mo65266a("light_ad").mo65276b("landing_page");
                String str = this.f66913a.f66890f;
                if (str == null) {
                    str = "slide";
                }
                C24961b e = b2.mo65283e(str);
                C25421d params = this.f66913a.getParams();
                Aweme aweme2 = null;
                if (params != null) {
                    aweme = params.f66908c;
                } else {
                    aweme = null;
                }
                e.mo65273b(aweme).mo65278b();
                this.f66913a.f66890f = null;
                C24961b b3 = C24958f.m81905a().mo65266a("ad_wap_stat").mo65276b("stay_page");
                C25421d params2 = this.f66913a.getParams();
                if (params2 != null) {
                    aweme2 = params2.f66908c;
                }
                b3.mo65273b(aweme2).mo65275b(Long.valueOf(System.currentTimeMillis() - this.f66913a.f66891g)).mo65265a((Object) C7507ae.m23400b((Pair<? extends K, ? extends V>[]) new Pair[]{new Pair("light_page", Integer.valueOf(1))})).mo65278b();
                C25419b callback = this.f66913a.getCallback();
                if (callback != null) {
                    callback.mo66038b();
                }
                C25271bj bjVar = this.f66913a.f66888d;
                if (bjVar != null) {
                    bjVar.mo65885a(false);
                }
            }
        }

        C25426h(AdLightWebPageView adLightWebPageView) {
            this.f66913a = adLightWebPageView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$i */
    static final class C25427i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66915a;

        C25427i(AdLightWebPageView adLightWebPageView) {
            this.f66915a = adLightWebPageView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f66915a.f66890f = "blank";
            this.f66915a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$j */
    static final class C25428j implements OnScrollChangeListener {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66916a;

        C25428j(AdLightWebPageView adLightWebPageView) {
            this.f66916a = adLightWebPageView;
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            boolean z;
            AdBottomSheetContainer mBottomSheet = this.f66916a.getMBottomSheet();
            if (i2 <= 0) {
                z = true;
            } else {
                z = false;
            }
            mBottomSheet.setHideable(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$k */
    static final class C25429k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66917a;

        C25429k(AdLightWebPageView adLightWebPageView) {
            this.f66917a = adLightWebPageView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f66917a.f66890f = "button";
            this.f66917a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$l */
    static final class C25430l implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66918a;

        C25430l(AdLightWebPageView adLightWebPageView) {
            this.f66918a = adLightWebPageView;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            C25421d params = this.f66918a.getParams();
            if (params != null) {
                String str = params.f66906a;
                if (str != null) {
                    if (str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        str = null;
                    }
                    String str2 = str;
                    if (str2 != null) {
                        CrossPlatformWebView.m85411a(this.f66918a.getMWebView(), str2, false, (Map) null, 6, (Object) null);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$m */
    static final class C25431m extends Lambda implements C7561a<AdBottomSheetContainer> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66919a;

        C25431m(AdLightWebPageView adLightWebPageView) {
            this.f66919a = adLightWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AdBottomSheetContainer invoke() {
            return (AdBottomSheetContainer) this.f66919a.f66886b.findViewById(R.id.o_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$n */
    static final class C25432n extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66920a;

        C25432n(AdLightWebPageView adLightWebPageView) {
            this.f66920a = adLightWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f66920a.f66886b.findViewById(R.id.x_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$o */
    static final class C25433o extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66921a;

        C25433o(AdLightWebPageView adLightWebPageView) {
            this.f66921a = adLightWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f66921a.f66886b.findViewById(R.id.c3m);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$p */
    static final class C25434p extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66922a;

        C25434p(AdLightWebPageView adLightWebPageView) {
            this.f66922a = adLightWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f66922a.f66886b.findViewById(R.id.bln);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$q */
    static final class C25435q extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66923a;

        C25435q(AdLightWebPageView adLightWebPageView) {
            this.f66923a = adLightWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f66923a.f66886b.findViewById(R.id.csg);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$r */
    static final class C25436r extends Lambda implements C7561a<CrossPlatformWebView> {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66924a;

        C25436r(AdLightWebPageView adLightWebPageView) {
            this.f66924a = adLightWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CrossPlatformWebView invoke() {
            return (CrossPlatformWebView) this.f66924a.f66886b.findViewById(R.id.egh);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$s */
    public static final class C25437s implements C25513a {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66925a;

        /* renamed from: b */
        final /* synthetic */ DMTJsBridge f66926b;

        /* renamed from: c */
        final /* synthetic */ String f66927c;

        /* renamed from: a */
        public final void mo66049a() {
            AdLightWebPageView.m83595a(this.f66926b, this.f66927c, false, new LinkedHashMap());
        }

        /* renamed from: a */
        public final void mo66050a(String str) {
            C7573i.m23587b(str, "pickedDate");
            AdLightWebPageView.m83595a(this.f66926b, this.f66927c, true, C7507ae.m23400b((Pair<? extends K, ? extends V>[]) new Pair[]{new Pair("selected", str)}));
        }

        C25437s(AdLightWebPageView adLightWebPageView, DMTJsBridge dMTJsBridge, String str) {
            this.f66925a = adLightWebPageView;
            this.f66926b = dMTJsBridge;
            this.f66927c = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageView$t */
    public static final class C25438t implements C25524a {

        /* renamed from: a */
        final /* synthetic */ AdLightWebPageView f66928a;

        /* renamed from: b */
        final /* synthetic */ DMTJsBridge f66929b;

        /* renamed from: c */
        final /* synthetic */ String f66930c;

        /* renamed from: a */
        public final void mo66051a() {
            AdLightWebPageView.m83595a(this.f66929b, this.f66930c, false, new LinkedHashMap());
        }

        /* renamed from: a */
        public final void mo66052a(List<Integer> list) {
            C7573i.m23587b(list, "selected");
            new StringBuilder("selected ").append(list);
            AdLightWebPageView.m83595a(this.f66929b, this.f66930c, true, C7507ae.m23400b((Pair<? extends K, ? extends V>[]) new Pair[]{new Pair("selected", list)}));
        }

        C25438t(AdLightWebPageView adLightWebPageView, DMTJsBridge dMTJsBridge, String str) {
            this.f66928a = adLightWebPageView;
            this.f66929b = dMTJsBridge;
            this.f66930c = str;
        }
    }

    /* renamed from: a */
    public static final boolean m83597a(Activity activity, String str) {
        return f66885j.mo66041a(activity, str);
    }

    public static final boolean dismiss(Activity activity) {
        return f66885j.dismiss(activity);
    }

    private final ImageView getMCloseView() {
        return (ImageView) this.f66897n.getValue();
    }

    private final FrameLayout getMLightWebPage() {
        return (FrameLayout) this.f66895l.getValue();
    }

    private final DmtTextView getMRetryView() {
        return (DmtTextView) this.f66899p.getValue();
    }

    public final C25419b getCallback() {
        return this.f66901r;
    }

    public final AdBottomSheetContainer getMBottomSheet() {
        return (AdBottomSheetContainer) this.f66894k.getValue();
    }

    public final FrameLayout getMErrorView() {
        return (FrameLayout) this.f66898o.getValue();
    }

    public final CrossPlatformWebView getMWebView() {
        return (CrossPlatformWebView) this.f66896m.getValue();
    }

    public final C25421d getParams() {
        return this.f66900q;
    }

    /* renamed from: e */
    private final void m83600e() {
        if (!this.f66903t) {
            m83601f();
            this.f66903t = true;
        }
    }

    /* renamed from: b */
    public final boolean mo66026b() {
        return getMBottomSheet().mo1014c();
    }

    private final boolean getNeedPreload() {
        C25421d dVar = this.f66900q;
        if (dVar != null) {
            Aweme aweme = dVar.f66908c;
            if (aweme != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null && awemeRawAd.isPreloadExtraWeb()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void dismiss() {
        if (this.f66892h) {
            this.f66892h = false;
            C25367k.m83412a(getContext(), null, 2, null);
            return;
        }
        getMBottomSheet().mo1013b();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42961az.m136382c(this.f66904u);
        m83598c();
        m83599d();
        if (getNeedPreload()) {
            m83600e();
        }
    }

    /* renamed from: d */
    private final void m83599d() {
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            C25215ab abVar = new C25215ab(activity);
            abVar.f66530d = new C25424f(this);
            this.f66887c = abVar;
            this.f66888d = new C25425g(this, activity, activity);
        }
    }

    /* renamed from: a */
    public final void mo66022a() {
        CrossPlatformWebView.m85411a(getMWebView(), "about:blank", false, (Map) null, 6, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42961az.m136383d(this.f66904u);
        C25215ab abVar = this.f66887c;
        if (abVar != null) {
            abVar.mo65830b();
        }
        this.f66887c = null;
        C25271bj bjVar = this.f66888d;
        if (bjVar != null) {
            bjVar.mo65885a(false);
        }
        this.f66888d = null;
        this.f66902s.mo65926a(true);
        CommercializeWebViewHelper commercializeWebViewHelper = this.f66889e;
        if (commercializeWebViewHelper != null) {
            commercializeWebViewHelper.mo65717a();
        }
        this.f66889e = null;
    }

    /* renamed from: c */
    private final void m83598c() {
        getMBottomSheet().mo65949d(getMLightWebPage());
        getMBottomSheet().setCallback(new C25426h(this));
        getMLightWebPage().setOnClickListener(new C25427i(this));
        FrameLayout mLightWebPage = getMLightWebPage();
        int paddingLeft = getPaddingLeft();
        double a = (double) C23482j.m77095a(getContext());
        Double.isNaN(a);
        mLightWebPage.setPadding(paddingLeft, (int) (a * 0.26836581709145424d), getPaddingRight(), getPaddingBottom());
        if (VERSION.SDK_INT >= 23) {
            ((C26039m) getMWebView().mo67463a(C26039m.class)).mo67531b().setOnScrollChangeListener(new C25428j(this));
        }
        getMCloseView().setOnClickListener(new C25429k(this));
        getMRetryView().setOnClickListener(new C25430l(this));
    }

    /* renamed from: f */
    private final void m83601f() {
        String str;
        boolean z;
        C0043i iVar;
        Aweme aweme;
        StringBuilder sb = new StringBuilder("load url=");
        C25421d dVar = this.f66900q;
        String str2 = null;
        if (dVar != null) {
            str = dVar.f66906a;
        } else {
            str = null;
        }
        sb.append(str);
        C25421d dVar2 = this.f66900q;
        if (dVar2 != null) {
            String str3 = dVar2.f66906a;
            if (str3 != null) {
                if (str3.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (getContext() instanceof Activity) {
                        C25421d dVar3 = this.f66900q;
                        if (dVar3 != null) {
                            iVar = dVar3.f66907b;
                        } else {
                            iVar = null;
                        }
                        if (iVar != null) {
                            C24991a aVar = new C24991a();
                            C25421d dVar4 = this.f66900q;
                            if (dVar4 != null) {
                                aweme = dVar4.f66908c;
                            } else {
                                aweme = null;
                            }
                            Bundle a = C25352e.m83317a((C24990c) aVar.mo65418a(aweme).f66613a);
                            String str4 = "url";
                            C25421d dVar5 = this.f66900q;
                            if (dVar5 != null) {
                                str2 = dVar5.f66906a;
                            }
                            a.putString(str4, str2);
                            a.putInt("preload_web_status", 7);
                            C26025c mWebView = getMWebView();
                            C25965c cVar = this.f66902s;
                            C25421d dVar6 = this.f66900q;
                            if (dVar6 == null) {
                                C7573i.m23580a();
                            }
                            C0043i iVar2 = dVar6.f66907b;
                            if (iVar2 == null) {
                                C7573i.m23580a();
                            }
                            Context context = getContext();
                            if (context != null) {
                                this.f66889e = CommercializeWebViewHelper.m82757a(mWebView, cVar, iVar2, (Activity) context, a);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                            }
                        }
                    }
                    Map linkedHashMap = new LinkedHashMap();
                    Map linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("source", "light_landing_page");
                    linkedHashMap2.put("preload", Integer.valueOf(getNeedPreload() ? 1 : 0));
                    String jSONObject = new JSONObject(linkedHashMap2).toString();
                    C7573i.m23582a((Object) jSONObject, "JSONObject(mutableMapOf<…            }).toString()");
                    linkedHashMap.put("X-Extra-Data", jSONObject);
                    CrossPlatformWebView mWebView2 = getMWebView();
                    C25421d dVar7 = this.f66900q;
                    if (dVar7 == null) {
                        C7573i.m23580a();
                    }
                    CrossPlatformWebView.m85411a(mWebView2, dVar7.f66906a, false, linkedHashMap, 2, (Object) null);
                }
            }
        }
    }

    public final void setCallback(C25419b bVar) {
        this.f66901r = bVar;
    }

    public final void setParams(C25421d dVar) {
        this.f66900q = dVar;
    }

    /* renamed from: a */
    public final void mo66025a(String str) {
        getMBottomSheet().mo1011a();
        if (!getNeedPreload()) {
            m83600e();
        }
        this.f66893i = str;
    }

    public AdLightWebPageView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        View inflate = View.inflate(context, R.layout.sp, this);
        C7573i.m23582a((Object) inflate, "View.inflate(context, R.…_ad_light_web_page, this)");
        this.f66886b = inflate;
        this.f66894k = C7546e.m23569a(new C25431m(this));
        this.f66895l = C7546e.m23569a(new C25434p(this));
        this.f66896m = C7546e.m23569a(new C25436r(this));
        this.f66897n = C7546e.m23569a(new C25432n(this));
        this.f66898o = C7546e.m23569a(new C25433o(this));
        this.f66899p = C7546e.m23569a(new C25435q(this));
        C25369m mVar = new C25369m();
        mVar.f66778e = new C25418a(this);
        this.f66902s = mVar;
        this.f66904u = new C25423e(this);
    }

    /* renamed from: a */
    public final void mo66023a(C25004m mVar, DMTJsBridge dMTJsBridge, String str) {
        C7573i.m23587b(mVar, "params");
        OptionListPickerDialog optionListPickerDialog = new OptionListPickerDialog(getContext(), mVar);
        optionListPickerDialog.f67239d = new C25438t(this, dMTJsBridge, str);
        optionListPickerDialog.show();
    }

    /* renamed from: a */
    public final void mo66024a(C25515c cVar, DMTJsBridge dMTJsBridge, String str) {
        C7573i.m23587b(cVar, "params");
        DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), cVar);
        datePickerDialog.f67220b = new C25437s(this, dMTJsBridge, str);
        datePickerDialog.show();
    }

    /* renamed from: a */
    public static void m83595a(DMTJsBridge dMTJsBridge, String str, boolean z, Map<String, Object> map) {
        map.put("code", Integer.valueOf(z ? 1 : 0));
        if (dMTJsBridge != null) {
            dMTJsBridge.mo53862b(str, new JSONObject(map));
        }
    }

    public /* synthetic */ AdLightWebPageView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
