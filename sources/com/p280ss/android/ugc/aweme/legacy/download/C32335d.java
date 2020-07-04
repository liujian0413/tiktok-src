package com.p280ss.android.ugc.aweme.legacy.download;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.common.util.C6773c;
import com.p280ss.android.common.util.C6775g;
import com.p280ss.android.http.legacy.C6809a;
import com.p280ss.android.image.ImageInfo;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legacy.download.d */
public final class C32335d {
    /* renamed from: a */
    private static void m104901a(Context context, JSONObject jSONObject) {
        if (context != null && jSONObject != null) {
            try {
                String optString = jSONObject.optString("label");
                JSONObject optJSONObject = jSONObject.optJSONObject("ext_json");
                if (!C6319n.m19593a(optString)) {
                    C19282c.m63185a(context, "wap_stat", "app_download", optString, 0, 0, optJSONObject);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static long m104900a(String str, String str2, Context context, boolean z, JSONObject jSONObject) {
        return m104897a(str, str2, context, true, null, null, null);
    }

    /* renamed from: a */
    private static long m104897a(String str, String str2, Context context, boolean z, String str3, List<C6809a> list, JSONObject jSONObject) {
        return m104898a(str, str2, context, z, null, null, true, jSONObject);
    }

    /* renamed from: a */
    public static long m104898a(String str, String str2, Context context, boolean z, String str3, List<C6809a> list, boolean z2, JSONObject jSONObject) {
        return m104899a(str, str2, context, z, str3, list, true, true, false, false, jSONObject);
    }

    /* renamed from: a */
    public static boolean m104902a(Context context, int i, String str, String str2, String str3, String str4, String str5, C6773c<String> cVar, C6775g gVar) throws Throwable {
        return m104903a(context, i, str, (String) null, str3, str4, str5, null, str5, (C6775g) null);
    }

    /* renamed from: a */
    private static boolean m104903a(Context context, int i, String str, String str2, String str3, String str4, String str5, C6773c<String> cVar, String str6, C6775g gVar) throws Throwable {
        return m104904a(context, i, str, ImageInfo.extractImageUrlList(str, str2), str3, str4, str5, cVar, str6, gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d6 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m104904a(android.content.Context r19, int r20, java.lang.String r21, java.util.List<com.p280ss.android.image.C19601j> r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, com.p280ss.android.common.util.C6773c<java.lang.String> r26, java.lang.String r27, com.p280ss.android.common.util.C6775g r28) throws java.lang.Throwable {
        /*
            if (r20 > 0) goto L_0x0007
            r0 = 20971520(0x1400000, float:3.526483E-38)
            r12 = 20971520(0x1400000, float:3.526483E-38)
            goto L_0x0009
        L_0x0007:
            r12 = r20
        L_0x0009:
            r13 = 0
            if (r22 == 0) goto L_0x00de
            boolean r1 = r22.isEmpty()
            if (r1 == 0) goto L_0x0014
            goto L_0x00de
        L_0x0014:
            if (r19 != 0) goto L_0x001c
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            r14 = r1
            goto L_0x001e
        L_0x001c:
            r14 = r19
        L_0x001e:
            java.util.Iterator r15 = r22.iterator()
            r0 = 0
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r1 = r15.next()
            com.ss.android.image.j r1 = (com.p280ss.android.image.C19601j) r1
            if (r1 == 0) goto L_0x00d7
            java.lang.String r2 = r1.f53035a
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r3 != 0) goto L_0x00d7
            int r11 = r0 + 1
            r0 = 3
            if (r11 <= r0) goto L_0x003f
            return r13
        L_0x003f:
            r10 = 1
            java.lang.String[] r0 = new java.lang.String[r10]
            int[] r9 = new int[r10]
            java.lang.System.currentTimeMillis()
            if (r14 == 0) goto L_0x005a
            boolean r3 = com.p280ss.android.ugc.aweme.legacy.download.C32336e.m104905a(r14)     // Catch:{ Throwable -> 0x0050 }
            if (r3 != 0) goto L_0x005a
            return r13
        L_0x0050:
            r0 = move-exception
            r2 = r23
            r3 = r25
            r18 = r11
            r16 = 1
            goto L_0x00b3
        L_0x005a:
            java.util.List<com.ss.android.http.legacy.a.e> r8 = r1.f53036b     // Catch:{ Throwable -> 0x0050 }
            r1 = r12
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r16 = r8
            r8 = r28
            r17 = r9
            r9 = r16
            r16 = 1
            r10 = r0
            r18 = r11
            r11 = r17
            boolean r0 = com.p280ss.android.common.util.NetworkUtils.downloadFile(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x00ae }
            java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00ae }
            if (r0 != 0) goto L_0x0080
            return r0
        L_0x0080:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00aa }
            r2 = r23
            r3 = r25
            r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x00a8 }
            boolean r4 = r1.isFile()     // Catch:{ Throwable -> 0x00a8 }
            if (r4 == 0) goto L_0x00aa
            long r4 = r1.length()     // Catch:{ Throwable -> 0x00a8 }
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x00aa
            r1 = r17[r13]     // Catch:{ Throwable -> 0x00a8 }
            if (r1 > 0) goto L_0x00aa
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x00aa
            int r1 = (int) r4     // Catch:{ Throwable -> 0x00a8 }
            r17[r13] = r1     // Catch:{ Throwable -> 0x00a8 }
            goto L_0x00aa
        L_0x00a8:
            r0 = move-exception
            goto L_0x00b3
        L_0x00aa:
            if (r14 != 0) goto L_0x00ad
            return r0
        L_0x00ad:
            return r0
        L_0x00ae:
            r0 = move-exception
            r2 = r23
            r3 = r25
        L_0x00b3:
            boolean r1 = r0 instanceof java.net.SocketException
            if (r1 != 0) goto L_0x00c6
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L_0x00c6
            boolean r1 = r0 instanceof java.net.SocketTimeoutException
            if (r1 != 0) goto L_0x00c6
            boolean r1 = r0 instanceof com.p280ss.android.http.legacy.client.HttpResponseException
            if (r1 == 0) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            r16 = 0
        L_0x00c6:
            if (r16 == 0) goto L_0x00d6
            if (r14 != 0) goto L_0x00cb
            return r13
        L_0x00cb:
            boolean r0 = com.p280ss.android.ugc.aweme.legacy.download.C32336e.m104905a(r14)
            if (r0 != 0) goto L_0x00d2
            return r13
        L_0x00d2:
            r0 = r18
            goto L_0x0023
        L_0x00d6:
            throw r0
        L_0x00d7:
            r2 = r23
            r3 = r25
            goto L_0x0023
        L_0x00dd:
            return r13
        L_0x00de:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.legacy.download.C32335d.m104904a(android.content.Context, int, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.ss.android.common.util.c, java.lang.String, com.ss.android.common.util.g):boolean");
    }

    /* renamed from: a */
    private static long m104899a(String str, String str2, Context context, boolean z, String str3, List<C6809a> list, boolean z2, boolean z3, boolean z4, boolean z5, JSONObject jSONObject) {
        Context context2 = context;
        if (C6319n.m19593a(str) || context2 == null) {
            return -1;
        }
        m104901a(context, jSONObject);
        long a = C32334c.m104896a(str, str2, z, context, str3, list, true, true, false);
        if (a >= 0) {
            return a;
        }
        return -1;
    }
}
