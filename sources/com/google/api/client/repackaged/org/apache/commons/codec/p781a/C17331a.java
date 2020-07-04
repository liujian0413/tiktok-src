package com.google.api.client.repackaged.org.apache.commons.codec.p781a;

/* renamed from: com.google.api.client.repackaged.org.apache.commons.codec.a.a */
public final class C17331a extends C17332b {

    /* renamed from: a */
    static final byte[] f48215a = {13, 10};

    /* renamed from: i */
    private static final byte[] f48216i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: j */
    private static final byte[] f48217j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: k */
    private static final byte[] f48218k = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: l */
    private final byte[] f48219l;

    /* renamed from: m */
    private final byte[] f48220m;

    /* renamed from: n */
    private final byte[] f48221n;

    /* renamed from: o */
    private final int f48222o;

    /* renamed from: p */
    private final int f48223p;

    /* renamed from: q */
    private int f48224q;

    public C17331a() {
        this(0);
    }

    private C17331a(int i) {
        this(0, f48215a);
    }

    /* renamed from: a */
    public static String m57713a(byte[] bArr) {
        return C17333c.m57729a(m57714a(bArr, false, true));
    }

    private C17331a(boolean z) {
        this(76, f48215a, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo44761a(byte b) {
        if (b < 0 || b >= this.f48220m.length || this.f48220m[b] == -1) {
            return false;
        }
        return true;
    }

    private C17331a(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    /* renamed from: a */
    private static byte[] m57714a(byte[] bArr, boolean z, boolean z2) {
        return m57715a(bArr, false, true, Integer.MAX_VALUE);
    }

    private C17331a(int i, byte[] bArr, boolean z) {
        int i2;
        byte[] bArr2;
        if (bArr == null) {
            i2 = 0;
        } else {
            i2 = bArr.length;
        }
        super(3, 4, i, i2);
        this.f48220m = f48218k;
        if (bArr == null) {
            this.f48223p = 4;
            this.f48221n = null;
        } else if (mo44764c(bArr)) {
            String a = C17333c.m57729a(bArr);
            StringBuilder sb = new StringBuilder("lineSeparator must not contain base64 characters: [");
            sb.append(a);
            sb.append("]");
            throw new IllegalArgumentException(sb.toString());
        } else if (i > 0) {
            this.f48223p = bArr.length + 4;
            this.f48221n = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f48221n, 0, bArr.length);
        } else {
            this.f48223p = 4;
            this.f48221n = null;
        }
        this.f48222o = this.f48223p - 1;
        if (z) {
            bArr2 = f48217j;
        } else {
            bArr2 = f48216i;
        }
        this.f48219l = bArr2;
    }

    /* JADX WARNING: type inference failed for: r2v36 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v2, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44760a(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f48230f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r10 >= 0) goto L_0x00d8
            r7.f48230f = r1
            int r8 = r7.f48232h
            if (r8 != 0) goto L_0x0014
            int r8 = r7.f48227c
            if (r8 != 0) goto L_0x0014
            return
        L_0x0014:
            int r8 = r7.f48223p
            r7.mo44762a(r8)
            int r8 = r7.f48229e
            int r9 = r7.f48232h
            r10 = 61
            switch(r9) {
                case 1: goto L_0x0071;
                case 2: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x00b3
        L_0x0024:
            byte[] r9 = r7.f48228d
            int r1 = r7.f48229e
            int r2 = r1 + 1
            r7.f48229e = r2
            byte[] r2 = r7.f48219l
            int r3 = r7.f48224q
            int r3 = r3 >> 10
            r3 = r3 & 63
            byte r2 = r2[r3]
            r9[r1] = r2
            byte[] r9 = r7.f48228d
            int r1 = r7.f48229e
            int r2 = r1 + 1
            r7.f48229e = r2
            byte[] r2 = r7.f48219l
            int r3 = r7.f48224q
            int r3 = r3 >> 4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r9[r1] = r2
            byte[] r9 = r7.f48228d
            int r1 = r7.f48229e
            int r2 = r1 + 1
            r7.f48229e = r2
            byte[] r2 = r7.f48219l
            int r3 = r7.f48224q
            int r3 = r3 << 2
            r3 = r3 & 63
            byte r2 = r2[r3]
            r9[r1] = r2
            byte[] r9 = r7.f48219l
            byte[] r1 = f48216i
            if (r9 != r1) goto L_0x00b3
            byte[] r9 = r7.f48228d
            int r1 = r7.f48229e
            int r2 = r1 + 1
            r7.f48229e = r2
            r9[r1] = r10
            goto L_0x00b3
        L_0x0071:
            byte[] r9 = r7.f48228d
            int r1 = r7.f48229e
            int r2 = r1 + 1
            r7.f48229e = r2
            byte[] r2 = r7.f48219l
            int r3 = r7.f48224q
            int r3 = r3 >> 2
            r3 = r3 & 63
            byte r2 = r2[r3]
            r9[r1] = r2
            byte[] r9 = r7.f48228d
            int r1 = r7.f48229e
            int r2 = r1 + 1
            r7.f48229e = r2
            byte[] r2 = r7.f48219l
            int r3 = r7.f48224q
            int r3 = r3 << 4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r9[r1] = r2
            byte[] r9 = r7.f48219l
            byte[] r1 = f48216i
            if (r9 != r1) goto L_0x00b3
            byte[] r9 = r7.f48228d
            int r1 = r7.f48229e
            int r2 = r1 + 1
            r7.f48229e = r2
            r9[r1] = r10
            byte[] r9 = r7.f48228d
            int r1 = r7.f48229e
            int r2 = r1 + 1
            r7.f48229e = r2
            r9[r1] = r10
        L_0x00b3:
            int r9 = r7.f48231g
            int r10 = r7.f48229e
            int r10 = r10 - r8
            int r9 = r9 + r10
            r7.f48231g = r9
            int r8 = r7.f48227c
            if (r8 <= 0) goto L_0x00d7
            int r8 = r7.f48231g
            if (r8 <= 0) goto L_0x00d7
            byte[] r8 = r7.f48221n
            byte[] r9 = r7.f48228d
            int r10 = r7.f48229e
            byte[] r1 = r7.f48221n
            int r1 = r1.length
            java.lang.System.arraycopy(r8, r0, r9, r10, r1)
            int r8 = r7.f48229e
            byte[] r9 = r7.f48221n
            int r9 = r9.length
            int r8 = r8 + r9
            r7.f48229e = r8
        L_0x00d7:
            return
        L_0x00d8:
            r2 = r9
            r9 = 0
        L_0x00da:
            if (r9 >= r10) goto L_0x0174
            int r3 = r7.f48223p
            r7.mo44762a(r3)
            int r3 = r7.f48232h
            int r3 = r3 + r1
            int r3 = r3 % 3
            r7.f48232h = r3
            int r3 = r2 + 1
            byte r2 = r8[r2]
            if (r2 >= 0) goto L_0x00f0
            int r2 = r2 + 256
        L_0x00f0:
            int r4 = r7.f48224q
            int r4 = r4 << 8
            int r4 = r4 + r2
            r7.f48224q = r4
            int r2 = r7.f48232h
            if (r2 != 0) goto L_0x016f
            byte[] r2 = r7.f48228d
            int r4 = r7.f48229e
            int r5 = r4 + 1
            r7.f48229e = r5
            byte[] r5 = r7.f48219l
            int r6 = r7.f48224q
            int r6 = r6 >> 18
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            byte[] r2 = r7.f48228d
            int r4 = r7.f48229e
            int r5 = r4 + 1
            r7.f48229e = r5
            byte[] r5 = r7.f48219l
            int r6 = r7.f48224q
            int r6 = r6 >> 12
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            byte[] r2 = r7.f48228d
            int r4 = r7.f48229e
            int r5 = r4 + 1
            r7.f48229e = r5
            byte[] r5 = r7.f48219l
            int r6 = r7.f48224q
            int r6 = r6 >> 6
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            byte[] r2 = r7.f48228d
            int r4 = r7.f48229e
            int r5 = r4 + 1
            r7.f48229e = r5
            byte[] r5 = r7.f48219l
            int r6 = r7.f48224q
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            int r2 = r7.f48231g
            int r2 = r2 + 4
            r7.f48231g = r2
            int r2 = r7.f48227c
            if (r2 <= 0) goto L_0x016f
            int r2 = r7.f48227c
            int r4 = r7.f48231g
            if (r2 > r4) goto L_0x016f
            byte[] r2 = r7.f48221n
            byte[] r4 = r7.f48228d
            int r5 = r7.f48229e
            byte[] r6 = r7.f48221n
            int r6 = r6.length
            java.lang.System.arraycopy(r2, r0, r4, r5, r6)
            int r2 = r7.f48229e
            byte[] r4 = r7.f48221n
            int r4 = r4.length
            int r2 = r2 + r4
            r7.f48229e = r2
            r7.f48231g = r0
        L_0x016f:
            int r9 = r9 + 1
            r2 = r3
            goto L_0x00da
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.repackaged.org.apache.commons.codec.p781a.C17331a.mo44760a(byte[], int, int):void");
    }

    /* renamed from: a */
    private static byte[] m57715a(byte[] bArr, boolean z, boolean z2, int i) {
        C17331a aVar;
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        if (z) {
            aVar = new C17331a(z2);
        } else {
            aVar = new C17331a(0, f48215a, z2);
        }
        long d = aVar.mo44765d(bArr);
        if (d <= 2147483647L) {
            return aVar.mo44763b(bArr);
        }
        StringBuilder sb = new StringBuilder("Input array too big, the output array would be bigger (");
        sb.append(d);
        sb.append(") than the specified maximum size of 2147483647");
        throw new IllegalArgumentException(sb.toString());
    }
}
