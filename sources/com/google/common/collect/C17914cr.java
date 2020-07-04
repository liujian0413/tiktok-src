package com.google.common.collect;

import com.google.common.collect.C17882cb.C17883a;
import com.google.common.collect.ImmutableMultiset.C17607a;
import com.google.common.primitives.C18143c;
import java.io.Serializable;

/* renamed from: com.google.common.collect.cr */
final class C17914cr<E> extends ImmutableMultiset<E> {

    /* renamed from: a */
    static final C17914cr<Object> f49203a = new C17914cr<>(C17893cf.m59453a());

    /* renamed from: b */
    final transient C17893cf<E> f49204b;

    /* renamed from: c */
    private final transient int f49205c;

    /* renamed from: d */
    private transient ImmutableSet<E> f49206d;

    /* renamed from: com.google.common.collect.cr$a */
    final class C17916a extends C17623b<E> {
        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return C17914cr.this.f49204b.f49160c;
        }

        private C17916a() {
        }

        public final boolean contains(Object obj) {
            return C17914cr.this.contains(obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final E mo45491a(int i) {
            return C17914cr.this.f49204b.mo46238c(i);
        }
    }

    /* renamed from: com.google.common.collect.cr$b */
    static class C17917b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f49208a;

        /* renamed from: b */
        final int[] f49209b;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            C17607a aVar = new C17607a(this.f49208a.length);
            for (int i = 0; i < this.f49208a.length; i++) {
                aVar.mo45486a(this.f49208a[i], this.f49209b[i]);
            }
            return aVar.mo45487a();
        }

        C17917b(C17882cb<?> cbVar) {
            int size = cbVar.entrySet().size();
            this.f49208a = new Object[size];
            this.f49209b = new int[size];
            int i = 0;
            for (C17883a aVar : cbVar.entrySet()) {
                this.f49208a[i] = aVar.mo45308b();
                this.f49209b[i] = aVar.mo45307a();
                i++;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return this.f49205c;
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new C17917b(this);
    }

    public final ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.f49206d;
        if (immutableSet != null) {
            return immutableSet;
        }
        C17916a aVar = new C17916a();
        this.f49206d = aVar;
        return aVar;
    }

    public final int count(Object obj) {
        return this.f49204b.mo46235b(obj);
    }

    /* access modifiers changed from: 0000 */
    public final C17883a<E> getEntry(int i) {
        return this.f49204b.mo46241e(i);
    }

    C17914cr(C17893cf<E> cfVar) {
        this.f49204b = cfVar;
        long j = 0;
        for (int i = 0; i < cfVar.f49160c; i++) {
            j += (long) cfVar.mo46240d(i);
        }
        this.f49205c = C18143c.m59970b(j);
    }
}
