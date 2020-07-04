package com.google.common.collect;

import com.google.common.base.C17427g;
import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.common.base.C17441o;
import com.google.common.base.C17457s;
import com.google.common.collect.C17986do.C17987a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.common.collect.dn */
class C17964dn<R, C, V> extends C18045q<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final Map<R, Map<C, V>> backingMap;
    private transient Set<C> columnKeySet;
    private transient C17975e columnMap;
    final C17457s<? extends Map<C, V>> factory;
    private transient Map<R, Map<C, V>> rowMap;

    /* renamed from: com.google.common.collect.dn$a */
    class C17966a implements Iterator<C17987a<R, C, V>> {

        /* renamed from: a */
        final Iterator<Entry<R, Map<C, V>>> f49256a;

        /* renamed from: b */
        Entry<R, Map<C, V>> f49257b;

        /* renamed from: c */
        Iterator<Entry<C, V>> f49258c;

        public final boolean hasNext() {
            if (this.f49256a.hasNext() || this.f49258c.hasNext()) {
                return true;
            }
            return false;
        }

        public final void remove() {
            this.f49258c.remove();
            if (((Map) this.f49257b.getValue()).isEmpty()) {
                this.f49256a.remove();
                this.f49257b = null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C17987a<R, C, V> next() {
            if (!this.f49258c.hasNext()) {
                this.f49257b = (Entry) this.f49256a.next();
                this.f49258c = ((Map) this.f49257b.getValue()).entrySet().iterator();
            }
            Entry entry = (Entry) this.f49258c.next();
            return C17988dp.m59629a(this.f49257b.getKey(), entry.getKey(), entry.getValue());
        }

        private C17966a() {
            this.f49256a = C17964dn.this.backingMap.entrySet().iterator();
            this.f49258c = C17782br.m59121b();
        }
    }

    /* renamed from: com.google.common.collect.dn$b */
    class C17967b extends C17861k<R, V> {

        /* renamed from: a */
        final C f49260a;

        /* renamed from: com.google.common.collect.dn$b$a */
        class C17968a extends C17936c<Entry<R, V>> {
            public final void clear() {
                C17967b.this.mo46344a(C17441o.m57988a());
            }

            public final Iterator<Entry<R, V>> iterator() {
                return new C17969b();
            }

            public final boolean isEmpty() {
                if (!C17964dn.this.containsColumn(C17967b.this.f49260a)) {
                    return true;
                }
                return false;
            }

            public final int size() {
                int i = 0;
                for (Map containsKey : C17964dn.this.backingMap.values()) {
                    if (containsKey.containsKey(C17967b.this.f49260a)) {
                        i++;
                    }
                }
                return i;
            }

            private C17968a() {
            }

            public final boolean retainAll(Collection<?> collection) {
                return C17967b.this.mo46344a(C17441o.m57989a(C17441o.m57993a(collection)));
            }

            public final boolean contains(Object obj) {
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                return C17964dn.this.containsMapping(entry.getKey(), C17967b.this.f49260a, entry.getValue());
            }

            public final boolean remove(Object obj) {
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                return C17964dn.this.removeMapping(entry.getKey(), C17967b.this.f49260a, entry.getValue());
            }
        }

        /* renamed from: com.google.common.collect.dn$b$b */
        class C17969b extends C17870c<Entry<R, V>> {

            /* renamed from: a */
            final Iterator<Entry<R, Map<C, V>>> f49263a;

            /* renamed from: com.google.common.collect.dn$b$b$a */
            class C17970a extends C18027g<R, V> {

                /* renamed from: a */
                final /* synthetic */ Entry f49265a;

                public final R getKey() {
                    return this.f49265a.getKey();
                }

                public final V getValue() {
                    return ((Map) this.f49265a.getValue()).get(C17967b.this.f49260a);
                }

                public final V setValue(V v) {
                    return ((Map) this.f49265a.getValue()).put(C17967b.this.f49260a, C17439m.m57962a(v));
                }

                C17970a(Entry entry) {
                    this.f49265a = entry;
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public Entry<R, V> mo45252a() {
                while (this.f49263a.hasNext()) {
                    Entry entry = (Entry) this.f49263a.next();
                    if (((Map) entry.getValue()).containsKey(C17967b.this.f49260a)) {
                        return new C17970a(entry);
                    }
                }
                mo46191b();
                return null;
            }

            private C17969b() {
                this.f49263a = C17964dn.this.backingMap.entrySet().iterator();
            }
        }

        /* renamed from: com.google.common.collect.dn$b$c */
        class C17971c extends C17856f<R, V> {
            C17971c() {
                super(C17967b.this);
            }

            public final boolean contains(Object obj) {
                return C17964dn.this.contains(obj, C17967b.this.f49260a);
            }

            public final boolean remove(Object obj) {
                if (C17964dn.this.remove(obj, C17967b.this.f49260a) != null) {
                    return true;
                }
                return false;
            }

            public final boolean retainAll(Collection<?> collection) {
                return C17967b.this.mo46344a(C17839bx.m59327a(C17441o.m57989a(C17441o.m57993a(collection))));
            }
        }

        /* renamed from: com.google.common.collect.dn$b$d */
        class C17972d extends C17860j<R, V> {
            C17972d() {
                super(C17967b.this);
            }

            public final boolean removeAll(Collection<?> collection) {
                return C17967b.this.mo46344a(C17839bx.m59344b(C17441o.m57993a(collection)));
            }

            public final boolean remove(Object obj) {
                if (obj == null || !C17967b.this.mo46344a(C17839bx.m59344b(C17441o.m57992a(obj)))) {
                    return false;
                }
                return true;
            }

            public final boolean retainAll(Collection<?> collection) {
                return C17967b.this.mo46344a(C17839bx.m59344b(C17441o.m57989a(C17441o.m57993a(collection))));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: Q_ */
        public final Collection<V> mo45861Q_() {
            return new C17972d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Set<Entry<R, V>> mo45863a() {
            return new C17968a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final Set<R> mo45866e() {
            return new C17971c();
        }

        public final boolean containsKey(Object obj) {
            return C17964dn.this.contains(obj, this.f49260a);
        }

        public final V get(Object obj) {
            return C17964dn.this.get(obj, this.f49260a);
        }

        public final V remove(Object obj) {
            return C17964dn.this.remove(obj, this.f49260a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo46344a(C17440n<? super Entry<R, V>> nVar) {
            Iterator it = C17964dn.this.backingMap.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                Map map = (Map) entry.getValue();
                Object obj = map.get(this.f49260a);
                if (obj != null && nVar.apply(C17839bx.m59337a(entry.getKey(), obj))) {
                    map.remove(this.f49260a);
                    z = true;
                    if (map.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        C17967b(C c) {
            this.f49260a = C17439m.m57962a(c);
        }

        public final V put(R r, V v) {
            return C17964dn.this.put(r, this.f49260a, v);
        }
    }

    /* renamed from: com.google.common.collect.dn$c */
    class C17973c extends C17870c<C> {

        /* renamed from: a */
        final Map<C, V> f49269a;

        /* renamed from: b */
        final Iterator<Map<C, V>> f49270b;

        /* renamed from: c */
        Iterator<Entry<C, V>> f49271c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C mo45252a() {
            while (true) {
                if (this.f49271c.hasNext()) {
                    Entry entry = (Entry) this.f49271c.next();
                    if (!this.f49269a.containsKey(entry.getKey())) {
                        this.f49269a.put(entry.getKey(), entry.getValue());
                        return entry.getKey();
                    }
                } else if (!this.f49270b.hasNext()) {
                    return mo46191b();
                } else {
                    this.f49271c = ((Map) this.f49270b.next()).entrySet().iterator();
                }
            }
        }

        private C17973c() {
            this.f49269a = (Map) C17964dn.this.factory.mo44946a();
            this.f49270b = C17964dn.this.backingMap.values().iterator();
            this.f49271c = C17782br.m59108a();
        }
    }

    /* renamed from: com.google.common.collect.dn$d */
    class C17974d extends C17985h<C> {
        public final Iterator<C> iterator() {
            return C17964dn.this.createColumnKeyIterator();
        }

        public final int size() {
            return C17782br.m59118b(iterator());
        }

        private C17974d() {
            super();
        }

        public final boolean contains(Object obj) {
            return C17964dn.this.containsColumn(obj);
        }

        public final boolean remove(Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator it = C17964dn.this.backingMap.values().iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (map.keySet().remove(obj)) {
                    z = true;
                    if (map.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public final boolean removeAll(Collection<?> collection) {
            C17439m.m57962a(collection);
            Iterator it = C17964dn.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (C17782br.m59116a(map.keySet().iterator(), collection)) {
                    z = true;
                    if (map.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            C17439m.m57962a(collection);
            Iterator it = C17964dn.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (map.keySet().retainAll(collection)) {
                    z = true;
                    if (map.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }
    }

    /* renamed from: com.google.common.collect.dn$e */
    class C17975e extends C17861k<C, Map<R, V>> {

        /* renamed from: com.google.common.collect.dn$e$a */
        class C17976a extends C17985h<Entry<C, Map<R, V>>> {
            public final int size() {
                return C17964dn.this.columnKeySet().size();
            }

            public final Iterator<Entry<C, Map<R, V>>> iterator() {
                return C17839bx.m59335a(C17964dn.this.columnKeySet(), (C17427g<? super K, V>) new C17427g<C, Map<R, V>>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Map<R, V> mo44914b(C c) {
                        return C17964dn.this.column(c);
                    }
                });
            }

            C17976a() {
                super();
            }

            public final boolean removeAll(Collection<?> collection) {
                C17439m.m57962a(collection);
                return C17933db.m59573a((Set<?>) this, collection.iterator());
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C17964dn.this.removeColumn(((Entry) obj).getKey());
                return true;
            }

            public final boolean contains(Object obj) {
                if (obj instanceof Entry) {
                    Entry entry = (Entry) obj;
                    if (C17964dn.this.containsColumn(entry.getKey())) {
                        return C17975e.this.get(entry.getKey()).equals(entry.getValue());
                    }
                }
                return false;
            }

            public final boolean retainAll(Collection<?> collection) {
                C17439m.m57962a(collection);
                Iterator it = C17795bu.m59145a(C17964dn.this.columnKeySet().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(C17839bx.m59337a(next, C17964dn.this.column(next)))) {
                        C17964dn.this.removeColumn(next);
                        z = true;
                    }
                }
                return z;
            }
        }

        /* renamed from: com.google.common.collect.dn$e$b */
        class C17978b extends C17860j<C, Map<R, V>> {
            C17978b() {
                super(C17975e.this);
            }

            public final boolean remove(Object obj) {
                for (Entry entry : C17975e.this.entrySet()) {
                    if (((Map) entry.getValue()).equals(obj)) {
                        C17964dn.this.removeColumn(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            public final boolean removeAll(Collection<?> collection) {
                C17439m.m57962a(collection);
                Iterator it = C17795bu.m59145a(C17964dn.this.columnKeySet().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (collection.contains(C17964dn.this.column(next))) {
                        C17964dn.this.removeColumn(next);
                        z = true;
                    }
                }
                return z;
            }

            public final boolean retainAll(Collection<?> collection) {
                C17439m.m57962a(collection);
                Iterator it = C17795bu.m59145a(C17964dn.this.columnKeySet().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(C17964dn.this.column(next))) {
                        C17964dn.this.removeColumn(next);
                        z = true;
                    }
                }
                return z;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: Q_ */
        public final Collection<Map<R, V>> mo45861Q_() {
            return new C17978b();
        }

        /* renamed from: a */
        public final Set<Entry<C, Map<R, V>>> mo45863a() {
            return new C17976a();
        }

        public final Set<C> keySet() {
            return C17964dn.this.columnKeySet();
        }

        private C17975e() {
        }

        public final boolean containsKey(Object obj) {
            return C17964dn.this.containsColumn(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Map<R, V> remove(Object obj) {
            if (C17964dn.this.containsColumn(obj)) {
                return C17964dn.this.removeColumn(obj);
            }
            return null;
        }

        /* renamed from: a */
        public final Map<R, V> get(Object obj) {
            if (C17964dn.this.containsColumn(obj)) {
                return C17964dn.this.column(obj);
            }
            return null;
        }
    }

    /* renamed from: com.google.common.collect.dn$f */
    class C17979f extends C17854e<C, V> {

        /* renamed from: a */
        final R f49278a;

        /* renamed from: b */
        Map<C, V> f49279b;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Map<C, V> mo45722c() {
            return (Map) C17964dn.this.backingMap.get(this.f49278a);
        }

        public void clear() {
            Map a = mo45721a();
            if (a != null) {
                a.clear();
            }
            mo45725d();
        }

        public int size() {
            Map a = mo45721a();
            if (a == null) {
                return 0;
            }
            return a.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Iterator<Entry<C, V>> mo45214b() {
            Map a = mo45721a();
            if (a == null) {
                return C17782br.m59121b();
            }
            final Iterator it = a.entrySet().iterator();
            return new Iterator<Entry<C, V>>() {
                public final boolean hasNext() {
                    return it.hasNext();
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Entry<C, V> next() {
                    return C17979f.this.mo46367a((Entry) it.next());
                }

                public final void remove() {
                    it.remove();
                    C17979f.this.mo45725d();
                }
            };
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo45725d() {
            if (mo45721a() != null && this.f49279b.isEmpty()) {
                C17964dn.this.backingMap.remove(this.f49278a);
                this.f49279b = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Map<C, V> mo45721a() {
            if (this.f49279b != null && (!this.f49279b.isEmpty() || !C17964dn.this.backingMap.containsKey(this.f49278a))) {
                return this.f49279b;
            }
            Map<C, V> c = mo45722c();
            this.f49279b = c;
            return c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Entry<C, V> mo46367a(final Entry<C, V> entry) {
            return new C17751ax<C, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Entry<C, V> delegate() {
                    return entry;
                }

                public final boolean equals(Object obj) {
                    return mo45929a(obj);
                }

                public final V setValue(V v) {
                    return super.setValue(C17439m.m57962a(v));
                }
            };
        }

        public V get(Object obj) {
            Map a = mo45721a();
            if (obj == null || a == null) {
                return null;
            }
            return C17839bx.m59331a(a, obj);
        }

        public V remove(Object obj) {
            Map a = mo45721a();
            if (a == null) {
                return null;
            }
            V c = C17839bx.m59348c(a, obj);
            mo45725d();
            return c;
        }

        public boolean containsKey(Object obj) {
            Map a = mo45721a();
            if (obj == null || a == null || !C17839bx.m59347b(a, obj)) {
                return false;
            }
            return true;
        }

        C17979f(R r) {
            this.f49278a = C17439m.m57962a(r);
        }

        public V put(C c, V v) {
            C17439m.m57962a(c);
            C17439m.m57962a(v);
            if (this.f49279b == null || this.f49279b.isEmpty()) {
                return C17964dn.this.put(this.f49278a, c, v);
            }
            return this.f49279b.put(c, v);
        }
    }

    /* renamed from: com.google.common.collect.dn$g */
    class C17982g extends C17861k<R, Map<C, V>> {

        /* renamed from: com.google.common.collect.dn$g$a */
        class C17983a extends C17985h<Entry<R, Map<C, V>>> {
            public final int size() {
                return C17964dn.this.backingMap.size();
            }

            public final Iterator<Entry<R, Map<C, V>>> iterator() {
                return C17839bx.m59335a(C17964dn.this.backingMap.keySet(), (C17427g<? super K, V>) new C17427g<R, Map<C, V>>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Map<C, V> mo44914b(R r) {
                        return C17964dn.this.row(r);
                    }
                });
            }

            C17983a() {
                super();
            }

            public final boolean contains(Object obj) {
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !C18054w.m59710a((Collection<?>) C17964dn.this.backingMap.entrySet(), (Object) entry)) {
                    return false;
                }
                return true;
            }

            public final boolean remove(Object obj) {
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !C17964dn.this.backingMap.entrySet().remove(entry)) {
                    return false;
                }
                return true;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Set<Entry<R, Map<C, V>>> mo45863a() {
            return new C17983a();
        }

        C17982g() {
        }

        public boolean containsKey(Object obj) {
            return C17964dn.this.containsRow(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Map<C, V> remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return (Map) C17964dn.this.backingMap.remove(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Map<C, V> get(Object obj) {
            if (C17964dn.this.containsRow(obj)) {
                return C17964dn.this.row(obj);
            }
            return null;
        }
    }

    /* renamed from: com.google.common.collect.dn$h */
    abstract class C17985h<T> extends C17936c<T> {
        public void clear() {
            C17964dn.this.backingMap.clear();
        }

        public boolean isEmpty() {
            return C17964dn.this.backingMap.isEmpty();
        }

        private C17985h() {
        }
    }

    /* access modifiers changed from: 0000 */
    public Iterator<C17987a<R, C, V>> cellIterator() {
        return new C17966a();
    }

    public Set<C17987a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    public void clear() {
        this.backingMap.clear();
    }

    /* access modifiers changed from: 0000 */
    public Iterator<C> createColumnKeyIterator() {
        return new C17973c();
    }

    /* access modifiers changed from: 0000 */
    public Map<R, Map<C, V>> createRowMap() {
        return new C17982g();
    }

    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    public Collection<V> values() {
        return super.values();
    }

    public Set<C> columnKeySet() {
        Set<C> set = this.columnKeySet;
        if (set != null) {
            return set;
        }
        C17974d dVar = new C17974d();
        this.columnKeySet = dVar;
        return dVar;
    }

    public Map<C, Map<R, V>> columnMap() {
        C17975e eVar = this.columnMap;
        if (eVar != null) {
            return eVar;
        }
        C17975e eVar2 = new C17975e<>();
        this.columnMap = eVar2;
        return eVar2;
    }

    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    public Map<R, Map<C, V>> rowMap() {
        Map<R, Map<C, V>> map = this.rowMap;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> createRowMap = createRowMap();
        this.rowMap = createRowMap;
        return createRowMap;
    }

    public int size() {
        int i = 0;
        for (Map size : this.backingMap.values()) {
            i += size.size();
        }
        return i;
    }

    public Map<R, V> column(C c) {
        return new C17967b(c);
    }

    public Map<C, V> row(R r) {
        return new C17979f(r);
    }

    public boolean containsRow(Object obj) {
        if (obj == null || !C17839bx.m59347b(this.backingMap, obj)) {
            return false;
        }
        return true;
    }

    public boolean containsValue(Object obj) {
        if (obj == null || !super.containsValue(obj)) {
            return false;
        }
        return true;
    }

    private Map<C, V> getOrCreate(R r) {
        Map<C, V> map = (Map) this.backingMap.get(r);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = (Map) this.factory.mo44946a();
        this.backingMap.put(r, map2);
        return map2;
    }

    public boolean containsColumn(Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map b : this.backingMap.values()) {
            if (C17839bx.m59347b(b, obj)) {
                return true;
            }
        }
        return false;
    }

    public Map<R, V> removeColumn(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.backingMap.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            Object remove = ((Map) entry.getValue()).remove(obj);
            if (remove != null) {
                linkedHashMap.put(entry.getKey(), remove);
                if (((Map) entry.getValue()).isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    C17964dn(Map<R, Map<C, V>> map, C17457s<? extends Map<C, V>> sVar) {
        this.backingMap = map;
        this.factory = sVar;
    }

    public boolean contains(Object obj, Object obj2) {
        if (obj == null || obj2 == null || !super.contains(obj, obj2)) {
            return false;
        }
        return true;
    }

    public V get(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return super.get(obj, obj2);
    }

    public V remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        Map map = (Map) C17839bx.m59331a(this.backingMap, obj);
        if (map == null) {
            return null;
        }
        V remove = map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return remove;
    }

    public boolean containsMapping(Object obj, Object obj2, Object obj3) {
        if (obj3 == null || !obj3.equals(get(obj, obj2))) {
            return false;
        }
        return true;
    }

    public boolean removeMapping(Object obj, Object obj2, Object obj3) {
        if (!containsMapping(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    public V put(R r, C c, V v) {
        C17439m.m57962a(r);
        C17439m.m57962a(c);
        C17439m.m57962a(v);
        return getOrCreate(r).put(c, v);
    }
}
