package android.support.p029v7.util;

import android.support.p029v7.widget.RecyclerView.C1262a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: android.support.v7.util.a */
public final class C1143a {

    /* renamed from: a */
    private static final Comparator<C1150f> f4117a = new Comparator<C1150f>() {
        /* renamed from: a */
        private static int m5069a(C1150f fVar, C1150f fVar2) {
            int i = fVar.f4132a - fVar2.f4132a;
            if (i == 0) {
                return fVar.f4133b - fVar2.f4133b;
            }
            return i;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m5069a((C1150f) obj, (C1150f) obj2);
        }
    };

    /* renamed from: android.support.v7.util.a$a */
    public static abstract class C1145a {
        /* renamed from: a */
        public abstract int mo248a();

        /* renamed from: a */
        public Object mo249a(int i, int i2) {
            return null;
        }

        /* renamed from: b */
        public abstract int mo250b();

        /* renamed from: b */
        public abstract boolean mo251b(int i, int i2);

        /* renamed from: c */
        public abstract boolean mo252c(int i, int i2);
    }

    /* renamed from: android.support.v7.util.a$b */
    public static class C1146b {

        /* renamed from: a */
        public final List<C1150f> f4118a;

        /* renamed from: b */
        private final int[] f4119b;

        /* renamed from: c */
        private final int[] f4120c;

        /* renamed from: d */
        private final C1145a f4121d;

        /* renamed from: e */
        private final int f4122e;

        /* renamed from: f */
        private final int f4123f;

        /* renamed from: g */
        private final boolean f4124g;

        /* renamed from: a */
        private void m5076a() {
            C1150f fVar;
            if (this.f4118a.isEmpty()) {
                fVar = null;
            } else {
                fVar = (C1150f) this.f4118a.get(0);
            }
            if (fVar == null || fVar.f4132a != 0 || fVar.f4133b != 0) {
                C1150f fVar2 = new C1150f();
                fVar2.f4132a = 0;
                fVar2.f4133b = 0;
                fVar2.f4135d = false;
                fVar2.f4134c = 0;
                fVar2.f4136e = false;
                this.f4118a.add(0, fVar2);
            }
        }

