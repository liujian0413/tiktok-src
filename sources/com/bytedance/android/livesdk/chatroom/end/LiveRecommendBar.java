package com.bytedance.android.livesdk.chatroom.end;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;

public class LiveRecommendBar extends View {

    /* renamed from: a */
    public float f12764a = -1.0f;

    /* renamed from: b */
    public ValueAnimator f12765b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar$a */
    public interface C4386a {
        /* renamed from: a */
        void mo12092a();
    }

    /* renamed from: a */
    public final void mo12108a() {
        if (this.f12765b != null) {
            this.f12765b.removeAllUpdateListeners();
            this.f12765b.removeAllListeners();
            this.f12765b.cancel();
            C9738o.m28701a((View) this, (int) this.f12764a, -3);
        }
    }

    public LiveRecommendBar(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo12109a(final C4386a aVar) {
        post(new Runnable() {
            public final void run() {
                if (LiveRecommendBar.this.f12764a == -1.0f) {
                    LiveRecommendBar.this.f12764a = (float) LiveRecommendBar.this.getMeasuredWidth();
                }
                if (LiveRecommendBar.this.f12765b == null || !LiveRecommendBar.this.f12765b.isRunning()) {
                    LiveRecommendBar.this.f12765b = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    LiveRecommendBar.this.f12765b.setDuration(DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                    LiveRecommendBar.this.f12765b.setInterpolator(new LinearInterpolator());
                    LiveRecommendBar.this.f12765b.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C9738o.m28701a((View) LiveRecommendBar.this, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * LiveRecommendBar.this.f12764a), -3);
                        }
                    });
                    LiveRecommendBar.this.f12765b.addListener(new AnimatorListener() {
                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (aVar != null) {
                                aVar.mo12092a();
                            }
                        }
                    });
                    LiveRecommendBar.this.f12765b.start();
                }
            }
        });
    }

    public LiveRecommendBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRecommendBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LiveRecommendBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
