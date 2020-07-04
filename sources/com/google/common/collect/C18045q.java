package com.google.common.collect;

import com.google.common.collect.C17986do.C17987a;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.q */
abstract class C18045q<R, C, V> implements C17986do<R, C, V> {
    private transient Set<C17987a<R, C, V>> cellSet;
    private transient Collection<V> values;

    /* renamed from: com.google.common.collect.q$a */
    class C18047a extends AbstractSet<C17987a<R, C, V>> {
        public final void clear() {
            C18045q.this.clear();
        }

        public final Iterator<C17987a<R, C, V>> iterator() {
            return C18045q.this.cellIterator();
        }

        public final int size() {
            return C18045q.this.size();
        }

        C18047a() {
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof C17987a)) {
                return false;
            }
            C17987a aVar = (C17987a) obj;
            Map map = (Map) C17839bx.m59331a(C18045q.this.rowMap(), aVar.mo45207a());
            if (map == null || !C18054w.m59710a((Collection<?>) map.entrySet(), (Object) C17839bx.m59337a(aVar.mo45208b(), aVar.mo45209c()))) {
                return false;
            }
            return true;
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof C17987a)) {
                return false;
            }
            C17987a aVar = (C17987a) obj;
            Map map = (Map) C17839bx.m59331a(C18045q.this.rowMap(), aVar.mo45207a());
            if (map == null || !C18054w.m59712b(map.entrySet(), C17839bx.m59337a(aVar.mo45208b(), aVar.mo45209c()))) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.common.collect.q$b */
    class C18048b extends AbstractCollection<V> {
        public final void clear() {
            C18045q.this.clear();
        }

        public final Iterator<V> iterator() {
            return C18045q.this.valuesIterator();
        }

        public final int size() {
            return C18045q.this.size();
        }

        C18048b() {
        }

        public final boolean contains(Object obj) {
            return C18045q.this.containsValue(obj);
        }
    }

    C18045q() {
    }

    /* access modifiers changed from: 0000 */
    public abstract Iterator<C17987a<R, C, V>> cellIterator();

    /* access modifiers changed from: 0000 */
    public Set<C17987a<R, C, V>> createCellSet() {
        return new C18047a();
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> createValues() {
        return new C18048b();
    }

    public Set<C17987a<R, C, V>> cellSet() {
        Set<C17987a<R, C, V>> set = this.cellSet;
        if (set != null) {
            return set;
        }
        Set<C17987a<R, C, V>> createCellSet = createCellSet();
        this.cellSet = createCellSet;
        return createCellSet;
    }

    public void clear() {
        C17782br.m59133h(cellSet().iterator());
    }

    public Set<C> columnKeySet() {
        return columnMap().keySet();
    }

    public int hashCode() {
        return cellSet().hashCode();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    public String toString() {
        return rowMap().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    /* access modifiers changed from: 0000 */
    public Iterator<V> valuesIterator() {
        return new C17992dq<C17987a<R, C, V>, V>(cellSet().iterator()) {
            /* renamed from: a */
            private static V m59698a(C17987a<R, C, V> aVar) {
                return aVar.mo45209c();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo45666a(Object obj) {
                return m59698a((C17987a) obj);
            }
        };
    }

    public boolean equals(Object obj) {
        return C17988dp.m59630a(this, obj);
    }

    public boolean containsColumn(Object obj) {
        return C17839bx.m59347b(columnMap(), obj);
    }

    public boolean containsRow(Object obj) {
        return C17839bx.m59347b(rowMap(), obj);
    }

    public boolean containsValue(Object obj) {
        for (Map containsValue : rowMap().values()) {
            if (containsValue.containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public void putAll(C17986do<? extends R, ? extends C, ? extends V> doVar) {
        for (C17987a aVar : doVar.cellSet()) {
            put(aVar.mo45207a(), aVar.mo45208b(), aVar.mo45209c());
        }
    }

    public boolean contains(Object obj, Object obj2) {
        Map map = (Map) C17839bx.m59331a(rowMap(), obj);
        if (map == null || !C17839bx.m59347b(map, obj2)) {
            return false;
        }
        return true;
    }

    public V get(Object obj, Object obj2) {
        Map map = (Map) C17839bx.m59331a(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return C17839bx.m59331a(map, obj2);
    }

    public V remove(Object obj, Object obj2) {
        Map map = (Map) C17839bx.m59331a(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return C17839bx.m59348c(map, obj2);
    }

    public V put(R r, C c, V v) {
        return row(r).put(c, v);
    }
}
