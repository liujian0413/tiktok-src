package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.os.SystemClock;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.audio.C23106h;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.p308ui.AudioControlView;
import com.p280ss.android.ugc.aweme.base.p308ui.AudioControlView.C23407b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25053a;
import com.p280ss.android.ugc.aweme.detail.p1167ui.C26214y;
import com.p280ss.android.ugc.aweme.feed.event.C28314aj;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29005d;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29015f;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29016g;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29017h;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.p1240a.C29002a;
import com.p280ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.main.C33049h;
import com.p280ss.android.ugc.aweme.main.C33054j;
import com.p280ss.android.ugc.aweme.main.C33055k;
import com.p280ss.android.ugc.aweme.main.TabChangeManager;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.NewVideoPlayerProgressbar;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cg */
public final class C28876cg extends C28894e implements C0053p<C23083a> {

    /* renamed from: a */
    public AudioControlView f76132a;

    /* renamed from: b */
    private View f76133b;

    /* renamed from: c */
    private Activity f76134c;

    /* renamed from: d */
    private NewVideoPlayerProgressbar f76135d;

    /* renamed from: e */
    private LineProgressBar f76136e;

    /* renamed from: f */
    private final C23254a f76137f;

    /* renamed from: r */
    private AnimatorSet f76138r;

    /* renamed from: s */
    private AnimatorSet f76139s;

    /* renamed from: t */
    private AnimatorSet f76140t;

    /* renamed from: u */
    private boolean f76141u;

    /* renamed from: v */
    private boolean f76142v = true;

    /* renamed from: w */
    private long f76143w;

    @C7709l
    public final void onVideoPlayerStatusUpdate(C39330h hVar) {
    }

    /* renamed from: o */
    private void m95036o() {
        m95037p();
        m95038q();
    }

    /* renamed from: q */
    private void m95038q() {
        if (this.f76136e != null) {
            this.f76136e.clearAnimation();
            this.f76136e.mo74363c();
        }
    }

    /* renamed from: r */
    private void m95039r() {
        if (this.f76136e != null) {
            this.f76136e.mo74362b();
        }
    }

    /* renamed from: s */
    private void m95040s() {
        if (this.f76136e != null) {
            this.f76136e.mo74361a();
        }
    }

    /* renamed from: u */
    private void m95042u() {
        if (this.f76134c instanceof C33049h) {
            ((C33049h) this.f76134c).registerActivityOnKeyDownListener(this.f76137f);
        }
    }

    /* renamed from: v */
    private void m95043v() {
        if (this.f76134c instanceof C33049h) {
            ((C33049h) this.f76134c).unRegisterActivityOnKeyDownListener(this.f76137f);
        }
    }

    /* renamed from: a */
    public final void mo72018a() {
        m95035n();
        C42961az.m136383d(this);
        this.f76134c = null;
    }

    /* renamed from: p */
    private void m95037p() {
        if (this.f76135d != null) {
            this.f76135d.mo101637a();
            this.f76135d.clearAnimation();
            this.f76135d.setVisibility(4);
        }
    }

