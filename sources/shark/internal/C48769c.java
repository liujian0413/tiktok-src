package shark.internal;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C48038d;
import shark.C48823n.C48825b.C48828c.C48829a.C48830a;
import shark.C48823n.C48825b.C48828c.C48833c;
import shark.C48862x;
import shark.C48862x.C48863a;
import shark.C48862x.C48864b;
import shark.C48862x.C48865c;
import shark.C48862x.C48867e;
import shark.C48862x.C48868f;
import shark.C48862x.C48869g;
import shark.C48862x.C48870h;
import shark.C48862x.C48871i;
import shark.C48862x.C48872j;
import shark.PrimitiveType;

/* renamed from: shark.internal.c */
public final class C48769c {

    /* renamed from: a */
    public static final C48770a f123956a = new C48770a(null);

    /* renamed from: e */
    private static final int f123957e = PrimitiveType.BOOLEAN.getHprofType();

    /* renamed from: f */
    private static final int f123958f = PrimitiveType.CHAR.getHprofType();

    /* renamed from: g */
    private static final int f123959g = PrimitiveType.FLOAT.getHprofType();

    /* renamed from: h */
    private static final int f123960h = PrimitiveType.DOUBLE.getHprofType();

    /* renamed from: i */
    private static final int f123961i = PrimitiveType.BYTE.getHprofType();

    /* renamed from: j */
    private static final int f123962j = PrimitiveType.SHORT.getHprofType();

    /* renamed from: k */
    private static final int f123963k = PrimitiveType.INT.getHprofType();

    /* renamed from: l */
    private static final int f123964l = PrimitiveType.LONG.getHprofType();

    /* renamed from: b */
    private int f123965b;

    /* renamed from: c */
    private final C48833c f123966c;

    /* renamed from: d */
    private final int f123967d;

    /* renamed from: shark.internal.c$a */
    public static final class C48770a {
        private C48770a() {
        }

        public /* synthetic */ C48770a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    private final byte m150626c() {
        byte b = this.f123966c.f124147d[this.f123965b];
        this.f123965b++;
        return b;
    }

    /* renamed from: g */
    private final float m150630g() {
        return Float.intBitsToFloat(m150627d());
    }

    /* renamed from: h */
    private final double m150631h() {
        return Double.longBitsToDouble(m150629f());
    }

    /* renamed from: b */
    private final boolean m150625b() {
        byte b = this.f123966c.f124147d[this.f123965b];
        this.f123965b++;
        if (b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final int m150627d() {
        int b = C48762b.m150581b(this.f123966c.f124147d, this.f123965b);
        this.f123965b += 4;
        return b;
    }

    /* renamed from: e */
    private final short m150628e() {
        short a = C48762b.m150580a(this.f123966c.f124147d, this.f123965b);
        this.f123965b += 2;
        return a;
    }

    /* renamed from: f */
    private final long m150629f() {
        long c = C48762b.m150582c(this.f123966c.f124147d, this.f123965b);
        this.f123965b += 8;
        return c;
    }

    /* renamed from: i */
    private final char m150632i() {
        String str = new String(this.f123966c.f124147d, this.f123965b, 2, C48038d.f122882c);
        this.f123965b += 2;
        return str.charAt(0);
    }

    /* renamed from: a */
    private final long m150624a() {
        int i = this.f123967d;
        if (i == 4) {
            return (long) m150627d();
        }
        if (i == 8) {
            return m150629f();
        }
        switch (i) {
            case 1:
                return (long) m150626c();
            case 2:
                return (long) m150628e();
            default:
                throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
        }
    }

    /* renamed from: a */
    public final C48862x mo123541a(C48830a aVar) {
        C7573i.m23587b(aVar, "field");
        int i = aVar.f124131b;
        if (i == 2) {
            return new C48871i(m150624a());
        }
        if (i == f123957e) {
            return new C48863a(m150625b());
        }
        if (i == f123958f) {
            return new C48865c(m150632i());
        }
        if (i == f123959g) {
            return new C48868f(m150630g());
        }
        if (i == f123960h) {
            return new C48867e(m150631h());
        }
        if (i == f123961i) {
            return new C48864b(m150626c());
        }
        if (i == f123962j) {
            return new C48872j(m150628e());
        }
        if (i == f123963k) {
            return new C48869g(m150627d());
        }
        if (i == f123964l) {
            return new C48870h(m150629f());
        }
        StringBuilder sb = new StringBuilder("Unknown type ");
        sb.append(aVar.f124131b);
        throw new IllegalStateException(sb.toString());
    }

    public C48769c(C48833c cVar, int i) {
        C7573i.m23587b(cVar, "record");
        this.f123966c = cVar;
        this.f123967d = i;
    }
}
