package com.p280ss.android.ugc.aweme.discover.presenter;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.C0598c;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.base.C23279c.C23280a;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.discover.abtest.GuideSearchUIOptimization;
import com.p280ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p280ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p280ss.android.ugc.aweme.discover.p1185ui.GuideSearchBar;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchOriginalFragment;
import com.p280ss.android.ugc.aweme.feed.adapter.CellFeedAdapter;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoShowTypeExperiment;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.listener.C28533o;
import com.p280ss.android.ugc.aweme.feed.listener.OnGradualScrollListener;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.feed.panel.C28593ag;
import com.p280ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.search.filter.FilterOption;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.common.component.fragment.C43676b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.SearchFeedFragment */
public class SearchFeedFragment extends SearchOriginalFragment<Aweme> implements C23685d, C6905a, C25675c<Aweme>, C28532n, C28533o {

    /* renamed from: H */
    private C26823f f70747H;

    /* renamed from: J */
    private HashMap f70748J;

    /* renamed from: e */
    public CellFeedFragmentPanel f70749e = m88029O();

    /* renamed from: com.ss.android.ugc.aweme.discover.presenter.SearchFeedFragment$a */
    static final class C26808a implements C23386b {

        /* renamed from: a */
        final /* synthetic */ SearchFeedFragment f70750a;

        C26808a(SearchFeedFragment searchFeedFragment) {
            this.f70750a = searchFeedFragment;
        }

        /* renamed from: a */
        public final void mo60744a() {
            this.f70750a.mo69672A();
            this.f70750a.mo68431a(1, (FilterOption) null);
            this.f70750a.mo69678I();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.presenter.SearchFeedFragment$b */
    static final class C26809b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchFeedFragment f70751a;

        /* renamed from: b */
        final /* synthetic */ List f70752b;

        /* renamed from: c */
        final /* synthetic */ boolean f70753c;

        C26809b(SearchFeedFragment searchFeedFragment, List list, boolean z) {
            this.f70751a = searchFeedFragment;
            this.f70752b = list;
            this.f70753c = z;
        }

        public final void run() {
            CellFeedFragmentPanel cellFeedFragmentPanel = this.f70751a.f70749e;
            if (cellFeedFragmentPanel == null) {
                C7573i.m23580a();
            }
            cellFeedFragmentPanel.mo59099a(this.f70752b, this.f70753c);
            if (C6399b.m19945u()) {
                this.f70751a.mo69694c(false);
            }
        }
    }

    /* renamed from: P */
    private static String m88030P() {
        return "search_result";
    }

    /* renamed from: R */
    private static String m88032R() {
        return "";
    }

    /* renamed from: S */
    private static String m88033S() {
        return "from_search";
    }

