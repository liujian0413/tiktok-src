package shark.internal;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import shark.PrimitiveType;

/* renamed from: shark.internal.e */
public abstract class C48779e {

    /* renamed from: shark.internal.e$a */
    public static final class C48780a extends C48779e {

        /* renamed from: a */
        public final long f124000a;

        /* renamed from: b */
        public final int f124001b;

        /* renamed from: c */
        private final long f124002c;

        /* renamed from: a */
        public final long mo123551a() {
            return this.f124002c;
        }

        public C48780a(long j, long j2, int i) {
            super(null);
            this.f124002c = j;
            this.f124000a = j2;
            this.f124001b = i;
        }
    }

    /* renamed from: shark.internal.e$b */
    public static final class C48781b extends C48779e {

        /* renamed from: a */
        public final long f124003a;

        /* renamed from: b */
        private final long f124004b;

        /* renamed from: a */
        public final long mo123551a() {
            return this.f124004b;
        }

        public C48781b(long j, long j2) {
            super(null);
            this.f124004b = j;
            this.f124003a = j2;
        }
    }

    /* renamed from: shark.internal.e$c */
    public static final class C48782c extends C48779e {

        /* renamed from: a */
        public final long f124005a;

        /* renamed from: b */
        private final long f124006b;

        /* renamed from: a */
        public final long mo123551a() {
            return this.f124006b;
        }

        public C48782c(long j, long j2) {
            super(null);
            this.f124006b = j;
            this.f124005a = j2;
        }
    }

    /* renamed from: shark.internal.e$d */
    public static final class C48783d extends C48779e {

        /* renamed from: a */
        private final byte f124007a;

        /* renamed from: b */
        private final long f124008b;

        /* renamed from: a */
        public final long mo123551a() {
            return this.f124008b;
        }

        /* renamed from: b */
        public final PrimitiveType mo123552b() {
            return PrimitiveType.values()[this.f124007a];
        }

        public C48783d(long j, PrimitiveType primitiveType) {
            C7573i.m23587b(primitiveType, "primitiveType");
            super(null);
            this.f124008b = j;
            this.f124007a = (byte) primitiveType.ordinal();
        }
    }

    private C48779e() {
    }

    /* renamed from: a */
    public abstract long mo123551a();

    public /* synthetic */ C48779e(C7571f fVar) {
        this();
    }
}
