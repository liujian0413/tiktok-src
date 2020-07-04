package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;

/* renamed from: kotlin.collections.ab */
public final class C47898ab<T> implements Iterator<C47913z<? extends T>>, C7565a {

    /* renamed from: a */
    private int f122749a;

    /* renamed from: b */
    private final Iterator<T> f122750b;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return this.f122750b.hasNext();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C47913z<T> next() {
        int i = this.f122749a;
        this.f122749a = i + 1;
        if (i < 0) {
            C7525m.m23465b();
        }
        return new C47913z<>(i, this.f122750b.next());
    }

    public C47898ab(Iterator<? extends T> it) {
        C7573i.m23587b(it, "iterator");
        this.f122750b = it;
    }
}
