package com.p280ss.android.ugc.aweme.feed.api;

import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.api.l */
public final class C28224l {

    /* renamed from: a */
    public static final C28224l f74339a = new C28224l();

    /* renamed from: b */
    private static final ConcurrentHashMap<Long, C28223k> f74340b = new ConcurrentHashMap<>();

    private C28224l() {
    }

    /* renamed from: a */
    public static C28223k m92768a(long j) {
        return (C28223k) f74340b.get(Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m92769a(long j, C28223k kVar) {
        C7573i.m23587b(kVar, "value");
        if (j > 0) {
            f74340b.putIfAbsent(Long.valueOf(j), kVar);
        } else if (C7163a.m22363a()) {
            StringBuilder sb = new StringBuilder("key wrong:");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
