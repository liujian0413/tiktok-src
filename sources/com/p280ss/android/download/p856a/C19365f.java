package com.p280ss.android.download.p856a;

import java.lang.ref.SoftReference;
import java.util.HashMap;

/* renamed from: com.ss.android.download.a.f */
public final class C19365f<K, V> implements C19364e<K, V> {

    /* renamed from: a */
    private final int f52405a;

    /* renamed from: b */
    private final C19366a f52406b;

    /* renamed from: c */
    private final C19366a f52407c;

    /* renamed from: d */
    private HashMap<K, C19366a> f52408d;

    /* renamed from: com.ss.android.download.a.f$a */
    class C19366a {

        /* renamed from: a */
        C19366a f52409a;

        /* renamed from: b */
        C19366a f52410b;

        /* renamed from: c */
        K f52411c;

        /* renamed from: d */
        SoftReference<V> f52412d;

        C19366a() {
        }
    }

    public C19365f() {
        this(16);
    }

    /* renamed from: a */
    public final void mo51339a() {
        this.f52408d.clear();
        this.f52406b.f52410b = this.f52407c;
        this.f52407c.f52409a = this.f52406b;
    }

    /* renamed from: a */
    private static void m63572a(C19366a aVar) {
        aVar.f52409a.f52410b = aVar.f52410b;
        aVar.f52410b.f52409a = aVar.f52409a;
        aVar.f52410b = null;
        aVar.f52409a = null;
    }

    public C19365f(int i) {
        this.f52408d = new HashMap<>();
        if (i > 1) {
            this.f52405a = i;
            this.f52406b = new C19366a<>();
            this.f52407c = new C19366a<>();
            this.f52406b.f52410b = this.f52407c;
            this.f52407c.f52409a = this.f52406b;
            return;
        }
        throw new IllegalArgumentException("capacity must be great than one");
    }

    /* renamed from: b */
    private void m63574b(C19366a aVar) {
        m63573a(this.f52406b, aVar);
        if (this.f52408d.size() > this.f52405a && this.f52407c.f52409a != this.f52406b) {
            this.f52408d.remove(this.f52407c.f52409a.f52411c);
            m63572a(this.f52407c.f52409a);
        }
    }

    /* renamed from: a */
    public final V mo51337a(K k) {
        C19366a aVar = (C19366a) this.f52408d.get(k);
        if (aVar == null) {
            return null;
        }
        V v = aVar.f52412d.get();
        if (v == null) {
            this.f52408d.remove(k);
            if (!(aVar.f52409a == null || aVar.f52410b == null)) {
                m63572a(aVar);
            }
            return null;
        }
        if (!(aVar.f52409a == null || aVar.f52410b == null || aVar.f52409a == this.f52406b)) {
            m63572a(aVar);
            m63573a(this.f52406b, aVar);
        }
        return v;
    }

    /* renamed from: a */
    public final void mo51340a(int i) {
        while (this.f52408d.size() > 8 && this.f52407c.f52409a != this.f52406b) {
            this.f52408d.remove(this.f52407c.f52409a.f52411c);
            m63572a(this.f52407c.f52409a);
        }
    }

    /* renamed from: a */
    private static void m63573a(C19366a aVar, C19366a aVar2) {
        aVar2.f52409a = aVar;
        aVar2.f52410b = aVar.f52410b;
        aVar2.f52410b.f52409a = aVar2;
        aVar.f52410b = aVar2;
    }

    /* renamed from: a */
    public final void mo51338a(K k, V v) {
        if (k != null && v != null) {
            C19366a aVar = (C19366a) this.f52408d.get(k);
            if (aVar != null) {
                if (v != aVar.f52412d.get()) {
                    aVar.f52412d = new SoftReference<>(v);
                }
                aVar.f52411c = k;
                if (!(aVar.f52409a == null || aVar.f52410b == null || aVar.f52409a == this.f52406b)) {
                    m63572a(aVar);
                    m63573a(this.f52406b, aVar);
                }
                return;
            }
            C19366a aVar2 = new C19366a();
            aVar2.f52411c = k;
            aVar2.f52412d = new SoftReference<>(v);
            this.f52408d.put(k, aVar2);
            m63574b(aVar2);
        }
    }
}
