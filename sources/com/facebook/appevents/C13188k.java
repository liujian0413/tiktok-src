package com.facebook.appevents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.appevents.k */
final class C13188k implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: a */
    private HashMap<C13117a, List<AppEvent>> f34932a = new HashMap<>();

    /* renamed from: com.facebook.appevents.k$a */
    static class C13190a implements Serializable {
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: a */
        private final HashMap<C13117a, List<AppEvent>> f34933a;

        private Object readResolve() {
            return new C13188k(this.f34933a);
        }

        private C13190a(HashMap<C13117a, List<AppEvent>> hashMap) {
            this.f34933a = hashMap;
        }
    }

    /* renamed from: a */
    public final Set<C13117a> mo32373a() {
        return this.f34932a.keySet();
    }

    public C13188k() {
    }

    private Object writeReplace() {
        return new C13190a(this.f34932a);
    }

    /* renamed from: b */
    public final boolean mo32375b(C13117a aVar) {
        return this.f34932a.containsKey(aVar);
    }

    /* renamed from: a */
    public final List<AppEvent> mo32372a(C13117a aVar) {
        return (List) this.f34932a.get(aVar);
    }

    public C13188k(HashMap<C13117a, List<AppEvent>> hashMap) {
        this.f34932a.putAll(hashMap);
    }

    /* renamed from: a */
    public final void mo32374a(C13117a aVar, List<AppEvent> list) {
        if (!this.f34932a.containsKey(aVar)) {
            this.f34932a.put(aVar, list);
        } else {
            ((List) this.f34932a.get(aVar)).addAll(list);
        }
    }
}
