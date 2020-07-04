package com.p280ss.android.ugc.aweme.discover.p1189v4.viewmodel;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.jedi.arch.C11649l;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlaylistUpdateParam;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverTrendingReponseV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.DiscoverV4DataObserver;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse;
import com.p280ss.android.ugc.aweme.discover.p1189v4.adapter.DiscoverV4PlayListAdapter;
import com.p280ss.android.ugc.aweme.experiment.DiscoveryV4Experiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7496w;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel */
public final class DiscoverV4PlayListViewModel extends JediViewModel<DiscoverStateV4> implements DiscoverV4DataObserver {

    /* renamed from: g */
    public static final C27212a f71706g = new C27212a(null);

    /* renamed from: c */
    public final DiscoverV4PlayListDataCenter f71707c = DiscoverV4PlayListDataCenter.Companion.getINSTANCE();

    /* renamed from: d */
    public String f71708d = "";

    /* renamed from: e */
    public final List<DiscoverPlaylistUpdateParam> f71709e = new ArrayList();

    /* renamed from: f */
    public final ListMiddleware<DiscoverStateV4, DiscoverPlayListStructV4, C11583n> f71710f;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$a */
    public static final class C27212a {
        private C27212a() {
        }

        public /* synthetic */ C27212a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$b */
    static final class C27213b<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C27213b f71711a = new C27213b();

        C27213b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m89210a((DiscoverV4PlayListResponse) obj);
        }

