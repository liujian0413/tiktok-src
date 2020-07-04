package android.support.p022v4.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.util.a */
public final class C0888a<E> implements Collection<E>, Set<E> {

    /* renamed from: c */
    private static final int[] f3111c = new int[0];

    /* renamed from: d */
    private static final Object[] f3112d = new Object[0];

    /* renamed from: e */
    private static Object[] f3113e;

    /* renamed from: f */
    private static int f3114f;

    /* renamed from: g */
    private static Object[] f3115g;

    /* renamed from: h */
    private static int f3116h;

    /* renamed from: a */
    Object[] f3117a;

    /* renamed from: b */
    int f3118b;

    /* renamed from: i */
    private int[] f3119i;

    /* renamed from: j */
    private C0895g<E, E> f3120j;

    public final int size() {
        return this.f3118b;
    }

    public C0888a() {
        this(0);
    }

    public final boolean isEmpty() {
        if (this.f3118b <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private C0895g<E, E> m3769b() {
        if (this.f3120j == null) {
            this.f3120j = new C0895g<E, E>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final int mo3293a() {
                    return C0888a.this.f3118b;
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public final void mo3301c() {
                    C0888a.this.clear();
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Map<E, E> mo3300b() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final int mo3299b(Object obj) {
                    return C0888a.this.mo3304a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final int mo3294a(Object obj) {
                    return C0888a.this.mo3304a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo3297a(int i) {
                    C0888a.this.mo3308b(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Object mo3295a(int i, int i2) {
                    return C0888a.this.f3117a[i];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final E mo3296a(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo3298a(E e, E e2) {
                    C0888a.this.add(e);
                }
            };
        }
        return this.f3120j;
    }

    public final int hashCode() {
        int[] iArr = this.f3119i;
        int i = 0;
        for (int i2 = 0; i2 < this.f3118b; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public final Iterator<E> iterator() {
        return m3769b().mo3353e().iterator();
    }

    public final Object[] toArray() {
        Object[] objArr = new Object[this.f3118b];
        System.arraycopy(this.f3117a, 0, objArr, 0, this.f3118b);
        return objArr;
    }

    public final void clear() {
        if (this.f3118b != 0) {
            m3768a(this.f3119i, this.f3117a, this.f3118b);
            this.f3119i = f3111c;
            this.f3117a = f3112d;
            this.f3118b = 0;
        }
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3118b * 14);
        sb.append('{');
        for (int i = 0; i < this.f3118b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object a = mo3305a(i);
            if (a != this) {
                sb.append(a);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private int m3766a() {
        int i = this.f3118b;
        if (i == 0) {
            return -1;
        }
        int a = C0890b.m3785a(this.f3119i, i, 0);
        if (a < 0 || this.f3117a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f3119i[i2] == 0) {
            if (this.f3117a[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f3119i[i3] == 0) {
            if (this.f3117a[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    public final E mo3305a(int i) {
        return this.f3117a[i];
    }

    public C0888a(Collection<E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    /* renamed from: a */
    public final int mo3304a(Object obj) {
        if (obj == null) {
            return m3766a();
        }
        return m3767a(obj, obj.hashCode());
    }

    public final boolean contains(Object obj) {
        if (mo3304a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean remove(Object obj) {
        int a = mo3304a(obj);
        if (a < 0) {
            return false;
        }
        mo3308b(a);
        return true;
    }

    public C0888a(int i) {
        if (i == 0) {
            this.f3119i = f3111c;
            this.f3117a = f3112d;
        } else {
            m3770c(i);
        }
        this.f3118b = 0;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        m3771d(this.f3118b + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f3118b - 1; i >= 0; i--) {
            if (!collection.contains(this.f3117a[i])) {
                mo3308b(i);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m3771d(int i) {
        if (this.f3119i.length < i) {
            int[] iArr = this.f3119i;
            Object[] objArr = this.f3117a;
            m3770c(i);
            if (this.f3118b > 0) {
                System.arraycopy(iArr, 0, this.f3119i, 0, this.f3118b);
                System.arraycopy(objArr, 0, this.f3117a, 0, this.f3118b);
            }
            m3768a(iArr, objArr, this.f3118b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f3118b) {
            try {
                if (!set.contains(mo3305a(i))) {
                    return false;
                }
                i++;
            } catch (NullPointerException unused) {
                return false;
            } catch (ClassCastException unused2) {
                return false;
            }
        }
        return true;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f3118b) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f3118b);
        }
        System.arraycopy(this.f3117a, 0, tArr, 0, this.f3118b);
        if (tArr.length > this.f3118b) {
            tArr[this.f3118b] = null;
        }
        return tArr;
    }

    /* renamed from: c */
    private void m3770c(int i) {
        if (i == 8) {
            synchronized (C0888a.class) {
                if (f3115g != null) {
                    Object[] objArr = f3115g;
                    this.f3117a = objArr;
                    f3115g = (Object[]) objArr[0];
                    this.f3119i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3116h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0888a.class) {
                if (f3113e != null) {
                    Object[] objArr2 = f3113e;
                    this.f3117a = objArr2;
                    f3113e = (Object[]) objArr2[0];
                    this.f3119i = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3114f--;
                    return;
                }
            }
        }
        this.f3119i = new int[i];
        this.f3117a = new Object[i];
    }

    public final boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m3766a();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m3767a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        if (this.f3118b >= this.f3119i.length) {
            int i4 = 4;
            if (this.f3118b >= 8) {
                i4 = (this.f3118b >> 1) + this.f3118b;
            } else if (this.f3118b >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f3119i;
            Object[] objArr = this.f3117a;
            m3770c(i4);
            if (this.f3119i.length > 0) {
                System.arraycopy(iArr, 0, this.f3119i, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3117a, 0, objArr.length);
            }
            m3768a(iArr, objArr, this.f3118b);
        }
        if (i3 < this.f3118b) {
            int[] iArr2 = this.f3119i;
            int i5 = i3 + 1;
            System.arraycopy(iArr2, i3, iArr2, i5, this.f3118b - i3);
            Object[] objArr2 = this.f3117a;
            System.arraycopy(objArr2, i3, objArr2, i5, this.f3118b - i3);
        }
        this.f3119i[i3] = i;
        this.f3117a[i3] = e;
        this.f3118b++;
        return true;
    }

    /* renamed from: b */
    public final E mo3308b(int i) {
        E e = this.f3117a[i];
        if (this.f3118b <= 1) {
            m3768a(this.f3119i, this.f3117a, this.f3118b);
            this.f3119i = f3111c;
            this.f3117a = f3112d;
            this.f3118b = 0;
        } else {
            int i2 = 8;
            if (this.f3119i.length <= 8 || this.f3118b >= this.f3119i.length / 3) {
                this.f3118b--;
                if (i < this.f3118b) {
                    int i3 = i + 1;
                    System.arraycopy(this.f3119i, i3, this.f3119i, i, this.f3118b - i);
                    System.arraycopy(this.f3117a, i3, this.f3117a, i, this.f3118b - i);
                }
                this.f3117a[this.f3118b] = null;
            } else {
                if (this.f3118b > 8) {
                    i2 = (this.f3118b >> 1) + this.f3118b;
                }
                int[] iArr = this.f3119i;
                Object[] objArr = this.f3117a;
                m3770c(i2);
                this.f3118b--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f3119i, 0, i);
                    System.arraycopy(objArr, 0, this.f3117a, 0, i);
                }
                if (i < this.f3118b) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, this.f3119i, i, this.f3118b - i);
                    System.arraycopy(objArr, i4, this.f3117a, i, this.f3118b - i);
                }
            }
        }
        return e;
    }

    /* renamed from: a */
    private int m3767a(Object obj, int i) {
        int i2 = this.f3118b;
        if (i2 == 0) {
            return -1;
        }
        int a = C0890b.m3785a(this.f3119i, i2, i);
        if (a < 0 || obj.equals(this.f3117a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f3119i[i3] == i) {
            if (obj.equals(this.f3117a[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f3119i[i4] == i) {
            if (obj.equals(this.f3117a[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private static void m3768a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0888a.class) {
                if (f3116h < 10) {
                    objArr[0] = f3115g;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f3115g = objArr;
                    f3116h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0888a.class) {
                if (f3114f < 10) {
                    objArr[0] = f3113e;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3113e = objArr;
                    f3114f++;
                }
            }
        }
    }
}
