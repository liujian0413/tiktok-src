package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11497af;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11592h;
import com.bytedance.jedi.arch.C11592h.C11593a;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.arch.C23274b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchMusicAdapter;
import com.p280ss.android.ugc.aweme.discover.helper.MusicPlayHelper;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26732d;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26733e;
import com.p280ss.android.ugc.aweme.discover.jedi.viewmodel.C26734f;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
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
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment */
public final class MusicianMusicListFragment extends AmeBaseFragment implements C11497af<C23274b>, C11592h {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f71027e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MusicianMusicListFragment.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicViewModel;"))};

    /* renamed from: g */
    public static final C26909a f71028g = new C26909a(null);

    /* renamed from: f */
    public final C23274b f71029f = new C23274b();

    /* renamed from: h */
    private String f71030h;

    /* renamed from: i */
    private int f71031i;

    /* renamed from: j */
    private SearchMusicAdapter f71032j;

    /* renamed from: k */
    private MusicPlayHelper f71033k;

    /* renamed from: l */
    private final lifecycleAwareLazy f71034l;

    /* renamed from: m */
    private HashMap f71035m;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$a */
    public static final class C26909a {
        private C26909a() {
        }

        public /* synthetic */ C26909a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static MusicianMusicListFragment m88438a(String str, int i) {
            C7573i.m23587b(str, "author");
            MusicianMusicListFragment musicianMusicListFragment = new MusicianMusicListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("param_music_author", str);
            bundle.putInt("param_holder_postion", i);
            musicianMusicListFragment.setArguments(bundle);
            return musicianMusicListFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$b */
    static final class C26910b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusicianMusicListFragment f71036a;

        C26910b(MusicianMusicListFragment musicianMusicListFragment) {
            this.f71036a = musicianMusicListFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f71036a.mo69619i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$c */
    static final class C26911c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusicianMusicListFragment f71037a;

        C26911c(MusicianMusicListFragment musicianMusicListFragment) {
            this.f71037a = musicianMusicListFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f71037a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$d */
    static final class C26912d implements C6905a {

        /* renamed from: a */
        final /* synthetic */ MusicianMusicListFragment f71038a;

        C26912d(MusicianMusicListFragment musicianMusicListFragment) {
            this.f71038a = musicianMusicListFragment;
        }

        public final void bd_() {
            this.f71038a.mo69620j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$e */
    static final class C26913e implements C23386b {

        /* renamed from: a */
        final /* synthetic */ MusicianMusicListFragment f71039a;

        C26913e(MusicianMusicListFragment musicianMusicListFragment) {
            this.f71039a = musicianMusicListFragment;
        }

        /* renamed from: a */
        public final void mo60744a() {
            this.f71039a.mo69619i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$f */
    public static final class C26914f implements C11557c<SearchMusic, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f71040a;

        /* renamed from: b */
        final /* synthetic */ C7563m f71041b;

        /* renamed from: c */
        final /* synthetic */ C7563m f71042c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f71043d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f71044e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends SearchMusic>, C7581n> f71045f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f71043d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f71044e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends SearchMusic>, C7581n> mo29140c() {
            return this.f71045f;
        }

        public C26914f(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f71040a = bVar;
            this.f71041b = mVar;
            this.f71042c = mVar2;
            this.f71043d = bVar;
            this.f71044e = mVar;
            this.f71045f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$g */
    public static final class C26915g implements C11557c<SearchMusic, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f71046a;

        /* renamed from: b */
        final /* synthetic */ C7563m f71047b;

        /* renamed from: c */
        final /* synthetic */ C7563m f71048c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f71049d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f71050e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends SearchMusic>, C7581n> f71051f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f71049d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f71050e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends SearchMusic>, C7581n> mo29140c() {
            return this.f71051f;
        }

        public C26915g(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f71046a = bVar;
            this.f71047b = mVar;
            this.f71048c = mVar2;
            this.f71049d = bVar;
            this.f71050e = mVar;
            this.f71051f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$h */
    static final class C26916h extends Lambda implements C7563m<C11585f, List<? extends SearchMusic>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MusicianMusicListFragment f71052a;

        C26916h(MusicianMusicListFragment musicianMusicListFragment) {
            this.f71052a = musicianMusicListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m88446a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m88446a(C11585f fVar, List<? extends SearchMusic> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            fVar.mo29066a(this.f71052a.mo69618g(), new C7562b<SearchMusicListState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C26916h f71053a;

                {
                    this.f71053a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m88447a((SearchMusicListState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m88447a(SearchMusicListState searchMusicListState) {
                    C7573i.m23587b(searchMusicListState, "it");
                    this.f71053a.f71052a.mo69616a(searchMusicListState.getListState().getList(), ((C26733e) searchMusicListState.getListState().getPayload()).f31254a.f31214a);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$i */
    static final class C26918i extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MusicianMusicListFragment f71054a;

        C26918i(MusicianMusicListFragment musicianMusicListFragment) {
            this.f71054a = musicianMusicListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m88448a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m88448a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            this.f71054a.mo69621k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$j */
    static final class C26919j extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MusicianMusicListFragment f71055a;

        C26919j(MusicianMusicListFragment musicianMusicListFragment) {
            this.f71055a = musicianMusicListFragment;
            super(2);
        }

        /* renamed from: a */
        private void m88449a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            this.f71055a.mo69623m();
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m88449a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$k */
    static final class C26920k extends Lambda implements C7563m<C11585f, List<? extends SearchMusic>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MusicianMusicListFragment f71056a;

        C26920k(MusicianMusicListFragment musicianMusicListFragment) {
            this.f71056a = musicianMusicListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m88450a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m88450a(C11585f fVar, List<? extends SearchMusic> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            fVar.mo29066a(this.f71056a.mo69618g(), new C7562b<SearchMusicListState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C26920k f71057a;

                {
                    this.f71057a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m88451a((SearchMusicListState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m88451a(SearchMusicListState searchMusicListState) {
                    C7573i.m23587b(searchMusicListState, "it");
                    this.f71057a.f71056a.mo69617b(searchMusicListState.getListState().getList(), ((C26733e) searchMusicListState.getListState().getPayload()).f31254a.f31214a);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$l */
    static final class C26922l extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MusicianMusicListFragment f71058a;

        C26922l(MusicianMusicListFragment musicianMusicListFragment) {
            this.f71058a = musicianMusicListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m88452a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m88452a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            this.f71058a.mo69622l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$m */
    static final class C26923m extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MusicianMusicListFragment f71059a;

        C26923m(MusicianMusicListFragment musicianMusicListFragment) {
            this.f71059a = musicianMusicListFragment;
            super(2);
        }

        /* renamed from: a */
        private void m88453a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            this.f71059a.mo69624n();
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m88453a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment$n */
    static final /* synthetic */ class C26924n extends FunctionReference implements C7561a<C7581n> {
        C26924n(MusicianMusicListFragment musicianMusicListFragment) {
            super(0, musicianMusicListFragment);
        }

        public final String getName() {
            return "showNetworkError";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(MusicianMusicListFragment.class);
        }

        public final String getSignature() {
            return "showNetworkError()V";
        }

        /* renamed from: a */
        private void m88454a() {
            ((MusicianMusicListFragment) this.receiver).mo69625o();
        }

        public final /* synthetic */ Object invoke() {
            m88454a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: a */
    private View m88409a(int i) {
        if (this.f71035m == null) {
            this.f71035m = new HashMap();
        }
        View view = (View) this.f71035m.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f71035m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: u */
    private void m88415u() {
        if (this.f71035m != null) {
            this.f71035m.clear();
        }
    }

    /* renamed from: g */
    public final SearchMusicViewModel mo69618g() {
        return (SearchMusicViewModel) this.f71034l.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m88415u();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public C11585f mo29191e() {
        return C11593a.m34077d(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C11593a.m34068a(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C11593a.m34075b(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C11593a.m34078e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C11593a.m34076c(this);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0067b mo29056f() {
        return this.f71029f;
    }

    /* renamed from: j */
    public final void mo69620j() {
        C26732d.m87774a(mo69618g());
    }

    /* renamed from: l */
    public final void mo69622l() {
        SearchMusicAdapter searchMusicAdapter = this.f71032j;
        if (searchMusicAdapter == null) {
            C7573i.m23583a("adapter");
        }
        searchMusicAdapter.ag_();
    }

    public final void onPause() {
        super.onPause();
        MusicPlayHelper musicPlayHelper = this.f71033k;
        if (musicPlayHelper != null) {
            musicPlayHelper.mo68326a();
        }
    }

    /* renamed from: s */
    private final void m88413s() {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) m88409a(R.id.cr5);
        if (!isViewValid()) {
            swipeRefreshLayout = null;
        }
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    /* renamed from: n */
    public final void mo69624n() {
        if (isViewValid()) {
            m88413s();
            SearchMusicAdapter searchMusicAdapter = this.f71032j;
            if (searchMusicAdapter == null) {
                C7573i.m23583a("adapter");
            }
            searchMusicAdapter.mo66507h();
        }
    }

    public MusicianMusicListFragment() {
        C7584c a = C7575l.m23595a(SearchMusicViewModel.class);
        C7561a musicianMusicListFragment$$special$$inlined$viewModel$1 = new MusicianMusicListFragment$$special$$inlined$viewModel$1(a);
        this.f71034l = new lifecycleAwareLazy(this, musicianMusicListFragment$$special$$inlined$viewModel$1, new MusicianMusicListFragment$$special$$inlined$viewModel$3(this, musicianMusicListFragment$$special$$inlined$viewModel$1, a, MusicianMusicListFragment$$special$$inlined$viewModel$2.INSTANCE));
    }

    /* renamed from: k */
    public final void mo69621k() {
        NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) m88409a(R.id.cqd);
        C7573i.m23582a((Object) nestedScrollingRecyclerView, "recyclerView");
        if (nestedScrollingRecyclerView.getChildCount() > 0) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) m88409a(R.id.cr5);
            C7573i.m23582a((Object) swipeRefreshLayout, "refreshLayout");
            swipeRefreshLayout.setRefreshing(true);
            return;
        }
        ((DmtStatusView) m88409a(R.id.daj)).mo25942f();
    }

    /* renamed from: m */
    public final void mo69623m() {
        if (isViewValid()) {
            m88413s();
            SearchMusicAdapter searchMusicAdapter = this.f71032j;
            if (searchMusicAdapter == null) {
                C7573i.m23583a("adapter");
            }
            searchMusicAdapter.mo66516d(false);
            SearchMusicAdapter searchMusicAdapter2 = this.f71032j;
            if (searchMusicAdapter2 == null) {
                C7573i.m23583a("adapter");
            }
            searchMusicAdapter2.mo58045a(null);
            ((DmtStatusView) m88409a(R.id.daj)).mo25943g();
        }
    }

    /* renamed from: o */
    public final void mo69625o() {
        if (isViewValid()) {
            m88413s();
            SearchMusicAdapter searchMusicAdapter = this.f71032j;
            if (searchMusicAdapter == null) {
                C7573i.m23583a("adapter");
            }
            searchMusicAdapter.mo66516d(false);
            SearchMusicAdapter searchMusicAdapter2 = this.f71032j;
            if (searchMusicAdapter2 == null) {
                C7573i.m23583a("adapter");
            }
            searchMusicAdapter2.mo58045a(null);
            ((DmtStatusView) m88409a(R.id.daj)).mo25944h();
            C10761a.m31399c(getContext(), (int) R.string.cjs).mo25750a();
        }
    }

    /* renamed from: q */
    private final void m88411q() {
        SearchMusicViewModel g = mo69618g();
        C11502e eVar = this;
        SearchMusicAdapter searchMusicAdapter = this.f71032j;
        if (searchMusicAdapter == null) {
            C7573i.m23583a("adapter");
        }
        C26732d.m87775a(g, eVar, searchMusicAdapter, new C26914f(new C26918i(this), new C26919j(this), new C26916h(this)), new C26915g(new C26922l(this), new C26923m(this), new C26920k(this)), null);
    }

    /* renamed from: r */
    private final void m88412r() {
        MtEmptyView a = MtEmptyView.m31657a(getContext());
        a.setStatus(new C10806a(a.getContext()).mo25985a((int) R.drawable.ax3).mo25990b((int) R.string.fic).mo25993c(R.string.fid).f29135a);
        ((DmtStatusView) m88409a(R.id.daj)).setBuilder(C10803a.m31631a(getContext()).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C26910b(this)).mo25963b((View) a));
    }

    /* renamed from: i */
    public final void mo69619i() {
        if (!C27007al.m88758a(getContext())) {
            C6726a.m20843a(new C27008am(new C26924n(this)), 100);
            return;
        }
        SearchMusicViewModel g = mo69618g();
        String str = this.f71030h;
        if (str == null) {
            C7573i.m23583a("musicAuthor");
        }
        C26734f fVar = new C26734f(str, 1, null, 0, 0, null, 44, null);
        g.mo69998a(fVar);
        C26732d.m87777b(mo69618g());
    }

    /* renamed from: p */
    private final void m88410p() {
        NormalTitleBar normalTitleBar = (NormalTitleBar) m88409a(R.id.djr);
        C7573i.m23582a((Object) normalTitleBar, "titleBar");
        DmtTextView titleView = normalTitleBar.getTitleView();
        C7573i.m23582a((Object) titleView, "titleBar.titleView");
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        Object[] objArr = new Object[1];
        String str = this.f71030h;
        if (str == null) {
            C7573i.m23583a("musicAuthor");
        }
        objArr[0] = str;
        String string = context.getString(R.string.cha, objArr);
        C7573i.m23582a((Object) string, "context!!.getString(R.st….music_from, musicAuthor)");
        String a = C1642a.m8034a(string, Arrays.copyOf(new Object[0], 0));
        C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
        titleView.setText(a);
        NormalTitleBar normalTitleBar2 = (NormalTitleBar) m88409a(R.id.djr);
        C7573i.m23582a((Object) normalTitleBar2, "titleBar");
        normalTitleBar2.getStartBtn().setOnClickListener(new C26911c(this));
        ((NormalTitleBar) m88409a(R.id.djr)).mo25857a(true);
        C26501r rVar = new C26501r(false);
        rVar.f69902f = "artist_card_detail";
        rVar.f69901e = this.f71031i;
        String str2 = this.f71030h;
        if (str2 == null) {
            C7573i.m23583a("musicAuthor");
        }
        this.f71032j = new SearchMusicAdapter(null, rVar, str2);
        SearchMusicAdapter searchMusicAdapter = this.f71032j;
        if (searchMusicAdapter == null) {
            C7573i.m23583a("adapter");
        }
        searchMusicAdapter.f67550q = getResources().getColor(R.color.a3z);
        SearchMusicAdapter searchMusicAdapter2 = this.f71032j;
        if (searchMusicAdapter2 == null) {
            C7573i.m23583a("adapter");
        }
        searchMusicAdapter2.mo66504a((C6905a) new C26912d(this));
        ((SwipeRefreshLayout) m88409a(R.id.cr5)).setOnRefreshListener(new C26913e(this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) m88409a(R.id.cr5);
        C7573i.m23582a((Object) swipeRefreshLayout, "refreshLayout");
        swipeRefreshLayout.setEnabled(false);
        NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) m88409a(R.id.cqd);
        C7573i.m23582a((Object) nestedScrollingRecyclerView, "recyclerView");
        nestedScrollingRecyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext(), 1, false));
        NestedScrollingRecyclerView nestedScrollingRecyclerView2 = (NestedScrollingRecyclerView) m88409a(R.id.cqd);
        C7573i.m23582a((Object) nestedScrollingRecyclerView2, "recyclerView");
        SearchMusicAdapter searchMusicAdapter3 = this.f71032j;
        if (searchMusicAdapter3 == null) {
            C7573i.m23583a("adapter");
        }
        nestedScrollingRecyclerView2.setAdapter(searchMusicAdapter3);
        m88412r();
        m88411q();
        mo69619i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r3 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto L_0x0011
            java.lang.String r0 = "param_music_author"
            java.lang.String r3 = r3.getString(r0)
            if (r3 != 0) goto L_0x0013
        L_0x0011:
            java.lang.String r3 = ""
        L_0x0013:
            r2.f71030h = r3
            android.os.Bundle r3 = r2.getArguments()
            r0 = 0
            if (r3 == 0) goto L_0x0022
            java.lang.String r1 = "param_holder_postion"
            int r0 = r3.getInt(r1, r0)
        L_0x0022:
            r2.f71031i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1185ui.MusicianMusicListFragment.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C11593a.m34074a(this, vm1, bVar);
    }

    /* renamed from: b */
    public final void mo69617b(List<? extends SearchMusic> list, boolean z) {
        if (isViewValid()) {
            m88413s();
            SearchMusicAdapter searchMusicAdapter = this.f71032j;
            if (searchMusicAdapter == null) {
                C7573i.m23583a("adapter");
            }
            if (z) {
                searchMusicAdapter.ai_();
            } else {
                searchMusicAdapter.ah_();
            }
            searchMusicAdapter.mo61577b(list);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m88410p();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f71033k = (MusicPlayHelper) C0069x.m159a(activity).mo147a(MusicPlayHelper.class);
        }
    }

    /* renamed from: a */
    public final void mo69616a(List<? extends SearchMusic> list, boolean z) {
        boolean z2;
        if (isViewValid()) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                mo69623m();
                return;
            }
            m88413s();
            SearchMusicAdapter searchMusicAdapter = this.f71032j;
            if (searchMusicAdapter == null) {
                C7573i.m23583a("adapter");
            }
            searchMusicAdapter.mo66516d(true);
            if (z) {
                searchMusicAdapter.ai_();
            } else {
                searchMusicAdapter.ah_();
            }
            ((DmtStatusView) m88409a(R.id.daj)).mo25939d();
            SearchMusicAdapter searchMusicAdapter2 = this.f71032j;
            if (searchMusicAdapter2 == null) {
                C7573i.m23583a("adapter");
            }
            List arrayList = new ArrayList();
            arrayList.addAll(collection);
            searchMusicAdapter2.mo58045a(arrayList);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.pa, viewGroup, false);
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34069a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34070a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C11593a.m34072a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C11593a.m34071a(this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C11593a.m34073a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
