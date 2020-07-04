package com.p280ss.android.ugc.aweme.mix;

import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11674x;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7579l;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import p346io.reactivex.C47869r;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel */
public final class MixDetailViewModel extends JediViewModel<MixDetailState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f87520c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MixDetailViewModel.class), "mMixDetailRepository", "getMMixDetailRepository()Lcom/ss/android/ugc/aweme/mix/MixDetailRepository;"))};

    /* renamed from: d */
    public volatile int f87521d = 2;

    /* renamed from: e */
    public volatile MixListAdapter f87522e;

    /* renamed from: f */
    public final ListMiddleware<MixDetailState, Aweme, C33567t> f87523f = new ListMiddleware<>(new C33515c(this), new C33520d(this), C33522e.f87543a, new C33523f(this));

    /* renamed from: g */
    public volatile String f87524g;

    /* renamed from: h */
    public volatile MixInfo f87525h;

    /* renamed from: i */
    public volatile boolean f87526i;

    /* renamed from: j */
    public volatile int f87527j = -1;

    /* renamed from: k */
    public volatile boolean f87528k = true;

    /* renamed from: l */
    public volatile boolean f87529l = true;

    /* renamed from: m */
    private final C7541d f87530m = C7546e.m23568a(LazyThreadSafetyMode.NONE, C33514b.f87534a);

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$a */
    static final class C33513a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ MixDetailViewModel f87531a;

        /* renamed from: b */
        final /* synthetic */ int f87532b;

        /* renamed from: c */
        final /* synthetic */ MixDetailState f87533c;

        C33513a(MixDetailViewModel mixDetailViewModel, int i, MixDetailState mixDetailState) {
            this.f87531a = mixDetailViewModel;
            this.f87532b = i;
            this.f87533c = mixDetailState;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<List<Aweme>, C33567t> apply(MixList mixList) {
            boolean z;
            C7573i.m23587b(mixList, "it");
            if (this.f87532b != 2) {
                z = ((C33567t) this.f87533c.getListState().getPayload()).f87663d;
            } else if (mixList.hasMore == 1) {
                z = true;
            } else {
                z = false;
            }
            int min = Math.min((int) mixList.minCursor, ((C33567t) this.f87533c.getListState().getPayload()).f87662c);
            Pair<List<Aweme>, C33567t> a = C7579l.m23633a(mixList.awemeList, new C33567t(true, Math.max((int) mixList.cursor, ((C33567t) this.f87533c.getListState().getPayload()).f31255b), min, z));
            this.f87531a.mo85860a(z, (long) min);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$b */
    static final class C33514b extends Lambda implements C7561a<C33558l> {

        /* renamed from: a */
        public static final C33514b f87534a = new C33514b();

        C33514b() {
            super(0);
        }

        /* renamed from: a */
        private static C33558l m108342a() {
            return new C33558l();
        }

        public final /* synthetic */ Object invoke() {
            return m108342a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$c */
    static final class C33515c extends Lambda implements C7562b<MixDetailState, C7492s<Pair<? extends List<? extends Aweme>, ? extends C33567t>>> {

        /* renamed from: a */
        final /* synthetic */ MixDetailViewModel f87535a;

        C33515c(MixDetailViewModel mixDetailViewModel) {
            this.f87535a = mixDetailViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<Aweme>, C33567t>> invoke(final MixDetailState mixDetailState) {
            C7492s sVar;
            C7573i.m23587b(mixDetailState, "state");
            if (this.f87535a.f87525h != null) {
                sVar = C7492s.m23301b(this.f87535a.f87525h);
            } else {
                C33558l f = this.f87535a.mo29069f();
                String str = this.f87535a.f87524g;
                if (str == null) {
                    C7573i.m23580a();
                }
                sVar = f.mo85893a(str);
            }
            C7492s<Pair<List<Aweme>, C33567t>> d = sVar.mo19316d((C7326g<? super T>) new C7326g<MixInfo>(this) {

                /* renamed from: a */
                final /* synthetic */ C33515c f87536a;

                {
                    this.f87536a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(final MixInfo mixInfo) {
                    if (mixInfo == null) {
                        C7573i.m23580a();
                    }
                    this.f87536a.f87535a.f87525h = mixInfo;
                    this.f87536a.f87535a.mo29038c(new C7562b<MixDetailState, MixDetailState>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public MixDetailState invoke(MixDetailState mixDetailState) {
                            C7573i.m23587b(mixDetailState, "$receiver");
                            return MixDetailState.copy$default(mixDetailState, null, new C11674x(mixInfo), null, null, 0, 29, null);
                        }
                    });
                }
            }).mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) new C7327h<T, C7496w<? extends R>>(this) {

                /* renamed from: a */
                final /* synthetic */ C33515c f87538a;

                {
                    this.f87538a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C7492s<MixList> apply(MixInfo mixInfo) {
                    if (mixInfo == null) {
                        C7573i.m23580a();
                    }
                    long a = this.f87538a.f87535a.mo85856a(mixDetailState, mixInfo);
                    StringBuilder sb = new StringBuilder("refresh:");
                    sb.append(mixDetailState.getMixId());
                    sb.append(",num:");
                    sb.append(a);
                    C6921a.m21552a(4, "MixDetailFragment", sb.toString());
                    return this.f87538a.f87535a.mo29069f().m108429a(mixDetailState.getMixId(), a - 1, mixDetailState.getPullType(), 15);
                }
            }).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C33515c f87540a;

                {
                    this.f87540a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<Aweme>, C33567t> apply(MixList mixList) {
                    boolean z;
                    C7573i.m23587b(mixList, "it");
                    List<Aweme> list = mixList.awemeList;
                    if (list == null) {
                        list = C7525m.m23461a();
                    }
                    int i = (int) mixList.cursor;
                    int i2 = (int) mixList.minCursor;
                    boolean z2 = false;
                    if (mixList.hasMore == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Pair<List<Aweme>, C33567t> a = C7579l.m23633a(list, new C33567t(true, i, i2, z));
                    MixDetailViewModel mixDetailViewModel = this.f87540a.f87535a;
                    if (mixList.hasMore == 1) {
                        z2 = true;
                    }
                    mixDetailViewModel.mo85860a(z2, mixList.minCursor);
                    return a;
                }
            });
            C7573i.m23582a((Object) d, "mixInfo.doOnNext { info …                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$d */
    static final class C33520d extends Lambda implements C7562b<MixDetailState, C7492s<Pair<? extends List<? extends Aweme>, ? extends C33567t>>> {

        /* renamed from: a */
        final /* synthetic */ MixDetailViewModel f87541a;

        C33520d(MixDetailViewModel mixDetailViewModel) {
            this.f87541a = mixDetailViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<Aweme>, C33567t>> invoke(MixDetailState mixDetailState) {
            long j;
            C7573i.m23587b(mixDetailState, "state");
            int pullType = mixDetailState.getPullType();
            this.f87541a.f87521d = pullType;
            if (pullType != 2) {
                MixListAdapter mixListAdapter = this.f87541a.f87522e;
                j = (long) ((C33567t) mixDetailState.getListState().getPayload()).f87662c;
            } else {
                MixListAdapter mixListAdapter2 = this.f87541a.f87522e;
                j = (long) ((C33567t) mixDetailState.getListState().getPayload()).f31255b;
            }
            StringBuilder sb = new StringBuilder("loadMore:pullType->");
            sb.append(pullType);
            sb.append(",cursor->");
            sb.append(j);
            C6921a.m21552a(4, "MixDetailFragment", sb.toString());
            C7492s<Pair<List<Aweme>, C33567t>> b = this.f87541a.mo85857a(mixDetailState, j, pullType).mo19299b((C7326g<? super C47869r<T>>) new C7326g<C47869r<Pair<? extends List<? extends Aweme>, ? extends C33567t>>>(this) {

                /* renamed from: a */
                final /* synthetic */ C33520d f87542a;

                {
                    this.f87542a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(C47869r<Pair<List<Aweme>, C33567t>> rVar) {
                    this.f87542a.f87541a.mo85862g();
                }
            });
            C7573i.m23582a((Object) b, "doLoadMore(state, cursor…State()\n                }");
            return b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$e */
    static final class C33522e extends Lambda implements C7563m<List<? extends Aweme>, List<? extends Aweme>, List<? extends Aweme>> {

        /* renamed from: a */
        public static final C33522e f87543a = new C33522e();

        C33522e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m108350a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<Aweme> m108350a(List<? extends Aweme> list, List<? extends Aweme> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "refresh");
            Iterable iterable = list2;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : iterable) {
                if (hashSet.add(((Aweme) next).getAid())) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$f */
    static final class C33523f extends Lambda implements C7563m<List<? extends Aweme>, List<? extends Aweme>, List<? extends Aweme>> {

        /* renamed from: a */
        final /* synthetic */ MixDetailViewModel f87544a;

        C33523f(MixDetailViewModel mixDetailViewModel) {
            this.f87544a = mixDetailViewModel;
            super(2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<Aweme> invoke(List<? extends Aweme> list, List<? extends Aweme> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "loadMore");
            StringBuilder sb = new StringBuilder("loadMore:State:");
            sb.append(this.f87544a.f87521d);
            C6921a.m21552a(4, "MixDetailFragment", sb.toString());
            List arrayList = new ArrayList();
            if (this.f87544a.f87521d != 2) {
                arrayList.addAll(list2);
                arrayList.addAll(list);
            } else {
                arrayList.addAll(list);
                arrayList.addAll(list2);
            }
            C6921a.m21552a(4, "MixDetailFragment", "loadMore:return result!");
            Iterable iterable = arrayList;
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object next : iterable) {
                if (hashSet.add(((Aweme) next).getAid())) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$g */
    static final class C33524g extends Lambda implements C7563m<MixDetailState, ListState<Aweme, C33567t>, MixDetailState> {

        /* renamed from: a */
        public static final C33524g f87545a = new C33524g();

        C33524g() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m108352a((MixDetailState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static MixDetailState m108352a(MixDetailState mixDetailState, ListState<Aweme, C33567t> listState) {
            C7573i.m23587b(mixDetailState, "$receiver");
            C7573i.m23587b(listState, "it");
            return MixDetailState.copy$default(mixDetailState, null, null, listState, null, 0, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.MixDetailViewModel$h */
    static final class C33525h extends Lambda implements C7563m<MixDetailState, C11491a<? extends String>, MixDetailState> {

        /* renamed from: a */
        final /* synthetic */ int f87546a;

        C33525h(int i) {
            this.f87546a = i;
            super(2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MixDetailState invoke(MixDetailState mixDetailState, C11491a<String> aVar) {
            C7573i.m23587b(mixDetailState, "$receiver");
            C7573i.m23587b(aVar, "it");
            return MixDetailState.copy$default(mixDetailState, null, null, null, null, this.f87546a, 15, null);
        }
    }

    /* renamed from: f */
    public final C33558l mo29069f() {
        return (C33558l) this.f87530m.getValue();
    }

    /* renamed from: g */
    public final void mo85862g() {
        this.f87526i = false;
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m108330h();
    }

    /* renamed from: h */
    private static MixDetailState m108330h() {
        MixDetailState mixDetailState = new MixDetailState(null, null, null, null, 0, 31, null);
        return mixDetailState;
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        ListMiddleware<MixDetailState, Aweme, C33567t> listMiddleware = this.f87523f;
        listMiddleware.mo29186a(C33559m.f87657a, (C7563m<? super S, ? super PROP, ? extends S>) C33524g.f87545a);
        mo29033a(listMiddleware);
    }

    /* renamed from: a */
    public final void mo85859a(String str) {
        this.f87524g = str;
        this.f87523f.mo29082b();
    }

    /* renamed from: c */
    private void m108329c(int i) {
        C7492s b = C7492s.m23301b("");
        C7573i.m23582a((Object) b, "Observable.just(\"\")");
        mo29031a(b, (C7563m<? super S, ? super C11491a<? extends T>, ? extends S>) new C33525h<Object,Object,Object>(i));
    }

    /* renamed from: b */
    public final void mo85861b(int i) {
        m108329c(2);
        this.f87527j = i;
        this.f87528k = true;
        this.f87529l = true;
        this.f87523f.mo29082b();
    }

    /* renamed from: a */
    public final void mo85858a(int i) {
        StringBuilder sb = new StringBuilder("loadMore:");
        sb.append(i);
        sb.append("，isInLoadMore:");
        sb.append(this.f87526i);
        C6921a.m21562b("MixDetailFragment", sb.toString());
        if (!this.f87526i) {
            this.f87526i = true;
            m108329c(i);
            this.f87523f.mo29085c();
        }
    }

    /* renamed from: a */
    public final void mo85860a(boolean z, long j) {
        boolean z2;
        this.f87528k = z;
        if (j != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f87529l = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo85856a(com.p280ss.android.ugc.aweme.mix.MixDetailState r7, com.p280ss.android.ugc.aweme.mix.MixInfo r8) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.MixStruct r8 = r8.mixInfo
            if (r8 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.feed.model.MixStatisStruct r8 = r8.statis
            if (r8 == 0) goto L_0x000f
            long r0 = r8.updatedToEpisode
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            goto L_0x0010
        L_0x000f:
            r8 = 0
        L_0x0010:
            int r0 = r6.f87527j
            r1 = -1
            r2 = 1
            if (r0 == r1) goto L_0x0029
            com.ss.android.ugc.aweme.mix.MixCellStyleExperiment r7 = com.p280ss.android.ugc.aweme.mix.MixCellStyleExperiment.INSTANCE
            int r0 = r6.f87527j
            int r0 = r0 + 1
            long r4 = (long) r0
            long r7 = r7.getFirstEpisodeNum(r8, r4)
            long r7 = java.lang.Math.max(r2, r7)
            r6.f87527j = r1
            return r7
        L_0x0029:
            java.lang.Long r7 = r7.getEnterEpisodeNum()
            if (r7 == 0) goto L_0x0034
            long r0 = r7.longValue()
            goto L_0x0035
        L_0x0034:
            r0 = r2
        L_0x0035:
            com.ss.android.ugc.aweme.mix.MixCellStyleExperiment r7 = com.p280ss.android.ugc.aweme.mix.MixCellStyleExperiment.INSTANCE
            long r7 = r7.getFirstEpisodeNum(r8, r0)
            long r7 = java.lang.Math.max(r7, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.MixDetailViewModel.mo85856a(com.ss.android.ugc.aweme.mix.MixDetailState, com.ss.android.ugc.aweme.mix.MixInfo):long");
    }

    /* renamed from: a */
    public final C7492s<Pair<List<Aweme>, C33567t>> mo85857a(MixDetailState mixDetailState, long j, int i) {
        C7492s<Pair<List<Aweme>, C33567t>> d = mo29069f().m108429a(mixDetailState.getMixId(), j, i, 15).mo19317d((C7327h<? super T, ? extends R>) new C33513a<Object,Object>(this, i, mixDetailState));
        C7573i.m23582a((Object) d, "mMixDetailRepository.get…         result\n        }");
        return d;
    }
}
