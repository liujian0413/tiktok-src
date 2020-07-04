package shark.internal.p1902a;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: shark.internal.a.b */
public final class C48760b {

    /* renamed from: b */
    public static final int f123917b = 32;

    /* renamed from: c */
    public static final C48761a f123918c = new C48761a(null);

    /* renamed from: k */
    private static final int f123919k = 7;

    /* renamed from: l */
    private static final int f123920l = f123920l;

    /* renamed from: a */
    public int f123921a;

    /* renamed from: d */
    private int f123922d;

    /* renamed from: e */
    private byte[] f123923e;

    /* renamed from: f */
    private final int[] f123924f;

    /* renamed from: g */
    private final int[] f123925g;

    /* renamed from: h */
    private final byte[] f123926h;

    /* renamed from: i */
    private final C48759a f123927i;

    /* renamed from: j */
    private final int f123928j;

    /* renamed from: shark.internal.a.b$a */
    public static final class C48761a {
        private C48761a() {
        }

        public /* synthetic */ C48761a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static int m150572a(int i) {
            int i2 = 0;
            while (i >= C48760b.f123917b) {
                i2 |= i & 1;
                i >>= 1;
            }
            return i + i2;
        }

        /* renamed from: a */
        private static void m150574a(int i, int i2, int i3) {
            if (i2 < 0 || i3 > i) {
                StringBuilder sb = new StringBuilder("start < 0 || end > len. start=");
                sb.append(i2);
                sb.append(", end=");
                sb.append(i3);
                sb.append(", len=");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else if (i2 > i3) {
                StringBuilder sb2 = new StringBuilder("start > end: ");
                sb2.append(i2);
                sb2.append(" > ");
                sb2.append(i3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: a */
        private static void m150575a(byte[] bArr, int i, int i2, int i3) {
            for (int i4 = i2 - 1; i < i4; i4--) {
                int i5 = i * i3;
                int i6 = i4 * i3;
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = i5 + i7;
                    byte b = bArr[i8];
                    int i9 = i6 + i7;
                    bArr[i8] = bArr[i9];
                    bArr[i9] = b;
                }
                i++;
            }
        }

        /* renamed from: b */
        private final int m150577b(byte[] bArr, int i, int i2, int i3, C48759a aVar) {
            int i4 = i;
            int i5 = i2;
            int i6 = i4 + 1;
            if (i6 == i5) {
                return 1;
            }
            int a = aVar.mo123522a(i3, bArr, i6, bArr, i);
            int i7 = i6 + 1;
            if (a >= 0) {
                byte[] bArr2 = bArr;
                int i8 = i3;
                while (i7 < i5) {
                    if (aVar.mo123522a(i3, bArr, i7, bArr, i7 - 1) < 0) {
                        break;
                    }
                    i7++;
                }
            } else {
                while (i7 < i5) {
                    if (aVar.mo123522a(i3, bArr, i7, bArr, i7 - 1) >= 0) {
                        break;
                    }
                    i7++;
                }
                m150575a(bArr, i4, i7, i3);
            }
            return i7 - i4;
        }

        /* renamed from: a */
        public final void mo123526a(byte[] bArr, int i, int i2, int i3, C48759a aVar) {
            int i4;
            C7573i.m23587b(bArr, "a");
            C7573i.m23587b(aVar, "c");
            int i5 = 0;
            m150574a(bArr.length / i3, 0, i2);
            int i6 = i2 + 0;
            if (i6 >= 2) {
                if (i6 < C48760b.f123917b) {
                    m150576a(bArr, 0, i2, m150577b(bArr, 0, i2, i3, aVar) + 0, i3, aVar);
                    return;
                }
                C48760b bVar = new C48760b(bArr, aVar, i3, null);
                int a = m150572a(i6);
                do {
                    int b = m150577b(bArr, i5, i2, i3, aVar);
                    if (b < a) {
                        if (i6 <= a) {
                            i4 = i6;
                        } else {
                            i4 = a;
                        }
                        int i7 = i5 + b;
                        m150576a(bArr, i5, i5 + i4, i7, i3, aVar);
                        b = i4;
                    }
                    bVar.mo123524a(i5, b);
                    bVar.mo123523a();
                    i5 += b;
                    i6 -= b;
                } while (i6 != 0);
                bVar.mo123525b();
            }
        }

        /* renamed from: a */
        private static void m150576a(byte[] bArr, int i, int i2, int i3, int i4, C48759a aVar) {
            byte[] bArr2 = bArr;
            int i5 = i3;
            int i6 = i4;
            int i7 = i;
            if (i5 == i7) {
                i5++;
            }
            byte[] bArr3 = new byte[i6];
            int i8 = i2;
            for (int i9 = i5; i9 < i8; i9++) {
                int i10 = i9 * i6;
                for (int i11 = 0; i11 < i6; i11++) {
                    bArr3[i11] = bArr2[i10 + i11];
                }
                int i12 = i7;
                int i13 = i9;
                while (i12 < i13) {
                    int i14 = (i12 + i13) >>> 1;
                    if (aVar.mo123522a(i4, bArr3, 0, bArr, i14) < 0) {
                        i13 = i14;
                    } else {
                        i12 = i14 + 1;
                    }
                }
                int i15 = i9 - i12;
                switch (i15) {
                    case 1:
                        int i16 = i12 * i6;
                        int i17 = (i12 + 1) * i6;
                        for (int i18 = 0; i18 < i6; i18++) {
                            bArr2[i17 + i18] = bArr2[i16 + i18];
                        }
                        break;
                    case 2:
                        int i19 = i12 * i6;
                        int i20 = (i12 + 1) * i6;
                        int i21 = (i12 + 2) * i6;
                        for (int i22 = 0; i22 < i6; i22++) {
                            bArr2[i21 + i22] = bArr2[i20 + i22];
                        }
                        for (int i23 = 0; i23 < i6; i23++) {
                            bArr2[i20 + i23] = bArr2[i19 + i23];
                        }
                        break;
                    default:
                        System.arraycopy(bArr2, i12 * i6, bArr2, (i12 + 1) * i6, i15 * i6);
                        break;
                }
                int i24 = i12 * i6;
                for (int i25 = 0; i25 < i6; i25++) {
                    bArr2[i24 + i25] = bArr3[i25];
                }
            }
        }

        /* renamed from: a */
        public static int m150573a(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, int i5, C48759a aVar) {
            int i6;
            int i7;
            int i8 = i2 + i4;
            if (aVar.mo123522a(i5, bArr, i, bArr2, i8) > 0) {
                int i9 = i3 - i4;
                int i10 = 1;
                int i11 = 0;
                while (i10 < i9) {
                    if (aVar.mo123522a(i5, bArr, i, bArr2, i8 + i10) <= 0) {
                        break;
                    }
                    int i12 = (i10 * 2) + 1;
                    if (i12 <= 0) {
                        i12 = i9;
                    }
                    int i13 = i12;
                    i11 = i10;
                    i10 = i13;
                }
                if (i10 <= i9) {
                    i9 = i10;
                }
                i7 = i9 + i4;
                i6 = i11 + i4;
            } else {
                int i14 = i4 + 1;
                int i15 = 1;
                int i16 = 0;
                while (i15 < i14) {
                    if (aVar.mo123522a(i5, bArr, i, bArr2, i8 - i15) > 0) {
                        break;
                    }
                    int i17 = (i15 * 2) + 1;
                    if (i17 <= 0) {
                        i17 = i14;
                    }
                    int i18 = i17;
                    i16 = i15;
                    i15 = i18;
                }
                if (i15 <= i14) {
                    i14 = i15;
                }
                i6 = i4 - i14;
                i7 = i4 - i16;
            }
            int i19 = i6 + 1;
            while (i19 < i7) {
                int i20 = ((i7 - i19) >>> 1) + i19;
                if (aVar.mo123522a(i5, bArr, i, bArr2, i2 + i20) > 0) {
                    i19 = i20 + 1;
                } else {
                    i7 = i20;
                }
            }
            return i7;
        }

        /* renamed from: b */
        public static int m150578b(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, int i5, C48759a aVar) {
            int i6;
            int i7;
            int i8 = i2 + i4;
            if (aVar.mo123522a(i5, bArr, i, bArr2, i8) < 0) {
                int i9 = i4 + 1;
                int i10 = 1;
                int i11 = 0;
                while (i10 < i9) {
                    if (aVar.mo123522a(i5, bArr, i, bArr2, i8 - i10) >= 0) {
                        break;
                    }
                    int i12 = (i10 * 2) + 1;
                    if (i12 <= 0) {
                        i12 = i9;
                    }
                    int i13 = i12;
                    i11 = i10;
                    i10 = i13;
                }
                if (i10 <= i9) {
                    i9 = i10;
                }
                i6 = i4 - i9;
                i7 = i4 - i11;
            } else {
                int i14 = i3 - i4;
                int i15 = 1;
                int i16 = 0;
                while (i15 < i14) {
                    if (aVar.mo123522a(i5, bArr, i, bArr2, i8 + i15) < 0) {
                        break;
                    }
                    int i17 = (i15 * 2) + 1;
                    if (i17 <= 0) {
                        i17 = i14;
                    }
                    int i18 = i17;
                    i16 = i15;
                    i15 = i18;
                }
                if (i15 <= i14) {
                    i14 = i15;
                }
                i7 = i14 + i4;
                i6 = i16 + i4;
            }
            int i19 = i6 + 1;
            while (i19 < i7) {
                int i20 = ((i7 - i19) >>> 1) + i19;
                if (aVar.mo123522a(i5, bArr, i, bArr2, i2 + i20) < 0) {
                    i7 = i20;
                } else {
                    i19 = i20 + 1;
                }
            }
            return i7;
        }
    }

    /* renamed from: b */
    public final void mo123525b() {
        while (this.f123921a > 1) {
            int i = this.f123921a - 2;
            if (i > 0 && this.f123925g[i - 1] < this.f123925g[i + 1]) {
                i--;
            }
            m150565a(i);
        }
    }

    /* renamed from: a */
    public final void mo123523a() {
        while (this.f123921a > 1) {
            int i = this.f123921a - 2;
            if ((i <= 0 || this.f123925g[i - 1] > this.f123925g[i] + this.f123925g[i + 1]) && (i < 2 || this.f123925g[i - 2] > this.f123925g[i] + this.f123925g[i - 1])) {
                if (this.f123925g[i] > this.f123925g[i + 1]) {
                    return;
                }
            } else if (this.f123925g[i - 1] < this.f123925g[i + 1]) {
                i--;
            }
            m150565a(i);
        }
    }

    /* renamed from: b */
    private final byte[] m150568b(int i) {
        byte[] bArr = this.f123923e;
        if (bArr == null) {
            C7573i.m23580a();
        }
        if (bArr.length < this.f123928j * i) {
            int i2 = (i >> 1) | i;
            int i3 = i2 | (i2 >> 2);
            int i4 = i3 | (i3 >> 4);
            int i5 = i4 | (i4 >> 8);
            int i6 = (i5 | (i5 >> 16)) + 1;
            if (i6 >= 0) {
                i = Math.min(i6, (this.f123926h.length / this.f123928j) >>> 1);
            }
            this.f123923e = new byte[(i * this.f123928j)];
        }
        byte[] bArr2 = this.f123923e;
        if (bArr2 == null) {
            C7573i.m23580a();
        }
        return bArr2;
    }

    /* renamed from: a */
    private final void m150565a(int i) {
        int i2 = i;
        int i3 = this.f123924f[i2];
        int i4 = this.f123925g[i2];
        int i5 = i2 + 1;
        int i6 = this.f123924f[i5];
        int i7 = this.f123925g[i5];
        this.f123925g[i2] = i4 + i7;
        if (i2 == this.f123921a - 3) {
            int i8 = i2 + 2;
            this.f123924f[i5] = this.f123924f[i8];
            this.f123925g[i5] = this.f123925g[i8];
        }
        this.f123921a--;
        byte[] bArr = this.f123926h;
        int b = C48761a.m150578b(bArr, i6, bArr, i3, i4, 0, this.f123928j, this.f123927i);
        int i9 = i3 + b;
        int i10 = i4 - b;
        if (i10 != 0) {
            int i11 = i6;
            int a = C48761a.m150573a(this.f123926h, (i9 + i10) - 1, this.f123926h, i6, i7, i7 - 1, this.f123928j, this.f123927i);
            if (a != 0) {
                if (i10 <= a) {
                    m150566a(i9, i10, i11, a);
                } else {
                    m150567b(i9, i10, i11, a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo123524a(int i, int i2) {
        this.f123924f[this.f123921a] = i;
        this.f123925g[this.f123921a] = i2;
        this.f123921a++;
    }

    private C48760b(byte[] bArr, C48759a aVar, int i) {
        int i2;
        int i3;
        this.f123926h = bArr;
        this.f123927i = aVar;
        this.f123928j = i;
        this.f123922d = f123919k;
        int length = this.f123926h.length / this.f123928j;
        int i4 = this.f123928j;
        if (length < f123920l * 2) {
            i2 = length >>> 1;
        } else {
            i2 = f123920l;
        }
        this.f123923e = new byte[(i4 * i2)];
        if (length < 120) {
            i3 = 5;
        } else if (length < 1542) {
            i3 = 10;
        } else if (length < 119151) {
            i3 = 19;
        } else {
            i3 = 40;
        }
        this.f123924f = new int[i3];
        this.f123925g = new int[i3];
    }

    public /* synthetic */ C48760b(byte[] bArr, C48759a aVar, int i, C7571f fVar) {
        this(bArr, aVar, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0169, code lost:
        if (r19 >= 0) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016b, code lost:
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018f, code lost:
        r15 = r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m150566a(int r23, int r24, int r25, int r26) {
        /*
            r22 = this;
            r0 = r22
            r2 = r24
            byte[] r9 = r0.f123926h
            int r10 = r0.f123928j
            byte[] r11 = r0.m150568b(r2)
            int r4 = r23 * r10
            int r5 = r2 * r10
            r12 = 0
            java.lang.System.arraycopy(r9, r4, r11, r12, r5)
            int r6 = r25 * r10
            r7 = 0
        L_0x0017:
            if (r7 >= r10) goto L_0x0024
            int r8 = r4 + r7
            int r13 = r6 + r7
            byte r13 = r9[r13]
            r9[r8] = r13
            int r7 = r7 + 1
            goto L_0x0017
        L_0x0024:
            r13 = 1
            int r1 = r23 + 1
            int r3 = r25 + 1
            int r4 = r26 + -1
            if (r4 != 0) goto L_0x0035
            int r2 = r10 * 0
            int r1 = r1 * r10
            java.lang.System.arraycopy(r11, r2, r9, r1, r5)
            return
        L_0x0035:
            if (r2 != r13) goto L_0x0053
            int r3 = r3 * r10
            int r2 = r1 * r10
            int r5 = r4 * r10
            java.lang.System.arraycopy(r9, r3, r9, r2, r5)
            int r1 = r1 + r4
            int r1 = r1 * r10
            int r2 = r10 * 0
        L_0x0045:
            if (r12 >= r10) goto L_0x0052
            int r3 = r1 + r12
            int r4 = r2 + r12
            byte r4 = r11[r4]
            r9[r3] = r4
            int r12 = r12 + 1
            goto L_0x0045
        L_0x0052:
            return
        L_0x0053:
            shark.internal.a.a r14 = r0.f123927i
            int r5 = r0.f123922d
            r7 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = 0
        L_0x005c:
            r15 = r1
            r16 = r2
            r8 = r3
            r20 = r4
            r18 = r5
            r17 = 0
            r19 = 0
        L_0x0068:
            r1 = r14
            r2 = r10
            r3 = r9
            r4 = r8
            r5 = r11
            r6 = r15
            int r1 = r1.mo123522a(r2, r3, r4, r5, r6)
            if (r1 >= 0) goto L_0x009a
            int r1 = r16 * r10
            int r2 = r8 * r10
            r3 = 0
        L_0x0079:
            if (r3 >= r10) goto L_0x0086
            int r4 = r1 + r3
            int r5 = r2 + r3
            byte r5 = r9[r5]
            r9[r4] = r5
            int r3 = r3 + 1
            goto L_0x0079
        L_0x0086:
            int r16 = r16 + 1
            int r8 = r8 + 1
            int r17 = r17 + 1
            int r18 = r18 + -1
            if (r18 != 0) goto L_0x0097
            r19 = r7
            r2 = r15
            r1 = r20
            goto L_0x018f
        L_0x0097:
            r19 = 0
            goto L_0x00ba
        L_0x009a:
            int r1 = r16 * r10
            int r2 = r15 * r10
            r3 = 0
        L_0x009f:
            if (r3 >= r10) goto L_0x00ac
            int r4 = r1 + r3
            int r5 = r2 + r3
            byte r5 = r11[r5]
            r9[r4] = r5
            int r3 = r3 + 1
            goto L_0x009f
        L_0x00ac:
            int r16 = r16 + 1
            int r15 = r15 + 1
            int r19 = r19 + 1
            int r1 = r20 + -1
            if (r1 == r13) goto L_0x018c
            r20 = r1
            r17 = 0
        L_0x00ba:
            r1 = r19 | r17
            if (r1 < r7) goto L_0x0068
            r19 = r7
            r17 = r16
            r16 = r15
            r15 = r8
        L_0x00c5:
            r6 = 0
            r1 = r9
            r2 = r15
            r3 = r11
            r4 = r16
            r5 = r20
            r7 = r10
            r8 = r14
            int r8 = shark.internal.p1902a.C48760b.C48761a.m150578b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r8 == 0) goto L_0x00f2
            int r1 = r16 * r10
            int r2 = r17 * r10
            int r3 = r8 * r10
            java.lang.System.arraycopy(r11, r1, r9, r2, r3)
            int r1 = r17 + r8
            int r2 = r16 + r8
            int r3 = r20 - r8
            if (r3 <= r13) goto L_0x00ed
            r17 = r1
            r16 = r2
            r20 = r3
            goto L_0x00f2
        L_0x00ed:
            r16 = r1
            r1 = r3
            goto L_0x0190
        L_0x00f2:
            int r1 = r17 * r10
            int r2 = r15 * r10
            r3 = 0
        L_0x00f7:
            if (r3 >= r10) goto L_0x0104
            int r4 = r1 + r3
            int r5 = r2 + r3
            byte r5 = r9[r5]
            r9[r4] = r5
            int r3 = r3 + 1
            goto L_0x00f7
        L_0x0104:
            int r17 = r17 + 1
            int r15 = r15 + 1
            int r18 = r18 + -1
            if (r18 == 0) goto L_0x0185
            r6 = 0
            r1 = r11
            r2 = r16
            r3 = r9
            r4 = r15
            r5 = r18
            r7 = r10
            r12 = r8
            r8 = r14
            int r1 = shark.internal.p1902a.C48760b.C48761a.m150573a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r1 == 0) goto L_0x013c
            int r2 = r15 * r10
            int r3 = r17 * r10
            int r4 = r1 * r10
            java.lang.System.arraycopy(r9, r2, r9, r3, r4)
            int r2 = r17 + r1
            int r8 = r15 + r1
            int r18 = r18 - r1
            if (r18 == 0) goto L_0x0132
            r17 = r2
            r15 = r8
            goto L_0x013c
        L_0x0132:
            r15 = r8
            r1 = r20
            r21 = r16
            r16 = r2
            r2 = r21
            goto L_0x0190
        L_0x013c:
            int r2 = r17 * r10
            int r3 = r16 * r10
            r4 = 0
        L_0x0141:
            if (r4 >= r10) goto L_0x014e
            int r5 = r2 + r4
            int r6 = r3 + r4
            byte r6 = r11[r6]
            r9[r5] = r6
            int r4 = r4 + 1
            goto L_0x0141
        L_0x014e:
            int r17 = r17 + 1
            int r16 = r16 + 1
            int r2 = r20 + -1
            if (r2 == r13) goto L_0x017f
            int r19 = r19 + -1
            int r3 = f123919k
            if (r12 < r3) goto L_0x015e
            r3 = 1
            goto L_0x015f
        L_0x015e:
            r3 = 0
        L_0x015f:
            int r4 = f123919k
            if (r1 < r4) goto L_0x0165
            r1 = 1
            goto L_0x0166
        L_0x0165:
            r1 = 0
        L_0x0166:
            r1 = r1 | r3
            if (r1 != 0) goto L_0x017a
            if (r19 >= 0) goto L_0x016d
            r19 = 0
        L_0x016d:
            int r7 = r19 + 2
            r4 = r2
            r3 = r15
            r1 = r16
            r2 = r17
            r5 = r18
            r12 = 0
            goto L_0x005c
        L_0x017a:
            r20 = r2
            r12 = 0
            goto L_0x00c5
        L_0x017f:
            r1 = r2
            r2 = r16
            r16 = r17
            goto L_0x0190
        L_0x0185:
            r2 = r16
            r16 = r17
            r1 = r20
            goto L_0x0190
        L_0x018c:
            r19 = r7
            r2 = r15
        L_0x018f:
            r15 = r8
        L_0x0190:
            if (r19 > 0) goto L_0x0194
            r3 = 1
            goto L_0x0196
        L_0x0194:
            r3 = r19
        L_0x0196:
            r0.f123922d = r3
            if (r1 != r13) goto L_0x01b7
            int r15 = r15 * r10
            int r1 = r16 * r10
            int r3 = r18 * r10
            java.lang.System.arraycopy(r9, r15, r9, r1, r3)
            int r16 = r16 + r18
            int r16 = r16 * r10
            int r2 = r2 * r10
            r1 = 0
        L_0x01aa:
            if (r1 >= r10) goto L_0x01c2
            int r3 = r16 + r1
            int r4 = r2 + r1
            byte r4 = r11[r4]
            r9[r3] = r4
            int r1 = r1 + 1
            goto L_0x01aa
        L_0x01b7:
            if (r1 == 0) goto L_0x01c3
            int r2 = r2 * r10
            int r3 = r16 * r10
            int r1 = r1 * r10
            java.lang.System.arraycopy(r11, r2, r9, r3, r1)
        L_0x01c2:
            return
        L_0x01c3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Comparison method violates its general contract!"
            r1.<init>(r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.internal.p1902a.C48760b.m150566a(int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        r19 = r7;
        r17 = r15;
        r15 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cd, code lost:
        r8 = r18 - shark.internal.p1902a.C48760b.C48761a.m150578b(r10, r15, r9, r22, r18, r18 - 1, r11, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00de, code lost:
        if (r8 == 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e0, code lost:
        r16 = r16 - r8;
        r1 = r17 - r8;
        r18 = r18 - r8;
        java.lang.System.arraycopy(r9, (r1 + 1) * r11, r9, (r16 + 1) * r11, r8 * r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f3, code lost:
        if (r18 == 0) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f5, code lost:
        r17 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f8, code lost:
        r17 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fe, code lost:
        r1 = r16 * r11;
        r2 = r15 * r11;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0103, code lost:
        if (r3 >= r11) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0105, code lost:
        r9[r1 + r3] = r10[r2 + r3];
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0110, code lost:
        r16 = r16 - 1;
        r15 = r15 - 1;
        r7 = r20 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0116, code lost:
        if (r7 == 1) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0118, code lost:
        r20 = r7;
        r12 = r8;
        r7 = r20 - shark.internal.p1902a.C48760b.C48761a.m150573a(r9, r17, r10, 0, r7, r7 - 1, r11, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012b, code lost:
        if (r7 == 0) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012d, code lost:
        r16 = r16 - r7;
        r8 = r15 - r7;
        r1 = r20 - r7;
        java.lang.System.arraycopy(r10, (r8 + 1) * r11, r9, (r16 + 1) * r11, r7 * r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0140, code lost:
        if (r1 <= 1) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0142, code lost:
        r20 = r1;
        r15 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0145, code lost:
        r1 = r16 * r11;
        r2 = r17 * r11;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014a, code lost:
        if (r3 >= r11) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014c, code lost:
        r9[r1 + r3] = r9[r2 + r3];
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0157, code lost:
        r16 = r16 - 1;
        r17 = r17 - 1;
        r18 = r18 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015d, code lost:
        if (r18 == 0) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015f, code lost:
        r19 = r19 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0163, code lost:
        if (r12 < f123919k) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0165, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0167, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016a, code lost:
        if (r7 < f123919k) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016c, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016e, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0170, code lost:
        if ((r1 | r2) != false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0172, code lost:
        if (r19 >= 0) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0174, code lost:
        r19 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0187, code lost:
        r20 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018f, code lost:
        r15 = r8;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m150567b(int r22, int r23, int r24, int r25) {
        /*
            r21 = this;
            r0 = r21
            r3 = r25
            byte[] r9 = r0.f123926h
            byte[] r10 = r0.m150568b(r3)
            int r11 = r0.f123928j
            int r4 = r24 * r11
            int r5 = r3 * r11
            r12 = 0
            java.lang.System.arraycopy(r9, r4, r10, r12, r5)
            int r4 = r22 + r23
            r13 = 1
            int r4 = r4 - r13
            int r6 = r3 + -1
            int r2 = r24 + r3
            int r2 = r2 - r13
            int r7 = r2 * r11
            int r8 = r4 * r11
            r14 = 0
        L_0x0022:
            if (r14 >= r11) goto L_0x002f
            int r15 = r7 + r14
            int r16 = r8 + r14
            byte r16 = r9[r16]
            r9[r15] = r16
            int r14 = r14 + 1
            goto L_0x0022
        L_0x002f:
            int r2 = r2 + -1
            int r4 = r4 + -1
            int r1 = r23 + -1
            if (r1 != 0) goto L_0x003e
            int r2 = r2 - r6
            int r2 = r2 * r11
            java.lang.System.arraycopy(r10, r12, r9, r2, r5)
            return
        L_0x003e:
            if (r3 != r13) goto L_0x0060
            int r2 = r2 - r1
            int r4 = r4 - r1
            int r4 = r4 + r13
            int r4 = r4 * r11
            int r3 = r2 + 1
            int r3 = r3 * r11
            int r1 = r1 * r11
            java.lang.System.arraycopy(r9, r4, r9, r3, r1)
            int r2 = r2 * r11
            int r6 = r6 * r11
        L_0x0052:
            if (r12 >= r11) goto L_0x005f
            int r1 = r2 + r12
            int r3 = r6 + r12
            byte r3 = r10[r3]
            r9[r1] = r3
            int r12 = r12 + 1
            goto L_0x0052
        L_0x005f:
            return
        L_0x0060:
            shark.internal.a.a r14 = r0.f123927i
            int r5 = r0.f123922d
            r7 = r5
        L_0x0065:
            r18 = r1
            r16 = r2
            r20 = r3
            r15 = r4
            r8 = r6
            r17 = 0
            r19 = 0
        L_0x0071:
            r1 = r14
            r2 = r11
            r3 = r10
            r4 = r8
            r5 = r9
            r6 = r15
            int r1 = r1.mo123522a(r2, r3, r4, r5, r6)
            if (r1 >= 0) goto L_0x00a4
            int r1 = r16 * r11
            int r2 = r15 * r11
            r3 = 0
        L_0x0082:
            if (r3 >= r11) goto L_0x008f
            int r4 = r1 + r3
            int r5 = r2 + r3
            byte r5 = r9[r5]
            r9[r4] = r5
            int r3 = r3 + 1
            goto L_0x0082
        L_0x008f:
            int r16 = r16 + -1
            int r15 = r15 + -1
            int r17 = r17 + 1
            int r18 = r18 + -1
            if (r18 != 0) goto L_0x00a1
            r19 = r7
            r17 = r15
            r1 = r20
            goto L_0x018f
        L_0x00a1:
            r19 = 0
            goto L_0x00c4
        L_0x00a4:
            int r1 = r16 * r11
            int r2 = r8 * r11
            r3 = 0
        L_0x00a9:
            if (r3 >= r11) goto L_0x00b6
            int r4 = r1 + r3
            int r5 = r2 + r3
            byte r5 = r10[r5]
            r9[r4] = r5
            int r3 = r3 + 1
            goto L_0x00a9
        L_0x00b6:
            int r16 = r16 + -1
            int r8 = r8 + -1
            int r19 = r19 + 1
            int r1 = r20 + -1
            if (r1 == r13) goto L_0x018b
            r20 = r1
            r17 = 0
        L_0x00c4:
            r1 = r17 | r19
            if (r1 < r7) goto L_0x0071
            r19 = r7
            r17 = r15
            r15 = r8
        L_0x00cd:
            int r6 = r18 + -1
            r1 = r10
            r2 = r15
            r3 = r9
            r4 = r22
            r5 = r18
            r7 = r11
            r8 = r14
            int r1 = shark.internal.p1902a.C48760b.C48761a.m150578b(r1, r2, r3, r4, r5, r6, r7, r8)
            int r8 = r18 - r1
            if (r8 == 0) goto L_0x00fe
            int r16 = r16 - r8
            int r1 = r17 - r8
            int r18 = r18 - r8
            int r2 = r1 + 1
            int r2 = r2 * r11
            int r3 = r16 + 1
            int r3 = r3 * r11
            int r4 = r8 * r11
            java.lang.System.arraycopy(r9, r2, r9, r3, r4)
            if (r18 == 0) goto L_0x00f8
            r17 = r1
            goto L_0x00fe
        L_0x00f8:
            r17 = r1
        L_0x00fa:
            r1 = r20
            goto L_0x0190
        L_0x00fe:
            int r1 = r16 * r11
            int r2 = r15 * r11
            r3 = 0
        L_0x0103:
            if (r3 >= r11) goto L_0x0110
            int r4 = r1 + r3
            int r5 = r2 + r3
            byte r5 = r10[r5]
            r9[r4] = r5
            int r3 = r3 + 1
            goto L_0x0103
        L_0x0110:
            int r16 = r16 + -1
            int r15 = r15 + -1
            int r7 = r20 + -1
            if (r7 == r13) goto L_0x0187
            r4 = 0
            int r6 = r7 + -1
            r1 = r9
            r2 = r17
            r3 = r10
            r5 = r7
            r20 = r7
            r7 = r11
            r12 = r8
            r8 = r14
            int r1 = shark.internal.p1902a.C48760b.C48761a.m150573a(r1, r2, r3, r4, r5, r6, r7, r8)
            int r7 = r20 - r1
            if (r7 == 0) goto L_0x0145
            int r16 = r16 - r7
            int r8 = r15 - r7
            int r1 = r20 - r7
            int r2 = r8 + 1
            int r2 = r2 * r11
            int r3 = r16 + 1
            int r3 = r3 * r11
            int r4 = r7 * r11
            java.lang.System.arraycopy(r10, r2, r9, r3, r4)
            if (r1 <= r13) goto L_0x018f
            r20 = r1
            r15 = r8
        L_0x0145:
            int r1 = r16 * r11
            int r2 = r17 * r11
            r3 = 0
        L_0x014a:
            if (r3 >= r11) goto L_0x0157
            int r4 = r1 + r3
            int r5 = r2 + r3
            byte r5 = r9[r5]
            r9[r4] = r5
            int r3 = r3 + 1
            goto L_0x014a
        L_0x0157:
            int r16 = r16 + -1
            int r17 = r17 + -1
            int r18 = r18 + -1
            if (r18 == 0) goto L_0x00fa
            int r19 = r19 + -1
            int r1 = f123919k
            if (r12 < r1) goto L_0x0167
            r1 = 1
            goto L_0x0168
        L_0x0167:
            r1 = 0
        L_0x0168:
            int r2 = f123919k
            if (r7 < r2) goto L_0x016e
            r2 = 1
            goto L_0x016f
        L_0x016e:
            r2 = 0
        L_0x016f:
            r1 = r1 | r2
            if (r1 != 0) goto L_0x0184
            if (r19 >= 0) goto L_0x0176
            r19 = 0
        L_0x0176:
            int r7 = r19 + 2
            r6 = r15
            r2 = r16
            r4 = r17
            r1 = r18
            r3 = r20
            r12 = 0
            goto L_0x0065
        L_0x0184:
            r12 = 0
            goto L_0x00cd
        L_0x0187:
            r20 = r7
            goto L_0x00fa
        L_0x018b:
            r19 = r7
            r17 = r15
        L_0x018f:
            r15 = r8
        L_0x0190:
            if (r19 > 0) goto L_0x0194
            r2 = 1
            goto L_0x0196
        L_0x0194:
            r2 = r19
        L_0x0196:
            r0.f123922d = r2
            if (r1 != r13) goto L_0x01bd
            int r16 = r16 - r18
            int r17 = r17 - r18
            int r17 = r17 + 1
            int r1 = r17 * r11
            int r2 = r16 + 1
            int r2 = r2 * r11
            int r3 = r18 * r11
            java.lang.System.arraycopy(r9, r1, r9, r2, r3)
            int r16 = r16 * r11
            int r15 = r15 * r11
            r1 = 0
        L_0x01b0:
            if (r1 >= r11) goto L_0x01cb
            int r2 = r16 + r1
            int r3 = r15 + r1
            byte r3 = r10[r3]
            r9[r2] = r3
            int r1 = r1 + 1
            goto L_0x01b0
        L_0x01bd:
            if (r1 == 0) goto L_0x01cc
            int r2 = r1 + -1
            int r16 = r16 - r2
            int r2 = r16 * r11
            int r1 = r1 * r11
            r3 = 0
            java.lang.System.arraycopy(r10, r3, r9, r2, r1)
        L_0x01cb:
            return
        L_0x01cc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Comparison method violates its general contract!"
            r1.<init>(r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.internal.p1902a.C48760b.m150567b(int, int, int, int):void");
    }
}
