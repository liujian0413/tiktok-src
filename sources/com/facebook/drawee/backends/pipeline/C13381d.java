package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.cache.common.C13265a;
import com.facebook.common.internal.C13303f;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13310j;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13326a;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.datasource.C13346c;
import com.facebook.drawable.p691a.C13360a;
import com.facebook.drawee.backends.pipeline.p695a.C13367a;
import com.facebook.drawee.backends.pipeline.p696b.C13369a;
import com.facebook.drawee.backends.pipeline.p696b.C13373b;
import com.facebook.drawee.backends.pipeline.p696b.C13377f;
import com.facebook.drawee.backends.pipeline.p696b.C13378g;
import com.facebook.drawee.components.C13390a;
import com.facebook.drawee.controller.C13396a;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.drawable.C13420o;
import com.facebook.drawee.drawable.C13421p;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.p692a.C13361a;
import com.facebook.drawee.p692a.p693a.C13362a;
import com.facebook.drawee.p698c.C13387b;
import com.facebook.imagepipeline.p716c.C13585p;
import com.facebook.imagepipeline.p719f.C13642a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.p721h.C13653c;
import com.facebook.imagepipeline.p725l.C13783b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.drawee.backends.pipeline.d */
public class C13381d extends C13396a<C13326a<C13645c>, C13648f> {

    /* renamed from: n */
    private static final Class<?> f35395n = C13381d.class;

    /* renamed from: a */
    public final Resources f35396a;

    /* renamed from: b */
    public C13265a f35397b;

    /* renamed from: c */
    public C13310j<C13346c<C13326a<C13645c>>> f35398c;

    /* renamed from: d */
    public boolean f35399d;

    /* renamed from: e */
    public ImmutableList<C13642a> f35400e;

    /* renamed from: o */
    private final C13642a f35401o;

    /* renamed from: p */
    private final ImmutableList<C13642a> f35402p;

    /* renamed from: q */
    private final C13585p<C13265a, C13645c> f35403q;

    /* renamed from: r */
    private C13378g f35404r;

    /* renamed from: s */
    private Set<C13653c> f35405s;

    /* renamed from: t */
    private C13373b f35406t;

    /* renamed from: u */
    private C13367a f35407u;

