package android.support.p022v4.util;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: android.support.v4.util.k */
public class C0904k<K, V> {

    /* renamed from: b */
    static Object[] f3156b;

    /* renamed from: c */
    static int f3157c;

    /* renamed from: d */
    static Object[] f3158d;

    /* renamed from: e */
    static int f3159e;

    /* renamed from: f */
    int[] f3160f;

    /* renamed from: g */
    Object[] f3161g;

    /* renamed from: h */
    int f3162h;

    public int size() {
        return this.f3162h;
    }

    public boolean isEmpty() {
        if (this.f3162h <= 0) {
            return true;
        }
        return false;
    }

    public C0904k() {
        this.f3160f = C0890b.f3122a;
        this.f3161g = C0890b.f3124c;
    }

    public void clear() {
        if (this.f3162h > 0) {
            int[] iArr = this.f3160f;
            Object[] objArr = this.f3161g;
            int i = this.f3162h;
            this.f3160f = C0890b.f3122a;
            this.f3161g = C0890b.f3124c;
            this.f3162h = 0;
            m3846a(iArr, objArr, i);
        }
        if (this.f3162h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int i;
        int[] iArr = this.f3160f;
        Object[] objArr = this.f3161g;
        int i2 = this.f3162h;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < i2) {
            Object obj = objArr[i4];
            int i6 = iArr[i3];
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            i5 += i ^ i6;
            i3++;
            i4 += 2;
        }
        return i5;
    }

