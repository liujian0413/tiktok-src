package shark;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C7579l;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C48038d;
import okio.BufferedSource;
import shark.C48823n.C48825b.C48827b;
import shark.C48823n.C48825b.C48828c.C48829a;
import shark.C48823n.C48825b.C48828c.C48829a.C48830a;
import shark.C48823n.C48825b.C48828c.C48829a.C48831b;
import shark.C48823n.C48825b.C48828c.C48832b;
import shark.C48823n.C48825b.C48828c.C48833c;
import shark.C48823n.C48825b.C48828c.C48834d;
import shark.C48823n.C48825b.C48828c.C48835e;
import shark.C48823n.C48825b.C48828c.C48836f;
import shark.C48823n.C48825b.C48828c.C48837g;
import shark.C48823n.C48825b.C48828c.C48837g.C48838a;
import shark.C48823n.C48825b.C48828c.C48837g.C48839b;
import shark.C48823n.C48825b.C48828c.C48837g.C48840c;
import shark.C48823n.C48825b.C48828c.C48837g.C48841d;
import shark.C48823n.C48825b.C48828c.C48837g.C48842e;
import shark.C48823n.C48825b.C48828c.C48837g.C48843f;
import shark.C48823n.C48825b.C48828c.C48837g.C48844g;
import shark.C48823n.C48825b.C48828c.C48837g.C48845h;
import shark.C48823n.C48825b.C48828c.C48846h;
import shark.C48862x.C48863a;
import shark.C48862x.C48864b;
import shark.C48862x.C48865c;
import shark.C48862x.C48867e;
import shark.C48862x.C48868f;
import shark.C48862x.C48869g;
import shark.C48862x.C48870h;
import shark.C48862x.C48871i;
import shark.C48862x.C48872j;
import shark.PrimitiveType.C48709a;

/* renamed from: shark.m */
public final class C48821m {

    /* renamed from: d */
    public static final C48822a f124095d = new C48822a(null);

    /* renamed from: g */
    private static final int f124096g = PrimitiveType.BOOLEAN.getByteSize();

    /* renamed from: h */
    private static final int f124097h = PrimitiveType.CHAR.getByteSize();

    /* renamed from: i */
    private static final int f124098i = PrimitiveType.FLOAT.getByteSize();

    /* renamed from: j */
    private static final int f124099j = PrimitiveType.DOUBLE.getByteSize();

    /* renamed from: k */
    private static final int f124100k = PrimitiveType.BYTE.getByteSize();

    /* renamed from: l */
    private static final int f124101l = PrimitiveType.SHORT.getByteSize();

    /* renamed from: m */
    private static final int f124102m = PrimitiveType.INT.getByteSize();

    /* renamed from: n */
    private static final int f124103n = PrimitiveType.LONG.getByteSize();

    /* renamed from: o */
    private static final int f124104o = PrimitiveType.BOOLEAN.getHprofType();

    /* renamed from: p */
    private static final int f124105p = PrimitiveType.CHAR.getHprofType();

    /* renamed from: q */
    private static final int f124106q = PrimitiveType.FLOAT.getHprofType();

    /* renamed from: r */
    private static final int f124107r = PrimitiveType.DOUBLE.getHprofType();

    /* renamed from: s */
    private static final int f124108s = PrimitiveType.BYTE.getHprofType();

    /* renamed from: t */
    private static final int f124109t = PrimitiveType.SHORT.getHprofType();

    /* renamed from: u */
    private static final int f124110u = PrimitiveType.INT.getHprofType();

    /* renamed from: v */
    private static final int f124111v = PrimitiveType.LONG.getHprofType();

    /* renamed from: a */
    public long f124112a = this.f124114c;

    /* renamed from: b */
    public final int f124113b;

    /* renamed from: c */
    public final long f124114c;

    /* renamed from: e */
    private final Map<Integer, Integer> f124115e = C7507ae.m23390a(C48709a.m150452a(), C7579l.m23633a(Integer.valueOf(2), Integer.valueOf(this.f124113b)));

    /* renamed from: f */
    private BufferedSource f124116f;

    /* renamed from: shark.m$a */
    public static final class C48822a {
        private C48822a() {
        }

        public /* synthetic */ C48822a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: l */
    private final boolean m150781l() {
        return this.f124116f.exhausted();
    }

    /* renamed from: t */
    private final int m150789t() {
        return m150782m() & 255;
    }

    /* renamed from: A */
    private final void m150758A() {
        m150780l(this.f124113b + this.f124113b);
    }

    /* renamed from: i */
    private final short m150774i() {
        this.f124112a += (long) f124101l;
        return this.f124116f.readShort();
    }

