package com.p280ss.android.ugc.aweme.legacy.download;

/* renamed from: com.ss.android.ugc.aweme.legacy.download.c */
final class C32334c {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099 A[Catch:{ Throwable -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d0 A[Catch:{ Throwable -> 0x00dd }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d1 A[Catch:{ Throwable -> 0x00dd }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m104896a(java.lang.String r13, java.lang.String r14, boolean r15, android.content.Context r16, java.lang.String r17, java.util.List<com.p280ss.android.http.legacy.C6809a> r18, boolean r19, boolean r20, boolean r21) {
        /*
            r1 = r16
            r2 = -1
            if (r1 != 0) goto L_0x0007
            return r2
        L_0x0007:
            com.ss.android.socialbase.appdownloader.AppDownloader r4 = com.p280ss.android.socialbase.appdownloader.AppDownloader.getInstance()     // Catch:{ Exception -> 0x00de }
            if (r4 != 0) goto L_0x000e
            return r2
        L_0x000e:
            android.net.Uri r5 = android.net.Uri.parse(r13)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r5 = r5.getLastPathSegment()     // Catch:{ Throwable -> 0x00dd }
            boolean r6 = com.bytedance.common.utility.C6319n.m19593a(r5)     // Catch:{ Throwable -> 0x00dd }
            if (r6 == 0) goto L_0x002a
            boolean r5 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Throwable -> 0x00dd }
            if (r5 != 0) goto L_0x0024
            r5 = r14
            goto L_0x002a
        L_0x0024:
            if (r15 == 0) goto L_0x0029
            java.lang.String r5 = "default.apk"
            goto L_0x002a
        L_0x0029:
            return r2
        L_0x002a:
            boolean r6 = com.bytedance.common.utility.C6319n.m19593a(r14)     // Catch:{ Throwable -> 0x00dd }
            if (r6 == 0) goto L_0x0032
            r6 = r5
            goto L_0x0033
        L_0x0032:
            r6 = r14
        L_0x0033:
            com.ss.android.socialbase.appdownloader.AppTaskBuilder r7 = new com.ss.android.socialbase.appdownloader.AppTaskBuilder     // Catch:{ Throwable -> 0x00dd }
            r8 = r13
            r7.<init>(r1, r13)     // Catch:{ Throwable -> 0x00dd }
            if (r18 == 0) goto L_0x0068
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00dd }
            int r10 = r18.size()     // Catch:{ Throwable -> 0x00dd }
            r9.<init>(r10)     // Catch:{ Throwable -> 0x00dd }
            java.util.Iterator r8 = r18.iterator()     // Catch:{ Throwable -> 0x00dd }
        L_0x0048:
            boolean r10 = r8.hasNext()     // Catch:{ Throwable -> 0x00dd }
            if (r10 == 0) goto L_0x0065
            java.lang.Object r10 = r8.next()     // Catch:{ Throwable -> 0x00dd }
            com.ss.android.http.legacy.a r10 = (com.p280ss.android.http.legacy.C6809a) r10     // Catch:{ Throwable -> 0x00dd }
            com.ss.android.socialbase.downloader.model.HttpHeader r11 = new com.ss.android.socialbase.downloader.model.HttpHeader     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r12 = r10.mo16635a()     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r10 = r10.mo16636b()     // Catch:{ Throwable -> 0x00dd }
            r11.<init>(r12, r10)     // Catch:{ Throwable -> 0x00dd }
            r9.add(r11)     // Catch:{ Throwable -> 0x00dd }
            goto L_0x0048
        L_0x0065:
            r7.headers(r9)     // Catch:{ Throwable -> 0x00dd }
        L_0x0068:
            if (r15 == 0) goto L_0x0083
            java.lang.String r8 = ".apk"
            boolean r8 = r5.endsWith(r8)     // Catch:{ Throwable -> 0x00dd }
            if (r8 != 0) goto L_0x0083
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00dd }
            r8.<init>()     // Catch:{ Throwable -> 0x00dd }
            r8.append(r5)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r5 = ".apk"
            r8.append(r5)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r5 = r8.toString()     // Catch:{ Throwable -> 0x00dd }
        L_0x0083:
            if (r15 != 0) goto L_0x0091
            java.lang.String r0 = ".apk"
            boolean r0 = r5.endsWith(r0)     // Catch:{ Throwable -> 0x00dd }
            if (r0 == 0) goto L_0x008e
            goto L_0x0091
        L_0x008e:
            r0 = r17
            goto L_0x0093
        L_0x0091:
            java.lang.String r0 = "application/vnd.android.package-archive"
        L_0x0093:
            boolean r5 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x00dd }
            if (r5 != 0) goto L_0x009c
            r7.mimeType(r0)     // Catch:{ Throwable -> 0x00dd }
        L_0x009c:
            r7.name(r6)     // Catch:{ Throwable -> 0x00dd }
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ Throwable -> 0x00dd }
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)     // Catch:{ Throwable -> 0x00dd }
            if (r0 == 0) goto L_0x00b4
            boolean r5 = r0.exists()     // Catch:{ Throwable -> 0x00dd }
            if (r5 != 0) goto L_0x00b4
            boolean r5 = r0.mkdirs()     // Catch:{ Throwable -> 0x00dd }
            if (r5 != 0) goto L_0x00b4
            return r2
        L_0x00b4:
            java.lang.String r0 = r0.getPath()     // Catch:{ Throwable -> 0x00dd }
            r7.savePath(r0)     // Catch:{ Throwable -> 0x00dd }
            r0 = r20
            r7.showNotification(r0)     // Catch:{ Throwable -> 0x00dd }
            r0 = r21
            r7.needWifi(r0)     // Catch:{ Throwable -> 0x00dd }
            int r0 = r4.addDownloadTask(r7)     // Catch:{ Throwable -> 0x00dd }
            long r4 = (long) r0     // Catch:{ Throwable -> 0x00dd }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00d1
            return r2
        L_0x00d1:
            if (r19 == 0) goto L_0x00dc
            r0 = 2131231690(0x7f0803ca, float:1.8079468E38)
            r6 = 2131827392(0x7f111ac0, float:1.9287695E38)
            com.bytedance.common.utility.C9738o.m28694a(r1, r0, r6)     // Catch:{ Throwable -> 0x00dd }
        L_0x00dc:
            return r4
        L_0x00dd:
            return r2
        L_0x00de:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.legacy.download.C32334c.m104896a(java.lang.String, java.lang.String, boolean, android.content.Context, java.lang.String, java.util.List, boolean, boolean, boolean):long");
    }
}
