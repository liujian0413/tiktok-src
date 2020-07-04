package com.p280ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p022v4.widget.NestedScrollView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.widget.setting.EffectiveSettingItemBase.C10811a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1054a.p1055a.C23222h;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel.C30243a;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.legoImp.task.AssistantTask.C32361a;
import com.p280ss.android.ugc.aweme.main.C33061p;
import com.p280ss.android.ugc.aweme.main.base.C32895a;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MyProfileFragment;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams.C36995a;
import com.p280ss.android.ugc.aweme.qrcode.p1499v2.QRCodeActivityV2;
import com.p280ss.android.ugc.aweme.setting.C37575au;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.profile.TeenageSlideSettingFragment */
public final class TeenageSlideSettingFragment extends CommonPageFragment implements C0935e, OnClickListener, C10811a {

    /* renamed from: e */
    public C33061p f93468e;

    /* renamed from: f */
    public ScrollSwitchStateManager f93469f;

    /* renamed from: g */
    public View f93470g;

    /* renamed from: h */
    private CommonItemView f93471h;

    /* renamed from: i */
    private ViewGroup f93472i;

    /* renamed from: j */
    private ViewGroup f93473j;

    /* renamed from: k */
    private ViewGroup f93474k;

    /* renamed from: l */
    private ViewGroup f93475l;

    /* renamed from: m */
    private View f93476m;

    /* renamed from: n */
    private View f93477n;

    /* renamed from: o */
    private boolean f93478o;

    /* renamed from: p */
    private float f93479p;

    /* renamed from: q */
    private User f93480q;

    /* renamed from: r */
    private String f93481r = "slide";

    /* renamed from: s */
    private Integer f93482s = Integer.valueOf(-1);

    /* renamed from: t */
    private View f93483t;

    /* renamed from: u */
    private TextView f93484u;

    /* renamed from: v */
    private NestedScrollView f93485v;

    /* renamed from: w */
    private HashMap f93486w;

    /* renamed from: com.ss.android.ugc.aweme.profile.TeenageSlideSettingFragment$a */
    static final class C35659a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TeenageSlideSettingFragment f93487a;

        /* renamed from: b */
        final /* synthetic */ boolean f93488b;

        C35659a(TeenageSlideSettingFragment teenageSlideSettingFragment, boolean z) {
            this.f93487a = teenageSlideSettingFragment;
            this.f93488b = z;
        }

