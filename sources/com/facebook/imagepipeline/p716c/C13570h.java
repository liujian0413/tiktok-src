package com.facebook.imagepipeline.p716c;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13308h;
import com.facebook.common.internal.C13310j;
import com.facebook.common.memory.C13317b;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.references.C13326a;
import com.facebook.common.references.C13329c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.imagepipeline.c.h */
public class C13570h<K, V> implements C13317b, C13585p<K, V> {

    /* renamed from: a */
    static final long f35966a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    final C13569g<K, C13574b<K, V>> f35967b;

    /* renamed from: c */
    final C13569g<K, C13574b<K, V>> f35968c;

    /* renamed from: d */
    final Map<Bitmap, Object> f35969d = new WeakHashMap();

    /* renamed from: e */
    protected C13586q f35970e;

    /* renamed from: f */
    private final C13592v<V> f35971f;

    /* renamed from: g */
    private final C13573a f35972g;

    /* renamed from: h */
    private final C13310j<C13586q> f35973h;

    /* renamed from: i */
    private long f35974i;

    /* renamed from: com.facebook.imagepipeline.c.h$a */
    public interface C13573a {
        /* renamed from: a */
        double mo33099a(MemoryTrimType memoryTrimType);
    }

    /* renamed from: com.facebook.imagepipeline.c.h$b */
    static class C13574b<K, V> {

        /* renamed from: a */
        public final K f35979a;

        /* renamed from: b */
        public final C13326a<V> f35980b;

        /* renamed from: c */
        public int f35981c = 0;

        /* renamed from: d */
        public boolean f35982d = false;

        /* renamed from: e */
        public final C13575c<K> f35983e;

        /* renamed from: a */
        static <K, V> C13574b<K, V> m39960a(K k, C13326a<V> aVar, C13575c<K> cVar) {
            return new C13574b<>(k, aVar, cVar);
        }

        private C13574b(K k, C13326a<V> aVar, C13575c<K> cVar) {
            this.f35979a = C13307g.m38940a(k);
            this.f35980b = (C13326a) C13307g.m38940a(C13326a.m39000b(aVar));
            this.f35983e = cVar;
        }
    }

    /* renamed from: com.facebook.imagepipeline.c.h$c */
    public interface C13575c<K> {
        /* renamed from: a */
        void mo33076a(K k, boolean z);
    }

    /* renamed from: a */
    public final void mo33132a(C13574b<K, V> bVar) {
        boolean c;
        C13326a i;
        C13307g.m38940a(bVar);
        synchronized (this) {
            m39943h(bVar);
            c = m39935c(bVar);
            i = m39944i(bVar);
        }
        C13326a.m39001c(i);
        if (!c) {
            bVar = null;
        }
        m39940e(bVar);
        m39931b();
        m39933c();
    }

    /* renamed from: d */
    private synchronized int m39936d() {
        return this.f35968c.mo33117a() - this.f35967b.mo33117a();
    }

    /* renamed from: e */
    private synchronized int m39939e() {
        return this.f35968c.mo33121b() - this.f35967b.mo33121b();
    }

    /* renamed from: b */
    private synchronized void m39931b() {
        if (this.f35974i + f35966a <= SystemClock.uptimeMillis()) {
            this.f35974i = SystemClock.uptimeMillis();
            this.f35970e = (C13586q) this.f35973h.mo29879b();
        }
    }

    /* renamed from: c */
    private void m39933c() {
        ArrayList a;
        synchronized (this) {
            a = m39928a(Math.min(this.f35970e.f35992d, this.f35970e.f35990b - m39936d()), Math.min(this.f35970e.f35991c, this.f35970e.f35989a - m39939e()));
            m39934c(a);
        }
        m39929a(a);
        m39932b(a);
    }

    /* renamed from: a */
    public final void mo33131a() {
        ArrayList d;
        ArrayList d2;
        synchronized (this) {
            d = this.f35967b.mo33126d();
            d2 = this.f35968c.mo33126d();
            m39934c(d2);
        }
        m39929a(d2);
        m39932b(d);
        m39931b();
    }

