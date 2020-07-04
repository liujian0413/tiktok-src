package com.p280ss.android.ugc.aweme.recommend;

import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.c */
public final class C37130c {

    /* renamed from: b */
    public static String f97163b;

    /* renamed from: c */
    public static C37130c f97164c;

    /* renamed from: d */
    public static final C37131a f97165d = new C37131a(null);

    /* renamed from: a */
    public final Keva f97166a;

    /* renamed from: com.ss.android.ugc.aweme.recommend.c$a */
    public static final class C37131a {
        private C37131a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
            if ((!kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r0, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x001b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p280ss.android.ugc.aweme.recommend.C37130c m119364a() {
            /*
                com.ss.android.ugc.aweme.recommend.c r0 = com.p280ss.android.ugc.aweme.recommend.C37130c.f97164c
                if (r0 == 0) goto L_0x001b
                java.lang.String r0 = com.p280ss.android.ugc.aweme.recommend.C37130c.f97163b
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
                java.lang.String r2 = "AccountProxyService.userService()"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.String r1 = r1.getCurUserId()
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0035
            L_0x001b:
                java.lang.Class<com.ss.android.ugc.aweme.recommend.c> r0 = com.p280ss.android.ugc.aweme.recommend.C37130c.class
                monitor-enter(r0)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()     // Catch:{ all -> 0x003d }
                java.lang.String r2 = "AccountProxyService.userService()"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ all -> 0x003d }
                java.lang.String r1 = r1.getCurUserId()     // Catch:{ all -> 0x003d }
                com.p280ss.android.ugc.aweme.recommend.C37130c.f97163b = r1     // Catch:{ all -> 0x003d }
                com.ss.android.ugc.aweme.recommend.c r1 = new com.ss.android.ugc.aweme.recommend.c     // Catch:{ all -> 0x003d }
                r1.<init>()     // Catch:{ all -> 0x003d }
                com.p280ss.android.ugc.aweme.recommend.C37130c.f97164c = r1     // Catch:{ all -> 0x003d }
                monitor-exit(r0)
            L_0x0035:
                com.ss.android.ugc.aweme.recommend.c r0 = com.p280ss.android.ugc.aweme.recommend.C37130c.f97164c
                if (r0 != 0) goto L_0x003c
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x003c:
                return r0
            L_0x003d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.recommend.C37130c.C37131a.m119364a():com.ss.android.ugc.aweme.recommend.c");
        }

        public /* synthetic */ C37131a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo93607b() {
        this.f97166a.storeInt("feed_pass_without_action_in_times", 0);
    }

    static {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        f97163b = f.getCurUserId();
    }

    public C37130c() {
        StringBuilder sb = new StringBuilder("recommmend_user_");
        sb.append(f97163b);
        Keva repo = Keva.getRepo(sb.toString());
        C7573i.m23582a((Object) repo, "Keva.getRepo(PREFIX_REPO_NAME + uid)");
        this.f97166a = repo;
    }

    /* renamed from: e */
    public final void mo93610e() {
        Keva keva = this.f97166a;
        String str = "feed_last_shown_timestamp";
        Calendar instance = Calendar.getInstance();
        C7573i.m23582a((Object) instance, "it");
        instance.setTimeInMillis(System.currentTimeMillis());
        if (!FeedRecommendUserTestMode.isTestMode()) {
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
        }
        keva.storeLong(str, instance.getTimeInMillis());
    }

    /* renamed from: a */
    public final boolean mo93606a() {
        if (this.f97166a.getInt("feed_pass_without_action_in_times", 0) < 3) {
            return false;
        }
        long j = this.f97166a.getLong("feed_pass_without_action_in_times_maximum_timestamp", 0);
        Calendar instance = Calendar.getInstance();
        C7573i.m23582a((Object) instance, "it");
        instance.setTimeInMillis(System.currentTimeMillis());
        if (!FeedRecommendUserTestMode.isTestMode()) {
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
        }
        if (instance.getTimeInMillis() < j) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo93608c() {
        int i = this.f97166a.getInt("feed_pass_without_action_in_times", 0) + 1;
        this.f97166a.storeInt("feed_pass_without_action_in_times", i);
        if (i >= 3) {
            Keva keva = this.f97166a;
            String str = "feed_pass_without_action_in_times_maximum_timestamp";
            Calendar instance = Calendar.getInstance();
            C7573i.m23582a((Object) instance, "it");
            instance.setTimeInMillis(System.currentTimeMillis());
            if (FeedRecommendUserTestMode.isTestMode()) {
                instance.add(12, 2);
            } else {
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.add(6, 30);
            }
            keva.storeLong(str, instance.getTimeInMillis());
        }
    }

    /* renamed from: d */
    public final boolean mo93609d() {
        long j;
        if (FeedRecommendUserTestMode.isTestMode()) {
            j = TimeUnit.MINUTES.toMillis(1);
        } else {
            j = TimeUnit.DAYS.toMillis((long) FeedRecommendUserTimeInterval.getDays());
        }
        long j2 = this.f97166a.getLong("feed_last_shown_timestamp", 0) + j;
        Calendar instance = Calendar.getInstance();
        C7573i.m23582a((Object) instance, "it");
        instance.setTimeInMillis(System.currentTimeMillis());
        if (!FeedRecommendUserTestMode.isTestMode()) {
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
        }
        if (instance.getTimeInMillis() < j2) {
            return true;
        }
        return false;
    }
}
