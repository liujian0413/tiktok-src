package com.bytedance.android.livesdk.gift.dialog.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LiveGiftComboView extends FrameLayout {

    /* renamed from: a */
    public View f21350a;

    /* renamed from: b */
    public View f21351b;

    /* renamed from: c */
    public boolean f21352c;

    /* renamed from: d */
    private Context f21353d;

    /* renamed from: e */
    private AnimatorSet f21354e;

    /* renamed from: f */
    private long f21355f;

    /* renamed from: b */
    private void m24228b() {
        View.inflate(this.f21353d, R.layout.alh, this);
        this.f21350a = findViewById(R.id.yu);
        this.f21351b = findViewById(R.id.yv);
    }

    /* renamed from: a */
    public final void mo20719a() {
        if (this.f21354e != null && this.f21354e.isRunning()) {
            this.f21354e.cancel();
            this.f21354e.removeAllListeners();
            this.f21354e = null;
        }
        this.f21351b.setVisibility(8);
        this.f21350a.setVisibility(8);
    }

    public void setCountDownTime(long j) {
        this.f21355f = j;
    }

    public LiveGiftComboView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo20720a(final Runnable runnable) {
        if (this.f21354e != null && this.f21354e.isRunning()) {
            this.f21354e.cancel();
            this.f21354e.removeAllListeners();
            this.f21354e = null;
        }
        this.f21354e = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f21351b, "alpha", new float[]{0.0f, 1.0f}).setDuration(200);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f21350a, "scaleX", new float[]{0.0f, 1.0f}).setDuration(200);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f21350a, "scaleY", new float[]{0.0f, 1.0f}).setDuration(200);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.f21350a, "alpha", new float[]{0.0f, 1.0f}).setDuration(200);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(this.f21350a, "rotation", new float[]{0.0f, 360.0f}).setDuration(this.f21355f);
        this.f21354e.playTogether(new Animator[]{duration, duration2, duration3, duration4, duration5});
        this.f21354e.addListener(new AnimatorListener() {
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                LiveGiftComboView.this.f21352c = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!LiveGiftComboView.this.f21352c) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    LiveGiftComboView.this.f21351b.setVisibility(8);
                    LiveGiftComboView.this.f21350a.setVisibility(8);
                }
            }
        });
        this.f21352c = false;
        this.f21354e.start();
        this.f21351b.setVisibility(0);
        this.f21350a.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo20721b(final Runnable runnable) {
        if (this.f21354e != null && this.f21354e.isRunning()) {
            this.f21354e.cancel();
            this.f21354e.removeAllListeners();
            this.f21354e = null;
        }
        if (((Boolean) LiveConfigSettingKeys.LIVE_NEW_COMBO_STYLE.mo10240a()).booleanValue()) {
            this.f21350a.setAlpha(1.0f);
            this.f21351b.setAlpha(1.0f);
        }
        this.f21354e = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f21351b, "scaleX", new float[]{1.0f, 0.9f, 1.0f}).setDuration(133);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f21351b, "scaleY", new float[]{1.0f, 0.9f, 1.0f}).setDuration(133);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f21350a, "scaleX", new float[]{1.0f, 0.9f, 1.0f}).setDuration(133);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.f21350a, "scaleY", new float[]{1.0f, 0.9f, 1.0f}).setDuration(133);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(this.f21350a, "rotation", new float[]{0.0f, 360.0f}).setDuration(this.f21355f);
        this.f21354e.playTogether(new Animator[]{duration, duration2, duration3, duration4, duration5});
        this.f21354e.addListener(new AnimatorListener() {
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                LiveGiftComboView.this.f21352c = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!LiveGiftComboView.this.f21352c) {
                    if (runnable != null) {
                        runnable.run();
                    }
                    LiveGiftComboView.this.f21351b.setVisibility(8);
                    LiveGiftComboView.this.f21350a.setVisibility(8);
                }
            }
        });
        this.f21352c = false;
        this.f21354e.start();
        this.f21351b.setVisibility(0);
        this.f21350a.setVisibility(0);
    }

    public LiveGiftComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveGiftComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21355f = 3000;
        this.f21353d = context;
        m24228b();
    }
}
