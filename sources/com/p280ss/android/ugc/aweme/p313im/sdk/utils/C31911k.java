package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.k */
public final class C31911k {
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0046 A[SYNTHETIC, Splitter:B:34:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x004d A[SYNTHETIC, Splitter:B:38:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0054 A[SYNTHETIC, Splitter:B:45:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x005b A[SYNTHETIC, Splitter:B:49:0x005b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m103664a(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0051, all -> 0x0042 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0051, all -> 0x0042 }
            boolean r3 = r1.exists()     // Catch:{ Exception -> 0x0051, all -> 0x0042 }
            if (r3 == 0) goto L_0x0034
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0051, all -> 0x0042 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0051, all -> 0x0042 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0032, all -> 0x0030 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0032, all -> 0x0030 }
            r4 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x002e, all -> 0x002b }
        L_0x001a:
            int r0 = r3.read(r4)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r2 = -1
            if (r0 == r2) goto L_0x0026
            r2 = 0
            r1.write(r4, r2, r0)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            goto L_0x001a
        L_0x0026:
            r1.flush()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r0 = r1
            goto L_0x0035
        L_0x002b:
            r4 = move-exception
            r0 = r1
            goto L_0x0044
        L_0x002e:
            r0 = r1
            goto L_0x0052
        L_0x0030:
            r4 = move-exception
            goto L_0x0044
        L_0x0032:
            goto L_0x0052
        L_0x0034:
            r3 = r0
        L_0x0035:
            if (r3 == 0) goto L_0x003c
            r3.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x003c
        L_0x003b:
        L_0x003c:
            if (r0 == 0) goto L_0x005f
            r0.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            return
        L_0x0042:
            r4 = move-exception
            r3 = r0
        L_0x0044:
            if (r3 == 0) goto L_0x004b
            r3.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004b
        L_0x004a:
        L_0x004b:
            if (r0 == 0) goto L_0x0050
            r0.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r4
        L_0x0051:
            r3 = r0
        L_0x0052:
            if (r3 == 0) goto L_0x0059
            r3.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x0059
        L_0x0058:
        L_0x0059:
            if (r0 == 0) goto L_0x005f
            r0.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            return
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31911k.m103664a(java.lang.String, java.lang.String):void");
    }
}
