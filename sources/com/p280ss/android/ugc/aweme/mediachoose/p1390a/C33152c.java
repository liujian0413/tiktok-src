package com.p280ss.android.ugc.aweme.mediachoose.p1390a;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.a.c */
public final class C33152c {
    /* renamed from: a */
    private static Pair<Integer, Integer> m106968a(String str) {
        if (C6319n.m19593a(str) || !new File(str).exists()) {
            return null;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3 A[SYNTHETIC, Splitter:B:31:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7 A[Catch:{ Throwable -> 0x00b4, all -> 0x00ae, all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0079 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel> m106969a(android.content.Context r13, int r14, int r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 > r2) goto L_0x000c
            return r0
        L_0x000c:
            java.lang.String r8 = "datetaken DESC"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " LIMIT "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r2 = " OFFSET "
            r1.append(r2)
            int r15 = r15 * r14
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "_id"
            r9 = 0
            r1[r9] = r2
            java.lang.String r2 = "_data"
            r10 = 1
            r1[r10] = r2
            java.lang.String r2 = "date_modified"
            r11 = 2
            r1[r11] = r2
            java.lang.String r6 = "mime_type like ?"
            java.lang.String[] r7 = new java.lang.String[r10]
            java.lang.String r2 = "%gif%"
            r7[r9] = r2
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r12 = 0
            r2 = -1
            if (r14 != r2) goto L_0x0054
            android.content.ContentResolver r3 = r13.getContentResolver()     // Catch:{ all -> 0x0051 }
            r5 = r1
            android.database.Cursor r13 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            r12 = r13
            goto L_0x0071
        L_0x0051:
            r13 = move-exception
            goto L_0x00cc
        L_0x0054:
            android.content.ContentResolver r2 = r13.getContentResolver()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r13.<init>()     // Catch:{ all -> 0x0051 }
            r13.append(r8)     // Catch:{ all -> 0x0051 }
            r13.append(r15)     // Catch:{ all -> 0x0051 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0051 }
            r3 = r4
            r4 = r1
            r5 = r6
            r6 = r7
            r7 = r13
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0051 }
            goto L_0x004f
        L_0x0071:
            if (r12 != 0) goto L_0x0079
            if (r12 == 0) goto L_0x0078
            r12.close()
        L_0x0078:
            return r0
        L_0x0079:
            boolean r13 = r12.moveToNext()     // Catch:{ all -> 0x0051 }
            if (r13 == 0) goto L_0x00c6
            long r13 = r12.getLong(r9)     // Catch:{ all -> 0x0051 }
            com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel r15 = new com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel     // Catch:{ all -> 0x0051 }
            r15.<init>(r13)     // Catch:{ all -> 0x0051 }
            java.lang.String r13 = r12.getString(r10)     // Catch:{ all -> 0x0051 }
            pl.droidsonroids.gif.a r14 = new pl.droidsonroids.gif.a     // Catch:{ Throwable -> 0x00b4, all -> 0x00ae }
            r14.<init>(r13)     // Catch:{ Throwable -> 0x00b4, all -> 0x00ae }
            int r1 = r14.getIntrinsicWidth()     // Catch:{ Throwable -> 0x00b4, all -> 0x00ae }
            r15.f88163i = r1     // Catch:{ Throwable -> 0x00b4, all -> 0x00ae }
            int r1 = r14.getIntrinsicHeight()     // Catch:{ Throwable -> 0x00b4, all -> 0x00ae }
            r15.f88164j = r1     // Catch:{ Throwable -> 0x00b4, all -> 0x00ae }
            int r1 = r14.mo123222d()     // Catch:{ Throwable -> 0x00b4, all -> 0x00ae }
            if (r1 <= r10) goto L_0x00a5
            r1 = 1
            goto L_0x00a6
        L_0x00a5:
            r1 = 0
        L_0x00a6:
            r14.mo123216a()     // Catch:{ Throwable -> 0x00b5, all -> 0x00ac }
            if (r1 != 0) goto L_0x00b8
            goto L_0x0079
        L_0x00ac:
            r13 = move-exception
            goto L_0x00b0
        L_0x00ae:
            r13 = move-exception
            r1 = 0
        L_0x00b0:
            if (r1 != 0) goto L_0x00b3
            goto L_0x0079
        L_0x00b3:
            throw r13     // Catch:{ all -> 0x0051 }
        L_0x00b4:
            r1 = 0
        L_0x00b5:
            if (r1 != 0) goto L_0x00b8
            goto L_0x0079
        L_0x00b8:
            long r1 = r12.getLong(r11)     // Catch:{ all -> 0x0051 }
            r15.f88156b = r13     // Catch:{ all -> 0x0051 }
            r15.f88157c = r1     // Catch:{ all -> 0x0051 }
            r15.f88158d = r11     // Catch:{ all -> 0x0051 }
            r0.add(r15)     // Catch:{ all -> 0x0051 }
            goto L_0x0079
        L_0x00c6:
            if (r12 == 0) goto L_0x00cb
            r12.close()
        L_0x00cb:
            return r0
        L_0x00cc:
            if (r12 == 0) goto L_0x00d1
            r12.close()
        L_0x00d1:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33152c.m106969a(android.content.Context, int, int):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0154  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel> m106971b(android.content.Context r26, int r27, int r28) {
        /*
            r0 = r27
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r7 = "datetaken DESC"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " LIMIT "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = " OFFSET "
            r2.append(r3)
            int r3 = r28 * r0
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 11
            java.lang.String[] r10 = new java.lang.String[r3]
            java.lang.String r3 = "_id"
            r14 = 0
            r10[r14] = r3
            java.lang.String r3 = "_data"
            r15 = 1
            r10[r15] = r3
            java.lang.String r3 = "date_modified"
            r13 = 2
            r10[r13] = r3
            java.lang.String r3 = "mime_type"
            r12 = 3
            r10[r12] = r3
            java.lang.String r3 = "duration"
            r11 = 4
            r10[r11] = r3
            java.lang.String r3 = "_size"
            r9 = 5
            r10[r9] = r3
            java.lang.String r3 = "latitude"
            r8 = 6
            r10[r8] = r3
            java.lang.String r3 = "longitude"
            r6 = 7
            r10[r6] = r3
            java.lang.String r3 = "_data"
            r5 = 8
            r10[r5] = r3
            java.lang.String r3 = "width"
            r4 = 9
            r10[r4] = r3
            java.lang.String r3 = "height"
            r15 = 10
            r10[r15] = r3
            android.net.Uri r3 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            r4 = -1
            r18 = 0
            if (r0 != r4) goto L_0x0087
            android.content.ContentResolver r2 = r26.getContentResolver()     // Catch:{ all -> 0x0082 }
            r0 = 0
            r19 = 0
            r15 = 9
            r4 = r10
            r10 = 8
            r5 = r0
            r0 = 7
            r6 = r19
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0082 }
            r3 = 4
            r4 = 8
            r5 = 5
            r6 = 3
            r7 = 6
            r15 = 2
            goto L_0x00b1
        L_0x0082:
            r0 = move-exception
            r24 = r18
            goto L_0x0152
        L_0x0087:
            r0 = 7
            r4 = 8
            r15 = 9
            android.content.ContentResolver r5 = r26.getContentResolver()     // Catch:{ all -> 0x0082 }
            r6 = 0
            r17 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r8.<init>()     // Catch:{ all -> 0x0082 }
            r8.append(r7)     // Catch:{ all -> 0x0082 }
            r8.append(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x0082 }
            r7 = 6
            r8 = r5
            r5 = 5
            r9 = r3
            r3 = 4
            r11 = r6
            r6 = 3
            r12 = r17
            r15 = 2
            r13 = r2
            android.database.Cursor r2 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0082 }
        L_0x00b1:
            if (r2 != 0) goto L_0x00b9
            if (r2 == 0) goto L_0x00b8
            r2.close()
        L_0x00b8:
            return r1
        L_0x00b9:
            boolean r8 = r2.moveToNext()     // Catch:{ all -> 0x014f }
            if (r8 == 0) goto L_0x0146
            long r8 = r2.getLong(r14)     // Catch:{ all -> 0x014f }
            r10 = 1
            java.lang.String r11 = r2.getString(r10)     // Catch:{ all -> 0x014f }
            long r12 = r2.getLong(r15)     // Catch:{ all -> 0x014f }
            java.lang.String r10 = r2.getString(r6)     // Catch:{ all -> 0x014f }
            long r14 = r2.getLong(r3)     // Catch:{ all -> 0x014f }
            long r3 = r2.getLong(r5)     // Catch:{ all -> 0x014f }
            double r5 = r2.getDouble(r7)     // Catch:{ all -> 0x014f }
            r20 = r8
            double r7 = r2.getDouble(r0)     // Catch:{ all -> 0x014f }
            r9 = 8
            java.lang.String r0 = r2.getString(r9)     // Catch:{ all -> 0x014f }
            r22 = r1
            r9 = 9
            int r1 = r2.getInt(r9)     // Catch:{ all -> 0x014f }
            r23 = r1
            r9 = 10
            int r1 = r2.getInt(r9)     // Catch:{ all -> 0x014f }
            boolean r16 = com.bytedance.common.utility.C6319n.m19593a(r11)     // Catch:{ all -> 0x014f }
            if (r16 != 0) goto L_0x0139
            r16 = 0
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0139
            int r18 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0139
            com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel r9 = new com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel     // Catch:{ all -> 0x014f }
            r25 = r1
            r24 = r2
            r1 = r20
            r9.<init>(r1)     // Catch:{ all -> 0x0137 }
            r9.f88156b = r11     // Catch:{ all -> 0x0137 }
            r9.f88157c = r12     // Catch:{ all -> 0x0137 }
            r9.f88161g = r10     // Catch:{ all -> 0x0137 }
            r9.f88159e = r14     // Catch:{ all -> 0x0137 }
            r9.f88160f = r3     // Catch:{ all -> 0x0137 }
            r1 = 4
            r9.f88158d = r1     // Catch:{ all -> 0x0137 }
            r9.f88162h = r0     // Catch:{ all -> 0x0137 }
            r9.f88165k = r5     // Catch:{ all -> 0x0137 }
            r9.f88166l = r7     // Catch:{ all -> 0x0137 }
            r0 = r23
            r9.f88163i = r0     // Catch:{ all -> 0x0137 }
            r0 = r25
            r9.f88164j = r0     // Catch:{ all -> 0x0137 }
            r0 = r22
            r0.add(r9)     // Catch:{ all -> 0x0137 }
            r1 = r0
            r2 = r24
            goto L_0x013b
        L_0x0137:
            r0 = move-exception
            goto L_0x0152
        L_0x0139:
            r1 = r22
        L_0x013b:
            r0 = 7
            r3 = 4
            r4 = 8
            r5 = 5
            r6 = 3
            r7 = 6
            r14 = 0
            r15 = 2
            goto L_0x00b9
        L_0x0146:
            r0 = r1
            r24 = r2
            if (r24 == 0) goto L_0x014e
            r24.close()
        L_0x014e:
            return r0
        L_0x014f:
            r0 = move-exception
            r24 = r2
        L_0x0152:
            if (r24 == 0) goto L_0x0157
            r24.close()
        L_0x0157:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33152c.m106971b(android.content.Context, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013a, code lost:
        if (r4 == false) goto L_0x0172;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0144 A[SYNTHETIC, Splitter:B:44:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0148 A[Catch:{ Throwable -> 0x0145, all -> 0x013f, all -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0186  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel> m106970a(android.content.Context r23, boolean r24, int r25, int r26) {
        /*
            r1 = r25
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r8 = "datetaken DESC"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = " LIMIT "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r4 = " OFFSET "
            r3.append(r4)
            int r4 = r26 * r1
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 9
            java.lang.String[] r11 = new java.lang.String[r4]
            java.lang.String r4 = "_id"
            r15 = 0
            r11[r15] = r4
            java.lang.String r4 = "_data"
            r14 = 1
            r11[r14] = r4
            java.lang.String r4 = "date_modified"
            r13 = 2
            r11[r13] = r4
            java.lang.String r4 = "mime_type"
            r12 = 3
            r11[r12] = r4
            java.lang.String r4 = "_size"
            r10 = 4
            r11[r10] = r4
            java.lang.String r4 = "latitude"
            r9 = 5
            r11[r9] = r4
            java.lang.String r4 = "longitude"
            r7 = 6
            r11[r7] = r4
            java.lang.String r4 = "_data"
            r6 = 7
            r11[r6] = r4
            java.lang.String r4 = "date_modified"
            r5 = 8
            r11[r5] = r4
            r16 = 0
            if (r24 == 0) goto L_0x005a
            r17 = r16
            goto L_0x005e
        L_0x005a:
            java.lang.String r4 = "mime_type not like ?"
            r17 = r4
        L_0x005e:
            if (r24 == 0) goto L_0x0063
            r0 = r16
            goto L_0x0069
        L_0x0063:
            java.lang.String[] r0 = new java.lang.String[r14]
            java.lang.String r4 = "%gif%"
            r0[r15] = r4
        L_0x0069:
            android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r5 = -1
            if (r1 != r5) goto L_0x008a
            android.content.ContentResolver r3 = r23.getContentResolver()     // Catch:{ all -> 0x0085 }
            r1 = 8
            r5 = r11
            r11 = 7
            r6 = r17
            r1 = 6
            r7 = r0
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0085 }
            r3 = r0
            r4 = 3
            r5 = 1
            r6 = 4
            r7 = 5
            r8 = 2
            goto L_0x00af
        L_0x0085:
            r0 = move-exception
            r3 = r16
            goto L_0x0184
        L_0x008a:
            r1 = 6
            r5 = 7
            android.content.ContentResolver r6 = r23.getContentResolver()     // Catch:{ all -> 0x0085 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0085 }
            r7.<init>()     // Catch:{ all -> 0x0085 }
            r7.append(r8)     // Catch:{ all -> 0x0085 }
            r7.append(r3)     // Catch:{ all -> 0x0085 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0085 }
            r7 = 5
            r9 = r6
            r6 = 4
            r10 = r4
            r4 = 3
            r12 = r17
            r8 = 2
            r13 = r0
            r5 = 1
            r14 = r3
            android.database.Cursor r0 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0085 }
            r3 = r0
        L_0x00af:
            if (r3 != 0) goto L_0x00b7
            if (r3 == 0) goto L_0x00b6
            r3.close()
        L_0x00b6:
            return r2
        L_0x00b7:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x017c
            long r9 = r3.getLong(r15)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r3.getString(r5)     // Catch:{ all -> 0x0183 }
            long r11 = r3.getLong(r8)     // Catch:{ all -> 0x0183 }
            java.lang.String r13 = r3.getString(r4)     // Catch:{ all -> 0x0183 }
            long r4 = r3.getLong(r6)     // Catch:{ all -> 0x0183 }
            r18 = r9
            double r8 = r3.getDouble(r7)     // Catch:{ all -> 0x0183 }
            double r6 = r3.getDouble(r1)     // Catch:{ all -> 0x0183 }
            r10 = 7
            java.lang.String r14 = r3.getString(r10)     // Catch:{ all -> 0x0183 }
            r1 = 8
            int r10 = r3.getInt(r1)     // Catch:{ all -> 0x0183 }
            r20 = r2
            long r1 = (long) r10     // Catch:{ all -> 0x0183 }
            r16 = 0
            int r10 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x0172
            com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel r10 = new com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel     // Catch:{ all -> 0x0183 }
            r21 = r1
            r1 = r18
            r10.<init>(r1)     // Catch:{ all -> 0x0183 }
            r10.f88156b = r0     // Catch:{ all -> 0x0183 }
            r10.f88157c = r11     // Catch:{ all -> 0x0183 }
            r10.f88160f = r4     // Catch:{ all -> 0x0183 }
            r10.f88162h = r14     // Catch:{ all -> 0x0183 }
            r10.f88165k = r8     // Catch:{ all -> 0x0183 }
            r10.f88166l = r6     // Catch:{ all -> 0x0183 }
            r1 = r21
            r10.mo86199a(r1)     // Catch:{ all -> 0x0183 }
            if (r13 == 0) goto L_0x014d
            java.lang.String r1 = "gif"
            boolean r1 = r13.contains(r1)     // Catch:{ all -> 0x0183 }
            if (r1 == 0) goto L_0x014d
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0183 }
            r2 = 16
            if (r1 <= r2) goto L_0x0172
            r1 = 2
            r10.f88158d = r1     // Catch:{ all -> 0x0183 }
            pl.droidsonroids.gif.a r2 = new pl.droidsonroids.gif.a     // Catch:{ Throwable -> 0x0145, all -> 0x013f }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0145, all -> 0x013f }
            int r0 = r2.getIntrinsicWidth()     // Catch:{ Throwable -> 0x0145, all -> 0x013f }
            r10.f88163i = r0     // Catch:{ Throwable -> 0x0145, all -> 0x013f }
            int r0 = r2.getIntrinsicHeight()     // Catch:{ Throwable -> 0x0145, all -> 0x013f }
            r10.f88164j = r0     // Catch:{ Throwable -> 0x0145, all -> 0x013f }
            int r0 = r2.mo123222d()     // Catch:{ Throwable -> 0x0145, all -> 0x013f }
            r4 = 1
            if (r0 <= r4) goto L_0x0136
            r4 = 1
            goto L_0x0137
        L_0x0136:
            r4 = 0
        L_0x0137:
            r2.mo123216a()     // Catch:{ Throwable -> 0x0146, all -> 0x013d }
            if (r4 != 0) goto L_0x0149
            goto L_0x0172
        L_0x013d:
            r0 = move-exception
            goto L_0x0141
        L_0x013f:
            r0 = move-exception
            r4 = 0
        L_0x0141:
            if (r4 != 0) goto L_0x0144
            goto L_0x0172
        L_0x0144:
            throw r0     // Catch:{ all -> 0x0183 }
        L_0x0145:
            r4 = 0
        L_0x0146:
            if (r4 != 0) goto L_0x0149
            goto L_0x0172
        L_0x0149:
            r4 = r20
            r2 = 1
            goto L_0x016d
        L_0x014d:
            r1 = 2
            r2 = 1
            r10.f88158d = r2     // Catch:{ all -> 0x0183 }
            android.util.Pair r0 = m106968a(r0)     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x016b
            java.lang.Object r4 = r0.first     // Catch:{ all -> 0x0183 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0183 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0183 }
            r10.f88163i = r4     // Catch:{ all -> 0x0183 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0183 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0183 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0183 }
            r10.f88164j = r0     // Catch:{ all -> 0x0183 }
        L_0x016b:
            r4 = r20
        L_0x016d:
            r4.add(r10)     // Catch:{ all -> 0x0183 }
            r2 = r4
            goto L_0x0174
        L_0x0172:
            r2 = r20
        L_0x0174:
            r1 = 6
            r4 = 3
            r5 = 1
            r6 = 4
            r7 = 5
            r8 = 2
            goto L_0x00b7
        L_0x017c:
            r4 = r2
            if (r3 == 0) goto L_0x0182
            r3.close()
        L_0x0182:
            return r4
        L_0x0183:
            r0 = move-exception
        L_0x0184:
            if (r3 == 0) goto L_0x0189
            r3.close()
        L_0x0189:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33152c.m106970a(android.content.Context, boolean, int, int):java.util.List");
    }
}
