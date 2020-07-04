package kotlin.p356e;

import kotlin.collections.C7506ac;
import kotlin.internal.C47971c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.p358a.C7565a;

/* renamed from: kotlin.e.a */
public class C7547a implements Iterable<Integer>, C7565a {

    /* renamed from: d */
    public static final C7548a f20876d = new C7548a(null);

    /* renamed from: a */
    public final int f20877a;

    /* renamed from: b */
    public final int f20878b;

    /* renamed from: c */
    public final int f20879c;

    /* renamed from: kotlin.e.a$a */
    public static final class C7548a {
        private C7548a() {
        }

        public /* synthetic */ C7548a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C7547a m23554a(int i, int i2, int i3) {
            return new C7547a(i, i2, -1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C7506ac iterator() {
        return new C47964b(this.f20877a, this.f20878b, this.f20879c);
    }

    /* renamed from: a */
    public boolean mo19429a() {
        if (this.f20879c > 0) {
            if (this.f20877a > this.f20878b) {
                return true;
            }
            return false;
        } else if (this.f20877a < this.f20878b) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        if (mo19429a()) {
            return -1;
        }
        return (((this.f20877a * 31) + this.f20878b) * 31) + this.f20879c;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f20879c > 0) {
            sb = new StringBuilder();
            sb.append(this.f20877a);
            sb.append("..");
            sb.append(this.f20878b);
            sb.append(" step ");
            i = this.f20879c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f20877a);
            sb.append(" downTo ");
            sb.append(this.f20878b);
            sb.append(" step ");
            i = -this.f20879c;
        }
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2.f20879c == r3.f20879c) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.p356e.C7547a
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.mo19429a()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.e.a r0 = (kotlin.p356e.C7547a) r0
            boolean r0 = r0.mo19429a()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            int r0 = r2.f20877a
            kotlin.e.a r3 = (kotlin.p356e.C7547a) r3
            int r1 = r3.f20877a
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f20878b
            int r1 = r3.f20878b
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f20879c
            int r3 = r3.f20879c
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            return r3
        L_0x0029:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p356e.C7547a.equals(java.lang.Object):boolean");
    }

    public C7547a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f20877a = i;
            this.f20878b = C47971c.m148913a(i, i2, i3);
            this.f20879c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
