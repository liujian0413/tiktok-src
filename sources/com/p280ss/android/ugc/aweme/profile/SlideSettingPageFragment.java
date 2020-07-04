package com.p280ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p022v4.widget.NestedScrollView;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.setting.EffectiveSettingItem;
import com.bytedance.ies.dmt.p262ui.widget.setting.EffectiveSettingItemBase.C10811a;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItem;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.keva.Keva;
import com.facebook.react.common.MapBuilder;
import com.p1843tt.appbrandimpl.MicroAppApi;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commerce.C24425b;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commerce.service.p1111e.C24447a;
import com.p280ss.android.ugc.aweme.commercialize.api.selfhelpad.C24549a;
import com.p280ss.android.ugc.aweme.commercialize.api.selfhelpad.C24550b;
import com.p280ss.android.ugc.aweme.commercialize.coupon.api.CouponApi;
import com.p280ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity;
import com.p280ss.android.ugc.aweme.commercialize.link.C24769b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25247at;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.experiment.MicroAppItemTypeExperiment;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27754b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.freeflowcard.C29971b;
import com.p280ss.android.ugc.aweme.freeflowcard.p1278a.C29970b;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting;
import com.p280ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel.C30243a;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.legoImp.task.AssistantTask.C32361a;
import com.p280ss.android.ugc.aweme.login.larksso.CrossPlatformActivityForLarkSso;
import com.p280ss.android.ugc.aweme.login.larksso.LarkSsoHelper;
import com.p280ss.android.ugc.aweme.login.larksso.LarkSsoHelper.C32666a;
import com.p280ss.android.ugc.aweme.main.C33061p;
import com.p280ss.android.ugc.aweme.main.base.C32895a;
import com.p280ss.android.ugc.aweme.miniapp.C33416r;
import com.p280ss.android.ugc.aweme.miniapp.C33416r.C33418a;
import com.p280ss.android.ugc.aweme.miniapp.FullyLinearLayoutManager;
import com.p280ss.android.ugc.aweme.miniapp.MicroExpandSettingItem;
import com.p280ss.android.ugc.aweme.miniapp.adapter.RecentlyMicroAppListAdapter;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33459d;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p1708y.C43578b;
import com.p280ss.android.ugc.aweme.p1708y.p1709a.C43569a;
import com.p280ss.android.ugc.aweme.p1708y.p1709a.p1710a.C43571a;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p971p.C21766a;
import com.p280ss.android.ugc.aweme.poi.api.PoiMerchantApi;
import com.p280ss.android.ugc.aweme.profile.experiment.C35778a;
import com.p280ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MyProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.PrivateAlbumActivity.C36209a;
import com.p280ss.android.ugc.aweme.profile.util.C36701ad;
import com.p280ss.android.ugc.aweme.profile.util.C36701ad.C36702a;
import com.p280ss.android.ugc.aweme.profile.util.C36717ag;
import com.p280ss.android.ugc.aweme.profile.util.C36718ah;
import com.p280ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams.C36995a;
import com.p280ss.android.ugc.aweme.qrcode.p1499v2.QRCodeActivityV2;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.secapi.ISecApi;
import com.p280ss.android.ugc.aweme.setting.p337ui.ExpandSettingItem;
import com.p280ss.android.ugc.aweme.setting.p337ui.ExpandSettingItem.C37777b;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.story.live.C41990e;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.wallet.C43395a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment */
public final class SlideSettingPageFragment extends CommonPageFragment implements C0935e, OnClickListener, C10811a {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f93392e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SlideSettingPageFragment.class), "widgetManager", "getWidgetManager()Lcom/ss/android/ugc/aweme/arch/widgets/base/WidgetManager;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SlideSettingPageFragment.class), "chooseAccountWidget", "getChooseAccountWidget()Lcom/ss/android/ugc/aweme/profile/widgets/DTChooseAccountWidget;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SlideSettingPageFragment.class), "unLoginGoneView", "getUnLoginGoneView()Ljava/util/HashSet;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SlideSettingPageFragment.class), "mECSlideSettingPageHolder", "getMECSlideSettingPageHolder()Lcom/ss/android/ugc/aweme/commerce/service/profile/IECSlideSettingPageHolder;"))};

    /* renamed from: A */
    private ViewGroup f93393A;

    /* renamed from: B */
    private CommonItemView f93394B;

    /* renamed from: C */
    private CommonItemView f93395C;

    /* renamed from: D */
    private ViewGroup f93396D;

    /* renamed from: E */
    private ViewGroup f93397E;

    /* renamed from: F */
    private ViewGroup f93398F;

    /* renamed from: G */
    private CommonItemView f93399G;

    /* renamed from: H */
    private ExpandSettingItem f93400H;

    /* renamed from: J */
    private ViewGroup f93401J;

    /* renamed from: K */
    private ViewGroup f93402K;

    /* renamed from: L */
    private CommonItemView f93403L;

    /* renamed from: M */
    private ViewGroup f93404M;

    /* renamed from: N */
    private EffectiveSettingItem f93405N;

    /* renamed from: O */
    private ViewGroup f93406O;

    /* renamed from: P */
    private ViewGroup f93407P;

    /* renamed from: Q */
    private ViewGroup f93408Q;

    /* renamed from: R */
    private ExpandSettingItem f93409R;

    /* renamed from: S */
    private View f93410S;

    /* renamed from: T */
    private View f93411T;

    /* renamed from: U */
    private View f93412U;

    /* renamed from: V */
    private boolean f93413V;

    /* renamed from: W */
    private float f93414W;

    /* renamed from: X */
    private User f93415X;

    /* renamed from: Y */
    private C36718ah f93416Y;

    /* renamed from: Z */
    private final C43578b f93417Z;

    /* renamed from: aa */
    private String f93418aa = "slide";

    /* renamed from: ab */
    private Integer f93419ab = Integer.valueOf(-1);

    /* renamed from: ac */
    private View f93420ac;

    /* renamed from: ad */
    private TextView f93421ad;

    /* renamed from: ae */
    private NestedScrollView f93422ae;

    /* renamed from: af */
    private final C7541d f93423af = C7546e.m23569a(new C35658q(this));

    /* renamed from: ag */
    private final C7541d f93424ag = C7546e.m23569a(new C35645d(this));

    /* renamed from: ah */
    private final C7541d f93425ah = C7546e.m23569a(C35657p.f93466a);

    /* renamed from: ai */
    private final C7541d f93426ai = C7546e.m23569a(C35652k.f93461a);

    /* renamed from: aj */
    private boolean f93427aj;

    /* renamed from: ak */
    private HashMap f93428ak;

    /* renamed from: f */
    public CommonItemView f93429f;

    /* renamed from: g */
    public MicroExpandSettingItem f93430g;

    /* renamed from: h */
    public CommonItemView f93431h;

    /* renamed from: i */
    public CommonItemView f93432i;

    /* renamed from: j */
    public View f93433j;

    /* renamed from: k */
    public ViewGroup f93434k;

    /* renamed from: l */
    public CommonItemView f93435l;

    /* renamed from: m */
    public ViewGroup f93436m;

    /* renamed from: n */
    public View f93437n;

    /* renamed from: o */
    public View f93438o;

    /* renamed from: p */
    public C33061p f93439p;

    /* renamed from: q */
    public ScrollSwitchStateManager f93440q;

    /* renamed from: r */
    public RecyclerView f93441r;

    /* renamed from: s */
    public RecentlyMicroAppListAdapter f93442s;

    /* renamed from: t */
    public View f93443t;

    /* renamed from: u */
    private CommonItemView f93444u;

    /* renamed from: v */
    private CommonItemView f93445v;

    /* renamed from: w */
    private View f93446w;

    /* renamed from: x */
    private ViewGroup f93447x;

    /* renamed from: y */
    private ViewGroup f93448y;

    /* renamed from: z */
    private ViewGroup f93449z;

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$a */
    public static final class C35642a implements C37777b {

        /* renamed from: a */
        final /* synthetic */ SlideSettingPageFragment f93450a;

        C35642a(SlideSettingPageFragment slideSettingPageFragment) {
            this.f93450a = slideSettingPageFragment;
        }

        /* renamed from: a */
        public final void mo90485a(boolean z) {
            this.f93450a.mo90481f();
            if (z) {
                ViewGroup viewGroup = this.f93450a.f93436m;
                if (viewGroup != null && viewGroup.getVisibility() == 0) {
                    C6907h.m21524a("show_ringtone_service", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").f60753a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$b */
    public static final class C35643b implements C36702a {

        /* renamed from: a */
        final /* synthetic */ SlideSettingPageFragment f93451a;

        C35643b(SlideSettingPageFragment slideSettingPageFragment) {
            this.f93451a = slideSettingPageFragment;
        }

        /* renamed from: a */
        public final void mo90486a(boolean z) {
            if (z) {
                CommonItemView commonItemView = this.f93451a.f93431h;
                if (commonItemView != null) {
                    commonItemView.mo25776a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$c */
    static final class C35644c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SlideSettingPageFragment f93452a;

        C35644c(SlideSettingPageFragment slideSettingPageFragment) {
            this.f93452a = slideSettingPageFragment;
        }

        public final void run() {
            CommonItemView commonItemView = this.f93452a.f93432i;
            if (commonItemView != null) {
                View view = this.f93452a.f93433j;
                if (view == null) {
                    C7573i.m23580a();
                }
                view.setAlpha(0.0f);
                View view2 = this.f93452a.f93433j;
                if (view2 == null) {
                    C7573i.m23580a();
                }
                LayoutParams layoutParams = view2.getLayoutParams();
                CommonItemView commonItemView2 = this.f93452a.f93432i;
                if (commonItemView2 == null) {
                    C7573i.m23580a();
                }
                layoutParams.width = commonItemView2.getMeasuredWidth();
                View view3 = this.f93452a.f93433j;
                if (view3 == null) {
                    C7573i.m23580a();
                }
                LayoutParams layoutParams2 = view3.getLayoutParams();
                CommonItemView commonItemView3 = this.f93452a.f93432i;
                if (commonItemView3 == null) {
                    C7573i.m23580a();
                }
                layoutParams2.height = commonItemView3.getMeasuredHeight();
                View view4 = this.f93452a.f93433j;
                if (view4 == null) {
                    C7573i.m23580a();
                }
                LayoutParams layoutParams3 = view4.getLayoutParams();
                if (layoutParams3 != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams3;
                    CommonItemView commonItemView4 = this.f93452a.f93432i;
                    if (commonItemView4 == null) {
                        C7573i.m23580a();
                    }
                    marginLayoutParams.topMargin = commonItemView4.getTop();
                    View view5 = this.f93452a.f93433j;
                    if (view5 == null) {
                        C7573i.m23580a();
                    }
                    view5.setVisibility(0);
                    View view6 = this.f93452a.f93433j;
                    if (view6 == null) {
                        C7573i.m23580a();
                    }
                    ViewPropertyAnimator alpha = view6.animate().alpha(0.15f);
                    C7573i.m23582a((Object) alpha, "alphaAnim");
                    alpha.setDuration(300);
                    alpha.start();
                    C36209a.m117034a(commonItemView.getContext(), false);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$d */
    static final class C35645d extends Lambda implements C7561a<DTChooseAccountWidget> {

        /* renamed from: a */
        final /* synthetic */ SlideSettingPageFragment f93453a;

        C35645d(SlideSettingPageFragment slideSettingPageFragment) {
            this.f93453a = slideSettingPageFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DTChooseAccountWidget invoke() {
            ViewGroup viewGroup = this.f93453a.f93434k;
            if (viewGroup == null) {
                C7573i.m23580a();
            }
            DTChooseAccountWidget dTChooseAccountWidget = new DTChooseAccountWidget(viewGroup, this.f93453a);
            this.f93453a.mo90480d().mo60152a((View) (LinearLayout) this.f93453a.mo90477a((int) R.id.vr), (Widget) dTChooseAccountWidget);
            return dTChooseAccountWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$e */
    public static final class C35646e implements C32666a {

        /* renamed from: a */
        final /* synthetic */ SlideSettingPageFragment f93454a;

        /* renamed from: a */
        public final void mo84109a() {
            Activity activity;
            if (this.f93454a.getActivity() != null) {
                activity = this.f93454a.getActivity();
            } else {
                activity = C6405d.m19984g();
            }
            if (activity != null) {
                C32361a.m104925a(activity);
            }
        }

        C35646e(SlideSettingPageFragment slideSettingPageFragment) {
            this.f93454a = slideSettingPageFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$f */
    static final class C35647f<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C35647f f93455a = new C35647f();

        C35647f() {
        }

        public final /* synthetic */ Object call() {
            return m115237a();
        }

        /* renamed from: a */
        private static C24550b m115237a() {
            return C24549a.m80572a("navigation_panel", "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$g */
    static final class C35648g<TTaskResult, TContinuationResult> implements C1591g<C24550b, Void> {

        /* renamed from: a */
        final /* synthetic */ SlideSettingPageFragment f93456a;

        C35648g(SlideSettingPageFragment slideSettingPageFragment) {
            this.f93456a = slideSettingPageFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C24550b> hVar) {
            CharSequence charSequence;
            String str;
            String str2;
            if (hVar != null) {
                C24550b bVar = (C24550b) hVar.mo6890e();
                if (bVar != null && bVar.status_code == 0) {
                    C24550b bVar2 = (C24550b) hVar.mo6890e();
                    if (bVar2 != null) {
                        charSequence = bVar2.f64798a;
                    } else {
                        charSequence = null;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        Context context = this.f93456a.getContext();
                        C24550b bVar3 = (C24550b) hVar.mo6890e();
                        if (bVar3 != null) {
                            str = bVar3.f64798a;
                        } else {
                            str = null;
                        }
                        Context context2 = this.f93456a.getContext();
                        if (context2 != null) {
                            str2 = context2.getString(R.string.dz);
                        } else {
                            str2 = null;
                        }
                        C25371n.m83459a(context, str, str2);
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$h */
    static final class C35649h<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ int f93457a = 3;

        C35649h(int i) {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C33459d call() {
            return MicroAppApi.m146352a(0, this.f93457a, 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$i */
    static final class C35650i<TTaskResult, TContinuationResult> implements C1591g<C33459d, Void> {

        /* renamed from: a */
        final /* synthetic */ SlideSettingPageFragment f93458a;

        C35650i(SlideSettingPageFragment slideSettingPageFragment) {
            this.f93458a = slideSettingPageFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C33459d> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            if (!hVar.mo6889d() && hVar.mo6890e() != null) {
                Object e = hVar.mo6890e();
                C7573i.m23582a(e, "task.result");
                List<MicroAppInfo> list = ((C33459d) e).f87339a;
                Object e2 = hVar.mo6890e();
                C7573i.m23582a(e2, "task.result");
                boolean z = ((C33459d) e2).f87340b;
                if (C6307b.m19566a((Collection<T>) list)) {
                    View view = this.f93458a.f93438o;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    RecyclerView recyclerView = this.f93458a.f93441r;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                    }
                    MicroExpandSettingItem microExpandSettingItem = this.f93458a.f93430g;
                    if (microExpandSettingItem != null) {
                        microExpandSettingItem.setVisibility(8);
                    }
                    CommonItemView commonItemView = this.f93458a.f93429f;
                    if (commonItemView != null) {
                        commonItemView.setVisibility(0);
                    }
                } else {
                    View view2 = this.f93458a.f93438o;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    RecyclerView recyclerView2 = this.f93458a.f93441r;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(0);
                    }
                    MicroExpandSettingItem microExpandSettingItem2 = this.f93458a.f93430g;
                    if (microExpandSettingItem2 != null) {
                        microExpandSettingItem2.setVisibility(0);
                    }
                    CommonItemView commonItemView2 = this.f93458a.f93429f;
                    if (commonItemView2 != null) {
                        commonItemView2.setVisibility(8);
                    }
                    RecentlyMicroAppListAdapter recentlyMicroAppListAdapter = this.f93458a.f93442s;
                    if (recentlyMicroAppListAdapter != null) {
                        recentlyMicroAppListAdapter.mo85413a(list, z);
                    }
                    MicroExpandSettingItem microExpandSettingItem3 = this.f93458a.f93430g;
                    if (microExpandSettingItem3 != null) {
                        microExpandSettingItem3.mo85394a();
                    }
                    this.f93458a.mo90482g();
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$j */
    static final class C35651j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SlideSettingPageFragment f93459a;

        /* renamed from: b */
        final /* synthetic */ boolean f93460b;

        C35651j(SlideSettingPageFragment slideSettingPageFragment, boolean z) {
            this.f93459a = slideSettingPageFragment;
            this.f93460b = z;
        }

        public final void run() {
            if (this.f93459a.isViewValid()) {
                this.f93459a.mo90478a(this.f93460b);
                View a = this.f93459a.mo90476a();
                if (a != null) {
                    a.setVisibility(8);
                }
                View a2 = this.f93459a.mo90476a();
                if (a2 != null) {
                    a2.setClickable(false);
                }
                ScrollSwitchStateManager scrollSwitchStateManager = this.f93459a.f93440q;
                if (scrollSwitchStateManager == null) {
                    C7573i.m23580a();
                }
                scrollSwitchStateManager.f79582a.setValue(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$k */
    static final class C35652k extends Lambda implements C7561a<C24447a> {

        /* renamed from: a */
        public static final C35652k f93461a = new C35652k();

        C35652k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m115241a();
        }

        /* renamed from: a */
        private static C24447a m115241a() {
            return C24436a.m80356a().getECSlideSettingPageHolder();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$l */
    public static final class C35653l implements C33418a {
        C35653l() {
        }

        /* renamed from: a */
        public final void mo85661a(MicroAppInfo microAppInfo) {
            String str;
            if (microAppInfo != null) {
                String str2 = "mp_show";
                IAccountUserService a = C21115b.m71197a();
                C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
                C22984d a2 = C22984d.m75611a().mo59973a("mp_id", microAppInfo.getAppId()).mo59973a("author_id", a.getCurUserId()).mo59973a("enter_from", "setting_page").mo59973a("click_type", "setting_page_outer");
                String str3 = "_param_for_special";
                if (microAppInfo.getType() == 1) {
                    str = "micro_app";
                } else {
                    str = "micro_game";
                }
                C6907h.m21524a(str2, (Map) a2.mo59973a(str3, str).f60753a);
            }
            if (microAppInfo == null) {
                C6907h.m21524a("show_more_microapp", (Map) C22984d.m75611a().mo59973a("enter_from", "setting_page").mo59973a("click_type", "setting_page_outer").f60753a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$m */
    static final class C35654m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SlideSettingPageFragment f93462a;

        C35654m(SlideSettingPageFragment slideSettingPageFragment) {
            this.f93462a = slideSettingPageFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            View a = this.f93462a.mo90476a();
            if (a != null) {
                a.setClickable(false);
            }
            C33061p pVar = this.f93462a.f93439p;
            if (pVar != null) {
                pVar.mo84697a(Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$n */
    static final class C35655n<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SlideSettingPageFragment f93463a;

        C35655n(SlideSettingPageFragment slideSettingPageFragment) {
            this.f93463a = slideSettingPageFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            int i;
            CommonItemView commonItemView = this.f93463a.f93435l;
            if (commonItemView != null) {
                if (bool == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) bool, "showCoupon!!");
                if (bool.booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                commonItemView.setVisibility(i);
            }
            SlideSettingPageFragment.m115204a(this.f93463a.f93437n, this.f93463a.f93429f, this.f93463a.f93435l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$o */
    static final class C35656o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SlideSettingPageFragment f93464a;

        /* renamed from: b */
        final /* synthetic */ boolean f93465b;

        C35656o(SlideSettingPageFragment slideSettingPageFragment, boolean z) {
            this.f93464a = slideSettingPageFragment;
            this.f93465b = z;
        }

        public final void run() {
            this.f93464a.mo90478a(this.f93465b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$p */
    static final class C35657p extends Lambda implements C7561a<HashSet<View>> {

        /* renamed from: a */
        public static final C35657p f93466a = new C35657p();

        C35657p() {
            super(0);
        }

        /* renamed from: a */
        private static HashSet<View> m115244a() {
            return new HashSet<>();
        }

        public final /* synthetic */ Object invoke() {
            return m115244a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$q */
    static final class C35658q extends Lambda implements C7561a<WidgetManager> {

        /* renamed from: a */
        final /* synthetic */ SlideSettingPageFragment f93467a;

        C35658q(SlideSettingPageFragment slideSettingPageFragment) {
            this.f93467a = slideSettingPageFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public WidgetManager invoke() {
            return WidgetManager.m75867a((Fragment) this.f93467a, this.f93467a.getView());
        }
    }

    /* renamed from: T */
    private final void m115197T() {
        getActivity();
    }

    /* renamed from: Z */
    private void m115203Z() {
        if (this.f93428ak != null) {
            this.f93428ak.clear();
        }
    }

    /* renamed from: i */
    private final DTChooseAccountWidget m115206i() {
        return (DTChooseAccountWidget) this.f93424ag.getValue();
    }

    /* renamed from: j */
    private final HashSet<View> m115207j() {
        return (HashSet) this.f93425ah.getValue();
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo90477a(int i) {
        if (this.f93428ak == null) {
            this.f93428ak = new HashMap();
        }
        View view = (View) this.f93428ak.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f93428ak.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: d */
    public final WidgetManager mo90480d() {
        return (WidgetManager) this.f93423af.getValue();
    }

    /* renamed from: f */
    public final C24447a mo90481f() {
        return (C24447a) this.f93426ai.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m115203Z();
    }

    /* renamed from: G */
    private String m115184G() {
        if (TextUtils.isEmpty(MyProfileFragment.f94911W)) {
            return this.f93418aa;
        }
        return MyProfileFragment.f94911W;
    }

    /* renamed from: H */
    private final void m115185H() {
        C43569a.f112819b.mo105516a(C43571a.class);
        getActivity();
    }

    public final void onStart() {
        super.onStart();
        View view = this.f93446w;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: B */
    private final void m115180B() {
        C6907h.m21524a("enter_privacy_album", (Map) C22984d.m75611a().mo59973a("enter_from", this.f93418aa).f60753a);
        C36209a.m117033a(getActivity());
    }

    /* renamed from: J */
    private static void m115187J() {
        C6907h.m21524a("life_service_order", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").f60753a);
        C7195s.m22438a().mo18682a("aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fservice_order%3Fhide_nav_bar%3D1%26enter_from%3Dwallet&hide_nav_bar=1&enter_from=wallet&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_service_order%26force_h5%3D0%26bg_theme%3D%2523112233%26hide_nav_bar%3D1%26pop_gesture_enable%3D1");
    }

    /* renamed from: O */
    private final void m115192O() {
        C7167b b = C7167b.m22380b();
        C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
        IMiniAppService a = b.mo18647a();
        if (a != null) {
            a.openMircoAppList(getActivity());
        }
    }

    /* renamed from: P */
    private final void m115193P() {
        CrossPlatformActivityForLarkSso.f85127e.mo84108a(new C35646e(this));
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) context, "context!!");
        LarkSsoHelper.m105773a(context, 0);
    }

    /* renamed from: v */
    private final void m115219v() {
        if (!TimeLockRuler.isTeenModeON()) {
            C1592h.m7853a((Callable<TResult>) new C35649h<TResult>(3)).mo6876a((C1591g<TResult, TContinuationResult>) new C35650i<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: w */
    private final void m115220w() {
        ViewGroup viewGroup = this.f93406O;
        if (!(viewGroup instanceof SettingItem)) {
            viewGroup = null;
        }
        SettingItem settingItem = (SettingItem) viewGroup;
        if (settingItem != null) {
            String a = C25247at.m82991a(3, null);
            if (a != null) {
                settingItem.setStartText(a);
            }
        }
    }

    /* renamed from: x */
    private final void m115221x() {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openDouPlus(getActivity());
    }

    public final void onPause() {
        super.onPause();
        if (this.f93413V) {
            mo90479a(this.f93413V, false);
            this.f93413V = false;
        }
    }

    /* renamed from: E */
    private final void m115182E() {
        C22984d a = C22984d.m75611a();
        a.mo59973a("enter_from", "navigation_panel");
        CommonItemView commonItemView = this.f93435l;
        if (commonItemView != null && commonItemView.f28907d) {
            a.mo59973a("notice_type", "yellow_dot");
        }
        C6907h.m21524a("enter_card_bag", (Map) a.f60753a);
        CommonItemView commonItemView2 = this.f93435l;
        if (commonItemView2 != null) {
            commonItemView2.mo25777b();
        }
        Intent intent = new Intent(getActivity(), CouponListActivity.class);
        intent.putExtra("is_coupon_valid", true);
        startActivity(intent);
    }

    /* renamed from: F */
    private final void m115183F() {
        C6907h.m21524a("enter_wellbeing", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").f60753a);
        C22603f.m74719a("navigation_panel");
        ParentalPlatformManager.m74625a((Activity) getActivity());
    }

    /* renamed from: K */
    private final void m115188K() {
        C6907h.m21524a("enter_library", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").f60753a);
        C33471b a = new C33472a().mo85791b("navigation_panel").mo85790a();
        C7167b b = C7167b.m22380b();
        C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
        b.mo18647a().openMiniApp(getContext(), "sslocal://microgame?version=v2&app_id=tt645512e8fb7fe9b8&launch_from=mytab", a);
    }

    /* renamed from: V */
    private final void m115199V() {
        String a = C21766a.m72782a();
        Map of = MapBuilder.m41788of("title", getString(R.string.ax0));
        C7573i.m23582a((Object) of, "MapBuilder.of(CrossPlatf…ng.e_platform_lite_link))");
        C24425b.m80324a(a, of, getContext());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.overridePendingTransition(R.anim.c5, R.anim.cd);
        }
        C6907h.m21524a("enter_eplatform", (Map) C22984d.m75611a().f60753a);
    }

    /* renamed from: Y */
    private static boolean m115202Y() {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        if (curUser != null && C43122ff.m136783n(curUser) && !C6399b.m19944t() && !TextUtils.isEmpty(C21766a.m72782a())) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final void m115209l() {
        int i;
        CommonItemView commonItemView = this.f93394B;
        int i2 = 8;
        if (commonItemView != null) {
            if (C7163a.m22363a()) {
                i = 0;
            } else {
                i = 8;
            }
            commonItemView.setVisibility(i);
        }
        ViewGroup viewGroup = this.f93447x;
        if (viewGroup != null) {
            if (!C6399b.m19944t()) {
                i2 = 0;
            }
            viewGroup.setVisibility(i2);
        }
    }

    /* renamed from: m */
    private final void m115210m() {
        int i;
        TextView textView = this.f93421ad;
        if (textView != null) {
            if (TimeLockRuler.isContentFilterOn() || TimeLockRuler.isTimeLockOn() || ParentalPlatformConfig.f60133a.mo59214b() == Role.PARENT || ParentalPlatformConfig.f60133a.mo59214b() == Role.CHILD) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    /* renamed from: r */
    private final void m115215r() {
        int i;
        CommonItemView commonItemView = this.f93395C;
        if (commonItemView != null) {
            commonItemView.setLeftText("Debug Test");
        }
        CommonItemView commonItemView2 = this.f93395C;
        if (commonItemView2 != null) {
            if (C7163a.m22363a() || C6319n.m19594a(C6399b.m19941q(), "lark_inhouse")) {
                i = 0;
            } else {
                i = 8;
            }
            commonItemView2.setVisibility(i);
        }
    }

    /* renamed from: u */
    private static boolean m115218u() {
        if (!C6399b.m19944t() && VERSION.SDK_INT >= 21) {
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl miniAppLabelTitle = inst.getMiniAppLabelTitle();
            C7573i.m23582a((Object) miniAppLabelTitle, "SharePrefCache.inst().miniAppLabelTitle");
            if (!TextUtils.isEmpty((CharSequence) miniAppLabelTitle.mo59877d()) && !TimeLockRuler.isTeenModeON()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    private final void m115222y() {
        C6907h.m21524a("click_self_ad_entrance", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").mo59973a("is_login", "1").f60753a);
        C1592h.m7853a((Callable<TResult>) C35647f.f93455a).mo6876a((C1591g<TResult, TContinuationResult>) new C35648g<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: z */
    private static void m115223z() {
        C6907h.m21524a("click_ringtone_service", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").f60753a);
        C7195s a = C7195s.m22438a();
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl musicRingtoneScheme = inst.getMusicRingtoneScheme();
        C7573i.m23582a((Object) musicRingtoneScheme, "SharePrefCache.inst().musicRingtoneScheme");
        a.mo18682a((String) musicRingtoneScheme.mo59877d());
    }

    /* renamed from: g */
    public final void mo90482g() {
        new C33416r().mo85660a(this.f93441r, this.f93422ae, new C35653l());
        MicroExpandSettingItem microExpandSettingItem = this.f93430g;
        if (microExpandSettingItem != null && microExpandSettingItem.getVisibility() == 0) {
            C6907h.m21524a("microapp_entrance_show", (Map) C22984d.m75611a().mo59973a("enter_from", "setting_page").mo59973a("click_type", "setting_page_outer").f60753a);
        }
    }

    public final void onResume() {
        super.onResume();
        mo90479a(false, true);
        m115214q();
        View view = this.f93433j;
        if (view != null && view.getVisibility() == 0) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f93440q;
            if (scrollSwitchStateManager == null) {
                C7573i.m23580a();
            }
            if (!scrollSwitchStateManager.mo79723b("page_setting")) {
                View view2 = this.f93433j;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
        }
    }

    public SlideSettingPageFragment() {
        Object service = ServiceManager.get().getService(IBridgeService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ridgeService::class.java)");
        this.f93417Z = ((IBridgeService) service).getDouLabService();
    }

    /* renamed from: A */
    private static void m115179A() {
        boolean z;
        C6907h.onEvent(MobClick.obtain().setEventName("enter_phone_card_apply").setLabelName("more_setting"));
        C6907h.m21524a("enter_data_free_plan", (Map) C22984d.m75611a().mo59973a("enter_from", "settings_page").f60753a);
        C29971b a = C29971b.m98269a();
        C7573i.m23582a((Object) a, "FlowCardDataManager.getInstance()");
        String c = a.mo76165c();
        CharSequence charSequence = c;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            c = null;
        }
        if (c != null) {
            C29970b.m98268a("click_free_flow");
            C7195s.m22438a().mo18682a(C33786f.m108941a(c).mo86195a("title", "免流量看抖音").mo86194a().toString());
        }
    }

    /* renamed from: D */
    private final void m115181D() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            PoiSetting poiSetting = a.getPoiSetting();
            C7573i.m23582a((Object) poiSetting, "SettingsReader.get().poiSetting");
            String merchantManagementUrl = poiSetting.getMerchantManagementUrl();
            C6907h.m21524a("click_im_seller", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").f60753a);
            CommonItemView commonItemView = this.f93403L;
            if (commonItemView != null) {
                commonItemView.mo25777b();
            }
            PoiMerchantApi.m113165a();
            if (merchantManagementUrl == null) {
                C7573i.m23580a();
            }
            String uri = C33786f.m108941a(merchantManagementUrl).mo86195a("enter_from", "navigation_panel").mo86194a().toString();
            C7573i.m23582a((Object) uri, "RnSchemeHelper.parseRnSc…      .build().toString()");
            C7195s.m22438a().mo18682a(uri);
        } catch (NullValueException unused) {
        }
    }

    /* renamed from: I */
    private final void m115186I() {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).enterMyFavorites(getActivity(), C42914ab.m136242a().mo104633a("enter_from", "navigation_panel").mo104633a("enter_method", "click_button").mo104630a("scene_id", 1001).f111445a);
        if (C27754b.m90997a()) {
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl shouldShowFavouriteTip = inst.getShouldShowFavouriteTip();
            C7573i.m23582a((Object) shouldShowFavouriteTip, "SharePrefCache.inst().shouldShowFavouriteTip");
            shouldShowFavouriteTip.mo59871a(Boolean.valueOf(false));
        }
        CommonItemView commonItemView = this.f93444u;
        if (commonItemView != null) {
            commonItemView.mo25777b();
        }
    }

    /* renamed from: N */
    private final void m115191N() {
        CommonItemView commonItemView = this.f93429f;
        if (commonItemView != null && commonItemView.f28907d) {
            CommonItemView commonItemView2 = this.f93429f;
            if (commonItemView2 != null) {
                commonItemView2.mo25777b();
            }
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl showMiniAppFreshGuideNotify = inst.getShowMiniAppFreshGuideNotify();
            C7573i.m23582a((Object) showMiniAppFreshGuideNotify, "SharePrefCache.inst().showMiniAppFreshGuideNotify");
            showMiniAppFreshGuideNotify.mo59871a(Boolean.valueOf(false));
        }
        C6907h.m21524a("click_mp_entrance", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").mo59973a("scene_id", "1001").f60753a);
        IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
        if (iBridgeService != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("enterAnim", R.anim.c5);
            bundle.putInt("exitAnim", R.anim.cd);
            iBridgeService.startMicroAppGroupActivity(getActivity(), bundle);
        }
    }

    /* renamed from: Q */
    private final void m115194Q() {
        ArrayList arrayList;
        C6907h.m21524a("click_share_person", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").mo59973a("scene_id", "1001").f60753a);
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        User curUser = a.getCurUser();
        if (curUser != null) {
            Activity activity = getActivity();
            C33061p pVar = this.f93439p;
            if (pVar != null) {
                C36340al a2 = pVar.mo84693a();
                if (a2 != null) {
                    arrayList = a2.mo90852x();
                    C36717ag.m118376a(activity, curUser, arrayList);
                }
            }
            arrayList = null;
            C36717ag.m118376a(activity, curUser, arrayList);
        }
    }

    /* renamed from: R */
    private final void m115195R() {
        C36340al alVar;
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        User curUser = a.getCurUser();
        C33061p pVar = this.f93439p;
        ArrayList arrayList = null;
        if (pVar != null) {
            alVar = pVar.mo84693a();
        } else {
            alVar = null;
        }
        if (alVar != null) {
            C33061p pVar2 = this.f93439p;
            if (pVar2 == null) {
                C7573i.m23580a();
            }
            C36340al a2 = pVar2.mo84693a();
            if (a2 == null) {
                C7573i.m23580a();
            }
            arrayList = a2.mo90852x();
        }
        if (arrayList != null) {
            C28479b.m93595a((List<Aweme>) arrayList);
        }
        QRCodeActivityV2.m119235a(getContext(), new C36995a().mo93428a(4, C43122ff.m136788s(curUser), "navigation_panel").mo93433a(C43122ff.m136789t(curUser), C43122ff.m136790u(curUser), C43122ff.m136783n(curUser)).f96920a);
    }

    /* renamed from: S */
    private final void m115196S() {
        C19282c.m63182a(getActivity(), "set", "personal_homepage");
        C6907h.m21524a("enter_setting_page", (Map) C22984d.m75611a().mo59973a("previous_page", "personal_homepage").mo59973a("enter_method", "click_button").f60753a);
        Object service = ServiceManager.get().getService(IBridgeService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ridgeService::class.java)");
        Intent intent = new Intent(getActivity(), ((IBridgeService) service).getSettingActivityClass());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.startActivity(intent);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.overridePendingTransition(R.anim.c5, R.anim.cd);
        }
    }

    /* renamed from: W */
    private final boolean m115200W() {
        if (C24769b.m81285a() || C24769b.m81287b()) {
            return true;
        }
        if (this.f93415X != null) {
            User user = this.f93415X;
            if (user == null) {
                C7573i.m23580a();
            }
            if (user.isWithStarAtlasEntry() && !TextUtils.isEmpty(C6887b.m21436b().mo16896a(getActivity(), "star_atlas_url_default"))) {
                return true;
            }
        }
        if (this.f93415X != null) {
            User user2 = this.f93415X;
            if (user2 == null) {
                C7573i.m23580a();
            }
            if (user2.isWithCommerceEntry()) {
                return true;
            }
        }
        if (m115202Y() || PoiMerchantApi.m113166b()) {
            return true;
        }
        User user3 = this.f93415X;
        if (user3 != null) {
            CommercePermissionStruct commercePermission = user3.getCommercePermission();
            if (commercePermission != null && commercePermission.eliteLogin == 1) {
                return true;
            }
        }
        if (C41990e.m133510c()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r4 == null) goto L_0x0033;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m115201X() {
        /*
            r6 = this;
            java.util.List r0 = com.p280ss.android.ugc.aweme.compliance.C25789b.m84761g()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.collection.C6307b.m19566a(r1)
            if (r1 != 0) goto L_0x0055
            android.view.ViewGroup r1 = r6.f93434k
            if (r1 != 0) goto L_0x0012
            goto L_0x0055
        L_0x0012:
            android.view.ViewGroup r1 = r6.f93434k
            if (r1 != 0) goto L_0x0019
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0019:
            int r1 = r1.getChildCount()
            r2 = 0
        L_0x001e:
            if (r2 >= r1) goto L_0x0054
            android.view.ViewGroup r3 = r6.f93434k
            if (r3 != 0) goto L_0x0027
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0027:
            android.view.View r3 = r3.getChildAt(r2)
            if (r3 == 0) goto L_0x0033
            java.lang.Object r4 = r3.getTag()
            if (r4 != 0) goto L_0x0035
        L_0x0033:
            java.lang.String r4 = ""
        L_0x0035:
            java.lang.String r5 = r4.toString()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0051
            r5 = r0
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r4 = kotlin.collections.C7525m.m23496a(r5, r4)
            if (r4 == 0) goto L_0x0051
            if (r3 == 0) goto L_0x0051
            r4 = 8
            r3.setVisibility(r4)
        L_0x0051:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0054:
            return
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.SlideSettingPageFragment.m115201X():void");
    }

    /* renamed from: p */
    private final void m115213p() {
        m115204a(this.f93411T, this.f93449z, this.f93429f);
        m115204a(this.f93437n, this.f93393A);
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (f.isLogin()) {
            m115204a(this.f93412U, this.f93396D);
        }
        m115206i().mo93203a();
    }

    /* renamed from: t */
    private final void m115217t() {
        boolean z;
        if (C6384b.m19835a().mo15287a(MicroAppItemTypeExperiment.class, true, "micro_app_item_type", C6384b.m19835a().mo15295d().micro_app_item_type, 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (m115218u() && z) {
            MicroExpandSettingItem microExpandSettingItem = this.f93430g;
            if (microExpandSettingItem != null) {
                microExpandSettingItem.setVisibility(0);
            }
            if (this.f93442s == null) {
                FullyLinearLayoutManager fullyLinearLayoutManager = new FullyLinearLayoutManager(getContext(), 1, false);
                RecyclerView recyclerView = this.f93441r;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(fullyLinearLayoutManager);
                }
                this.f93442s = new RecentlyMicroAppListAdapter(1);
                RecyclerView recyclerView2 = this.f93441r;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(this.f93442s);
                }
                MicroExpandSettingItem microExpandSettingItem2 = this.f93430g;
                if (microExpandSettingItem2 != null) {
                    microExpandSettingItem2.mo85395a((View) this.f93441r, this.f93438o);
                }
            }
            RecyclerView recyclerView3 = this.f93441r;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(0);
            }
            View view = this.f93438o;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final View mo90476a() {
        if (this.f93443t == null) {
            if (getActivity() == null) {
                return null;
            }
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            CommonPageFragment d = C30246a.m98970a(activity).mo79729d("page_feed");
            if (d == null) {
                return null;
            }
            this.f93443t = C30243a.m98913a(d).f79575a;
        }
        return this.f93443t;
    }

    /* renamed from: L */
    private final void m115189L() {
        C6907h.m21524a("wallet_click", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").f60753a);
        C41989d.m133477a("navigation_panel");
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("withdraw_money");
        if (!C36106y.m116263a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            return;
        }
        if (!C6399b.m19944t()) {
            C7195s.m22438a().mo18679a((Activity) getActivity(), "aweme://wallet_index");
        } else {
            C43395a.m137716a(getActivity(), IWalletMainProxy.KEY_PAGE_INDEX);
        }
        C6907h.onEvent(new MobClick().setEventName("wallet").setLabelName("setting"));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.overridePendingTransition(R.anim.c5, R.anim.cd);
        }
    }

    /* renamed from: M */
    private final void m115190M() {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl syncTT = inst.getSyncTT();
        C7573i.m23582a((Object) syncTT, "SharePrefCache.inst().syncTT");
        Integer num = (Integer) syncTT.mo59877d();
        SharePrefCache inst2 = SharePrefCache.inst();
        C7573i.m23582a((Object) inst2, "SharePrefCache.inst()");
        C22903bl syncToTTUrl = inst2.getSyncToTTUrl();
        C7573i.m23582a((Object) syncToTTUrl, "SharePrefCache.inst().syncToTTUrl");
        String str = (String) syncToTTUrl.mo59877d();
        if (num != null && num.intValue() == 1) {
            Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
            C6907h.onEvent(MobClick.obtain().setEventName("fans_power_click").setLabelName("personal_homepage"));
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_load_dialog", true);
            intent.putExtras(bundle);
            intent.setData(Uri.parse(str));
            intent.putExtra("hide_nav_bar", true);
            intent.putExtra("hide_status_bar", true);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.startActivity(intent);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.overridePendingTransition(R.anim.c5, R.anim.cd);
            }
        }
        C6907h.m21524a("fans_plus", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("enter_method", "click_navigation").f60753a);
    }

    /* renamed from: U */
    private final void m115198U() {
        C6907h.m21524a("enter_advance_account_page", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").f60753a);
        if (this.f93431h != null) {
            CommonItemView commonItemView = this.f93431h;
            if (commonItemView == null) {
                C7573i.m23580a();
            }
            if (commonItemView.f28907d) {
                CommonItemView commonItemView2 = this.f93431h;
                if (commonItemView2 != null) {
                    commonItemView2.mo25777b();
                }
            }
        }
        String str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Fdouyin%2Fcreator_center%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel%3Dfe_lynx_main_creator_center%26bundle%3Dindex.js%26module_name%3Dpage_creator_center%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1";
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            FeConfigCollection feConfigCollection = a.getFeConfigCollection();
            C7573i.m23582a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
            FEConfig creatorCenter = feConfigCollection.getCreatorCenter();
            C7573i.m23582a((Object) creatorCenter, "SettingsReader.get().feC…gCollection.creatorCenter");
            if (!TextUtils.isEmpty(creatorCenter.getSchema())) {
                IESSettingsProxy a2 = C30199h.m98861a();
                C7573i.m23582a((Object) a2, "SettingsReader.get()");
                FeConfigCollection feConfigCollection2 = a2.getFeConfigCollection();
                C7573i.m23582a((Object) feConfigCollection2, "SettingsReader.get().feConfigCollection");
                FEConfig creatorCenter2 = feConfigCollection2.getCreatorCenter();
                C7573i.m23582a((Object) creatorCenter2, "SettingsReader.get().feC…gCollection.creatorCenter");
                String schema = creatorCenter2.getSchema();
                C7573i.m23582a((Object) schema, "SettingsReader.get().feC…tion.creatorCenter.schema");
                str = schema;
            }
        } catch (NullValueException unused) {
        }
        C7195s.m22438a().mo18682a(str);
        Keva.getRepo("creatorCenter").storeBoolean("creatorCenterYellowDotShown", true);
        C36701ad.m118356a(3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m115208k() {
        /*
            r3 = this;
            android.support.v4.app.FragmentActivity r0 = r3.getActivity()
            android.content.Context r0 = (android.content.Context) r0
            int r0 = com.bytedance.ies.uikit.p576a.C10994a.m32204a(r0)
            r1 = 2131301676(0x7f09152c, float:1.8221417E38)
            android.view.View r1 = r3.mo90477a(r1)
            android.widget.Space r1 = (android.widget.Space) r1
            java.lang.String r2 = "sp_status_bar"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.height = r0
            r3.m115216s()
            r3.m115212o()
            r3.m115209l()
            r3.m115211n()
            r3.m115215r()
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x0036
            r3.m115213p()
        L_0x0036:
            com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            boolean r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22502aq()
            r1 = 8
            if (r0 != 0) goto L_0x007d
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r2 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L_0x0051
            goto L_0x007d
        L_0x0051:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r3.f93444u
            if (r0 == 0) goto L_0x0059
            r2 = 0
            r0.setVisibility(r2)
        L_0x0059:
            boolean r0 = com.p280ss.android.ugc.aweme.favorites.p1214e.C27754b.m90997a()
            if (r0 == 0) goto L_0x0075
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x006d
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r3.f93444u
            if (r0 == 0) goto L_0x0084
            r0.mo25777b()
            goto L_0x0084
        L_0x006d:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r3.f93444u
            if (r0 == 0) goto L_0x0084
            r0.mo25776a()
            goto L_0x0084
        L_0x0075:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r3.f93444u
            if (r0 == 0) goto L_0x0084
            r0.mo25777b()
            goto L_0x0084
        L_0x007d:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r3.f93444u
            if (r0 == 0) goto L_0x0084
            r0.setVisibility(r1)
        L_0x0084:
            r3.m115220w()
            r3.m115217t()
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x00a0
            com.ss.android.ugc.aweme.profile.ui.v2.ProfileNewStyleExperiment r0 = com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment.INSTANCE
            boolean r0 = r0.getENABLE_NEW_STYLE()
            if (r0 == 0) goto L_0x00a0
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r3.f93444u
            if (r0 == 0) goto L_0x00a0
            r0.setVisibility(r1)
            return
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.SlideSettingPageFragment.m115208k():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d8  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m115214q() {
        /*
            r9 = this;
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r0 < r3) goto L_0x002e
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r3 = "SharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            com.ss.android.ugc.aweme.app.bl r0 = r0.getMiniAppLabelTitle()
            java.lang.String r3 = "SharePrefCache.inst().miniAppLabelTitle"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            java.lang.Object r0 = r0.mo59877d()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.MicroAppItemTypeExperiment> r4 = com.p280ss.android.ugc.aweme.experiment.MicroAppItemTypeExperiment.class
            r5 = 1
            java.lang.String r6 = "micro_app_item_type"
            com.bytedance.ies.abmock.b r7 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r7 = r7.mo15295d()
            int r7 = r7.micro_app_item_type
            r8 = 0
            int r3 = r3.mo15287a(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r9.f93429f
            if (r4 == 0) goto L_0x0061
            if (r0 == 0) goto L_0x005c
            if (r3 == 0) goto L_0x005c
            boolean r3 = com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r3 != 0) goto L_0x005c
            r3 = 0
            goto L_0x005e
        L_0x005c:
            r3 = 8
        L_0x005e:
            r4.setVisibility(r3)
        L_0x0061:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r3 = r9.f93429f
            if (r3 == 0) goto L_0x0080
            com.ss.android.ugc.aweme.app.SharePrefCache r4 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r5 = "SharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            com.ss.android.ugc.aweme.app.bl r4 = r4.getMiniAppLabelTitle()
            java.lang.String r5 = "SharePrefCache.inst().miniAppLabelTitle"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.Object r4 = r4.mo59877d()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setLeftText(r4)
        L_0x0080:
            if (r0 == 0) goto L_0x00a7
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r3 = "SharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            com.ss.android.ugc.aweme.app.bl r0 = r0.getShowMiniAppFreshGuideNotify()
            java.lang.String r3 = "SharePrefCache.inst().showMiniAppFreshGuideNotify"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            java.lang.Object r0 = r0.mo59877d()
            java.lang.String r3 = "SharePrefCache.inst().sh…AppFreshGuideNotify.cache"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00a7
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            if (r0 == 0) goto L_0x00bd
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r9.f93429f
            if (r0 == 0) goto L_0x00b1
            r0.mo25776a()
        L_0x00b1:
            java.lang.String r0 = "show_mp_yellowdot"
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Map r3 = (java.util.Map) r3
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r3)
        L_0x00bd:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            r3 = 2
            if (r0 == 0) goto L_0x00d8
            android.view.View r0 = r9.f93411T
            android.view.View[] r3 = new android.view.View[r3]
            android.view.ViewGroup r4 = r9.f93449z
            android.view.View r4 = (android.view.View) r4
            r3[r2] = r4
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r2 = r9.f93429f
            android.view.View r2 = (android.view.View) r2
            r3[r1] = r2
            m115204a(r0, r3)
            return
        L_0x00d8:
            android.view.View r0 = r9.f93437n
            android.view.View[] r3 = new android.view.View[r3]
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r9.f93429f
            android.view.View r4 = (android.view.View) r4
            r3[r2] = r4
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r2 = r9.f93435l
            android.view.View r2 = (android.view.View) r2
            r3[r1] = r2
            m115204a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.SlideSettingPageFragment.m115214q():void");
    }

    /* renamed from: o */
    private final void m115212o() {
        CommonItemView commonItemView = this.f93444u;
        if (commonItemView != null) {
            commonItemView.setOnClickListener(this);
        }
        CommonItemView commonItemView2 = this.f93445v;
        if (commonItemView2 != null) {
            commonItemView2.setOnClickListener(this);
        }
        ViewGroup viewGroup = this.f93448y;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this);
        }
        CommonItemView commonItemView3 = this.f93429f;
        if (commonItemView3 != null) {
            commonItemView3.setOnClickListener(this);
        }
        CommonItemView commonItemView4 = this.f93394B;
        if (commonItemView4 != null) {
            commonItemView4.setOnClickListener(this);
        }
        ViewGroup viewGroup2 = this.f93447x;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(this);
        }
        CommonItemView commonItemView5 = this.f93431h;
        if (commonItemView5 != null) {
            commonItemView5.setOnClickListener(this);
        }
        ViewGroup viewGroup3 = this.f93448y;
        if (viewGroup3 != null) {
            viewGroup3.setOnClickListener(this);
        }
        ViewGroup viewGroup4 = this.f93449z;
        if (viewGroup4 != null) {
            viewGroup4.setOnClickListener(this);
        }
        ViewGroup viewGroup5 = this.f93396D;
        if (viewGroup5 != null) {
            viewGroup5.setOnClickListener(this);
        }
        ViewGroup viewGroup6 = this.f93397E;
        if (viewGroup6 != null) {
            viewGroup6.setOnClickListener(this);
        }
        ViewGroup viewGroup7 = this.f93398F;
        if (viewGroup7 != null) {
            viewGroup7.setOnClickListener(this);
        }
        CommonItemView commonItemView6 = this.f93395C;
        if (commonItemView6 != null) {
            commonItemView6.setOnClickListener(this);
        }
        ViewGroup viewGroup8 = this.f93393A;
        if (viewGroup8 != null) {
            viewGroup8.setOnClickListener(this);
        }
        ViewGroup viewGroup9 = this.f93402K;
        if (viewGroup9 != null) {
            viewGroup9.setOnClickListener(this);
        }
        ViewGroup viewGroup10 = this.f93406O;
        if (viewGroup10 != null) {
            viewGroup10.setOnClickListener(this);
        }
        ViewGroup viewGroup11 = this.f93407P;
        if (viewGroup11 != null) {
            viewGroup11.setOnClickListener(this);
        }
        ViewGroup viewGroup12 = this.f93436m;
        if (viewGroup12 != null) {
            viewGroup12.setOnClickListener(this);
        }
        ViewGroup viewGroup13 = this.f93408Q;
        if (viewGroup13 != null) {
            viewGroup13.setOnClickListener(this);
        }
        ViewGroup viewGroup14 = this.f93404M;
        if (viewGroup14 != null) {
            viewGroup14.setOnClickListener(this);
        }
        CommonItemView commonItemView7 = this.f93435l;
        if (commonItemView7 != null) {
            commonItemView7.setOnClickListener(this);
        }
        CommonItemView commonItemView8 = this.f93403L;
        if (commonItemView8 != null) {
            commonItemView8.setOnClickListener(this);
        }
        View view = this.f93420ac;
        if (view != null) {
            view.setOnClickListener(this);
        }
        ExpandSettingItem expandSettingItem = this.f93400H;
        if (expandSettingItem != null) {
            expandSettingItem.setOnClickListener(this);
        }
        CommonItemView commonItemView9 = this.f93432i;
        if (commonItemView9 != null) {
            commonItemView9.setOnClickListener(this);
        }
        ExpandSettingItem expandSettingItem2 = this.f93409R;
        if (expandSettingItem2 != null) {
            expandSettingItem2.setOnClickListener(this);
        }
        View view2 = this.f93410S;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        MicroExpandSettingItem microExpandSettingItem = this.f93430g;
        if (microExpandSettingItem != null) {
            microExpandSettingItem.setOnClickListener(this);
        }
        ExpandSettingItem expandSettingItem3 = this.f93400H;
        if (expandSettingItem3 != null) {
            expandSettingItem3.setOnExpandListener(new C35642a(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a1, code lost:
        if (r0.eliteLogin == 1) goto L_0x01b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0182  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m115211n() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r1 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            r8.f93415X = r0
            android.view.ViewGroup r0 = r8.f93449z
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x0039
            boolean r3 = com.p280ss.android.ugc.aweme.wallet.C43395a.m137718b()
            if (r3 == 0) goto L_0x0034
            java.lang.String r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19941q()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = "amazon"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0032
            boolean r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r3 != 0) goto L_0x0034
        L_0x0032:
            r3 = 0
            goto L_0x0036
        L_0x0034:
            r3 = 8
        L_0x0036:
            r0.setVisibility(r3)
        L_0x0039:
            android.view.ViewGroup r0 = r8.f93393A
            r3 = 1
            if (r0 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.profile.model.User r4 = r8.f93415X
            boolean r4 = com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai.m117567a(r4)
            if (r4 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.app.SharePrefCache r4 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r5 = "SharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            com.ss.android.ugc.aweme.app.bl r4 = r4.getSyncTT()
            java.lang.String r5 = "SharePrefCache.inst().syncTT"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.Object r4 = r4.mo59877d()
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            int r4 = r4.intValue()
            if (r4 != r3) goto L_0x0069
            r4 = 0
            goto L_0x006b
        L_0x0069:
            r4 = 8
        L_0x006b:
            r0.setVisibility(r4)
        L_0x006e:
            boolean r0 = com.p280ss.android.ugc.aweme.feed.C28410h.m93376p()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = "coupon_notice"
            com.ss.android.ugc.aweme.app.g.d r4 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r5 = "notice_type"
            java.lang.String r6 = "yellow_dot"
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
            java.lang.String r5 = "enter_from"
            java.lang.String r6 = "navigation_panel"
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93435l
            if (r0 == 0) goto L_0x009e
            r0.mo25776a()
            goto L_0x009e
        L_0x0097:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93435l
            if (r0 == 0) goto L_0x009e
            r0.mo25777b()
        L_0x009e:
            boolean r0 = m115202Y()
            if (r0 == 0) goto L_0x00cd
            com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r4 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.mo18803bo()
            java.lang.String r4 = "AbTestManager.getInstance().abTestSettingModel"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            boolean r0 = r0.useCreatorCenter
            if (r0 != 0) goto L_0x00cd
            android.view.ViewGroup r0 = r8.f93398F
            if (r0 == 0) goto L_0x00c1
            r0.setVisibility(r2)
        L_0x00c1:
            java.lang.String r0 = "show_eplatform"
            com.ss.android.ugc.aweme.app.g.d r4 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r4)
            goto L_0x00d4
        L_0x00cd:
            android.view.ViewGroup r0 = r8.f93398F
            if (r0 == 0) goto L_0x00d4
            r0.setVisibility(r1)
        L_0x00d4:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93403L
            if (r0 == 0) goto L_0x00fb
            boolean r4 = com.p280ss.android.ugc.aweme.poi.api.PoiMerchantApi.m113166b()
            if (r4 == 0) goto L_0x00f6
            com.ss.android.ugc.aweme.setting.d r4 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r5 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            com.ss.android.ugc.aweme.setting.model.AbTestModel r4 = r4.mo18803bo()
            java.lang.String r5 = "AbTestManager.getInstance().abTestSettingModel"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            boolean r4 = r4.useCreatorCenter
            if (r4 != 0) goto L_0x00f6
            r4 = 0
            goto L_0x00f8
        L_0x00f6:
            r4 = 8
        L_0x00f8:
            r0.setVisibility(r4)
        L_0x00fb:
            boolean r0 = com.p280ss.android.ugc.aweme.poi.api.PoiMerchantApi.m113167c()
            if (r0 == 0) goto L_0x0109
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93403L
            if (r0 == 0) goto L_0x0110
            r0.mo25776a()
            goto L_0x0110
        L_0x0109:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93403L
            if (r0 == 0) goto L_0x0110
            r0.mo25777b()
        L_0x0110:
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.f93415X
            if (r0 == 0) goto L_0x0128
            boolean r0 = r0.isWithDouplusEntry()
            if (r0 != r3) goto L_0x0128
            boolean r0 = com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isContentFilterOn()
            if (r0 != 0) goto L_0x0128
            android.view.ViewGroup r0 = r8.f93406O
            if (r0 == 0) goto L_0x012f
            r0.setVisibility(r2)
            goto L_0x012f
        L_0x0128:
            android.view.ViewGroup r0 = r8.f93406O
            if (r0 == 0) goto L_0x012f
            r0.setVisibility(r1)
        L_0x012f:
            android.view.ViewGroup r0 = r8.f93407P
            android.view.View r0 = (android.view.View) r0
            com.ss.android.ugc.aweme.profile.model.User r4 = r8.f93415X
            if (r4 == 0) goto L_0x0145
            boolean r4 = r4.hasAdEntry()
            if (r4 != r3) goto L_0x0145
            boolean r4 = com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r4 != 0) goto L_0x0145
            r4 = 0
            goto L_0x0147
        L_0x0145:
            r4 = 8
        L_0x0147:
            com.bytedance.common.utility.C9738o.m28712b(r0, r4)
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.f93415X
            if (r0 == 0) goto L_0x0153
            java.lang.String r0 = r0.getBindPhone()
            goto L_0x0154
        L_0x0153:
            r0 = 0
        L_0x0154:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0164
            android.view.ViewGroup r0 = r8.f93436m
            if (r0 == 0) goto L_0x016b
            r0.setVisibility(r2)
            goto L_0x016b
        L_0x0164:
            android.view.ViewGroup r0 = r8.f93436m
            if (r0 == 0) goto L_0x016b
            r0.setVisibility(r1)
        L_0x016b:
            com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r4 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.mo18803bo()
            java.lang.String r4 = "AbTestManager.getInstance().abTestSettingModel"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            boolean r0 = r0.useCreatorCenter
            r4 = 3
            if (r0 == 0) goto L_0x01f4
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93431h
            if (r0 == 0) goto L_0x0189
            r0.setVisibility(r2)
        L_0x0189:
            boolean r0 = m115202Y()
            if (r0 != 0) goto L_0x01b7
            boolean r0 = com.p280ss.android.ugc.aweme.poi.api.PoiMerchantApi.m113166b()
            if (r0 != 0) goto L_0x01b7
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.f93415X
            if (r0 == 0) goto L_0x01a4
            com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct r0 = r0.getCommercePermission()
            if (r0 == 0) goto L_0x01a4
            int r0 = r0.eliteLogin
            if (r0 != r3) goto L_0x01a4
            goto L_0x01b7
        L_0x01a4:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93431h
            if (r0 == 0) goto L_0x01c9
            android.content.res.Resources r5 = r8.getResources()
            r6 = 2131822373(0x7f110725, float:1.9277516E38)
            java.lang.CharSequence r5 = r5.getText(r6)
            r0.setLeftText(r5)
            goto L_0x01c9
        L_0x01b7:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93431h
            if (r0 == 0) goto L_0x01c9
            android.content.res.Resources r5 = r8.getResources()
            r6 = 2131822374(0x7f110726, float:1.9277518E38)
            java.lang.CharSequence r5 = r5.getText(r6)
            r0.setLeftText(r5)
        L_0x01c9:
            java.lang.String r0 = "creatorCenter"
            com.bytedance.keva.Keva.getRepo(r0)
            boolean r0 = r8.m115200W()
            if (r0 == 0) goto L_0x01e9
            java.lang.String r0 = "creatorCenter"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r5 = "creatorCenterYellowDotShown"
            boolean r0 = r0.getBoolean(r5, r2)
            if (r0 != 0) goto L_0x01e9
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93431h
            if (r0 == 0) goto L_0x01e9
            r0.mo25776a()
        L_0x01e9:
            com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$b r0 = new com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$b
            r0.<init>(r8)
            com.ss.android.ugc.aweme.profile.util.ad$a r0 = (com.p280ss.android.ugc.aweme.profile.util.C36701ad.C36702a) r0
            com.p280ss.android.ugc.aweme.profile.util.C36701ad.m118357a(r4, r0)
            goto L_0x01fb
        L_0x01f4:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93431h
            if (r0 == 0) goto L_0x01fb
            r0.setVisibility(r1)
        L_0x01fb:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            r5 = 2
            if (r0 == 0) goto L_0x0210
            android.view.View r0 = r8.f93437n
            android.view.View[] r6 = new android.view.View[r3]
            android.view.ViewGroup r7 = r8.f93393A
            android.view.View r7 = (android.view.View) r7
            r6[r2] = r7
            m115204a(r0, r6)
            goto L_0x0223
        L_0x0210:
            android.view.View r0 = r8.f93437n
            android.view.View[] r6 = new android.view.View[r5]
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r7 = r8.f93429f
            android.view.View r7 = (android.view.View) r7
            r6[r2] = r7
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r7 = r8.f93435l
            android.view.View r7 = (android.view.View) r7
            r6[r3] = r7
            m115204a(r0, r6)
        L_0x0223:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()
            java.lang.String r6 = "SettingsReader.get()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r6)
            java.lang.Boolean r0 = r0.getShowDoulabEntrance()
            java.lang.String r6 = "SettingsReader.get().showDoulabEntrance"
            kotlin.jvm.internal.C7573i.m23582a(r0, r6)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0249
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 != 0) goto L_0x0249
            android.view.ViewGroup r0 = r8.f93397E
            if (r0 == 0) goto L_0x0250
            r0.setVisibility(r2)
            goto L_0x0250
        L_0x0249:
            android.view.ViewGroup r0 = r8.f93397E
            if (r0 == 0) goto L_0x0250
            r0.setVisibility(r1)
        L_0x0250:
            com.ss.android.ugc.aweme.y.a.a$a r0 = com.p280ss.android.ugc.aweme.p1708y.p1709a.C43569a.f112819b
            java.lang.Class<com.ss.android.ugc.aweme.y.a.a.a> r6 = com.p280ss.android.ugc.aweme.p1708y.p1709a.p1710a.C43571a.class
            java.lang.Object r0 = r0.mo105516a(r6)
            com.ss.android.ugc.aweme.y.a.a.a r0 = (com.p280ss.android.ugc.aweme.p1708y.p1709a.p1710a.C43571a) r0
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r6 = r8.f93445v
            r0.mo79684a(r6)
            r8.mo90481f()
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r6 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r6)
            boolean r0 = r0.isLogin()
            boolean r6 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            if (r6 == 0) goto L_0x0284
            com.ss.android.ugc.aweme.profile.ui.v2.ProfileNewStyleExperiment r6 = com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment.INSTANCE
            boolean r6 = r6.getUSE_T_NEW()
            if (r6 == 0) goto L_0x0284
            boolean r6 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136767b()
            if (r6 == 0) goto L_0x0284
            r0 = 0
        L_0x0284:
            boolean r6 = com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r6 != 0) goto L_0x02c2
            if (r0 != 0) goto L_0x028d
            goto L_0x02c2
        L_0x028d:
            if (r0 == 0) goto L_0x0361
            java.util.HashSet r0 = r8.m115207j()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0361
            java.util.HashSet r0 = r8.m115207j()
            java.util.Iterator r0 = r0.iterator()
        L_0x02a4:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02b9
            java.lang.Object r3 = r0.next()
            android.view.View r3 = (android.view.View) r3
            java.lang.String r4 = "v"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            r3.setVisibility(r2)
            goto L_0x02a4
        L_0x02b9:
            java.util.HashSet r0 = r8.m115207j()
            r0.clear()
            goto L_0x0361
        L_0x02c2:
            r6 = 15
            android.view.View[] r6 = new android.view.View[r6]
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r7 = r8.f93444u
            android.view.View r7 = (android.view.View) r7
            r6[r2] = r7
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r7 = r8.f93445v
            android.view.View r7 = (android.view.View) r7
            r6[r3] = r7
            android.view.ViewGroup r3 = r8.f93449z
            android.view.View r3 = (android.view.View) r3
            r6[r5] = r3
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r3 = r8.f93431h
            android.view.View r3 = (android.view.View) r3
            r6[r4] = r3
            r3 = 4
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r8.f93399G
            android.view.View r4 = (android.view.View) r4
            r6[r3] = r4
            r3 = 5
            com.ss.android.ugc.aweme.setting.ui.ExpandSettingItem r4 = r8.f93400H
            android.view.View r4 = (android.view.View) r4
            r6[r3] = r4
            r3 = 6
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r8.f93394B
            android.view.View r4 = (android.view.View) r4
            r6[r3] = r4
            r3 = 7
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r8.f93435l
            android.view.View r4 = (android.view.View) r4
            r6[r3] = r4
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r3 = r8.f93403L
            android.view.View r3 = (android.view.View) r3
            r6[r1] = r3
            r3 = 9
            com.ss.android.ugc.aweme.miniapp.MicroExpandSettingItem r4 = r8.f93430g
            android.view.View r4 = (android.view.View) r4
            r6[r3] = r4
            r3 = 10
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r8.f93429f
            android.view.View r4 = (android.view.View) r4
            r6[r3] = r4
            r3 = 11
            android.view.View r4 = r8.f93437n
            r6[r3] = r4
            r3 = 12
            android.view.View r4 = r8.f93412U
            r6[r3] = r4
            r3 = 13
            android.view.ViewGroup r4 = r8.f93397E
            android.view.View r4 = (android.view.View) r4
            r6[r3] = r4
            r3 = 14
            android.view.ViewGroup r4 = r8.f93407P
            android.view.View r4 = (android.view.View) r4
            r6[r3] = r4
            if (r0 != 0) goto L_0x0344
            android.view.ViewGroup r3 = r8.f93448y
            java.lang.Object[] r3 = kotlin.collections.C7519g.m23421a((T[]) r6, r3)
            r4 = 2131297087(0x7f09033f, float:1.821211E38)
            android.view.View r4 = r8.mo90477a(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            java.lang.Object[] r3 = kotlin.collections.C7519g.m23421a((T[]) r3, r4)
            r6 = r3
            android.view.View[] r6 = (android.view.View[]) r6
        L_0x0344:
            int r3 = r6.length
            r4 = 0
        L_0x0346:
            if (r4 >= r3) goto L_0x0361
            r5 = r6[r4]
            if (r5 == 0) goto L_0x035e
            int r7 = r5.getVisibility()
            if (r7 == r1) goto L_0x035e
            r5.setVisibility(r1)
            if (r0 != 0) goto L_0x035e
            java.util.HashSet r7 = r8.m115207j()
            r7.add(r5)
        L_0x035e:
            int r4 = r4 + 1
            goto L_0x0346
        L_0x0361:
            r8.m115210m()
            r8.m115201X()
            android.view.ViewGroup r0 = r8.f93404M
            if (r0 == 0) goto L_0x037c
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r3 = r8.f93399G
            if (r3 == 0) goto L_0x0378
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0378
            r3 = 8
            goto L_0x0379
        L_0x0378:
            r3 = 0
        L_0x0379:
            r0.setVisibility(r3)
        L_0x037c:
            boolean r0 = com.p280ss.android.ugc.aweme.profile.experiment.C35778a.m115539a()
            if (r0 == 0) goto L_0x03a9
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93432i
            if (r0 == 0) goto L_0x0389
            r0.setVisibility(r2)
        L_0x0389:
            android.content.Context r0 = r8.getContext()
            boolean r0 = com.p280ss.android.ugc.aweme.profile.p1487ui.PrivateAlbumActivity.C36209a.m117037d(r0)
            if (r0 == 0) goto L_0x03a2
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93432i
            if (r0 == 0) goto L_0x03a9
            com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$c r2 = new com.ss.android.ugc.aweme.profile.SlideSettingPageFragment$c
            r2.<init>(r8)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0.post(r2)
            goto L_0x03a9
        L_0x03a2:
            android.view.View r0 = r8.f93433j
            if (r0 == 0) goto L_0x03a9
            r0.setVisibility(r1)
        L_0x03a9:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x03bf
            com.ss.android.ugc.aweme.profile.ui.v2.ProfileNewStyleExperiment r0 = com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment.INSTANCE
            boolean r0 = r0.getENABLE_NEW_STYLE()
            if (r0 == 0) goto L_0x03bf
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r8.f93444u
            if (r0 == 0) goto L_0x03bf
            r0.setVisibility(r1)
            return
        L_0x03bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.SlideSettingPageFragment.m115211n():void");
    }

    /* renamed from: s */
    private final void m115216s() {
        ViewGroup viewGroup;
        if (C6399b.m19944t()) {
            View inflate = ((ViewStub) getView().findViewById(R.id.ef3)).inflate();
            if (inflate != null) {
                viewGroup = (ViewGroup) inflate;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        } else {
            View inflate2 = ((ViewStub) getView().findViewById(R.id.eer)).inflate();
            if (inflate2 != null) {
                viewGroup = (ViewGroup) inflate2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        this.f93434k = viewGroup;
        ViewGroup viewGroup2 = this.f93434k;
        if (viewGroup2 == null) {
            C7573i.m23580a();
        }
        this.f93444u = (CommonItemView) viewGroup2.findViewById(R.id.c2k);
        ViewGroup viewGroup3 = this.f93434k;
        if (viewGroup3 == null) {
            C7573i.m23580a();
        }
        this.f93445v = (CommonItemView) viewGroup3.findViewById(R.id.avq);
        ViewGroup viewGroup4 = this.f93434k;
        if (viewGroup4 == null) {
            C7573i.m23580a();
        }
        this.f93446w = viewGroup4.findViewById(R.id.e_y);
        ViewGroup viewGroup5 = this.f93434k;
        if (viewGroup5 == null) {
            C7573i.m23580a();
        }
        this.f93447x = (ViewGroup) viewGroup5.findViewById(R.id.c2r);
        ViewGroup viewGroup6 = this.f93434k;
        if (viewGroup6 == null) {
            C7573i.m23580a();
        }
        this.f93448y = (ViewGroup) viewGroup6.findViewById(R.id.d5y);
        ViewGroup viewGroup7 = this.f93434k;
        if (viewGroup7 == null) {
            C7573i.m23580a();
        }
        this.f93449z = (ViewGroup) viewGroup7.findViewById(R.id.c31);
        ViewGroup viewGroup8 = this.f93434k;
        if (viewGroup8 == null) {
            C7573i.m23580a();
        }
        this.f93429f = (CommonItemView) viewGroup8.findViewById(R.id.coo);
        ViewGroup viewGroup9 = this.f93434k;
        if (viewGroup9 == null) {
            C7573i.m23580a();
        }
        this.f93430g = (MicroExpandSettingItem) viewGroup9.findViewById(R.id.c0_);
        ViewGroup viewGroup10 = this.f93434k;
        if (viewGroup10 == null) {
            C7573i.m23580a();
        }
        this.f93449z = (ViewGroup) viewGroup10.findViewById(R.id.c31);
        ViewGroup viewGroup11 = this.f93434k;
        if (viewGroup11 == null) {
            C7573i.m23580a();
        }
        this.f93396D = (ViewGroup) viewGroup11.findViewById(R.id.ea1);
        ViewGroup viewGroup12 = this.f93434k;
        if (viewGroup12 == null) {
            C7573i.m23580a();
        }
        this.f93397E = (ViewGroup) viewGroup12.findViewById(R.id.e_x);
        ViewGroup viewGroup13 = this.f93434k;
        if (viewGroup13 == null) {
            C7573i.m23580a();
        }
        this.f93398F = (ViewGroup) viewGroup13.findViewById(R.id.e_z);
        ViewGroup viewGroup14 = this.f93434k;
        if (viewGroup14 == null) {
            C7573i.m23580a();
        }
        this.f93393A = (ViewGroup) viewGroup14.findViewById(R.id.ain);
        ViewGroup viewGroup15 = this.f93434k;
        if (viewGroup15 == null) {
            C7573i.m23580a();
        }
        this.f93402K = (ViewGroup) viewGroup15.findViewById(R.id.e_3);
        ViewGroup viewGroup16 = this.f93434k;
        if (viewGroup16 == null) {
            C7573i.m23580a();
        }
        this.f93435l = (CommonItemView) viewGroup16.findViewById(R.id.a3x);
        ViewGroup viewGroup17 = this.f93434k;
        if (viewGroup17 == null) {
            C7573i.m23580a();
        }
        this.f93403L = (CommonItemView) viewGroup17.findViewById(R.id.by2);
        ViewGroup viewGroup18 = this.f93434k;
        if (viewGroup18 == null) {
            C7573i.m23580a();
        }
        this.f93411T = viewGroup18.findViewById(R.id.efc);
        ViewGroup viewGroup19 = this.f93434k;
        if (viewGroup19 == null) {
            C7573i.m23580a();
        }
        this.f93437n = viewGroup19.findViewById(R.id.efd);
        ViewGroup viewGroup20 = this.f93434k;
        if (viewGroup20 == null) {
            C7573i.m23580a();
        }
        this.f93412U = viewGroup20.findViewById(R.id.efe);
        ViewGroup viewGroup21 = this.f93434k;
        if (viewGroup21 == null) {
            C7573i.m23580a();
        }
        this.f93438o = viewGroup21.findViewById(R.id.efg);
        ViewGroup viewGroup22 = this.f93434k;
        if (viewGroup22 == null) {
            C7573i.m23580a();
        }
        this.f93420ac = viewGroup22.findViewById(R.id.dgy);
        ViewGroup viewGroup23 = this.f93434k;
        if (viewGroup23 == null) {
            C7573i.m23580a();
        }
        this.f93421ad = (TextView) viewGroup23.findViewById(R.id.clo);
        ViewGroup viewGroup24 = this.f93434k;
        if (viewGroup24 == null) {
            C7573i.m23580a();
        }
        this.f93431h = (CommonItemView) viewGroup24.findViewById(R.id.a57);
        ViewGroup viewGroup25 = this.f93434k;
        if (viewGroup25 == null) {
            C7573i.m23580a();
        }
        this.f93399G = (CommonItemView) viewGroup25.findViewById(R.id.c9b);
        ViewGroup viewGroup26 = this.f93434k;
        if (viewGroup26 == null) {
            C7573i.m23580a();
        }
        this.f93400H = (ExpandSettingItem) viewGroup26.findViewById(R.id.d3g);
        ViewGroup viewGroup27 = this.f93434k;
        if (viewGroup27 == null) {
            C7573i.m23580a();
        }
        this.f93401J = (ViewGroup) viewGroup27.findViewById(R.id.bt4);
        ViewGroup viewGroup28 = this.f93434k;
        if (viewGroup28 == null) {
            C7573i.m23580a();
        }
        this.f93409R = (ExpandSettingItem) viewGroup28.findViewById(R.id.egx);
        ViewGroup viewGroup29 = this.f93434k;
        if (viewGroup29 == null) {
            C7573i.m23580a();
        }
        this.f93410S = viewGroup29.findViewById(R.id.abj);
        ViewGroup viewGroup30 = this.f93434k;
        if (viewGroup30 == null) {
            C7573i.m23580a();
        }
        this.f93432i = (CommonItemView) viewGroup30.findViewById(R.id.c2n);
        this.f93433j = mo90477a((int) R.id.ef6);
        ViewGroup viewGroup31 = this.f93434k;
        if (viewGroup31 == null) {
            C7573i.m23580a();
        }
        this.f93405N = (EffectiveSettingItem) viewGroup31.findViewById(R.id.d68);
        ViewGroup viewGroup32 = this.f93434k;
        if (viewGroup32 == null) {
            C7573i.m23580a();
        }
        this.f93404M = (ViewGroup) viewGroup32.findViewById(R.id.c9c);
        ViewGroup viewGroup33 = this.f93434k;
        if (viewGroup33 == null) {
            C7573i.m23580a();
        }
        this.f93406O = (ViewGroup) viewGroup33.findViewById(R.id.a_l);
        ViewGroup viewGroup34 = this.f93434k;
        if (viewGroup34 == null) {
            C7573i.m23580a();
        }
        this.f93407P = (ViewGroup) viewGroup34.findViewById(R.id.d2q);
        ViewGroup viewGroup35 = this.f93434k;
        if (viewGroup35 == null) {
            C7573i.m23580a();
        }
        this.f93436m = (ViewGroup) viewGroup35.findViewById(R.id.ctp);
        ViewGroup viewGroup36 = this.f93434k;
        if (viewGroup36 == null) {
            C7573i.m23580a();
        }
        this.f93408Q = (ViewGroup) viewGroup36.findViewById(R.id.ape);
        ExpandSettingItem expandSettingItem = this.f93400H;
        if (expandSettingItem != null) {
            expandSettingItem.mo95153a((View) this.f93401J, this.f93437n);
        }
        ExpandSettingItem expandSettingItem2 = this.f93409R;
        if (expandSettingItem2 != null) {
            expandSettingItem2.mo95153a(this.f93410S, (View) null);
        }
        this.f93394B = (CommonItemView) mo90477a((int) R.id.ea0);
        this.f93395C = (CommonItemView) mo90477a((int) R.id.c8v);
        ViewGroup viewGroup37 = this.f93434k;
        if (viewGroup37 == null) {
            C7573i.m23580a();
        }
        this.f93441r = (RecyclerView) viewGroup37.findViewById(R.id.bym);
    }

    /* renamed from: a */
    public final void mo26010a(View view) {
        onClick(view);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onEvent(TimeLockUserSetting timeLockUserSetting) {
        m115210m();
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            this.f93443t = null;
            C33061p pVar = this.f93439p;
            if (pVar != null) {
                pVar.mo84698b(this);
            }
        } else {
            C33061p pVar2 = this.f93439p;
            if (pVar2 != null) {
                pVar2.mo84694a((C0935e) this);
            }
        }
    }

    public final void onPageScrollStateChanged(int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (i == 1) {
            CharSequence charSequence = this.f93418aa;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f93418aa = "slide";
            }
            View a = mo90476a();
            if (a != null) {
                a.setVisibility(0);
            }
        } else if (i == 2) {
            CharSequence charSequence2 = this.f93418aa;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f93418aa = "click";
            }
            View a2 = mo90476a();
            if (a2 != null) {
                a2.setVisibility(0);
            }
        } else if (i == 0) {
            this.f93418aa = "";
            ScrollSwitchStateManager scrollSwitchStateManager = this.f93440q;
            if (scrollSwitchStateManager == null) {
                C7573i.m23580a();
            }
            if (!scrollSwitchStateManager.mo79723b("page_setting")) {
                View a3 = mo90476a();
                if (a3 != null) {
                    a3.setVisibility(8);
                }
                View a4 = mo90476a();
                if (a4 != null) {
                    a4.setClickable(false);
                }
                View view = this.f93433j;
                if (view != null) {
                    view.setVisibility(8);
                }
                ScrollSwitchStateManager scrollSwitchStateManager2 = this.f93440q;
                if (scrollSwitchStateManager2 == null) {
                    C7573i.m23580a();
                }
                scrollSwitchStateManager2.f79582a.setValue(Boolean.valueOf(false));
            } else {
                ScrollSwitchStateManager scrollSwitchStateManager3 = this.f93440q;
                if (scrollSwitchStateManager3 == null) {
                    C7573i.m23580a();
                }
                scrollSwitchStateManager3.f79582a.setValue(Boolean.valueOf(true));
                View a5 = mo90476a();
                if (a5 != null) {
                    a5.setOnClickListener(new C35654m(this));
                }
            }
        }
        if (C6399b.m19944t()) {
            View a6 = mo90476a();
            if (a6 != null && a6.getVisibility() == 0) {
                z3 = true;
            }
            if (z3 != this.f93427aj) {
                this.f93427aj = !this.f93427aj;
                C42961az.m136380a(new C36105x(this.f93427aj));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageSelected(int r7) {
        /*
            r6 = this;
            java.lang.Integer r0 = r6.f93419ab
            if (r0 != 0) goto L_0x0005
            goto L_0x000b
        L_0x0005:
            int r0 = r0.intValue()
            if (r0 == r7) goto L_0x0092
        L_0x000b:
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = r6.f93440q
            if (r0 != 0) goto L_0x0012
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0012:
            java.lang.String r1 = "page_setting"
            boolean r0 = r0.mo79723b(r1)
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "enter_navigation"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "personal_homepage"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "enter_method"
            java.lang.String r3 = r6.m115184G()
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            r0 = 0
            com.p280ss.android.ugc.aweme.profile.p1487ui.MyProfileFragment.f94911W = r0
            com.ss.android.ugc.aweme.setting.d r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r0.mo18722O()
            if (r0 == 0) goto L_0x0099
            android.content.Context r0 = r6.getContext()
            java.lang.Class<com.ss.android.ugc.aweme.profile.t> r1 = com.p280ss.android.ugc.aweme.profile.C36089t.class
            java.lang.Object r0 = com.p280ss.android.ugc.aweme.base.p1054a.p1055a.C23222h.m76242a(r0, r1)
            com.ss.android.ugc.aweme.profile.t r0 = (com.p280ss.android.ugc.aweme.profile.C36089t) r0
            if (r0 == 0) goto L_0x0099
            r1 = 1
            boolean r1 = r0.mo60384b(r1)
            if (r1 == 0) goto L_0x0099
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r2 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            boolean r1 = r1.isLogin()
            if (r1 == 0) goto L_0x0099
            java.lang.String r1 = "account_list_unfold"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r3 = "status"
            r4 = 0
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59970a(r3, r4)
            java.lang.String r3 = "enter_method"
            java.lang.String r5 = "auto"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r5)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r2)
            com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget r1 = r6.m115206i()
            r1.mo93205e()
            r0.mo60381a(r4)
            goto L_0x0099
        L_0x0092:
            com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget r0 = r6.m115206i()
            r0.mo93204d()
        L_0x0099:
            android.view.View r0 = r6.mo90476a()
            if (r0 == 0) goto L_0x00af
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r1 = r6.f93440q
            if (r1 != 0) goto L_0x00a6
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00a6:
            java.lang.String r2 = "page_setting"
            boolean r1 = r1.mo79723b(r2)
            r0.setClickable(r1)
        L_0x00af:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.f93419ab = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.SlideSettingPageFragment.onPageSelected(int):void");
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (getView() != null) {
            boolean z2 = true;
            if (z) {
                m115206i().mo93203a();
                m115217t();
                if (C6384b.m19835a().mo15287a(MicroAppItemTypeExperiment.class, true, "micro_app_item_type", C6384b.m19835a().mo15295d().micro_app_item_type, 0) != 1) {
                    z2 = false;
                }
                if (m115218u()) {
                    if (z2) {
                        m115219v();
                    } else {
                        View view = this.f93438o;
                        if (view != null) {
                            view.setVisibility(8);
                        }
                        RecyclerView recyclerView = this.f93441r;
                        if (recyclerView != null) {
                            recyclerView.setVisibility(8);
                        }
                        MicroExpandSettingItem microExpandSettingItem = this.f93430g;
                        if (microExpandSettingItem != null) {
                            microExpandSettingItem.setVisibility(8);
                        }
                        CommonItemView commonItemView = this.f93429f;
                        if (commonItemView != null) {
                            commonItemView.setVisibility(0);
                        }
                        CommonItemView commonItemView2 = this.f93429f;
                        if (commonItemView2 != null && commonItemView2.getVisibility() == 0) {
                            C6907h.m21524a("microapp_entrance_show", (Map) C22984d.m75611a().mo59973a("enter_from", "setting_page").mo59973a("click_type", "setting_page_inner").f60753a);
                        }
                    }
                }
                m115211n();
                return;
            }
            ExpandSettingItem expandSettingItem = this.f93400H;
            if (expandSettingItem != null && expandSettingItem.f98434t) {
                ExpandSettingItem expandSettingItem2 = this.f93400H;
                if (expandSettingItem2 != null) {
                    expandSettingItem2.mo95154a(false);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo90478a(boolean z) {
        ScrollSwitchStateManager scrollSwitchStateManager = this.f93440q;
        if (scrollSwitchStateManager == null) {
            C7573i.m23580a();
        }
        if (scrollSwitchStateManager.mo79723b("page_setting")) {
            C33061p pVar = this.f93439p;
            if (pVar == null || !pVar.mo84699b()) {
                C33061p pVar2 = this.f93439p;
                if (pVar2 != null) {
                    pVar2.mo84697a(Boolean.valueOf(z));
                }
            } else {
                ViewGroup viewGroup = this.f93434k;
                if (viewGroup != null) {
                    viewGroup.post(new C35656o(this, z));
                }
            }
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C27326a.m89579a(view, 500)) {
            this.f93413V = true;
            if (C7573i.m23585a((Object) view, (Object) this.f93395C)) {
                m115193P();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93429f)) {
                m115191N();
                IAccountUserService a = C21115b.m71197a();
                C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
                C6907h.m21524a("microapp_entrance_click", (Map) C22984d.m75611a().mo59973a("author_id", a.getCurUserId()).mo59973a("enter_from", "setting_page").mo59973a("click_type", "setting_page_inner").f60753a);
            } else if (C7573i.m23585a((Object) view, (Object) this.f93447x)) {
                m115195R();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93448y)) {
                m115194Q();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93396D)) {
                m115196S();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93397E)) {
                m115197T();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93398F)) {
                m115199V();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93449z)) {
                m115189L();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93393A)) {
                m115190M();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93435l)) {
                m115182E();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93403L)) {
                m115181D();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93394B)) {
                m115192O();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93432i)) {
                m115180B();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93430g)) {
                m115191N();
                IAccountUserService a2 = C21115b.m71197a();
                C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
                C6907h.m21524a("microapp_entrance_click", (Map) C22984d.m75611a().mo59973a("author_id", a2.getCurUserId()).mo59973a("enter_from", "setting_page").mo59973a("click_type", "setting_page_outer").f60753a);
            } else if (C7573i.m23585a((Object) view, (Object) this.f93402K)) {
                m115195R();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93406O)) {
                m115221x();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93407P)) {
                m115222y();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93436m)) {
                m115223z();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93408Q)) {
                m115179A();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93404M)) {
                m115187J();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93420ac)) {
                m115183F();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93400H)) {
                C6907h.m21524a("service_and_order", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").f60753a);
            } else {
                if (!C7573i.m23585a((Object) view, (Object) this.f93409R)) {
                    if (C7573i.m23585a((Object) view, (Object) this.f93410S)) {
                        m115188K();
                    } else if (C7573i.m23585a((Object) view, (Object) this.f93444u)) {
                        m115186I();
                    } else if (C7573i.m23585a((Object) view, (Object) this.f93445v)) {
                        m115185H();
                    } else if (C7573i.m23585a((Object) view, (Object) this.f93431h)) {
                        m115198U();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo90479a(boolean z, boolean z2) {
        if (z) {
            View view = getView();
            if (view != null) {
                view.postDelayed(new C35651j(this, z2), 1000);
            }
        } else {
            mo90478a(z2);
        }
    }

    /* renamed from: a */
    public static void m115204a(View view, View... viewArr) {
        int length = viewArr.length;
        int i = 0;
        while (true) {
            int i2 = 8;
            if (i < length) {
                View view2 = viewArr[i];
                if (view2 != null) {
                    i2 = view2.getVisibility();
                }
                if (i2 != 0) {
                    i++;
                } else if (view != null) {
                    view.setVisibility(0);
                    return;
                } else {
                    return;
                }
            } else if (view != null) {
                view.setVisibility(8);
                return;
            } else {
                return;
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f93422ae = (NestedScrollView) view.findViewById(R.id.czj);
        m115208k();
        this.f93416Y = new C36718ah();
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        this.f93414W = C9738o.m28708b(context, 250.0f);
        this.f93439p = C32895a.m106470a(getActivity());
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "activity!!");
        this.f93440q = C30246a.m98970a(activity);
        if (!this.mHidden) {
            C33061p pVar = this.f93439p;
            if (pVar != null) {
                pVar.mo84694a((C0935e) this);
            }
        }
        mo90481f();
        CouponApi.m80640a().observe(this, new C35655n(this));
        if (C35778a.m115539a()) {
            CommonItemView commonItemView = this.f93432i;
            if (commonItemView != null) {
                commonItemView.setVisibility(0);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        this.f93415X = a.getCurUser();
        return layoutInflater.inflate(R.layout.r0, viewGroup, false);
    }

    public final void onPageScrolled(int i, float f, int i2) {
        int i3;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f93440q;
        int i4 = 1;
        if (scrollSwitchStateManager != null) {
            i3 = scrollSwitchStateManager.mo79724c("page_feed");
        } else {
            i3 = 1;
        }
        if (i != i3) {
            ScrollSwitchStateManager scrollSwitchStateManager2 = this.f93440q;
            if (scrollSwitchStateManager2 != null) {
                i4 = scrollSwitchStateManager2.mo79724c("page_setting");
            }
            if (i != i4) {
                C33061p pVar = this.f93439p;
                if (pVar != null) {
                    pVar.mo84697a(Boolean.valueOf(false));
                    return;
                }
                return;
            }
        }
        if (mo90476a() != null) {
            float f2 = (((float) i2) / this.f93414W) * 0.34f;
            View a = mo90476a();
            if (a != null) {
                a.setAlpha(f2);
            }
        }
    }
}
