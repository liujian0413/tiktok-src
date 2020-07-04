package com.google.common.cache;

import com.google.common.base.C17457s;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.common.cache.h */
final class C17538h {

    /* renamed from: a */
    private static final C17457s<C17537g> f48612a;

    /* renamed from: com.google.common.cache.h$a */
    static final class C17541a extends AtomicLong implements C17537g {
        private C17541a() {
        }

        /* renamed from: a */
        public final void mo45138a() {
            getAndIncrement();
        }

        /* renamed from: a */
        public final void mo45139a(long j) {
            getAndAdd(j);
        }
    }

    /* renamed from: a */
    public static C17537g m58409a() {
        return (C17537g) f48612a.mo44946a();
    }

    static {
        C17457s<C17537g> sVar;
        try {
            new C17542i();
            sVar = new C17457s<C17537g>() {
                /* renamed from: b */
                private static C17537g m58410b() {
                    return new C17542i();
                }

                /* renamed from: a */
                public final /* synthetic */ Object mo44946a() {
                    return m58410b();
                }
            };
        } catch (Throwable unused) {
            sVar = new C17457s<C17537g>() {
                /* renamed from: b */
                private static C17537g m58412b() {
                    return new C17541a();
                }

                /* renamed from: a */
                public final /* synthetic */ Object mo44946a() {
                    return m58412b();
                }
            };
        }
        f48612a = sVar;
    }
}
