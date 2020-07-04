package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.support.p029v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.filter.C29240bc;
import com.p280ss.android.ugc.aweme.filter.C29241bd;
import com.p280ss.android.ugc.aweme.filter.C29241bd.C29242a;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39682m.C39683a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39682m.C39684b;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39369c;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39370d;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39376h;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.j */
public final class C39673j implements C39682m {

    /* renamed from: a */
    protected C29296g f103151a;

    /* renamed from: b */
    protected VideoPublishEditModel f103152b;

    /* renamed from: c */
    protected AppCompatActivity f103153c;

    /* renamed from: d */
    protected FrameLayout f103154d;

    /* renamed from: e */
    protected C29241bd f103155e;

    /* renamed from: f */
    public C39684b f103156f;

    /* renamed from: g */
    public boolean f103157g;

    /* renamed from: h */
    protected C23258e f103158h;

    /* renamed from: i */
    public C39683a f103159i;

    public C39673j() {
    }

    /* renamed from: a */
    public final void mo98952a() {
        if (this.f103155e != null) {
            this.f103155e.mo74755b();
        }
    }

    /* renamed from: b */
    public final void mo98955b() {
        if (this.f103155e == null) {
            m126976c();
        }
        this.f103155e.mo74749a();
    }

    /* renamed from: c */
    private void m126976c() {
        C396752 r1;
        C29242a a = new C29242a(this.f103153c, this.f103154d).mo74870a(this.f103158h).mo74873a((C39376h) new C39376h() {
            /* renamed from: a */
            public final void mo74759a(C29296g gVar) {
            }

            /* renamed from: d */
            public final void mo74763d(C29296g gVar) {
            }

            /* renamed from: b */
            public final void mo74761b(C29296g gVar) {
                if (C39673j.this.f103156f != null) {
                    C39673j.this.f103156f.mo98969a();
                }
            }

            /* renamed from: c */
            public final void mo74762c(C29296g gVar) {
                String str;
                String str2;
                C39673j.this.f103151a = gVar;
                if (C39673j.this.f103156f != null) {
                    C39673j.this.f103156f.mo98970a(gVar);
                }
                EffectCategoryResponse b = C35563c.m114837d().mo74825b(gVar);
                if (b == null) {
                    str = "";
                } else {
                    str = b.name;
                }
                C42962b bVar = C42962b.f111525a;
                String str3 = "select_filter";
                C22984d a = C22984d.m75611a().mo59973a("creation_id", C39673j.this.f103152b.creationId).mo59973a("shoot_way", C39673j.this.f103152b.mShootWay).mo59970a("draft_id", C39673j.this.f103152b.draftId).mo59973a("enter_method", "click");
                String str4 = "enter_from";
                if (C39673j.this.f103157g) {
                    str2 = "edit_post_page";
                } else {
                    str2 = "video_edit_page";
                }
                bVar.mo104671a(str3, a.mo59973a(str4, str2).mo59973a("filter_name", gVar.f77268c).mo59970a("filter_id", gVar.f77266a).mo59973a("tab_name", str).f60753a);
            }

            /* renamed from: a */
            public final void mo74760a(C29296g gVar, int i) {
                if (C39673j.this.f103156f != null) {
                    C39673j.this.f103156f.mo98971a(gVar, i);
                }
            }
        }).mo74871a((C29240bc) new C39369c(C35563c.f93224F.mo70097l().mo74950c().mo74723f())).mo74874a(this.f103152b.getAvetParameter());
        if (this.f103159i != null) {
            r1 = new C39370d() {
                /* renamed from: a */
                public final int mo74911a(C29296g gVar) {
                    return C39673j.this.f103159i.mo98966a(gVar);
                }

                /* renamed from: b */
                public final int mo74912b(C29296g gVar) {
                    return C39673j.this.f103159i.mo98967b(gVar);
                }

                /* renamed from: c */
                public final float mo74913c(C29296g gVar) {
                    return C39673j.this.f103159i.mo98968c(gVar);
                }
            };
        } else {
            r1 = null;
        }
        this.f103155e = a.mo74872a((C39370d) r1).mo74876a();
        if (this.f103151a != null) {
            this.f103155e.mo74751a(this.f103151a);
        }
    }

    /* renamed from: a */
    public final void mo98954a(C39684b bVar) {
        this.f103156f = bVar;
    }

    /* renamed from: a */
    public final void mo98953a(C29296g gVar) {
        this.f103151a = gVar;
        if (this.f103155e != null) {
            this.f103155e.mo74751a(gVar);
        }
    }

    public C39673j(AppCompatActivity appCompatActivity, C23258e eVar, FrameLayout frameLayout, C29296g gVar, VideoPublishEditModel videoPublishEditModel) {
        this.f103153c = appCompatActivity;
        this.f103158h = eVar;
        this.f103151a = gVar;
        this.f103154d = frameLayout;
        this.f103152b = videoPublishEditModel;
    }
}
