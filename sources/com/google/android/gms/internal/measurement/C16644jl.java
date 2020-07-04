package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.jl */
final class C16644jl implements Iterator<Entry<K, V>> {

    /* renamed from: a */
    private int f46514a;

    /* renamed from: b */
    private boolean f46515b;

    /* renamed from: c */
    private Iterator<Entry<K, V>> f46516c;

    /* renamed from: d */
    private final /* synthetic */ C16636jd f46517d;

    private C16644jl(C16636jd jdVar) {
        this.f46517d = jdVar;
        this.f46514a = -1;
    }

    public final boolean hasNext() {
        if (this.f46514a + 1 < this.f46517d.f46500c.size() || (!this.f46517d.f46501d.isEmpty() && m54478a().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.f46515b) {
            this.f46515b = false;
            this.f46517d.m54465e();
            if (this.f46514a < this.f46517d.f46500c.size()) {
                C16636jd jdVar = this.f46517d;
                int i = this.f46514a;
                this.f46514a = i - 1;
                jdVar.m54462c(i);
                return;
            }
            m54478a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m54478a() {
        if (this.f46516c == null) {
            this.f46516c = this.f46517d.f46501d.entrySet().iterator();
        }
        return this.f46516c;
    }

    public final /* synthetic */ Object next() {
        this.f46515b = true;
        int i = this.f46514a + 1;
        this.f46514a = i;
        if (i < this.f46517d.f46500c.size()) {
            return (Entry) this.f46517d.f46500c.get(this.f46514a);
        }
        return (Entry) m54478a().next();
    }

    /* synthetic */ C16644jl(C16636jd jdVar, C16637je jeVar) {
        this(jdVar);
    }
}
