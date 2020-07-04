package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.C17986do.C17987a;
import java.util.Map;

/* renamed from: com.google.common.collect.dd */
final class C17939dd<R, C, V> extends ImmutableTable<R, C, V> {

    /* renamed from: a */
    final R f49236a;

    /* renamed from: b */
    final C f49237b;

    /* renamed from: c */
    final V f49238c;

    public final int size() {
        return 1;
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableCollection<V> createValues() {
        return ImmutableSet.m58650of(this.f49238c);
    }

    public final ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.m58577of(this.f49237b, ImmutableMap.m58577of(this.f49236a, this.f49238c));
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<C17987a<R, C, V>> createCellSet() {
        return ImmutableSet.m58650of(cellOf(this.f49236a, this.f49237b, this.f49238c));
    }

    /* access modifiers changed from: 0000 */
    public final C17639b createSerializedForm() {
        return C17639b.m58757a(this, new int[]{0}, new int[]{0});
    }

    public final ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.m58577of(this.f49236a, ImmutableMap.m58577of(this.f49237b, this.f49238c));
    }

    C17939dd(C17987a<R, C, V> aVar) {
        this(aVar.mo45207a(), aVar.mo45208b(), aVar.mo45209c());
    }

    public final ImmutableMap<R, V> column(C c) {
        C17439m.m57962a(c);
        if (containsColumn(c)) {
            return ImmutableMap.m58577of(this.f49236a, this.f49238c);
        }
        return ImmutableMap.m58576of();
    }

    C17939dd(R r, C c, V v) {
        this.f49236a = C17439m.m57962a(r);
        this.f49237b = C17439m.m57962a(c);
        this.f49238c = C17439m.m57962a(v);
    }
}