        /* renamed from: b */
        private void m5080b() {
            int i;
            int i2 = this.f4122e;
            int i3 = this.f4123f;
            for (int size = this.f4118a.size() - 1; size >= 0; size--) {
                C1150f fVar = (C1150f) this.f4118a.get(size);
                int i4 = fVar.f4132a + fVar.f4134c;
                int i5 = fVar.f4133b + fVar.f4134c;
                if (this.f4124g) {
                    while (i2 > i4) {
                        m5077a(i2, i3, size);
                        i2--;
                    }
                    while (i3 > i5) {
                        m5081b(i2, i3, size);
                        i3--;
                    }
                }
                for (int i6 = 0; i6 < fVar.f4134c; i6++) {
                    int i7 = fVar.f4132a + i6;
                    int i8 = fVar.f4133b + i6;
                    if (this.f4121d.mo252c(i7, i8)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.f4119b[i7] = (i8 << 5) | i;
                    this.f4120c[i8] = (i7 << 5) | i;
                }
                i2 = fVar.f4132a;
                i3 = fVar.f4133b;
            }
        }

        /* renamed from: a */
        public final void mo4548a(C1262a aVar) {
            mo4547a((C1151b) new AdapterListUpdateCallback(aVar));
        }

        /* renamed from: a */
        public final void mo4547a(C1151b bVar) {
            BatchingListUpdateCallback batchingListUpdateCallback;
            if (bVar instanceof BatchingListUpdateCallback) {
                batchingListUpdateCallback = (BatchingListUpdateCallback) bVar;
            } else {
                batchingListUpdateCallback = new BatchingListUpdateCallback(bVar);
            }
            ArrayList arrayList = new ArrayList();
            int i = this.f4122e;
            int i2 = this.f4123f;
            for (int size = this.f4118a.size() - 1; size >= 0; size--) {
                C1150f fVar = (C1150f) this.f4118a.get(size);
                int i3 = fVar.f4134c;
                int i4 = fVar.f4132a + i3;
                int i5 = fVar.f4133b + i3;
                if (i4 < i) {
                    m5082b(arrayList, batchingListUpdateCallback, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m5078a(arrayList, batchingListUpdateCallback, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    if ((this.f4119b[fVar.f4132a + i6] & 31) == 2) {
                        batchingListUpdateCallback.mo254a(fVar.f4132a + i6, 1, this.f4121d.mo249a(fVar.f4132a + i6, fVar.f4133b + i6));
                    }
                }
                i = fVar.f4132a;
                i2 = fVar.f4133b;
            }
            batchingListUpdateCallback.mo4543a();
        }

        /* renamed from: a */
        private void m5077a(int i, int i2, int i3) {
            if (this.f4119b[i - 1] == 0) {
                m5079a(i, i2, i3, false);
            }
        }

        /* renamed from: b */
        private void m5081b(int i, int i2, int i3) {
            if (this.f4120c[i2 - 1] == 0) {
                m5079a(i, i2, i3, true);
            }
        }

        /* renamed from: a */
        private static C1148d m5075a(List<C1148d> list, int i, boolean z) {
            int i2;
            int size = list.size() - 1;
            while (size >= 0) {
                C1148d dVar = (C1148d) list.get(size);
                if (dVar.f4125a == i && dVar.f4127c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        C1148d dVar2 = (C1148d) list.get(size);
                        int i3 = dVar2.f4126b;
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        dVar2.f4126b = i3 + i2;
                        size++;
                    }
                    return dVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: a */
        private boolean m5079a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C1150f fVar = (C1150f) this.f4118a.get(i3);
                int i6 = fVar.f4132a + fVar.f4134c;
                int i7 = fVar.f4133b + fVar.f4134c;
                int i8 = 4;
                if (z) {
                    for (int i9 = i5 - 1; i9 >= i6; i9--) {
                        if (this.f4121d.mo251b(i9, i4)) {
                            if (this.f4121d.mo252c(i9, i4)) {
                                i8 = 8;
                            }
                            this.f4120c[i4] = (i9 << 5) | 16;
                            this.f4119b[i9] = (i4 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i10 = i2 - 1; i10 >= i7; i10--) {
                        if (this.f4121d.mo251b(i4, i10)) {
                            if (this.f4121d.mo252c(i4, i10)) {
                                i8 = 8;
                            }
                            int i11 = i - 1;
                            this.f4119b[i11] = (i10 << 5) | 16;
                            this.f4120c[i10] = (i11 << 5) | i8;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = fVar.f4132a;
                i2 = fVar.f4133b;
                i3--;
            }
            return false;
        }

        C1146b(C1145a aVar, List<C1150f> list, int[] iArr, int[] iArr2, boolean z) {
            this.f4118a = list;
            this.f4119b = iArr;
            this.f4120c = iArr2;
            Arrays.fill(this.f4119b, 0);
            Arrays.fill(this.f4120c, 0);
            this.f4121d = aVar;
            this.f4122e = aVar.mo248a();
            this.f4123f = aVar.mo250b();
            this.f4124g = z;
            m5076a();
            m5080b();
        }

        /* renamed from: a */
        private void m5078a(List<C1148d> list, C1151b bVar, int i, int i2, int i3) {
            if (!this.f4124g) {
                bVar.mo253a(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f4120c[i5] & 31;
                if (i6 == 0) {
                    bVar.mo253a(i, 1);
                    for (C1148d dVar : list) {
                        dVar.f4126b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f4120c[i5] >> 5;
                    bVar.mo256c(m5075a(list, i7, true).f4126b, i);
                    if (i6 == 4) {
                        bVar.mo254a(i, 1, this.f4121d.mo249a(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C1148d(i5, i, false));
                } else {
                    StringBuilder sb = new StringBuilder("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        /* renamed from: b */
        private void m5082b(List<C1148d> list, C1151b bVar, int i, int i2, int i3) {
            if (!this.f4124g) {
                bVar.mo255b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f4119b[i5] & 31;
                if (i6 == 0) {
                    bVar.mo255b(i + i4, 1);
                    for (C1148d dVar : list) {
                        dVar.f4126b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f4119b[i5] >> 5;
                    C1148d a = m5075a(list, i7, false);
                    bVar.mo256c(i + i4, a.f4126b - 1);
                    if (i6 == 4) {
                        bVar.mo254a(a.f4126b - 1, 1, this.f4121d.mo249a(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C1148d(i5, i + i4, true));
                } else {
                    StringBuilder sb = new StringBuilder("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    /* renamed from: android.support.v7.util.a$c */
    public static abstract class C1147c<T> {
        /* renamed from: a */
        public abstract boolean mo4549a(T t, T t2);

        /* renamed from: b */
        public abstract boolean mo4550b(T t, T t2);

        /* renamed from: c */
        public Object mo4551c(T t, T t2) {
            return null;
        }
    }

    /* renamed from: android.support.v7.util.a$d */
    static class C1148d {

        /* renamed from: a */
        int f4125a;

        /* renamed from: b */
        int f4126b;

        /* renamed from: c */
        boolean f4127c;

        public C1148d(int i, int i2, boolean z) {
            this.f4125a = i;
            this.f4126b = i2;
            this.f4127c = z;
        }
    }

    /* renamed from: android.support.v7.util.a$e */
    static class C1149e {

        /* renamed from: a */
        int f4128a;

        /* renamed from: b */
        int f4129b;

        /* renamed from: c */
        int f4130c;

        /* renamed from: d */
        int f4131d;

        public C1149e() {
        }

        public C1149e(int i, int i2, int i3, int i4) {
            this.f4128a = 0;
            this.f4129b = i2;
            this.f4130c = 0;
            this.f4131d = i4;
        }
    }

    /* renamed from: android.support.v7.util.a$f */
    static class C1150f {

        /* renamed from: a */
        int f4132a;

        /* renamed from: b */
        int f4133b;

        /* renamed from: c */
        int f4134c;

        /* renamed from: d */
        boolean f4135d;

        /* renamed from: e */
        boolean f4136e;

        C1150f() {
        }
    }

    /* renamed from: a */
    public static C1146b m5066a(C1145a aVar) {
        return m5067a(aVar, true);
    }

    /* renamed from: a */
    public static C1146b m5067a(C1145a aVar, boolean z) {
        C1149e eVar;
        int a = aVar.mo248a();
        int b = aVar.mo250b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1149e(0, a, 0, b));
        int abs = Math.abs(a - b) + a + b;
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1149e eVar2 = (C1149e) arrayList2.remove(arrayList2.size() - 1);
            C1150f a2 = m5068a(aVar, eVar2.f4128a, eVar2.f4129b, eVar2.f4130c, eVar2.f4131d, iArr, iArr2, abs);
            if (a2 != null) {
                if (a2.f4134c > 0) {
                    arrayList.add(a2);
                }
                a2.f4132a += eVar2.f4128a;
                a2.f4133b += eVar2.f4130c;
                if (arrayList3.isEmpty()) {
                    eVar = new C1149e();
                } else {
                    eVar = (C1149e) arrayList3.remove(arrayList3.size() - 1);
                }
                eVar.f4128a = eVar2.f4128a;
                eVar.f4130c = eVar2.f4130c;
                if (a2.f4136e) {
                    eVar.f4129b = a2.f4132a;
                    eVar.f4131d = a2.f4133b;
                } else if (a2.f4135d) {
                    eVar.f4129b = a2.f4132a - 1;
                    eVar.f4131d = a2.f4133b;
                } else {
                    eVar.f4129b = a2.f4132a;
                    eVar.f4131d = a2.f4133b - 1;
                }
                arrayList2.add(eVar);
                if (!a2.f4136e) {
                    eVar2.f4128a = a2.f4132a + a2.f4134c;
                    eVar2.f4130c = a2.f4133b + a2.f4134c;
                } else if (a2.f4135d) {
                    eVar2.f4128a = a2.f4132a + a2.f4134c + 1;
                    eVar2.f4130c = a2.f4133b + a2.f4134c;
                } else {
                    eVar2.f4128a = a2.f4132a + a2.f4134c;
                    eVar2.f4130c = a2.f4133b + a2.f4134c + 1;
                }
                arrayList2.add(eVar2);
            } else {
                arrayList3.add(eVar2);
            }
        }
        Collections.sort(arrayList, f4117a);
        C1146b bVar = new C1146b(aVar, arrayList, iArr, iArr2, true);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r3[r15 - 1] < r3[r15 + r9]) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dd, code lost:
        if (r4[r9 - 1] < r4[r9 + 1]) goto L_0x00ee;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.p029v7.util.C1143a.C1150f m5068a(android.support.p029v7.util.C1143a.C1145a r21, int r22, int r23, int r24, int r25, int[] r26, int[] r27, int r28) {
        /*
            r0 = r21
            r3 = r26
            r4 = r27
            int r5 = r23 - r22
            int r6 = r25 - r24
            if (r5 <= 0) goto L_0x0156
            if (r6 > 0) goto L_0x0010
            goto L_0x0156
        L_0x0010:
            int r7 = r5 - r6
            int r8 = r5 + r6
            r9 = 1
            int r8 = r8 + r9
            int r8 = r8 / 2
            int r10 = r28 - r8
            int r10 = r10 - r9
            int r11 = r28 + r8
            int r11 = r11 + r9
            r12 = 0
            java.util.Arrays.fill(r3, r10, r11, r12)
            int r10 = r10 + r7
            int r11 = r11 + r7
            java.util.Arrays.fill(r4, r10, r11, r5)
            int r10 = r7 % 2
            if (r10 == 0) goto L_0x002d
            r10 = 1
            goto L_0x002e
        L_0x002d:
            r10 = 0
        L_0x002e:
            r11 = 0
        L_0x002f:
            if (r11 > r8) goto L_0x014e
            int r13 = -r11
            r14 = r13
        L_0x0033:
            if (r14 > r11) goto L_0x00bd
            if (r14 == r13) goto L_0x0051
            if (r14 == r11) goto L_0x0045
            int r15 = r28 + r14
            int r16 = r15 + -1
            r12 = r3[r16]
            int r15 = r15 + r9
            r9 = r3[r15]
            if (r12 >= r9) goto L_0x0045
            goto L_0x0051
        L_0x0045:
            int r9 = r28 + r14
            r17 = 1
            int r9 = r9 + -1
            r9 = r3[r9]
            int r9 = r9 + 1
            r12 = 1
            goto L_0x005a
        L_0x0051:
            r17 = 1
            int r9 = r28 + r14
            int r9 = r9 + 1
            r9 = r3[r9]
            r12 = 0
        L_0x005a:
            int r15 = r9 - r14
            r18 = r8
            r8 = r15
        L_0x005f:
            if (r9 >= r5) goto L_0x007a
            if (r8 >= r6) goto L_0x007a
            r19 = r5
            int r5 = r22 + r9
            r20 = r6
            int r6 = r24 + r8
            boolean r5 = r0.mo251b(r5, r6)
            if (r5 == 0) goto L_0x007e
            int r9 = r9 + 1
            int r8 = r8 + 1
            r5 = r19
            r6 = r20
            goto L_0x005f
        L_0x007a:
            r19 = r5
            r20 = r6
        L_0x007e:
            int r5 = r28 + r14
            r3[r5] = r9
            if (r10 == 0) goto L_0x00b0
            int r6 = r7 - r11
            r8 = 1
            int r6 = r6 + r8
            if (r14 < r6) goto L_0x00b0
            int r6 = r7 + r11
            int r6 = r6 - r8
            if (r14 > r6) goto L_0x00b0
            r6 = r3[r5]
            r8 = r4[r5]
            if (r6 < r8) goto L_0x00b0
            android.support.v7.util.a$f r0 = new android.support.v7.util.a$f
            r0.<init>()
            r1 = r4[r5]
            r0.f4132a = r1
            int r1 = r0.f4132a
            int r1 = r1 - r14
            r0.f4133b = r1
            r1 = r3[r5]
            r2 = r4[r5]
            int r1 = r1 - r2
            r0.f4134c = r1
            r0.f4135d = r12
            r5 = 0
            r0.f4136e = r5
            return r0
        L_0x00b0:
            r5 = 0
            int r14 = r14 + 2
            r8 = r18
            r5 = r19
            r6 = r20
            r9 = 1
            r12 = 0
            goto L_0x0033
        L_0x00bd:
            r19 = r5
            r20 = r6
            r18 = r8
            r5 = 0
            r6 = r13
        L_0x00c5:
            if (r6 > r11) goto L_0x0141
            int r8 = r6 + r7
            int r9 = r11 + r7
            if (r8 == r9) goto L_0x00ec
            int r9 = r13 + r7
            if (r8 == r9) goto L_0x00e0
            int r9 = r28 + r8
            int r12 = r9 + -1
            r12 = r4[r12]
            r17 = 1
            int r9 = r9 + 1
            r9 = r4[r9]
            if (r12 >= r9) goto L_0x00e2
            goto L_0x00ee
        L_0x00e0:
            r17 = 1
        L_0x00e2:
            int r9 = r28 + r8
            int r9 = r9 + 1
            r9 = r4[r9]
            int r9 = r9 + -1
            r12 = 1
            goto L_0x00f5
        L_0x00ec:
            r17 = 1
        L_0x00ee:
            int r9 = r28 + r8
            int r9 = r9 + -1
            r9 = r4[r9]
            r12 = 0
        L_0x00f5:
            int r14 = r9 - r8
        L_0x00f7:
            if (r9 <= 0) goto L_0x0111
            if (r14 <= 0) goto L_0x0111
            int r15 = r22 + r9
            int r5 = r15 + -1
            int r15 = r24 + r14
            int r1 = r15 + -1
            boolean r1 = r0.mo251b(r5, r1)
            if (r1 == 0) goto L_0x0111
            int r9 = r9 + -1
            int r14 = r14 + -1
            r5 = 0
            r17 = 1
            goto L_0x00f7
        L_0x0111:
            int r1 = r28 + r8
            r4[r1] = r9
            if (r10 != 0) goto L_0x013c
            if (r8 < r13) goto L_0x013c
            if (r8 > r11) goto L_0x013c
            r5 = r3[r1]
            r9 = r4[r1]
            if (r5 < r9) goto L_0x013c
            android.support.v7.util.a$f r0 = new android.support.v7.util.a$f
            r0.<init>()
            r2 = r4[r1]
            r0.f4132a = r2
            int r2 = r0.f4132a
            int r2 = r2 - r8
            r0.f4133b = r2
            r2 = r3[r1]
            r1 = r4[r1]
            int r2 = r2 - r1
            r0.f4134c = r2
            r0.f4135d = r12
            r1 = 1
            r0.f4136e = r1
            return r0
        L_0x013c:
            r1 = 1
            int r6 = r6 + 2
            r5 = 0
            goto L_0x00c5
        L_0x0141:
            r1 = 1
            int r11 = r11 + 1
            r8 = r18
            r5 = r19
            r6 = r20
            r9 = 1
            r12 = 0
            goto L_0x002f
        L_0x014e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x0156:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.util.C1143a.m5068a(android.support.v7.util.a$a, int, int, int, int, int[], int[], int):android.support.v7.util.a$f");
    }
}
