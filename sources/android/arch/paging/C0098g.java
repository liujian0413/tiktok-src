package android.arch.paging;

import java.util.Collections;
import java.util.List;

/* renamed from: android.arch.paging.g */
final class C0098g<T> {

    /* renamed from: e */
    private static final C0098g f188e = new C0098g(Collections.EMPTY_LIST, 0);

    /* renamed from: a */
    public final List<T> f189a;

    /* renamed from: b */
    public final int f190b;

    /* renamed from: c */
    public final int f191c;

    /* renamed from: d */
    public final int f192d;

    /* renamed from: android.arch.paging.g$a */
    static abstract class C0099a<T> {
        C0099a() {
        }

        /* renamed from: a */
        public abstract void mo179a(int i, C0098g<T> gVar);
    }

    /* renamed from: a */
    static <T> C0098g<T> m222a() {
        return f188e;
    }

    /* renamed from: b */
    public final boolean mo201b() {
        if (this == f188e) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result ");
        sb.append(this.f190b);
        sb.append(", ");
        sb.append(this.f189a);
        sb.append(", ");
        sb.append(this.f191c);
        sb.append(", offset ");
        sb.append(this.f192d);
        return sb.toString();
    }

    private C0098g(List<T> list, int i) {
        this.f189a = list;
        this.f192d = 0;
    }

    C0098g(List<T> list, int i, int i2, int i3) {
        this.f189a = list;
        this.f190b = 0;
        this.f191c = 0;
        this.f192d = i3;
    }
}
