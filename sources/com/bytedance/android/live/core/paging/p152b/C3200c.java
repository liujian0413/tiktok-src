package com.bytedance.android.live.core.paging.p152b;

import android.arch.lifecycle.C0052o;
import android.arch.paging.C0083d.C0085b;
import android.arch.paging.C0091f;
import android.arch.paging.C0091f.C0092a;
import android.arch.paging.C0091f.C0094c;
import android.arch.paging.C0091f.C0096e;
import android.arch.paging.C0091f.C0097f;
import android.util.Pair;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.core.network.NetworkStat;
import com.bytedance.android.live.core.p145a.C3144a;
import com.bytedance.android.live.core.p145a.C3145b;
import com.bytedance.android.live.core.paging.p151a.C3182d;
import com.bytedance.common.utility.C6311g;
import java.util.ArrayList;
import java.util.List;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.live.core.paging.b.c */
public abstract class C3200c<DataKey, V, CacheKey> extends C0091f<DataKey, V> implements C0085b {

    /* renamed from: a */
    protected CacheKey f9832a;

    /* renamed from: b */
    protected C3145b<CacheKey, V> f9833b;

    /* renamed from: c */
    protected C3144a<CacheKey, C2344a> f9834c;

    /* renamed from: d */
    protected C0052o<NetworkStat> f9835d;

    /* renamed from: e */
    protected C0052o<NetworkStat> f9836e;

    /* renamed from: f */
    protected C0052o<Boolean> f9837f;

    /* renamed from: g */
    protected C0052o<Boolean> f9838g;

    /* renamed from: h */
    private final C3182d<CacheKey, V> f9839h;

    /* renamed from: i */
    private long f9840i;

    /* renamed from: j */
    private Runnable f9841j;

