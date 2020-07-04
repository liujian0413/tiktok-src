package com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel;

import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11554a;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.repo.C29478c;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.repo.C29480e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel */
public final class RecommendFollowViewModel extends JediViewModel<RecommendFollowState> {

    /* renamed from: d */
    public static final C29515a f77817d = new C29515a(null);

    /* renamed from: c */
    public final C29478c f77818c = new C29478c();

    /* renamed from: e */
    private final ListMiddleware<RecommendFollowState, C29480e, C29542b> f77819e;

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$a */
    public static final class C29515a {
        private C29515a() {
        }

        public /* synthetic */ C29515a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$b */
    public interface C29516b {
        /* renamed from: a */
        void mo75538a(RecommendList recommendList);

        /* renamed from: a */
        void mo75539a(Throwable th);
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$c */
    static final class C29517c extends Lambda implements C7562b<RecommendFollowState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewModel f77820a;

        /* renamed from: b */
        final /* synthetic */ boolean f77821b;

        /* renamed from: c */
        final /* synthetic */ C29516b f77822c;

        C29517c(RecommendFollowViewModel recommendFollowViewModel, boolean z, C29516b bVar) {
            this.f77820a = recommendFollowViewModel;
            this.f77821b = z;
            this.f77822c = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97038a((RecommendFollowState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97038a(RecommendFollowState recommendFollowState) {
            int i;
            C7573i.m23587b(recommendFollowState, "it");
            if (this.f77821b) {
                i = ((C29542b) recommendFollowState.getListState().getPayload()).f31255b;
            } else {
                i = 0;
            }
            C29478c cVar = this.f77820a.f77818c;
            String userId = recommendFollowState.getUserId();
            int a = C43161e.m136882a();
            C34202f a2 = C34202f.m110435a();
            C7573i.m23582a((Object) a2, "RecUserImpressionReporter.getInstance()");
            cVar.mo75484a(30, i, userId, 11, 0, a, a2.mo86949b(), C43161e.m136884b(), recommendFollowState.getSecUid()).mo19316d((C7326g<? super T>) C295181.f77823a).mo19280a((C7326g<? super T>) new C7326g<RecommendList>(this) {

                /* renamed from: a */
                final /* synthetic */ C29517c f77824a;

                {
                    this.f77824a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(final RecommendList recommendList) {
                    this.f77824a.f77820a.mo29038c(new C7562b<RecommendFollowState, RecommendFollowState>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C295192 f77825a;

                        {
                            this.f77825a = r1;
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public RecommendFollowState invoke(RecommendFollowState recommendFollowState) {
                            C7573i.m23587b(recommendFollowState, "$receiver");
                            List arrayList = new ArrayList();
                            if (this.f77825a.f77824a.f77821b) {
                                List list = recommendFollowState.getListState().getList();
                                arrayList.addAll(list);
                                RecommendList recommendList = recommendList;
                                C7573i.m23582a((Object) recommendList, "recommendList");
                                List<C29480e> recommendFollowList = recommendList.getRecommendFollowList();
                                C7573i.m23582a((Object) recommendFollowList, "recommendList.recommendFollowList");
                                for (C29480e eVar : recommendFollowList) {
                                    if (!list.contains(eVar)) {
                                        C7573i.m23582a((Object) eVar, "struct");
                                        arrayList.add(eVar);
                                    }
                                }
                            } else {
                                RecommendList recommendList2 = recommendList;
                                C7573i.m23582a((Object) recommendList2, "recommendList");
                                List recommendFollowList2 = recommendList2.getRecommendFollowList();
                                C7573i.m23582a((Object) recommendFollowList2, "recommendList.recommendFollowList");
                                arrayList.addAll(recommendFollowList2);
                            }
                            RecommendList recommendList3 = recommendList;
                            C7573i.m23582a((Object) recommendList3, "recommendList");
                            recommendList3.setRecommendFollowList(C7525m.m23509d((Collection<? extends T>) arrayList));
                            C29516b bVar = this.f77825a.f77824a.f77822c;
                            if (bVar != null) {
                                RecommendList clone = recommendList.clone();
                                C7573i.m23582a((Object) clone, "recommendList.clone()");
                                bVar.mo75538a(clone);
                            }
                            ListState listState = recommendFollowState.getListState();
                            boolean hasMore = recommendList.hasMore();
                            RecommendList recommendList4 = recommendList;
                            C7573i.m23582a((Object) recommendList4, "recommendList");
                            int cursor = recommendList4.getCursor();
                            RecommendList recommendList5 = recommendList;
                            C7573i.m23582a((Object) recommendList5, "recommendList");
                            return RecommendFollowState.copy$default(recommendFollowState, null, null, 0, null, null, null, ListState.copy$default(listState, new C29542b(hasMore, cursor, recommendList5.getLogPb()), arrayList, null, null, null, 28, null), 63, null);
                        }
                    });
                }
            }, (C7326g<? super Throwable>) new C7326g<Throwable>(this) {

                /* renamed from: a */
                final /* synthetic */ C29517c f77827a;

                {
                    this.f77827a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Throwable th) {
                    C29516b bVar = this.f77827a.f77822c;
                    if (bVar != null) {
                        C7573i.m23582a((Object) th, "throwable");
                        bVar.mo75539a(th);
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$d */
    static final class C29522d<T> implements C7326g<String> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewModel f77828a;

        /* renamed from: b */
        final /* synthetic */ String f77829b;

        C29522d(RecommendFollowViewModel recommendFollowViewModel, String str) {
            this.f77828a = recommendFollowViewModel;
            this.f77829b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(String str) {
            this.f77828a.mo29038c(new C7562b<RecommendFollowState, RecommendFollowState>(this) {

                /* renamed from: a */
                final /* synthetic */ C29522d f77830a;

                {
                    this.f77830a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public RecommendFollowState invoke(RecommendFollowState recommendFollowState) {
                    C7573i.m23587b(recommendFollowState, "$receiver");
                    Iterable list = recommendFollowState.getListState().getList();
                    Collection arrayList = new ArrayList();
                    for (Object next : list) {
                        if (!C7573i.m23585a((Object) ((C29480e) next).f77738a, (Object) this.f77830a.f77829b)) {
                            arrayList.add(next);
                        }
                    }
                    List list2 = (List) arrayList;
                    return RecommendFollowState.copy$default(recommendFollowState, null, null, 0, null, null, new Pair(this.f77830a.f77829b, Boolean.valueOf(true)), ListState.copy$default(recommendFollowState.getListState(), null, list2, null, null, null, 29, null), 31, null);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$e */
    static final class C29524e<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C29524e f77831a = new C29524e();

        C29524e() {
        }

        /* renamed from: a */
        private static void m97045a(Throwable th) {
            if (th != null) {
                C6497a.m20185b(th);
            }
        }

        public final /* synthetic */ void accept(Object obj) {
            m97045a((Throwable) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$f */
    static final class C29525f extends Lambda implements C7562b<RecommendFollowState, C7492s<Pair<? extends List<? extends C29480e>, ? extends C29542b>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewModel f77832a;

        C29525f(RecommendFollowViewModel recommendFollowViewModel) {
            this.f77832a = recommendFollowViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<C29480e>, C29542b>> invoke(RecommendFollowState recommendFollowState) {
            C7573i.m23587b(recommendFollowState, "state");
            C29478c cVar = this.f77832a.f77818c;
            String userId = recommendFollowState.getUserId();
            int a = C43161e.m136882a();
            C34202f a2 = C34202f.m110435a();
            C7573i.m23582a((Object) a2, "RecUserImpressionReporter.getInstance()");
            C7492s<Pair<List<C29480e>, C29542b>> d = cVar.mo75484a(30, 0, userId, 11, 0, a, a2.mo86949b(), C43161e.m136884b(), recommendFollowState.getSecUid()).mo19316d((C7326g<? super T>) C295261.f77833a).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C29525f f77834a;

                /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$f$2$a */
                static final class C29528a extends Lambda implements C7562b<RecommendFollowState, C7581n> {

                    /* renamed from: a */
                    final /* synthetic */ User f77835a;

                    C29528a(User user) {
                        this.f77835a = user;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m97049a((RecommendFollowState) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m97049a(RecommendFollowState recommendFollowState) {
                        C7573i.m23587b(recommendFollowState, "state");
                        this.f77835a.setRecommendReason(recommendFollowState.getRelationInfo());
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$f$2$b */
                static final class C29529b extends Lambda implements C7562b<RecommendFollowState, C7581n> {

                    /* renamed from: a */
                    final /* synthetic */ Aweme f77836a;

                    C29529b(Aweme aweme) {
                        this.f77836a = aweme;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m97050a((RecommendFollowState) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m97050a(RecommendFollowState recommendFollowState) {
                        C7573i.m23587b(recommendFollowState, "it");
                        Aweme aweme = this.f77836a;
                        RelationDynamicLabel relationDynamicLabel = new RelationDynamicLabel();
                        relationDynamicLabel.setLabelInfo(recommendFollowState.getRelationInfo());
                        relationDynamicLabel.setType(5);
                        aweme.setRelationLabel(relationDynamicLabel);
                    }
                }

                {
                    this.f77834a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<C29480e>, C29542b> apply(RecommendList recommendList) {
                    C7573i.m23587b(recommendList, "it");
                    List recommendFollowList = recommendList.getRecommendFollowList();
                    C7573i.m23582a((Object) recommendFollowList, "it.recommendFollowList");
                    Iterable iterable = recommendFollowList;
                    List userList = recommendList.getUserList();
                    C7573i.m23582a((Object) userList, "it.userList");
                    Iterable iterable2 = userList;
                    Iterator it = iterable.iterator();
                    Iterator it2 = iterable2.iterator();
                    ArrayList arrayList = new ArrayList(Math.min(C7525m.m23469a(iterable, 10), C7525m.m23469a(iterable2, 10)));
                    while (it.hasNext() && it2.hasNext()) {
                        User user = (User) it2.next();
                        C29480e eVar = (C29480e) it.next();
                        eVar.f77741d = recommendList.getRecommendFollowList().indexOf(eVar);
                        if (eVar.f77741d == 0) {
                            this.f77834a.f77832a.mo29036b(new C29528a(user));
                        }
                        C7573i.m23582a((Object) user, "user.apply {\n           …                        }");
                        eVar.mo75490a(user);
                        eVar.f77740c.setRequestId(recommendList.getRid());
                        for (Aweme aweme : eVar.f77739b) {
                            if (eVar.f77741d == 0) {
                                this.f77834a.f77832a.mo29036b(new C29529b(aweme));
                            } else {
                                RelationDynamicLabel relationDynamicLabel = new RelationDynamicLabel();
                                C7573i.m23582a((Object) user, "user");
                                String recommendReason = user.getRecommendReason();
                                if (recommendReason == null) {
                                    recommendReason = "";
                                }
                                relationDynamicLabel.setLabelInfo(recommendReason);
                                relationDynamicLabel.setType(5);
                                aweme.setRelationLabel(relationDynamicLabel);
                            }
                            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme.clone());
                        }
                        arrayList.add(eVar);
                    }
                    return C7579l.m23633a(arrayList, new C29542b(recommendList.hasMore(), recommendList.getCursor(), recommendList.getLogPb()));
                }
            });
            C7573i.m23582a((Object) d, "repo.getRecommendFollowL….logPb)\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$g */
    static final class C29530g extends Lambda implements C7562b<RecommendFollowState, C7492s<Pair<? extends List<? extends C29480e>, ? extends C29542b>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewModel f77837a;

        C29530g(RecommendFollowViewModel recommendFollowViewModel) {
            this.f77837a = recommendFollowViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<C29480e>, C29542b>> invoke(RecommendFollowState recommendFollowState) {
            C7573i.m23587b(recommendFollowState, "state");
            C29478c cVar = this.f77837a.f77818c;
            int i = ((C29542b) recommendFollowState.getListState().getPayload()).f31255b;
            String userId = recommendFollowState.getUserId();
            int a = C43161e.m136882a();
            C34202f a2 = C34202f.m110435a();
            C7573i.m23582a((Object) a2, "RecUserImpressionReporter.getInstance()");
            C7492s<Pair<List<C29480e>, C29542b>> d = cVar.mo75484a(30, i, userId, 11, 0, a, a2.mo86949b(), C43161e.m136884b(), recommendFollowState.getSecUid()).mo19316d((C7326g<? super T>) C295311.f77838a).mo19317d((C7327h<? super T, ? extends R>) C295322.f77839a);
            C7573i.m23582a((Object) d, "repo.getRecommendFollowL….logPb)\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$h */
    static final class C29533h extends Lambda implements C7563m<List<? extends C29480e>, List<? extends C29480e>, List<C29480e>> {

        /* renamed from: a */
        public static final C29533h f77840a = new C29533h();

        C29533h() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m97054a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<C29480e> m97054a(List<C29480e> list, List<C29480e> list2) {
            C7573i.m23587b(list, "oldList");
            C7573i.m23587b(list2, "newList");
            List<C29480e> arrayList = new ArrayList<>();
            arrayList.addAll(list);
            for (C29480e eVar : list2) {
                if (!list.contains(eVar)) {
                    arrayList.add(eVar);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$i */
    static final class C29534i<T, R> implements C7327h<T, C7496w<? extends R>> {

        /* renamed from: a */
        public static final C29534i f77841a = new C29534i();

        C29534i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m97055a((List) obj);
        }

        /* renamed from: a */
        private static C7492s<Pair<C7581n, List<C29480e>>> m97055a(List<? extends Pair<C7581n, ? extends List<C29480e>>> list) {
            C7573i.m23587b(list, "list");
            return C7492s.m23300b((Iterable<? extends T>) list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$j */
    static final class C29535j<T> implements C7326g<Pair<? extends C7581n, ? extends List<? extends C29480e>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendFollowViewModel f77842a;

        /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$j$a */
        static final class C29536a extends Lambda implements C7562b<RecommendFollowState, RecommendFollowState> {

            /* renamed from: a */
            final /* synthetic */ List f77843a;

            C29536a(List list) {
                this.f77843a = list;
                super(1);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public RecommendFollowState invoke(RecommendFollowState recommendFollowState) {
                C7573i.m23587b(recommendFollowState, "$receiver");
                return RecommendFollowState.copy$default(recommendFollowState, null, null, 0, null, null, null, ListState.copy$default(recommendFollowState.getListState(), null, this.f77843a, null, null, null, 29, null), 63, null);
            }
        }

        C29535j(RecommendFollowViewModel recommendFollowViewModel) {
            this.f77842a = recommendFollowViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Pair<C7581n, ? extends List<C29480e>> pair) {
            List list = (List) pair.getSecond();
            if (list != null) {
                this.f77842a.mo29038c(new C29536a(list));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.RecommendFollowViewModel$k */
    static final class C29537k extends Lambda implements C7563m<RecommendFollowState, ListState<C29480e, C29542b>, RecommendFollowState> {

        /* renamed from: a */
        public static final C29537k f77844a = new C29537k();

        C29537k() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m97058a((RecommendFollowState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static RecommendFollowState m97058a(RecommendFollowState recommendFollowState, ListState<C29480e, C29542b> listState) {
            C7573i.m23587b(recommendFollowState, "$receiver");
            C7573i.m23587b(listState, "it");
            return RecommendFollowState.copy$default(recommendFollowState, null, null, 0, null, null, null, listState, 63, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m97027h();
    }

    /* renamed from: f */
    public final void mo29069f() {
        this.f77819e.mo29082b();
    }

    /* renamed from: g */
    public final void mo75537g() {
        this.f77819e.mo29085c();
    }

    public final void onCleared() {
        super.onCleared();
        this.f77818c.mo29370a();
    }

    /* renamed from: h */
    private static RecommendFollowState m97027h() {
        RecommendFollowState recommendFollowState = new RecommendFollowState("", null, 0, null, null, null, null, 126, null);
        return recommendFollowState;
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        ListMiddleware<RecommendFollowState, C29480e, C29542b> listMiddleware = this.f77819e;
        listMiddleware.mo29186a(C29543c.f77852a, (C7563m<? super S, ? super PROP, ? extends S>) C29537k.f77844a);
        mo29033a(listMiddleware);
        m97028i();
    }

    public RecommendFollowViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C29525f(this), new C29530g(this), null, C29533h.f77840a, 4, null);
        this.f77819e = listMiddleware;
    }

    /* renamed from: i */
    private void m97028i() {
        C7321c f = this.f77818c.mo75485b().mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) C29534i.f77841a).mo19325f((C7326g<? super T>) new C29535j<Object>(this));
        C7573i.m23582a((Object) f, "repo.observerListSource(…      }\n                }");
        mo29029a(f);
    }

    /* renamed from: a */
    public final void mo75535a(String str) {
        C7573i.m23587b(str, "uid");
        this.f77818c.mo75483a(str).mo19129a((C7326g<? super T>) new C29522d<Object>(this, str), (C7326g<? super Throwable>) C29524e.f77831a);
    }

    /* renamed from: a */
    public final void mo75536a(boolean z, C29516b bVar) {
        mo29036b(new C29517c(this, z, bVar));
    }

    /* renamed from: a */
    public final <RECEIVER extends C11501d> void mo75534a(C11502e<? extends RECEIVER> eVar, C11554a<C29480e> aVar, C11557c<C29480e, RECEIVER> cVar, C11557c<C29480e, RECEIVER> cVar2, C7563m<? super RECEIVER, ? super Boolean, C7581n> mVar) {
        C11502e<? extends RECEIVER> eVar2 = eVar;
        C7573i.m23587b(eVar, "subscriber");
        C11554a<C29480e> aVar2 = aVar;
        C7573i.m23587b(aVar2, "adapter");
        ListMiddleware.m33938a(this.f77819e, eVar2, aVar2, false, eVar.mo29068c(), cVar, cVar2, mVar, null, null, null, 896, null);
    }
}
