package android.support.p022v4.util;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: android.support.v4.util.h */
public final class C0901h {
    /* renamed from: a */
    public static int m3835a(Object... objArr) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static boolean m3836a(Object obj, Object obj2) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