    /* renamed from: k */
    private final C47562b f9842k = new C47562b();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C7492s<Pair<List<V>, C2344a>> mo10091a(boolean z, DataKey datakey, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract DataKey mo10092a(C2344a aVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10098a(C3182d dVar, Object obj) throws Exception {
        if (!m12157g()) {
            dVar.mo10057b(true);
            mo183b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10097a(C0097f fVar, C0092a aVar, Throwable th) throws Exception {
        this.f9835d.postValue(NetworkStat.m12010a(th));
        this.f9841j = new C3212o(this, fVar, aVar);
    }

    /* renamed from: g */
    private boolean m12157g() {
        return this.f9839h.mo10058i();
    }

    /* renamed from: e */
    private void m12155e() {
        this.f9833b.mo9990b(this.f9832a);
        this.f9834c.mo9982a(this.f9832a);
    }

    /* renamed from: g_ */
    public final void mo187g_() {
        this.f9842k.mo119660a();
        mo184b(this);
    }

    /* renamed from: d */
    private void m12154d() {
        if (m12157g()) {
            m12155e();
            this.f9839h.mo10056a(false);
        }
    }

    /* renamed from: f */
    private boolean m12156f() {
        boolean z;
        synchronized (this.f9839h) {
            if (this.f9840i == this.f9839h.mo10061l()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: h */
    private boolean m12158h() {
        if (this.f9835d.getValue() == null || this.f9835d.getValue() != NetworkStat.f9752c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m12152a(C7321c cVar) {
        this.f9842k.mo119661a(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo10101c(Object obj) throws Exception {
        if (!m12158h()) {
            mo183b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo10102d(Object obj) throws Exception {
        if (this.f9841j != null) {
            this.f9841j.run();
            this.f9841j = null;
        }
    }

    public C3200c(C3182d<CacheKey, V> dVar) {
        this.f9832a = dVar.f9779a;
        this.f9833b = dVar.f9780b;
        this.f9834c = dVar.f9781c;
        this.f9836e = dVar.mo10042b();
        this.f9835d = dVar.mo10041a();
        this.f9837f = dVar.mo10043c();
        this.f9838g = dVar.mo10044d();
        this.f9839h = dVar;
        this.f9840i = dVar.mo10062m();
        m12152a(dVar.mo10046f().mo19280a((C7326g<? super T>) new C3201d<Object>(this), C3202e.f9844a));
        m12152a(dVar.mo10045e().mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C3205h<Object>(this, dVar), C3206i.f9851a));
        m12152a(dVar.mo10047g().mo19325f((C7326g<? super T>) new C3207j<Object>(this)));
        mo182a(this);
    }

    /* renamed from: a */
    private List<V> m12151a(List<V> list, C2344a aVar) {
        this.f9834c.mo9983a(this.f9832a, aVar);
        return this.f9833b.mo9987a(this.f9832a, (List<V>) new ArrayList<V>(list));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10094a(C0092a aVar, Pair pair) throws Exception {
        boolean z;
        Object a = mo10092a((C2344a) pair.second);
        C0052o<Boolean> oVar = this.f9837f;
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        oVar.postValue(Boolean.valueOf(z));
        aVar.mo199a(m12151a((List) pair.first, (C2344a) pair.second), a);
        this.f9835d.postValue(NetworkStat.f9753d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10095a(C0094c cVar, Pair pair) throws Exception {
        boolean z;
        this.f9836e.postValue(NetworkStat.f9753d);
        this.f9835d.postValue(NetworkStat.f9753d);
        if (!m12156f()) {
            if (m12157g()) {
                this.f9839h.mo10056a(false);
            }
            return;
        }
        Object a = mo10092a((C2344a) pair.second);
        C0052o<Boolean> oVar = this.f9837f;
        boolean z2 = true;
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        oVar.postValue(Boolean.valueOf(z));
        if (!C6311g.m19573a(this.f9833b.mo9986a(this.f9832a)) || !C6311g.m19573a((List) pair.first)) {
            z2 = false;
        }
        if (!m12157g() || z2) {
            if (!C6311g.m19573a((List) pair.first)) {
                m12155e();
            }
            List a2 = m12151a((List) pair.first, (C2344a) pair.second);
            this.f9838g.postValue(Boolean.valueOf(C6311g.m19573a(a2)));
            cVar.mo200a(a2, null, a);
            this.f9839h.mo10056a(false);
            return;
        }
        m12154d();
        m12151a((List) pair.first, (C2344a) pair.second);
        mo183b();
        this.f9838g.postValue(Boolean.valueOf(false));
    }

    /* renamed from: a */
    public final void mo10099b(C0096e<DataKey> eVar, C0094c<DataKey, V> cVar) {
        if (m12156f()) {
            boolean z = false;
            if (this.f9839h.mo10059j()) {
                this.f9839h.mo10057b(false);
                this.f9839h.mo10056a(true);
            }
            this.f9836e.postValue(NetworkStat.f9752c);
            this.f9835d.postValue(NetworkStat.f9752c);
            this.f9837f.postValue(Boolean.valueOf(true));
            this.f9841j = null;
            List a = this.f9833b.mo9986a(this.f9832a);
            if (!C6311g.m19573a(a)) {
                C2344a aVar = (C2344a) this.f9834c.mo9984b(this.f9832a);
                cVar.mo200a(new ArrayList(a), null, mo10092a(aVar));
                if (m12157g()) {
                    m12153a(mo10091a(true, (DataKey) null, eVar.f184a), eVar, cVar);
                } else {
                    this.f9838g.postValue(Boolean.valueOf(false));
                    C0052o<Boolean> oVar = this.f9837f;
                    if (mo10092a(aVar) != null) {
                        z = true;
                    }
                    oVar.postValue(Boolean.valueOf(z));
                    this.f9836e.postValue(NetworkStat.f9753d);
                    this.f9835d.postValue(NetworkStat.f9753d);
                }
            } else {
                m12153a(mo10091a(true, (DataKey) null, eVar.f184a), eVar, cVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo10100b(C0097f<DataKey> fVar, C0092a<DataKey, V> aVar) {
        if (!m12157g()) {
            this.f9835d.postValue(NetworkStat.f9752c);
            this.f9841j = null;
            m12152a(mo10091a(false, (DataKey) fVar.f186a, fVar.f187b).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C3210m<Object>(this, aVar), (C7326g<? super Throwable>) new C3211n<Object>(this, fVar, aVar)));
        }
    }

    /* renamed from: a */
    private void m12153a(C7492s<Pair<List<V>, C2344a>> sVar, C0096e<DataKey> eVar, C0094c<DataKey, V> cVar) {
        if (sVar == null) {
            this.f9836e.postValue(NetworkStat.f9753d);
            this.f9835d.postValue(NetworkStat.f9753d);
            return;
        }
        m12152a(sVar.mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C3208k<Object>(this, cVar), (C7326g<? super Throwable>) new C3209l<Object>(this, eVar, cVar)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10096a(C0096e eVar, C0094c cVar, Throwable th) throws Exception {
        this.f9839h.mo10056a(false);
        this.f9836e.postValue(NetworkStat.m12010a(th));
        this.f9835d.postValue(NetworkStat.m12010a(th));
        if (m12156f()) {
            if (m12157g()) {
                m12154d();
                this.f9841j = new C3203f(this);
                return;
            }
            this.f9841j = new C3204g(this, eVar, cVar);
        }
    }
}
