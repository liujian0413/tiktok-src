package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class RadioRhythmView extends FrameLayout {

    /* renamed from: a */
    final float f25174a;

    /* renamed from: b */
    final float f25175b;

    /* renamed from: c */
    final float f25176c;

    /* renamed from: d */
    final float f25177d;

    /* renamed from: e */
    final float f25178e;

    /* renamed from: f */
    final int f25179f;

    /* renamed from: g */
    private AnimatorSet f25180g;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25180g.end();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View findViewById = findViewById(R.id.b31);
        View findViewById2 = findViewById(R.id.b32);
        View findViewById3 = findViewById(R.id.b33);
        View findViewById4 = findViewById(R.id.b34);
        View findViewById5 = findViewById(R.id.b35);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "scaleY", new float[]{1.0f, 2.5f, 1.0f});
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById2, "scaleY", new float[]{1.0f, 1.47f, 1.0f, 0.588f, 1.0f});
        ofFloat2.setRepeatCount(-1);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById3, "scaleY", new float[]{1.0f, 0.4f, 1.0f});
        ofFloat3.setRepeatCount(-1);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(findViewById4, "scaleY", new float[]{1.0f, 1.47f, 1.0f, 0.588f, 1.0f});
        ofFloat4.setRepeatCount(-1);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(findViewById5, "scaleY", new float[]{1.0f, 2.5f, 1.0f});
        ofFloat5.setRepeatCount(-1);
        this.f25180g = new AnimatorSet();
        this.f25180g.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
        this.f25180g.setInterpolator(linearInterpolator);
        this.f25180g.setDuration(800);
        this.f25180g.start();
    }

    public RadioRhythmView(Context context) {
        this(context, null);
    }

    public RadioRhythmView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadioRhythmView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25174a = 1.0f;
        this.f25175b = 1.47f;
        this.f25176c = 2.5f;
        this.f25177d = 0.4f;
        this.f25178e = 0.588f;
        this.f25179f = 800;
        inflate(context, R.layout.ayn, this);
    }
}
