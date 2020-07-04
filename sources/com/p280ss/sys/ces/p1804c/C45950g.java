package com.p280ss.sys.ces.p1804c;

import android.content.Context;
import com.p280ss.p811a.p812a.C18875a;
import com.p280ss.sys.ces.C45939c;
import com.p280ss.sys.ces.p1802a.C45932c;

/* renamed from: com.ss.sys.ces.c.g */
public final class C45950g {

    /* renamed from: d */
    private static String f117449d = "";

    /* renamed from: a */
    public String f117450a = "";

    /* renamed from: b */
    public Context f117451b;

    /* renamed from: c */
    public String f117452c = "";

    public C45950g(Context context, String str) {
        if (str == null || str.length() <= 0) {
            str = "";
        }
        this.f117450a = str;
        this.f117451b = context;
        StringBuilder sb = new StringBuilder();
        sb.append(C18875a.m61613c(0));
        sb.append("/v2/s");
        sb.append(m144108b());
        this.f117452c = sb.toString();
    }

    /* renamed from: b */
    private String m144108b() {
        String str = "?os=0&ver=0.6.10.25.17-IH-Ov&m=2";
        String str2 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f117451b.getPackageManager().getPackageInfo(this.f117451b.getPackageName(), 0).versionName);
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
        sb4.append(C45932c.m144057c(this.f117451b));
        String sb5 = sb4.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb5);
        sb6.append("&aid=");
        sb6.append(C45939c.m144082b());
        String sb7 = sb6.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(sb7);
        sb8.append("&did=");
        sb8.append(C45939c.m144085d());
        return sb8.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:29|28|35|36|(2:38|39)|(2:42|43)|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c2, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c3, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b3 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b7 A[SYNTHETIC, Splitter:B:38:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be A[SYNTHETIC, Splitter:B:42:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c7 A[SYNTHETIC, Splitter:B:49:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ce A[SYNTHETIC, Splitter:B:53:0x00ce] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111271a() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            r2.<init>()     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            com.bytedance.retrofit2.a.b r3 = new com.bytedance.retrofit2.a.b     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            java.lang.String r4 = "Cookie"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            java.lang.String r6 = "sessionid="
            r5.<init>(r6)     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            java.lang.String r6 = r10.f117450a     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            r5.append(r6)     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            r3.<init>(r4, r5)     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            r2.add(r3)     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            java.lang.String r3 = r10.f117452c     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            com.bytedance.retrofit2.p r3 = com.bytedance.ttnet.utils.RetrofitUtils.m37904b(r3)     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            java.lang.Class<com.ss.sys.ces.c.d> r4 = com.p280ss.sys.ces.p1804c.C45946d.class
            java.lang.Object r3 = r3.mo30492a(r4)     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            com.ss.sys.ces.c.d r3 = (com.p280ss.sys.ces.p1804c.C45946d) r3     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            java.lang.String r4 = r10.f117452c     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            com.bytedance.retrofit2.b r2 = r3.mo111267a(r4, r2)     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            com.bytedance.retrofit2.t r2 = r2.execute()     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            r3.<init>()     // Catch:{ Throwable -> 0x00b2, all -> 0x00ad }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch:{ Throwable -> 0x00b3 }
            T r2 = r2.f33302b     // Catch:{ Throwable -> 0x00b3 }
            com.bytedance.retrofit2.mime.TypedInput r2 = (com.bytedance.retrofit2.mime.TypedInput) r2     // Catch:{ Throwable -> 0x00b3 }
            java.io.InputStream r2 = r2.mo10444in()     // Catch:{ Throwable -> 0x00b3 }
        L_0x004a:
            int r0 = r2.read(r5, r1, r4)     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            if (r0 <= 0) goto L_0x0054
            r3.write(r5, r1, r0)     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            goto L_0x004a
        L_0x0054:
            byte[] r0 = r3.toByteArray()     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a0
            r4 = 200(0xc8, float:2.8E-43)
            android.content.Context r5 = r10.f117451b     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            java.lang.Object r0 = com.p280ss.sys.ces.C45928a.meta(r4, r5, r0)     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a0
            int r4 = r0.length()     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            if (r4 <= 0) goto L_0x00a0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            r4.<init>(r0)     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            java.lang.String r0 = "result"
            int r0 = r4.optInt(r0, r1)     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            java.lang.String r5 = "t1"
            int r6 = com.p280ss.sys.ces.C45958g.f117461a     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            int r5 = r4.optInt(r5, r6)     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            r6 = 1
            int r5 = r5 / r6
            java.lang.String r7 = "t2"
            int r8 = com.p280ss.sys.ces.C45958g.f117462b     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            int r7 = r4.optInt(r7, r8)     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            int r7 = r7 / r6
            java.lang.String r8 = "t3"
            int r9 = com.p280ss.sys.ces.C45958g.f117463c     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            int r4 = r4.optInt(r8, r9)     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            int r4 = r4 / r6
            if (r0 != r6) goto L_0x009e
            com.p280ss.sys.ces.C45958g.f117461a = r5     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            com.p280ss.sys.ces.C45958g.f117462b = r7     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            com.p280ss.sys.ces.C45958g.f117463c = r4     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            com.p280ss.sys.ces.C45939c.f117418l = r6     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
            goto L_0x00a0
        L_0x009e:
            com.p280ss.sys.ces.C45939c.f117418l = r1     // Catch:{ Throwable -> 0x00ab, all -> 0x00a9 }
        L_0x00a0:
            if (r2 == 0) goto L_0x00a5
            r2.close()     // Catch:{ Throwable -> 0x00a5 }
        L_0x00a5:
            r3.close()     // Catch:{ Throwable -> 0x00a8 }
        L_0x00a8:
            return
        L_0x00a9:
            r0 = move-exception
            goto L_0x00c5
        L_0x00ab:
            r0 = r2
            goto L_0x00b3
        L_0x00ad:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L_0x00b0:
            r0 = r1
            goto L_0x00c5
        L_0x00b2:
            r3 = r0
        L_0x00b3:
            com.p280ss.sys.ces.C45939c.f117418l = r1     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00bc
            r0.close()     // Catch:{ Throwable -> 0x00bb }
            goto L_0x00bc
        L_0x00bb:
        L_0x00bc:
            if (r3 == 0) goto L_0x00c1
            r3.close()     // Catch:{ Throwable -> 0x00c1 }
        L_0x00c1:
            return
        L_0x00c2:
            r1 = move-exception
            r2 = r0
            goto L_0x00b0
        L_0x00c5:
            if (r2 == 0) goto L_0x00cc
            r2.close()     // Catch:{ Throwable -> 0x00cb }
            goto L_0x00cc
        L_0x00cb:
        L_0x00cc:
            if (r3 == 0) goto L_0x00d1
            r3.close()     // Catch:{ Throwable -> 0x00d1 }
        L_0x00d1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.ces.p1804c.C45950g.mo111271a():void");
    }
}
