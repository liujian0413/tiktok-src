package com.google.common.collect;

import com.google.common.base.C17430i;
import com.google.common.base.C17439m;
import com.google.common.collect.C17986do.C17987a;
import com.google.common.collect.ImmutableList.C17584a;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class ImmutableTable<R, C, V> extends C18045q<R, C, V> implements Serializable {

    /* renamed from: com.google.common.collect.ImmutableTable$a */
    public static final class C17638a<R, C, V> {

        /* renamed from: a */
        private final List<C17987a<R, C, V>> f48778a = C17795bu.m59142a();

        /* renamed from: b */
        private Comparator<? super R> f48779b;

        /* renamed from: c */
        private Comparator<? super C> f48780c;

        /* renamed from: a */
        public final ImmutableTable<R, C, V> mo45629a() {
            switch (this.f48778a.size()) {
                case 0:
                    return ImmutableTable.m58752of();
                case 1:
                    return new C17939dd((C17987a) C17777bq.m59099b(this.f48778a));
                default:
                    return C17921cv.m59536a(this.f48778a, this.f48779b, this.f48780c);
            }
        }

        /* renamed from: a */
        public final C17638a<R, C, V> mo45628a(C17987a<? extends R, ? extends C, ? extends V> aVar) {
            if (aVar instanceof C17991b) {
                C17439m.m57962a(aVar.mo45207a());
                C17439m.m57962a(aVar.mo45208b());
                C17439m.m57962a(aVar.mo45209c());
                this.f48778a.add(aVar);
            } else {
                m58754a(aVar.mo45207a(), aVar.mo45208b(), aVar.mo45209c());
            }
            return this;
        }

        /* renamed from: a */
        private C17638a<R, C, V> m58754a(R r, C c, V v) {
            this.f48778a.add(ImmutableTable.cellOf(r, c, v));
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableTable$b */
    static final class C17639b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Object[] f48781a;

        /* renamed from: b */
        private final Object[] f48782b;

        /* renamed from: c */
        private final Object[] f48783c;

        /* renamed from: d */
        private final int[] f48784d;

        /* renamed from: e */
        private final int[] f48785e;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            if (this.f48783c.length == 0) {
                return ImmutableTable.m58752of();
            }
            if (this.f48783c.length == 1) {
                return ImmutableTable.m58753of(this.f48781a[0], this.f48782b[0], this.f48783c[0]);
            }
            C17584a aVar = new C17584a(this.f48783c.length);
            for (int i = 0; i < this.f48783c.length; i++) {
                aVar.mo45403b(ImmutableTable.cellOf(this.f48781a[this.f48784d[i]], this.f48782b[this.f48785e[i]], this.f48783c[i]));
            }
            return C17921cv.m59534a(aVar.mo45418a(), ImmutableSet.copyOf((E[]) this.f48781a), ImmutableSet.copyOf((E[]) this.f48782b));
        }

        /* renamed from: a */
        static C17639b m58757a(ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            C17639b bVar = new C17639b(immutableTable.rowKeySet().toArray(), immutableTable.columnKeySet().toArray(), immutableTable.values().toArray(), iArr, iArr2);
            return bVar;
        }

        private C17639b(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.f48781a = objArr;
            this.f48782b = objArr2;
            this.f48783c = objArr3;
            this.f48784d = iArr;
            this.f48785e = iArr2;
        }
    }

    ImmutableTable() {
    }

    /* renamed from: of */
    public static <R, C, V> ImmutableTable<R, C, V> m58752of() {
        return C17960dl.f49250a;
    }

    public abstract ImmutableMap<C, Map<R, V>> columnMap();

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSet<C17987a<R, C, V>> createCellSet();

    /* access modifiers changed from: 0000 */
    public abstract C17639b createSerializedForm();

    /* access modifiers changed from: 0000 */
    public abstract ImmutableCollection<V> createValues();

    public abstract ImmutableMap<R, Map<C, V>> rowMap();

    public static <R, C, V> C17638a<R, C, V> builder() {
        return new C17638a<>();
    }

    /* access modifiers changed from: 0000 */
    public final C17995dt<C17987a<R, C, V>> cellIterator() {
        throw new AssertionError("should never be called");
    }

    public ImmutableSet<C17987a<R, C, V>> cellSet() {
        return (ImmutableSet) super.cellSet();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<V> valuesIterator() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return createSerializedForm();
    }

    public ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    public ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final void putAll(C17986do<? extends R, ? extends C, ? extends V> doVar) {
        throw new UnsupportedOperationException();
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(C17986do<? extends R, ? extends C, ? extends V> doVar) {
        if (doVar instanceof ImmutableTable) {
            return (ImmutableTable) doVar;
        }
        return copyOf((Iterable<? extends C17987a<? extends R, ? extends C, ? extends V>>) doVar.cellSet());
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    private static <R, C, V> ImmutableTable<R, C, V> copyOf(Iterable<? extends C17987a<? extends R, ? extends C, ? extends V>> iterable) {
        C17638a builder = builder();
        for (C17987a a : iterable) {
            builder.mo45628a(a);
        }
        return builder.mo45629a();
    }

    public ImmutableMap<R, V> column(C c) {
        C17439m.m57962a(c);
        return (ImmutableMap) C17430i.m57945a((ImmutableMap) columnMap().get(c), ImmutableMap.m58576of());
    }

    public ImmutableMap<C, V> row(R r) {
        C17439m.m57962a(r);
        return (ImmutableMap) C17430i.m57945a((ImmutableMap) rowMap().get(r), ImmutableMap.m58576of());
    }

    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    public final V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj, Object obj2) {
        if (get(obj, obj2) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: of */
    public static <R, C, V> ImmutableTable<R, C, V> m58753of(R r, C c, V v) {
        return new C17939dd(r, c, v);
    }

    public final V put(R r, C c, V v) {
        throw new UnsupportedOperationException();
    }

    static <R, C, V> C17987a<R, C, V> cellOf(R r, C c, V v) {
        return C17988dp.m59629a(C17439m.m57962a(r), C17439m.m57962a(c), C17439m.m57962a(v));
    }
}
