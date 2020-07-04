package kotlin.p355d;

import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7549c;

/* renamed from: kotlin.d.e */
public final class C7545e {
    /* renamed from: a */
    public static final int m23546a(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    /* renamed from: b */
    public static final int m23550b(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: a */
    public static final C7542d m23549a(int i) {
        return new C47963f(1000, 0);
    }

    /* renamed from: b */
    public static final void m23551b(int i, int i2) {
        boolean z;
        if (i2 > i) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(m23548a((Object) Integer.valueOf(i), (Object) Integer.valueOf(i2)).toString());
        }
    }

    /* renamed from: a */
    private static String m23548a(Object obj, Object obj2) {
        C7573i.m23587b(obj, "from");
        C7573i.m23587b(obj2, "until");
        StringBuilder sb = new StringBuilder("Random range is empty: [");
        sb.append(obj);
        sb.append(", ");
        sb.append(obj2);
        sb.append(").");
        return sb.toString();
    }

    /* renamed from: a */
    public static final int m23547a(C7542d dVar, C7549c cVar) {
        C7573i.m23587b(dVar, "$this$nextInt");
        C7573i.m23587b(cVar, "range");
        if (cVar.mo19429a()) {
            StringBuilder sb = new StringBuilder("Cannot get random in empty range: ");
            sb.append(cVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (cVar.f20878b < Integer.MAX_VALUE) {
            return dVar.mo19426a(cVar.f20877a, cVar.f20878b + 1);
        } else {
            if (cVar.f20877a > Integer.MIN_VALUE) {
                return dVar.mo19426a(cVar.f20877a - 1, cVar.f20878b) + 1;
            }
            return dVar.mo19427b();
        }
    }
}
