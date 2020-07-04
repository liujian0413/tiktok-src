package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PressFadeTextView */
public class PressFadeTextView extends DmtTextView {

    /* renamed from: b */
    private boolean f107091b;

    /* renamed from: a */
    private void m131358a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
        ofFloat.setDuration(100);
        ofFloat.start();
    }

    /* renamed from: b */
    private void m131359b() {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
        ofFloat.setDuration(100);
        ofFloat.start();
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
    }

    public void setEnable(boolean z) {
        this.f107091b = z;
    }

    public PressFadeTextView(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f107091b) {
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        m131358a();
                        break;
                    case 1:
                        m131359b();
                        break;
                }
            } else {
                m131359b();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public PressFadeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PressFadeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f107091b = true;
    }
}
