package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout;
import com.p280ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.C25772c;
import com.p280ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.C25777f;
import com.p280ss.android.ugc.aweme.discover.adapter.TabIntermediatePagerAdapter;
import com.p280ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.TabIntermediateFragment */
public final class TabIntermediateFragment extends AmeBaseFragment {

    /* renamed from: e */
    public static final C26989a f71260e = new C26989a(null);

    /* renamed from: f */
    private CommonTabLayout f71261f;

    /* renamed from: g */
    private ViewPager f71262g;

    /* renamed from: h */
    private TabIntermediatePagerAdapter f71263h;

    /* renamed from: i */
    private SearchIntermediateViewModel f71264i;

    /* renamed from: j */
    private final C26991c f71265j = new C26991c(this);

    /* renamed from: k */
    private HashMap f71266k;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.TabIntermediateFragment$a */
    public static final class C26989a {
        private C26989a() {
        }

        public /* synthetic */ C26989a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.TabIntermediateFragment$b */
    static final class C26990b<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ TabIntermediateFragment f71267a;

        C26990b(TabIntermediateFragment tabIntermediateFragment) {
            this.f71267a = tabIntermediateFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            this.f71267a.mo69778a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.TabIntermediateFragment$c */
    public static final class C26991c implements C25772c {

        /* renamed from: a */
        final /* synthetic */ TabIntermediateFragment f71268a;

        C26991c(TabIntermediateFragment tabIntermediateFragment) {
            this.f71268a = tabIntermediateFragment;
        }

        /* renamed from: a */
        public final void mo66933a(C25777f fVar) {
            C7573i.m23587b(fVar, "tab");
            this.f71268a.mo69779a(fVar.f68162e);
        }
    }

    /* renamed from: j */
    private void m88734j() {
        if (this.f71266k != null) {
            this.f71266k.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m88734j();
    }

    /* renamed from: e */
    public final int mo69781e() {
        ViewPager viewPager = this.f71262g;
        if (viewPager == null) {
            C7573i.m23583a("mViewPager");
        }
        return viewPager.getCurrentItem();
    }

    /* renamed from: i */
    private final void m88733i() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f71264i;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("mIntermediateViewModel");
        }
        searchIntermediateViewModel.getSearchTabIndex().observe(this, new C26990b(this));
    }

    /* renamed from: d */
    public final void mo69780d() {
        if (isViewValid()) {
            ViewPager viewPager = this.f71262g;
            if (viewPager == null) {
                C7573i.m23583a("mViewPager");
            }
            viewPager.setCurrentItem(0, false);
        }
    }

    /* renamed from: f */
    private final void m88731f() {
        this.f71263h = new TabIntermediatePagerAdapter(getChildFragmentManager(), getContext());
        ViewPager viewPager = this.f71262g;
        if (viewPager == null) {
            C7573i.m23583a("mViewPager");
        }
        viewPager.setOffscreenPageLimit(5);
        ViewPager viewPager2 = this.f71262g;
        if (viewPager2 == null) {
            C7573i.m23583a("mViewPager");
        }
        TabIntermediatePagerAdapter tabIntermediatePagerAdapter = this.f71263h;
        if (tabIntermediatePagerAdapter == null) {
            C7573i.m23583a("mPagerAdapter");
        }
        viewPager2.setAdapter(tabIntermediatePagerAdapter);
    }

    /* renamed from: g */
    private final void m88732g() {
        CommonTabLayout commonTabLayout = this.f71261f;
        if (commonTabLayout == null) {
            C7573i.m23583a("mTabLayout");
        }
        commonTabLayout.setCustomTabViewResId(R.layout.a2t);
        CommonTabLayout commonTabLayout2 = this.f71261f;
        if (commonTabLayout2 == null) {
            C7573i.m23583a("mTabLayout");
        }
        ViewPager viewPager = this.f71262g;
        if (viewPager == null) {
            C7573i.m23583a("mViewPager");
        }
        commonTabLayout2.setupWithViewPager(viewPager);
        CommonTabLayout commonTabLayout3 = this.f71261f;
        if (commonTabLayout3 == null) {
            C7573i.m23583a("mTabLayout");
        }
        commonTabLayout3.mo66892a((C25772c) this.f71265j);
        CommonTabLayout commonTabLayout4 = this.f71261f;
        if (commonTabLayout4 == null) {
            C7573i.m23583a("mTabLayout");
        }
        commonTabLayout4.setTabMode(0);
        CommonTabLayout commonTabLayout5 = this.f71261f;
        if (commonTabLayout5 == null) {
            C7573i.m23583a("mTabLayout");
        }
        commonTabLayout5.setAutoFillWhenScrollable(true);
        CommonTabLayout commonTabLayout6 = this.f71261f;
        if (commonTabLayout6 == null) {
            C7573i.m23583a("mTabLayout");
        }
        commonTabLayout6.mo66890a(C23486n.m77122a(16.0d), 0, C23486n.m77122a(16.0d), 0);
    }

    /* renamed from: a */
    public final void mo69778a() {
        if (isViewValid()) {
            SearchIntermediateViewModel searchIntermediateViewModel = this.f71264i;
            if (searchIntermediateViewModel == null) {
                C7573i.m23583a("mIntermediateViewModel");
            }
            Integer num = (Integer) searchIntermediateViewModel.getSearchTabIndex().getValue();
            if (num != null) {
                ViewPager viewPager = this.f71262g;
                if (viewPager == null) {
                    C7573i.m23583a("mViewPager");
                }
                if (num.intValue() != viewPager.getCurrentItem()) {
                    ViewPager viewPager2 = this.f71262g;
                    if (viewPager2 == null) {
                        C7573i.m23583a("mViewPager");
                    }
                    viewPager2.setCurrentItem(num.intValue(), false);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69779a(int i) {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f71264i;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("mIntermediateViewModel");
        }
        searchIntermediateViewModel.getSearchTabIndex().setValue(Integer.valueOf(i));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C0063u a = C0069x.m159a(activity).mo147a(SearchIntermediateViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders\n     …ateViewModel::class.java)");
        this.f71264i = (SearchIntermediateViewModel) a;
    }

    /* renamed from: a */
    private final void m88730a(View view) {
        View findViewById = view.findViewById(R.id.edp);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.viewpager)");
        this.f71262g = (ViewPager) findViewById;
        View findViewById2 = view.findViewById(R.id.dfo);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.tab_layout)");
        this.f71261f = (CommonTabLayout) findViewById2;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        mo69778a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.r8, viewGroup, false);
        C7573i.m23582a((Object) inflate, "root");
        m88730a(inflate);
        m88731f();
        m88732g();
        m88733i();
        return inflate;
    }
}
