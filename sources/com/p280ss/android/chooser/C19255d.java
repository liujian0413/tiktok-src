package com.p280ss.android.chooser;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import java.io.File;

/* renamed from: com.ss.android.chooser.d */
public final class C19255d {
    /* renamed from: a */
    public static Pair<Integer, Integer> m63100a(String str) {
        if (C6319n.m19593a(str) || !new File(str).exists()) {
            return null;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[SYNTHETIC, Splitter:B:23:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[Catch:{ Throwable -> 0x006f, all -> 0x0069, all -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0034 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p280ss.android.chooser.C19262f> m63101a(android.content.Context r11) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r6 = "datetaken DESC"
            r1 = 3
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r1 = "_id"
            r7 = 0
            r3[r7] = r1
            java.lang.String r1 = "_data"
            r8 = 1
            r3[r8] = r1
            java.lang.String r1 = "date_modified"
            r9 = 2
            r3[r9] = r1
            java.lang.String r4 = "mime_type like ?"
            java.lang.String[] r5 = new java.lang.String[r8]
            java.lang.String r1 = "%gif%"
            r5[r7] = r1
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r10 = 0
            android.content.ContentResolver r1 = r11.getContentResolver()     // Catch:{ all -> 0x0089 }
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0089 }
            if (r11 != 0) goto L_0x0034
            if (r11 == 0) goto L_0x0033
            r11.close()
        L_0x0033:
            return r0
        L_0x0034:
            boolean r1 = r11.moveToNext()     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0081
            long r1 = r11.getLong(r7)     // Catch:{ all -> 0x0087 }
            com.ss.android.chooser.f r3 = new com.ss.android.chooser.f     // Catch:{ all -> 0x0087 }
            r3.<init>(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r11.getString(r8)     // Catch:{ all -> 0x0087 }
            pl.droidsonroids.gif.a r2 = new pl.droidsonroids.gif.a     // Catch:{ Throwable -> 0x006f, all -> 0x0069 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x006f, all -> 0x0069 }
            int r4 = r2.getIntrinsicWidth()     // Catch:{ Throwable -> 0x006f, all -> 0x0069 }
            r3.f52156i = r4     // Catch:{ Throwable -> 0x006f, all -> 0x0069 }
            int r4 = r2.getIntrinsicHeight()     // Catch:{ Throwable -> 0x006f, all -> 0x0069 }
            r3.f52157j = r4     // Catch:{ Throwable -> 0x006f, all -> 0x0069 }
            int r4 = r2.mo123222d()     // Catch:{ Throwable -> 0x006f, all -> 0x0069 }
            if (r4 <= r8) goto L_0x0060
            r4 = 1
            goto L_0x0061
        L_0x0060:
            r4 = 0
        L_0x0061:
            r2.mo123216a()     // Catch:{ Throwable -> 0x0070, all -> 0x0067 }
            if (r4 != 0) goto L_0x0073
            goto L_0x0034
        L_0x0067:
            r1 = move-exception
            goto L_0x006b
        L_0x0069:
            r1 = move-exception
            r4 = 0
        L_0x006b:
            if (r4 != 0) goto L_0x006e
            goto L_0x0034
        L_0x006e:
            throw r1     // Catch:{ all -> 0x0087 }
        L_0x006f:
            r4 = 0
        L_0x0070:
            if (r4 != 0) goto L_0x0073
            goto L_0x0034
        L_0x0073:
            long r4 = r11.getLong(r9)     // Catch:{ all -> 0x0087 }
            r3.f52149b = r1     // Catch:{ all -> 0x0087 }
            r3.f52150c = r4     // Catch:{ all -> 0x0087 }
            r3.f52151d = r9     // Catch:{ all -> 0x0087 }
            r0.add(r3)     // Catch:{ all -> 0x0087 }
            goto L_0x0034
        L_0x0081:
            if (r11 == 0) goto L_0x0086
            r11.close()
        L_0x0086:
            return r0
        L_0x0087:
            r0 = move-exception
            goto L_0x008b
        L_0x0089:
            r0 = move-exception
            r11 = r10
        L_0x008b:
            if (r11 == 0) goto L_0x0090
            r11.close()
        L_0x0090:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.chooser.C19255d.m63101a(android.content.Context):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p280ss.android.chooser.C19262f> m63103b(android.content.Context r18) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r6 = "datetaken DESC"
            r1 = 7
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r1 = "_id"
            r7 = 0
            r3[r7] = r1
            java.lang.String r1 = "_data"
            r8 = 1
            r3[r8] = r1
            java.lang.String r1 = "date_modified"
            r9 = 2
            r3[r9] = r1
            java.lang.String r1 = "mime_type"
            r10 = 3
            r3[r10] = r1
            java.lang.String r1 = "duration"
            r11 = 4
            r3[r11] = r1
            java.lang.String r1 = "_size"
            r12 = 5
            r3[r12] = r1
            java.lang.String r1 = "_data"
            r13 = 6
            r3[r13] = r1
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            r14 = 0
            android.content.ContentResolver r1 = r18.getContentResolver()     // Catch:{ all -> 0x00a0 }
            r4 = 0
            r5 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00a0 }
            if (r1 != 0) goto L_0x0042
            if (r1 == 0) goto L_0x0041
            r1.close()
        L_0x0041:
            return r0
        L_0x0042:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x0098
            long r2 = r1.getLong(r7)     // Catch:{ all -> 0x009e }
            java.lang.String r4 = r1.getString(r8)     // Catch:{ all -> 0x009e }
            long r5 = r1.getLong(r9)     // Catch:{ all -> 0x009e }
            java.lang.String r14 = r1.getString(r10)     // Catch:{ all -> 0x009e }
            long r9 = r1.getLong(r11)     // Catch:{ all -> 0x009e }
            long r7 = r1.getLong(r12)     // Catch:{ all -> 0x009e }
            java.lang.String r11 = r1.getString(r13)     // Catch:{ all -> 0x009e }
            boolean r15 = com.bytedance.common.utility.C6319n.m19593a(r4)     // Catch:{ all -> 0x009e }
            if (r15 != 0) goto L_0x0092
            r15 = 0
            int r17 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r17 <= 0) goto L_0x0092
            int r17 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r17 <= 0) goto L_0x0092
            com.ss.android.chooser.f r12 = new com.ss.android.chooser.f     // Catch:{ all -> 0x009e }
            r12.<init>(r2)     // Catch:{ all -> 0x009e }
            r12.f52149b = r4     // Catch:{ all -> 0x009e }
            r12.f52150c = r5     // Catch:{ all -> 0x009e }
            r12.f52154g = r14     // Catch:{ all -> 0x009e }
            r12.f52152e = r9     // Catch:{ all -> 0x009e }
            r12.f52153f = r7     // Catch:{ all -> 0x009e }
            r2 = 1
            r12.f52151d = r2     // Catch:{ all -> 0x009e }
            r12.f52155h = r11     // Catch:{ all -> 0x009e }
            r0.add(r12)     // Catch:{ all -> 0x009e }
            r7 = 0
            r8 = 1
            r9 = 2
            r10 = 3
            r11 = 4
            r12 = 5
            goto L_0x0042
        L_0x0092:
            r7 = 0
            r8 = 1
            r9 = 2
            r10 = 3
            r11 = 4
            goto L_0x0042
        L_0x0098:
            if (r1 == 0) goto L_0x009d
            r1.close()
        L_0x009d:
            return r0
        L_0x009e:
            r0 = move-exception
            goto L_0x00a2
        L_0x00a0:
            r0 = move-exception
            r1 = r14
        L_0x00a2:
            if (r1 == 0) goto L_0x00a7
            r1.close()
        L_0x00a7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.chooser.C19255d.m63103b(android.content.Context):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        if (r4 == false) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1 A[SYNTHETIC, Splitter:B:36:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b5 A[Catch:{ Throwable -> 0x00b2, all -> 0x00ac, all -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.p280ss.android.chooser.C19262f> m63102a(android.content.Context r19, boolean r20) {
        /*
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r7 = "datetaken DESC"
            r2 = 6
            java.lang.String[] r4 = new java.lang.String[r2]
            java.lang.String r2 = "_id"
            r8 = 0
            r4[r8] = r2
            java.lang.String r2 = "_data"
            r9 = 1
            r4[r9] = r2
            java.lang.String r2 = "date_modified"
            r10 = 2
            r4[r10] = r2
            java.lang.String r2 = "mime_type"
            r11 = 3
            r4[r11] = r2
            java.lang.String r2 = "_size"
            r12 = 4
            r4[r12] = r2
            java.lang.String r2 = "_data"
            r13 = 5
            r4[r13] = r2
            r14 = 0
            if (r20 == 0) goto L_0x002d
            r5 = r14
            goto L_0x0030
        L_0x002d:
            java.lang.String r2 = "mime_type not like ?"
            r5 = r2
        L_0x0030:
            if (r20 == 0) goto L_0x0034
            r6 = r14
            goto L_0x003b
        L_0x0034:
            java.lang.String[] r0 = new java.lang.String[r9]
            java.lang.String r2 = "%gif%"
            r0[r8] = r2
            r6 = r0
        L_0x003b:
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            android.content.ContentResolver r2 = r19.getContentResolver()     // Catch:{ all -> 0x00e4 }
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00e4 }
            if (r2 != 0) goto L_0x004d
            if (r2 == 0) goto L_0x004c
            r2.close()
        L_0x004c:
            return r1
        L_0x004d:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00dc
            long r3 = r2.getLong(r8)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = r2.getString(r9)     // Catch:{ all -> 0x00e2 }
            long r5 = r2.getLong(r10)     // Catch:{ all -> 0x00e2 }
            java.lang.String r7 = r2.getString(r11)     // Catch:{ all -> 0x00e2 }
            long r14 = r2.getLong(r12)     // Catch:{ all -> 0x00e2 }
            java.lang.String r11 = r2.getString(r13)     // Catch:{ all -> 0x00e2 }
            r16 = 0
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x00d9
            com.ss.android.chooser.f r12 = new com.ss.android.chooser.f     // Catch:{ all -> 0x00e2 }
            r12.<init>(r3)     // Catch:{ all -> 0x00e2 }
            r12.f52149b = r0     // Catch:{ all -> 0x00e2 }
            r12.f52150c = r5     // Catch:{ all -> 0x00e2 }
            r12.f52153f = r14     // Catch:{ all -> 0x00e2 }
            r12.f52155h = r11     // Catch:{ all -> 0x00e2 }
            if (r7 == 0) goto L_0x00b6
            java.lang.String r3 = "gif"
            boolean r3 = r7.contains(r3)     // Catch:{ all -> 0x00e2 }
            if (r3 == 0) goto L_0x00b6
            r12.f52151d = r10     // Catch:{ all -> 0x00e2 }
            pl.droidsonroids.gif.a r3 = new pl.droidsonroids.gif.a     // Catch:{ Throwable -> 0x00b2, all -> 0x00ac }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x00b2, all -> 0x00ac }
            int r0 = r3.getIntrinsicWidth()     // Catch:{ Throwable -> 0x00b2, all -> 0x00ac }
            r12.f52156i = r0     // Catch:{ Throwable -> 0x00b2, all -> 0x00ac }
            int r0 = r3.getIntrinsicHeight()     // Catch:{ Throwable -> 0x00b2, all -> 0x00ac }
            r12.f52157j = r0     // Catch:{ Throwable -> 0x00b2, all -> 0x00ac }
            int r0 = r3.mo123222d()     // Catch:{ Throwable -> 0x00b2, all -> 0x00ac }
            if (r0 <= r9) goto L_0x00a3
            r4 = 1
            goto L_0x00a4
        L_0x00a3:
            r4 = 0
        L_0x00a4:
            r3.mo123216a()     // Catch:{ Throwable -> 0x00b3, all -> 0x00aa }
            if (r4 != 0) goto L_0x00d2
            goto L_0x00d5
        L_0x00aa:
            r0 = move-exception
            goto L_0x00ae
        L_0x00ac:
            r0 = move-exception
            r4 = 0
        L_0x00ae:
            if (r4 != 0) goto L_0x00b1
            goto L_0x00d5
        L_0x00b1:
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            if (r4 != 0) goto L_0x00d2
            goto L_0x00d5
        L_0x00b6:
            r12.f52151d = r8     // Catch:{ all -> 0x00e2 }
            android.util.Pair r0 = m63100a(r0)     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r3 = r0.first     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00e2 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00e2 }
            r12.f52156i = r3     // Catch:{ all -> 0x00e2 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00e2 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00e2 }
            r12.f52157j = r0     // Catch:{ all -> 0x00e2 }
        L_0x00d2:
            r1.add(r12)     // Catch:{ all -> 0x00e2 }
        L_0x00d5:
            r11 = 3
            r12 = 4
            goto L_0x004d
        L_0x00d9:
            r11 = 3
            goto L_0x004d
        L_0x00dc:
            if (r2 == 0) goto L_0x00e1
            r2.close()
        L_0x00e1:
            return r1
        L_0x00e2:
            r0 = move-exception
            goto L_0x00e6
        L_0x00e4:
            r0 = move-exception
            r2 = r14
        L_0x00e6:
            if (r2 == 0) goto L_0x00eb
            r2.close()
        L_0x00eb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.chooser.C19255d.m63102a(android.content.Context, boolean):java.util.List");
    }
}
