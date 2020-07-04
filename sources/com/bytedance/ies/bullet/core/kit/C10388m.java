package com.bytedance.ies.bullet.core.kit;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ies.bullet.core.C10336c;
import com.bytedance.ies.bullet.core.common.YieldError;
import com.bytedance.ies.bullet.core.kit.bridge.C10363c;
import com.bytedance.ies.bullet.core.kit.bridge.C10374e;
import com.bytedance.ies.bullet.core.kit.bridge.C10375f;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.model.p542a.C10404c;
import com.bytedance.ies.bullet.core.model.pipeline.C10410d;
import com.bytedance.ies.bullet.core.model.pipeline.C10412f;
import com.bytedance.ies.bullet.core.model.pipeline.C10419i;
import com.bytedance.ies.bullet.core.monitor.C10420a;
import com.bytedance.ies.bullet.core.monitor.C10425c;
import com.bytedance.ies.bullet.core.p539b.C10334a;
import com.bytedance.ies.bullet.core.params.C10464g;
import com.bytedance.ies.bullet.core.params.C10471n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.ies.bullet.core.kit.m */
public abstract class C10388m implements C10382g {

    /* renamed from: a_ */
    public C10383h f28099a_;

    /* renamed from: b */
    public final List<C10383h> f28100b = new ArrayList();

    /* renamed from: c */
    private final List<String> f28101c = new ArrayList();

    /* renamed from: d */
    private C10336c f28102d;

    /* renamed from: e */
    private C10386k f28103e;

    /* renamed from: f */
    private C10379d f28104f;

    /* renamed from: g */
    private final List<C10386k> f28105g = new ArrayList();

    /* renamed from: h */
    private final List<C10379d> f28106h = new ArrayList();

    /* renamed from: i */
    private C10375f f28107i;

    /* renamed from: j */
    private C10471n f28108j;

    /* renamed from: k */
    private C10420a f28109k;

    /* renamed from: l */
    private final C10378c<?, ?, ?, ?> f28110l;

    /* renamed from: m */
    private final C10400u f28111m;

    /* renamed from: n */
    private final C10403b f28112n;

    /* renamed from: com.bytedance.ies.bullet.core.kit.m$a */
    static final class C10389a extends Lambda implements C7562b<Uri, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10388m f28113a;

        /* renamed from: b */
        final /* synthetic */ C7562b f28114b;

        /* renamed from: c */
        final /* synthetic */ C7562b f28115c;