    /* renamed from: j */
    private final int m150776j() {
        this.f124112a += (long) f124102m;
        return this.f124116f.readInt();
    }

    /* renamed from: k */
    private final long m150778k() {
        this.f124112a += (long) f124103n;
        return this.f124116f.readLong();
    }

    /* renamed from: m */
    private final byte m150782m() {
        this.f124112a += (long) f124100k;
        return this.f124116f.readByte();
    }

    /* renamed from: o */
    private final char m150784o() {
        return m150759a(f124097h, C48038d.f122882c).charAt(0);
    }

    /* renamed from: p */
    private final float m150785p() {
        return Float.intBitsToFloat(m150776j());
    }

    /* renamed from: q */
    private final double m150786q() {
        return Double.longBitsToDouble(m150778k());
    }

    /* renamed from: s */
    private final long m150788s() {
        return ((long) m150776j()) & 4294967295L;
    }

    /* renamed from: u */
    private final int m150790u() {
        return m150774i() & 65535;
    }

    /* renamed from: z */
    private final C48827b m150795z() {
        return new C48827b(m150776j(), m150787r());
    }

    /* renamed from: e */
    private C48834d m150766e() {
        long r = m150787r();
        int j = m150776j();
        long r2 = m150787r();
        m150780l(m150776j());
        C48834d dVar = new C48834d(r, j, r2);
        return dVar;
    }

    /* renamed from: h */
    private C48836f m150772h() {
        long r = m150787r();
        int j = m150776j();
        int j2 = m150776j();
        long r2 = m150787r();
        m150780l(this.f124113b * j2);
        C48836f fVar = new C48836f(r, j, r2, j2);
        return fVar;
    }

