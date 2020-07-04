package android.arch.p005a.p007b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: android.arch.a.b.b */
public class C0009b<K, V> implements Iterable<Entry<K, V>> {

    /* renamed from: a */
    public C0013c<K, V> f14a;

    /* renamed from: b */
    public C0013c<K, V> f15b;

    /* renamed from: c */
    public int f16c = 0;

    /* renamed from: d */
    private WeakHashMap<C0016f<K, V>, Boolean> f17d = new WeakHashMap<>();

    /* renamed from: android.arch.a.b.b$a */
    static class C0011a<K, V> extends C0015e<K, V> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C0013c<K, V> mo32a(C0013c<K, V> cVar) {
            return cVar.f20c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C0013c<K, V> mo33b(C0013c<K, V> cVar) {
            return cVar.f21d;
        }

        C0011a(C0013c<K, V> cVar, C0013c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* renamed from: android.arch.a.b.b$b */
    static class C0012b<K, V> extends C0015e<K, V> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C0013c<K, V> mo32a(C0013c<K, V> cVar) {
            return cVar.f21d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C0013c<K, V> mo33b(C0013c<K, V> cVar) {
            return cVar.f20c;
        }

        C0012b(C0013c<K, V> cVar, C0013c<K, V> cVar2) {
            super(cVar, cVar2);
        }
    }

    /* renamed from: android.arch.a.b.b$c */
    static class C0013c<K, V> implements Entry<K, V> {

        /* renamed from: a */
        final K f18a;

        /* renamed from: b */
        final V f19b;

        /* renamed from: c */
        C0013c<K, V> f20c;

        /* renamed from: d */
        C0013c<K, V> f21d;

        public final K getKey() {
            return this.f18a;
        }

        public final V getValue() {
            return this.f19b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f18a);
            sb.append("=");
            sb.append(this.f19b);
            return sb.toString();
        }

        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0013c)) {
                return false;
            }
            C0013c cVar = (C0013c) obj;
            if (!this.f18a.equals(cVar.f18a) || !this.f19b.equals(cVar.f19b)) {
                return false;
            }
            return true;
        }

        C0013c(K k, V v) {
            this.f18a = k;
            this.f19b = v;
        }
    }

    /* renamed from: android.arch.a.b.b$d */
    public class C0014d implements C0016f<K, V>, Iterator<Entry<K, V>> {

        /* renamed from: b */
        private C0013c<K, V> f23b;

        /* renamed from: c */
        private boolean f24c;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Entry<K, V> next() {
            C0013c<K, V> cVar;
            if (this.f24c) {
                this.f24c = false;
                cVar = C0009b.this.f14a;
            } else if (this.f23b != null) {
                cVar = this.f23b.f20c;
            } else {
                cVar = null;
            }
            this.f23b = cVar;
            return this.f23b;
        }

        public final boolean hasNext() {
            if (this.f24c) {
                if (C0009b.this.f14a != null) {
                    return true;
                }
                return false;
            } else if (this.f23b == null || this.f23b.f20c == null) {
                return false;
            } else {
                return true;
            }
        }

        private C0014d() {
            this.f24c = true;
        }

        /* renamed from: a_ */
        public final void mo39a_(C0013c<K, V> cVar) {
            boolean z;
            if (cVar == this.f23b) {
                this.f23b = this.f23b.f21d;
                if (this.f23b == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f24c = z;
            }
        }
    }

    /* renamed from: android.arch.a.b.b$e */
    static abstract class C0015e<K, V> implements C0016f<K, V>, Iterator<Entry<K, V>> {

        /* renamed from: a */
        C0013c<K, V> f25a;

        /* renamed from: b */
        C0013c<K, V> f26b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C0013c<K, V> mo32a(C0013c<K, V> cVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C0013c<K, V> mo33b(C0013c<K, V> cVar);

        public boolean hasNext() {
            if (this.f26b != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Entry<K, V> next() {
            C0013c<K, V> cVar = this.f26b;
            this.f26b = m35a();
            return cVar;
        }

        /* renamed from: a */
        private C0013c<K, V> m35a() {
            if (this.f26b == this.f25a || this.f25a == null) {
                return null;
            }
            return mo32a(this.f26b);
        }

        /* renamed from: a_ */
        public final void mo39a_(C0013c<K, V> cVar) {
            if (this.f25a == cVar && cVar == this.f26b) {
                this.f26b = null;
                this.f25a = null;
            }
            if (this.f25a == cVar) {
                this.f25a = mo33b(this.f25a);
            }
            if (this.f26b == cVar) {
                this.f26b = m35a();
            }
        }

        C0015e(C0013c<K, V> cVar, C0013c<K, V> cVar2) {
            this.f25a = cVar2;
            this.f26b = cVar;
        }
    }

    /* renamed from: android.arch.a.b.b$f */
    interface C0016f<K, V> {
        /* renamed from: a_ */
        void mo39a_(C0013c<K, V> cVar);
    }

    /* renamed from: b */
    public final C0014d mo28b() {
        C0014d dVar = new C0014d<>();
        this.f17d.put(dVar, Boolean.valueOf(false));
        return dVar;
    }

    public Iterator<Entry<K, V>> iterator() {
        C0011a aVar = new C0011a(this.f14a, this.f15b);
        this.f17d.put(aVar, Boolean.valueOf(false));
        return aVar;
    }

    /* renamed from: a */
    public final Iterator<Entry<K, V>> mo26a() {
        C0012b bVar = new C0012b(this.f15b, this.f14a);
        this.f17d.put(bVar, Boolean.valueOf(false));
        return bVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0013c<K, V> mo21a(K k) {
        C0013c<K, V> cVar = this.f14a;
        while (cVar != null && !cVar.f18a.equals(k)) {
            cVar = cVar.f20c;
        }
        return cVar;
    }

    /* renamed from: b */
    public V mo23b(K k) {
        C0013c a = mo21a(k);
        if (a == null) {
            return null;
        }
        this.f16c--;
        if (!this.f17d.isEmpty()) {
            for (C0016f a_ : this.f17d.keySet()) {
                a_.mo39a_(a);
            }
        }
        if (a.f21d != null) {
            a.f21d.f20c = a.f20c;
        } else {
            this.f14a = a.f20c;
        }
        if (a.f20c != null) {
            a.f20c.f21d = a.f21d;
        } else {
            this.f15b = a.f21d;
        }
        a.f20c = null;
        a.f21d = null;
        return a.f19b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0009b)) {
            return false;
        }
        C0009b bVar = (C0009b) obj;
        if (this.f16c != bVar.f16c) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public V mo22a(K k, V v) {
        C0013c a = mo21a(k);
        if (a != null) {
            return a.f19b;
        }
        mo27b(k, v);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C0013c<K, V> mo27b(K k, V v) {
        C0013c<K, V> cVar = new C0013c<>(k, v);
        this.f16c++;
        if (this.f15b == null) {
            this.f14a = cVar;
            this.f15b = this.f14a;
            return cVar;
        }
        this.f15b.f20c = cVar;
        cVar.f21d = this.f15b;
        this.f15b = cVar;
        return cVar;
    }
}
