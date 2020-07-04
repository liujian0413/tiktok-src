package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.api.client.util.a */
public class C17336a<K, V> extends AbstractMap<K, V> implements Cloneable {

    /* renamed from: a */
    int f48244a;

    /* renamed from: b */
    private Object[] f48245b;

    /* renamed from: com.google.api.client.util.a$a */
    final class C17337a implements Entry<K, V> {

        /* renamed from: b */
        private int f48247b;

        public final K getKey() {
            return C17336a.this.mo44785a(this.f48247b);
        }

        public final V getValue() {
            return C17336a.this.mo44788b(this.f48247b);
        }

        public final int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        public final V setValue(V v) {
            return C17336a.this.mo44786a(this.f48247b, v);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!C17380v.m57843a(getKey(), entry.getKey()) || !C17380v.m57843a(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }

        C17337a(int i) {
            this.f48247b = i;
        }
    }

    /* renamed from: com.google.api.client.util.a$b */
    final class C17338b implements Iterator<Entry<K, V>> {

        /* renamed from: b */
        private boolean f48249b;

        /* renamed from: c */
        private int f48250c;

        public final boolean hasNext() {
            if (this.f48250c < C17336a.this.f48244a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Entry<K, V> next() {
            int i = this.f48250c;
            if (i != C17336a.this.f48244a) {
                this.f48250c++;
                return new C17337a(i);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            int i = this.f48250c - 1;
            if (this.f48249b || i < 0) {
                throw new IllegalArgumentException();
            }
            C17336a.this.mo44789c(i);
            this.f48249b = true;
        }

        C17338b() {
        }
    }

    /* renamed from: com.google.api.client.util.a$c */
    final class C17339c extends AbstractSet<Entry<K, V>> {
        public final Iterator<Entry<K, V>> iterator() {
            return new C17338b();
        }

        public final int size() {
            return C17336a.this.f48244a;
        }

        C17339c() {
        }
    }

    public final int size() {
        return this.f48244a;
    }

    public void clear() {
        this.f48244a = 0;
        this.f48245b = null;
    }

    public final Set<Entry<K, V>> entrySet() {
        return new C17339c();
    }

    /* renamed from: a */
    public static <K, V> C17336a<K, V> m57738a() {
        return new C17336a<>();
    }

    /* renamed from: b */
    public final C17336a<K, V> clone() {
        try {
            C17336a<K, V> aVar = (C17336a) super.clone();
            Object[] objArr = this.f48245b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                aVar.f48245b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private int m57737a(K k) {
        return m57740b((Object) k) >> 1;
    }

    /* renamed from: c */
    public final V mo44789c(int i) {
        return m57745g(i << 1);
    }

    /* renamed from: f */
    private V m57744f(int i) {
        if (i < 0) {
            return null;
        }
        return this.f48245b[i];
    }

    public final boolean containsKey(Object obj) {
        if (-2 != m57740b(obj)) {
            return true;
        }
        return false;
    }

    public final V get(Object obj) {
        return m57744f(m57740b(obj) + 1);
    }

    public final V remove(Object obj) {
        return m57745g(m57740b(obj));
    }

    /* renamed from: b */
    private int m57740b(Object obj) {
        int i = this.f48244a << 1;
        Object[] objArr = this.f48245b;
        int i2 = 0;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return i2;
        }
        return -2;
    }

    /* renamed from: e */
    private void m57743e(int i) {
        if (i == 0) {
            this.f48245b = null;
            return;
        }
        int i2 = this.f48244a;
        Object[] objArr = this.f48245b;
        if (i2 == 0 || i != objArr.length) {
            Object[] objArr2 = new Object[i];
            this.f48245b = objArr2;
            if (i2 != 0) {
                System.arraycopy(objArr, 0, objArr2, 0, i2 << 1);
            }
        }
    }

    public final boolean containsValue(Object obj) {
        int i = this.f48244a << 1;
        Object[] objArr = this.f48245b;
        int i2 = 1;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m57742d(int i) {
        int i2;
        if (i >= 0) {
            Object[] objArr = this.f48245b;
            int i3 = i << 1;
            if (objArr == null) {
                i2 = 0;
            } else {
                i2 = objArr.length;
            }
            if (i3 > i2) {
                int i4 = ((i2 / 2) * 3) + 1;
                if (i4 % 2 != 0) {
                    i4++;
                }
                if (i4 >= i3) {
                    i3 = i4;
                }
                m57743e(i3);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    private V m57745g(int i) {
        int i2 = this.f48244a << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V f = m57744f(i + 1);
        Object[] objArr = this.f48245b;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.f48244a--;
        m57741b(i2 - 2, null, null);
        return f;
    }

    /* renamed from: a */
    public final K mo44785a(int i) {
        if (i < 0 || i >= this.f48244a) {
            return null;
        }
        return this.f48245b[i << 1];
    }

    /* renamed from: b */
    public final V mo44788b(int i) {
        if (i < 0 || i >= this.f48244a) {
            return null;
        }
        return m57744f((i << 1) + 1);
    }

    public final V put(K k, V v) {
        int a = m57737a(k);
        if (a == -1) {
            a = this.f48244a;
        }
        return m57739a(a, k, v);
    }

    /* renamed from: a */
    public final V mo44786a(int i, V v) {
        int i2 = this.f48244a;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (i << 1) + 1;
        V f = m57744f(i3);
        this.f48245b[i3] = v;
        return f;
    }

    /* renamed from: b */
    private void m57741b(int i, K k, V v) {
        Object[] objArr = this.f48245b;
        objArr[i] = k;
        objArr[i + 1] = v;
    }

    /* renamed from: a */
    private V m57739a(int i, K k, V v) {
        if (i >= 0) {
            int i2 = i + 1;
            m57742d(i2);
            int i3 = i << 1;
            V f = m57744f(i3 + 1);
            m57741b(i3, k, v);
            if (i2 > this.f48244a) {
                this.f48244a = i2;
            }
            return f;
        }
        throw new IndexOutOfBoundsException();
    }
}
