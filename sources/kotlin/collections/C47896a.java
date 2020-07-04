package kotlin.collections;

import java.util.Collection;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C48017e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p358a.C7565a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: kotlin.collections.a */
public abstract class C47896a<E> implements Collection<E>, C7565a {

    /* renamed from: kotlin.collections.a$a */
    static final class C47897a extends Lambda implements C7562b<E, CharSequence> {

        /* renamed from: a */
        final /* synthetic */ C47896a f122748a;

        C47897a(C47896a aVar) {
            this.f122748a = aVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CharSequence invoke(E e) {
            String valueOf;
            if (e == this.f122748a) {
                valueOf = "(this Collection)";
            } else {
                valueOf = String.valueOf(e);
            }
            return valueOf;
        }
    }

    protected C47896a() {
    }

    /* renamed from: a */
    public abstract int mo120039a();

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return mo120039a();
    }

    public Object[] toArray() {
        return C48017e.m148957a(this);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return C7525m.m23492a(this, ", ", "[", "]", 0, null, new C47897a(this), 24, null);
    }

    public <T> T[] toArray(T[] tArr) {
        C7573i.m23587b(tArr, "array");
        T[] a = C48017e.m148958a(this, tArr);
        if (a != null) {
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean contains(Object obj) {
        if (!isEmpty()) {
            for (Object a : this) {
                if (C7573i.m23585a(a, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
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
}
