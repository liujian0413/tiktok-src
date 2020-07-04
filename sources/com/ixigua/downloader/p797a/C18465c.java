package com.ixigua.downloader.p797a;

import android.text.TextUtils;
import com.ixigua.downloader.pojo.BlockInfo;

/* renamed from: com.ixigua.downloader.a.c */
public final class C18465c {
    /* renamed from: b */
    private static int m60821b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:
        if (r4 == null) goto L_0x0056;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0017] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[SYNTHETIC, Splitter:B:26:0x004d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ixigua.downloader.pojo.BlockInfo m60819a(java.lang.String r4) {
        /*
            boolean r0 = com.ixigua.downloader.p797a.C18464b.m60809b(r4)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0051, all -> 0x0049 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Throwable -> 0x0051, all -> 0x0049 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0051, all -> 0x0049 }
            r4.<init>(r2)     // Catch:{ Throwable -> 0x0051, all -> 0x0049 }
            com.ixigua.downloader.pojo.MetaData r0 = new com.ixigua.downloader.pojo.MetaData     // Catch:{ Throwable -> 0x0047, all -> 0x0045 }
            r0.<init>()     // Catch:{ Throwable -> 0x0047, all -> 0x0045 }
            java.lang.String r2 = r4.readLine()     // Catch:{ Throwable -> 0x0043, all -> 0x0045 }
            if (r2 == 0) goto L_0x0029
            int r2 = m60821b(r2)     // Catch:{ Throwable -> 0x0043, all -> 0x0045 }
            r0.setVersionCode(r2)     // Catch:{ Throwable -> 0x0043, all -> 0x0045 }
        L_0x0029:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0043, all -> 0x0045 }
            r2.<init>()     // Catch:{ Throwable -> 0x0043, all -> 0x0045 }
        L_0x002e:
            java.lang.String r3 = r4.readLine()     // Catch:{ Throwable -> 0x0043, all -> 0x0045 }
            if (r3 == 0) goto L_0x0038
            r2.append(r3)     // Catch:{ Throwable -> 0x0043, all -> 0x0045 }
            goto L_0x002e
        L_0x0038:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0043, all -> 0x0045 }
            r0.setData(r2)     // Catch:{ Throwable -> 0x0043, all -> 0x0045 }
        L_0x003f:
            r4.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0056
        L_0x0043:
            goto L_0x0053
        L_0x0045:
            r0 = move-exception
            goto L_0x004b
        L_0x0047:
            r0 = r1
            goto L_0x0053
        L_0x0049:
            r0 = move-exception
            r4 = r1
        L_0x004b:
            if (r4 == 0) goto L_0x0050
            r4.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r0
        L_0x0051:
            r4 = r1
            r0 = r4
        L_0x0053:
            if (r4 == 0) goto L_0x0056
            goto L_0x003f
        L_0x0056:
            if (r0 == 0) goto L_0x005d
            com.ixigua.downloader.pojo.BlockInfo r4 = r0.parseData()
            return r4
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ixigua.downloader.p797a.C18465c.m60819a(java.lang.String):com.ixigua.downloader.pojo.BlockInfo");
    }

    /* renamed from: a */
    public static void m60820a(String str, BlockInfo blockInfo) {
        if (blockInfo != null && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("1");
            sb.append("\r\n");
            sb.append(blockInfo.getString());
            C18464b.m60804a(str, sb.toString(), false);
        }
    }
}
