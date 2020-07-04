package com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.C11554a;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.model.p601c.C11786e;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.p280ss.android.ugc.aweme.following.model.C29564a;
import com.p280ss.android.ugc.aweme.following.model.C29574i;
import com.p280ss.android.ugc.aweme.following.model.C29575j;
import com.p280ss.android.ugc.aweme.following.repository.C29600b;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.friends.recommendlist.repository.C30069d;
import com.p280ss.android.ugc.aweme.profile.C35735b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.user.repository.C42844a;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7324c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel */
public final class ConnectedRelationListViewModel extends JediBaseViewModel<ConnectedRelationState> {

    /* renamed from: e */
    public static final C29805a f78362e = new C29805a(null);

    /* renamed from: c */
    public final C29600b f78363c = new C29600b();

    /* renamed from: d */
    public final C30069d f78364d = new C30069d();

    /* renamed from: f */
    private final ListMiddleware<ConnectedRelationState, Object, C29850c> f78365f;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$a */
    public static final class C29805a {
        private C29805a() {
        }

        public /* synthetic */ C29805a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$b */
    static final class C29806b extends Lambda implements C7562b<ConnectedRelationState, ConnectedRelationState> {

        /* renamed from: a */
        public static final C29806b f78366a = new C29806b();

        C29806b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m97566a((ConnectedRelationState) obj);
        }

