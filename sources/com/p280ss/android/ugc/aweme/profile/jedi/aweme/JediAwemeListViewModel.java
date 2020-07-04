package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.C11556b;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.MediaMixList;
import com.p280ss.android.ugc.aweme.profile.service.C36073i;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel.C36779a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7579l;
import kotlin.C7581n;
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
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7324c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel */
public final class JediAwemeListViewModel extends JediBaseViewModel<AwemeListState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f94019c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(JediAwemeListViewModel.class), "awemeListRepository", "getAwemeListRepository()Lcom/ss/android/ugc/aweme/profile/jedi/aweme/JediAwemeListRepository;"))};

    /* renamed from: d */
    public FeedItemList f94020d;

    /* renamed from: e */
    public int f94021e;

    /* renamed from: f */
    public final ListMiddleware<AwemeListState, Object, C35968f> f94022f;

    /* renamed from: g */
    private final C7541d f94023g = C7546e.m23568a(LazyThreadSafetyMode.NONE, C35898a.f94024a);

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$a */
    static final class C35898a extends Lambda implements C7561a<C35979m> {

        /* renamed from: a */
        public static final C35898a f94024a = new C35898a();

        C35898a() {
            super(0);
        }

        /* renamed from: a */
        private static C35979m m115817a() {
            return new C35979m();
        }

        public final /* synthetic */ Object invoke() {
            return m115817a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$b */
    static final class C35899b extends Lambda implements C7562b<AwemeListState, C7492s<Pair<? extends List<? extends Object>, ? extends C35968f>>> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListViewModel f94025a;

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$b$a */
        static final class C35901a<T> implements C7326g<FeedItemList> {

            /* renamed from: a */
            final /* synthetic */ C35899b f94027a;

            C35901a(C35899b bVar) {
                this.f94027a = bVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(FeedItemList feedItemList) {
                this.f94027a.f94025a.mo90880b(feedItemList);
                JediAwemeListViewModel jediAwemeListViewModel = this.f94027a.f94025a;
                C7573i.m23582a((Object) feedItemList, "it");
                jediAwemeListViewModel.mo90876a(feedItemList);
                this.f94027a.f94025a.f94021e = feedItemList.status_code;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$b$b */
        static final class C35902b<T, R> implements C7327h<T, R> {

            /* renamed from: a */
            public static final C35902b f94028a = new C35902b();

            C35902b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                return m115821a((FeedItemList) obj);
            }

            /* renamed from: a */
            private static Pair<List<Object>, C35968f> m115821a(FeedItemList feedItemList) {
                C7573i.m23587b(feedItemList, "it");
                List items = feedItemList.getItems();
                if (items == null) {
                    items = C7525m.m23461a();
                }
                boolean z = true;
                if (feedItemList.hasMore != 1) {
                    z = false;
                }
                return C7579l.m23633a(items, new C35968f(z, (int) feedItemList.cursor, feedItemList.maxCursor));
            }
        }

        C35899b(JediAwemeListViewModel jediAwemeListViewModel) {
            this.f94025a = jediAwemeListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<Object>, C35968f>> invoke(AwemeListState awemeListState) {
            C7492s sVar;
            C7573i.m23587b(awemeListState, "state");
            if (awemeListState.getProfileListType() != 1) {
                sVar = C35979m.m115935b(this.f94025a.mo29069f(), awemeListState.getUserId(), awemeListState.getSecUserId(), 0, 0, 12, null);
            } else {
                sVar = C35979m.m115934a(this.f94025a.mo29069f(), awemeListState.getUserId(), awemeListState.getSecUserId(), 0, 0, 12, null);
            }
            C7492s<Pair<List<Object>, C35968f>> d = sVar.mo19316d((C7326g<? super T>) new C35901a<Object>(this)).mo19317d((C7327h<? super T, ? extends R>) C35902b.f94028a);
            C7573i.m23582a((Object) d, "when (state.profileListT…Cursor)\n                }");
            if (awemeListState.getProfileListType() != 0 || ((!awemeListState.isMyProfile() && awemeListState.isPrivateAccount() && awemeListState.getFollowStatus() != 1 && awemeListState.getFollowStatus() != 2) || !C36073i.f94313a.mo85873b())) {
                return d;
            }
            C7496w wVar = d;
            C36779a aVar = MediaMixListViewModel.f96519g;
            String userId = awemeListState.getUserId();
            if (userId == null) {
                userId = "";
            }
            String secUserId = awemeListState.getSecUserId();
            if (secUserId == null) {
                secUserId = "";
            }
            C7492s<Pair<List<Object>, C35968f>> a = C7492s.m23284a(wVar, (C7496w<? extends T2>) C36779a.m118546a(aVar, userId, secUserId, 0, 0, 12, null), (C7324c<? super T1, ? super T2, ? extends R>) C359001.f94026a);
            C7573i.m23582a((Object) a, "Observable.combineLatest…nd\n                    })");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$c */
    static final class C35903c extends Lambda implements C7562b<AwemeListState, C7492s<Pair<? extends List<? extends Object>, ? extends C35968f>>> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListViewModel f94029a;

        C35903c(JediAwemeListViewModel jediAwemeListViewModel) {
            this.f94029a = jediAwemeListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<Object>, C35968f>> invoke(AwemeListState awemeListState) {
            C7492s sVar;
            C7573i.m23587b(awemeListState, "state");
            if (awemeListState.getProfileListType() != 1) {
                sVar = C35979m.m115935b(this.f94029a.mo29069f(), awemeListState.getUserId(), awemeListState.getSecUserId(), ((C35968f) awemeListState.getListState().getPayload()).f94143c, 0, 8, null);
            } else {
                sVar = C35979m.m115934a(this.f94029a.mo29069f(), awemeListState.getUserId(), awemeListState.getSecUserId(), ((C35968f) awemeListState.getListState().getPayload()).f94143c, 0, 8, null);
            }
            C7492s<Pair<List<Object>, C35968f>> d = sVar.mo19316d((C7326g<? super T>) new C7326g<FeedItemList>(this) {

                /* renamed from: a */
                final /* synthetic */ C35903c f94030a;

                {
                    this.f94030a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(FeedItemList feedItemList) {
                    this.f94030a.f94029a.mo90880b(feedItemList);
                    FeedItemList g = this.f94030a.f94029a.mo90882g();
                    List items = g.getItems();
                    C7573i.m23582a((Object) feedItemList, "it");
                    items.addAll(C35987o.m115949a(feedItemList.getItems()));
                    g.cursor = feedItemList.cursor;
                    g.hasMore = feedItemList.hasMore;
                    g.logPb = feedItemList.logPb;
                }
            }).mo19317d((C7327h<? super T, ? extends R>) C359052.f94031a);
            C7573i.m23582a((Object) d, "when (state.profileListT…Cursor)\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$d */
    static final class C35906d extends Lambda implements C7563m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a */
        public static final C35906d f94032a = new C35906d();

        C35906d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m115825a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<Object> m115825a(List<? extends Object> list, List<? extends Object> list2) {
            Object obj;
            C7573i.m23587b(list, "old");
            C7573i.m23587b(list2, "refresh");
            Collection collection = list2;
            if (!(!collection.isEmpty())) {
                return list;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj instanceof C27311c) {
                    break;
                }
            }
            if (obj == null) {
                return list2;
            }
            if (C7525m.m23513g(list2) instanceof MediaMixList) {
                List<Object> c = C7525m.m23466c(C7525m.m23511f(list2));
                c.add(obj);
                c.addAll(list2.subList(1, list2.size()));
                return c;
            }
            List<Object> c2 = C7525m.m23466c(C7525m.m23511f(list));
            c2.addAll(collection);
            return c2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$e */
    static final class C35907e extends Lambda implements C7563m<AwemeListState, ListState<Object, C35968f>, AwemeListState> {

        /* renamed from: a */
        public static final C35907e f94033a = new C35907e();

        C35907e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m115826a((AwemeListState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static AwemeListState m115826a(AwemeListState awemeListState, ListState<Object, C35968f> listState) {
            AwemeListState awemeListState2 = awemeListState;
            ListState<Object, C35968f> listState2 = listState;
            C7573i.m23587b(awemeListState, "$receiver");
            C7573i.m23587b(listState, "it");
            return AwemeListState.copy$default(awemeListState2, null, null, false, false, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, listState2, 1048575, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$f */
    static final class C35908f<T> implements C7326g<List<? extends Pair<? extends Integer, ? extends List<? extends Aweme>>>> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListViewModel f94034a;

        C35908f(JediAwemeListViewModel jediAwemeListViewModel) {
            this.f94034a = jediAwemeListViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(List<? extends Pair<Integer, ? extends List<? extends Aweme>>> list) {
            C7573i.m23582a((Object) list, "newList");
            final List list2 = (List) ((Pair) C7525m.m23511f(list)).getSecond();
            if (list2 != null) {
                this.f94034a.mo29036b(new C7562b<AwemeListState, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C35908f f94035a;

                    {
                        this.f94035a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m115828a((AwemeListState) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m115828a(AwemeListState awemeListState) {
                        C7573i.m23587b(awemeListState, "state");
                        Iterable list = awemeListState.getListState().getList();
                        Collection arrayList = new ArrayList();
                        for (Object next : list) {
                            if (!(next instanceof Aweme)) {
                                arrayList.add(next);
                            }
                        }
                        final List c = C7525m.m23506c((Collection<? extends T>) C7525m.m23509d((Collection<? extends T>) (List) arrayList), (Iterable<? extends T>) list2);
                        FeedItemList g = this.f94035a.f94034a.mo90882g();
                        g.items = list2;
                        if (awemeListState.getProfileListType() == 0) {
                            C35975l lVar = C35975l.f94147a;
                            FeedItemList clone = g.clone();
                            List items = clone.getItems();
                            C7573i.m23582a((Object) items, "items");
                            clone.items = C7525m.m23505c((Iterable<? extends T>) items, 20);
                            C7573i.m23582a((Object) clone, "this.clone().apply {\n   …                        }");
                            C35975l.m115930b(lVar, clone, awemeListState.getUserId(), 0, 4, null);
                        }
                        this.f94035a.f94034a.mo29038c(new C7562b<AwemeListState, AwemeListState>() {
                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public AwemeListState invoke(AwemeListState awemeListState) {
                                boolean z;
                                C7573i.m23587b(awemeListState, "$receiver");
                                ListState listState = awemeListState.getListState();
                                List list = c;
                                Collection collection = c;
                                if (collection == null || collection.isEmpty()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                return AwemeListState.copy$default(awemeListState, null, null, false, false, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, ListState.copy$default(listState, null, list, null, null, new C11556b(z), 13, null), 1048575, null);
                            }
                        });
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$g */
    static final class C35911g extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListViewModel f94038a;

        C35911g(JediAwemeListViewModel jediAwemeListViewModel) {
            this.f94038a = jediAwemeListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115830a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115830a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            if (awemeListState.isMyProfile() && awemeListState.getProfileListType() == 0) {
                JediAwemeListViewModel jediAwemeListViewModel = this.f94038a;
                this.f94038a.mo29069f();
                C7321c f = C35979m.m115936c().mo19325f((C7326g<? super T>) new C7326g<List<? extends C27311c>>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C35911g f94039a;

                    {
                        this.f94039a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(List<? extends C27311c> list) {
                        C7573i.m23582a((Object) list, "draftList");
                        final C27311c cVar = (C27311c) C7525m.m23513g(list);
                        this.f94039a.f94038a.mo29036b(new C7562b<AwemeListState, C7581n>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C359121 f94040a;

                            {
                                this.f94040a = r1;
                            }

                            public final /* synthetic */ Object invoke(Object obj) {
                                m115832a((AwemeListState) obj);
                                return C7581n.f20898a;
                            }

                            /* renamed from: a */
                            private void m115832a(AwemeListState awemeListState) {
                                final List list;
                                boolean z;
                                boolean z2;
                                C7573i.m23587b(awemeListState, "state");
                                if (cVar == null) {
                                    Iterable list2 = awemeListState.getListState().getList();
                                    Collection arrayList = new ArrayList();
                                    for (Object next : list2) {
                                        if (!(next instanceof C27311c)) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            arrayList.add(next);
                                        }
                                    }
                                    list = (List) arrayList;
                                } else {
                                    Collection c = C7525m.m23466c(cVar);
                                    Iterable list3 = awemeListState.getListState().getList();
                                    Collection arrayList2 = new ArrayList();
                                    for (Object next2 : list3) {
                                        if (!(next2 instanceof C27311c)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            arrayList2.add(next2);
                                        }
                                    }
                                    list = C7525m.m23506c(c, (Iterable<? extends T>) (List) arrayList2);
                                }
                                this.f94040a.f94039a.f94038a.mo29038c(new C7562b<AwemeListState, AwemeListState>() {
                                    /* access modifiers changed from: private */
                                    /* renamed from: a */
                                    public AwemeListState invoke(AwemeListState awemeListState) {
                                        boolean z;
                                        C7573i.m23587b(awemeListState, "$receiver");
                                        ListState listState = awemeListState.getListState();
                                        List list = list;
                                        Collection collection = list;
                                        if (collection == null || collection.isEmpty()) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        return AwemeListState.copy$default(awemeListState, null, null, false, false, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, ListState.copy$default(listState, null, list, null, null, new C11556b(z), 13, null), 1048575, null);
                                    }
                                });
                            }
                        });
                    }
                });
                C7573i.m23582a((Object) f, "awemeListRepository.obse…      }\n                }");
                jediAwemeListViewModel.mo29029a(f);
                this.f94038a.mo29069f();
                C35979m.m115937d().mo19128a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$h */
    static final class C35915h extends Lambda implements C7562b<AwemeListState, AwemeListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f94043a;

        C35915h(boolean z) {
            this.f94043a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AwemeListState invoke(AwemeListState awemeListState) {
            AwemeListState awemeListState2 = awemeListState;
            C7573i.m23587b(awemeListState, "$receiver");
            return AwemeListState.copy$default(awemeListState2, null, null, false, false, 0, this.f94043a, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, 2097119, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$i */
    static final class C35916i extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListViewModel f94044a;

        /* renamed from: b */
        final /* synthetic */ RoomStruct f94045b;

        C35916i(JediAwemeListViewModel jediAwemeListViewModel, RoomStruct roomStruct) {
            this.f94044a = jediAwemeListViewModel;
            this.f94045b = roomStruct;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115835a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115835a(final AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "state");
            this.f94044a.mo29038c(new C7562b<AwemeListState, AwemeListState>(this) {

                /* renamed from: a */
                final /* synthetic */ C35916i f94046a;

                {
                    this.f94046a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public AwemeListState invoke(AwemeListState awemeListState) {
                    List list;
                    boolean z;
                    boolean z2;
                    C7573i.m23587b(awemeListState, "$receiver");
                    if (this.f94046a.f94045b == null) {
                        Iterable list2 = awemeListState.getListState().getList();
                        Collection arrayList = new ArrayList();
                        for (Object next : list2) {
                            if (!(next instanceof RoomStruct)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                arrayList.add(next);
                            }
                        }
                        list = (List) arrayList;
                    } else {
                        Iterable list3 = awemeListState.getListState().getList();
                        Collection arrayList2 = new ArrayList();
                        for (Object next2 : list3) {
                            if (!(next2 instanceof RoomStruct)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList2.add(next2);
                            }
                        }
                        Iterable<Object> iterable = (List) arrayList2;
                        Collection c = C7525m.m23466c(this.f94046a.f94045b);
                        for (Object add : iterable) {
                            c.add(add);
                        }
                        list = (List) c;
                    }
                    return AwemeListState.copy$default(awemeListState, null, null, false, false, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, ListState.copy$default(awemeListState.getListState(), null, list, null, null, null, 29, null), 1048575, null);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListViewModel$j */
    static final class C35918j extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FeedItemList f94048a;

        C35918j(FeedItemList feedItemList) {
            this.f94048a = feedItemList;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115837a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115837a(AwemeListState awemeListState) {
            int i;
            C7573i.m23587b(awemeListState, "it");
            if (awemeListState.isMyProfile()) {
                i = 1000;
            } else {
                i = AdError.SERVER_ERROR_CODE;
            }
            int profileListType = awemeListState.getProfileListType();
            List items = this.f94048a.getItems();
            if (items != null) {
                int i2 = 0;
                for (Object next : items) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C7525m.m23465b();
                    }
                    Aweme aweme = (Aweme) next;
                    IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                    StringBuilder sb = new StringBuilder();
                    C7573i.m23582a((Object) aweme, "aweme");
                    sb.append(aweme.getAid());
                    sb.append(i + profileListType);
                    iRequestIdService.setRequestIdAndIndex(sb.toString(), this.f94048a.getRequestId(), i2);
                    i2 = i3;
                }
            }
        }
    }

    /* renamed from: f */
    public final C35979m mo29069f() {
        return (C35979m) this.f94023g.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m115805h();
    }

    /* renamed from: g */
    public final FeedItemList mo90882g() {
        FeedItemList feedItemList = this.f94020d;
        if (feedItemList == null) {
            C7573i.m23583a("cacheData");
        }
        return feedItemList;
    }

    public JediAwemeListViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C35899b(this), new C35903c(this), C35906d.f94032a, null, 8, null);
        this.f94022f = listMiddleware;
    }

    /* renamed from: h */
    private static AwemeListState m115805h() {
        AwemeListState awemeListState = new AwemeListState(null, null, false, false, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, 2097151, null);
        return awemeListState;
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        ListMiddleware<AwemeListState, Object, C35968f> listMiddleware = this.f94022f;
        listMiddleware.mo29186a(C35986n.f94169a, (C7563m<? super S, ? super PROP, ? extends S>) C35907e.f94033a);
        mo29033a(listMiddleware);
        C7321c f = mo29069f().mo90906b().mo19325f((C7326g<? super T>) new C35908f<Object>(this));
        C7573i.m23582a((Object) f, "awemeListRepository.obse…}\n            }\n        }");
        mo29029a(f);
        mo29036b(new C35911g(this));
    }

    /* renamed from: a */
    public final void mo90876a(FeedItemList feedItemList) {
        C7573i.m23587b(feedItemList, "<set-?>");
        this.f94020d = feedItemList;
    }

    /* renamed from: a */
    public final void mo90875a(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        mo29069f().mo90904a(aweme);
    }

    /* renamed from: a */
    public final void mo90877a(RoomStruct roomStruct) {
        mo29036b(new C35916i(this, roomStruct));
    }

    /* renamed from: f */
    public final void mo90881f(C7562b<? super AwemeListState, AwemeListState> bVar) {
        C7573i.m23587b(bVar, "reducer");
        mo29038c(bVar);
    }

    /* renamed from: a */
    public final void mo90878a(String str) {
        C7573i.m23587b(str, "aid");
        mo29069f().mo90905a(str);
    }

    /* renamed from: b */
    public final void mo90880b(FeedItemList feedItemList) {
        String str;
        if (feedItemList != null) {
            LogPbBean logPbBean = feedItemList.logPb;
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            feedItemList.setRequestId(str);
            C28199ae.m92689a().mo71792a(feedItemList.getRequestId(), feedItemList.logPb);
            mo29036b(new C35918j(feedItemList));
        }
    }

    /* renamed from: a */
    public final void mo90879a(boolean z) {
        mo29038c(new C35915h(z));
    }
}