    /* renamed from: a */
    public final View mo68429a(int i) {
        if (this.f70748J == null) {
            this.f70748J = new HashMap();
        }
        View view = (View) this.f70748J.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f70748J.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo68433a(String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
    }

    public final void aP_() {
        bd_();
    }

    /* renamed from: b_ */
    public final boolean mo68435b_(boolean z) {
        return false;
    }

    /* renamed from: g */
    public final void mo68430g() {
        if (this.f70748J != null) {
            this.f70748J.clear();
        }
    }

    /* renamed from: j */
    public final void mo68436j() {
    }

    /* renamed from: k */
    public final String mo68437k() {
        return "video";
    }

    /* renamed from: p */
    public final void mo69468p() {
        super.mo69468p();
        mo69680K();
    }

    /* renamed from: Q */
    private int m88031Q() {
        if (m88035U()) {
            return 15;
        }
        return 9;
    }

    /* renamed from: o */
    public final boolean mo68441o() {
        if (m88035U()) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private final void m88034T() {
        String str;
        C26823f fVar = this.f70747H;
        if (fVar != null) {
            if (this.f71093l == 9) {
                str = "guide_search";
            } else {
                str = "video_search";
            }
            fVar.f70777c = str;
        }
    }

    /* renamed from: U */
    private static boolean m88035U() {
        if (C6384b.m19835a().mo15287a(VideoShowTypeExperiment.class, true, "video_search_show_style", C6384b.m19835a().mo15295d().video_search_show_style, 0) == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final SparseArray<C43676b> mo16932C() {
        SparseArray<C43676b> C = super.mo16932C();
        C7573i.m23582a((Object) C, "super.registerComponents()");
        C.append(C23280a.f61313b, this.f70749e);
        return C;
    }

    public final boolean aR_() {
        C26826h hVar = (C26826h) mo69749N().mo66539h();
        if (hVar != null) {
            return hVar.isHasMore();
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (mo69749N() != null) {
            mo69749N().mo59134U_();
        }
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f70749e;
        if (cellFeedFragmentPanel == null) {
            C7573i.m23580a();
        }
        cellFeedFragmentPanel.mo67634n();
        mo68430g();
    }

    /* renamed from: O */
    private CellFeedFragmentPanel m88029O() {
        if (this.f70749e == null) {
            if (m88035U()) {
                this.f70749e = new C28593ag(m88030P(), this, this, m88031Q());
            } else {
                this.f70749e = new CellFeedFragmentPanel(m88030P(), this, this, m88031Q());
            }
        }
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f70749e;
        if (cellFeedFragmentPanel == null) {
            C7573i.m23580a();
        }
        return cellFeedFragmentPanel;
    }

    /* renamed from: n */
    public final void mo68440n() {
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f70749e;
        if (cellFeedFragmentPanel == null) {
            C7573i.m23580a();
        }
        CellFeedAdapter g = cellFeedFragmentPanel.mo73299g();
        C7573i.m23582a((Object) g, "mFragmentPanel!!.cellFeedAdapter");
        mo69686a((BaseAdapter<D>) g);
        CellFeedFragmentPanel cellFeedFragmentPanel2 = this.f70749e;
        if (cellFeedFragmentPanel2 == null) {
            C7573i.m23580a();
        }
        HeaderAndFooterWrapper headerAndFooterWrapper = cellFeedFragmentPanel2.f75264e;
        C7573i.m23582a((Object) headerAndFooterWrapper, "mFragmentPanel!!.cellFeedAdapterWrapper");
        mo69687a(headerAndFooterWrapper);
    }

    /* renamed from: m */
    public final void mo68439m() {
        mo69750a((C26827i<?>) new C26825g<Object>());
        mo69749N().mo66537a(this);
        mo69749N().f70793d = this;
        mo69749N().mo66568a((C25676d) this.f70749e);
        this.f70747H = new C26823f();
        C26827i N = mo69749N();
        if (N != null) {
            ((C26825g) N).mo66536a(this.f70747H);
            m88034T();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchAwemePresenter");
    }

    /* renamed from: a */
    public final void mo69465a(SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "param");
        super.mo69465a(searchResultParam);
        m88034T();
    }

    /* renamed from: b */
    public final void mo69467b(int i) {
        mo69749N().mo56976a(Integer.valueOf(1), this.f71090i, Integer.valueOf(i), Integer.valueOf(this.f71097p), mo69659q());
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f70749e;
        if (cellFeedFragmentPanel == null) {
            C7573i.m23580a();
        }
        cellFeedFragmentPanel.mo67627f(z);
        if (!z) {
            CellFeedFragmentPanel cellFeedFragmentPanel2 = this.f70749e;
            if (cellFeedFragmentPanel2 == null) {
                C7573i.m23580a();
            }
            cellFeedFragmentPanel2.mo73307k();
            return;
        }
        CellFeedFragmentPanel cellFeedFragmentPanel3 = this.f70749e;
        if (cellFeedFragmentPanel3 == null) {
            C7573i.m23580a();
        }
        cellFeedFragmentPanel3.mo73306j();
    }

    /* renamed from: a */
    public final void mo69466a(List<GuideSearchWord> list) {
        if (isViewValid()) {
            if (C10292j.m30480a().mo25012a(GuideSearchUIOptimization.class, "search_new_gs_style", C6384b.m19835a().mo15294c().getSearchNewGsStyle()) == 1) {
                QueryCorrectInfo queryCorrectInfo = null;
                if (mo69749N() instanceof C26825g) {
                    C26827i N = mo69749N();
                    if (N != null) {
                        C26826h hVar = (C26826h) N.mo66539h();
                        if (hVar != null) {
                            queryCorrectInfo = hVar.mo69491d();
                        }
                    }
                }
                if (queryCorrectInfo != null) {
                    GuideSearchBar guideSearchBar = this.f71112A;
                    if (guideSearchBar != null) {
                        guideSearchBar.mo69586a(list, this.f71090i, mo68437k());
                    }
                }
            }
            if (this.f71088g != null) {
                SearchResultParam searchResultParam = this.f71088g;
                if (searchResultParam == null) {
                    C7573i.m23580a();
                }
                if (searchResultParam.fromGuideSearch() && C10292j.m30480a().mo25012a(GuideSearchUIOptimization.class, "search_new_gs_style", C6384b.m19835a().mo15294c().getSearchNewGsStyle()) == 1) {
                    return;
                }
            }
            if (C6307b.m19566a((Collection<T>) list)) {
                GuideSearchBar guideSearchBar2 = this.f71112A;
                if (guideSearchBar2 != null) {
                    guideSearchBar2.mo69586a(list, this.f71090i, mo68437k());
                }
            } else {
                if (this.f71112A == null) {
                    this.f71112A = new GuideSearchBar(mo69701v());
                }
                GuideSearchBar guideSearchBar3 = this.f71112A;
                if (guideSearchBar3 != null) {
                    guideSearchBar3.mo69586a(list, this.f71090i, mo68437k());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f70749e;
        if (cellFeedFragmentPanel == null) {
            C7573i.m23580a();
        }
        cellFeedFragmentPanel.mo73304a(z);
    }

    /* renamed from: a */
    public final void mo68431a(int i, FilterOption filterOption) {
        super.mo68431a(i, filterOption);
        if (filterOption == null) {
            mo69703x();
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<? extends Aweme> list, boolean z) {
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f70749e;
        if (cellFeedFragmentPanel == null) {
            C7573i.m23580a();
        }
        cellFeedFragmentPanel.mo59108b(list, z);
    }

    /* renamed from: c */
    public final void mo59110c(List<? extends Aweme> list, boolean z) {
        C7573i.m23587b(list, "list");
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f70749e;
        if (cellFeedFragmentPanel == null) {
            C7573i.m23580a();
        }
        cellFeedFragmentPanel.mo59108b(list, z);
    }

    /* renamed from: a */
    public final void mo59099a(List<? extends Aweme> list, boolean z) {
        C7573i.m23587b(list, "list");
        if (isViewValid()) {
            RecyclerView r = mo69697r();
            if (r != null) {
                r.post(new C26809b(this, list, z));
            }
            mo69698s().mo25939d();
            mo69680K();
            mo68434b(true);
        }
    }

    /* renamed from: a */
    public final void mo68432a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        mo69674D();
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f70749e;
        if (cellFeedFragmentPanel == null) {
            C7573i.m23580a();
        }
        cellFeedFragmentPanel.mo67605a(view, bundle);
        mo68440n();
        mo69704y().f67550q = getResources().getColor(R.color.a53);
        CellFeedFragmentPanel cellFeedFragmentPanel2 = this.f70749e;
        if (cellFeedFragmentPanel2 == null) {
            C7573i.m23580a();
        }
        cellFeedFragmentPanel2.f75273l = m88031Q();
        CellFeedFragmentPanel cellFeedFragmentPanel3 = this.f70749e;
        if (cellFeedFragmentPanel3 == null) {
            C7573i.m23580a();
        }
        cellFeedFragmentPanel3.mo73293a((C1281m) new OnGradualScrollListener());
        CellFeedFragmentPanel cellFeedFragmentPanel4 = this.f70749e;
        if (cellFeedFragmentPanel4 == null) {
            C7573i.m23580a();
        }
        cellFeedFragmentPanel4.mo73294a((C6905a) this);
        CellFeedFragmentPanel cellFeedFragmentPanel5 = this.f70749e;
        if (cellFeedFragmentPanel5 == null) {
            C7573i.m23580a();
        }
        cellFeedFragmentPanel5.f75269h = this;
        CellFeedFragmentPanel cellFeedFragmentPanel6 = this.f70749e;
        if (cellFeedFragmentPanel6 == null) {
            C7573i.m23580a();
        }
        cellFeedFragmentPanel6.mo73303a(m88032R());
        mo69699t().setOnRefreshListener(new C26808a(this));
        if (mo68441o()) {
            mo69697r().setPadding(0, (int) C9738o.m28708b(mo69697r().getContext(), 8.0f), 0, 0);
            mo69697r().setClipToPadding(false);
        }
    }

    /* renamed from: a */
    public final void mo61615a(View view, Aweme aweme, String str) {
        C7573i.m23587b(view, "view");
        C7573i.m23587b(str, "label");
        if (!(C27326a.m89578a(view) || aweme == null || getActivity() == null)) {
            C26826h hVar = (C26826h) mo69749N().mo66539h();
            if (hVar != null) {
                C28503s.m93679a((C25673a) hVar);
                Bundle bundle = new Bundle();
                bundle.putString("id", aweme.getAid());
                bundle.putString("refer", str);
                bundle.putString("video_from", m88033S());
                bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                bundle.putInt("page_type", m88031Q());
                bundle.putString("search_keyword", this.f71090i);
                C0598c b = C0598c.m2487b(view, 0, 0, view.getWidth(), view.getHeight());
                C7573i.m23582a((Object) b, "ActivityOptionsCompat.ma… view.width, view.height)");
                SmartRouter.buildRoute((Context) getActivity(), "//aweme/detail").withParam(bundle).withBundleAnimation(b.mo2580a()).open();
                C28229b.m92772a(aweme);
                C26780aa.m87959a(view, m88030P(), aweme);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
            }
        }
    }
}
