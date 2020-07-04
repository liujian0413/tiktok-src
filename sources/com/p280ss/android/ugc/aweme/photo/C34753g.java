package com.p280ss.android.ugc.aweme.photo;

/* renamed from: com.ss.android.ugc.aweme.photo.g */
public final class C34753g {

    /* renamed from: a */
    private static final String[] f90590a = {"_id", "_data", "date_added", "width", "height", "mime_type", "latitude", "longitude", "date_modified"};

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if ("image/*".equals(r10) != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if ("image/png".equals(r10) == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00de, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0020] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel> m112121a(android.content.Context r18) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = 128(0x80, float:1.794E-43)
            r1.<init>(r0)
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r7 = "date_added DESC"
            r8 = 0
            android.content.ContentResolver r2 = r18.getContentResolver()     // Catch:{ Exception -> 0x00d2 }
            java.lang.String[] r4 = f90590a     // Catch:{ Exception -> 0x00d2 }
            r5 = 0
            r6 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00d2 }
            if (r2 != 0) goto L_0x0020
            if (r2 == 0) goto L_0x001f
            r2.close()
        L_0x001f:
            return r1
        L_0x0020:
            boolean r0 = r2.moveToNext()     // Catch:{ Exception -> 0x00cc, all -> 0x00ca }
            if (r0 == 0) goto L_0x00c4
            r0 = 0
            long r3 = r2.getLong(r0)     // Catch:{ Exception -> 0x00cc, all -> 0x00ca }
            r0 = 1
            java.lang.String r5 = r2.getString(r0)     // Catch:{ Exception -> 0x00cc, all -> 0x00ca }
            r6 = 2
            long r6 = r2.getLong(r6)     // Catch:{ Exception -> 0x00cc, all -> 0x00ca }
            r8 = 3
            int r8 = r2.getInt(r8)     // Catch:{ Exception -> 0x00cc, all -> 0x00ca }
            r9 = 4
            int r9 = r2.getInt(r9)     // Catch:{ Exception -> 0x00cc, all -> 0x00ca }
            r10 = 5
            java.lang.String r10 = r2.getString(r10)     // Catch:{ Exception -> 0x00cc, all -> 0x00ca }
            r11 = 6
            double r11 = r2.getDouble(r11)     // Catch:{ Exception -> 0x00cc, all -> 0x00ca }
            r13 = 7
            double r13 = r2.getDouble(r13)     // Catch:{ Exception -> 0x00cc, all -> 0x00ca }
            r15 = 8
            int r15 = r2.getInt(r15)     // Catch:{ Exception -> 0x00cc, all -> 0x00ca }
            r16 = r1
            long r0 = (long) r15
            if (r8 == 0) goto L_0x005b
            if (r9 != 0) goto L_0x006f
        L_0x005b:
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            r8.<init>()     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            r9 = 1
            r8.inJustDecodeBounds = r9     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            android.graphics.BitmapFactory.decodeFile(r5, r8)     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            int r9 = r8.outWidth     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            int r8 = r8.outHeight     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            r17 = r9
            r9 = r8
            r8 = r17
        L_0x006f:
            if (r10 == 0) goto L_0x007f
            java.lang.String r15 = "image/*"
            boolean r15 = r15.equals(r10)     // Catch:{ Exception -> 0x007a, all -> 0x00ca }
            if (r15 == 0) goto L_0x0083
            goto L_0x007f
        L_0x007a:
            r0 = move-exception
            r8 = r2
            r1 = r16
            goto L_0x00d3
        L_0x007f:
            java.lang.String r10 = com.p280ss.android.ugc.aweme.photo.C34754h.m112122a(r5)     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
        L_0x0083:
            java.lang.String r15 = "image/jpg"
            boolean r15 = r15.equals(r10)     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            if (r15 != 0) goto L_0x009b
            java.lang.String r15 = "image/jpeg"
            boolean r15 = r15.equals(r10)     // Catch:{ Exception -> 0x007a, all -> 0x00ca }
            if (r15 != 0) goto L_0x009b
            java.lang.String r15 = "image/png"
            boolean r10 = r15.equals(r10)     // Catch:{ Exception -> 0x007a, all -> 0x00ca }
            if (r10 == 0) goto L_0x00bc
        L_0x009b:
            boolean r10 = com.p280ss.android.medialib.C19722g.m65025a(r5)     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            if (r10 == 0) goto L_0x00bc
            com.ss.android.ugc.aweme.photo.MediaModelWithModify r10 = new com.ss.android.ugc.aweme.photo.MediaModelWithModify     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            r10.<init>(r3)     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            r10.f88156b = r5     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            r10.f88157c = r6     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            r10.f88163i = r8     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            r10.f88164j = r9     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            r10.f88165k = r11     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            r10.f88166l = r13     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            r10.mo86199a(r0)     // Catch:{ Exception -> 0x00c0, all -> 0x00ca }
            r1 = r16
            r1.add(r10)     // Catch:{ Exception -> 0x00cc, all -> 0x00ca }
            goto L_0x0020
        L_0x00bc:
            r1 = r16
            goto L_0x0020
        L_0x00c0:
            r0 = move-exception
            r1 = r16
            goto L_0x00cd
        L_0x00c4:
            if (r2 == 0) goto L_0x00db
            r2.close()
            goto L_0x00db
        L_0x00ca:
            r0 = move-exception
            goto L_0x00dc
        L_0x00cc:
            r0 = move-exception
        L_0x00cd:
            r8 = r2
            goto L_0x00d3
        L_0x00cf:
            r0 = move-exception
            r2 = r8
            goto L_0x00dc
        L_0x00d2:
            r0 = move-exception
        L_0x00d3:
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r0)     // Catch:{ all -> 0x00cf }
            if (r8 == 0) goto L_0x00db
            r8.close()
        L_0x00db:
            return r1
        L_0x00dc:
            if (r2 == 0) goto L_0x00e1
            r2.close()
        L_0x00e1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.photo.C34753g.m112121a(android.content.Context):java.util.List");
    }
}
