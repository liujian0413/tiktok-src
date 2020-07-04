package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p358a.C7565a;

/* renamed from: kotlin.jvm.internal.a */
final class C48013a<T> implements Iterator<T>, C7565a {

    /* renamed from: a */
    public final T[] f122835a;

    /* renamed from: b */
    private int f122836b;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        if (this.f122836b < this.f122835a.length) {
            return true;
        }
        return false;
    }

    public final T next() {
        try {
            T[] tArr = this.f122835a;
            int i = this.f122836b;
            this.f122836b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f122836b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public C48013a(T[] tArr) {
        C7573i.m23587b(tArr, "array");
        this.f122835a = tArr;
    }
}
