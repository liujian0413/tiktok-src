package com.p280ss.android.ugc.aweme.utils.p1694c;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.c.b */
public final class C43002b<T> {

    /* renamed from: a */
    private final Set<T> f111569a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized Set<T> mo104693a() {
        return new HashSet<>(this.f111569a);
    }

    /* renamed from: a */
    public final synchronized void mo104694a(Collection<? extends T> collection) {
        C7573i.m23587b(collection, "collection");
        this.f111569a.addAll(collection);
    }

    /* renamed from: b */
    public final synchronized void mo104695b(Collection<? extends T> collection) {
        C7573i.m23587b(collection, "collection");
        this.f111569a.clear();
        this.f111569a.addAll(collection);
    }
}