    /* renamed from: a */
    public final /* synthetic */ void mo32699a(Object obj) {
        m39181d((C13326a) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo32696a(C13377f fVar) {
        if (this.f35404r != null) {
            this.f35404r.mo32684a();
        }
        if (fVar != null) {
            if (this.f35404r == null) {
                this.f35404r = new C13378g(AwakeTimeSinceBootClock.get(), this);
            }
            this.f35404r.mo32685a(fVar);
            this.f35404r.mo32687a(true);
        }
    }

    /* renamed from: a */
    public final synchronized void mo32698a(C13653c cVar) {
        if (this.f35405s == null) {
            this.f35405s = new HashSet();
        }
        this.f35405s.add(cVar);
    }

    /* renamed from: a */
    public final void mo32697a(C13387b bVar) {
        super.mo32697a(bVar);
        m39177a((C13645c) null);
    }

    /* renamed from: k */
    private void m39182k() {
        synchronized (this) {
            this.f35406t = null;
        }
    }

    public String toString() {
        return C13303f.m38930a((Object) this).mo32569a("super", (Object) super.toString()).mo32569a("dataSourceSupplier", (Object) this.f35398c).toString();
    }

    /* renamed from: b */
    public final C13346c<C13326a<C13645c>> mo32702b() {
        if (C13783b.m40665b()) {
            C13783b.m40664a("PipelineDraweeController#getDataSource");
        }
        if (C13286a.m38846a(2)) {
            C13286a.m38835a(f35395n, "controller %x: getDataSource", (Object) Integer.valueOf(System.identityHashCode(this)));
        }
        C13346c<C13326a<C13645c>> cVar = (C13346c) this.f35398c.mo29879b();
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public C13326a<C13645c> mo32705c() {
        if (C13783b.m40665b()) {
            C13783b.m40664a("PipelineDraweeController#getCachedImage");
        }
        try {
            if (this.f35403q != null) {
                if (this.f35397b != null) {
                    C13326a<C13645c> a = this.f35403q.mo33128a(this.f35397b);
                    if (a == null || ((C13645c) a.mo32609a()).mo33266e().mo33285c()) {
                        if (C13783b.m40665b()) {
                            C13783b.m40663a();
                        }
                        return a;
                    }
                    a.close();
                    if (C13783b.m40665b()) {
                        C13783b.m40663a();
                    }
                    return null;
                }
            }
            return null;
        } finally {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.facebook.imagepipeline.p721h.C13653c mo32692a() {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            com.facebook.drawee.backends.pipeline.b.b r1 = r3.f35406t     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000f
            com.facebook.drawee.backends.pipeline.b.c r0 = new com.facebook.drawee.backends.pipeline.b.c     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = r3.f35468i     // Catch:{ all -> 0x0023 }
            com.facebook.drawee.backends.pipeline.b.b r2 = r3.f35406t     // Catch:{ all -> 0x0023 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0023 }
        L_0x000f:
            java.util.Set<com.facebook.imagepipeline.h.c> r1 = r3.f35405s     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.facebook.imagepipeline.h.b r1 = new com.facebook.imagepipeline.h.b     // Catch:{ all -> 0x0023 }
            java.util.Set<com.facebook.imagepipeline.h.c> r2 = r3.f35405s     // Catch:{ all -> 0x0023 }
            r1.<init>(r2)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x001f
            r1.mo33288a(r0)     // Catch:{ all -> 0x0023 }
        L_0x001f:
            monitor-exit(r3)
            return r1
        L_0x0021:
            monitor-exit(r3)
            return r0
        L_0x0023:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.backends.pipeline.C13381d.mo32692a():com.facebook.imagepipeline.h.c");
    }

    /* renamed from: d */
    private static void m39181d(C13326a<C13645c> aVar) {
        C13326a.m39001c(aVar);
    }

    /* renamed from: a */
    private void m39176a(C13310j<C13346c<C13326a<C13645c>>> jVar) {
        this.f35398c = jVar;
        m39177a((C13645c) null);
    }

    /* renamed from: b */
    public final /* synthetic */ int mo32701b(Object obj) {
        return m39180c((C13326a) obj);
    }

    /* renamed from: b */
    private static C13648f m39179b(C13326a<C13645c> aVar) {
        C13307g.m38947b(C13326a.m38999a(aVar));
        return (C13648f) aVar.mo32609a();
    }

    /* renamed from: c */
    private static int m39180c(C13326a<C13645c> aVar) {
        if (aVar != null) {
            return aVar.mo32615e();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo32693a(Drawable drawable) {
        if (drawable instanceof C13360a) {
            ((C13360a) drawable).mo32663a();
        }
    }

    /* renamed from: b */
    public final synchronized void mo32704b(C13653c cVar) {
        if (this.f35405s != null) {
            this.f35405s.remove(cVar);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo32706c(Object obj) {
        return m39179b((C13326a) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Drawable mo32707d(C13326a<C13645c> aVar) {
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("PipelineDraweeController#createDrawable");
            }
            C13307g.m38947b(C13326a.m38999a(aVar));
            C13645c cVar = (C13645c) aVar.mo32609a();
            m39177a(cVar);
            Drawable a = m39174a(this.f35400e, cVar);
            if (a != null) {
                return a;
            }
            Drawable a2 = m39174a(this.f35402p, cVar);
            if (a2 != null) {
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
                return a2;
            }
            Drawable b = this.f35401o.mo32679b(cVar);
            if (b != null) {
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
                return b;
            }
            StringBuilder sb = new StringBuilder("Unrecognized image class: ");
            sb.append(cVar);
            throw new UnsupportedOperationException(sb.toString());
        } finally {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo32703b(C13373b bVar) {
        if (this.f35406t instanceof C13369a) {
            ((C13369a) this.f35406t).mo32683b(bVar);
        } else if (this.f35406t != null) {
            this.f35406t = new C13369a(this.f35406t, bVar);
        } else {
            this.f35406t = bVar;
        }
    }

    /* renamed from: a */
    private void m39177a(C13645c cVar) {
        if (this.f35399d) {
            if (this.f35467h == null) {
                C13361a aVar = new C13361a();
                C13362a aVar2 = new C13362a(aVar);
                this.f35407u = new C13367a();
                mo32756a((C13401d<? super INFO>) aVar2);
                mo32761b((Drawable) aVar);
            }
            if (this.f35406t == null) {
                mo32695a((C13373b) this.f35407u);
            }
            if (this.f35467h instanceof C13361a) {
                C13361a aVar3 = (C13361a) this.f35467h;
                aVar3.mo32667a(this.f35468i);
                C13387b f = mo32718f();
                C13423b bVar = null;
                if (f != null) {
                    C13420o a = C13421p.m39381a(f.mo32722a());
                    if (a != null) {
                        bVar = a.f35586a;
                    }
                }
                aVar3.f35297c = bVar;
                aVar3.mo32668b(this.f35407u.mo32680a());
                if (cVar != null) {
                    aVar3.mo32665a(cVar.getWidth(), cVar.getHeight());
                    aVar3.f35295a = cVar.mo33259b();
                    return;
                }
                aVar3.mo32664a();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo32695a(C13373b bVar) {
        if (this.f35406t instanceof C13369a) {
            ((C13369a) this.f35406t).mo32682a(bVar);
        } else if (this.f35406t != null) {
            this.f35406t = new C13369a(this.f35406t, bVar);
        } else {
            this.f35406t = bVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo32700a(String str, C13326a<C13645c> aVar) {
        super.mo32700a(str, aVar);
        synchronized (this) {
            if (this.f35406t != null) {
                this.f35406t.mo32681a(str, 5, true);
            }
        }
    }

    /* renamed from: a */
    private static Drawable m39174a(ImmutableList<C13642a> immutableList, C13645c cVar) {
        if (immutableList == null) {
            return null;
        }
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            C13642a aVar = (C13642a) it.next();
            if (aVar.mo32678a(cVar)) {
                Drawable b = aVar.mo32679b(cVar);
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    public C13381d(Resources resources, C13390a aVar, C13642a aVar2, Executor executor, C13585p<C13265a, C13645c> pVar, ImmutableList<C13642a> immutableList) {
        super(aVar, executor, null, null);
        this.f35396a = resources;
        this.f35401o = new C13366a(resources, aVar2);
        this.f35402p = immutableList;
        this.f35403q = pVar;
    }

    /* renamed from: a */
    public final void mo32694a(C13310j<C13346c<C13326a<C13645c>>> jVar, String str, C13265a aVar, Object obj, ImmutableList<C13642a> immutableList, C13373b bVar) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("PipelineDraweeController#initialize");
        }
        super.mo32763b(str, obj);
        m39176a(jVar);
        this.f35397b = aVar;
        this.f35400e = immutableList;
        m39182k();
        m39177a((C13645c) null);
        mo32695a(bVar);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }
}
