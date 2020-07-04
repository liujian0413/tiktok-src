package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.chooser.C19262f;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.b */
public final class C30891b {

    /* renamed from: a */
    private static final String[] f80937a = {"_id", "_data", "date_added", "width", "height", "mime_type"};

    /* renamed from: a */
    public static List<C19262f> m100623a(Context context) {
        return m100624a(context, 360, 360, Integer.MAX_VALUE, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c9, code lost:
        if (r12 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d2, code lost:
        if (r12 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d4, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00db, code lost:
        if (r0.isEmpty() != false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00dd, code lost:
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e5, code lost:
        if (r1.hasNext() == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e7, code lost:
        r2 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30890a) r1.next();
        r2.f80932a = m100627b(com.bytedance.ies.ugc.appcontext.C6399b.m19921a(), r2.f80934c, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fa, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30890a> m100626a(boolean r13) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Context r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.ContentResolver r2 = r1.getContentResolver()
            r1 = 5
            r8 = 4
            r3 = 2
            r9 = 3
            r10 = 1
            r11 = 0
            r12 = 0
            if (r13 == 0) goto L_0x004e
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r5 = "_data"
            r1[r11] = r5     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r5 = "bucket_id"
            r1[r10] = r5     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r5 = "date_modified"
            r1[r3] = r5     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r5 = "width"
            r1[r9] = r5     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r5 = "height"
            r1[r8] = r5     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r5 = "mime_type=? or mime_type=? or mime_type=? or mime_type=?)  group by (bucket_id"
            java.lang.String[] r6 = new java.lang.String[r8]     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r7 = "image/jpeg"
            r6[r11] = r7     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r7 = "image/png"
            r6[r10] = r7     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r7 = "image/jpg"
            r6[r3] = r7     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r3 = "image/gif"
            r6[r9] = r3     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r7 = "date_modified desc"
            r3 = r4
            r4 = r1
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            goto L_0x007e
        L_0x004b:
            r13 = move-exception
            goto L_0x00cc
        L_0x004e:
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r5 = "_data"
            r1[r11] = r5     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r5 = "bucket_id"
            r1[r10] = r5     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r5 = "date_modified"
            r1[r3] = r5     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r5 = "width"
            r1[r9] = r5     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r5 = "height"
            r1[r8] = r5     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r5 = "mime_type=? or mime_type=? or mime_type=?)  group by (bucket_id"
            java.lang.String[] r6 = new java.lang.String[r9]     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r7 = "image/jpeg"
            r6[r11] = r7     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r7 = "image/png"
            r6[r10] = r7     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r7 = "image/jpg"
            r6[r3] = r7     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r7 = "date_modified desc"
            r3 = r4
            r4 = r1
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
        L_0x007e:
            r12 = r1
            if (r12 == 0) goto L_0x00c9
        L_0x0081:
            boolean r1 = r12.moveToNext()     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            if (r1 == 0) goto L_0x00c9
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r2 = r12.getString(r11)     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.io.File r2 = r1.getParentFile()     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r2 = r2.getName()     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            int r3 = r12.getInt(r9)     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            int r4 = r12.getInt(r8)     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            r5 = 360(0x168, float:5.04E-43)
            if (r3 < r5) goto L_0x0081
            if (r4 < r5) goto L_0x0081
            com.ss.android.ugc.aweme.im.sdk.chat.input.photo.a r3 = m100622a(r0, r2)     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            if (r3 != 0) goto L_0x0081
            com.ss.android.ugc.aweme.im.sdk.chat.input.photo.a r3 = new com.ss.android.ugc.aweme.im.sdk.chat.input.photo.a     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            r3.<init>()     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r4 = r12.getString(r11)     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            r3.f80935d = r4     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            r3.f80936e = r2     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r1 = r1.getParent()     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            r3.f80933b = r1     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            java.lang.String r1 = r12.getString(r10)     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            r3.f80934c = r1     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            r0.add(r3)     // Catch:{ Exception -> 0x00d2, all -> 0x004b }
            goto L_0x0081
        L_0x00c9:
            if (r12 == 0) goto L_0x00d7
            goto L_0x00d4
        L_0x00cc:
            if (r12 == 0) goto L_0x00d1
            r12.close()
        L_0x00d1:
            throw r13
        L_0x00d2:
            if (r12 == 0) goto L_0x00d7
        L_0x00d4:
            r12.close()
        L_0x00d7:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x00fa
            java.util.Iterator r1 = r0.iterator()
        L_0x00e1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fa
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.im.sdk.chat.input.photo.a r2 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30890a) r2
            android.content.Context r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            java.lang.String r4 = r2.f80934c
            int r3 = m100627b(r3, r4, r13)
            r2.f80932a = r3
            goto L_0x00e1
        L_0x00fa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30891b.m100626a(boolean):java.util.List");
    }

    /* renamed from: a */
    private static C30890a m100622a(List<C30890a> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            C30890a aVar = (C30890a) list.get(i);
            if (TextUtils.equals(aVar.f80936e, str)) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (r9 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r9 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        return r8;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m100627b(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            android.content.ContentResolver r0 = r10.getContentResolver()
            r10 = 2
            r6 = 3
            r1 = 1
            r7 = 4
            r8 = 0
            r9 = 0
            if (r12 == 0) goto L_0x0031
            android.net.Uri r12 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String[] r2 = f80937a     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String r3 = "bucket_id=? and (mime_type=? or mime_type=? or mime_type=? or mime_type=?) "
            r4 = 5
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            r4[r8] = r11     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String r11 = "image/jpeg"
            r4[r1] = r11     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String r11 = "image/png"
            r4[r10] = r11     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String r10 = "image/jpg"
            r4[r6] = r10     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String r10 = "image/gif"
            r4[r7] = r10     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String r5 = "date_modified desc"
            r1 = r12
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            goto L_0x004e
        L_0x002f:
            r10 = move-exception
            goto L_0x006e
        L_0x0031:
            android.net.Uri r12 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String[] r2 = f80937a     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String r3 = "bucket_id=? and (mime_type=? or mime_type=? or mime_type=?) "
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            r4[r8] = r11     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String r11 = "image/jpeg"
            r4[r1] = r11     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String r11 = "image/png"
            r4[r10] = r11     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String r10 = "image/jpg"
            r4[r6] = r10     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            java.lang.String r5 = "date_modified desc"
            r1 = r12
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0074, all -> 0x002f }
        L_0x004e:
            r9 = r10
            if (r9 == 0) goto L_0x0068
        L_0x0051:
            boolean r10 = r9.moveToNext()     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            if (r10 == 0) goto L_0x0068
            int r10 = r9.getInt(r6)     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            int r11 = r9.getInt(r7)     // Catch:{ Exception -> 0x0074, all -> 0x002f }
            r12 = 360(0x168, float:5.04E-43)
            if (r10 < r12) goto L_0x0051
            if (r11 < r12) goto L_0x0051
            int r8 = r8 + 1
            goto L_0x0051
        L_0x0068:
            if (r9 == 0) goto L_0x0077
        L_0x006a:
            r9.close()
            goto L_0x0077
        L_0x006e:
            if (r9 == 0) goto L_0x0073
            r9.close()
        L_0x0073:
            throw r10
        L_0x0074:
            if (r9 == 0) goto L_0x0077
            goto L_0x006a
        L_0x0077:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30891b.m100627b(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b0, code lost:
        if (r3 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b9, code lost:
        if (r3 == null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bb, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00be, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p280ss.android.chooser.C19262f> m100625a(android.content.Context r18, java.lang.String r19, boolean r20) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "%s >= %d and %s >= %d"
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "width"
            r7 = 0
            r5[r7] = r6
            r6 = 360(0x168, float:5.04E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r9 = 1
            r5[r9] = r8
            java.lang.String r8 = "height"
            r10 = 2
            r5[r10] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r11 = 3
            r5[r11] = r8
            com.C1642a.m8035a(r2, r3, r5)
            android.content.ContentResolver r12 = r18.getContentResolver()
            r2 = 5
            r3 = 0
            if (r20 == 0) goto L_0x0058
            android.net.Uri r13 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String[] r14 = f80937a     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r15 = "bucket_id=? and (mime_type=? or mime_type=? or mime_type=? or mime_type=?) "
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            r5[r7] = r19     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r0 = "image/jpeg"
            r5[r9] = r0     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r0 = "image/png"
            r5[r10] = r0     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r0 = "image/jpg"
            r5[r11] = r0     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r0 = "image/gif"
            r5[r4] = r0     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r17 = "date_modified desc"
            r16 = r5
            android.database.Cursor r0 = r12.query(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            goto L_0x0076
        L_0x0056:
            r0 = move-exception
            goto L_0x00b3
        L_0x0058:
            android.net.Uri r13 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String[] r14 = f80937a     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r15 = "bucket_id=? and (mime_type=? or mime_type=? or mime_type=?) "
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            r5[r7] = r19     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r0 = "image/jpeg"
            r5[r9] = r0     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r0 = "image/png"
            r5[r10] = r0     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r0 = "image/jpg"
            r5[r11] = r0     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r17 = "date_modified desc"
            r16 = r5
            android.database.Cursor r0 = r12.query(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
        L_0x0076:
            r3 = r0
            if (r3 == 0) goto L_0x00b0
        L_0x0079:
            boolean r0 = r3.moveToNext()     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            if (r0 == 0) goto L_0x00b0
            long r12 = r3.getLong(r7)     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r0 = r3.getString(r9)     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            long r14 = r3.getLong(r10)     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            int r5 = r3.getInt(r11)     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            int r8 = r3.getInt(r4)     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            java.lang.String r4 = r3.getString(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            if (r5 < r6) goto L_0x00ae
            if (r8 < r6) goto L_0x00ae
            com.ss.android.chooser.f r2 = new com.ss.android.chooser.f     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            r2.<init>(r12)     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            r2.f52149b = r0     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            r2.f52150c = r14     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            r2.f52156i = r5     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            r2.f52157j = r8     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            r2.f52154g = r4     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            r1.add(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x0056 }
            r2 = 5
        L_0x00ae:
            r4 = 4
            goto L_0x0079
        L_0x00b0:
            if (r3 == 0) goto L_0x00be
            goto L_0x00bb
        L_0x00b3:
            if (r3 == 0) goto L_0x00b8
            r3.close()
        L_0x00b8:
            throw r0
        L_0x00b9:
            if (r3 == 0) goto L_0x00be
        L_0x00bb:
            r3.close()
        L_0x00be:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30891b.m100625a(android.content.Context, java.lang.String, boolean):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p280ss.android.chooser.C19262f> m100624a(android.content.Context r16, int r17, int r18, int r19, boolean r20) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "%s >= %d and %s >= %d"
            r8 = 4
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.String r5 = "width"
            r9 = 0
            r4[r9] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r10 = 1
            r4[r10] = r5
            java.lang.String r5 = "height"
            r11 = 2
            r4[r11] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            r12 = 3
            r4[r12] = r5
            java.lang.String r5 = com.C1642a.m8035a(r1, r2, r4)
            java.lang.String r7 = "date_added DESC"
            r1 = 0
            android.content.ContentResolver r2 = r16.getContentResolver()     // Catch:{ Exception -> 0x00b8, all -> 0x00b0 }
            java.lang.String[] r4 = f80937a     // Catch:{ Exception -> 0x00b8, all -> 0x00b0 }
            r6 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00b8, all -> 0x00b0 }
            if (r2 != 0) goto L_0x0044
            if (r2 == 0) goto L_0x0043
            r2.close()
        L_0x0043:
            return r0
        L_0x0044:
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            if (r1 == 0) goto L_0x00a6
            long r3 = r2.getLong(r9)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            java.lang.String r1 = r2.getString(r10)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            long r5 = r2.getLong(r11)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            int r7 = r2.getInt(r12)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            int r13 = r2.getInt(r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            r14 = 5
            java.lang.String r14 = r2.getString(r14)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            java.lang.String r15 = "image/jpeg"
            boolean r15 = r15.equals(r14)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            if (r15 != 0) goto L_0x007b
            java.lang.String r15 = "image/png"
            boolean r15 = r15.equals(r14)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            if (r15 != 0) goto L_0x007b
            java.lang.String r15 = "image/gif"
            boolean r15 = r15.equals(r14)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            if (r15 == 0) goto L_0x00a4
        L_0x007b:
            boolean r15 = com.p280ss.android.ugc.aweme.video.C7276d.m22812b(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            if (r15 == 0) goto L_0x00a4
            if (r20 != 0) goto L_0x008b
            java.lang.String r8 = "image/gif"
            boolean r8 = r8.equals(r14)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            if (r8 != 0) goto L_0x00a4
        L_0x008b:
            com.ss.android.chooser.f r8 = new com.ss.android.chooser.f     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            r8.<init>(r3)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            r8.f52149b = r1     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            r8.f52150c = r5     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            r8.f52156i = r7     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            r8.f52157j = r13     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            r0.add(r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            int r1 = r0.size()     // Catch:{ Exception -> 0x00ae, all -> 0x00ac }
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r3) goto L_0x00a6
        L_0x00a4:
            r8 = 4
            goto L_0x0044
        L_0x00a6:
            if (r2 == 0) goto L_0x00bd
            r2.close()
            goto L_0x00bd
        L_0x00ac:
            r0 = move-exception
            goto L_0x00b2
        L_0x00ae:
            r1 = r2
            goto L_0x00b8
        L_0x00b0:
            r0 = move-exception
            r2 = r1
        L_0x00b2:
            if (r2 == 0) goto L_0x00b7
            r2.close()
        L_0x00b7:
            throw r0
        L_0x00b8:
            if (r1 == 0) goto L_0x00bd
            r1.close()
        L_0x00bd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30891b.m100624a(android.content.Context, int, int, int, boolean):java.util.List");
    }
}
