package com.p280ss.android.ugc.aweme.newfollow.p1421d;

import android.app.Activity;
import android.content.Context;
import android.view.TextureView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28249j;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29370e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29371f;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21751b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.longvideo.C32752l;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.newfollow.C34118b.C34119a;
import com.p280ss.android.ugc.aweme.newfollow.C34118b.C34120b;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.newfollow.util.C34199d;
import com.p280ss.android.ugc.aweme.newfollow.util.C34200e;
import com.p280ss.android.ugc.aweme.newfollow.util.C34204g;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.poi.event.C35078a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.newfollow.d.h */
public final class C34135h implements C28519d, C34119a, C34976f, C44963i {

    /* renamed from: a */
    public boolean f88942a;

    /* renamed from: b */
    public String f88943b;

    /* renamed from: c */
    public C28228a f88944c = new C28228a();

    /* renamed from: d */
    public int f88945d = 2;

    /* renamed from: e */
    public boolean f88946e;

    /* renamed from: f */
    private C34120b f88947f;

    /* renamed from: g */
    private C34199d f88948g;

    /* renamed from: h */
    private Aweme f88949h;

    /* renamed from: i */
    private C28297e f88950i;

    /* renamed from: j */
    private String f88951j;

    /* renamed from: k */
    private boolean f88952k;

    /* renamed from: l */
    private String f88953l;

    public final void aA_() {
    }

    /* renamed from: b */
    public final void mo64944b(float f) {
    }

    /* renamed from: b */
    public final void mo64946b(C44919c cVar) {
    }

    /* renamed from: b */
    public final void mo64947b(boolean z) {
    }

    /* renamed from: k */
    private C29370e m109927k() {
        return C29371f.m96475a().mo75106c(this.f88953l);
    }

    /* renamed from: m */
    private void m109929m() {
        C29370e c = C29371f.m96475a().mo75106c(this.f88953l);
        if (c != null) {
            c.mo75090a();
        }
    }

    /* renamed from: e */
    public final C43222g mo86818e() {
        if (this.f88948g != null) {
            return this.f88948g.f89179a;
        }
        return null;
    }

    /* renamed from: i */
    public final long mo86822i() {
        if (this.f88948g != null) {
            return this.f88948g.mo86938d();
        }
        return 0;
    }

    /* renamed from: l */
    private Aweme m109928l() {
        if (this.f88949h.getAwemeType() == 13) {
            return this.f88949h.getForwardItem();
        }
        return this.f88949h;
    }

    /* renamed from: n */
    private void m109930n() {
        C29370e c = C29371f.m96475a().mo75106c(this.f88953l);
        if (c != null) {
            c.mo75096a(true, this.f88951j);
        }
    }

    /* renamed from: p */
    private void m109932p() {
        this.f88948g.mo86940f();
        this.f88944c.f74354a = 2;
        if (m109927k() != null) {
            m109927k().f77397b = 2;
        }
    }

    /* renamed from: q */
    private void m109933q() {
        this.f88948g.mo86941g();
        this.f88944c.f74354a = 4;
        if (m109927k() != null) {
            m109927k().f77397b = 4;
        }
    }

    /* renamed from: c */
    public final void mo86816c() {
        if ((!this.f88947f.mo86785e() || this.f88942a) && this.f88948g != null) {
            this.f88948g.mo86939e();
        }
        this.f88952k = true;
    }

    /* renamed from: r */
    private void m109934r() {
        if (!C34136i.m109958a(C6399b.m19921a())) {
            C10761a.m31399c((Context) this.f88947f.mo86784d(), (int) R.string.cjs).mo25750a();
            return;
        }
        this.f88948g.mo86941g();
        this.f88944c.f74354a = 4;
        if (m109927k() != null) {
            m109927k().f77397b = 4;
        }
    }

    /* renamed from: d */
    public final void mo86817d() {
        C29370e k = m109927k();
        if (this.f88948g != null && (k == null || k.f77404i)) {
            if (this.f88948g.f89179a != null) {
                this.f88948g.f89179a.mo104947w();
            }
            C34200e.m110432a().mo86946a(this.f88948g.f89179a);
        }
        if (this.f88950i != null) {
            this.f88950i.mo71836c();
        }
        if (this.f88948g != null) {
            this.f88948g.mo86931a();
        }
    }

