package com.bytedance.android.live.core.paging.p152b;

import android.util.Pair;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.core.paging.p151a.C3182d;
import java.util.List;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.android.live.core.paging.b.a */
public final class C3198a<CacheKey, V> extends C3200c<Long, V, CacheKey> {

    /* renamed from: h */
    private final C3199b<V> f9831h;

    public C3198a(C3182d<CacheKey, V> dVar) {
        super(dVar);
        this.f9831h = dVar.mo10060k();
    }

    /* renamed from: b */
    private static Long m12147b(C2344a aVar) {
        if (aVar == null || !aVar.hasMore) {
            return null;
        }
        return Long.valueOf(aVar.f7698e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo10092a(C2344a aVar) {
        return m12147b(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C7492s<Pair<List<V>, C2344a>> mo10091a(boolean z, Long l, int i) {
        return this.f9831h.mo10093a(z, l, i);
    }
}
