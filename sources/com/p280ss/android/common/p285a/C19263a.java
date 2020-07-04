package com.p280ss.android.common.p285a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.deviceregister.C6793k;

/* renamed from: com.ss.android.common.a.a */
public final class C19263a {

    /* renamed from: com.ss.android.common.a.a$a */
    public static class C6731a extends Thread {

        /* renamed from: a */
        private Context f19222a;

        /* renamed from: b */
        private String f19223b;

        /* renamed from: c */
        private final Integer f19224c;

        public final void run() {
            C6793k.m21104a().mo16612e(this.f19224c);
            C19263a.m63135a(this.f19222a, this.f19223b, this.f19224c);
        }

        public C6731a(Context context, String str, Integer num) {
            this.f19222a = context;
            this.f19223b = str;
            this.f19224c = num;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, java.util.Map, com.bytedance.common.utility.k$a] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v19, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dd, code lost:
        com.p280ss.android.deviceregister.C6793k.m21104a().mo16606b(r8, android.util.Log.getStackTraceString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e8, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0091 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0, types: [java.lang.Throwable, java.util.Map, com.bytedance.common.utility.k$a]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.lang.Throwable, java.util.Map, com.bytedance.common.utility.k$a, ?[OBJECT, ARRAY]]
      mth insns count: 82
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b1 A[Catch:{ Exception -> 0x00e9, all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc A[ExcHandler:  FINALLY, Splitter:B:1:0x0002] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m63135a(android.content.Context r6, java.lang.String r7, java.lang.Integer r8) {
        /*
            r0 = 0
            r1 = 0
            com.ss.android.deviceregister.k r2 = com.p280ss.android.deviceregister.C6793k.m21104a()     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            r2.mo16613f(r8)     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            r2.<init>(r7)     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            r7 = 1
            boolean r3 = com.p280ss.android.deviceregister.C6789d.m21091k()     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            if (r3 == 0) goto L_0x001a
            java.lang.String r3 = com.p280ss.android.deviceregister.p855c.C19319c.m63370m(r6)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            goto L_0x001b
        L_0x001a:
            r3 = r1
        L_0x001b:
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r3)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            if (r4 == 0) goto L_0x0025
            java.lang.String r3 = com.p280ss.android.C6725a.m20835a()     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
        L_0x0025:
            java.lang.String r4 = "google_aid"
            m63134a(r2, r4, r3, r7)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            int r3 = r3.getRawOffset()     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            r4 = 3600000(0x36ee80, float:5.044674E-39)
            int r3 = r3 / r4
            r4 = -12
            if (r3 >= r4) goto L_0x003c
            r3 = -12
        L_0x003c:
            r4 = 12
            if (r3 <= r4) goto L_0x0042
            r3 = 12
        L_0x0042:
            java.lang.String r4 = "timezone"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            r5.<init>()     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            r5.append(r3)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            m63134a(r2, r4, r3, r0)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            java.lang.String r3 = com.p280ss.android.deviceregister.p289a.C6781d.m20965a()     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            if (r4 != 0) goto L_0x006b
            java.lang.String r4 = "package"
            m63134a(r2, r4, r3, r7)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            java.lang.String r3 = "real_package_name"
            java.lang.String r4 = r6.getPackageName()     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            m63134a(r2, r3, r4, r7)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
        L_0x006b:
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r6.getSystemService(r3)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            java.lang.String r4 = "carrier"
            java.lang.String r5 = r3.getNetworkOperatorName()     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            m63134a(r2, r4, r5, r7)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            java.lang.String r4 = "mcc_mnc"
            java.lang.String r5 = r3.getNetworkOperator()     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            m63134a(r2, r4, r5, r7)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            java.lang.String r4 = "sim_region"
            java.lang.String r3 = r3.getSimCountryIso()     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            m63134a(r2, r4, r3, r7)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
            com.p280ss.android.usergrowth.C7304c.m22880a(r6, r2)     // Catch:{ Exception -> 0x0091, all -> 0x00dc }
        L_0x0091:
            com.p280ss.android.common.applog.NetUtil.appendCommonParams(r2, r7)     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            com.ss.android.deviceregister.k r6 = com.p280ss.android.deviceregister.C6793k.m21104a()     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            java.lang.String r3 = r2.toString()     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            r6.mo16600a(r8, r3)     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            com.bytedance.common.utility.k r6 = com.bytedance.common.utility.C6317k.m19580a()     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            java.lang.String r6 = r6.mo15153a(r2, r1, r1)     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r6)     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            if (r2 != 0) goto L_0x00d0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            r2.<init>(r6)     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            java.lang.String r6 = "success"
            java.lang.String r3 = "message"
            java.lang.String r2 = r2.optString(r3)     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            boolean r6 = r6.equals(r2)     // Catch:{ Exception -> 0x00e9, all -> 0x00dc }
            if (r6 == 0) goto L_0x00d0
            com.ss.android.deviceregister.k r6 = com.p280ss.android.deviceregister.C6793k.m21104a()
            java.lang.String r0 = android.util.Log.getStackTraceString(r1)
            r6.mo16606b(r8, r0)
            return r7
        L_0x00d0:
            com.ss.android.deviceregister.k r6 = com.p280ss.android.deviceregister.C6793k.m21104a()
            java.lang.String r7 = android.util.Log.getStackTraceString(r1)
            r6.mo16606b(r8, r7)
            goto L_0x00f5
        L_0x00dc:
            r6 = move-exception
            com.ss.android.deviceregister.k r7 = com.p280ss.android.deviceregister.C6793k.m21104a()
            java.lang.String r0 = android.util.Log.getStackTraceString(r1)
            r7.mo16606b(r8, r0)
            throw r6
        L_0x00e9:
            r6 = move-exception
            com.ss.android.deviceregister.k r7 = com.p280ss.android.deviceregister.C6793k.m21104a()
            java.lang.String r6 = android.util.Log.getStackTraceString(r6)
            r7.mo16606b(r8, r6)
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.common.p285a.C19263a.m63135a(android.content.Context, java.lang.String, java.lang.Integer):boolean");
    }

    /* renamed from: a */
    private static void m63134a(StringBuilder sb, String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (sb.toString().indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append(str);
            sb.append("=");
            if (z) {
                str2 = Uri.encode(str2);
            }
            sb.append(str2);
        }
    }
}