    /* renamed from: g */
    public final void mo86820g() {
        Aweme l = m109928l();
        if (l != null && l.getMusic() != null && l.getMusic().isOriginMusic()) {
            SmartRouter.buildRoute((Context) this.f88947f.mo86784d(), "aweme://music/category/").open();
            C34138b.m110004c(this.f88949h, this.f88951j, this.f88943b);
        }
    }

    /* renamed from: h */
    public final void mo86821h() {
        int i;
        if (this.f88944c.f74354a == 3) {
            i = 0;
        } else {
            i = 1;
        }
        this.f88945d = i;
        if (this.f88945d == 0) {
            C34138b.m109966a(this.f88949h);
        } else {
            C34138b.m109978a(this.f88949h, mo64928a(true), true);
        }
        if (this.f88945d == 0) {
            m109934r();
        } else {
            m109931o();
        }
    }

    /* renamed from: j */
    private void m109926j() {
        this.f88947f.mo86776a().mo107455a((C44963i) this);
        this.f88948g = new C34199d(this.f88947f.mo86776a(), (C34976f) this, (C28249j) this.f88950i, C32752l.f85393a);
        C29370e k = m109927k();
        if (k == null || k.f77402g == null) {
            this.f88948g.f89179a = C34200e.m110432a().mo86947b();
            this.f88947f.mo86781a(true);
        } else {
            this.f88948g.f89179a = k.f77402g;
        }
        this.f88948g.mo86934a(this.f88949h);
        this.f88948g.f89181c = this.f88946e;
    }

    /* renamed from: o */
    private void m109931o() {
        switch (this.f88945d) {
            case 0:
            case 4:
                if (C34136i.m109958a(C6399b.m19921a())) {
                    m109933q();
                    break;
                } else {
                    C10761a.m31399c((Context) this.f88947f.mo86784d(), (int) R.string.cjs).mo25750a();
                    return;
                }
            case 1:
                break;
            case 2:
                this.f88947f.mo86781a(true);
                if (!C34136i.m109958a(C6399b.m19921a())) {
                    C10761a.m31399c((Context) this.f88947f.mo86784d(), (int) R.string.cjs).mo25750a();
                    return;
                } else {
                    m109932p();
                    return;
                }
            case 3:
                this.f88947f.mo86781a(true);
                break;
        }
        this.f88948g.mo86939e();
        this.f88944c.f74354a = 3;
        this.f88947f.mo86777a(1);
        if (m109927k() != null) {
            m109927k().f77397b = 3;
        }
    }

    /* renamed from: b */
    public final void mo86815b() {
        if (this.f88948g != null) {
            if (this.f88952k || m109927k() == null || !(m109927k().f77397b == 3 || m109927k().f77397b == 0)) {
                this.f88948g.mo86941g();
            } else {
                this.f88947f.mo86777a(1);
                this.f88944c.f74354a = 3;
                C34120b bVar = this.f88947f;
                C39330h hVar = new C39330h(12, this.f88948g.mo86937c(), this.f88948g.mo86938d());
                bVar.mo86780a(hVar);
                return;
            }
        }
        this.f88952k = false;
    }

