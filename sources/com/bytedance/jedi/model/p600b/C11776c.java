package com.bytedance.jedi.model.p600b;

import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;

/* renamed from: com.bytedance.jedi.model.b.c */
public final class C11776c {

    /* renamed from: a */
    public static final C11776c f31571a = new C11776c();

    /* renamed from: com.bytedance.jedi.model.b.c$a */
    static final class C11777a extends Lambda implements C7563m<C7492s<V>, C7492s<V>, C7492s<V>> {

        /* renamed from: a */
        public static final C11777a f31572a = new C11777a();

        C11777a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m34506a((C7492s) obj, (C7492s) obj2);
        }

        /* renamed from: a */
        private static C7492s<V> m34506a(C7492s<V> sVar, C7492s<V> sVar2) {
            C7573i.m23587b(sVar, "fetcher");
            C7573i.m23587b(sVar2, "cache");
            C7492s<V> a = sVar2.mo19310c((C7496w<? extends T>) C7492s.m23303c()).mo19292a((C7496w<? extends T>) sVar);
            C7573i.m23582a((Object) a, "cache.onExceptionResumeN…     .concatWith(fetcher)");
            return a;
        }
    }

    private C11776c() {
    }

    /* renamed from: a */
    public static <V> C7563m<C7492s<V>, C7492s<V>, C7492s<V>> m34505a() {
        return C11777a.f31572a;
    }
}
