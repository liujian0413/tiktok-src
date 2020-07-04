package shark;

import kotlin.jvm.internal.C7571f;

/* renamed from: shark.x */
public abstract class C48862x {

    /* renamed from: a */
    public static final C48866d f124219a = new C48866d(null);

    /* renamed from: shark.x$a */
    public static final class C48863a extends C48862x {

        /* renamed from: b */
        public final boolean f124220b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C48863a) {
                    if (this.f124220b == ((C48863a) obj).f124220b) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f124220b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BooleanHolder(value=");
            sb.append(this.f124220b);
            sb.append(")");
            return sb.toString();
        }

        public C48863a(boolean z) {
            super(null);
            this.f124220b = z;
        }
    }

    /* renamed from: shark.x$b */
    public static final class C48864b extends C48862x {

        /* renamed from: b */
        public final byte f124221b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C48864b) {
                    if (this.f124221b == ((C48864b) obj).f124221b) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f124221b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ByteHolder(value=");
            sb.append(this.f124221b);
            sb.append(")");
            return sb.toString();
        }

        public C48864b(byte b) {
            super(null);
            this.f124221b = b;
        }
    }

    /* renamed from: shark.x$c */
    public static final class C48865c extends C48862x {

        /* renamed from: b */
        public final char f124222b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C48865c) {
                    if (this.f124222b == ((C48865c) obj).f124222b) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f124222b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharHolder(value=");
            sb.append(this.f124222b);
            sb.append(")");
            return sb.toString();
        }

        public C48865c(char c) {
            super(null);
            this.f124222b = c;
        }
    }

    /* renamed from: shark.x$d */
    public static final class C48866d {
        private C48866d() {
        }

        public /* synthetic */ C48866d(C7571f fVar) {
            this();
        }
    }

    /* renamed from: shark.x$e */
    public static final class C48867e extends C48862x {

        /* renamed from: b */
        public final double f124223b;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (java.lang.Double.compare(r4.f124223b, ((shark.C48862x.C48867e) r5).f124223b) == 0) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                if (r4 == r5) goto L_0x0015
                boolean r0 = r5 instanceof shark.C48862x.C48867e
                if (r0 == 0) goto L_0x0013
                shark.x$e r5 = (shark.C48862x.C48867e) r5
                double r0 = r4.f124223b
                double r2 = r5.f124223b
                int r5 = java.lang.Double.compare(r0, r2)
                if (r5 != 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r5 = 0
                return r5
            L_0x0015:
                r5 = 1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: shark.C48862x.C48867e.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.f124223b);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DoubleHolder(value=");
            sb.append(this.f124223b);
            sb.append(")");
            return sb.toString();
        }

        public C48867e(double d) {
            super(null);
            this.f124223b = d;
        }
    }

    /* renamed from: shark.x$f */
    public static final class C48868f extends C48862x {

        /* renamed from: b */
        public final float f124224b;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (java.lang.Float.compare(r1.f124224b, ((shark.C48862x.C48868f) r2).f124224b) == 0) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof shark.C48862x.C48868f
                if (r0 == 0) goto L_0x0013
                shark.x$f r2 = (shark.C48862x.C48868f) r2
                float r0 = r1.f124224b
                float r2 = r2.f124224b
                int r2 = java.lang.Float.compare(r0, r2)
                if (r2 != 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: shark.C48862x.C48868f.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f124224b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FloatHolder(value=");
            sb.append(this.f124224b);
            sb.append(")");
            return sb.toString();
        }

        public C48868f(float f) {
            super(null);
            this.f124224b = f;
        }
    }

    /* renamed from: shark.x$g */
    public static final class C48869g extends C48862x {

        /* renamed from: b */
        public final int f124225b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C48869g) {
                    if (this.f124225b == ((C48869g) obj).f124225b) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f124225b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IntHolder(value=");
            sb.append(this.f124225b);
            sb.append(")");
            return sb.toString();
        }

        public C48869g(int i) {
            super(null);
            this.f124225b = i;
        }
    }

    /* renamed from: shark.x$h */
    public static final class C48870h extends C48862x {

        /* renamed from: b */
        public final long f124226b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C48870h) {
                    if (this.f124226b == ((C48870h) obj).f124226b) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.f124226b;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LongHolder(value=");
            sb.append(this.f124226b);
            sb.append(")");
            return sb.toString();
        }

        public C48870h(long j) {
            super(null);
            this.f124226b = j;
        }
    }

    /* renamed from: shark.x$i */
    public static final class C48871i extends C48862x {

        /* renamed from: b */
        public final long f124227b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C48871i) {
                    if (this.f124227b == ((C48871i) obj).f124227b) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.f124227b;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReferenceHolder(value=");
            sb.append(this.f124227b);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public final boolean mo123634a() {
            if (this.f124227b == 0) {
                return true;
            }
            return false;
        }

        public C48871i(long j) {
            super(null);
            this.f124227b = j;
        }
    }

    /* renamed from: shark.x$j */
    public static final class C48872j extends C48862x {

        /* renamed from: b */
        public final short f124228b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C48872j) {
                    if (this.f124228b == ((C48872j) obj).f124228b) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f124228b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShortHolder(value=");
            sb.append(this.f124228b);
            sb.append(")");
            return sb.toString();
        }

        public C48872j(short s) {
            super(null);
            this.f124228b = s;
        }
    }

    private C48862x() {
    }

    public /* synthetic */ C48862x(C7571f fVar) {
        this();
    }
}
