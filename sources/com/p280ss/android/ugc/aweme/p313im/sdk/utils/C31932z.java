package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.text.TextUtils;
import com.bytedance.common.utility.p482io.FileUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.generic.C13439b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.z */
public final class C31932z {
    /* renamed from: a */
    private static boolean m103705a(int[] iArr, int i, int i2) {
        boolean z = i > i2;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        int i4 = 1920;
        int i5 = 1080;
        if (i3 <= 1080 && i <= 1920) {
            return false;
        }
        float f = ((float) i3) / ((float) i);
        if (f >= 0.5625f) {
            i4 = (int) (1080.0f / f);
        } else {
            i5 = (int) (f * 1920.0f);
        }
        iArr[0] = z ? i4 : i5;
        if (z) {
            i4 = i5;
        }
        iArr[1] = i4;
        return true;
    }

    /* renamed from: a */
    private static boolean m103706a(int[] iArr, int i, int i2, int i3, int i4) {
        if (i <= i3 && i <= i4) {
            return false;
        }
        float f = ((float) i) / ((float) i2);
        float f2 = (float) i3;
        float f3 = (float) i4;
        if (f > f2 / f3) {
            i4 = (int) (f2 / f);
        } else {
            i3 = (int) (f3 * f);
        }
        iArr[0] = i3;
        iArr[1] = i4;
        return true;
    }

    /* renamed from: a */
    private static boolean m103704a(File file) {
        return file.getParentFile().exists() || file.getParentFile().mkdirs();
    }

    /* renamed from: a */
    private static String m103702a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                StringBuilder sb = new StringBuilder("0");
                sb.append(hexString);
                hexString = sb.toString();
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static void m103703a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2) {
        if (remoteImageView != null && remoteImageView.getContext() != null) {
            C13439b bVar = new C13439b(remoteImageView.getContext().getResources());
            bVar.mo32917b(i2);
            bVar.mo32923d(i);
            remoteImageView.setHierarchy(bVar.mo32908a());
            C23323e.m76524b(remoteImageView, urlModel);
        }
    }

    /* renamed from: a */
    private static int m103695a(Options options) {
        boolean z;
        int i;
        if (options.outWidth > options.outHeight) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 1080;
        if (z) {
            i = 1920;
        } else {
            i = 1080;
        }
        if (!z) {
            i2 = 1920;
        }
        return m103696a(options, i, i2);
    }

    /* renamed from: c */
    public static void m103708c(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(m103701a(str));
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* renamed from: e */
    public static boolean m103710e(String str) {
        if (str == null || !str.toLowerCase().equals("gif")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m103711f(String str) {
        if (str == null || !str.toLowerCase().equals("webp")) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static String m103712g(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return m103702a(instance.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m103707b(String str) {
        if (!TextUtils.isEmpty(str) && FileUtils.m28679c(str)) {
            String g = m103712g(str);
            if (!TextUtils.isEmpty(g)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C6399b.m19921a().getFilesDir().getPath());
                sb.append("/check/");
                sb.append(g);
                sb.append(".jpg");
                return sb.toString();
            }
        }
        return str;
    }

    /* renamed from: d */
    public static String m103709d(String str) {
        File file = new File(str);
        if (file.length() > 524288) {
            return C31860af.m103521a(C31905f.m103641a((InputStream) C31905f.m103637a(str)));
        }
        return C31860af.m103520a(file);
    }

    /* renamed from: a */
    public static String m103701a(String str) {
        if (!TextUtils.isEmpty(str) && FileUtils.m28679c(str)) {
            String g = m103712g(str);
            if (!TextUtils.isEmpty(g)) {
                StringBuilder sb = new StringBuilder();
                sb.append(C6399b.m19921a().getFilesDir().getPath());
                sb.append("/thumb/");
                sb.append(g);
                sb.append(".jpg");
                return sb.toString();
            }
        }
        return str;
    }

    /* renamed from: a */
    public static int m103697a(String str, String str2) {
        if (!FileUtils.m28679c(str) || FileUtils.m28673a(new File(str))) {
            return 1;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int[] iArr = new int[2];
        if (!m103705a(iArr, options.outWidth, options.outHeight)) {
            return 1;
        }
        Bitmap a = m103699a(str, options, iArr[0], iArr[1]);
        if (a == null || TextUtils.isEmpty(str2)) {
            return 2;
        }
        File a2 = m103700a(a, str2);
        if (!a2.exists() || a2.length() > 3145728) {
            return 2;
        }
        return 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021 A[SYNTHETIC, Splitter:B:13:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0027 A[SYNTHETIC, Splitter:B:19:0x0027] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File m103700a(android.graphics.Bitmap r3, java.lang.String r4) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            m103704a(r0)
            r4 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0025, all -> 0x001e }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0025, all -> 0x001e }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x001c, all -> 0x0019 }
            r2 = 100
            r3.compress(r4, r2, r1)     // Catch:{ FileNotFoundException -> 0x001c, all -> 0x0019 }
            r1.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x002a
        L_0x0019:
            r3 = move-exception
            r4 = r1
            goto L_0x001f
        L_0x001c:
            r4 = r1
            goto L_0x0025
        L_0x001e:
            r3 = move-exception
        L_0x001f:
            if (r4 == 0) goto L_0x0024
            r4.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            throw r3
        L_0x0025:
            if (r4 == 0) goto L_0x002a
            r4.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31932z.m103700a(android.graphics.Bitmap, java.lang.String):java.io.File");
    }

    /* renamed from: a */
    private static int m103696a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    public static int m103698a(String str, String str2, int i, int i2) {
        Bitmap bitmap;
        if (!FileUtils.m28679c(str) || FileUtils.m28673a(new File(str))) {
            return 1;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int[] iArr = new int[2];
        if (!m103706a(iArr, options.outWidth, options.outHeight, i, i2)) {
            bitmap = BitmapFactory.decodeFile(str);
        } else {
            bitmap = m103699a(str, options, iArr[0], iArr[1]);
        }
        if (bitmap == null || TextUtils.isEmpty(str2) || !m103700a(bitmap, str2).exists()) {
            return 2;
        }
        return 3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x001a */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0015  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m103699a(java.lang.String r3, android.graphics.BitmapFactory.Options r4, int r5, int r6) {
        /*
            r0 = 0
            r1 = 0
            r4.inJustDecodeBounds = r0     // Catch:{ OutOfMemoryError -> 0x0019, Exception -> 0x0012 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r3, r4)     // Catch:{ OutOfMemoryError -> 0x0019, Exception -> 0x0012 }
            if (r0 == 0) goto L_0x0010
            r2 = 1
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r0, r5, r6, r2)     // Catch:{ OutOfMemoryError -> 0x001a, Exception -> 0x0013 }
            goto L_0x0024
        L_0x0010:
            r5 = r0
            goto L_0x0024
        L_0x0012:
            r0 = r1
        L_0x0013:
            if (r0 == 0) goto L_0x0018
            r0.recycle()
        L_0x0018:
            return r1
        L_0x0019:
            r0 = r1
        L_0x001a:
            int r5 = m103695a(r4)     // Catch:{ Exception -> 0x0025 }
            r4.inSampleSize = r5     // Catch:{ Exception -> 0x0025 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r3, r4)     // Catch:{ Exception -> 0x0025 }
        L_0x0024:
            return r5
        L_0x0025:
            if (r0 == 0) goto L_0x002b
            r0.recycle()
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31932z.m103699a(java.lang.String, android.graphics.BitmapFactory$Options, int, int):android.graphics.Bitmap");
    }
}
