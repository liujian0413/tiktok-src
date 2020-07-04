package com.iab.omid.library.bytedance.adsession;

import android.view.View;
import com.iab.omid.library.bytedance.p789b.C18407a;
import com.iab.omid.library.bytedance.p789b.C18416g;
import com.iab.omid.library.bytedance.p791d.C18426d;
import com.iab.omid.library.bytedance.p792e.C18428a;
import com.iab.omid.library.bytedance.p793f.C18430a;
import com.iab.omid.library.bytedance.p793f.C18432b;
import com.iab.omid.library.bytedance.p793f.C18433c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: com.iab.omid.library.bytedance.adsession.g */
public final class C18403g extends C18398b {

    /* renamed from: a */
    public final List<C18428a> f49923a = new ArrayList();

    /* renamed from: b */
    public boolean f49924b = false;

    /* renamed from: c */
    public boolean f49925c = false;

    /* renamed from: d */
    private final C18400d f49926d;

    /* renamed from: e */
    private final C18399c f49927e;

    /* renamed from: f */
    private C18428a f49928f;

    /* renamed from: g */
    private C18430a f49929g;

    /* renamed from: h */
    private String f49930h;

    /* renamed from: i */
    private boolean f49931i;

    C18403g(C18399c cVar, C18400d dVar) {
        this.f49927e = cVar;
        this.f49926d = dVar;
        this.f49930h = UUID.randomUUID().toString();
        m60561e(null);
        this.f49929g = dVar.f49916e == AdSessionContextType.HTML ? new C18432b(dVar.f49913b) : new C18433c(dVar.mo47809a(), dVar.f49914c);
        this.f49929g.mo47860a();
        C18407a.m60593a().mo47832a(this);
        this.f49929g.mo47863a(cVar);
    }

    /* renamed from: c */
    private C18428a m60559c(View view) {
        for (C18428a aVar : this.f49923a) {
            if (aVar.get() == view) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    private static void m60560d(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: e */
    private void m60561e(View view) {
        this.f49928f = new C18428a(view);
    }

    /* renamed from: f */
    private void m60562f(View view) {
        Collection<C18403g> b = C18407a.m60593a().mo47833b();
        if (b != null && b.size() > 0) {
            for (C18403g gVar : b) {
                if (gVar != this && gVar.mo47813f() == view) {
                    gVar.f49928f.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m60563j() {
        if (!this.f49925c) {
            this.f49923a.clear();
        }
    }

    /* renamed from: k */
    private void m60564k() {
        if (this.f49931i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: a */
    public final void mo47802a() {
        if (!this.f49924b) {
            this.f49924b = true;
            C18407a.m60593a().mo47834b(this);
            this.f49929g.mo47861a(C18416g.m60629a().f49955a);
            this.f49929g.mo47864a(this, this.f49926d);
        }
    }

    /* renamed from: a */
    public final void mo47803a(View view) {
        if (!this.f49925c) {
            C18426d.m60669a((Object) view, "AdView is null");
            if (mo47813f() != view) {
                m60561e(view);
                mo47811d().mo47873e();
                m60562f(view);
            }
        }
    }

    /* renamed from: b */
    public final void mo47804b() {
        if (!this.f49925c) {
            this.f49928f.clear();
            m60563j();
            this.f49925c = true;
            mo47811d().mo47871c();
            C18407a.m60593a().mo47836c(this);
            mo47811d().mo47869b();
            this.f49929g = null;
        }
    }

    /* renamed from: b */
    public final void mo47805b(View view) {
        if (!this.f49925c) {
            m60560d(view);
            if (m60559c(view) == null) {
                this.f49923a.add(new C18428a(view));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo47810c() {
        m60564k();
        mo47811d().mo47872d();
        this.f49931i = true;
    }

    /* renamed from: d */
    public final C18430a mo47811d() {
        return this.f49929g;
    }

    /* renamed from: e */
    public final String mo47812e() {
        return this.f49930h;
    }

    /* renamed from: f */
    public final View mo47813f() {
        return (View) this.f49928f.get();
    }

    /* renamed from: g */
    public final boolean mo47814g() {
        return this.f49924b && !this.f49925c;
    }

    /* renamed from: h */
    public final boolean mo47815h() {
        return this.f49927e.mo47806a();
    }

    /* renamed from: i */
    public final boolean mo47816i() {
        return this.f49927e.mo47807b();
    }
}
