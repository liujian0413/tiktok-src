package com.p280ss.android.ugc.aweme.profile.widgets;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11496ae;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11674x;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView.C26926a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.p1049ay.C23142a;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.profile.C35662a;
import com.p280ss.android.ugc.aweme.profile.C35735b;
import com.p280ss.android.ugc.aweme.profile.C35779f;
import com.p280ss.android.ugc.aweme.profile.C36105x;
import com.p280ss.android.ugc.aweme.profile.api.C35731g;
import com.p280ss.android.ugc.aweme.profile.api.UsedPhoneApi;
import com.p280ss.android.ugc.aweme.profile.experiment.ShowCompleteProfileAlertStyle;
import com.p280ss.android.ugc.aweme.profile.model.HomePageBottomToast;
import com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsg;
import com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.model.UserRateRemindInfo;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36403cq;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36439dx;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UsedPhoneConfirmActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.NoticeButtonView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.NoticeButtonView.C36601b;
import com.p280ss.android.ugc.aweme.profile.service.C36065a;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.p280ss.android.ugc.aweme.profile.service.C36075k;
import com.p280ss.android.ugc.aweme.profile.survey.C36076a;
import com.p280ss.android.ugc.aweme.profile.survey.C36077b;
import com.p280ss.android.ugc.aweme.profile.survey.C36078c;
import com.p280ss.android.ugc.aweme.profile.survey.C36079d;
import com.p280ss.android.ugc.aweme.profile.survey.C36080e;
import com.p280ss.android.ugc.aweme.profile.survey.C36084h;
import com.p280ss.android.ugc.aweme.profile.util.C36711ae;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;
import kotlin.text.Regex;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget */
public final class MyProfileGuideWidget extends ProfileWidget {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f96606g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MyProfileGuideWidget.class), "noPublishWarnStub", "getNoPublishWarnStub()Landroid/view/ViewStub;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MyProfileGuideWidget.class), "gpWarningStub", "getGpWarningStub()Landroid/view/ViewStub;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MyProfileGuideWidget.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/profile/viewmodel/MyProfileGuideViewModel;"))};

    /* renamed from: k */
    public static final C36833a f96607k = new C36833a(null);

    /* renamed from: h */
    public final String f96608h = MyProfileGuideWidget.class.getSimpleName();

    /* renamed from: i */
    public View f96609i;

    /* renamed from: j */
    public ObjectAnimator f96610j;

    /* renamed from: n */
    private final C7541d f96611n = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C36858i(this));

    /* renamed from: o */
    private C36439dx f96612o;

    /* renamed from: p */
    private Object f96613p;

    /* renamed from: q */
    private Object f96614q;

    /* renamed from: r */
    private Object f96615r;

    /* renamed from: s */
    private C36084h f96616s;

    /* renamed from: t */
    private UsedPhoneApi f96617t;

    /* renamed from: u */
    private final C7541d f96618u = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C36848c(this));

    /* renamed from: v */
    private View f96619v;

    /* renamed from: w */
    private final WidgetLifecycleAwareLazy f96620w;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$a */
    public static final class C36833a {
        private C36833a() {
        }

        public /* synthetic */ C36833a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aa */
    static final class C36834aa implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96621a;

        /* renamed from: b */
        final /* synthetic */ View f96622b;

        C36834aa(MyProfileGuideWidget myProfileGuideWidget, View view) {
            this.f96621a = myProfileGuideWidget;
            this.f96622b = view;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C27326a.m89578a(view)) {
                View view2 = this.f96622b;
                C7573i.m23582a((Object) view2, "gpWarningView");
                view2.setVisibility(8);
                C36074j.f94315a.onPunishWarningClick(this.f96621a.mo93263w());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ab */
    static final class C36835ab implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96623a;

        /* renamed from: b */
        final /* synthetic */ View f96624b;

        C36835ab(MyProfileGuideWidget myProfileGuideWidget, View view) {
            this.f96623a = myProfileGuideWidget;
            this.f96624b = view;
        }

        public final void run() {
            MyProfileGuideWidget myProfileGuideWidget = this.f96623a;
            C21085a a = C21085a.m71117a();
            C7573i.m23582a((Object) a, "AdaptationManager.getInstance()");
            myProfileGuideWidget.f96610j = ObjectAnimator.ofFloat(this.f96624b, "translationY", new float[]{0.0f, -((float) a.mo56926b())});
            ObjectAnimator objectAnimator = this.f96623a.f96610j;
            if (objectAnimator != null) {
                ObjectAnimator duration = objectAnimator.setDuration(200);
                if (duration != null) {
                    duration.start();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ac */
    static final class C36836ac extends Lambda implements C48006q<C11585f, Integer, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96625a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f96626b;

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ac$a */
        static final /* synthetic */ class C36837a extends FunctionReference implements C7562b<ProfileState, ProfileState> {

            /* renamed from: a */
            public static final C36837a f96627a = new C36837a();

            C36837a() {
                super(1);
            }

            public final String getName() {
                return "identity";
            }

            public final C7585d getOwner() {
                return C7575l.m23596a(C35735b.class, "profile_musicallyI18nRelease");
            }

            public final String getSignature() {
                return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m118691a((ProfileState) obj);
            }

            /* renamed from: a */
            private static ProfileState m118691a(ProfileState profileState) {
                C7573i.m23587b(profileState, "p1");
                return (ProfileState) C35735b.m115462a(profileState);
            }
        }

        C36836ac(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f96625a = myProfileGuideWidget;
            this.f96626b = noticeView;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m118690a((C11585f) obj, ((Number) obj2).intValue(), (Boolean) obj3);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m118690a(C11585f fVar, int i, Boolean bool) {
            C7573i.m23587b(fVar, "$receiver");
            ProfileState profileState = (ProfileState) fVar.mo29066a(this.f96625a.mo93264x(), C36837a.f96627a);
            if (i != 0 || !MyProfileGuideWidget.m118647f(profileState)) {
                this.f96625a.mo93224a(8, false);
                NoticeView noticeView = this.f96626b;
                if (noticeView != null) {
                    noticeView.setVisibility(4);
                    return;
                }
                return;
            }
            this.f96625a.mo93224a(0, false);
            this.f96625a.mo93246t();
            NoticeView noticeView2 = this.f96626b;
            if (noticeView2 != null) {
                noticeView2.setVisibility(4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ad */
    public static final class C36838ad implements C26926a {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96628a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f96629b;

        /* renamed from: c */
        final /* synthetic */ int f96630c;

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ad$a */
        static final /* synthetic */ class C36839a extends FunctionReference implements C7562b<ProfileState, ProfileState> {

            /* renamed from: a */
            public static final C36839a f96631a = new C36839a();

            C36839a() {
                super(1);
            }

            public final String getName() {
                return "identity";
            }

            public final C7585d getOwner() {
                return C7575l.m23596a(C35735b.class, "profile_musicallyI18nRelease");
            }

            public final String getSignature() {
                return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m118694a((ProfileState) obj);
            }

            /* renamed from: a */
            private static ProfileState m118694a(ProfileState profileState) {
                C7573i.m23587b(profileState, "p1");
                return (ProfileState) C35735b.m115462a(profileState);
            }
        }

        /* renamed from: b */
        public final void mo69647b() {
            this.f96629b.setVisibility(8);
        }

        /* renamed from: a */
        public final void mo69646a() {
            this.f96629b.setVisibility(8);
            C6907h.m21524a("link_account_banner_click", (Map) C22984d.m75611a().mo59970a("content_type", this.f96630c).f60753a);
            if (this.f96628a.mo93263w() instanceof FragmentActivity) {
                C36065a aVar = C36065a.f94305a;
                Activity w = this.f96628a.mo93263w();
                if (w != null) {
                    C0608j supportFragmentManager = ((FragmentActivity) w).getSupportFragmentManager();
                    C7573i.m23582a((Object) supportFragmentManager, "(activity as FragmentAct…y).supportFragmentManager");
                    String enterFrom = ((ProfileState) this.f96628a.mo29066a(this.f96628a.mo93264x(), C36839a.f96631a)).getEnterFrom();
                    if (enterFrom == null) {
                        enterFrom = "";
                    }
                    aVar.mo91795a(supportFragmentManager, enterFrom, (C36403cq) null);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }

        C36838ad(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView, int i) {
            this.f96628a = myProfileGuideWidget;
            this.f96629b = noticeView;
            this.f96630c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ae */
    public static final class C36840ae implements C36601b {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96632a;

        /* renamed from: b */
        final /* synthetic */ NoticeButtonView f96633b;

        /* renamed from: b */
        public final void mo92856b() {
            this.f96633b.setVisibility(8);
            C35662a.m115265a().mo90507b(true);
            C6907h.m21524a("banner_click", (Map) C22984d.m75611a().mo59973a("banner_type", "coupon_fission").mo59973a("banner_name", "tiktok_rewards").mo59973a("enter_from", "personal_homepage").mo59973a("click_position", "cross").f60753a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0062  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo92855a() {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView r0 = r6.f96633b
                r1 = 8
                r0.setVisibility(r1)
                com.ss.android.ugc.aweme.profile.a r0 = com.p280ss.android.ugc.aweme.profile.C35662a.m115265a()
                r1 = 1
                r0.mo90507b(r1)
                java.lang.String r0 = "banner_click"
                com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r3 = "banner_type"
                java.lang.String r4 = "coupon_fission"
                com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
                java.lang.String r3 = "banner_name"
                java.lang.String r4 = "tiktok_rewards"
                com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
                java.lang.String r3 = "enter_from"
                java.lang.String r4 = "personal_homepage"
                com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
                java.lang.String r3 = "click_position"
                java.lang.String r4 = "join"
                com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r2)
                com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget r0 = r6.f96632a
                android.app.Activity r0 = r0.mo93263w()
                android.content.Context r0 = (android.content.Context) r0
                java.lang.String r2 = "//webview"
                com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r2)
                java.lang.String r2 = "url"
                r3 = 0
                com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r4 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ NullValueException -> 0x005f }
                java.lang.String r5 = "SettingsReader.get()"
                kotlin.jvm.internal.C7573i.m23582a(r4, r5)     // Catch:{ NullValueException -> 0x005f }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r4 = r4.getAwemeActivitySetting()     // Catch:{ NullValueException -> 0x005f }
                if (r4 == 0) goto L_0x005f
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton r4 = r4.getProfileActivityButton()     // Catch:{ NullValueException -> 0x005f }
                goto L_0x0060
            L_0x005f:
                r4 = r3
            L_0x0060:
                if (r4 == 0) goto L_0x0066
                java.lang.String r3 = r4.getH5Link()
            L_0x0066:
                com.bytedance.router.SmartRoute r0 = r0.withParam(r2, r3)
                java.lang.String r2 = "hide_nav_bar"
                com.bytedance.router.SmartRoute r0 = r0.withParam(r2, r1)
                r1 = 268435456(0x10000000, float:2.5243549E-29)
                com.bytedance.router.SmartRoute r0 = r0.addFlags(r1)
                r0.open()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.C36840ae.mo92855a():void");
        }

        C36840ae(MyProfileGuideWidget myProfileGuideWidget, NoticeButtonView noticeButtonView) {
            this.f96632a = myProfileGuideWidget;
            this.f96633b = noticeButtonView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$af */
    public static final class C36841af implements C26926a {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96634a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f96635b;

        /* renamed from: b */
        public final void mo69647b() {
            this.f96635b.setVisibility(8);
            this.f96634a.mo93230a(false);
        }

        /* renamed from: a */
        public final void mo69646a() {
            this.f96635b.setVisibility(8);
            SmartRouter.buildRoute((Context) this.f96634a.mo93263w(), "aweme://privacy/setting").open();
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl shouldShowPrivateAccountTipInProfile = inst.getShouldShowPrivateAccountTipInProfile();
            C7573i.m23582a((Object) shouldShowPrivateAccountTipInProfile, "SharePrefCache.inst().sh…rivateAccountTipInProfile");
            shouldShowPrivateAccountTipInProfile.mo59871a(Boolean.valueOf(false));
            C6907h.m21524a("privacy_floating_bar_click", (Map) C22984d.m75611a().f60753a);
            this.f96634a.mo93230a(false);
        }

        C36841af(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f96634a = myProfileGuideWidget;
            this.f96635b = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ag */
    static final class C36842ag implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96636a;

        C36842ag(MyProfileGuideWidget myProfileGuideWidget) {
            this.f96636a = myProfileGuideWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7195s.m22438a().mo18679a(this.f96636a.mo93263w(), "aweme://profile_edit");
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            inst.getIsProfileBubbleShown().mo59871a(Boolean.valueOf(false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ah */
    static final /* synthetic */ class C36843ah extends FunctionReference implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        public static final C36843ah f96637a = new C36843ah();

        C36843ah() {
            super(1);
        }

        public final String getName() {
            return "identity";
        }

        public final C7585d getOwner() {
            return C7575l.m23596a(C35735b.class, "profile_musicallyI18nRelease");
        }

        public final String getSignature() {
            return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m118699a((ProfileState) obj);
        }

        /* renamed from: a */
        private static ProfileState m118699a(ProfileState profileState) {
            C7573i.m23587b(profileState, "p1");
            return (ProfileState) C35735b.m115462a(profileState);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ai */
    static final /* synthetic */ class C36844ai extends FunctionReference implements C7562b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C36844ai f96638a = new C36844ai();

        C36844ai() {
            super(1);
        }

        public final String getName() {
            return "identity";
        }

        public final C7585d getOwner() {
            return C7575l.m23596a(C35735b.class, "profile_musicallyI18nRelease");
        }

        public final String getSignature() {
            return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m118700a((MyProfileGuideState) obj);
        }

        /* renamed from: a */
        private static MyProfileGuideState m118700a(MyProfileGuideState myProfileGuideState) {
            C7573i.m23587b(myProfileGuideState, "p1");
            return (MyProfileGuideState) C35735b.m115462a(myProfileGuideState);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aj */
    public static final class C36845aj implements C26926a {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96639a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f96640b;

        /* renamed from: b */
        public final void mo69647b() {
            this.f96640b.setVisibility(8);
        }

        /* renamed from: a */
        public final void mo69646a() {
            this.f96640b.setVisibility(8);
            this.f96639a.mo93263w().startActivity(new Intent(this.f96639a.mo93263w(), UsedPhoneConfirmActivity.class));
            C6907h.m21524a("enter_secondhand_confirm_page", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("enter_method", "bubble").f60753a);
        }

        C36845aj(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f96639a = myProfileGuideWidget;
            this.f96640b = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$ak */
    public static final class C36846ak implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96641a;

        public final void onAnimationRepeat(Animation animation) {
            C7573i.m23587b(animation, "animation");
        }

        public final void onAnimationStart(Animation animation) {
            C7573i.m23587b(animation, "animation");
        }

        C36846ak(MyProfileGuideWidget myProfileGuideWidget) {
            this.f96641a = myProfileGuideWidget;
        }

        public final void onAnimationEnd(Animation animation) {
            C7573i.m23587b(animation, "animation");
            View view = this.f96641a.f96609i;
            if (view != null) {
                view.setLayerType(0, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$b */
    static final class C36847b extends Lambda implements C7562b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C36847b f96642a = new C36847b();

        C36847b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m118703a((MyProfileGuideState) obj);
        }

        /* renamed from: a */
        private static MyProfileGuideState m118703a(MyProfileGuideState myProfileGuideState) {
            C7573i.m23587b(myProfileGuideState, "$receiver");
            return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, true, null, null, null, null, null, 487, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$c */
    static final class C36848c extends Lambda implements C7561a<ViewStub> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96643a;

        C36848c(MyProfileGuideWidget myProfileGuideWidget) {
            this.f96643a = myProfileGuideWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ViewStub invoke() {
            View view = this.f96643a.f34459e;
            if (view == null) {
                C7573i.m23580a();
            }
            return (ViewStub) view.findViewById(R.id.c2p);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$d */
    public static final class C36849d implements C7498y<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96644a;

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$d$a */
        static final class C36850a extends Lambda implements C7562b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a */
            public static final C36850a f96645a = new C36850a();

            C36850a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m118706a((MyProfileGuideState) obj);
            }

            /* renamed from: a */
            private static MyProfileGuideState m118706a(MyProfileGuideState myProfileGuideState) {
                C7573i.m23587b(myProfileGuideState, "$receiver");
                return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, Boolean.valueOf(false), null, null, null, 479, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$d$b */
        static final class C36851b extends Lambda implements C7562b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a */
            final /* synthetic */ boolean f96646a;

            C36851b(boolean z) {
                this.f96646a = z;
                super(1);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                C7573i.m23587b(myProfileGuideState, "$receiver");
                return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, Boolean.valueOf(this.f96646a), null, null, null, 479, null);
            }
        }

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        C36849d(MyProfileGuideWidget myProfileGuideWidget) {
            this.f96644a = myProfileGuideWidget;
        }

        public final /* synthetic */ void onNext(Object obj) {
            m118705a(((Boolean) obj).booleanValue());
        }

        /* renamed from: a */
        private void m118705a(boolean z) {
            this.f96644a.mo93244r().mo93147f(new C36851b(z));
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f96644a.mo93244r().mo93147f(C36850a.f96645a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$e */
    public static final class C36852e implements C36079d {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96647a;

        /* renamed from: b */
        final /* synthetic */ C36084h f96648b;

        /* renamed from: a */
        public final void mo91810a() {
            this.f96648b.mo91820c();
        }

        /* renamed from: a */
        public final void mo91811a(C23142a aVar) {
            String str;
            C7573i.m23587b(aVar, "surveyData");
            String str2 = "pop_survey_show";
            C22984d a = C22984d.m75611a().mo59973a("pop_survey_id", String.valueOf(aVar.f61071a));
            String str3 = "pop_survey_question";
            if (!TextUtils.isEmpty(aVar.f61078h)) {
                str = aVar.f61078h;
            } else {
                str = aVar.f61073c;
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59970a("original_id", aVar.f61079i).f60753a);
        }

        C36852e(MyProfileGuideWidget myProfileGuideWidget, C36084h hVar) {
            this.f96647a = myProfileGuideWidget;
            this.f96648b = hVar;
        }

        /* renamed from: a */
        public final void mo91812a(C23142a aVar, int i, String str) {
            C7573i.m23587b(aVar, "surveyData");
            C7573i.m23587b(str, "answerText");
            switch (i) {
                case 1:
                    this.f96648b.mo91821d();
                    break;
                case 2:
                    this.f96648b.mo91821d();
                    break;
                case 3:
                    this.f96648b.mo91820c();
                    break;
            }
            C36080e.m116209a();
            C36080e.m116211a(new C36078c(i, aVar.f61071a, aVar.f61079i));
            this.f96647a.mo93225a(aVar, i, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$f */
    static final class C36853f extends Lambda implements C7562b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C36853f f96649a = new C36853f();

        C36853f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m118711a((MyProfileGuideState) obj);
        }

        /* renamed from: a */
        private static MyProfileGuideState m118711a(MyProfileGuideState myProfileGuideState) {
            C7573i.m23587b(myProfileGuideState, "$receiver");
            return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, null, Boolean.valueOf(false), null, null, 447, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$g */
    public static final class C36854g implements C47557ad<UsedPhoneNoticeMsgResponse> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96650a;

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$g$a */
        static final class C36855a extends Lambda implements C7562b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a */
            public static final C36855a f96651a = new C36855a();

            C36855a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m118713a((MyProfileGuideState) obj);
            }

            /* renamed from: a */
            private static MyProfileGuideState m118713a(MyProfileGuideState myProfileGuideState) {
                C7573i.m23587b(myProfileGuideState, "$receiver");
                return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, null, Boolean.valueOf(false), null, null, 447, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$g$b */
        static final class C36856b extends Lambda implements C7562b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a */
            final /* synthetic */ UsedPhoneNoticeMsgResponse f96652a;

            C36856b(UsedPhoneNoticeMsgResponse usedPhoneNoticeMsgResponse) {
                this.f96652a = usedPhoneNoticeMsgResponse;
                super(1);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                Boolean valueOf;
                C7573i.m23587b(myProfileGuideState, "$receiver");
                UsedPhoneNoticeMsg usedPhoneNoticeMsg = this.f96652a.data;
                if (usedPhoneNoticeMsg != null) {
                    valueOf = Boolean.valueOf(usedPhoneNoticeMsg.has_notice);
                } else {
                    valueOf = Boolean.valueOf(false);
                }
                return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, null, valueOf, this.f96652a.data, null, 319, null);
            }
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        C36854g(MyProfileGuideWidget myProfileGuideWidget) {
            this.f96650a = myProfileGuideWidget;
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f96650a.mo93244r().mo93147f(C36855a.f96651a);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(UsedPhoneNoticeMsgResponse usedPhoneNoticeMsgResponse) {
            C7573i.m23587b(usedPhoneNoticeMsgResponse, "response");
            Keva.getRepo("keva_repo_profile_component").storeLong(MyProfileGuideWidget.m118636a("last_time_fetch_used_phone_msg"), System.currentTimeMillis());
            this.f96650a.mo93244r().mo93147f(new C36856b(usedPhoneNoticeMsgResponse));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$h */
    static final class C36857h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f96653a;

        /* renamed from: b */
        final /* synthetic */ C23142a f96654b;

        /* renamed from: c */
        final /* synthetic */ String f96655c;

        C36857h(int i, C23142a aVar, String str) {
            this.f96653a = i;
            this.f96654b = aVar;
            this.f96655c = str;
        }

        public final void run() {
            String str;
            String str2;
            if (this.f96653a == 3) {
                String str3 = "pop_survey_close";
                C22984d a = C22984d.m75611a().mo59973a("pop_survey_id", String.valueOf(this.f96654b.f61071a));
                String str4 = "pop_survey_question";
                if (!TextUtils.isEmpty(this.f96654b.f61078h)) {
                    str2 = this.f96654b.f61078h;
                } else {
                    str2 = this.f96654b.f61073c;
                }
                C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).mo59970a("original_id", this.f96654b.f61079i).f60753a);
                return;
            }
            if (this.f96653a == 1 || this.f96653a == 2) {
                String str5 = "pop_survey_answer";
                C22984d a2 = C22984d.m75611a().mo59973a("pop_survey_id", String.valueOf(this.f96654b.f61071a));
                String str6 = "pop_survey_question";
                if (!TextUtils.isEmpty(this.f96654b.f61078h)) {
                    str = this.f96654b.f61078h;
                } else {
                    str = this.f96654b.f61073c;
                }
                C6907h.m21524a(str5, (Map) a2.mo59973a(str6, str).mo59970a("original_id", this.f96654b.f61079i).mo59973a("pop_survey_answer", this.f96655c).f60753a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$i */
    static final class C36858i extends Lambda implements C7561a<ViewStub> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96656a;

        C36858i(MyProfileGuideWidget myProfileGuideWidget) {
            this.f96656a = myProfileGuideWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ViewStub invoke() {
            View view = this.f96656a.f34459e;
            if (view == null) {
                C7573i.m23580a();
            }
            return (ViewStub) view.findViewById(R.id.c4m);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$j */
    static final class C36859j extends Lambda implements C48008s<C11585f, Boolean, C11491a<? extends Pair<? extends UrlModel, ? extends C12131l>>, String, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96657a;

        C36859j(MyProfileGuideWidget myProfileGuideWidget) {
            this.f96657a = myProfileGuideWidget;
            super(5);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            m118716a((C11585f) obj, (Boolean) obj2, (C11491a) obj3, (String) obj4, (Integer) obj5);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m118716a(C11585f fVar, final Boolean bool, final C11491a<? extends Pair<? extends UrlModel, ? extends C12131l>> aVar, String str, final Integer num) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(aVar, "loadAvatar");
            if (!((MyProfileGuideState) fVar.mo29066a(this.f96657a.mo93244r(), C368601.f96658a)).getHasGuideShowed() && !(!C7573i.m23585a((Object) str, (Object) "from_main"))) {
                this.f96657a.mo93244r().mo93147f(new C7562b<MyProfileGuideState, MyProfileGuideState>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                        boolean z;
                        C7573i.m23587b(myProfileGuideState, "$receiver");
                        if (bool != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return MyProfileGuideState.copy$default(myProfileGuideState, false, z, false, false, null, null, null, null, null, 509, null);
                    }
                });
                this.f96657a.mo93244r().mo93147f(new C7562b<MyProfileGuideState, MyProfileGuideState>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                        boolean z;
                        C7573i.m23587b(myProfileGuideState, "$receiver");
                        if (!(aVar instanceof C11496ae)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return MyProfileGuideState.copy$default(myProfileGuideState, false, false, z, false, null, null, null, null, null, 507, null);
                    }
                });
                this.f96657a.mo93244r().mo93147f(new C7562b<MyProfileGuideState, MyProfileGuideState>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
                        C7573i.m23587b(myProfileGuideState, "$receiver");
                        return MyProfileGuideState.copy$default(myProfileGuideState, false, false, false, false, null, null, null, null, num, NormalGiftView.ALPHA_255, null);
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$k */
    static final class C36864k extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96662a;

        C36864k(MyProfileGuideWidget myProfileGuideWidget) {
            this.f96662a = myProfileGuideWidget;
            super(2);
        }

        /* renamed from: a */
        private void m118721a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (!z) {
                this.f96662a.mo93245s();
            }
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m118721a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$l */
    static final class C36865l extends Lambda implements C7563m<C11585f, MyProfileGuideState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96663a;

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$l$a */
        static final class C36884a extends Lambda implements C7562b<MyProfileGuideState, MyProfileGuideState> {

            /* renamed from: a */
            public static final C36884a f96684a = new C36884a();

            C36884a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m118741a((MyProfileGuideState) obj);
            }

            /* renamed from: a */
            private static MyProfileGuideState m118741a(MyProfileGuideState myProfileGuideState) {
                C7573i.m23587b(myProfileGuideState, "$receiver");
                return MyProfileGuideState.copy$default(myProfileGuideState, true, false, false, false, null, null, null, null, null, 510, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$l$b */
        static final /* synthetic */ class C36885b extends FunctionReference implements C7562b<ProfileState, ProfileState> {

            /* renamed from: a */
            public static final C36885b f96685a = new C36885b();

            C36885b() {
                super(1);
            }

            public final String getName() {
                return "identity";
            }

            public final C7585d getOwner() {
                return C7575l.m23596a(C35735b.class, "profile_musicallyI18nRelease");
            }

            public final String getSignature() {
                return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m118742a((ProfileState) obj);
            }

            /* renamed from: a */
            private static ProfileState m118742a(ProfileState profileState) {
                C7573i.m23587b(profileState, "p1");
                return (ProfileState) C35735b.m115462a(profileState);
            }
        }

        C36865l(MyProfileGuideWidget myProfileGuideWidget) {
            this.f96663a = myProfileGuideWidget;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m118722a((C11585f) obj, (MyProfileGuideState) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m118722a(C11585f fVar, final MyProfileGuideState myProfileGuideState) {
            boolean z;
            boolean z2;
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(myProfileGuideState, "myProfileGuideState");
            if (!((MyProfileGuideState) fVar.mo29066a(this.f96663a.mo93244r(), C368661.f96664a)).getHasGuideShowed()) {
                ProfileState profileState = (ProfileState) fVar.mo29066a(this.f96663a.mo93264x(), C36885b.f96685a);
                C11493ab[] abVarArr = new C11493ab[17];
                boolean z3 = false;
                abVarArr[0] = new C11493ab(Boolean.valueOf(C6399b.m19946v()), Boolean.valueOf(true), Boolean.valueOf(MyProfileGuideWidget.m118640a(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96666a;

                    {
                        this.f96666a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118725a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118725a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96666a.f96663a;
                        NoticeView p = this.f96666a.f96663a.mo63300p();
                        if (p == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93226a(p);
                    }
                });
                abVarArr[1] = new C11493ab(Boolean.valueOf(C6399b.m19946v()), Boolean.valueOf(true), Boolean.valueOf(MyProfileGuideWidget.m118645c(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96667a;

                    {
                        this.f96667a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118726a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118726a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96667a.f96663a;
                        NoticeView p = this.f96667a.f96663a.mo63300p();
                        if (p == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93233c(p);
                    }
                });
                abVarArr[2] = new C11493ab(Boolean.valueOf(C6399b.m19946v()), Boolean.valueOf(true), Boolean.valueOf(MyProfileGuideWidget.m118646d(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96668a;

                    {
                        this.f96668a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118727a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118727a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96668a.f96663a;
                        NoticeButtonView q = this.f96668a.f96663a.mo93243q();
                        if (q == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93229a(q);
                    }
                });
                abVarArr[3] = new C11493ab(Boolean.valueOf(C6399b.m19946v()), Boolean.valueOf(myProfileGuideState.getPostListHasLoaded()), Boolean.valueOf(MyProfileGuideWidget.m118655n(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96669a;

                    {
                        this.f96669a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118728a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118728a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96669a.f96663a;
                        NoticeView p = this.f96669a.f96663a.mo63300p();
                        if (p == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93232b(p, myProfileGuideState);
                    }
                });
                abVarArr[4] = new C11493ab(Boolean.valueOf(C6399b.m19946v()), Boolean.valueOf(true), Boolean.valueOf(MyProfileGuideWidget.m118643b(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96671a;

                    {
                        this.f96671a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118729a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118729a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96671a.f96663a;
                        NoticeView p = this.f96671a.f96663a.mo63300p();
                        if (p == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93231b(p);
                    }
                });
                abVarArr[5] = new C11493ab(Boolean.valueOf(C6399b.m19944t()), Boolean.valueOf(true), Boolean.valueOf(MyProfileGuideWidget.m118654m(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96672a;

                    {
                        this.f96672a = r1;
                    }

                    /* renamed from: a */
                    private void m118730a() {
                        this.f96672a.f96663a.mo93248v();
                    }

                    public final /* synthetic */ Object invoke() {
                        m118730a();
                        return C7581n.f20898a;
                    }
                });
                Boolean valueOf = Boolean.valueOf(C6399b.m19945u());
                if (myProfileGuideState.getHasUsedPhoneWarnMsg() != null) {
                    z = true;
                } else {
                    z = false;
                }
                abVarArr[6] = new C11493ab(valueOf, Boolean.valueOf(z), Boolean.valueOf(MyProfileGuideWidget.m118639a(myProfileGuideState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96673a;

                    {
                        this.f96673a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118731a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118731a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96673a.f96663a;
                        NoticeView p = this.f96673a.f96663a.mo63300p();
                        if (p == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93228a(p, myProfileGuideState);
                    }
                });
                abVarArr[7] = new C11493ab(Boolean.valueOf(true), Boolean.valueOf(myProfileGuideState.getPostListHasLoaded()), Boolean.valueOf(this.f96663a.mo93236e(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96675a;

                    {
                        this.f96675a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118732a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118732a() {
                        this.f96675a.f96663a.mo93234d(this.f96675a.f96663a.mo63300p());
                    }
                });
                abVarArr[8] = new C11493ab(Boolean.valueOf(C6399b.m19945u()), Boolean.valueOf(true), Boolean.valueOf(MyProfileGuideWidget.m118648g(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96676a;

                    {
                        this.f96676a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118733a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118733a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96676a.f96663a;
                        NoticeView p = this.f96676a.f96663a.mo63300p();
                        if (p == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93235e(p);
                    }
                });
                abVarArr[9] = new C11493ab(Boolean.valueOf(C6399b.m19945u()), Boolean.valueOf(true), Boolean.valueOf(MyProfileGuideWidget.m118649h(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96677a;

                    {
                        this.f96677a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118734a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118734a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96677a.f96663a;
                        NoticeView p = this.f96677a.f96663a.mo63300p();
                        if (p == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93237f(p);
                    }
                });
                abVarArr[10] = new C11493ab(Boolean.valueOf(C6399b.m19945u()), Boolean.valueOf(true), Boolean.valueOf(C36074j.f94315a.needShowProfileGuideToFillAvatarAndNickname()), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96678a;

                    {
                        this.f96678a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118735a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118735a() {
                        C36074j jVar = C36074j.f94315a;
                        Activity w = this.f96678a.f96663a.mo93263w();
                        C0608j jVar2 = null;
                        if (!(w instanceof FragmentActivity)) {
                            w = null;
                        }
                        FragmentActivity fragmentActivity = (FragmentActivity) w;
                        if (fragmentActivity != null) {
                            jVar2 = fragmentActivity.getSupportFragmentManager();
                        }
                        jVar.showProfileGuideToFillAvatarAndNickname(jVar2);
                    }
                });
                abVarArr[11] = new C11493ab(Boolean.valueOf(C6399b.m19945u()), Boolean.valueOf(myProfileGuideState.getAvatarHasLoaded()), Boolean.valueOf(MyProfileGuideWidget.m118650i(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96679a;

                    {
                        this.f96679a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118736a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118736a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96679a.f96663a;
                        NoticeView p = this.f96679a.f96663a.mo63300p();
                        if (p == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93238g(p);
                    }
                });
                abVarArr[12] = new C11493ab(Boolean.valueOf(C6399b.m19945u()), Boolean.valueOf(true), Boolean.valueOf(MyProfileGuideWidget.m118652k(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96680a;

                    {
                        this.f96680a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118737a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118737a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96680a.f96663a;
                        NoticeView p = this.f96680a.f96663a.mo63300p();
                        if (p == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93240i(p);
                    }
                });
                abVarArr[13] = new C11493ab(Boolean.valueOf(true), Boolean.valueOf(myProfileGuideState.getHasSurveyDetermined()), Boolean.valueOf(MyProfileGuideWidget.m118641a(profileState, myProfileGuideState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96681a;

                    {
                        this.f96681a = r1;
                    }

                    /* renamed from: a */
                    private void m118738a() {
                        this.f96681a.f96663a.mo93247u();
                    }

                    public final /* synthetic */ Object invoke() {
                        m118738a();
                        return C7581n.f20898a;
                    }
                });
                Boolean valueOf2 = Boolean.valueOf(true);
                if (myProfileGuideState.getNeedShowDiskManagerGuide() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                abVarArr[14] = new C11493ab(valueOf2, Boolean.valueOf(z2), Boolean.valueOf(MyProfileGuideWidget.m118644b(profileState, myProfileGuideState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96682a;

                    {
                        this.f96682a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118739a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118739a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96682a.f96663a;
                        NoticeView p = this.f96682a.f96663a.mo63300p();
                        if (p == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93241j(p);
                    }
                });
                if (C6399b.m19945u() || C6399b.m19947w()) {
                    z3 = true;
                }
                abVarArr[15] = new C11493ab(Boolean.valueOf(z3), Boolean.valueOf(true), Boolean.valueOf(MyProfileGuideWidget.m118653l(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96683a;

                    {
                        this.f96683a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118740a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118740a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96683a.f96663a;
                        NoticeView p = this.f96683a.f96663a.mo63300p();
                        if (p == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93242k(p);
                    }
                });
                abVarArr[16] = new C11493ab(Boolean.valueOf(C6399b.m19945u()), Boolean.valueOf(true), Boolean.valueOf(MyProfileGuideWidget.m118651j(profileState)), new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C36865l f96665a;

                    {
                        this.f96665a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        m118724a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m118724a() {
                        MyProfileGuideWidget myProfileGuideWidget = this.f96665a.f96663a;
                        NoticeView p = this.f96665a.f96663a.mo63300p();
                        if (p == null) {
                            C7573i.m23580a();
                        }
                        myProfileGuideWidget.mo93239h(p);
                    }
                });
                C7561a a = MyProfileGuideWidget.m118637a((C11493ab<Boolean, Boolean, Boolean, C7561a<C7581n>>[]) abVarArr);
                if (a != null) {
                    a.invoke();
                    this.f96663a.mo93244r().mo93147f(C36884a.f96684a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$m */
    static final /* synthetic */ class C36886m extends FunctionReference implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        public static final C36886m f96686a = new C36886m();

        C36886m() {
            super(1);
        }

        public final String getName() {
            return "identity";
        }

        public final C7585d getOwner() {
            return C7575l.m23596a(C35735b.class, "profile_musicallyI18nRelease");
        }

        public final String getSignature() {
            return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m118743a((ProfileState) obj);
        }

        /* renamed from: a */
        private static ProfileState m118743a(ProfileState profileState) {
            C7573i.m23587b(profileState, "p1");
            return (ProfileState) C35735b.m115462a(profileState);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$n */
    static final /* synthetic */ class C36887n extends FunctionReference implements C7562b<ProfileState, ProfileState> {

        /* renamed from: a */
        public static final C36887n f96687a = new C36887n();

        C36887n() {
            super(1);
        }

        public final String getName() {
            return "identity";
        }

        public final C7585d getOwner() {
            return C7575l.m23596a(C35735b.class, "profile_musicallyI18nRelease");
        }

        public final String getSignature() {
            return "identity(Ljava/lang/Object;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m118744a((ProfileState) obj);
        }

        /* renamed from: a */
        private static ProfileState m118744a(ProfileState profileState) {
            C7573i.m23587b(profileState, "p1");
            return (ProfileState) C35735b.m115462a(profileState);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$o */
    public static final class C36888o implements C26926a {

        /* renamed from: a */
        final /* synthetic */ HomePageBottomToast f96688a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f96689b;

        /* renamed from: c */
        final /* synthetic */ Set f96690c;

        /* renamed from: d */
        final /* synthetic */ String f96691d;

        /* renamed from: e */
        final /* synthetic */ User f96692e;

        /* renamed from: b */
        public final void mo69647b() {
            this.f96689b.setVisibility(8);
            this.f96690c.add(String.valueOf(this.f96688a.getToastType()));
            Keva.getRepo("keva_repo_homepage_bottomtoast").storeStringSet(this.f96691d, this.f96690c);
        }

        /* renamed from: a */
        public final void mo69646a() {
            C7195s.m22438a().mo18682a(this.f96688a.getJumpUrl());
            this.f96689b.setVisibility(8);
            this.f96690c.add(String.valueOf(this.f96688a.getToastType()));
            Keva.getRepo("keva_repo_homepage_bottomtoast").storeStringSet(this.f96691d, this.f96690c);
            User user = this.f96692e;
            C7573i.m23582a((Object) user, "currentUser");
            C6907h.m21524a("click_link", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("link_type", "elite_guide_link").mo59973a("author_id", user.getUid()).mo59973a("link_id", String.valueOf(this.f96688a.getToastType())).f60753a);
        }

        C36888o(HomePageBottomToast homePageBottomToast, NoticeView noticeView, Set set, String str, User user) {
            this.f96688a = homePageBottomToast;
            this.f96689b = noticeView;
            this.f96690c = set;
            this.f96691d = str;
            this.f96692e = user;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$p */
    static final class C36889p extends Lambda implements C7563m<C11585f, User, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96693a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f96694b;

        C36889p(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f96693a = myProfileGuideWidget;
            this.f96694b = noticeView;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m118747a((C11585f) obj, (User) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m118747a(C11585f fVar, User user) {
            C7573i.m23587b(fVar, "$receiver");
            MyProfileGuideWidget myProfileGuideWidget = this.f96693a;
            NoticeView noticeView = this.f96694b;
            if (user == null) {
                IAccountUserService f = C6861a.m21337f();
                C7573i.m23582a((Object) f, "AccountProxyService.userService()");
                user = f.getCurUser();
                C7573i.m23582a((Object) user, "AccountProxyService.userService().curUser");
            }
            myProfileGuideWidget.mo93227a(noticeView, user);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$q */
    public static final class C36890q extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96695a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f96696b;

        public final void updateDrawState(TextPaint textPaint) {
            C7573i.m23587b(textPaint, "ds");
            textPaint.setColor(this.f96695a.mo93263w().getResources().getColor(R.color.a4q));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C7573i.m23587b(view, "widget");
            this.f96696b.setVisibility(8);
            SmartRouter.buildRoute((Context) this.f96695a.mo93263w(), "aweme://profile_edit").open();
            C6907h.m21524a("edit_profile", (Map) C22984d.m75611a().mo59973a("enter_method", "info_bar").mo59973a("enter_from", "personal_homepage").f60753a);
        }

        C36890q(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f96695a = myProfileGuideWidget;
            this.f96696b = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$r */
    public static final class C36891r implements C26926a {

        /* renamed from: a */
        final /* synthetic */ NoticeView f96697a;

        /* renamed from: a */
        public final void mo69646a() {
        }

        /* renamed from: b */
        public final void mo69647b() {
            this.f96697a.setVisibility(8);
            Keva.getRepo("keva_repo_profile_component").storeBoolean(C35779f.m115540a("profile_page_complete_profile_guide_bar_has_click_close"), true);
        }

        C36891r(NoticeView noticeView) {
            this.f96697a = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$s */
    static final class C36892s implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96698a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f96699b;

        C36892s(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f96698a = myProfileGuideWidget;
            this.f96699b = noticeView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f96699b.setVisibility(8);
            SmartRouter.buildRoute((Context) this.f96698a.mo93263w(), "aweme://profile_edit").open();
            C6907h.m21524a("edit_profile", (Map) C22984d.m75611a().mo59973a("enter_method", "info_bar").mo59973a("enter_from", "personal_homepage").f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$t */
    static final class C36893t implements OnClickListener {

        /* renamed from: a */
        public static final C36893t f96700a = new C36893t();

        C36893t() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Keva.getRepo("keva_repo_profile_component").storeBoolean(C35779f.m115540a("profile_page_complete_profile_guide_bar_has_click_close"), true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$u */
    public static final class C36894u implements C26926a {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96701a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f96702b;

        /* renamed from: b */
        public final void mo69647b() {
            C36074j.f94315a.logShowProfileDiskManagerGuideView();
            this.f96702b.setVisibility(8);
        }

        /* renamed from: a */
        public final void mo69646a() {
            C36074j.f94315a.logShowProfileDiskManagerGuideView();
            C36074j.f94315a.startDiskManagerActivity(this.f96701a.mo93263w());
            this.f96702b.setVisibility(8);
        }

        C36894u(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f96701a = myProfileGuideWidget;
            this.f96702b = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$v */
    public static final class C36895v extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96703a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f96704b;

        /* renamed from: c */
        final /* synthetic */ MyProfileGuideState f96705c;

        public final void updateDrawState(TextPaint textPaint) {
            C7573i.m23587b(textPaint, "ds");
            textPaint.setColor(this.f96703a.mo93263w().getResources().getColor(R.color.w4));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C7573i.m23587b(view, "widget");
            this.f96704b.setVisibility(8);
            C36074j jVar = C36074j.f94315a;
            Activity w = this.f96703a.mo93263w();
            Integer currentDownloadSetting = this.f96705c.getCurrentDownloadSetting();
            if (currentDownloadSetting == null) {
                C7573i.m23580a();
            }
            jVar.startDownloadControlSettingActivity(w, currentDownloadSetting.intValue());
        }

        C36895v(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView, MyProfileGuideState myProfileGuideState) {
            this.f96703a = myProfileGuideWidget;
            this.f96704b = noticeView;
            this.f96705c = myProfileGuideState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$w */
    public static final class C36896w implements C26926a {

        /* renamed from: a */
        final /* synthetic */ NoticeView f96706a;

        /* renamed from: a */
        public final void mo69646a() {
        }

        /* renamed from: b */
        public final void mo69647b() {
            this.f96706a.setVisibility(8);
        }

        C36896w(NoticeView noticeView) {
            this.f96706a = noticeView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$x */
    static final class C36897x<T> implements C7326g<BaseResponse> {

        /* renamed from: a */
        public static final C36897x f96707a = new C36897x();

        C36897x() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$y */
    static final class C36898y<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C36898y f96708a = new C36898y();

        C36898y() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m118754a((Throwable) obj);
        }

        /* renamed from: a */
        private static void m118754a(Throwable th) {
            if (!(th instanceof Exception)) {
                th = null;
            }
            Exception exc = (Exception) th;
            if (exc != null) {
                C6921a.m21554a(exc);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$z */
    public static final class C36899z implements C26926a {

        /* renamed from: a */
        final /* synthetic */ MyProfileGuideWidget f96709a;

        /* renamed from: b */
        final /* synthetic */ NoticeView f96710b;

        /* renamed from: b */
        public final void mo69647b() {
            this.f96710b.setVisibility(8);
            C23060u a = C23060u.m75742a();
            C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
            C22903bl T = a.mo60050T();
            C7573i.m23582a((Object) T, "CommonSharePrefCache.inst().ftcReportShow");
            T.mo59871a(Long.valueOf(System.currentTimeMillis()));
            C23060u a2 = C23060u.m75742a();
            C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
            C22903bl U = a2.mo60051U();
            C7573i.m23582a((Object) U, "CommonSharePrefCache.inst().ftcReportFistShow");
            Long l = (Long) U.mo59877d();
            if (l != null && l.longValue() == 0) {
                C23060u a3 = C23060u.m75742a();
                C7573i.m23582a((Object) a3, "CommonSharePrefCache.inst()");
                C22903bl U2 = a3.mo60051U();
                C7573i.m23582a((Object) U2, "CommonSharePrefCache.inst().ftcReportFistShow");
                U2.mo59871a(Long.valueOf(System.currentTimeMillis()));
            }
            this.f96709a.mo93230a(false);
        }

        /* renamed from: a */
        public final void mo69646a() {
            this.f96710b.setVisibility(8);
            SmartRouter.buildRoute((Context) this.f96709a.mo93263w(), "//webview").withParam("url", "https://m.tiktok.com/aweme/inapp/v2/c_feedback").withParam("hide_nav_bar", true).open();
            C23060u a = C23060u.m75742a();
            C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
            C22903bl T = a.mo60050T();
            C7573i.m23582a((Object) T, "CommonSharePrefCache.inst().ftcReportShow");
            T.mo59871a(Long.valueOf(System.currentTimeMillis()));
            C23060u a2 = C23060u.m75742a();
            C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
            C22903bl U = a2.mo60051U();
            C7573i.m23582a((Object) U, "CommonSharePrefCache.inst().ftcReportFistShow");
            Long l = (Long) U.mo59877d();
            if (l != null && l.longValue() == 0) {
                C23060u a3 = C23060u.m75742a();
                C7573i.m23582a((Object) a3, "CommonSharePrefCache.inst()");
                C22903bl U2 = a3.mo60051U();
                C7573i.m23582a((Object) U2, "CommonSharePrefCache.inst().ftcReportFistShow");
                U2.mo59871a(Long.valueOf(System.currentTimeMillis()));
            }
            this.f96709a.mo93230a(false);
        }

        C36899z(MyProfileGuideWidget myProfileGuideWidget, NoticeView noticeView) {
            this.f96709a = myProfileGuideWidget;
            this.f96710b = noticeView;
        }
    }

    /* renamed from: y */
    private final ViewStub m118657y() {
        return (ViewStub) this.f96611n.getValue();
    }

    /* renamed from: z */
    private final ViewStub m118658z() {
        return (ViewStub) this.f96618u.getValue();
    }

    /* renamed from: r */
    public final MyProfileGuideViewModel mo93244r() {
        return (MyProfileGuideViewModel) this.f96620w.getValue();
    }

    /* renamed from: a */
    public final void mo93230a(boolean z) {
        if (C6399b.m19944t()) {
            Keva.getRepo("account_security_keva_name").storeBoolean(m118636a("prior_to_safe_info"), z);
            C42961az.m136380a(new C36105x(z));
        }
    }

    /* renamed from: a */
    public final void mo93226a(NoticeView noticeView) {
        noticeView.setIconImage((int) R.drawable.a10);
        noticeView.setTitleText((int) R.string.cd4);
        noticeView.setOnInternalClickListener(new C36899z(this, noticeView));
        noticeView.setVisibility(0);
        mo93230a(true);
    }

    /* renamed from: a */
    public final void mo93229a(NoticeButtonView noticeButtonView) {
        noticeButtonView.setOnInternalClickListener(new C36840ae(this, noticeButtonView));
        noticeButtonView.setVisibility(0);
        C6907h.m21524a("banner_show", (Map) C22984d.m75611a().mo59973a("banner_type", "coupon_fission").mo59973a("banner_name", "tiktok_rewards").mo59973a("enter_from", "personal_homepage").f60753a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        if (r10 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 == null) goto L_0x001d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo93228a(com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView r9, com.p280ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState r10) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsg r10 = r10.getUsedPhoneNoticeMsg()
            if (r10 != 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 2131232516(0x7f080704, float:1.8081143E38)
            r9.setIconImage(r0)
            java.util.List<com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgHighlight> r0 = r10.highlight
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = kotlin.collections.C7525m.m23513g(r0)
            com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgHighlight r0 = (com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgHighlight) r0
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r0.content
            if (r0 != 0) goto L_0x001f
        L_0x001d:
            java.lang.String r0 = ""
        L_0x001f:
            java.lang.String r1 = r10.notice
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = ""
        L_0x0025:
            r2 = r1
            java.lang.String r3 = "%s"
            com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgArgs r10 = r10.args
            if (r10 == 0) goto L_0x0033
            java.lang.String r10 = r10.mobile
            if (r10 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r4 = r10
            goto L_0x0036
        L_0x0033:
            java.lang.String r10 = ""
            goto L_0x0031
        L_0x0036:
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r10 = kotlin.text.C7634n.m23711a(r2, r3, r4, false)
            r7 = r10
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r2 = r0
            int r1 = kotlin.text.C7634n.m23730a(r1, r2, r3, r4, r5, r6)
            if (r1 >= 0) goto L_0x0050
            int r1 = r10.length()
        L_0x0050:
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>(r7)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            android.app.Activity r3 = r8.mo93263w()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131100810(0x7f06048a, float:1.7814012E38)
            int r3 = r3.getColor(r4)
            r2.<init>(r3)
            int r0 = r0.length()
            int r0 = r0 + r1
            r3 = 18
            r10.setSpan(r2, r1, r0, r3)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r9.setTitleText(r10)
            com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aj r10 = new com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget$aj
            r10.<init>(r8, r9)
            com.ss.android.ugc.aweme.discover.ui.NoticeView$a r10 = (com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView.C26926a) r10
            r9.setOnInternalClickListener(r10)
            r10 = 0
            r9.setVisibility(r10)
            java.lang.String r9 = "secondhand_bubble_show"
            com.ss.android.ugc.aweme.app.g.d r10 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r0 = "enter_from"
            java.lang.String r1 = "personal_homepage"
            com.ss.android.ugc.aweme.app.g.d r10 = r10.mo59973a(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.mo93228a(com.ss.android.ugc.aweme.discover.ui.NoticeView, com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState):void");
    }

    /* renamed from: a */
    public final void mo93227a(NoticeView noticeView, User user) {
        noticeView.setIconImage((int) R.drawable.alm);
        if (user.getProfilePv() > 0) {
            Activity w = mo93263w();
            Object[] objArr = new Object[1];
            objArr[0] = user.getProfilePv() > 99 ? "99+" : String.valueOf(user.getProfilePv());
            String string = w.getString(R.string.ct7, objArr);
            String string2 = mo93263w().getString(R.string.afk);
            C7573i.m23582a((Object) string, C38347c.f99553h);
            CharSequence charSequence = string;
            C7573i.m23582a((Object) string2, "highlight");
            int a = C7634n.m23730a(charSequence, string2, 0, false, 6, (Object) null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(new C36890q(this, noticeView), a, string2.length() + a, 17);
            noticeView.setTitleText((CharSequence) spannableStringBuilder);
            TextView textView = (TextView) noticeView.findViewById(R.id.e3f);
            if (textView != null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            View findViewById = noticeView.findViewById(R.id.dk9);
            if (findViewById != null) {
                findViewById.setClickable(false);
            }
            noticeView.setOnInternalClickListener(new C36891r(noticeView));
        } else {
            this.f96614q = C36074j.f94315a.showProfileCompleteView(noticeView, (Context) mo93263w(), (OnClickListener) new C36892s(this, noticeView), (OnClickListener) C36893t.f96700a, user.getProfileCompletion(), !user.avatarUpdateReminder());
        }
        noticeView.setVisibility(0);
    }

    /* renamed from: m */
    public final void mo31588m() {
        super.mo31588m();
        C36080e.m116209a().mo91815c();
    }

    /* renamed from: B */
    private final void m118632B() {
        if (this.f96609i == null) {
            this.f96609i = m118657y().inflate();
            View view = this.f96609i;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: E */
    private final void m118635E() {
        C36074j.f94315a.needShowDiskManagerGuideView().mo19189a((C7498y<? super T>) new C36849d<Object>(this));
    }

    /* renamed from: p */
    public final NoticeView mo63300p() {
        View view = this.f34459e;
        if (view == null) {
            C7573i.m23580a();
        }
        return (NoticeView) view.findViewById(R.id.ecs);
    }

    /* renamed from: q */
    public final NoticeButtonView mo93243q() {
        View view = this.f34459e;
        if (view == null) {
            C7573i.m23580a();
        }
        return (NoticeButtonView) view.findViewById(R.id.eda);
    }

    /* renamed from: t */
    public final void mo93246t() {
        if (C36074j.f94315a.needShowProfileGuideToFillAvatarAndNickname()) {
            C36074j jVar = C36074j.f94315a;
            Activity w = mo93263w();
            C0608j jVar2 = null;
            if (!(w instanceof FragmentActivity)) {
                w = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) w;
            if (fragmentActivity != null) {
                jVar2 = fragmentActivity.getSupportFragmentManager();
            }
            jVar.showProfileGuideToFillAvatarAndNickname(jVar2);
        }
    }

    /* renamed from: A */
    private final void m118631A() {
        Context w = mo93263w();
        m118632B();
        if (this.f96609i != null) {
            View view = this.f96609i;
            if (view != null) {
                view.setLayerType(2, null);
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(w, R.anim.bp);
            C7573i.m23582a((Object) loadAnimation, "animation");
            loadAnimation.setRepeatMode(2);
            loadAnimation.setRepeatCount(-1);
            loadAnimation.setAnimationListener(new C36846ak(this));
            View view2 = this.f96609i;
            if (view2 != null) {
                view2.startAnimation(loadAnimation);
            }
        }
    }

    /* renamed from: C */
    private final void m118633C() {
        if (C36075k.f94317a.mo59243c()) {
            mo93244r().mo93147f(C36847b.f96642a);
        }
        C36080e.m116209a().f94326a = new C36911l(mo93244r());
        C36080e.m116209a().mo91814b();
    }

    /* renamed from: D */
    private final void m118634D() {
        C36084h hVar = this.f96616s;
        if (hVar != null && hVar.f94337h) {
            C36084h hVar2 = this.f96616s;
            if (hVar2 == null) {
                C7573i.m23580a();
            }
            hVar2.mo91820c();
            C36080e.m116209a();
            C36084h hVar3 = this.f96616s;
            if (hVar3 == null) {
                C7573i.m23580a();
            }
            int f = hVar3.mo91823f();
            C36084h hVar4 = this.f96616s;
            if (hVar4 == null) {
                C7573i.m23580a();
            }
            C36080e.m116211a(new C36078c(3, f, hVar4.mo91824g()));
        }
    }

    /* renamed from: k */
    public final void mo31586k() {
        super.mo31586k();
        View view = this.f96609i;
        if (view != null) {
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.cancel();
                animation.reset();
            }
        }
        ObjectAnimator objectAnimator = this.f96610j;
        if (objectAnimator != null) {
            if (!objectAnimator.isRunning()) {
                objectAnimator = null;
            }
            if (objectAnimator != null) {
                objectAnimator.pause();
            }
        }
    }

    /* renamed from: l */
    public final void mo31587l() {
        super.mo31587l();
        ProfileState profileState = (ProfileState) mo29066a(mo93264x(), C36887n.f96687a);
        if ((C6399b.m19946v() || (!profileState.isAvatarClicked() && !profileState.isBackgroundCoverClicked())) && !C6405d.m19987h()) {
            m118634D();
        }
    }

    /* renamed from: u */
    public final void mo93247u() {
        View view = this.f34459e;
        if (view == null) {
            C7573i.m23580a();
        }
        View findViewById = view.findViewById(R.id.c2q);
        C7573i.m23582a((Object) findViewById, "contentView!!.findViewBy…d.my_profile_survey_stub)");
        m118638a((ViewStub) findViewById);
        C36084h hVar = this.f96616s;
        if (hVar == null) {
            C7573i.m23580a();
        }
        hVar.f94336g = ((MyProfileGuideState) mo29066a(mo93244r(), C36844ai.f96638a)).getSurveyData();
        C36084h hVar2 = this.f96616s;
        if (hVar2 == null) {
            C7573i.m23580a();
        }
        hVar2.mo91819b();
    }

    /* renamed from: j */
    public final void mo31585j() {
        boolean z;
        super.mo31585j();
        View view = this.f96609i;
        boolean z2 = false;
        if (view != null) {
            if (view.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                view = null;
            }
            if (view != null) {
                Animation animation = view.getAnimation();
                if (animation != null) {
                    animation.start();
                }
            }
        }
        ObjectAnimator objectAnimator = this.f96610j;
        if (objectAnimator != null) {
            View view2 = this.f96609i;
            if (view2 != null && view2.getVisibility() == 0 && objectAnimator.isPaused()) {
                z2 = true;
            }
            if (!z2) {
                objectAnimator = null;
            }
            if (objectAnimator != null) {
                objectAnimator.resume();
            }
        }
        mo93245s();
    }

    /* renamed from: s */
    public final void mo93245s() {
        NoticeButtonView q = mo93243q();
        if (q != null && q.getVisibility() == 0) {
            C35662a a = C35662a.m115265a();
            C7573i.m23582a((Object) a, "CouponKeva.getInstance()");
            if (a.mo90511d()) {
                NoticeButtonView q2 = mo93243q();
                if (q2 != null) {
                    q2.setVisibility(8);
                }
            }
            C35662a.m115265a().mo90509c();
            C35662a a2 = C35662a.m115265a();
            C7573i.m23582a((Object) a2, "CouponKeva.getInstance()");
            if (a2.mo90511d()) {
                NoticeButtonView q3 = mo93243q();
                if (q3 != null) {
                    q3.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo93248v() {
        try {
            View inflate = m118658z().inflate();
            this.f96619v = inflate;
            TextView textView = (TextView) inflate.findViewById(R.id.dv9);
            C7573i.m23582a((Object) textView, "tvContent");
            textView.setText(C36074j.f94315a.getGradientPunishWarningSettingsBubbleText());
            inflate.setOnClickListener(new C36834aa(this, inflate));
            C7573i.m23582a((Object) inflate, "gpWarningView");
            inflate.setVisibility(0);
            inflate.post(new C36835ab(this, inflate));
            C36074j.f94315a.onPunishWarningShow();
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }

    /* renamed from: i */
    public final void mo31584i() {
        LayoutParams layoutParams;
        super.mo31584i();
        mo29065a(mo93264x(), C36903d.f96715a, C36904e.f96716a, C36905f.f96717a, C36906g.f96718a, C11640h.m34110a(), new C36859j(this));
        mo29062a(mo93264x(), C36907h.f96719a, C11640h.m34110a(), new C36864k(this));
        mo29061a(mo93244r(), C11640h.m34110a(), new C36865l(this));
        m118633C();
        m118635E();
        m118656o((ProfileState) mo29066a(mo93264x(), C36886m.f96686a));
        NoticeView p = mo63300p();
        if (p != null) {
            layoutParams = p.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof MarginLayoutParams)) {
            layoutParams = null;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            C21085a a = C21085a.m71117a();
            C7573i.m23582a((Object) a, "AdaptationManager.getInstance()");
            marginLayoutParams.bottomMargin = a.mo56926b();
        }
    }

    /* renamed from: e */
    public final boolean mo93236e(ProfileState profileState) {
        return m118647f(profileState);
    }

    /* renamed from: a */
    public static boolean m118639a(MyProfileGuideState myProfileGuideState) {
        return C7573i.m23585a((Object) myProfileGuideState.getHasUsedPhoneWarnMsg(), (Object) Boolean.valueOf(true));
    }

    /* renamed from: b */
    private static String m118642b(String str) {
        return new Regex("(.)").replace((CharSequence) str, "⁠");
    }

    /* renamed from: m */
    public static boolean m118654m(ProfileState profileState) {
        if (!C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main") || !C6399b.m19944t() || !C36074j.f94315a.shouldShowGradientPunishWarningBubble()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo93234d(NoticeView noticeView) {
        mo29064a(mo93264x(), C36909j.f96721a, C36910k.f96722a, C11640h.m34110a(), new C36836ac(this, noticeView));
    }

    /* renamed from: f */
    public final void mo93237f(NoticeView noticeView) {
        noticeView.setIconImage((int) R.drawable.akl);
        noticeView.setTitleText((int) R.string.sy);
        this.f96613p = C36074j.f94315a.showBindPhoneDialog(noticeView, mo93263w());
    }

    /* renamed from: i */
    public final void mo93240i(NoticeView noticeView) {
        noticeView.setIconImage((int) R.drawable.all);
        noticeView.setTitleText((int) R.string.sw);
        this.f96615r = C36074j.f94315a.showCompletePhone(noticeView);
    }

    /* renamed from: a */
    public static String m118636a(String str) {
        C7573i.m23587b(str, "$this$appendCurUid");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        sb.append(f.getCurUserId());
        return sb.toString();
    }

    /* renamed from: h */
    public static boolean m118649h(ProfileState profileState) {
        if (!C6399b.m19945u() || !C36074j.f94315a.bindHintWindowsRulerCanShowBindDialog(true) || !C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main") || C36075k.f94317a.mo59240a()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m118651j(ProfileState profileState) {
        if (!C6399b.m19945u() || !C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main") || C36075k.f94317a.mo59240a() || !C35731g.m115445a()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo93233c(NoticeView noticeView) {
        noticeView.setIconImage((int) R.drawable.ayl);
        noticeView.setTitleText((int) R.string.b16);
        noticeView.setOnInternalClickListener(new C36841af(this, noticeView));
        noticeView.setVisibility(0);
        C6907h.m21524a("privacy_floating_bar_show", (Map) C22984d.m75611a().f60753a);
        mo93230a(true);
    }

    /* renamed from: e */
    public final void mo93235e(NoticeView noticeView) {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        UserRateRemindInfo userRateRemindInfo = f.getCurUser().getUserRateRemindInfo();
        if (userRateRemindInfo != null) {
            noticeView.setIconImage((int) R.drawable.ako);
            noticeView.setTitleText((int) R.string.flz);
            C36439dx dxVar = new C36439dx(noticeView);
            this.f96612o = dxVar;
            noticeView.setOnInternalClickListener(dxVar);
            dxVar.f95612c = mo93263w();
            dxVar.f95610a = userRateRemindInfo;
            dxVar.mo92513c();
        }
    }

    public MyProfileGuideWidget(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "contentView");
        this.f34459e = viewGroup;
        C7584c a = C7575l.m23595a(MyProfileGuideViewModel.class);
        C7561a myProfileGuideWidget$$special$$inlined$viewModel$1 = new MyProfileGuideWidget$$special$$inlined$viewModel$1(this, a);
        this.f96620w = new WidgetLifecycleAwareLazy(this, myProfileGuideWidget$$special$$inlined$viewModel$1, new MyProfileGuideWidget$$special$$inlined$viewModel$3(this, myProfileGuideWidget$$special$$inlined$viewModel$1, a, MyProfileGuideWidget$$special$$inlined$viewModel$2.INSTANCE));
    }

    /* renamed from: a */
    public static C7561a<C7581n> m118637a(C11493ab<Boolean, Boolean, Boolean, C7561a<C7581n>>[] abVarArr) {
        boolean z = true;
        for (int i = 0; i < 17; i++) {
            C11493ab<Boolean, Boolean, Boolean, C7561a<C7581n>> abVar = abVarArr[i];
            if (z && ((Boolean) abVar.f31084a).booleanValue() && ((Boolean) abVar.f31085b).booleanValue() && ((Boolean) abVar.f31086c).booleanValue()) {
                return (C7561a) abVar.f31087d;
            }
            if (((Boolean) abVar.f31084a).booleanValue()) {
                if (!z || !((Boolean) abVar.f31085b).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m118645c(ProfileState profileState) {
        if (C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main") && C6399b.m19946v()) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (f.isLogin()) {
                IAccountUserService f2 = C6861a.m21337f();
                C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
                User curUser = f2.getCurUser();
                C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
                if (curUser.isSecret()) {
                    SharePrefCache inst = SharePrefCache.inst();
                    C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
                    C22903bl shouldShowPrivateAccountTipInProfile = inst.getShouldShowPrivateAccountTipInProfile();
                    C7573i.m23582a((Object) shouldShowPrivateAccountTipInProfile, "SharePrefCache.inst().sh…rivateAccountTipInProfile");
                    Object d = shouldShowPrivateAccountTipInProfile.mo59877d();
                    C7573i.m23582a(d, "SharePrefCache.inst().sh…AccountTipInProfile.cache");
                    if (((Boolean) d).booleanValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m118646d(com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileState r3) {
        /*
            java.lang.String r3 = r3.getFrom()
            java.lang.String r0 = "from_main"
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r3, r0)
            r0 = 0
            if (r3 == 0) goto L_0x0060
            boolean r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            if (r3 == 0) goto L_0x0060
            boolean r3 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136767b()
            if (r3 != 0) goto L_0x0060
            com.ss.android.ugc.aweme.profile.a r3 = com.p280ss.android.ugc.aweme.profile.C35662a.m115265a()
            java.lang.String r1 = "CouponKeva.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r1)
            boolean r3 = r3.mo90511d()
            if (r3 != 0) goto L_0x0060
            com.ss.android.ugc.aweme.profile.a r3 = com.p280ss.android.ugc.aweme.profile.C35662a.m115265a()
            boolean r3 = r3.mo90512e()
            if (r3 == 0) goto L_0x0060
            r3 = 0
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()     // Catch:{ NullValueException -> 0x0047 }
            java.lang.String r2 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ NullValueException -> 0x0047 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r1 = r1.getAwemeActivitySetting()     // Catch:{ NullValueException -> 0x0047 }
            if (r1 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton r1 = r1.getProfileActivityButton()     // Catch:{ NullValueException -> 0x0047 }
            goto L_0x0048
        L_0x0047:
            r1 = r3
        L_0x0048:
            if (r1 == 0) goto L_0x004e
            java.lang.String r3 = r1.getH5Link()
        L_0x004e:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1 = 1
            if (r3 == 0) goto L_0x005c
            int r3 = r3.length()
            if (r3 != 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r3 = 0
            goto L_0x005d
        L_0x005c:
            r3 = 1
        L_0x005d:
            if (r3 != 0) goto L_0x0060
            return r1
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidget.m118646d(com.ss.android.ugc.aweme.profile.viewmodel.ProfileState):boolean");
    }

    /* renamed from: f */
    public static boolean m118647f(ProfileState profileState) {
        if (!C36075k.f94317a.mo59240a() && !C43122ff.m136767b() && C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main") && C7573i.m23585a((Object) profileState.isPostAwemeEmpty(), (Object) Boolean.valueOf(true))) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            User curUser = f.getCurUser();
            C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
            if (curUser.getAwemeCount() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m118648g(ProfileState profileState) {
        C36711ae.m118365a();
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (C36711ae.m118366a(f.getCurUser()) && C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main") && !C36075k.f94317a.mo59240a()) {
            IAccountUserService f2 = C6861a.m21337f();
            C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
            if (C36439dx.m117650a(f2.getCurUser().userRateRemindInfo) && C6399b.m19945u()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m118650i(ProfileState profileState) {
        int i;
        int i2;
        C11491a loadAvatar = profileState.getLoadAvatar();
        if (!(loadAvatar instanceof C11674x)) {
            loadAvatar = null;
        }
        C11674x xVar = (C11674x) loadAvatar;
        if (xVar != null) {
            Pair pair = (Pair) xVar.mo29046a();
            if (pair != null && C6399b.m19945u() && C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main") && !C36075k.f94317a.mo59240a() && C6384b.m19835a().mo15287a(ShowCompleteProfileAlertStyle.class, true, "show_complete_profile_alert_style", C6384b.m19835a().mo15295d().show_complete_profile_alert_style, 0) == 0) {
                C36074j jVar = C36074j.f94315a;
                List urlList = ((UrlModel) pair.getFirst()).getUrlList();
                C7573i.m23582a((Object) urlList, "loadAvatar.first.urlList");
                C12131l lVar = (C12131l) pair.getSecond();
                if (lVar != null) {
                    i = lVar.f32218b;
                } else {
                    i = 0;
                }
                C12131l lVar2 = (C12131l) pair.getSecond();
                if (lVar2 != null) {
                    i2 = lVar2.f32217a;
                } else {
                    i2 = 0;
                }
                if (jVar.bindHintWindowsRulerGetShowCompleteProfileDialog(urlList, i, i2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m118652k(ProfileState profileState) {
        boolean z;
        if (C6399b.m19945u()) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (f.isLogin()) {
                IAccountUserService f2 = C6861a.m21337f();
                C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
                User curUser = f2.getCurUser();
                C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
                CharSequence bindPhone = curUser.getBindPhone();
                if (bindPhone == null || bindPhone.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    SharePrefCache inst = SharePrefCache.inst();
                    C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
                    C22903bl hasEnterBindPhone = inst.getHasEnterBindPhone();
                    C7573i.m23582a((Object) hasEnterBindPhone, "SharePrefCache.inst().hasEnterBindPhone");
                    if (((Boolean) hasEnterBindPhone.mo59877d()).booleanValue() || !C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main") || C36075k.f94317a.mo59240a() || !C36074j.f94315a.bindHintWindowsRulerShouldShowCompletePhone()) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m118655n(ProfileState profileState) {
        Integer num;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            num = a.getDownloadSettingEnable();
        } catch (NullValueException unused) {
            num = Integer.valueOf(0);
        }
        if (!C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main") || !C7573i.m23585a((Object) profileState.isPostAwemeEmpty(), (Object) Boolean.valueOf(false)) || profileState.getCurrentDownloadSetting() == null || !C6399b.m19946v() || C43122ff.m136767b() || num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo93239h(NoticeView noticeView) {
        noticeView.setIconImage((int) R.drawable.alm);
        mo29062a(mo93264x(), C36908i.f96720a, C11640h.m34110a(), new C36889p(this, noticeView));
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
        mo93227a(noticeView, curUser);
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        repo.storeInt(C35779f.m115540a("profile_page_complete_profile_guide_bar_show_times"), repo.getInt(C35779f.m115540a("profile_page_complete_profile_guide_bar_show_times"), 0) + 1);
        repo.storeLong(C35779f.m115540a("profile_page_complete_profile_guide_bar_last_show_time"), System.currentTimeMillis());
    }

    /* renamed from: a */
    private final void m118638a(ViewStub viewStub) {
        C36084h hVar;
        if (C6399b.m19946v() || (C6399b.m19947w() && C7212bb.m22493a())) {
            hVar = new C36077b(viewStub);
        } else {
            hVar = new C36076a(viewStub);
        }
        this.f96616s = hVar;
        hVar.f94335f = new C36852e(this, hVar);
    }

    /* renamed from: b */
    public static boolean m118643b(ProfileState profileState) {
        if ((!C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main")) || !C6399b.m19946v() || C43122ff.m136767b() || !C36074j.f94315a.isFtcBindEnable() || C36074j.f94315a.getBindFGGuideTextIndex() < 0) {
            return false;
        }
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
        if (!curUser.isHasEmail()) {
            IAccountUserService f2 = C6861a.m21337f();
            C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
            User curUser2 = f2.getCurUser();
            C7573i.m23582a((Object) curUser2, "AccountProxyService.userService().curUser");
            if (!curUser2.isPhoneBinded()) {
                return false;
            }
        }
        if (C36074j.f94315a.platformInfoManagerHasPlatformBinded()) {
            return false;
        }
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl N = a.mo60044N();
        C7573i.m23582a((Object) N, "CommonSharePrefCache.inst().linkAccountShowCount");
        if (C7573i.m23576a(((Integer) N.mo59877d()).intValue(), 2) >= 0) {
            return false;
        }
        C23060u a2 = C23060u.m75742a();
        C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
        C22903bl O = a2.mo60045O();
        C7573i.m23582a((Object) O, "CommonSharePrefCache.ins….linkAccountFirstShowTime");
        Long l = (Long) O.mo59877d();
        if (l == null || l.longValue() != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            C7573i.m23582a((Object) l, "showTime");
            if (currentTimeMillis - l.longValue() < TimeUnit.DAYS.toMillis(3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m118653l(ProfileState profileState) {
        Object obj;
        boolean z;
        if ((!C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main")) || C36075k.f94317a.mo59240a() || C6399b.m19946v()) {
            return false;
        }
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        StringBuilder sb = new StringBuilder("key_homepage_bottomtoast_toasttype_user_close_record");
        C7573i.m23582a((Object) curUser, "currentUser");
        sb.append(curUser.getUid());
        Set stringSet = Keva.getRepo("keva_repo_homepage_bottomtoast").getStringSet(sb.toString(), new HashSet());
        if (stringSet == null) {
            C7573i.m23580a();
        }
        if (stringSet.size() >= 2) {
            return false;
        }
        List homepageBottomToast = curUser.getHomepageBottomToast();
        if (homepageBottomToast != null) {
            Iterator it = homepageBottomToast.iterator();
            while (true) {
                Integer num = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                HomePageBottomToast homePageBottomToast = (HomePageBottomToast) obj;
                if (homePageBottomToast != null) {
                    num = homePageBottomToast.getToastType();
                }
                if (num == null || stringSet.contains(String.valueOf(homePageBottomToast.getToastType()))) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            HomePageBottomToast homePageBottomToast2 = (HomePageBottomToast) obj;
            if (homePageBottomToast2 != null) {
                int i = Keva.getRepo("keva_repo_homepage_bottomtoast").getInt("key_homepage_bottomtoast_lasttoast_type", -1);
                Integer toastType = homePageBottomToast2.getToastType();
                if (toastType == null || i != toastType.intValue()) {
                    long j = Keva.getRepo("keva_repo_homepage_bottomtoast").getLong("key_homepage_bottomtoast_lasttoast_firstshowtime", 0);
                    Calendar instance = Calendar.getInstance();
                    C7573i.m23582a((Object) instance, "Calendar.getInstance()");
                    if (instance.getTimeInMillis() < j + 604800000) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    private final void m118656o(ProfileState profileState) {
        boolean z;
        long currentTimeMillis = (System.currentTimeMillis() - Keva.getRepo("keva_repo_profile_component").getLong(m118636a("last_time_fetch_used_phone_msg"), 0)) / 1000;
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        Long reusePhoneCheckInterval = a.getReusePhoneCheckInterval();
        C7573i.m23582a((Object) reusePhoneCheckInterval, "SettingsReader.get().reusePhoneCheckInterval");
        if (currentTimeMillis < reusePhoneCheckInterval.longValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!(!C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main")) && !C36075k.f94317a.mo59240a() && !C6399b.m19944t() && !z) {
            IESSettingsProxy a2 = C30199h.m98861a();
            C7573i.m23582a((Object) a2, "SettingsReader.get()");
            Long reusePhoneCheckInterval2 = a2.getReusePhoneCheckInterval();
            if (reusePhoneCheckInterval2 == null || reusePhoneCheckInterval2.longValue() != 0) {
                UsedPhoneApi usedPhoneApi = (UsedPhoneApi) new RetrofitFactory().createBuilder(C19223b.f51890e).mo26430a().mo26435a(UsedPhoneApi.class);
                this.f96617t = usedPhoneApi;
                usedPhoneApi.usedPhoneNoticeMsg().mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19137b((C47557ad<? super T>) new C36854g<Object>(this));
                return;
            }
        }
        mo93244r().mo93147f(C36853f.f96649a);
    }

    /* renamed from: g */
    public final void mo93238g(NoticeView noticeView) {
        int i;
        int i2;
        C11491a loadAvatar = ((ProfileState) mo29066a(mo93264x(), C36843ah.f96637a)).getLoadAvatar();
        if (!(loadAvatar instanceof C11674x)) {
            loadAvatar = null;
        }
        C11674x xVar = (C11674x) loadAvatar;
        if (xVar != null) {
            Pair pair = (Pair) xVar.mo29046a();
            if (pair != null) {
                noticeView.setIconImage((int) R.drawable.alm);
                noticeView.setTitleText((int) R.string.csx);
                C36074j jVar = C36074j.f94315a;
                Context w = mo93263w();
                OnClickListener agVar = new C36842ag(this);
                List urlList = ((UrlModel) pair.getFirst()).getUrlList();
                C7573i.m23582a((Object) urlList, "loadAvatar.first.urlList");
                C12131l lVar = (C12131l) pair.getSecond();
                if (lVar != null) {
                    i = lVar.f32218b;
                } else {
                    i = 0;
                }
                C12131l lVar2 = (C12131l) pair.getSecond();
                if (lVar2 != null) {
                    i2 = lVar2.f32217a;
                } else {
                    i2 = 0;
                }
                this.f96614q = jVar.showProfileCompleteView(noticeView, w, agVar, urlList, i, i2);
                C6907h.m21524a("profile_alert_show", (Map) C22984d.m75611a().f60753a);
            }
        }
    }

    /* renamed from: j */
    public final void mo93241j(NoticeView noticeView) {
        noticeView.setIconImage((int) R.drawable.aj5);
        noticeView.setTitleText((int) R.string.dqn);
        String string = mo93263w().getString(R.string.dqk);
        C7573i.m23582a((Object) string, "activity.getString(R.str…ting_storage_mgmt_manage)");
        SpannableString spannableString = new SpannableString(m118642b(string));
        spannableString.setSpan(new ForegroundColorSpan(mo93263w().getResources().getColor(R.color.a4p)), 0, spannableString.length(), 18);
        noticeView.setTitleText((CharSequence) new SpannableStringBuilder(mo93263w().getString(R.string.dqn)).append(spannableString));
        noticeView.setOnInternalClickListener(new C36894u(this, noticeView));
        noticeView.setVisibility(0);
    }

    /* renamed from: a */
    public static boolean m118640a(ProfileState profileState) {
        if ((!C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main")) || !C6399b.m19946v() || !C43122ff.m136767b()) {
            return false;
        }
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
        if (curUser.getUserPeriod() != 1) {
            return false;
        }
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl U = a.mo60051U();
        C7573i.m23582a((Object) U, "CommonSharePrefCache.inst().ftcReportFistShow");
        Long l = (Long) U.mo59877d();
        if (l == null || l.longValue() != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            C7573i.m23582a((Object) l, "firstShowTime");
            if (currentTimeMillis - l.longValue() > TimeUnit.DAYS.toMillis(30)) {
                return false;
            }
        }
        C23060u a2 = C23060u.m75742a();
        C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
        C22903bl T = a2.mo60050T();
        C7573i.m23582a((Object) T, "CommonSharePrefCache.inst().ftcReportShow");
        Long l2 = (Long) T.mo59877d();
        long currentTimeMillis2 = System.currentTimeMillis();
        C7573i.m23582a((Object) l2, "lastShowTime");
        if (currentTimeMillis2 - l2.longValue() > TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo93231b(NoticeView noticeView) {
        boolean z;
        noticeView.setIconImage((int) R.drawable.aa2);
        int bindFGGuideTextIndex = C36074j.f94315a.getBindFGGuideTextIndex();
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl W = a.mo60053W();
        C7573i.m23582a((Object) W, "CommonSharePrefCache.inst().bindFGGuideTexts");
        List list = (List) W.mo59877d();
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && bindFGGuideTextIndex > 0) {
            int i = bindFGGuideTextIndex - 1;
            if (i < list.size()) {
                noticeView.setTitleText((String) list.get(i));
                noticeView.setOnInternalClickListener(new C36838ad(this, noticeView, bindFGGuideTextIndex));
                noticeView.setVisibility(0);
                C6907h.m21524a("link_account_banner_show", (Map) C22984d.m75611a().mo59970a("content_type", bindFGGuideTextIndex).f60753a);
                C23060u a2 = C23060u.m75742a();
                C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
                C22903bl N = a2.mo60044N();
                C7573i.m23582a((Object) N, "CommonSharePrefCache.inst().linkAccountShowCount");
                C23060u a3 = C23060u.m75742a();
                C7573i.m23582a((Object) a3, "CommonSharePrefCache.inst()");
                C22903bl N2 = a3.mo60044N();
                C7573i.m23582a((Object) N2, "CommonSharePrefCache.inst().linkAccountShowCount");
                N.mo59871a(Integer.valueOf(((Number) N2.mo59877d()).intValue() + 1));
                C23060u a4 = C23060u.m75742a();
                C7573i.m23582a((Object) a4, "CommonSharePrefCache.inst()");
                C22903bl O = a4.mo60045O();
                C7573i.m23582a((Object) O, "CommonSharePrefCache.ins….linkAccountFirstShowTime");
                O.mo59871a(Long.valueOf(System.currentTimeMillis()));
            }
        }
        String string = mo93263w().getString(R.string.cem);
        String string2 = mo93263w().getString(R.string.cen);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(mo93263w().getResources().getColor(R.color.w4)), string.length() - string2.length(), string.length(), 17);
        noticeView.setTitleText((CharSequence) spannableStringBuilder);
        noticeView.setOnInternalClickListener(new C36838ad(this, noticeView, bindFGGuideTextIndex));
        noticeView.setVisibility(0);
        C6907h.m21524a("link_account_banner_show", (Map) C22984d.m75611a().mo59970a("content_type", bindFGGuideTextIndex).f60753a);
        C23060u a22 = C23060u.m75742a();
        C7573i.m23582a((Object) a22, "CommonSharePrefCache.inst()");
        C22903bl N3 = a22.mo60044N();
        C7573i.m23582a((Object) N3, "CommonSharePrefCache.inst().linkAccountShowCount");
        C23060u a32 = C23060u.m75742a();
        C7573i.m23582a((Object) a32, "CommonSharePrefCache.inst()");
        C22903bl N22 = a32.mo60044N();
        C7573i.m23582a((Object) N22, "CommonSharePrefCache.inst().linkAccountShowCount");
        N3.mo59871a(Integer.valueOf(((Number) N22.mo59877d()).intValue() + 1));
        C23060u a42 = C23060u.m75742a();
        C7573i.m23582a((Object) a42, "CommonSharePrefCache.inst()");
        C22903bl O2 = a42.mo60045O();
        C7573i.m23582a((Object) O2, "CommonSharePrefCache.ins….linkAccountFirstShowTime");
        O2.mo59871a(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: k */
    public final void mo93242k(NoticeView noticeView) {
        Object obj;
        String str;
        String str2;
        boolean z;
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        StringBuilder sb = new StringBuilder("key_homepage_bottomtoast_toasttype_user_close_record");
        C7573i.m23582a((Object) curUser, "currentUser");
        sb.append(curUser.getUid());
        String sb2 = sb.toString();
        Set stringSet = Keva.getRepo("keva_repo_homepage_bottomtoast").getStringSet(sb2, new HashSet());
        if (stringSet == null) {
            C7573i.m23580a();
        }
        List homepageBottomToast = curUser.getHomepageBottomToast();
        if (homepageBottomToast != null) {
            Iterator it = homepageBottomToast.iterator();
            while (true) {
                Integer num = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                HomePageBottomToast homePageBottomToast = (HomePageBottomToast) obj;
                if (homePageBottomToast != null) {
                    num = homePageBottomToast.getToastType();
                }
                if (num == null || stringSet.contains(String.valueOf(homePageBottomToast.getToastType()))) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            HomePageBottomToast homePageBottomToast2 = (HomePageBottomToast) obj;
            if (homePageBottomToast2 != null) {
                Calendar instance = Calendar.getInstance();
                C7573i.m23582a((Object) instance, "Calendar.getInstance()");
                Keva.getRepo("keva_repo_homepage_bottomtoast").storeLong("key_homepage_bottomtoast_lasttoast_firstshowtime", instance.getTimeInMillis());
                Keva repo = Keva.getRepo("keva_repo_homepage_bottomtoast");
                String str3 = "key_homepage_bottomtoast_lasttoast_type";
                Integer toastType = homePageBottomToast2.getToastType();
                if (toastType == null) {
                    C7573i.m23580a();
                }
                repo.storeInt(str3, toastType.intValue());
                if (homePageBottomToast2.getToast() != null) {
                    str = homePageBottomToast2.getToast();
                } else {
                    str = "";
                }
                if (homePageBottomToast2.getJumpUrlTitle() != null) {
                    str2 = homePageBottomToast2.getJumpUrlTitle();
                } else {
                    str2 = mo93263w().getString(R.string.bbw);
                }
                if (str2 == null) {
                    C7573i.m23580a();
                }
                SpannableString spannableString = new SpannableString(m118642b(str2));
                spannableString.setSpan(new ForegroundColorSpan(mo93263w().getResources().getColor(R.color.a4q)), 0, spannableString.length(), 18);
                noticeView.setTitleText((CharSequence) new SpannableStringBuilder(str).append(spannableString));
                noticeView.setIconImage(homePageBottomToast2.getIconUrl());
                C36888o oVar = new C36888o(homePageBottomToast2, noticeView, stringSet, sb2, curUser);
                noticeView.setOnInternalClickListener(oVar);
                C6907h.m21524a("show_link", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("link_type", "elite_guide_link").mo59973a("author_id", curUser.getUid()).mo59973a("link_id", String.valueOf(homePageBottomToast2.getToastType())).f60753a);
                noticeView.setVisibility(0);
            }
        }
    }

    /* renamed from: b */
    public static boolean m118644b(ProfileState profileState, MyProfileGuideState myProfileGuideState) {
        if (!C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main") || !C36074j.f94315a.isEnableSettingDiskManager() || !C7573i.m23585a((Object) myProfileGuideState.getNeedShowDiskManagerGuide(), (Object) Boolean.valueOf(true))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m118641a(ProfileState profileState, MyProfileGuideState myProfileGuideState) {
        if (!C7573i.m23585a((Object) profileState.getFrom(), (Object) "from_main") || C36075k.f94317a.mo59243c() || !C36084h.m116217a(myProfileGuideState.getSurveyData())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo93232b(NoticeView noticeView, MyProfileGuideState myProfileGuideState) {
        String string = mo93263w().getString(R.string.d4h);
        String string2 = mo93263w().getString(R.string.d4i);
        noticeView.setIconImage((int) R.drawable.afc);
        noticeView.setTitleText((int) R.string.d4h);
        CharSequence charSequence = string;
        SpannableString spannableString = new SpannableString(charSequence);
        C36895v vVar = new C36895v(this, noticeView, myProfileGuideState);
        C7573i.m23582a((Object) string, C38347c.f99553h);
        C7573i.m23582a((Object) string2, "highlight");
        int a = C7634n.m23730a(charSequence, string2, 0, false, 6, (Object) null);
        if (a < 0) {
            a = string.length();
        }
        spannableString.setSpan(vVar, a, string.length(), 17);
        noticeView.setTitleText((CharSequence) spannableString);
        TextView textView = (TextView) noticeView.findViewById(R.id.e3f);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View findViewById = noticeView.findViewById(R.id.dk9);
        if (findViewById != null) {
            findViewById.setClickable(false);
        }
        noticeView.setOnInternalClickListener(new C36896w(noticeView));
        C36074j.f94315a.setPrivateSettingItem("download_prompt", 1).mo19129a((C7326g<? super T>) C36897x.f96707a, (C7326g<? super Throwable>) C36898y.f96708a);
        noticeView.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo93224a(int i, boolean z) {
        if (i == 0) {
            View view = this.f96609i;
            if (view == null || view.getVisibility() != 0) {
                m118632B();
                View view2 = this.f96609i;
                if (view2 != null) {
                    view2.setVisibility(i);
                    view2.setScaleX(0.8f);
                    view2.setScaleY(0.8f);
                    m118631A();
                }
            }
        } else if (this.f96609i != null) {
            View view3 = this.f96609i;
            if (view3 != null) {
                view3.setVisibility(i);
            }
            View view4 = this.f96609i;
            if (view4 != null) {
                view4.clearAnimation();
            }
        }
    }

    /* renamed from: a */
    public final void mo93225a(C23142a aVar, int i, String str) {
        C43173w.m136925a((Runnable) new C36857h(i, aVar, str), this.f96608h);
    }
}
