package com.p280ss.sys.p1799a.p1801b;

import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.sys.a.b.a */
public final class C45926a {
    /* renamed from: a */
    public static String m144038a(String str, Map map, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                try {
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append(URLEncoder.encode((String) entry.getValue(), "utf-8"));
                    sb.append("&");
                } catch (Throwable unused) {
                }
            }
        }
        if (!map.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
        }
        URL url = null;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("?");
            sb2.append(sb.toString());
            url = new URL(sb2.toString());
        } catch (Throwable unused2) {
        }
        return m144039a(url, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0090, code lost:
        if (r2 == null) goto L_0x0093;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x006c */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d A[SYNTHETIC, Splitter:B:29:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084 A[SYNTHETIC, Splitter:B:33:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[SYNTHETIC, Splitter:B:40:0x008b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m144039a(java.net.URL r8, byte[] r9) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            r2.<init>()     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            com.bytedance.retrofit2.p r3 = com.bytedance.ttnet.utils.RetrofitUtils.m37904b(r8)     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            java.lang.Class<com.ss.sys.a.b.b> r4 = com.p280ss.sys.p1799a.p1801b.C45927b.class
            java.lang.Object r3 = r3.mo30492a(r4)     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            com.ss.sys.a.b.b r3 = (com.p280ss.sys.p1799a.p1801b.C45927b) r3     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            com.bytedance.retrofit2.mime.TypedByteArray r4 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            java.lang.String r5 = "application/octet-stream"
            r6 = 0
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            r4.<init>(r5, r9, r7)     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            com.bytedance.retrofit2.b r8 = r3.mo111212a(r8, r2, r4)     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            com.bytedance.retrofit2.t r8 = r8.execute()     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            int r9 = r8.mo30510a()     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            r2.<init>()     // Catch:{ Throwable -> 0x0088, all -> 0x0079 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r3]     // Catch:{ Throwable -> 0x0077, all -> 0x0075 }
            T r8 = r8.f33302b     // Catch:{ Throwable -> 0x0077, all -> 0x0075 }
            com.bytedance.retrofit2.mime.TypedInput r8 = (com.bytedance.retrofit2.mime.TypedInput) r8     // Catch:{ Throwable -> 0x0077, all -> 0x0075 }
            java.io.InputStream r8 = r8.mo10444in()     // Catch:{ Throwable -> 0x0077, all -> 0x0075 }
        L_0x003f:
            int r1 = r8.read(r4, r6, r3)     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            if (r1 <= 0) goto L_0x0049
            r2.write(r4, r6, r1)     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            goto L_0x003f
        L_0x0049:
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 == r1) goto L_0x005d
            java.lang.String r1 = "{\"code\":%d}"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            r3[r6] = r9     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            java.lang.String r9 = com.C1642a.m8034a(r1, r3)     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            goto L_0x0066
        L_0x005d:
            java.lang.String r9 = new java.lang.String     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            byte[] r1 = r2.toByteArray()     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
            r9.<init>(r1)     // Catch:{ Throwable -> 0x0073, all -> 0x0070 }
        L_0x0066:
            r0 = r9
            if (r8 == 0) goto L_0x006c
            r8.close()     // Catch:{ Throwable -> 0x006c }
        L_0x006c:
            r2.close()     // Catch:{ Throwable -> 0x0093 }
            goto L_0x0093
        L_0x0070:
            r9 = move-exception
            r1 = r8
            goto L_0x007b
        L_0x0073:
            r1 = r8
            goto L_0x0089
        L_0x0075:
            r9 = move-exception
            goto L_0x007b
        L_0x0077:
            goto L_0x0089
        L_0x0079:
            r9 = move-exception
            r2 = r1
        L_0x007b:
            if (r1 == 0) goto L_0x0082
            r1.close()     // Catch:{ Throwable -> 0x0081 }
            goto L_0x0082
        L_0x0081:
        L_0x0082:
            if (r2 == 0) goto L_0x0087
            r2.close()     // Catch:{ Throwable -> 0x0087 }
        L_0x0087:
            throw r9
        L_0x0088:
            r2 = r1
        L_0x0089:
            if (r1 == 0) goto L_0x0090
            r1.close()     // Catch:{ Throwable -> 0x008f }
            goto L_0x0090
        L_0x008f:
        L_0x0090:
            if (r2 == 0) goto L_0x0093
            goto L_0x006c
        L_0x0093:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.p1799a.p1801b.C45926a.m144039a(java.net.URL, byte[]):java.lang.String");
    }
}
