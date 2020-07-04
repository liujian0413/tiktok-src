package com.google.common.collect;

import com.google.common.base.C17457s;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashBasedTable<R, C, V> extends C17964dn<R, C, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.collect.HashBasedTable$a */
    static class C17568a<C, V> implements C17457s<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final int f48657a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Map<C, V> mo44946a() {
            return C17839bx.m59350c(this.f48657a);
        }

        C17568a(int i) {
            this.f48657a = i;
        }
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
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

    public /* bridge */ /* synthetic */ Set rowKeySet() {
        return super.rowKeySet();
    }

    public /* bridge */ /* synthetic */ Map rowMap() {
        return super.rowMap();
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

    public static <R, C, V> HashBasedTable<R, C, V> create() {
        return new HashBasedTable<>(new LinkedHashMap(), new C17568a(0));
    }

    public /* bridge */ /* synthetic */ void putAll(C17986do doVar) {
        super.putAll(doVar);
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(C17986do<? extends R, ? extends C, ? extends V> doVar) {
        HashBasedTable<R, C, V> create = create();
        create.putAll(doVar);
        return create;
    }

    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    public boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    public boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ Map row(Object obj) {
        return super.row(obj);
    }

    HashBasedTable(Map<R, Map<C, V>> map, C17568a<C, V> aVar) {
        super(map, aVar);
    }

    public boolean contains(Object obj, Object obj2) {
        return super.contains(obj, obj2);
    }

    public V get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    public V remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public static <R, C, V> HashBasedTable<R, C, V> create(int i, int i2) {
        C18053v.m59700a(i2, "expectedCellsPerRow");
        return new HashBasedTable<>(C17839bx.m59350c(i), new C17568a(i2));
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }
}
