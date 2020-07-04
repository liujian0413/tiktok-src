package com.google.common.collect;

import com.google.common.base.C17430i;
import com.google.common.base.C17439m;
import com.google.common.collect.ImmutableMap.C17591a;
import com.google.common.collect.ImmutableMultimap.C17600a;
import com.google.common.collect.ImmutableSet.C17622a;
import com.google.common.collect.ImmutableSortedSet.C17636a;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;

public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements C17932da<K, V> {
    private static final long serialVersionUID = 0;
    private final transient ImmutableSet<V> emptySet;
    private transient ImmutableSet<Entry<K, V>> entries;
    private transient ImmutableSetMultimap<V, K> inverse;

    /* renamed from: com.google.common.collect.ImmutableSetMultimap$a */
    public static final class C17626a<K, V> extends C17600a<K, V> {
        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final Collection<V> mo45475c() {
            return C17898cj.m59510b();
        }

        /* renamed from: a */
        public final ImmutableSetMultimap<K, V> mo45433b() {
            Collection entrySet = this.f48706a.entrySet();
            if (this.f48707b != null) {
                entrySet = C17896ch.m59496a(this.f48707b).mo46251c().mo46249b(entrySet);
            }
            return ImmutableSetMultimap.fromMapEntries(entrySet, this.f48708c);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17626a<K, V> mo45430a(Entry<? extends K, ? extends V> entry) {
            super.mo45430a(entry);
            return this;
        }

        /* renamed from: a */
        public final C17626a<K, V> mo45431b(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            super.mo45431b(iterable);
            return this;
        }

        /* renamed from: a */
        public final C17626a<K, V> mo45432b(K k, V v) {
            super.mo45432b(k, v);
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSetMultimap$b */
    static final class C17627b<K, V> extends ImmutableSet<Entry<K, V>> {

        /* renamed from: a */
        private final transient ImmutableSetMultimap<K, V> f48758a;

        /* access modifiers changed from: 0000 */
        public final boolean isPartialView() {
            return false;
        }

        public final C17995dt<Entry<K, V>> iterator() {
            return this.f48758a.entryIterator();
        }

        public final int size() {
            return this.f48758a.size();
        }

        C17627b(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.f48758a = immutableSetMultimap;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f48758a.containsEntry(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSetMultimap$c */
    static final class C17628c {

        /* renamed from: a */
        static final C17930a<ImmutableSetMultimap> f48759a = C17928cz.m59552a(ImmutableSetMultimap.class, "emptySet");
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m58668of() {
        return C17727al.f48963a;
    }

    public static <K, V> C17626a<K, V> builder() {
        return new C17626a<>();
    }

    public ImmutableSet<Entry<K, V>> entries() {
        ImmutableSet<Entry<K, V>> immutableSet = this.entries;
        if (immutableSet != null) {
            return immutableSet;
        }
        C17627b bVar = new C17627b(this);
        this.entries = bVar;
        return bVar;
    }

    public ImmutableSetMultimap<V, K> inverse() {
        ImmutableSetMultimap<V, K> immutableSetMultimap = this.inverse;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<V, K> invert = invert();
        this.inverse = invert;
        return invert;
    }

    /* access modifiers changed from: 0000 */
    public Comparator<? super V> valueComparator() {
        if (this.emptySet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) this.emptySet).comparator();
        }
        return null;
    }

    private ImmutableSetMultimap<V, K> invert() {
        C17626a builder = builder();
        C17995dt it = entries().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            builder.mo45432b(entry.getValue(), entry.getKey());
        }
        ImmutableSetMultimap<V, K> a = builder.mo45433b();
        a.inverse = this;
        return a;
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(C17862by<? extends K, ? extends V> byVar) {
        return copyOf(byVar, null);
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        return new C17626a().mo45431b(iterable).mo45433b();
    }

    private static <V> ImmutableSet<V> emptySet(Comparator<? super V> comparator) {
        if (comparator == null) {
            return ImmutableSet.m58649of();
        }
        return ImmutableSortedSet.emptySet(comparator);
    }

    private static <V> C17622a<V> valuesBuilder(Comparator<? super V> comparator) {
        if (comparator == null) {
            return new C17622a<>();
        }
        return new C17636a(comparator);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        C17928cz.m59555a((C17862by<K, V>) this, objectOutputStream);
    }

    public ImmutableSet<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSet<V> get(K k) {
        return (ImmutableSet) C17430i.m57945a((ImmutableSet) this.map.get(k), this.emptySet);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C17591a builder = ImmutableMap.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    C17622a valuesBuilder = valuesBuilder(comparator);
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        valuesBuilder.mo45403b(objectInputStream.readObject());
                    }
                    ImmutableSet a = valuesBuilder.mo45556a();
                    if (a.size() == readInt2) {
                        builder.mo45375a(readObject, a);
                        i2 += readInt2;
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("Duplicate key-value pairs exist for key ");
                        sb.append(readObject);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                C17602c.f48710a.mo46285a(this, (Object) builder.mo45379b());
                C17602c.f48711b.mo46284a(this, i2);
                C17628c.f48759a.mo46285a(this, (Object) emptySet(comparator));
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Invalid key count ");
            sb3.append(readInt);
            throw new InvalidObjectException(sb3.toString());
        }
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m58669of(K k, V v) {
        C17626a builder = builder();
        builder.mo45432b(k, v);
        return builder.mo45433b();
    }

    private static <V> ImmutableSet<V> valueSet(Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return ImmutableSet.copyOf(collection);
        }
        return ImmutableSortedSet.copyOf(comparator, collection);
    }

    public ImmutableSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    private static <K, V> ImmutableSetMultimap<K, V> copyOf(C17862by<? extends K, ? extends V> byVar, Comparator<? super V> comparator) {
        C17439m.m57962a(byVar);
        if (byVar.isEmpty() && comparator == null) {
            return m58668of();
        }
        if (byVar instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap<K, V> immutableSetMultimap = (ImmutableSetMultimap) byVar;
            if (!immutableSetMultimap.isPartialView()) {
                return immutableSetMultimap;
            }
        }
        return fromMapEntries(byVar.asMap().entrySet(), comparator);
    }

    static <K, V> ImmutableSetMultimap<K, V> fromMapEntries(Collection<? extends Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m58668of();
        }
        C17591a aVar = new C17591a(collection.size());
        int i = 0;
        for (Entry entry : collection) {
            Object key = entry.getKey();
            ImmutableSet valueSet = valueSet(comparator, (Collection) entry.getValue());
            if (!valueSet.isEmpty()) {
                aVar.mo45375a(key, valueSet);
                i += valueSet.size();
            }
        }
        return new ImmutableSetMultimap<>(aVar.mo45379b(), i, comparator);
    }

    ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i, Comparator<? super V> comparator) {
        super(immutableMap, i);
        this.emptySet = emptySet(comparator);
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m58670of(K k, V v, K k2, V v2) {
        C17626a builder = builder();
        builder.mo45432b(k, v);
        builder.mo45432b(k2, v2);
        return builder.mo45433b();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m58671of(K k, V v, K k2, V v2, K k3, V v3) {
        C17626a builder = builder();
        builder.mo45432b(k, v);
        builder.mo45432b(k2, v2);
        builder.mo45432b(k3, v3);
        return builder.mo45433b();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m58672of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C17626a builder = builder();
        builder.mo45432b(k, v);
        builder.mo45432b(k2, v2);
        builder.mo45432b(k3, v3);
        builder.mo45432b(k4, v4);
        return builder.mo45433b();
    }

    /* renamed from: of */
    public static <K, V> ImmutableSetMultimap<K, V> m58673of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C17626a builder = builder();
        builder.mo45432b(k, v);
        builder.mo45432b(k2, v2);
        builder.mo45432b(k3, v3);
        builder.mo45432b(k4, v4);
        builder.mo45432b(k5, v5);
        return builder.mo45433b();
    }
}
