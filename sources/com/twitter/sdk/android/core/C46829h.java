package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.C46938j;
import com.twitter.sdk.android.core.internal.p1846b.C46861b;
import com.twitter.sdk.android.core.internal.p1846b.C46863d;
import com.twitter.sdk.android.core.internal.p1846b.C46864e;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.twitter.sdk.android.core.h */
public final class C46829h<T extends C46938j> implements C46939k<T> {

    /* renamed from: a */
    private final C46861b f120115a;

    /* renamed from: b */
    private final C46864e<T> f120116b;

    /* renamed from: c */
    private final ConcurrentHashMap<Long, T> f120117c;

    /* renamed from: d */
    private final ConcurrentHashMap<Long, C46863d<T>> f120118d;

    /* renamed from: e */
    private final C46863d<T> f120119e;

    /* renamed from: f */
    private final AtomicReference<T> f120120f;

    /* renamed from: g */
    private final String f120121g;

    /* renamed from: h */
    private volatile boolean f120122h;

    /* renamed from: c */
    private void m146490c() {
        if (this.f120122h) {
            m146491d();
        }
    }

    /* renamed from: a */
    public final T mo117913a() {
        m146490c();
        return (C46938j) this.f120120f.get();
    }

    /* renamed from: b */
    public final Map<Long, T> mo117916b() {
        m146490c();
        return Collections.unmodifiableMap(this.f120117c);
    }

    /* renamed from: d */
    private synchronized void m146491d() {
        if (this.f120122h) {
            m146493f();
            m146492e();
            this.f120122h = false;
        }
    }

    /* renamed from: f */
    private void m146493f() {
        C46938j jVar = (C46938j) this.f120119e.mo117963a();
        if (jVar != null) {
            m146487a(jVar.f120357b, jVar, false);
        }
    }

    /* renamed from: e */
    private void m146492e() {
        for (Entry entry : this.f120115a.mo117960a().getAll().entrySet()) {
            if (m146488a((String) entry.getKey())) {
                C46938j jVar = (C46938j) this.f120116b.mo117909a((String) entry.getValue());
                if (jVar != null) {
                    m146487a(jVar.f120357b, jVar, false);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m146488a(String str) {
        return str.startsWith(this.f120121g);
    }

    /* renamed from: c */
    private String m146489c(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f120121g);
        sb.append("_");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public final T mo117914a(long j) {
        m146490c();
        return (C46938j) this.f120117c.get(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo117915a(T t) {
        if (t != null) {
            m146490c();
            m146487a(t.f120357b, t, true);
            return;
        }
        throw new IllegalArgumentException("Session must not be null!");
    }

    /* renamed from: b */
    public final void mo117917b(long j) {
        m146490c();
        if (this.f120120f.get() != null && ((C46938j) this.f120120f.get()).f120357b == 0) {
            synchronized (this) {
                this.f120120f.set(null);
                this.f120119e.mo117965b();
            }
        }
        this.f120117c.remove(Long.valueOf(0));
        C46863d dVar = (C46863d) this.f120118d.remove(Long.valueOf(0));
        if (dVar != null) {
            dVar.mo117965b();
        }
    }

    /* renamed from: a */
    private void m146487a(long j, T t, boolean z) {
        this.f120117c.put(Long.valueOf(j), t);
        C46863d dVar = (C46863d) this.f120118d.get(Long.valueOf(j));
        if (dVar == null) {
            dVar = new C46863d(this.f120115a, this.f120116b, m146489c(j));
            this.f120118d.putIfAbsent(Long.valueOf(j), dVar);
        }
        dVar.mo117964a(t);
        C46938j jVar = (C46938j) this.f120120f.get();
        if (jVar == null || jVar.f120357b == j || z) {
            synchronized (this) {
                this.f120120f.compareAndSet(jVar, t);
                this.f120119e.mo117964a(t);
            }
        }
    }

    public C46829h(C46861b bVar, C46864e<T> eVar, String str, String str2) {
        this(bVar, eVar, new ConcurrentHashMap(1), new ConcurrentHashMap(1), new C46863d(bVar, eVar, str), str2);
    }

    private C46829h(C46861b bVar, C46864e<T> eVar, ConcurrentHashMap<Long, T> concurrentHashMap, ConcurrentHashMap<Long, C46863d<T>> concurrentHashMap2, C46863d<T> dVar, String str) {
        this.f120122h = true;
        this.f120115a = bVar;
        this.f120116b = eVar;
        this.f120117c = concurrentHashMap;
        this.f120118d = concurrentHashMap2;
        this.f120119e = dVar;
        this.f120120f = new AtomicReference<>();
        this.f120121g = str;
    }
}
