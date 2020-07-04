package android.support.p022v4.util;

import java.io.PrintWriter;

/* renamed from: android.support.v4.util.m */
public final class C0906m {

    /* renamed from: a */
    private static final Object f3168a = new Object();

    /* renamed from: b */
    private static char[] f3169b = new char[24];

    /* renamed from: a */
    private static int m3870a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static void m3874a(long j, PrintWriter printWriter) {
        m3875a(j, printWriter, 0);
    }

    /* renamed from: a */
    private static int m3871a(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        int i11;
        long j2 = j;
        int i12 = i;
        if (f3169b.length < i12) {
            f3169b = new char[i12];
        }
        char[] cArr = f3169b;
        if (j2 == 0) {
            int i13 = i12 - 1;
            while (i13 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i14 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i15 = floor / 60;
            i4 = floor - (i15 * 60);
            i5 = i15;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i12 != 0) {
            int a = m3870a(i2, 1, false, 0);
            if (a > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int a2 = a + m3870a(i3, 1, z5, 2);
            if (a2 > 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int a3 = a2 + m3870a(i5, 1, z6, 2);
            if (a3 > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int a4 = a3 + m3870a(i4, 1, z7, 2);
            if (a4 > 0) {
                i11 = 3;
            } else {
                i11 = 0;
            }
            i6 = 0;
            for (int a5 = a4 + m3870a(i14, 2, true, i11) + 1; a5 < i12; a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i16 = i6 + 1;
        if (i12 != 0) {
            z = true;
        } else {
            z = false;
        }
        int i17 = i16;
        int a6 = m3872a(cArr, i2, 'd', i16, false, 0);
        if (a6 != i17) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        int a7 = m3872a(cArr, i3, 'h', a6, z2, i7);
        if (a7 != i17) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        int a8 = m3872a(cArr, i5, 'm', a7, z3, i8);
        if (a8 != i17) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        int a9 = m3872a(cArr, i4, 's', a8, z4, i9);
        if (!z || a9 == i17) {
            i10 = 0;
        } else {
            i10 = 3;
        }
        int a10 = m3872a(cArr, i14, 'm', a9, true, i10);
        cArr[a10] = 's';
        return a10 + 1;
    }

    /* renamed from: a */
    public static void m3873a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m3875a(j - j2, printWriter, 0);
        }
    }

    /* renamed from: a */
    private static void m3875a(long j, PrintWriter printWriter, int i) {
        synchronized (f3168a) {
            printWriter.print(new String(f3169b, 0, m3871a(j, 0)));
        }
    }

    /* renamed from: a */
    private static int m3872a(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }
}
