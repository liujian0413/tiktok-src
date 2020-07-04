package com.p280ss.android.vesdk.runtime;

import android.os.Environment;
import com.p280ss.android.ttve.common.TECloudCtrlInvoker;
import com.p280ss.android.vesdk.runtime.p1778a.C45342a;

/* renamed from: com.ss.android.vesdk.runtime.a */
public class C45341a {

    /* renamed from: a */
    private static String f116784a = "VECloudCtrlManager";

    /* renamed from: d */
    private static volatile C45341a f116785d;

    /* renamed from: e */
    private static String[] f116786e = {"vesdk_log_command"};

    /* renamed from: b */
    private boolean f116787b = false;

    /* renamed from: c */
    private TECloudCtrlInvoker f116788c = new TECloudCtrlInvoker();

    /* renamed from: f */
    private String f116789f = Environment.getExternalStorageDirectory().toString();

    private C45341a() {
    }

    /* renamed from: a */
    public static C45341a m143301a() {
        if (f116785d == null) {
            synchronized (C45341a.class) {
                if (f116785d == null) {
                    f116785d = new C45341a();
                }
            }
        }
        return f116785d;
    }

    /* renamed from: a */
    public final void mo108556a(String str) {
        String[] strArr;
        this.f116789f = str;
        for (String str2 : f116786e) {
            String str3 = (String) C45342a.m143305a().mo108560b(str2, "");
            if (!str3.isEmpty()) {
                m143303b(str2, str3);
            }
        }
    }

