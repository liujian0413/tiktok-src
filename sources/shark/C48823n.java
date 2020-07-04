package shark;

import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: shark.n */
public abstract class C48823n {

    /* renamed from: shark.n$a */
    public static final class C48824a extends C48823n {

        /* renamed from: a */
        public static final C48824a f124117a = new C48824a();

        private C48824a() {
            super(null);
        }
    }

    /* renamed from: shark.n$b */
    public static abstract class C48825b extends C48823n {

        /* renamed from: shark.n$b$a */
        public static final class C48826a extends C48825b {

            /* renamed from: a */
            public final C48714c f124118a;

            public C48826a(C48714c cVar) {
                C7573i.m23587b(cVar, "gcRoot");
                super(null);
                this.f124118a = cVar;
            }
        }

        /* renamed from: shark.n$b$b */
        public static final class C48827b extends C48825b {

            /* renamed from: a */
            public final int f124119a;

            /* renamed from: b */
            public final long f124120b;

            public C48827b(int i, long j) {
                super(null);
                this.f124119a = i;
                this.f124120b = j;
            }
        }

        /* renamed from: shark.n$b$c */
        public static abstract class C48828c extends C48825b {

            /* renamed from: shark.n$b$c$a */
            public static final class C48829a extends C48828c {

                /* renamed from: a */
                public final long f124121a;

                /* renamed from: b */
                public final int f124122b;

                /* renamed from: c */
                public final long f124123c;

                /* renamed from: d */
                public final long f124124d;

                /* renamed from: e */
                public final long f124125e;

                /* renamed from: f */
                public final long f124126f;

                /* renamed from: g */
                public final int f124127g;

                /* renamed from: h */
                public final List<C48831b> f124128h;

                /* renamed from: i */
                public final List<C48830a> f124129i;

                /* renamed from: shark.n$b$c$a$a */
                public static final class C48830a {

                    /* renamed from: a */
                    public final long f124130a;

                    /* renamed from: b */
                    public final int f124131b;

