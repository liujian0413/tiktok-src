package com.p280ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0892d;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.ktx.C12636a;
import com.bytedance.scene.navigation.C12647c;
import com.bytedance.scene.p639a.C12565c;
import com.bytedance.scene.p639a.p640a.C12559b;
import com.bytedance.scene.p642b.C12586e.C12588a;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.C23255b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.scene.C37299a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C37558ak;
import com.p280ss.android.ugc.aweme.shortvideo.C38506ba.C38509a;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter;
import com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text.C38490n.C38492b;
import com.p280ss.android.ugc.aweme.shortvideo.p1586p.C40207a;
import com.p280ss.android.ugc.aweme.shortvideo.p1586p.C40208b;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordGestureLayout;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.p1619b.C41273a;
import com.p280ss.android.ugc.aweme.shortvideo.toolbar.RecordSimplifyConfigViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.transition.C41125b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p280ss.android.ugc.aweme.tools.C42146am;
import com.p280ss.android.ugc.aweme.tools.C42149ap;
import com.p280ss.android.ugc.aweme.tools.C42150aq;
import com.p280ss.android.ugc.aweme.tools.C42153at;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42157ax;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.C44449ad;
import com.p280ss.android.ugc.gamora.recorder.C44640f;
import com.p280ss.android.ugc.gamora.recorder.C44643g;
import com.p280ss.android.ugc.gamora.recorder.C44820v;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel;
import com.p280ss.android.ugc.gamora.recorder.control.C44535a;
import com.p280ss.android.ugc.gamora.recorder.control.C44592x;
import com.p280ss.android.ugc.gamora.recorder.control.RecordControlViewModel;
import com.p280ss.android.ugc.gamora.recorder.countdown.C44604b;
import com.p280ss.android.ugc.gamora.recorder.countdown.RecordCountDownViewModel;
import com.p280ss.android.ugc.gamora.recorder.mask.C44679a;
import com.p280ss.android.ugc.gamora.recorder.mask.RecordMaskViewModel;
import com.p280ss.android.ugc.gamora.recorder.progress.RecordProgressViewModel;
import com.p280ss.android.ugc.gamora.recorder.speed.C44731d;
import com.p280ss.android.ugc.gamora.recorder.speed.RecordSpeedGroupViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.PrintWriter;
import java.util.Map;
import kotlin.C7581n;
import kotlin.Triple;
import kotlin.jvm.p357a.C7561a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dd */
public class C39336dd extends C39382ed implements C23255b, C38509a, C41273a {

    /* renamed from: I */
    private C39382ed f102183I = this;

    /* renamed from: J */
    private C42156aw f102184J;

    /* renamed from: K */
    private FrameLayout f102185K;

    /* renamed from: L */
    private Intent f102186L;

    /* renamed from: M */
    private SafeHandler f102187M = new SafeHandler(this);

    /* renamed from: N */
    private ASCameraView f102188N;

    /* renamed from: j */
    GoNextFactoryFactory f102189j;

    /* renamed from: k */
    public View f102190k;

    /* renamed from: l */
    public ShortVideoContext f102191l;

    /* renamed from: m */
    RecordViewModel f102192m;

    /* renamed from: n */
    C44449ad f102193n;

    /* renamed from: o */
    RecordMaskViewModel f102194o;

    /* renamed from: p */
    RecordChooseMusicViewModel f102195p;

    /* renamed from: q */
    RecordToolbarViewModel f102196q;

    /* renamed from: r */
    RecordCountDownViewModel f102197r;

    /* renamed from: s */
    C44604b f102198s;

    /* renamed from: t */
    RecordControlViewModel f102199t;

    /* renamed from: u */
    C44592x f102200u;

    /* renamed from: v */
    RecordSpeedGroupViewModel f102201v;

    /* renamed from: w */
    C44731d f102202w;

    /* renamed from: x */
    RecordProgressViewModel f102203x;

    /* renamed from: y */
    RecordStatusViewModel f102204y;

