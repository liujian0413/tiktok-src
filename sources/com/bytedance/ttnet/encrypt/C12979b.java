package com.bytedance.ttnet.encrypt;

import android.util.Base64;
import android.util.Pair;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ttnet.encrypt.TtTokenConfig.C12977a;
import com.bytedance.ttnet.utils.C13000c;
import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: com.bytedance.ttnet.encrypt.b */
public final class C12979b {

    /* renamed from: a */
    private static final byte[] f34376a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: a */
    private static byte[] m37833a() {
        try {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            return bArr;
        } catch (Throwable unused) {
            return f34376a;
        }
    }

    /* renamed from: a */
    private static byte[] m37834a(byte[]... bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            if (bArr[i2] != null && bArr[i2].length > 0) {
                i += bArr[i2].length;
            }
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            if (bArr[i4] != null && bArr[i4].length > 0) {
                System.arraycopy(bArr[i4], 0, bArr2, i3, bArr[i4].length);
                i3 += bArr[i4].length;
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public static Pair<Boolean, String> m37831a(C12977a aVar, String str) {
        if (C6319n.m19593a(str) || aVar == null) {
            return new Pair<>(Boolean.valueOf(false), str);
        }
        try {
            byte[] bArr = aVar.f34374e;
            if (bArr == null) {
                return new Pair<>(Boolean.valueOf(false), str);
            }
            byte[] a = C13000c.m37931a(str.getBytes(), bArr);
            if (a != null) {
                if (a.length > 0) {
                    return new Pair<>(Boolean.valueOf(true), Base64.encodeToString(a, 2));
                }
            }
            return new Pair<>(Boolean.valueOf(false), str);
        } catch (Throwable unused) {
            return new Pair<>(Boolean.valueOf(false), str);
        }
    }

    /* renamed from: a */
    public static Pair<Boolean, byte[]> m37832a(C12977a aVar, byte[] bArr) {
        if (bArr == null || aVar == null) {
            return new Pair<>(Boolean.valueOf(false), bArr);
        }
        try {
            byte[] a = m37833a();
            byte[] bArr2 = aVar.f34373d;
            if (a != null) {
                if (bArr2 != null) {
                    byte[] b = C13000c.m37936b(bArr, bArr2, "AES/CBC/PKCS5Padding", a);
                    if (b != null) {
                        if (b.length > 0) {
                            byte[] bArr3 = aVar.f34374e;
                            if (bArr3 == null) {
                                return new Pair<>(Boolean.valueOf(false), bArr);
                            }
                            byte[] a2 = m37834a(a, b);
                            byte[] a3 = C13000c.m37931a(a2, bArr3);
                            if (a3 != null) {
                                if (a3.length > 0) {
                                    return new Pair<>(Boolean.valueOf(true), m37834a(a2, a3));
                                }
                            }
                            return new Pair<>(Boolean.valueOf(false), bArr);
                        }
                    }
                    return new Pair<>(Boolean.valueOf(false), bArr);
                }
            }
            return new Pair<>(Boolean.valueOf(false), bArr);
        } catch (Throwable unused) {
            return new Pair<>(Boolean.valueOf(false), bArr);
        }
    }

    /* renamed from: b */
    public static Pair<Boolean, byte[]> m37835b(C12977a aVar, byte[] bArr) {
        int i;
        if (bArr == null || aVar == null) {
            return new Pair<>(Boolean.valueOf(false), bArr);
        }
        if (bArr != null) {
            try {
                if (bArr.length >= 64) {
                    byte[] bArr2 = new byte[16];
                    System.arraycopy(bArr, 0, bArr2, 0, 16);
                    int length = bArr.length - 48;
                    byte[] bArr3 = new byte[length];
                    System.arraycopy(bArr, 16, bArr3, 0, length);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(bArr, bArr.length - 32, bArr4, 0, 32);
                    byte[] bArr5 = aVar.f34374e;
                    if (bArr5 == null) {
                        return new Pair<>(Boolean.valueOf(false), bArr);
                    }
                    byte[] a = C13000c.m37931a(m37834a(bArr2, bArr3), bArr5);
                    if (a != null) {
                        if (a.length > 0) {
                            if (!Arrays.equals(a, bArr4)) {
                                return new Pair<>(Boolean.valueOf(false), bArr);
                            }
                            byte[] bArr6 = aVar.f34373d;
                            if (bArr6 == null) {
                                return new Pair<>(Boolean.valueOf(false), bArr);
                            }
                            return new Pair<>(Boolean.valueOf(true), C13000c.m37938d(bArr3, bArr6, "AES/CBC/PKCS5Padding", bArr2));
                        }
                    }
                    return new Pair<>(Boolean.valueOf(false), bArr);
                }
            } catch (Throwable unused) {
                return new Pair<>(Boolean.valueOf(false), bArr);
            }
        }
        if (C6312h.m19578b()) {
            StringBuilder sb = new StringBuilder("decrypt fail for encrypted_bytes == ");
            sb.append(String.valueOf(bArr));
            sb.append(" || encrypted_bytes.length = ");
            if (bArr == null) {
                i = 0;
            } else {
                i = bArr.length;
            }
            sb.append(i);
        }
        return new Pair<>(Boolean.valueOf(false), bArr);
    }
}