        public final void run() {
            if (this.f93487a.isViewValid()) {
                this.f93487a.mo90494a(this.f93488b);
                View a = this.f93487a.mo90493a();
                if (a != null) {
                    a.setVisibility(8);
                }
                View a2 = this.f93487a.mo90493a();
                if (a2 != null) {
                    a2.setClickable(false);
                }
                ScrollSwitchStateManager scrollSwitchStateManager = this.f93487a.f93469f;
                if (scrollSwitchStateManager == null) {
                    C7573i.m23580a();
                }
                scrollSwitchStateManager.f79582a.setValue(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.TeenageSlideSettingFragment$b */
    static final class C35660b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeenageSlideSettingFragment f93489a;

        C35660b(TeenageSlideSettingFragment teenageSlideSettingFragment) {
            this.f93489a = teenageSlideSettingFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            View a = this.f93489a.mo90493a();
            if (a != null) {
                a.setClickable(false);
            }
            C33061p pVar = this.f93489a.f93468e;
            if (pVar != null) {
                pVar.mo84697a(Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.TeenageSlideSettingFragment$c */
    static final class C35661c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TeenageSlideSettingFragment f93490a;

        /* renamed from: b */
        final /* synthetic */ boolean f93491b;

        C35661c(TeenageSlideSettingFragment teenageSlideSettingFragment, boolean z) {
            this.f93490a = teenageSlideSettingFragment;
            this.f93491b = z;
        }

        public final void run() {
            this.f93490a.mo90494a(this.f93491b);
        }
    }

    /* renamed from: a */
    private View m115246a(int i) {
        if (this.f93486w == null) {
            this.f93486w = new HashMap();
        }
        View view = (View) this.f93486w.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f93486w.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: q */
    private void m115260q() {
        if (this.f93486w != null) {
            this.f93486w.clear();
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m115260q();
    }

    /* renamed from: m */
    private String m115256m() {
        if (TextUtils.isEmpty(MyProfileFragment.f94911W)) {
            return this.f93481r;
        }
        return MyProfileFragment.f94911W;
    }

    public final void onResume() {
        super.onResume();
        m115248a(false, true);
    }

    /* renamed from: g */
    private final void m115251g() {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        this.f93480q = a.getCurUser();
        m115250f();
        C37575au.m120344a(R.array.r, this.f93473j);
    }

    /* renamed from: n */
    private final void m115257n() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C32361a.m104925a(activity);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
    }

    public final void onPause() {
        super.onPause();
        if (this.f93478o) {
            m115248a(this.f93478o, false);
            this.f93478o = false;
        }
    }

    /* renamed from: d */
    private final void m115249d() {
        int a = C10994a.m32204a((Context) getActivity());
        Space space = (Space) m115246a((int) R.id.d8u);
        C7573i.m23582a((Object) space, "sp_status_bar");
        space.getLayoutParams().height = a;
        m115254k();
        m115252i();
        m115251g();
        m115253j();
    }

    /* renamed from: f */
    private final void m115250f() {
        int i;
        TextView textView = this.f93484u;
        if (textView != null) {
            if (TimeLockRuler.isContentFilterOn() || TimeLockRuler.isTimeLockOn() || ParentalPlatformConfig.f60133a.mo59214b() == Role.PARENT || ParentalPlatformConfig.f60133a.mo59214b() == Role.CHILD) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    /* renamed from: i */
    private final void m115252i() {
        ViewGroup viewGroup = this.f93472i;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this);
        }
        CommonItemView commonItemView = this.f93471h;
        if (commonItemView != null) {
            commonItemView.setOnClickListener(this);
        }
        ViewGroup viewGroup2 = this.f93475l;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(this);
        }
        View view = this.f93483t;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    /* renamed from: j */
    private final void m115253j() {
        int i;
        CommonItemView commonItemView = this.f93471h;
        if (commonItemView != null) {
            commonItemView.setLeftText("Debug Test");
        }
        CommonItemView commonItemView2 = this.f93471h;
        if (commonItemView2 != null) {
            if (C7163a.m22363a() || C6319n.m19594a(C6399b.m19941q(), "lark_inhouse")) {
                i = 0;
            } else {
                i = 8;
            }
            commonItemView2.setVisibility(i);
        }
    }

    /* renamed from: l */
    private final void m115255l() {
        C6907h.m21524a("enter_wellbeing", (Map) C22984d.m75611a().mo59973a("enter_from", "navigation_panel").f60753a);
        C22603f.m74719a("navigation_panel");
        ParentalPlatformManager.m74625a((Activity) getActivity());
    }

    /* renamed from: o */
    private final void m115258o() {
        C36340al alVar;
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        User curUser = a.getCurUser();
        C33061p pVar = this.f93468e;
        ArrayList arrayList = null;
        if (pVar != null) {
            alVar = pVar.mo84693a();
        } else {
            alVar = null;
        }
        if (alVar != null) {
            C33061p pVar2 = this.f93468e;
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

    /* renamed from: p */
    private final void m115259p() {
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

    /* renamed from: a */
    public final View mo90493a() {
        if (this.f93470g == null) {
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
            if (d == null) {
                C7573i.m23580a();
            }
            this.f93470g = C30243a.m98913a(d).f79575a;
        }
        return this.f93470g;
    }

    /* renamed from: k */
    private final void m115254k() {
        View inflate = ((ViewStub) getView().findViewById(R.id.ef0)).inflate();
        if (inflate != null) {
            this.f93473j = (ViewGroup) inflate;
            ViewGroup viewGroup = this.f93473j;
            if (viewGroup == null) {
                C7573i.m23580a();
            }
            this.f93472i = (ViewGroup) viewGroup.findViewById(R.id.ea1);
            ViewGroup viewGroup2 = this.f93473j;
            if (viewGroup2 == null) {
                C7573i.m23580a();
            }
            this.f93475l = (ViewGroup) viewGroup2.findViewById(R.id.e_3);
            ViewGroup viewGroup3 = this.f93473j;
            if (viewGroup3 == null) {
                C7573i.m23580a();
            }
            this.f93476m = viewGroup3.findViewById(R.id.efc);
            ViewGroup viewGroup4 = this.f93473j;
            if (viewGroup4 == null) {
                C7573i.m23580a();
            }
            this.f93477n = viewGroup4.findViewById(R.id.efg);
            ViewGroup viewGroup5 = this.f93473j;
            if (viewGroup5 == null) {
                C7573i.m23580a();
            }
            this.f93483t = viewGroup5.findViewById(R.id.dgy);
            ViewGroup viewGroup6 = this.f93473j;
            if (viewGroup6 == null) {
                C7573i.m23580a();
            }
            this.f93484u = (TextView) viewGroup6.findViewById(R.id.clo);
            ViewGroup viewGroup7 = this.f93473j;
            if (viewGroup7 == null) {
                C7573i.m23580a();
            }
            this.f93474k = (ViewGroup) viewGroup7.findViewById(R.id.bt4);
            this.f93471h = (CommonItemView) m115246a((int) R.id.c8v);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final void mo26010a(View view) {
        onClick(view);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onEvent(TimeLockUserSetting timeLockUserSetting) {
        m115250f();
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (getView() != null && z) {
            m115251g();
        }
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            this.f93470g = null;
            C33061p pVar = this.f93468e;
            if (pVar != null) {
                pVar.mo84698b(this);
            }
        } else {
            C33061p pVar2 = this.f93468e;
            if (pVar2 != null) {
                pVar2.mo84694a((C0935e) this);
            }
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C27326a.m89579a(view, 500)) {
            this.f93478o = true;
            if (C7573i.m23585a((Object) view, (Object) this.f93471h)) {
                m115257n();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93472i)) {
                m115259p();
            } else if (C7573i.m23585a((Object) view, (Object) this.f93475l)) {
                m115258o();
            } else {
                if (C7573i.m23585a((Object) view, (Object) this.f93483t)) {
                    m115255l();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo90494a(boolean z) {
        ScrollSwitchStateManager scrollSwitchStateManager = this.f93469f;
        if (scrollSwitchStateManager == null) {
            C7573i.m23580a();
        }
        if (scrollSwitchStateManager.mo79723b("page_setting")) {
            C33061p pVar = this.f93468e;
            if (pVar == null || !pVar.mo84699b()) {
                C33061p pVar2 = this.f93468e;
                if (pVar2 != null) {
                    pVar2.mo84697a(Boolean.valueOf(z));
                }
            } else {
                ViewGroup viewGroup = this.f93473j;
                if (viewGroup != null) {
                    viewGroup.post(new C35661c(this, z));
                }
            }
        }
    }

    public final void onPageScrollStateChanged(int i) {
        boolean z = true;
        if (i == 1) {
            CharSequence charSequence = this.f93481r;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            if (z) {
                this.f93481r = "slide";
            }
            View a = mo90493a();
            if (a != null) {
                a.setVisibility(0);
            }
        } else if (i == 2) {
            CharSequence charSequence2 = this.f93481r;
            if (!(charSequence2 == null || charSequence2.length() == 0)) {
                z = false;
            }
            if (z) {
                this.f93481r = "click";
            }
            View a2 = mo90493a();
            if (a2 != null) {
                a2.setVisibility(0);
            }
        } else {
            if (i == 0) {
                this.f93481r = "";
                ScrollSwitchStateManager scrollSwitchStateManager = this.f93469f;
                if (scrollSwitchStateManager == null) {
                    C7573i.m23580a();
                }
                if (!scrollSwitchStateManager.mo79723b("page_setting")) {
                    View a3 = mo90493a();
                    if (a3 != null) {
                        a3.setVisibility(8);
                    }
                    View a4 = mo90493a();
                    if (a4 != null) {
                        a4.setClickable(false);
                    }
                    ScrollSwitchStateManager scrollSwitchStateManager2 = this.f93469f;
                    if (scrollSwitchStateManager2 == null) {
                        C7573i.m23580a();
                    }
                    scrollSwitchStateManager2.f79582a.setValue(Boolean.valueOf(false));
                    return;
                }
                ScrollSwitchStateManager scrollSwitchStateManager3 = this.f93469f;
                if (scrollSwitchStateManager3 == null) {
                    C7573i.m23580a();
                }
                scrollSwitchStateManager3.f79582a.setValue(Boolean.valueOf(true));
                View a5 = mo90493a();
                if (a5 != null) {
                    a5.setOnClickListener(new C35660b(this));
                }
            }
        }
    }

    public final void onPageSelected(int i) {
        Integer num = this.f93482s;
        if (num == null || num.intValue() != i) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f93469f;
            if (scrollSwitchStateManager == null) {
                C7573i.m23580a();
            }
            if (scrollSwitchStateManager.mo79723b("page_setting")) {
                C6907h.m21524a("enter_navigation", (Map) C22984d.m75611a().mo59973a("enter_from", "personal_homepage").mo59973a("enter_method", m115256m()).f60753a);
                MyProfileFragment.f94911W = null;
                C7213d a = C7213d.m22500a();
                C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
                if (a.mo18722O()) {
                    C36089t tVar = (C36089t) C23222h.m76242a(getContext(), C36089t.class);
                    if (tVar.mo60384b(true)) {
                        C6907h.m21524a("account_list_unfold", (Map) C22984d.m75611a().mo59970a("status", 0).mo59973a("enter_method", "auto").f60753a);
                        tVar.mo60381a(false);
                    }
                }
            }
        }
        View a2 = mo90493a();
        if (a2 != null) {
            ScrollSwitchStateManager scrollSwitchStateManager2 = this.f93469f;
            if (scrollSwitchStateManager2 == null) {
                C7573i.m23580a();
            }
            a2.setClickable(scrollSwitchStateManager2.mo79723b("page_setting"));
        }
        this.f93482s = Integer.valueOf(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m115248a(boolean z, boolean z2) {
        if (z) {
            View view = getView();
            if (view != null) {
                view.postDelayed(new C35659a(this, z2), 1000);
            }
        } else {
            mo90494a(z2);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f93485v = (NestedScrollView) view.findViewById(R.id.czj);
        m115249d();
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        this.f93479p = C9738o.m28708b(context, 250.0f);
        this.f93468e = C32895a.m106470a(getActivity());
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "activity!!");
        this.f93469f = C30246a.m98970a(activity);
        if (!this.mHidden) {
            C33061p pVar = this.f93468e;
            if (pVar != null) {
                pVar.mo84694a((C0935e) this);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        this.f93480q = a.getCurUser();
        return layoutInflater.inflate(R.layout.r9, viewGroup, false);
    }

    public final void onPageScrolled(int i, float f, int i2) {
        int i3;
        ScrollSwitchStateManager scrollSwitchStateManager = this.f93469f;
        int i4 = 1;
        if (scrollSwitchStateManager != null) {
            i3 = scrollSwitchStateManager.mo79724c("page_feed");
        } else {
            i3 = 1;
        }
        if (i != i3) {
            ScrollSwitchStateManager scrollSwitchStateManager2 = this.f93469f;
            if (scrollSwitchStateManager2 != null) {
                i4 = scrollSwitchStateManager2.mo79724c("page_setting");
            }
            if (i != i4) {
                C33061p pVar = this.f93468e;
                if (pVar != null) {
                    pVar.mo84697a(Boolean.valueOf(false));
                    return;
                }
                return;
            }
        }
        if (mo90493a() != null) {
            float f2 = (((float) i2) / this.f93479p) * 0.34f;
            View a = mo90493a();
            if (a != null) {
                a.setAlpha(f2);
            }
        }
    }
}
