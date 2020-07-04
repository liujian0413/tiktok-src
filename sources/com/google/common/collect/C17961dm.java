package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.base.C17457s;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.dm */
class C17961dm<R, C, V> extends C17964dn<R, C, V> implements C17927cy<R, C, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.collect.dm$a */
    class C17963a extends C17982g implements SortedMap<R, Map<C, V>> {
        /* access modifiers changed from: private */
        /* renamed from: c */
        public SortedSet<R> keySet() {
            return (SortedSet) super.keySet();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public SortedSet<R> mo45866e() {
            return new C17858h(this);
        }

        public final Comparator<? super R> comparator() {
            return C17961dm.this.sortedBackingMap().comparator();
        }

        public final R firstKey() {
            return C17961dm.this.sortedBackingMap().firstKey();
        }

        public final R lastKey() {
            return C17961dm.this.sortedBackingMap().lastKey();
        }

        private C17963a() {
            super();
        }

        public final SortedMap<R, Map<C, V>> headMap(R r) {
            C17439m.m57962a(r);
            return new C17961dm(C17961dm.this.sortedBackingMap().headMap(r), C17961dm.this.factory).rowMap();
        }

        public final SortedMap<R, Map<C, V>> tailMap(R r) {
            C17439m.m57962a(r);
            return new C17961dm(C17961dm.this.sortedBackingMap().tailMap(r), C17961dm.this.factory).rowMap();
        }

        public final SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            C17439m.m57962a(r);
            C17439m.m57962a(r2);
            return new C17961dm(C17961dm.this.sortedBackingMap().subMap(r, r2), C17961dm.this.factory).rowMap();
        }
    }

    public SortedMap<R, Map<C, V>> sortedBackingMap() {
        return (SortedMap) this.backingMap;
    }

    /* access modifiers changed from: 0000 */
    public SortedMap<R, Map<C, V>> createRowMap() {
        return new C17963a();
    }

    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }

    C17961dm(SortedMap<R, Map<C, V>> sortedMap, C17457s<? extends Map<C, V>> sVar) {
        super(sortedMap, sVar);
    }
}
