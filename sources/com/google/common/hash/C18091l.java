package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.common.hash.l */
final class C18091l extends C18073a implements Serializable {

    /* renamed from: a */
    static final C18082f f49416a = new C18091l(0);

    /* renamed from: b */
    static final C18082f f49417b = new C18091l(C18084h.f49414a);
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    private final int f49418c;

    /* renamed from: com.google.common.hash.l$a */
    static final class C18092a extends C18075c {

        /* renamed from: a */
        private long f49419a;

        /* renamed from: b */
        private long f49420b;

        /* renamed from: c */
        private int f49421c;

        /* renamed from: a */
        private static long m59838a(long j) {
            long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
            long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
            return j3 ^ (j3 >>> 33);
        }

        /* renamed from: b */
        public final C18080e mo46679b() {
            this.f49419a ^= (long) this.f49421c;
            this.f49420b ^= (long) this.f49421c;
            this.f49419a += this.f49420b;
            this.f49420b += this.f49419a;
            this.f49419a = m59838a(this.f49419a);
            this.f49420b = m59838a(this.f49420b);
            this.f49419a += this.f49420b;
            this.f49420b += this.f49419a;
            return C18080e.m59803a(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f49419a).putLong(this.f49420b).array());
        }

        C18092a(int i) {
            super(16);
            long j = (long) i;
            this.f49419a = j;
            this.f49420b = j;
        }

        /* renamed from: b */
        private static long m59840b(long j) {
            return Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
        }

