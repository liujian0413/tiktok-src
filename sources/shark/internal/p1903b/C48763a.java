package shark.internal.p1903b;

import com.C1642a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C7573i;

/* renamed from: shark.internal.b.a */
public final class C48763a {

    /* renamed from: a */
    public static final C48763a f123929a = new C48763a();

    private C48763a() {
    }

    /* renamed from: a */
    public static int m150584a(long j) {
        long j2 = j * -7046029254386353131L;
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: b */
    private static long m150586b(long j) {
        long j2 = j - 1;
        long j3 = j2 | (j2 >> 1);
        long j4 = j3 | (j3 >> 2);
        long j5 = j4 | (j4 >> 4);
        long j6 = j5 | (j5 >> 8);
        long j7 = j6 | (j6 >> 16);
        return (j7 | (j7 >> 32)) + 1;
    }

    /* renamed from: b */
    public static int m150585b(int i, double d) {
        int i2 = i - 1;
        double d2 = (double) i;
        Double.isNaN(d2);
        return Math.min(i2, (int) Math.ceil(d2 * d));
    }

    /* renamed from: a */
    public final int mo123527a(int i, double d) {
        double d2 = (double) i;
        Double.isNaN(d2);
        long ceil = (long) Math.ceil(d2 / d);
        if (ceil == ((long) i)) {
            ceil++;
        }
        long max = Math.max(4, m150586b(ceil));
        if (max <= 1073741824) {
            return (int) max;
        }
        Locale locale = Locale.ROOT;
        C7573i.m23582a((Object) locale, "Locale.ROOT");
        Object[] objArr = {Integer.valueOf(i), Double.valueOf(d)};
        String a = C1642a.m8035a(locale, "Maximum array size exceeded for this load factor (elements: %d, load factor: %f)", Arrays.copyOf(objArr, 2));
        C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
        throw new RuntimeException(a);
    }

    /* renamed from: a */
    public static int m150583a(int i, int i2, double d) {
        if (i != 1073741824) {
            return i << 1;
        }
        Locale locale = Locale.ROOT;
        C7573i.m23582a((Object) locale, "Locale.ROOT");
        Object[] objArr = {Integer.valueOf(i2), Double.valueOf(d)};
        String a = C1642a.m8035a(locale, "Maximum array size exceeded for this load factor (elements: %d, load factor: %f)", Arrays.copyOf(objArr, 2));
        C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
        throw new RuntimeException(a);
    }
}
