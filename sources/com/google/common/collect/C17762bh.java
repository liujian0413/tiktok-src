package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: com.google.common.collect.bh */
abstract class C17762bh<E> extends ImmutableList<E> {

    /* renamed from: com.google.common.collect.bh$a */
    static class C17763a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final ImmutableCollection<?> f48992a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return this.f48992a.asList();
        }

        C17763a(ImmutableCollection<?> immutableCollection) {
            this.f48992a = immutableCollection;
        }
    }

    C17762bh() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract ImmutableCollection<E> mo45965a();

    public boolean isEmpty() {
        return mo45965a().isEmpty();
    }

    /* access modifiers changed from: 0000 */
    public boolean isPartialView() {
        return mo45965a().isPartialView();
    }

    public int size() {
        return mo45965a().size();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17763a(mo45965a());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public boolean contains(Object obj) {
        return mo45965a().contains(obj);
    }
}