    /* renamed from: n */
    private final boolean m150783n() {
        this.f124112a += (long) f124096g;
        if (this.f124116f.readByte() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private final void m150791v() {
        m150780l(this.f124113b + f124102m + this.f124113b);
        m150780l(m150776j());
    }

    /* renamed from: x */
    private final void m150793x() {
        m150780l(this.f124113b + f124102m);
        m150780l(this.f124113b + (m150776j() * this.f124113b));
    }

    /* renamed from: y */
    private final void m150794y() {
        m150780l(this.f124113b + f124102m);
        m150780l(m150776j() * m150762b(m150789t()));
    }

    /* renamed from: g */
    private C48846h m150770g() {
        long r = m150787r();
        int j = m150776j();
        int j2 = m150776j();
        PrimitiveType primitiveType = (PrimitiveType) C7507ae.m23398b(C48709a.m150453b(), Integer.valueOf(m150789t()));
        m150780l(primitiveType.getByteSize() * j2);
        C48846h hVar = new C48846h(r, j, j2, primitiveType);
        return hVar;
    }

    /* renamed from: r */
    private final long m150787r() {
        int i = this.f124113b;
        if (i == 4) {
            return (long) m150776j();
        }
        if (i == 8) {
            return m150778k();
        }
        switch (i) {
            case 1:
                return (long) m150782m();
            case 2:
                return (long) m150774i();
            default:
                throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
        }
    }

    /* renamed from: a */
    public final C48833c mo123594a() {
        C48833c cVar = new C48833c(m150787r(), m150776j(), m150787r(), m150779k(m150776j()));
        return cVar;
    }

    /* renamed from: d */
    public final C48835e mo123598d() {
        C48835e eVar = new C48835e(m150787r(), m150776j(), m150787r(), m150764c(m150776j()));
        return eVar;
    }

    /* renamed from: w */
    private final void m150792w() {
        m150780l(this.f124113b + f124102m + this.f124113b + this.f124113b + this.f124113b + this.f124113b + this.f124113b + this.f124113b + f124102m);
        int u = m150790u();
        for (int i = 0; i < u; i++) {
            m150780l(f124101l);
            m150780l(m150762b(m150789t()));
        }
        int u2 = m150790u();
        for (int i2 = 0; i2 < u2; i2++) {
            m150780l(this.f124113b);
            m150780l(m150762b(m150789t()));
        }
        m150780l(m150790u() * (this.f124113b + f124100k));
    }

    /* renamed from: f */
    private C48832b m150768f() {
        int i;
        long r = m150787r();
        int j = m150776j();
        long r2 = m150787r();
        long r3 = m150787r();
        long r4 = m150787r();
        long r5 = m150787r();
        m150787r();
        m150787r();
        int j2 = m150776j();
        int u = m150790u();
        for (int i2 = 0; i2 < u; i2++) {
            m150780l(f124101l);
            m150780l(m150762b(m150789t()));
        }
        int u2 = m150790u();
        int i3 = 0;
        while (i3 < u2) {
            m150780l(this.f124113b);
            int t = m150789t();
            int i4 = u2;
            if (t == 2) {
                i = this.f124113b;
            } else {
                i = ((Number) C7507ae.m23398b(C48709a.m150452a(), Integer.valueOf(t))).intValue();
            }
            m150780l(i);
            i3++;
            u2 = i4;
        }
        int i5 = u2;
        int u3 = m150790u();
        m150780l((this.f124113b + 1) * u3);
        C48832b bVar = new C48832b(r, j, r2, r3, r4, r5, j2, u2, u3);
        return bVar;
    }

    /* renamed from: b */
    public final C48829a mo123596b() {
        C48821m mVar = this;
        long r = m150787r();
        int j = m150776j();
        long r2 = m150787r();
        long r3 = m150787r();
        long r4 = m150787r();
        long r5 = m150787r();
        m150787r();
        m150787r();
        int j2 = m150776j();
        int u = m150790u();
        for (int i = 0; i < u; i++) {
            mVar.m150780l(f124101l);
            mVar.m150780l(mVar.m150762b(m150789t()));
        }
        int u2 = m150790u();
        ArrayList arrayList = new ArrayList(u2);
        int i2 = 0;
        while (i2 < u2) {
            long j3 = r5;
            long r6 = m150787r();
            int i3 = u2;
            int t = m150789t();
            int i4 = j2;
            arrayList.add(new C48831b(r6, t, mVar.m150760a(t)));
            i2++;
            r5 = j3;
            u2 = i3;
            j2 = i4;
            mVar = this;
        }
        long j4 = r5;
        int i5 = j2;
        int u3 = m150790u();
        ArrayList arrayList2 = new ArrayList(u3);
        int i6 = 0;
        while (i6 < u3) {
            long j5 = r4;
            arrayList2.add(new C48830a(m150787r(), m150789t()));
            i6++;
            r4 = j5;
        }
        long j6 = r4;
        C48829a aVar = new C48829a(r, j, r2, r3, r4, j4, i5, arrayList, arrayList2);
        return aVar;
    }

    /* renamed from: c */
    public final C48837g mo123597c() {
        long r = m150787r();
        int j = m150776j();
        int j2 = m150776j();
        int t = m150789t();
        if (t == f124104o) {
            return new C48838a(r, j, m150765d(j2));
        }
        if (t == f124105p) {
            return new C48840c(r, j, m150767e(j2));
        }
        if (t == f124106q) {
            return new C48842e(r, j, m150769f(j2));
        }
        if (t == f124107r) {
            return new C48841d(r, j, m150771g(j2));
        }
        if (t == f124108s) {
            return new C48839b(r, j, m150779k(j2));
        }
        if (t == f124109t) {
            return new C48845h(r, j, m150773h(j2));
        }
        if (t == f124110u) {
            return new C48843f(r, j, m150775i(j2));
        }
        if (t == f124111v) {
            return new C48844g(r, j, m150777j(j2));
        }
        StringBuilder sb = new StringBuilder("Unexpected type ");
        sb.append(t);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    private final String m150763b(long j) {
        this.f124112a += j;
        return this.f124116f.readUtf8(j);
    }

    /* renamed from: c */
    private final long[] m150764c(int i) {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = m150787r();
        }
        return jArr;
    }

    /* renamed from: f */
    private final float[] m150769f(int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = m150785p();
        }
        return fArr;
    }

    /* renamed from: g */
    private final double[] m150771g(int i) {
        double[] dArr = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            dArr[i2] = m150786q();
        }
        return dArr;
    }

    /* renamed from: h */
    private final short[] m150773h(int i) {
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = m150774i();
        }
        return sArr;
    }

    /* renamed from: l */
    private final void m150780l(int i) {
        long j = (long) i;
        this.f124112a += j;
        this.f124116f.skip(j);
    }

    /* renamed from: a */
    private final void m150761a(long j) {
        this.f124112a += j;
        this.f124116f.skip(j);
    }

    /* renamed from: b */
    private final int m150762b(int i) {
        return ((Number) C7507ae.m23398b(this.f124115e, Integer.valueOf(i))).intValue();
    }

    /* renamed from: d */
    private final boolean[] m150765d(int i) {
        boolean z;
        boolean[] zArr = new boolean[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (m150782m() != 0) {
                z = true;
            } else {
                z = false;
            }
            zArr[i2] = z;
        }
        return zArr;
    }

