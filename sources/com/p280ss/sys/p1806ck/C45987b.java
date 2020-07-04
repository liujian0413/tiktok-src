package com.p280ss.sys.p1806ck;

import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.p811a.p812a.C18875a;
import com.p280ss.p811a.p813b.C18889h;
import com.p280ss.sys.p1806ck.p1807a.C45974a;
import com.p280ss.sys.p1806ck.p1807a.C45980f;
import com.p280ss.sys.p1806ck.p1807a.C45984i;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.ss.sys.ck.b */
public final class C45987b {

    /* renamed from: a */
    public static String f117522a = "SCCheckLog";

    /* renamed from: b */
    public static String f117523b;

    /* renamed from: c */
    public static float f117524c = -1.0f;

    /* renamed from: d */
    public static HashMap<Integer, C45990a> f117525d = new HashMap<>();

    /* renamed from: e */
    public static boolean f117526e = false;

    /* renamed from: f */
    public static long f117527f = DouPlusShareGuideExperiment.MIN_VALID_DURATION;

    /* renamed from: g */
    public static long f117528g = 3600000;

    /* renamed from: h */
    private static int f117529h = 0;

    /* renamed from: com.ss.sys.ck.b$a */
    public static class C45990a {

        /* renamed from: a */
        public Integer f117530a;

        /* renamed from: b */
        public float f117531b;

        /* renamed from: c */
        public int f117532c;

        C45990a() {
        }

        C45990a(Integer num, float f, int i) {
            this.f117530a = num;
            this.f117531b = f;
            this.f117532c = C34943c.f91127w;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C18875a.m61612c());
        sb.append("/view");
        f117523b = sb.toString();
    }

    /* renamed from: a */
    public static String m144181a() {
        return f117523b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|(2:5|3)|15|6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0093 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m144182a(java.lang.String r7) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0096 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r7 = "challenge_setting"
            org.json.JSONArray r7 = r1.getJSONArray(r7)     // Catch:{ Exception -> 0x0096 }
            r2 = 0
        L_0x000d:
            int r3 = r7.length()     // Catch:{ Exception -> 0x0096 }
            if (r2 >= r3) goto L_0x0043
            org.json.JSONObject r3 = r7.getJSONObject(r2)     // Catch:{ Exception -> 0x0096 }
            com.ss.sys.ck.b$a r4 = new com.ss.sys.ck.b$a     // Catch:{ Exception -> 0x0096 }
            r4.<init>()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r5 = "mode"
            int r5 = r3.getInt(r5)     // Catch:{ Exception -> 0x0096 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0096 }
            r4.f117530a = r5     // Catch:{ Exception -> 0x0096 }
            java.lang.String r5 = "percent"
            double r5 = r3.getDouble(r5)     // Catch:{ Exception -> 0x0096 }
            float r5 = (float) r5     // Catch:{ Exception -> 0x0096 }
            r4.f117531b = r5     // Catch:{ Exception -> 0x0096 }
            java.lang.String r5 = "min_width"
            int r3 = r3.getInt(r5)     // Catch:{ Exception -> 0x0096 }
            r4.f117532c = r3     // Catch:{ Exception -> 0x0096 }
            java.util.HashMap<java.lang.Integer, com.ss.sys.ck.b$a> r3 = f117525d     // Catch:{ Exception -> 0x0096 }
            java.lang.Integer r5 = r4.f117530a     // Catch:{ Exception -> 0x0096 }
            r3.put(r5, r4)     // Catch:{ Exception -> 0x0096 }
            int r2 = r2 + 1
            goto L_0x000d
        L_0x0043:
            java.lang.String r7 = "h5_url"
            java.lang.String r7 = r1.getString(r7)     // Catch:{ Exception -> 0x0096 }
            f117523b = r7     // Catch:{ Exception -> 0x0096 }
            java.lang.String r7 = "alpha"
            double r2 = r1.getDouble(r7)     // Catch:{ Exception -> 0x0096 }
            float r7 = (float) r2     // Catch:{ Exception -> 0x0096 }
            f117524c = r7     // Catch:{ Exception -> 0x0096 }
            java.lang.String r7 = "vs_wait"
            r2 = 5000(0x1388, double:2.4703E-320)
            long r2 = r1.optLong(r7, r2)     // Catch:{ Exception -> 0x0096 }
            f117527f = r2     // Catch:{ Exception -> 0x0096 }
            java.lang.String r7 = "vs_loop"
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            long r1 = r1.optLong(r7, r2)     // Catch:{ Exception -> 0x0096 }
            f117528g = r1     // Catch:{ Exception -> 0x0096 }
            java.lang.String r7 = "[+]read package vs_wait=%d vs_loop=%d"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0096 }
            long r2 = f117527f     // Catch:{ Exception -> 0x0096 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0096 }
            r1[r0] = r2     // Catch:{ Exception -> 0x0096 }
            long r2 = f117528g     // Catch:{ Exception -> 0x0096 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0096 }
            r3 = 1
            r1[r3] = r2     // Catch:{ Exception -> 0x0096 }
            com.C1642a.m8034a(r7, r1)     // Catch:{ Exception -> 0x0096 }
            com.ss.sys.ck.SCCheckUtils r7 = com.p280ss.sys.p1806ck.SCCheckUtils.getInstance()     // Catch:{ Throwable -> 0x0093 }
            android.content.Context r7 = r7.ctx     // Catch:{ Throwable -> 0x0093 }
            java.lang.String r1 = "vs_wait"
            long r4 = f117527f     // Catch:{ Throwable -> 0x0093 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Throwable -> 0x0093 }
            com.p280ss.sys.p1806ck.p1807a.C45980f.m144168a(r7, r1, r2)     // Catch:{ Throwable -> 0x0093 }
        L_0x0093:
            f117526e = r3     // Catch:{ Exception -> 0x0096 }
            return r3
        L_0x0096:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = com.p280ss.p811a.p812a.C18875a.m61612c()
            r7.append(r1)
            java.lang.String r1 = "/view"
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            f117523b = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.p1806ck.C45987b.m144182a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public static void m144183b() {
        C45990a aVar = new C45990a(Integer.valueOf(1105), 1.1533333f, C34943c.f91127w);
        C45990a aVar2 = new C45990a(Integer.valueOf(3058), 1.1533333f, C34943c.f91127w);
        C45990a aVar3 = new C45990a(Integer.valueOf(10031), 1.1533333f, C34943c.f91127w);
        C45990a aVar4 = new C45990a(Integer.valueOf(1104), 0.9533333f, C34943c.f91127w);
        C45990a aVar5 = new C45990a(Integer.valueOf(3059), 0.9533333f, C34943c.f91127w);
        C45990a aVar6 = new C45990a(Integer.valueOf(10030), 0.9533333f, C34943c.f91127w);
        f117525d.put(aVar.f117530a, aVar);
        f117525d.put(aVar2.f117530a, aVar2);
        f117525d.put(aVar3.f117530a, aVar3);
        f117525d.put(aVar4.f117530a, aVar4);
        f117525d.put(aVar5.f117530a, aVar5);
        f117525d.put(aVar6.f117530a, aVar6);
    }

