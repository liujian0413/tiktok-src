package com.p280ss.android.ugc.aweme.forward.p1269c;

import android.app.Activity;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.TextureView.SurfaceTextureListener;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C21098ab;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p280ss.android.ugc.aweme.feed.C28227b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.flowfeed.p1252f.C29363d;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29370e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21746d;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21751b;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21753d;
import com.p280ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29875f;
import com.p280ss.android.ugc.aweme.forward.p1271e.C29902c;
import com.p280ss.android.ugc.aweme.forward.p1271e.C29903d;
import com.p280ss.android.ugc.aweme.main.C32950d;
import com.p280ss.android.ugc.aweme.metrics.C33253ax;
import com.p280ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p280ss.android.ugc.aweme.newfollow.util.C34199d;
import com.p280ss.android.ugc.aweme.newfollow.util.C34200e;
import com.p280ss.android.ugc.aweme.newfollow.util.C34204g;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.forward.c.i */
public class C29889i extends C29881c implements C34976f {

    /* renamed from: k */
    public C21746d f78506k;

    /* renamed from: l */
    protected int f78507l;

    /* renamed from: m */
    public boolean f78508m;

    /* renamed from: n */
    private C34199d f78509n;

    /* renamed from: o */
    private C28228a f78510o;

    /* renamed from: p */
    private C43222g f78511p;

    /* renamed from: q */
    private KeepSurfaceTextureView f78512q;

    /* renamed from: r */
    private boolean f78513r;

    /* renamed from: s */
    private Aweme f78514s;

    /* renamed from: t */
    private C21098ab f78515t;

