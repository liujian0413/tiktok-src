package com.iab.omid.library.bytedance.p789b;

import com.iab.omid.library.bytedance.adsession.C18403g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.bytedance.b.a */
public final class C18407a {

    /* renamed from: a */
    private static C18407a f49938a = new C18407a();

    /* renamed from: b */
    private final ArrayList<C18403g> f49939b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C18403g> f49940c = new ArrayList<>();

    private C18407a() {
    }

    /* renamed from: a */
    public static C18407a m60593a() {
        return f49938a;
    }

    /* renamed from: d */
    private boolean m60594d() {
        return this.f49940c.size() > 0;
    }

    /* renamed from: a */
    public final void mo47832a(C18403g gVar) {
        this.f49939b.add(gVar);
    }

    /* renamed from: b */
    public final Collection<C18403g> mo47833b() {
        return Collections.unmodifiableCollection(this.f49939b);
    }

    /* renamed from: b */
    public final void mo47834b(C18403g gVar) {
        boolean d = m60594d();
        this.f49940c.add(gVar);
        if (!d) {
            C18416g.m60629a().mo47855b();
        }
    }

    /* renamed from: c */
    public final Collection<C18403g> mo47835c() {
        return Collections.unmodifiableCollection(this.f49940c);
    }

    /* renamed from: c */
    public final void mo47836c(C18403g gVar) {
        boolean d = m60594d();
        this.f49939b.remove(gVar);
        this.f49940c.remove(gVar);
        if (d && !m60594d()) {
            C18416g.m60629a().mo47856c();
        }
    }
}
