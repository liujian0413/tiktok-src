package android.support.p022v4.content.res;

import java.lang.reflect.Array;

/* renamed from: android.support.v4.content.res.d */
final class C0699d {

    /* renamed from: a */
    static final /* synthetic */ boolean f2665a = (!C0699d.class.desiredAssertionStatus());

    private C0699d() {
    }

    /* renamed from: a */
    private static int m2974a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* renamed from: a */
    public static int[] m2975a(int[] iArr, int i, int i2) {
        if (f2665a || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                int[] iArr2 = new int[m2974a(i)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr = iArr2;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static <T> T[] m2976a(T[] tArr, int i, T t) {
        if (f2665a || i <= tArr.length) {
            if (i + 1 > tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m2974a(i));
                System.arraycopy(tArr, 0, tArr2, 0, i);
                tArr = tArr2;
            }
            tArr[i] = t;
            return tArr;
        }
        throw new AssertionError();
    }
}
