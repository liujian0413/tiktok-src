package com.google.common.collect;

import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.collect.C17986do.C17987a;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ArrayTable<R, C, V> extends C18045q<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    public final ImmutableMap<C, Integer> columnKeyToIndex;
    public final ImmutableList<C> columnList;
    private transient C17556c columnMap;
    public final ImmutableMap<R, Integer> rowKeyToIndex;
    public final ImmutableList<R> rowList;
    private transient C17558e rowMap;

    /* renamed from: com.google.common.collect.ArrayTable$a */
    static abstract class C17552a<K, V> extends C17854e<K, V> {

        /* renamed from: a */
        private final ImmutableMap<K, Integer> f48631a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract V mo45211a(int i, V v);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract String mo45212a();

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract V mo45213b(int i);

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public boolean isEmpty() {
            return this.f48631a.isEmpty();
        }

        public Set<K> keySet() {
            return this.f48631a.keySet();
        }

        public int size() {
            return this.f48631a.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Iterator<Entry<K, V>> mo45214b() {
            return new C17754b<Entry<K, V>>(size()) {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Entry<K, V> mo45206a(int i) {
                    return C17552a.this.mo45215c(i);
                }
            };
        }

        private C17552a(ImmutableMap<K, Integer> immutableMap) {
            this.f48631a = immutableMap;
        }

        public boolean containsKey(Object obj) {
            return this.f48631a.containsKey(obj);
        }

        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final K mo45210a(int i) {
            return this.f48631a.keySet().asList().get(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final Entry<K, V> mo45215c(final int i) {
            C17439m.m57960a(i, size());
            return new C18027g<K, V>() {
                public final K getKey() {
                    return C17552a.this.mo45210a(i);
                }

                public final V getValue() {
                    return C17552a.this.mo45213b(i);
                }

                public final V setValue(V v) {
                    return C17552a.this.mo45211a(i, v);
                }
            };
        }

        public V get(Object obj) {
            Integer num = (Integer) this.f48631a.get(obj);
            if (num == null) {
                return null;
            }
            return mo45213b(num.intValue());
        }

        public V put(K k, V v) {
            Integer num = (Integer) this.f48631a.get(k);
            if (num != null) {
                return mo45211a(num.intValue(), v);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(mo45212a());
            sb.append(" ");
            sb.append(k);
            sb.append(" not in ");
            sb.append(this.f48631a.keySet());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$b */
    class C17555b extends C17552a<R, V> {

        /* renamed from: a */
        final int f48635a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final String mo45212a() {
            return "Row";
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final V mo45213b(int i) {
            return ArrayTable.this.mo45173at(i, this.f48635a);
        }

        C17555b(int i) {
            super(ArrayTable.this.rowKeyToIndex);
            this.f48635a = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo45211a(int i, V v) {
            return ArrayTable.this.set(i, this.f48635a, v);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$c */
    class C17556c extends C17552a<C, Map<R, V>> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final String mo45212a() {
            return "Column";
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public Map<R, V> mo45213b(int i) {
            return new C17555b(i);
        }

        private C17556c() {
            super(ArrayTable.this.columnKeyToIndex);
        }

        /* renamed from: a */
        private static Map<R, V> m58463a(int i, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ Object put(Object obj, Object obj2) {
            return m58464a((C) obj, (Map) obj2);
        }

        /* renamed from: a */
        private static Map<R, V> m58464a(C c, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo45211a(int i, Object obj) {
            return m58463a(i, (Map) obj);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$d */
    class C17557d extends C17552a<C, V> {

        /* renamed from: a */
        final int f48638a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final String mo45212a() {
            return "Column";
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final V mo45213b(int i) {
            return ArrayTable.this.mo45173at(this.f48638a, i);
        }

        C17557d(int i) {
            super(ArrayTable.this.columnKeyToIndex);
            this.f48638a = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final V mo45211a(int i, V v) {
            return ArrayTable.this.set(this.f48638a, i, v);
        }
    }

    /* renamed from: com.google.common.collect.ArrayTable$e */
    class C17558e extends C17552a<R, Map<C, V>> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final String mo45212a() {
            return "Row";
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public Map<C, V> mo45213b(int i) {
            return new C17557d(i);
        }

        private C17558e() {
            super(ArrayTable.this.rowKeyToIndex);
        }

        /* renamed from: a */
        private static Map<C, V> m58472a(int i, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ Object put(Object obj, Object obj2) {
            return m58473a((R) obj, (Map) obj2);
        }

        /* renamed from: a */
        private static Map<C, V> m58473a(R r, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo45211a(int i, Object obj) {
            return m58472a(i, (Map) obj);
        }
    }

    public final ImmutableList<C> columnKeyList() {
        return this.columnList;
    }

    public final ImmutableList<R> rowKeyList() {
        return this.rowList;
    }

    public final Set<C17987a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final ImmutableSet<C> columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final ImmutableSet<R> rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public final Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<C17987a<R, C, V>> cellIterator() {
        return new C17754b<C17987a<R, C, V>>(size()) {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public C17987a<R, C, V> mo45206a(int i) {
                return ArrayTable.this.getCell(i);
            }
        };
    }

    public final Map<C, Map<R, V>> columnMap() {
        C17556c cVar = this.columnMap;
        if (cVar != null) {
            return cVar;
        }
        C17556c cVar2 = new C17556c<>();
        this.columnMap = cVar2;
        return cVar2;
    }

    public final void eraseAll() {
        for (V[] fill : this.array) {
            Arrays.fill(fill, null);
        }
    }

    public final Map<R, Map<C, V>> rowMap() {
        C17558e eVar = this.rowMap;
        if (eVar != null) {
            return eVar;
        }
        C17558e eVar2 = new C17558e<>();
        this.rowMap = eVar2;
        return eVar2;
    }

    public final int size() {
        return this.rowList.size() * this.columnList.size();
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<V> valuesIterator() {
        return new C17754b<V>(size()) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final V mo45206a(int i) {
                return ArrayTable.this.getValue(i);
            }
        };
    }

    public final boolean isEmpty() {
        if (this.rowList.isEmpty() || this.columnList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void putAll(C17986do<? extends R, ? extends C, ? extends V> doVar) {
        super.putAll(doVar);
    }

    public final boolean containsColumn(Object obj) {
        return this.columnKeyToIndex.containsKey(obj);
    }

    public final boolean containsRow(Object obj) {
        return this.rowKeyToIndex.containsKey(obj);
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final C17987a<R, C, V> getCell(final int i) {
        return new C17990a<R, C, V>() {

            /* renamed from: a */
            final int f48626a = (i / ArrayTable.this.columnList.size());

            /* renamed from: b */
            final int f48627b = (i % ArrayTable.this.columnList.size());

            /* renamed from: a */
            public final R mo45207a() {
                return ArrayTable.this.rowList.get(this.f48626a);
            }

            /* renamed from: b */
            public final C mo45208b() {
                return ArrayTable.this.columnList.get(this.f48627b);
            }

            /* renamed from: c */
            public final V mo45209c() {
                return ArrayTable.this.mo45173at(this.f48626a, this.f48627b);
            }
        };
    }

    private ArrayTable(C17986do<R, C, V> doVar) {
        this(doVar.rowKeySet(), doVar.columnKeySet());
        putAll(doVar);
    }

    public static <R, C, V> ArrayTable<R, C, V> create(C17986do<R, C, V> doVar) {
        if (doVar instanceof ArrayTable) {
            return new ArrayTable<>((ArrayTable) doVar);
        }
        return new ArrayTable<>(doVar);
    }

    public final Map<R, V> column(C c) {
        C17439m.m57962a(c);
        Integer num = (Integer) this.columnKeyToIndex.get(c);
        if (num == null) {
            return ImmutableMap.m58576of();
        }
        return new C17555b(num.intValue());
    }

    public final boolean containsValue(Object obj) {
        V[][] vArr;
        for (V[] vArr2 : this.array) {
            for (V a : vArr[r3]) {
                if (C17434j.m57955a(obj, a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final V getValue(int i) {
        return mo45173at(i / this.columnList.size(), i % this.columnList.size());
    }

    public final Map<C, V> row(R r) {
        C17439m.m57962a(r);
        Integer num = (Integer) this.rowKeyToIndex.get(r);
        if (num == null) {
            return ImmutableMap.m58576of();
        }
        return new C17557d(num.intValue());
    }

    public final V[][] toArray(Class<V> cls) {
        V[][] vArr = (Object[][]) Array.newInstance(cls, new int[]{this.rowList.size(), this.columnList.size()});
        for (int i = 0; i < this.rowList.size(); i++) {
            System.arraycopy(this.array[i], 0, vArr[i], 0, this.array[i].length);
        }
        return vArr;
    }

    private ArrayTable(ArrayTable<R, C, V> arrayTable) {
        this.rowList = arrayTable.rowList;
        this.columnList = arrayTable.columnList;
        this.rowKeyToIndex = arrayTable.rowKeyToIndex;
        this.columnKeyToIndex = arrayTable.columnKeyToIndex;
        V[][] vArr = (Object[][]) Array.newInstance(Object.class, new int[]{this.rowList.size(), this.columnList.size()});
        this.array = vArr;
        for (int i = 0; i < this.rowList.size(); i++) {
            System.arraycopy(arrayTable.array[i], 0, vArr[i], 0, arrayTable.array[i].length);
        }
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new ArrayTable<>(iterable, iterable2);
    }

    public final V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj, Object obj2) {
        if (!containsRow(obj) || !containsColumn(obj2)) {
            return false;
        }
        return true;
    }

    /* renamed from: at */
    public final V mo45173at(int i, int i2) {
        C17439m.m57960a(i, this.rowList.size());
        C17439m.m57960a(i2, this.columnList.size());
        return this.array[i][i2];
    }

    public final V erase(Object obj, Object obj2) {
        Integer num = (Integer) this.rowKeyToIndex.get(obj);
        Integer num2 = (Integer) this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), null);
    }

    public final V get(Object obj, Object obj2) {
        Integer num = (Integer) this.rowKeyToIndex.get(obj);
        Integer num2 = (Integer) this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return mo45173at(num.intValue(), num2.intValue());
    }

    private ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        boolean z;
        this.rowList = ImmutableList.copyOf(iterable);
        this.columnList = ImmutableList.copyOf(iterable2);
        if (this.rowList.isEmpty() == this.columnList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57968a(z);
        this.rowKeyToIndex = C17839bx.m59328a((Collection<E>) this.rowList);
        this.columnKeyToIndex = C17839bx.m59328a((Collection<E>) this.columnList);
        this.array = (Object[][]) Array.newInstance(Object.class, new int[]{this.rowList.size(), this.columnList.size()});
        eraseAll();
    }

    public final V set(int i, int i2, V v) {
        C17439m.m57960a(i, this.rowList.size());
        C17439m.m57960a(i2, this.columnList.size());
        V v2 = this.array[i][i2];
        this.array[i][i2] = v;
        return v2;
    }

    public final V put(R r, C c, V v) {
        boolean z;
        C17439m.m57962a(r);
        C17439m.m57962a(c);
        Integer num = (Integer) this.rowKeyToIndex.get(r);
        boolean z2 = false;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57977a(z, "Row %s not in %s", (Object) r, (Object) this.rowList);
        Integer num2 = (Integer) this.columnKeyToIndex.get(c);
        if (num2 != null) {
            z2 = true;
        }
        C17439m.m57977a(z2, "Column %s not in %s", (Object) c, (Object) this.columnList);
        return set(num.intValue(), num2.intValue(), v);
    }
}
