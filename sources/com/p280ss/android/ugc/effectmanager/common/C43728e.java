package com.p280ss.android.ugc.effectmanager.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.ss.android.ugc.effectmanager.common.e */
public final class C43728e<K, V> {

    /* renamed from: a */
    private HashMap<K, Collection<V>> f113230a = new HashMap<>();

    /* renamed from: a */
    public final Set<K> mo105771a() {
        return this.f113230a.keySet();
    }

    /* renamed from: b */
    public final Collection<V> mo105773b() {
        Collection<Collection> values = this.f113230a.values();
        ArrayList arrayList = new ArrayList();
        for (Collection addAll : values) {
            arrayList.addAll(addAll);
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* renamed from: a */
    public final Collection<V> mo105770a(K k) {
        Collection collection = (Collection) this.f113230a.get(k);
        if (collection == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableCollection(collection);
    }

    /* renamed from: a */
    public final void mo105772a(K k, V v) {
        Collection collection = (Collection) this.f113230a.get(k);
        if (collection == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(v);
            this.f113230a.put(k, arrayList);
            return;
        }
        collection.add(v);
    }
}