    /* renamed from: c */
    public static void m144184c() {
        SCCheckUtils instance = SCCheckUtils.getInstance();
        if (instance != null) {
            StringBuilder sb = new StringBuilder();
            try {
                for (Entry entry : SCCheckUtils.sCallback.getRequestParams().entrySet()) {
                    if (entry.getValue() != null) {
                        try {
                            sb.append("&");
                            sb.append((String) entry.getKey());
                            sb.append("=");
                            sb.append(URLEncoder.encode((String) entry.getValue(), "utf-8"));
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            StringBuilder sb2 = new StringBuilder("?aid=");
            sb2.append(instance.appID);
            sb2.append("&lang=");
            sb2.append(instance.language);
            sb2.append("&app_name=");
            sb2.append(instance.appName);
            sb2.append("&iid=");
            sb2.append(instance.iid);
            sb2.append("&vc=");
            sb2.append(instance.versionCode);
            sb2.append("&did=");
            sb2.append(instance.deviceID);
            sb2.append("&ch=");
            sb2.append(instance.channel);
            sb2.append("&os=0");
            sb2.append(sb.toString());
            String sb3 = sb2.toString();
            try {
                new C45984i(instance.ctx, instance.session, sb3).mo111334a();
            } catch (Throwable unused3) {
                new C45974a(instance.ctx, instance.session, sb3).mo50246a(2, 2, null);
            }
        }
    }

    /* renamed from: d */
    public static void m144185d() {
        new Thread("CZL-11") {
            public final void run() {
                try {
                    long longValue = C45980f.m144167a(SCCheckUtils.getInstance().ctx, "vs_wait").longValue();
                    new StringBuilder("vs_wait exec time ").append(longValue);
                    if (longValue <= 0) {
                        longValue = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
                    }
                    Thread.currentThread();
                    Thread.sleep(longValue);
                } catch (Throwable unused) {
                }
                C45987b.m144184c();
            }
        }.start();
    }

    /* renamed from: e */
    public static void m144186e() {
        new Thread("CZL-22") {
            public final void run() {
                C18889h.m61656a(3600000);
                C45987b.m144184c();
            }
        }.start();
    }
}