                    public final boolean equals(Object obj) {
                        if (this != obj) {
                            if (obj instanceof C48830a) {
                                C48830a aVar = (C48830a) obj;
                                if (this.f124130a == aVar.f124130a) {
                                    if (this.f124131b == aVar.f124131b) {
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        return true;
                    }

                    public final int hashCode() {
                        long j = this.f124130a;
                        return (((int) (j ^ (j >>> 32))) * 31) + this.f124131b;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("FieldRecord(nameStringId=");
                        sb.append(this.f124130a);
                        sb.append(", type=");
                        sb.append(this.f124131b);
                        sb.append(")");
                        return sb.toString();
                    }

                    public C48830a(long j, int i) {
                        this.f124130a = j;
                        this.f124131b = i;
                    }
                }

                /* renamed from: shark.n$b$c$a$b */
                public static final class C48831b {

                    /* renamed from: a */
                    public final long f124132a;

                    /* renamed from: b */
                    public final int f124133b;

                    /* renamed from: c */
                    public final C48862x f124134c;

                    public final boolean equals(Object obj) {
                        if (this != obj) {
                            if (obj instanceof C48831b) {
                                C48831b bVar = (C48831b) obj;
                                if (this.f124132a == bVar.f124132a) {
                                    if (!(this.f124133b == bVar.f124133b) || !C7573i.m23585a((Object) this.f124134c, (Object) bVar.f124134c)) {
                                        return false;
                                    }
                                }
                            }
                            return false;
                        }
                        return true;
                    }

                    public final int hashCode() {
                        long j = this.f124132a;
                        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.f124133b) * 31;
                        C48862x xVar = this.f124134c;
                        return i + (xVar != null ? xVar.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("StaticFieldRecord(nameStringId=");
                        sb.append(this.f124132a);
                        sb.append(", type=");
                        sb.append(this.f124133b);
                        sb.append(", value=");
                        sb.append(this.f124134c);
                        sb.append(")");
                        return sb.toString();
                    }

                    public C48831b(long j, int i, C48862x xVar) {
                        C7573i.m23587b(xVar, "value");
                        this.f124132a = j;
                        this.f124133b = i;
                        this.f124134c = xVar;
                    }
                }

                public C48829a(long j, int i, long j2, long j3, long j4, long j5, int i2, List<C48831b> list, List<C48830a> list2) {
                    C7573i.m23587b(list, "staticFields");
                    C7573i.m23587b(list2, "fields");
                    super(null);
                    this.f124121a = j;
                    this.f124122b = i;
                    this.f124123c = j2;
                    this.f124124d = j3;
                    this.f124125e = j4;
                    this.f124126f = j5;
                    this.f124127g = i2;
                    this.f124128h = list;
                    this.f124129i = list2;
                }
            }

            /* renamed from: shark.n$b$c$b */
            public static final class C48832b extends C48828c {

                /* renamed from: a */
                public final long f124135a;

                /* renamed from: b */
                public final int f124136b;

                /* renamed from: c */
                public final long f124137c;

                /* renamed from: d */
                public final long f124138d;

                /* renamed from: e */
                public final long f124139e;

                /* renamed from: f */
                public final long f124140f;

                /* renamed from: g */
                public final int f124141g;

                /* renamed from: h */
                public final int f124142h;

                /* renamed from: i */
                public final int f124143i;

                public C48832b(long j, int i, long j2, long j3, long j4, long j5, int i2, int i3, int i4) {
                    super(null);
                    this.f124135a = j;
                    this.f124136b = i;
                    this.f124137c = j2;
                    this.f124138d = j3;
                    this.f124139e = j4;
                    this.f124140f = j5;
                    this.f124141g = i2;
                    this.f124142h = i3;
                    this.f124143i = i4;
                }
            }

            /* renamed from: shark.n$b$c$c */
            public static final class C48833c extends C48828c {

                /* renamed from: a */
                public final long f124144a;

                /* renamed from: b */
                public final int f124145b;

                /* renamed from: c */
                public final long f124146c;

                /* renamed from: d */
                public final byte[] f124147d;

                public C48833c(long j, int i, long j2, byte[] bArr) {
                    C7573i.m23587b(bArr, "fieldValues");
                    super(null);
                    this.f124144a = j;
                    this.f124145b = i;
                    this.f124146c = j2;
                    this.f124147d = bArr;
                }
            }

            /* renamed from: shark.n$b$c$d */
            public static final class C48834d extends C48828c {

                /* renamed from: a */
                public final long f124148a;

                /* renamed from: b */
                public final int f124149b;

                /* renamed from: c */
                public final long f124150c;

                public C48834d(long j, int i, long j2) {
                    super(null);
                    this.f124148a = j;
                    this.f124149b = i;
                    this.f124150c = j2;
                }
            }

            /* renamed from: shark.n$b$c$e */
            public static final class C48835e extends C48828c {

                /* renamed from: a */
                public final long f124151a;

                /* renamed from: b */
                public final int f124152b;

                /* renamed from: c */
                public final long f124153c;

                /* renamed from: d */
                public final long[] f124154d;

                public C48835e(long j, int i, long j2, long[] jArr) {
                    C7573i.m23587b(jArr, "elementIds");
                    super(null);
                    this.f124151a = j;
                    this.f124152b = i;
                    this.f124153c = j2;
                    this.f124154d = jArr;
                }
            }

            /* renamed from: shark.n$b$c$f */
            public static final class C48836f extends C48828c {

                /* renamed from: a */
                public final long f124155a;

                /* renamed from: b */
                public final int f124156b;

                /* renamed from: c */
                public final long f124157c;

                /* renamed from: d */
                public final int f124158d;

                public C48836f(long j, int i, long j2, int i2) {
                    super(null);
                    this.f124155a = j;
                    this.f124156b = i;
                    this.f124157c = j2;
                    this.f124158d = i2;
                }
            }

            /* renamed from: shark.n$b$c$g */
            public static abstract class C48837g extends C48828c {

                /* renamed from: shark.n$b$c$g$a */
                public static final class C48838a extends C48837g {

                    /* renamed from: a */
                    public final boolean[] f124159a;

                    /* renamed from: b */
                    private final long f124160b;

                    /* renamed from: c */
                    private final int f124161c;

                    public C48838a(long j, int i, boolean[] zArr) {
                        C7573i.m23587b(zArr, "array");
                        super(null);
                        this.f124160b = j;
                        this.f124161c = i;
                        this.f124159a = zArr;
                    }
                }

                /* renamed from: shark.n$b$c$g$b */
                public static final class C48839b extends C48837g {

                    /* renamed from: a */
                    public final byte[] f124162a;

                    /* renamed from: b */
                    private final long f124163b;

                    /* renamed from: c */
                    private final int f124164c;

                    public C48839b(long j, int i, byte[] bArr) {
                        C7573i.m23587b(bArr, "array");
                        super(null);
                        this.f124163b = j;
                        this.f124164c = i;
                        this.f124162a = bArr;
                    }
                }

                /* renamed from: shark.n$b$c$g$c */
                public static final class C48840c extends C48837g {

                    /* renamed from: a */
                    public final char[] f124165a;

                    /* renamed from: b */
                    private final long f124166b;

                    /* renamed from: c */
                    private final int f124167c;

                    public C48840c(long j, int i, char[] cArr) {
                        C7573i.m23587b(cArr, "array");
                        super(null);
                        this.f124166b = j;
                        this.f124167c = i;
                        this.f124165a = cArr;
                    }
                }

                /* renamed from: shark.n$b$c$g$d */
                public static final class C48841d extends C48837g {

                    /* renamed from: a */
                    public final double[] f124168a;

                    /* renamed from: b */
                    private final long f124169b;

                    /* renamed from: c */
                    private final int f124170c;

                    public C48841d(long j, int i, double[] dArr) {
                        C7573i.m23587b(dArr, "array");
                        super(null);
                        this.f124169b = j;
                        this.f124170c = i;
                        this.f124168a = dArr;
                    }
                }

                /* renamed from: shark.n$b$c$g$e */
                public static final class C48842e extends C48837g {

                    /* renamed from: a */
                    public final float[] f124171a;

                    /* renamed from: b */
                    private final long f124172b;

                    /* renamed from: c */
                    private final int f124173c;

                    public C48842e(long j, int i, float[] fArr) {
                        C7573i.m23587b(fArr, "array");
                        super(null);
                        this.f124172b = j;
                        this.f124173c = i;
                        this.f124171a = fArr;
                    }
                }

                /* renamed from: shark.n$b$c$g$f */
                public static final class C48843f extends C48837g {

                    /* renamed from: a */
                    public final int[] f124174a;

                    /* renamed from: b */
                    private final long f124175b;

                    /* renamed from: c */
                    private final int f124176c;

                    public C48843f(long j, int i, int[] iArr) {
                        C7573i.m23587b(iArr, "array");
                        super(null);
                        this.f124175b = j;
                        this.f124176c = i;
                        this.f124174a = iArr;
                    }
                }

                /* renamed from: shark.n$b$c$g$g */
                public static final class C48844g extends C48837g {

                    /* renamed from: a */
                    public final long[] f124177a;

                    /* renamed from: b */
                    private final long f124178b;

                    /* renamed from: c */
                    private final int f124179c;

                    public C48844g(long j, int i, long[] jArr) {
                        C7573i.m23587b(jArr, "array");
                        super(null);
                        this.f124178b = j;
                        this.f124179c = i;
                        this.f124177a = jArr;
                    }
                }

                /* renamed from: shark.n$b$c$g$h */
                public static final class C48845h extends C48837g {

                    /* renamed from: a */
                    public final short[] f124180a;

                    /* renamed from: b */
                    private final long f124181b;

                    /* renamed from: c */
                    private final int f124182c;

                    public C48845h(long j, int i, short[] sArr) {
                        C7573i.m23587b(sArr, "array");
                        super(null);
                        this.f124181b = j;
                        this.f124182c = i;
                        this.f124180a = sArr;
                    }
                }

                private C48837g() {
                    super(null);
                }

                public /* synthetic */ C48837g(C7571f fVar) {
                    this();
                }
            }

            /* renamed from: shark.n$b$c$h */
            public static final class C48846h extends C48828c {

                /* renamed from: a */
                public final long f124183a;

                /* renamed from: b */
                public final int f124184b;

                /* renamed from: c */
                public final int f124185c;

                /* renamed from: d */
                public final PrimitiveType f124186d;

                public C48846h(long j, int i, int i2, PrimitiveType primitiveType) {
                    C7573i.m23587b(primitiveType, "type");
                    super(null);
                    this.f124183a = j;
                    this.f124184b = i;
                    this.f124185c = i2;
                    this.f124186d = primitiveType;
                }
            }

            private C48828c() {
                super(null);
            }

            public /* synthetic */ C48828c(C7571f fVar) {
                this();
            }
        }

        private C48825b() {
            super(null);
        }

        public /* synthetic */ C48825b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: shark.n$c */
    public static final class C48847c extends C48823n {

        /* renamed from: a */
        public final int f124187a;

        /* renamed from: b */
        public final long f124188b;

        /* renamed from: c */
        public final int f124189c;

        /* renamed from: d */
        public final long f124190d;

        public C48847c(int i, long j, int i2, long j2) {
            super(null);
            this.f124187a = i;
            this.f124188b = j;
            this.f124189c = i2;
            this.f124190d = j2;
        }
    }

    /* renamed from: shark.n$d */
    public static final class C48848d extends C48823n {

        /* renamed from: a */
        public final long f124191a;

        /* renamed from: b */
        public final long f124192b;

        /* renamed from: c */
        public final long f124193c;

        /* renamed from: d */
        public final long f124194d;

        /* renamed from: e */
        public final int f124195e;

        /* renamed from: f */
        public final int f124196f;

        public C48848d(long j, long j2, long j3, long j4, int i, int i2) {
            super(null);
            this.f124191a = j;
            this.f124192b = j2;
            this.f124193c = j3;
            this.f124194d = j4;
            this.f124195e = i;
            this.f124196f = i2;
        }
    }

    /* renamed from: shark.n$e */
    public static final class C48849e extends C48823n {

        /* renamed from: a */
        public final int f124197a;

        /* renamed from: b */
        public final int f124198b;

        /* renamed from: c */
        public final long[] f124199c;

        public C48849e(int i, int i2, long[] jArr) {
            C7573i.m23587b(jArr, "stackFrameIds");
            super(null);
            this.f124197a = i;
            this.f124198b = i2;
            this.f124199c = jArr;
        }
    }

    /* renamed from: shark.n$f */
    public static final class C48850f extends C48823n {

        /* renamed from: a */
        public final long f124200a;

        /* renamed from: b */
        public final String f124201b;

        public C48850f(long j, String str) {
            C7573i.m23587b(str, "string");
            super(null);
            this.f124200a = j;
            this.f124201b = str;
        }
    }

    private C48823n() {
    }

    public /* synthetic */ C48823n(C7571f fVar) {
        this();
    }
}
