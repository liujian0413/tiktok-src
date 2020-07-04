package com.fasterxml.jackson.core.p737io;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.Arrays;

/* renamed from: com.fasterxml.jackson.core.io.b */
public final class C14673b {

    /* renamed from: a */
    static final int[] f37924a;

    /* renamed from: b */
    static final int[] f37925b;

    /* renamed from: c */
    static final int[] f37926c;

    /* renamed from: d */
    static final int[] f37927d;

    /* renamed from: e */
    static final int[] f37928e = new int[256];

    /* renamed from: f */
    static final int[] f37929f;

    /* renamed from: g */
    static final int[] f37930g;

    /* renamed from: h */
    private static final char[] f37931h;

    /* renamed from: i */
    private static final byte[] f37932i;

    /* renamed from: a */
    public static int[] m42437a() {
        return f37924a;
    }

    /* renamed from: b */
    public static int[] m42438b() {
        return f37925b;
    }

    /* renamed from: c */
    public static int[] m42439c() {
        return f37929f;
    }

    /* renamed from: d */
    public static char[] m42440d() {
        return (char[]) f37931h.clone();
    }

    /* renamed from: e */
    public static byte[] m42441e() {
        return (byte[]) f37932i.clone();
    }

    static {
        int i;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f37931h = charArray;
        int length = charArray.length;
        f37932i = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            f37932i[i2] = (byte) f37931h[i2];
        }
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f37924a = iArr;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(f37924a, 0, iArr2, 0, f37924a.length);
        for (int i4 = PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH; i4 < 256; i4++) {
            if ((i4 & 224) == 192) {
                i = 2;
            } else if ((i4 & 240) == 224) {
                i = 3;
            } else if ((i4 & 248) == 240) {
                i = 4;
            } else {
                i = -1;
            }
            iArr2[i4] = i;
        }
        f37925b = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f37926c = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(f37926c, 0, iArr4, 0, f37926c.length);
        Arrays.fill(iArr4, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, 0);
        f37927d = iArr4;
        System.arraycopy(f37925b, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, f37928e, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        Arrays.fill(f37928e, 0, 32, -1);
        f37928e[9] = 0;
        f37928e[10] = 10;
        f37928e[13] = 13;
        f37928e[42] = 42;
        int[] iArr5 = new int[PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr5[i6] = -1;
        }
        iArr5[34] = 34;
        iArr5[92] = 92;
        iArr5[8] = 98;
        iArr5[9] = 116;
        iArr5[12] = 102;
        iArr5[10] = 110;
        iArr5[13] = 114;
        f37929f = iArr5;
        int[] iArr6 = new int[PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH];
        f37930g = iArr6;
        Arrays.fill(iArr6, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            f37930g[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int i9 = i8 + 10;
            f37930g[i8 + 97] = i9;
            f37930g[i8 + 65] = i9;
        }
    }

    /* renamed from: a */
    public static void m42436a(StringBuilder sb, String str) {
        int[] iArr = f37929f;
        int length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt >= length || iArr[charAt] == 0) {
                sb.append(charAt);
            } else {
                sb.append('\\');
                int i2 = iArr[charAt];
                if (i2 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    int i3 = -(i2 + 1);
                    sb.append(f37931h[i3 >> 4]);
                    sb.append(f37931h[i3 & 15]);
                } else {
                    sb.append((char) i2);
                }
            }
        }
    }
}
