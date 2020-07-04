package com.p280ss.android.ugc.aweme.emoji.utils;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.m */
public final class C27646m {
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:71|72|(2:74|75)|76|77) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:17|(1:19)|20|(10:21|22|23|24|25|26|27|(2:28|(1:30)(1:31))|32|(1:94))|35|36|95) */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00de, code lost:
        r9 = th;
        r2 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00ca */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x00e9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0 A[SYNTHETIC, Splitter:B:46:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c7 A[SYNTHETIC, Splitter:B:50:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cf A[SYNTHETIC, Splitter:B:57:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00de A[ExcHandler: all (th java.lang.Throwable), Splitter:B:35:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e6 A[SYNTHETIC, Splitter:B:74:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x001b A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m90636a(java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.emoji.utils.m> r0 = com.p280ss.android.ugc.aweme.emoji.utils.C27646m.class
            monitor-enter(r0)
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00f5 }
            r1.<init>(r10)     // Catch:{ all -> 0x00f5 }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x00f5 }
            if (r2 != 0) goto L_0x0011
            r1.mkdirs()     // Catch:{ all -> 0x00f5 }
        L_0x0011:
            r1 = 0
            com.ss.android.ugc.aweme.emoji.utils.zip.t r2 = new com.ss.android.ugc.aweme.emoji.utils.zip.t     // Catch:{ IOException -> 0x00ea, all -> 0x00e2 }
            r2.<init>(r9)     // Catch:{ IOException -> 0x00ea, all -> 0x00e2 }
            java.util.Enumeration r9 = r2.mo71090a()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
        L_0x001b:
            boolean r3 = r9.hasMoreElements()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            if (r3 == 0) goto L_0x00d7
            java.lang.Object r3 = r9.nextElement()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            com.ss.android.ugc.aweme.emoji.utils.zip.r r3 = (com.p280ss.android.ugc.aweme.emoji.utils.zip.C27667r) r3     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            boolean r4 = r3.isDirectory()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r5 = 0
            if (r4 == 0) goto L_0x0059
            java.lang.String r3 = r3.getName()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            int r4 = r3.length()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            int r4 = r4 + -1
            java.lang.String r3 = r3.substring(r5, r4)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.io.File r4 = new java.io.File     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r5.<init>()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r5.append(r10)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.lang.String r6 = java.io.File.separator     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r5.append(r6)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r5.append(r3)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.lang.String r3 = r5.toString()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r4.<init>(r3)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r4.mkdir()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            goto L_0x001b
        L_0x0059:
            java.lang.String r4 = r3.getName()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r6 = 92
            r7 = 47
            java.lang.String r4 = r4.replace(r6, r7)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r7.<init>()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r7.append(r10)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.lang.String r8 = java.io.File.separator     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r7.append(r8)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r7.append(r4)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.lang.String r4 = r7.toString()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r6.<init>(r4)     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.io.File r4 = r6.getParentFile()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            r4.mkdirs()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            boolean r4 = r6.exists()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            if (r4 == 0) goto L_0x008e
            r6.delete()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
        L_0x008e:
            r6.createNewFile()     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
            java.io.InputStream r3 = r2.mo71089a(r3)     // Catch:{ IOException -> 0x00cb, all -> 0x00bc }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ba, all -> 0x00b8 }
            r4.<init>(r6)     // Catch:{ IOException -> 0x00ba, all -> 0x00b8 }
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x00b6, all -> 0x00b3 }
        L_0x009e:
            int r7 = r3.read(r6)     // Catch:{ IOException -> 0x00b6, all -> 0x00b3 }
            r8 = -1
            if (r7 == r8) goto L_0x00a9
            r4.write(r6, r5, r7)     // Catch:{ IOException -> 0x00b6, all -> 0x00b3 }
            goto L_0x009e
        L_0x00a9:
            r4.close()     // Catch:{ IOException -> 0x00ac, all -> 0x00de }
        L_0x00ac:
            if (r3 == 0) goto L_0x001b
        L_0x00ae:
            r3.close()     // Catch:{ IOException -> 0x001b, all -> 0x00de }
            goto L_0x001b
        L_0x00b3:
            r9 = move-exception
            r1 = r4
            goto L_0x00be
        L_0x00b6:
            goto L_0x00cd
        L_0x00b8:
            r9 = move-exception
            goto L_0x00be
        L_0x00ba:
            r4 = r1
            goto L_0x00cd
        L_0x00bc:
            r9 = move-exception
            r3 = r1
        L_0x00be:
            if (r1 == 0) goto L_0x00c5
            r1.close()     // Catch:{ IOException -> 0x00c4, all -> 0x00de }
            goto L_0x00c5
        L_0x00c4:
        L_0x00c5:
            if (r3 == 0) goto L_0x00ca
            r3.close()     // Catch:{ IOException -> 0x00ca, all -> 0x00de }
        L_0x00ca:
            throw r9     // Catch:{ IOException -> 0x00e0, all -> 0x00de }
        L_0x00cb:
            r3 = r1
            r4 = r3
        L_0x00cd:
            if (r4 == 0) goto L_0x00d4
            r4.close()     // Catch:{ IOException -> 0x00d3, all -> 0x00de }
            goto L_0x00d4
        L_0x00d3:
        L_0x00d4:
            if (r3 == 0) goto L_0x001b
            goto L_0x00ae
        L_0x00d7:
            r2.close()     // Catch:{ IOException -> 0x00dc }
            monitor-exit(r0)
            return
        L_0x00dc:
            monitor-exit(r0)
            return
        L_0x00de:
            r9 = move-exception
            goto L_0x00e4
        L_0x00e0:
            r1 = r2
            goto L_0x00ea
        L_0x00e2:
            r9 = move-exception
            r2 = r1
        L_0x00e4:
            if (r2 == 0) goto L_0x00e9
            r2.close()     // Catch:{ IOException -> 0x00e9 }
        L_0x00e9:
            throw r9     // Catch:{ all -> 0x00f5 }
        L_0x00ea:
            if (r1 == 0) goto L_0x00f3
            r1.close()     // Catch:{ IOException -> 0x00f1 }
            monitor-exit(r0)
            return
        L_0x00f1:
            monitor-exit(r0)
            return
        L_0x00f3:
            monitor-exit(r0)
            return
        L_0x00f5:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.utils.C27646m.m90636a(java.lang.String, java.lang.String):void");
    }
}
