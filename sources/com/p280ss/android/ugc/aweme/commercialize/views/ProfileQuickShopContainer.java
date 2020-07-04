package com.p280ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.p612c.C12115m;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24573m;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25238am;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p280ss.android.ugc.aweme.crossplatform.business.C25862i;
import com.p280ss.android.ugc.aweme.crossplatform.business.ShareBusiness;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.feed.adapter.C28173d;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.QuickShopLoadingPage;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.p1696v.C43177a;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.profile.model.QuickShopInfo;
import com.p280ss.android.ugc.aweme.profile.model.QuickShopSecondFloorInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.util.Map;
import kotlin.C7541d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer */
public final class ProfileQuickShopContainer extends FrameLayout implements C0042h {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f67115a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileQuickShopContainer.class), "mRootView", "getMRootView()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileQuickShopContainer.class), "mWebView", "getMWebView()Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileQuickShopContainer.class), "mCloseBtn", "getMCloseBtn()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileQuickShopContainer.class), "mShareBtn", "getMShareBtn()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileQuickShopContainer.class), "mLoadingView", "getMLoadingView()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileQuickShopContainer.class), "mLoadingBgView", "getMLoadingBgView()Lcom/bytedance/lighten/loader/SmartImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileQuickShopContainer.class), "mLoadingStatusView", "getMLoadingStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileQuickShopContainer.class), "mLoadingTextView", "getMLoadingTextView()Lcom/bytedance/lighten/loader/SmartImageView;"))};

    /* renamed from: e */
    public static int f67116e;

    /* renamed from: f */
    public static final C25490a f67117f = new C25490a(null);

    /* renamed from: A */
    private String f67118A;

    /* renamed from: B */
    private String f67119B;

    /* renamed from: C */
    private boolean f67120C;

    /* renamed from: b */
    public ValueAnimator f67121b;

    /* renamed from: c */
    public boolean f67122c;

    /* renamed from: d */
    public boolean f67123d;

    /* renamed from: g */
    private final C7541d f67124g;

    /* renamed from: h */
    private final C7541d f67125h;

    /* renamed from: i */
    private final C7541d f67126i;

    /* renamed from: j */
    private final C7541d f67127j;

    /* renamed from: k */
    private final C7541d f67128k;

    /* renamed from: l */
    private final C7541d f67129l;

    /* renamed from: m */
    private final C7541d f67130m;

    /* renamed from: n */
    private final C7541d f67131n;

    /* renamed from: o */
    private View f67132o;

    /* renamed from: p */
    private View f67133p;

    /* renamed from: q */
    private DmtTextView f67134q;

    /* renamed from: r */
    private CommercializeWebViewHelper f67135r;

    /* renamed from: s */
    private User f67136s;

    /* renamed from: t */
    private boolean f67137t;

    /* renamed from: u */
    private AnimatorSet f67138u;

    /* renamed from: v */
    private int f67139v;

    /* renamed from: w */
    private ValueAnimator f67140w;

    /* renamed from: x */
    private boolean f67141x;

    /* renamed from: y */
    private boolean f67142y;

    /* renamed from: z */
    private C25491b f67143z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$a */
    public static final class C25490a {
        private C25490a() {
        }

        public /* synthetic */ C25490a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$b */
    public static final class C25491b implements C23254a {

        /* renamed from: a */
        final /* synthetic */ ProfileQuickShopContainer f67144a;

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f67144a.mo66194a(false);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$c */
    static final class C25492c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProfileQuickShopContainer f67145a;

        C25492c(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f67145a = profileQuickShopContainer;
        }

        public final void run() {
            CrossPlatformWebView.m85411a(this.f67145a.getMWebView(), "about:blank", false, (Map) null, 6, (Object) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$d */
    static final class C25493d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MarginLayoutParams f67146a;

        /* renamed from: b */
        final /* synthetic */ View f67147b;

        C25493d(MarginLayoutParams marginLayoutParams, View view) {
            this.f67146a = marginLayoutParams;
            this.f67147b = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            MarginLayoutParams marginLayoutParams = this.f67146a;
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                marginLayoutParams.topMargin = ((Integer) animatedValue).intValue();
                this.f67147b.setLayoutParams(this.f67146a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$e */
    public static final class C25494e implements C25965c {

        /* renamed from: a */
        final /* synthetic */ ProfileQuickShopContainer f67148a;

        /* renamed from: a */
        public final void mo64220a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        /* renamed from: a */
        public final void mo64222a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        /* renamed from: b */
        public final boolean mo64225b(WebView webView, String str) {
            return false;
        }

        C25494e(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f67148a = profileQuickShopContainer;
        }

        /* renamed from: a */
        public final void mo64223a(WebView webView, String str) {
            if (!TextUtils.equals(str, "about:blank")) {
                this.f67148a.f67122c = true;
                if (!this.f67148a.f67123d) {
                    this.f67148a.mo66197b(false);
                }
                this.f67148a.mo66200d();
            }
        }

        /* renamed from: a */
        public final void mo64221a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f67148a.f67123d = true;
        }

        /* renamed from: a */
        public final void mo64224a(WebView webView, String str, Bitmap bitmap) {
            this.f67148a.f67122c = false;
            this.f67148a.f67123d = false;
            CommercializeWebViewHelper commercializeWebViewHelper = this.f67148a.getCommercializeWebViewHelper();
            if (commercializeWebViewHelper != null) {
                C25862i crossPlatformBusiness = commercializeWebViewHelper.getCrossPlatformBusiness();
                if (crossPlatformBusiness != null) {
                    ShareBusiness shareBusiness = (ShareBusiness) crossPlatformBusiness.mo67230a(ShareBusiness.class);
                    if (shareBusiness != null) {
                        shareBusiness.mo67158a(str);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo64219a(WebView webView, int i, String str, String str2) {
            this.f67148a.f67123d = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$f */
    static final class C25495f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileQuickShopContainer f67149a;

        C25495f(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f67149a = profileQuickShopContainer;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f67149a.mo66194a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$g */
    static final class C25496g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileQuickShopContainer f67150a;

        C25496g(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f67150a = profileQuickShopContainer;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f67150a.mo66191a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$h */
    static final class C25497h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProfileQuickShopContainer f67151a;

        /* renamed from: b */
        final /* synthetic */ DampScrollableLayout f67152b;

        C25497h(ProfileQuickShopContainer profileQuickShopContainer, DampScrollableLayout dampScrollableLayout) {
            this.f67151a = profileQuickShopContainer;
            this.f67152b = dampScrollableLayout;
        }

        public final void run() {
            this.f67151a.f67121b = ProfileQuickShopContainer.m83819a(this.f67152b, 0, (int) C34943c.f91127w, (Runnable) null);
            ValueAnimator valueAnimator = this.f67151a.f67121b;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$i */
    static final class C25498i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProfileQuickShopContainer f67153a;

        C25498i(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f67153a = profileQuickShopContainer;
        }

        public final void run() {
            this.f67153a.m83822a(false, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$j */
    public static final class C25499j implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ DmtTextView f67154a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C25499j(DmtTextView dmtTextView) {
            this.f67154a = dmtTextView;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f67154a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$k */
    static final class C25500k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DmtTextView f67155a;

        C25500k(DmtTextView dmtTextView) {
            this.f67155a = dmtTextView;
        }

        public final void run() {
            this.f67155a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$l */
    static final class C25501l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProfileQuickShopContainer f67156a;

        C25501l(ProfileQuickShopContainer profileQuickShopContainer) {
            this.f67156a = profileQuickShopContainer;
        }

        public final void run() {
            this.f67156a.getMLoadingView().setVisibility(4);
            this.f67156a.getMLoadingStatusView().mo25938c(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$m */
    static final class C25502m implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ DampScrollableLayout f67157a;

        C25502m(DampScrollableLayout dampScrollableLayout) {
            this.f67157a = dampScrollableLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f67157a.scrollTo(0, ((Integer) obj).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$n */
    public static final class C25503n implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f67158a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C25503n(Runnable runnable) {
            this.f67158a = runnable;
        }

        public final void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f67158a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private final ImageView getMCloseBtn() {
        return (ImageView) this.f67126i.getValue();
    }

    private final SmartImageView getMLoadingBgView() {
        return (SmartImageView) this.f67129l.getValue();
    }

    private final SmartImageView getMLoadingTextView() {
        return (SmartImageView) this.f67131n.getValue();
    }

    private final ImageView getMShareBtn() {
        return (ImageView) this.f67127j.getValue();
    }

    public final CommercializeWebViewHelper getCommercializeWebViewHelper() {
        return this.f67135r;
    }

    public final DmtStatusView getMLoadingStatusView() {
        return (DmtStatusView) this.f67130m.getValue();
    }

    public final View getMLoadingView() {
        return (View) this.f67128k.getValue();
    }

    public final FrameLayout getMRootView() {
        return (FrameLayout) this.f67124g.getValue();
    }

    public final CrossPlatformWebView getMWebView() {
        return (CrossPlatformWebView) this.f67125h.getValue();
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void onCreate() {
        C42961az.m136382c(this);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        C42961az.m136383d(this);
    }

    /* renamed from: a */
    public final boolean mo66195a(User user, View view, View view2, DmtTextView dmtTextView, boolean z) {
        if (C25352e.m83366d(user)) {
            m83820a(view, view2, dmtTextView, user);
            setVisibility(0);
            if (dmtTextView != null) {
                dmtTextView.setVisibility(0);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
            if (z) {
                mo66199c(true);
            }
            m83831l();
            return true;
        }
        setVisibility(8);
        if (dmtTextView != null) {
            dmtTextView.setVisibility(8);
        }
        if (view2 != null) {
            view2.setVisibility(8);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo66194a(boolean z) {
        m83826g();
        this.f67120C = z;
        if (z) {
            m83817a(getMRootView(), 0, VETransitionFilterParam.TransitionDuration_DEFAULT).start();
            View view = this.f67132o;
            if (view != null) {
                view.animate().translationY((float) view.getHeight()).setDuration(300).start();
            }
            mo66197b(true);
            CrossPlatformWebView.m85411a(getMWebView(), getUrl(), false, (Map) null, 6, (Object) null);
            this.f67141x = false;
            m83823d(true);
            return;
        }
        m83817a(getMRootView(), -getScreenHeight(), VETransitionFilterParam.TransitionDuration_DEFAULT).start();
        View view2 = this.f67132o;
        if (view2 != null) {
            view2.animate().translationY(0.0f).alpha(1.0f).setDuration(300).setStartDelay(200).start();
        }
        View view3 = this.f67133p;
        if (view3 != null) {
            view3.setAlpha(0.2f);
        }
        mo66200d();
        postDelayed(new C25492c(this), 500);
        m83823d(false);
    }

    /* renamed from: a */
    public final void mo66193a(C24573m mVar, DampScrollableLayout dampScrollableLayout) {
        C7573i.m23587b(dampScrollableLayout, "scrollableLayout");
        if (!C43122ff.m136787r(this.f67136s)) {
            AnimatorSet animatorSet = this.f67138u;
            if (animatorSet == null || !animatorSet.isRunning()) {
                Integer valueOf = mVar != null ? Integer.valueOf(mVar.f64817a) : null;
                if (valueOf != null && valueOf.intValue() == 0) {
                    m83830k();
                    this.f67140w = m83819a(dampScrollableLayout, -120, (int) C34943c.f91127w, (Runnable) null);
                    ValueAnimator valueAnimator = this.f67140w;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                    m83830k();
                    if (mVar.f64819c - mVar.f64818b < 200) {
                        this.f67140w = m83819a(dampScrollableLayout, -60, (int) C34943c.f91127w, (Runnable) new C25497h(this, dampScrollableLayout));
                        ValueAnimator valueAnimator2 = this.f67140w;
                        if (valueAnimator2 != null) {
                            valueAnimator2.start();
                        }
                    } else {
                        this.f67121b = m83819a(dampScrollableLayout, 0, (int) C34943c.f91127w, (Runnable) null);
                        ValueAnimator valueAnimator3 = this.f67121b;
                        if (valueAnimator3 != null) {
                            valueAnimator3.start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo66198c() {
        mo66197b(false);
    }

    private final int getScreenHeight() {
        return C23482j.m77095a(getContext());
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m83829j();
        m83830k();
    }

    private final String getLoadingBackgroundUrl() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            QuickShopLoadingPage quickShopLoadingPage = a.getQuickShopLoadingPage();
            if (quickShopLoadingPage != null) {
                return quickShopLoadingPage.getBackgroundUrl();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private final String getLoadingTextPicUrl() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            QuickShopLoadingPage quickShopLoadingPage = a.getQuickShopLoadingPage();
            if (quickShopLoadingPage != null) {
                return quickShopLoadingPage.getTextPicUrl();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: j */
    private final void m83829j() {
        AnimatorSet animatorSet = this.f67138u;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f67138u;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.f67138u;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            this.f67138u = null;
        }
    }

    /* renamed from: b */
    public final void mo66196b() {
        if (this.f67139v < 0 && this.f67139v < f67116e) {
            mo66194a(true);
            postDelayed(new C25498i(this), 500);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getUrl() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.f67136s
            if (r0 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.profile.model.QuickShopInfo r0 = r0.getQuickShopInfo()
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = r0.getQuickShopUrl()
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            boolean r1 = com.p280ss.android.ugc.aweme.commercialize.utils.C25352e.m83354b(r0)
            if (r1 == 0) goto L_0x0020
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = "url"
            java.lang.String r0 = r0.getQueryParameter(r1)
        L_0x0020:
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = ""
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer.getUrl():java.lang.String");
    }

    /* renamed from: i */
    private final void m83828i() {
        m83826g();
        LayoutParams layoutParams = getMRootView().getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = -getScreenHeight();
            getMRootView().setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: k */
    private final void m83830k() {
        ValueAnimator valueAnimator = this.f67140w;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.f67140w;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
            }
            ValueAnimator valueAnimator3 = this.f67140w;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            this.f67140w = null;
        }
        ValueAnimator valueAnimator4 = this.f67121b;
        if (valueAnimator4 != null && valueAnimator4.isRunning()) {
            ValueAnimator valueAnimator5 = this.f67121b;
            if (valueAnimator5 != null) {
                valueAnimator5.removeAllListeners();
            }
            ValueAnimator valueAnimator6 = this.f67121b;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
            }
            this.f67121b = null;
        }
    }

    /* renamed from: e */
    private final void m83824e() {
        boolean z;
        String loadingBackgroundUrl = getLoadingBackgroundUrl();
        boolean z2 = false;
        if (loadingBackgroundUrl != null) {
            if (loadingBackgroundUrl.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C12133n.m35301a(loadingBackgroundUrl).mo29839a(getContext()).mo29850a((C12115m) new C25238am(loadingBackgroundUrl));
            }
        }
        String loadingTextPicUrl = getLoadingTextPicUrl();
        if (loadingTextPicUrl != null) {
            if (loadingTextPicUrl.length() > 0) {
                z2 = true;
            }
            if (z2) {
                C12133n.m35301a(loadingTextPicUrl).mo29839a(getContext()).mo29850a((C12115m) new C25238am(loadingTextPicUrl));
            }
        }
    }

    /* renamed from: g */
    private final void m83826g() {
        if (!this.f67137t) {
            LayoutParams layoutParams = getMRootView().getLayoutParams();
            layoutParams.height = getScreenHeight();
            getMRootView().setLayoutParams(layoutParams);
            getMRootView().setPadding(0, C21085a.m71116a(getContext()), 0, 0);
            getMLoadingStatusView().setBuilder(C10803a.m31631a(getContext()));
            getMCloseBtn().setOnClickListener(new C25495f(this));
            getMShareBtn().setOnClickListener(new C25496g(this));
            f67116e = -((int) C9738o.m28708b(getContext(), 100.0f));
            this.f67137t = true;
        }
    }

    /* renamed from: l */
    private final void m83831l() {
        String str;
        if (this.f67136s != null && !this.f67142y) {
            this.f67142y = true;
            String str2 = "show_flash_store";
            C22984d a = C22984d.m75611a();
            String str3 = "author_id";
            User user = this.f67136s;
            String str4 = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("carrier_type", "head").f60753a);
            StringBuilder sb = new StringBuilder("head  ");
            User user2 = this.f67136s;
            if (user2 != null) {
                str4 = user2.getUid();
            }
            sb.append(str4);
        }
    }

    /* renamed from: d */
    public final void mo66200d() {
        String str;
        String str2;
        if (!this.f67141x) {
            this.f67141x = true;
            boolean z = this.f67122c;
            if (z) {
                boolean z2 = this.f67123d;
                if (z2) {
                    str = "failed_app";
                } else if (!z2) {
                    str = "success";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z) {
                str = "failed_user";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String str3 = "enter_flash_store";
            C22984d a = C22984d.m75611a();
            String str4 = "author_id";
            User user = this.f67136s;
            if (user != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).mo59973a("enter_method", "slidedown").mo59973a("is_success", str).f60753a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m83825f() {
        /*
            r7 = this;
            java.lang.String r0 = r7.getLoadingBackgroundUrl()
            r1 = 2131231357(0x7f08027d, float:1.8078793E38)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x002f
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0016
            r4 = 1
            goto L_0x0017
        L_0x0016:
            r4 = 0
        L_0x0017:
            if (r4 != r3) goto L_0x002f
            com.bytedance.lighten.core.r r0 = com.bytedance.lighten.core.C12133n.m35301a(r0)
            com.bytedance.lighten.core.r r0 = r0.mo29835a(r1)
            com.bytedance.lighten.loader.SmartImageView r1 = r7.getMLoadingBgView()
            com.bytedance.lighten.core.i r1 = (com.bytedance.lighten.core.C12128i) r1
            com.bytedance.lighten.core.r r0 = r0.mo29844a(r1)
            r0.mo29848a()
            goto L_0x0040
        L_0x002f:
            com.bytedance.lighten.core.r r0 = com.bytedance.lighten.core.C12133n.m35298a(r1)
            com.bytedance.lighten.loader.SmartImageView r1 = r7.getMLoadingBgView()
            com.bytedance.lighten.core.i r1 = (com.bytedance.lighten.core.C12128i) r1
            com.bytedance.lighten.core.r r0 = r0.mo29844a(r1)
            r0.mo29848a()
        L_0x0040:
            android.content.Context r0 = r7.getContext()
            r1 = 2131233042(0x7f080912, float:1.808221E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            com.bytedance.lighten.loader.SmartImageView r4 = r7.getMLoadingTextView()
            if (r0 == 0) goto L_0x0056
            int r5 = r0.getIntrinsicWidth()
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            if (r0 == 0) goto L_0x005e
            int r0 = r0.getIntrinsicHeight()
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r5 <= 0) goto L_0x0072
            if (r0 <= 0) goto L_0x0072
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            r6.width = r5
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            r5.height = r0
            r4.requestLayout()
        L_0x0072:
            java.lang.String r0 = r7.getLoadingTextPicUrl()
            if (r0 == 0) goto L_0x00a1
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0082
            r2 = 1
        L_0x0082:
            if (r2 != r3) goto L_0x00a1
            com.bytedance.lighten.core.r r0 = com.bytedance.lighten.core.C12133n.m35301a(r0)
            com.bytedance.lighten.core.r r0 = r0.mo29835a(r1)
            com.bytedance.lighten.loader.SmartImageView r1 = r7.getMLoadingTextView()
            com.bytedance.lighten.core.i r1 = (com.bytedance.lighten.core.C12128i) r1
            com.bytedance.lighten.core.r r0 = r0.mo29844a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.cc r1 = new com.ss.android.ugc.aweme.commercialize.utils.cc
            r1.<init>()
            com.bytedance.lighten.core.c.j r1 = (com.bytedance.lighten.core.p612c.C12112j) r1
            r0.mo29849a(r1)
            return
        L_0x00a1:
            com.bytedance.lighten.core.r r0 = com.bytedance.lighten.core.C12133n.m35298a(r1)
            com.bytedance.lighten.loader.SmartImageView r1 = r7.getMLoadingTextView()
            com.bytedance.lighten.core.i r1 = (com.bytedance.lighten.core.C12128i) r1
            com.bytedance.lighten.core.r r0 = r0.mo29844a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.cc r1 = new com.ss.android.ugc.aweme.commercialize.utils.cc
            r1.<init>()
            com.bytedance.lighten.core.c.j r1 = (com.bytedance.lighten.core.p612c.C12112j) r1
            r0.mo29849a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer.m83825f():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m83827h() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$e r0 = new com.ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer$e
            r0.<init>(r5)
            android.widget.FrameLayout r1 = r5.getMRootView()
            android.view.View r1 = (android.view.View) r1
            android.app.Activity r1 = com.p280ss.android.ugc.aweme.base.utils.C23487o.m77158e(r1)
            if (r1 == 0) goto L_0x0088
            boolean r2 = r1 instanceof android.arch.lifecycle.C0043i
            if (r2 == 0) goto L_0x0088
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "url"
            java.lang.String r4 = r5.getUrl()
            r2.putString(r3, r4)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r3 = r5.getMWebView()
            com.ss.android.ugc.aweme.crossplatform.view.c r3 = (com.p280ss.android.ugc.aweme.crossplatform.view.C26025c) r3
            com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = (com.p280ss.android.ugc.aweme.crossplatform.platform.webview.C25965c) r0
            r4 = r1
            android.arch.lifecycle.i r4 = (android.arch.lifecycle.C0043i) r4
            com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper r0 = com.p280ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper.m82757a(r3, r0, r4, r1, r2)
            r5.f67135r = r0
            com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper r0 = r5.f67135r
            if (r0 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.crossplatform.business.i r0 = r0.getCrossPlatformBusiness()
            if (r0 == 0) goto L_0x005d
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness> r1 = com.p280ss.android.ugc.aweme.crossplatform.business.ShareBusiness.class
            com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business r0 = r0.mo67230a(r1)
            com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness r0 = (com.p280ss.android.ugc.aweme.crossplatform.business.ShareBusiness) r0
            if (r0 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r5.getMWebView()
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.view.m> r2 = com.p280ss.android.ugc.aweme.crossplatform.view.C26039m.class
            com.ss.android.ugc.aweme.crossplatform.view.l r1 = r1.mo67463a(r2)
            com.ss.android.ugc.aweme.crossplatform.view.m r1 = (com.p280ss.android.ugc.aweme.crossplatform.view.C26039m) r1
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r1 = r1.mo67531b()
            android.webkit.WebView r1 = (android.webkit.WebView) r1
            r0.mo67157a(r1)
        L_0x005d:
            com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper r0 = r5.f67135r
            if (r0 == 0) goto L_0x006a
            com.ss.android.ugc.aweme.crossplatform.params.base.b r0 = r0.getCrossPlatformParams()
            if (r0 == 0) goto L_0x006a
            com.ss.android.ugc.aweme.crossplatform.params.e r0 = r0.f68476d
            goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            android.widget.ImageView r1 = r5.getMShareBtn()
            if (r0 == 0) goto L_0x0074
            boolean r0 = r0.f68507b
            goto L_0x0075
        L_0x0074:
            r0 = 1
        L_0x0075:
            if (r0 == 0) goto L_0x007a
            r0 = 8
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            r1.setVisibility(r0)
            android.arch.lifecycle.Lifecycle r0 = r4.getLifecycle()
            r1 = r5
            android.arch.lifecycle.h r1 = (android.arch.lifecycle.C0042h) r1
            r0.mo55a(r1)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer.m83827h():void");
    }

    /* renamed from: a */
    public final void mo66191a() {
        if (this.f67122c) {
            CommercializeWebViewHelper commercializeWebViewHelper = this.f67135r;
            if (commercializeWebViewHelper != null) {
                C25862i crossPlatformBusiness = commercializeWebViewHelper.getCrossPlatformBusiness();
                if (crossPlatformBusiness != null) {
                    ShareBusiness shareBusiness = (ShareBusiness) crossPlatformBusiness.mo67230a(ShareBusiness.class);
                    if (shareBusiness != null) {
                        shareBusiness.mo67162b(((C26039m) getMWebView().mo67463a(C26039m.class)).mo67531b());
                    }
                }
            }
            return;
        }
        CommercializeWebViewHelper commercializeWebViewHelper2 = this.f67135r;
        if (commercializeWebViewHelper2 != null) {
            C25862i crossPlatformBusiness2 = commercializeWebViewHelper2.getCrossPlatformBusiness();
            if (crossPlatformBusiness2 != null) {
                ShareBusiness shareBusiness2 = (ShareBusiness) crossPlatformBusiness2.mo67230a(ShareBusiness.class);
                if (shareBusiness2 != null) {
                    shareBusiness2.mo67164c();
                }
            }
        }
    }

    public final void setCommercializeWebViewHelper(CommercializeWebViewHelper commercializeWebViewHelper) {
        this.f67135r = commercializeWebViewHelper;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: c */
    public final void mo66199c(boolean z) {
        if (z) {
            m83822a(true, true);
            m83831l();
            return;
        }
        m83822a(false, false);
        m83828i();
        this.f67142y = false;
    }

    /* renamed from: d */
    private final void m83823d(boolean z) {
        Activity e = C23487o.m77158e(getMRootView());
        if (!(e instanceof MainActivity)) {
            if (e instanceof UserProfileActivity) {
                if (z) {
                    ((UserProfileActivity) e).mo92365a((C23254a) this.f67143z);
                    return;
                }
                ((UserProfileActivity) e).mo92366b(this.f67143z);
            }
        } else if (z) {
            ((MainActivity) e).registerActivityOnKeyDownListener(this.f67143z);
        } else {
            ((MainActivity) e).unRegisterActivityOnKeyDownListener(this.f67143z);
        }
    }

    @C7709l
    public final void onEvent(ShareCompleteEvent shareCompleteEvent) {
        C7573i.m23587b(shareCompleteEvent, "event");
        if (TextUtils.equals("web", shareCompleteEvent.itemType)) {
            C43091ed.m136696a(getContext(), getMRootView(), shareCompleteEvent);
        }
    }

    /* renamed from: b */
    public final void mo66197b(boolean z) {
        if (z) {
            getMLoadingView().setVisibility(0);
            getMLoadingView().setAlpha(1.0f);
            getMLoadingView().setScaleX(1.0f);
            getMLoadingView().setScaleY(1.0f);
            m83825f();
            getMLoadingStatusView().mo25942f();
            return;
        }
        getMLoadingView().animate().alpha(0.0f).scaleX(1.1f).scaleY(1.1f).setDuration(200).withEndAction(new C25501l(this)).setInterpolator(new C28173d()).start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r3.getVisibility() == 0) goto L_0x007b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66192a(int r6) {
        /*
            r5 = this;
            int r0 = r5.f67139v
            if (r0 != r6) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 2
            r2 = 0
            if (r6 >= 0) goto L_0x006b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r5.f67134q
            if (r3 == 0) goto L_0x001e
            int r3 = r3.getVisibility()
            r4 = 8
            if (r3 != r4) goto L_0x001e
            int r3 = r5.f67139v
            if (r3 <= r6) goto L_0x001e
            r3 = 1
            r5.m83822a(r3, false)
        L_0x001e:
            int r0 = f67116e
            if (r6 >= r0) goto L_0x002e
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.f67134q
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = r5.f67119B
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            goto L_0x0039
        L_0x002e:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.f67134q
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = r5.f67118A
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0039:
            boolean r0 = r5.f67120C
            if (r0 != 0) goto L_0x007e
            android.view.View r0 = r5.f67132o
            if (r0 == 0) goto L_0x0055
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1063675494(0x3f666666, float:0.9)
            float r3 = (float) r6
            float r2 = r2 * r3
            float r2 = r2 * r3
            int r3 = f67116e
            int r3 = r3 * r3
            float r3 = (float) r3
            float r2 = r2 / r3
            float r1 = r1 - r2
            r0.setAlpha(r1)
        L_0x0055:
            android.view.View r0 = r5.f67133p
            if (r0 == 0) goto L_0x007e
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r2 = 1060320051(0x3f333333, float:0.7)
            float r3 = (float) r6
            float r3 = r3 * r2
            int r2 = f67116e
            float r2 = (float) r2
            float r3 = r3 / r2
            float r3 = r3 + r1
            r0.setAlpha(r3)
            goto L_0x007e
        L_0x006b:
            if (r6 == 0) goto L_0x007b
            r3 = 40
            if (r6 <= r3) goto L_0x007e
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r5.f67134q
            if (r3 == 0) goto L_0x007e
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x007e
        L_0x007b:
            r5.m83822a(r2, false)
        L_0x007e:
            r5.f67139v = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.ProfileQuickShopContainer.mo66192a(int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m83822a(boolean z, boolean z2) {
        DmtTextView dmtTextView = this.f67134q;
        if (dmtTextView != null) {
            m83829j();
            if (z) {
                dmtTextView.setVisibility(0);
                dmtTextView.setText(this.f67118A);
                dmtTextView.setAlpha(0.0f);
                if (!z2) {
                    dmtTextView.animate().alpha(1.0f).setDuration(200).start();
                } else {
                    this.f67138u = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dmtTextView, "alpha", new float[]{0.0f, 1.0f});
                    C7573i.m23582a((Object) ofFloat, "guideIn");
                    ofFloat.setDuration(200);
                    ofFloat.setStartDelay(800);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dmtTextView, "alpha", new float[]{1.0f, 0.0f});
                    C7573i.m23582a((Object) ofFloat2, "guideOut");
                    ofFloat2.setDuration(200);
                    ofFloat2.setStartDelay(8000);
                    AnimatorSet animatorSet = this.f67138u;
                    if (animatorSet != null) {
                        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
                    }
                    AnimatorSet animatorSet2 = this.f67138u;
                    if (animatorSet2 != null) {
                        animatorSet2.addListener(new C25499j(dmtTextView));
                    }
                    AnimatorSet animatorSet3 = this.f67138u;
                    if (animatorSet3 != null) {
                        animatorSet3.start();
                    }
                }
            } else {
                dmtTextView.animate().alpha(0.0f).setDuration(200).withEndAction(new C25500k(dmtTextView)).start();
            }
        }
    }

    /* renamed from: a */
    private static ValueAnimator m83817a(View view, int i, int i2) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{marginLayoutParams.topMargin, i});
            ofInt.addUpdateListener(new C25493d(marginLayoutParams, view));
            C7573i.m23582a((Object) ofInt, "animator");
            ofInt.setDuration(500);
            ofInt.setInterpolator(new C43177a());
            return ofInt;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static ValueAnimator m83819a(DampScrollableLayout dampScrollableLayout, int i, int i2, Runnable runnable) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{dampScrollableLayout.getCurScrollY(), i});
        ofInt.addUpdateListener(new C25502m(dampScrollableLayout));
        C7573i.m23582a((Object) ofInt, "animator");
        ofInt.setDuration((long) i2);
        ofInt.addListener(new C25503n(runnable));
        return ofInt;
    }

    /* renamed from: a */
    private final void m83820a(View view, View view2, DmtTextView dmtTextView, User user) {
        m83826g();
        this.f67132o = view;
        this.f67133p = view2;
        this.f67134q = dmtTextView;
        this.f67136s = user;
        if (user != null) {
            QuickShopInfo quickShopInfo = user.getQuickShopInfo();
            if (quickShopInfo != null) {
                QuickShopSecondFloorInfo secondFloorInfo = quickShopInfo.getSecondFloorInfo();
                if (secondFloorInfo != null && !TextUtils.isEmpty(secondFloorInfo.getProcessText()) && !TextUtils.isEmpty(secondFloorInfo.getEnterText())) {
                    String processText = secondFloorInfo.getProcessText();
                    C7573i.m23582a((Object) processText, "it.processText");
                    this.f67118A = processText;
                    String enterText = secondFloorInfo.getEnterText();
                    C7573i.m23582a((Object) enterText, "it.enterText");
                    this.f67119B = enterText;
                }
            }
        }
        m83827h();
        m83822a(true, true);
        m83824e();
        m83828i();
    }
}
