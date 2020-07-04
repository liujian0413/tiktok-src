package com.google.common.collect;

import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.common.collect.x */
class C18057x<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a */
    transient long[] f49359a;

    /* renamed from: b */
    transient Object[] f49360b;

    /* renamed from: c */
    transient Object[] f49361c;

    /* renamed from: d */
    transient float f49362d;

    /* renamed from: e */
    transient int f49363e;

    /* renamed from: f */
    public transient int f49364f;

    /* renamed from: g */
    private transient int[] f49365g;

    /* renamed from: h */
    private transient int f49366h;

    /* renamed from: i */
    private transient Set<K> f49367i;

    /* renamed from: j */
    private transient Set<Entry<K, V>> f49368j;

    /* renamed from: k */
    private transient Collection<V> f49369k;

    /* renamed from: com.google.common.collect.x$a */
    class C18061a extends AbstractSet<Entry<K, V>> {
        public final void clear() {
            C18057x.this.clear();
        }

        public final Iterator<Entry<K, V>> iterator() {
            return C18057x.this.mo46618d();
        }

        public final int size() {
            return C18057x.this.f49364f;
        }

        C18061a() {
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C18057x.this.mo46607a(entry.getKey());
            if (a == -1 || !C17434j.m57955a(C18057x.this.f49361c[a], entry.getValue())) {
                return false;
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                int a = C18057x.this.mo46607a(entry.getKey());
                if (a != -1 && C17434j.m57955a(C18057x.this.f49361c[a], entry.getValue())) {
                    C18057x.this.mo46617d(a);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.x$b */
    abstract class C18062b<T> implements Iterator<T> {

        /* renamed from: b */
        int f49374b;

        /* renamed from: c */
        int f49375c;

        /* renamed from: d */
        int f49376d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo46630a(int i);

        public boolean hasNext() {
            if (this.f49375c >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private void m59745a() {
            if (C18057x.this.f49363e != this.f49374b) {
                throw new ConcurrentModificationException();
            }
        }

        public T next() {
            m59745a();
            if (hasNext()) {
                this.f49376d = this.f49375c;
                T a = mo46630a(this.f49375c);
                this.f49375c = C18057x.this.mo46622f(this.f49375c);
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            m59745a();
            if (this.f49376d >= 0) {
                z = true;
            } else {
                z = false;
            }
            C18053v.m59703a(z);
            this.f49374b++;
            C18057x.this.mo46617d(this.f49376d);
            this.f49375c = C18057x.this.mo46606a(this.f49375c, this.f49376d);
            this.f49376d = -1;
        }

        private C18062b() {
            this.f49374b = C18057x.this.f49363e;
            this.f49375c = C18057x.this.mo46610b();
            this.f49376d = -1;
        }
    }

    /* renamed from: com.google.common.collect.x$c */
    class C18063c extends AbstractSet<K> {
        public final void clear() {
            C18057x.this.clear();
        }

        public final Iterator<K> iterator() {
            return C18057x.this.mo46612c();
        }

        public final int size() {
            return C18057x.this.f49364f;
        }

        C18063c() {
        }

        public final boolean contains(Object obj) {
            return C18057x.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            int a = C18057x.this.mo46607a(obj);
            if (a == -1) {
                return false;
            }
            C18057x.this.mo46617d(a);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.x$d */
    final class C18064d extends C18027g<K, V> {

        /* renamed from: b */
        private final K f49380b;

        /* renamed from: c */
        private int f49381c;

        public final K getKey() {
            return this.f49380b;
        }

        public final V getValue() {
            m59747a();
            if (this.f49381c == -1) {
                return null;
            }
            return C18057x.this.f49361c[this.f49381c];
        }

        /* renamed from: a */
        private void m59747a() {
            if (this.f49381c == -1 || this.f49381c >= C18057x.this.size() || !C17434j.m57955a(this.f49380b, C18057x.this.f49360b[this.f49381c])) {
                this.f49381c = C18057x.this.mo46607a((Object) this.f49380b);
            }
        }

        public final V setValue(V v) {
            m59747a();
            if (this.f49381c == -1) {
                C18057x.this.put(this.f49380b, v);
                return null;
            }
            V v2 = C18057x.this.f49361c[this.f49381c];
            C18057x.this.f49361c[this.f49381c] = v;
            return v2;
        }

        C18064d(int i) {
            this.f49380b = C18057x.this.f49360b[i];
            this.f49381c = i;
        }
    }

    /* renamed from: com.google.common.collect.x$e */
    class C18065e extends AbstractCollection<V> {
        public final void clear() {
            C18057x.this.clear();
        }

        public final Iterator<V> iterator() {
            return C18057x.this.mo46619e();
        }

        public final int size() {
            return C18057x.this.f49364f;
        }

        C18065e() {
        }
    }

    /* renamed from: a */
    private static int m59714a(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: a */
    private static long m59715a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: b */
    private static int m59719b(long j) {
        return (int) j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo46606a(int i, int i2) {
        return i - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo46611b(int i) {
    }

    public int size() {
        return this.f49364f;
    }

    /* renamed from: f */
    private int m59720f() {
        return this.f49365g.length - 1;
    }

    /* renamed from: g */
    private Set<K> m59721g() {
        return new C18063c();
    }

    /* renamed from: h */
    private Set<Entry<K, V>> m59723h() {
        return new C18061a();
    }

    /* renamed from: i */
    private Collection<V> m59725i() {
        return new C18065e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Iterator<K> mo46612c() {
        return new C18062b<K>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final K mo46630a(int i) {
                return C18057x.this.f49360b[i];
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Iterator<Entry<K, V>> mo46618d() {
        return new C18062b<Entry<K, V>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Entry<K, V> mo46630a(int i) {
                return new C18064d(i);
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Iterator<V> mo46619e() {
        return new C18062b<V>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final V mo46630a(int i) {
                return C18057x.this.f49361c[i];
            }
        };
    }

    public boolean isEmpty() {
        if (this.f49364f == 0) {
            return true;
        }
        return false;
    }

    C18057x() {
        mo46608a(3, 1.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo46610b() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f49368j != null) {
            return this.f49368j;
        }
        Set<Entry<K, V>> h = m59723h();
        this.f49368j = h;
        return h;
    }

    public Set<K> keySet() {
        if (this.f49367i != null) {
            return this.f49367i;
        }
        Set<K> g = m59721g();
        this.f49367i = g;
        return g;
    }

    public Collection<V> values() {
        if (this.f49369k != null) {
            return this.f49369k;
        }
        Collection<V> i = m59725i();
        this.f49369k = i;
        return i;
    }

    /* renamed from: a */
    public static <K, V> C18057x<K, V> m59716a() {
        return new C18057x<>();
    }

    public void clear() {
        this.f49363e++;
        Arrays.fill(this.f49360b, 0, this.f49364f, null);
        Arrays.fill(this.f49361c, 0, this.f49364f, null);
        Arrays.fill(this.f49365g, -1);
        Arrays.fill(this.f49359a, -1);
        this.f49364f = 0;
    }

    private C18057x(int i) {
        this(i, 1.0f);
    }

    /* renamed from: g */
    private static int[] m59722g(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: h */
    private static long[] m59724h(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    public boolean containsKey(Object obj) {
        if (mo46607a(obj) != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo46622f(int i) {
        int i2 = i + 1;
        if (i2 < this.f49364f) {
            return i2;
        }
        return -1;
    }

    public V remove(Object obj) {
        return m59718a(obj, C17761bg.m59065a(obj));
    }

    /* renamed from: i */
    private void m59726i(int i) {
        int length = this.f49359a.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo46613c(max);
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo46608a(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f49364f);
        for (int i = 0; i < this.f49364f; i++) {
            objectOutputStream.writeObject(this.f49360b[i]);
            objectOutputStream.writeObject(this.f49361c[i]);
        }
    }

    public boolean containsValue(Object obj) {
        for (int i = 0; i < this.f49364f; i++) {
            if (C17434j.m57955a(obj, this.f49361c[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final V mo46617d(int i) {
        return m59718a(this.f49360b[i], m59714a(this.f49359a[i]));
    }

    public V get(Object obj) {
        int a = mo46607a(obj);
        mo46611b(a);
        if (a == -1) {
            return null;
        }
        return this.f49361c[a];
    }

    /* renamed from: a */
    public static <K, V> C18057x<K, V> m59717a(int i) {
        return new C18057x<>(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo46613c(int i) {
        this.f49360b = Arrays.copyOf(this.f49360b, i);
        this.f49361c = Arrays.copyOf(this.f49361c, i);
        long[] jArr = this.f49359a;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f49359a = copyOf;
    }

    /* renamed from: j */
    private void m59727j(int i) {
        if (this.f49365g.length >= 1073741824) {
            this.f49366h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f49362d)) + 1;
        int[] g = m59722g(i);
        long[] jArr = this.f49359a;
        int length = g.length - 1;
        for (int i3 = 0; i3 < this.f49364f; i3++) {
            int a = m59714a(jArr[i3]);
            int i4 = a & length;
            int i5 = g[i4];
            g[i4] = i3;
            jArr[i3] = (((long) a) << 32) | (4294967295L & ((long) i5));
        }
        this.f49366h = i2;
        this.f49365g = g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo46620e(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f49360b;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.f49361c;
            objArr2[i] = objArr2[size];
            this.f49360b[size] = null;
            this.f49361c[size] = null;
            long j = this.f49359a[size];
            this.f49359a[i] = j;
            this.f49359a[size] = -1;
            int a = m59714a(j) & m59720f();
            int i2 = this.f49365g[a];
            if (i2 == size) {
                this.f49365g[a] = i;
            } else {
                while (true) {
                    long j2 = this.f49359a[i2];
                    int b = m59719b(j2);
                    if (b == size) {
                        this.f49359a[i2] = m59715a(j2, i);
                        return;
                    }
                    i2 = b;
                }
            }
        } else {
            this.f49360b[i] = null;
            this.f49361c[i] = null;
            this.f49359a[i] = -1;
        }
    }

    /* renamed from: a */
    public final int mo46607a(Object obj) {
        int a = C17761bg.m59065a(obj);
        int i = this.f49365g[m59720f() & a];
        while (i != -1) {
            long j = this.f49359a[i];
            if (m59714a(j) == a && C17434j.m57955a(obj, this.f49360b[i])) {
                return i;
            }
            i = m59719b(j);
        }
        return -1;
    }

    C18057x(int i, float f) {
        mo46608a(i, f);
    }

    /* renamed from: a */
    private V m59718a(Object obj, int i) {
        int f = m59720f() & i;
        int i2 = this.f49365g[f];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (m59714a(this.f49359a[i2]) != i || !C17434j.m57955a(obj, this.f49360b[i2])) {
                int b = m59719b(this.f49359a[i2]);
                if (b == -1) {
                    return null;
                }
                int i4 = b;
                i3 = i2;
                i2 = i4;
            } else {
                V v = this.f49361c[i2];
                if (i3 == -1) {
                    this.f49365g[f] = m59719b(this.f49359a[i2]);
                } else {
                    long[] jArr = this.f49359a;
                    jArr[i3] = m59715a(jArr[i3], m59719b(this.f49359a[i2]));
                }
                mo46620e(i2);
                this.f49364f--;
                this.f49363e++;
                return v;
            }
        }
    }

    public V put(K k, V v) {
        long[] jArr = this.f49359a;
        Object[] objArr = this.f49360b;
        V[] vArr = this.f49361c;
        int a = C17761bg.m59065a((Object) k);
        int f = m59720f() & a;
        int i = this.f49364f;
        int i2 = this.f49365g[f];
        if (i2 == -1) {
            this.f49365g[f] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (m59714a(j) != a || !C17434j.m57955a(k, objArr[i2])) {
                    int b = m59719b(j);
                    if (b == -1) {
                        jArr[i2] = m59715a(j, i);
                        break;
                    }
                    i2 = b;
                } else {
                    V v2 = vArr[i2];
                    vArr[i2] = v;
                    mo46611b(i2);
                    return v2;
                }
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = i + 1;
            m59726i(i3);
            mo46609a(i, k, v, a);
            this.f49364f = i3;
            if (i >= this.f49366h) {
                m59727j(this.f49365g.length * 2);
            }
            this.f49363e++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46608a(int i, float f) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57969a(z, (Object) "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z2 = true;
        }
        C17439m.m57969a(z2, (Object) "Illegal load factor");
        int a = C17761bg.m59064a(i, (double) f);
        this.f49365g = m59722g(a);
        this.f49362d = f;
        this.f49360b = new Object[i];
        this.f49361c = new Object[i];
        this.f49359a = m59724h(i);
        this.f49366h = Math.max(1, (int) (((float) a) * f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46609a(int i, K k, V v, int i2) {
        this.f49359a[i] = (((long) i2) << 32) | 4294967295L;
        this.f49360b[i] = k;
        this.f49361c[i] = v;
    }
}
