package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class bas {

    /* renamed from: a */
    private static final bau f41350a;

    /* renamed from: a */
    public static boolean m48226a(byte[] bArr) {
        return f41350a.mo40462a(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m48228b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m48229b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m48230b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    public static boolean m48227a(byte[] bArr, int i, int i2) {
        return f41350a.mo40462a(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m48233d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m48228b(b);
            case 1:
                return m48229b(b, bArr[i]);
            case 2:
                return m48230b((int) b, (int) bArr[i], (int) bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    static int m48223a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new baw(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static int m48224a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f41350a.mo40460a(charSequence, bArr, i, i2);
    }

    /* renamed from: b */
    static String m48231b(byte[] bArr, int i, int i2) throws zzcdx {
        return f41350a.mo40463b(bArr, i, i2);
    }

    /* renamed from: a */
    static void m48225a(CharSequence charSequence, ByteBuffer byteBuffer) {
        bau bau = f41350a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m48224a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            bau.mo40461a(charSequence, byteBuffer);
        } else {
            bau.m48249b(charSequence, byteBuffer);
        }
    }

    static {
        bau bau;
        if (!(baq.m48145a() && baq.m48150b()) || awg.m47418a()) {
            bau = new bav();
        } else {
            bau = new bax();
        }
        f41350a = bau;
    }
}
