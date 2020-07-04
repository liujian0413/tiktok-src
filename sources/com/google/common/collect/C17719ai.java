package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.primitives.C18143c;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.ai */
public abstract class C17719ai<C extends Comparable> {

    /* renamed from: a */
    final boolean f48958a;

    /* renamed from: com.google.common.collect.ai$a */
    static final class C17721a extends C17719ai<Integer> implements Serializable {

        /* renamed from: b */
        public static final C17721a f48959b = new C17721a();
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return f48959b;
        }

        public final String toString() {
            return "DiscreteDomain.integers()";
        }

        C17721a() {
            super();
        }

        /* renamed from: e */
        private static Integer m58989e() {
            return Integer.valueOf(Integer.MIN_VALUE);
        }

        /* renamed from: f */
        private static Integer m58990f() {
            return Integer.valueOf(Integer.MAX_VALUE);
        }

        /* renamed from: c */
        public final /* synthetic */ Comparable mo45851c() {
            return m58989e();
        }

        /* renamed from: d */
        public final /* synthetic */ Comparable mo45852d() {
            return m58990f();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Comparable mo45848a(Comparable comparable) {
            return m58986a((Integer) comparable);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Comparable mo45850b(Comparable comparable) {
            return m58988b((Integer) comparable);
        }

        /* renamed from: a */
        private static Integer m58986a(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        /* renamed from: b */
        private static Integer m58988b(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }

        /* renamed from: a */
        private static long m58985a(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        /* renamed from: a */
        private static Integer m58987a(Integer num, long j) {
            C18053v.m59701a(j, "distance");
            return Integer.valueOf(C18143c.m59967a(num.longValue() + j));
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ long mo45847a(Comparable comparable, Comparable comparable2) {
            return m58985a((Integer) comparable, (Integer) comparable2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Comparable mo45849a(Comparable comparable, long j) {
            return m58987a((Integer) comparable, j);
        }
    }

    /* renamed from: com.google.common.collect.ai$b */
    static final class C17722b extends C17719ai<Long> implements Serializable {

        /* renamed from: b */
        public static final C17722b f48960b = new C17722b();
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return f48960b;
        }

        public final String toString() {
            return "DiscreteDomain.longs()";
        }

        C17722b() {
            super();
        }

        /* renamed from: e */
        private static Long m59001e() {
            return Long.valueOf(Long.MIN_VALUE);
        }

        /* renamed from: c */
        public final /* synthetic */ Comparable mo45851c() {
            return m59001e();
        }

        /* renamed from: d */
        public final /* synthetic */ Comparable mo45852d() {
            return m59002f();
        }

        /* renamed from: f */
        private static Long m59002f() {
            return Long.valueOf(Long.MAX_VALUE);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Comparable mo45848a(Comparable comparable) {
            return m58998a((Long) comparable);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Comparable mo45850b(Comparable comparable) {
            return m59000b((Long) comparable);
        }

        /* renamed from: a */
        private static Long m58998a(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(longValue + 1);
        }

        /* renamed from: b */
        private static Long m59000b(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(longValue - 1);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ long mo45847a(Comparable comparable, Comparable comparable2) {
            return m58997a((Long) comparable, (Long) comparable2);
        }

        /* renamed from: a */
        private static long m58997a(Long l, Long l2) {
            long longValue = l2.longValue() - l.longValue();
            if (l2.longValue() > l.longValue() && longValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l2.longValue() >= l.longValue() || longValue <= 0) {
                return longValue;
            }
            return Long.MIN_VALUE;
        }

        /* renamed from: a */
        private static Long m58999a(Long l, long j) {
            boolean z;
            C18053v.m59701a(j, "distance");
            long longValue = l.longValue() + j;
            if (longValue < 0) {
                if (l.longValue() < 0) {
                    z = true;
                } else {
                    z = false;
                }
                C17439m.m57969a(z, (Object) "overflow");
            }
            return Long.valueOf(longValue);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Comparable mo45849a(Comparable comparable, long j) {
            return m58999a((Long) comparable, j);
        }
    }

    /* renamed from: a */
    public static C17719ai<Integer> m58977a() {
        return C17721a.f48959b;
    }

    /* renamed from: b */
    public static C17719ai<Long> m58978b() {
        return C17722b.f48960b;
    }

    /* renamed from: a */
    public abstract long mo45847a(C c, C c2);

    /* renamed from: a */
    public abstract C mo45848a(C c);

    /* renamed from: b */
    public abstract C mo45850b(C c);

    /* renamed from: c */
    public C mo45851c() {
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public C mo45852d() {
        throw new NoSuchElementException();
    }

    private C17719ai(boolean z) {
        this.f48958a = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C mo45849a(C c, long j) {
        C18053v.m59701a(j, "distance");
        for (long j2 = 0; j2 < j; j2++) {
            c = mo45848a(c);
        }
        return c;
    }
}
