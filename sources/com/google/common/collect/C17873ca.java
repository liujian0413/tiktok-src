package com.google.common.collect;

import com.google.common.base.C17427g;
import com.google.common.base.C17439m;
import com.google.common.base.C17440n;
import com.google.common.base.C17441o;
import com.google.common.base.C17457s;
import com.google.common.collect.C17882cb.C17883a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.common.collect.ca */
public final class C17873ca {

    /* renamed from: com.google.common.collect.ca$a */
    static final class C17874a<K, V> extends C17861k<K, Collection<V>> {

        /* renamed from: a */
        public final C17862by<K, V> f49141a;

        /* renamed from: com.google.common.collect.ca$a$a */
        class C17875a extends C17852c<K, Collection<V>> {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final Map<K, Collection<V>> mo45869a() {
                return C17874a.this;
            }

            public final Iterator<Entry<K, Collection<V>>> iterator() {
                return C17839bx.m59335a(C17874a.this.f49141a.keySet(), (C17427g<? super K, V>) new C17427g<K, Collection<V>>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Collection<V> mo44914b(K k) {
                        return C17874a.this.f49141a.get(k);
                    }
                });
            }

            C17875a() {
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C17874a.this.mo46194a(((Entry) obj).getKey());
                return true;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Set<Entry<K, Collection<V>>> mo45863a() {
            return new C17875a();
        }

        public final void clear() {
            this.f49141a.clear();
        }

        public final boolean isEmpty() {
            return this.f49141a.isEmpty();
        }

        public final Set<K> keySet() {
            return this.f49141a.keySet();
        }

        public final int size() {
            return this.f49141a.keySet().size();
        }

        public final boolean containsKey(Object obj) {
            return this.f49141a.containsKey(obj);
        }

        C17874a(C17862by<K, V> byVar) {
            this.f49141a = (C17862by) C17439m.m57962a(byVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Collection<V> get(Object obj) {
            if (containsKey(obj)) {
                return this.f49141a.get(obj);
            }
            return null;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public Collection<V> remove(Object obj) {
            if (containsKey(obj)) {
                return this.f49141a.removeAll(obj);
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo46194a(Object obj) {
            this.f49141a.keySet().remove(obj);
        }
    }

    /* renamed from: com.google.common.collect.ca$b */
    static class C17877b<K, V> extends C17931d<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        transient C17457s<? extends List<V>> f49144a;

        /* access modifiers changed from: 0000 */
        public final Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        /* access modifiers changed from: 0000 */
        public final Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        /* access modifiers changed from: protected */
        public final List<V> createCollection() {
            return (List) this.f49144a.mo44946a();
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f49144a);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f49144a = (C17457s) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        C17877b(Map<K, Collection<V>> map, C17457s<? extends List<V>> sVar) {
            super(map);
            this.f49144a = (C17457s) C17439m.m57962a(sVar);
        }
    }

    /* renamed from: com.google.common.collect.ca$c */
    static abstract class C17878c<K, V> extends AbstractCollection<Entry<K, V>> {
        C17878c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C17862by<K, V> mo46202a();

        public void clear() {
            mo46202a().clear();
        }

        public int size() {
            return mo46202a().size();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return mo46202a().containsEntry(entry.getKey(), entry.getValue());
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return mo46202a().remove(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.common.collect.ca$d */
    static class C17879d<K, V> extends C18032i<K> {

        /* renamed from: b */
        final C17862by<K, V> f49145b;

        public void clear() {
            this.f49145b.clear();
        }

        /* access modifiers changed from: 0000 */
        public Iterator<K> elementIterator() {
            throw new AssertionError("should never be called");
        }

        public Set<K> elementSet() {
            return this.f49145b.keySet();
        }

        public int size() {
            return this.f49145b.size();
        }

        /* access modifiers changed from: 0000 */
        public int distinctElements() {
            return this.f49145b.asMap().size();
        }

        public Iterator<K> iterator() {
            return C17839bx.m59334a(this.f49145b.entries().iterator());
        }

        /* access modifiers changed from: 0000 */
        public Iterator<C17883a<K>> entryIterator() {
            return new C17992dq<Entry<K, Collection<V>>, C17883a<K>>(this.f49145b.asMap().entrySet().iterator()) {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C17883a<K> mo45666a(final Entry<K, Collection<V>> entry) {
                    return new C17886a<K>() {
                        /* renamed from: b */
                        public final K mo45308b() {
                            return entry.getKey();
                        }

                        /* renamed from: a */
                        public final int mo45307a() {
                            return ((Collection) entry.getValue()).size();
                        }
                    };
                }
            };
        }

        C17879d(C17862by<K, V> byVar) {
            this.f49145b = byVar;
        }

        public boolean contains(Object obj) {
            return this.f49145b.containsKey(obj);
        }

        public int count(Object obj) {
            Collection collection = (Collection) C17839bx.m59331a(this.f49145b.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public int remove(Object obj, int i) {
            C18053v.m59700a(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) C17839bx.m59331a(this.f49145b.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }
    }

    /* renamed from: a */
    public static <K, V> C17794bt<K, V> m59402a(Map<K, Collection<V>> map, C17457s<? extends List<V>> sVar) {
        return new C17877b(map, sVar);
    }

    /* renamed from: a */
    private static <K, V> C17862by<K, V> m59403a(C17739ao<K, V> aoVar, C17440n<? super Entry<K, V>> nVar) {
        return new C17728am(aoVar.mo45857a(), C17441o.m57991a(aoVar.mo45860b(), nVar));
    }

    /* renamed from: a */
    public static <K, V> C17862by<K, V> m59404a(C17862by<K, V> byVar, C17440n<? super Entry<K, V>> nVar) {
        C17439m.m57962a(nVar);
        if (byVar instanceof C17932da) {
            return m59406a((C17932da) byVar, nVar);
        }
        if (byVar instanceof C17739ao) {
            return m59403a((C17739ao) byVar, nVar);
        }
        return new C17728am((C17862by) C17439m.m57962a(byVar), nVar);
    }

    /* renamed from: a */
    private static <K, V> C17932da<K, V> m59405a(C17741aq<K, V> aqVar, C17440n<? super Entry<K, V>> nVar) {
        return new C17738an(aqVar.mo45880c(), C17441o.m57991a(aqVar.mo45860b(), nVar));
    }

    /* renamed from: a */
    private static <K, V> C17932da<K, V> m59406a(C17932da<K, V> daVar, C17440n<? super Entry<K, V>> nVar) {
        C17439m.m57962a(nVar);
        if (daVar instanceof C17741aq) {
            return m59405a((C17741aq) daVar, nVar);
        }
        return new C17738an((C17932da) C17439m.m57962a(daVar), nVar);
    }

    /* renamed from: a */
    static boolean m59407a(C17862by<?, ?> byVar, Object obj) {
        if (obj == byVar) {
            return true;
        }
        if (!(obj instanceof C17862by)) {
            return false;
        }
        return byVar.asMap().equals(((C17862by) obj).asMap());
    }
}
