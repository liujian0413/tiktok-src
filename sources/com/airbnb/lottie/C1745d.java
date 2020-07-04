package com.airbnb.lottie;

import android.support.p022v4.p027os.C0885f;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.airbnb.lottie.d */
public final class C1745d {

    /* renamed from: a */
    private static final Set<String> f6285a = new HashSet();

    /* renamed from: b */
    private static boolean f6286b = false;

    /* renamed from: c */
    private static String[] f6287c;

    /* renamed from: d */
    private static long[] f6288d;

    /* renamed from: e */
    private static int f6289e = 0;

    /* renamed from: f */
    private static int f6290f = 0;

    /* renamed from: a */
    public static void m8323a(String str) {
        if (!f6285a.contains(str)) {
            f6285a.add(str);
        }
    }

    /* renamed from: b */
    public static void m8324b(String str) {
        if (f6286b) {
            if (f6289e == 20) {
                f6290f++;
                return;
            }
            f6287c[f6289e] = str;
            f6288d[f6289e] = System.nanoTime();
            C0885f.m3753a(str);
            f6289e++;
        }
    }

    /* renamed from: c */
    public static float m8325c(String str) {
        if (f6290f > 0) {
            f6290f--;
            return 0.0f;
        } else if (!f6286b) {
            return 0.0f;
        } else {
            int i = f6289e - 1;
            f6289e = i;
            if (i == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f6287c[f6289e])) {
                C0885f.m3752a();
                return ((float) (System.nanoTime() - f6288d[f6289e])) / 1000000.0f;
            } else {
                StringBuilder sb = new StringBuilder("Unbalanced trace call ");
                sb.append(str);
                sb.append(". Expected ");
                sb.append(f6287c[f6289e]);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}