        /* renamed from: c */
        private static long m59841c(long j) {
            return Long.rotateLeft(j * 5545529020109919103L, 33) * -8663945395140668459L;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo46678a(ByteBuffer byteBuffer) {
            m59839a(byteBuffer.getLong(), byteBuffer.getLong());
            this.f49421c += 16;
        }

        /* JADX INFO: used method not loaded: com.google.common.primitives.g.a(byte):null, types can be incorrect */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.C18149g.m59990a(r12.get(11))) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.C18149g.m59990a(r12.get(10))) << 16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0073, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.C18149g.m59990a(r12.get(9))) << 8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
            r0 = r0 ^ ((long) com.google.common.primitives.C18149g.m59990a(r12.get(8)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
            r2 = r12.getLong() ^ 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.C18149g.m59990a(r12.get(5))) << 40);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.C18149g.m59990a(r12.get(4))) << 32);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c0, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.C18149g.m59990a(r12.get(3))) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ce, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.C18149g.m59990a(r12.get(2))) << 16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dc, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.C18149g.m59990a(r12.get(1))) << 8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ea, code lost:
            r2 = ((long) com.google.common.primitives.C18149g.m59990a(r12.get(0))) ^ r0;
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f6, code lost:
            r11.f49419a = m59840b(r2) ^ r11.f49419a;
            r11.f49420b = m59841c(r0) ^ r11.f49420b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0108, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0036, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.C18149g.m59990a(r12.get(13))) << 40);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.C18149g.m59990a(r12.get(12))) << 32);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo46680b(java.nio.ByteBuffer r12) {
            /*
                r11 = this;
                int r0 = r11.f49421c
                int r1 = r12.remaining()
                int r0 = r0 + r1
                r11.f49421c = r0
                int r0 = r12.remaining()
                r1 = 48
                r2 = 40
                r3 = 32
                r4 = 24
                r5 = 16
                r6 = 8
                r7 = 0
                switch(r0) {
                    case 1: goto L_0x00e9;
                    case 2: goto L_0x00db;
                    case 3: goto L_0x00cd;
                    case 4: goto L_0x00bf;
                    case 5: goto L_0x00b0;
                    case 6: goto L_0x00a2;
                    case 7: goto L_0x0094;
                    case 8: goto L_0x008d;
                    case 9: goto L_0x0081;
                    case 10: goto L_0x0072;
                    case 11: goto L_0x0063;
                    case 12: goto L_0x0054;
                    case 13: goto L_0x0044;
                    case 14: goto L_0x0035;
                    case 15: goto L_0x0026;
                    default: goto L_0x001e;
                }
            L_0x001e:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                java.lang.String r0 = "Should never get here."
                r12.<init>(r0)
                throw r12
            L_0x0026:
                r0 = 14
                byte r0 = r12.get(r0)
                int r0 = com.google.common.primitives.C18149g.m59990a(r0)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r7
                goto L_0x0036
            L_0x0035:
                r0 = r7
            L_0x0036:
                r9 = 13
                byte r9 = r12.get(r9)
                int r9 = com.google.common.primitives.C18149g.m59990a(r9)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L_0x0045
            L_0x0044:
                r0 = r7
            L_0x0045:
                r2 = 12
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.C18149g.m59990a(r2)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L_0x0055
            L_0x0054:
                r0 = r7
            L_0x0055:
                r2 = 11
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.C18149g.m59990a(r2)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L_0x0064
            L_0x0063:
                r0 = r7
            L_0x0064:
                r2 = 10
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.C18149g.m59990a(r2)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L_0x0073
            L_0x0072:
                r0 = r7
            L_0x0073:
                r2 = 9
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.C18149g.m59990a(r2)
                long r2 = (long) r2
                long r2 = r2 << r6
                long r0 = r0 ^ r2
                goto L_0x0082
            L_0x0081:
                r0 = r7
            L_0x0082:
                byte r2 = r12.get(r6)
                int r2 = com.google.common.primitives.C18149g.m59990a(r2)
                long r2 = (long) r2
                long r0 = r0 ^ r2
                goto L_0x008e
            L_0x008d:
                r0 = r7
            L_0x008e:
                long r2 = r12.getLong()
                long r2 = r2 ^ r7
                goto L_0x00f6
            L_0x0094:
                r0 = 6
                byte r0 = r12.get(r0)
                int r0 = com.google.common.primitives.C18149g.m59990a(r0)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r7
                goto L_0x00a3
            L_0x00a2:
                r0 = r7
            L_0x00a3:
                r9 = 5
                byte r9 = r12.get(r9)
                int r9 = com.google.common.primitives.C18149g.m59990a(r9)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L_0x00b1
            L_0x00b0:
                r0 = r7
            L_0x00b1:
                r2 = 4
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.C18149g.m59990a(r2)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L_0x00c0
            L_0x00bf:
                r0 = r7
            L_0x00c0:
                r2 = 3
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.C18149g.m59990a(r2)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L_0x00ce
            L_0x00cd:
                r0 = r7
            L_0x00ce:
                r2 = 2
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.C18149g.m59990a(r2)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L_0x00dc
            L_0x00db:
                r0 = r7
            L_0x00dc:
                r2 = 1
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.C18149g.m59990a(r2)
                long r2 = (long) r2
                long r2 = r2 << r6
                long r0 = r0 ^ r2
                goto L_0x00ea
            L_0x00e9:
                r0 = r7
            L_0x00ea:
                r2 = 0
                byte r12 = r12.get(r2)
                int r12 = com.google.common.primitives.C18149g.m59990a(r12)
                long r2 = (long) r12
                long r2 = r2 ^ r0
                r0 = r7
            L_0x00f6:
                long r4 = r11.f49419a
                long r2 = m59840b(r2)
                long r2 = r2 ^ r4
                r11.f49419a = r2
                long r2 = r11.f49420b
                long r0 = m59841c(r0)
                long r0 = r0 ^ r2
                r11.f49420b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.C18091l.C18092a.mo46680b(java.nio.ByteBuffer):void");
        }

        /* renamed from: a */
        private void m59839a(long j, long j2) {
            this.f49419a = m59840b(j) ^ this.f49419a;
            this.f49419a = Long.rotateLeft(this.f49419a, 27);
            this.f49419a += this.f49420b;
            this.f49419a = (this.f49419a * 5) + 1390208809;
            this.f49420b ^= m59841c(j2);
            this.f49420b = Long.rotateLeft(this.f49420b, 31);
            this.f49420b += this.f49419a;
            this.f49420b = (this.f49420b * 5) + 944331445;
        }
    }

    /* renamed from: a */
    public final C18083g mo46698a() {
        return new C18092a(this.f49418c);
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.f49418c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Hashing.murmur3_128(");
        sb.append(this.f49418c);
        sb.append(")");
        return sb.toString();
    }

    private C18091l(int i) {
        this.f49418c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18091l)) {
            return false;
        }
        if (this.f49418c == ((C18091l) obj).f49418c) {
            return true;
        }
        return false;
    }
}
