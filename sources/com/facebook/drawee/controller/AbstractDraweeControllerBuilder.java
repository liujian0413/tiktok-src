package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.common.internal.C13303f;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13310j;
import com.facebook.datasource.C13346c;
import com.facebook.datasource.C13347d;
import com.facebook.datasource.C13350f;
import com.facebook.datasource.C13354g;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.p694b.C13364a;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.p698c.C13389d;
import com.facebook.imagepipeline.p725l.C13783b;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements C13389d {

    /* renamed from: n */
    private static final C13401d<Object> f35436n = new C13400c<Object>() {
        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    };

    /* renamed from: o */
    private static final NullPointerException f35437o = new NullPointerException("No image request was specified!");

    /* renamed from: r */
    private static final AtomicLong f35438r = new AtomicLong();

    /* renamed from: a */
    public final Context f35439a;

    /* renamed from: b */
    public Object f35440b;

    /* renamed from: c */
    public REQUEST f35441c;

    /* renamed from: d */
    public REQUEST f35442d;

    /* renamed from: e */
    public REQUEST[] f35443e;

    /* renamed from: f */
    public C13310j<C13346c<IMAGE>> f35444f;

    /* renamed from: g */
    public C13401d<? super INFO> f35445g;

    /* renamed from: h */
    public C13402e f35446h;

    /* renamed from: i */
    public boolean f35447i;

    /* renamed from: j */
    public boolean f35448j;

    /* renamed from: k */
    public boolean f35449k;

    /* renamed from: l */
    public String f35450l;

    /* renamed from: m */
    public C13386a f35451m;

    /* renamed from: p */
    private final Set<C13401d> f35452p;

    /* renamed from: q */
    private boolean f35453q;

    public enum CacheLevel {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* renamed from: j */
    private BUILDER m39253j() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C13346c<IMAGE> mo32709a(C13386a aVar, String str, REQUEST request, Object obj, CacheLevel cacheLevel);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C13396a mo32712a();

    /* renamed from: c */
    public final C13396a mo32730f() {
        return C13399b.m39310a(this);
    }

    /* renamed from: a */
    public final BUILDER mo32746a(REQUEST[] requestArr) {
        return m39245a(requestArr, true);
    }

    /* renamed from: a */
    public final BUILDER mo32745a(boolean z) {
        this.f35447i = z;
        return m39253j();
    }

    /* renamed from: e */
    protected static String m39249e() {
        return String.valueOf(f35438r.getAndIncrement());
    }

    /* renamed from: b */
    public final BUILDER mo32747b() {
        m39250g();
        return m39253j();
    }

    /* renamed from: g */
    private void m39250g() {
        this.f35440b = null;
        this.f35441c = null;
        this.f35442d = null;
        this.f35443e = null;
        this.f35453q = true;
        this.f35445g = null;
        this.f35446h = null;
        this.f35447i = false;
        this.f35448j = false;
        this.f35451m = null;
        this.f35450l = null;
    }

    /* renamed from: d */
    public final C13396a mo32753d() {
        m39251h();
        if (this.f35441c == null && this.f35443e == null && this.f35442d != null) {
            this.f35441c = this.f35442d;
            this.f35442d = null;
        }
        return m39252i();
    }

    /* renamed from: h */
    private void m39251h() {
        boolean z;
        boolean z2 = false;
        if (this.f35443e == null || this.f35441c == null) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38948b(z, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f35444f == null || (this.f35443e == null && this.f35441c == null && this.f35442d == null)) {
            z2 = true;
        }
        C13307g.m38948b(z2, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    /* renamed from: i */
    private C13396a m39252i() {
        if (C13783b.m40665b()) {
            C13783b.m40664a("AbstractDraweeControllerBuilder#buildController");
        }
        C13396a a = mo32712a();
        a.f35472m = this.f35449k;
        a.mo32757a(this.f35450l);
        a.f35466g = this.f35446h;
        m39247b(a);
        m39246a(a);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
        return a;
    }

    /* renamed from: c */
    public final BUILDER mo32750c(REQUEST request) {
        this.f35442d = request;
        return m39253j();
    }

    /* renamed from: c */
    private void m39248c(C13396a aVar) {
        if (aVar.f35465f == null) {
            aVar.mo32755a(C13364a.m39133a(this.f35439a));
        }
    }

    /* renamed from: b */
    private void m39247b(C13396a aVar) {
        if (this.f35447i) {
            aVar.mo32764e().f35433a = this.f35447i;
            m39248c(aVar);
        }
    }

    /* renamed from: c */
    public final BUILDER mo32751c(boolean z) {
        this.f35448j = z;
        return m39253j();
    }

    /* renamed from: b */
    public final BUILDER mo32748b(REQUEST request) {
        this.f35441c = request;
        return m39253j();
    }

    /* renamed from: a */
    private void m39246a(C13396a aVar) {
        if (this.f35452p != null) {
            for (C13401d a : this.f35452p) {
                aVar.mo32756a(a);
            }
        }
        if (this.f35445g != null) {
            aVar.mo32756a(this.f35445g);
        }
        if (this.f35448j) {
            aVar.mo32756a(f35436n);
        }
    }

    /* renamed from: b */
    public final BUILDER mo32749b(boolean z) {
        this.f35449k = z;
        return m39253j();
    }

    /* renamed from: a */
    public final BUILDER mo32729b(C13386a aVar) {
        this.f35451m = aVar;
        return m39253j();
    }

    /* renamed from: a */
    public final BUILDER mo32743a(C13401d<? super INFO> dVar) {
        this.f35445g = dVar;
        return m39253j();
    }

    /* renamed from: a */
    public final BUILDER mo32744a(Object obj) {
        this.f35440b = obj;
        return m39253j();
    }

    protected AbstractDraweeControllerBuilder(Context context, Set<C13401d> set) {
        this.f35439a = context;
        this.f35452p = set;
        m39250g();
    }

    /* renamed from: a */
    private BUILDER m39245a(REQUEST[] requestArr, boolean z) {
        boolean z2;
        if (requestArr == null || requestArr.length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13307g.m38944a(z2, (Object) "No requests specified!");
        this.f35443e = requestArr;
        this.f35453q = true;
        return m39253j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C13310j<C13346c<IMAGE>> mo32741a(C13386a aVar, String str) {
        if (this.f35444f != null) {
            return this.f35444f;
        }
        C13310j<C13346c<IMAGE>> jVar = null;
        if (this.f35441c != null) {
            jVar = m39242a(aVar, str, this.f35441c);
        } else if (this.f35443e != null) {
            jVar = m39244a(aVar, str, this.f35443e, this.f35453q);
        }
        if (!(jVar == null || this.f35442d == null)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(jVar);
            arrayList.add(m39242a(aVar, str, this.f35442d));
            jVar = C13354g.m39096a(arrayList, false);
        }
        if (jVar == null) {
            jVar = C13347d.m39077b(f35437o);
        }
        return jVar;
    }

    /* renamed from: a */
    private C13310j<C13346c<IMAGE>> m39242a(C13386a aVar, String str, REQUEST request) {
        return m39243a(aVar, str, request, CacheLevel.FULL_FETCH);
    }

    /* renamed from: a */
    private C13310j<C13346c<IMAGE>> m39243a(C13386a aVar, String str, REQUEST request, CacheLevel cacheLevel) {
        final Object obj = this.f35440b;
        final C13386a aVar2 = aVar;
        final String str2 = str;
        final REQUEST request2 = request;
        final CacheLevel cacheLevel2 = cacheLevel;
        C133952 r0 = new C13310j<C13346c<IMAGE>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C13346c<IMAGE> mo29879b() {
                return AbstractDraweeControllerBuilder.this.mo32709a(aVar2, str2, request2, obj, cacheLevel2);
            }

            public final String toString() {
                return C13303f.m38930a((Object) this).mo32569a("request", (Object) request2.toString()).toString();
            }
        };
        return r0;
    }

    /* renamed from: a */
    private C13310j<C13346c<IMAGE>> m39244a(C13386a aVar, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST a : requestArr) {
                arrayList.add(m39243a(aVar, str, a, CacheLevel.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST a2 : requestArr) {
            arrayList.add(m39242a(aVar, str, a2));
        }
        return C13350f.m39080a(arrayList);
    }
}
