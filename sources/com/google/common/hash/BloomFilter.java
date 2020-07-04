package com.google.common.hash;

import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.common.math.C18116a;
import com.google.common.primitives.C18148f;
import com.google.common.primitives.C18149g;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;

public final class BloomFilter<T> implements C17440n<T>, Serializable {
    public final C18079a bits;
    public final Funnel<? super T> funnel;
    public final int numHashFunctions;
    public final C18072b strategy;

    /* renamed from: com.google.common.hash.BloomFilter$a */
    static class C18071a<T> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        final long[] f49400a;

        /* renamed from: b */
        final int f49401b;

        /* renamed from: c */
        final Funnel<? super T> f49402c;

        /* renamed from: d */
        final C18072b f49403d;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            BloomFilter bloomFilter = new BloomFilter(new C18079a(this.f49400a), this.f49401b, this.f49402c, this.f49403d);
            return bloomFilter;
        }

        C18071a(BloomFilter<T> bloomFilter) {
            this.f49400a = C18079a.m59796a(bloomFilter.bits.f49410a);
            this.f49401b = bloomFilter.numHashFunctions;
            this.f49402c = bloomFilter.funnel;
            this.f49403d = bloomFilter.strategy;
        }
    }

    /* renamed from: com.google.common.hash.BloomFilter$b */
    interface C18072b extends Serializable {
        /* renamed from: a */
        <T> boolean mo46671a(T t, Funnel<? super T> funnel, int i, C18079a aVar);

        /* renamed from: b */
        <T> boolean mo46672b(T t, Funnel<? super T> funnel, int i, C18079a aVar);

        int ordinal();
    }

    private Object writeReplace() {
        return new C18071a(this);
    }

    /* access modifiers changed from: 0000 */
    public final long bitSize() {
        return this.bits.mo46681a();
    }

    public final BloomFilter<T> copy() {
        return new BloomFilter<>(this.bits.mo46686c(), this.numHashFunctions, this.funnel, this.strategy);
    }

    public final double expectedFpp() {
        double b = (double) this.bits.mo46684b();
        double bitSize = (double) bitSize();
        Double.isNaN(b);
        Double.isNaN(bitSize);
        return Math.pow(b / bitSize, (double) this.numHashFunctions);
    }

    public final int hashCode() {
        return C17434j.m57954a(Integer.valueOf(this.numHashFunctions), this.funnel, this.strategy, this.bits);
    }

    public final long approximateElementCount() {
        double b = (double) this.bits.mo46684b();
        double a = (double) this.bits.mo46681a();
        Double.isNaN(b);
        Double.isNaN(a);
        double d = -Math.log1p(-(b / a));
        Double.isNaN(a);
        double d2 = d * a;
        double d3 = (double) this.numHashFunctions;
        Double.isNaN(d3);
        return C18116a.m59880a(d2 / d3, RoundingMode.HALF_UP);
    }

    public final boolean apply(T t) {
        return mightContain(t);
    }

    public final boolean mightContain(T t) {
        return this.strategy.mo46672b(t, this.funnel, this.numHashFunctions, this.bits);
    }

    public final boolean put(T t) {
        return this.strategy.mo46671a(t, this.funnel, this.numHashFunctions, this.bits);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        BloomFilter bloomFilter = (BloomFilter) obj;
        if (this.numHashFunctions != bloomFilter.numHashFunctions || !this.funnel.equals(bloomFilter.funnel) || !this.bits.equals(bloomFilter.bits) || !this.strategy.equals(bloomFilter.strategy)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.common.hash.BloomFilter<T>, code=com.google.common.hash.BloomFilter, for r6v0, types: [com.google.common.hash.BloomFilter<T>, com.google.common.hash.BloomFilter, java.lang.Object] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isCompatible(com.google.common.hash.BloomFilter r6) {
        /*
            r5 = this;
            com.google.common.base.C17439m.m57962a(r6)
            if (r5 == r6) goto L_0x002d
            int r0 = r5.numHashFunctions
            int r1 = r6.numHashFunctions
            if (r0 != r1) goto L_0x002d
            long r0 = r5.bitSize()
            long r2 = r6.bitSize()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x002d
            com.google.common.hash.BloomFilter$b r0 = r5.strategy
            com.google.common.hash.BloomFilter$b r1 = r6.strategy
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002d
            com.google.common.hash.Funnel<? super T> r0 = r5.funnel
            com.google.common.hash.Funnel<? super T> r6 = r6.funnel
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x002d
            r6 = 1
            return r6
        L_0x002d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.BloomFilter.isCompatible(com.google.common.hash.BloomFilter):boolean");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.common.hash.BloomFilter<T>, code=com.google.common.hash.BloomFilter, for r14v0, types: [com.google.common.hash.BloomFilter<T>, com.google.common.hash.BloomFilter, java.lang.Object] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void putAll(com.google.common.hash.BloomFilter r14) {
        /*
            r13 = this;
            com.google.common.base.C17439m.m57962a(r14)
            r0 = 0
            r1 = 1
            if (r13 == r14) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            java.lang.String r3 = "Cannot combine a BloomFilter with itself."
            com.google.common.base.C17439m.m57969a(r2, r3)
            int r2 = r13.numHashFunctions
            int r3 = r14.numHashFunctions
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            java.lang.String r3 = "BloomFilters must have the same number of hash functions (%s != %s)"
            int r4 = r13.numHashFunctions
            int r5 = r14.numHashFunctions
            com.google.common.base.C17439m.m57972a(r2, r3, r4, r5)
            long r2 = r13.bitSize()
            long r4 = r14.bitSize()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x002f
            r7 = 1
            goto L_0x0030
        L_0x002f:
            r7 = 0
        L_0x0030:
            java.lang.String r8 = "BloomFilters must have the same size underlying bit arrays (%s != %s)"
            long r9 = r13.bitSize()
            long r11 = r14.bitSize()
            com.google.common.base.C17439m.m57974a(r7, r8, r9, r11)
            com.google.common.hash.BloomFilter$b r0 = r13.strategy
            com.google.common.hash.BloomFilter$b r1 = r14.strategy
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "BloomFilters must have equal strategies (%s != %s)"
            com.google.common.hash.BloomFilter$b r2 = r13.strategy
            com.google.common.hash.BloomFilter$b r3 = r14.strategy
            com.google.common.base.C17439m.m57977a(r0, r1, r2, r3)
            com.google.common.hash.Funnel<? super T> r0 = r13.funnel
            com.google.common.hash.Funnel<? super T> r1 = r14.funnel
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "BloomFilters must have equal funnels (%s != %s)"
            com.google.common.hash.Funnel<? super T> r2 = r13.funnel
            com.google.common.hash.Funnel<? super T> r3 = r14.funnel
            com.google.common.base.C17439m.m57977a(r0, r1, r2, r3)
            com.google.common.hash.d$a r0 = r13.bits
            com.google.common.hash.d$a r14 = r14.bits
            r0.mo46682a(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.BloomFilter.putAll(com.google.common.hash.BloomFilter):void");
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(C18148f.m59988a((long) this.strategy.ordinal()));
        dataOutputStream.writeByte(C18149g.m59989a((long) this.numHashFunctions));
        dataOutputStream.writeInt(this.bits.f49410a.length());
        for (int i = 0; i < this.bits.f49410a.length(); i++) {
            dataOutputStream.writeLong(this.bits.f49410a.get(i));
        }
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, int i) {
        return create(funnel2, (long) i);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, long j) {
        return create(funnel2, j, 0.03d);
    }

    static int optimalNumOfHashFunctions(long j, long j2) {
        double d = (double) j2;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.max(1, (int) Math.round((d / d2) * Math.log(2.0d)));
    }

    static long optimalNumOfBits(long j, double d) {
        if (d == 0.0d) {
            d = Double.MIN_VALUE;
        }
        double d2 = (double) (-j);
        double log = Math.log(d);
        Double.isNaN(d2);
        return (long) ((d2 * log) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel2) throws IOException {
        byte b;
        int i;
        int i2;
        C17439m.m57963a(inputStream, (Object) "InputStream");
        C17439m.m57963a(funnel2, (Object) "Funnel");
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            b = dataInputStream.readByte();
            try {
                i2 = C18149g.m59990a(dataInputStream.readByte());
                try {
                    i = dataInputStream.readInt();
                } catch (RuntimeException e) {
                    e = e;
                    i = -1;
                    StringBuilder sb = new StringBuilder("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
                    sb.append(b);
                    sb.append(" numHashFunctions: ");
                    sb.append(i2);
                    sb.append(" dataLength: ");
                    sb.append(i);
                    throw new IOException(sb.toString(), e);
                }
            } catch (RuntimeException e2) {
                e = e2;
                i2 = -1;
                i = -1;
                StringBuilder sb2 = new StringBuilder("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
                sb2.append(b);
                sb2.append(" numHashFunctions: ");
                sb2.append(i2);
                sb2.append(" dataLength: ");
                sb2.append(i);
                throw new IOException(sb2.toString(), e);
            }
            try {
                C18076d dVar = C18076d.values()[b];
                long[] jArr = new long[i];
                for (int i3 = 0; i3 < i; i3++) {
                    jArr[i3] = dataInputStream.readLong();
                }
                return new BloomFilter<>(new C18079a(jArr), i2, funnel2, dVar);
            } catch (RuntimeException e3) {
                e = e3;
                StringBuilder sb22 = new StringBuilder("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
                sb22.append(b);
                sb22.append(" numHashFunctions: ");
                sb22.append(i2);
                sb22.append(" dataLength: ");
                sb22.append(i);
                throw new IOException(sb22.toString(), e);
            }
        } catch (RuntimeException e4) {
            e = e4;
            b = -1;
            i2 = -1;
            i = -1;
            StringBuilder sb222 = new StringBuilder("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: ");
            sb222.append(b);
            sb222.append(" numHashFunctions: ");
            sb222.append(i2);
            sb222.append(" dataLength: ");
            sb222.append(i);
            throw new IOException(sb222.toString(), e);
        }
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, int i, double d) {
        return create(funnel2, (long) i, d);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel2, long j, double d) {
        return create(funnel2, j, d, C18076d.MURMUR128_MITZ_64);
    }

    private BloomFilter(C18079a aVar, int i, Funnel<? super T> funnel2, C18072b bVar) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57971a(z, "numHashFunctions (%s) must be > 0", i);
        if (i <= 255) {
            z2 = true;
        }
        C17439m.m57971a(z2, "numHashFunctions (%s) must be <= 255", i);
        this.bits = (C18079a) C17439m.m57962a(aVar);
        this.numHashFunctions = i;
        this.funnel = (Funnel) C17439m.m57962a(funnel2);
        this.strategy = (C18072b) C17439m.m57962a(bVar);
    }

    static <T> BloomFilter<T> create(Funnel<? super T> funnel2, long j, double d, C18072b bVar) {
        boolean z;
        boolean z2;
        C17439m.m57962a(funnel2);
        boolean z3 = false;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57973a(z, "Expected insertions (%s) must be >= 0", j);
        if (d > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17439m.m57976a(z2, "False positive probability (%s) must be > 0.0", (Object) Double.valueOf(d));
        if (d < 1.0d) {
            z3 = true;
        }
        C17439m.m57976a(z3, "False positive probability (%s) must be < 1.0", (Object) Double.valueOf(d));
        C17439m.m57962a(bVar);
        if (j == 0) {
            j = 1;
        }
        long optimalNumOfBits = optimalNumOfBits(j, d);
        try {
            return new BloomFilter<>(new C18079a(optimalNumOfBits), optimalNumOfHashFunctions(j, optimalNumOfBits), funnel2, bVar);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Could not create BloomFilter of ");
            sb.append(optimalNumOfBits);
            sb.append(" bits");
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }
}
