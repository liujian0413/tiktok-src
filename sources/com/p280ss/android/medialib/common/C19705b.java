package com.p280ss.android.medialib.common;

import android.media.ExifInterface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.IOException;

/* renamed from: com.ss.android.medialib.common.b */
public class C19705b {

    /* renamed from: a */
    private static final String f53435a = "b";

    /* renamed from: a */
    public static int m64963a(String str) {
        ExifInterface exifInterface;
        try {
            exifInterface = new ExifInterface(str);
        } catch (IOException unused) {
            exifInterface = null;
        }
        if (exifInterface == null) {
            return 0;
        }
        int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
        if (attributeInt == 3) {
            return NormalGiftView.ALPHA_180;
        }
        if (attributeInt == 6) {
            return 90;
        }
        if (attributeInt != 8) {
            return 0;
        }
        return 270;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:18|17|23|24|(0)|(0)|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|9|10|11|12|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c A[SYNTHETIC, Splitter:B:26:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061 A[SYNTHETIC, Splitter:B:30:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a A[SYNTHETIC, Splitter:B:37:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006f A[SYNTHETIC, Splitter:B:41:0x006f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m64964a(android.graphics.Bitmap r3, java.lang.String r4, android.graphics.Bitmap.CompressFormat r5) {
        /*
            java.lang.String r0 = f53435a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Bitmap "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = "saving"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p280ss.android.vesdk.C45372t.m143403a(r0, r1)
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0053 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0053 }
            r0 = 100
            r3.compress(r5, r0, r2)     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            r2.flush()     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            java.lang.String r3 = f53435a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Bitmap "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = " saved!"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.p280ss.android.vesdk.C45372t.m143403a(r3, r4)
            return
        L_0x004a:
            r3 = move-exception
            r0 = r2
            goto L_0x0068
        L_0x004d:
            r0 = r2
            goto L_0x0053
        L_0x004f:
            r3 = move-exception
            r1 = r0
            goto L_0x0068
        L_0x0052:
            r1 = r0
        L_0x0053:
            java.lang.String r3 = f53435a     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = "Err when saving bitmap..."
            com.p280ss.android.vesdk.C45372t.m143409d(r3, r4)     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x005f
            r0.close()     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            if (r1 == 0) goto L_0x0066
            r1.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            return
        L_0x0067:
            r3 = move-exception
        L_0x0068:
            if (r0 == 0) goto L_0x006d
            r0.close()     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            if (r1 == 0) goto L_0x0072
            r1.close()     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.common.C19705b.m64964a(android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap$CompressFormat):void");
    }
}
