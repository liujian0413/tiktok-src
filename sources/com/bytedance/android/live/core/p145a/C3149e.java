package com.bytedance.android.live.core.p145a;

import android.util.Pair;
import com.bytedance.android.live.core.rxutils.C3303k;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p346io.reactivex.p348d.C47571i;
import p346io.reactivex.p348d.C7324c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p354j.C7489f;

/* renamed from: com.bytedance.android.live.core.a.e */
public final class C3149e<K, V> implements C3144a<K, V> {

    /* renamed from: a */
    private final C7327h<K, Integer> f9703a;

    /* renamed from: b */
    private final C7324c<K, V, Boolean> f9704b;

    /* renamed from: c */
    private final C47571i<K, V, Long, Boolean> f9705c;

    /* renamed from: d */
    private final C7324c<V, V, V> f9706d;

    /* renamed from: e */
    private final Map<Integer, Pair<V, Long>> f9707e;

    /* renamed from: f */
    private final ConcurrentMap<Integer, C7489f<V>> f9708f;

    /* renamed from: b */
    static final /* synthetic */ Object m11923b(Object obj, Object obj2) throws Exception {
        return obj2;
    }

    public C3149e() {
        this(Long.MAX_VALUE);
    }

    /* renamed from: a */
    public final void mo9982a(K k) {
        this.f9707e.remove(C3303k.m12373a(this.f9703a, k));
    }

    private C3149e(long j) {
        this(C3150f.f9709a, Long.MAX_VALUE);
    }

    /* renamed from: b */
    public final V mo9984b(K k) {
        Pair pair = (Pair) this.f9707e.get(C3303k.m12373a(this.f9703a, k));
        if (pair == null || ((Boolean) C3303k.m12374a(this.f9705c, k, pair.first, pair.second)).booleanValue()) {
            return null;
        }
        return pair.first;
    }

    private C3149e(C7324c<K, V, Boolean> cVar, long j) {
        this(C3151g.f9710a, cVar, new C3152h(j), C3153i.f9712a);
    }

    /* renamed from: a */
    public final void mo9983a(K k, V v) {
        if (!((Boolean) C3303k.m12372a(this.f9704b, k, v)).booleanValue()) {
            int intValue = ((Integer) C3303k.m12373a(this.f9703a, k)).intValue();
            boolean z = false;
            Pair pair = (Pair) this.f9707e.get(Integer.valueOf(intValue));
            if (pair != null && !((Boolean) C3303k.m12374a(this.f9705c, k, pair.first, pair.second)).booleanValue()) {
                Object obj = ((Pair) this.f9707e.get(Integer.valueOf(intValue))).first;
                z = v.equals(obj);
                if (!z) {
                    v = C3303k.m12372a(this.f9706d, obj, v);
                    z = v.equals(obj);
                }
            }
            if (!z) {
                this.f9707e.put(Integer.valueOf(intValue), new Pair(v, Long.valueOf(System.currentTimeMillis())));
                if (this.f9708f.containsKey(Integer.valueOf(intValue))) {
                    ((C7489f) this.f9708f.get(Integer.valueOf(intValue))).onNext(v);
                }
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m11922a(long j, Object obj, Object obj2, Long l) throws Exception {
        boolean z;
        if (System.currentTimeMillis() - l.longValue() > j || System.currentTimeMillis() < l.longValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private C3149e(C7327h<K, Integer> hVar, C7324c<K, V, Boolean> cVar, C47571i<K, V, Long, Boolean> iVar, C7324c<V, V, V> cVar2) {
        this.f9707e = new ConcurrentHashMap();
        this.f9708f = new ConcurrentHashMap(20, 0.75f, 4);
        this.f9703a = hVar;
        this.f9704b = cVar;
        this.f9705c = iVar;
        this.f9706d = cVar2;
    }
}
