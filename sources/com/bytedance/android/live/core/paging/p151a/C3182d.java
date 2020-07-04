package com.bytedance.android.live.core.paging.p151a;

import android.arch.lifecycle.C0052o;
import android.arch.paging.C0083d;
import android.arch.paging.C0083d.C0084a;
import android.arch.paging.C0088e;
import android.arch.paging.C0100h.C0106d;
import android.arch.paging.C0100h.C0106d.C0107a;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.core.network.NetworkStat;
import com.bytedance.android.live.core.p145a.C3144a;
import com.bytedance.android.live.core.p145a.C3145b;
import com.bytedance.android.live.core.paging.C3197b;
import com.bytedance.android.live.core.paging.C3213c;
import com.bytedance.android.live.core.paging.p152b.C3198a;
import com.bytedance.android.live.core.paging.p152b.C3199b;
import java.util.concurrent.atomic.AtomicLong;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.bytedance.android.live.core.paging.a.d */
public final class C3182d<CacheKey, V> implements C3179a<V> {

    /* renamed from: d */
    private static final C0106d f9778d = new C0107a().mo228a(false).mo227a(12).mo230b(12).mo229a();

    /* renamed from: a */
    public CacheKey f9779a;

    /* renamed from: b */
    public C3145b<CacheKey, V> f9780b;

    /* renamed from: c */
    public C3144a<CacheKey, C2344a> f9781c;

    /* renamed from: e */
    private C0052o<NetworkStat> f9782e = new C0052o<>();

    /* renamed from: f */
    private C0052o<NetworkStat> f9783f = new C0052o<>();

    /* renamed from: g */
    private C0052o<Boolean> f9784g = new C0052o<>();

    /* renamed from: h */
    private C0052o<Boolean> f9785h = new C0052o<>();

    /* renamed from: i */
    private C7486b<Object> f9786i = C7486b.m23223a();

    /* renamed from: j */
    private C7486b<Object> f9787j = C7486b.m23223a();

    /* renamed from: k */
    private C7486b<Object> f9788k = C7486b.m23223a();

    /* renamed from: l */
    private volatile boolean f9789l = false;

    /* renamed from: m */
    private volatile boolean f9790m = false;

    /* renamed from: n */
    private C0052o<Integer> f9791n = new C0052o<>();

    /* renamed from: o */
    private AtomicLong f9792o = new AtomicLong(0);

    /* renamed from: p */
    private C0106d f9793p = f9778d;

    /* renamed from: q */
    private C3199b<V> f9794q;

    /* renamed from: a */
    public final C0052o<NetworkStat> mo10041a() {
        return this.f9782e;
    }

    /* renamed from: b */
    public final C0052o<NetworkStat> mo10042b() {
        return this.f9783f;
    }

    /* renamed from: c */
    public final C0052o<Boolean> mo10043c() {
        return this.f9784g;
    }

    /* renamed from: d */
    public final C0052o<Boolean> mo10044d() {
        return this.f9785h;
    }

    /* renamed from: e */
    public final C7486b<Object> mo10045e() {
        return this.f9786i;
    }

    /* renamed from: f */
    public final C7486b<Object> mo10046f() {
        return this.f9787j;
    }

    /* renamed from: g */
    public final C7486b<Object> mo10047g() {
        return this.f9788k;
    }

    /* renamed from: h */
    public final C0052o<Integer> mo10048h() {
        return this.f9791n;
    }

    /* renamed from: i */
    public final boolean mo10058i() {
        return this.f9789l;
    }

    /* renamed from: j */
    public final boolean mo10059j() {
        return this.f9790m;
    }

    /* renamed from: k */
    public final C3199b<V> mo10060k() {
        return this.f9794q;
    }

    /* renamed from: l */
    public final long mo10061l() {
        return this.f9792o.get();
    }

    /* renamed from: m */
    public final long mo10062m() {
        return this.f9792o.incrementAndGet();
    }

    /* renamed from: n */
    public final C3197b<V> mo10063n() {
        C31831 r0 = new C0084a<Long, V>() {
            /* renamed from: a */
            public final C0083d<Long, V> mo186a() {
                return new C3198a(C3182d.this);
            }
        };
        return new C3213c(this, new C0088e(r0, this.f9793p).mo193a(new C3180b(this.f9784g, this.f9785h)).mo192a());
    }

    /* renamed from: a */
    public final C3182d<CacheKey, V> mo10052a(C0106d dVar) {
        this.f9793p = dVar;
        return this;
    }

    /* renamed from: b */
    public final void mo10057b(boolean z) {
        this.f9790m = z;
    }

    /* renamed from: a */
    public final C3182d<CacheKey, V> mo10054a(C3199b<V> bVar) {
        this.f9794q = bVar;
        return this;
    }

    /* renamed from: a */
    public final C3182d<CacheKey, V> mo10055a(CacheKey cachekey) {
        this.f9779a = cachekey;
        return this;
    }

    /* renamed from: a */
    public final void mo10056a(boolean z) {
        this.f9789l = z;
    }

    /* renamed from: a */
    public final C3182d<CacheKey, V> mo10053a(C3145b<CacheKey, V> bVar, C3144a<CacheKey, C2344a> aVar) {
        this.f9780b = bVar;
        this.f9781c = aVar;
        return this;
    }
}
