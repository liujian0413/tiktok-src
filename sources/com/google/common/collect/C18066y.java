package com.google.common.collect;

import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.y */
class C18066y<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: a */
    public transient long[] f49383a;

    /* renamed from: b */
    transient Object[] f49384b;

    /* renamed from: c */
    transient float f49385c;

    /* renamed from: d */
    transient int f49386d;

    /* renamed from: e */
    private transient int[] f49387e;

    /* renamed from: f */
    private transient int f49388f;

    /* renamed from: g */
    private transient int f49389g;

    /* renamed from: a */
    public static int m59748a(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: a */
    private static long m59749a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: b */
    private static int m59752b(long j) {
        return (int) j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo45801a(int i, int i2) {
        return i - 1;
    }

    public int size() {
        return this.f49389g;
    }

    /* renamed from: c */
    private int m59753c() {
        return this.f49387e.length - 1;
    }

    public boolean isEmpty() {
        if (this.f49389g == 0) {
            return true;
        }
        return false;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {

            /* renamed from: a */
            int f49390a = C18066y.this.f49386d;

            /* renamed from: b */
            int f49391b = C18066y.this.mo45804b();

            /* renamed from: c */
            int f49392c = -1;

            public final boolean hasNext() {
                if (this.f49391b >= 0) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            private void m59766a() {
                if (C18066y.this.f49386d != this.f49390a) {
                    throw new ConcurrentModificationException();
                }
            }

            public final E next() {
                m59766a();
                if (hasNext()) {
                    this.f49392c = this.f49391b;
                    E e = C18066y.this.f49384b[this.f49391b];
                    this.f49391b = C18066y.this.mo45808d(this.f49391b);
                    return e;
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                boolean z;
                m59766a();
                if (this.f49392c >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C18053v.m59703a(z);
                this.f49390a++;
                C18066y.this.mo46647a(C18066y.this.f49384b[this.f49392c], C18066y.m59748a(C18066y.this.f49383a[this.f49392c]));
                this.f49391b = C18066y.this.mo45801a(this.f49391b, this.f49392c);
                this.f49392c = -1;
            }
        };
    }

    C18066y() {
        mo45802a(3, 1.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo45804b() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public Object[] toArray() {
        return Arrays.copyOf(this.f49384b, this.f49389g);
    }

    /* renamed from: a */
    public static <E> C18066y<E> m59750a() {
        return new C18066y<>();
    }

    public void clear() {
        this.f49386d++;
        Arrays.fill(this.f49384b, 0, this.f49389g, null);
        Arrays.fill(this.f49387e, -1);
        Arrays.fill(this.f49383a, -1);
        this.f49389g = 0;
    }

    /* renamed from: e */
    private static int[] m59754e(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: f */
    private static long[] m59755f(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo45808d(int i) {
        int i2 = i + 1;
        if (i2 < this.f49389g) {
            return i2;
        }
        return -1;
    }

    public boolean remove(Object obj) {
        return mo46647a(obj, C17761bg.m59065a(obj));
    }

    C18066y(int i) {
        mo45802a(i, 1.0f);
    }

    /* renamed from: g */
    private void m59756g(int i) {
        int length = this.f49383a.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo45805b(max);
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo45802a(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                add(objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f49389g);
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo45805b(int i) {
        this.f49384b = Arrays.copyOf(this.f49384b, i);
        long[] jArr = this.f49383a;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f49383a = copyOf;
    }

    public <T> T[] toArray(T[] tArr) {
        return C17892ce.m59449a(this.f49384b, 0, this.f49389g, tArr);
    }

    /* renamed from: a */
    public static <E> C18066y<E> m59751a(int i) {
        return new C18066y<>(i);
    }

    public boolean contains(Object obj) {
        int a = C17761bg.m59065a(obj);
        int i = this.f49387e[m59753c() & a];
        while (i != -1) {
            long j = this.f49383a[i];
            if (m59748a(j) == a && C17434j.m57955a(obj, this.f49384b[i])) {
                return true;
            }
            i = m59752b(j);
        }
        return false;
    }

    /* renamed from: h */
    private void m59757h(int i) {
        if (this.f49387e.length >= 1073741824) {
            this.f49388f = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f49385c)) + 1;
        int[] e = m59754e(i);
        long[] jArr = this.f49383a;
        int length = e.length - 1;
        for (int i3 = 0; i3 < this.f49389g; i3++) {
            int a = m59748a(jArr[i3]);
            int i4 = a & length;
            int i5 = e[i4];
            e[i4] = i3;
            jArr[i3] = (((long) a) << 32) | (4294967295L & ((long) i5));
        }
        this.f49388f = i2;
        this.f49387e = e;
    }

    public boolean add(E e) {
        long[] jArr = this.f49383a;
        Object[] objArr = this.f49384b;
        int a = C17761bg.m59065a((Object) e);
        int c = m59753c() & a;
        int i = this.f49389g;
        int i2 = this.f49387e[c];
        if (i2 == -1) {
            this.f49387e[c] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (m59748a(j) == a && C17434j.m57955a(e, objArr[i2])) {
                    return false;
                }
                int b = m59752b(j);
                if (b == -1) {
                    jArr[i2] = m59749a(j, i);
                    break;
                }
                i2 = b;
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = i + 1;
            m59756g(i3);
            mo45803a(i, e, a);
            this.f49389g = i3;
            if (i >= this.f49388f) {
                m59757h(this.f49387e.length * 2);
            }
            this.f49386d++;
            return true;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo45806c(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f49384b;
            objArr[i] = objArr[size];
            this.f49384b[size] = null;
            long j = this.f49383a[size];
            this.f49383a[i] = j;
            this.f49383a[size] = -1;
            int a = m59748a(j) & m59753c();
            int i2 = this.f49387e[a];
            if (i2 == size) {
                this.f49387e[a] = i;
            } else {
                while (true) {
                    long j2 = this.f49383a[i2];
                    int b = m59752b(j2);
                    if (b == size) {
                        this.f49383a[i2] = m59749a(j2, i);
                        return;
                    }
                    i2 = b;
                }
            }
        } else {
            this.f49384b[i] = null;
            this.f49383a[i] = -1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo45802a(int i, float f) {
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
        this.f49387e = m59754e(a);
        this.f49385c = f;
        this.f49384b = new Object[i];
        this.f49383a = m59755f(i);
        this.f49388f = Math.max(1, (int) (((float) a) * f));
    }

    /* renamed from: a */
    public final boolean mo46647a(Object obj, int i) {
        int c = m59753c() & i;
        int i2 = this.f49387e[c];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (m59748a(this.f49383a[i2]) != i || !C17434j.m57955a(obj, this.f49384b[i2])) {
                int b = m59752b(this.f49383a[i2]);
                if (b == -1) {
                    return false;
                }
                int i4 = b;
                i3 = i2;
                i2 = i4;
            } else {
                if (i3 == -1) {
                    this.f49387e[c] = m59752b(this.f49383a[i2]);
                } else {
                    long[] jArr = this.f49383a;
                    jArr[i3] = m59749a(jArr[i3], m59752b(this.f49383a[i2]));
                }
                mo45806c(i2);
                this.f49389g--;
                this.f49386d++;
                return true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo45803a(int i, E e, int i2) {
        this.f49383a[i] = (((long) i2) << 32) | 4294967295L;
        this.f49384b[i] = e;
    }
}