    /* renamed from: z */
    public AVMusic f102205z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.dd$a */
    class C39338a implements C12647c {
        C39338a() {
        }

        /* renamed from: a */
        public final void mo31053a(C12629j jVar, C12629j jVar2, boolean z) {
            if (z) {
                if (jVar2 instanceof C44640f) {
                    C41125b.f107007a = true;
                    C39336dd.this.mo30940c((C12629j) C39336dd.this.f102274D);
                    C39336dd.this.f102190k.setVisibility(8);
                    C41125b.f107007a = false;
                }
            } else if (jVar instanceof C44640f) {
                C41125b.f107007a = true;
                C39336dd.this.f102190k.setVisibility(0);
                C39336dd.this.mo30945d((C12629j) C39336dd.this.f102274D);
                C41125b.f107007a = false;
            }
        }
    }

    /* renamed from: X */
    private static void m125661X() {
        C37558ak.m120319b();
    }

    /* renamed from: A */
    public final void mo30993A() {
        super.mo30993A();
    }

    /* renamed from: J */
    public final C42156aw mo97896J() {
        return this.f102184J;
    }

    /* renamed from: a */
    public final boolean mo60523a(int i, int i2, Intent intent) {
        ((RecordViewModel) C36113b.m116288a(mo97962O()).mo91871a(RecordViewModel.class)).mo106833a(new Triple<>(Integer.valueOf(i), Integer.valueOf(i2), intent));
        return false;
    }

    /* renamed from: b */
    public final C38492b mo97904b() {
        return new C39341dg(this);
    }

