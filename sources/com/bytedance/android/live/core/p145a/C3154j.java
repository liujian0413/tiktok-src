package com.bytedance.android.live.core.p145a;

import android.util.Pair;
import com.bytedance.android.live.core.p145a.C3145b.C3146a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.common.utility.C6311g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p346io.reactivex.p348d.C47572j;
import p346io.reactivex.p348d.C7324c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.bytedance.android.live.core.a.j */
public class C3154j<K, V> implements C3145b<K, V> {

    /* renamed from: a */
    private final C7327h<K, Integer> f9713a;

    /* renamed from: b */
    private final C7324c<K, List<V>, List<V>> f9714b;

    /* renamed from: c */
    private final C47572j<K, List<V>, Integer, List<V>, List<V>> f9715c;

    /* renamed from: d */
    private final Map<Integer, List<V>> f9716d;

    /* renamed from: e */
    private final ConcurrentMap<Integer, C7486b<C3146a>> f9717e;

    /* renamed from: f */
    private final C7486b<Pair<K, C3146a>> f9718f;

    /* renamed from: a */
    static final /* synthetic */ List m11930a(Object obj, List list, Integer num, List list2) throws Exception {
        return list2;
    }

    /* renamed from: b */
    static final /* synthetic */ List m11931b(Object obj, List list) throws Exception {
        return list;
    }

    public C3154j() {
        this(C3155k.f9719a);
    }

    private C3154j(C7327h<K, Integer> hVar) {
        this(hVar, C3156l.f9720a, C3157m.f9721a);
    }

    /* renamed from: a */
    public final List<V> mo9986a(K k) {
        int intValue = ((Integer) C3303k.m12373a(this.f9713a, k)).intValue();
        if (!this.f9716d.containsKey(Integer.valueOf(intValue))) {
            this.f9716d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return (List) this.f9716d.get(Integer.valueOf(intValue));
    }

    /* renamed from: b */
    public final void mo9990b(K k) {
        int intValue = ((Integer) C3303k.m12373a(this.f9713a, k)).intValue();
        if (!this.f9716d.containsKey(Integer.valueOf(intValue))) {
            this.f9716d.put(Integer.valueOf(intValue), new ArrayList());
        }
        ((List) this.f9716d.get(Integer.valueOf(intValue))).clear();
    }

    /* renamed from: b */
    public final int mo9989b(K k, V v) {
        int intValue = ((Integer) C3303k.m12373a(this.f9713a, k)).intValue();
        if (!this.f9716d.containsKey(Integer.valueOf(intValue))) {
            this.f9716d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return ((List) this.f9716d.get(Integer.valueOf(intValue))).indexOf(v);
    }

    /* renamed from: a */
    public final V mo9985a(K k, C3158n<V> nVar) {
        int intValue = ((Integer) C3303k.m12373a(this.f9713a, k)).intValue();
        if (!this.f9716d.containsKey(Integer.valueOf(intValue))) {
            this.f9716d.put(Integer.valueOf(intValue), new ArrayList());
        }
        for (V next : (List) this.f9716d.get(Integer.valueOf(intValue))) {
            try {
                if (nVar.mo9997a(next)) {
                    return next;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final List<V> mo9987a(K k, List<V> list) {
        int intValue = ((Integer) C3303k.m12373a(this.f9713a, k)).intValue();
        if (!this.f9716d.containsKey(Integer.valueOf(intValue))) {
            this.f9716d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return m11929a(k, ((List) this.f9716d.get(Integer.valueOf(intValue))).size(), list);
    }

    /* renamed from: a */
    public final void mo9988a(K k, V v) {
        int intValue = ((Integer) C3303k.m12373a(this.f9713a, k)).intValue();
        if (!this.f9716d.containsKey(Integer.valueOf(intValue))) {
            this.f9716d.put(Integer.valueOf(intValue), new ArrayList());
        }
        List list = (List) this.f9716d.get(Integer.valueOf(intValue));
        int indexOf = list.indexOf(v);
        if (list.remove(v)) {
            C3146a aVar = new C3146a(2, indexOf, Collections.singletonList(v));
            if (this.f9717e.containsKey(Integer.valueOf(intValue))) {
                ((C7486b) this.f9717e.get(Integer.valueOf(intValue))).onNext(aVar);
            }
            this.f9718f.onNext(Pair.create(k, aVar));
        }
    }

    public C3154j(C7327h<K, Integer> hVar, C47572j<K, List<V>, Integer, List<V>, List<V>> jVar, C7324c<K, List<V>, List<V>> cVar) {
        this.f9716d = new ConcurrentHashMap();
        this.f9717e = new ConcurrentHashMap(20, 0.75f, 4);
        this.f9718f = C7486b.m23223a();
        this.f9713a = hVar;
        this.f9715c = jVar;
        this.f9714b = cVar;
    }

    /* renamed from: a */
    private synchronized List<V> m11929a(K k, int i, List<V> list) {
        int intValue = ((Integer) C3303k.m12373a(this.f9713a, k)).intValue();
        if (!this.f9716d.containsKey(Integer.valueOf(intValue))) {
            this.f9716d.put(Integer.valueOf(intValue), new ArrayList());
        }
        List list2 = (List) this.f9716d.get(Integer.valueOf(intValue));
        List<V> list3 = (List) C3303k.m12375a(this.f9715c, k, list2, Integer.valueOf(i), (List) C3303k.m12372a(this.f9714b, k, list));
        if (C6311g.m19573a(list3)) {
            return list3;
        }
        int min = Math.min(i, list2.size());
        list2.addAll(min, list3);
        this.f9716d.put(Integer.valueOf(intValue), list2);
        C3146a aVar = new C3146a(1, min, list3);
        if (this.f9717e.containsKey(Integer.valueOf(intValue))) {
            ((C7486b) this.f9717e.get(Integer.valueOf(intValue))).onNext(aVar);
        }
        this.f9718f.onNext(Pair.create(k, aVar));
        return list3;
    }
}
