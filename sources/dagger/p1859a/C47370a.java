package dagger.p1859a;

import java.util.LinkedHashMap;

/* renamed from: dagger.a.a */
public final class C47370a {
    /* renamed from: b */
    private static int m147934b(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static <K, V> LinkedHashMap<K, V> m147933a(int i) {
        return new LinkedHashMap<>(m147934b(i));
    }
}
