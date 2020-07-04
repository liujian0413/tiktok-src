package com.bytedance.android.live.core.p145a;

import java.util.List;

/* renamed from: com.bytedance.android.live.core.a.b */
public interface C3145b<K, V> {

    /* renamed from: com.bytedance.android.live.core.a.b$a */
    public static class C3146a<V> {

        /* renamed from: a */
        public int f9696a;

        /* renamed from: b */
        public int f9697b;

        /* renamed from: c */
        public List<V> f9698c;

        C3146a(int i, int i2, List<V> list) {
            this.f9696a = i;
            this.f9697b = i2;
            this.f9698c = list;
        }
    }

    /* renamed from: a */
    V mo9985a(K k, C3158n<V> nVar);

    /* renamed from: a */
    List<V> mo9986a(K k);

    /* renamed from: a */
    List<V> mo9987a(K k, List<V> list);

    /* renamed from: a */
    void mo9988a(K k, V v);

    /* renamed from: b */
    int mo9989b(K k, V v);

    /* renamed from: b */
    void mo9990b(K k);
}
