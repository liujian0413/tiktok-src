package android.support.p022v4.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: android.support.v4.util.g */
abstract class C0895g<K, V> {

    /* renamed from: b */
    C0897b f3139b;

    /* renamed from: c */
    C0898c f3140c;

    /* renamed from: d */
    C0900e f3141d;

    /* renamed from: android.support.v4.util.g$a */
    final class C0896a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f3142a;

        /* renamed from: b */
        int f3143b;

        /* renamed from: c */
        int f3144c;

        /* renamed from: d */
        boolean f3145d;

        public final boolean hasNext() {
            if (this.f3144c < this.f3143b) {
                return true;
            }
            return false;
        }

        public final T next() {
            if (hasNext()) {
                T a = C0895g.this.mo3295a(this.f3144c, this.f3142a);
                this.f3144c++;
                this.f3145d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f3145d) {
                this.f3144c--;
                this.f3143b--;
                this.f3145d = false;
                C0895g.this.mo3297a(this.f3144c);
                return;
            }
            throw new IllegalStateException();
        }

        C0896a(int i) {
            this.f3142a = i;
            this.f3143b = C0895g.this.mo3293a();
        }
    }

    /* renamed from: android.support.v4.util.g$b */
    final class C0897b implements Set<Entry<K, V>> {
        public final void clear() {
            C0895g.this.mo3301c();
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C0899d();
        }

        public final int size() {
            return C0895g.this.mo3293a();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final boolean isEmpty() {
            if (C0895g.this.mo3293a() == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int a = C0895g.this.mo3293a() - 1; a >= 0; a--) {
                Object a2 = C0895g.this.mo3295a(a, 0);
                Object a3 = C0895g.this.mo3295a(a, 1);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                if (a3 == null) {
                    i2 = 0;
                } else {
                    i2 = a3.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        C0897b() {
        }

        /* renamed from: a */
        private static boolean m3833a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ boolean add(Object obj) {
            return m3833a((Entry) obj);
        }

        public final boolean equals(Object obj) {
            return C0895g.m3816a((Set<T>) this, obj);
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = C0895g.this.mo3293a();
            for (Entry entry : collection) {
                C0895g.this.mo3298a(entry.getKey(), entry.getValue());
            }
            if (a != C0895g.this.mo3293a()) {
                return true;
            }
            return false;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C0895g.this.mo3294a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0890b.m3787a(C0895g.this.mo3295a(a, 1), entry.getValue());
        }
    }

    /* renamed from: android.support.v4.util.g$c */
    final class C0898c implements Set<K> {
        public final void clear() {
            C0895g.this.mo3301c();
        }

        public final int size() {
            return C0895g.this.mo3293a();
        }

        public final Object[] toArray() {
            return C0895g.this.mo3351b(0);
        }

        public final boolean isEmpty() {
            if (C0895g.this.mo3293a() == 0) {
                return true;
            }
            return false;
        }

        public final Iterator<K> iterator() {
            return new C0896a(0);
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            for (int a = C0895g.this.mo3293a() - 1; a >= 0; a--) {
                Object a2 = C0895g.this.mo3295a(a, 0);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        C0898c() {
        }

        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            return C0895g.m3816a((Set<T>) this, obj);
        }

        public final boolean contains(Object obj) {
            if (C0895g.this.mo3294a(obj) >= 0) {
                return true;
            }
            return false;
        }

        public final boolean containsAll(Collection<?> collection) {
            return C0895g.m3815a(C0895g.this.mo3300b(), collection);
        }

        public final boolean removeAll(Collection<?> collection) {
            return C0895g.m3817b(C0895g.this.mo3300b(), collection);
        }

        public final boolean retainAll(Collection<?> collection) {
            return C0895g.m3818c(C0895g.this.mo3300b(), collection);
        }

        public final <T> T[] toArray(T[] tArr) {
            return C0895g.this.mo3350a(tArr, 0);
        }

        public final boolean remove(Object obj) {
            int a = C0895g.this.mo3294a(obj);
            if (a < 0) {
                return false;
            }
            C0895g.this.mo3297a(a);
            return true;
        }
    }

    /* renamed from: android.support.v4.util.g$d */
    final class C0899d implements Iterator<Entry<K, V>>, Entry<K, V> {

        /* renamed from: a */
        int f3149a;

        /* renamed from: b */
        int f3150b = -1;

        /* renamed from: c */
        boolean f3151c;

        public final boolean hasNext() {
            if (this.f3150b < this.f3149a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Entry<K, V> next() {
            if (hasNext()) {
                this.f3150b++;
                this.f3151c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final K getKey() {
            if (this.f3151c) {
                return C0895g.this.mo3295a(this.f3150b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f3151c) {
                return C0895g.this.mo3295a(this.f3150b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public final int hashCode() {
            int i;
            if (this.f3151c) {
                int i2 = 0;
                Object a = C0895g.this.mo3295a(this.f3150b, 0);
                Object a2 = C0895g.this.mo3295a(this.f3150b, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 != null) {
                    i2 = a2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final void remove() {
            if (this.f3151c) {
                C0895g.this.mo3297a(this.f3150b);
                this.f3150b--;
                this.f3149a--;
                this.f3151c = false;
                return;
            }
            throw new IllegalStateException();
        }

        C0899d() {
            this.f3149a = C0895g.this.mo3293a() - 1;
        }

        public final V setValue(V v) {
            if (this.f3151c) {
                return C0895g.this.mo3296a(this.f3150b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean equals(Object obj) {
            if (!this.f3151c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Entry)) {
                return false;
            } else {
                Entry entry = (Entry) obj;
                if (!C0890b.m3787a(entry.getKey(), C0895g.this.mo3295a(this.f3150b, 0)) || !C0890b.m3787a(entry.getValue(), C0895g.this.mo3295a(this.f3150b, 1))) {
                    return false;
                }
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.util.g$e */
    final class C0900e implements Collection<V> {
        public final void clear() {
            C0895g.this.mo3301c();
        }

        public final int size() {
            return C0895g.this.mo3293a();
        }

        public final Object[] toArray() {
            return C0895g.this.mo3351b(1);
        }

        public final boolean isEmpty() {
            if (C0895g.this.mo3293a() == 0) {
                return true;
            }
            return false;
        }

        public final Iterator<V> iterator() {
            return new C0896a(1);
        }

        C0900e() {
        }

        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean contains(Object obj) {
            if (C0895g.this.mo3299b(obj) >= 0) {
                return true;
            }
            return false;
        }

        public final <T> T[] toArray(T[] tArr) {
            return C0895g.this.mo3350a(tArr, 1);
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean remove(Object obj) {
            int b = C0895g.this.mo3299b(obj);
            if (b < 0) {
                return false;
            }
            C0895g.this.mo3297a(b);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int a = C0895g.this.mo3293a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(C0895g.this.mo3295a(i, 1))) {
                    C0895g.this.mo3297a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            int a = C0895g.this.mo3293a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(C0895g.this.mo3295a(i, 1))) {
                    C0895g.this.mo3297a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }
    }

    C0895g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo3293a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo3294a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo3295a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo3296a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3297a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3298a(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo3299b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo3300b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo3301c();

    /* renamed from: d */
    public final Set<Entry<K, V>> mo3352d() {
        if (this.f3139b == null) {
            this.f3139b = new C0897b<>();
        }
        return this.f3139b;
    }

    /* renamed from: e */
    public final Set<K> mo3353e() {
        if (this.f3140c == null) {
            this.f3140c = new C0898c<>();
        }
        return this.f3140c;
    }

    /* renamed from: f */
    public final Collection<V> mo3354f() {
        if (this.f3141d == null) {
            this.f3141d = new C0900e<>();
        }
        return this.f3141d;
    }

    /* renamed from: b */
    public final Object[] mo3351b(int i) {
        int a = mo3293a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo3295a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public static <K, V> boolean m3815a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m3817b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <T> boolean m3816a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                return false;
            }
            return true;
        } catch (NullPointerException unused) {
            return false;
        } catch (ClassCastException unused2) {
            return false;
        }
    }

    /* renamed from: c */
    public static <K, V> boolean m3818c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final <T> T[] mo3350a(T[] tArr, int i) {
        int a = mo3293a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo3295a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }
}
