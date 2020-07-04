package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.HotSearchWordViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchSugAdapter;
import com.p280ss.android.ugc.aweme.discover.adapter.viewholder.TwoColumnViewHolder;
import com.p280ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.SearchHistoryLastDelegate.HistoryLast;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.mob.C26806y;
import com.p280ss.android.ugc.aweme.discover.mob.p1183a.C26777b;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p280ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p280ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.p280ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.p280ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26580g;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27014c;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27011ap.C27015d;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.discover.presenter.C26817d.C26818a;
import com.p280ss.android.ugc.aweme.discover.presenter.C26841r;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.lego.lazy.LazyFragmentPagerAdapter.C32338a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.search.C37380c;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateFragment */
public abstract class SearchIntermediateFragment<SuggestType> extends AmeBaseFragment implements C26818a, C27014c, C27015d, C32338a {

    /* renamed from: k */
    static final /* synthetic */ C7595j[] f71154k = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchIntermediateFragment.class), "mSearchSquareAdapter", "getMSearchSquareAdapter()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchIntermediateFragment.class), "mSearchSugAdapter", "getMSearchSugAdapter()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSugAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchIntermediateFragment.class), "mHistoryManager", "getMHistoryManager()Lcom/ss/android/ugc/aweme/discover/model/SearchHistoryManager;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchIntermediateFragment.class), "mSearchHistories", "getMSearchHistories()Ljava/util/ArrayList;"))};

    /* renamed from: p */
    public static final C26951a f71155p = new C26951a(null);

    /* renamed from: e */
    private final C7541d f71156e = C27021av.m88777a(new C26954d(this));

    /* renamed from: f */
    private final C7541d f71157f = C27021av.m88777a(new C26955e(this));

    /* renamed from: g */
    private final C7541d f71158g = C27021av.m88777a(C26952b.f71170a);

    /* renamed from: h */
    private final C7541d f71159h = C27021av.m88777a(C26953c.f71171a);

    /* renamed from: i */
    private C26841r f71160i;

    /* renamed from: j */
    private int f71161j;

    /* renamed from: l */
    protected HeaderAndFooterWrapper f71162l;

    /* renamed from: m */
    protected RecyclerView f71163m;

    /* renamed from: n */
    protected SearchIntermediateViewModel f71164n;

    /* renamed from: o */
    public String f71165o;

    /* renamed from: q */
    private Fragment f71166q;

    /* renamed from: r */
    private HashMap f71167r;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateFragment$SimpleItemDecoration */
    public static final class SimpleItemDecoration extends C1272h {

        /* renamed from: a */
        public static final C26950a f71168a = new C26950a(null);

        /* renamed from: b */
        private final Drawable f71169b;

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateFragment$SimpleItemDecoration$a */
        public static final class C26950a {
            private C26950a() {
            }

            public /* synthetic */ C26950a(C7571f fVar) {
                this();
            }
        }

        public SimpleItemDecoration(Drawable drawable) {
            C7573i.m23587b(drawable, "drawable");
            this.f71169b = drawable;
        }

        public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
            C7573i.m23587b(canvas, "c");
            C7573i.m23587b(recyclerView, "parent");
            C7573i.m23587b(sVar, "state");
            if (recyclerView.getChildCount() >= 2) {
                C1273i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int l = linearLayoutManager.mo5447l();
                    C1293v f = recyclerView.mo5575f(l);
                    if ((f instanceof HotSearchWordViewHolder) || (f instanceof GuessWordsViewHolder) || (f instanceof TwoColumnViewHolder)) {
                        int j = (l - linearLayoutManager.mo5445j()) - 1;
                        if (j >= 0) {
                            recyclerView.getPaddingLeft();
                            C9738o.m28708b(recyclerView.getContext(), 16.0f);
                            recyclerView.getWidth();
                            recyclerView.getPaddingRight();
                            C9738o.m28708b(recyclerView.getContext(), 16.0f);
                            View childAt = recyclerView.getChildAt(j);
                            C7573i.m23582a((Object) childAt, "target");
                            LayoutParams layoutParams = childAt.getLayoutParams();
                            if (layoutParams != null) {
                                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                                childAt.getBottom();
                                int i = layoutParams2.bottomMargin;
                                this.f71169b.getIntrinsicHeight();
                                this.f71169b.draw(canvas);
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
                        }
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
            C7573i.m23587b(rect, "outRect");
            C7573i.m23587b(view, "view");
            C7573i.m23587b(recyclerView, "parent");
            C7573i.m23587b(sVar, "state");
            rect.set(0, 0, 0, this.f71169b.getIntrinsicHeight());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateFragment$a */
    public static final class C26951a {
        private C26951a() {
        }

        public /* synthetic */ C26951a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateFragment$b */
    static final class C26952b extends Lambda implements C7561a<SearchHistoryManager> {

        /* renamed from: a */
        public static final C26952b f71170a = new C26952b();

        C26952b() {
            super(0);
        }

        /* renamed from: a */
        private static SearchHistoryManager m88634a() {
            return SearchHistoryManager.inst();
        }

        public final /* synthetic */ Object invoke() {
            return m88634a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateFragment$c */
    static final class C26953c extends Lambda implements C7561a<ArrayList<SearchHistory>> {

        /* renamed from: a */
        public static final C26953c f71171a = new C26953c();

        C26953c() {
            super(0);
        }

        /* renamed from: a */
        private static ArrayList<SearchHistory> m88635a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m88635a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateFragment$d */
    static final class C26954d extends Lambda implements C7561a<SearchSquareAdapter<SuggestType>> {

        /* renamed from: a */
        final /* synthetic */ SearchIntermediateFragment f71172a;

        C26954d(SearchIntermediateFragment searchIntermediateFragment) {
            this.f71172a = searchIntermediateFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SearchSquareAdapter<SuggestType> invoke() {
            SearchSquareAdapter<SuggestType> searchSquareAdapter = new SearchSquareAdapter<>(this.f71172a);
            this.f71172a.mo69712a(new HeaderAndFooterWrapper(searchSquareAdapter));
            return searchSquareAdapter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateFragment$e */
    static final class C26955e extends Lambda implements C7561a<SearchSugAdapter> {

        /* renamed from: a */
        final /* synthetic */ SearchIntermediateFragment f71173a;

        C26955e(SearchIntermediateFragment searchIntermediateFragment) {
            this.f71173a = searchIntermediateFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SearchSugAdapter invoke() {
            FragmentActivity activity = this.f71173a.getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            return new SearchSugAdapter(activity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateFragment$f */
    static final class C26956f<T> implements C0053p<String> {

        /* renamed from: a */
        final /* synthetic */ SearchIntermediateFragment f71174a;

        C26956f(SearchIntermediateFragment searchIntermediateFragment) {
            this.f71174a = searchIntermediateFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(String str) {
            this.f71174a.f71165o = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateFragment$g */
    static final class C26957g<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ SearchIntermediateFragment f71175a;

        C26957g(SearchIntermediateFragment searchIntermediateFragment) {
            this.f71175a = searchIntermediateFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            this.f71175a.mo69726s();
        }
    }

    /* renamed from: g */
    private final SearchSugAdapter mo69577g() {
        return (SearchSugAdapter) this.f71157f.getValue();
    }

    /* renamed from: i */
    private final ArrayList<SearchHistory> mo69578i() {
        return (ArrayList) this.f71159h.getValue();
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public abstract String mo69547a();

    /* renamed from: d */
    public abstract int mo69549d();

    /* renamed from: f */
    public void mo69551f() {
        if (this.f71167r != null) {
            this.f71167r.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final SearchSquareAdapter<SuggestType> mo69721o() {
        return (SearchSquareAdapter) this.f71156e.getValue();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69551f();
    }

    /* renamed from: j */
    private final boolean mo69579j() {
        RecyclerView recyclerView = this.f71163m;
        if (recyclerView == null) {
            C7573i.m23583a("mListView");
        }
        return recyclerView.getAdapter() instanceof HeaderAndFooterWrapper;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final HeaderAndFooterWrapper mo69719m() {
        HeaderAndFooterWrapper headerAndFooterWrapper = this.f71162l;
        if (headerAndFooterWrapper == null) {
            C7573i.m23583a("mHeaderAndFooterWrapper");
        }
        return headerAndFooterWrapper;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final RecyclerView mo69720n() {
        RecyclerView recyclerView = this.f71163m;
        if (recyclerView == null) {
            C7573i.m23583a("mListView");
        }
        return recyclerView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final SearchIntermediateViewModel mo69723p() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f71164n;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("mIntermediateViewModel");
        }
        return searchIntermediateViewModel;
    }

    /* renamed from: v */
    private final List<SearchHistory> m88607v() {
        int d = mo69549d();
        if (this instanceof SingleIntermediateFragment) {
            d = Integer.MIN_VALUE;
        }
        List<SearchHistory> searchHistoryByType = SearchHistoryManager.inst().getSearchHistoryByType(SearchHistory.toHistoryType(d));
        C7573i.m23582a((Object) searchHistoryByType, "SearchHistoryManager.ins…istoryByType(historyType)");
        return searchHistoryByType;
    }

    /* renamed from: w */
    private final void m88608w() {
        C22984d a = C22984d.m75611a().mo59973a("action_type", "show");
        C7573i.m23582a((Object) a, "EventMapBuilder.newBuild…ION_TYPE, Mob.Value.SHOW)");
        C6907h.m21524a("search_history", (Map) m88595a(a).f60753a);
    }

    /* renamed from: x */
    private final void m88609x() {
        C22984d a = C22984d.m75611a().mo59973a("action_type", "show_all");
        C7573i.m23582a((Object) a, "EventMapBuilder.newBuild…TYPE, Mob.Value.SHOW_ALL)");
        C6907h.m21524a("search_history", (Map) m88595a(a).f60753a);
    }

    /* renamed from: y */
    private final void m88610y() {
        C22984d a = C22984d.m75611a().mo59973a("action_type", "clear_all");
        C7573i.m23582a((Object) a, "EventMapBuilder.newBuild…YPE, Mob.Value.CLEAR_ALL)");
        C6907h.m21524a("search_history", (Map) m88595a(a).f60753a);
    }

    /* renamed from: c */
    public final void mo69717c() {
        m88609x();
        mo69721o().mo68074a((List<? extends SearchHistory>) mo69578i(), HistoryLast.TYPE_CLEAR_ALL);
    }

    /* renamed from: q */
    public void mo69724q() {
        mo69721o().mo68072a((C27014c) this);
        mo69577g().f69805b = this;
    }

    /* renamed from: r */
    public void mo69725r() {
        this.f71160i = new C26841r();
        C26841r rVar = this.f71160i;
        if (rVar == null) {
            C7573i.m23583a("mSugPresenter");
        }
        rVar.mo66537a(this);
    }

    /* renamed from: A */
    private final String m88594A() {
        if (getActivity() instanceof DiscoverActivity) {
            return "discovery";
        }
        if (C37385g.f97617a.isSearchResultActivity(getActivity())) {
            return C26806y.m88003a(mo69549d());
        }
        return null;
    }

    /* renamed from: z */
    private final void m88611z() {
        C22984d a = C22984d.m75611a().mo59973a("action_type", "show").mo59973a("sug_keyword", this.f71165o).mo59973a("log_pb", C28199ae.m92689a().mo71791a(mo69577g().f69804a));
        C7573i.m23582a((Object) a, "EventMapBuilder.newBuild…am(Mob.Key.LOG_PB, logPb)");
        C6907h.m21524a("search_sug", (Map) m88595a(a).f60753a);
    }

    /* renamed from: b */
    public final void mo69478b() {
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            if (!activity.isFinishing()) {
                Context context = getContext();
                Context context2 = getContext();
                if (context2 == null) {
                    C7573i.m23580a();
                }
                C10761a.m31403c(context, context2.getString(R.string.c61)).mo25750a();
            }
        }
    }

    /* renamed from: e */
    public void mo69550e() {
        C27064b.m88839b().put(C27064b.m88831a(), Long.valueOf(System.currentTimeMillis()));
        boolean d = C26654b.m87576d();
        if (d) {
            mo69727t();
        } else {
            mo69580k();
        }
        C27064b.m88840b(d);
        this.f71161j = 1;
    }

    /* renamed from: l */
    public final void mo69718l() {
        m88610y();
        if (C37380c.m119974a()) {
            SearchHistoryManager.inst().clearSearchHistory(SearchHistory.toHistoryType(mo69549d()));
        } else {
            SearchHistoryManager.inst().clearSearchHistory();
        }
    }

    /* renamed from: k */
    private void mo69580k() {
        mo69578i().clear();
        mo69578i().addAll(m88607v());
        mo69721o().mo68075a((List<? extends SearchHistory>) mo69578i(), true);
        RecyclerView recyclerView = this.f71163m;
        if (recyclerView == null) {
            C7573i.m23583a("mListView");
        }
        HeaderAndFooterWrapper headerAndFooterWrapper = this.f71162l;
        if (headerAndFooterWrapper == null) {
            C7573i.m23583a("mHeaderAndFooterWrapper");
        }
        recyclerView.setAdapter(headerAndFooterWrapper);
        if (!mo69578i().isEmpty()) {
            m88608w();
        }
    }

    /* renamed from: u */
    private void mo69777u() {
        Fragment fragment;
        RecyclerView recyclerView = this.f71163m;
        if (recyclerView == null) {
            C7573i.m23583a("mListView");
        }
        recyclerView.setAdapter(mo69577g());
        C26841r rVar = this.f71160i;
        if (rVar == null) {
            C7573i.m23583a("mSugPresenter");
        }
        rVar.mo69502a(this.f71165o, C26806y.m88005c(mo69549d()));
        this.f71161j = 2;
        if (C26654b.m87576d()) {
            if (this.f71166q == null) {
                C0612l lVar = this.mFragmentManager;
                if (lVar != null) {
                    fragment = lVar.mo2644a("RNtag_intermediate");
                } else {
                    fragment = null;
                }
                this.f71166q = fragment;
            }
            if (this.f71166q != null) {
                C0612l lVar2 = this.mFragmentManager;
                if (lVar2 != null) {
                    C0633q a = lVar2.mo2645a();
                    Fragment fragment2 = this.f71166q;
                    if (fragment2 == null) {
                        C7573i.m23580a();
                    }
                    a.mo2601b(fragment2).mo2604c();
                }
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f71161j != 0) {
            if (mo69579j() && mo69578i().size() > 0) {
                m88608w();
            }
            RecyclerView recyclerView = this.f71163m;
            if (recyclerView == null) {
                C7573i.m23583a("mListView");
            }
            if (recyclerView.getAdapter() instanceof SearchSugAdapter) {
                RecyclerView recyclerView2 = this.f71163m;
                if (recyclerView2 == null) {
                    C7573i.m23583a("mListView");
                }
                C1262a adapter = recyclerView2.getAdapter();
                if (adapter == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchSugAdapter");
                } else if (((SearchSugAdapter) adapter).getItemCount() > 0) {
                    m88611z();
                }
            }
        }
    }

    /* renamed from: s */
    public boolean mo69726s() {
        if (!isViewValid() || !this.mUserVisibleHint) {
            return false;
        }
        SearchIntermediateViewModel searchIntermediateViewModel = this.f71164n;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("mIntermediateViewModel");
        }
        Integer num = (Integer) searchIntermediateViewModel.getIntermediateState().getValue();
        if (num == null) {
            return false;
        }
        if (num.intValue() == 1) {
            mo69550e();
        } else if (num.intValue() == 2) {
            mo69777u();
        } else if (num.intValue() == 0) {
            this.f71161j = 0;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo69727t() {
        Fragment fragment;
        C0633q qVar;
        C0612l lVar = this.mFragmentManager;
        if (lVar != null) {
            fragment = lVar.mo2644a("RNtag_intermediate");
        } else {
            fragment = null;
        }
        this.f71166q = fragment;
        if (this.f71166q == null) {
            this.f71166q = new RNSingleIntermediateFragment();
            C0612l lVar2 = this.mFragmentManager;
            if (lVar2 != null) {
                qVar = lVar2.mo2645a();
            } else {
                qVar = null;
            }
            if (qVar != null) {
                Fragment fragment2 = this.f71166q;
                if (fragment2 == null) {
                    C7573i.m23580a();
                }
                qVar.mo2600b(R.id.cvg, fragment2, "RNtag_intermediate").mo2606d();
            }
        }
        C0612l lVar3 = this.mFragmentManager;
        if (lVar3 != null) {
            C0633q a = lVar3.mo2645a();
            Fragment fragment3 = this.f71166q;
            if (fragment3 == null) {
                C7573i.m23580a();
            }
            a.mo2605c(fragment3).mo2604c();
        }
        RecyclerView recyclerView = this.f71163m;
        if (recyclerView == null) {
            C7573i.m23583a("mListView");
        }
        recyclerView.setAdapter(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69712a(HeaderAndFooterWrapper headerAndFooterWrapper) {
        C7573i.m23587b(headerAndFooterWrapper, "<set-?>");
        this.f71162l = headerAndFooterWrapper;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            mo69726s();
        }
    }

    /* renamed from: a */
    private final C22984d m88595a(C22984d dVar) {
        if (!TextUtils.isEmpty(mo69547a())) {
            dVar.mo59973a("search_type", mo69547a());
        }
        return dVar;
    }

    @C7709l
    public final void onSearchHistoryChangedEvent(C26580g gVar) {
        C7573i.m23587b(gVar, "event");
        mo69578i().clear();
        mo69578i().addAll(m88607v());
        if (isViewValid() && mo69579j()) {
            mo69721o().mo68075a((List<? extends SearchHistory>) mo69578i(), false);
        }
    }

    /* renamed from: a */
    private void m88596a(View view) {
        C7573i.m23587b(view, "view");
        View findViewById = view.findViewById(R.id.cqp);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.recycler_view)");
        this.f71163m = (RecyclerView) findViewById;
        RecyclerView recyclerView = this.f71163m;
        if (recyclerView == null) {
            C7573i.m23583a("mListView");
        }
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = this.f71163m;
        if (recyclerView2 == null) {
            C7573i.m23583a("mListView");
        }
        Drawable drawable = getResources().getDrawable(R.drawable.yy);
        C7573i.m23582a((Object) drawable, "resources.getDrawable(R.…tion_search_intermediate)");
        recyclerView2.mo5525a((C1272h) new SimpleItemDecoration(drawable));
        RecyclerView recyclerView3 = this.f71163m;
        if (recyclerView3 == null) {
            C7573i.m23583a("mListView");
        }
        recyclerView3.mo5528a((C1281m) new SearchIntermediateFragment$initView$1());
    }

    /* renamed from: b */
    private final Map<String, String> m88598b(SearchSugResponse searchSugResponse) {
        String str;
        C22984d a = C22984d.m75611a().mo59973a("raw_query", this.f71165o);
        String str2 = "info";
        RecommendWordMob recommendWordMob = searchSugResponse.recommendWordMob;
        String str3 = null;
        if (recommendWordMob != null) {
            str = recommendWordMob.getInfo();
        } else {
            str = null;
        }
        C22984d a2 = a.mo59973a(str2, str).mo59973a("sug_session_id", "");
        String str4 = "impr_id";
        LogPbBean logPbBean = searchSugResponse.logPb;
        if (logPbBean != null) {
            str3 = logPbBean.getImprId();
        }
        Map<String, String> map = a2.mo59973a(str4, str3).mo59973a("search_position", m88594A()).f60753a;
        C7573i.m23582a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        return map;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C0063u a = C0069x.m159a(activity).mo147a(SearchIntermediateViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        this.f71164n = (SearchIntermediateViewModel) a;
        SearchIntermediateViewModel searchIntermediateViewModel = this.f71164n;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("mIntermediateViewModel");
        }
        C0043i iVar = this;
        searchIntermediateViewModel.getSearchKeyword().observe(iVar, new C26956f(this));
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f71164n;
        if (searchIntermediateViewModel2 == null) {
            C7573i.m23583a("mIntermediateViewModel");
        }
        searchIntermediateViewModel2.getIntermediateState().observe(iVar, new C26957g(this));
    }

    /* renamed from: a */
    public final void mo69477a(SearchSugResponse searchSugResponse) {
        C7573i.m23587b(searchSugResponse, "response");
        if (isViewValid()) {
            RecyclerView recyclerView = this.f71163m;
            if (recyclerView == null) {
                C7573i.m23583a("mListView");
            }
            if (recyclerView.getAdapter() instanceof SearchSugAdapter) {
                mo69577g().f69804a = searchSugResponse.requestId;
                mo69577g().mo68089a(searchSugResponse.sugList);
                mo69577g().notifyDataSetChanged();
                if (!C6307b.m19566a((Collection<T>) searchSugResponse.sugList)) {
                    m88611z();
                    Map<String, String> b = m88598b(searchSugResponse);
                    int size = searchSugResponse.sugList.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = searchSugResponse.sugList.get(i);
                        C7573i.m23582a(obj, "response.sugList[i]");
                        ((SearchSugEntity) obj).extraParam = b;
                    }
                    m88597a(searchSugResponse, b);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69715a(SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "param");
        SearchIntermediateViewModel searchIntermediateViewModel = this.f71164n;
        if (searchIntermediateViewModel == null) {
            C7573i.m23583a("mIntermediateViewModel");
        }
        searchIntermediateViewModel.openSearch(searchResultParam);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        mo69725r();
        mo69726s();
    }

    /* renamed from: b */
    public final void mo69716b(SearchHistory searchHistory, int i) {
        C7573i.m23587b(searchHistory, "history");
        if (i >= 0 && i < mo69578i().size()) {
            m88601d(searchHistory, i);
            SearchHistoryManager.inst().deleteSearchHistory(searchHistory);
        }
    }

    /* renamed from: a */
    private static void m88597a(SearchSugResponse searchSugResponse, Map<String, String> map) {
        Integer num;
        C26777b bVar = new C26777b();
        List<SearchSugEntity> list = searchSugResponse.sugList;
        String str = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        C26777b a = bVar.mo68551a(num);
        RecommendWordMob recommendWordMob = searchSugResponse.recommendWordMob;
        if (recommendWordMob != null) {
            str = recommendWordMob.getWordsSource();
        }
        a.mo68552a(str).mo85246a(map).mo85252e();
    }

    /* renamed from: c */
    private final void m88600c(SearchHistory searchHistory, int i) {
        C22984d a = C22984d.m75611a().mo59973a("action_type", "click").mo59970a(POIService.KEY_ORDER, i).mo59973a("search_keyword", searchHistory.keyword);
        C7573i.m23582a((Object) a, "EventMapBuilder.newBuild…KEYWORD, history.keyword)");
        C6907h.m21524a("search_history", (Map) m88595a(a).f60753a);
    }

    /* renamed from: d */
    private final void m88601d(SearchHistory searchHistory, int i) {
        C22984d a = C22984d.m75611a().mo59973a("action_type", "clear").mo59970a(POIService.KEY_ORDER, i).mo59973a("search_keyword", searchHistory.keyword);
        C7573i.m23582a((Object) a, "EventMapBuilder.newBuild…KEYWORD, history.keyword)");
        C6907h.m21524a("search_history", (Map) m88595a(a).f60753a);
    }

    /* renamed from: a */
    public final void mo69713a(SearchHistory searchHistory, int i) {
        C7573i.m23587b(searchHistory, "history");
        C26612d.f70187a.mo68302a(4);
        m88600c(searchHistory, i);
        SearchResultParam openNewSearchContainer = new SearchResultParam().setKeyword(searchHistory.keyword).setSearchFrom(1).setEnterFrom("search_history").setOpenNewSearchContainer(false);
        C7573i.m23582a((Object) openNewSearchContainer, "param");
        mo69715a(openNewSearchContainer);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.qp, viewGroup, false);
        C7573i.m23582a((Object) inflate, "root");
        m88596a(inflate);
        mo69724q();
        return inflate;
    }

    /* renamed from: b */
    private final void m88599b(SearchSugEntity searchSugEntity, String str, int i) {
        C22984d a = C22984d.m75611a().mo59973a("action_type", "click").mo59970a(POIService.KEY_ORDER, i).mo59973a("log_pb", C28199ae.m92689a().mo71791a(str)).mo59973a("sug_keyword", this.f71165o).mo59973a("search_keyword", searchSugEntity.content);
        C7573i.m23582a((Object) a, "EventMapBuilder.newBuild…_KEYWORD, entity.content)");
        C6907h.m21524a("search_sug", (Map) m88595a(a).f60753a);
    }

    /* renamed from: a */
    public final void mo69714a(SearchSugEntity searchSugEntity, String str, int i) {
        C7573i.m23587b(searchSugEntity, "entity");
        C7573i.m23587b(str, "requestId");
        C26612d.f70187a.mo68302a(1);
        m88599b(searchSugEntity, str, i);
        SearchResultParam searchFrom = new SearchResultParam().setKeyword(searchSugEntity.content).setEnterFrom("search_sug").setSearchFrom(3);
        C7573i.m23582a((Object) searchFrom, "param");
        mo69715a(searchFrom);
    }
}
