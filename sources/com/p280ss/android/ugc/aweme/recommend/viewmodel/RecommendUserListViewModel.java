package com.p280ss.android.ugc.aweme.recommend.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.model.p601c.C11786e;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.friends.recommendlist.repository.C30069d;
import com.p280ss.android.ugc.aweme.p1192e.C27325a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.user.repository.C42844a;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
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
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel */
public final class RecommendUserListViewModel extends CommonListViewModel<User, RecommendUserListState> {

    /* renamed from: e */
    public static final C37168a f97268e = new C37168a(null);

    /* renamed from: d */
    public final C30069d f97269d = new C30069d();

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$a */
    public static final class C37168a {
        private C37168a() {
        }

        public /* synthetic */ C37168a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$b */
    static final class C37169b extends Lambda implements C7562b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a */
        public static final C37169b f97270a = new C37169b();

        C37169b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m119501a((RecommendUserListState) obj);
        }

        /* renamed from: a */
        private static RecommendUserListState m119501a(RecommendUserListState recommendUserListState) {
            C7573i.m23587b(recommendUserListState, "$receiver");
            Iterable list = recommendUserListState.getSubstate().getList();
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (!(((User) next) instanceof RecommendContact)) {
                    arrayList.add(next);
                }
            }
            return RecommendUserListState.copy$default(recommendUserListState, null, null, false, 0, null, null, ListState.copy$default(recommendUserListState.getSubstate(), null, (List) arrayList, null, null, null, 29, null), 63, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$c */
    static final class C37170c<T> implements C7326g<String> {

        /* renamed from: a */
        public static final C37170c f97271a = new C37170c();

        C37170c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$d */
    static final class C37171d<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C37171d f97272a = new C37171d();

        C37171d() {
        }

        /* renamed from: a */
        private static void m119502a(Throwable th) {
            if (th != null) {
                C6497a.m20185b(th);
            }
        }

        public final /* synthetic */ void accept(Object obj) {
            m119502a((Throwable) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$e */
    static final class C37172e extends Lambda implements C7562b<RecommendUserListState, C7492s<Pair<? extends List<? extends User>, ? extends C11583n>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserListViewModel f97273a;

        C37172e(RecommendUserListViewModel recommendUserListViewModel) {
            this.f97273a = recommendUserListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<User>, C11583n>> invoke(RecommendUserListState recommendUserListState) {
            String str;
            String str2;
            C7573i.m23587b(recommendUserListState, "state");
            C30069d dVar = this.f97273a.f97269d;
            Integer valueOf = Integer.valueOf(30);
            Integer valueOf2 = Integer.valueOf(recommendUserListState.getSubstate().getPayload().f31255b);
            if (recommendUserListState.isMySelf()) {
                str = null;
            } else {
                str = recommendUserListState.getUserId();
            }
            int recommendUserType = recommendUserListState.getRecommendUserType();
            Integer valueOf3 = Integer.valueOf(0);
            Integer valueOf4 = Integer.valueOf(C43161e.m136882a());
            String reportId = recommendUserListState.getReportId();
            Integer valueOf5 = Integer.valueOf(C43161e.m136884b());
            if (recommendUserListState.isMySelf()) {
                str2 = null;
            } else {
                str2 = recommendUserListState.getSecUserId();
            }
            C7492s<Pair<List<User>, C11583n>> d = dVar.mo76453a(valueOf, valueOf2, str, recommendUserType, valueOf3, valueOf4, reportId, null, valueOf5, str2).mo19317d((C7327h<? super T, ? extends R>) C371731.f97274a);
            C7573i.m23582a((Object) d, "mRepository.recommendLis… it.cursor)\n            }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$f */
    static final class C37174f extends Lambda implements C7563m<List<? extends User>, List<? extends User>, List<User>> {

        /* renamed from: a */
        public static final C37174f f97275a = new C37174f();

        C37174f() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m119505a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<User> m119505a(List<? extends User> list, List<? extends User> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "loadMore");
            List<User> arrayList = new ArrayList<>();
            arrayList.addAll(list);
            C27325a.m89576b(arrayList, list2);
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$g */
    static final class C37175g extends Lambda implements C7562b<RecommendUserListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserListViewModel f97276a;

        C37175g(RecommendUserListViewModel recommendUserListViewModel) {
            this.f97276a = recommendUserListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m119506a((RecommendUserListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m119506a(RecommendUserListState recommendUserListState) {
            C7573i.m23587b(recommendUserListState, "state");
            this.f97276a.f97269d.mo76452a(recommendUserListState.getRecommendUserType()).mo19325f((C7326g<? super T>) new C7326g<C11786e<? extends List<? extends C42844a>>>(this) {

                /* renamed from: a */
                final /* synthetic */ C37175g f97277a;

                /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$g$1$a */
                static final class C37177a extends Lambda implements C7562b<RecommendUserListState, RecommendUserListState> {

                    /* renamed from: a */
                    final /* synthetic */ List f97278a;

                    /* renamed from: b */
                    final /* synthetic */ C371761 f97279b;

                    C37177a(List list, C371761 r2) {
                        this.f97278a = list;
                        this.f97279b = r2;
                        super(1);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public RecommendUserListState invoke(RecommendUserListState recommendUserListState) {
                        C7573i.m23587b(recommendUserListState, "$receiver");
                        return RecommendUserListState.copy$default(recommendUserListState, null, null, false, 0, null, null, ListState.copy$default(recommendUserListState.getSubstate(), null, RecommendUserListViewModel.m119490a(this.f97278a), null, null, null, 29, null), 63, null);
                    }
                }

                {
                    this.f97277a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(C11786e<? extends List<C42844a>> eVar) {
                    List list = (List) eVar.mo29356a();
                    if (list != null) {
                        Iterable<C42844a> iterable = list;
                        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                        for (C42844a aVar : iterable) {
                            arrayList.add(aVar.f111320a);
                        }
                        this.f97277a.f97276a.mo29038c(new C37177a((List) arrayList, this));
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$h */
    static final class C37178h extends Lambda implements C7562b<RecommendUserListState, C7492s<Pair<? extends List<? extends User>, ? extends C11583n>>> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserListViewModel f97280a;

        C37178h(RecommendUserListViewModel recommendUserListViewModel) {
            this.f97280a = recommendUserListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<User>, C11583n>> invoke(RecommendUserListState recommendUserListState) {
            String str;
            String str2;
            C7573i.m23587b(recommendUserListState, "state");
            C30069d dVar = this.f97280a.f97269d;
            Integer valueOf = Integer.valueOf(30);
            Integer valueOf2 = Integer.valueOf(0);
            if (recommendUserListState.isMySelf()) {
                str = null;
            } else {
                str = recommendUserListState.getUserId();
            }
            int recommendUserType = recommendUserListState.getRecommendUserType();
            Integer valueOf3 = Integer.valueOf(0);
            Integer valueOf4 = Integer.valueOf(C43161e.m136882a());
            String reportId = recommendUserListState.getReportId();
            Integer valueOf5 = Integer.valueOf(C43161e.m136884b());
            if (recommendUserListState.isMySelf()) {
                str2 = null;
            } else {
                str2 = recommendUserListState.getSecUserId();
            }
            C7492s<Pair<List<User>, C11583n>> d = dVar.mo76453a(valueOf, valueOf2, str, recommendUserType, valueOf3, valueOf4, reportId, null, valueOf5, str2).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C37178h f97281a;

                {
                    this.f97281a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<User>, C11583n> apply(RecommendList recommendList) {
                    C7573i.m23587b(recommendList, "it");
                    return C7579l.m23633a(RecommendUserListViewModel.m119490a(recommendList.getUserList()), new C11583n(recommendList.hasMore(), recommendList.getCursor()));
                }
            });
            C7573i.m23582a((Object) d, "mRepository.recommendLis… it.cursor)\n            }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$i */
    static final class C37180i extends Lambda implements C7562b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ String f97282a;

        C37180i(String str) {
            this.f97282a = str;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecommendUserListState invoke(RecommendUserListState recommendUserListState) {
            C7573i.m23587b(recommendUserListState, "$receiver");
            return RecommendUserListState.copy$default(recommendUserListState, null, null, false, 0, this.f97282a, null, null, 111, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel$j */
    static final class C37181j extends Lambda implements C7562b<RecommendUserListState, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ C37182a f97283a;

        C37181j(C37182a aVar) {
            this.f97283a = aVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecommendUserListState invoke(RecommendUserListState recommendUserListState) {
            C7573i.m23587b(recommendUserListState, "$receiver");
            return RecommendUserListState.copy$default(recommendUserListState, null, null, false, 0, null, this.f97283a, null, 95, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m119491m();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        m119492n();
    }

    /* renamed from: f */
    public final C7562b<RecommendUserListState, C7492s<Pair<List<User>, C11583n>>> mo29069f() {
        return new C37178h<>(this);
    }

    /* renamed from: g */
    public final C7562b<RecommendUserListState, C7492s<Pair<List<User>, C11583n>>> mo29070g() {
        return new C37172e<>(this);
    }

    /* renamed from: j */
    public final C7563m<List<? extends User>, List<? extends User>, List<User>> mo29115j() {
        return C37174f.f97275a;
    }

    /* renamed from: n */
    private final void m119492n() {
        mo29036b(new C37175g(this));
    }

    public final void onCleared() {
        super.onCleared();
        this.f97269d.mo29370a();
    }

    /* renamed from: m */
    private static RecommendUserListState m119491m() {
        RecommendUserListState recommendUserListState = new RecommendUserListState(null, null, false, 0, null, null, null, 127, null);
        return recommendUserListState;
    }

    /* renamed from: a */
    public static List<User> m119490a(List<? extends User> list) {
        if (list != null) {
            return C7525m.m23509d((Collection<? extends T>) list);
        }
        return C7525m.m23461a();
    }

    /* renamed from: a */
    public final void mo93673a(C37182a aVar) {
        C7573i.m23587b(aVar, "params");
        mo29038c(new C37181j(aVar));
    }

    /* renamed from: a */
    public final void mo93672a(User user) {
        C7573i.m23587b(user, "user");
        if (user instanceof RecommendContact) {
            mo29038c(C37169b.f97270a);
            return;
        }
        C30069d dVar = this.f97269d;
        String uid = user.getUid();
        C7573i.m23582a((Object) uid, "user.uid");
        dVar.mo76451a(uid).mo19129a((C7326g<? super T>) C37170c.f97271a, (C7326g<? super Throwable>) C37171d.f97272a);
    }

    /* renamed from: a */
    public final void mo93674a(String str) {
        C7573i.m23587b(str, "reportId");
        mo29038c(new C37180i(str));
    }
}