        /* renamed from: a */
        private static Pair<List<DiscoverPlayListStructV4>, C11583n> m89210a(DiscoverV4PlayListResponse discoverV4PlayListResponse) {
            C7573i.m23587b(discoverV4PlayListResponse, "resp");
            List<DiscoverPlayListStructV4> list = discoverV4PlayListResponse.cells;
            if (list == null) {
                list = C7525m.m23461a();
            }
            for (DiscoverPlayListStructV4 discoverPlayListStructV4 : list) {
                discoverPlayListStructV4.logPb = discoverV4PlayListResponse.logPb;
                List<Aweme> list2 = discoverPlayListStructV4.awemes;
                if (list2 != null) {
                    for (Aweme requestId : list2) {
                        requestId.setRequestId(discoverV4PlayListResponse.logPb.getImprId());
                    }
                }
            }
            boolean z = true;
            if (discoverV4PlayListResponse.hasMore != 1) {
                z = false;
            }
            return C7579l.m23633a(list, new C11583n(z, discoverV4PlayListResponse.nextCursor));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$c */
    static final class C27214c extends Lambda implements C7562b<DiscoverStateV4, C7319aa<Pair<? extends List<? extends DiscoverPlayListStructV4>, ? extends C11583n>>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewModel f71712a;

        C27214c(DiscoverV4PlayListViewModel discoverV4PlayListViewModel) {
            this.f71712a = discoverV4PlayListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7319aa<Pair<List<DiscoverPlayListStructV4>, C11583n>> invoke(DiscoverStateV4 discoverStateV4) {
            C7573i.m23587b(discoverStateV4, "state");
            if (C7573i.m23585a((Object) this.f71712a.f71708d, (Object) DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                C7319aa<Pair<List<DiscoverPlayListStructV4>, C11583n>> a = C7319aa.m22929a((C7496w<? extends T>) DiscoverApi.m87295a().trendingListV4(0, discoverStateV4.getCells().getPayload().f31255b, 8).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C27214c f71713a;

                    {
                        this.f71713a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Pair<List<DiscoverPlayListStructV4>, C11583n> apply(DiscoverTrendingReponseV4 discoverTrendingReponseV4) {
                        C7573i.m23587b(discoverTrendingReponseV4, "resp");
                        List arrayList = new ArrayList();
                        List<Aweme> list = discoverTrendingReponseV4.cells;
                        if (list == null) {
                            list = C7525m.m23461a();
                        }
                        boolean z = false;
                        int i = 0;
                        for (Aweme aweme : list) {
                            Video video = aweme.getVideo();
                            if (video != null) {
                                video.setSourceId(aweme.getAid());
                            }
                            String desc = aweme.getDesc();
                            C7573i.m23582a((Object) desc, "it.desc");
                            DiscoverPlayListStructV4 discoverPlayListStructV4 = new DiscoverPlayListStructV4("", desc, aweme, 2);
                            discoverPlayListStructV4.logPb = discoverTrendingReponseV4.logPb;
                            arrayList.add(discoverPlayListStructV4);
                            aweme.setRequestId(discoverTrendingReponseV4.logPb.getImprId());
                            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                            IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                            StringBuilder sb = new StringBuilder();
                            sb.append(aweme.getAid());
                            sb.append(9001);
                            iRequestIdService.setRequestIdAndIndex(sb.toString(), aweme.getRequestId(), i);
                            i++;
                        }
                        DiscoverV4PlayListDataCenter.Companion.getINSTANCE().loadData(this.f71713a.f71712a.f71708d, new DiscoverV4PlayListResponse(discoverTrendingReponseV4.nextCursor, discoverTrendingReponseV4.hasMore, arrayList, discoverTrendingReponseV4.logPb));
                        if (discoverTrendingReponseV4.hasMore == 1) {
                            z = true;
                        }
                        return C7579l.m23633a(arrayList, new C11583n(z, discoverTrendingReponseV4.nextCursor));
                    }
                }));
                C7573i.m23582a((Object) a, "Single.fromObservable(\n …                       })");
                return a;
            }
            C7319aa<Pair<List<DiscoverPlayListStructV4>, C11583n>> a2 = C7319aa.m22929a((C7496w<? extends T>) DiscoverApi.m87295a().cellListV4(discoverStateV4.getCells().getPayload().f31255b, 8, this.f71712a.f71708d, C6384b.m19835a().mo15287a(DiscoveryV4Experiment.class, true, "discover_v4_type", C6384b.m19835a().mo15295d().discover_v4_type, 0)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C27214c f71714a;

                {
                    this.f71714a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<DiscoverPlayListStructV4>, C11583n> apply(DiscoverV4PlayListResponse discoverV4PlayListResponse) {
                    C7573i.m23587b(discoverV4PlayListResponse, "resp");
                    List<DiscoverPlayListStructV4> list = discoverV4PlayListResponse.cells;
                    if (list == null) {
                        list = C7525m.m23461a();
                    }
                    for (DiscoverPlayListStructV4 discoverPlayListStructV4 : list) {
                        discoverPlayListStructV4.logPb = discoverV4PlayListResponse.logPb;
                        List<Aweme> list2 = discoverPlayListStructV4.awemes;
                        if (list2 != null) {
                            for (Aweme aweme : list2) {
                                Video video = aweme.getVideo();
                                if (video != null) {
                                    video.setSourceId(aweme.getAid());
                                }
                                aweme.setRequestId(discoverV4PlayListResponse.logPb.getImprId());
                                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                            }
                        }
                    }
                    DiscoverV4PlayListDataCenter.Companion.getINSTANCE().loadData(this.f71714a.f71712a.f71708d, discoverV4PlayListResponse);
                    boolean z = true;
                    if (discoverV4PlayListResponse.hasMore != 1) {
                        z = false;
                    }
                    return C7579l.m23633a(list, new C11583n(z, discoverV4PlayListResponse.nextCursor));
                }
            }));
            C7573i.m23582a((Object) a2, "Single.fromObservable(\n …                       })");
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$d */
    static final class C27217d extends Lambda implements C7563m<List<? extends DiscoverPlayListStructV4>, List<? extends DiscoverPlayListStructV4>, List<? extends DiscoverPlayListStructV4>> {

        /* renamed from: a */
        public static final C27217d f71715a = new C27217d();

        C27217d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m89214a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<DiscoverPlayListStructV4> m89214a(List<DiscoverPlayListStructV4> list, List<DiscoverPlayListStructV4> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "refresh");
            if (list2.isEmpty()) {
                return list;
            }
            return list2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$e */
    static final class C27218e extends Lambda implements C7563m<List<? extends DiscoverPlayListStructV4>, List<? extends DiscoverPlayListStructV4>, List<? extends DiscoverPlayListStructV4>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewModel f71716a;

        C27218e(DiscoverV4PlayListViewModel discoverV4PlayListViewModel) {
            this.f71716a = discoverV4PlayListViewModel;
            super(2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<DiscoverPlayListStructV4> invoke(List<DiscoverPlayListStructV4> list, List<DiscoverPlayListStructV4> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "loadMore");
            return DiscoverV4PlayListViewModel.m89202a(C7525m.m23509d((Collection<? extends T>) list), list2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$f */
    static final class C27219f extends Lambda implements C7563m<DiscoverStateV4, ListState<DiscoverPlayListStructV4, C11583n>, DiscoverStateV4> {

        /* renamed from: a */
        public static final C27219f f71717a = new C27219f();

        C27219f() {
            super(2);
        }

        /* renamed from: a */
        private static DiscoverStateV4 m89216a(DiscoverStateV4 discoverStateV4, ListState<DiscoverPlayListStructV4, C11583n> listState) {
            C7573i.m23587b(discoverStateV4, "$receiver");
            C7573i.m23587b(listState, "it");
            return discoverStateV4.copy(listState);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m89216a((DiscoverStateV4) obj, (ListState) obj2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4PlayListViewModel$g */
    static final class C27220g extends Lambda implements C7562b<DiscoverStateV4, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewModel f71718a;

        /* renamed from: b */
        final /* synthetic */ DiscoverPlaylistUpdateParam f71719b;

        /* renamed from: c */
        final /* synthetic */ DiscoverV4PlayListAdapter f71720c;

        C27220g(DiscoverV4PlayListViewModel discoverV4PlayListViewModel, DiscoverPlaylistUpdateParam discoverPlaylistUpdateParam, DiscoverV4PlayListAdapter discoverV4PlayListAdapter) {
            this.f71718a = discoverV4PlayListViewModel;
            this.f71719b = discoverPlaylistUpdateParam;
            this.f71720c = discoverV4PlayListAdapter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m89217a((DiscoverStateV4) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89217a(final DiscoverStateV4 discoverStateV4) {
            C7573i.m23587b(discoverStateV4, "state");
            this.f71718a.f71709e.add(this.f71719b);
            if (!(discoverStateV4.getCells().getRefresh() instanceof C11649l)) {
                this.f71718a.mo29038c(new C7562b<DiscoverStateV4, DiscoverStateV4>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C27220g f71721a;

                    {
                        this.f71721a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public DiscoverStateV4 invoke(DiscoverStateV4 discoverStateV4) {
                        C7573i.m23587b(discoverStateV4, "$receiver");
                        return discoverStateV4.copy(ListState.copy$default(discoverStateV4.getCells(), null, this.f71721a.f71718a.mo69976a(discoverStateV4.getCells().getList()), null, null, null, 29, null));
                    }
                });
                this.f71718a.mo29036b(new C7562b<DiscoverStateV4, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C27220g f71723a;

                    {
                        this.f71723a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m89219a((DiscoverStateV4) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m89219a(DiscoverStateV4 discoverStateV4) {
                        C7573i.m23587b(discoverStateV4, "it");
                        this.f71723a.f71720c.mo60555a(discoverStateV4.getCells().getList());
                    }
                });
            }
        }
    }

    public final void onDataChanged(String str) {
        C7573i.m23587b(str, "tabName");
    }

    /* renamed from: g */
    private static DiscoverStateV4 m89203g() {
        return new DiscoverStateV4(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m89203g();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        this.f71710f.mo29186a(C27229b.f71728a, (C7563m<? super S, ? super PROP, ? extends S>) C27219f.f71717a);
        mo29033a(this.f71710f);
    }

    /* renamed from: f */
    public final void mo29069f() {
        DiscoverV4PlayListDataCenter.Companion.getINSTANCE().removeData(this.f71708d);
        this.f71710f.mo29082b();
    }

    public DiscoverV4PlayListViewModel() {
        C7562b cVar = new C27214c(this);
        this.f71710f = new ListMiddleware<>(new C27223xa6d6cacc(this), new C27227xa6d6cacd(cVar), C27217d.f71715a, new C27218e(this));
    }

    public final void onNeedUpdateData(String str) {
        C7573i.m23587b(str, "tabName");
        this.f71710f.mo29085c();
    }

    /* renamed from: a */
    public final List<DiscoverPlayListStructV4> mo69976a(List<DiscoverPlayListStructV4> list) {
        for (DiscoverPlaylistUpdateParam a : this.f71709e) {
            list = m89201a(list, a);
        }
        this.f71709e.clear();
        return list;
    }

    /* renamed from: a */
    public final void mo69978a(String str) {
        C7573i.m23587b(str, "tabName");
        this.f71708d = str;
        if (TextUtils.equals(str, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
            DiscoverV4PlayListDataCenter.Companion.getINSTANCE().register(this);
        }
        if (DiscoverV4PlayListDataCenter.Companion.getINSTANCE().getData(str) != null) {
            this.f71710f.mo29082b();
        }
    }

    /* renamed from: a */
    public static List<DiscoverPlayListStructV4> m89202a(List<DiscoverPlayListStructV4> list, List<DiscoverPlayListStructV4> list2) {
        list.addAll(list2);
        return list;
    }

    /* renamed from: a */
    public final void mo69977a(DiscoverPlaylistUpdateParam discoverPlaylistUpdateParam, DiscoverV4PlayListAdapter discoverV4PlayListAdapter) {
        C7573i.m23587b(discoverPlaylistUpdateParam, "param");
        C7573i.m23587b(discoverV4PlayListAdapter, "adapter");
        mo29036b(new C27220g(this, discoverPlaylistUpdateParam, discoverV4PlayListAdapter));
    }

    /* renamed from: a */
    private final List<DiscoverPlayListStructV4> m89201a(List<DiscoverPlayListStructV4> list, DiscoverPlaylistUpdateParam discoverPlaylistUpdateParam) {
        String str;
        int size = list.size();
        int i = discoverPlaylistUpdateParam.index;
        if (i < 0 || size <= i) {
            return list;
        }
        DiscoverPlayListStructV4 discoverPlayListStructV4 = (DiscoverPlayListStructV4) list.get(discoverPlaylistUpdateParam.index);
        if (!C7573i.m23585a((Object) discoverPlayListStructV4.cellID, (Object) discoverPlaylistUpdateParam.cellID)) {
            return list;
        }
        List c = C7525m.m23466c(discoverPlaylistUpdateParam.aweme);
        if (discoverPlayListStructV4.type == 2) {
            str = discoverPlaylistUpdateParam.aweme.getDesc();
        } else {
            str = discoverPlayListStructV4.title;
        }
        DiscoverPlayListStructV4 copy$default = DiscoverPlayListStructV4.copy$default(discoverPlayListStructV4, null, str, 0, c, null, null, 53, null);
        this.f71710f.mo29078a(discoverPlaylistUpdateParam.index, copy$default);
        this.f71707c.updateData(discoverPlaylistUpdateParam.tabName, discoverPlaylistUpdateParam.index, copy$default);
        return list;
    }
}
