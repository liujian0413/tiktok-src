package com.p280ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.LiveData;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.filter.C29202ag.C29203a;
import com.p280ss.android.ugc.aweme.filter.C29202ag.C29204b;
import com.p280ss.android.ugc.aweme.filter.C29202ag.C29205c;
import com.p280ss.android.ugc.aweme.filter.C29202ag.C29206d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39370d;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39372f;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39372f.C39373a;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39374g;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39374g.C39375a;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39376h;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39377i;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39378j;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40187b;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40189d;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;

/* renamed from: com.ss.android.ugc.aweme.filter.bm */
public final class C29254bm implements C39374g, C39377i, C40187b {

    /* renamed from: a */
    protected final C40189d f77173a;

    /* renamed from: b */
    public final C29203a f77174b;

    /* renamed from: c */
    public C29296g f77175c;

    /* renamed from: d */
    public C29296g f77176d;

    /* renamed from: e */
    public boolean f77177e;

    /* renamed from: f */
    public C29206d f77178f;

    /* renamed from: g */
    public C29205c f77179g;

    /* renamed from: h */
    public C39375a f77180h;

    /* renamed from: i */
    public C29204b f77181i;

    /* renamed from: j */
    public boolean f77182j;

    /* renamed from: k */
    private final AppCompatActivity f77183k;

    /* renamed from: l */
    private C23258e f77184l;

    /* renamed from: m */
    private boolean f77185m;

    /* renamed from: n */
    private boolean f77186n;

    /* renamed from: o */
    private C39372f f77187o;

    /* renamed from: p */
    private C39378j f77188p;

    /* renamed from: q */
    private C39376h f77189q;

    /* renamed from: r */
    private C39370d f77190r;

    /* renamed from: s */
    private C39373a f77191s;

