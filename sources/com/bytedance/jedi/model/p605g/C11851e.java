package com.bytedance.jedi.model.p605g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7513am;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.model.g.e */
public final class C11851e<T> implements C11848b<T> {

    /* renamed from: a */
    public static final C11852a f31652a = new C11852a(null);

    /* renamed from: b */
    private T f31653b;

    /* renamed from: c */
    private final LinkedHashSet<Pair<C11847a<?>, Long>> f31654c;

    /* renamed from: com.bytedance.jedi.model.g.e$a */
    public static final class C11852a {
        private C11852a() {
        }

        public /* synthetic */ C11852a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static <T> C11848b<T> m34630a(T t, C11848b<?> bVar) {
            C7573i.m23587b(bVar, "parent");
            return bVar.mo29375a(t);
        }
    }

    /* renamed from: a */
    public final T mo29376a() {
        return this.f31653b;
    }

    /* renamed from: b */
    public final Pair<C11847a<?>, Long> mo29378b() {
        LinkedHashSet<Pair<C11847a<?>, Long>> linkedHashSet = this.f31654c;
        if (!linkedHashSet.isEmpty()) {
            return (Pair) C7525m.m23503c((Iterable<? extends T>) linkedHashSet);
        }
        return null;
    }

    /* renamed from: a */
    public final <V> C11848b<V> mo29375a(V v) {
        if (C7573i.m23585a((Object) this.f31653b, (Object) v)) {
            return this;
        }
        int size = this.f31654c.size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = (Pair) C7525m.m23499b((Iterable<? extends T>) this.f31654c, i);
        }
        return new C11851e<>(v, C7513am.m23411b(pairArr));
    }

    /* renamed from: b */
    public final boolean mo29379b(C11847a<T> aVar) {
        C7573i.m23587b(aVar, "point");
        return this.f31654c.add(C7579l.m23633a(aVar, Long.valueOf(System.currentTimeMillis())));
    }

    /* renamed from: a */
    public final boolean mo29377a(C11847a<?> aVar) {
        C7573i.m23587b(aVar, "point");
        Iterable<Pair> iterable = this.f31654c;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (Pair first : iterable) {
            arrayList.add((C11847a) first.getFirst());
        }
        return ((List) arrayList).contains(aVar);
    }

    private C11851e(T t, LinkedHashSet<Pair<C11847a<?>, Long>> linkedHashSet) {
        this.f31653b = t;
        this.f31654c = linkedHashSet;
    }

    public /* synthetic */ C11851e(Object obj, LinkedHashSet linkedHashSet, C7571f fVar) {
        this(obj, linkedHashSet);
    }
}