    /* renamed from: b */
    public final void mo75112b() {
        super.mo75112b();
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

    /* renamed from: e */
    public final void mo75884e() {
        super.mo75884e();
    }

    /* renamed from: a */
    public final void mo63046a(String str) {
        if (m97835f(str)) {
            ((C29875f) this.f78493a).mo75901a(false);
            ((C29875f) this.f78493a).mo75899a(0);
            this.f78493a.mo75893h();
            this.f78510o.f74354a = 2;
            C29875f fVar = (C29875f) this.f78493a;
            C39330h hVar = new C39330h(11, this.f78509n.mo86937c(), this.f78509n.mo86938d());
            fVar.mo75900a(hVar);
            m97840v();
        }
    }

    /* renamed from: a */
    public final void mo63045a(C44921e eVar) {
        if (m97835f(eVar.f115532a)) {
            ((C29875f) this.f78493a).mo75901a(false);
            ((C29875f) this.f78493a).mo75900a(new C39330h(5));
            m97839u();
            m97840v();
            C32950d.m106523a("video_play");
        }
    }

    /* renamed from: d */
    public final void mo75883d() {
        super.mo75883d();
        mo75934c(false);
    }

    /* renamed from: A */
    private boolean m97832A() {
        this.f78509n.f89179a = mo75937o();
        this.f78509n.mo86936b();
        return true;
    }

    /* renamed from: B */
    private boolean m97833B() {
        this.f78509n.f89179a = mo75937o();
        this.f78509n.mo86936b();
        return true;
    }

    /* renamed from: r */
    private void m97836r() {
        this.f78512q.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C29889i.this.mo75931l();
                return true;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C29889i.this.mo75933b(i, i2);
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C29889i.this.mo75932a(i, i2);
            }
        });
    }

    /* renamed from: v */
    private void m97840v() {
        C29370e j = mo75927j();
        if (j != null) {
            j.mo75090a();
        }
    }

    /* renamed from: z */
    private boolean m97844z() {
        if (C6399b.m19944t()) {
            return m97832A();
        }
        return m97833B();
    }

    /* renamed from: l */
    public final void mo75931l() {
        ((C29875f) this.f78493a).mo75901a(true);
        C42961az.m136383d(this);
    }

    /* renamed from: n */
    public final void mo75936n() {
        C29370e j = mo75927j();
        if (j != null) {
            j.f77402g = null;
            this.f78509n.f89179a = null;
            this.f78511p = null;
        }
    }

    /* renamed from: s */
    private boolean m97837s() {
        if (!(this.f78493a.mo75888b() instanceof FragmentActivity)) {
            return false;
        }
        return FollowEnterDetailViewModel.m96850a(this.f78496d, (FragmentActivity) this.f78493a.mo75888b()).f77626a;
    }

    /* renamed from: w */
    private void m97841w() {
        C29370e j = mo75927j();
        if (j != null && this.f78511p != null) {
            j.mo75097a(this.f78513r, this.f78496d, this.f78497e, "");
        }
    }

    /* renamed from: x */
    private void m97842x() {
        this.f78500h.removeMessages(16);
        Message message = new Message();
        message.what = 16;
        message.obj = this.f78494b;
        this.f78500h.sendMessage(message);
    }

    /* renamed from: y */
    private void m97843y() {
        this.f78500h.removeMessages(16);
        Message message = new Message();
        message.what = 16;
        message.obj = this.f78494b;
        this.f78500h.sendMessageDelayed(message, 150);
    }

    /* renamed from: a */
    public final void mo75110a() {
        super.mo75110a();
        mo75935m();
        if (this.f78494b != null) {
            C29370e j = mo75927j();
            if (j != null) {
                j.f77397b = 0;
            }
        }
    }

    /* renamed from: m */
    public final void mo75935m() {
        if (this.f78514s != null) {
            this.f78500h.removeMessages(16);
            this.f78509n.mo86939e();
        }
    }

    /* renamed from: o */
    public final C43222g mo75937o() {
        if (this.f78511p == null) {
            C29370e j = mo75927j();
            if (j == null || j.f77402g == null) {
                this.f78511p = C34200e.m110432a().mo86947b();
            } else {
                this.f78511p = j.f77402g;
            }
        }
        return this.f78511p;
    }

    /* renamed from: t */
    private void m97838t() {
        if (this.f78510o.f74354a != 3) {
            this.f78493a.mo75894i();
            ((C29875f) this.f78493a).mo75899a(1);
            this.f78510o.f74354a = 3;
            ((C29875f) this.f78493a).mo75900a(new C39330h(4));
        }
    }

    /* renamed from: c */
    public final void mo75882c() {
        if (this.f78508m) {
            this.f78508m = false;
            return;
        }
        if (!m97837s()) {
            super.mo75882c();
        }
        if (mo75925h() || mo75926i()) {
            this.f78493a.mo75895l();
            return;
        }
        mo75935m();
        C43305j.m137386g().mo105028b();
    }

    /* renamed from: u */
    private void m97839u() {
        C29370e j = mo75927j();
        if (j != null) {
            j.mo75094a(this.f78496d, this.f78497e, this.f78513r);
            if (this.f78493a.mo75888b() instanceof Activity) {
                Intent intent = ((Activity) this.f78493a.mo75888b()).getIntent();
                if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                    String stringExtra = intent.getStringExtra("rule_id");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        new C33253ax("video_play_from_push").mo85189v(stringExtra).mo85252e();
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo75885f() {
        super.mo75885f();
        this.f78500h.removeMessages(16);
        ((C29875f) this.f78493a).mo75901a(true);
        mo75935m();
        this.f78493a.mo75895l();
        ((C29875f) this.f78493a).mo75902b(false);
        if (this.f78511p != null) {
            if (this.f78494b != null) {
                if (this.f78494b.getAwemeType() == 13) {
                    C43305j.m137386g().mo105087b(this.f78494b.getForwardItem());
                } else if (this.f78494b.getAwemeType() == 0) {
                    C43305j.m137386g().mo105087b(this.f78494b);
                }
            }
            C34200e.m110432a().mo86946a(this.f78511p);
            this.f78509n.mo86931a();
            this.f78509n.f89179a = null;
            this.f78511p = null;
        }
        mo75928k();
    }

    /* renamed from: g */
    public final void mo75886g() {
        if (this.f78494b != null && this.f78494b.getForwardItem() != null) {
            C29370e j = mo75927j();
            if (j != null) {
                j.f77398c.mo104682a(256);
            }
            String a = C29902c.m97929a(this.f78493a.mo75887a().mo58075d(), this.f78494b.getAid());
            C29903d.m97930a().mo75966a(a, new C29902c(a, this.f78494b, mo75937o()));
            C29363d.m96451a().mo75037a(this.f78493a.mo75888b(), this.f78494b, this.f78496d, a, this.f78497e);
        }
    }

    /* renamed from: p */
    public final void mo75939p() {
        if (this.f78509n.f89179a == null) {
            this.f78509n.f89179a = mo75937o();
        }
        if (!C29891j.m97876a(C6399b.m19921a())) {
            C10761a.m31399c(this.f78493a.mo75888b(), (int) R.string.cjs).mo25750a();
        } else if (!this.f78498f && this.f78494b != null && this.f78514s.getVideo() != null) {
            if (this.f78510o.f74354a == 2 || this.f78510o.f74354a == 1) {
                C6903bc.m21486e().mo75368a(this.f78494b, this.f78496d, this.f78513r);
                mo75935m();
                if (mo75927j() != null) {
                    mo75927j().f77397b = 3;
                }
            } else if ((this.f78510o.f74354a == 3 || this.f78510o.f74354a == 0) && this.f78514s.getVideo().getProperPlayAddr() != null) {
                C6903bc.m21486e().mo75371b(this.f78494b);
                ((C29875f) this.f78493a).mo75899a(0);
                this.f78514s.getVideo().setRationAndSourceId(this.f78494b.getAid());
                this.f78509n.f89179a = mo75937o();
                this.f78509n.mo86941g();
                if (this.f78506k != null) {
                    this.f78506k.mo58035a(this.f78494b);
                }
                if (mo75927j() != null) {
                    mo75927j().f77397b = 4;
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo75940q() {
        float f;
        if (this.f78494b != null) {
            this.f78513r = true;
            C29370e j = mo75927j();
            if (j != null) {
                j.f77398c.mo104682a(16777216);
                j.f77397b = this.f78510o.f74354a;
                j.f77400e = ((C29875f) this.f78493a).mo75905p()[0];
                j.f77399d = ((C29875f) this.f78493a).mo75905p()[1];
                j.f77402g = mo75937o();
                if (this.f78509n.f89179a == null) {
                    this.f78509n.f89179a = mo75937o();
                }
                int[] iArr = new int[2];
                this.f78512q.getLocationOnScreen(iArr);
                if (this.f78514s == null || this.f78514s.getVideo() == null) {
                    f = ((float) this.f78512q.getHeight()) / ((float) this.f78512q.getWidth());
                } else {
                    f = ((float) this.f78514s.getVideo().getHeight()) / ((float) this.f78514s.getVideo().getWidth());
                }
                IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], this.f78512q.getHeight(), this.f78512q.getWidth(), (float) this.f78493a.mo75888b().getResources().getDimensionPixelOffset(R.dimen.hf), f);
                int i = this.f78510o.f74354a;
                if (i != 0) {
                    switch (i) {
                        case 2:
                            C29363d.m96451a().mo75034a(this.f78493a.mo75888b(), iViewInfo, this.f78494b, 4, this.f78496d, j.f77403h, false, true);
                            return;
                        case 3:
                            break;
                        default:
                            C29363d.m96451a().mo75034a(this.f78493a.mo75888b(), iViewInfo, this.f78494b, 2, this.f78496d, j.f77403h, false, true);
                            return;
                    }
                }
                C29363d.m96451a().mo75034a(this.f78493a.mo75888b(), iViewInfo, this.f78494b, 3, this.f78496d, j.f77403h, false, true);
            }
        }
    }

    /* renamed from: b */
    public final void mo75924b(int i) {
        m97842x();
    }

    /* renamed from: f */
    private boolean m97835f(String str) {
        if (this.f78494b == null) {
            return false;
        }
        return TextUtils.equals(str, this.f78494b.getAid());
    }

    /* renamed from: c */
    public final void mo75934c(boolean z) {
        if (this.f78493a.mo75888b() instanceof FragmentActivity) {
            FollowEnterDetailViewModel.m96850a(this.f78496d, (FragmentActivity) this.f78493a.mo75888b()).f77626a = z;
        }
    }

    /* renamed from: d */
    public final void mo64951d(String str) {
        if (m97835f(str)) {
            m97838t();
            if (!mo75925h()) {
                m97841w();
            }
        }
    }

    /* renamed from: e_ */
    public final void mo64954e_(boolean z) {
        int i;
        ((C29875f) this.f78493a).mo75900a(new C39330h(8, z, 0));
        C29875f fVar = (C29875f) this.f78493a;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        fVar.mo75899a(i);
    }

    public void handleMsg(Message message) {
        super.handleMsg(message);
        if (message.what == 16) {
            m97834a((Aweme) message.obj);
        }
    }

    /* renamed from: a */
    public final void mo75111a(int i) {
        super.mo75111a(i);
        switch (i) {
            case 0:
            case 1:
                m97843y();
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    public final void mo64953e(String str) {
        if (m97835f(str)) {
            ((C29875f) this.f78493a).mo75900a(new C39330h(6));
            mo75923a(0);
            C6903bc.m21486e().mo75365a(this.f78494b, this.f78497e, "", this.f78496d);
        }
    }

    /* renamed from: b */
    public final void mo63047b(String str) {
        if (m97835f(str)) {
            ((C29875f) this.f78493a).mo75900a(new C39330h(7));
        }
    }

    /* renamed from: c */
    public final void mo64949c(String str) {
        if (m97835f(str)) {
            ((C29875f) this.f78493a).mo75899a(2);
            this.f78510o.f74354a = 1;
            ((C29875f) this.f78493a).mo75900a(new C39330h(2));
        }
    }

    @C7709l
    public void onFollowFeedDetailEvent(C21751b bVar) {
        if (this.f78493a != null && this.f78493a.mo75889c() && bVar.f58260b != null && bVar.f58260b.getAid().equals(this.f78494b.getAid())) {
            switch (bVar.f58259a) {
                case 1:
                    ((C29875f) this.f78493a).mo75899a(bVar.f58261c);
                    return;
                case 2:
                    mo75923a(0);
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m97834a(Aweme aweme) {
        if (!C29891j.m97876a(C6399b.m19921a())) {
            ((C29875f) this.f78493a).mo75899a(3);
            C10761a.m31399c(this.f78493a.mo75888b(), (int) R.string.cjs).mo25750a();
        } else if (!this.f78498f && this.f78493a.mo75889c() && this.f78493a.mo75890d() && aweme != null && this.f78494b != null && TextUtils.equals(this.f78494b.getAid(), aweme.getAid())) {
            C29370e j = mo75927j();
            if (j == null) {
                this.f78510o.f74354a = 4;
            } else if (!j.f77398c.mo104684c(16777216) && !j.f77398c.mo104684c(256)) {
                if (j.f77397b == 3) {
                    if (C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false)) {
                        m97844z();
                        mo75935m();
                    }
                    ((C29875f) this.f78493a).mo75899a(1);
                    this.f78510o.f74354a = 3;
                    C29875f fVar = (C29875f) this.f78493a;
                    C39330h hVar = new C39330h(12, this.f78509n.mo86937c(), this.f78509n.mo86938d());
                    fVar.mo75900a(hVar);
                    return;
                }
            } else {
                return;
            }
            boolean z = m97844z();
            if (this.f78506k != null && z) {
                this.f78506k.mo58035a(this.f78494b);
            }
        }
    }

    /* renamed from: a */
    public final void mo63043a(C44919c cVar) {
        if (m97835f(cVar.f115522a)) {
            this.f78493a.mo75894i();
            ((C29875f) this.f78493a).mo75900a(new C39330h(1));
            ((C29875f) this.f78493a).mo75899a(1);
        }
    }

    /* renamed from: a */
    public final void mo63044a(C44920d dVar) {
        int i;
        if (!this.f78498f && m97835f(dVar.f115529a)) {
            ((C29875f) this.f78493a).mo75899a(0);
            this.f78493a.mo75893h();
            this.f78510o.f74354a = 2;
            int i2 = this.f78507l;
            String str = dVar.f115529a;
            if (this.f78494b != null) {
                i = this.f78494b.getAwemeType();
            } else {
                i = 0;
            }
            C28227b.m92771a(i2, str, i);
            C42961az.m136380a(new C21753d(this.f78494b));
            ((C29875f) this.f78493a).mo75900a(new C39330h(0, dVar.f115531c));
        }
    }

    /* renamed from: b */
    public final void mo75933b(int i, int i2) {
        if (this.f78493a.mo75889c()) {
            this.f78495c.mo75115a(this.f78502j);
            this.f78495c.mo75119d();
        }
        mo75932a(i, i2);
        C42961az.m136382c(this);
    }

    /* renamed from: a */
    public final void mo75932a(int i, int i2) {
        Aweme aweme = this.f78494b;
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                aweme = aweme.getForwardItem();
            }
            if (!(aweme == null || aweme.getVideo() == null)) {
                C34204g.m110444a(i, i2, this.f78512q, ((float) aweme.getVideo().getHeight()) / ((float) aweme.getVideo().getWidth()));
                ((C29875f) this.f78493a).mo75906q();
            }
        }
    }

    public C29889i(C29875f fVar, C29376j jVar, int i) {
        super(fVar, jVar);
        this.f78510o = new C28228a();
        this.f78512q = fVar.mo75903n();
        this.f78509n = new C34199d(this.f78512q, this, null);
        this.f78509n.f89181c = true;
        this.f78507l = i;
        m97836r();
    }

    /* renamed from: a */
    public final void mo75881a(Aweme aweme, String str, String str2) {
        super.mo75881a(aweme, str, str2);
        this.f78514s = aweme.getForwardItem();
        this.f78509n.mo86934a(aweme);
        this.f78509n.f89180b = str;
    }

    public C29889i(C29875f fVar, C29376j jVar, int i, C21098ab abVar) {
        this(fVar, jVar, i);
        this.f78515t = abVar;
    }
}
