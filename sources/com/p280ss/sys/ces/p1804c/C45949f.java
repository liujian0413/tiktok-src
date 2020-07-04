package com.p280ss.sys.ces.p1804c;

import android.content.Context;
import com.p280ss.p811a.p812a.C18875a;
import com.p280ss.sys.ces.C45939c;
import com.p280ss.sys.ces.p1802a.C45932c;

/* renamed from: com.ss.sys.ces.c.f */
public final class C45949f {

    /* renamed from: d */
    private static String f117445d = "";

    /* renamed from: a */
    public String f117446a = "";

    /* renamed from: b */
    public Context f117447b;

    /* renamed from: c */
    public String f117448c = "";

    public C45949f(Context context, String str, int i) {
        if (str == null || str.length() <= 0) {
            str = "";
        }
        this.f117446a = str;
        this.f117447b = context;
        StringBuilder sb = new StringBuilder();
        sb.append(C18875a.m61613c(i));
        sb.append("/v2/r");
        sb.append(m144106a(i));
        this.f117448c = sb.toString();
    }

    /* renamed from: a */
    private String m144106a(int i) {
        String str = "?os=0&ver=0.6.10.25.17-IH-Ov&m=2";
        String str2 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f117447b.getPackageManager().getPackageInfo(this.f117447b.getPackageName(), 0).versionName);
            str2 = sb.toString();
        } catch (Throwable unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("&app_ver=");
        sb2.append(str2);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb3);
        sb4.append("&region=");
        sb4.append(C45932c.m144057c(this.f117447b));
        String sb5 = sb4.toString();
        if (i == 0) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(sb5);
            sb6.append("&aid=");
            sb6.append(C45939c.m144082b());
            String sb7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(sb7);
            sb8.append("&did=");
            sb8.append(C45939c.m144085d());
            String sb9 = sb8.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb9);
            sb10.append("&iid=");
            sb10.append(C45939c.m144086e());
            sb5 = sb10.toString();
        }
        if (i != 1) {
            return sb5;
        }
        StringBuilder sb11 = new StringBuilder();
        sb11.append(sb5);
        sb11.append("&appkey=");
        sb11.append(C45939c.m144088g().NM_getAppKey());
        String sb12 = sb11.toString();
        StringBuilder sb13 = new StringBuilder();
        sb13.append(sb12);
        sb13.append("&did=");
        sb13.append(C45939c.m144088g().NM_getDeviceId());
        return sb13.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b7, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b7 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4 A[SYNTHETIC, Splitter:B:33:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cb A[SYNTHETIC, Splitter:B:37:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d2 A[SYNTHETIC, Splitter:B:44:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9 A[SYNTHETIC, Splitter:B:48:0x00d9] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111270a(byte[] r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r0 = 0
        L_0x0005:
            r4 = 2
            if (r0 >= r4) goto L_0x00dd
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            r5.<init>()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            com.bytedance.retrofit2.a.b r6 = new com.bytedance.retrofit2.a.b     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            java.lang.String r7 = "Cookie"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            java.lang.String r9 = "sessionid="
            r8.<init>(r9)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            java.lang.String r9 = r10.f117446a     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            r8.append(r9)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            r6.<init>(r7, r8)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            r5.add(r6)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            java.lang.String r6 = r10.f117448c     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            com.bytedance.retrofit2.p r6 = com.bytedance.ttnet.utils.RetrofitUtils.m37904b(r6)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            java.lang.Class<com.ss.sys.ces.c.d> r7 = com.p280ss.sys.ces.p1804c.C45946d.class
            java.lang.Object r6 = r6.mo30492a(r7)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            com.ss.sys.ces.c.d r6 = (com.p280ss.sys.ces.p1804c.C45946d) r6     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            com.bytedance.retrofit2.mime.TypedByteArray r7 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            java.lang.String r8 = "application/octet-stream"
            java.lang.String[] r9 = new java.lang.String[r1]     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            r7.<init>(r8, r11, r9)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            java.lang.String r8 = r10.f117448c     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            com.bytedance.retrofit2.b r5 = r6.mo111268a(r8, r5, r7)     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            com.bytedance.retrofit2.t r5 = r5.execute()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            r6.<init>()     // Catch:{ Throwable -> 0x00cf, all -> 0x00c0 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r3]     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            T r5 = r5.f33302b     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            com.bytedance.retrofit2.mime.TypedInput r5 = (com.bytedance.retrofit2.mime.TypedInput) r5     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
            java.io.InputStream r5 = r5.mo10444in()     // Catch:{ Throwable -> 0x00be, all -> 0x00bc }
        L_0x0059:
            int r2 = r5.read(r7, r1, r3)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            if (r2 <= 0) goto L_0x0063
            r6.write(r7, r1, r2)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            goto L_0x0059
        L_0x0063:
            byte[] r2 = r6.toByteArray()     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            if (r2 == 0) goto L_0x00b1
            int r2 = r2.length     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r3 = 37
            if (r2 != r3) goto L_0x0075
            r11 = 1
            com.p280ss.sys.ces.C45939c.f117417k = r11     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r2 = r5
            r3 = r6
            goto L_0x00dd
        L_0x0075:
            com.p280ss.sys.ces.C45939c.f117417k = r1     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00ba, all -> 0x00b7 }
            r7 = 997(0x3e5, double:4.926E-321)
            long r2 = r2 % r7
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x00b1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00b1, all -> 0x00b7 }
            r2.<init>()     // Catch:{ Throwable -> 0x00b1, all -> 0x00b7 }
            java.lang.String r3 = "url"
            java.lang.String r7 = r10.f117448c     // Catch:{ Throwable -> 0x00b1, all -> 0x00b7 }
            r2.put(r3, r7)     // Catch:{ Throwable -> 0x00b1, all -> 0x00b7 }
            java.lang.String r3 = "typ"
            java.lang.String r7 = "not37"
            r2.put(r3, r7)     // Catch:{ Throwable -> 0x00b1, all -> 0x00b7 }
            java.lang.String r3 = android.util.Base64.encodeToString(r11, r4)     // Catch:{ Throwable -> 0x00b1, all -> 0x00b7 }
            java.lang.String r7 = "dat"
            r2.put(r7, r3)     // Catch:{ Throwable -> 0x00b1, all -> 0x00b7 }
            java.lang.String r3 = "rpt_log_rep_err"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00b1, all -> 0x00b7 }
            r7.<init>()     // Catch:{ Throwable -> 0x00b1, all -> 0x00b7 }
            r7.append(r2)     // Catch:{ Throwable -> 0x00b1, all -> 0x00b7 }
            java.lang.String r2 = r7.toString()     // Catch:{ Throwable -> 0x00b1, all -> 0x00b7 }
            com.p280ss.sys.ces.C45955e.m144121a(r4, r3, r2)     // Catch:{ Throwable -> 0x00b1, all -> 0x00b7 }
        L_0x00b1:
            int r0 = r0 + 1
            r2 = r5
            r3 = r6
            goto L_0x0005
        L_0x00b7:
            r11 = move-exception
            r2 = r5
            goto L_0x00c2
        L_0x00ba:
            r2 = r5
            goto L_0x00d0
        L_0x00bc:
            r11 = move-exception
            goto L_0x00c2
        L_0x00be:
            goto L_0x00d0
        L_0x00c0:
            r11 = move-exception
            r6 = r3
        L_0x00c2:
            if (r2 == 0) goto L_0x00c9
            r2.close()     // Catch:{ Throwable -> 0x00c8 }
            goto L_0x00c9
        L_0x00c8:
        L_0x00c9:
            if (r6 == 0) goto L_0x00ce
            r6.close()     // Catch:{ Throwable -> 0x00ce }
        L_0x00ce:
            throw r11
        L_0x00cf:
            r6 = r3
        L_0x00d0:
            if (r2 == 0) goto L_0x00d7
            r2.close()     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x00d6:
        L_0x00d7:
            if (r6 == 0) goto L_0x00e9
            r6.close()     // Catch:{ Throwable -> 0x00dc }
        L_0x00dc:
            return
        L_0x00dd:
            if (r2 == 0) goto L_0x00e4
            r2.close()     // Catch:{ Throwable -> 0x00e3 }
            goto L_0x00e4
        L_0x00e3:
        L_0x00e4:
            if (r3 == 0) goto L_0x00e9
            r3.close()     // Catch:{ Throwable -> 0x00e9 }
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.ces.p1804c.C45949f.mo111270a(byte[]):void");
    }
}
