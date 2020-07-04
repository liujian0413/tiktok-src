package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

public final class LinkedHashMultiset<E> extends C18023f<E> {
    public static <E> LinkedHashMultiset<E> create() {
        return create(3);
    }

    public final /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    LinkedHashMultiset(int i) {
        super(i);
    }

    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    /* access modifiers changed from: 0000 */
    public final void init(int i) {
        this.backingMap = new C17895cg(i);
    }

    public static <E> LinkedHashMultiset<E> create(int i) {
        return new LinkedHashMultiset<>(i);
    }

    public static <E> LinkedHashMultiset<E> create(Iterable<? extends E> iterable) {
        LinkedHashMultiset<E> create = create(C17884cc.m59423a(iterable));
        C17777bq.m59095a((Collection<T>) create, iterable);
        return create;
    }
}
