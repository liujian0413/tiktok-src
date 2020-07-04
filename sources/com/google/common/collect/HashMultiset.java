package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

public class HashMultiset<E> extends C18023f<E> {
    private static final long serialVersionUID = 0;

    public static <E> HashMultiset<E> create() {
        return create(3);
    }

    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    HashMultiset(int i) {
        super(i);
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    /* access modifiers changed from: 0000 */
    public void init(int i) {
        this.backingMap = new C17893cf(i);
    }

    public static <E> HashMultiset<E> create(int i) {
        return new HashMultiset<>(i);
    }

    public static <E> HashMultiset<E> create(Iterable<? extends E> iterable) {
        HashMultiset<E> create = create(C17884cc.m59423a(iterable));
        C17777bq.m59095a((Collection<T>) create, iterable);
        return create;
    }
}
