package kotlinx.coroutines.internal;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.internal.b */
public final class C48150b<T> {

    /* renamed from: a */
    private Object[] f122997a = new Object[16];

    /* renamed from: b */
    private int f122998b;

    /* renamed from: c */
    private int f122999c;

    /* renamed from: a */
    public final boolean mo120368a() {
        if (this.f122998b == this.f122999c) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m149393c() {
        int length = this.f122997a.length;
        Object[] objArr = new Object[(length << 1)];
        int length2 = this.f122997a.length - this.f122998b;
        C48148a.m149389a(this.f122997a, this.f122998b, objArr, 0, length2);
        C48148a.m149389a(this.f122997a, 0, objArr, length2, this.f122998b);
        this.f122997a = objArr;
        this.f122998b = 0;
        this.f122999c = length;
    }

    /* renamed from: b */
    public final T mo120369b() {
        if (this.f122998b == this.f122999c) {
            return null;
        }
        T t = this.f122997a[this.f122998b];
        this.f122997a[this.f122998b] = null;
        this.f122998b = (this.f122998b + 1) & (this.f122997a.length - 1);
        if (t != null) {
            return t;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }

    /* renamed from: a */
    public final void mo120367a(T t) {
        C7573i.m23587b(t, "element");
        this.f122997a[this.f122999c] = t;
        this.f122999c = (this.f122999c + 1) & (this.f122997a.length - 1);
        if (this.f122999c == this.f122998b) {
            m149393c();
        }
    }
}