        C10389a(C10388m mVar, C7562b bVar, C7562b bVar2) {
            this.f28113a = mVar;
            this.f28114b = bVar;
            this.f28115c = bVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30761a((Uri) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30761a(Uri uri) {
            C7573i.m23587b(uri, "it");
            this.f28113a.mo25169a(uri, this.f28114b, this.f28115c);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.kit.m$b */
    static final class C10390b extends Lambda implements C7562b<C10383h, C103911> {

        /* renamed from: a */
        final /* synthetic */ C10388m f28116a;

        C10390b(C10388m mVar) {
            this.f28116a = mVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C103911 invoke(final C10383h hVar) {
            C7573i.m23587b(hVar, "$receiver");
            return new C10410d<Uri>(this) {

                /* renamed from: a */
                final /* synthetic */ C10390b f28117a;

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo25083a(Uri uri, C7562b<? super Uri, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
                    C7573i.m23587b(uri, "input");
                    C7573i.m23587b(bVar, "resolve");
                    C7573i.m23587b(bVar2, "reject");
                }

                {
                    this.f28117a = r1;
                }
            };
        }
    }

    /* renamed from: com.bytedance.ies.bullet.core.kit.m$c */
    static final class C10392c extends Lambda implements C7562b<Uri, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C10388m f28119a;

        /* renamed from: b */
        final /* synthetic */ C7562b f28120b;

        C10392c(C10388m mVar, C7562b bVar) {
            this.f28119a = mVar;
            this.f28120b = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m30765a((Uri) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m30765a(Uri uri) {
            C7573i.m23587b(uri, "it");
            this.f28120b.invoke(uri);
            this.f28119a.mo25168a(uri);
        }
    }

    /* renamed from: s */
    private C10336c mo25365s() {
        return this.f28102d;
    }

    /* renamed from: a */
    public final C10400u mo25158a() {
        return this.f28111m;
    }

    /* renamed from: a */
    public abstract C10420a mo25167a(Uri uri, Uri uri2);

    /* renamed from: b */
    public final List<String> mo25160b() {
        return this.f28101c;
    }

    /* renamed from: b */
    public abstract void mo25170b(Uri uri);

    /* renamed from: b */
    public abstract void mo25171b(Uri uri, C7562b<? super Uri, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2);

    /* renamed from: c */
    public final C10375f mo25161c() {
        return this.f28107i;
    }

    /* renamed from: c */
    public abstract void mo25173c(List<String> list, C10336c cVar);

    /* renamed from: g */
    public final C10386k mo25174g() {
        return this.f28103e;
    }

    /* renamed from: h */
    public final C10379d mo25175h() {
        return this.f28104f;
    }

    /* renamed from: i */
    public final List<C10386k> mo25176i() {
        return this.f28105g;
    }

    /* renamed from: j */
    public final List<C10379d> mo25177j() {
        return this.f28106h;
    }

    /* renamed from: m */
    public final C10471n mo25180m() {
        return this.f28108j;
    }

    /* renamed from: n */
    public final C10420a mo25181n() {
        return this.f28109k;
    }

    /* renamed from: o */
    public abstract void mo25182o();

    /* renamed from: p */
    public abstract void mo25183p();

    /* renamed from: q */
    public final C10378c<?, ?, ?, ?> mo25184q() {
        return this.f28110l;
    }

    /* renamed from: r */
    public final C10403b mo25185r() {
        return this.f28112n;
    }

    /* renamed from: k */
    public final C10334a mo25178k() {
        return (C10334a) mo25185r().mo25202b(C10334a.class);
    }

    /* renamed from: l */
    public final C10425c mo25179l() {
        return (C10425c) mo25185r().mo25202b(C10425c.class);
    }

    /* renamed from: f */
    public final void mo25164f() {
        C10375f c = mo25161c();
        if (c != null) {
            c.mo25110a();
        }
        mo25183p();
        Iterator it = this.f28100b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: e */
    public final void mo25163e() {
        mo25172b(mo25160b(), mo25365s());
        mo25182o();
        Iterator it = this.f28100b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo25168a(Uri uri) {
        mo25170b(uri);
        Iterator it = this.f28100b.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo25159a(List<String> list, C10336c cVar) {
        C7573i.m23587b(list, "newPackageNames");
        C7573i.m23587b(cVar, "newRegistryBundle");
        mo25173c(list, cVar);
        mo25172b(list, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25172b(List<String> list, C10336c cVar) {
        C10410d dVar;
        C7573i.m23587b(list, "packageNames");
        C7573i.m23587b(cVar, "kitPackageRegistryBundle");
        this.f28101c.clear();
        this.f28101c.addAll(list);
        C10410d dVar2 = null;
        this.f28103e = null;
        this.f28104f = null;
        this.f28099a_ = null;
        C10385j a = cVar.mo25101a();
        if (a != null) {
            C10386k a2 = a.mo25036a(mo25185r());
            if (a2 != null) {
                this.f28103e = a2;
            }
            C10379d b = a.mo25037b(mo25185r());
            if (b != null) {
                this.f28104f = b;
                b.mo25157a(mo25185r());
            }
        }
        this.f28105g.clear();
        this.f28106h.clear();
        this.f28100b.clear();
        for (C10385j jVar : cVar.mo25102b()) {
            C10386k a3 = jVar.mo25036a(mo25185r());
            if (a3 != null) {
                this.f28105g.add(a3);
            }
            C10379d b2 = jVar.mo25037b(mo25185r());
            if (b2 != null) {
                this.f28106h.add(b2);
                b2.mo25157a(mo25185r());
            }
        }
        this.f28107i = null;
        for (C10374e eVar : cVar.mo25104d()) {
            List list2 = (List) eVar.mo25038a().invoke(mo25185r());
            List list3 = (List) eVar.mo25039b().invoke(mo25185r());
            try {
                dVar = (C10410d) eVar.mo25040c().invoke(mo25185r());
            } catch (YieldError unused) {
                dVar = null;
            }
            C10363c cVar2 = new C10363c(list2, list3, mo25185r(), dVar);
            if (this.f28107i == null) {
                this.f28107i = cVar2;
            } else {
                C10375f fVar = this.f28107i;
                if (fVar != null) {
                    fVar.mo25140a(cVar2, false);
                }
            }
        }
        C10374e c = cVar.mo25103c();
        if (c != null) {
            try {
                dVar2 = (C10410d) c.mo25040c().invoke(mo25185r());
            } catch (YieldError unused2) {
            }
            C10363c cVar3 = new C10363c((List) c.mo25038a().invoke(mo25185r()), (List) c.mo25039b().invoke(mo25185r()), mo25185r(), dVar2);
            if (this.f28107i == null) {
                this.f28107i = cVar3;
            } else {
                C10375f fVar2 = this.f28107i;
                if (fVar2 != null) {
                    fVar2.mo25140a(cVar3, false);
                }
            }
        }
        this.f28102d = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo25083a(Uri uri, C7562b<? super Uri, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
        C10412f fVar;
        C7573i.m23587b(uri, "input");
        C7573i.m23587b(bVar, "resolve");
        C7573i.m23587b(bVar2, "reject");
        C7562b bVar3 = new C10390b(this);
        List arrayList = new ArrayList();
        for (C10383h invoke : this.f28100b) {
            arrayList.add((C10410d) bVar3.invoke(invoke));
        }
        C10383h hVar = this.f28099a_;
        if (hVar != null) {
            C10410d dVar = (C10410d) bVar3.invoke(hVar);
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            fVar = new C10419i(arrayList, null, 2, null);
        } else {
            fVar = null;
        }
        C10412f fVar2 = fVar;
        if (fVar2 == null) {
            mo25169a(uri, bVar, bVar2);
        } else {
            fVar2.mo25083a(uri, new C10389a(this, bVar, bVar2), bVar2);
        }
    }

    /* renamed from: a */
    public final void mo25169a(Uri uri, C7562b<? super Uri, C7581n> bVar, C7562b<? super Throwable, C7581n> bVar2) {
        C10471n nVar;
        C10464g gVar;
        Object obj;
        C10386k kVar = (C10386k) C7525m.m23513g(mo25176i());
        if (kVar == null) {
            kVar = mo25174g();
        }
        Object obj2 = null;
        if (kVar != null) {
            nVar = kVar.mo25050a(mo25185r());
            C10404c a = mo25185r().mo25199a(C10464g.class);
            if (a != null) {
                gVar = (C10464g) a.mo25197b();
            } else {
                gVar = null;
            }
            if (gVar != null) {
                obj = gVar.mo25253a();
            } else {
                obj = null;
            }
            if (obj instanceof Bundle) {
                obj2 = obj;
            }
            Bundle bundle = (Bundle) obj2;
            if (bundle != null) {
                nVar.mo25262a(Bundle.class, bundle);
            }
            nVar.mo25262a(Uri.class, uri);
            if (gVar != null) {
                gVar.mo25254a(nVar);
            }
        } else {
            nVar = null;
        }
        this.f28108j = nVar;
        C10398s sVar = new C10398s();
        sVar.mo25262a(Uri.class, uri);
        C10420a a2 = mo25167a(uri, (Uri) sVar.f28128a.mo25251b());
        a2.mo25211a(mo25158a().f28131a);
        this.f28109k = a2;
        mo25171b(uri, new C10392c(this, bVar), bVar2);
    }

    public C10388m(C10378c<?, ?, ?, ?> cVar, C10400u uVar, List<String> list, C10336c cVar2, C10403b bVar) {
        C7573i.m23587b(cVar, "kitApi");
        C7573i.m23587b(uVar, "sessionInfo");
        C7573i.m23587b(list, "packageNames");
        C7573i.m23587b(cVar2, "kitPackageRegistryBundle");
        C7573i.m23587b(bVar, "providerFactory");
        this.f28110l = cVar;
        this.f28111m = uVar;
        this.f28112n = bVar;
        this.f28101c.clear();
        this.f28101c.addAll(list);
        this.f28102d = cVar2;
        mo25185r().mo25201a(C10382g.class, this);
    }
}
