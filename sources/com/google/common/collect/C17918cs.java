package com.google.common.collect;

/* renamed from: com.google.common.collect.cs */
final class C17918cs<E> extends ImmutableSet<E> {

    /* renamed from: a */
    static final C17918cs<Object> f49210a;

    /* renamed from: b */
    final transient Object[] f49211b;

    /* renamed from: c */
    final transient Object[] f49212c;

    /* renamed from: d */
    private final transient int f49213d;

    /* renamed from: e */
    private final transient int f49214e;

    /* renamed from: f */
    private final transient int f49215f;

    public final int hashCode() {
        return this.f49214e;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isHashCodeFast() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return this.f49215f;
    }

    static {
        C17918cs csVar = new C17918cs(new Object[0], 0, null, 0, 0);
        f49210a = csVar;
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(this.f49211b, this.f49215f);
    }

    public final C17995dt<E> iterator() {
        return asList().iterator();
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f49212c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a = C17761bg.m59065a(obj);
        while (true) {
            int i = a & this.f49213d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* access modifiers changed from: 0000 */
    public final int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.f49211b, 0, objArr, i, this.f49215f);
        return i + this.f49215f;
    }

    C17918cs(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f49211b = objArr;
        this.f49212c = objArr2;
        this.f49213d = i2;
        this.f49214e = i;
        this.f49215f = i3;
    }
}
