package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import java.util.LinkedList;

/* renamed from: com.facebook.imagepipeline.memory.f */
public final class C13809f<T> {

    /* renamed from: a */
    protected final SparseArray<C13811a<T>> f36655a = new SparseArray<>();

    /* renamed from: b */
    C13811a<T> f36656b;

    /* renamed from: c */
    C13811a<T> f36657c;

    /* renamed from: com.facebook.imagepipeline.memory.f$a */
    static class C13811a<I> {

        /* renamed from: a */
        C13811a<I> f36658a;

        /* renamed from: b */
        int f36659b;

        /* renamed from: c */
        LinkedList<I> f36660c;

        /* renamed from: d */
        C13811a<I> f36661d;

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinkedEntry(key: ");
            sb.append(this.f36659b);
            sb.append(")");
            return sb.toString();
        }

        private C13811a(C13811a<I> aVar, int i, LinkedList<I> linkedList, C13811a<I> aVar2) {
            this.f36658a = aVar;
            this.f36659b = i;
            this.f36660c = linkedList;
            this.f36661d = aVar2;
        }
    }

    /* renamed from: a */
    public final synchronized T mo33442a() {
        C13811a<T> aVar = this.f36657c;
        if (aVar == null) {
            return null;
        }
        T pollLast = aVar.f36660c.pollLast();
        m40764c(aVar);
        return pollLast;
    }

    /* renamed from: b */
    private void m40763b(C13811a<T> aVar) {
        if (this.f36656b != aVar) {
            m40762a(aVar);
            if (this.f36656b == null) {
                this.f36656b = aVar;
                this.f36657c = aVar;
                return;
            }
            aVar.f36661d = this.f36656b;
            this.f36656b.f36658a = aVar;
            this.f36656b = aVar;
        }
    }

    /* renamed from: c */
    private void m40764c(C13811a<T> aVar) {
        if (aVar != null && aVar.f36660c.isEmpty()) {
            m40762a(aVar);
            this.f36655a.remove(aVar.f36659b);
        }
    }

    /* renamed from: a */
    private synchronized void m40762a(C13811a<T> aVar) {
        C13811a<I> aVar2 = aVar.f36658a;
        C13811a<I> aVar3 = aVar.f36661d;
        if (aVar2 != null) {
            aVar2.f36661d = aVar3;
        }
        if (aVar3 != null) {
            aVar3.f36658a = aVar2;
        }
        aVar.f36658a = null;
        aVar.f36661d = null;
        if (aVar == this.f36656b) {
            this.f36656b = aVar3;
        }
        if (aVar == this.f36657c) {
            this.f36657c = aVar2;
        }
    }

    /* renamed from: a */
    public final synchronized T mo33443a(int i) {
        C13811a aVar = (C13811a) this.f36655a.get(i);
        if (aVar == null) {
            return null;
        }
        T pollFirst = aVar.f36660c.pollFirst();
        m40763b(aVar);
        return pollFirst;
    }

    /* renamed from: a */
    public final synchronized void mo33444a(int i, T t) {
        C13811a aVar = (C13811a) this.f36655a.get(i);
        if (aVar == null) {
            aVar = new C13811a(i, new LinkedList());
            this.f36655a.put(i, aVar);
        }
        aVar.f36660c.addLast(t);
        m40763b(aVar);
    }
}
