package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.measurement.ka */
final class C16664ka {

    /* renamed from: a */
    private static final C16666kc f46566a;

    /* renamed from: a */
    public static boolean m54646a(byte[] bArr) {
        return f46566a.mo43111a(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m54648b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m54649b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m54650b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    public static boolean m54647a(byte[] bArr, int i, int i2) {
        return f46566a.mo43111a(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m54653d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m54648b(b);
            case 1:
                return m54649b(b, bArr[i]);
            case 2:
                return m54650b((int) b, (int) bArr[i], (int) bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    static int m54643a(CharSequence charSequence) {
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
                                throw new C16668ke(i2, length2);
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
    static int m54644a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f46566a.mo43109a(charSequence, bArr, i, i2);
    }

    /* renamed from: b */
    static String m54651b(byte[] bArr, int i, int i2) throws zzuv {
        return f46566a.mo43112b(bArr, i, i2);
    }

    /* renamed from: a */
    static void m54645a(CharSequence charSequence, ByteBuffer byteBuffer) {
        C16666kc kcVar = f46566a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m54644a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            kcVar.mo43110a(charSequence, byteBuffer);
        } else {
            C16666kc.m54669b(charSequence, byteBuffer);
        }
    }

    static {
        C16666kc kcVar;
        if (!(C16657jy.m54556a() && C16657jy.m54561b()) || C16539fu.m53895a()) {
            kcVar = new C16667kd();
        } else {
            kcVar = new C16669kf();
        }
        f46566a = kcVar;
    }
}