        /* renamed from: a */
        private static ConnectedRelationState m97566a(ConnectedRelationState connectedRelationState) {
            C7573i.m23587b(connectedRelationState, "$receiver");
            Iterable list = connectedRelationState.getListState().getList();
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (!(next instanceof RecommendContact)) {
                    arrayList.add(next);
                }
            }
            return ConnectedRelationState.copy$default(connectedRelationState, null, null, null, ListState.copy$default(connectedRelationState.getListState(), null, (List) arrayList, null, null, null, 29, null), 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$c */
    static final class C29807c<T> implements C7326g<String> {

        /* renamed from: a */
        public static final C29807c f78367a = new C29807c();

        C29807c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$d */
    static final class C29808d<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C29808d f78368a = new C29808d();

        C29808d() {
        }

        /* renamed from: a */
        private static void m97567a(Throwable th) {
            if (th != null) {
                C6497a.m20185b(th);
            }
        }

        public final /* synthetic */ void accept(Object obj) {
            m97567a((Throwable) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$e */
    static final class C29809e extends Lambda implements C7562b<ConnectedRelationState, C7492s<Pair<? extends List<? extends Object>, ? extends C29850c>>> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationListViewModel f78369a;

        /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$e$a */
        static final class C29812a<T, R> implements C7327h<Throwable, RecommendList> {

            /* renamed from: a */
            public static final C29812a f78372a = new C29812a();

            C29812a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                return m97571a((Throwable) obj);
            }

            /* renamed from: a */
            private static RecommendList m97571a(Throwable th) {
                C7573i.m23587b(th, "it");
                return new RecommendList();
            }
        }

        C29809e(ConnectedRelationListViewModel connectedRelationListViewModel) {
            this.f78369a = connectedRelationListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<Object>, C29850c>> invoke(ConnectedRelationState connectedRelationState) {
            C7573i.m23587b(connectedRelationState, "state");
            C7492s<Pair<List<Object>, C29850c>> d = C7492s.m23298b((C7496w<? extends T1>) this.f78369a.f78363c.m97124a(connectedRelationState.getUserId(), null, null), (C7496w<? extends T2>) this.f78369a.f78364d.mo76453a(Integer.valueOf(30), Integer.valueOf(0), connectedRelationState.getUserId(), 3, Integer.valueOf(0), Integer.valueOf(C43161e.m136882a()), connectedRelationState.getReportId(), null, Integer.valueOf(C43161e.m136884b()), connectedRelationState.getSecUserId()).mo19327f((C7327h<? super Throwable, ? extends T>) C29812a.f78372a), (C7324c<? super T1, ? super T2, ? extends R>) C298101.f78370a).mo19317d((C7327h<? super T, ? extends R>) new C29849b<Object,Object>(C35735b.m115463a((C7562b<? super T, ? extends R>) new C7562b<Triple<? extends Integer, ? extends C29564a, ? extends RecommendList>, Pair<? extends List<? extends Object>, ? extends C29850c>>(this) {

                /* renamed from: a */
                final /* synthetic */ C29809e f78371a;

                {
                    this.f78371a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<Object>, C29850c> invoke(Triple<Integer, C29564a, ? extends RecommendList> triple) {
                    boolean z;
                    List list;
                    boolean z2;
                    C7573i.m23587b(triple, "$receiver");
                    Collection collection = ((C29564a) triple.getSecond()).f77892b;
                    int i = 0;
                    if (collection == null || collection.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        list = C7525m.m23461a();
                    } else {
                        List<? extends User> list2 = ((C29564a) triple.getSecond()).f77892b;
                        List userList = ((RecommendList) triple.getThird()).getUserList();
                        C7573i.m23582a((Object) userList, "third.userList");
                        Iterable iterable = userList;
                        Collection arrayList = new ArrayList();
                        for (Object next : iterable) {
                            User user = (User) next;
                            List<? extends User> list3 = ((C29564a) triple.getSecond()).f77892b;
                            if (list3 == null) {
                                C7573i.m23580a();
                            }
                            Iterable iterable2 = list3;
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it = iterable2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    User user2 = (User) it.next();
                                    C7573i.m23582a((Object) user, "ru");
                                    if (C7573i.m23585a((Object) user.getUid(), (Object) user2.getUid())) {
                                        z2 = false;
                                        break;
                                    }
                                }
                            }
                            z2 = true;
                            if (z2) {
                                arrayList.add(next);
                            }
                        }
                        List<User> list4 = (List) arrayList;
                        for (User user3 : list4) {
                            C7573i.m23582a((Object) user3, "it");
                            user3.setRequestId(((RecommendList) triple.getThird()).getRid());
                        }
                        list = ConnectedRelationListViewModel.m97556a(list2, list4, ((C29564a) triple.getSecond()).f77891a);
                    }
                    List<? extends User> list5 = ((C29564a) triple.getSecond()).f77892b;
                    if (list5 != null) {
                        i = list5.size();
                    }
                    return C7579l.m23633a(list, new C29850c(((C29564a) triple.getSecond()).f77891a, i, ((RecommendList) triple.getThird()).hasMore(), ((RecommendList) triple.getThird()).getCursor()));
                }
            })));
            C7573i.m23582a((Object) d, "Observable.zip(relationO…                       })");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$f */
    static final class C29813f extends Lambda implements C7562b<ConnectedRelationState, C7492s<Pair<? extends List<? extends Object>, ? extends C29850c>>> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationListViewModel f78373a;

        C29813f(ConnectedRelationListViewModel connectedRelationListViewModel) {
            this.f78373a = connectedRelationListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<Object>, C29850c>> invoke(final ConnectedRelationState connectedRelationState) {
            C7573i.m23587b(connectedRelationState, "state");
            C7492s<Pair<List<Object>, C29850c>> d = this.f78373a.f78364d.mo76453a(Integer.valueOf(30), Integer.valueOf(((C29850c) connectedRelationState.getListState().getPayload()).f31255b), connectedRelationState.getUserId(), 3, Integer.valueOf(0), Integer.valueOf(C43161e.m136882a()), connectedRelationState.getReportId(), null, Integer.valueOf(C43161e.m136884b()), connectedRelationState.getSecUserId()).mo19317d((C7327h<? super T, ? extends R>) C298141.f78374a).mo19289a((C7326g<? super T>) C298152.f78375a).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<Object>, C29850c> apply(Triple<Integer, C29564a, ? extends RecommendList> triple) {
                    C7573i.m23587b(triple, "resp");
                    List arrayList = new ArrayList();
                    Object third = triple.getThird();
                    C7573i.m23582a(third, "resp.third");
                    List<User> userList = ((RecommendList) third).getUserList();
                    C7573i.m23582a((Object) userList, "resp.third.userList");
                    for (User user : userList) {
                        C7573i.m23582a((Object) user, "it");
                        C29575j jVar = new C29575j(2, user, 0, null, 12, null);
                        arrayList.add(jVar);
                    }
                    List h = C7525m.m23516h((Iterable<? extends T>) arrayList);
                    String str = ((C29850c) connectedRelationState.getListState().getPayload()).f78422c;
                    int i = ((C29850c) connectedRelationState.getListState().getPayload()).f78423d;
                    boolean hasMore = ((RecommendList) triple.getThird()).hasMore();
                    Object third2 = triple.getThird();
                    C7573i.m23582a(third2, "resp.third");
                    return C7579l.m23633a(h, new C29850c(str, i, hasMore, ((RecommendList) third2).getCursor()));
                }
            });
            C7573i.m23582a((Object) d, "mRecommendListRepository…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$g */
    static final class C29817g extends Lambda implements C7563m<List<? extends Object>, List<? extends Object>, List<Object>> {

        /* renamed from: a */
        public static final C29817g f78377a = new C29817g();

        C29817g() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m97576a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<Object> m97576a(List<? extends Object> list, List<? extends Object> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "loadMore");
            HashSet hashSet = new HashSet();
            List<Object> arrayList = new ArrayList<>();
            int i = 0;
            for (Object next : list) {
                if (next instanceof C29575j) {
                    C29575j jVar = (C29575j) next;
                    if (hashSet.add(jVar.f77949b.getUid())) {
                        int i2 = i + 1;
                        arrayList.add(C29575j.m97120a(jVar.f77948a, jVar.f77949b, i, jVar.f77951d));
                        i = i2;
                    }
                }
                arrayList.add(next);
            }
            int i3 = i;
            for (Object next2 : list2) {
                if (next2 != null) {
                    C29575j jVar2 = (C29575j) next2;
                    if (hashSet.add(jVar2.f77949b.getUid())) {
                        int i4 = i3 + 1;
                        arrayList.add(C29575j.m97120a(jVar2.f77948a, jVar2.f77949b, i3, jVar2.f77951d));
                        i3 = i4;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.following.model.RelationUser");
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$h */
    static final class C29818h<T> implements C7326g<C11786e<? extends List<? extends C42844a>>> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationListViewModel f78378a;

        C29818h(ConnectedRelationListViewModel connectedRelationListViewModel) {
            this.f78378a = connectedRelationListViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(final C11786e<? extends List<C42844a>> eVar) {
            this.f78378a.mo29038c(new C7562b<ConnectedRelationState, ConnectedRelationState>(this) {

                /* renamed from: a */
                final /* synthetic */ C29818h f78379a;

                {
                    this.f78379a = r1;
                }

                /* access modifiers changed from: private */
                /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb  */
                /* JADX WARNING: Removed duplicated region for block: B:47:0x0094 A[SYNTHETIC] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.ConnectedRelationState invoke(com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.ConnectedRelationState r14) {
                    /*
                        r13 = this;
                        java.lang.String r0 = "$receiver"
                        kotlin.jvm.internal.C7573i.m23587b(r14, r0)
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        java.util.List r0 = (java.util.List) r0
                        com.bytedance.jedi.arch.ext.list.ListState r1 = r14.getListState()
                        java.util.List r1 = r1.getList()
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        java.util.Iterator r1 = r1.iterator()
                    L_0x001a:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L_0x0035
                        java.lang.Object r2 = r1.next()
                        boolean r3 = r2 instanceof com.p280ss.android.ugc.aweme.following.model.C29575j
                        if (r3 == 0) goto L_0x001a
                        com.ss.android.ugc.aweme.following.model.j r2 = (com.p280ss.android.ugc.aweme.following.model.C29575j) r2
                        int r3 = r2.f77948a
                        r4 = 5
                        if (r3 != r4) goto L_0x001a
                        com.ss.android.ugc.aweme.profile.model.User r2 = r2.f77949b
                        r0.add(r2)
                        goto L_0x001a
                    L_0x0035:
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        java.util.List r1 = (java.util.List) r1
                        com.bytedance.jedi.model.c.e r2 = r3
                        java.lang.Object r2 = r2.mo29356a()
                        java.util.List r2 = (java.util.List) r2
                        if (r2 == 0) goto L_0x011d
                        java.util.HashMap r3 = new java.util.HashMap
                        java.util.Collection r2 = (java.util.Collection) r2
                        java.util.List r4 = kotlin.collections.C7525m.m23509d(r2)
                        int r4 = r4.size()
                        r3.<init>(r4)
                        java.util.List r2 = kotlin.collections.C7525m.m23509d(r2)
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.Iterator r2 = r2.iterator()
                    L_0x005f:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L_0x007f
                        java.lang.Object r4 = r2.next()
                        com.ss.android.ugc.aweme.user.repository.a r4 = (com.p280ss.android.ugc.aweme.user.repository.C42844a) r4
                        r5 = r3
                        java.util.Map r5 = (java.util.Map) r5
                        com.ss.android.ugc.aweme.profile.model.User r6 = r4.f111320a
                        java.lang.String r6 = r6.getUid()
                        java.lang.String r7 = "item.user.uid"
                        kotlin.jvm.internal.C7573i.m23582a(r6, r7)
                        com.ss.android.ugc.aweme.profile.model.User r4 = r4.f111320a
                        r5.put(r6, r4)
                        goto L_0x005f
                    L_0x007f:
                        com.bytedance.jedi.arch.ext.list.ListState r2 = r14.getListState()
                        java.util.List r2 = r2.getList()
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        java.util.Collection r4 = (java.util.Collection) r4
                        java.util.Iterator r2 = r2.iterator()
                    L_0x0094:
                        boolean r5 = r2.hasNext()
                        if (r5 == 0) goto L_0x00bf
                        java.lang.Object r5 = r2.next()
                        boolean r6 = r5 instanceof com.p280ss.android.ugc.aweme.following.model.C29575j
                        if (r6 == 0) goto L_0x00b8
                        r6 = r5
                        com.ss.android.ugc.aweme.following.model.j r6 = (com.p280ss.android.ugc.aweme.following.model.C29575j) r6
                        int r7 = r6.f77948a
                        r8 = 2
                        if (r7 != r8) goto L_0x00b8
                        com.ss.android.ugc.aweme.profile.model.User r6 = r6.f77949b
                        java.lang.String r6 = r6.getUid()
                        boolean r6 = r3.containsKey(r6)
                        if (r6 == 0) goto L_0x00b8
                        r6 = 1
                        goto L_0x00b9
                    L_0x00b8:
                        r6 = 0
                    L_0x00b9:
                        if (r6 == 0) goto L_0x0094
                        r4.add(r5)
                        goto L_0x0094
                    L_0x00bf:
                        java.util.List r4 = (java.util.List) r4
                        java.lang.Iterable r4 = (java.lang.Iterable) r4
                        java.util.Iterator r2 = r4.iterator()
                    L_0x00c7:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L_0x011d
                        java.lang.Object r4 = r2.next()
                        if (r4 == 0) goto L_0x0115
                        com.ss.android.ugc.aweme.following.model.j r4 = (com.p280ss.android.ugc.aweme.following.model.C29575j) r4
                        com.ss.android.ugc.aweme.profile.model.User r5 = r4.f77949b
                        java.lang.String r5 = r5.getUid()
                        java.lang.Object r5 = r3.get(r5)
                        com.ss.android.ugc.aweme.profile.model.User r5 = (com.p280ss.android.ugc.aweme.profile.model.User) r5
                        if (r5 == 0) goto L_0x00c7
                        com.ss.android.ugc.aweme.profile.model.User r6 = r4.f77949b
                        java.lang.String r6 = r6.getUid()
                        r5.setRequestId(r6)
                        java.lang.String r6 = "user"
                        kotlin.jvm.internal.C7573i.m23582a(r5, r6)
                        com.ss.android.ugc.aweme.profile.model.User r6 = r4.f77949b
                        java.lang.String r6 = r6.getRecommendReason()
                        r5.setRecommendReason(r6)
                        com.ss.android.ugc.aweme.profile.model.User r6 = r4.f77949b
                        int r6 = r6.getAwemeCount()
                        r5.setAwemeCount(r6)
                        com.ss.android.ugc.aweme.profile.model.User r4 = r4.f77949b
                        int r4 = r4.getFollowerCount()
                        r5.setFollowerCount(r4)
                        java.lang.String r4 = "this.also { user ->\n    …                        }"
                        kotlin.jvm.internal.C7573i.m23582a(r5, r4)
                        r1.add(r5)
                        goto L_0x00c7
                    L_0x0115:
                        kotlin.TypeCastException r14 = new kotlin.TypeCastException
                        java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.following.model.RelationUser"
                        r14.<init>(r0)
                        throw r14
                    L_0x011d:
                        com.bytedance.jedi.arch.ext.list.ListState r2 = r14.getListState()
                        com.bytedance.jedi.arch.ext.list.n r2 = r2.getPayload()
                        com.ss.android.ugc.aweme.following.ui.viewmodel.c r2 = (com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.C29850c) r2
                        java.lang.String r2 = r2.f78422c
                        java.util.List r5 = com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.ConnectedRelationListViewModel.m97556a(r0, r1, r2)
                        r0 = 0
                        r1 = 0
                        r2 = 0
                        com.bytedance.jedi.arch.ext.list.ListState r3 = r14.getListState()
                        r4 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 29
                        r10 = 0
                        com.bytedance.jedi.arch.ext.list.ListState r10 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10)
                        r11 = 7
                        r12 = 0
                        r6 = r14
                        r7 = r0
                        r8 = r1
                        r9 = r2
                        com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r14 = com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.ConnectedRelationState.copy$default(r6, r7, r8, r9, r10, r11, r12)
                        return r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.ConnectedRelationListViewModel.C29818h.C298191.invoke(com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState):com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState");
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$i */
    static final class C29820i extends Lambda implements C7563m<ConnectedRelationState, ListState<Object, C29850c>, ConnectedRelationState> {

        /* renamed from: a */
        public static final C29820i f78381a = new C29820i();

        C29820i() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m97579a((ConnectedRelationState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static ConnectedRelationState m97579a(ConnectedRelationState connectedRelationState, ListState<Object, C29850c> listState) {
            C7573i.m23587b(connectedRelationState, "$receiver");
            C7573i.m23587b(listState, "it");
            return ConnectedRelationState.copy$default(connectedRelationState, null, null, null, listState, 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$j */
    static final class C29821j extends Lambda implements C7562b<ConnectedRelationState, ConnectedRelationState> {

        /* renamed from: a */
        final /* synthetic */ String f78382a;

        C29821j(String str) {
            this.f78382a = str;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ConnectedRelationState invoke(ConnectedRelationState connectedRelationState) {
            C7573i.m23587b(connectedRelationState, "$receiver");
            return ConnectedRelationState.copy$default(connectedRelationState, null, null, this.f78382a, null, 11, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m97557h();
    }

    /* renamed from: f */
    public final void mo29069f() {
        this.f78365f.mo29082b();
    }

    /* renamed from: g */
    public final void mo75770g() {
        this.f78365f.mo29085c();
    }

    /* renamed from: h */
    private static ConnectedRelationState m97557h() {
        ConnectedRelationState connectedRelationState = new ConnectedRelationState(null, null, null, null, 15, null);
        return connectedRelationState;
    }

    public final void onCleared() {
        super.onCleared();
        this.f78363c.mo29370a();
        this.f78364d.mo29370a();
    }

    /* renamed from: i */
    private final void m97558i() {
        this.f78364d.mo76452a(3).mo19325f((C7326g<? super T>) new C29818h<Object>(this));
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        ListMiddleware<ConnectedRelationState, Object, C29850c> listMiddleware = this.f78365f;
        listMiddleware.mo29186a(C29848a.f78420a, (C7563m<? super S, ? super PROP, ? extends S>) C29820i.f78381a);
        mo29033a(listMiddleware);
        m97558i();
    }

    public ConnectedRelationListViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C29809e(this), new C29813f(this), null, C29817g.f78377a, 4, null);
        this.f78365f = listMiddleware;
    }

    /* renamed from: a */
    public final void mo75769a(String str) {
        C7573i.m23587b(str, "reportId");
        mo29038c(new C29821j(str));
    }

    /* renamed from: a */
    public final void mo75768a(User user) {
        C7573i.m23587b(user, "user");
        if (user instanceof RecommendContact) {
            mo29038c(C29806b.f78366a);
            return;
        }
        C30069d dVar = this.f78364d;
        String uid = user.getUid();
        C7573i.m23582a((Object) uid, "user.uid");
        dVar.mo76451a(uid).mo19129a((C7326g<? super T>) C29807c.f78367a, (C7326g<? super Throwable>) C29808d.f78368a);
    }

    /* renamed from: a */
    public static List<Object> m97556a(List<? extends User> list, List<? extends User> list2, String str) {
        boolean z;
        List<Object> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        Collection collection = list;
        int i = 0;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList.add(new C29574i(6, str));
            for (User user : list) {
                C29575j jVar = new C29575j(5, user, 0, null, 12, null);
                arrayList.add(jVar);
                hashSet.add(user.getUid());
            }
        }
        Collection collection2 = list2;
        if (!collection2.isEmpty()) {
            String string = C6399b.m19921a().getResources().getString(R.string.ag_);
            C7573i.m23582a((Object) string, "AppContextManager.getApp…relation_recommend_title)");
            arrayList.add(new C29574i(4, string));
            for (User user2 : C7525m.m23509d(collection2)) {
                if (user2 instanceof RecommendContact) {
                    arrayList.add(new RecommendContact(null, 1, null));
                } else if (hashSet.add(user2.getUid())) {
                    int i2 = i + 1;
                    String requestId = user2.getRequestId();
                    C7573i.m23582a((Object) requestId, "user.requestId");
                    arrayList.add(new C29575j(2, user2, i, requestId));
                    i = i2;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final <RECEIVER extends C11501d> void mo75767a(C11502e<? extends RECEIVER> eVar, C11554a<Object> aVar, C11557c<Object, RECEIVER> cVar, C11557c<Object, RECEIVER> cVar2, C7563m<? super RECEIVER, ? super Boolean, C7581n> mVar) {
        C11502e<? extends RECEIVER> eVar2 = eVar;
        C7573i.m23587b(eVar, "subscriber");
        C11554a<Object> aVar2 = aVar;
        C7573i.m23587b(aVar2, "adapter");
        ListMiddleware.m33938a(this.f78365f, eVar2, aVar2, false, eVar.mo29068c(), cVar, cVar2, mVar, null, null, null, 896, null);
    }
}