    /* renamed from: l */
    private void m95033l() {
        if (this.f76132a != null) {
            if (this.f76141u) {
                this.f76132a.mo60873b();
                return;
            }
            if (this.f76135d != null) {
                this.f76138r = new AnimatorSet();
                this.f76138r.play(this.f76132a.getShowVolumeAnim()).after(this.f76135d.getHideAnim());
                this.f76138r.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        if (C28876cg.this.f76132a != null) {
                            C28876cg.this.f76132a.mo60873b();
                        }
                    }
                });
                this.f76138r.start();
            }
        }
    }

    /* renamed from: m */
    private void m95034m() {
        if (this.f76132a != null) {
            if (this.f76141u) {
                this.f76132a.mo60874c();
                return;
            }
            if (this.f76135d != null) {
                this.f76139s = new AnimatorSet();
                this.f76139s.play(this.f76132a.getShowVolumeAnim()).after(this.f76135d.getHideAnim());
                this.f76139s.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        if (C28876cg.this.f76132a != null) {
                            C28876cg.this.f76132a.mo60874c();
                        }
                    }
                });
                this.f76139s.start();
            }
        }
    }

    /* renamed from: i */
    public final void mo74145i() {
        if (this.f76135d != null && this.f76132a != null) {
            if (!(this.f76139s == null && this.f76138r == null)) {
                this.f76140t = new AnimatorSet();
                this.f76140t.play(this.f76135d.getShowAnim()).after(this.f76132a.getHideVolumeAnim());
                this.f76140t.start();
            }
        }
    }

    /* renamed from: j */
    public final void mo74146j() {
        if (this.f76135d != null && this.f76132a != null) {
            if (this.f76140t != null) {
                this.f76140t.cancel();
            }
            this.f76135d.setAlpha(0.0f);
            this.f76132a.setAlpha(1.0f);
        }
    }

    /* renamed from: n */
    private void m95035n() {
        mo74146j();
        if (this.f76138r != null) {
            this.f76138r.removeAllListeners();
            this.f76138r.cancel();
        }
        if (this.f76139s != null) {
            this.f76139s.removeAllListeners();
            this.f76139s.cancel();
        }
        if (this.f76132a != null) {
            this.f76132a.mo60877e();
        }
        if (this.f76136e != null) {
            this.f76136e.mo74363c();
            this.f76136e.clearAnimation();
        }
        if (this.f76135d != null) {
            this.f76135d.clearAnimation();
        }
        m95043v();
    }

    /* renamed from: t */
    private void m95041t() {
        this.f76143w = SystemClock.elapsedRealtime();
        if (this.f76169g != null) {
            if (this.f76169g.getVideoControl() == null || this.f76169g.getVideoControl().showProgressBar != 1) {
                C23487o.m77140a((View) this.f76135d, 8);
                return;
            }
            this.f76135d.setProgress(0);
            if (this.f76169g.getVideo() != null) {
                this.f76135d.setMax(this.f76169g.getVideo().getDuration());
            }
            C23487o.m77140a((View) this.f76135d, 0);
        }
    }

    /* renamed from: k */
    private boolean m95032k() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f76132a != null && this.f76132a.mo60878f()) {
            return false;
        }
        if (!(this.f76134c instanceof C33054j) || !ScrollSwitchStateManager.m98918a((FragmentActivity) this.f76134c).mo79723b("page_feed") || !(((C33054j) this.f76134c).getCurFragment() instanceof C33055k) || (!((C33055k) ((C33054j) this.f76134c).getCurFragment()).mo84452c() && !((C33055k) ((C33054j) this.f76134c).getCurFragment()).mo84456d())) {
            z = false;
        } else {
            z = true;
        }
        if (!(this.f76134c instanceof C26214y) || !ScrollSwitchStateManager.m98918a((FragmentActivity) this.f76134c).mo79723b("page_feed")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(this.f76134c instanceof C33054j) || !C6903bc.m21482a().mo84633c() || !TextUtils.equals(TabChangeManager.m106432a((FragmentActivity) this.f76134c).f85773a, "DISCOVER")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z || z2 || z3) {
            return true;
        }
        return false;
    }

    @C7709l
    public final void onShareEndEvent(C28314aj ajVar) {
        C23487o.m77140a(this.f76133b, 0);
    }

    @C7709l
    public final void onAwesomeSplashEvent(C25053a aVar) {
        boolean z;
        if (aVar.f66130a != 4) {
            z = true;
        } else {
            z = false;
        }
        this.f76141u = z;
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        super.mo72021a(videoItemParams);
        if (this.f76132a != null) {
            this.f76132a.setOnAudioControlViewHideListener(new C23407b() {
                /* renamed from: a */
                public final void mo60892a() {
                    C28876cg.this.mo74145i();
                }

                /* renamed from: b */
                public final void mo60893b() {
                    C28876cg.this.mo74146j();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60132a("load_progress_bar", (C0053p<C23083a>) this).mo60132a("in_video_view_holder", (C0053p<C23083a>) this).mo60132a("on_page_unselected", (C0053p<C23083a>) this).mo60132a("on_page_selected", (C0053p<C23083a>) this).mo60132a("stopPlayAnimation", (C0053p<C23083a>) this);
        }
    }

    @C7709l
    public final void VideoSeekBarHideEvent(C29017h hVar) {
        if (this.f76169g != null && hVar.f76439a != null && hVar.f76439a.getAid().equals(this.f76169g.getAid())) {
            if (this.f76169g.getVideoControl() == null || this.f76169g.getVideoControl().showProgressBar != 1) {
                C23487o.m77140a((View) this.f76135d, 8);
            } else {
                C23487o.m77140a((View) this.f76135d, 0);
            }
        }
    }

    @C7709l
    public final void onStopTrackingTouchEvent(C29015f fVar) {
        if (this.f76169g != null && fVar.f76433b != null && fVar.f76433b.getAid().equals(this.f76169g.getAid())) {
            NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f76135d;
            double duration = (double) this.f76169g.getVideo().getDuration();
            double d = fVar.f76432a / 100.0d;
            Double.isNaN(duration);
            newVideoPlayerProgressbar.setProgress((int) (duration * d));
        }
    }

    @C7709l
    public final void onVideoCleanModeEvent(C29002a aVar) {
        if (this.f76169g != null && aVar.f76392b != null && aVar.f76392b.getAid().equals(this.f76169g.getAid())) {
            if (aVar.f76391a) {
                C23487o.m77140a((View) this.f76135d, 8);
            } else {
                C23487o.m77140a((View) this.f76135d, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            this.f76133b = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.view_video_progress_bar);
            this.f76132a = (AudioControlView) this.f76133b.findViewById(R.id.hs);
            this.f76135d = (NewVideoPlayerProgressbar) this.f76133b.findViewById(R.id.eb_);
            this.f76136e = (LineProgressBar) this.f76133b.findViewById(R.id.bm_);
            LayoutParams layoutParams = new LayoutParams(-1, C23486n.m77122a(1.0d));
            layoutParams.gravity = 80;
            if (C21085a.m71117a().f56625l) {
                int a = C23486n.m77122a(8.0d);
                layoutParams.leftMargin = a;
                layoutParams.rightMargin = a;
            }
            frameLayout.addView(this.f76133b, layoutParams);
        }
    }

    @C7709l
    public final void onPlayerControllerVideoPlayProgressEvent(C29005d dVar) {
        if (this.f76169g != null && dVar.f76402a != null && dVar.f76402a.getAid().equals(this.f76169g.getAid())) {
            if (this.f76135d.getProgress() != 0 || SystemClock.elapsedRealtime() >= this.f76143w + 600) {
                this.f76135d.setMax(this.f76169g.getVideo().getDuration());
                NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f76135d;
                double duration = (double) this.f76169g.getVideo().getDuration();
                double d = (double) dVar.f76405d;
                Double.isNaN(d);
                double d2 = d / 100.0d;
                Double.isNaN(duration);
                newVideoPlayerProgressbar.setProgress((int) (duration * d2));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            switch (str.hashCode()) {
                case -1661876786:
                    if (str.equals("stopPlayAnimation")) {
                        c = 4;
                        break;
                    }
                    break;
                case -904341062:
                    if (str.equals("load_progress_bar")) {
                        c = 0;
                        break;
                    }
                    break;
                case 350216171:
                    if (str.equals("on_page_selected")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1628582276:
                    if (str.equals("on_page_unselected")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2000201256:
                    if (str.equals("in_video_view_holder")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (((Boolean) aVar.mo60161a()).booleanValue()) {
                        m95040s();
                        return;
                    } else {
                        m95039r();
                        return;
                    }
                case 1:
                    if (((Boolean) aVar.mo60161a()).booleanValue()) {
                        m95042u();
                        return;
                    } else {
                        m95043v();
                        return;
                    }
                case 2:
                    this.f76142v = true;
                    mo74145i();
                    m95042u();
                    m95041t();
                    return;
                case 3:
                    this.f76142v = false;
                    m95043v();
                    m95041t();
                    m95039r();
                    return;
                case 4:
                    if (!this.f76142v) {
                        m95036o();
                        break;
                    }
                    break;
            }
        }
    }

    public C28876cg(View view, Activity activity) {
        super(view);
        C42961az.m136382c(this);
        this.f76134c = activity;
        this.f76137f = new C28880ch(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo74144a(int i, KeyEvent keyEvent) {
        boolean z;
        if (i != 25 && i != 24) {
            return false;
        }
        if (C6399b.m19944t()) {
            C23106h a = C23106h.m75943a();
            if (i == 24) {
                z = true;
            } else {
                z = false;
            }
            a.mo60192a(z);
        }
        if (!m95032k()) {
            return false;
        }
        C29016g gVar = new C29016g(this.f76169g, this.f76170h, this.f76173k, i, keyEvent);
        C42961az.m136380a(gVar);
        if (this.f76135d != null) {
            this.f76135d.setAlpha(0.0f);
        }
        if (i == 25) {
            m95033l();
        } else {
            m95034m();
        }
        return true;
    }
}
