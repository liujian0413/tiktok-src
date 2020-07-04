package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.C15265q;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.util.b */
public final class C15319b {
    /* renamed from: a */
    public static <T> boolean m44556a(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (C15265q.m44381a(tArr[i], t)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <T> void m44553a(StringBuilder sb, T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(tArr[i].toString());
        }
    }

    /* renamed from: a */
    public static void m44551a(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Integer.toString(iArr[i]));
        }
    }

    /* renamed from: a */
    public static void m44552a(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(jArr[i]));
        }
    }

    /* renamed from: a */
    public static void m44550a(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Float.toString(fArr[i]));
        }
    }

    /* renamed from: a */
    public static void m44549a(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Double.toString(dArr[i]));
        }
    }

    /* renamed from: a */
    public static void m44555a(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Boolean.toString(zArr[i]));
        }
    }

    /* renamed from: a */
    public static void m44554a(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
        }
    }

    /* renamed from: a */
    public static <T> T[] m44558a(T[]... tArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += tArr[i2].length;
        }
        T[] copyOf = Arrays.copyOf(tArr[0], i);
        int length = tArr[0].length;
        for (int i3 = 1; i3 < 2; i3++) {
            T[] tArr2 = tArr[1];
            System.arraycopy(tArr2, 0, copyOf, length, tArr2.length);
        }
        return copyOf;
    }

    /* renamed from: a */
    public static <T> T[] m44557a(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return null;
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length);
        int i = 0;
        for (T t : tArr) {
            if (!C15265q.m44381a(tArr2[0], t)) {
                int i2 = i + 1;
                tArr3[i] = t;
                i = i2;
            }
        }
        if (tArr3 == null) {
            return null;
        }
        if (i != tArr3.length) {
            tArr3 = Arrays.copyOf(tArr3, i);
        }
        return tArr3;
    }
}
