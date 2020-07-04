package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.e$i.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.e */
abstract class C18002e<K, V> extends C18028h<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map<K, Collection<V>> map;
    public transient int totalSize;

    /* renamed from: com.google.common.collect.e$a */
    class C18005a extends C17861k<K, Collection<V>> {

        /* renamed from: a */
        final transient Map<K, Collection<V>> f49302a;

        /* renamed from: com.google.common.collect.e$a$a */
        class C18006a extends C17852c<K, Collection<V>> {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Map<K, Collection<V>> mo45869a() {
                return C18005a.this;
            }

            public final Iterator<Entry<K, Collection<V>>> iterator() {
                return new C18007b();
            }

            C18006a() {
            }

            public final boolean contains(Object obj) {
                return C18054w.m59710a((Collection<?>) C18005a.this.f49302a.entrySet(), obj);
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C18002e.this.removeValuesForKey(((Entry) obj).getKey());
                return true;
            }
        }

        /* renamed from: com.google.common.collect.e$a$b */
        class C18007b implements Iterator<Entry<K, Collection<V>>> {

            /* renamed from: a */
            final Iterator<Entry<K, Collection<V>>> f49305a = C18005a.this.f49302a.entrySet().iterator();

            /* renamed from: b */
            Collection<V> f49306b;

            public final boolean hasNext() {
                return this.f49305a.hasNext();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Entry<K, Collection<V>> next() {
                Entry entry = (Entry) this.f49305a.next();
                this.f49306b = (Collection) entry.getValue();
                return C18005a.this.mo46405a(entry);
            }

            public final void remove() {
                boolean z;
                if (this.f49306b != null) {
                    z = true;
                } else {
                    z = false;
                }
                C18053v.m59703a(z);
                this.f49305a.remove();
                C18002e.this.totalSize -= this.f49306b.size();
                this.f49306b.clear();
                this.f49306b = null;
            }

            C18007b() {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Set<Entry<K, Collection<V>>> mo45863a() {
            return new C18006a();
        }

        public int hashCode() {
            return this.f49302a.hashCode();
        }

        public Set<K> keySet() {
            return C18002e.this.keySet();
        }

        public int size() {
            return this.f49302a.size();
        }

        public String toString() {
            return this.f49302a.toString();
        }

        public void clear() {
            if (this.f49302a == C18002e.this.map) {
                C18002e.this.clear();
            } else {
                C17782br.m59133h(new C18007b());
            }
        }

        public boolean containsKey(Object obj) {
            return C17839bx.m59347b(this.f49302a, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj || this.f49302a.equals(obj)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) C17839bx.m59331a(this.f49302a, obj);
            if (collection == null) {
                return null;
            }
            return C18002e.this.wrapCollection(obj, collection);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Collection<V> remove(Object obj) {
            Collection collection = (Collection) this.f49302a.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> createCollection = C18002e.this.createCollection();
            createCollection.addAll(collection);
            C18002e.this.totalSize -= collection.size();
            collection.clear();
            return createCollection;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Entry<K, Collection<V>> mo46405a(Entry<K, Collection<V>> entry) {
            Object key = entry.getKey();
            return C17839bx.m59337a(key, C18002e.this.wrapCollection(key, (Collection) entry.getValue()));
        }

        C18005a(Map<K, Collection<V>> map) {
            this.f49302a = map;
        }
    }

    /* renamed from: com.google.common.collect.e$b */
    abstract class C18008b<T> implements Iterator<T> {

        /* renamed from: b */
        final Iterator<Entry<K, Collection<V>>> f49308b;

        /* renamed from: c */
        K f49309c = null;

        /* renamed from: d */
        Collection<V> f49310d = null;

        /* renamed from: e */
        Iterator<V> f49311e = C17782br.m59121b();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo46404a(K k, V v);

        public boolean hasNext() {
            if (this.f49308b.hasNext() || this.f49311e.hasNext()) {
                return true;
            }
            return false;
        }

        public void remove() {
            this.f49311e.remove();
            if (this.f49310d.isEmpty()) {
                this.f49308b.remove();
            }
            C18002e.this.totalSize--;
        }

        public T next() {
            if (!this.f49311e.hasNext()) {
                Entry entry = (Entry) this.f49308b.next();
                this.f49309c = entry.getKey();
                this.f49310d = (Collection) entry.getValue();
                this.f49311e = this.f49310d.iterator();
            }
            return mo46404a(this.f49309c, this.f49311e.next());
        }

        C18008b() {
            this.f49308b = C18002e.this.map.entrySet().iterator();
        }
    }

    /* renamed from: com.google.common.collect.e$c */
    class C18009c extends C17856f<K, Collection<V>> {
        public void clear() {
            C17782br.m59133h(iterator());
        }

        public int hashCode() {
            return mo46150b().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            final Iterator it = mo46150b().entrySet().iterator();
            return new Iterator<K>() {

                /* renamed from: a */
                Entry<K, Collection<V>> f49314a;

                public final boolean hasNext() {
                    return it.hasNext();
                }

                public final K next() {
                    this.f49314a = (Entry) it.next();
                    return this.f49314a.getKey();
                }

                public final void remove() {
                    boolean z;
                    if (this.f49314a != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C18053v.m59703a(z);
                    Collection collection = (Collection) this.f49314a.getValue();
                    it.remove();
                    C18002e.this.totalSize -= collection.size();
                    collection.clear();
                    this.f49314a = null;
                }
            };
        }

        public boolean containsAll(Collection<?> collection) {
            return mo46150b().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (this == obj || mo46150b().keySet().equals(obj)) {
                return true;
            }
            return false;
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) mo46150b().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                C18002e.this.totalSize -= i;
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }

        C18009c(Map<K, Collection<V>> map) {
            super(map);
        }
    }

    /* renamed from: com.google.common.collect.e$d */
    class C18011d extends C18014g implements NavigableMap<K, Collection<V>> {
        /* access modifiers changed from: private */
        /* renamed from: f */
        public NavigableMap<K, Collection<V>> mo46431d() {
            return (NavigableMap) super.mo46431d();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public final NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public NavigableSet<K> mo45866e() {
            return new C18012e(mo46431d());
        }

        public final NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new C18011d(mo46431d().descendingMap());
        }

        public final Entry<K, Collection<V>> pollFirstEntry() {
            return m59652a(entrySet().iterator());
        }

        public final Entry<K, Collection<V>> firstEntry() {
            Entry firstEntry = mo46431d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo46405a(firstEntry);
        }

        public final Entry<K, Collection<V>> lastEntry() {
            Entry lastEntry = mo46431d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo46405a(lastEntry);
        }

        public final Entry<K, Collection<V>> pollLastEntry() {
            return m59652a(descendingMap().entrySet().iterator());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        public final K ceilingKey(K k) {
            return mo46431d().ceilingKey(k);
        }

        public final K floorKey(K k) {
            return mo46431d().floorKey(k);
        }

        public final K higherKey(K k) {
            return mo46431d().higherKey(k);
        }

        public final K lowerKey(K k) {
            return mo46431d().lowerKey(k);
        }

        public final Entry<K, Collection<V>> ceilingEntry(K k) {
            Entry ceilingEntry = mo46431d().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo46405a(ceilingEntry);
        }

        public final Entry<K, Collection<V>> floorEntry(K k) {
            Entry floorEntry = mo46431d().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo46405a(floorEntry);
        }

        public final Entry<K, Collection<V>> higherEntry(K k) {
            Entry higherEntry = mo46431d().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo46405a(higherEntry);
        }

        public final Entry<K, Collection<V>> lowerEntry(K k) {
            Entry lowerEntry = mo46431d().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo46405a(lowerEntry);
        }

        /* renamed from: a */
        private Entry<K, Collection<V>> m59652a(Iterator<Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Entry entry = (Entry) it.next();
            Collection createCollection = C18002e.this.createCollection();
            createCollection.addAll((Collection) entry.getValue());
            it.remove();
            return C17839bx.m59337a(entry.getKey(), C18002e.this.unmodifiableCollectionSubclass(createCollection));
        }

        C18011d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C18011d(mo46431d().headMap(k, z));
        }

        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C18011d(mo46431d().tailMap(k, z));
        }

        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C18011d(mo46431d().subMap(k, z, k2, z2));
        }
    }

    /* renamed from: com.google.common.collect.e$e */
    class C18012e extends C18015h implements NavigableSet<K> {
        /* access modifiers changed from: private */
        /* renamed from: c */
        public NavigableMap<K, Collection<V>> mo46451a() {
            return (NavigableMap) super.mo46451a();
        }

        public final Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public final NavigableSet<K> descendingSet() {
            return new C18012e(mo46451a().descendingMap());
        }

        public final K pollFirst() {
            return C17782br.m59132g(iterator());
        }

        public final K pollLast() {
            return C17782br.m59132g(descendingIterator());
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        public final K ceiling(K k) {
            return mo46451a().ceilingKey(k);
        }

        public final K floor(K k) {
            return mo46451a().floorKey(k);
        }

        public final K higher(K k) {
            return mo46451a().higherKey(k);
        }

        public final K lower(K k) {
            return mo46451a().lowerKey(k);
        }

        C18012e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        public final NavigableSet<K> headSet(K k, boolean z) {
            return new C18012e(mo46451a().headMap(k, z));
        }

        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new C18012e(mo46451a().tailMap(k, z));
        }

        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C18012e(mo46451a().subMap(k, z, k2, z2));
        }
    }

    /* renamed from: com.google.common.collect.e$f */
    class C18013f extends C18018j implements RandomAccess {
        C18013f(K k, List<V> list, C18016i iVar) {
            super(k, list, iVar);
        }
    }

    /* renamed from: com.google.common.collect.e$g */
    class C18014g extends C18005a implements SortedMap<K, Collection<V>> {

        /* renamed from: d */
        SortedSet<K> f49320d;

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public SortedMap<K, Collection<V>> mo46431d() {
            return (SortedMap) this.f49302a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public SortedSet<K> mo45866e() {
            return new C18015h(mo46431d());
        }

        /* renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f49320d;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> b = mo45866e();
            this.f49320d = b;
            return b;
        }

        public Comparator<? super K> comparator() {
            return mo46431d().comparator();
        }

        public K firstKey() {
            return mo46431d().firstKey();
        }

        public K lastKey() {
            return mo46431d().lastKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C18014g(mo46431d().headMap(k));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C18014g(mo46431d().tailMap(k));
        }

        C18014g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C18014g(mo46431d().subMap(k, k2));
        }
    }

    /* renamed from: com.google.common.collect.e$h */
    class C18015h extends C18009c implements SortedSet<K> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public SortedMap<K, Collection<V>> mo46451a() {
            return (SortedMap) super.mo46150b();
        }

        public Comparator<? super K> comparator() {
            return mo46451a().comparator();
        }

        public K first() {
            return mo46451a().firstKey();
        }

        public K last() {
            return mo46451a().lastKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C18015h(mo46451a().headMap(k));
        }

        public SortedSet<K> tailSet(K k) {
            return new C18015h(mo46451a().tailMap(k));
        }

        C18015h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C18015h(mo46451a().subMap(k, k2));
        }
    }

    /* renamed from: com.google.common.collect.e$i */
    class C18016i extends AbstractCollection<V> {

        /* renamed from: b */
        public final K f49323b;

        /* renamed from: c */
        public Collection<V> f49324c;

        /* renamed from: d */
        public final C18016i f49325d;

        /* renamed from: e */
        final Collection<V> f49326e;

        /* renamed from: com.google.common.collect.e$i$a */
        class C18017a implements Iterator<V> {

            /* renamed from: a */
            final Iterator<V> f49328a;

            /* renamed from: b */
            final Collection<V> f49329b = C18016i.this.f49324c;

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Iterator<V> mo46488a() {
                m59676b();
                return this.f49328a;
            }

            public boolean hasNext() {
                m59676b();
                return this.f49328a.hasNext();
            }

            public V next() {
                m59676b();
                return this.f49328a.next();
            }

            /* renamed from: b */
            private void m59676b() {
                C18016i.this.mo46472a();
                if (C18016i.this.f49324c != this.f49329b) {
                    throw new ConcurrentModificationException();
                }
            }

            public void remove() {
                this.f49328a.remove();
                C18002e.this.totalSize--;
                C18016i.this.mo46475b();
            }

            C18017a() {
                this.f49328a = C18002e.iteratorOrListIterator(C18016i.this.f49324c);
            }

            C18017a(Iterator<V> it) {
                this.f49328a = it;
            }
        }

        public int hashCode() {
            mo46472a();
            return this.f49324c.hashCode();
        }

        public Iterator<V> iterator() {
            mo46472a();
            return new C18017a();
        }

        public int size() {
            mo46472a();
            return this.f49324c.size();
        }

        public String toString() {
            mo46472a();
            return this.f49324c.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo46475b() {
            if (this.f49325d != null) {
                this.f49325d.mo46475b();
                return;
            }
            if (this.f49324c.isEmpty()) {
                C18002e.this.map.remove(this.f49323b);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo46476c() {
            if (this.f49325d != null) {
                this.f49325d.mo46476c();
            } else {
                C18002e.this.map.put(this.f49323b, this.f49324c);
            }
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f49324c.clear();
                C18002e.this.totalSize -= size;
                mo46475b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46472a() {
            if (this.f49325d != null) {
                this.f49325d.mo46472a();
                if (this.f49325d.f49324c != this.f49326e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f49324c.isEmpty()) {
                Collection<V> collection = (Collection) C18002e.this.map.get(this.f49323b);
                if (collection != null) {
                    this.f49324c = collection;
                }
            }
        }

        public boolean contains(Object obj) {
            mo46472a();
            return this.f49324c.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            mo46472a();
            return this.f49324c.containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            mo46472a();
            return this.f49324c.equals(obj);
        }

        public boolean add(V v) {
            mo46472a();
            boolean isEmpty = this.f49324c.isEmpty();
            boolean add = this.f49324c.add(v);
            if (add) {
                C18002e.this.totalSize++;
                if (isEmpty) {
                    mo46476c();
                }
            }
            return add;
        }

        public boolean remove(Object obj) {
            mo46472a();
            boolean remove = this.f49324c.remove(obj);
            if (remove) {
                C18002e.this.totalSize--;
                mo46475b();
            }
            return remove;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f49324c.addAll(collection);
            if (addAll) {
                int size2 = this.f49324c.size();
                C18002e.this.totalSize += size2 - size;
                if (size == 0) {
                    mo46476c();
                }
            }
            return addAll;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f49324c.removeAll(collection);
            if (removeAll) {
                int size2 = this.f49324c.size();
                C18002e.this.totalSize += size2 - size;
                mo46475b();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            C17439m.m57962a(collection);
            int size = size();
            boolean retainAll = this.f49324c.retainAll(collection);
            if (retainAll) {
                int size2 = this.f49324c.size();
                C18002e.this.totalSize += size2 - size;
                mo46475b();
            }
            return retainAll;
        }

        C18016i(K k, Collection<V> collection, C18016i iVar) {
            Collection<V> collection2;
            this.f49323b = k;
            this.f49324c = collection;
            this.f49325d = iVar;
            if (iVar == null) {
                collection2 = null;
            } else {
                collection2 = iVar.f49324c;
            }
            this.f49326e = collection2;
        }
    }

    /* renamed from: com.google.common.collect.e$j */
    class C18018j extends C18016i implements List<V> {

        /* renamed from: com.google.common.collect.e$j$a */
        class C18019a extends a implements ListIterator<V> {
            /* renamed from: b */
            private ListIterator<V> m59679b() {
                return (ListIterator) a();
            }

            public final boolean hasPrevious() {
                return m59679b().hasPrevious();
            }

            public final int nextIndex() {
                return m59679b().nextIndex();
            }

            public final V previous() {
                return m59679b().previous();
            }

            public final int previousIndex() {
                return m59679b().previousIndex();
            }

            C18019a() {
                super();
            }

            public final void set(V v) {
                m59679b().set(v);
            }

            public final void add(V v) {
                boolean isEmpty = C18018j.this.isEmpty();
                m59679b().add(v);
                C18002e.this.totalSize++;
                if (isEmpty) {
                    C18018j.this.mo46476c();
                }
            }

            public C18019a(int i) {
                super(C18018j.this.mo46494d().listIterator(i));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final List<V> mo46494d() {
            return (List) this.f49324c;
        }

        public ListIterator<V> listIterator() {
            mo46472a();
            return new C18019a();
        }

        public V get(int i) {
            mo46472a();
            return mo46494d().get(i);
        }

        public int indexOf(Object obj) {
            mo46472a();
            return mo46494d().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            mo46472a();
            return mo46494d().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator(int i) {
            mo46472a();
            return new C18019a(i);
        }

        public V remove(int i) {
            mo46472a();
            V remove = mo46494d().remove(i);
            C18002e.this.totalSize--;
            mo46475b();
            return remove;
        }

        public V set(int i, V v) {
            mo46472a();
            return mo46494d().set(i, v);
        }

        public void add(int i, V v) {
            mo46472a();
            boolean isEmpty = this.f49324c.isEmpty();
            mo46494d().add(i, v);
            C18002e.this.totalSize++;
            if (isEmpty) {
                mo46476c();
            }
        }

        public List<V> subList(int i, int i2) {
            C18016i iVar;
            mo46472a();
            C18002e eVar = C18002e.this;
            K k = this.f49323b;
            List subList = mo46494d().subList(i, i2);
            if (this.f49325d == null) {
                iVar = this;
            } else {
                iVar = this.f49325d;
            }
            return eVar.wrapList(k, subList, iVar);
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = mo46494d().addAll(i, collection);
            if (addAll) {
                int size2 = this.f49324c.size();
                C18002e.this.totalSize += size2 - size;
                if (size == 0) {
                    mo46476c();
                }
            }
            return addAll;
        }

        C18018j(K k, List<V> list, C18016i iVar) {
            super(k, list, iVar);
        }
    }

    /* renamed from: com.google.common.collect.e$k */
    class C18020k extends C18022m implements NavigableSet<V> {
        /* access modifiers changed from: private */
        /* renamed from: e */
        public NavigableSet<V> mo46510d() {
            return (NavigableSet) super.mo46510d();
        }

        public final Iterator<V> descendingIterator() {
            return new C18017a(mo46510d().descendingIterator());
        }

        public final NavigableSet<V> descendingSet() {
            return m59680a(mo46510d().descendingSet());
        }

        public final V pollFirst() {
            return C17782br.m59132g(iterator());
        }

        public final V pollLast() {
            return C17782br.m59132g(descendingIterator());
        }

        public final V ceiling(V v) {
            return mo46510d().ceiling(v);
        }

        public final V floor(V v) {
            return mo46510d().floor(v);
        }

        public final V higher(V v) {
            return mo46510d().higher(v);
        }

        public final V lower(V v) {
            return mo46510d().lower(v);
        }

        /* renamed from: a */
        private NavigableSet<V> m59680a(NavigableSet<V> navigableSet) {
            C18016i iVar;
            C18002e eVar = C18002e.this;
            Object obj = this.f49323b;
            if (this.f49325d == null) {
                iVar = this;
            } else {
                iVar = this.f49325d;
            }
            return new C18020k(obj, navigableSet, iVar);
        }

        public final NavigableSet<V> headSet(V v, boolean z) {
            return m59680a(mo46510d().headSet(v, z));
        }

        public final NavigableSet<V> tailSet(V v, boolean z) {
            return m59680a(mo46510d().tailSet(v, z));
        }

        C18020k(K k, NavigableSet<V> navigableSet, C18016i iVar) {
            super(k, navigableSet, iVar);
        }

        public final NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
            return m59680a(mo46510d().subSet(v, z, v2, z2));
        }
    }

    /* renamed from: com.google.common.collect.e$l */
    class C18021l extends C18016i implements Set<V> {
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean a = C17933db.m59572a((Set) this.f49324c, collection);
            if (a) {
                int size2 = this.f49324c.size();
                C18002e.this.totalSize += size2 - size;
                mo46475b();
            }
            return a;
        }

        C18021l(K k, Set<V> set) {
            super(k, set, null);
        }
    }

    /* renamed from: com.google.common.collect.e$m */
    class C18022m extends C18016i implements SortedSet<V> {
        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public SortedSet<V> mo46510d() {
            return (SortedSet) this.f49324c;
        }

        public Comparator<? super V> comparator() {
            return mo46510d().comparator();
        }

        public V first() {
            mo46472a();
            return mo46510d().first();
        }

        public V last() {
            mo46472a();
            return mo46510d().last();
        }

        public SortedSet<V> headSet(V v) {
            C18016i iVar;
            mo46472a();
            C18002e eVar = C18002e.this;
            K k = this.f49323b;
            SortedSet headSet = mo46510d().headSet(v);
            if (this.f49325d == null) {
                iVar = this;
            } else {
                iVar = this.f49325d;
            }
            return new C18022m(k, headSet, iVar);
        }

        public SortedSet<V> tailSet(V v) {
            C18016i iVar;
            mo46472a();
            C18002e eVar = C18002e.this;
            K k = this.f49323b;
            SortedSet tailSet = mo46510d().tailSet(v);
            if (this.f49325d == null) {
                iVar = this;
            } else {
                iVar = this.f49325d;
            }
            return new C18022m(k, tailSet, iVar);
        }

        public SortedSet<V> subSet(V v, V v2) {
            C18016i iVar;
            mo46472a();
            C18002e eVar = C18002e.this;
            K k = this.f49323b;
            SortedSet subSet = mo46510d().subSet(v, v2);
            if (this.f49325d == null) {
                iVar = this;
            } else {
                iVar = this.f49325d;
            }
            return new C18022m(k, subSet, iVar);
        }

        C18022m(K k, SortedSet<V> sortedSet, C18016i iVar) {
            super(k, sortedSet, iVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public Map<K, Collection<V>> backingMap() {
        return this.map;
    }

    /* access modifiers changed from: 0000 */
    public abstract Collection<V> createCollection();

    public int size() {
        return this.totalSize;
    }

    /* access modifiers changed from: 0000 */
    public Map<K, Collection<V>> createAsMap() {
        return new C18005a(this.map);
    }

    /* access modifiers changed from: 0000 */
    public Set<K> createKeySet() {
        return new C18009c(this.map);
    }

    /* access modifiers changed from: 0000 */
    public C17882cb<K> createKeys() {
        return new C17879d(this);
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> createValues() {
        return new C18031c();
    }

    public Collection<Entry<K, V>> entries() {
        return super.entries();
    }

    /* access modifiers changed from: 0000 */
    public Iterator<Entry<K, V>> entryIterator() {
        return new C18008b<Entry<K, V>>() {
            /* renamed from: b */
            private static Entry<K, V> m59643b(K k, V v) {
                return C17839bx.m59337a(k, v);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ Object mo46404a(Object obj, Object obj2) {
                return m59643b(obj, obj2);
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public Iterator<V> valueIterator() {
        return new C18008b<V>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final V mo46404a(K k, V v) {
                return v;
            }
        };
    }

    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: 0000 */
    public Collection<Entry<K, V>> createEntries() {
        if (this instanceof C17932da) {
            return new C18030b();
        }
        return new C18029a();
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> createUnmodifiableEmptyCollection() {
        return unmodifiableCollectionSubclass(createCollection());
    }

    public void clear() {
        for (Collection clear : this.map.values()) {
            clear.clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    /* access modifiers changed from: 0000 */
    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        if (this.map instanceof NavigableMap) {
            return new C18011d((NavigableMap) this.map);
        }
        if (this.map instanceof SortedMap) {
            return new C18014g((SortedMap) this.map);
        }
        return new C18005a(this.map);
    }

    /* access modifiers changed from: 0000 */
    public final Set<K> createMaybeNavigableKeySet() {
        if (this.map instanceof NavigableMap) {
            return new C18012e((NavigableMap) this.map);
        }
        if (this.map instanceof SortedMap) {
            return new C18015h((SortedMap) this.map);
        }
        return new C18009c(this.map);
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> createCollection(K k) {
        return createCollection();
    }

    /* access modifiers changed from: 0000 */
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    protected C18002e(Map<K, Collection<V>> map2) {
        C17439m.m57968a(map2.isEmpty());
        this.map = map2;
    }

    public static <E> Iterator<E> iteratorOrListIterator(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    private Collection<V> getOrCreateCollection(K k) {
        Collection<V> collection = (Collection) this.map.get(k);
        if (collection != null) {
            return collection;
        }
        Collection<V> createCollection = createCollection(k);
        this.map.put(k, createCollection);
        return createCollection;
    }

    public Collection<V> get(K k) {
        Collection collection = (Collection) this.map.get(k);
        if (collection == null) {
            collection = createCollection(k);
        }
        return wrapCollection(k, collection);
    }

    public void removeValuesForKey(Object obj) {
        Collection collection = (Collection) C17839bx.m59348c(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    public Collection<V> removeAll(Object obj) {
        Collection collection = (Collection) this.map.remove(obj);
        if (collection == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection createCollection = createCollection();
        createCollection.addAll(collection);
        this.totalSize -= collection.size();
        collection.clear();
        return unmodifiableCollectionSubclass(createCollection);
    }

    /* access modifiers changed from: 0000 */
    public final void setMap(Map<K, Collection<V>> map2) {
        this.map = map2;
        this.totalSize = 0;
        for (Collection collection : map2.values()) {
            C17439m.m57968a(!collection.isEmpty());
            this.totalSize += collection.size();
        }
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new C18016i(k, collection, null);
    }

    public boolean put(K k, V v) {
        Collection collection = (Collection) this.map.get(k);
        if (collection == null) {
            Collection createCollection = createCollection(k);
            if (createCollection.add(v)) {
                this.totalSize++;
                this.map.put(k, createCollection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.totalSize++;
            return true;
        }
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection orCreateCollection = getOrCreateCollection(k);
        Collection createCollection = createCollection();
        createCollection.addAll(orCreateCollection);
        this.totalSize -= orCreateCollection.size();
        orCreateCollection.clear();
        while (it.hasNext()) {
            if (orCreateCollection.add(it.next())) {
                this.totalSize++;
            }
        }
        return unmodifiableCollectionSubclass(createCollection);
    }

    /* access modifiers changed from: 0000 */
    public final List<V> wrapList(K k, List<V> list, C18016i iVar) {
        if (list instanceof RandomAccess) {
            return new C18013f(k, list, iVar);
        }
        return new C18018j(k, list, iVar);
    }
}
