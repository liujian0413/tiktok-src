package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;

/* renamed from: kotlin.collections.d */
public abstract class C47905d<E> extends C47896a<E> implements List<E>, C7565a {

    /* renamed from: a */
    public static final C47906a f122761a = new C47906a(null);

    /* renamed from: kotlin.collections.d$a */
    public static final class C47906a {
        private C47906a() {
        }

        public /* synthetic */ C47906a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static int m148845a(Collection<?> collection) {
            int i;
            C7573i.m23587b(collection, "c");
            int i2 = 1;
            for (Object next : collection) {
                int i3 = i2 * 31;
                if (next != null) {
                    i = next.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
            return i2;
        }

        /* renamed from: b */
        public static void m148849b(int i, int i2) {
            if (i < 0 || i > i2) {
                StringBuilder sb = new StringBuilder("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        /* renamed from: a */
        public static void m148846a(int i, int i2) {
            if (i < 0 || i >= i2) {
                StringBuilder sb = new StringBuilder("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        /* renamed from: a */
        public static boolean m148848a(Collection<?> collection, Collection<?> collection2) {
            C7573i.m23587b(collection, "c");
            C7573i.m23587b(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object a : collection) {
                if (!C7573i.m23585a(a, it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public static void m148847a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder sb = new StringBuilder("fromIndex: ");
                sb.append(i);
                sb.append(", toIndex: ");
                sb.append(i2);
                sb.append(", size: ");
                sb.append(i3);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i > i2) {
                StringBuilder sb2 = new StringBuilder("fromIndex: ");
                sb2.append(i);
                sb2.append(" > toIndex: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    /* renamed from: kotlin.collections.d$b */
    class C47907b implements Iterator<E>, C7565a {

        /* renamed from: a */
        public int f122762a;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            if (this.f122762a < C47905d.this.size()) {
                return true;
            }
            return false;
        }

        public E next() {
            if (hasNext()) {
                C47905d dVar = C47905d.this;
                int i = this.f122762a;
                this.f122762a = i + 1;
                return dVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public C47907b() {
        }
    }

    /* renamed from: kotlin.collections.d$c */
    class C47908c extends C47907b implements ListIterator<E>, C7565a {
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int nextIndex() {
            return this.f122762a;
        }

        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasPrevious() {
            if (this.f122762a > 0) {
                return true;
            }
            return false;
        }

        public final int previousIndex() {
            return this.f122762a - 1;
        }

        public final E previous() {
            if (hasPrevious()) {
                C47905d dVar = C47905d.this;
                this.f122762a--;
                return dVar.get(this.f122762a);
            }
            throw new NoSuchElementException();
        }

        public C47908c(int i) {
            super();
            C47906a.m148849b(i, C47905d.this.size());
            this.f122762a = i;
        }
    }

    /* renamed from: kotlin.collections.d$d */
    static final class C47909d<E> extends C47905d<E> implements RandomAccess {

        /* renamed from: b */
        private int f122765b;

        /* renamed from: c */
        private final C47905d<E> f122766c;

        /* renamed from: d */
        private final int f122767d;

        /* renamed from: a */
        public final int mo120039a() {
            return this.f122765b;
        }

        public final E get(int i) {
            C47906a.m148846a(i, this.f122765b);
            return this.f122766c.get(this.f122767d + i);
        }

        public C47909d(C47905d<? extends E> dVar, int i, int i2) {
            C7573i.m23587b(dVar, "list");
            this.f122766c = dVar;
            this.f122767d = i;
            C47906a.m148847a(this.f122767d, i2, this.f122766c.size());
            this.f122765b = i2 - this.f122767d;
        }
    }

    protected C47905d() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract E get(int i);

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return C47906a.m148845a(this);
    }

    public Iterator<E> iterator() {
        return new C47907b<>();
    }

    public ListIterator<E> listIterator() {
        return new C47908c<>(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new C47908c<>(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return C47906a.m148848a((Collection<?>) this, (Collection) obj);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a : this) {
            if (C7573i.m23585a(a, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C7573i.m23585a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public List<E> subList(int i, int i2) {
        return new C47909d<>(this, i, i2);
    }
}
