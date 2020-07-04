package com.facebook.appevents;

import android.content.Context;
import com.facebook.C13499h;
import com.facebook.internal.C13892b;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.appevents.c */
final class C13122c {

    /* renamed from: a */
    private final HashMap<C13117a, C13191l> f34759a = new HashMap<>();

    /* renamed from: a */
    public final synchronized Set<C13117a> mo32292a() {
        return this.f34759a.keySet();
    }

    /* renamed from: b */
    public final synchronized int mo32295b() {
        int i;
        i = 0;
        for (C13191l a : this.f34759a.values()) {
            i += a.mo32376a();
        }
        return i;
    }

    /* renamed from: a */
    public final synchronized C13191l mo32291a(C13117a aVar) {
        return (C13191l) this.f34759a.get(aVar);
    }

    /* renamed from: b */
    private synchronized C13191l m38371b(C13117a aVar) {
        C13191l lVar;
        lVar = (C13191l) this.f34759a.get(aVar);
        if (lVar == null) {
            Context g = C13499h.m39721g();
            lVar = new C13191l(C13892b.m41018a(g), AppEventsLogger.m38360b(g));
        }
        this.f34759a.put(aVar, lVar);
        return lVar;
    }

    /* renamed from: a */
    public final synchronized void mo32294a(C13188k kVar) {
        if (kVar != null) {
            for (C13117a aVar : kVar.mo32373a()) {
                C13191l b = m38371b(aVar);
                for (AppEvent a : kVar.mo32372a(aVar)) {
                    b.mo32378a(a);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo32293a(C13117a aVar, AppEvent appEvent) {
        m38371b(aVar).mo32378a(appEvent);
    }
}
