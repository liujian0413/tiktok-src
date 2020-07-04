package com.google.common.hash;

import com.google.common.base.C17439m;
import com.google.common.math.C18127e;
import com.google.common.primitives.C18143c;
import com.google.common.primitives.C18145d;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.common.hash.d */
enum C18076d implements C18072b {
    MURMUR128_MITZ_32 {
        /* renamed from: a */
        public final <T> boolean mo46671a(T t, Funnel<? super T> funnel, int i, C18079a aVar) {
            long a = aVar.mo46681a();
            long c = C18084h.m59821a().mo46675a(t, funnel).mo46692c();
            int i2 = (int) c;
            int i3 = (int) (c >>> 32);
            boolean z = false;
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 ^= -1;
                }
                z |= aVar.mo46683a(((long) i5) % a);
            }
            return z;
        }

        /* renamed from: b */
        public final <T> boolean mo46672b(T t, Funnel<? super T> funnel, int i, C18079a aVar) {
            long a = aVar.mo46681a();
            long c = C18084h.m59821a().mo46675a(t, funnel).mo46692c();
            int i2 = (int) c;
            int i3 = (int) (c >>> 32);
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 ^= -1;
                }
                if (!aVar.mo46685b(((long) i5) % a)) {
                    return false;
                }
            }
            return true;
        }
    },
    MURMUR128_MITZ_64 {
        /* renamed from: a */
        private static long m59792a(byte[] bArr) {
            return C18145d.m59978a(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        /* renamed from: b */
        private static long m59793b(byte[] bArr) {
            return C18145d.m59978a(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        /* renamed from: a */
        public final <T> boolean mo46671a(T t, Funnel<? super T> funnel, int i, C18079a aVar) {
            long a = aVar.mo46681a();
            byte[] e = C18084h.m59821a().mo46675a(t, funnel).mo46694e();
            long a2 = m59792a(e);
            long b = m59793b(e);
            long j = a2;
            boolean z = false;
            for (int i2 = 0; i2 < i; i2++) {
                z |= aVar.mo46683a((Long.MAX_VALUE & j) % a);
                j += b;
            }
            return z;
        }

        /* renamed from: b */
        public final <T> boolean mo46672b(T t, Funnel<? super T> funnel, int i, C18079a aVar) {
            long a = aVar.mo46681a();
            byte[] e = C18084h.m59821a().mo46675a(t, funnel).mo46694e();
            long a2 = m59792a(e);
            long b = m59793b(e);
            long j = a2;
            for (int i2 = 0; i2 < i; i2++) {
                if (!aVar.mo46685b((Long.MAX_VALUE & j) % a)) {
                    return false;
                }
                j += b;
            }
            return true;
        }
    };

    /* renamed from: com.google.common.hash.d$a */
    static final class C18079a {

        /* renamed from: a */
        final AtomicLongArray f49410a;

        /* renamed from: b */
        private final C18085i f49411b;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final long mo46684b() {
            return this.f49411b.mo46701b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final long mo46681a() {
            return ((long) this.f49410a.length()) * 64;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C18079a mo46686c() {
            return new C18079a(m59796a(this.f49410a));
        }

        public final int hashCode() {
            return Arrays.hashCode(m59796a(this.f49410a));
        }

        C18079a(long j) {
            this(new long[C18143c.m59967a(C18127e.m59897a(j, 64, RoundingMode.CEILING))]);
        }

        /* renamed from: a */
        public static long[] m59796a(AtomicLongArray atomicLongArray) {
            long[] jArr = new long[atomicLongArray.length()];
            for (int i = 0; i < jArr.length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo46685b(long j) {
            if (((1 << ((int) j)) & this.f49410a.get((int) (j >>> 6))) != 0) {
                return true;
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C18079a)) {
                return false;
            }
            return Arrays.equals(m59796a(this.f49410a), m59796a(((C18079a) obj).f49410a));
        }

        C18079a(long[] jArr) {
            boolean z;
            if (jArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57969a(z, (Object) "data length is zero!");
            this.f49410a = new AtomicLongArray(jArr);
            this.f49411b = C18086j.m59825a();
            long j = 0;
            for (long bitCount : jArr) {
                j += (long) Long.bitCount(bitCount);
            }
            this.f49411b.mo46700a(j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo46683a(long j) {
            long j2;
            long j3;
            if (mo46685b(j)) {
                return false;
            }
            int i = (int) (j >>> 6);
            long j4 = 1 << ((int) j);
            do {
                j2 = this.f49410a.get(i);
                j3 = j2 | j4;
                if (j2 == j3) {
                    return false;
                }
            } while (!this.f49410a.compareAndSet(i, j2, j3));
            this.f49411b.mo46699a();
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46682a(C18079a aVar) {
            boolean z;
            long j;
            long j2;
            boolean z2;
            C18079a aVar2 = aVar;
            if (this.f49410a.length() == aVar2.f49410a.length()) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57972a(z, "BitArrays must be of equal length (%s != %s)", this.f49410a.length(), aVar2.f49410a.length());
            for (int i = 0; i < this.f49410a.length(); i++) {
                long j3 = aVar2.f49410a.get(i);
                while (true) {
                    j = this.f49410a.get(i);
                    j2 = j | j3;
                    if (j != j2) {
                        if (this.f49410a.compareAndSet(i, j, j2)) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    this.f49411b.mo46700a((long) (Long.bitCount(j2) - Long.bitCount(j)));
                }
            }
        }
    }
}
