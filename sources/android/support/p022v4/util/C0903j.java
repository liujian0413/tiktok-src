package android.support.p022v4.util;

import com.C1642a;
import java.util.Locale;

/* renamed from: android.support.v4.util.j */
public final class C0903j {
    /* renamed from: a */
    public static int m3838a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static <T> T m3840a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static <T> T m3841a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static int m3839a(int i, int i2, int i3, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(1), Integer.valueOf(31)}));
        } else if (i <= 31) {
            return i;
        } else {
            throw new IllegalArgumentException(C1642a.m8035a(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(1), Integer.valueOf(31)}));
        }
    }
}
