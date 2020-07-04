package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: kotlinx.coroutines.internal.w */
public final class C48179w {

    /* renamed from: a */
    private static final int f123036a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m149474a() {
        return f123036a;
    }

    /* renamed from: a */
    public static final String m149479a(String str) {
        C7573i.m23587b(str, "propertyName");
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final boolean m149480a(String str, boolean z) {
        C7573i.m23587b(str, "propertyName");
        try {
            String property = System.getProperty(str);
            if (property != null) {
                return Boolean.parseBoolean(property);
            }
            return true;
        } catch (SecurityException unused) {
            return true;
        }
    }

    /* renamed from: a */
    private static int m149475a(String str, int i, int i2, int i3) {
        C7573i.m23587b(str, "propertyName");
        return (int) m149477a(str, (long) i, (long) i2, (long) i3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static long m149477a(String str, long j, long j2, long j3) {
        C7573i.m23587b(str, "propertyName");
        String a = m149479a(str);
        if (a == null) {
            return j;
        }
        Long e = C7634n.m23707e(a);
        if (e != null) {
            long longValue = e.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            sb.append("..");
            sb.append(j3);
            sb.append(", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' has unrecognized value '");
        sb2.append(a);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    /* renamed from: a */
    public static /* synthetic */ int m149476a(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return m149475a(str, i, i2, i3);
    }
}
