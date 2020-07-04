package com.p280ss.android.ugc.aweme.photo;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.ss.android.ugc.aweme.photo.h */
public final class C34754h {

    /* renamed from: a */
    private static final byte[] f90591a = {71, 73, 70, 56, 55, 97};

    /* renamed from: b */
    private static final byte[] f90592b = {71, 73, 70, 56, 57, 97};

    /* renamed from: c */
    private static final byte[] f90593c = {-1, -40, -1};

    /* renamed from: d */
    private static final byte[] f90594d = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: e */
    private static final byte[] f90595e = {66, 77};

    /* renamed from: f */
    private static final byte[] f90596f = {82, 73, 70, 70, 87, 69, 66, 80};

    /* renamed from: g */
    private static final byte[] f90597g = {0, 0, 0, 0, 102, 116, 121, 112};

    /* renamed from: h */
    private static final byte[] f90598h = {102, 116, 121, 112, 51, 103};

    /* renamed from: a */
    private static void m112124a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private static boolean m112127c(byte[] bArr) {
        byte[] bArr2 = f90597g;
        if (bArr == null || bArr.length != 12) {
            return false;
        }
        for (int i = 4; i < 8; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m112122a(String str) {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(new File(str)));
            try {
                byte[] bArr = new byte[12];
                bufferedInputStream2.read(bArr);
                String a = m112123a(bArr);
                m112124a((Closeable) bufferedInputStream2);
                return a;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                m112124a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            m112124a((Closeable) bufferedInputStream);
            throw th;
        }
    }

    /* renamed from: b */
    private static boolean m112126b(byte[] bArr) {
        byte[] bArr2 = f90596f;
        if (bArr == null || bArr.length != 12) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (bArr[(bArr.length - i2) - 1] != bArr2[(bArr2.length - i2) - 1]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static String m112123a(byte[] bArr) {
        if (m112125a(bArr, f90592b) || m112125a(bArr, f90591a)) {
            return "image/gif";
        }
        if (m112125a(bArr, f90593c)) {
            return "image/jpg";
        }
        if (m112125a(bArr, f90594d)) {
            return "image/png";
        }
        if (m112125a(bArr, f90595e)) {
            return "image/bmp";
        }
        if (m112126b(bArr)) {
            return "image/webp";
        }
        if (m112127c(bArr)) {
            return "video/avc";
        }
        if (m112125a(bArr, f90598h)) {
            return "video/3gpp";
        }
        return "";
    }

    /* renamed from: a */
    private static boolean m112125a(byte[] bArr, byte[] bArr2) {
        boolean z = false;
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= bArr2.length) {
                z = true;
                break;
            } else if (bArr[i] != bArr2[i]) {
                break;
            } else {
                i++;
            }
        }
        return z;
    }
}
