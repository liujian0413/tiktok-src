package com.p280ss.android.ugc.aweme.discover.p1187v3.viewmodel;

import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11649l;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi.DiscoverService;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryV3CellListResponse;
import com.p280ss.android.ugc.aweme.discover.p1187v3.adapter.DiscoverAdapterV3;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3 */
public final class DiscoverViewModelV3 extends JediViewModel<DiscoverStateV3> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f71552c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverViewModelV3.class), "halfScreenWidth", "getHalfScreenWidth()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverViewModelV3.class), "maxCellHeight", "getMaxCellHeight()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverViewModelV3.class), "minCellHeight", "getMinCellHeight()I"))};

    /* renamed from: i */
    public static final C27139a f71553i = new C27139a(null);

    /* renamed from: d */
    public final List<Integer> f71554d;

    /* renamed from: e */
    public final List<DiscoveryCellStructV3> f71555e;

    /* renamed from: f */
    public final List<DiscoveryCellStructV3> f71556f;

    /* renamed from: g */
    public final List<DiscoveryCellStructV3> f71557g;

    /* renamed from: h */
    public final ListMiddleware<DiscoverStateV3, DiscoveryCellStructV3, C11583n> f71558h;

    /* renamed from: j */
    private final C7541d f71559j;

    /* renamed from: k */
    private final C7541d f71560k;

    /* renamed from: l */
    private final C7541d f71561l;

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$a */
    public static final class C27139a {
        private C27139a() {
        }

        public /* synthetic */ C27139a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$b */
    static final class C27140b<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C27140b f71562a = new C27140b();

        C27140b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m89020a((DiscoveryV3CellListResponse) obj);
        }

        /* renamed from: a */
        private static Pair<List<DiscoveryCellStructV3>, C11583n> m89020a(DiscoveryV3CellListResponse discoveryV3CellListResponse) {
            C7573i.m23587b(discoveryV3CellListResponse, "resp");
            List<DiscoveryCellStructV3> list = discoveryV3CellListResponse.cells;
            if (list == null) {
                list = C7525m.m23461a();
            }
            for (DiscoveryCellStructV3 discoveryCellStructV3 : list) {
                discoveryCellStructV3.logPb = discoveryV3CellListResponse.logPb;
                List<Aweme> list2 = discoveryCellStructV3.awemes;
                if (list2 != null) {
                    for (Aweme aweme : list2) {
                        aweme.setRequestId(discoveryV3CellListResponse.logPb.getImprId());
                        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                    }
                }
            }
            boolean z = true;
            if (discoveryV3CellListResponse.hasMore != 1) {
                z = false;
            }
            return C7579l.m23633a(list, new C11583n(z, discoveryV3CellListResponse.nextCursor));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$c */
    static final class C27141c extends Lambda implements C7562b<DiscoverStateV3, C7319aa<Pair<? extends List<? extends DiscoveryCellStructV3>, ? extends C11583n>>> {

        /* renamed from: a */
        public static final C27141c f71563a = new C27141c();

        C27141c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m89021a((DiscoverStateV3) obj);
        }

        /* renamed from: a */
        private static C7319aa<Pair<List<DiscoveryCellStructV3>, C11583n>> m89021a(DiscoverStateV3 discoverStateV3) {
            C7573i.m23587b(discoverStateV3, "state");
            DiscoverService a = DiscoverApi.m87295a();
            int i = discoverStateV3.getCells().getPayload().f31255b;
            C7573i.m23582a((Object) C7213d.m22500a(), "AbTestManager.getInstance()");
            C7319aa<Pair<List<DiscoveryCellStructV3>, C11583n>> a2 = C7319aa.m22929a((C7496w<? extends T>) a.cellListV3(i, 8, C7213d.m22501aV()).mo19304b(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) C271421.f71564a));
            C7573i.m23582a((Object) a2, "Single.fromObservable(\n …      }\n                )");
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$d */
    static final class C27143d extends Lambda implements C7563m<List<? extends DiscoveryCellStructV3>, List<? extends DiscoveryCellStructV3>, List<? extends DiscoveryCellStructV3>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModelV3 f71565a;

        C27143d(DiscoverViewModelV3 discoverViewModelV3) {
            this.f71565a = discoverViewModelV3;
            super(2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<DiscoveryCellStructV3> invoke(List<DiscoveryCellStructV3> list, List<DiscoveryCellStructV3> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "refresh");
            if (list2.isEmpty()) {
                return list;
            }
            this.f71565a.f71556f.clear();
            Collections.fill(this.f71565a.f71554d, Integer.valueOf(0));
            Collections.fill(this.f71565a.f71555e, null);
            this.f71565a.f71556f.addAll(list2);
            return this.f71565a.mo69917a(new ArrayList(), this.f71565a.f71556f, this.f71565a.f71554d, this.f71565a.f71555e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$e */
    static final class C27144e extends Lambda implements C7563m<List<? extends DiscoveryCellStructV3>, List<? extends DiscoveryCellStructV3>, List<? extends DiscoveryCellStructV3>> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModelV3 f71566a;

        C27144e(DiscoverViewModelV3 discoverViewModelV3) {
            this.f71566a = discoverViewModelV3;
            super(2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<DiscoveryCellStructV3> invoke(List<DiscoveryCellStructV3> list, List<DiscoveryCellStructV3> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "loadMore");
            this.f71566a.f71556f.addAll(list2);
            return this.f71566a.mo69917a(C7525m.m23509d((Collection<? extends T>) this.f71566a.mo69916a(list)), this.f71566a.f71556f, this.f71566a.f71554d, this.f71566a.f71555e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$f */
    static final class C27145f extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C27145f f71567a = new C27145f();

        C27145f() {
            super(0);
        }

        /* renamed from: a */
        private static int m89025a() {
            return C9738o.m28691a(C6399b.m19921a()) / 2;
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m89025a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$g */
    static final class C27146g extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModelV3 f71568a;

        C27146g(DiscoverViewModelV3 discoverViewModelV3) {
            this.f71568a = discoverViewModelV3;
            super(0);
        }

        /* renamed from: a */
        private int m89026a() {
            return (this.f71568a.mo29069f() * 16) / 9;
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m89026a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$h */
    static final class C27147h extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModelV3 f71569a;

        C27147h(DiscoverViewModelV3 discoverViewModelV3) {
            this.f71569a = discoverViewModelV3;
            super(0);
        }

        /* renamed from: a */
        private int m89027a() {
            return (this.f71569a.mo29069f() * 7) / 9;
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m89027a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$i */
    static final class C27148i extends Lambda implements C7563m<DiscoverStateV3, ListState<DiscoveryCellStructV3, C11583n>, DiscoverStateV3> {

        /* renamed from: a */
        public static final C27148i f71570a = new C27148i();

        C27148i() {
            super(2);
        }

        /* renamed from: a */
        private static DiscoverStateV3 m89028a(DiscoverStateV3 discoverStateV3, ListState<DiscoveryCellStructV3, C11583n> listState) {
            C7573i.m23587b(discoverStateV3, "$receiver");
            C7573i.m23587b(listState, "it");
            return discoverStateV3.copy(listState);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m89028a((DiscoverStateV3) obj, (ListState) obj2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewmodel.DiscoverViewModelV3$j */
    static final class C27149j extends Lambda implements C7562b<DiscoverStateV3, C7581n> {

        /* renamed from: a */
        final /* synthetic */ DiscoverViewModelV3 f71571a;

        /* renamed from: b */
        final /* synthetic */ DiscoveryCellStructV3 f71572b;

        /* renamed from: c */
        final /* synthetic */ DiscoverAdapterV3 f71573c;

        C27149j(DiscoverViewModelV3 discoverViewModelV3, DiscoveryCellStructV3 discoveryCellStructV3, DiscoverAdapterV3 discoverAdapterV3) {
            this.f71571a = discoverViewModelV3;
            this.f71572b = discoveryCellStructV3;
            this.f71573c = discoverAdapterV3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m89029a((DiscoverStateV3) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m89029a(final DiscoverStateV3 discoverStateV3) {
            C7573i.m23587b(discoverStateV3, "state");
            this.f71571a.f71557g.add(this.f71572b);
            if (!(discoverStateV3.getCells().getRefresh() instanceof C11649l)) {
                this.f71571a.mo29038c(new C7562b<DiscoverStateV3, DiscoverStateV3>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C27149j f71574a;

                    {
                        this.f71574a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public DiscoverStateV3 invoke(DiscoverStateV3 discoverStateV3) {
                        C7573i.m23587b(discoverStateV3, "$receiver");
                        return discoverStateV3.copy(ListState.copy$default(discoverStateV3.getCells(), null, this.f71574a.f71571a.mo69916a(discoverStateV3.getCells().getList()), null, null, null, 29, null));
                    }
                });
                this.f71571a.mo29036b(new C7562b<DiscoverStateV3, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C27149j f71576a;

                    {
                        this.f71576a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m89031a((DiscoverStateV3) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m89031a(DiscoverStateV3 discoverStateV3) {
                        C7573i.m23587b(discoverStateV3, "it");
                        this.f71576a.f71573c.mo60555a(discoverStateV3.getCells().getList());
                    }
                });
            }
        }
    }

    /* renamed from: g */
    private final int m89011g() {
        return ((Number) this.f71560k.getValue()).intValue();
    }

    /* renamed from: h */
    private final int m89012h() {
        return ((Number) this.f71561l.getValue()).intValue();
    }

    /* renamed from: f */
    public final int mo29069f() {
        return ((Number) this.f71559j.getValue()).intValue();
    }

    /* renamed from: i */
    private static DiscoverStateV3 m89013i() {
        return new DiscoverStateV3(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m89013i();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        this.f71558h.mo29186a(C27152a.f71577a, (C7563m<? super S, ? super PROP, ? extends S>) C27148i.f71570a);
        mo29033a(this.f71558h);
        this.f71558h.mo29082b();
    }

    public DiscoverViewModelV3() {
        C7562b bVar;
        ArrayList arrayList = new ArrayList(2);
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList.add(Integer.valueOf(0));
        }
        this.f71554d = arrayList;
        ArrayList arrayList2 = new ArrayList(2);
        while (true) {
            bVar = null;
            if (i >= 2) {
                break;
            }
            arrayList2.add(null);
            i++;
        }
        this.f71555e = arrayList2;
        this.f71556f = new ArrayList();
        this.f71557g = new ArrayList();
        this.f71559j = C7546e.m23569a(C27145f.f71567a);
        this.f71560k = C7546e.m23569a(new C27146g(this));
        this.f71561l = C7546e.m23569a(new C27147h(this));
        C7562b bVar2 = C27141c.f71563a;
        C7563m dVar = new C27143d(this);
        C7563m eVar = new C27144e(this);
        C7562b discoverViewModelV3$$special$$inlined$SingleListMiddleware$1 = new DiscoverViewModelV3$$special$$inlined$SingleListMiddleware$1();
        if (bVar2 != null) {
            bVar = new DiscoverViewModelV3$$special$$inlined$SingleListMiddleware$2(bVar2);
        }
        this.f71558h = new ListMiddleware<>(discoverViewModelV3$$special$$inlined$SingleListMiddleware$1, bVar, dVar, eVar);
    }

    /* renamed from: a */
    public final List<DiscoveryCellStructV3> mo69916a(List<DiscoveryCellStructV3> list) {
        for (DiscoveryCellStructV3 a : this.f71557g) {
            list = m89009a(list, a);
        }
        this.f71557g.clear();
        return list;
    }

    /* renamed from: a */
    private final void m89010a(DiscoveryCellStructV3 discoveryCellStructV3) {
        boolean z;
        int i;
        discoveryCellStructV3.displayWidth = mo29069f();
        C7213d.m22500a();
        if (C7213d.m22501aV() == 2) {
            discoveryCellStructV3.displayHeight = m89011g();
            return;
        }
        Collection collection = discoveryCellStructV3.awemes;
        boolean z2 = false;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Aweme aweme = (Aweme) C7525m.m23511f(discoveryCellStructV3.awemes);
            if (aweme.getVideo() != null) {
                Video video = aweme.getVideo();
                C7573i.m23582a((Object) video, "aweme.video");
                int height = video.getHeight() * mo29069f();
                Video video2 = aweme.getVideo();
                C7573i.m23582a((Object) video2, "aweme.video");
                i = height / video2.getWidth();
            } else {
                Collection imageInfos = aweme.getImageInfos();
                if (imageInfos == null || imageInfos.isEmpty()) {
                    z2 = true;
                }
                if (!z2) {
                    List imageInfos2 = aweme.getImageInfos();
                    C7573i.m23582a((Object) imageInfos2, "aweme.imageInfos");
                    Object f = C7525m.m23511f(imageInfos2);
                    C7573i.m23582a(f, "aweme.imageInfos.first()");
                    int height2 = ((ImageInfo) f).getHeight() * mo29069f();
                    List imageInfos3 = aweme.getImageInfos();
                    C7573i.m23582a((Object) imageInfos3, "aweme.imageInfos");
                    Object f2 = C7525m.m23511f(imageInfos3);
                    C7573i.m23582a(f2, "aweme.imageInfos.first()");
                    i = height2 / ((ImageInfo) f2).getWidth();
                }
            }
            discoveryCellStructV3.displayHeight = m89007a(i, m89012h(), m89011g());
        }
        i = mo29069f();
        discoveryCellStructV3.displayHeight = m89007a(i, m89012h(), m89011g());
    }

    /* renamed from: a */
    public final void mo69918a(DiscoveryCellStructV3 discoveryCellStructV3, DiscoverAdapterV3 discoverAdapterV3) {
        C7573i.m23587b(discoveryCellStructV3, "cell");
        C7573i.m23587b(discoverAdapterV3, "adapter");
        mo29036b(new C27149j(this, discoveryCellStructV3, discoverAdapterV3));
    }

    /* renamed from: a */
    private final List<DiscoveryCellStructV3> m89009a(List<DiscoveryCellStructV3> list, DiscoveryCellStructV3 discoveryCellStructV3) {
        int i;
        List<DiscoveryCellStructV3> list2 = list;
        DiscoveryCellStructV3 discoveryCellStructV32 = discoveryCellStructV3;
        int size = list.size();
        int i2 = discoveryCellStructV32.idx;
        if (i2 < 0 || size <= i2) {
            return list2;
        }
        DiscoveryCellStructV3 discoveryCellStructV33 = (DiscoveryCellStructV3) list2.get(discoveryCellStructV32.idx);
        if (!C7573i.m23585a((Object) discoveryCellStructV33.cellID, (Object) discoveryCellStructV32.cellID)) {
            return list2;
        }
        m89010a(discoveryCellStructV32);
        DiscoveryCellStructV3 copy$default = DiscoveryCellStructV3.copy$default(discoveryCellStructV33, null, null, 0, discoveryCellStructV32.awemes, null, discoveryCellStructV32.displayWidth, discoveryCellStructV32.displayHeight, 0, 0, null, 919, null);
        if (discoveryCellStructV33.displayHeight == copy$default.displayHeight) {
            this.f71558h.mo29078a(discoveryCellStructV32.idx, copy$default);
            return list2;
        }
        Collections.fill(this.f71554d, Integer.valueOf(0));
        Collections.fill(this.f71555e, null);
        List<DiscoveryCellStructV3> subList = list2.subList(0, discoveryCellStructV32.idx);
        for (DiscoveryCellStructV3 discoveryCellStructV34 : subList) {
            if (((Number) this.f71554d.get(0)).intValue() > ((Number) this.f71554d.get(1)).intValue()) {
                i = 1;
            } else {
                i = 0;
            }
            this.f71555e.set(i, discoveryCellStructV34);
            List<Integer> list3 = this.f71554d;
            list3.set(i, Integer.valueOf(((Number) list3.get(i)).intValue() + discoveryCellStructV34.displayHeight));
        }
        this.f71556f.add(copy$default);
        this.f71556f.addAll(list2.subList(discoveryCellStructV32.idx + 1, list.size()));
        return mo69917a(C7525m.m23509d((Collection<? extends T>) subList), this.f71556f, this.f71554d, this.f71555e);
    }

    /* renamed from: a */
    private static int m89007a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    private static DiscoveryCellStructV3 m89008a(List<DiscoveryCellStructV3> list, List<Integer> list2, List<DiscoveryCellStructV3> list3) {
        for (DiscoveryCellStructV3 discoveryCellStructV3 : list) {
            int i = 0;
            if (((Number) list2.get(0)).intValue() > ((Number) list2.get(1)).intValue()) {
                i = 1;
            }
            C7573i.m23582a((Object) C7213d.m22500a(), "AbTestManager.getInstance()");
            if (C7213d.m22501aV() != 2) {
                DiscoveryCellStructV3 discoveryCellStructV32 = (DiscoveryCellStructV3) list3.get(i);
                if (discoveryCellStructV32 == null || discoveryCellStructV32.type == 3) {
                    return discoveryCellStructV3;
                }
                if (discoveryCellStructV3.type == 3) {
                    return discoveryCellStructV3;
                }
            } else if (((DiscoveryCellStructV3) list3.get(i)) != null) {
                return discoveryCellStructV3;
            } else {
                return discoveryCellStructV3;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final List<DiscoveryCellStructV3> mo69917a(List<DiscoveryCellStructV3> list, List<DiscoveryCellStructV3> list2, List<Integer> list3, List<DiscoveryCellStructV3> list4) {
        DiscoveryCellStructV3 a = m89008a(list2, list3, list4);
        while (a != null) {
            if (((Number) list3.get(0)).intValue() > ((Number) list3.get(1)).intValue()) {
                list3.set(1, Integer.valueOf(((Number) list3.get(1)).intValue() + a.displayHeight));
                list4.set(1, a);
            } else {
                list3.set(0, Integer.valueOf(((Number) list3.get(0)).intValue() + a.displayHeight));
                list4.set(0, a);
            }
            m89010a(a);
            list2.remove(a);
            list.add(a);
            a = m89008a(list2, list3, list4);
        }
        return list;
    }
}
