package com.p280ss.android.ugc.aweme.emoji.utils.zip;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.u */
public final class C27676u implements Cloneable {

    /* renamed from: b */
    public static final C27676u f72926b = new C27676u(33639248);

    /* renamed from: c */
    public static final C27676u f72927c = new C27676u(67324752);

    /* renamed from: d */
    public static final C27676u f72928d = new C27676u(134695760);

    /* renamed from: e */
    static final C27676u f72929e = new C27676u(4294967295L);

    /* renamed from: a */
    public final long f72930a;

    public final int hashCode() {
        return (int) this.f72930a;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZipLong value: ");
        sb.append(this.f72930a);
        return sb.toString();
    }

    /* renamed from: a */
    public final byte[] mo71099a() {
        return m90767a(this.f72930a);
    }

    private C27676u(long j) {
        this.f72930a = j;
    }

    /* renamed from: a */
    public static long m90765a(byte[] bArr) {
        return m90768b(bArr, 0);
    }

    /* renamed from: a */
    public static byte[] m90767a(long j) {
        byte[] bArr = new byte[4];
        m90766a(j, bArr, 0);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C27676u) || this.f72930a != ((C27676u) obj).f72930a) {
            return false;
        }
        return true;
    }

    public C27676u(byte[] bArr, int i) {
        this.f72930a = m90768b(bArr, i);
    }

    /* renamed from: a */
    public final void mo71098a(byte[] bArr, int i) {
        m90766a(this.f72930a, bArr, i);
    }

    /* renamed from: b */
    public static long m90768b(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] << 24)) & 4278190080L) + ((long) ((bArr[i + 2] << 16) & 16711680)) + ((long) ((bArr[i + 1] << 8) & 65280)) + ((long) (bArr[i] & 255));
    }

    /* renamed from: a */
    public static void m90766a(long j, byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (255 & j));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((65280 & j) >> 8));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((16711680 & j) >> 16));
        bArr[i4] = (byte) ((int) ((j & 4278190080L) >> 24));
    }
}
