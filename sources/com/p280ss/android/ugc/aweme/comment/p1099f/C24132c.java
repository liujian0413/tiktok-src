package com.p280ss.android.ugc.aweme.comment.p1099f;

import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.comment.f.c */
public final class C24132c {

    /* renamed from: a */
    public static int f63784a;

    /* renamed from: b */
    public static long f63785b;

    /* renamed from: c */
    public static final C24133a f63786c = new C24133a(null);

    /* renamed from: d */
    private final ConcurrentHashMap<String, String> f63787d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private long f63788e;

    /* renamed from: com.ss.android.ugc.aweme.comment.f.c$a */
    public static final class C24133a {
        private C24133a() {
        }

        /* renamed from: b */
        public static int m79307b() {
            return C24132c.f63784a;
        }

        /* renamed from: a */
        public static long m79303a() {
            return ((long) C24132c.f63784a) * C24132c.f63785b;
        }

        public /* synthetic */ C24133a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m79304a(int i, long j) {
            C24132c.f63784a = i;
            C24132c.f63785b = j;
        }

        /* renamed from: b */
        public final void mo62557b(String str, String str2, int i) {
            m79306a(str, str2, i, 102, "", "");
        }

        /* renamed from: a */
        public final void mo62555a(String str, String str2, int i) {
            m79306a(str, str2, i, BaseNotice.HASHTAG, "", "");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r0 == null) goto L_0x001f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
            if (r0 == null) goto L_0x000e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo62556a(java.lang.String r8, java.lang.String r9, int r10, java.lang.Throwable r11) {
            /*
                r7 = this;
                if (r11 == 0) goto L_0x000e
                java.lang.Class r0 = r11.getClass()
                if (r0 == 0) goto L_0x000e
                java.lang.String r0 = r0.getName()
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                java.lang.String r0 = ""
            L_0x0010:
                r5 = r0
                if (r11 == 0) goto L_0x001f
                java.lang.Throwable r0 = r11.getCause()
                if (r0 == 0) goto L_0x001f
                java.lang.String r0 = r0.getMessage()
                if (r0 != 0) goto L_0x0027
            L_0x001f:
                if (r11 == 0) goto L_0x0026
                java.lang.String r0 = r11.getMessage()
                goto L_0x0027
            L_0x0026:
                r0 = 0
            L_0x0027:
                if (r0 != 0) goto L_0x002d
                java.lang.String r11 = ""
                r6 = r11
                goto L_0x002e
            L_0x002d:
                r6 = r0
            L_0x002e:
                r4 = 201(0xc9, float:2.82E-43)
                r1 = r8
                r2 = r9
                r3 = r10
                m79306a(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.p1099f.C24132c.C24133a.mo62556a(java.lang.String, java.lang.String, int, java.lang.Throwable):void");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005f A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0061 A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0064 A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0075 A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0078 A[Catch:{ Throwable -> 0x0095 }] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0029 A[Catch:{ Throwable -> 0x0095 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m79306a(java.lang.String r5, java.lang.String r6, int r7, int r8, java.lang.String r9, java.lang.String r10) {
            /*
                java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x0095 }
                r0.<init>()     // Catch:{ Throwable -> 0x0095 }
                r1 = r0
                java.util.Map r1 = (java.util.Map) r1     // Catch:{ Throwable -> 0x0095 }
                java.lang.String r2 = "unexpectedType"
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Throwable -> 0x0095 }
                r1.put(r2, r8)     // Catch:{ Throwable -> 0x0095 }
                java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Throwable -> 0x0095 }
                r8.<init>()     // Catch:{ Throwable -> 0x0095 }
                r1 = r5
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Throwable -> 0x0095 }
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0026
                int r1 = r1.length()     // Catch:{ Throwable -> 0x0095 }
                if (r1 != 0) goto L_0x0024
                goto L_0x0026
            L_0x0024:
                r1 = 0
                goto L_0x0027
            L_0x0026:
                r1 = 1
            L_0x0027:
                if (r1 != 0) goto L_0x0031
                r1 = r8
                java.util.Map r1 = (java.util.Map) r1     // Catch:{ Throwable -> 0x0095 }
                java.lang.String r4 = "MethodName"
                r1.put(r4, r5)     // Catch:{ Throwable -> 0x0095 }
            L_0x0031:
                r5 = r6
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Throwable -> 0x0095 }
                if (r5 == 0) goto L_0x003f
                int r5 = r5.length()     // Catch:{ Throwable -> 0x0095 }
                if (r5 != 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r5 = 0
                goto L_0x0040
            L_0x003f:
                r5 = 1
            L_0x0040:
                if (r5 != 0) goto L_0x004a
                r5 = r8
                java.util.Map r5 = (java.util.Map) r5     // Catch:{ Throwable -> 0x0095 }
                java.lang.String r1 = "GroupId"
                r5.put(r1, r6)     // Catch:{ Throwable -> 0x0095 }
            L_0x004a:
                r5 = r8
                java.util.Map r5 = (java.util.Map) r5     // Catch:{ Throwable -> 0x0095 }
                java.lang.String r6 = "expectedCount"
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Throwable -> 0x0095 }
                r5.put(r6, r7)     // Catch:{ Throwable -> 0x0095 }
                r5 = r9
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Throwable -> 0x0095 }
                int r5 = r5.length()     // Catch:{ Throwable -> 0x0095 }
                if (r5 <= 0) goto L_0x0061
                r5 = 1
                goto L_0x0062
            L_0x0061:
                r5 = 0
            L_0x0062:
                if (r5 == 0) goto L_0x006c
                r5 = r8
                java.util.Map r5 = (java.util.Map) r5     // Catch:{ Throwable -> 0x0095 }
                java.lang.String r6 = "errorType"
                r5.put(r6, r9)     // Catch:{ Throwable -> 0x0095 }
            L_0x006c:
                r5 = r10
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Throwable -> 0x0095 }
                int r5 = r5.length()     // Catch:{ Throwable -> 0x0095 }
                if (r5 <= 0) goto L_0x0076
                r2 = 1
            L_0x0076:
                if (r2 == 0) goto L_0x0080
                r5 = r8
                java.util.Map r5 = (java.util.Map) r5     // Catch:{ Throwable -> 0x0095 }
                java.lang.String r6 = "errorDescription"
                r5.put(r6, r10)     // Catch:{ Throwable -> 0x0095 }
            L_0x0080:
                java.lang.String r5 = "aweme_comment_list_unexpected"
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0095 }
                java.util.Map r0 = (java.util.Map) r0     // Catch:{ Throwable -> 0x0095 }
                r6.<init>(r0)     // Catch:{ Throwable -> 0x0095 }
                r7 = 0
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0095 }
                java.util.Map r8 = (java.util.Map) r8     // Catch:{ Throwable -> 0x0095 }
                r9.<init>(r8)     // Catch:{ Throwable -> 0x0095 }
                com.bytedance.apm.C6159b.m19112a(r5, r6, r7, r9)     // Catch:{ Throwable -> 0x0095 }
                return
            L_0x0095:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.p1099f.C24132c.C24133a.m79306a(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String):void");
        }
    }

    /* renamed from: a */
    public static final void m79286a(int i, long j) {
        C24133a.m79304a(i, j);
    }

    /* renamed from: a */
    public static final void m79287a(String str, String str2, int i) {
        f63786c.mo62555a(str, str2, i);
    }

    /* renamed from: a */
    public static final void m79288a(String str, String str2, int i, Throwable th) {
        f63786c.mo62556a(str, str2, i, th);
    }

    /* renamed from: b */
    public static final void m79289b(String str, String str2, int i) {
        f63786c.mo62557b(str, str2, i);
    }

    /* renamed from: d */
    public static final long m79290d() {
        return C24133a.m79303a();
    }

    /* renamed from: e */
    public static final int m79291e() {
        return C24133a.m79307b();
    }

    /* renamed from: f */
    private void m79292f() {
        this.f63787d.clear();
    }

    /* renamed from: a */
    public final void mo62545a() {
        m79292f();
        this.f63788e = System.currentTimeMillis();
        this.f63787d.put("TimeStamp", String.valueOf(this.f63788e));
    }

    /* renamed from: b */
    public final void mo62550b() {
        this.f63787d.put("Duration", String.valueOf(System.currentTimeMillis() - this.f63788e));
    }

    /* renamed from: c */
    public final void mo62553c() {
        if (!this.f63787d.containsKey("UserId")) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (f.isLogin()) {
                IAccountUserService f2 = C6861a.m21337f();
                C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
                String curUserId = f2.getCurUserId();
                C7573i.m23582a((Object) curUserId, "AccountProxyService.userService().curUserId");
                this.f63787d.put("UserId", curUserId);
            }
        }
        if (!this.f63787d.containsKey("DeviceId")) {
            String d = C6789d.m21080d();
            C7573i.m23582a((Object) d, "DeviceRegisterManager.getDeviceId()");
            this.f63787d.put("DeviceId", d);
        }
        try {
            C6877n.m21447a("aweme_comment_list_api_monitor_log", new JSONObject(this.f63787d));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo62551b(int i) {
        this.f63787d.put("ActualReturnCount", String.valueOf(i));
    }

    /* renamed from: c */
    public final void mo62554c(int i) {
        this.f63787d.put("TotalCount", String.valueOf(i));
    }

    /* renamed from: a */
    public final void mo62546a(int i) {
        this.f63787d.put("RequireCount", String.valueOf(i));
    }

    /* renamed from: b */
    public final void mo62552b(String str) {
        C7573i.m23587b(str, "groupId");
        this.f63787d.put("GroupId", str);
    }

    /* renamed from: a */
    public final void mo62547a(long j) {
        this.f63787d.put("Offset", String.valueOf(j));
    }

    /* renamed from: a */
    public final void mo62548a(BaseResponse baseResponse) {
        C7573i.m23587b(baseResponse, "response");
        if (baseResponse instanceof BaseCommentResponse) {
            LogPbBean logPbBean = ((BaseCommentResponse) baseResponse).logPd;
            if (logPbBean != null) {
                String imprId = logPbBean.getImprId();
                if (imprId != null) {
                    this.f63787d.put("LogID", imprId);
                }
            }
        }
        this.f63787d.put("ErrorCode", String.valueOf(baseResponse.status_code));
    }

    /* renamed from: a */
    public final void mo62549a(String str) {
        C7573i.m23587b(str, "methodName");
        this.f63787d.put("MethodName", str);
    }
}
