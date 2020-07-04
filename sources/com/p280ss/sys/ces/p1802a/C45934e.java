package com.p280ss.sys.ces.p1802a;

import java.io.BufferedInputStream;

/* renamed from: com.ss.sys.ces.a.e */
public final class C45934e {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ab, code lost:
        if (r8.length() == 0) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        return r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m144063a(android.content.Context r8) {
        /*
            java.lang.Class<com.ss.sys.ces.a.e> r0 = com.p280ss.sys.ces.p1802a.C45934e.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00a3 }
            r1.<init>()     // Catch:{ Throwable -> 0x00a3 }
            java.io.File r2 = r8.getFilesDir()     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Throwable -> 0x00a3 }
            r1.append(r2)     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r2 = "/cid"
            r1.append(r2)     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x00a3 }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x00a3 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x00a3 }
            boolean r2 = r2.exists()     // Catch:{ Throwable -> 0x00a3 }
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = m144065a(r1)     // Catch:{ Throwable -> 0x00a3 }
            if (r2 == 0) goto L_0x0035
            int r3 = r2.length()     // Catch:{ Throwable -> 0x00a3 }
            if (r3 <= 0) goto L_0x0035
            monitor-exit(r0)
            return r2
        L_0x0035:
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ Throwable -> 0x00a3 }
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r2 = "cid"
            java.io.InputStream r8 = r8.open(r2)     // Catch:{ Throwable -> 0x00a3 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x00a3 }
            r2.<init>()     // Catch:{ Throwable -> 0x00a3 }
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r3]     // Catch:{ Throwable -> 0x00a3 }
        L_0x004c:
            r5 = 0
            int r6 = r8.read(r4, r5, r3)     // Catch:{ Throwable -> 0x00a3 }
            r7 = -1
            if (r6 == r7) goto L_0x0058
            r2.write(r4, r5, r6)     // Catch:{ Throwable -> 0x00a3 }
            goto L_0x004c
        L_0x0058:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x00a3 }
            r8.<init>(r1)     // Catch:{ Throwable -> 0x00a3 }
            byte[] r2 = r2.toByteArray()     // Catch:{ Throwable -> 0x00a3 }
            r8.write(r2)     // Catch:{ Throwable -> 0x00a3 }
            r8.close()     // Catch:{ Throwable -> 0x00a3 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r2 = "chmod 777 "
            r8.<init>(r2)     // Catch:{ Throwable -> 0x00a3 }
            r8.append(r1)     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x00a3 }
            m144065a(r8)     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r8 = m144065a(r1)     // Catch:{ Throwable -> 0x00a3 }
            if (r8 == 0) goto L_0x0084
            int r2 = r8.length()     // Catch:{ Throwable -> 0x00a3 }
            if (r2 != 0) goto L_0x00a5
        L_0x0084:
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r2 = "rw"
            r8.<init>(r1, r2)     // Catch:{ Throwable -> 0x00a3 }
            r2 = 1
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x00a3 }
            r3 = 2
            r2[r5] = r3     // Catch:{ Throwable -> 0x00a3 }
            r3 = 16
            r8.seek(r3)     // Catch:{ Throwable -> 0x00a3 }
            r8.write(r2)     // Catch:{ Throwable -> 0x00a3 }
            r8.close()     // Catch:{ Throwable -> 0x00a3 }
            java.lang.String r8 = m144065a(r1)     // Catch:{ Throwable -> 0x00a3 }
            goto L_0x00a5
        L_0x00a1:
            r8 = move-exception
            goto L_0x00b1
        L_0x00a3:
            java.lang.String r8 = "0[<!>]EXCEPTION[<!>]"
        L_0x00a5:
            if (r8 == 0) goto L_0x00ad
            int r1 = r8.length()     // Catch:{ all -> 0x00a1 }
            if (r1 != 0) goto L_0x00af
        L_0x00ad:
            java.lang.String r8 = "0[<!>]ERROR[<!>]"
        L_0x00af:
            monitor-exit(r0)
            return r8
        L_0x00b1:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.ces.p1802a.C45934e.m144063a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    private static String m144064a(BufferedInputStream bufferedInputStream) {
        int read;
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                    continue;
                }
            } catch (Exception unused) {
            }
        } while (read >= 4096);
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r1 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r1.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x007f, code lost:
        if (r1 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0082, code lost:
        return r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005c A[SYNTHETIC, Splitter:B:35:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0063 A[SYNTHETIC, Splitter:B:39:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0073 A[SYNTHETIC, Splitter:B:48:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x007a A[SYNTHETIC, Splitter:B:52:0x007a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m144065a(java.lang.String r5) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x006e, all -> 0x0057 }
            java.lang.String r2 = "sh"
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ Exception -> 0x006e, all -> 0x0057 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.io.OutputStream r3 = r1.getOutputStream()     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0054, all -> 0x0051 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            java.io.InputStream r4 = r1.getInputStream()     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            r3.<init>(r4)     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            byte[] r5 = r5.getBytes()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r2.write(r5)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r5 = 10
            r2.write(r5)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r2.flush()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r2.close()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            r1.waitFor()     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            java.lang.String r5 = m144064a(r3)     // Catch:{ Exception -> 0x004a, all -> 0x0047 }
            if (r5 == 0) goto L_0x003b
            r5.length()     // Catch:{ Exception -> 0x004b, all -> 0x0047 }
        L_0x003b:
            r2.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r3.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            if (r1 == 0) goto L_0x0082
        L_0x0043:
            r1.destroy()
            goto L_0x0082
        L_0x0047:
            r5 = move-exception
            r0 = r3
            goto L_0x005a
        L_0x004a:
            r5 = r0
        L_0x004b:
            r0 = r3
            goto L_0x0071
        L_0x004d:
            r5 = move-exception
            goto L_0x005a
        L_0x004f:
            r5 = r0
            goto L_0x0071
        L_0x0051:
            r5 = move-exception
            r2 = r0
            goto L_0x005a
        L_0x0054:
            r5 = r0
            r2 = r5
            goto L_0x0071
        L_0x0057:
            r5 = move-exception
            r1 = r0
            r2 = r1
        L_0x005a:
            if (r2 == 0) goto L_0x0061
            r2.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0061
        L_0x0060:
        L_0x0061:
            if (r0 == 0) goto L_0x0068
            r0.close()     // Catch:{ IOException -> 0x0067 }
            goto L_0x0068
        L_0x0067:
        L_0x0068:
            if (r1 == 0) goto L_0x006d
            r1.destroy()
        L_0x006d:
            throw r5
        L_0x006e:
            r5 = r0
            r1 = r5
            r2 = r1
        L_0x0071:
            if (r2 == 0) goto L_0x0078
            r2.close()     // Catch:{ IOException -> 0x0077 }
            goto L_0x0078
        L_0x0077:
        L_0x0078:
            if (r0 == 0) goto L_0x007f
            r0.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x007f
        L_0x007e:
        L_0x007f:
            if (r1 == 0) goto L_0x0082
            goto L_0x0043
        L_0x0082:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.ces.p1802a.C45934e.m144065a(java.lang.String):java.lang.String");
    }
}
