package com.p280ss.android.ugc.aweme.common.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25764a;

/* renamed from: com.ss.android.ugc.aweme.common.widget.PullUpLayout */
public class PullUpLayout extends FrameLayout {

    /* renamed from: a */
    public C25764a f67821a;

    /* renamed from: b */
    public C25741a f67822b;

    /* renamed from: c */
    private Context f67823c;

    /* renamed from: d */
    private float f67824d;

    /* renamed from: e */
    private View f67825e;

    /* renamed from: f */
    private VelocityTracker f67826f;

    /* renamed from: g */
    private boolean f67827g;

    /* renamed from: h */
    private ObjectAnimator f67828h;

    /* renamed from: i */
    private C25742b f67829i;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PullUpLayout$a */
    public interface C25741a {
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PullUpLayout$b */
    public interface C25742b {
        /* renamed from: a */
        void mo66747a(MotionEvent motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f67826f = VelocityTracker.obtain();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f67826f != null) {
            this.f67826f.clear();
            this.f67826f.recycle();
            this.f67826f = null;
        }
    }

    /* renamed from: a */
    public final void mo66732a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f67825e, "translationY", new float[]{this.f67825e.getTranslationY(), 0.0f});
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public void setAnimationListener(C25741a aVar) {
        this.f67822b = aVar;
    }

    public void setInternalTouchEventListener(C25742b bVar) {
        this.f67829i = bVar;
    }

    public void setPullUpListener(C25764a aVar) {
        this.f67821a = aVar;
    }

    public PullUpLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f67829i != null) {
            this.f67829i.mo66747a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f67824d = motionEvent.getY();
        } else if (motionEvent.getAction() == 2 && this.f67824d - motionEvent.getY() > ((float) ViewConfiguration.get(this.f67823c).getScaledTouchSlop())) {
            return this.f67827g;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f67826f.addMovement(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f67824d = motionEvent.getY();
        }
        boolean z = false;
        if (motionEvent.getAction() == 2) {
            if ((this.f67825e == null || this.f67825e.getTranslationY() <= 0.0f) && !onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            this.f67825e.setTranslationY((float) ((int) Math.min(0.0f, motionEvent.getY() - this.f67824d)));
        } else if (motionEvent.getAction() == 1) {
            float translationY = this.f67825e.getTranslationY();
            if (Math.abs(this.f67825e.getTranslationY() / ((float) this.f67825e.getHeight())) > 0.3f) {
                z = true;
            }
            mo66733a(translationY, z);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo66734a(View view, boolean z) {
        this.f67825e = view;
    }

    public PullUpLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo66733a(float f, final boolean z) {
        long j;
        long j2;
        if (this.f67825e != null) {
            this.f67826f.computeCurrentVelocity(2);
            long j3 = 300;
            if (z) {
                if (this.f67826f.getYVelocity() != 0.0f) {
                    j = (long) ((((float) this.f67825e.getHeight()) + f) / Math.abs(this.f67826f.getYVelocity()));
                } else {
                    j = 300;
                }
                this.f67828h = ObjectAnimator.ofFloat(this.f67825e, "translationY", new float[]{f, (float) (-this.f67825e.getHeight())});
            } else {
                if (this.f67826f.getYVelocity() != 0.0f) {
                    j2 = (long) (f / Math.abs(this.f67826f.getYVelocity()));
                } else {
                    j2 = 300;
                }
                this.f67828h = ObjectAnimator.ofFloat(this.f67825e, "translationY", new float[]{f, 0.0f});
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (Math.abs(j) <= 300) {
                j3 = Math.abs(j);
            }
            animatorSet.setDuration(j3);
            animatorSet.play(this.f67828h);
            animatorSet.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PullUpLayout.this.f67821a != null && z) {
                        PullUpLayout.this.f67821a.mo66884a();
                    }
                }
            });
            animatorSet.start();
        }
    }

    public PullUpLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67827g = true;
        this.f67823c = context;
        this.f67826f = VelocityTracker.obtain();
    }
}
