package com.p280ss.android.ugc.aweme.comment.p1101h;

import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.h.h */
public final class C24157h {

    /* renamed from: a */
    public static String f63824a;

    /* renamed from: b */
    public static C24157h f63825b;

    /* renamed from: c */
    public static final C24158a f63826c = new C24158a(null);

    /* renamed from: d */
    private Keva f63827d;

    /* renamed from: com.ss.android.ugc.aweme.comment.h.h$a */
    public static final class C24158a {
        private C24158a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
            if ((!kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r0, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x001c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized com.p280ss.android.ugc.aweme.comment.p1101h.C24157h mo62586a() {
            /*
                r3 = this;
                monitor-enter(r3)
                com.ss.android.ugc.aweme.comment.h.h r0 = com.p280ss.android.ugc.aweme.comment.p1101h.C24157h.f63825b     // Catch:{ all -> 0x0043 }
                if (r0 == 0) goto L_0x001c
                java.lang.String r0 = com.p280ss.android.ugc.aweme.comment.p1101h.C24157h.f63824a     // Catch:{ all -> 0x0043 }
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()     // Catch:{ all -> 0x0043 }
                java.lang.String r2 = "AccountProxyService.userService()"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ all -> 0x0043 }
                java.lang.String r1 = r1.getCurUserId()     // Catch:{ all -> 0x0043 }
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)     // Catch:{ all -> 0x0043 }
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0037
            L_0x001c:
                java.lang.Class<com.ss.android.ugc.aweme.comment.h.h> r0 = com.p280ss.android.ugc.aweme.comment.p1101h.C24157h.class
                monitor-enter(r0)     // Catch:{ all -> 0x0043 }
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()     // Catch:{ all -> 0x0040 }
                java.lang.String r2 = "AccountProxyService.userService()"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ all -> 0x0040 }
                java.lang.String r1 = r1.getCurUserId()     // Catch:{ all -> 0x0040 }
                com.p280ss.android.ugc.aweme.comment.p1101h.C24157h.f63824a = r1     // Catch:{ all -> 0x0040 }
                com.ss.android.ugc.aweme.comment.h.h r1 = new com.ss.android.ugc.aweme.comment.h.h     // Catch:{ all -> 0x0040 }
                r2 = 0
                r1.<init>(r2)     // Catch:{ all -> 0x0040 }
                com.p280ss.android.ugc.aweme.comment.p1101h.C24157h.f63825b = r1     // Catch:{ all -> 0x0040 }
                monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            L_0x0037:
                com.ss.android.ugc.aweme.comment.h.h r0 = com.p280ss.android.ugc.aweme.comment.p1101h.C24157h.f63825b     // Catch:{ all -> 0x0043 }
                if (r0 != 0) goto L_0x003e
                kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ all -> 0x0043 }
            L_0x003e:
                monitor-exit(r3)
                return r0
            L_0x0040:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0043 }
                throw r1     // Catch:{ all -> 0x0043 }
            L_0x0043:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.p1101h.C24157h.C24158a.mo62586a():com.ss.android.ugc.aweme.comment.h.h");
        }

        public /* synthetic */ C24158a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public static final synchronized C24157h m79363a() {
        C24157h a;
        synchronized (C24157h.class) {
            a = f63826c.mo62586a();
        }
        return a;
    }

    static {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        f63824a = f.getCurUserId();
    }

    private C24157h() {
        StringBuilder sb = new StringBuilder("comment_");
        sb.append(f63824a);
        Keva repo = Keva.getRepo(sb.toString());
        C7573i.m23582a((Object) repo, "Keva.getRepo(PREFIX_REPO_NAME + uid)");
        this.f63827d = repo;
    }

    public /* synthetic */ C24157h(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public final int mo62585a(int i) {
        int i2 = this.f63827d.getInt("comment_sync_to_x", 0) + 1;
        if (i2 <= 9) {
            this.f63827d.storeInt("comment_sync_to_x", i2);
        }
        return i2;
    }
}
