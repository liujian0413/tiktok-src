package com.google.common.collect;

import com.google.common.base.C17457s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.common.collect.bz */
public abstract class C17863bz<K0, V0> {

    /* renamed from: com.google.common.collect.bz$1 */
    static class C178641 extends C17868c<Object> {

        /* renamed from: a */
        final /* synthetic */ int f49128a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final <K, V> Map<K, Collection<V>> mo46188a() {
            return C17898cj.m59507a(this.f49128a);
        }
    }

    /* renamed from: com.google.common.collect.bz$a */
    static final class C17866a<V> implements C17457s<List<V>>, Serializable {

        /* renamed from: a */
        private final int f49130a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public List<V> mo44946a() {
            return new ArrayList(this.f49130a);
        }

        C17866a(int i) {
            this.f49130a = C18053v.m59700a(i, "expectedValuesPerKey");
        }
    }

    /* renamed from: com.google.common.collect.bz$b */
    public static abstract class C17867b<K0, V0> extends C17863bz<K0, V0> {
        /* renamed from: b */
        public abstract <K extends K0, V extends V0> C17794bt<K, V> mo46189b();

        C17867b() {
            super(null);
        }
    }

    /* renamed from: com.google.common.collect.bz$c */
    public static abstract class C17868c<K0> {
        C17868c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo46188a();

        /* renamed from: b */
        public final C17867b<K0, Object> mo46190b() {
            return m59395a(2);
        }

        /* renamed from: a */
        private C17867b<K0, Object> m59395a(int i) {
            C18053v.m59700a(2, "expectedValuesPerKey");
            return new C17867b<K0, Object>(2) {
                /* renamed from: b */
                public final <K extends K0, V> C17794bt<K, V> mo46189b() {
                    return C17873ca.m59402a(C17868c.this.mo46188a(), (C17457s<? extends List<V>>) new C17866a<Object>(2));
                }
            };
        }
    }

    private C17863bz() {
    }

    /* renamed from: a */
    public static C17868c<Object> m59388a() {
        return m59389a(8);
    }

    /* synthetic */ C17863bz(C178641 r1) {
        this();
    }

    /* renamed from: a */
    private static C17868c<Object> m59389a(int i) {
        C18053v.m59700a(8, "expectedKeys");
        return new C17868c<Object>(8) {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <K, V> Map<K, Collection<V>> mo46188a() {
                return C17898cj.m59509b(8);
            }
        };
    }
}
