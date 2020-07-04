package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.C10830c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10820c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.app.C22898bh;
import com.p280ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchPagerAdapter;
import com.p280ss.android.ugc.aweme.discover.mob.C26806y;
import com.p280ss.android.ugc.aweme.discover.mob.C26807z;
import com.p280ss.android.ugc.aweme.discover.mob.SearchContext;
import com.p280ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p280ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p280ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.p280ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26583j;
import com.p280ss.android.ugc.aweme.discover.p1185ui.p1186a.C26994a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.p1186a.C26995b;
import com.p280ss.android.ugc.aweme.p1042as.C23089a.C23090a;
import com.p280ss.android.ugc.aweme.search.C37380c;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParamProvider.C37387a;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchContainerFragment */
public class SearchContainerFragment extends AmeBaseFragment {

    /* renamed from: e */
    public SearchResultParam f71098e;

    /* renamed from: f */
    public int f71099f;

    /* renamed from: g */
    public C10820c f71100g;

    /* renamed from: h */
    private ViewGroup f71101h;

    /* renamed from: i */
    private ViewPager f71102i;

    /* renamed from: j */
    private SearchPagerAdapter<SearchBaseFragment> f71103j;

    /* renamed from: k */
    private DmtTabLayout f71104k;

    /* renamed from: l */
    private ViewGroup f71105l;

    /* renamed from: m */
    private C27031bb f71106m;

    /* renamed from: n */
    private C0935e f71107n;

    /* renamed from: o */
    private AnalysisStayTimeFragmentComponent f71108o;

    /* renamed from: p */
    private SearchIntermediateViewModel f71109p;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: i */
    private String m88493i() {
        if (this.f71098e != null) {
            return this.f71098e.getKeyword();
        }
        return "";
    }

