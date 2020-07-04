package com.p280ss.android.ugc.aweme.shortvideo.record.p1590a;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.asve.recorder.view.C20813g;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39947b;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.tools.C42137ad;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42588x;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a.a */
public final class C40295a {

    /* renamed from: a */
    public VideoRecordNewActivity f104666a;

    /* renamed from: b */
    public C39944a f104667b = new C39944a() {

        /* renamed from: a */
        boolean f104673a;

        /* renamed from: b */
        boolean f104674b;

        /* renamed from: a */
        public final boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }

        /* renamed from: e */
        public final boolean mo98462e(MotionEvent motionEvent) {
            return true;
        }

        /* renamed from: a */
        public final boolean mo96382a(MotionEvent motionEvent) {
            C40295a.this.f104666a.mo101812a(motionEvent.getX(), motionEvent.getY());
            return true;
        }

        /* renamed from: a */
        public final boolean mo98458a(C39947b bVar) {
            if (!this.f104673a) {
                return false;
            }
            C40295a.this.mo100117g().mo56168c(bVar.f103738h.x, bVar.f103738h.y);
            return true;
        }

        /* renamed from: b */
        public final void mo98460b(C39947b bVar) {
            if (this.f104673a) {
                this.f104673a = false;
                this.f104674b = true;
                C40295a.this.mo100117g().mo56167c();
                C40295a.this.f104666a.f107337w.mo103594a((Object) C40295a.this.f104666a, (C42155av) new C42137ad(8, true));
            }
        }

        /* renamed from: a */
        public final boolean mo98459a(C39947b bVar, float f, float f2) {
            if (C40295a.this.mo100113c()) {
                this.f104673a = C40295a.this.mo100117g().mo56166b(f, f2);
                if (this.f104673a) {
                    C40295a.this.mo100116f();
                    C40295a.this.f104666a.f107337w.mo103594a((Object) C40295a.this.f104666a, (C42155av) new C42137ad(0, true));
                }
            }
            return this.f104673a;
        }

        /* renamed from: b */
        public final boolean mo96389b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.f104674b) {
                return false;
            }
            this.f104674b = false;
            return true;
        }
    };

    /* renamed from: c */
    private ASCameraView f104668c;

    /* renamed from: d */
    private C20813g f104669d;

    /* renamed from: e */
    private C40302g f104670e;

    /* renamed from: f */
    private ValueAnimator f104671f;

    /* renamed from: g */
    private boolean f104672g;

    /* renamed from: d */
    public final void mo100114d() {
        m128722k();
    }

    /* renamed from: e */
    public final void mo100115e() {
        m128721j();
    }

    /* renamed from: b */
    public final ReactionWindowInfo mo100110b() {
        return this.f104668c.getReactionWindowInfo();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo100118h() {
        this.f104670e.mo100124a(true);
    }

    /* renamed from: f */
    public final void mo100116f() {
        if (this.f104670e != null) {
            this.f104670e.mo100124a(false);
        }
    }

    /* renamed from: g */
    public final C20813g mo100117g() {
        if (this.f104669d == null) {
            this.f104669d = this.f104668c.getGestureDispatcher();
        }
        return this.f104669d;
    }

    /* renamed from: i */
    private void m128720i() {
        ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) this.f104666a).mo147a(ShortVideoContextViewModel.class)).mo96181j().observe(this.f104666a, new C40297b(this));
    }

    /* renamed from: a */
    public final void mo100107a() {
        ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) this.f104666a).mo147a(ShortVideoContextViewModel.class)).mo96183l().observe(this.f104666a, new C40298c(this));
    }

    /* renamed from: j */
    private void m128721j() {
        if (this.f104671f != null) {
            this.f104671f.cancel();
        }
        this.f104671f = ValueAnimator.ofFloat(new float[]{1.0f, 0.66f}).setDuration(150);
        this.f104671f.addUpdateListener(new C40299d(this));
        this.f104671f.start();
    }

    /* renamed from: k */
    private void m128722k() {
        if (this.f104671f != null) {
            this.f104671f.cancel();
        }
        this.f104671f = ValueAnimator.ofFloat(new float[]{0.66f, 1.0f}).setDuration(150);
        this.f104671f.addUpdateListener(new C40300e(this));
        this.f104671f.start();
    }

    /* renamed from: c */
    public final boolean mo100113c() {
        if (!((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) this.f104666a).mo147a(ShortVideoContextViewModel.class)).mo96173e() || ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) this.f104666a).mo147a(ShortVideoContextViewModel.class)).mo96167b()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m128723l() {
        if (!C35563c.f93230L.mo93342a(Property.ReactionTipShow)) {
            m128724m();
            if (this.f104670e != null) {
                this.f104670e.mo100122a();
                C35563c.f93230L.mo93341a(Property.ReactionTipShow, true);
                new SafeHandler(this.f104666a).postDelayed(new C40301f(this), DouPlusShareGuideExperiment.MIN_VALID_DURATION);
            }
        }
        if (!this.f104672g) {
            if (C35563c.f93230L.mo93343b(Property.DefaultMicrophoneState) == 1) {
                C10761a.m31409e((Context) this.f104666a, (int) R.string.dbj).mo25750a();
            }
            this.f104672g = true;
        }
    }

    /* renamed from: m */
    private void m128724m() {
        int i;
        int i2;
        if (this.f104670e == null) {
            if (this.f104668c.getReactionPosMarginInViewPixel() == null) {
                C42880h.m136156a("getReactionPosMarginInViewPixel return null");
                return;
            }
            this.f104670e = new C40302g(this.f104668c);
            LayoutParams layoutParams = (LayoutParams) this.f104666a.f107335u.getLayoutParams();
            int[] reactionCameraPosInViewPixel = this.f104668c.getReactionCameraPosInViewPixel();
            if (reactionCameraPosInViewPixel != null) {
                if (C43127fh.m136806a(this.f104666a)) {
                    if (VERSION.SDK_INT >= 17) {
                        i2 = Math.min(layoutParams.getMarginStart(), layoutParams.rightMargin);
                    } else {
                        i2 = layoutParams.rightMargin;
                    }
                    this.f104670e.mo100123a((C39805en.m127447b(this.f104666a) - (reactionCameraPosInViewPixel[0] + i2)) - reactionCameraPosInViewPixel[2], reactionCameraPosInViewPixel[1] + reactionCameraPosInViewPixel[3], reactionCameraPosInViewPixel[2]);
                    return;
                }
                if (VERSION.SDK_INT >= 17) {
                    i = Math.min(layoutParams.getMarginStart(), layoutParams.leftMargin);
                } else {
                    i = layoutParams.leftMargin;
                }
                this.f104670e.mo100123a(reactionCameraPosInViewPixel[0] + i, reactionCameraPosInViewPixel[1] + reactionCameraPosInViewPixel[3], reactionCameraPosInViewPixel[2]);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100108a(ValueAnimator valueAnimator) {
        this.f104668c.mo56247d(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo100111b(ValueAnimator valueAnimator) {
        this.f104668c.mo56247d(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo100112b(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            m128723l();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100109a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            this.f104666a.f107337w.mo103594a((Object) this.f104666a, (C42155av) C42588x.m135309a((Object) this.f104667b));
        }
    }

    public C40295a(VideoRecordNewActivity videoRecordNewActivity, ASCameraView aSCameraView) {
        this.f104666a = videoRecordNewActivity;
        this.f104668c = aSCameraView;
        m128720i();
    }
}
