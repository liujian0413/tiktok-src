package com.p280ss.android.ugc.aweme.comment;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24164m;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24164m.C24165a;
import com.p280ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.p280ss.android.ugc.aweme.friends.model.RecentFriendModel;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7324c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.comment.a */
public final class C24021a {

    /* renamed from: f */
    public static final C24022a f63522f = new C24022a(null);

    /* renamed from: a */
    public C24023b f63523a;

    /* renamed from: b */
    public CommentAtSearchAdapter f63524b;

    /* renamed from: c */
    public final HashMap<String, SummonFriendList> f63525c = new HashMap<>();

    /* renamed from: d */
    public SummonFriendList f63526d;

    /* renamed from: e */
    public SummonFriendList f63527e;

    /* renamed from: g */
    private SummonFriendList f63528g;

    /* renamed from: h */
    private final C24164m f63529h;

    /* renamed from: com.ss.android.ugc.aweme.comment.a$a */
    public static final class C24022a {
        private C24022a() {
        }

        public /* synthetic */ C24022a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$b */
    public interface C24023b {
        /* renamed from: a */
        void mo62304a();

        /* renamed from: a */
        void mo62305a(boolean z);

        /* renamed from: a */
        boolean mo62306a(String str);

        /* renamed from: b */
        void mo62307b();

        void dismiss();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$c */
    public static final class C24024c implements C24165a {

        /* renamed from: a */
        final /* synthetic */ C24021a f63530a;

        C24024c(C24021a aVar) {
            this.f63530a = aVar;
        }

