package com.google.firebase.components;

import com.C1642a;
import com.google.firebase.p785a.C18264c;
import com.google.firebase.p786b.C18277a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.p */
final class C18296p extends C18286f {

    /* renamed from: a */
    private final Set<Class<?>> f49718a;

    /* renamed from: b */
    private final Set<Class<?>> f49719b;

    /* renamed from: c */
    private final Set<Class<?>> f49720c;

    /* renamed from: d */
    private final C18282b f49721d;

    /* renamed from: com.google.firebase.components.p$a */
    static class C18297a implements C18264c {

        /* renamed from: a */
        private final Set<Class<?>> f49722a;

        /* renamed from: b */
        private final C18264c f49723b;

        public C18297a(Set<Class<?>> set, C18264c cVar) {
            this.f49722a = set;
            this.f49723b = cVar;
        }
    }

    /* renamed from: a */
    public final <T> T mo47162a(Class<T> cls) {
        if (this.f49718a.contains(cls)) {
            T a = this.f49721d.mo47162a(cls);
            if (!cls.equals(C18264c.class)) {
                return a;
            }
            return new C18297a(this.f49720c, (C18264c) a);
        }
        throw new IllegalArgumentException(C1642a.m8034a("Requesting %s is not allowed.", new Object[]{cls}));
    }

    /* renamed from: b */
    public final <T> C18277a<T> mo47163b(Class<T> cls) {
        if (this.f49719b.contains(cls)) {
            return this.f49721d.mo47163b(cls);
        }
        throw new IllegalArgumentException(C1642a.m8034a("Requesting Provider<%s> is not allowed.", new Object[]{cls}));
    }

    C18296p(C18279a<?> aVar, C18282b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C18285e eVar : aVar.f49687b) {
            if (eVar.mo47165b()) {
                hashSet.add(eVar.f49698a);
            } else {
                hashSet2.add(eVar.f49698a);
            }
        }
        if (!aVar.f49689d.isEmpty()) {
            hashSet.add(C18264c.class);
        }
        this.f49718a = Collections.unmodifiableSet(hashSet);
        this.f49719b = Collections.unmodifiableSet(hashSet2);
        this.f49720c = aVar.f49689d;
        this.f49721d = bVar;
    }
}
