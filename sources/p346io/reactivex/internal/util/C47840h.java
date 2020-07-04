package p346io.reactivex.internal.util;

/* renamed from: io.reactivex.internal.util.h */
public final class C47840h<T> {

    /* renamed from: a */
    final float f122623a;

    /* renamed from: b */
    int f122624b;

    /* renamed from: c */
    public int f122625c;

    /* renamed from: d */
    int f122626d;

    /* renamed from: e */
    public T[] f122627e;

    /* renamed from: a */
    private static int m148731a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    public C47840h() {
        this(16, 0.75f);
    }

    /* renamed from: a */
    private void m148732a() {
        T[] tArr = this.f122627e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (Object[]) new Object[i];
        int i3 = this.f122625c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a = m148731a(tArr[length].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[length];
                i3 = i4;
            } else {
                this.f122624b = i2;
                this.f122626d = (int) (((float) i) * this.f122623a);
                this.f122627e = tArr2;
                return;
            }
        }
    }

    public C47840h(int i) {
        this(i, 0.75f);
    }

    /* renamed from: b */
    public final boolean mo119917b(T t) {
        T t2;
        T[] tArr = this.f122627e;
        int i = this.f122624b;
        int a = m148731a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return m148733a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return m148733a(a, tArr, i);
    }

    /* renamed from: a */
    public final boolean mo119916a(T t) {
        T t2;
        T[] tArr = this.f122627e;
        int i = this.f122624b;
        int a = m148731a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 != null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f122625c + 1;
        this.f122625c = i2;
        if (i2 >= this.f122626d) {
            m148732a();
        }
        return true;
    }

    private C47840h(int i, float f) {
        this.f122623a = 0.75f;
        int a = C47841i.m148736a(i);
        this.f122624b = a - 1;
        this.f122626d = (int) (((float) a) * 0.75f);
        this.f122627e = (Object[]) new Object[a];
    }

    /* renamed from: a */
    private boolean m148733a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f122625c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m148731a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }
}
