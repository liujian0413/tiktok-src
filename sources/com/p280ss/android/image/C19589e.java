package com.p280ss.android.image;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.common.util.C6773c;
import com.p280ss.android.common.util.C6775g;
import com.p280ss.android.common.util.NetworkUtils;
import java.util.List;
import org.apache.http.client.RedirectHandler;

/* renamed from: com.ss.android.image.e */
public final class C19589e {
    /* renamed from: a */
    public static boolean m64525a(Context context, int i, String str, String str2, String str3, String str4, String str5, C6773c<String> cVar, C6775g gVar) throws Throwable {
        return m64526a(context, i, str, str2, str3, str4, str5, cVar, str5, gVar);
    }

    /* renamed from: a */
    public static boolean m64526a(Context context, int i, String str, String str2, String str3, String str4, String str5, C6773c<String> cVar, String str6, C6775g gVar) throws Throwable {
        return m64528a(context, i, str, ImageInfo.extractImageUrlList(str, str2), str3, str4, str5, cVar, str6, gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00c3 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m64528a(android.content.Context r18, int r19, java.lang.String r20, java.util.List<com.p280ss.android.image.C19601j> r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, com.p280ss.android.common.util.C6773c<java.lang.String> r25, java.lang.String r26, com.p280ss.android.common.util.C6775g r27) throws java.lang.Throwable {
        /*
            if (r19 > 0) goto L_0x0007
            r0 = 20971520(0x1400000, float:3.526483E-38)
            r12 = 20971520(0x1400000, float:3.526483E-38)
            goto L_0x0009
        L_0x0007:
            r12 = r19
        L_0x0009:
            r13 = 0
            if (r21 == 0) goto L_0x00cb
            boolean r1 = r21.isEmpty()
            if (r1 == 0) goto L_0x0014
            goto L_0x00cb
        L_0x0014:
            java.util.Iterator r14 = r21.iterator()
            r0 = 0
        L_0x0019:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00ca
            java.lang.Object r1 = r14.next()
            com.ss.android.image.j r1 = (com.p280ss.android.image.C19601j) r1
            if (r1 == 0) goto L_0x00c4
            java.lang.String r2 = r1.f53035a
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r3 != 0) goto L_0x00c4
            int r11 = r0 + 1
            r0 = 3
            if (r11 <= r0) goto L_0x0035
            return r13
        L_0x0035:
            r10 = 1
            java.lang.String[] r0 = new java.lang.String[r10]
            int[] r9 = new int[r10]
            if (r18 == 0) goto L_0x004c
            boolean r3 = com.p280ss.android.image.C19590f.m64530a(r18)     // Catch:{ Throwable -> 0x0043 }
            if (r3 != 0) goto L_0x004c
            return r13
        L_0x0043:
            r0 = move-exception
            r2 = r22
            r3 = r24
            r17 = r11
            r15 = 1
            goto L_0x00a1
        L_0x004c:
            java.util.List<com.ss.android.http.legacy.a.e> r8 = r1.f53036b     // Catch:{ Throwable -> 0x0043 }
            r1 = r12
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r15 = r8
            r8 = r27
            r16 = r9
            r9 = r15
            r15 = 1
            r10 = r0
            r17 = r11
            r11 = r16
            boolean r0 = com.p280ss.android.common.util.NetworkUtils.downloadFile(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x009c }
            if (r0 != 0) goto L_0x006c
            return r0
        L_0x006c:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x009b }
            r2 = r22
            r3 = r24
            r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x0099 }
            boolean r4 = r1.isFile()     // Catch:{ Throwable -> 0x0099 }
            if (r4 == 0) goto L_0x009b
            long r4 = r1.length()     // Catch:{ Throwable -> 0x0099 }
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x009b
            java.util.concurrent.atomic.AtomicLong r1 = com.p280ss.android.image.C19598i.f53021c     // Catch:{ Throwable -> 0x0099 }
            r1.addAndGet(r4)     // Catch:{ Throwable -> 0x0099 }
            r1 = r16[r13]     // Catch:{ Throwable -> 0x0099 }
            if (r1 > 0) goto L_0x009b
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x009b
            int r1 = (int) r4     // Catch:{ Throwable -> 0x0099 }
            r16[r13] = r1     // Catch:{ Throwable -> 0x0099 }
            goto L_0x009b
        L_0x0099:
            r0 = move-exception
            goto L_0x00a1
        L_0x009b:
            return r0
        L_0x009c:
            r0 = move-exception
            r2 = r22
            r3 = r24
        L_0x00a1:
            boolean r1 = r0 instanceof java.net.SocketException
            if (r1 != 0) goto L_0x00b3
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L_0x00b3
            boolean r1 = r0 instanceof java.net.SocketTimeoutException
            if (r1 != 0) goto L_0x00b3
            boolean r1 = r0 instanceof com.p280ss.android.http.legacy.client.HttpResponseException
            if (r1 == 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r15 = 0
        L_0x00b3:
            if (r15 == 0) goto L_0x00c3
            if (r18 != 0) goto L_0x00b8
            return r13
        L_0x00b8:
            boolean r0 = com.p280ss.android.image.C19590f.m64530a(r18)
            if (r0 != 0) goto L_0x00bf
            return r13
        L_0x00bf:
            r0 = r17
            goto L_0x0019
        L_0x00c3:
            throw r0
        L_0x00c4:
            r2 = r22
            r3 = r24
            goto L_0x0019
        L_0x00ca:
            return r13
        L_0x00cb:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.image.C19589e.m64528a(android.content.Context, int, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.ss.android.common.util.c, java.lang.String, com.ss.android.common.util.g):boolean");
    }

    /* renamed from: a */
    public static boolean m64527a(Context context, int i, String str, String str2, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, C6773c<String> cVar, String str3, C6775g gVar, RedirectHandler redirectHandler) throws Throwable {
        return m64529a(context, -1, str, ImageInfo.extractImageUrlList(str, str2), stringBuffer, stringBuffer2, stringBuffer3, cVar, str3, gVar, redirectHandler);
    }

    /* renamed from: a */
    private static boolean m64529a(Context context, int i, String str, List<C19601j> list, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, C6773c<String> cVar, String str2, C6775g gVar, RedirectHandler redirectHandler) throws Throwable {
        int i2;
        if (i <= 0) {
            i2 = 20971520;
        } else {
            i2 = i;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        int i3 = 0;
        for (C19601j jVar : list) {
            if (jVar != null) {
                String str3 = jVar.f53035a;
                if (!C6319n.m19593a(str3)) {
                    int i4 = i3 + 1;
                    if (i4 > 3) {
                        return false;
                    }
                    String[] strArr = new String[1];
                    int[] iArr = new int[1];
                    if (context != null) {
                        try {
                            if (!C19590f.m64530a(context)) {
                                return false;
                            }
                        } catch (Throwable unused) {
                            i3 = i4;
                        }
                    }
                    return NetworkUtils.downloadVideo(i2, str3, stringBuffer, stringBuffer2, stringBuffer3, cVar, str2, gVar, jVar.f53036b, strArr, iArr, redirectHandler);
                }
                continue;
            }
        }
        return false;
    }
}