        /* renamed from: a */
        public final void mo62309a(String str) {
            boolean z;
            C7573i.m23587b(str, "s");
            if (!C6399b.m19945u() || C24086b.m79029a(C6399b.m19921a())) {
                this.f63530a.mo62297a(str, 0, 10, 0);
            } else {
                Collection a = this.f63530a.mo62299b().mo62312a();
                if (a == null || a.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f63530a.mo62292a().mo62305a(true);
                    this.f63530a.mo62292a().mo62307b();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$d */
    static final class C24025d<T1, T2, R> implements C7324c<RecentFriendModel, RecentFriendModel, SummonFriendList> {

        /* renamed from: a */
        final /* synthetic */ C24021a f63531a;

        C24025d(C24021a aVar) {
            this.f63531a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SummonFriendList apply(RecentFriendModel recentFriendModel, RecentFriendModel recentFriendModel2) {
            C7573i.m23587b(recentFriendModel, "t1");
            C7573i.m23587b(recentFriendModel2, "t2");
            SummonFriendList summonFriendList = new SummonFriendList(new ArrayList(), 0, false, "");
            this.f63531a.f63527e.items.clear();
            List<User> list = recentFriendModel.users;
            if (list != null) {
                for (User user : list) {
                    List<User> list2 = recentFriendModel2.users;
                    if (list2 != null) {
                        Iterable iterable = list2;
                        Collection arrayList = new ArrayList();
                        for (Object next : iterable) {
                            User user2 = (User) next;
                            C7573i.m23582a((Object) user, "t1User");
                            String uid = user.getUid();
                            C7573i.m23582a((Object) user2, "it");
                            if (C7573i.m23585a((Object) uid, (Object) user2.getUid())) {
                                arrayList.add(next);
                            }
                        }
                        for (User user3 : (List) arrayList) {
                            List<User> list3 = recentFriendModel2.users;
                            if (list3 != null) {
                                list3.remove(user3);
                            }
                        }
                    }
                    SummonFriendItem summonFriendItem = new SummonFriendItem();
                    summonFriendItem.mUser = user;
                    summonFriendItem.type = 4;
                    summonFriendList.items.add(summonFriendItem);
                    this.f63531a.f63527e.items.add(summonFriendItem);
                }
            }
            List<User> list4 = recentFriendModel2.users;
            if (list4 != null) {
                for (User user4 : list4) {
                    SummonFriendItem summonFriendItem2 = new SummonFriendItem();
                    summonFriendItem2.mUser = user4;
                    summonFriendItem2.type = 3;
                    summonFriendList.items.add(summonFriendItem2);
                }
            }
            summonFriendList.cursor = recentFriendModel2.cursor;
            summonFriendList.hasMore = recentFriendModel2.hasMore;
            return summonFriendList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$e */
    public static final class C24026e implements C7498y<SummonFriendList> {

        /* renamed from: a */
        final /* synthetic */ C24021a f63532a;

        /* renamed from: b */
        final /* synthetic */ int f63533b;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(SummonFriendList summonFriendList) {
            C7573i.m23587b(summonFriendList, "data");
            this.f63532a.mo62299b().ai_();
            this.f63532a.mo62296a(summonFriendList, this.f63533b);
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f63532a.mo62299b().ai_();
            this.f63532a.mo62299b().mo66508i();
            this.f63532a.mo62292a().mo62305a(true);
            if (this.f63533b == 0) {
                this.f63532a.mo62292a().mo62307b();
            }
        }

        C24026e(C24021a aVar, int i) {
            this.f63532a = aVar;
            this.f63533b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$f */
    public static final class C24027f implements C7498y<RecentFriendModel> {

        /* renamed from: a */
        final /* synthetic */ C24021a f63534a;

        /* renamed from: b */
        final /* synthetic */ int f63535b;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f63534a.mo62299b().ai_();
            this.f63534a.mo62299b().mo66507h();
            this.f63534a.mo62292a().mo62305a(true);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(RecentFriendModel recentFriendModel) {
            String str;
            C7573i.m23587b(recentFriendModel, "t");
            this.f63534a.mo62299b().ai_();
            SummonFriendList summonFriendList = new SummonFriendList(new ArrayList(), recentFriendModel.cursor, recentFriendModel.hasMore, "");
            List<User> list = recentFriendModel.users;
            if (list != null) {
                for (User user : list) {
                    boolean z = false;
                    List<SummonFriendItem> list2 = this.f63534a.f63527e.items;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            SummonFriendItem summonFriendItem = (SummonFriendItem) it.next();
                            C7573i.m23582a((Object) summonFriendItem, "it2");
                            User user2 = summonFriendItem.mUser;
                            if (user2 != null) {
                                str = user2.getUid();
                            } else {
                                str = null;
                            }
                            C7573i.m23582a((Object) user, "it");
                            if (C7573i.m23585a((Object) str, (Object) user.getUid())) {
                                z = true;
                                break;
                            }
                        }
                    }
                    if (!z) {
                        SummonFriendItem summonFriendItem2 = new SummonFriendItem();
                        summonFriendItem2.mUser = user;
                        summonFriendList.items.add(summonFriendItem2);
                    }
                }
            }
            this.f63534a.mo62296a(summonFriendList, this.f63535b);
        }

        C24027f(C24021a aVar, int i) {
            this.f63534a = aVar;
            this.f63535b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.a$g */
    public static final class C24028g implements C7498y<SummonFriendList> {

        /* renamed from: a */
        final /* synthetic */ C24021a f63536a;

        /* renamed from: b */
        final /* synthetic */ String f63537b;

        /* renamed from: c */
        final /* synthetic */ int f63538c;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "p0");
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "p0");
            this.f63536a.mo62299b().ai_();
            this.f63536a.mo62299b().mo66507h();
            this.f63536a.mo62292a().mo62305a(true);
            if (this.f63538c == 0) {
                this.f63536a.mo62292a().mo62307b();
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fd, code lost:
            if (r4 != false) goto L_0x0101;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(com.p280ss.android.ugc.aweme.friends.model.SummonFriendList r11) {
            /*
                r10 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.C7573i.m23587b(r11, r0)
                com.ss.android.ugc.aweme.comment.a r0 = r10.f63536a
                com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter r0 = r0.mo62299b()
                r0.ai_()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2 = r0
                java.util.List r2 = (java.util.List) r2
                long r3 = r11.cursor
                boolean r5 = r11.hasMore
                java.lang.String r6 = r10.f63537b
                com.ss.android.ugc.aweme.friends.model.SummonFriendList r0 = new com.ss.android.ugc.aweme.friends.model.SummonFriendList
                r1 = r0
                r1.<init>(r2, r3, r5, r6)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r3 = r1
                java.util.List r3 = (java.util.List) r3
                long r4 = r11.cursor
                boolean r6 = r11.hasMore
                java.lang.String r7 = r10.f63537b
                com.ss.android.ugc.aweme.friends.model.SummonFriendList r1 = new com.ss.android.ugc.aweme.friends.model.SummonFriendList
                r2 = r1
                r2.<init>(r3, r4, r6, r7)
                com.ss.android.ugc.aweme.comment.a r2 = r10.f63536a
                com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter r2 = r2.mo62299b()
                java.util.List r2 = r2.mo62312a()
                if (r2 != 0) goto L_0x0046
                java.util.List r2 = kotlin.collections.C7525m.m23461a()
            L_0x0046:
                java.util.List<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r11 = r11.items
                if (r11 == 0) goto L_0x0111
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.Iterator r11 = r11.iterator()
            L_0x0050:
                boolean r3 = r11.hasNext()
                if (r3 == 0) goto L_0x0111
                java.lang.Object r3 = r11.next()
                com.ss.android.ugc.aweme.friends.model.SummonFriendItem r3 = (com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem) r3
                r4 = r2
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                boolean r5 = r4 instanceof java.util.Collection
                r6 = 1
                r7 = 0
                r8 = 0
                if (r5 == 0) goto L_0x006f
                r5 = r4
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L_0x00a5
            L_0x006f:
                java.util.Iterator r4 = r4.iterator()
            L_0x0073:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x00a5
                java.lang.Object r5 = r4.next()
                com.ss.android.ugc.aweme.friends.model.SummonFriendItem r5 = (com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem) r5
                java.lang.String r9 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r5, r9)
                com.ss.android.ugc.aweme.profile.model.User r5 = r5.mUser
                if (r5 == 0) goto L_0x008d
                java.lang.String r5 = r5.getUid()
                goto L_0x008e
            L_0x008d:
                r5 = r7
            L_0x008e:
                java.lang.String r9 = "item"
                kotlin.jvm.internal.C7573i.m23582a(r3, r9)
                com.ss.android.ugc.aweme.profile.model.User r9 = r3.mUser
                if (r9 == 0) goto L_0x009c
                java.lang.String r9 = r9.getUid()
                goto L_0x009d
            L_0x009c:
                r9 = r7
            L_0x009d:
                boolean r5 = kotlin.jvm.internal.C7573i.m23585a(r5, r9)
                if (r5 == 0) goto L_0x0073
                r4 = 1
                goto L_0x00a6
            L_0x00a5:
                r4 = 0
            L_0x00a6:
                if (r4 != 0) goto L_0x0050
                boolean r4 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                if (r4 == 0) goto L_0x0100
                com.ss.android.ugc.aweme.comment.a r4 = r10.f63536a
                com.ss.android.ugc.aweme.friends.model.SummonFriendList r4 = r4.f63526d
                java.util.List<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r4 = r4.items
                if (r4 == 0) goto L_0x00fc
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                boolean r5 = r4 instanceof java.util.Collection
                if (r5 == 0) goto L_0x00c6
                r5 = r4
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L_0x00c6
                goto L_0x00fc
            L_0x00c6:
                java.util.Iterator r4 = r4.iterator()
            L_0x00ca:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x00fc
                java.lang.Object r5 = r4.next()
                com.ss.android.ugc.aweme.friends.model.SummonFriendItem r5 = (com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem) r5
                java.lang.String r9 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r5, r9)
                com.ss.android.ugc.aweme.profile.model.User r5 = r5.mUser
                if (r5 == 0) goto L_0x00e4
                java.lang.String r5 = r5.getUid()
                goto L_0x00e5
            L_0x00e4:
                r5 = r7
            L_0x00e5:
                java.lang.String r9 = "item"
                kotlin.jvm.internal.C7573i.m23582a(r3, r9)
                com.ss.android.ugc.aweme.profile.model.User r9 = r3.mUser
                if (r9 == 0) goto L_0x00f3
                java.lang.String r9 = r9.getUid()
                goto L_0x00f4
            L_0x00f3:
                r9 = r7
            L_0x00f4:
                boolean r5 = kotlin.jvm.internal.C7573i.m23585a(r5, r9)
                if (r5 == 0) goto L_0x00ca
                r4 = 1
                goto L_0x00fd
            L_0x00fc:
                r4 = 0
            L_0x00fd:
                if (r4 == 0) goto L_0x0100
                goto L_0x0101
            L_0x0100:
                r6 = 0
            L_0x0101:
                if (r6 == 0) goto L_0x010a
                java.util.List<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r4 = r0.items
                r4.add(r3)
                goto L_0x0050
            L_0x010a:
                java.util.List<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r4 = r1.items
                r4.add(r3)
                goto L_0x0050
            L_0x0111:
                java.util.List<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r11 = r0.items
                java.util.List<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r1 = r1.items
                java.lang.String r2 = "summonFriendList.items"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.util.Collection r1 = (java.util.Collection) r1
                r11.addAll(r1)
                com.ss.android.ugc.aweme.comment.a r11 = r10.f63536a
                java.lang.String r1 = r10.f63537b
                int r2 = r10.f63538c
                r11.mo62298a(r1, r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.C24021a.C24028g.onNext(com.ss.android.ugc.aweme.friends.model.SummonFriendList):void");
        }

        C24028g(C24021a aVar, String str, int i) {
            this.f63536a = aVar;
            this.f63537b = str;
            this.f63538c = i;
        }
    }

    /* renamed from: a */
    public final void mo62298a(String str, SummonFriendList summonFriendList, int i) {
        m78843b(str, summonFriendList, i);
        C24023b bVar = this.f63523a;
        if (bVar == null) {
            C7573i.m23583a("listener");
        }
        if (bVar.mo62306a(str)) {
            CommentAtSearchAdapter commentAtSearchAdapter = this.f63524b;
            if (commentAtSearchAdapter == null) {
                C7573i.m23583a("adapter");
            }
            boolean z = true;
            commentAtSearchAdapter.f63570b = 1;
            C24023b bVar2 = this.f63523a;
            if (bVar2 == null) {
                C7573i.m23583a("listener");
            }
            bVar2.mo62305a(true);
            CommentAtSearchAdapter commentAtSearchAdapter2 = this.f63524b;
            if (commentAtSearchAdapter2 == null) {
                C7573i.m23583a("adapter");
            }
            commentAtSearchAdapter2.mo66516d(summonFriendList.hasMore);
            SummonFriendList summonFriendList2 = (SummonFriendList) this.f63525c.get(str);
            if (summonFriendList2 != null) {
                this.f63528g = summonFriendList2;
                CommentAtSearchAdapter commentAtSearchAdapter3 = this.f63524b;
                if (commentAtSearchAdapter3 == null) {
                    C7573i.m23583a("adapter");
                }
                commentAtSearchAdapter3.mo58045a(this.f63528g.items);
                Collection collection = this.f63528g.items;
                if (collection != null && !collection.isEmpty()) {
                    z = false;
                }
                if (z) {
                    dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo62302e() {
        this.f63529h.mo62611a();
    }

    /* renamed from: f */
    public final void mo62303f() {
        this.f63525c.clear();
    }

    private final void dismiss() {
        C24023b bVar = this.f63523a;
        if (bVar == null) {
            C7573i.m23583a("listener");
        }
        bVar.dismiss();
    }

    /* renamed from: g */
    private final void m78844g() {
        C24023b bVar = this.f63523a;
        if (bVar == null) {
            C7573i.m23583a("listener");
        }
        bVar.mo62304a();
    }

    /* renamed from: b */
    public final CommentAtSearchAdapter mo62299b() {
        CommentAtSearchAdapter commentAtSearchAdapter = this.f63524b;
        if (commentAtSearchAdapter == null) {
            C7573i.m23583a("adapter");
        }
        return commentAtSearchAdapter;
    }

    /* renamed from: a */
    public final C24023b mo62292a() {
        C24023b bVar = this.f63523a;
        if (bVar == null) {
            C7573i.m23583a("listener");
        }
        return bVar;
    }

    /* renamed from: d */
    public final void mo62301d() {
        this.f63529h.mo62612a(new C24024c(this), 300, TimeUnit.MILLISECONDS);
    }

    /* renamed from: h */
    private final void m78845h() {
        SummonFriendList summonFriendList = new SummonFriendList(new ArrayList(), 0, false, "");
        this.f63528g = summonFriendList;
        CommentAtSearchAdapter commentAtSearchAdapter = this.f63524b;
        if (commentAtSearchAdapter == null) {
            C7573i.m23583a("adapter");
        }
        commentAtSearchAdapter.mo58045a(this.f63528g.items);
        CommentAtSearchAdapter commentAtSearchAdapter2 = this.f63524b;
        if (commentAtSearchAdapter2 == null) {
            C7573i.m23583a("adapter");
        }
        commentAtSearchAdapter2.notifyDataSetChanged();
    }

    public C24021a() {
        SummonFriendList summonFriendList = new SummonFriendList(new ArrayList(), 0, false, "");
        this.f63526d = summonFriendList;
        SummonFriendList summonFriendList2 = new SummonFriendList(new ArrayList(), 0, false, "");
        this.f63527e = summonFriendList2;
        SummonFriendList summonFriendList3 = new SummonFriendList(new ArrayList(), 0, false, "");
        this.f63528g = summonFriendList3;
        this.f63529h = new C24164m();
    }

    /* renamed from: c */
    public final void mo62300c() {
        boolean z;
        String str = this.f63528g.keyword;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CommentAtSearchAdapter commentAtSearchAdapter = this.f63524b;
                if (commentAtSearchAdapter == null) {
                    C7573i.m23583a("adapter");
                }
                commentAtSearchAdapter.ag_();
                String str2 = this.f63528g.keyword;
                C7573i.m23582a((Object) str2, "mSearchList.keyword");
                mo62297a(str2, this.f63528g.cursor, 10, 1);
                return;
            }
        }
        if (C7573i.m23585a((Object) this.f63528g.keyword, (Object) "")) {
            CommentAtSearchAdapter commentAtSearchAdapter2 = this.f63524b;
            if (commentAtSearchAdapter2 == null) {
                C7573i.m23583a("adapter");
            }
            commentAtSearchAdapter2.ag_();
            m78841a(this.f63528g.cursor, 1, 50);
        }
    }

    /* renamed from: a */
    public final void mo62294a(C24023b bVar) {
        C7573i.m23587b(bVar, "<set-?>");
        this.f63523a = bVar;
    }

    /* renamed from: a */
    public final void mo62295a(CommentAtSearchAdapter commentAtSearchAdapter) {
        C7573i.m23587b(commentAtSearchAdapter, "<set-?>");
        this.f63524b = commentAtSearchAdapter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00d2 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62293a(int r12, android.text.Editable r13) {
        /*
            r11 = this;
            r0 = 1
            java.lang.String r7 = m78840a(r12, r13, r0)
            if (r7 != 0) goto L_0x000b
            r11.dismiss()
            return
        L_0x000b:
            r11.m78844g()
            com.ss.android.ugc.aweme.friends.model.SummonFriendList r1 = r11.f63528g
            r1.keyword = r7
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.friends.model.SummonFriendList> r1 = r11.f63525c
            boolean r1 = r1.containsKey(r7)
            r8 = 0
            if (r1 == 0) goto L_0x0090
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.friends.model.SummonFriendList> r1 = r11.f63525c
            java.lang.Object r1 = r1.get(r7)
            com.ss.android.ugc.aweme.friends.model.SummonFriendList r1 = (com.p280ss.android.ugc.aweme.friends.model.SummonFriendList) r1
            if (r1 == 0) goto L_0x008c
            java.util.List<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r2 = r1.items
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x0034
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r2 = 0
            goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            if (r2 == 0) goto L_0x0038
            goto L_0x008c
        L_0x0038:
            r2 = r7
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0043
            r2 = 1
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            if (r2 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter r2 = r11.f63524b
            if (r2 != 0) goto L_0x004f
            java.lang.String r3 = "adapter"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x004f:
            r2.f63570b = r8
            goto L_0x005d
        L_0x0052:
            com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter r2 = r11.f63524b
            if (r2 != 0) goto L_0x005b
            java.lang.String r3 = "adapter"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x005b:
            r2.f63570b = r0
        L_0x005d:
            com.ss.android.ugc.aweme.comment.a$b r2 = r11.f63523a
            if (r2 != 0) goto L_0x0066
            java.lang.String r3 = "listener"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0066:
            r2.mo62305a(r0)
            r11.f63528g = r1
            com.ss.android.ugc.aweme.friends.model.SummonFriendList r0 = r11.f63528g
            r0.keyword = r7
            com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter r0 = r11.f63524b
            if (r0 != 0) goto L_0x0078
            java.lang.String r2 = "adapter"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0078:
            java.util.List<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r2 = r1.items
            r0.mo58045a(r2)
            com.ss.android.ugc.aweme.comment.adapter.CommentAtSearchAdapter r0 = r11.f63524b
            if (r0 != 0) goto L_0x0086
            java.lang.String r2 = "adapter"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0086:
            boolean r1 = r1.hasMore
            r0.mo66516d(r1)
            return
        L_0x008c:
            r11.dismiss()
            return
        L_0x0090:
            r1 = r7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r2 = r1.length()
            if (r2 != 0) goto L_0x009b
            r2 = 1
            goto L_0x009c
        L_0x009b:
            r2 = 0
        L_0x009c:
            if (r2 == 0) goto L_0x00b9
            r11.m78845h()
            com.ss.android.ugc.aweme.comment.a$b r0 = r11.f63523a
            if (r0 != 0) goto L_0x00aa
            java.lang.String r1 = "listener"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00aa:
            r0.mo62305a(r8)
            r1 = 0
            r3 = 0
            r4 = 0
            r6 = 4
            r7 = 0
            r0 = r11
            r0.m78841a(r1, r3, 50)
            return
        L_0x00b9:
            boolean r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19945u()
            if (r2 == 0) goto L_0x0159
            com.ss.android.ugc.aweme.friends.model.SummonFriendList r2 = r11.f63526d
            java.util.List<com.ss.android.ugc.aweme.friends.model.SummonFriendItem> r2 = r2.items
            if (r2 == 0) goto L_0x0122
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L_0x00d2:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0119
            java.lang.Object r4 = r2.next()
            r5 = r4
            com.ss.android.ugc.aweme.friends.model.SummonFriendItem r5 = (com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem) r5
            java.lang.String r6 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            com.ss.android.ugc.aweme.profile.model.User r6 = r5.mUser
            java.lang.String r9 = "it.user"
            kotlin.jvm.internal.C7573i.m23582a(r6, r9)
            java.lang.String r6 = r6.getRemarkName()
            r9 = 0
            r10 = 2
            if (r6 == 0) goto L_0x00fb
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = kotlin.text.C7634n.m23776c(r6, r1, false)
            if (r6 == r0) goto L_0x0110
        L_0x00fb:
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.mUser
            java.lang.String r6 = "it.user"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.String r5 = r5.getNickname()
            if (r5 == 0) goto L_0x0112
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.C7634n.m23776c(r5, r1, false)
            if (r5 != r0) goto L_0x0112
        L_0x0110:
            r5 = 1
            goto L_0x0113
        L_0x0112:
            r5 = 0
        L_0x0113:
            if (r5 == 0) goto L_0x00d2
            r3.add(r4)
            goto L_0x00d2
        L_0x0119:
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r1 = kotlin.collections.C7525m.m23509d(r3)
            goto L_0x0126
        L_0x0122:
            java.util.List r1 = kotlin.collections.C7525m.m23461a()
        L_0x0126:
            r2 = r1
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0134
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r0 = 0
        L_0x0134:
            if (r0 != 0) goto L_0x0144
            com.ss.android.ugc.aweme.friends.model.SummonFriendList r0 = new com.ss.android.ugc.aweme.friends.model.SummonFriendList
            r3 = 0
            r5 = 1
            r1 = r0
            r6 = r7
            r1.<init>(r2, r3, r5, r6)
            r11.mo62298a(r7, r0, r8)
            return
        L_0x0144:
            r11.m78845h()
            com.ss.android.ugc.aweme.comment.a$b r0 = r11.f63523a
            if (r0 != 0) goto L_0x0150
            java.lang.String r1 = "listener"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0150:
            r0.mo62305a(r8)
            com.ss.android.ugc.aweme.comment.h.m r0 = r11.f63529h
            r0.mo62613a(r7)
            return
        L_0x0159:
            r11.m78845h()
            com.ss.android.ugc.aweme.comment.a$b r0 = r11.f63523a
            if (r0 != 0) goto L_0x0165
            java.lang.String r1 = "listener"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0165:
            r0.mo62305a(r8)
            com.ss.android.ugc.aweme.comment.h.m r0 = r11.f63529h
            r0.mo62613a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.C24021a.mo62293a(int, android.text.Editable):void");
    }

    /* renamed from: a */
    public final void mo62296a(SummonFriendList summonFriendList, int i) {
        m78843b("", summonFriendList, i);
        C24023b bVar = this.f63523a;
        if (bVar == null) {
            C7573i.m23583a("listener");
        }
        if (bVar.mo62306a("")) {
            CommentAtSearchAdapter commentAtSearchAdapter = this.f63524b;
            if (commentAtSearchAdapter == null) {
                C7573i.m23583a("adapter");
            }
            boolean z = false;
            commentAtSearchAdapter.f63570b = 0;
            C24023b bVar2 = this.f63523a;
            if (bVar2 == null) {
                C7573i.m23583a("listener");
            }
            bVar2.mo62305a(true);
            CommentAtSearchAdapter commentAtSearchAdapter2 = this.f63524b;
            if (commentAtSearchAdapter2 == null) {
                C7573i.m23583a("adapter");
            }
            commentAtSearchAdapter2.mo66516d(summonFriendList.hasMore);
            SummonFriendList summonFriendList2 = (SummonFriendList) this.f63525c.get("");
            if (summonFriendList2 != null) {
                this.f63526d = summonFriendList2;
                if (i == 0) {
                    CommentAtSearchAdapter commentAtSearchAdapter3 = this.f63524b;
                    if (commentAtSearchAdapter3 == null) {
                        C7573i.m23583a("adapter");
                    }
                    commentAtSearchAdapter3.mo58045a(this.f63526d.items);
                    this.f63528g = this.f63526d;
                } else {
                    this.f63528g = this.f63526d;
                    CommentAtSearchAdapter commentAtSearchAdapter4 = this.f63524b;
                    if (commentAtSearchAdapter4 == null) {
                        C7573i.m23583a("adapter");
                    }
                    commentAtSearchAdapter4.mo58045a(this.f63528g.items);
                }
                Collection collection = this.f63528g.items;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m78841a(long j, int i, long j2) {
        if (i == 0) {
            C7492s.m23298b((C7496w<? extends T1>) SummonFriendApi.m98487b(), (C7496w<? extends T2>) SummonFriendApi.m98486a((int) j2, (int) j), (C7324c<? super T1, ? super T2, ? extends R>) new C24025d<Object,Object,Object>(this)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C24026e<Object>(this, i));
            return;
        }
        SummonFriendApi.m98486a((int) j2, (int) j).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C24027f<Object>(this, i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m78840a(int r9, android.text.Editable r10, boolean r11) {
        /*
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            int r3 = r0.length()
            if (r3 != 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r3 = 0
            goto L_0x0011
        L_0x0010:
            r3 = 1
        L_0x0011:
            r4 = 0
            if (r3 != 0) goto L_0x00a5
            if (r9 != 0) goto L_0x0018
            goto L_0x00a5
        L_0x0018:
            kotlin.e.c r3 = kotlin.p356e.C7551d.m23565b(r2, r9)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r5 = r4
        L_0x0023:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0043
            java.lang.Object r6 = r3.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            char r7 = r10.charAt(r7)
            r8 = 64
            if (r7 != r8) goto L_0x003e
            r7 = 1
            goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            if (r7 == 0) goto L_0x0023
            r5 = r6
            goto L_0x0023
        L_0x0043:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x00a4
            int r3 = r5.intValue()
            java.lang.Class<com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan> r5 = com.p280ss.android.ugc.aweme.views.mention.MentionEditText.MentionSpan.class
            java.lang.Object[] r10 = r10.getSpans(r3, r9, r5)
            com.ss.android.ugc.aweme.views.mention.MentionEditText$MentionSpan[] r10 = (com.p280ss.android.ugc.aweme.views.mention.MentionEditText.MentionSpan[]) r10
            if (r10 == 0) goto L_0x0060
            int r10 = r10.length
            if (r10 != 0) goto L_0x005a
            r10 = 1
            goto L_0x005b
        L_0x005a:
            r10 = 0
        L_0x005b:
            if (r10 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r10 = 0
            goto L_0x0061
        L_0x0060:
            r10 = 1
        L_0x0061:
            if (r10 != 0) goto L_0x0064
            return r4
        L_0x0064:
            int r3 = r3 + r1
            java.lang.CharSequence r9 = r0.subSequence(r3, r9)
            java.lang.String r9 = r9.toString()
            r10 = r9
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r0 = "  "
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 2
            boolean r0 = kotlin.text.C7634n.m23776c(r10, r0, false)
            if (r0 == 0) goto L_0x007c
            return r4
        L_0x007c:
            r0 = 10
            boolean r0 = kotlin.text.C7634n.m23770b(r10, r0, false)
            if (r0 == 0) goto L_0x0085
            return r4
        L_0x0085:
            if (r11 == 0) goto L_0x009a
            if (r9 == 0) goto L_0x0092
            java.lang.CharSequence r9 = kotlin.text.C7634n.m23762b(r10)
            java.lang.String r9 = r9.toString()
            goto L_0x009a
        L_0x0092:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.CharSequence"
            r9.<init>(r10)
            throw r9
        L_0x009a:
            int r10 = r9.length()
            r11 = 24
            if (r10 <= r11) goto L_0x00a3
            return r4
        L_0x00a3:
            return r9
        L_0x00a4:
            return r4
        L_0x00a5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.C24021a.m78840a(int, android.text.Editable, boolean):java.lang.String");
    }

    /* renamed from: b */
    private final void m78843b(String str, SummonFriendList summonFriendList, int i) {
        List<SummonFriendItem> list;
        switch (i) {
            case 0:
                this.f63525c.put(str, summonFriendList);
                SummonFriendList summonFriendList2 = (SummonFriendList) this.f63525c.get(str);
                if (summonFriendList2 != null) {
                    summonFriendList2.keyword = str;
                }
                return;
            case 1:
                if (this.f63525c.get(str) != null) {
                    SummonFriendList summonFriendList3 = (SummonFriendList) this.f63525c.get(str);
                    if (summonFriendList3 != null) {
                        list = summonFriendList3.items;
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        SummonFriendList summonFriendList4 = (SummonFriendList) this.f63525c.get(str);
                        if (summonFriendList4 != null) {
                            List<SummonFriendItem> list2 = summonFriendList4.items;
                            if (list2 != null) {
                                List<SummonFriendItem> list3 = summonFriendList.items;
                                C7573i.m23582a((Object) list3, "data.items");
                                list2.addAll(list3);
                            }
                        }
                        SummonFriendList summonFriendList5 = (SummonFriendList) this.f63525c.get(str);
                        if (summonFriendList5 != null) {
                            summonFriendList5.cursor = summonFriendList.cursor;
                        }
                        SummonFriendList summonFriendList6 = (SummonFriendList) this.f63525c.get(str);
                        if (summonFriendList6 != null) {
                            summonFriendList6.keyword = str;
                        }
                        SummonFriendList summonFriendList7 = (SummonFriendList) this.f63525c.get(str);
                        if (summonFriendList7 != null) {
                            summonFriendList7.hasMore = summonFriendList.hasMore;
                        }
                        return;
                    }
                }
                this.f63525c.put(str, summonFriendList);
                SummonFriendList summonFriendList8 = (SummonFriendList) this.f63525c.get(str);
                if (summonFriendList8 != null) {
                    summonFriendList8.keyword = str;
                    return;
                }
                break;
        }
    }

    /* renamed from: a */
    public final void mo62297a(String str, long j, long j2, int i) {
        C7573i.m23587b(str, "searchKey");
        SummonFriendApi.m98488b(str, j, 10, "comment_user").mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C24028g<Object>(this, str, i));
    }
}
