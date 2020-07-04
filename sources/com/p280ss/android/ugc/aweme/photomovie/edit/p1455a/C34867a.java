package com.p280ss.android.ugc.aweme.photomovie.edit.p1455a;

import android.app.Activity;
import android.content.Context;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.filter.C29240bc;
import com.p280ss.android.ugc.aweme.filter.C29241bd;
import com.p280ss.android.ugc.aweme.filter.C29241bd.C29242a;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.photomovie.edit.player.C34918a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39677l;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39369c;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39376h;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.a.a */
public final class C34867a implements C34869b {

    /* renamed from: a */
    public AppCompatActivity f90931a;

    /* renamed from: b */
    public C34918a f90932b;

    /* renamed from: c */
    public C29296g f90933c;

    /* renamed from: d */
    public View f90934d;

    /* renamed from: e */
    public C39677l f90935e;

    /* renamed from: f */
    public JSONObject f90936f;

    /* renamed from: g */
    private FrameLayout f90937g;

    /* renamed from: h */
    private C29241bd f90938h;

    /* renamed from: a */
    public final boolean mo88313a() {
        if (this.f90938h == null || this.f90934d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C29296g mo88396c() {
        if (this.f90933c == null) {
            return C35563c.f93224F.mo70097l().mo74949b().mo74962a(0);
        }
        return this.f90933c;
    }

    /* renamed from: b */
    public final void mo88395b() {
        if (this.f90938h == null) {
            this.f90938h = new C29242a(this.f90931a, this.f90937g).mo74873a((C39376h) new C39376h() {
                /* renamed from: a */
                public final void mo74759a(C29296g gVar) {
                }

                /* renamed from: a */
                public final void mo74760a(C29296g gVar, int i) {
                }

                /* renamed from: d */
                public final void mo74763d(C29296g gVar) {
                }

                /* renamed from: b */
                public final void mo74761b(C29296g gVar) {
                    C34867a.this.f90934d.setVisibility(0);
                    if (!C39805en.m127445a()) {
                        C23487o.m77136a((Activity) C34867a.this.f90931a);
                    }
                    C6907h.m21519a((Context) C34867a.this.f90931a, "filter_confirm", "mid_page", "0", 0, C34867a.this.f90936f);
                }

                /* renamed from: c */
                public final void mo74762c(C29296g gVar) {
                    String str;
                    C34867a.this.f90933c = gVar;
                    C34867a.this.f90932b.mo88467a(gVar.f77273h);
                    if (C34867a.this.f90935e != null) {
                        C34867a.this.f90935e.mo98958a(gVar);
                    }
                    EffectCategoryResponse b = C35563c.m114837d().mo74825b(C34867a.this.f90933c);
                    if (b == null) {
                        str = "";
                    } else {
                        str = b.name;
                    }
                    C6907h.m21524a("select_filter", (Map) C38511bc.m123103a().mo96485a("creation_id", C34867a.this.f90932b.mo88460a().creationId).mo96485a("shoot_way", C34867a.this.f90932b.mo88460a().mShootWay).mo96483a("draft_id", C34867a.this.f90932b.mo88460a().draftId).mo96485a("enter_method", "click").mo96485a("filter_name", C34867a.this.f90933c.f77268c).mo96483a("filter_id", C34867a.this.f90933c.f77266a).mo96485a("tab_name", str).mo96485a("content_source", C34867a.this.f90932b.mo88460a().getAvetParameter().getContentSource()).mo96485a("content_type", C34867a.this.f90932b.mo88460a().getAvetParameter().getContentType()).mo96485a("enter_from", "video_edit_page").f100112a);
                }
            }).mo74871a((C29240bc) new C39369c(C35563c.f93224F.mo70097l().mo74950c().mo74723f())).mo74874a(this.f90932b.mo88460a().getAvetParameter()).mo74876a();
            if (this.f90933c != null) {
                this.f90938h.mo74751a(this.f90933c);
            }
        }
        this.f90938h.mo74749a();
        this.f90934d.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo88393a(C39677l lVar) {
        this.f90935e = lVar;
    }

    /* renamed from: a */
    public final void mo88394a(JSONObject jSONObject) {
        this.f90936f = jSONObject;
    }

    /* renamed from: a */
    public final void mo88392a(C29296g gVar) {
        this.f90933c = gVar;
        if (this.f90938h != null) {
            this.f90938h.mo74751a(this.f90933c);
        }
    }

    public C34867a(AppCompatActivity appCompatActivity, C34918a aVar, View view, FrameLayout frameLayout) {
        this.f90931a = appCompatActivity;
        this.f90932b = aVar;
        this.f90934d = view;
        this.f90937g = frameLayout;
        C35563c.f93224F.mo70097l().mo74949b().mo74963a();
    }
}
