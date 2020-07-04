package com.p280ss.android.ugc.aweme.feed.guide;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.main.C32960dc;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.a */
public final class C28381a implements C28392h {

    /* renamed from: a */
    public TextView f74821a;

    /* renamed from: b */
    public View f74822b;

    /* renamed from: c */
    public boolean f74823c;

    /* renamed from: d */
    private AnimationImageView f74824d;

    /* renamed from: e */
    private boolean f74825e = false;

    /* renamed from: f */
    private boolean f74826f;

    /* renamed from: g */
    private ViewStub f74827g;

    /* renamed from: h */
    private Float f74828h;

    /* renamed from: d */
    public final boolean mo72115d() {
        return this.f74823c;
    }

    /* renamed from: a */
    public final void mo72111a() {
        this.f74825e = true;
        this.f74823c = false;
        if (this.f74826f) {
            if (this.f74824d.mo7084e()) {
                this.f74824d.mo7085f();
            }
            this.f74822b.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo72113b() {
        this.f74825e = false;
        this.f74823c = true;
        m93317e();
        this.f74824d.mo7082c(false);
        this.f74824d.setAnimation("home_doublelikes_warning.json");
        this.f74824d.mo7078b();
        this.f74824d.mo7076a((AnimatorListener) new AnimatorListener() {
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                C32960dc.m106540h(true);
            }

            public final void onAnimationEnd(Animator animator) {
                C28381a.this.dismiss();
                C32960dc.m106540h(true);
            }

            public final void onAnimationStart(Animator animator) {
                C28381a.this.f74822b.setVisibility(0);
                C28381a.this.f74821a.setAlpha(0.0f);
                C28381a.this.f74821a.animate().alpha(1.0f).setDuration(300).start();
            }
        });
    }

    /* renamed from: c */
    public final void mo72114c() {
        if (this.f74826f) {
            this.f74822b.clearAnimation();
            if (this.f74824d.mo7084e()) {
                this.f74824d.mo7085f();
            }
            this.f74824d.setVisibility(8);
            this.f74822b.setOnClickListener(null);
            this.f74822b.setVisibility(8);
        }
        this.f74823c = false;
    }

    public final void dismiss() {
        if (this.f74826f) {
            this.f74822b.setOnClickListener(null);
            if (this.f74824d.mo7084e()) {
                this.f74824d.mo7085f();
            }
            this.f74822b.animate().alpha(0.0f).setDuration(300).withEndAction(new Runnable() {
                public final void run() {
                    C28381a.this.f74822b.setVisibility(8);
                    C28381a.this.f74823c = false;
                }
            }).start();
            return;
        }
        this.f74823c = false;
    }

    /* renamed from: e */
    private void m93317e() {
        if (!this.f74826f) {
            this.f74826f = true;
            this.f74822b = this.f74827g.inflate();
            this.f74824d = (AnimationImageView) this.f74822b.findViewById(R.id.b9s);
            this.f74821a = (TextView) this.f74822b.findViewById(R.id.text);
            this.f74822b.setVisibility(8);
            this.f74822b.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (C32960dc.m106539g(true)) {
                        C28381a.this.mo72114c();
                    }
                    return false;
                }
            });
            if (this.f74828h != null) {
                this.f74822b.setTranslationY(this.f74828h.floatValue());
                this.f74828h = null;
            }
        }
    }

    public C28381a(View view) {
        this.f74827g = (ViewStub) view.findViewById(R.id.dcc);
    }

    /* renamed from: a */
    public final void mo72112a(float f) {
        if (this.f74826f) {
            this.f74822b.setTranslationY(f);
        } else {
            this.f74828h = Float.valueOf(f);
        }
    }
}
