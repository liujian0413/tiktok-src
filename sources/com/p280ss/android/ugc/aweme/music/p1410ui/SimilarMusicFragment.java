package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1280l;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1410ui.adapter.C33927a;
import com.p280ss.android.ugc.aweme.music.p1410ui.adapter.SimilarMusicListAdapter;
import com.p280ss.android.ugc.aweme.music.p1410ui.adapter.SimilarMusicListAdapter.C33924a;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1414d.C33952a.C33953a;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewholder.SimilarMusicItemDecoration;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewholder.SimilarMusicItemDecoration.C33985a;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewholder.SimilarMusicListViewHolder;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34012a;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34015d;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.SimilarMusicListState;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.SimilarMusicListViewModel;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment */
public final class SimilarMusicFragment extends JediMusicDetailFragment implements C33924a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f88458i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicFragment.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/music/ui/viewmodel/SimilarMusicListViewModel;"))};

    /* renamed from: n */
    public static final C33896a f88459n = new C33896a(null);

    /* renamed from: j */
    public String f88460j;

    /* renamed from: k */
    public SimilarMusicListAdapter f88461k;

    /* renamed from: l */
    public boolean f88462l;

    /* renamed from: m */
    public float f88463m;

    /* renamed from: o */
    private String f88464o;

    /* renamed from: p */
    private String f88465p;

    /* renamed from: q */
    private String f88466q;

    /* renamed from: r */
    private int f88467r;

    /* renamed from: s */
    private int f88468s;

    /* renamed from: t */
    private C10803a f88469t;

    /* renamed from: u */
    private boolean f88470u;

    /* renamed from: v */
    private final lifecycleAwareLazy f88471v;

    /* renamed from: w */
    private HashMap f88472w;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$a */
    public static final class C33896a {
        private C33896a() {
        }

        public /* synthetic */ C33896a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SimilarMusicFragment m109301a(String str, String str2, String str3, String str4) {
            C7573i.m23587b(str, "musicId");
            C7573i.m23587b(str2, "musicTitle");
            C7573i.m23587b(str3, "eventType");
            C7573i.m23587b(str4, "authorId");
            SimilarMusicFragment similarMusicFragment = new SimilarMusicFragment();
            Bundle bundle = new Bundle();
            bundle.putString("music_id", str);
            bundle.putString("music_title", str2);
            bundle.putString("anthor_id", str4);
            bundle.putString("enter_type", str3);
            similarMusicFragment.setArguments(bundle);
            return similarMusicFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$b */
    static final class C33897b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicFragment f88473a;

        C33897b(SimilarMusicFragment similarMusicFragment) {
            this.f88473a = similarMusicFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f88473a.mo86574q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$c */
    static final class C33898c implements C6905a {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicFragment f88474a;

        C33898c(SimilarMusicFragment similarMusicFragment) {
            this.f88474a = similarMusicFragment;
        }

        public final void bd_() {
            this.f88474a.mo86573p().f88700e.mo29085c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$d */
    static final class C33899d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicFragment f88475a;

        C33899d(SimilarMusicFragment similarMusicFragment) {
            this.f88475a = similarMusicFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f88475a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$e */
    public static final class C33900e implements C11557c<C34015d, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f88476a;

        /* renamed from: b */
        final /* synthetic */ C7563m f88477b;

        /* renamed from: c */
        final /* synthetic */ C7563m f88478c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f88479d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f88480e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends C34015d>, C7581n> f88481f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f88479d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f88480e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends C34015d>, C7581n> mo29140c() {
            return this.f88481f;
        }

        public C33900e(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f88476a = bVar;
            this.f88477b = mVar;
            this.f88478c = mVar2;
            this.f88479d = bVar;
            this.f88480e = mVar;
            this.f88481f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$f */
    public static final class C33901f implements C11557c<C34015d, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f88482a;

        /* renamed from: b */
        final /* synthetic */ C7563m f88483b;

        /* renamed from: c */
        final /* synthetic */ C7563m f88484c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f88485d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f88486e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends C34015d>, C7581n> f88487f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f88485d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f88486e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends C34015d>, C7581n> mo29140c() {
            return this.f88487f;
        }

        public C33901f(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f88482a = bVar;
            this.f88483b = mVar;
            this.f88484c = mVar2;
            this.f88485d = bVar;
            this.f88486e = mVar;
            this.f88487f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$g */
    static final class C33902g extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicFragment f88488a;

        C33902g(SimilarMusicFragment similarMusicFragment) {
            this.f88488a = similarMusicFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m109308a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m109308a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            ((DmtStatusView) this.f88488a.mo86459a((int) R.id.dav)).mo25942f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$h */
    static final class C33903h extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicFragment f88489a;

        C33903h(SimilarMusicFragment similarMusicFragment) {
            this.f88489a = similarMusicFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m109309a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m109309a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            ((DmtStatusView) this.f88489a.mo86459a((int) R.id.dav)).mo25944h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$i */
    static final class C33904i extends Lambda implements C7563m<C11585f, List<? extends C34015d>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicFragment f88490a;

        C33904i(SimilarMusicFragment similarMusicFragment) {
            this.f88490a = similarMusicFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m109310a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m109310a(C11585f fVar, List<C34015d> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "data");
            if (!C6307b.m19566a((Collection<T>) list)) {
                ((DmtStatusView) this.f88490a.mo86459a((int) R.id.dav)).mo25939d();
            }
            fVar.mo29066a(this.f88490a.mo86573p(), new C7562b<SimilarMusicListState, Boolean>(this) {

                /* renamed from: a */
                final /* synthetic */ C33904i f88491a;

                {
                    this.f88491a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    return Boolean.valueOf(m109311a((SimilarMusicListState) obj));
                }

                /* renamed from: a */
                private boolean m109311a(SimilarMusicListState similarMusicListState) {
                    C7573i.m23587b(similarMusicListState, "it");
                    return this.f88491a.f88490a.mo86573p().mo86666a(((C34012a) similarMusicListState.getListState().getPayload()).f31254a.f31214a, ((C34012a) similarMusicListState.getListState().getPayload()).f88710c, ((C34012a) similarMusicListState.getListState().getPayload()).f88711d);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$j */
    static final class C33906j extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicFragment f88492a;

        C33906j(SimilarMusicFragment similarMusicFragment) {
            this.f88492a = similarMusicFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m109312a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m109312a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            SimilarMusicFragment.m109278a(this.f88492a).ag_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$k */
    static final class C33907k extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicFragment f88493a;

        C33907k(SimilarMusicFragment similarMusicFragment) {
            this.f88493a = similarMusicFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m109313a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m109313a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            SimilarMusicFragment.m109278a(this.f88493a).mo66508i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$l */
    static final class C33908l extends Lambda implements C7563m<C11585f, List<? extends C34015d>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicFragment f88494a;

        C33908l(SimilarMusicFragment similarMusicFragment) {
            this.f88494a = similarMusicFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m109314a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m109314a(C11585f fVar, List<C34015d> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            fVar.mo29066a(this.f88494a.mo86573p(), new C7562b<SimilarMusicListState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C33908l f88495a;

                {
                    this.f88495a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m109315a((SimilarMusicListState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m109315a(SimilarMusicListState similarMusicListState) {
                    C7573i.m23587b(similarMusicListState, "it");
                    if (!this.f88495a.f88494a.mo86573p().mo86666a(((C34012a) similarMusicListState.getListState().getPayload()).f31254a.f31214a, ((C34012a) similarMusicListState.getListState().getPayload()).f88710c, ((C34012a) similarMusicListState.getListState().getPayload()).f88711d)) {
                        if (C6307b.m19566a((Collection<T>) similarMusicListState.getListState().getList())) {
                            ((DmtStatusView) this.f88495a.f88494a.mo86459a((int) R.id.dav)).mo25943g();
                            return;
                        }
                        ((DmtStatusView) this.f88495a.f88494a.mo86459a((int) R.id.dav)).mo25939d();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$m */
    static final class C33910m extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicFragment f88496a;

        C33910m(SimilarMusicFragment similarMusicFragment) {
            this.f88496a = similarMusicFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m109316a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m109316a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                SimilarMusicFragment.m109278a(this.f88496a).ai_();
            } else {
                SimilarMusicFragment.m109278a(this.f88496a).ah_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$n */
    static final class C33911n extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicFragment f88497a;

        C33911n(SimilarMusicFragment similarMusicFragment) {
            this.f88497a = similarMusicFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m109317a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m109317a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            ((DmtStatusView) this.f88497a.mo86459a((int) R.id.dav)).mo25936b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$o */
    static final class C33912o extends Lambda implements C7563m<SimilarMusicListState, Bundle, SimilarMusicListState> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicFragment f88498a;

        C33912o(SimilarMusicFragment similarMusicFragment) {
            this.f88498a = similarMusicFragment;
            super(2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SimilarMusicListState invoke(SimilarMusicListState similarMusicListState, Bundle bundle) {
            C7573i.m23587b(similarMusicListState, "$receiver");
            this.f88498a.mo86563a(this.f88498a.getArguments());
            String str = this.f88498a.f88460j;
            if (str == null) {
                str = "";
            }
            return SimilarMusicListState.copy$default(similarMusicListState, str, null, 2, null);
        }
    }

    /* renamed from: a */
    public final View mo86459a(int i) {
        if (this.f88472w == null) {
            this.f88472w = new HashMap();
        }
        View view = (View) this.f88472w.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f88472w.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final String mo86465g() {
        return "similar_song";
    }

    /* renamed from: o */
    public final void mo86471o() {
        if (this.f88472w != null) {
            this.f88472w.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo86471o();
    }

    /* renamed from: p */
    public final SimilarMusicListViewModel mo86573p() {
        return (SimilarMusicListViewModel) this.f88471v.getValue();
    }

    public final void onPause() {
        super.onPause();
        m109284t();
    }

    public final void onResume() {
        super.onResume();
        if (!this.f88470u) {
            m109285u();
        }
    }

    /* renamed from: q */
    public final void mo86574q() {
        mo86573p().f88700e.mo29082b();
    }

    /* renamed from: u */
    private final void m109285u() {
        C1293v e = ((RecyclerView) mo86459a((int) R.id.cxi)).mo5572e(this.f88467r);
        if (e instanceof C33927a) {
            ((C33927a) e).bs_();
        }
    }

    public SimilarMusicFragment() {
        C7563m oVar = new C33912o(this);
        C7584c a = C7575l.m23595a(SimilarMusicListViewModel.class);
        C7561a similarMusicFragment$$special$$inlined$viewModel$1 = new SimilarMusicFragment$$special$$inlined$viewModel$1(a);
        this.f88471v = new lifecycleAwareLazy(this, similarMusicFragment$$special$$inlined$viewModel$1, new SimilarMusicFragment$$special$$inlined$viewModel$2(this, similarMusicFragment$$special$$inlined$viewModel$1, a, oVar));
    }

    /* renamed from: s */
    private final void m109283s() {
        ListMiddleware<SimilarMusicListState, C34015d, C34012a> listMiddleware = mo86573p().f88700e;
        C11502e eVar = this;
        SimilarMusicListAdapter similarMusicListAdapter = this.f88461k;
        if (similarMusicListAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        ListMiddleware.m33938a(listMiddleware, eVar, similarMusicListAdapter, false, false, new C33900e(new C33902g(this), new C33903h(this), new C33904i(this)), new C33901f(new C33906j(this), new C33907k(this), new C33908l(this)), new C33910m(this), new C33911n(this), null, null, 780, null);
    }

    /* renamed from: t */
    private final void m109284t() {
        RecyclerView recyclerView = (RecyclerView) mo86459a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView, "rv_list");
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int j = ((LinearLayoutManager) layoutManager).mo5445j();
            RecyclerView recyclerView2 = (RecyclerView) mo86459a((int) R.id.cxi);
            C7573i.m23582a((Object) recyclerView2, "rv_list");
            C1273i layoutManager2 = recyclerView2.getLayoutManager();
            if (layoutManager2 != null) {
                int l = ((LinearLayoutManager) layoutManager2).mo5447l();
                if (j <= l) {
                    while (true) {
                        if (j >= 0) {
                            SimilarMusicListAdapter similarMusicListAdapter = this.f88461k;
                            if (similarMusicListAdapter == null) {
                                C7573i.m23583a("mAdapter");
                            }
                            if (j < similarMusicListAdapter.getItemCount()) {
                                C1293v e = ((RecyclerView) mo86459a((int) R.id.cxi)).mo5572e(j);
                                if (e instanceof C33927a) {
                                    ((C33927a) e).br_();
                                }
                            }
                        }
                        if (j != l) {
                            j++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }

    /* renamed from: r */
    private final void m109282r() {
        DmtStatusView dmtStatusView = (DmtStatusView) mo86459a((int) R.id.dav);
        C7573i.m23582a((Object) dmtStatusView, "status_view");
        m109279a(dmtStatusView);
        this.f88461k = new SimilarMusicListAdapter(this);
        SimilarMusicListAdapter similarMusicListAdapter = this.f88461k;
        if (similarMusicListAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        similarMusicListAdapter.mo86584a((C33924a) this);
        SimilarMusicListAdapter similarMusicListAdapter2 = this.f88461k;
        if (similarMusicListAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        similarMusicListAdapter2.mo66516d(false);
        SimilarMusicListAdapter similarMusicListAdapter3 = this.f88461k;
        if (similarMusicListAdapter3 == null) {
            C7573i.m23583a("mAdapter");
        }
        similarMusicListAdapter3.mo66504a((C6905a) new C33898c(this));
        RecyclerView recyclerView = (RecyclerView) mo86459a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView, "rv_list");
        SimilarMusicListAdapter similarMusicListAdapter4 = this.f88461k;
        if (similarMusicListAdapter4 == null) {
            C7573i.m23583a("mAdapter");
        }
        recyclerView.setAdapter(similarMusicListAdapter4);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo5427b(1);
        RecyclerView recyclerView2 = (RecyclerView) mo86459a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView2, "rv_list");
        recyclerView2.setLayoutManager(wrapLinearLayoutManager);
        ((RecyclerView) mo86459a((int) R.id.cxi)).mo5525a((C1272h) new SimilarMusicItemDecoration());
        BooleanRef booleanRef = new BooleanRef();
        booleanRef.element = false;
        ((RecyclerView) mo86459a((int) R.id.cxi)).mo5527a((C1280l) new SimilarMusicFragment$initView$2(this));
        ((RecyclerView) mo86459a((int) R.id.cxi)).mo5528a((C1281m) new SimilarMusicFragment$initView$3(this, booleanRef));
        m109283s();
        String string = getString(R.string.chq);
        C7573i.m23582a((Object) string, "getString(R.string.music_similar_sounds)");
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) mo86459a((int) R.id.djz);
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(" - ");
        sb.append(this.f88464o);
        buttonTitleBar.setTitle((CharSequence) sb.toString());
        ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) mo86459a((int) R.id.djz);
        C7573i.m23582a((Object) buttonTitleBar2, "title_bar");
        buttonTitleBar2.getStartBtn().setOnClickListener(new C33899d(this));
    }

    /* renamed from: a */
    public final void mo86566a(boolean z) {
        this.f88470u = z;
    }

    /* renamed from: a */
    public static final /* synthetic */ SimilarMusicListAdapter m109278a(SimilarMusicFragment similarMusicFragment) {
        SimilarMusicListAdapter similarMusicListAdapter = similarMusicFragment.f88461k;
        if (similarMusicListAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        return similarMusicListAdapter;
    }

    /* renamed from: a */
    private void m109279a(DmtStatusView dmtStatusView) {
        C7573i.m23587b(dmtStatusView, "statusView");
        C10803a b = C10803a.m31631a((Context) getActivity()).mo25964b(C43361b.m137644a(getActivity(), new C33897b(this)));
        C7573i.m23582a((Object) b, "DmtStatusView.Builder.cr…orViewStatus(errorStatus)");
        this.f88469t = b;
        if (C6399b.m19944t()) {
            MtEmptyView a = MtEmptyView.m31657a((Context) getActivity());
            a.setStatus(new C10806a(getActivity()).mo25985a((int) R.drawable.ail).mo25990b((int) R.string.chs).mo25993c(R.string.chr).f29135a);
            C10803a aVar = this.f88469t;
            if (aVar == null) {
                C7573i.m23583a("mStatusViewBuilder");
            }
            aVar.mo25963b((View) a);
        }
        C10803a aVar2 = this.f88469t;
        if (aVar2 == null) {
            C7573i.m23583a("mStatusViewBuilder");
        }
        dmtStatusView.setBuilder(aVar2);
    }

    /* renamed from: d */
    private final float m109281d(int i) {
        try {
            RecyclerView recyclerView = (RecyclerView) mo86459a((int) R.id.cxi);
            C7573i.m23582a((Object) recyclerView, "rv_list");
            C1273i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                int j = ((LinearLayoutManager) layoutManager).mo5445j();
                RecyclerView recyclerView2 = (RecyclerView) mo86459a((int) R.id.cxi);
                C7573i.m23582a((Object) recyclerView2, "rv_list");
                C1273i layoutManager2 = recyclerView2.getLayoutManager();
                if (layoutManager2 != null) {
                    View c = ((LinearLayoutManager) layoutManager2).mo5432c(j);
                    if (j >= 0) {
                        if (c != null) {
                            return (((float) (j * i)) + 0.0f) - c.getY();
                        }
                    }
                    return 0.0f;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* renamed from: a */
    private final void m109280a(Music music) {
        Object obj;
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
        if (curUser.isLive()) {
            C10761a.m31409e(getContext(), (int) R.string.bvo).mo25750a();
            return;
        }
        IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
        C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
        if (publishService.isPublishing()) {
            C10761a.m31409e(getContext(), (int) R.string.ig).mo25750a();
        } else if (music == null || TextUtils.isEmpty(music.getOwnerBanShowInfo())) {
            String uuid = UUID.randomUUID().toString();
            C7573i.m23582a((Object) uuid, "UUID.randomUUID().toString()");
            C22984d a = C22984d.m75611a().mo59973a("creation_id", uuid).mo59973a("shoot_way", "similar_song");
            String str = "music_id";
            MusicModel musicModel = null;
            if (music != null) {
                obj = Long.valueOf(music.getId());
            } else {
                obj = null;
            }
            C6907h.m21524a("shoot", (Map) a.mo59972a(str, obj).f60753a);
            mo86460a(new C33963h(this.f88251g, getActivity(), this));
            C33963h n = mo86470n();
            if (music != null) {
                musicModel = music.convertToMusicModel();
            }
            n.mo86626a(musicModel);
        } else {
            C10761a.m31403c(getContext(), music.getOwnerBanShowInfo()).mo25750a();
        }
    }

    /* renamed from: b */
    public final void mo86567b(int i) {
        RecyclerView recyclerView = (RecyclerView) mo86459a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView, "rv_list");
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int j = ((LinearLayoutManager) layoutManager).mo5445j();
            float d = m109281d(i);
            float f = (float) i;
            float f2 = d % f;
            C1293v e = ((RecyclerView) mo86459a((int) R.id.cxi)).mo5572e(j);
            if (e != null && (e instanceof SimilarMusicListViewHolder)) {
                SimilarMusicListAdapter similarMusicListAdapter = this.f88461k;
                if (similarMusicListAdapter == null) {
                    C7573i.m23583a("mAdapter");
                }
                double g = (double) (f - similarMusicListAdapter.mo86586g());
                SimilarMusicListAdapter similarMusicListAdapter2 = this.f88461k;
                if (similarMusicListAdapter2 == null) {
                    C7573i.m23583a("mAdapter");
                }
                double g2 = (double) similarMusicListAdapter2.mo86586g();
                Double.isNaN(g2);
                double d2 = g2 * 0.05d;
                Double.isNaN(g);
                if (((double) f2) >= g + d2) {
                    ((SimilarMusicListViewHolder) e).mo62390p();
                    C1293v e2 = ((RecyclerView) mo86459a((int) R.id.cxi)).mo5572e(j + 1);
                    if (e2 != null && (e2 instanceof SimilarMusicListViewHolder)) {
                        ((SimilarMusicListViewHolder) e2).bs_();
                        return;
                    }
                } else if (f2 >= 0.0f) {
                    ((SimilarMusicListViewHolder) e).bs_();
                    C1293v e3 = ((RecyclerView) mo86459a((int) R.id.cxi)).mo5572e(j + 1);
                    if (e3 != null && (e3 instanceof SimilarMusicListViewHolder)) {
                        ((SimilarMusicListViewHolder) e3).mo62390p();
                    }
                } else {
                    return;
                }
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    /* renamed from: c */
    public final int mo86569c(int i) {
        RecyclerView recyclerView = (RecyclerView) mo86459a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView, "rv_list");
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int l = ((LinearLayoutManager) layoutManager).mo5447l();
            int d = (int) m109281d(i);
            SimilarMusicListAdapter similarMusicListAdapter = this.f88461k;
            if (similarMusicListAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            if (l != similarMusicListAdapter.getItemCount() - 1) {
                return 0;
            }
            RecyclerView recyclerView2 = (RecyclerView) mo86459a((int) R.id.cxi);
            C7573i.m23582a((Object) recyclerView2, "rv_list");
            if ((recyclerView2.getHeight() + d) % i == 0) {
                this.f88462l = true;
                return i;
            }
            if (!this.f88462l) {
                RecyclerView recyclerView3 = (RecyclerView) mo86459a((int) R.id.cxi);
                C7573i.m23582a((Object) recyclerView3, "rv_list");
                if ((recyclerView3.getHeight() + d) % i <= ((int) C33985a.m109465a())) {
                    RecyclerView recyclerView4 = (RecyclerView) mo86459a((int) R.id.cxi);
                    C7573i.m23582a((Object) recyclerView4, "rv_list");
                    return i + ((d + recyclerView4.getHeight()) % i);
                }
            }
            RecyclerView recyclerView5 = (RecyclerView) mo86459a((int) R.id.cxi);
            C7573i.m23582a((Object) recyclerView5, "rv_list");
            return (d + recyclerView5.getHeight()) % i;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    /* renamed from: a */
    public final void mo86563a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (bundle != null) {
            str = bundle.getString("music_id");
        } else {
            str = null;
        }
        this.f88460j = str;
        if (bundle != null) {
            str2 = bundle.getString("music_title");
        } else {
            str2 = null;
        }
        this.f88464o = str2;
        if (bundle != null) {
            str3 = bundle.getString("anthor_id");
        } else {
            str3 = null;
        }
        this.f88466q = str3;
        if (bundle != null) {
            str4 = bundle.getString("enter_type");
        }
        this.f88465p = str4;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m109282r();
    }

    /* renamed from: a */
    public final void mo86565a(Music music, int i) {
        String str;
        String str2 = null;
        if (music != null) {
            str = music.getMid();
        } else {
            str = null;
        }
        if (music != null) {
            str2 = music.getOwnerId();
        }
        C33953a.m109419d(str, str2, this.f88460j, this.f88466q);
    }

    /* renamed from: b */
    public final void mo86568b(Music music, int i) {
        String str;
        String str2 = null;
        if (music != null) {
            str = music.getMid();
        } else {
            str = null;
        }
        if (music != null) {
            str2 = music.getOwnerId();
        }
        C33953a.m109418c(str, str2, this.f88460j, this.f88466q);
    }

    /* renamed from: c */
    public final void mo86570c(Music music, int i) {
        String str;
        String str2 = this.f88460j;
        String str3 = this.f88466q;
        String str4 = null;
        if (music != null) {
            str = music.getMid();
        } else {
            str = null;
        }
        if (music != null) {
            str4 = music.getOwnerId();
        }
        C33953a.m109414a(str2, str3, str, str4);
    }

    /* renamed from: e */
    public final void mo86572e(Music music, int i) {
        String str;
        String str2;
        String str3 = null;
        if (music != null) {
            str = music.getMid();
        } else {
            str = null;
        }
        if (music != null) {
            str2 = music.getOwnerId();
        } else {
            str2 = null;
        }
        C33953a.m109417b(str, str2, this.f88460j, this.f88466q);
        Intent intent = new Intent(getActivity(), MusicDetailActivity.class);
        String str4 = "id";
        if (music != null) {
            str3 = music.getMid();
        }
        intent.putExtra(str4, str3);
        intent.putExtra("extra_music_from", "similar_song");
        intent.putExtra("click_reason", 3);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    /* renamed from: d */
    public final void mo86571d(Music music, int i) {
        if (music == null || ((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(music.convertToMusicModel(), getContext(), true)) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            User curUser = f.getCurUser();
            C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
            if (curUser.isLive()) {
                C10761a.m31409e(getContext(), (int) R.string.bvo).mo25750a();
                return;
            }
            IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
            C7573i.m23582a((Object) publishService, "ServiceManager.get().get…ss.java).publishService()");
            if (publishService.isPublishing()) {
                C10761a.m31409e(getContext(), (int) R.string.ig).mo25750a();
            } else if (music == null || TextUtils.isEmpty(music.getOwnerBanShowInfo())) {
                m109280a(music);
            } else {
                C10761a.m31403c(getContext(), music.getOwnerBanShowInfo()).mo25750a();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.qy, viewGroup, false);
        ButterKnife.bind(inflate);
        return inflate;
    }

    /* renamed from: a */
    public final void mo86564a(Aweme aweme, int i, int i2) {
        String str;
        this.f88467r = i;
        this.f88468s = i2;
        StringBuilder sb = new StringBuilder("SimilarMusicFragment onVideoPaly: ");
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(" pos:");
        sb.append(i);
        sb.append(" pos2:");
        sb.append(i2);
        RecyclerView recyclerView = (RecyclerView) mo86459a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView, "rv_list");
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int j = ((LinearLayoutManager) layoutManager).mo5445j();
            RecyclerView recyclerView2 = (RecyclerView) mo86459a((int) R.id.cxi);
            C7573i.m23582a((Object) recyclerView2, "rv_list");
            C1273i layoutManager2 = recyclerView2.getLayoutManager();
            if (layoutManager2 != null) {
                int l = ((LinearLayoutManager) layoutManager2).mo5447l();
                if (j <= l) {
                    while (true) {
                        if (j >= 0) {
                            SimilarMusicListAdapter similarMusicListAdapter = this.f88461k;
                            if (similarMusicListAdapter == null) {
                                C7573i.m23583a("mAdapter");
                            }
                            if (j < similarMusicListAdapter.getItemCount()) {
                                C1293v e = ((RecyclerView) mo86459a((int) R.id.cxi)).mo5572e(j);
                                if (e instanceof C33927a) {
                                    ((C33927a) e).mo86587a(i, i2);
                                }
                            }
                        }
                        if (j != l) {
                            j++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }
}
