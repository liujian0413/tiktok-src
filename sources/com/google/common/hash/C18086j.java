package com.google.common.hash;

import com.google.common.base.C17457s;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.common.hash.j */
final class C18086j {

    /* renamed from: a */
    private static final C17457s<C18085i> f49415a;

    /* renamed from: com.google.common.hash.j$a */
    static final class C18089a extends AtomicLong implements C18085i {
        private C18089a() {
        }

        /* renamed from: a */
        public final void mo46699a() {
            getAndIncrement();
        }

        /* renamed from: b */
        public final long mo46701b() {
            return get();
        }

        /* renamed from: a */
        public final void mo46700a(long j) {
            getAndAdd(j);
        }
    }

    /* renamed from: a */
    public static C18085i m59825a() {
        return (C18085i) f49415a.mo44946a();
    }

    static {
        C17457s<C18085i> sVar;
        try {
            new C18090k();
            sVar = new C17457s<C18085i>() {
                /* renamed from: b */
                private static C18085i m59826b() {
                    return new C18090k();
                }

                /* renamed from: a */
                public final /* synthetic */ Object mo44946a() {
                    return m59826b();
                }
            };
        } catch (Throwable unused) {
            sVar = new C17457s<C18085i>() {
                /* renamed from: b */
                private static C18085i m59828b() {
                    return new C18089a();
                }

                /* renamed from: a */
                public final /* synthetic */ Object mo44946a() {
                    return m59828b();
                }
            };
        }
        f49415a = sVar;
    }
}
