package kotlin.p356e;

import kotlin.jvm.internal.C7571f;

/* renamed from: kotlin.e.c */
public final class C7549c extends C7547a {

    /* renamed from: e */
    public static final C7549c f20880e = new C7549c(1, 0);

    /* renamed from: f */
    public static final C7550a f20881f = new C7550a(null);

    /* renamed from: kotlin.e.c$a */
    public static final class C7550a {
        private C7550a() {
        }

        /* renamed from: a */
        public static C7549c m23559a() {
            return C7549c.f20880e;
        }

        public /* synthetic */ C7550a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final Integer mo19435b() {
        return Integer.valueOf(this.f20877a);
    }

    /* renamed from: c */
    public final Integer mo19436c() {
        return Integer.valueOf(this.f20878b);
    }

    /* renamed from: a */
    public final boolean mo19429a() {
        if (this.f20877a > this.f20878b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (mo19429a()) {
            return -1;
        }
        return (this.f20877a * 31) + this.f20878b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20877a);
        sb.append("..");
        sb.append(this.f20878b);
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo19434a(int i) {
        if (this.f20877a > i || i > this.f20878b) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r2.f20878b == r3.f20878b) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.p356e.C7549c
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.mo19429a()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.e.c r0 = (kotlin.p356e.C7549c) r0
            boolean r0 = r0.mo19429a()
            if (r0 != 0) goto L_0x0021
        L_0x0013:
            int r0 = r2.f20877a
            kotlin.e.c r3 = (kotlin.p356e.C7549c) r3
            int r1 = r3.f20877a
            if (r0 != r1) goto L_0x0023
            int r0 = r2.f20878b
            int r3 = r3.f20878b
            if (r0 != r3) goto L_0x0023
        L_0x0021:
            r3 = 1
            return r3
        L_0x0023:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p356e.C7549c.equals(java.lang.Object):boolean");
    }

    public C7549c(int i, int i2) {
        super(i, i2, 1);
    }
}
