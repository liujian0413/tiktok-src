package com.p280ss.android.vesdk;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.a */
public final class C45247a<E> {

    /* renamed from: a */
    private List<E> f116410a = new ArrayList();

    /* renamed from: b */
    private boolean f116411b = false;

    /* renamed from: c */
    private List<E> f116412c = new ArrayList();

    /* renamed from: a */
    public final synchronized boolean mo108183a() {
        return this.f116410a.isEmpty();
    }

    /* renamed from: b */
    public final synchronized List<E> mo108185b() {
        if (this.f116411b) {
            this.f116412c = new ArrayList(this.f116410a.size());
            for (E add : this.f116410a) {
                this.f116412c.add(add);
            }
            this.f116411b = false;
        }
        return this.f116412c;
    }

    /* renamed from: b */
    public final synchronized boolean mo108186b(E e) {
        this.f116411b = true;
        return this.f116410a.remove(e);
    }

    /* renamed from: a */
    public final synchronized boolean mo108184a(E e) {
        this.f116411b = true;
        return this.f116410a.add(e);
    }
}
