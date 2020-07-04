package com.p280ss.android.ugc.aweme.profile.util;

import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.profile.util.s */
public final class C36761s {
    /* renamed from: a */
    public static File m118494a() {
        return new File(C7276d.m22802a("profileCover"), "profileCoverOrigin.data");
    }

    /* renamed from: b */
    public static File m118496b() {
        return new File(C7276d.m22802a("profileCover"), "profileCoverCrop.png");
    }

    /* renamed from: c */
    public static File m118497c() {
        return new File(C7276d.m22802a("profileHeader"), "profileHeaderCrop.png");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0029 A[SYNTHETIC, Splitter:B:19:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x002f A[SYNTHETIC, Splitter:B:25:0x002f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m118495a(java.lang.String r3, int r4, int r5) {
        /*
            r4 = 0
            r5 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x002d, all -> 0x0025 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x002d, all -> 0x0025 }
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            r1 = 1
            r3.inJustDecodeBounds = r1     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            android.graphics.BitmapFactory.decodeStream(r0, r5, r3)     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            int r5 = r3.outWidth     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            r2 = 250(0xfa, float:3.5E-43)
            if (r2 > r5) goto L_0x001c
            int r3 = r3.outHeight     // Catch:{ FileNotFoundException -> 0x0023, all -> 0x0021 }
            if (r2 <= r3) goto L_0x001d
        L_0x001c:
            r4 = 1
        L_0x001d:
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            return r4
        L_0x0021:
            r3 = move-exception
            goto L_0x0027
        L_0x0023:
            r5 = r0
            goto L_0x002d
        L_0x0025:
            r3 = move-exception
            r0 = r5
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            throw r3
        L_0x002d:
            if (r5 == 0) goto L_0x0032
            r5.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.util.C36761s.m118495a(java.lang.String, int, int):boolean");
    }
}
