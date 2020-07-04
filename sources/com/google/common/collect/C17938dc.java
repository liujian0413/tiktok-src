package com.google.common.collect;

import com.google.common.base.C17439m;

/* renamed from: com.google.common.collect.dc */
final class C17938dc<E> extends ImmutableSet<E> {

    /* renamed from: a */
    final transient E f49234a;

    /* renamed from: b */
    private transient int f49235b;

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return 1;
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableList<E> createAsList() {
        return ImmutableList.m58537of(this.f49234a);
    }

    /* access modifiers changed from: 0000 */
    public final boolean isHashCodeFast() {
        if (this.f49235b != 0) {
            return true;
        }
        return false;
    }

    public final C17995dt<E> iterator() {
        return C17782br.m59110a(this.f49234a);
    }

    public final int hashCode() {
        int i = this.f49235b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f49234a.hashCode();
        this.f49235b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f49234a.toString());
        sb.append(']');
        return sb.toString();
    }

    public final boolean contains(Object obj) {
        return this.f49234a.equals(obj);
    }

    C17938dc(E e) {
        this.f49234a = C17439m.m57962a(e);
    }

    C17938dc(E e, int i) {
        this.f49234a = e;
        this.f49235b = i;
    }

    /* access modifiers changed from: 0000 */
    public final int copyIntoArray(Object[] objArr, int i) {
        objArr[i] = this.f49234a;
        return i + 1;
    }
}
