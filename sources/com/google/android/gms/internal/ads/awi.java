package com.google.android.gms.internal.ads;

import java.io.IOException;

final class awi {
    /* renamed from: a */
    static int m47428a(byte[] bArr, int i, awj awj) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m47423a((int) b, bArr, i2, awj);
        }
        awj.f41128a = b;
        return i2;
    }

    /* renamed from: a */
    static int m47423a(int i, byte[] bArr, int i2, awj awj) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            awj.f41128a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            awj.f41128a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            awj.f41128a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            awj.f41128a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                awj.f41128a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: b */
    static int m47430b(byte[] bArr, int i, awj awj) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            awj.f41129b = j;
            return i2;
        }
        long j2 = j & 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = j2 | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        awj.f41129b = j3;
        return i3;
    }

    /* renamed from: a */
    static int m47427a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    static long m47431b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: c */
    static double m47432c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m47431b(bArr, i));
    }

    /* renamed from: d */
    static float m47434d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m47427a(bArr, i));
    }

    /* renamed from: c */
    static int m47433c(byte[] bArr, int i, awj awj) throws zzcdx {
        int a = m47428a(bArr, i, awj);
        int i2 = awj.f41128a;
        if (i2 < 0) {
            throw zzcdx.zzatv();
        } else if (i2 == 0) {
            awj.f41130c = "";
            return a;
        } else {
            awj.f41130c = new String(bArr, a, i2, axw.f41216a);
            return a + i2;
        }
    }

    /* renamed from: d */
    static int m47435d(byte[] bArr, int i, awj awj) throws zzcdx {
        int a = m47428a(bArr, i, awj);
        int i2 = awj.f41128a;
        if (i2 < 0) {
            throw zzcdx.zzatv();
        } else if (i2 == 0) {
            awj.f41130c = "";
            return a;
        } else {
            awj.f41130c = bas.m48231b(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: e */
    static int m47436e(byte[] bArr, int i, awj awj) throws zzcdx {
        int a = m47428a(bArr, i, awj);
        int i2 = awj.f41128a;
        if (i2 < 0) {
            throw zzcdx.zzatv();
        } else if (i2 > bArr.length - a) {
            throw zzcdx.zzatu();
        } else if (i2 == 0) {
            awj.f41130c = zzcce.zzfuo;
            return a;
        } else {
            awj.f41130c = zzcce.zzi(bArr, a, i2);
            return a + i2;
        }
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m47426a(com.google.android.gms.internal.ads.azs r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.awj r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m47423a(r8, r7, r0, r10)
            int r8 = r10.f41128a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo40345a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo40348a(r1, r2, r3, r4, r5)
            r6.mo40352c(r9)
            r10.f41130c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.zzcdx r6 = com.google.android.gms.internal.ads.zzcdx.zzatu()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.awi.m47426a(com.google.android.gms.internal.ads.azs, byte[], int, int, com.google.android.gms.internal.ads.awj):int");
    }

    /* renamed from: a */
    static int m47425a(azs azs, byte[] bArr, int i, int i2, int i3, awj awj) throws IOException {
        azf azf = (azf) azs;
        Object a = azf.mo40345a();
        int a2 = azf.mo40344a(a, bArr, i, i2, i3, awj);
        azf.mo40352c(a);
        awj.f41130c = a;
        return a2;
    }

    /* renamed from: a */
    static int m47421a(int i, byte[] bArr, int i2, int i3, ayc<?> ayc, awj awj) {
        axv axv = (axv) ayc;
        int a = m47428a(bArr, i2, awj);
        axv.mo40296d(awj.f41128a);
        while (a < i3) {
            int a2 = m47428a(bArr, a, awj);
            if (i != awj.f41128a) {
                break;
            }
            a = m47428a(bArr, a2, awj);
            axv.mo40296d(awj.f41128a);
        }
        return a;
    }

    /* renamed from: a */
    static int m47429a(byte[] bArr, int i, ayc<?> ayc, awj awj) throws IOException {
        axv axv = (axv) ayc;
        int a = m47428a(bArr, i, awj);
        int i2 = awj.f41128a + a;
        while (a < i2) {
            a = m47428a(bArr, a, awj);
            axv.mo40296d(awj.f41128a);
        }
        if (a == i2) {
            return a;
        }
        throw zzcdx.zzatu();
    }

    /* renamed from: a */
    static int m47424a(azs<?> azs, int i, byte[] bArr, int i2, int i3, ayc<?> ayc, awj awj) throws IOException {
        int a = m47426a((azs) azs, bArr, i2, i3, awj);
        ayc.add(awj.f41130c);
        while (a < i3) {
            int a2 = m47428a(bArr, a, awj);
            if (i != awj.f41128a) {
                break;
            }
            a = m47426a((azs) azs, bArr, a2, i3, awj);
            ayc.add(awj.f41130c);
        }
        return a;
    }

    /* renamed from: a */
    static int m47422a(int i, byte[] bArr, int i2, int i3, bal bal, awj awj) throws zzcdx {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 5) {
                switch (i4) {
                    case 0:
                        int b = m47430b(bArr, i2, awj);
                        bal.mo40419a(i, (Object) Long.valueOf(awj.f41129b));
                        return b;
                    case 1:
                        bal.mo40419a(i, (Object) Long.valueOf(m47431b(bArr, i2)));
                        return i2 + 8;
                    case 2:
                        int a = m47428a(bArr, i2, awj);
                        int i5 = awj.f41128a;
                        if (i5 < 0) {
                            throw zzcdx.zzatv();
                        } else if (i5 <= bArr.length - a) {
                            if (i5 == 0) {
                                bal.mo40419a(i, (Object) zzcce.zzfuo);
                            } else {
                                bal.mo40419a(i, (Object) zzcce.zzi(bArr, a, i5));
                            }
                            return a + i5;
                        } else {
                            throw zzcdx.zzatu();
                        }
                    case 3:
                        bal b2 = bal.m48099b();
                        int i6 = (i & -8) | 4;
                        int i7 = 0;
                        while (true) {
                            if (i2 < i3) {
                                int a2 = m47428a(bArr, i2, awj);
                                int i8 = awj.f41128a;
                                if (i8 != i6) {
                                    i7 = i8;
                                    i2 = m47422a(i8, bArr, a2, i3, b2, awj);
                                } else {
                                    i7 = i8;
                                    i2 = a2;
                                }
                            }
                        }
                        if (i2 > i3 || i7 != i6) {
                            throw zzcdx.zzaua();
                        }
                        bal.mo40419a(i, (Object) b2);
                        return i2;
                    default:
                        throw zzcdx.zzatx();
                }
            } else {
                bal.mo40419a(i, (Object) Integer.valueOf(m47427a(bArr, i2)));
                return i2 + 4;
            }
        } else {
            throw zzcdx.zzatx();
        }
    }

    /* renamed from: a */
    static int m47420a(int i, byte[] bArr, int i2, int i3, awj awj) throws zzcdx {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 5) {
                return i2 + 4;
            }
            switch (i4) {
                case 0:
                    return m47430b(bArr, i2, awj);
                case 1:
                    return i2 + 8;
                case 2:
                    return m47428a(bArr, i2, awj) + awj.f41128a;
                case 3:
                    int i5 = (i & -8) | 4;
                    int i6 = 0;
                    while (i2 < i3) {
                        i2 = m47428a(bArr, i2, awj);
                        i6 = awj.f41128a;
                        if (i6 != i5) {
                            i2 = m47420a(i6, bArr, i2, i3, awj);
                        } else if (i2 > i3 && i6 == i5) {
                            return i2;
                        } else {
                            throw zzcdx.zzaua();
                        }
                    }
                    if (i2 > i3) {
                    }
                    throw zzcdx.zzaua();
                default:
                    throw zzcdx.zzatx();
            }
        } else {
            throw zzcdx.zzatx();
        }
    }
}
