package com.p280ss.android.ugc.aweme.shortvideo.game;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.KeyEvent;
import com.bef.effectsdk.message.MessageCenter;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.game.p1574a.C39922a;
import com.p280ss.android.ugc.aweme.shortvideo.game.p1574a.C39923b;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.game.b */
public final class C39924b implements C39934k {

    /* renamed from: a */
    public FaceStickerBean f103695a = FaceStickerBean.NONE;

    /* renamed from: b */
    public boolean f103696b;

    /* renamed from: c */
    private ASCameraView f103697c;

    /* renamed from: d */
    private C39922a f103698d;

    /* renamed from: e */
    private C39935l f103699e;

    /* renamed from: f */
    private AppCompatActivity f103700f;

    /* renamed from: g */
    private int f103701g;

    /* renamed from: h */
    private long f103702h;

    /* renamed from: i */
    private boolean f103703i;

    /* renamed from: j */
    private boolean f103704j;

    /* renamed from: k */
    private C39932i f103705k;

    /* renamed from: l */
    private C39933j f103706l;

    /* renamed from: m */
    private C23258e f103707m;

    /* renamed from: n */
    private C23254a f103708n = new C39926c(this);

    /* renamed from: c */
    public final boolean mo99344c() {
        return this.f103703i;
    }

    /* renamed from: d */
    public final void mo99345d() {
        this.f103707m.mo60526b(this.f103708n);
    }

    /* renamed from: g */
    private boolean m127711g() {
        ShortVideoContext f = mo99347f();
        long a = C39810eq.m127460a();
        if (f.mo96142d() && f.f99751al != 1) {
            a = f.f99767c;
        }
        if (m127712h() < a) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private long m127712h() {
        return TimeSpeedModelExtension.calculateRealTime(this.f103697c.getEndFrameTimeUS() / 1000, 1.0d) + mo99347f().f99777m;
    }

    /* renamed from: f */
    public final ShortVideoContext mo99347f() {
        return ((EffectStickerViewModel) C0069x.m159a((FragmentActivity) this.f103700f).mo147a(EffectStickerViewModel.class)).mo101285a().mo101195d();
    }

    /* renamed from: e */
    public final void mo99346e() {
        if (!this.f103704j) {
            this.f103697c.mo56213a((int) MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME, 0, 0, "");
            this.f103696b = false;
            this.f103706l.mo99334e();
            mo99347f().f99767c = this.f103702h;
            mo99347f().f99751al = 0;
            this.f103699e.mo99351b();
        }
    }

    /* renamed from: a */
    public final void mo99339a() {
        if (!this.f103697c.mo56295o()) {
            this.f103706l.mo99329a();
            this.f103696b = true;
            this.f103702h = mo99347f().f99767c;
            this.f103697c.mo56213a(4097, 0, 0, "");
            ShortVideoContext f = mo99347f();
            f.f99767c = 30000;
            f.f99751al = 1;
            if (f.f99753an != null) {
                this.f103697c.mo56213a((int) MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME, (long) f.f99753an.gameScore, 0, "");
            }
            this.f103699e.mo99353c();
            this.f103705k.mo99326a(1);
            this.f103706l.mo99331b();
        }
    }

    /* renamed from: b */
    public final void mo99343b() {
        if (!this.f103704j) {
            this.f103706l.mo99332c();
            this.f103699e.mo99354d();
            this.f103699e.mo99353c();
            this.f103703i = false;
            ((GameResultViewModel) C0069x.m159a((FragmentActivity) this.f103700f).mo147a(GameResultViewModel.class)).f103690a = false;
            this.f103695a = FaceStickerBean.NONE;
            this.f103705k.mo99328c();
            if (mo99347f().f99775k.mo96317e() != null) {
                this.f103697c.mo56249d(true);
                this.f103697c.mo56287h(false);
                this.f103697c.setMusicPath(mo99347f().f99775k.mo96317e().getPath());
            } else {
                this.f103697c.mo56249d(false);
                this.f103697c.mo56287h(true);
            }
            if (mo99347f().f99753an != null) {
                this.f103706l.mo99333d();
                return;
            }
            this.f103698d.mo99336b();
            if (this.f103701g != this.f103705k.mo99325a()) {
                this.f103705k.mo99327b();
            }
        }
    }

    /* renamed from: a */
    public final void mo99341a(FaceStickerBean faceStickerBean) {
        this.f103695a = faceStickerBean;
        this.f103698d.mo99335a();
        this.f103701g = this.f103705k.mo99325a();
        if (this.f103701g != 1) {
            this.f103705k.mo99327b();
        }
        this.f103703i = true;
        this.f103704j = false;
        ((GameResultViewModel) C0069x.m159a((FragmentActivity) this.f103700f).mo147a(GameResultViewModel.class)).f103690a = true;
        this.f103699e.mo99348a();
        this.f103697c.mo56249d(false);
        this.f103697c.mo56287h(true);
        if (!this.f103696b) {
            HashMap hashMap = new HashMap();
            hashMap.put("prop_id", String.valueOf(faceStickerBean.getStickerId()));
            hashMap.put("shoot_way", mo99347f().f99788x);
            hashMap.put("creation_id", mo99347f().f99787w);
            C6907h.m21524a("enter_prop_game_page", (Map) hashMap);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo99342a(int i, KeyEvent keyEvent) {
        if (!this.f103703i || i != 4) {
            return false;
        }
        if (this.f103696b) {
            mo99346e();
        } else {
            mo99343b();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99340a(C39933j jVar, Pair pair) {
        if (pair != null && ((Boolean) pair.first).booleanValue() && !m127711g() && this.f103696b) {
            this.f103704j = true;
            mo99347f().f99752am = ((Integer) pair.second).intValue();
            jVar.mo99330a(pair);
        }
    }

    public C39924b(AppCompatActivity appCompatActivity, C23258e eVar, ASCameraView aSCameraView, C39935l lVar, C39932i iVar, C39933j jVar, C39922a aVar) {
        this.f103697c = aSCameraView;
        this.f103698d = aVar;
        this.f103700f = appCompatActivity;
        this.f103705k = iVar;
        this.f103706l = jVar;
        this.f103707m = eVar;
        eVar.mo60525a(this.f103708n);
        this.f103699e = lVar;
        lVar.mo99350a(new C39923b() {
            /* renamed from: b */
            public final void mo99338b() {
                if (C39924b.this.f103696b) {
                    C39924b.this.mo99346e();
                } else {
                    C39924b.this.mo99343b();
                }
            }

            /* renamed from: a */
            public final void mo99337a() {
                C39924b.this.mo99339a();
                HashMap hashMap = new HashMap();
                hashMap.put("prop_id", String.valueOf(C39924b.this.f103695a.getStickerId()));
                hashMap.put("shoot_way", C39924b.this.mo99347f().f99788x);
                hashMap.put("creation_id", C39924b.this.mo99347f().f99787w);
                C6907h.m21524a("click_game_play_button", (Map) hashMap);
            }
        });
        ((GameResultViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(GameResultViewModel.class)).mo99323a().observe(appCompatActivity, new C39927d(this, jVar));
        ((GameResultViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(GameResultViewModel.class)).mo99324b().observe(appCompatActivity, new C39928e(lVar));
    }
}
