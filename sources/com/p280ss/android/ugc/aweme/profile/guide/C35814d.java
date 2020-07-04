package com.p280ss.android.ugc.aweme.profile.guide;

import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.profile.experiment.ProfileGuideTestMode;
import com.p280ss.android.ugc.aweme.profile.experiment.ProfileGuideTimeInterval;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.guide.d */
public final class C35814d {

    /* renamed from: a */
    public static String f93865a;

    /* renamed from: b */
    public static C35814d f93866b;

    /* renamed from: c */
    public static final C35815a f93867c = new C35815a(null);

    /* renamed from: d */
    private final Keva f93868d;

    /* renamed from: com.ss.android.ugc.aweme.profile.guide.d$a */
    public static final class C35815a {
        private C35815a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
            if ((!kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r0, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x001b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p280ss.android.ugc.aweme.profile.guide.C35814d m115636a() {
            /*
                com.ss.android.ugc.aweme.profile.guide.d r0 = com.p280ss.android.ugc.aweme.profile.guide.C35814d.f93866b
                if (r0 == 0) goto L_0x001b
                java.lang.String r0 = com.p280ss.android.ugc.aweme.profile.guide.C35814d.f93865a
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
                java.lang.String r2 = "AccountProxyService.userService()"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.String r1 = r1.getCurUserId()
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0035
            L_0x001b:
                java.lang.Class<com.ss.android.ugc.aweme.profile.guide.d> r0 = com.p280ss.android.ugc.aweme.profile.guide.C35814d.class
                monitor-enter(r0)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()     // Catch:{ all -> 0x003d }
                java.lang.String r2 = "AccountProxyService.userService()"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ all -> 0x003d }
                java.lang.String r1 = r1.getCurUserId()     // Catch:{ all -> 0x003d }
                com.p280ss.android.ugc.aweme.profile.guide.C35814d.f93865a = r1     // Catch:{ all -> 0x003d }
                com.ss.android.ugc.aweme.profile.guide.d r1 = new com.ss.android.ugc.aweme.profile.guide.d     // Catch:{ all -> 0x003d }
                r1.<init>()     // Catch:{ all -> 0x003d }
                com.p280ss.android.ugc.aweme.profile.guide.C35814d.f93866b = r1     // Catch:{ all -> 0x003d }
                monitor-exit(r0)
            L_0x0035:
                com.ss.android.ugc.aweme.profile.guide.d r0 = com.p280ss.android.ugc.aweme.profile.guide.C35814d.f93866b
                if (r0 != 0) goto L_0x003c
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x003c:
                return r0
            L_0x003d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.guide.C35814d.C35815a.m115636a():com.ss.android.ugc.aweme.profile.guide.d");
        }

        public /* synthetic */ C35815a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo90715a() {
        if (this.f93868d.getInt("profile_guide_times", 0) >= 5) {
            return true;
        }
        return false;
    }

    static {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        f93865a = f.getCurUserId();
    }

    public C35814d() {
        StringBuilder sb = new StringBuilder("profile_guide");
        sb.append(f93865a);
        Keva repo = Keva.getRepo(sb.toString());
        C7573i.m23582a((Object) repo, "Keva.getRepo(PREFIX_REPO_NAME + uid)");
        this.f93868d = repo;
    }

    /* renamed from: b */
    public final boolean mo90716b() {
        long j;
        if (ProfileGuideTestMode.isTestMode()) {
            j = 0;
        } else {
            j = TimeUnit.DAYS.toMillis((long) ProfileGuideTimeInterval.getDays());
        }
        long j2 = this.f93868d.getLong("profile_guide_last_shown_timestamp", 0) + j;
        Calendar instance = Calendar.getInstance();
        C7573i.m23582a((Object) instance, "it");
        instance.setTimeInMillis(System.currentTimeMillis());
        if (!ProfileGuideTestMode.isTestMode()) {
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
        }
        if (instance.getTimeInMillis() < j2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo90717c() {
        this.f93868d.storeInt("profile_guide_times", this.f93868d.getInt("profile_guide_times", 0) + 1);
        Keva keva = this.f93868d;
        String str = "profile_guide_last_shown_timestamp";
        Calendar instance = Calendar.getInstance();
        C7573i.m23582a((Object) instance, "it");
        instance.setTimeInMillis(System.currentTimeMillis());
        if (!ProfileGuideTestMode.isTestMode()) {
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
        }
        keva.storeLong(str, instance.getTimeInMillis());
    }
}
