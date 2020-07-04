package com.p280ss.android.ugc.aweme.recommend;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.friends.recommendlist.repository.C30069d;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.recommend.d */
public final class C37132d implements C37138f {

    /* renamed from: a */
    public static final C37132d f97167a = new C37132d();

    /* renamed from: b */
    private static RecommendList f97168b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile AtomicBoolean f97169c = new AtomicBoolean(false);

    /* renamed from: d */
    private static C7321c f97170d;

    /* renamed from: e */
    private static int f97171e;

    /* renamed from: f */
    private static int f97172f;

    /* renamed from: g */
    private static boolean f97173g;

    /* renamed from: h */
    private static int f97174h;

    /* renamed from: com.ss.android.ugc.aweme.recommend.d$a */
    static final class C37133a<T> implements C7326g<RecommendList> {

        /* renamed from: a */
        public static final C37133a f97175a = new C37133a();

        C37133a() {
        }

        /* renamed from: a */
        private static void m119376a(RecommendList recommendList) {
            C37132d.m119367a(recommendList);
        }

        public final /* synthetic */ void accept(Object obj) {
            m119376a((RecommendList) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.d$b */
    static final class C37134b<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C37134b f97176a = new C37134b();

        C37134b() {
        }

        /* renamed from: a */
        private static void m119377a(Throwable th) {
            C37132d.f97167a.mo93612a(th);
        }

        public final /* synthetic */ void accept(Object obj) {
            m119377a((Throwable) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.d$c */
    static final class C37135c implements C7323a {

        /* renamed from: a */
        public static final C37135c f97177a = new C37135c();

        C37135c() {
        }

        /* renamed from: a */
        public final void mo8975a() {
            C37132d.m119372d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.d$d */
    static final class C37136d<T> implements C7326g<C7321c> {

        /* renamed from: a */
        public static final C37136d f97178a = new C37136d();

        C37136d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m119379a((C7321c) obj);
        }

        /* renamed from: a */
        private static void m119379a(C7321c cVar) {
            C37132d.f97169c.set(false);
        }
    }

    private C37132d() {
    }

    /* renamed from: a */
    public static int m119365a() {
        return f97174h;
    }

    /* renamed from: b */
    public static final boolean m119370b() {
        return f97169c.get();
    }

    /* renamed from: d */
    public static void m119372d() {
        f97169c.set(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r1 == null) goto L_0x0021;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p280ss.android.ugc.aweme.feed.model.Aweme m119373e() {
        /*
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = new com.ss.android.ugc.aweme.feed.model.Aweme
            r0.<init>()
            java.lang.String r1 = "feed_recommend_user"
            r0.setAid(r1)
            com.ss.android.ugc.aweme.friends.model.RecommendList r1 = f97168b
            if (r1 == 0) goto L_0x0013
            java.util.List r1 = r1.getUserList()
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            r0.setFamiliarRecommendUser(r1)
            com.ss.android.ugc.aweme.friends.model.RecommendList r1 = f97168b
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = r1.getRid()
            if (r1 != 0) goto L_0x0023
        L_0x0021:
            java.lang.String r1 = ""
        L_0x0023:
            r0.setRequestId(r1)
            r1 = 4001(0xfa1, float:5.607E-42)
            r0.setAwemeType(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.recommend.C37132d.m119373e():com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    /* renamed from: c */
    public static void m119371c() {
        C30069d dVar = new C30069d();
        Integer valueOf = Integer.valueOf(30);
        Integer valueOf2 = Integer.valueOf(0);
        Integer valueOf3 = Integer.valueOf(0);
        Integer valueOf4 = Integer.valueOf(C43161e.m136882a());
        C34202f a = C34202f.m110435a();
        C7573i.m23582a((Object) a, "RecUserImpressionReporter.getInstance()");
        f97170d = dVar.mo76453a(valueOf, valueOf2, "", 16, valueOf3, valueOf4, a.mo86949b(), null, Integer.valueOf(C43161e.m136884b()), null).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19282a((C7326g<? super T>) C37133a.f97175a, (C7326g<? super Throwable>) C37134b.f97176a, (C7323a) C37135c.f97177a, (C7326g<? super C7321c>) C37136d.f97178a);
    }

    /* renamed from: a */
    public static void m119367a(RecommendList recommendList) {
        boolean z;
        if (recommendList != null) {
            Collection userList = recommendList.getUserList();
            if (userList == null || userList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                f97168b = recommendList;
            }
        }
    }

    /* renamed from: a */
    public final void mo93612a(Throwable th) {
        if (f97171e < 3) {
            f97171e++;
            m119371c();
            return;
        }
        f97169c.set(true);
    }

    /* renamed from: a */
    public final void mo93611a(FeedItemList feedItemList) {
        boolean z;
        Collection collection;
        boolean z2;
        Object obj;
        int i;
        boolean z3;
        if (!TimeLockRuler.isTeenModeON()) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (f.isLogin()) {
                if ((FeedRecommendUserTestMode.isTestMode() || FeedRecommendUserViewStyle.isEnabled()) && !C6399b.m19944t() && !f97173g && !TimeLockRuler.isTeenModeON()) {
                    IAccountUserService f2 = C6861a.m21337f();
                    C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
                    if (f2.isLogin()) {
                        boolean z4 = false;
                        if (feedItemList == null) {
                            f97172f = 0;
                            return;
                        }
                        List items = feedItemList.getItems();
                        Collection collection2 = items;
                        if (collection2 == null || collection2.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            f97172f = 0;
                            return;
                        }
                        if (m119370b()) {
                            RecommendList recommendList = f97168b;
                            Object obj2 = null;
                            if (recommendList != null) {
                                collection = recommendList.getUserList();
                            } else {
                                collection = null;
                            }
                            Collection collection3 = collection;
                            if (collection3 == null || collection3.isEmpty()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                if (!C37137e.m119380a()) {
                                    f97172f = items.size();
                                    return;
                                }
                                int size = items.size();
                                Iterator it = C7551d.m23565b(f97172f, size).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    Object obj3 = items.get(((Number) obj).intValue());
                                    C7573i.m23582a(obj3, "list[it]");
                                    if (((Aweme) obj3).isAd()) {
                                        break;
                                    }
                                }
                                Integer num = (Integer) obj;
                                int i2 = -1;
                                if (num != null) {
                                    i = num.intValue();
                                } else {
                                    i = -1;
                                }
                                for (Object next : C7551d.m23565b(f97172f, size)) {
                                    Object obj4 = items.get(((Number) next).intValue());
                                    C7573i.m23582a(obj4, "list[it]");
                                    if (((Aweme) obj4).isAd()) {
                                        obj2 = next;
                                    }
                                }
                                Integer num2 = (Integer) obj2;
                                if (num2 != null) {
                                    i2 = num2.intValue();
                                }
                                if (i >= 6) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (size - i2 > 6) {
                                    z4 = true;
                                }
                                if (FeedRecommendUserTestMode.isTestMode()) {
                                    m119369a(items, f97172f, true);
                                } else if (z3) {
                                    m119369a(items, f97172f + 3, false);
                                } else if (z4) {
                                    m119369a(items, f97172f + i2 + 3, false);
                                }
                                f97172f = size;
                                return;
                            }
                        }
                        f97172f = items.size();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r2 == false) goto L_0x004d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m119369a(java.util.List<com.p280ss.android.ugc.aweme.feed.model.Aweme> r5, int r6, boolean r7) {
        /*
            r4 = this;
            int r0 = r5.size()
            if (r6 < 0) goto L_0x004e
            if (r0 > r6) goto L_0x0009
            return
        L_0x0009:
            r0 = 1
            if (r7 != 0) goto L_0x003e
            r7 = r5
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r1 = r7 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L_0x001d
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x003b
        L_0x001d:
            java.util.Iterator r7 = r7.iterator()
        L_0x0021:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r7.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r1
            int r1 = r1.getAwemeType()
            r3 = 4001(0xfa1, float:5.607E-42)
            if (r1 != r3) goto L_0x0037
            r1 = 1
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            if (r1 == 0) goto L_0x0021
            goto L_0x003c
        L_0x003b:
            r2 = 1
        L_0x003c:
            if (r2 == 0) goto L_0x004d
        L_0x003e:
            int r7 = f97172f
            int r7 = r6 - r7
            f97174h = r7
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = m119373e()
            r5.add(r6, r7)
            f97173g = r0
        L_0x004d:
            return
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.recommend.C37132d.m119369a(java.util.List, int, boolean):void");
    }
}