    /* renamed from: i */
    private final int[] m150775i(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = m150776j();
        }
        return iArr;
    }

    /* renamed from: j */
    private final long[] m150777j(int i) {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = m150778k();
        }
        return jArr;
    }

    /* renamed from: k */
    private final byte[] m150779k(int i) {
        long j = (long) i;
        this.f124112a += j;
        return this.f124116f.readByteArray(j);
    }

    /* renamed from: e */
    private final char[] m150767e(int i) {
        String a = m150759a(f124097h * i, C48038d.f122882c);
        if (a != null) {
            char[] charArray = a.toCharArray();
            C7573i.m23582a((Object) charArray, "(this as java.lang.String).toCharArray()");
            return charArray;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private C48862x m150760a(int i) {
        if (i == 2) {
            return new C48871i(m150787r());
        }
        if (i == f124104o) {
            return new C48863a(m150783n());
        }
        if (i == f124105p) {
            return new C48865c(m150784o());
        }
        if (i == f124106q) {
            return new C48868f(m150785p());
        }
        if (i == f124107r) {
            return new C48867e(m150786q());
        }
        if (i == f124108s) {
            return new C48864b(m150782m());
        }
        if (i == f124109t) {
            return new C48872j(m150774i());
        }
        if (i == f124110u) {
            return new C48869g(m150776j());
        }
        if (i == f124111v) {
            return new C48870h(m150778k());
        }
        StringBuilder sb = new StringBuilder("Unknown type ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private final String m150759a(int i, Charset charset) {
        long j = (long) i;
        this.f124112a += j;
        return this.f124116f.readString(j, charset);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123595a(java.util.Set<? extends kotlin.reflect.C7584c<? extends shark.C48823n>> r48, shark.C48858u r49) {
        /*
            r47 = this;
            r0 = r47
            r1 = r48
            r2 = r49
            java.lang.String r3 = "recordTypes"
            kotlin.jvm.internal.C7573i.m23587b(r1, r3)
            java.lang.String r3 = "listener"
            kotlin.jvm.internal.C7573i.m23587b(r2, r3)
            java.lang.Class<shark.n> r3 = shark.C48823n.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L_0x002b
            java.lang.Class<shark.n$f> r6 = shark.C48823n.C48850f.class
            kotlin.reflect.c r6 = kotlin.jvm.internal.C7575l.m23595a(r6)
            boolean r6 = r1.contains(r6)
            if (r6 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r6 = 0
            goto L_0x002c
        L_0x002b:
            r6 = 1
        L_0x002c:
            if (r3 != 0) goto L_0x003d
            java.lang.Class<shark.n$c> r7 = shark.C48823n.C48847c.class
            kotlin.reflect.c r7 = kotlin.jvm.internal.C7575l.m23595a(r7)
            boolean r7 = r1.contains(r7)
            if (r7 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r7 = 0
            goto L_0x003e
        L_0x003d:
            r7 = 1
        L_0x003e:
            if (r3 != 0) goto L_0x004f
            java.lang.Class<shark.n$a> r8 = shark.C48823n.C48824a.class
            kotlin.reflect.c r8 = kotlin.jvm.internal.C7575l.m23595a(r8)
            boolean r8 = r1.contains(r8)
            if (r8 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r8 = 0
            goto L_0x0050
        L_0x004f:
            r8 = 1
        L_0x0050:
            if (r3 != 0) goto L_0x0061
            java.lang.Class<shark.n$d> r9 = shark.C48823n.C48848d.class
            kotlin.reflect.c r9 = kotlin.jvm.internal.C7575l.m23595a(r9)
            boolean r9 = r1.contains(r9)
            if (r9 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r9 = 0
            goto L_0x0062
        L_0x0061:
            r9 = 1
        L_0x0062:
            if (r3 != 0) goto L_0x0073
            java.lang.Class<shark.n$e> r10 = shark.C48823n.C48849e.class
            kotlin.reflect.c r10 = kotlin.jvm.internal.C7575l.m23595a(r10)
            boolean r10 = r1.contains(r10)
            if (r10 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r10 = 0
            goto L_0x0074
        L_0x0073:
            r10 = 1
        L_0x0074:
            if (r3 != 0) goto L_0x0085
            java.lang.Class<shark.n$b> r11 = shark.C48823n.C48825b.class
            kotlin.reflect.c r11 = kotlin.jvm.internal.C7575l.m23595a(r11)
            boolean r11 = r1.contains(r11)
            if (r11 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r11 = 0
            goto L_0x0086
        L_0x0085:
            r11 = 1
        L_0x0086:
            if (r11 != 0) goto L_0x0097
            java.lang.Class<shark.n$b$a> r12 = shark.C48823n.C48825b.C48826a.class
            kotlin.reflect.c r12 = kotlin.jvm.internal.C7575l.m23595a(r12)
            boolean r12 = r1.contains(r12)
            if (r12 == 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r12 = 0
            goto L_0x0098
        L_0x0097:
            r12 = 1
        L_0x0098:
            if (r3 != 0) goto L_0x00a9
            java.lang.Class<shark.n$b$b> r3 = shark.C48823n.C48825b.C48827b.class
            kotlin.reflect.c r3 = kotlin.jvm.internal.C7575l.m23595a(r3)
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r3 = 0
            goto L_0x00aa
        L_0x00a9:
            r3 = 1
        L_0x00aa:
            if (r11 != 0) goto L_0x00bb
            java.lang.Class<shark.n$b$c> r11 = shark.C48823n.C48825b.C48828c.class
            kotlin.reflect.c r11 = kotlin.jvm.internal.C7575l.m23595a(r11)
            boolean r11 = r1.contains(r11)
            if (r11 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            r11 = 0
            goto L_0x00bc
        L_0x00bb:
            r11 = 1
        L_0x00bc:
            if (r11 != 0) goto L_0x00cd
            java.lang.Class<shark.n$b$c$a> r13 = shark.C48823n.C48825b.C48828c.C48829a.class
            kotlin.reflect.c r13 = kotlin.jvm.internal.C7575l.m23595a(r13)
            boolean r13 = r1.contains(r13)
            if (r13 == 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r13 = 0
            goto L_0x00ce
        L_0x00cd:
            r13 = 1
        L_0x00ce:
            java.lang.Class<shark.n$b$c$b> r14 = shark.C48823n.C48825b.C48828c.C48832b.class
            kotlin.reflect.c r14 = kotlin.jvm.internal.C7575l.m23595a(r14)
            boolean r14 = r1.contains(r14)
            if (r11 != 0) goto L_0x00e9
            java.lang.Class<shark.n$b$c$c> r15 = shark.C48823n.C48825b.C48828c.C48833c.class
            kotlin.reflect.c r15 = kotlin.jvm.internal.C7575l.m23595a(r15)
            boolean r15 = r1.contains(r15)
            if (r15 == 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            r15 = 0
            goto L_0x00ea
        L_0x00e9:
            r15 = 1
        L_0x00ea:
            java.lang.Class<shark.n$b$c$d> r16 = shark.C48823n.C48825b.C48828c.C48834d.class
            kotlin.reflect.c r4 = kotlin.jvm.internal.C7575l.m23595a(r16)
            boolean r4 = r1.contains(r4)
            if (r11 != 0) goto L_0x0105
            java.lang.Class<shark.n$b$c$e> r16 = shark.C48823n.C48825b.C48828c.C48835e.class
            kotlin.reflect.c r5 = kotlin.jvm.internal.C7575l.m23595a(r16)
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r5 = 0
            goto L_0x0106
        L_0x0105:
            r5 = 1
        L_0x0106:
            java.lang.Class<shark.n$b$c$f> r16 = shark.C48823n.C48825b.C48828c.C48836f.class
            r17 = r6
            kotlin.reflect.c r6 = kotlin.jvm.internal.C7575l.m23595a(r16)
            boolean r6 = r1.contains(r6)
            if (r11 != 0) goto L_0x0123
            java.lang.Class<shark.n$b$c$g> r11 = shark.C48823n.C48825b.C48828c.C48837g.class
            kotlin.reflect.c r11 = kotlin.jvm.internal.C7575l.m23595a(r11)
            boolean r11 = r1.contains(r11)
            if (r11 == 0) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r11 = 0
            goto L_0x0124
        L_0x0123:
            r11 = 1
        L_0x0124:
            java.lang.Class<shark.n$b$c$h> r16 = shark.C48823n.C48825b.C48828c.C48846h.class
            r18 = r7
            kotlin.reflect.c r7 = kotlin.jvm.internal.C7575l.m23595a(r16)
            boolean r1 = r1.contains(r7)
            shark.PrimitiveType r7 = shark.PrimitiveType.INT
            int r7 = r7.getByteSize()
        L_0x0136:
            boolean r16 = r47.m150781l()
            if (r16 != 0) goto L_0x06a1
            int r16 = r47.m150789t()
            r0.m150780l(r7)
            r19 = r9
            r20 = r10
            long r9 = r47.m150788s()
            switch(r16) {
                case 1: goto L_0x065d;
                case 2: goto L_0x0628;
                case 4: goto L_0x05ea;
                case 5: goto L_0x05b5;
                case 12: goto L_0x018b;
                case 28: goto L_0x018b;
                case 44: goto L_0x0163;
                default: goto L_0x014e;
            }
        L_0x014e:
            r35 = r3
            r26 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r21 = r8
            r22 = r13
            r23 = r14
            r0.m150761a(r9)
            goto L_0x068b
        L_0x0163:
            if (r8 == 0) goto L_0x0179
            long r9 = r0.f124112a
            shark.n$a r16 = shark.C48823n.C48824a.f124117a
            r21 = r8
            r8 = r16
            shark.n r8 = (shark.C48823n) r8
            r2.mo123550a(r9, r8)
            r9 = r19
            r10 = r20
            r8 = r21
            goto L_0x0136
        L_0x0179:
            r21 = r8
            r35 = r3
            r26 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r22 = r13
            r23 = r14
            goto L_0x068b
        L_0x018b:
            r21 = r8
            r22 = r13
            r23 = r14
            long r13 = r0.f124112a
            r24 = 0
            r26 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r4 = r24
            r8 = 0
        L_0x01a0:
            long r6 = r0.f124112a
            long r6 = r6 - r13
            int r16 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r16 >= 0) goto L_0x05b1
            long r6 = r0.f124112a
            r30 = r13
            int r13 = r47.m150789t()
            r14 = 144(0x90, float:2.02E-43)
            if (r13 == r14) goto L_0x0582
            r14 = 195(0xc3, float:2.73E-43)
            if (r13 == r14) goto L_0x0578
            switch(r13) {
                case 1: goto L_0x054b;
                case 2: goto L_0x0519;
                case 3: goto L_0x04e5;
                case 4: goto L_0x04b7;
                case 5: goto L_0x048f;
                case 6: goto L_0x0461;
                case 7: goto L_0x0439;
                case 8: goto L_0x0405;
                default: goto L_0x01ba;
            }
        L_0x01ba:
            switch(r13) {
                case 32: goto L_0x03dc;
                case 33: goto L_0x03b3;
                case 34: goto L_0x038a;
                case 35: goto L_0x0361;
                default: goto L_0x01bd;
            }
        L_0x01bd:
            switch(r13) {
                case 137: goto L_0x0339;
                case 138: goto L_0x0311;
                case 139: goto L_0x02e9;
                case 140: goto L_0x02c1;
                case 141: goto L_0x0299;
                case 142: goto L_0x0261;
                default: goto L_0x01c0;
            }
        L_0x01c0:
            switch(r13) {
                case 254: goto L_0x0248;
                case 255: goto L_0x0222;
                default: goto L_0x01c3;
            }
        L_0x01c3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown tag "
            r1.<init>(r2)
            r14 = 1
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r9 = 0
            r2[r9] = r3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r14)
            java.lang.String r3 = "0x%02x"
            java.lang.String r2 = com.C1642a.m8034a(r3, r2)
            java.lang.String r3 = "java.lang.String.format(this, *args)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r1.append(r2)
            java.lang.String r2 = " at "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = " after "
            r1.append(r2)
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r8 = 0
            r2[r8] = r3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r14)
            java.lang.String r3 = "0x%02x"
            java.lang.String r2 = com.C1642a.m8034a(r3, r2)
            java.lang.String r3 = "java.lang.String.format(this, *args)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r1.append(r2)
            java.lang.String r2 = " at "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        L_0x0222:
            r8 = 0
            r14 = 1
            if (r12 == 0) goto L_0x0240
            long r4 = r0.f124112a
            shark.n$b$a r8 = new shark.n$b$a
            shark.c$n r14 = new shark.c$n
            r32 = r6
            long r6 = r47.m150787r()
            r14.<init>(r6)
            shark.c r14 = (shark.C48714c) r14
            r8.<init>(r14)
            shark.n r8 = (shark.C48823n) r8
            r2.mo123550a(r4, r8)
            goto L_0x0257
        L_0x0240:
            r32 = r6
            int r4 = r0.f124113b
            r0.m150780l(r4)
            goto L_0x0257
        L_0x0248:
            r32 = r6
            if (r3 == 0) goto L_0x025d
            long r4 = r0.f124112a
            shark.n$b$b r6 = r47.m150795z()
            shark.n r6 = (shark.C48823n) r6
            r2.mo123550a(r4, r6)
        L_0x0257:
            r35 = r3
            r34 = r13
            goto L_0x05a7
        L_0x025d:
            r47.m150758A()
            goto L_0x0257
        L_0x0261:
            r32 = r6
            if (r12 == 0) goto L_0x028a
            long r4 = r0.f124112a
            shark.n$b$a r6 = new shark.n$b$a
            shark.c$g r7 = new shark.c$g
            r34 = r13
            long r13 = r47.m150787r()
            int r8 = r47.m150776j()
            r35 = r3
            int r3 = r47.m150776j()
            r7.<init>(r13, r8, r3)
            shark.c r7 = (shark.C48714c) r7
            r6.<init>(r7)
            shark.n r6 = (shark.C48823n) r6
            r2.mo123550a(r4, r6)
            goto L_0x05a7
        L_0x028a:
            r35 = r3
            r34 = r13
            int r3 = r0.f124113b
            int r3 = r3 + r29
            int r3 = r3 + r29
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x0299:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x02ba
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$p r6 = new shark.c$p
            long r7 = r47.m150787r()
            r6.<init>(r7)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x02ba:
            int r3 = r0.f124113b
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x02c1:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x02e2
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$j r6 = new shark.c$j
            long r7 = r47.m150787r()
            r6.<init>(r7)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x02e2:
            int r3 = r0.f124113b
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x02e9:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x030a
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$a r6 = new shark.c$a
            long r7 = r47.m150787r()
            r6.<init>(r7)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x030a:
            int r3 = r0.f124113b
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x0311:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x0332
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$b r6 = new shark.c$b
            long r7 = r47.m150787r()
            r6.<init>(r7)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x0332:
            int r3 = r0.f124113b
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x0339:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x035a
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$c r6 = new shark.c$c
            long r7 = r47.m150787r()
            r6.<init>(r7)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x035a:
            int r3 = r0.f124113b
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x0361:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r11 == 0) goto L_0x0376
            long r3 = r0.f124112a
            shark.n$b$c$g r5 = r47.mo123597c()
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x0376:
            if (r1 == 0) goto L_0x0385
            long r3 = r0.f124112a
            shark.n$b$c$h r5 = r47.m150770g()
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x0385:
            r47.m150794y()
            goto L_0x05a7
        L_0x038a:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r27 == 0) goto L_0x039f
            long r3 = r0.f124112a
            shark.n$b$c$e r5 = r47.mo123598d()
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x039f:
            if (r28 == 0) goto L_0x03ae
            long r3 = r0.f124112a
            shark.n$b$c$f r5 = r47.m150772h()
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x03ae:
            r47.m150793x()
            goto L_0x05a7
        L_0x03b3:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r15 == 0) goto L_0x03c8
            long r3 = r0.f124112a
            shark.n$b$c$c r5 = r47.mo123594a()
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x03c8:
            if (r26 == 0) goto L_0x03d7
            long r3 = r0.f124112a
            shark.n$b$c$d r5 = r47.m150766e()
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x03d7:
            r47.m150791v()
            goto L_0x05a7
        L_0x03dc:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r22 == 0) goto L_0x03f1
            long r3 = r0.f124112a
            shark.n$b$c$a r5 = r47.mo123596b()
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x03f1:
            if (r23 == 0) goto L_0x0400
            long r3 = r0.f124112a
            shark.n$b$c$b r5 = r47.m150768f()
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x0400:
            r47.m150792w()
            goto L_0x05a7
        L_0x0405:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x042e
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$m r6 = new shark.c$m
            long r7 = r47.m150787r()
            int r13 = r47.m150776j()
            int r14 = r47.m150776j()
            r6.<init>(r7, r13, r14)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x042e:
            int r3 = r0.f124113b
            int r3 = r3 + r29
            int r3 = r3 + r29
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x0439:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x045a
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$h r6 = new shark.c$h
            long r7 = r47.m150787r()
            r6.<init>(r7)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x045a:
            int r3 = r0.f124113b
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x0461:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x0486
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$l r6 = new shark.c$l
            long r7 = r47.m150787r()
            int r13 = r47.m150776j()
            r6.<init>(r7, r13)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x0486:
            int r3 = r0.f124113b
            int r3 = r3 + r29
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x048f:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x04b0
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$k r6 = new shark.c$k
            long r7 = r47.m150787r()
            r6.<init>(r7)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x04b0:
            int r3 = r0.f124113b
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x04b7:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x04dc
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$i r6 = new shark.c$i
            long r7 = r47.m150787r()
            int r13 = r47.m150776j()
            r6.<init>(r7, r13)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x04dc:
            int r3 = r0.f124113b
            int r3 = r3 + r29
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x04e5:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x050e
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$d r6 = new shark.c$d
            long r7 = r47.m150787r()
            int r13 = r47.m150776j()
            int r14 = r47.m150776j()
            r6.<init>(r7, r13, r14)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x050e:
            int r3 = r0.f124113b
            int r3 = r3 + r29
            int r3 = r3 + r29
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x0519:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x0541
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$f r6 = new shark.c$f
            long r7 = r47.m150787r()
            int r13 = r47.m150776j()
            int r14 = r47.m150776j()
            r6.<init>(r7, r13, r14)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x0541:
            int r3 = r0.f124113b
            int r3 = r3 + r29
            int r3 = r3 + r29
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x054b:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x056f
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$e r6 = new shark.c$e
            long r7 = r47.m150787r()
            long r13 = r47.m150787r()
            r6.<init>(r7, r13)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x056f:
            int r3 = r0.f124113b
            int r4 = r0.f124113b
            int r3 = r3 + r4
            r0.m150780l(r3)
            goto L_0x05a7
        L_0x0578:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "PRIMITIVE_ARRAY_NODATA cannot be parsed"
            r1.<init>(r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0582:
            r35 = r3
            r32 = r6
            r34 = r13
            if (r12 == 0) goto L_0x05a2
            long r3 = r0.f124112a
            shark.n$b$a r5 = new shark.n$b$a
            shark.c$o r6 = new shark.c$o
            long r7 = r47.m150787r()
            r6.<init>(r7)
            shark.c r6 = (shark.C48714c) r6
            r5.<init>(r6)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x05a7
        L_0x05a2:
            int r3 = r0.f124113b
            r0.m150780l(r3)
        L_0x05a7:
            r13 = r30
            r4 = r32
            r8 = r34
            r3 = r35
            goto L_0x01a0
        L_0x05b1:
            r35 = r3
            goto L_0x068b
        L_0x05b5:
            r35 = r3
            r26 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r21 = r8
            r22 = r13
            r23 = r14
            if (r20 == 0) goto L_0x05e5
            long r3 = r0.f124112a
            int r5 = r47.m150776j()
            int r6 = r47.m150776j()
            int r7 = r47.m150776j()
            long[] r7 = r0.m150764c(r7)
            shark.n$e r8 = new shark.n$e
            r8.<init>(r5, r6, r7)
            shark.n r8 = (shark.C48823n) r8
            r2.mo123550a(r3, r8)
            goto L_0x068b
        L_0x05e5:
            r0.m150761a(r9)
            goto L_0x068b
        L_0x05ea:
            r35 = r3
            r26 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r21 = r8
            r22 = r13
            r23 = r14
            if (r19 == 0) goto L_0x0624
            long r3 = r0.f124112a
            shark.n$d r5 = new shark.n$d
            long r37 = r47.m150787r()
            long r39 = r47.m150787r()
            long r41 = r47.m150787r()
            long r43 = r47.m150787r()
            int r45 = r47.m150776j()
            int r46 = r47.m150776j()
            r36 = r5
            r36.<init>(r37, r39, r41, r43, r45, r46)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x068b
        L_0x0624:
            r0.m150761a(r9)
            goto L_0x068b
        L_0x0628:
            r35 = r3
            r26 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r21 = r8
            r22 = r13
            r23 = r14
            if (r18 == 0) goto L_0x0659
            long r3 = r0.f124112a
            int r37 = r47.m150776j()
            long r38 = r47.m150787r()
            int r40 = r47.m150776j()
            long r41 = r47.m150787r()
            shark.n$c r5 = new shark.n$c
            r36 = r5
            r36.<init>(r37, r38, r40, r41)
            shark.n r5 = (shark.C48823n) r5
            r2.mo123550a(r3, r5)
            goto L_0x068b
        L_0x0659:
            r0.m150761a(r9)
            goto L_0x068b
        L_0x065d:
            r35 = r3
            r26 = r4
            r27 = r5
            r28 = r6
            r29 = r7
            r21 = r8
            r22 = r13
            r23 = r14
            if (r17 == 0) goto L_0x0688
            long r3 = r0.f124112a
            long r5 = r47.m150787r()
            int r7 = r0.f124113b
            long r7 = (long) r7
            long r9 = r9 - r7
            java.lang.String r7 = r0.m150763b(r9)
            shark.n$f r8 = new shark.n$f
            r8.<init>(r5, r7)
            shark.n r8 = (shark.C48823n) r8
            r2.mo123550a(r3, r8)
            goto L_0x068b
        L_0x0688:
            r0.m150761a(r9)
        L_0x068b:
            r9 = r19
            r10 = r20
            r8 = r21
            r13 = r22
            r14 = r23
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r3 = r35
            goto L_0x0136
        L_0x06a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.C48821m.mo123595a(java.util.Set, shark.u):void");
    }

    public C48821m(BufferedSource bufferedSource, int i, long j) {
        C7573i.m23587b(bufferedSource, "source");
        this.f124116f = bufferedSource;
        this.f124113b = i;
        this.f124114c = j;
    }
}
