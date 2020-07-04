package com.facebook.cache.p683a;

import com.facebook.cache.p683a.C13248d.C13249a;

/* renamed from: com.facebook.cache.a.b */
public final class C13242b implements C13258h {
    /* renamed from: a */
    public final C13257g mo32452a() {
        return new C13257g() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m38714a((C13249a) obj, (C13249a) obj2);
            }

            /* renamed from: a */
            private static int m38714a(C13249a aVar, C13249a aVar2) {
                long b = aVar.mo32444b();
                long b2 = aVar2.mo32444b();
                if (b < b2) {
                    return -1;
                }
                if (b2 == b) {
                    return 0;
                }
                return 1;
            }
        };
    }
}