    /* renamed from: K */
    public final void mo96987K() {
        if (C35563c.f93230L.mo93342a(Property.EnableCommerceUnlockStickerCollectTips)) {
            this.f102187M.post(new C39343di(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public final /* synthetic */ void mo97897L() {
        ((C44535a) this.f102274D.mo30924a("RecordControlScene")).mo107010O();
        C35563c.f93230L.mo93341a(Property.EnableCommerceUnlockStickerCollectTips, false);
    }

    /* renamed from: d */
    public final void mo97908d() {
        if (C40207a.m128516a(this.f102188N)) {
            new C40208b(this.f33526d_).mo100002a(new C39342dh(this));
        } else {
            mo97898M();
        }
    }

    /* renamed from: q */
    public final void mo31008q() {
        super.mo31008q();
        this.f102184J.mo103593a(false);
        ((VideoRecordNewActivity) mo31015v()).mo101835b((C23255b) this);
    }

    /* renamed from: Y */
    private void m125662Y() {
        ShortVideoContext shortVideoContext = mo97964Q().f99791a;
        if (shortVideoContext.mo96142d() || shortVideoContext.mo96144e()) {
            this.f102192m.mo106847l(false);
            return;
        }
        AVMusic b = C39360dw.m125725a().mo97931b();
        if (b != null) {
            m125664a(b);
            this.f102195p.mo106932c(false);
            this.f102195p.mo106925a(127);
            this.f102195p.mo106924a(0.5f);
            m125666aa();
        }
    }

    /* renamed from: Z */
    private void m125663Z() {
        this.f102195p.mo106927a(mo31017x().getDrawable(R.drawable.apo));
        this.f102195p.mo106928a(mo31017x().getText(R.string.a3q).toString());
    }

    /* renamed from: e */
    public final boolean mo97911e() {
        if (this.f102274D == null || !this.f102274D.getLifecycle().mo54a().isAtLeast(State.CREATED)) {
            return false;
        }
        C44820v vVar = (C44820v) this.f102274D.mo30924a("RecordBottomTabScene");
        if (vVar == null || !TextUtils.equals((CharSequence) vVar.mo30920G(), mo30999a((int) R.string.dcp))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void mo97898M() {
        C42149ap apVar = new C42149ap(this.f102202w.mo107148f());
        apVar.f109675b = this.f102198s.mo107041f();
        this.f102197r.mo29069f();
        mo97963P().mo103594a((Object) this.f102183I, (C42155av) apVar);
        this.f102184J.mo103594a((Object) this.f102183I, (C42155av) apVar);
        this.f102184J.mo103594a((Object) this.f102183I, (C42155av) new C42153at(mo97964Q().f99791a.f99745af, true));
        this.f102184J.mo103594a((Object) this.f102183I, (C42155av) new C42146am(4));
        this.f102204y.mo102542m().setValue(Boolean.valueOf(true));
    }

    /* renamed from: c */
    public final void mo97906c() {
        if (C39805en.m127445a() && (this.f33526d_ == null || ((VideoRecordNewActivity) this.f33526d_).mo101847g() || !mo97911e())) {
            switch (C39804em.f103457a) {
                case 1:
                case 4:
                    m125667g(true);
                    m125668h(true);
                    return;
                case 2:
                case 5:
                    m125667g(false);
                    m125668h(true);
                    return;
                case 3:
                case 6:
                    m125667g(true);
                    m125668h(false);
                    return;
                default:
                    m125667g(false);
                    m125668h(false);
                    return;
            }
        }
    }

    /* renamed from: aa */
    private void m125666aa() {
        if (this.f102191l != null) {
            Keva repo = Keva.getRepo("recorder");
            int a = RecordSimplifyConfigViewModel.m131296a(this.f33526d_);
            boolean z = true;
            if (a == 1) {
                if (repo.getBoolean("is_first_exp_a_tip_show", true)) {
                    this.f102191l.mo96140b();
                }
            } else if (a == 3 && repo.getBoolean("is_first_exp_c_tip_show", true)) {
                this.f102191l.mo96140b();
            }
            if (this.f102191l.mo96139a()) {
                this.f102191l.mo96140b();
                this.f102195p.f114733e.setValue(Integer.valueOf(1));
                this.f102199t.mo106959d(true);
                this.f102200u.mo107028a(this.f102199t, (C7326g<C7581n>) new C39344dj<C7581n>(this));
                if (!"prop_reuse".equals(this.f102191l.f99788x) && !"prop_page".equals(this.f102191l.f99788x)) {
                    z = false;
                }
                if (z) {
                    AVMusic curMusic = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getCurMusic();
                    if (curMusic != null) {
                        Effect effect = (Effect) this.f102186L.getParcelableExtra("first_sticker");
                        if (effect != null) {
                            C6907h.m21524a("prop_music_show", (Map) C38511bc.m123103a().mo96485a("creation_id", this.f102191l.f99787w).mo96485a("shoot_way", this.f102191l.f99788x).mo96485a("enter_from", "video_shoot_page").mo96485a("music_id", curMusic.getMusicId()).mo96485a("prop_id", effect.getEffectId()).mo96485a("group_id", CurPlayVideoRecord.INSTANCE.getVideoId()).f100112a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo31006o() {
        super.mo31006o();
        C33153d.m106975a(mo31016w());
        this.f102189j = new GoNextFactoryFactory(this, this.f102188N);
        this.f102184J = new C42157ax().mo103596a((C42161ba) new C38506ba(mo97962O(), this)).mo103596a((C42161ba) new C39792ef(this)).mo103596a((C42161ba) new C38571cc(this)).mo103596a((C42161ba) new C39896fo(this)).mo103596a((C42161ba) new C39901fr(this)).mo103596a((C42161ba) new C38534bk(this)).mo103596a((C42161ba) new C39352dp(this)).mo103596a((C42161ba) new C39354dr(this)).mo103596a((C42161ba) new C39346dl(this)).mo103596a((C42161ba) new C39802el(this)).mo103596a((C42161ba) new C39800ek(this)).mo103596a((C42161ba) new C41579v(this, this)).mo103596a((C42161ba) new C39380eb(this)).mo103596a((C42161ba) new C39794eg(this)).mo103596a((C42161ba) new C38421aa(this)).mo103596a((C42161ba) new C40200o(this)).mo103596a(this.f102189j.mo96094c()).mo103596a(this.f102189j.mo96093b()).mo103596a((C42161ba) new C38528bg(this)).mo103596a((C42161ba) new C40052m(this)).mo103596a((C42161ba) new C39334dc(this)).mo103596a((C42161ba) new C40313s(this)).mo103596a((C42161ba) new C39969gp(this)).mo103596a((C42161ba) new C38538bn(this)).mo103596a((C42161ba) new C39894fm(this)).mo103596a((C42161ba) new C38532bi(this)).mo103596a((C42161ba) new C38546bt(this)).mo103596a((C42161ba) new C39903fs(this)).mo103596a((C42161ba) new C39905ft(this)).mo103596a((C42161ba) new C39806eo(this)).mo103596a((C42161ba) new C39909fw(this)).mo103596a((C42161ba) new C39797ei(this)).mo103596a((C42161ba) new C40246r(this)).mo103598a(C7163a.m22363a()).mo103597a(new PrintWriter(new C0892d("PlanC"))).mo103595a();
        this.f102192m = (RecordViewModel) C36113b.m116288a(mo97962O()).mo91871a(RecordViewModel.class);
        this.f102194o = (RecordMaskViewModel) C36113b.m116288a(mo97962O()).mo91871a(RecordMaskViewModel.class);
        this.f102195p = (RecordChooseMusicViewModel) C36113b.m116288a(mo97962O()).mo91871a(RecordChooseMusicViewModel.class);
        this.f102203x = (RecordProgressViewModel) C36113b.m116288a(mo97962O()).mo91871a(RecordProgressViewModel.class);
        this.f102196q = (RecordToolbarViewModel) C36113b.m116288a(mo97962O()).mo91871a(RecordToolbarViewModel.class);
        this.f102197r = (RecordCountDownViewModel) C36113b.m116288a(mo97962O()).mo91871a(RecordCountDownViewModel.class);
        this.f102199t = (RecordControlViewModel) C36113b.m116288a(mo97962O()).mo91871a(RecordControlViewModel.class);
        this.f102198s = new C44604b(getLifecycle(), this.f102197r);
        this.f102201v = (RecordSpeedGroupViewModel) C36113b.m116288a(mo97962O()).mo91871a(RecordSpeedGroupViewModel.class);
        this.f102202w = new C44731d(getLifecycle(), this.f102201v);
        this.f102200u = new C44592x(getLifecycle());
        this.f102193n = new C44449ad(getLifecycle());
        this.f102204y = (RecordStatusViewModel) C0069x.m159a(mo97962O()).mo147a(RecordStatusViewModel.class);
    }

    /* renamed from: a */
    public final boolean mo29060a() {
        if (!mo97911e()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m125667g(boolean z) {
        this.f102192m.mo106845j(z);
    }

    /* renamed from: h */
    private void m125668h(boolean z) {
        this.f102192m.mo106844i(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo97902a(C7581n nVar) throws Exception {
        this.f102195p.f114732d.setValue(null);
    }

    /* renamed from: c */
    public final void mo97907c(boolean z) {
        int i;
        if (this.f102199t != null) {
            RecordControlViewModel recordControlViewModel = this.f102199t;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            recordControlViewModel.mo106954b(i);
        }
    }

    /* renamed from: a */
    public final void mo97903a(boolean z) {
        this.f102194o.mo107094b(z);
    }

    /* renamed from: b */
    public final void mo97905b(boolean z) {
        if (this.f102203x != null) {
            if (this.f102275E) {
                this.f102203x.mo107138a(false);
            } else {
                this.f102203x.mo107138a(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo97910e(boolean z) {
        if (mo97961N() != null) {
            this.f102275E = z;
            if (!mo97911e()) {
                mo97909d(!z);
            }
        }
    }

    /* renamed from: a */
    private void m125664a(AVMusic aVMusic) {
        if (aVMusic != null) {
            this.f102195p.mo106927a(mo31017x().getDrawable(R.drawable.app));
            StringBuilder sb = new StringBuilder(aVMusic.getName());
            if (aVMusic.getSinger() != null && !aVMusic.getSinger().isEmpty()) {
                sb.append("-");
                sb.append(aVMusic.getSinger());
            }
            this.f102195p.mo106928a(sb.toString());
        }
    }

    /* renamed from: a */
    private void m125665a(VideoRecordGestureLayout videoRecordGestureLayout) {
        mo31018y().mo30998F().mo31124a((Object) "owner", (Object) this);
        mo31018y().mo30998F().mo31124a((Object) "safe_handler", (Object) this.f102187M);
        mo31018y().mo30998F().mo31124a((Object) "filter_context", (Object) ((VideoRecordNewActivity) this.f33526d_).f107326l);
        mo31018y().mo30998F().mo31124a((Object) "beauty_context", (Object) ((VideoRecordNewActivity) this.f33526d_).f107268I);
        mo31018y().mo30998F().mo31124a((Object) "record_env_context", (Object) mo97968U());
        mo31018y().mo30998F().mo31124a((Object) "scale_gesture_detector", (Object) videoRecordGestureLayout.getScaleGestureDetector());
        mo31018y().mo31056a((C0043i) this, (C12647c) new C39338a());
        mo30925a((int) R.id.cq4, (C12629j) new C44679a(), "RecordMaskScene");
        this.f102274D = new C44643g();
        mo30925a((int) R.id.cq4, (C12629j) this.f102274D, "NormalGroupScene");
        this.f102193n.mo106891a(this.f102192m, (C7326g<Boolean>) new C7326g<Boolean>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ C7581n mo97912a() {
                C39336dd.this.f102192m.mo106837b(false);
                return null;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Boolean bool) {
                if (!bool.booleanValue() || C37299a.m119793a(C39336dd.this.mo31018y(), C44640f.class)) {
                    if (C37299a.m119793a(C39336dd.this.mo31018y(), C44640f.class)) {
                        C39336dd.this.mo31018y().mo31069b();
                    }
                    return;
                }
                C39336dd.this.mo31018y().mo31065a(C44640f.class, (Bundle) null, new C12588a().mo30862a(true).mo30860a((C12565c) new C12559b()).mo30863a());
                C37299a.m119790a(C39336dd.this.mo31018y(), C44640f.class, (C7561a<C7581n>) new C39345dk<C7581n>(this));
            }
        });
        if (!C35563c.f93258u.mo83196a() && C6399b.m19946v()) {
            this.f102192m.mo106836b(4);
        }
    }

    /* renamed from: d */
    public final void mo97909d(boolean z) {
        int i;
        int i2;
        if (this.f102274D != null) {
            super.mo97909d(z);
            if (z) {
                C12636a.m36710a(this.f102274D, "RecordToolbarScene");
                this.f102274D.mo96987K().mo106896e();
            } else {
                C12636a.m36711b(this.f102274D, "RecordToolbarScene");
                this.f102274D.mo96987K().mo106897f();
            }
            RecordControlViewModel recordControlViewModel = this.f102199t;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            recordControlViewModel.mo106956c(i);
            this.f102194o.mo107093a(z);
            if (!z) {
                this.f102195p.f114732d.setValue(null);
            }
            if (!z) {
                this.f102199t.mo106960e(8);
                this.f102199t.mo106958d(8);
                this.f102199t.mo106961f(8);
            } else if (this.f102191l.mo96150k() > 0) {
                this.f102199t.mo106960e(0);
                this.f102199t.mo106958d(0);
                this.f102199t.mo106961f(8);
            } else {
                this.f102199t.mo106960e(8);
                this.f102199t.mo106958d(8);
                RecordControlViewModel recordControlViewModel2 = this.f102199t;
                if (this.f102191l.f99779o) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                recordControlViewModel2.mo106961f(i2);
            }
            if (mo97964Q().f99791a.mo96142d() || mo97964Q().f99791a.mo96144e()) {
                this.f102192m.mo106847l(false);
                this.f102199t.mo106961f(8);
                if (!z) {
                    this.f102199t.mo106960e(4);
                    this.f102199t.mo106958d(4);
                }
                return;
            }
            if (this.f102183I.f33526d_ != null && !TextUtils.equals((CharSequence) ((C44820v) this.f102274D.mo30924a("RecordBottomTabScene")).mo30920G(), this.f102183I.f33526d_.getResources().getString(R.string.dcv))) {
                this.f102195p.mo106930a(z);
                this.f102195p.mo106931b(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo97899a(RecordingSpeed recordingSpeed) throws Exception {
        VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) this.f33526d_;
        videoRecordNewActivity.f107316b = (double) recordingSpeed.value();
        ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) videoRecordNewActivity).mo147a(ShortVideoContextViewModel.class)).mo96162a(videoRecordNewActivity.f107316b);
        C6907h.onEvent(MobClick.obtain().setEventName(recordingSpeed.description()).setLabelName("shoot_page").setJsonObject(this.f102183I.mo97966S()));
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) videoRecordNewActivity).mo147a(ShortVideoContextViewModel.class)).f99791a;
        if (shortVideoContext != null) {
            C6907h.m21524a("choose_speed_mode", (Map) C22984d.m75611a().mo59973a("creation_id", shortVideoContext.f99787w).mo59973a("shoot_way", shortVideoContext.f99788x).mo59970a("draft_id", shortVideoContext.f99790z).mo59973a("speed_mode", recordingSpeed.description()).f60753a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo97900a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            this.f102199t.mo106954b(8);
            return;
        }
        if (getLifecycle().mo54a().isAtLeast(State.STARTED)) {
            C42150aq aqVar = new C42150aq(3);
            aqVar.f109676a = this.f102198s.mo107041f();
            mo97963P().mo103594a((Object) this.f102183I, (C42155av) aqVar);
            mo97908d();
            this.f102199t.mo106954b(0);
            this.f102199t.mo106950a(1);
            this.f102199t.mo106955b(true);
            this.f102199t.mo106962g();
        }
    }

    public C39336dd(ShortVideoContext shortVideoContext, Intent intent, ASCameraView aSCameraView) {
        this.f102191l = shortVideoContext;
        this.f102186L = intent;
        this.f102188N = aSCameraView;
    }

    /* renamed from: b */
    public final ViewGroup mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41530am.m132280a("planC => onCreateView start");
        if (!C7163a.m22363a()) {
            layoutInflater = mo31015v().getLayoutInflater();
        }
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.qx, viewGroup, false);
        this.f102185K = frameLayout;
        this.f102190k = frameLayout.findViewById(R.id.cws);
        this.f102272B = frameLayout.findViewById(R.id.sj);
        ((VideoRecordNewActivity) this.f33526d_).mo101819a((C23255b) this);
        m125661X();
        m125662Y();
        VideoRecordGestureLayout videoRecordGestureLayout = (VideoRecordGestureLayout) frameLayout.findViewById(R.id.aqb);
        this.f102273C = new DefaultGesturePresenter(this.f102183I, new C38496av(this, this.f102188N).f100094b, videoRecordGestureLayout);
        mo97906c();
        m125665a(videoRecordGestureLayout);
        this.f102195p.f114735g.setValue(Boolean.valueOf(true));
        this.f102198s.mo107040a((C7326g<Boolean>) new C39339de<Boolean>(this));
        C41530am.m132280a("planC => onCreateView end");
        this.f102202w.mo107147a((C7326g<RecordingSpeed>) new C39340df<RecordingSpeed>(this));
        return frameLayout;
    }

    /* renamed from: a */
    public final void mo97901a(Boolean bool, String str, AVMusic aVMusic, String str2) {
        if (mo97961N() != null) {
            if (bool.booleanValue()) {
                m125663Z();
                this.f102205z = null;
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                m125664a(aVMusic);
                this.f102195p.f114734f.setValue(null);
            }
        }
    }
}
