package com.facebook.common.p689f;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: com.facebook.common.f.c */
public final class C13296c {

    /* renamed from: a */
    public static final boolean f35194a;

    /* renamed from: b */
    public static final boolean f35195b;

    /* renamed from: c */
    public static final boolean f35196c = m38902b();

    /* renamed from: d */
    public static C13294b f35197d = null;

    /* renamed from: e */
    private static boolean f35198e = false;

    /* renamed from: f */
    private static final byte[] f35199f = m38901a("RIFF");

    /* renamed from: g */
    private static final byte[] f35200g = m38901a("WEBP");

    /* renamed from: h */
    private static final byte[] f35201h = m38901a("VP8 ");

    /* renamed from: i */
    private static final byte[] f35202i = m38901a("VP8L");

    /* renamed from: j */
    private static final byte[] f35203j = m38901a("VP8X");

    /* renamed from: a */
    public static C13294b m38897a() {
        if (f35198e) {
            return f35197d;
        }
        C13294b bVar = null;
        try {
            bVar = (C13294b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable unused) {
        }
        f35198e = true;
        return bVar;
    }

    /* renamed from: b */
    private static boolean m38902b() {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (VERSION.SDK_INT == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (!(options.outHeight == 1 && options.outWidth == 1)) {
                return false;
            }
        }
        return true;
    }

    static {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT <= 17) {
            z = true;
        } else {
            z = false;
        }
        f35194a = z;
        if (VERSION.SDK_INT < 14) {
            z2 = false;
        }
        f35195b = z2;
    }

    /* renamed from: a */
    private static byte[] m38901a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    public static boolean m38903b(byte[] bArr, int i) {
        return m38900a(bArr, 12, f35201h);
    }

    /* renamed from: c */
    public static boolean m38905c(byte[] bArr, int i) {
        return m38900a(bArr, 12, f35202i);
    }

    /* renamed from: d */
    public static boolean m38906d(byte[] bArr, int i) {
        boolean z;
        boolean a = m38900a(bArr, 12, f35203j);
        if ((bArr[20] & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        if (!a || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m38898a(byte[] bArr, int i) {
        boolean z;
        boolean a = m38900a(bArr, 12, f35203j);
        if ((bArr[20] & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!a || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m38904b(byte[] bArr, int i, int i2) {
        if (i2 < 20 || !m38900a(bArr, i, f35199f) || !m38900a(bArr, i + 8, f35200g)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m38899a(byte[] bArr, int i, int i2) {
        if (i2 < 21 || !m38900a(bArr, 12, f35203j)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m38900a(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