    /* renamed from: a */
    private C13592v<C13574b<K, V>> m39927a(final C13592v<V> vVar) {
        return new C13592v<C13574b<K, V>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public int mo29877a(C13574b<K, V> bVar) {
                return vVar.mo29877a(bVar.f35980b.mo32609a());
            }
        };
    }

    /* renamed from: d */
    private static <K, V> void m39937d(C13574b<K, V> bVar) {
        if (bVar != null && bVar.f35983e != null) {
            bVar.f35983e.mo33076a(bVar.f35979a, false);
        }
    }

    /* renamed from: e */
    private static <K, V> void m39940e(C13574b<K, V> bVar) {
        if (bVar != null && bVar.f35983e != null) {
            bVar.f35983e.mo33076a(bVar.f35979a, true);
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo33136c(K k) {
        return this.f35968c.mo33120a(k);
    }

    /* renamed from: a */
    private void m39929a(ArrayList<C13574b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C13326a.m39001c(m39944i((C13574b) it.next()));
            }
        }
    }

    /* renamed from: b */
    private synchronized C13326a<V> m39930b(final C13574b<K, V> bVar) {
        m39942g(bVar);
        return C13326a.m38996a(bVar.f35980b.mo32609a(), new C13329c<V>() {
            /* renamed from: a */
            public final void mo32582a(V v) {
                C13570h.this.mo33132a(bVar);
            }
        });
    }

    /* renamed from: c */
    private synchronized void m39934c(ArrayList<C13574b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m39941f((C13574b) it.next());
            }
        }
    }

    /* renamed from: f */
    private synchronized void m39941f(C13574b<K, V> bVar) {
        C13307g.m38940a(bVar);
        C13307g.m38947b(!bVar.f35982d);
        bVar.f35982d = true;
    }

    /* renamed from: g */
    private synchronized void m39942g(C13574b<K, V> bVar) {
        C13307g.m38940a(bVar);
        C13307g.m38947b(!bVar.f35982d);
        bVar.f35981c++;
    }

    /* renamed from: h */
    private synchronized void m39943h(C13574b<K, V> bVar) {
        boolean z;
        C13307g.m38940a(bVar);
        if (bVar.f35981c > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38947b(z);
        bVar.f35981c--;
    }

    /* renamed from: i */
    private synchronized C13326a<V> m39944i(C13574b<K, V> bVar) {
        C13307g.m38940a(bVar);
        if (!bVar.f35982d || bVar.f35981c != 0) {
            return null;
        }
        return bVar.f35980b;
    }

    /* renamed from: d */
    private synchronized boolean m39938d(V v) {
        int a = this.f35971f.mo29877a(v);
        if (a > this.f35970e.f35993e || m39936d() > this.f35970e.f35990b - 1 || m39939e() > this.f35970e.f35989a - a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo33127a(C13308h<K> hVar) {
        ArrayList b;
        ArrayList b2;
        synchronized (this) {
            b = this.f35967b.mo33123b(hVar);
            b2 = this.f35968c.mo33123b(hVar);
            m39934c(b2);
        }
        m39929a(b2);
        m39932b(b);
        m39931b();
        m39933c();
        return b2.size();
    }

    /* renamed from: b */
    private static void m39932b(ArrayList<C13574b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m39937d((C13574b) it.next());
            }
        }
    }

    /* renamed from: c */
    private synchronized boolean m39935c(C13574b<K, V> bVar) {
        if (bVar.f35982d || bVar.f35981c != 0) {
            return false;
        }
        this.f35967b.mo33118a(bVar.f35979a, bVar);
        return true;
    }

    /* renamed from: a */
    public final C13326a<V> mo33128a(K k) {
        C13574b bVar;
        C13326a<V> aVar;
        C13307g.m38940a(k);
        synchronized (this) {
            bVar = (C13574b) this.f35967b.mo33125c(k);
            C13574b bVar2 = (C13574b) this.f35968c.mo33122b(k);
            if (bVar2 != null) {
                aVar = m39930b(bVar2);
            } else {
                aVar = null;
            }
        }
        m39937d(bVar);
        m39931b();
        m39933c();
        return aVar;
    }

    /* renamed from: b */
    public final int mo33133b(C13308h<K> hVar) {
        ArrayList b;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            b = this.f35967b.mo33123b(hVar);
            for (int i = 0; i < b.size(); i++) {
                arrayList.add(this.f35968c.mo33125c(((C13574b) b.get(i)).f35979a));
            }
        }
        m39929a(arrayList);
        m39932b(b);
        m39931b();
        m39933c();
        return arrayList.size();
    }

    /* renamed from: c */
    public final synchronized boolean mo33135c(C13308h<K> hVar) {
        boolean z;
        if (!this.f35968c.mo33119a(hVar).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final C13326a<V> mo33134b(K k) {
        C13574b bVar;
        boolean z;
        C13326a<V> aVar;
        C13307g.m38940a(k);
        synchronized (this) {
            bVar = (C13574b) this.f35967b.mo33125c(k);
            z = true;
            boolean z2 = false;
            if (bVar != null) {
                C13574b bVar2 = (C13574b) this.f35968c.mo33125c(k);
                C13307g.m38940a(bVar2);
                if (bVar2.f35981c == 0) {
                    z2 = true;
                }
                C13307g.m38947b(z2);
                aVar = bVar2.f35980b;
            } else {
                aVar = null;
                z = false;
            }
        }
        if (z) {
            m39937d(bVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo32580a(MemoryTrimType memoryTrimType) {
        ArrayList a;
        double a2 = this.f35972g.mo33099a(memoryTrimType);
        synchronized (this) {
            double b = (double) this.f35968c.mo33121b();
            double d = 1.0d - a2;
            Double.isNaN(b);
            a = m39928a(Integer.MAX_VALUE, Math.max(0, ((int) (b * d)) - m39939e()));
            m39934c(a);
        }
        m39929a(a);
        m39932b(a);
        m39931b();
        m39933c();
    }

    /* renamed from: a */
    public final C13326a<V> mo33129a(K k, C13326a<V> aVar) {
        return mo33130a(k, aVar, null);
    }

    /* renamed from: a */
    private synchronized ArrayList<C13574b<K, V>> m39928a(int i, int i2) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.f35967b.mo33117a() <= max && this.f35967b.mo33121b() <= max2) {
            return null;
        }
        ArrayList<C13574b<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f35967b.mo33117a() <= max && this.f35967b.mo33121b() <= max2) {
                return arrayList;
            }
            Object c = this.f35967b.mo33124c();
            this.f35967b.mo33125c(c);
            arrayList.add(this.f35968c.mo33125c(c));
        }
    }

    public C13570h(C13592v<V> vVar, C13573a aVar, C13310j<C13586q> jVar) {
        this.f35971f = vVar;
        this.f35967b = new C13569g<>(m39927a(vVar));
        this.f35968c = new C13569g<>(m39927a(vVar));
        this.f35972g = aVar;
        this.f35973h = jVar;
        this.f35970e = (C13586q) this.f35973h.mo29879b();
        this.f35974i = SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public final C13326a<V> mo33130a(K k, C13326a<V> aVar, C13575c<K> cVar) {
        C13574b bVar;
        C13326a<V> aVar2;
        C13326a aVar3;
        C13307g.m38940a(k);
        C13307g.m38940a(aVar);
        m39931b();
        synchronized (this) {
            bVar = (C13574b) this.f35967b.mo33125c(k);
            C13574b bVar2 = (C13574b) this.f35968c.mo33125c(k);
            aVar2 = null;
            if (bVar2 != null) {
                m39941f(bVar2);
                aVar3 = m39944i(bVar2);
            } else {
                aVar3 = null;
            }
            if (m39938d((V) aVar.mo32609a())) {
                C13574b a = C13574b.m39960a(k, aVar, cVar);
                this.f35968c.mo33118a(k, a);
                aVar2 = m39930b(a);
            }
        }
        C13326a.m39001c(aVar3);
        m39937d(bVar);
        m39933c();
        return aVar2;
    }
}
