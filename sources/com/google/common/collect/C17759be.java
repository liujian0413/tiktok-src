package com.google.common.collect;

import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.common.collect.be */
final class C17759be<T> implements Serializable {

    /* renamed from: a */
    public final Comparator<? super T> f48985a;

    /* renamed from: b */
    public final boolean f48986b;

    /* renamed from: c */
    public final T f48987c;

    /* renamed from: d */
    public final BoundType f48988d;

    /* renamed from: e */
    public final boolean f48989e;

    /* renamed from: f */
    public final T f48990f;

    /* renamed from: g */
    public final BoundType f48991g;

    public final int hashCode() {
        return C17434j.m57954a(this.f48985a, this.f48987c, this.f48988d, this.f48990f, this.f48991g);
    }

    public final String toString() {
        char c;
        T t;
        T t2;
        char c2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f48985a);
        sb.append(":");
        if (this.f48988d == BoundType.CLOSED) {
            c = '[';
        } else {
            c = '(';
        }
        sb.append(c);
        if (this.f48986b) {
            t = this.f48987c;
        } else {
            t = "-∞";
        }
        sb.append(t);
        sb.append(',');
        if (this.f48989e) {
            t2 = this.f48990f;
        } else {
            t2 = "∞";
        }
        sb.append(t2);
        if (this.f48991g == BoundType.CLOSED) {
            c2 = ']';
        } else {
            c2 = ')';
        }
        sb.append(c2);
        return sb.toString();
    }

    /* renamed from: a */
    static <T> C17759be<T> m59056a(Comparator<? super T> comparator) {
        C17759be beVar = new C17759be(comparator, false, null, BoundType.OPEN, false, null, BoundType.OPEN);
        return beVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo45961c(T t) {
        if (mo45959a(t) || mo45960b(t)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo45959a(T t) {
        boolean z;
        boolean z2;
        if (!this.f48986b) {
            return false;
        }
        int compare = this.f48985a.compare(t, this.f48987c);
        boolean z3 = true;
        if (compare < 0) {
            z = true;
        } else {
            z = false;
        }
        if (compare == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f48988d != BoundType.OPEN) {
            z3 = false;
        }
        return (z2 & z3) | z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo45960b(T t) {
        boolean z;
        boolean z2;
        if (!this.f48989e) {
            return false;
        }
        int compare = this.f48985a.compare(t, this.f48990f);
        boolean z3 = true;
        if (compare > 0) {
            z = true;
        } else {
            z = false;
        }
        if (compare == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f48991g != BoundType.OPEN) {
            z3 = false;
        }
        return (z2 & z3) | z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17759be)) {
            return false;
        }
        C17759be beVar = (C17759be) obj;
        if (!this.f48985a.equals(beVar.f48985a) || this.f48986b != beVar.f48986b || this.f48989e != beVar.f48989e || !this.f48988d.equals(beVar.f48988d) || !this.f48991g.equals(beVar.f48991g) || !C17434j.m57955a(this.f48987c, beVar.f48987c) || !C17434j.m57955a(this.f48990f, beVar.f48990f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r12.f48991g != com.google.common.collect.BoundType.OPEN) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r12.f48988d != com.google.common.collect.BoundType.OPEN) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.collect.C17759be<T> mo45958a(com.google.common.collect.C17759be<T> r12) {
        /*
            r11 = this;
            com.google.common.base.C17439m.m57962a(r12)
            java.util.Comparator<? super T> r0 = r11.f48985a
            java.util.Comparator<? super T> r1 = r12.f48985a
            boolean r0 = r0.equals(r1)
            com.google.common.base.C17439m.m57968a(r0)
            boolean r0 = r11.f48986b
            T r1 = r11.f48987c
            com.google.common.collect.BoundType r2 = r11.f48988d
            boolean r3 = r11.f48986b
            if (r3 != 0) goto L_0x001b
            boolean r0 = r12.f48986b
            goto L_0x0033
        L_0x001b:
            boolean r3 = r12.f48986b
            if (r3 == 0) goto L_0x0037
            java.util.Comparator<? super T> r3 = r11.f48985a
            T r4 = r11.f48987c
            T r5 = r12.f48987c
            int r3 = r3.compare(r4, r5)
            if (r3 < 0) goto L_0x0033
            if (r3 != 0) goto L_0x0037
            com.google.common.collect.BoundType r3 = r12.f48988d
            com.google.common.collect.BoundType r4 = com.google.common.collect.BoundType.OPEN
            if (r3 != r4) goto L_0x0037
        L_0x0033:
            T r1 = r12.f48987c
            com.google.common.collect.BoundType r2 = r12.f48988d
        L_0x0037:
            r5 = r0
            boolean r0 = r11.f48989e
            T r3 = r11.f48990f
            com.google.common.collect.BoundType r4 = r11.f48991g
            boolean r6 = r11.f48989e
            if (r6 != 0) goto L_0x0045
            boolean r0 = r12.f48989e
            goto L_0x005d
        L_0x0045:
            boolean r6 = r12.f48989e
            if (r6 == 0) goto L_0x0061
            java.util.Comparator<? super T> r6 = r11.f48985a
            T r7 = r11.f48990f
            T r8 = r12.f48990f
            int r6 = r6.compare(r7, r8)
            if (r6 > 0) goto L_0x005d
            if (r6 != 0) goto L_0x0061
            com.google.common.collect.BoundType r6 = r12.f48991g
            com.google.common.collect.BoundType r7 = com.google.common.collect.BoundType.OPEN
            if (r6 != r7) goto L_0x0061
        L_0x005d:
            T r3 = r12.f48990f
            com.google.common.collect.BoundType r4 = r12.f48991g
        L_0x0061:
            r8 = r0
            r9 = r3
            if (r5 == 0) goto L_0x0081
            if (r8 == 0) goto L_0x0081
            java.util.Comparator<? super T> r12 = r11.f48985a
            int r12 = r12.compare(r1, r9)
            if (r12 > 0) goto L_0x0079
            if (r12 != 0) goto L_0x0081
            com.google.common.collect.BoundType r12 = com.google.common.collect.BoundType.OPEN
            if (r2 != r12) goto L_0x0081
            com.google.common.collect.BoundType r12 = com.google.common.collect.BoundType.OPEN
            if (r4 != r12) goto L_0x0081
        L_0x0079:
            com.google.common.collect.BoundType r12 = com.google.common.collect.BoundType.OPEN
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
            r7 = r12
            r10 = r0
            r6 = r9
            goto L_0x0084
        L_0x0081:
            r6 = r1
            r7 = r2
            r10 = r4
        L_0x0084:
            com.google.common.collect.be r12 = new com.google.common.collect.be
            java.util.Comparator<? super T> r4 = r11.f48985a
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C17759be.mo45958a(com.google.common.collect.be):com.google.common.collect.be");
    }

    /* renamed from: b */
    static <T> C17759be<T> m59058b(Comparator<? super T> comparator, T t, BoundType boundType) {
        C17759be beVar = new C17759be(comparator, false, null, BoundType.OPEN, true, t, boundType);
        return beVar;
    }

    /* renamed from: a */
    static <T> C17759be<T> m59057a(Comparator<? super T> comparator, T t, BoundType boundType) {
        C17759be beVar = new C17759be(comparator, true, t, boundType, false, null, BoundType.OPEN);
        return beVar;
    }

    private C17759be(Comparator<? super T> comparator, boolean z, T t, BoundType boundType, boolean z2, T t2, BoundType boundType2) {
        boolean z3;
        boolean z4;
        this.f48985a = (Comparator) C17439m.m57962a(comparator);
        this.f48986b = z;
        this.f48989e = z2;
        this.f48987c = t;
        this.f48988d = (BoundType) C17439m.m57962a(boundType);
        this.f48990f = t2;
        this.f48991g = (BoundType) C17439m.m57962a(boundType2);
        if (z) {
            comparator.compare(t, t);
        }
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z && z2) {
            int compare = comparator.compare(t, t2);
            boolean z5 = false;
            if (compare <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            C17439m.m57977a(z3, "lowerEndpoint (%s) > upperEndpoint (%s)", (Object) t, (Object) t2);
            if (compare == 0) {
                if (boundType != BoundType.OPEN) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (boundType2 != BoundType.OPEN) {
                    z5 = true;
                }
                C17439m.m57968a(z4 | z5);
            }
        }
    }
}