    /* renamed from: a */
    private int m3842a() {
        int i = this.f3162h;
        if (i == 0) {
            return -1;
        }
        int a = m3844a(this.f3160f, i, 0);
        if (a < 0 || this.f3161g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f3160f[i2] == 0) {
            if (this.f3161g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f3160f[i3] == 0) {
            if (this.f3161g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3162h * 28);
        sb.append('{');
        for (int i = 0; i < this.f3162h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo3417b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c = mo3418c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public final K mo3417b(int i) {
        return this.f3161g[i << 1];
    }

    /* renamed from: c */
    public final V mo3418c(int i) {
        return this.f3161g[(i << 1) + 1];
    }

    public boolean containsKey(Object obj) {
        if (mo3413a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (mo3416b(obj) >= 0) {
            return true;
        }
        return false;
    }

    public V remove(Object obj) {
        int a = mo3413a(obj);
        if (a >= 0) {
            return mo3422d(a);
        }
        return null;
    }

    public C0904k(int i) {
        if (i == 0) {
            this.f3160f = C0890b.f3122a;
            this.f3161g = C0890b.f3124c;
        } else {
            m3847e(i);
        }
        this.f3162h = 0;
    }

    /* renamed from: a */
    public final int mo3413a(Object obj) {
        if (obj == null) {
            return m3842a();
        }
        return m3843a(obj, obj.hashCode());
    }

    public V get(Object obj) {
        int a = mo3413a(obj);
        if (a >= 0) {
            return this.f3161g[(a << 1) + 1];
        }
        return null;
    }

    public C0904k(C0904k<K, V> kVar) {
        this();
        if (kVar != null) {
            m3845a(kVar);
        }
    }

    /* renamed from: a */
    private void m3845a(C0904k<? extends K, ? extends V> kVar) {
        int i = kVar.f3162h;
        mo3415a(this.f3162h + i);
        if (this.f3162h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.mo3417b(i2), kVar.mo3418c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f3160f, 0, this.f3160f, 0, i);
            System.arraycopy(kVar.f3161g, 0, this.f3161g, 0, i << 1);
            this.f3162h = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo3416b(Object obj) {
        int i = this.f3162h * 2;
        Object[] objArr = this.f3161g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: e */
    private void m3847e(int i) {
        if (i == 8) {
            synchronized (ArrayMap.class) {
                if (f3158d != null) {
                    Object[] objArr = f3158d;
                    this.f3161g = objArr;
                    f3158d = (Object[]) objArr[0];
                    this.f3160f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3159e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ArrayMap.class) {
                if (f3156b != null) {
                    Object[] objArr2 = f3156b;
                    this.f3161g = objArr2;
                    f3156b = (Object[]) objArr2[0];
                    this.f3160f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3157c--;
                    return;
                }
            }
        }
        this.f3160f = new int[i];
        this.f3161g = new Object[(i << 1)];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0904k) {
            C0904k kVar = (C0904k) obj;
            if (size() != kVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f3162h) {
                try {
                    Object b = mo3417b(i);
                    Object c = mo3418c(i);
                    Object obj2 = kVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !kVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
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
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f3162h) {
                try {
                    Object b2 = mo3417b(i2);
                    Object c2 = mo3418c(i2);
                    Object obj3 = map.get(b2);
                    if (c2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!c2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (NullPointerException unused3) {
                    return false;
                } catch (ClassCastException unused4) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public final V mo3422d(int i) {
        int i2 = i << 1;
        V v = this.f3161g[i2 + 1];
        int i3 = this.f3162h;
        int i4 = 0;
        if (i3 <= 1) {
            m3846a(this.f3160f, this.f3161g, i3);
            this.f3160f = C0890b.f3122a;
            this.f3161g = C0890b.f3124c;
        } else {
            int i5 = i3 - 1;
            int i6 = 8;
            if (this.f3160f.length <= 8 || this.f3162h >= this.f3160f.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(this.f3160f, i7, this.f3160f, i, i8);
                    System.arraycopy(this.f3161g, i7 << 1, this.f3161g, i2, i8 << 1);
                }
                int i9 = i5 << 1;
                this.f3161g[i9] = null;
                this.f3161g[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr = this.f3160f;
                Object[] objArr = this.f3161g;
                m3847e(i6);
                if (i3 == this.f3162h) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f3160f, 0, i);
                        System.arraycopy(objArr, 0, this.f3161g, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f3160f, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.f3161g, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f3162h) {
            this.f3162h = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: a */
    public final void mo3415a(int i) {
        int i2 = this.f3162h;
        if (this.f3160f.length < i) {
            int[] iArr = this.f3160f;
            Object[] objArr = this.f3161g;
            m3847e(i);
            if (this.f3162h > 0) {
                System.arraycopy(iArr, 0, this.f3160f, 0, i2);
                System.arraycopy(objArr, 0, this.f3161g, 0, i2 << 1);
            }
            m3846a(iArr, objArr, i2);
        }
        if (this.f3162h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private int m3843a(Object obj, int i) {
        int i2 = this.f3162h;
        if (i2 == 0) {
            return -1;
        }
        int a = m3844a(this.f3160f, i2, i);
        if (a < 0 || obj.equals(this.f3161g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f3160f[i3] == i) {
            if (obj.equals(this.f3161g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f3160f[i4] == i) {
            if (obj.equals(this.f3161g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f3162h;
        if (k == null) {
            i2 = m3842a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = m3843a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V v2 = this.f3161g[i4];
            this.f3161g[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.f3160f.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f3160f;
            Object[] objArr = this.f3161g;
            m3847e(i6);
            if (i3 == this.f3162h) {
                if (this.f3160f.length > 0) {
                    System.arraycopy(iArr, 0, this.f3160f, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f3161g, 0, objArr.length);
                }
                m3846a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr2 = this.f3160f;
            int i7 = i5 + 1;
            System.arraycopy(iArr2, i5, iArr2, i7, i3 - i5);
            System.arraycopy(this.f3161g, i5 << 1, this.f3161g, i7 << 1, (this.f3162h - i5) << 1);
        }
        if (i3 != this.f3162h || i5 >= this.f3160f.length) {
            throw new ConcurrentModificationException();
        }
        this.f3160f[i5] = i;
        int i8 = i5 << 1;
        this.f3161g[i8] = k;
        this.f3161g[i8 + 1] = v;
        this.f3162h++;
        return null;
    }

    /* renamed from: a */
    public final V mo3414a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.f3161g[i2];
        this.f3161g[i2] = v;
        return v2;
    }

    /* renamed from: a */
    private static int m3844a(int[] iArr, int i, int i2) {
        try {
            return C0890b.m3785a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private static void m3846a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (ArrayMap.class) {
                if (f3159e < 10) {
                    objArr[0] = f3158d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f3158d = objArr;
                    f3159e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (ArrayMap.class) {
                if (f3157c < 10) {
                    objArr[0] = f3156b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3156b = objArr;
                    f3157c++;
                }
            }
        }
    }
}
