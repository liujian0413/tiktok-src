package kotlin.p356e;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C7573i;
import kotlin.p355d.C7542d;
import kotlin.p355d.C7545e;
import kotlin.p356e.C7547a.C7548a;
import kotlin.p356e.C7549c.C7550a;

/* renamed from: kotlin.e.g */
public class C7554g extends C7553f {
    /* renamed from: a */
    public static final long m23562a(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: b */
    public static final long m23564b(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: c */
    public static final int m23566c(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: d */
    public static final int m23567d(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: a */
    public static final C7547a m23563a(int i, int i2) {
        return C7548a.m23554a(i, i2, -1);
    }

    /* renamed from: a */
    public static final int m23561a(C7549c cVar, C7542d dVar) {
        C7573i.m23587b(cVar, "$this$random");
        C7573i.m23587b(dVar, "random");
        try {
            return C7545e.m23547a(dVar, cVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    /* renamed from: b */
    public static final C7549c m23565b(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C7550a.m23559a();
        }
        return new C7549c(i, i2 - 1);
    }

    /* renamed from: a */
    public static final int m23560a(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            sb.append(i3);
            sb.append(" is less than minimum ");
            sb.append(i2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }
}
