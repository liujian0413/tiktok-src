package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C48016b;
import kotlin.jvm.internal.C48017e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;

/* renamed from: kotlin.collections.f */
final class C7518f<T> implements Collection<T>, C7565a {

    /* renamed from: a */
    public final T[] f20865a;

    /* renamed from: b */
    public final boolean f20866b;

    /* renamed from: a */
    private int m23416a() {
        return this.f20865a.length;
    }

    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final <T> T[] toArray(T[] tArr) {
        return C48017e.m148958a(this, tArr);
    }

    public final Iterator<T> iterator() {
        return C48016b.m148956a(this.f20865a);
    }

    public final int size() {
        return m23416a();
    }

    public final boolean isEmpty() {
        if (this.f20865a.length == 0) {
            return true;
        }
        return false;
    }

    public final Object[] toArray() {
        return C7525m.m23458a(this.f20865a, this.f20866b);
    }

    public final boolean contains(Object obj) {
        return C7519g.m23440b(this.f20865a, obj);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C7573i.m23587b(collection, "elements");
        Iterable<Object> iterable = collection;
        if (!((Collection) iterable).isEmpty()) {
            for (Object contains : iterable) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public C7518f(T[] tArr, boolean z) {
        C7573i.m23587b(tArr, "values");
        this.f20865a = tArr;
        this.f20866b = z;
    }
}
