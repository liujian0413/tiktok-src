package com.google.firebase.components;

import com.C1642a;
import com.google.android.gms.common.internal.C15267r;
import com.google.firebase.components.C18279a.C182801;
import com.google.firebase.p785a.C18264c;
import com.google.firebase.p785a.C18265d;
import com.google.firebase.p786b.C18277a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.j */
public final class C18290j extends C18286f {

    /* renamed from: a */
    private final List<C18279a<?>> f49702a;

    /* renamed from: b */
    private final Map<Class<?>, C18294n<?>> f49703b = new HashMap();

    /* renamed from: c */
    private final C18292l f49704c;

    /* renamed from: a */
    private void m60295a() {
        for (C18279a aVar : this.f49702a) {
            Iterator it = aVar.f49687b.iterator();
            while (true) {
                if (it.hasNext()) {
                    C18285e eVar = (C18285e) it.next();
                    if (eVar.mo47164a() && !this.f49703b.containsKey(eVar.f49698a)) {
                        throw new MissingDependencyException(C1642a.m8034a("Unsatisfied dependency for component %s: %s", new Object[]{aVar, eVar.f49698a}));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47162a(Class cls) {
        return super.mo47162a(cls);
    }

    /* renamed from: b */
    public final <T> C18277a<T> mo47163b(Class<T> cls) {
        C15267r.m44385a(cls, (Object) "Null interface requested.");
        return (C18277a) this.f49703b.get(cls);
    }

    /* renamed from: a */
    private <T> void m60296a(C18279a<T> aVar) {
        C18294n nVar = new C18294n(aVar.f49688c, new C18296p(aVar, this));
        for (Class put : aVar.f49686a) {
            this.f49703b.put(put, nVar);
        }
    }

    /* renamed from: a */
    public final void mo47170a(boolean z) {
        for (C18279a aVar : this.f49702a) {
            if (aVar.mo47153a() || (aVar.mo47154b() && z)) {
                mo47162a((Class) aVar.f49686a.iterator().next());
            }
        }
        this.f49704c.mo47176a();
    }

    public C18290j(Executor executor, Iterable<C18284d> iterable, C18279a<?>... aVarArr) {
        this.f49704c = new C18292l(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C18279a.m60268a(this.f49704c, C18292l.class, C18265d.class, C18264c.class));
        for (C18284d components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, aVarArr);
        this.f49702a = Collections.unmodifiableList(C182801.m60273a((List<C18279a<?>>) arrayList));
        for (C18279a a : this.f49702a) {
            m60296a(a);
        }
        m60295a();
    }
}
