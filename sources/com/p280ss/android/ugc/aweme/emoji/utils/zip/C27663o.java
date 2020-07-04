package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import java.math.BigInteger;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.o */
public final class C27663o {

    /* renamed from: b */
    public static final C27663o f72881b = new C27663o(0);

    /* renamed from: a */
    public final BigInteger f72882a;

    /* renamed from: b */
    public final long mo71066b() {
        return this.f72882a.longValue();
    }

    public final int hashCode() {
        return this.f72882a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZipEightByteInteger value: ");
        sb.append(this.f72882a);
        return sb.toString();
    }

    /* renamed from: a */
    public final byte[] mo71065a() {
        return m90713a(this.f72882a);
    }

    public C27663o(long j) {
        this(BigInteger.valueOf(j));
    }

    /* renamed from: a */
    public static long m90710a(byte[] bArr) {
        return m90711a(bArr, 0);
    }

    private C27663o(BigInteger bigInteger) {
        this.f72882a = bigInteger;
    }

    /* renamed from: a */
    public static byte[] m90712a(long j) {
        return m90713a(BigInteger.valueOf(j));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C27663o)) {
            return false;
        }
        return this.f72882a.equals(((C27663o) obj).f72882a);
    }

    /* renamed from: a */
    private static byte[] m90713a(BigInteger bigInteger) {
        long longValue = bigInteger.longValue();
        byte[] bArr = {(byte) ((int) (255 & longValue)), (byte) ((int) ((65280 & longValue) >> 8)), (byte) ((int) ((16711680 & longValue) >> 16)), (byte) ((int) ((4278190080L & longValue) >> 24)), (byte) ((int) ((1095216660480L & longValue) >> 32)), (byte) ((int) ((280375465082880L & longValue) >> 40)), (byte) ((int) ((71776119061217280L & longValue) >> 48)), (byte) ((int) ((longValue & 9151314442816847872L) >> 56))};
        if (bigInteger.testBit(63)) {
            bArr[7] = (byte) (bArr[7] | Byte.MIN_VALUE);
        }
        return bArr;
    }

    /* renamed from: a */
    private static long m90711a(byte[] bArr, int i) {
        return m90714b(bArr, 0).longValue();
    }

    public C27663o(byte[] bArr, int i) {
        this.f72882a = m90714b(bArr, i);
    }

    /* renamed from: b */
    private static BigInteger m90714b(byte[] bArr, int i) {
        int i2 = i + 7;
        BigInteger valueOf = BigInteger.valueOf(((((long) bArr[i2]) << 56) & 9151314442816847872L) + ((((long) bArr[i + 6]) << 48) & 71776119061217280L) + ((((long) bArr[i + 5]) << 40) & 280375465082880L) + ((((long) bArr[i + 4]) << 32) & 1095216660480L) + ((((long) bArr[i + 3]) << 24) & 4278190080L) + ((((long) bArr[i + 2]) << 16) & 16711680) + ((((long) bArr[i + 1]) << 8) & 65280) + (((long) bArr[i]) & 255));
        if ((bArr[i2] & Byte.MIN_VALUE) == Byte.MIN_VALUE) {
            return valueOf.setBit(63);
        }
        return valueOf;
    }
}
