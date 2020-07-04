package com.p280ss.android.ugc.aweme.proaccount;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.DmtRtlViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.WelcomePageTextStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.ViewPagerIndicatorLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeFragment */
public final class ProWelcomeFragment extends AmeBaseFragment {

    /* renamed from: j */
    public static final C35634a f93344j = new C35634a(null);

    /* renamed from: e */
    public long f93345e = -1;

    /* renamed from: f */
    public int f93346f;

    /* renamed from: g */
    public long f93347g;

    /* renamed from: h */
    public String f93348h = "";

    /* renamed from: i */
    public Boolean f93349i = Boolean.valueOf(false);

    /* renamed from: k */
    private WelcomePagerAdapter<ProWelcomePageFragment> f93350k;

    /* renamed from: l */
    private ProAccountEnableDetailInfo f93351l;

    /* renamed from: m */
    private C35635b f93352m;

    /* renamed from: n */
    private int f93353n;

    /* renamed from: o */
    private long f93354o = -1;

    /* renamed from: p */
    private HashMap f93355p;

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeFragment$a */
    public static final class C35634a {
        private C35634a() {
        }

        /* renamed from: a */
        public static ProWelcomeFragment m115126a() {
            ProWelcomeFragment proWelcomeFragment = new ProWelcomeFragment();
            proWelcomeFragment.setArguments(new Bundle());
            return proWelcomeFragment;
        }

        public /* synthetic */ C35634a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeFragment$b */
    public interface C35635b {
        /* renamed from: c */
        void mo58711c();
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeFragment$c */
    static final class C35636c extends Lambda implements C7562b<WelcomePageTextStruct, Boolean> {

        /* renamed from: a */
        public static final C35636c f93356a = new C35636c();

        C35636c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m115128a((WelcomePageTextStruct) obj));
        }

