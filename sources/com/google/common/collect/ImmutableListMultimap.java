package com.google.common.collect;

import com.google.common.collect.ImmutableList.C17584a;
import com.google.common.collect.ImmutableMap.C17591a;
import com.google.common.collect.ImmutableMultimap.C17600a;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;

public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements C17794bt<K, V> {
    private static final long serialVersionUID = 0;
    private transient ImmutableListMultimap<V, K> inverse;

    /* renamed from: com.google.common.collect.ImmutableListMultimap$a */
    public static final class C17589a<K, V> extends C17600a<K, V> {
        /* renamed from: a */
        public final ImmutableListMultimap<K, V> mo45433b() {
            return (ImmutableListMultimap) super.mo45433b();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17589a<K, V> mo45430a(Entry<? extends K, ? extends V> entry) {
            super.mo45430a(entry);
            return this;
        }

        /* renamed from: a */
        public final C17589a<K, V> mo45431b(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            super.mo45431b(iterable);
            return this;
        }

        /* renamed from: a */
        public final C17589a<K, V> mo45432b(K k, V v) {
            super.mo45432b(k, v);
            return this;
        }
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m58562of() {
        return C17726ak.f48962a;
    }

    public static <K, V> C17589a<K, V> builder() {
        return new C17589a<>();
    }

    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> invert = invert();
        this.inverse = invert;
        return invert;
    }

    private ImmutableListMultimap<V, K> invert() {
        C17589a builder = builder();
        C17995dt it = entries().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            builder.mo45432b(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> a = builder.mo45433b();
        a.inverse = this;
        return a;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C17928cz.m59555a((C17862by<K, V>) this, objectOutputStream);
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
        return new C17589a().mo45431b(iterable).mo45433b();
    }

    public ImmutableList<V> get(K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k);
        if (immutableList == null) {
            return ImmutableList.m58536of();
        }
        return immutableList;
    }

    public ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(C17862by<? extends K, ? extends V> byVar) {
        if (byVar.isEmpty()) {
            return m58562of();
        }
        if (byVar instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) byVar;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(byVar.asMap().entrySet(), null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C17591a builder = ImmutableMap.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    C17584a builder2 = ImmutableList.builder();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        builder2.mo45403b(objectInputStream.readObject());
                    }
                    builder.mo45375a(readObject, builder2.mo45418a());
                    i2 += readInt2;
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                C17602c.f48710a.mo46285a(this, (Object) builder.mo45379b());
                C17602c.f48711b.mo46284a(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Invalid key count ");
            sb2.append(readInt);
            throw new InvalidObjectException(sb2.toString());
        }
    }

    ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m58563of(K k, V v) {
        C17589a builder = builder();
        builder.mo45432b(k, v);
        return builder.mo45433b();
    }

    public ImmutableList<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        ImmutableList immutableList;
        if (collection.isEmpty()) {
            return m58562of();
        }
        C17591a aVar = new C17591a(collection.size());
        int i = 0;
        for (Entry entry : collection) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                immutableList = ImmutableList.copyOf(collection2);
            } else {
                immutableList = ImmutableList.sortedCopyOf(comparator, collection2);
            }
            if (!immutableList.isEmpty()) {
                aVar.mo45375a(key, immutableList);
                i += immutableList.size();
            }
        }
        return new ImmutableListMultimap<>(aVar.mo45379b(), i);
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m58564of(K k, V v, K k2, V v2) {
        C17589a builder = builder();
        builder.mo45432b(k, v);
        builder.mo45432b(k2, v2);
        return builder.mo45433b();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m58565of(K k, V v, K k2, V v2, K k3, V v3) {
        C17589a builder = builder();
        builder.mo45432b(k, v);
        builder.mo45432b(k2, v2);
        builder.mo45432b(k3, v3);
        return builder.mo45433b();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m58566of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C17589a builder = builder();
        builder.mo45432b(k, v);
        builder.mo45432b(k2, v2);
        builder.mo45432b(k3, v3);
        builder.mo45432b(k4, v4);
        return builder.mo45433b();
    }

    /* renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m58567of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C17589a builder = builder();
        builder.mo45432b(k, v);
        builder.mo45432b(k2, v2);
        builder.mo45432b(k3, v3);
        builder.mo45432b(k4, v4);
        builder.mo45432b(k5, v5);
        return builder.mo45433b();
    }
}
