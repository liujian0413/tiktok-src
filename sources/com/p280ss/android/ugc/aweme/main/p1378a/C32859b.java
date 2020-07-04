package com.p280ss.android.ugc.aweme.main.p1378a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.main.a.b */
public class C32859b {

    /* renamed from: a */
    public View f85793a;

    /* renamed from: b */
    public ViewStub f85794b;

    /* renamed from: c */
    private Handler f85795c;

    /* renamed from: d */
    private Runnable f85796d = new Runnable() {
        public final void run() {
            C32859b.this.mo84590b();
        }
    };

    /* renamed from: c */
    private void m106461c() {
        C42961az.m136383d(this);
        if (this.f85795c != null) {
            this.f85795c.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: b */
    public final void mo84590b() {
        if (this.f85793a != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f85793a, "scaleX", new float[]{1.0f, 0.0f, 0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f85793a, "scaleY", new float[]{1.0f, 0.0f, 0.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200);
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (C32859b.this.f85794b != null) {
                        C32859b.this.f85794b.setVisibility(8);
                    }
                    if (C32859b.this.f85793a != null) {
                        C32859b.this.f85793a.clearAnimation();
                        C32859b.this.f85793a.setVisibility(8);
                    }
                }
            });
            animatorSet.start();
            m106461c();
        }
    }

    /* renamed from: a */
    public final void mo84589a() {
        if (this.f85793a == null) {
            this.f85793a = this.f85794b.inflate();
        }
        this.f85795c = new Handler(Looper.getMainLooper());
        C6907h.onEvent(MobClick.obtain().setEventName("photo_notice").setLabelName("shoot_bottom_tab"));
        C42961az.m136382c(this);
        this.f85793a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C32859b.this.mo84590b();
                C6907h.onEvent(MobClick.obtain().setEventName("photo_notice_click").setLabelName("shoot_bottom_tab"));
            }
        });
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f85793a, "scaleX", new float[]{0.0f, 1.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f85793a, "scaleY", new float[]{0.0f, 1.0f, 1.0f});
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(800);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                C32859b.this.f85793a.setVisibility(0);
            }
        });
        animatorSet.play(ofFloat).with(ofFloat2);
        this.f85795c.post(new Runnable() {
            public final void run() {
                animatorSet.start();
            }
        });
        this.f85795c.postDelayed(this.f85796d, 6000);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onEventMainThread(C32858a aVar) {
        mo84590b();
    }

    public C32859b(ViewStub viewStub) {
        this.f85794b = viewStub;
    }
}