        /* renamed from: a */
        private static boolean m115128a(WelcomePageTextStruct welcomePageTextStruct) {
            C7573i.m23587b(welcomePageTextStruct, "it");
            try {
                if (welcomePageTextStruct.getDescription() == null || welcomePageTextStruct.getImageUrl() == null || welcomePageTextStruct.getTitle() == null) {
                    return false;
                }
                return true;
            } catch (NullValueException unused) {
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.proaccount.ProWelcomeFragment$d */
    static final class C35637d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProWelcomeFragment f93357a;

        C35637d(ProWelcomeFragment proWelcomeFragment) {
            this.f93357a = proWelcomeFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f93357a.mo90447a();
        }
    }

    /* renamed from: a */
    private View m115118a(int i) {
        if (this.f93355p == null) {
            this.f93355p = new HashMap();
        }
        View view = (View) this.f93355p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f93355p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    private void m115123f() {
        if (this.f93355p != null) {
            this.f93355p.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m115123f();
    }

    /* renamed from: d */
    private final void m115121d() {
        ((DmtTextView) m115118a((int) R.id.egt)).setOnClickListener(new C35637d(this));
    }

    public final void onResume() {
        super.onResume();
        this.f93345e = System.currentTimeMillis();
        this.f93354o = System.currentTimeMillis();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((ProWelcomeActivity) activity).f93338a = System.currentTimeMillis();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.proaccount.ProWelcomeActivity");
    }

    /* renamed from: e */
    private final void m115122e() {
        List list;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            ProAccountEnableDetailInfo proAccountEnableDetailInfo = a.getProAccountEnableDetailInfo();
            C7573i.m23582a((Object) proAccountEnableDetailInfo, "SettingsReader.get().proAccountEnableDetailInfo");
            this.f93351l = proAccountEnableDetailInfo;
        } catch (NullValueException unused) {
        }
        ProAccountEnableDetailInfo proAccountEnableDetailInfo2 = this.f93351l;
        if (proAccountEnableDetailInfo2 == null) {
            C7573i.m23583a("mWelcomePageInfo");
        }
        if (m115120a(proAccountEnableDetailInfo2)) {
            ProAccountEnableDetailInfo proAccountEnableDetailInfo3 = this.f93351l;
            if (proAccountEnableDetailInfo3 == null) {
                C7573i.m23583a("mWelcomePageInfo");
            }
            list = proAccountEnableDetailInfo3.getWelcomePageList();
            C7573i.m23582a((Object) list, "mWelcomePageInfo.welcomePageList");
            this.f93353n = list.size();
        } else {
            this.f93353n = 2;
            list = new ArrayList();
        }
        C0608j childFragmentManager = getChildFragmentManager();
        C7573i.m23582a((Object) childFragmentManager, "childFragmentManager");
        this.f93350k = new WelcomePagerAdapter<>(childFragmentManager, this.f93353n, list);
        DmtRtlViewPager dmtRtlViewPager = (DmtRtlViewPager) m115118a((int) R.id.egw);
        C7573i.m23582a((Object) dmtRtlViewPager, "welcome_viewpager");
        WelcomePagerAdapter<ProWelcomePageFragment> welcomePagerAdapter = this.f93350k;
        if (welcomePagerAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        dmtRtlViewPager.setAdapter(welcomePagerAdapter);
        ((DmtRtlViewPager) m115118a((int) R.id.egw)).mo3451a((C0935e) new ProWelcomeFragment$fillUi$1(this));
        ((ViewPagerIndicatorLayout) m115118a((int) R.id.egr)).setUpViewPager((DmtRtlViewPager) m115118a((int) R.id.egw));
        ((DmtTextView) m115118a((int) R.id.egt)).setFontType(C10834d.f29332b);
    }

    /* renamed from: a */
    public final void mo90447a() {
        this.f93348h = "continue";
        DmtRtlViewPager dmtRtlViewPager = (DmtRtlViewPager) m115118a((int) R.id.egw);
        C7573i.m23582a((Object) dmtRtlViewPager, "welcome_viewpager");
        if (dmtRtlViewPager.getCurrentItem() >= this.f93353n - 1) {
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            User curUser = a.getCurUser();
            if (curUser != null && !curUser.isSecret()) {
                C6907h.m21524a("click_welcome_continue", (Map) C22984d.m75611a().mo59973a("is_success", "1").mo59971a("duration", System.currentTimeMillis() - this.f93354o).f60753a);
            }
            C35635b bVar = this.f93352m;
            if (bVar == null) {
                C7573i.m23583a("mContinueCallBack");
            }
            bVar.mo58711c();
            StringBuilder sb = new StringBuilder("welcome screen");
            sb.append(this.f93353n);
            m115119a(sb.toString(), System.currentTimeMillis() - this.f93345e, this.f93348h);
            return;
        }
        DmtRtlViewPager dmtRtlViewPager2 = (DmtRtlViewPager) m115118a((int) R.id.egw);
        DmtRtlViewPager dmtRtlViewPager3 = (DmtRtlViewPager) m115118a((int) R.id.egw);
        C7573i.m23582a((Object) dmtRtlViewPager3, "welcome_viewpager");
        dmtRtlViewPager2.mo3450a(dmtRtlViewPager3.getCurrentItem() + 1, true);
    }

    /* renamed from: a */
    public final void mo90448a(C35635b bVar) {
        C7573i.m23587b(bVar, "callback");
        this.f93352m = bVar;
    }

    /* renamed from: a */
    private static boolean m115120a(ProAccountEnableDetailInfo proAccountEnableDetailInfo) {
        if (proAccountEnableDetailInfo == null || proAccountEnableDetailInfo.getWelcomePageList().isEmpty()) {
            return false;
        }
        C7562b bVar = C35636c.f93356a;
        List welcomePageList = proAccountEnableDetailInfo.getWelcomePageList();
        C7573i.m23582a((Object) welcomePageList, "welcomePageInfo.welcomePageList");
        Iterable<WelcomePageTextStruct> iterable = welcomePageList;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (WelcomePageTextStruct welcomePageTextStruct : iterable) {
                C7573i.m23582a((Object) welcomePageTextStruct, "it");
                if (!((Boolean) bVar.invoke(welcomePageTextStruct)).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m115122e();
        m115121d();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.q4, viewGroup, false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Boolean bool;
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            if (intent != null) {
                bool = Boolean.valueOf(intent.getBooleanExtra("BACK_FROM_CATEGORY", false));
            } else {
                bool = null;
            }
            this.f93349i = bool;
        }
    }

    /* renamed from: a */
    public static void m115119a(String str, long j, String str2) {
        C6907h.m21524a("change_screen", (Map) C22984d.m75611a().mo59973a("screen", str).mo59973a("duration", String.valueOf(j)).mo59973a("Type", str2).f60753a);
    }
}
