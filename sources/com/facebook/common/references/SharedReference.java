package com.facebook.common.references;

import com.facebook.common.internal.C13307g;
import com.facebook.common.p686c.C13286a;
import java.util.IdentityHashMap;
import java.util.Map;

public final class SharedReference<T> {

    /* renamed from: a */
    private static final Map<Object, Integer> f35228a = new IdentityHashMap();

    /* renamed from: b */
    private T f35229b;

    /* renamed from: c */
    private int f35230c = 1;

    /* renamed from: d */
    private final C13329c<T> f35231d;

    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    /* renamed from: a */
    public final synchronized T mo32606a() {
        return this.f35229b;
    }

    /* renamed from: d */
    private synchronized boolean m38989d() {
        boolean z;
        if (this.f35230c > 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    private void m38991f() {
        if (!m38987a(this)) {
            throw new NullReferenceException();
        }
    }

    /* renamed from: b */
    public final synchronized void mo32607b() {
        m38991f();
        this.f35230c++;
    }

    /* renamed from: e */
    private synchronized int m38990e() {
        boolean z;
        m38991f();
        if (this.f35230c > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        this.f35230c--;
        return this.f35230c;
    }

    /* renamed from: c */
    public final void mo32608c() {
        T t;
        if (m38990e() == 0) {
            synchronized (this) {
                t = this.f35229b;
                this.f35229b = null;
            }
            this.f35231d.mo32582a(t);
            m38988b(t);
        }
    }

    /* renamed from: a */
    private static boolean m38987a(SharedReference<?> sharedReference) {
        if (sharedReference.m38989d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m38986a(Object obj) {
        synchronized (f35228a) {
            Integer num = (Integer) f35228a.get(obj);
            if (num == null) {
                f35228a.put(obj, Integer.valueOf(1));
            } else {
                f35228a.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    /* renamed from: b */
    private static void m38988b(Object obj) {
        synchronized (f35228a) {
            Integer num = (Integer) f35228a.get(obj);
            if (num == null) {
                C13286a.m38865d("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                f35228a.remove(obj);
            } else {
                f35228a.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public SharedReference(T t, C13329c<T> cVar) {
        this.f35229b = C13307g.m38940a(t);
        this.f35231d = (C13329c) C13307g.m38940a(cVar);
        m38986a((Object) t);
    }
}
