package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.collections.al */
final class C7512al<T> extends C7517e<T> {

    /* renamed from: a */
    private final List<T> f20864a;

    /* renamed from: a */
    public final int mo19395a() {
        return this.f20864a.size();
    }

    public final void clear() {
        this.f20864a.clear();
    }

    public C7512al(List<T> list) {
        C7573i.m23587b(list, "delegate");
        this.f20864a = list;
    }

    /* renamed from: a */
    public final T mo19396a(int i) {
        return this.f20864a.remove(C7534u.m23483a(this, i));
    }

    public final T get(int i) {
        return this.f20864a.get(C7534u.m23483a(this, i));
    }

    public final void add(int i, T t) {
        this.f20864a.add(C7534u.m23484b(this, i), t);
    }

    public final T set(int i, T t) {
        return this.f20864a.set(C7534u.m23483a(this, i), t);
    }
}
