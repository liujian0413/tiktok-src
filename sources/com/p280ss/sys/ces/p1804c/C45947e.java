package com.p280ss.sys.ces.p1804c;

import android.content.Context;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p280ss.p811a.p812a.C18875a;
import com.p280ss.sys.ces.C45939c;
import com.p280ss.sys.ces.p1802a.C45932c;
import java.util.ArrayList;

/* renamed from: com.ss.sys.ces.c.e */
public final class C45947e {

    /* renamed from: d */
    private static String f117440d = "";

    /* renamed from: a */
    public String f117441a = "";

    /* renamed from: b */
    public Context f117442b;

    /* renamed from: c */
    public String f117443c = "";

    public C45947e(Context context, String str, int i) {
        if (str == null || str.length() <= 0) {
            str = "";
        }
        this.f117441a = str;
        this.f117442b = context;
        StringBuilder sb = new StringBuilder();
        sb.append(C18875a.m61610b());
        sb.append("/c/m");
        sb.append(m144102a(0));
        this.f117443c = sb.toString();
    }

    /* renamed from: a */
    private String m144102a(int i) {
        String str = "?os=0&ver=0.6.10.25.17-IH-Ov&m=2";
        String str2 = "";
        try {
            str2 = this.f117442b.getPackageManager().getPackageInfo(this.f117442b.getPackageName(), 0).versionName;
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&app_ver=");
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("&region=");
        sb3.append(C45932c.m144057c(this.f117442b));
        String sb4 = sb3.toString();
        if (i == 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append("&aid=");
            sb5.append(C45939c.m144082b());
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("&did=");
            sb7.append(C45939c.m144085d());
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            sb9.append("&iid=");
            sb9.append(C45939c.m144086e());
            sb4 = sb9.toString();
        }
        if (i != 1) {
            return sb4;
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(sb4);
        sb10.append("&appkey=");
        sb10.append(C45939c.m144088g().NM_getAppKey());
        String sb11 = sb10.toString();
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb11);
        sb12.append("&did=");
        sb12.append(C45939c.m144088g().NM_getDeviceId());
        return sb12.toString();
    }

    /* renamed from: a */
    public final void mo111269a(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("sessionid=");
        sb.append(this.f117441a);
        arrayList.add(new C12461b("Cookie", sb.toString()));
        ((C45946d) RetrofitUtils.m37904b(this.f117443c).mo30492a(C45946d.class)).mo111268a(this.f117443c, arrayList, new TypedByteArray("application/octet-stream", bArr, new String[0])).enqueue(new C12474e<TypedInput>() {
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003d */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x0052 A[SYNTHETIC, Splitter:B:30:0x0052] */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x0059 A[SYNTHETIC, Splitter:B:34:0x0059] */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x0060 A[SYNTHETIC, Splitter:B:41:0x0060] */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x0067 A[SYNTHETIC, Splitter:B:45:0x0067] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo26463a(com.bytedance.retrofit2.C12466b<com.bytedance.retrofit2.mime.TypedInput> r6, com.bytedance.retrofit2.C12534t<com.bytedance.retrofit2.mime.TypedInput> r7) {
                /*
                    r5 = this;
                    r6 = 0
                    java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x005d, all -> 0x004c }
                    r0.<init>()     // Catch:{ Throwable -> 0x005d, all -> 0x004c }
                    r1 = 1024(0x400, float:1.435E-42)
                    byte[] r2 = new byte[r1]     // Catch:{ Throwable -> 0x004a, all -> 0x0045 }
                    T r7 = r7.f33302b     // Catch:{ Throwable -> 0x004a, all -> 0x0045 }
                    com.bytedance.retrofit2.mime.TypedInput r7 = (com.bytedance.retrofit2.mime.TypedInput) r7     // Catch:{ Throwable -> 0x004a, all -> 0x0045 }
                    java.io.InputStream r7 = r7.mo10444in()     // Catch:{ Throwable -> 0x004a, all -> 0x0045 }
                L_0x0012:
                    r6 = 0
                    int r3 = r7.read(r2, r6, r1)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                    if (r3 <= 0) goto L_0x001d
                    r0.write(r2, r6, r3)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                    goto L_0x0012
                L_0x001d:
                    byte[] r6 = r0.toByteArray()     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                    if (r6 == 0) goto L_0x0038
                    java.lang.String r1 = new java.lang.String     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                    r1.<init>(r6)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                    org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                    r6.<init>(r1)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                    java.lang.String r1 = "result"
                    java.lang.Object r6 = r6.get(r1)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                    java.lang.String r1 = "success"
                    r6.equals(r1)     // Catch:{ Throwable -> 0x0043, all -> 0x0041 }
                L_0x0038:
                    if (r7 == 0) goto L_0x003d
                    r7.close()     // Catch:{ Throwable -> 0x003d }
                L_0x003d:
                    r0.close()     // Catch:{ Throwable -> 0x0040 }
                L_0x0040:
                    return
                L_0x0041:
                    r6 = move-exception
                    goto L_0x0050
                L_0x0043:
                    r6 = r7
                    goto L_0x005e
                L_0x0045:
                    r7 = move-exception
                    r4 = r7
                    r7 = r6
                    r6 = r4
                    goto L_0x0050
                L_0x004a:
                    goto L_0x005e
                L_0x004c:
                    r7 = move-exception
                    r0 = r6
                    r6 = r7
                    r7 = r0
                L_0x0050:
                    if (r7 == 0) goto L_0x0057
                    r7.close()     // Catch:{ Throwable -> 0x0056 }
                    goto L_0x0057
                L_0x0056:
                L_0x0057:
                    if (r0 == 0) goto L_0x005c
                    r0.close()     // Catch:{ Throwable -> 0x005c }
                L_0x005c:
                    throw r6
                L_0x005d:
                    r0 = r6
                L_0x005e:
                    if (r6 == 0) goto L_0x0065
                    r6.close()     // Catch:{ Throwable -> 0x0064 }
                    goto L_0x0065
                L_0x0064:
                L_0x0065:
                    if (r0 == 0) goto L_0x006a
                    r0.close()     // Catch:{ Throwable -> 0x006a }
                L_0x006a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.ces.p1804c.C45947e.C459481.mo26463a(com.bytedance.retrofit2.b, com.bytedance.retrofit2.t):void");
            }

            /* renamed from: a */
            public final void mo26464a(C12466b<TypedInput> bVar, Throwable th) {
            }
        });
    }
}
