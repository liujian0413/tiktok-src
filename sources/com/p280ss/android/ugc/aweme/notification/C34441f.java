package com.p280ss.android.ugc.aweme.notification;

import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.notification.p1437f.p1438a.C34444a;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.f */
public final class C34441f {

    /* renamed from: a */
    public static final C34441f f89876a = new C34441f();

    /* renamed from: com.ss.android.ugc.aweme.notification.f$a */
    public static final class C34442a {

        /* renamed from: a */
        public static final C34442a f89877a = new C34442a();

        /* renamed from: b */
        private static String f89878b;

        /* renamed from: c */
        private static final C6600e f89879c = new C6600e();

        /* renamed from: d */
        private static final Type f89880d = new C34443a().type;

        /* renamed from: e */
        private static Map<Integer, Long> f89881e;

        /* renamed from: com.ss.android.ugc.aweme.notification.f$a$a */
        public static final class C34443a extends C6597a<Map<Integer, Long>> {
            C34443a() {
            }
        }

        private C34442a() {
        }

        /* renamed from: b */
        private final C34444a<String> m111398b() {
            return new C34444a<>(m111396a(), "");
        }

        /* renamed from: a */
        private static String m111396a() {
            StringBuilder sb = new StringBuilder("robot_last_delete_timestamp");
            String str = f89878b;
            if (str == null) {
                C7573i.m23583a("mUserId");
            }
            sb.append(str);
            return sb.toString();
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001b A[Catch:{ Exception -> 0x0033 }] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[Catch:{ Exception -> 0x0033 }] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m111400c() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.notification.f.a.a r0 = r3.m111398b()
                java.lang.Object r0 = r0.mo87756a()
                java.lang.String r0 = (java.lang.String) r0
                r1 = r0
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0033 }
                if (r1 == 0) goto L_0x0018
                int r1 = r1.length()     // Catch:{ Exception -> 0x0033 }
                if (r1 != 0) goto L_0x0016
                goto L_0x0018
            L_0x0016:
                r1 = 0
                goto L_0x0019
            L_0x0018:
                r1 = 1
            L_0x0019:
                if (r1 == 0) goto L_0x0023
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x0033 }
                r0.<init>()     // Catch:{ Exception -> 0x0033 }
                java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0033 }
                goto L_0x003a
            L_0x0023:
                com.google.gson.e r1 = f89879c     // Catch:{ Exception -> 0x0033 }
                java.lang.reflect.Type r2 = f89880d     // Catch:{ Exception -> 0x0033 }
                java.lang.Object r0 = r1.mo15975a(r0, r2)     // Catch:{ Exception -> 0x0033 }
                java.lang.String r1 = "mGson.fromJson(string, mDataType)"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ Exception -> 0x0033 }
                java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x0033 }
                goto L_0x003a
            L_0x0033:
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.util.Map r0 = (java.util.Map) r0
            L_0x003a:
                f89881e = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.C34441f.C34442a.m111400c():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if ((!kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r0, (java.lang.Object) r2.getCurUserId())) != false) goto L_0x0026;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final boolean m111397a(int r4, long r5) {
            /*
                java.util.Map<java.lang.Integer, java.lang.Long> r0 = f89881e
                r1 = 1
                if (r0 == 0) goto L_0x0026
                java.lang.String r0 = f89878b
                if (r0 == 0) goto L_0x0026
                java.lang.String r0 = f89878b
                if (r0 != 0) goto L_0x0012
                java.lang.String r2 = "mUserId"
                kotlin.jvm.internal.C7573i.m23583a(r2)
            L_0x0012:
                com.ss.android.ugc.aweme.IAccountUserService r2 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
                java.lang.String r3 = "AccountProxyService.userService()"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                java.lang.String r2 = r2.getCurUserId()
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x003f
            L_0x0026:
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
                java.lang.String r2 = "AccountProxyService.userService()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                java.lang.String r0 = r0.getCurUserId()
                java.lang.String r2 = "AccountProxyService.userService().curUserId"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                f89878b = r0
                com.ss.android.ugc.aweme.notification.f$a r0 = f89877a
                r0.m111400c()
            L_0x003f:
                java.util.Map<java.lang.Integer, java.lang.Long> r0 = f89881e
                if (r0 != 0) goto L_0x0048
                java.lang.String r2 = "mCurrentNoticeMap"
                kotlin.jvm.internal.C7573i.m23583a(r2)
            L_0x0048:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Object r4 = r0.get(r4)
                java.lang.Long r4 = (java.lang.Long) r4
                r0 = 0
                if (r4 == 0) goto L_0x005f
                long r2 = r4.longValue()
                int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r4 < 0) goto L_0x005e
                return r1
            L_0x005e:
                return r0
            L_0x005f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.C34441f.C34442a.m111397a(int, long):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if ((!kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r0, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x0026;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void m111399b(int r3, long r4) {
            /*
                java.util.Map<java.lang.Integer, java.lang.Long> r0 = f89881e
                if (r0 == 0) goto L_0x0026
                java.lang.String r0 = f89878b
                if (r0 == 0) goto L_0x0026
                java.lang.String r0 = f89878b
                if (r0 != 0) goto L_0x0011
                java.lang.String r1 = "mUserId"
                kotlin.jvm.internal.C7573i.m23583a(r1)
            L_0x0011:
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
                java.lang.String r2 = "AccountProxyService.userService()"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.String r1 = r1.getCurUserId()
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x003f
            L_0x0026:
                com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
                java.lang.String r1 = "AccountProxyService.userService()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                java.lang.String r0 = r0.getCurUserId()
                java.lang.String r1 = "AccountProxyService.userService().curUserId"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                f89878b = r0
                com.ss.android.ugc.aweme.notification.f$a r0 = f89877a
                r0.m111400c()
            L_0x003f:
                java.util.Map<java.lang.Integer, java.lang.Long> r0 = f89881e
                if (r0 != 0) goto L_0x0048
                java.lang.String r1 = "mCurrentNoticeMap"
                kotlin.jvm.internal.C7573i.m23583a(r1)
            L_0x0048:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r0.put(r3, r4)
                com.ss.android.ugc.aweme.notification.f$a r3 = f89877a
                com.ss.android.ugc.aweme.notification.f.a.a r3 = r3.m111398b()
                com.google.gson.e r4 = f89879c
                java.util.Map<java.lang.Integer, java.lang.Long> r5 = f89881e
                if (r5 != 0) goto L_0x0064
                java.lang.String r0 = "mCurrentNoticeMap"
                kotlin.jvm.internal.C7573i.m23583a(r0)
            L_0x0064:
                java.lang.reflect.Type r0 = f89880d
                java.lang.String r4 = r4.mo15980b(r5, r0)
                r3.mo87757a(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.C34441f.C34442a.m111399b(int, long):void");
        }
    }

    private C34441f() {
    }
}
