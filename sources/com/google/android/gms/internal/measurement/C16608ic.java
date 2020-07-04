package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ic */
public final class C16608ic<K, V> {
    /* renamed from: a */
    static <K, V> void m54243a(zztv zztv, C16609id<K, V> idVar, K k, V v) throws IOException {
        C16570gx.m54114a(zztv, idVar.f46450a, 1, k);
        C16570gx.m54114a(zztv, idVar.f46452c, 2, v);
    }

    /* renamed from: a */
    static <K, V> int m54242a(C16609id<K, V> idVar, K k, V v) {
        return C16570gx.m54109a(idVar.f46450a, 1, k) + C16570gx.m54109a(idVar.f46452c, 2, v);
    }
}
