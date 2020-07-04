package shark.internal;

import kotlin.jvm.internal.C7573i;

/* renamed from: shark.internal.b */
public final class C48762b {
    /* renamed from: a */
    public static final short m150580a(byte[] bArr, int i) {
        C7573i.m23587b(bArr, "$this$readShort");
        int i2 = i + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: b */
    public static final int m150581b(byte[] bArr, int i) {
        C7573i.m23587b(bArr, "$this$readInt");
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        return (bArr[i3 + 1] & 255) | b | ((bArr[i3] & 255) << 8);
    }

    /* renamed from: c */
    public static final long m150582c(byte[] bArr, int i) {
        C7573i.m23587b(bArr, "$this$readLong");
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        return (((long) bArr[i7 + 1]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8);
    }
}
