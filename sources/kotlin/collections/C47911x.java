package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p358a.C7565a;

/* renamed from: kotlin.collections.x */
public final class C47911x implements ListIterator, C7565a {

    /* renamed from: a */
    public static final C47911x f122768a = new C47911x();

    private C47911x() {
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final int nextIndex() {
        return 0;
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: a */
    private static Void m148852a() {
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    private static Void m148853b() {
        throw new NoSuchElementException();
    }

    public final /* synthetic */ Object next() {
        return m148852a();
    }

    public final /* synthetic */ Object previous() {
        return m148853b();
    }
}
