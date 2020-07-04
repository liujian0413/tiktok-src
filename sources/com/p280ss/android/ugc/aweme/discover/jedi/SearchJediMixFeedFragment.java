package com.p280ss.android.ugc.aweme.discover.jedi;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11554a;
import com.bytedance.jedi.arch.ext.list.C11556b;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.app.api.C22832g;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdInfo;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.discover.base.C26601f;
import com.p280ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p280ss.android.ugc.aweme.discover.jedi.adapter.SearchGridSpacingItemDecoration;
import com.p280ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26730b;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26733e;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26734f;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState;
import com.p280ss.android.ugc.aweme.discover.mixfeed.C26754d;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.discover.p1185ui.status.C27092b;
import com.p280ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.search.filter.FilterOption;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment */
public final class SearchJediMixFeedFragment extends SearchJediFragment<C26754d> {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f70387f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchJediMixFeedFragment.class), "searchViewModel", "getSearchViewModel()Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchJediViewModel;"))};

    /* renamed from: H */
    private final lifecycleAwareLazy f70388H;

    /* renamed from: J */
    private MusicPlayHelper f70389J;

    /* renamed from: K */
    private HashMap f70390K;

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$a */
    public static final class C26700a implements C23685d {

        /* renamed from: a */
        final /* synthetic */ SearchJediMixFeedFragment f70391a;

        C26700a(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            this.f70391a = searchJediMixFeedFragment;
        }

        /* renamed from: a */
        public final void mo61615a(View view, Aweme aweme, String str) {
            if (!(C27326a.m89578a(view) || aweme == null || this.f70391a.getActivity() == null)) {
                C28503s.m93678a((JediViewModel) this.f70391a.mo68436j());
                C7195s a = C7195s.m22438a();
                Activity activity = this.f70391a.getActivity();
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(aweme.getAid());
                a.mo18681a(activity, C7203u.m22460a(sb.toString()).mo18694a("refer", this.f70391a.mo68437k()).mo18694a("video_from", "from_search_jedi").mo18693a("profile_enterprise_type", aweme.getEnterpriseType()).mo18693a("page_type", 9).mo18694a("search_keyword", this.f70391a.f71090i).mo18695a(), view);
                C28229b.m92772a(aweme);
                C26780aa.m87960a(view, this.f70391a.mo68437k(), aweme, this.f70391a.f71090i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$b */
    public static final class C26701b implements C11557c<C26754d, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f70392a;

        /* renamed from: b */
        final /* synthetic */ C7563m f70393b;

        /* renamed from: c */
        final /* synthetic */ C7563m f70394c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f70395d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f70396e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends C26754d>, C7581n> f70397f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f70395d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f70396e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends C26754d>, C7581n> mo29140c() {
            return this.f70397f;
        }

        public C26701b(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f70392a = bVar;
            this.f70393b = mVar;
            this.f70394c = mVar2;
            this.f70395d = bVar;
            this.f70396e = mVar;
            this.f70397f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$c */
    public static final class C26702c implements C11557c<C26754d, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f70398a;

        /* renamed from: b */
        final /* synthetic */ C7563m f70399b;

        /* renamed from: c */
        final /* synthetic */ C7563m f70400c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f70401d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f70402e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends C26754d>, C7581n> f70403f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f70401d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f70402e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends C26754d>, C7581n> mo29140c() {
            return this.f70403f;
        }

        public C26702c(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f70398a = bVar;
            this.f70399b = mVar;
            this.f70400c = mVar2;
            this.f70401d = bVar;
            this.f70402e = mVar;
            this.f70403f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$d */
    static final class C26703d extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchJediMixFeedFragment f70404a;

        C26703d(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            this.f70404a = searchJediMixFeedFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m87725a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87725a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "throwable");
            if (th instanceof Exception) {
                this.f70404a.mo59105a_((Exception) th);
            } else {
                this.f70404a.mo59105a_(new Exception(th));
            }
            C26612d.f70187a.mo68305b().mo68306b(1).mo68307b(th.getMessage());
            C26612d.m87397c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$e */
    static final class C26704e extends Lambda implements C7563m<C11585f, List<? extends C26754d>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchJediMixFeedFragment f70405a;

        C26704e(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            this.f70405a = searchJediMixFeedFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m87726a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87726a(C11585f fVar, final List<? extends C26754d> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "list");
            fVar.mo29066a(this.f70405a.mo68436j(), new C7562b<SearchState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C26704e f70406a;

                {
                    this.f70406a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C7581n invoke(SearchState searchState) {
                    C7573i.m23587b(searchState, "it");
                    C11556b bVar = ((C26733e) searchState.getListState().getPayload()).f31254a;
                    List b = C26601f.m87382b(C26601f.m87379a(searchState.getListState().getList()));
                    SearchApiResult searchApiResult = ((C26733e) searchState.getListState().getPayload()).f70446d;
                    if (searchApiResult != null) {
                        C26612d.f70187a.mo68308c(searchState.getListState().getList().size()).mo68305b().mo68304a(searchApiResult.getRequestId()).mo68303a((C22832g) searchApiResult).mo68306b(0);
                    }
                    if (searchState.getListState().getList().isEmpty() || list.isEmpty()) {
                        this.f70406a.f70405a.ae_();
                        C26612d.m87397c();
                    } else {
                        this.f70406a.f70405a.mo59099a(b, bVar.f31214a);
                    }
                    SearchApiResult searchApiResult2 = ((C26733e) searchState.getListState().getPayload()).f70446d;
                    if (searchApiResult2 == null) {
                        return null;
                    }
                    this.f70406a.f70405a.mo69691a(searchApiResult2.suicidePrevent);
                    this.f70406a.f70405a.mo69689a(searchApiResult2.queryCorrectInfo);
                    this.f70406a.f70405a.mo69685a(searchApiResult2.adInfo);
                    this.f70406a.f70405a.mo69690a(searchApiResult2);
                    return C7581n.f20898a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$f */
    static final class C26706f extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchJediMixFeedFragment f70408a;

        C26706f(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            this.f70408a = searchJediMixFeedFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m87728a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87728a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            this.f70408a.mo59098S_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$g */
    static final class C26707g extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchJediMixFeedFragment f70409a;

        C26707g(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            this.f70409a = searchJediMixFeedFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m87729a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87729a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "throwable");
            this.f70409a.mo59107b(new Exception(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$h */
    static final class C26708h extends Lambda implements C7563m<C11585f, List<? extends C26754d>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchJediMixFeedFragment f70410a;

        C26708h(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            this.f70410a = searchJediMixFeedFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m87730a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87730a(C11585f fVar, List<? extends C26754d> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "list");
            fVar.mo29066a(this.f70410a.mo68436j(), new C7562b<SearchState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C26708h f70411a;

                {
                    this.f70411a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m87731a((SearchState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m87731a(SearchState searchState) {
                    C7573i.m23587b(searchState, "it");
                    C11556b bVar = ((C26733e) searchState.getListState().getPayload()).f31254a;
                    this.f70411a.f70410a.mo59108b(C26601f.m87382b(C26601f.m87379a(searchState.getListState().getList())), bVar.f31214a);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$i */
    static final class C26710i extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchJediMixFeedFragment f70412a;

        C26710i(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            this.f70412a = searchJediMixFeedFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m87732a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87732a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            this.f70412a.aD_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$j */
    static final class C26711j extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        public static final C26711j f70413a = new C26711j();

        C26711j() {
            super(2);
        }

        /* renamed from: a */
        private static void m87733a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m87733a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$k */
    static final class C26712k extends Lambda implements C7562b<SearchState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchJediMixFeedFragment f70414a;

        /* renamed from: b */
        final /* synthetic */ boolean f70415b;

        C26712k(SearchJediMixFeedFragment searchJediMixFeedFragment, boolean z) {
            this.f70414a = searchJediMixFeedFragment;
            this.f70415b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m87734a((SearchState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87734a(SearchState searchState) {
            SearchAdInfo searchAdInfo;
            C7573i.m23587b(searchState, "it");
            SearchJediMixFeedFragment searchJediMixFeedFragment = this.f70414a;
            String k = this.f70414a.mo68437k();
            String str = ((C26733e) searchState.getListState().getPayload()).f70445c;
            String str2 = this.f70414a.f71090i;
            boolean z = this.f70415b;
            SearchApiResult searchApiResult = ((C26733e) searchState.getListState().getPayload()).f70446d;
            if (searchApiResult != null) {
                searchAdInfo = searchApiResult.adInfo;
            } else {
                searchAdInfo = null;
            }
            searchJediMixFeedFragment.mo69692a(k, str, str2, z, searchAdInfo);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment$l */
    static final class C26713l extends Lambda implements C7562b<SearchState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchJediMixFeedFragment f70416a;

        C26713l(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            this.f70416a = searchJediMixFeedFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m87735a((SearchState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m87735a(SearchState searchState) {
            C7573i.m23587b(searchState, "it");
            C10805b a = C27092b.m88896a(this.f70416a.mo69673B(), ((C26733e) searchState.getListState().getPayload()).f70446d, null, 2, null);
            if (a != null) {
                this.f70416a.mo69684a(a);
            } else {
                this.f70416a.mo69677H();
            }
        }
    }

    /* renamed from: a */
    public final View mo68429a(int i) {
        if (this.f70390K == null) {
            this.f70390K = new HashMap();
        }
        View view = (View) this.f70390K.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f70390K.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b_ */
    public final boolean mo68435b_(boolean z) {
        return z;
    }

    /* renamed from: g */
    public final void mo68430g() {
        if (this.f70390K != null) {
            this.f70390K.clear();
        }
    }

    /* renamed from: j */
    public final SearchJediViewModel mo68436j() {
        return (SearchJediViewModel) this.f70388H.getValue();
    }

    /* renamed from: k */
    public final String mo68437k() {
        return "general_search";
    }

    /* renamed from: m */
    public final void mo68439m() {
    }

    /* renamed from: o */
    public final boolean mo68441o() {
        return false;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo68430g();
    }

    public final void ae_() {
        mo29066a(mo68436j(), new C26713l(this));
    }

    public SearchJediMixFeedFragment() {
        C7584c a = C7575l.m23595a(SearchJediViewModel.class);
        C7561a searchJediMixFeedFragment$$special$$inlined$viewModel$1 = new SearchJediMixFeedFragment$$special$$inlined$viewModel$1(a);
        this.f70388H = new lifecycleAwareLazy(this, searchJediMixFeedFragment$$special$$inlined$viewModel$1, new SearchJediMixFeedFragment$$special$$inlined$viewModel$3(this, searchJediMixFeedFragment$$special$$inlined$viewModel$1, a, SearchJediMixFeedFragment$$special$$inlined$viewModel$2.INSTANCE));
    }

    /* renamed from: l */
    public final void mo68438l() {
        SearchJediViewModel j = mo68436j();
        C26734f fVar = new C26734f(mo69679J(), 1, this.f71094m, mo69705z(), this.f71097p, null, 32, null);
        j.mo68448a(fVar);
        C26730b.m87770a(mo68436j());
    }

    /* renamed from: n */
    public final void mo68440n() {
        mo69686a((BaseAdapter<D>) new SearchJediMixFeedAdapter<D>(mo69697r(), this.f71088g, new C26700a(this)));
        mo69697r().setLayoutManager(new SearchJediMixFeedFragment$initAdapter$layoutManager$1(this, getContext(), 2));
        mo69697r().mo5525a((C1272h) new SearchGridSpacingItemDecoration(2, (int) C9738o.m28708b(getContext(), 1.0f), false));
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        MusicPlayHelper musicPlayHelper = this.f70389J;
        if (musicPlayHelper != null) {
            musicPlayHelper.mo68326a();
        }
    }

    /* renamed from: a */
    public final void mo68433a(String str) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        BaseAdapter y = mo69704y();
        if (y != null) {
            SearchJediMixFeedAdapter searchJediMixFeedAdapter = (SearchJediMixFeedAdapter) y;
            SearchResultParam searchResultParam = this.f71088g;
            if (searchResultParam == null) {
                C7573i.m23580a();
            }
            searchJediMixFeedAdapter.mo68446a(searchResultParam);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
    }

    /* renamed from: b */
    public final void mo68434b(boolean z) {
        mo29066a(mo68436j(), new C26712k(this, z));
    }

    @C7709l
    public final void onVideoEvent(C28318an anVar) {
        C7573i.m23587b(anVar, "event");
        if (isViewValid()) {
            int i = anVar.f74631a;
            if (i == 13) {
                int childCount = mo69697r().getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    C1293v b = mo69697r().mo5539b(mo69697r().getChildAt(i2));
                    if (b instanceof AbsCellViewHolder) {
                        ((AbsCellViewHolder) b).mo67074n();
                    }
                }
            } else if (i == 21) {
                Object obj = anVar.f74632b;
                if (obj != null) {
                    Aweme aweme = (Aweme) obj;
                    if (aweme != null && anVar.f74638h != 65458 && anVar.f74638h != 65456) {
                        BaseAdapter y = mo69704y();
                        if (y != null) {
                            SearchJediMixFeedAdapter searchJediMixFeedAdapter = (SearchJediMixFeedAdapter) y;
                            String aid = aweme.getAid();
                            C7573i.m23582a((Object) aid, "awemeScrollTo.aid");
                            int a = searchJediMixFeedAdapter.mo68445a(aid);
                            if (a != -1) {
                                C1273i layoutManager = mo69697r().getLayoutManager();
                                if (layoutManager != null) {
                                    ((GridLayoutManager) layoutManager).mo5417a(a, 0);
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
                                }
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo68431a(int i, FilterOption filterOption) {
        super.mo68431a(i, filterOption);
        if (C26715a.m87736a(getActivity())) {
            SearchJediViewModel j = mo68436j();
            C26734f fVar = new C26734f(this.f71090i, i, this.f71094m, mo69705z(), this.f71097p, null, 32, null);
            j.mo68448a(fVar);
            C26730b.m87773b(mo68436j());
            return;
        }
        mo69676G();
    }

    /* renamed from: a */
    public final void mo68432a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo68432a(view, bundle);
        SearchJediViewModel j = mo68436j();
        C11502e eVar = this;
        BaseAdapter y = mo69704y();
        if (y != null) {
            C26730b.m87771a(j, eVar, (C11554a) y, new C26701b(new C26706f(this), new C26703d(this), new C26704e(this)), new C26702c(new C26710i(this), new C26707g(this), new C26708h(this)), C26711j.f70413a);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            this.f70389J = (MusicPlayHelper) C0069x.m159a(activity).mo147a(MusicPlayHelper.class);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.arch.ext.list.DiffableAdapter<com.ss.android.ugc.aweme.discover.mixfeed.SearchMixFeed>");
    }
}
