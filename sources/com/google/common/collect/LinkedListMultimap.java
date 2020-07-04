package com.google.common.collect;

import com.google.common.base.C17439m;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public class LinkedListMultimap<K, V> extends C18028h<K, V> implements C17794bt<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    public transient C17652f<K, V> head;
    public transient Map<K, C17651e<K, V>> keyToKeyList;
    public transient int modCount;
    public transient int size;
    public transient C17652f<K, V> tail;

    /* renamed from: com.google.common.collect.LinkedListMultimap$a */
    class C17646a extends AbstractSequentialList<Entry<K, V>> {
        public final int size() {
            return LinkedListMultimap.this.size;
        }

        C17646a() {
        }

        public final ListIterator<Entry<K, V>> listIterator(int i) {
            return new C17653g(i);
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$b */
    class C17647b extends C17936c<K> {
        public final Iterator<K> iterator() {
            return new C17650d();
        }

        public final int size() {
            return LinkedListMultimap.this.keyToKeyList.size();
        }

        C17647b() {
        }

        public final boolean contains(Object obj) {
            return LinkedListMultimap.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            if (!LinkedListMultimap.this.removeAll(obj).isEmpty()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$c */
    class C17648c extends AbstractSequentialList<V> {
        public final int size() {
            return LinkedListMultimap.this.size;
        }

        C17648c() {
        }

        public final ListIterator<V> listIterator(int i) {
            final C17653g gVar = new C17653g(i);
            return new C17993dr<Entry<K, V>, V>(gVar) {
                /* renamed from: a */
                private static V m58779a(Entry<K, V> entry) {
                    return entry.getValue();
                }

                public final void set(V v) {
                    gVar.mo45671a(v);
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Object mo45666a(Object obj) {
                    return m58779a((Entry) obj);
                }
            };
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$d */
    class C17650d implements Iterator<K> {

        /* renamed from: a */
        final Set<K> f48813a;

        /* renamed from: b */
        C17652f<K, V> f48814b;

        /* renamed from: c */
        C17652f<K, V> f48815c;

        /* renamed from: d */
        int f48816d;

        /* renamed from: a */
        private void m58781a() {
            if (LinkedListMultimap.this.modCount != this.f48816d) {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            m58781a();
            if (this.f48814b != null) {
                return true;
            }
            return false;
        }

        public final void remove() {
            boolean z;
            m58781a();
            if (this.f48815c != null) {
                z = true;
            } else {
                z = false;
            }
            C18053v.m59703a(z);
            LinkedListMultimap.this.removeAllNodes(this.f48815c.f48821a);
            this.f48815c = null;
            this.f48816d = LinkedListMultimap.this.modCount;
        }

        public final K next() {
            m58781a();
            LinkedListMultimap.checkElement(this.f48814b);
            this.f48815c = this.f48814b;
            this.f48813a.add(this.f48815c.f48821a);
            do {
                this.f48814b = this.f48814b.f48823c;
                if (this.f48814b == null) {
                    break;
                }
            } while (!this.f48813a.add(this.f48814b.f48821a));
            return this.f48815c.f48821a;
        }

        private C17650d() {
            this.f48813a = C17933db.m59566a(LinkedListMultimap.this.keySet().size());
            this.f48814b = LinkedListMultimap.this.head;
            this.f48816d = LinkedListMultimap.this.modCount;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$e */
    static class C17651e<K, V> {

        /* renamed from: a */
        C17652f<K, V> f48818a;

        /* renamed from: b */
        C17652f<K, V> f48819b;

        /* renamed from: c */
        int f48820c = 1;

        C17651e(C17652f<K, V> fVar) {
            this.f48818a = fVar;
            this.f48819b = fVar;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$f */
    static final class C17652f<K, V> extends C18027g<K, V> {

        /* renamed from: a */
        final K f48821a;

        /* renamed from: b */
        V f48822b;

        /* renamed from: c */
        C17652f<K, V> f48823c;

        /* renamed from: d */
        C17652f<K, V> f48824d;

        /* renamed from: e */
        C17652f<K, V> f48825e = null;

        /* renamed from: f */
        C17652f<K, V> f48826f = null;

        public final K getKey() {
            return this.f48821a;
        }

        public final V getValue() {
            return this.f48822b;
        }

        public final V setValue(V v) {
            V v2 = this.f48822b;
            this.f48822b = v;
            return v2;
        }

        C17652f(K k, V v) {
            this.f48821a = k;
            this.f48822b = v;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$g */
    class C17653g implements ListIterator<Entry<K, V>> {

        /* renamed from: a */
        int f48827a;

        /* renamed from: b */
        C17652f<K, V> f48828b;

        /* renamed from: c */
        C17652f<K, V> f48829c;

        /* renamed from: d */
        C17652f<K, V> f48830d;

        /* renamed from: e */
        int f48831e = LinkedListMultimap.this.modCount;

        public final int nextIndex() {
            return this.f48827a;
        }

        public final int previousIndex() {
            return this.f48827a - 1;
        }

        /* renamed from: a */
        private void m58782a() {
            if (LinkedListMultimap.this.modCount != this.f48831e) {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            m58782a();
            if (this.f48828b != null) {
                return true;
            }
            return false;
        }

        public final boolean hasPrevious() {
            m58782a();
            if (this.f48830d != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17652f<K, V> next() {
            m58782a();
            LinkedListMultimap.checkElement(this.f48828b);
            C17652f<K, V> fVar = this.f48828b;
            this.f48829c = fVar;
            this.f48830d = fVar;
            this.f48828b = this.f48828b.f48823c;
            this.f48827a++;
            return this.f48829c;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C17652f<K, V> previous() {
            m58782a();
            LinkedListMultimap.checkElement(this.f48830d);
            C17652f<K, V> fVar = this.f48830d;
            this.f48829c = fVar;
            this.f48828b = fVar;
            this.f48830d = this.f48830d.f48824d;
            this.f48827a--;
            return this.f48829c;
        }

        public final void remove() {
            boolean z;
            m58782a();
            if (this.f48829c != null) {
                z = true;
            } else {
                z = false;
            }
            C18053v.m59703a(z);
            if (this.f48829c != this.f48828b) {
                this.f48830d = this.f48829c.f48824d;
                this.f48827a--;
            } else {
                this.f48828b = this.f48829c.f48823c;
            }
            LinkedListMultimap.this.removeNode(this.f48829c);
            this.f48829c = null;
            this.f48831e = LinkedListMultimap.this.modCount;
        }

        /* renamed from: a */
        private static void m58783a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        private static void m58785b(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ void add(Object obj) {
            m58785b((Entry) obj);
        }

        public final /* synthetic */ void set(Object obj) {
            m58783a((Entry) obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo45671a(V v) {
            boolean z;
            if (this.f48829c != null) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57981b(z);
            this.f48829c.f48822b = v;
        }

        C17653g(int i) {
            int size = LinkedListMultimap.this.size();
            C17439m.m57978b(i, size);
            if (i < size / 2) {
                this.f48828b = LinkedListMultimap.this.head;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i2;
                }
            } else {
                this.f48830d = LinkedListMultimap.this.tail;
                this.f48827a = size;
                while (true) {
                    int i3 = i + 1;
                    if (i >= size) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            }
            this.f48829c = null;
        }
    }

    /* renamed from: com.google.common.collect.LinkedListMultimap$h */
    class C17654h implements ListIterator<V> {

        /* renamed from: a */
        final Object f48833a;

        /* renamed from: b */
        int f48834b;

        /* renamed from: c */
        C17652f<K, V> f48835c;

        /* renamed from: d */
        C17652f<K, V> f48836d;

        /* renamed from: e */
        C17652f<K, V> f48837e;

        public final int nextIndex() {
            return this.f48834b;
        }

        public final boolean hasNext() {
            if (this.f48835c != null) {
                return true;
            }
            return false;
        }

        public final boolean hasPrevious() {
            if (this.f48837e != null) {
                return true;
            }
            return false;
        }

        public final int previousIndex() {
            return this.f48834b - 1;
        }

        public final V next() {
            LinkedListMultimap.checkElement(this.f48835c);
            C17652f<K, V> fVar = this.f48835c;
            this.f48836d = fVar;
            this.f48837e = fVar;
            this.f48835c = this.f48835c.f48825e;
            this.f48834b++;
            return this.f48836d.f48822b;
        }

        public final V previous() {
            LinkedListMultimap.checkElement(this.f48837e);
            C17652f<K, V> fVar = this.f48837e;
            this.f48836d = fVar;
            this.f48835c = fVar;
            this.f48837e = this.f48837e.f48826f;
            this.f48834b--;
            return this.f48836d.f48822b;
        }

        public final void remove() {
            boolean z;
            if (this.f48836d != null) {
                z = true;
            } else {
                z = false;
            }
            C18053v.m59703a(z);
            if (this.f48836d != this.f48835c) {
                this.f48837e = this.f48836d.f48826f;
                this.f48834b--;
            } else {
                this.f48835c = this.f48836d.f48825e;
            }
            LinkedListMultimap.this.removeNode(this.f48836d);
            this.f48836d = null;
        }

        public final void set(V v) {
            boolean z;
            if (this.f48836d != null) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57981b(z);
            this.f48836d.f48822b = v;
        }

        public final void add(V v) {
            this.f48837e = LinkedListMultimap.this.addNode(this.f48833a, v, this.f48835c);
            this.f48834b++;
            this.f48836d = null;
        }

        C17654h(Object obj) {
            C17652f<K, V> fVar;
            this.f48833a = obj;
            C17651e eVar = (C17651e) LinkedListMultimap.this.keyToKeyList.get(obj);
            if (eVar == null) {
                fVar = null;
            } else {
                fVar = eVar.f48818a;
            }
            this.f48835c = fVar;
        }

        public C17654h(Object obj, int i) {
            int i2;
            C17652f<K, V> fVar;
            C17652f<K, V> fVar2;
            C17651e eVar = (C17651e) LinkedListMultimap.this.keyToKeyList.get(obj);
            if (eVar == null) {
                i2 = 0;
            } else {
                i2 = eVar.f48820c;
            }
            C17439m.m57978b(i, i2);
            if (i < i2 / 2) {
                if (eVar == null) {
                    fVar = null;
                } else {
                    fVar = eVar.f48818a;
                }
                this.f48835c = fVar;
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i3;
                }
            } else {
                if (eVar == null) {
                    fVar2 = null;
                } else {
                    fVar2 = eVar.f48819b;
                }
                this.f48837e = fVar2;
                this.f48834b = i2;
                while (true) {
                    int i4 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i4;
                }
            }
            this.f48833a = obj;
            this.f48836d = null;
        }
    }

    public int size() {
        return this.size;
    }

    LinkedListMultimap() {
        this(12);
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
        return new LinkedListMultimap<>();
    }

    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    /* access modifiers changed from: 0000 */
    public Map<K, Collection<V>> createAsMap() {
        return new C17874a(this);
    }

    /* access modifiers changed from: 0000 */
    public Set<K> createKeySet() {
        return new C17647b();
    }

    /* access modifiers changed from: 0000 */
    public C17882cb<K> createKeys() {
        return new C17879d(this);
    }

    /* access modifiers changed from: 0000 */
    public Iterator<Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public /* bridge */ /* synthetic */ C17882cb keys() {
        return super.keys();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* access modifiers changed from: 0000 */
    public List<Entry<K, V>> createEntries() {
        return new C17646a();
    }

    /* access modifiers changed from: 0000 */
    public List<V> createValues() {
        return new C17648c();
    }

    public List<Entry<K, V>> entries() {
        return (List) super.entries();
    }

    public List<V> values() {
        return (List) super.values();
    }

    public void clear() {
        this.head = null;
        this.tail = null;
        this.keyToKeyList.clear();
        this.size = 0;
        this.modCount++;
    }

    public boolean containsKey(Object obj) {
        return this.keyToKeyList.containsKey(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ boolean putAll(C17862by byVar) {
        return super.putAll(byVar);
    }

    private LinkedListMultimap(int i) {
        this.keyToKeyList = C17898cj.m59507a(i);
    }

    public static void checkElement(Object obj) {
        if (obj == null) {
            throw new NoSuchElementException();
        }
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i) {
        return new LinkedListMultimap<>(i);
    }

    private List<V> getCopy(Object obj) {
        return Collections.unmodifiableList(C17795bu.m59145a((Iterator<? extends E>) new C17654h<Object>(obj)));
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public List<V> get(final K k) {
        return new AbstractSequentialList<V>() {
            public final int size() {
                C17651e eVar = (C17651e) LinkedListMultimap.this.keyToKeyList.get(k);
                if (eVar == null) {
                    return 0;
                }
                return eVar.f48820c;
            }

            public final ListIterator<V> listIterator(int i) {
                return new C17654h(k, i);
            }
        };
    }

    public List<V> removeAll(Object obj) {
        List<V> copy = getCopy(obj);
        removeAllNodes(obj);
        return copy;
    }

    public void removeAllNodes(Object obj) {
        C17782br.m59133h(new C17654h(obj));
    }

    private LinkedListMultimap(C17862by<? extends K, ? extends V> byVar) {
        this(byVar.keySet().size());
        putAll(byVar);
    }

    public static <K, V> LinkedListMultimap<K, V> create(C17862by<? extends K, ? extends V> byVar) {
        return new LinkedListMultimap<>(byVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.keyToKeyList = C18068z.m59770f();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Entry entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public void removeNode(C17652f<K, V> fVar) {
        if (fVar.f48824d != null) {
            fVar.f48824d.f48823c = fVar.f48823c;
        } else {
            this.head = fVar.f48823c;
        }
        if (fVar.f48823c != null) {
            fVar.f48823c.f48824d = fVar.f48824d;
        } else {
            this.tail = fVar.f48824d;
        }
        if (fVar.f48826f == null && fVar.f48825e == null) {
            ((C17651e) this.keyToKeyList.remove(fVar.f48821a)).f48820c = 0;
            this.modCount++;
        } else {
            C17651e eVar = (C17651e) this.keyToKeyList.get(fVar.f48821a);
            eVar.f48820c--;
            if (fVar.f48826f == null) {
                eVar.f48818a = fVar.f48825e;
            } else {
                fVar.f48826f.f48825e = fVar.f48825e;
            }
            if (fVar.f48825e == null) {
                eVar.f48819b = fVar.f48826f;
            } else {
                fVar.f48825e.f48826f = fVar.f48826f;
            }
        }
        this.size--;
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public boolean put(K k, V v) {
        addNode(k, v, null);
        return true;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        List<V> copy = getCopy(k);
        C17654h hVar = new C17654h(k);
        Iterator it = iterable.iterator();
        while (hVar.hasNext() && it.hasNext()) {
            hVar.next();
            hVar.set(it.next());
        }
        while (hVar.hasNext()) {
            hVar.next();
            hVar.remove();
        }
        while (it.hasNext()) {
            hVar.add(it.next());
        }
        return copy;
    }

    public C17652f<K, V> addNode(K k, V v, C17652f<K, V> fVar) {
        C17652f<K, V> fVar2 = new C17652f<>(k, v);
        if (this.head == null) {
            this.tail = fVar2;
            this.head = fVar2;
            this.keyToKeyList.put(k, new C17651e(fVar2));
            this.modCount++;
        } else if (fVar == null) {
            this.tail.f48823c = fVar2;
            fVar2.f48824d = this.tail;
            this.tail = fVar2;
            C17651e eVar = (C17651e) this.keyToKeyList.get(k);
            if (eVar == null) {
                this.keyToKeyList.put(k, new C17651e(fVar2));
                this.modCount++;
            } else {
                eVar.f48820c++;
                C17652f<K, V> fVar3 = eVar.f48819b;
                fVar3.f48825e = fVar2;
                fVar2.f48826f = fVar3;
                eVar.f48819b = fVar2;
            }
        } else {
            C17651e eVar2 = (C17651e) this.keyToKeyList.get(k);
            eVar2.f48820c++;
            fVar2.f48824d = fVar.f48824d;
            fVar2.f48826f = fVar.f48826f;
            fVar2.f48823c = fVar;
            fVar2.f48825e = fVar;
            if (fVar.f48826f == null) {
                ((C17651e) this.keyToKeyList.get(k)).f48818a = fVar2;
            } else {
                fVar.f48826f.f48825e = fVar2;
            }
            if (fVar.f48824d == null) {
                this.head = fVar2;
            } else {
                fVar.f48824d.f48823c = fVar2;
            }
            fVar.f48824d = fVar2;
            fVar.f48826f = fVar2;
        }
        this.size++;
        return fVar2;
    }
}
