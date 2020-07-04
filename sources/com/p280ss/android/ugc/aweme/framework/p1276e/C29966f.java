package com.p280ss.android.ugc.aweme.framework.p1276e;

/* renamed from: com.ss.android.ugc.aweme.framework.e.f */
public final class C29966f {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r2 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        if (r2 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b0, code lost:
        if (r11 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c2, code lost:
        if (r11 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d A[SYNTHETIC, Splitter:B:27:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bd A[SYNTHETIC, Splitter:B:62:0x00bd] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m98250a(android.content.Context r11, android.net.Uri r12) {
        /*
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r12.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x00c7
            java.lang.String r2 = "file"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0018
            goto L_0x00c7
        L_0x0018:
            java.lang.String r2 = "http"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0025
            java.lang.String r11 = r12.toString()
            return r11
        L_0x0025:
            java.lang.String r2 = "content"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00c6
            r1 = 1
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r2 = "_data"
            r9 = 0
            r8[r9] = r2
            java.lang.String r10 = ""
            android.content.ContentResolver r2 = r11.getContentResolver()     // Catch:{ Exception -> 0x0061, all -> 0x0059 }
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r12
            r4 = r8
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0061, all -> 0x0059 }
            boolean r0 = r2.moveToFirst()     // Catch:{ Exception -> 0x0062, all -> 0x0057 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.getString(r9)     // Catch:{ Exception -> 0x0062, all -> 0x0057 }
            r10 = r0
        L_0x004f:
            if (r2 == 0) goto L_0x0054
            r2.close()     // Catch:{ Exception -> 0x0062, all -> 0x0057 }
        L_0x0054:
            if (r2 == 0) goto L_0x0067
            goto L_0x0064
        L_0x0057:
            r11 = move-exception
            goto L_0x005b
        L_0x0059:
            r11 = move-exception
            r2 = r0
        L_0x005b:
            if (r2 == 0) goto L_0x0060
            r2.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            throw r11
        L_0x0061:
            r2 = r0
        L_0x0062:
            if (r2 == 0) goto L_0x0067
        L_0x0064:
            r2.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            r0 = r2
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L_0x00c5
            android.content.ContentResolver r2 = r11.getContentResolver()     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            java.lang.String r5 = "_id= ?"
            java.lang.String r11 = r12.getLastPathSegment()     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            r3 = 19
            if (r12 < r3) goto L_0x0094
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            if (r12 != 0) goto L_0x0094
            java.lang.String r12 = ":"
            boolean r12 = r11.contains(r12)     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            if (r12 == 0) goto L_0x0094
            java.lang.String r12 = ":"
            java.lang.String[] r11 = r11.split(r12)     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            r11 = r11[r1]     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
        L_0x0094:
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            r6[r9] = r11     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            r7 = 0
            r4 = r8
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00c1, all -> 0x00ba }
            boolean r12 = r11.moveToFirst()     // Catch:{ Exception -> 0x00c2, all -> 0x00b6 }
            if (r12 == 0) goto L_0x00ab
            java.lang.String r12 = r11.getString(r9)     // Catch:{ Exception -> 0x00c2, all -> 0x00b6 }
            r10 = r12
        L_0x00ab:
            if (r11 == 0) goto L_0x00b0
            r11.close()     // Catch:{ Exception -> 0x00c2, all -> 0x00b6 }
        L_0x00b0:
            if (r11 == 0) goto L_0x00c5
        L_0x00b2:
            r11.close()     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00c5
        L_0x00b6:
            r12 = move-exception
            r0 = r11
            r11 = r12
            goto L_0x00bb
        L_0x00ba:
            r11 = move-exception
        L_0x00bb:
            if (r0 == 0) goto L_0x00c0
            r0.close()     // Catch:{ Exception -> 0x00c0 }
        L_0x00c0:
            throw r11
        L_0x00c1:
            r11 = r0
        L_0x00c2:
            if (r11 == 0) goto L_0x00c5
            goto L_0x00b2
        L_0x00c5:
            return r10
        L_0x00c6:
            return r0
        L_0x00c7:
            java.lang.String r11 = r12.getPath()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.framework.p1276e.C29966f.m98250a(android.content.Context, android.net.Uri):java.lang.String");
    }
}
