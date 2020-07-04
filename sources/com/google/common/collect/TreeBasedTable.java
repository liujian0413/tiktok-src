package com.google.common.collect;

import com.google.common.base.C17427g;
import com.google.common.base.C17439m;
import com.google.common.base.C17457s;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class TreeBasedTable<R, C, V> extends C17961dm<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> columnComparator;

    /* renamed from: com.google.common.collect.TreeBasedTable$a */
    static class C17665a<C, V> implements C17457s<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Comparator<? super C> f48852a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public TreeMap<C, V> mo44946a() {
            return new TreeMap<>(this.f48852a);
        }

        C17665a(Comparator<? super C> comparator) {
            this.f48852a = comparator;
        }
    }

    /* renamed from: com.google.common.collect.TreeBasedTable$b */
    class C17666b extends C17979f implements SortedMap<C, V> {

        /* renamed from: d */
        final C f48853d;

        /* renamed from: e */
        final C f48854e;

        /* renamed from: f */
        transient SortedMap<C, V> f48855f;

        /* access modifiers changed from: private */
        /* renamed from: e */
        public SortedSet<C> keySet() {
            return new C17858h(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public SortedMap<C, V> mo45721a() {
            return (SortedMap) super.mo45721a();
        }

        public final Comparator<? super C> comparator() {
            return TreeBasedTable.this.columnComparator();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public SortedMap<C, V> mo45722c() {
            SortedMap<C, V> f = m58804f();
            if (f == null) {
                return null;
            }
            if (this.f48853d != null) {
                f = f.tailMap(this.f48853d);
            }
            if (this.f48854e != null) {
                f = f.headMap(this.f48854e);
            }
            return f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo45725d() {
            if (m58804f() != null && this.f48855f.isEmpty()) {
                TreeBasedTable.this.backingMap.remove(this.f49278a);
                this.f48855f = null;
                this.f49279b = null;
            }
        }

        public final C firstKey() {
            if (mo45721a() != null) {
                return mo45721a().firstKey();
            }
            throw new NoSuchElementException();
        }

        public final C lastKey() {
            if (mo45721a() != null) {
                return mo45721a().lastKey();
            }
            throw new NoSuchElementException();
        }

        /* renamed from: f */
        private SortedMap<C, V> m58804f() {
            if (this.f48855f == null || (this.f48855f.isEmpty() && TreeBasedTable.this.backingMap.containsKey(this.f49278a))) {
                this.f48855f = (SortedMap) TreeBasedTable.this.backingMap.get(this.f49278a);
            }
            return this.f48855f;
        }

        public final boolean containsKey(Object obj) {
            if (!m58802a(obj) || !super.containsKey(obj)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private boolean m58802a(Object obj) {
            if (obj == null || ((this.f48853d != null && m58801a(this.f48853d, obj) > 0) || (this.f48854e != null && m58801a(this.f48854e, obj) <= 0))) {
                return false;
            }
            return true;
        }

        public final SortedMap<C, V> headMap(C c) {
            C17439m.m57968a(m58802a(C17439m.m57962a(c)));
            return new C17666b(this.f49278a, this.f48853d, c);
        }

        public final SortedMap<C, V> tailMap(C c) {
            C17439m.m57968a(m58802a(C17439m.m57962a(c)));
            return new C17666b(this.f49278a, c, this.f48854e);
        }

        C17666b(TreeBasedTable treeBasedTable, R r) {
            this(r, null, null);
        }

        /* renamed from: a */
        private int m58801a(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        public final V put(C c, V v) {
            C17439m.m57968a(m58802a(C17439m.m57962a(c)));
            return super.put(c, v);
        }

        public final SortedMap<C, V> subMap(C c, C c2) {
            boolean z;
            if (!m58802a(C17439m.m57962a(c)) || !m58802a(C17439m.m57962a(c2))) {
                z = false;
            } else {
                z = true;
            }
            C17439m.m57968a(z);
            return new C17666b(this.f49278a, c, c2);
        }

        private C17666b(R r, C c, C c2) {
            boolean z;
            super(r);
            this.f48853d = c;
            this.f48854e = c2;
            if (c == null || c2 == null || m58801a(c, c2) <= 0) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57968a(z);
        }
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public Comparator<? super C> columnComparator() {
        return this.columnComparator;
    }

    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> create() {
        return new TreeBasedTable<>(C17896ch.m59497b(), C17896ch.m59497b());
    }

    public Comparator<? super R> rowComparator() {
        return rowKeySet().comparator();
    }

    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    /* access modifiers changed from: 0000 */
    public Iterator<C> createColumnKeyIterator() {
        final Comparator columnComparator2 = columnComparator();
        final C17995dt a = C17782br.m59109a(C17777bq.m59088a((Iterable<F>) this.backingMap.values(), (C17427g<? super F, ? extends T>) new C17427g<Map<C, V>, Iterator<C>>() {
            /* renamed from: b */
            public final /* synthetic */ Object mo44914b(Object obj) {
                return m58796a((Map) obj);
            }

            /* renamed from: a */
            private static Iterator<C> m58796a(Map<C, V> map) {
                return map.keySet().iterator();
            }
        }), columnComparator2);
        return new C17870c<C>() {

            /* renamed from: a */
            C f48848a;

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final C mo45252a() {
                boolean z;
                while (a.hasNext()) {
                    C next = a.next();
                    if (this.f48848a == null || columnComparator2.compare(next, this.f48848a) != 0) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (!z) {
                        this.f48848a = next;
                        return this.f48848a;
                    }
                }
                this.f48848a = null;
                return mo46191b();
            }
        };
    }

    public /* bridge */ /* synthetic */ void putAll(C17986do doVar) {
        super.putAll(doVar);
    }

    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public SortedMap<C, V> row(R r) {
        return new C17666b(this, r);
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(TreeBasedTable<R, C, ? extends V> treeBasedTable) {
        TreeBasedTable<R, C, V> treeBasedTable2 = new TreeBasedTable<>(treeBasedTable.rowComparator(), treeBasedTable.columnComparator());
        treeBasedTable2.putAll(treeBasedTable);
        return treeBasedTable2;
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj, Object obj2) {
        return super.contains(obj, obj2);
    }

    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    public /* bridge */ /* synthetic */ Object remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    TreeBasedTable(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new C17665a(comparator2));
        this.columnComparator = comparator2;
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        C17439m.m57962a(comparator);
        C17439m.m57962a(comparator2);
        return new TreeBasedTable<>(comparator, comparator2);
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }
}
