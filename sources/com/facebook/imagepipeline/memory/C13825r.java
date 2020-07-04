package com.facebook.imagepipeline.memory;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.memory.r */
public abstract class C13825r<T> implements C13798aa<T> {

    /* renamed from: a */
    private final Set<T> f36676a = new HashSet();

    /* renamed from: b */
    private final C13809f<T> f36677b = new C13809f<>();

    /* renamed from: a */
    public final T mo33421a() {
        return m40817c(this.f36677b.mo33442a());
    }

    /* renamed from: c */
    private T m40817c(T t) {
        if (t != null) {
            synchronized (this) {
                this.f36676a.remove(t);
            }
        }
        return t;
    }

    /* renamed from: a */
    public T mo33422a(int i) {
        return m40817c(this.f36677b.mo33443a(i));
    }

    /* renamed from: a */
    public void mo33423a(T t) {
        boolean add;
        synchronized (this) {
            add = this.f36676a.add(t);
        }
        if (add) {
            this.f36677b.mo33444a(mo33424b(t), t);
        }
    }
}
