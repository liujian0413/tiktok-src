package com.facebook.drawee.backends.pipeline.p696b;

import android.graphics.Rect;
import com.facebook.common.time.C13331b;
import com.facebook.drawee.backends.pipeline.C13381d;
import com.facebook.drawee.backends.pipeline.p696b.p697a.C13370a;
import com.facebook.drawee.backends.pipeline.p696b.p697a.C13371b;
import com.facebook.drawee.backends.pipeline.p696b.p697a.C13372c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.p698c.C13387b;
import com.facebook.imagepipeline.p721h.C13651a;
import com.facebook.imagepipeline.p721h.C13652b;
import com.facebook.imagepipeline.p721h.C13653c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.facebook.drawee.backends.pipeline.b.g */
public final class C13378g extends C13651a {

    /* renamed from: a */
    private final C13381d f35361a;

    /* renamed from: b */
    private final C13331b f35362b;

    /* renamed from: c */
    private final C13379h f35363c = new C13379h();

    /* renamed from: d */
    private C13374c f35364d;

    /* renamed from: e */
    private C13373b f35365e;

    /* renamed from: f */
    private C13372c f35366f;

    /* renamed from: g */
    private C13370a f35367g;

    /* renamed from: h */
    private C13652b f35368h;

    /* renamed from: i */
    private List<C13377f> f35369i;

    /* renamed from: j */
    private boolean f35370j;

    /* renamed from: b */
    private void m39155b() {
        if (this.f35369i != null) {
            this.f35369i.clear();
        }
    }

    /* renamed from: a */
    public final void mo32684a() {
        m39155b();
        mo32687a(false);
        this.f35363c.mo32689a();
    }

    /* renamed from: c */
    private void m39156c() {
        C13387b f = this.f35361a.mo32718f();
        if (f != null && f.mo32722a() != null) {
            Rect bounds = f.mo32722a().getBounds();
            this.f35363c.f35385o = bounds.width();
            this.f35363c.f35386p = bounds.height();
        }
    }

    /* renamed from: d */
    private void m39157d() {
        if (this.f35367g == null) {
            this.f35367g = new C13370a(this.f35362b, this.f35363c, this);
        }
        if (this.f35366f == null) {
            this.f35366f = new C13372c(this.f35362b, this.f35363c);
        }
        if (this.f35365e == null) {
            this.f35365e = new C13371b(this.f35363c, this);
        }
        if (this.f35364d == null) {
            this.f35364d = new C13374c(this.f35361a.f35468i, this.f35365e);
        } else {
            this.f35364d.f35340a = this.f35361a.f35468i;
        }
        if (this.f35368h == null) {
            this.f35368h = new C13652b(this.f35366f, this.f35364d);
        }
    }

    /* renamed from: a */
    public final void mo32685a(C13377f fVar) {
        if (fVar != null) {
            if (this.f35369i == null) {
                this.f35369i = new LinkedList();
            }
            this.f35369i.add(fVar);
        }
    }

    /* renamed from: a */
    public final void mo32687a(boolean z) {
        this.f35370j = z;
        if (z) {
            m39157d();
            if (this.f35365e != null) {
                this.f35361a.mo32695a(this.f35365e);
            }
            if (this.f35367g != null) {
                this.f35361a.mo32756a((C13401d<? super INFO>) this.f35367g);
            }
            if (this.f35368h != null) {
                this.f35361a.mo32698a((C13653c) this.f35368h);
            }
        } else {
            if (this.f35365e != null) {
                this.f35361a.mo32703b(this.f35365e);
            }
            if (this.f35367g != null) {
                this.f35361a.mo32762b((C13401d<? super INFO>) this.f35367g);
            }
            if (this.f35368h != null) {
                this.f35361a.mo32704b((C13653c) this.f35368h);
            }
        }
    }

    public C13378g(C13331b bVar, C13381d dVar) {
        this.f35362b = bVar;
        this.f35361a = dVar;
    }

    /* renamed from: a */
    public final void mo32686a(C13379h hVar, int i) {
        hVar.f35387q = i;
        if (this.f35370j && this.f35369i != null && !this.f35369i.isEmpty()) {
            if (i == 3) {
                m39156c();
            }
            hVar.mo32691b();
            Iterator it = this.f35369i.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: b */
    public final void mo32688b(C13379h hVar, int i) {
        if (this.f35370j && this.f35369i != null && !this.f35369i.isEmpty()) {
            hVar.mo32691b();
            Iterator it = this.f35369i.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
