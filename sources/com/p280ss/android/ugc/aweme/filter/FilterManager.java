package com.p280ss.android.ugc.aweme.filter;

import android.content.Context;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.effect.p1197c.C27400a;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27413a;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.filter.p1242a.C29192f;
import com.p280ss.android.ugc.aweme.filter.p1245d.C29279a;
import com.p280ss.android.ugc.aweme.filter.p1246e.C29291d;
import com.p280ss.android.ugc.aweme.filter.p1247f.C29294b.C29295a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterManager */
public class FilterManager implements C29291d, C29295a {

    /* renamed from: b */
    private static volatile FilterManager f77010b;

    /* renamed from: a */
    public AtomicBoolean f77011a = new AtomicBoolean(false);

    /* renamed from: c */
    private C29279a f77012c;

    /* renamed from: d */
    private List<C29296g> f77013d = Collections.synchronizedList(new LinkedList());

    /* renamed from: e */
    private List<C29296g> f77014e = Collections.synchronizedList(new LinkedList());

    /* renamed from: f */
    private final Object f77015f = new Object();

    /* renamed from: g */
    private volatile C27400a<C29296g, Void> f77016g;

    /* renamed from: h */
    private List<C29296g> f77017h;

    /* renamed from: com.ss.android.ugc.aweme.filter.FilterManager$FilterStatus */
    public enum FilterStatus {
        NONE,
        DOWNLOAD_ING,
        DOWNLOAD_COMPLETED,
        DOWNLOAD_FAILED,
        RE_DOWNLOAD_ING
    }

    /* renamed from: b */
    public final void mo74717b() {
        mo74720c().mo70507b();
    }

    /* renamed from: e */
    public final List<C29296g> mo74722e() {
        return mo74726j();
    }

    /* renamed from: g */
    public final void mo74724g() {
        m95704m().mo74942a();
    }

    /* renamed from: f */
    public final EffectPlatform mo74723f() {
        return m95704m().mo74940a((Context) C35574k.m114861b());
    }

    /* renamed from: h */
    public final void mo74725h() {
        m95704m().mo74943a(C35574k.m114861b(), m95703i());
    }

    /* renamed from: k */
    public final synchronized void mo74727k() {
        mo74716a(false);
    }

    /* renamed from: a */
    public static FilterManager m95700a() {
        if (f77010b == null) {
            synchronized (FilterManager.class) {
                if (f77010b == null) {
                    f77010b = new FilterManager();
                }
            }
        }
        return f77010b;
    }

    /* renamed from: i */
    public static String m95703i() {
        if (C35574k.m114859a().mo70096k().mo93306b(Property.ColorFilterPanel) == 2) {
            return "colorfilterexperiment";
        }
        return "colorfilternew";
    }

    /* renamed from: m */
    private synchronized C29279a m95704m() {
        if (this.f77012c == null) {
            this.f77012c = new C29279a();
        }
        return this.f77012c;
    }

    /* renamed from: n */
    private void m95705n() {
        this.f77012c = m95704m();
        this.f77012c.mo74944a(C35574k.m114861b(), m95703i(), new C43757g() {
            /* renamed from: a */
            public final void mo9275a(EffectChannelResponse effectChannelResponse) {
            }

            /* renamed from: a */
            public final void mo9274a(C43726c cVar) {
                FilterManager.this.f77011a.set(false);
            }
        });
    }

    /* renamed from: d */
    public final List<C29296g> mo74721d() {
        if (this.f77017h == null) {
            C29340y.m96241a();
            this.f77017h = C29340y.m96242a(C39811er.f103482r);
        }
        return this.f77017h;
    }

    /* renamed from: l */
    public final void mo74728l() {
        this.f77013d.clear();
        this.f77011a.set(false);
        mo74720c().mo70516e();
    }

    private FilterManager() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C27400a<C29296g, Void> mo74720c() {
        if (this.f77016g == null) {
            synchronized (this.f77015f) {
                if (this.f77016g == null) {
                    this.f77016g = new C27400a<>(3, new C29192f());
                    this.f77016g.f72293b = 0;
                    this.f77016g.f72295d = true;
                    this.f77016g.f72294c = true;
                    this.f77016g.f72296e = C29201af.f77102a;
                }
            }
        }
        return this.f77016g;
    }

    /* renamed from: j */
    public final List<C29296g> mo74726j() {
        if (C6311g.m19574b(this.f77013d)) {
            return this.f77013d;
        }
        if (C6311g.m19573a(this.f77014e)) {
            C29340y.m96241a();
            this.f77014e = C29340y.m96242a(C39810eq.f103482r);
        }
        return this.f77014e;
    }

    /* renamed from: a */
    public final void mo74712a(C29296g gVar) {
        mo74714a(gVar, true, null);
    }

    /* renamed from: a */
    static final /* synthetic */ void m95701a(Exception exc) {
        if (!C7163a.m22363a()) {
            C6921a.m21559a((Throwable) exc);
            return;
        }
        throw new RuntimeException(exc);
    }

    /* renamed from: b */
    private void m95702b(C29296g gVar) {
        if (gVar != null && !this.f77013d.contains(gVar)) {
            this.f77013d.add(gVar);
        }
    }

    /* renamed from: b */
    public final void mo74719b(List<? extends C29296g> list) {
        if (!C6311g.m19573a(list)) {
            for (C29296g b : list) {
                m95702b(b);
            }
        }
    }

    /* renamed from: a */
    public final void mo74715a(List<? extends C29296g> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            mo74720c().mo70504a(list);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo74716a(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L_0x0017
            java.util.List<com.ss.android.ugc.aweme.filter.g> r2 = r1.f77013d     // Catch:{ all -> 0x0015 }
            boolean r2 = com.bytedance.common.utility.C6311g.m19574b(r2)     // Catch:{ all -> 0x0015 }
            if (r2 != 0) goto L_0x0013
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f77011a     // Catch:{ all -> 0x0015 }
            boolean r2 = r2.get()     // Catch:{ all -> 0x0015 }
            if (r2 == 0) goto L_0x0017
        L_0x0013:
            monitor-exit(r1)
            return
        L_0x0015:
            r2 = move-exception
            goto L_0x0022
        L_0x0017:
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f77011a     // Catch:{ all -> 0x0015 }
            r0 = 1
            r2.set(r0)     // Catch:{ all -> 0x0015 }
            r1.m95705n()     // Catch:{ all -> 0x0015 }
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.filter.FilterManager.mo74716a(boolean):void");
    }

    /* renamed from: b */
    public final void mo74718b(C29296g gVar, C27413a<C29296g, Void> aVar) {
        mo74720c().mo70515d(gVar, aVar);
    }

    /* renamed from: a */
    public final void mo74713a(C29296g gVar, C27413a<C29296g, Void> aVar) {
        mo74720c().mo70513c(gVar, aVar);
    }

    /* renamed from: a */
    public final void mo74714a(C29296g gVar, boolean z, C27413a<C29296g, Void> aVar) {
        if (gVar != null) {
            if (z) {
                mo74720c().mo70509b(gVar, aVar);
            } else {
                mo74720c().mo70503a(gVar, aVar);
            }
        }
    }
}