    /* access modifiers changed from: private */
    /* renamed from: l */
    public C39377i mo74909j() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74894a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            m95953o();
        }
    }

    /* renamed from: a */
    public final void mo74897a(boolean z) {
        if (this.f77187o != null && !this.f77187o.mo74933b()) {
            this.f77187o.mo74925a(this.f77175c);
            mo74908i();
            this.f77176d = this.f77175c;
        }
    }

    /* renamed from: a */
    public final void mo74895a(List<C29296g> list) {
        if (this.f77187o != null) {
            this.f77187o.mo74928a(list);
        }
    }

    /* renamed from: a */
    public final void mo74896a(List<C29296g> list, int i) {
        if (this.f77187o != null) {
            this.f77187o.mo74929a(list, i);
        }
    }

    /* renamed from: d */
    public final void mo74902d() {
        mo74890a(this.f77175c);
    }

    /* renamed from: o */
    private void m95953o() {
        if (!C23536f.m77298a()) {
            m95949e(mo74906g());
        }
    }

    /* renamed from: c */
    public final boolean mo74901c() {
        if (this.f77186n || !this.f77177e) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ C7581n mo74910k() {
        if (this.f77175c != null) {
            mo74905f();
        }
        return null;
    }

    /* renamed from: n */
    private C29296g m95952n() {
        if (this.f77175c == null || this.f77187o == null) {
            return null;
        }
        return this.f77187o.mo74931b(this.f77175c);
    }

    /* renamed from: a */
    public final void mo74886a() {
        this.f77180h.mo74884a().observe(this.f77183k, new C29259bo(this));
    }

    /* renamed from: b */
    public final LiveData<Boolean> mo74898b() {
        return ((FilterViewModel) C0069x.m159a((FragmentActivity) this.f77183k).mo147a(FilterViewModel.class)).mo74772c();
    }

    /* renamed from: g */
    public final C29296g mo74906g() {
        C29296g n = m95952n();
        if (n == null) {
            return C35574k.m114859a().mo70097l().mo74949b().mo74967c();
        }
        return n;
    }

    /* renamed from: i */
    public final void mo74908i() {
        boolean z;
        if (this.f77188p != null) {
            C39378j jVar = this.f77188p;
            C29296g gVar = this.f77176d;
            C29296g gVar2 = this.f77175c;
            if (this.f77176d.f77270e < this.f77175c.f77270e) {
                z = true;
            } else {
                z = false;
            }
            jVar.mo74784a(gVar, gVar2, z);
        }
    }

    /* renamed from: m */
    private String m95951m() {
        if (this.f77175c == null) {
            return "";
        }
        if (!(this.f77175c instanceof C29324o) || !TextUtils.equals("filter_box", ((C29324o) this.f77175c).f77320o)) {
            return "click";
        }
        return "filter_box";
    }

    /* renamed from: h */
    public final void mo74907h() {
        if (this.f77175c != null) {
            this.f77179g.mo74806b(this.f77175c);
            for (C29296g gVar : C35574k.m114859a().mo70097l().mo74949b().mo74966b()) {
                if (gVar.equals(this.f77175c)) {
                    gVar.f77276k = true;
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo74904e() {
        C39370d dVar;
        if (this.f77188p != null) {
            ShortVideoContext b = this.f77180h.mo74885b();
            C6907h.m21524a("click_modify_entrance", (Map) C22984d.m75611a().mo59973a("creation_id", b.f99787w).mo59973a("shoot_way", b.f99788x).mo59973a("content_source", b.mo96148i().getContentSource()).mo59973a("content_type", b.mo96148i().getContentType()).mo59973a("enter_from", "video_shoot_page").mo59973a("scene_id", "1004").f60753a);
            C39378j jVar = this.f77188p;
            AppCompatActivity appCompatActivity = this.f77183k;
            C23258e eVar = this.f77184l;
            AVETParameter i = this.f77180h.mo74885b().mo96148i();
            if (this.f77182j) {
                dVar = this.f77190r;
            } else {
                dVar = null;
            }
            jVar.mo74783a(appCompatActivity, eVar, i, dVar, new C29260bp(this));
        }
    }

    /* renamed from: f */
    public final void mo74905f() {
        String str;
        EffectCategoryResponse b = C35574k.m114859a().mo70097l().mo74951d().mo74825b(this.f77175c);
        if (b == null) {
            str = "";
        } else {
            str = b.name;
        }
        ShortVideoContext b2 = this.f77180h.mo74885b();
        C6907h.m21524a("select_filter", (Map) C22984d.m75611a().mo59973a("creation_id", b2.f99787w).mo59973a("shoot_way", b2.f99788x).mo59970a("draft_id", b2.f99790z).mo59973a("enter_method", m95951m()).mo59973a("enter_from", "video_shoot_page").mo59973a("filter_name", this.f77175c.f77268c).mo59970a("filter_id", this.f77175c.f77266a).mo59973a("tab_name", str).mo59973a("content_source", b2.mo96148i().getContentSource()).mo59973a("content_type", b2.mo96148i().getContentType()).mo59973a("enter_from", "video_shoot_page").f60753a);
    }

    /* renamed from: c */
    public final void mo74900c(C29296g gVar) {
        this.f77175c = gVar;
        FilterViewModel.m95784a(this.f77183k, gVar);
    }

    /* renamed from: e */
    private void m95949e(C29296g gVar) {
        if (!this.f77185m) {
            this.f77179g.mo74806b(gVar);
        }
    }

    /* renamed from: a */
    public final void mo74887a(float f) {
        if (this.f77187o != null) {
            this.f77187o.mo74923a(f);
        }
    }

    /* renamed from: d */
    public final void mo74903d(C29296g gVar) {
        this.f77175c = gVar;
        this.f77176d = this.f77175c;
        if (!this.f77185m) {
            FilterViewModel.m95784a(this.f77183k, gVar);
        }
    }

    /* renamed from: b */
    public final void mo74899b(C29296g gVar) {
        if (this.f77187o != null && !this.f77187o.mo74933b()) {
            this.f77175c = gVar;
            this.f77176d = this.f77175c;
            if (!this.f77185m) {
                FilterViewModel.m95784a(this.f77183k, gVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo74889a(int i) {
        if (this.f77187o != null) {
            this.f77187o.mo74932b(i);
        }
    }

    /* renamed from: a */
    public final void mo74890a(C29296g gVar) {
        int i;
        boolean z = false;
        if (gVar != null) {
            i = gVar.f77270e;
        } else {
            i = 0;
        }
        if (!this.f77185m) {
            if (i == 0) {
                z = true;
            }
            this.f77186n = z;
            if (this.f77187o != null) {
                this.f77187o.mo74924a(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo74891a(C39372f fVar) {
        if (this.f77187o != null) {
            this.f77187o.mo74927a((C39373a) null);
        }
        this.f77187o = fVar;
        if (fVar != null) {
            fVar.mo74927a(this.f77191s);
        }
    }

    /* renamed from: a */
    public final void mo74892a(C39378j jVar) {
        if (this.f77188p != null) {
            this.f77188p.mo74785a(null);
        }
        this.f77188p = jVar;
        if (jVar != null) {
            jVar.mo74785a(this.f77189q);
        }
    }

    /* renamed from: a */
    public final void mo74888a(float f, float f2) {
        if (!(this.f77188p == null || this.f77187o == null)) {
            this.f77187o.mo74926a(this.f77175c, f, f2, this.f77188p.mo97959d().getWidth());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74893a(C40189d dVar, Boolean bool) {
        if (bool.booleanValue()) {
            dVar.mo99961a("");
        }
        this.f77185m = bool.booleanValue();
        C35574k.m114859a().mo70091f().mo93341a(Property.DisableFilter, bool.booleanValue());
    }

    private C29254bm(AppCompatActivity appCompatActivity, C40189d dVar, C29203a aVar, C29206d dVar2, C29205c cVar, C39375a aVar2) {
        this.f77177e = true;
        this.f77186n = true;
        this.f77189q = new C39376h() {
            /* renamed from: d */
            public final void mo74763d(C29296g gVar) {
            }

            /* renamed from: a */
            public final void mo74759a(C29296g gVar) {
                C29254bm.this.f77178f.mo74807a();
            }

            /* renamed from: b */
            public final void mo74761b(C29296g gVar) {
                C29254bm.this.f77178f.mo74808b();
            }

            /* renamed from: c */
            public final void mo74762c(C29296g gVar) {
                C29254bm.this.f77179g.mo74806b(gVar);
                C29254bm.this.f77179g.mo74804a(gVar);
                if (!gVar.equals(C29254bm.this.f77175c)) {
                    C29254bm.this.f77176d = C29254bm.this.f77175c;
                    C29254bm.this.f77175c = gVar;
                    C29254bm.this.f77176d = C29254bm.this.f77175c;
                    C29254bm.this.mo74908i();
                    C29254bm.this.mo74905f();
                }
            }

            /* renamed from: a */
            public final void mo74760a(C29296g gVar, int i) {
                C29254bm.this.f77179g.mo74805a(gVar, i);
            }
        };
        this.f77190r = new C39370d() {
            /* renamed from: a */
            public final int mo74911a(C29296g gVar) {
                return C29254bm.this.f77181i.mo74800a(gVar);
            }

            /* renamed from: b */
            public final int mo74912b(C29296g gVar) {
                return C29254bm.this.f77181i.mo74801b(gVar);
            }

            /* renamed from: c */
            public final float mo74913c(C29296g gVar) {
                return C29254bm.this.f77181i.mo74802c(gVar);
            }
        };
        this.f77191s = new C39373a() {
            /* renamed from: a */
            public final C29296g mo74914a() {
                return C29254bm.this.mo74906g();
            }

            /* renamed from: b */
            public final void mo74918b() {
                C29254bm.this.f77174b.mo74798a();
            }

            /* renamed from: a */
            public final void mo74915a(C29296g gVar) {
                String str;
                if (gVar != null) {
                    C29254bm.this.f77175c = gVar;
                    EffectCategoryResponse b = C35574k.m114859a().mo70097l().mo74951d().mo74825b(C29254bm.this.f77175c);
                    if (b == null) {
                        str = "";
                    } else {
                        str = b.name;
                    }
                    ShortVideoContext b2 = C29254bm.this.f77180h.mo74885b();
                    C6907h.m21524a("select_filter", (Map) C22984d.m75611a().mo59973a("creation_id", b2.f99787w).mo59973a("shoot_way", b2.f99788x).mo59970a("draft_id", b2.f99790z).mo59973a("enter_method", "slide").mo59973a("enter_from", "video_shoot_page").mo59973a("filter_name", C29254bm.this.f77175c.f77268c).mo59970a("filter_id", C29254bm.this.f77175c.f77266a).mo59973a("tab_name", str).mo59973a("content_source", b2.mo96148i().getContentSource()).mo59973a("content_type", b2.mo96148i().getContentType()).mo59973a("enter_from", "video_shoot_page").f60753a);
                }
                C29254bm.this.f77174b.mo74799b();
            }

            /* renamed from: a */
            public final void mo74916a(C29296g gVar, boolean z) {
                C29254bm.this.mo74900c(gVar);
                if (!z) {
                    C29254bm.this.f77179g.mo74806b(C29254bm.this.f77175c);
                } else if (C29254bm.this.f77182j) {
                    C29254bm.this.f77173a.mo99962a(gVar.mo74978b(), C29254bm.this.f77181i.mo74802c(gVar));
                } else {
                    C29254bm.this.f77173a.mo99961a(gVar.mo74978b());
                }
                C29254bm.this.f77179g.mo74804a(C29254bm.this.f77175c);
                if (C29254bm.this.mo74901c()) {
                    C29254bm.this.mo74908i();
                }
                C29254bm.this.f77177e = false;
                C29254bm.this.f77176d = C29254bm.this.f77175c;
            }

            /* renamed from: a */
            public final void mo74917a(List<? extends C29296g> list, boolean z, float f) {
                if (!z) {
                    C29254bm.this.f77179g.mo74803a(f);
                } else if (C29254bm.this.f77182j) {
                    C29254bm.this.f77173a.mo99970b(C29254bm.this.mo74906g().f77270e, list, f);
                } else {
                    C29254bm.this.f77173a.mo99960a(C29254bm.this.mo74906g().f77270e, list, f);
                }
            }
        };
        this.f77183k = appCompatActivity;
        this.f77173a = dVar;
        this.f77174b = aVar;
        this.f77178f = dVar2;
        this.f77179g = cVar;
        this.f77180h = aVar2;
        this.f77176d = mo74906g();
        FilterViewModel.m95785a(appCompatActivity, Boolean.valueOf(C35574k.m114859a().mo70091f().mo93342a(Property.DisableFilter)));
        FilterViewModel.m95788c(appCompatActivity, new C29258bn(this, dVar));
    }

    public C29254bm(AppCompatActivity appCompatActivity, C23258e eVar, C40189d dVar, C29203a aVar, C29206d dVar2, C29205c cVar, C39375a aVar2, boolean z, C29204b bVar) {
        this(appCompatActivity, dVar, aVar, dVar2, cVar, aVar2);
        this.f77184l = eVar;
        this.f77181i = bVar;
        this.f77182j = z;
    }
}
