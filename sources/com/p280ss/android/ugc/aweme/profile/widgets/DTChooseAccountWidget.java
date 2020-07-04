package com.p280ss.android.ugc.aweme.profile.widgets;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p647b.C12720d;
import com.bytedance.sdk.account.p645a.p649d.C12733e;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.profile.SlideSettingPageFragment;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel.C36789a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.user.C42800a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget */
public final class DTChooseAccountWidget extends Widget {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f96555a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DTChooseAccountWidget.class), "rootView", "getRootView()Landroid/view/ViewGroup;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DTChooseAccountWidget.class), "inflater", "getInflater()Landroid/view/LayoutInflater;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DTChooseAccountWidget.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/profile/viewmodel/MultiAccountViewModel;"))};

    /* renamed from: j */
    public static final C36808a f96556j = new C36808a(null);

    /* renamed from: i */
    public boolean f96557i;

    /* renamed from: k */
    private final C7541d f96558k = C7546e.m23569a(new C36816e(this));

    /* renamed from: l */
    private final C7541d f96559l = C7546e.m23569a(new C36814c(this));

    /* renamed from: m */
    private final C7541d f96560m = C7546e.m23569a(C36817f.f96576a);

    /* renamed from: n */
    private final List<C36809b> f96561n = new ArrayList();

    /* renamed from: o */
    private View f96562o;

    /* renamed from: p */
    private View f96563p;

    /* renamed from: q */
    private RemoteImageView f96564q;

    /* renamed from: r */
    private TextView f96565r;

    /* renamed from: s */
    private final View f96566s;

    /* renamed from: t */
    private final SlideSettingPageFragment f96567t;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget$a */
    public static final class C36808a {
        private C36808a() {
        }

        public /* synthetic */ C36808a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget$b */
    public static final class C36809b {

        /* renamed from: a */
        public final ViewGroup f96568a;

        /* renamed from: b */
        public final C42800a f96569b;

        /* renamed from: c */
        public final DTChooseAccountWidget f96570c;

        /* renamed from: d */
        private final MultiAccountViewModel f96571d;

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget$b$a */
        public static final class C36813a extends C12720d {
            C36813a() {
            }

            public final /* synthetic */ void onSuccess(C12707b bVar) {
                m118613a((C12733e) bVar);
            }

            /* renamed from: a */
            private static void m118613a(C12733e eVar) {
                C6907h.m21524a("switch_account_result", (Map) C22984d.m75611a().mo59970a("status", 1).f60753a);
            }

            public final /* synthetic */ void onError(C12707b bVar, int i) {
                m118614a((C12733e) bVar, i);
            }

            /* renamed from: a */
            private static void m118614a(C12733e eVar, int i) {
                Activity g = C6405d.m19984g();
                if (g != null) {
                    C10761a.m31399c((Context) g, (int) R.string.b29).mo25750a();
                }
                C6907h.m21524a("switch_account_result", (Map) C22984d.m75611a().mo59970a("status", 0).mo59970a("fail_info", i).f60753a);
            }
        }

        /* renamed from: a */
        public final void mo93209a() {
            C6907h.m21524a("switch_account_submit", (Map) new HashMap());
            MultiAccountViewModel.m118558a(this.f96569b.f111244a, (Bundle) null, (C12720d) new C36813a());
        }

        public C36809b(ViewGroup viewGroup, C42800a aVar, DTChooseAccountWidget dTChooseAccountWidget, MultiAccountViewModel multiAccountViewModel) {
            String valueOf;
            C7573i.m23587b(viewGroup, "rootView");
            C7573i.m23587b(aVar, "user");
            C7573i.m23587b(dTChooseAccountWidget, "chooseAccountWidget");
            C7573i.m23587b(multiAccountViewModel, "viewModel");
            this.f96568a = viewGroup;
            this.f96569b = aVar;
            this.f96570c = dTChooseAccountWidget;
            this.f96571d = multiAccountViewModel;
            if (C7573i.m23585a((Object) this.f96569b.f111244a, (Object) "-1")) {
                ((ImageView) this.f96568a.findViewById(R.id.ic)).setImageResource(R.drawable.aoi);
                ((TextView) this.f96568a.findViewById(R.id.c48)).setText(R.string.eh);
            } else {
                C23323e.m76514a((RemoteImageView) this.f96568a.findViewById(R.id.ic), this.f96569b.f111248e);
                View findViewById = this.f96568a.findViewById(R.id.c48);
                C7573i.m23582a((Object) findViewById, "rootView.findViewById<TextView>(R.id.nickName)");
                ((TextView) findViewById).setText(this.f96569b.f111247d);
            }
            TextView textView = (TextView) this.f96568a.findViewById(R.id.by8);
            C7573i.m23582a((Object) textView, "messageCountTv");
            textView.setVisibility(8);
            int a = C34315c.m110973a(this.f96569b.f111244a);
            if (a > 0) {
                textView.setVisibility(0);
                if (a > 99) {
                    valueOf = "99+";
                } else {
                    valueOf = String.valueOf(a);
                }
                textView.setText(valueOf);
            }
            this.f96568a.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C36809b f96572a;

                {
                    this.f96572a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    this.f96572a.f96570c.mo93206f();
                    if (C7573i.m23585a((Object) this.f96572a.f96569b.f111244a, (Object) "-1")) {
                        TimeLockRuler.doTeenagerModeAction(this.f96572a.f96568a.getContext(), "add_account", new C36900a(new C7561a<C7581n>(this.f96572a.f96570c) {
                            public final String getName() {
                                return "addAccount";
                            }

                            public final C7585d getOwner() {
                                return C7575l.m23595a(DTChooseAccountWidget.class);
                            }

                            public final String getSignature() {
                                return "addAccount()V";
                            }

                            /* renamed from: a */
                            private void m118611a() {
                                ((DTChooseAccountWidget) this.receiver).mo93208h();
                            }

                            public final /* synthetic */ Object invoke() {
                                m118611a();
                                return C7581n.f20898a;
                            }
                        }));
                        return;
                    }
                    IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
                    C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
                    if (!publishService.isUnKnown()) {
                        IAVPublishService publishService2 = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
                        C7573i.m23582a((Object) publishService2, "ServiceManager.get().get…ss.java).publishService()");
                        if (!publishService2.isPublishFinished()) {
                            C10761a.m31399c(C6399b.m19921a(), (int) R.string.d9e).mo25750a();
                            return;
                        }
                    }
                    TimeLockRuler.doTeenagerModeAction(this.f96572a.f96568a.getContext(), "switch_account", new C36900a(new C7561a<C7581n>(this.f96572a) {
                        public final String getName() {
                            return "switchAccount";
                        }

                        public final C7585d getOwner() {
                            return C7575l.m23595a(C36809b.class);
                        }

                        public final String getSignature() {
                            return "switchAccount()V";
                        }

                        /* renamed from: a */
                        private void m118612a() {
                            ((C36809b) this.receiver).mo93209a();
                        }

                        public final /* synthetic */ Object invoke() {
                            m118612a();
                            return C7581n.f20898a;
                        }
                    }));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget$c */
    static final class C36814c extends Lambda implements C7561a<LayoutInflater> {

        /* renamed from: a */
        final /* synthetic */ DTChooseAccountWidget f96573a;

        C36814c(DTChooseAccountWidget dTChooseAccountWidget) {
            this.f96573a = dTChooseAccountWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LayoutInflater invoke() {
            View view = this.f96573a.f60921d;
            C7573i.m23582a((Object) view, "mContentView");
            return LayoutInflater.from(view.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget$d */
    static final class C36815d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DTChooseAccountWidget f96574a;

        C36815d(DTChooseAccountWidget dTChooseAccountWidget) {
            this.f96574a = dTChooseAccountWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f96574a.f96557i) {
                C6907h.m21524a("account_list_unfold", (Map) C22984d.m75611a().mo59970a("status", 0).mo59973a("enter_method", "user_click").f60753a);
            }
            this.f96574a.mo93207g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget$e */
    static final class C36816e extends Lambda implements C7561a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ DTChooseAccountWidget f96575a;

        C36816e(DTChooseAccountWidget dTChooseAccountWidget) {
            this.f96575a = dTChooseAccountWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ViewGroup invoke() {
            View view = this.f96575a.f60921d;
            if (view != null) {
                return (ViewGroup) view;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget$f */
    static final class C36817f extends Lambda implements C7561a<MultiAccountViewModel> {

        /* renamed from: a */
        public static final C36817f f96576a = new C36817f();

        C36817f() {
            super(0);
        }

        /* renamed from: a */
        private static MultiAccountViewModel m118617a() {
            return new MultiAccountViewModel();
        }

        public final /* synthetic */ Object invoke() {
            return m118617a();
        }
    }

    /* renamed from: i */
    private final ViewGroup m118600i() {
        return (ViewGroup) this.f96558k.getValue();
    }

    /* renamed from: j */
    private final LayoutInflater m118601j() {
        return (LayoutInflater) this.f96559l.getValue();
    }

    /* renamed from: k */
    private final MultiAccountViewModel m118602k() {
        return (MultiAccountViewModel) this.f96560m.getValue();
    }

    /* renamed from: f */
    public final void mo93206f() {
        this.f96567t.mo90479a(false, true);
    }

    /* renamed from: g */
    public final void mo93207g() {
        if (this.f96557i) {
            mo93204d();
        } else {
            mo93205e();
        }
    }

    /* renamed from: h */
    public final void mo93208h() {
        if (C21115b.m71197a().allUidList().size() < 3) {
            C36789a.m118564a(this.f96567t.getActivity(), "", "add_account_mine");
        } else {
            C10761a.m31409e(m118600i().getContext(), (int) R.string.ei).mo25750a();
        }
    }

    /* renamed from: d */
    public final void mo93204d() {
        for (C36809b bVar : this.f96561n) {
            m118600i().removeView(bVar.f96568a);
        }
        this.f96566s.setVisibility(0);
        View view = this.f96562o;
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                ViewPropertyAnimator rotation = animate.rotation(0.0f);
                if (rotation != null) {
                    ViewPropertyAnimator duration = rotation.setDuration(100);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
        }
        this.f96557i = false;
    }

    /* renamed from: e */
    public final void mo93205e() {
        this.f96561n.clear();
        for (C42800a aVar : m118602k().mo93123a()) {
            View inflate = m118601j().inflate(R.layout.tn, m118600i(), false);
            if (inflate != null) {
                C36809b bVar = new C36809b((ViewGroup) inflate, aVar, this, m118602k());
                bVar.f96568a.setTag(bVar);
                m118600i().addView(bVar.f96568a);
                this.f96561n.add(bVar);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        for (C36809b bVar2 : this.f96561n) {
            bVar2.f96568a.setVisibility(0);
        }
        this.f96566s.setVisibility(4);
        View view = this.f96562o;
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                ViewPropertyAnimator rotation = animate.rotation(180.0f);
                if (rotation != null) {
                    ViewPropertyAnimator duration = rotation.setDuration(100);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
        }
        this.f96557i = true;
    }

    /* renamed from: a */
    public final void mo93203a() {
        int i;
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (f.isLogin()) {
            C7213d a = C7213d.m22500a();
            C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
            int i2 = 8;
            if (a.mo18722O()) {
                View view = this.f60921d;
                C7573i.m23582a((Object) view, "mContentView");
                view.setVisibility(0);
                LayoutParams layoutParams = this.f96566s.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = (int) C9738o.m28708b(this.f96566s.getContext(), 68.0f);
                    this.f96566s.setLayoutParams(marginLayoutParams);
                    IAccountUserService a2 = C21115b.m71197a();
                    C7573i.m23582a((Object) a2, "AccountUserProxyService.get()");
                    User curUser = a2.getCurUser();
                    C7573i.m23582a((Object) curUser, "currentUser");
                    String uid = curUser.getUid();
                    List allUidList = C21115b.m71197a().allUidList();
                    C7573i.m23582a((Object) allUidList, "AccountUserProxyService.get().allUidList()");
                    Iterable<String> iterable = allUidList;
                    Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (String str : iterable) {
                        if (C7573i.m23585a((Object) uid, (Object) str)) {
                            i = 0;
                        } else {
                            C7573i.m23582a((Object) str, "it");
                            i = C34315c.m110973a(str);
                        }
                        arrayList.add(Integer.valueOf(i));
                    }
                    int q = C7525m.m23527q((List) arrayList);
                    C23323e.m76524b(this.f96564q, curUser.getAvatarThumb());
                    TextView textView = this.f96565r;
                    if (textView != null) {
                        textView.setText(curUser.getNickname());
                    }
                    View view2 = this.f96563p;
                    if (view2 != null) {
                        if (q > 0) {
                            i2 = 0;
                        }
                        view2.setVisibility(i2);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            View view3 = this.f60921d;
            C7573i.m23582a((Object) view3, "mContentView");
            view3.setVisibility(8);
            LayoutParams layoutParams2 = this.f96566s.getLayoutParams();
            if (layoutParams2 != null) {
                MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = (int) C9738o.m28708b(this.f96566s.getContext(), 0.0f);
                this.f96566s.setLayoutParams(marginLayoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: a */
    public final void mo60146a(View view) {
        C7573i.m23587b(view, "view");
        super.mo60146a(view);
        this.f96557i = false;
        View findViewById = m118600i().findViewById(R.id.a1);
        m118600i().removeAllViews();
        View inflate = m118601j().inflate(R.layout.tn, m118600i(), false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…ount_dt, rootView, false)");
        this.f96562o = inflate.findViewById(R.id.bzu);
        this.f96564q = (RemoteImageView) inflate.findViewById(R.id.ic);
        this.f96565r = (TextView) inflate.findViewById(R.id.c48);
        this.f96563p = inflate.findViewById(R.id.ei1);
        View findViewById2 = inflate.findViewById(R.id.by8);
        C7573i.m23582a((Object) findViewById2, "currentUserView.findView…View>(R.id.message_count)");
        findViewById2.setVisibility(8);
        View view2 = this.f96562o;
        if (view2 != null) {
            view2.setVisibility(0);
            if (C6399b.m19946v() && (view2 instanceof ImageView)) {
                ((ImageView) view2).setImageResource(R.drawable.ao9);
            }
        }
        inflate.setOnClickListener(new C36815d(this));
        C7573i.m23582a((Object) findViewById, "splitLine");
        findViewById.setVisibility(0);
        m118600i().addView(inflate);
        m118600i().addView(findViewById);
        ViewParent parent = this.f96566s.getParent();
        if (parent != null) {
            LayoutTransition layoutTransition = ((ViewGroup) parent).getLayoutTransition();
            layoutTransition.disableTransitionType(1);
            layoutTransition.setDuration(2, 200);
            layoutTransition.setDuration(3, 200);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public DTChooseAccountWidget(View view, SlideSettingPageFragment slideSettingPageFragment) {
        C7573i.m23587b(view, "mainContainer");
        C7573i.m23587b(slideSettingPageFragment, "slideFragment");
        this.f96566s = view;
        this.f96567t = slideSettingPageFragment;
    }
}