    /* renamed from: f */
    public final void mo86819f() {
        Aweme l = m109928l();
        if (l != null && l.getMusic() != null) {
            if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(l.getMusic().convertToMusicModel(), this.f88947f.mo86784d(), true)) {
                C6907h.m21524a("enter_music_detail_failed", (Map) new C22984d().mo59973a("group_id", C33230ac.m107238m(this.f88949h)).mo59973a("author_id", C33230ac.m107205a(this.f88949h)).mo59973a("music_id", C33230ac.m107236k(this.f88949h)).mo59973a("enter_from", this.f88951j).f60753a);
                return;
            }
            C7195s a = C7195s.m22438a();
            Activity d = this.f88947f.mo86784d();
            StringBuilder sb = new StringBuilder("aweme://music/detail/");
            sb.append(l.getMusic().getMid());
            a.mo18679a(d, C7203u.m22460a(sb.toString()).mo18694a("aweme_id", l.getAid()).mo18695a());
            C34138b.m110004c(this.f88949h, this.f88951j, this.f88943b);
        }
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return this.f88951j;
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        this.f88947f.mo86780a(new C39330h(7));
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        this.f88947f.mo86780a(new C39330h(1));
        this.f88947f.mo86783c();
        this.f88947f.mo86777a(1);
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        int i;
        this.f88947f.mo86780a(new C39330h(8, z, 0));
        C34120b bVar = this.f88947f;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        bVar.mo86777a(i);
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        this.f88944c.f74354a = 1;
        this.f88947f.mo86780a(new C39330h(2));
        this.f88947f.mo86777a(2);
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
        this.f88947f.mo86780a(new C39330h(6));
        C42961az.m136380a(new C21751b(2, this.f88949h));
        C34138b.m109995b(this.f88949h, this.f88951j);
        C42961az.m136380a(new C35078a(C33230ac.m107223e(this.f88949h)));
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        this.f88944c.f74354a = 2;
        this.f88947f.mo86780a(new C39330h(0, dVar.f115531c));
        this.f88947f.mo86782b();
        this.f88947f.mo86777a(0);
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        this.f88944c.f74354a = 3;
        this.f88947f.mo86777a(1);
        this.f88947f.mo86783c();
        if (this.f88945d == 3) {
            C34120b bVar = this.f88947f;
            C39330h hVar = new C39330h(12, this.f88948g.mo86937c(), this.f88948g.mo86938d());
            bVar.mo86780a(hVar);
        } else {
            this.f88947f.mo86780a(new C39330h(4));
        }
        m109930n();
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        this.f88947f.mo86781a(false);
        this.f88944c.f74354a = 2;
        this.f88947f.mo86780a(new C39330h(5));
        m109929m();
        if (m109927k() != null) {
            m109927k().mo75095a(this.f88951j, true);
        }
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        this.f88947f.mo86781a(false);
        this.f88944c.f74354a = 2;
        this.f88947f.mo86782b();
        this.f88947f.mo86777a(0);
        if (this.f88945d == 4) {
            C34120b bVar = this.f88947f;
            C39330h hVar = new C39330h(11, this.f88948g.mo86937c(), this.f88948g.mo86938d());
            bVar.mo86780a(hVar);
        } else {
            this.f88947f.mo86780a(new C39330h(3));
        }
        m109929m();
    }

    /* renamed from: a */
    public final void mo63037a(int i, int i2) {
        if (this.f88947f.isActive()) {
            m109931o();
        }
        Aweme l = m109928l();
        if (l != null && l.getVideo() != null) {
            C34204g.m110444a(i, i2, (TextureView) this.f88947f.mo86776a().mo107454a(), ((float) l.getVideo().getHeight()) / ((float) l.getVideo().getWidth()));
            this.f88947f.mo86778a(i, i2);
        }
    }

    /* renamed from: b */
    public final void mo63039b(int i, int i2) {
        Aweme l = m109928l();
        if (l != null && l.getVideo() != null) {
            C34204g.m110444a(i, i2, (TextureView) this.f88947f.mo86776a().mo107454a(), ((float) l.getVideo().getHeight()) / ((float) l.getVideo().getWidth()));
            this.f88947f.mo86779a(i, i2, ((float) l.getVideo().getHeight()) / ((float) l.getVideo().getWidth()));
        }
    }

    public C34135h(Aweme aweme, C34120b bVar, String str, String str2) {
        this.f88947f = bVar;
        this.f88949h = aweme;
        this.f88953l = str2;
        if (this.f88949h != null) {
            this.f88951j = str;
            this.f88950i = new C28297e(this.f88951j, 0, null, this);
            this.f88950i.mo71834a(bVar.mo86784d(), null);
            m109926j();
        }
    }
}