    /* renamed from: a */
    public final int mo69660a() {
        if (this.f71102i != null) {
            return this.f71102i.getCurrentItem();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo69668d() {
        if (this.f71104k != null) {
            C10830c.m31774a(this.f71104k);
        }
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("search");
    }

    public void onStop() {
        super.onStop();
        mo69667c(this.f71099f);
    }

    /* renamed from: f */
    private void m88491f() {
        if (C37380c.m119974a()) {
            this.f71109p.getSearchTabIndex().observe(this, new C27018as(this));
        }
    }

    public void onResume() {
        super.onResume();
        SearchTabJumpCenter.INSTANCE.setSearchTabViewModel((SearchTabViewModel) C0069x.m159a(getActivity()).mo147a(SearchTabViewModel.class));
    }

    /* renamed from: g */
    private void m88492g() {
        if (isViewValid()) {
            for (SearchBaseFragment c : this.f71103j.mo67982a()) {
                c.mo69655c(this.f71098e);
            }
        }
    }

    /* renamed from: e */
    private void m88490e() {
        this.f71104k.setCustomTabViewResId(R.layout.a2t);
        this.f71104k.setupWithViewPager(this.f71102i);
        this.f71104k.mo26058a((C10820c) new C10820c() {
            /* renamed from: b */
            public final void mo26116b(C10825f fVar) {
                boolean z;
                int i = fVar.f29291e;
                C23090a.f60959a = C26806y.m88006d(i);
                SearchContainerFragment.this.mo69667c(SearchContainerFragment.this.f71099f);
                SearchContainerFragment.this.f71098e.setIndex(i);
                SearchContainerFragment.this.f71099f = i;
                SearchContainerFragment.this.mo69665b(i);
                if (i == C27029ba.f71319a) {
                    z = true;
                } else {
                    z = false;
                }
                C26994a.m88750a(z);
            }
        });
        if (this.f71100g != null) {
            this.f71104k.mo26058a(this.f71100g);
        }
        this.f71104k.setTabMode(0);
        this.f71104k.setAutoFillWhenScrollable(true);
        this.f71104k.mo26056a(C23486n.m77122a(16.0d), 0, C23486n.m77122a(16.0d), 0);
        this.f71104k.post(new C27017ar(this));
    }

    /* renamed from: b */
    public final void mo69665b(int i) {
        this.f71109p.getSearchTabIndex().setValue(Integer.valueOf(i));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f71108o = new AnalysisStayTimeFragmentComponent(this, true);
    }

    /* renamed from: a */
    public static SearchContainerFragment m88488a(SearchResultParam searchResultParam) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("search_param", searchResultParam);
        SearchContainerFragment searchContainerFragment = new SearchContainerFragment();
        searchContainerFragment.setArguments(bundle);
        return searchContainerFragment;
    }

    /* renamed from: c */
    public final void mo69667c(int i) {
        if (i >= 0) {
            Fragment b = this.f71103j.mo67983b(i);
            if (b instanceof SearchFragment) {
                C26807z.f70733a.mo68589a(((SearchFragment) b).mo68437k(), m88493i());
            }
        }
    }

    @C7709l
    public void onSearchPreventSuicideEvent(SearchPreventSuicide searchPreventSuicide) {
        this.f71106m = new C27031bb(getActivity(), this.f71105l);
        this.f71106m.mo69804a(searchPreventSuicide);
    }

    @C7709l
    public void onSearchViewAllEvent(C26583j jVar) {
        if (this.f71102i != null) {
            SearchContext.m87925a(true);
            SearchContext.m87928b(true);
            this.f71102i.setCurrentItem(jVar.f70108a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo69661a(C22898bh bhVar) {
        this.f71102i.setCurrentItem(C27029ba.m88790a(bhVar.f60616a));
        return null;
    }

    /* renamed from: b */
    public final void mo69666b(SearchResultParam searchResultParam) {
        this.f71098e = searchResultParam;
        if (isViewValid()) {
            C37387a.m119991a(getContext(), searchResultParam);
            this.f71103j.mo68065a(this.f71098e);
            if (this.f71106m != null) {
                this.f71106m.mo69803a();
            }
            m88492g();
        }
    }

    @C7709l
    public void onChangeBgColorEvent(C26995b bVar) {
        if (!bVar.f71279b) {
            if (this.f71101h != null) {
                this.f71101h.setBackground(null);
            }
        } else if (this.f71101h != null) {
            this.f71101h.setBackgroundColor(getContext().getResources().getColor(R.color.a3z));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f71098e == null && getArguments() != null) {
            this.f71098e = (SearchResultParam) getArguments().getSerializable("search_param");
            C37387a.m119991a(getActivity(), this.f71098e);
        }
        this.f71109p = (SearchIntermediateViewModel) C0069x.m159a(getActivity()).mo147a(SearchIntermediateViewModel.class);
    }

    /* renamed from: a */
    private void m88489a(View view) {
        int i;
        this.f71103j = new SearchPagerAdapter<>(getChildFragmentManager(), getContext());
        this.f71103j.mo68065a(this.f71098e);
        this.f71102i = (ViewPager) view.findViewById(R.id.eds);
        ViewPager viewPager = this.f71102i;
        if (C7213d.m22500a().mo18751aN()) {
            i = 0;
        } else {
            i = 6;
        }
        viewPager.setOffscreenPageLimit(i);
        this.f71102i.setAdapter(this.f71103j);
        if (this.f71107n != null) {
            this.f71102i.addOnPageChangeListener(this.f71107n);
        }
        this.f71105l = (ViewGroup) view.findViewById(R.id.bjn);
        this.f71104k = (DmtTabLayout) view.findViewById(R.id.dfo);
        m88490e();
        m88491f();
        if (this.f71098e != null) {
            int intermediatePageIndex = this.f71098e.getIntermediatePageIndex();
            if (intermediatePageIndex > 0) {
                this.f71102i.setCurrentItem(intermediatePageIndex, false);
            }
        }
        this.f71101h = (ViewGroup) view.findViewById(R.id.bjl);
    }

    /* renamed from: a */
    public final void mo69662a(int i) {
        if (this.f71102i != null) {
            this.f71102i.setCurrentItem(0);
        }
    }

    /* renamed from: a */
    public final void mo69663a(C0935e eVar) {
        this.f71107n = eVar;
        if (this.f71102i != null) {
            this.f71102i.addOnPageChangeListener(eVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo69664a(Integer num) {
        if (num != null && num.intValue() != mo69660a()) {
            this.f71102i.setCurrentItem(num.intValue(), false);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m88489a(view);
        SearchTabViewModel.addObserver(view, this, new C27016aq(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.qn, viewGroup, false);
    }
}
