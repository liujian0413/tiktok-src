package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.internal.C48186z;

/* renamed from: kotlinx.coroutines.internal.y */
public final class C48185y<T extends C48186z & Comparable<? super T>> {

    /* renamed from: a */
    private T[] f123046a;
    public volatile int size;

    /* renamed from: a */
    public final boolean mo120398a() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized T mo120400b() {
        return mo120403d();
    }

    /* renamed from: d */
    public final T mo120403d() {
        T[] tArr = this.f123046a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final synchronized T mo120402c() {
        if (this.size <= 0) {
            return null;
        }
        return mo120397a(0);
    }

    /* renamed from: e */
    private final T[] m149491e() {
        T[] tArr = this.f123046a;
        if (tArr == null) {
            T[] tArr2 = new C48186z[4];
            this.f123046a = tArr2;
            return tArr2;
        } else if (this.size < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, this.size * 2);
            C7573i.m23582a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (C48186z[]) copyOf;
            this.f123046a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: b */
    private final void m149489b(int i) {
        while (i > 0) {
            T[] tArr = this.f123046a;
            if (tArr == null) {
                C7573i.m23580a();
            }
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            if (t == null) {
                C7573i.m23580a();
            }
            Comparable comparable = (Comparable) t;
            T t2 = tArr[i];
            if (t2 == null) {
                C7573i.m23580a();
            }
            if (comparable.compareTo(t2) > 0) {
                m149488a(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo120399a(T t) {
        C7573i.m23587b(t, "node");
        boolean z = false;
        if (t.mo120316b() == null) {
            return false;
        }
        int c = t.mo120317c();
        if (c >= 0) {
            z = true;
        }
        if (z) {
            mo120397a(c);
            return true;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    private final void m149490c(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < this.size) {
                T[] tArr = this.f123046a;
                if (tArr == null) {
                    C7573i.m23580a();
                }
                int i3 = i2 + 1;
                if (i3 < this.size) {
                    T t = tArr[i3];
                    if (t == null) {
                        C7573i.m23580a();
                    }
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i2];
                    if (t2 == null) {
                        C7573i.m23580a();
                    }
                    if (comparable.compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                if (t3 == null) {
                    C7573i.m23580a();
                }
                Comparable comparable2 = (Comparable) t3;
                T t4 = tArr[i2];
                if (t4 == null) {
                    C7573i.m23580a();
                }
                if (comparable2.compareTo(t4) > 0) {
                    m149488a(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo120401b(T t) {
        boolean z;
        C7573i.m23587b(t, "node");
        if (t.mo120316b() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            t.mo120314a(this);
            C48186z[] e = m149491e();
            int i = this.size;
            this.size = i + 1;
            e[i] = t;
            t.mo120313a(i);
            m149489b(i);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final T mo120397a(int i) {
        boolean z;
        boolean z2 = false;
        if (this.size > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            T[] tArr = this.f123046a;
            if (tArr == null) {
                C7573i.m23580a();
            }
            this.size--;
            if (i < this.size) {
                m149488a(i, this.size);
                int i2 = (i - 1) / 2;
                if (i > 0) {
                    T t = tArr[i];
                    if (t == null) {
                        C7573i.m23580a();
                    }
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i2];
                    if (t2 == null) {
                        C7573i.m23580a();
                    }
                    if (comparable.compareTo(t2) < 0) {
                        m149488a(i, i2);
                        m149489b(i2);
                    }
                }
                m149490c(i);
            }
            T t3 = tArr[this.size];
            if (t3 == null) {
                C7573i.m23580a();
            }
            if (t3.mo120316b() == this) {
                z2 = true;
            }
            if (z2) {
                t3.mo120314a(null);
                t3.mo120313a(-1);
                tArr[this.size] = null;
                return t3;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    private final void m149488a(int i, int i2) {
        T[] tArr = this.f123046a;
        if (tArr == null) {
            C7573i.m23580a();
        }
        T t = tArr[i2];
        if (t == null) {
            C7573i.m23580a();
        }
        T t2 = tArr[i];
        if (t2 == null) {
            C7573i.m23580a();
        }
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo120313a(i);
        t2.mo120313a(i2);
    }
}