    /* renamed from: a */
    private static void m143302a(String str, String str2) {
        C45342a.m143305a().mo108558a(str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ Exception -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[Catch:{ Exception -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d7 A[Catch:{ Exception -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da A[Catch:{ Exception -> 0x0171 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014b A[Catch:{ Exception -> 0x0171 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m143303b(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0171 }
            r2.<init>(r13)     // Catch:{ Exception -> 0x0171 }
            int r13 = r12.hashCode()     // Catch:{ Exception -> 0x0171 }
            r3 = 2043549244(0x79ce163c, float:1.3375801E35)
            if (r13 == r3) goto L_0x0011
            goto L_0x001b
        L_0x0011:
            java.lang.String r13 = "vesdk_log_command"
            boolean r13 = r12.equals(r13)     // Catch:{ Exception -> 0x0171 }
            if (r13 == 0) goto L_0x001b
            r13 = 0
            goto L_0x001c
        L_0x001b:
            r13 = -1
        L_0x001c:
            if (r13 == 0) goto L_0x0029
            java.lang.String r13 = f116784a     // Catch:{ Exception -> 0x0171 }
            java.lang.String r1 = " json contail invalid command "
            com.p280ss.android.vesdk.C45372t.m143409d(r13, r1)     // Catch:{ Exception -> 0x0171 }
            r12 = -2
            r0 = -2
            goto L_0x018e
        L_0x0029:
            java.lang.String r13 = "false"
            java.lang.String r3 = "2018-12-08 00:00:00"
            java.lang.String r4 = "2018-12-08 00:00:00"
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "enable"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0171 }
            if (r7 == 0) goto L_0x0041
            java.lang.String r13 = "enable"
            java.lang.String r13 = r2.getString(r13)     // Catch:{ Exception -> 0x0171 }
        L_0x0041:
            java.lang.String r7 = "starttime"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0171 }
            if (r7 == 0) goto L_0x004f
            java.lang.String r3 = "starttime"
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x0171 }
        L_0x004f:
            java.lang.String r7 = "endtime"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0171 }
            if (r7 == 0) goto L_0x005d
            java.lang.String r4 = "endtime"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ Exception -> 0x0171 }
        L_0x005d:
            java.lang.String r7 = "level"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0171 }
            if (r7 == 0) goto L_0x006b
            java.lang.String r5 = "level"
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x0171 }
        L_0x006b:
            java.lang.String r7 = "sign"
            boolean r7 = r2.has(r7)     // Catch:{ Exception -> 0x0171 }
            if (r7 == 0) goto L_0x0079
            java.lang.String r6 = "sign"
            java.lang.String r6 = r2.getString(r6)     // Catch:{ Exception -> 0x0171 }
        L_0x0079:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0171 }
            r2.<init>()     // Catch:{ Exception -> 0x0171 }
            r2.append(r12)     // Catch:{ Exception -> 0x0171 }
            r2.append(r13)     // Catch:{ Exception -> 0x0171 }
            r2.append(r3)     // Catch:{ Exception -> 0x0171 }
            r2.append(r4)     // Catch:{ Exception -> 0x0171 }
            r2.append(r5)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0171 }
            com.ss.android.ttve.common.TECloudCtrlInvoker r7 = r11.f116788c     // Catch:{ Exception -> 0x0171 }
            boolean r2 = r7.mo55028a(r2, r6)     // Catch:{ Exception -> 0x0171 }
            if (r2 != 0) goto L_0x00a6
            java.lang.String r13 = ""
            m143302a(r12, r13)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r13 = f116784a     // Catch:{ Exception -> 0x0171 }
            java.lang.String r1 = "Cloud Ctrl Command Json is doctored"
            com.p280ss.android.vesdk.C45372t.m143409d(r13, r1)     // Catch:{ Exception -> 0x0171 }
            return r0
        L_0x00a6:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0171 }
            java.lang.String r6 = "yyyy-MM-dd HH:mm:ss"
            r2.<init>(r6)     // Catch:{ Exception -> 0x0171 }
            java.util.Date r3 = r2.parse(r3)     // Catch:{ Exception -> 0x0171 }
            long r6 = r3.getTime()     // Catch:{ Exception -> 0x0171 }
            java.util.Date r2 = r2.parse(r4)     // Catch:{ Exception -> 0x0171 }
            long r2 = r2.getTime()     // Catch:{ Exception -> 0x0171 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0171 }
            int r4 = r5.hashCode()     // Catch:{ Exception -> 0x0171 }
            r10 = 68
            if (r4 == r10) goto L_0x00ca
            goto L_0x00d4
        L_0x00ca:
            java.lang.String r4 = "D"
            boolean r4 = r5.equals(r4)     // Catch:{ Exception -> 0x0171 }
            if (r4 == 0) goto L_0x00d4
            r4 = 0
            goto L_0x00d5
        L_0x00d4:
            r4 = -1
        L_0x00d5:
            if (r4 == 0) goto L_0x00da
            com.ss.android.ttve.common.TESpdLogManager$InfoLevel r4 = com.p280ss.android.ttve.common.TESpdLogManager.InfoLevel.LEVEL3     // Catch:{ Exception -> 0x0171 }
            goto L_0x00dc
        L_0x00da:
            com.ss.android.ttve.common.TESpdLogManager$InfoLevel r4 = com.p280ss.android.ttve.common.TESpdLogManager.InfoLevel.LEVEL0     // Catch:{ Exception -> 0x0171 }
        L_0x00dc:
            boolean r5 = r11.f116787b     // Catch:{ Exception -> 0x0171 }
            if (r5 != 0) goto L_0x0137
            java.lang.String r5 = "true"
            boolean r5 = r13.equals(r5)     // Catch:{ Exception -> 0x0171 }
            if (r5 == 0) goto L_0x0137
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0137
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0137
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0171 }
            r13.<init>()     // Catch:{ Exception -> 0x0171 }
            java.lang.String r2 = r11.f116789f     // Catch:{ Exception -> 0x0171 }
            r13.append(r2)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r2 = "/vesdklog"
            r13.append(r2)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0171 }
            java.lang.String r2 = f116784a     // Catch:{ Exception -> 0x0171 }
            com.p280ss.android.vesdk.C45372t.m143405b(r2, r13)     // Catch:{ Exception -> 0x0171 }
            com.ss.android.ttve.common.TESpdLogManager r2 = com.p280ss.android.ttve.common.TESpdLogManager.m67830a()     // Catch:{ Exception -> 0x0171 }
            int r3 = r4.ordinal()     // Catch:{ Exception -> 0x0171 }
            r5 = 3
            int r13 = r2.mo55036a(r13, r3, r5)     // Catch:{ Exception -> 0x0171 }
            if (r13 >= 0) goto L_0x012c
            java.lang.String r1 = f116784a     // Catch:{ Exception -> 0x0171 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0171 }
            java.lang.String r3 = " TESpdLog init fail "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0171 }
            r2.append(r13)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r13 = r2.toString()     // Catch:{ Exception -> 0x0171 }
            com.p280ss.android.vesdk.C45372t.m143409d(r1, r13)     // Catch:{ Exception -> 0x0171 }
            r12 = -3
            return r12
        L_0x012c:
            com.ss.android.ttve.common.TESpdLogManager r13 = com.p280ss.android.ttve.common.TESpdLogManager.m67830a()     // Catch:{ Exception -> 0x0171 }
            r13.mo55037a(r4)     // Catch:{ Exception -> 0x0171 }
            r13 = 1
            r11.f116787b = r13     // Catch:{ Exception -> 0x0171 }
            goto L_0x016f
        L_0x0137:
            java.lang.String r4 = "false"
            boolean r13 = r13.equals(r4)     // Catch:{ Exception -> 0x0171 }
            if (r13 != 0) goto L_0x0147
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 >= 0) goto L_0x016f
            int r13 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r13 < 0) goto L_0x016f
        L_0x0147:
            boolean r13 = r11.f116787b     // Catch:{ Exception -> 0x0171 }
            if (r13 == 0) goto L_0x0154
            com.ss.android.ttve.common.TESpdLogManager r13 = com.p280ss.android.ttve.common.TESpdLogManager.m67830a()     // Catch:{ Exception -> 0x0171 }
            r13.mo55038b()     // Catch:{ Exception -> 0x0171 }
            r11.f116787b = r1     // Catch:{ Exception -> 0x0171 }
        L_0x0154:
            java.lang.String r13 = f116784a     // Catch:{ Exception -> 0x0171 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0171 }
            r2.<init>()     // Catch:{ Exception -> 0x0171 }
            r2.append(r12)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r3 = " expired"
            r2.append(r3)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0171 }
            com.p280ss.android.vesdk.C45372t.m143405b(r13, r2)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r13 = ""
            m143302a(r12, r13)     // Catch:{ Exception -> 0x0171 }
        L_0x016f:
            r0 = 0
            goto L_0x018e
        L_0x0171:
            r13 = move-exception
            java.lang.String r1 = f116784a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " json parse failed "
            r2.<init>(r3)
            java.lang.String r13 = r13.toString()
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            com.p280ss.android.vesdk.C45372t.m143409d(r1, r13)
            java.lang.String r13 = ""
            m143302a(r12, r13)
        L_0x018e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.runtime.C45341a.m143303b(java.lang.String, java.lang.String):int");
    }
}
