package com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25271bj;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25367k;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25379u;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25379u.C25380a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25381v;
import com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebBottomSheetContainer.C25596b;
import com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebTitleBar.C25621a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.AdPopUpWebPageContainer;
import com.p280ss.android.ugc.aweme.crossplatform.activity.AdPopUpWebPageContainer.C25810a;
import com.p280ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.business.C25862i;
import com.p280ss.android.ugc.aweme.crossplatform.business.ReportBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25883a;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b.C25887a;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26026d;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView */
public final class AdPopUpWebPageView extends FrameLayout implements C0042h {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f67433a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdPopUpWebPageView.class), "mPopUpWebBottomSheet", "getMPopUpWebBottomSheet()Lcom/ss/android/ugc/aweme/commercialize/views/popupwebpage/AdPopUpWebBottomSheetContainer;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdPopUpWebPageView.class), "mPopUpPaddingLayout", "getMPopUpPaddingLayout()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdPopUpWebPageView.class), "mPopUpWebPage", "getMPopUpWebPage()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdPopUpWebPageView.class), "mPopUpWebMark", "getMPopUpWebMark()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdPopUpWebPageView.class), "mErrorView", "getMErrorView()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdPopUpWebPageView.class), "mBtnRetry", "getMBtnRetry()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdPopUpWebPageView.class), "mCrossPlatformWebView", "getMCrossPlatformWebView()Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdPopUpWebPageView.class), "mTitleBar", "getMTitleBar()Lcom/ss/android/ugc/aweme/commercialize/views/popupwebpage/AdPopUpWebTitleBar;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AdPopUpWebPageView.class), "loadListener", "getLoadListener()Lcom/ss/android/ugc/aweme/commercialize/utils/AdPopUpWebPageLoadListener;"))};

    /* renamed from: g */
    public static final C25600b f67434g = new C25600b(null);

    /* renamed from: b */
    public final View f67435b;

    /* renamed from: c */
    public C25271bj f67436c;

    /* renamed from: d */
    public AdPopUpWebPageContainer f67437d;

    /* renamed from: e */
    public String f67438e;

    /* renamed from: f */
    public final C25617s f67439f;

    /* renamed from: h */
    private final C7541d f67440h;

    /* renamed from: i */
    private final C7541d f67441i;

    /* renamed from: j */
    private final C7541d f67442j;

    /* renamed from: k */
    private final C7541d f67443k;

    /* renamed from: l */
    private final C7541d f67444l;

    /* renamed from: m */
    private final C7541d f67445m;

    /* renamed from: n */
    private final C7541d f67446n;

    /* renamed from: o */
    private final C7541d f67447o;

    /* renamed from: p */
    private C25381v f67448p;

    /* renamed from: q */
    private C25602d f67449q;

    /* renamed from: r */
    private C25599a f67450r;

    /* renamed from: s */
    private C25601c f67451s;

    /* renamed from: t */
    private final C7541d f67452t;

    /* renamed from: u */
    private final C25603e f67453u;

    /* renamed from: v */
    private final OnTouchListener f67454v;

    /* renamed from: w */
    private final C25619u f67455w;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$a */
    public interface C25599a {
        /* renamed from: a */
        void mo66418a();

        /* renamed from: b */
        void mo66419b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$b */
    public static final class C25600b {
        private C25600b() {
        }

        public /* synthetic */ C25600b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$c */
    public interface C25601c {
        /* renamed from: a */
        void mo66420a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$d */
    public interface C25602d {
        /* renamed from: a */
        void mo66421a();

        /* renamed from: b */
        void mo66422b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$e */
    public static final class C25603e implements C25596b {

        /* renamed from: a */
        public int f67456a;

        /* renamed from: b */
        final /* synthetic */ AdPopUpWebPageView f67457b;

        /* renamed from: c */
        final /* synthetic */ Context f67458c;

        /* renamed from: b */
        public final void mo66393b() {
            if (this.f67456a != 4) {
                this.f67456a = 4;
            }
        }

        /* renamed from: a */
        public final void mo66391a() {
            if (this.f67456a != 3) {
                this.f67456a = 3;
                this.f67457b.getMPopUpWebMark().setVisibility(0);
            }
        }

        /* renamed from: c */
        public final void mo66394c() {
            if (this.f67457b.getMPopUpWebBottomSheet().getCollapsible()) {
                C25367k.m83412a(this.f67458c, null, 2, null);
            }
        }

        /* renamed from: d */
        public final void mo66395d() {
            if (this.f67456a != 5) {
                this.f67456a = 5;
                this.f67457b.getLoadListener().mo65935a(true);
                C25271bj bjVar = this.f67457b.f67436c;
                if (bjVar != null) {
                    bjVar.mo65885a(false);
                }
                this.f67457b.getMPopUpWebMark().setVisibility(8);
                this.f67457b.getMPopUpWebMark().setOnClickListener(null);
                this.f67457b.getMPopUpWebMark().setClickable(false);
                AdPopUpWebPageContainer adPopUpWebPageContainer = this.f67457b.f67437d;
                if (adPopUpWebPageContainer != null) {
                    C25862i crossPlatformBusiness = adPopUpWebPageContainer.getCrossPlatformBusiness();
                    if (crossPlatformBusiness != null) {
                        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.mo67230a(AdWebStatBusiness.class);
                        if (adWebStatBusiness != null) {
                            adWebStatBusiness.mo67172a(true);
                        }
                    }
                }
                C25599a mBehaviorCallback = this.f67457b.getMBehaviorCallback();
                if (mBehaviorCallback != null) {
                    mBehaviorCallback.mo66419b();
                }
                this.f67457b.getLoadListener().mo65934a();
            }
        }

        C25603e(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f67457b = adPopUpWebPageView;
            this.f67458c = context;
        }

        /* renamed from: a */
        public final void mo66392a(View view, float f) {
            C7573i.m23587b(view, "bottomSheet");
            if (Float.isNaN(f)) {
                this.f67457b.getMPopUpWebMark().setAlpha(1.0f);
                return;
            }
            if (f < 0.0f) {
                this.f67457b.getMPopUpWebMark().setAlpha(1.0f - Math.abs(f));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$f */
    public static final class C25604f extends C25271bj {

        /* renamed from: b */
        final /* synthetic */ AdPopUpWebPageView f67459b;

        /* renamed from: c */
        final /* synthetic */ Activity f67460c;

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4 || !this.f67459b.mo66398b()) {
                return false;
            }
            C25601c keyDownCallBack = this.f67459b.getKeyDownCallBack();
            if (keyDownCallBack != null) {
                keyDownCallBack.mo66420a();
            }
            this.f67459b.dismiss();
            return true;
        }

        C25604f(AdPopUpWebPageView adPopUpWebPageView, Activity activity, Activity activity2) {
            this.f67459b = adPopUpWebPageView;
            this.f67460c = activity;
            super(activity2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$g */
    static final class C25605g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67461a;

        C25605g(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67461a = adPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f67461a.m84158a((String) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$h */
    static final class C25606h implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67462a;

        C25606h(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67462a = adPopUpWebPageView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C25625a actionMode = this.f67462a.getActionMode();
            C7573i.m23582a((Object) motionEvent, "event");
            actionMode.mo66445a(motionEvent);
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        this.f67462a.getMPopUpWebBottomSheet().setCollapsible(true);
                        break;
                    case 1:
                        break;
                }
            }
            WebView webView = this.f67462a.getWebView();
            if (webView != null && webView.getScrollY() > 0) {
                this.f67462a.getMPopUpWebBottomSheet().setCollapsible(false);
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$i */
    public static final class C25607i implements C26026d {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67463a;

        C25607i(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67463a = adPopUpWebPageView;
        }

        /* renamed from: a */
        public final void mo66425a(int i, int i2, int i3, int i4) {
            boolean z;
            WebView webView = this.f67463a.getWebView();
            if (webView != null) {
                AdPopUpWebBottomSheetContainer mPopUpWebBottomSheet = this.f67463a.getMPopUpWebBottomSheet();
                if (webView.getScrollY() <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                mPopUpWebBottomSheet.setCollapsible(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$j */
    static final class C25608j extends Lambda implements C7561a<C25379u> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67464a;

        C25608j(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67464a = adPopUpWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C25379u invoke() {
            C25379u uVar = new C25379u();
            uVar.f66793e = this.f67464a.f67439f;
            return uVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$k */
    static final class C25609k extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67465a;

        C25609k(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67465a = adPopUpWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f67465a.f67435b.findViewById(R.id.r6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$l */
    static final class C25610l extends Lambda implements C7561a<CrossPlatformWebView> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67466a;

        C25610l(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67466a = adPopUpWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CrossPlatformWebView invoke() {
            return (CrossPlatformWebView) this.f67466a.f67435b.findViewById(R.id.ci9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$m */
    static final class C25611m extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67467a;

        C25611m(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67467a = adPopUpWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f67467a.f67435b.findViewById(R.id.ci7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$n */
    static final class C25612n extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67468a;

        C25612n(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67468a = adPopUpWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f67468a.f67435b.findViewById(R.id.c9t);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$o */
    static final class C25613o extends Lambda implements C7561a<AdPopUpWebBottomSheetContainer> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67469a;

        C25613o(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67469a = adPopUpWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AdPopUpWebBottomSheetContainer invoke() {
            return (AdPopUpWebBottomSheetContainer) this.f67469a.f67435b.findViewById(R.id.ci3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$p */
    static final class C25614p extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67470a;

        C25614p(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67470a = adPopUpWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f67470a.f67435b.findViewById(R.id.ci6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$q */
    static final class C25615q extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67471a;

        C25615q(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67471a = adPopUpWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f67471a.f67435b.findViewById(R.id.ci8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$r */
    static final class C25616r extends Lambda implements C7561a<AdPopUpWebTitleBar> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67472a;

        C25616r(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67472a = adPopUpWebPageView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AdPopUpWebTitleBar invoke() {
            return (AdPopUpWebTitleBar) this.f67472a.f67435b.findViewById(R.id.cib);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$s */
    public static final class C25617s implements C25380a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67473a;

        /* renamed from: b */
        final /* synthetic */ Context f67474b;

        /* renamed from: a */
        public final void mo65936a() {
            this.f67473a.getMErrorView().setVisibility(8);
            View findViewById = this.f67473a.getMCrossPlatformWebView().findViewById(R.id.afp);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        /* renamed from: b */
        public final void mo65937b() {
            this.f67473a.getMErrorView().setVisibility(0);
            View findViewById = this.f67473a.getMCrossPlatformWebView().findViewById(R.id.afp);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }

        /* renamed from: c */
        public final void mo65938c() {
            Context context = this.f67474b;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null || !activity.isFinishing()) {
                WebView webView = this.f67473a.getWebView();
                if (webView != null) {
                    if (webView.canGoBack()) {
                        this.f67473a.getMTitleBar().mo66431a();
                    } else {
                        this.f67473a.getMTitleBar().mo66434b();
                    }
                }
            }
        }

        C25617s(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f67473a = adPopUpWebPageView;
            this.f67474b = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$t */
    static final class C25618t implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67475a;

        C25618t(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67475a = adPopUpWebPageView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f67475a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$u */
    public static final class C25619u implements C25621a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67476a;

        /* renamed from: b */
        final /* synthetic */ Context f67477b;

        /* renamed from: b */
        public final void mo66428b() {
            this.f67476a.getMCrossPlatformWebView().mo67477a();
            this.f67476a.getTitleBarCallback();
        }

        /* renamed from: a */
        public final void mo66427a() {
            this.f67476a.f67438e = "button";
            this.f67476a.dismiss();
            C25602d titleBarCallback = this.f67476a.getTitleBarCallback();
            if (titleBarCallback != null) {
                titleBarCallback.mo66421a();
            }
        }

        /* renamed from: c */
        public final void mo66429c() {
            Context context = this.f67477b;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                C25886b crossPlatformParams = this.f67476a.getMCrossPlatformWebView().getCrossPlatformParams();
                if (crossPlatformParams != null) {
                    C25883a aVar = crossPlatformParams.f68473a;
                    if (!(aVar == null || aVar.f68437j == null)) {
                        C25862i crossPlatformBusiness = this.f67476a.getMCrossPlatformWebView().getCrossPlatformBusiness();
                        if (crossPlatformBusiness != null) {
                            ReportBusiness reportBusiness = (ReportBusiness) crossPlatformBusiness.mo67230a(ReportBusiness.class);
                            if (reportBusiness != null) {
                                reportBusiness.mo67215a(activity);
                            }
                        }
                        C25602d titleBarCallback = this.f67476a.getTitleBarCallback();
                        if (titleBarCallback != null) {
                            titleBarCallback.mo66422b();
                        }
                    }
                }
            }
        }

        C25619u(AdPopUpWebPageView adPopUpWebPageView, Context context) {
            this.f67476a = adPopUpWebPageView;
            this.f67477b = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebPageView$v */
    static final class C25620v implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebPageView f67478a;

        C25620v(AdPopUpWebPageView adPopUpWebPageView) {
            this.f67478a = adPopUpWebPageView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            this.f67478a.getActionMode().mo66445a(motionEvent);
            return false;
        }
    }

    private final DmtTextView getMBtnRetry() {
        return (DmtTextView) this.f67445m.getValue();
    }

    private final FrameLayout getMPopUpPaddingLayout() {
        return (FrameLayout) this.f67441i.getValue();
    }

    private final FrameLayout getMPopUpWebPage() {
        return (FrameLayout) this.f67442j.getValue();
    }

    public final C25601c getKeyDownCallBack() {
        return this.f67451s;
    }

    public final C25379u getLoadListener() {
        return (C25379u) this.f67452t.getValue();
    }

    public final C25599a getMBehaviorCallback() {
        return this.f67450r;
    }

    public final CrossPlatformWebView getMCrossPlatformWebView() {
        return (CrossPlatformWebView) this.f67446n.getValue();
    }

    public final FrameLayout getMErrorView() {
        return (FrameLayout) this.f67444l.getValue();
    }

    public final AdPopUpWebBottomSheetContainer getMPopUpWebBottomSheet() {
        return (AdPopUpWebBottomSheetContainer) this.f67440h.getValue();
    }

    public final FrameLayout getMPopUpWebMark() {
        return (FrameLayout) this.f67443k.getValue();
    }

    public final AdPopUpWebTitleBar getMTitleBar() {
        return (AdPopUpWebTitleBar) this.f67447o.getValue();
    }

    public final C25381v getParams() {
        return this.f67448p;
    }

    public final C25602d getTitleBarCallback() {
        return this.f67449q;
    }

    /* renamed from: a */
    public final void mo66396a() {
        CrossPlatformWebView.m85411a(getMCrossPlatformWebView(), "about:blank", false, (Map) null, 6, (Object) null);
    }

    /* renamed from: b */
    public final boolean mo66398b() {
        return getMPopUpWebBottomSheet().mo66383d();
    }

    public final C25625a getActionMode() {
        return getMPopUpWebBottomSheet().getActionMode();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m84159c();
        m84160d();
    }

    public final void dismiss() {
        getMPopUpWebBottomSheet().mo1014c();
        C25367k.m83412a(getContext(), null, 2, null);
    }

    public final WebView getWebView() {
        return ((C26039m) getMCrossPlatformWebView().mo67463a(C26039m.class)).mo67531b();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        AdPopUpWebPageContainer adPopUpWebPageContainer = this.f67437d;
        if (adPopUpWebPageContainer != null) {
            adPopUpWebPageContainer.mo67096a();
        }
        super.onDetachedFromWindow();
        C25271bj bjVar = this.f67436c;
        if (bjVar != null) {
            bjVar.mo65885a(false);
        }
        this.f67436c = null;
    }

    /* renamed from: c */
    private final void m84159c() {
        int i;
        C25381v vVar = this.f67448p;
        if (vVar != null) {
            Bundle bundle = vVar.f66799e;
            if (bundle != null) {
                getMPopUpWebBottomSheet().mo65949d(getMPopUpWebPage());
                FrameLayout mPopUpPaddingLayout = getMPopUpPaddingLayout();
                LayoutParams layoutParams = mPopUpPaddingLayout.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    C25381v vVar2 = this.f67448p;
                    if (vVar2 != null) {
                        i = vVar2.f66797c;
                    } else {
                        i = 0;
                    }
                    marginLayoutParams.topMargin = i;
                    mPopUpPaddingLayout.requestLayout();
                    AdPopUpWebTitleBar mTitleBar = getMTitleBar();
                    C25886b a = C25887a.m85153a(bundle);
                    C7573i.m23582a((Object) a, "CrossPlatformParams.Fact…createForFragment(bundle)");
                    mTitleBar.mo66432a(a);
                    ((C26039m) getMCrossPlatformWebView().mo67463a(C26039m.class)).mo67531b().setWebScrollListener(new C25607i(this));
                    C10789c.m31502a(getMBtnRetry());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    /* renamed from: d */
    private final void m84160d() {
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            C25381v vVar = this.f67448p;
            if (vVar != null) {
                Bundle bundle = vVar.f66799e;
                if (bundle != null) {
                    this.f67436c = new C25604f(this, activity, activity);
                    C25381v vVar2 = this.f67448p;
                    if (vVar2 != null) {
                        C0043i iVar = vVar2.f66796b;
                        if (iVar != null) {
                            Context context2 = getContext();
                            if (context2 != null) {
                                this.f67437d = C25810a.m84841a((Activity) context2, getMCrossPlatformWebView(), getLoadListener(), bundle, iVar, R.id.cz, R.id.cy);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                            }
                        }
                    }
                    getMPopUpWebBottomSheet().setCallback(this.f67453u);
                    getMBtnRetry().setOnClickListener(new C25605g(this));
                    getMTitleBar().setTitleBarListener(this.f67455w);
                    getMTitleBar().setOnTouchListener(new C25606h(this));
                    getMCrossPlatformWebView().setWebViewTouchListener(this.f67454v);
                }
            }
        }
    }

    public final void setKeyDownCallBack(C25601c cVar) {
        this.f67451s = cVar;
    }

    public final void setMBehaviorCallback(C25599a aVar) {
        this.f67450r = aVar;
    }

    public final void setParams(C25381v vVar) {
        this.f67448p = vVar;
    }

    public final void setTitleBarCallback(C25602d dVar) {
        this.f67449q = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m84158a(String str) {
        String str2;
        StringBuilder sb = new StringBuilder("load url=");
        C25381v vVar = this.f67448p;
        String str3 = null;
        if (vVar != null) {
            str2 = vVar.f66795a;
        } else {
            str2 = null;
        }
        sb.append(str2);
        C25381v vVar2 = this.f67448p;
        if (vVar2 != null) {
            str3 = vVar2.f66795a;
        }
        if (str3 != null) {
            getMTitleBar().mo66434b();
            CrossPlatformWebView mCrossPlatformWebView = getMCrossPlatformWebView();
            if (str == null) {
                C25381v vVar3 = this.f67448p;
                if (vVar3 == null) {
                    C7573i.m23580a();
                }
                str = vVar3.f66795a;
            }
            CrossPlatformWebView.m85411a(mCrossPlatformWebView, str, false, (Map) null, 6, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo66397a(C25627b bVar) {
        C7573i.m23587b(bVar, "openParams");
        getMPopUpWebBottomSheet().mo66382b(bVar.f67498c);
        switch (bVar.f67498c) {
            case 1:
                break;
            case 2:
                getMPopUpWebBottomSheet().mo1011a();
                break;
            case 3:
                getMPopUpWebBottomSheet().mo1013b();
                break;
            default:
                return;
        }
        getMPopUpWebMark().setVisibility(0);
        C25271bj bjVar = this.f67436c;
        if (bjVar != null) {
            bjVar.mo65885a(true);
        }
        getMTitleBar().mo66433a(bVar.f67501f);
        getMPopUpWebMark().setOnClickListener(new C25618t(this));
        AdPopUpWebPageContainer adPopUpWebPageContainer = this.f67437d;
        if (adPopUpWebPageContainer != null) {
            adPopUpWebPageContainer.mo67097b();
        }
        C25599a aVar = this.f67450r;
        if (aVar != null) {
            aVar.mo66418a();
        }
        m84158a(bVar.f67500e);
    }

    public AdPopUpWebPageView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        View inflate = View.inflate(context, R.layout.sq, this);
        C7573i.m23582a((Object) inflate, "View.inflate(context, R.…ad_pop_up_web_page, this)");
        this.f67435b = inflate;
        this.f67440h = C7546e.m23569a(new C25613o(this));
        this.f67441i = C7546e.m23569a(new C25612n(this));
        this.f67442j = C7546e.m23569a(new C25615q(this));
        this.f67443k = C7546e.m23569a(new C25614p(this));
        this.f67444l = C7546e.m23569a(new C25611m(this));
        this.f67445m = C7546e.m23569a(new C25609k(this));
        this.f67446n = C7546e.m23569a(new C25610l(this));
        this.f67447o = C7546e.m23569a(new C25616r(this));
        this.f67452t = C7546e.m23569a(new C25608j(this));
        this.f67453u = new C25603e(this, context);
        this.f67439f = new C25617s(this, context);
        this.f67454v = new C25620v(this);
        this.f67455w = new C25619u(this, context);
    }

    public /* synthetic */ AdPopUpWebPageView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
