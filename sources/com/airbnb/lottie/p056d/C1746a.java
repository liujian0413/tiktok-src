package com.airbnb.lottie.p056d;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.airbnb.lottie.d.a */
public abstract class C1746a extends ValueAnimator {

    /* renamed from: a */
    private final Set<AnimatorUpdateListener> f6291a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final Set<AnimatorListener> f6292b = new CopyOnWriteArraySet();

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f6292b.clear();
    }

    public void removeAllUpdateListeners() {
        this.f6291a.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7164a() {
        for (AnimatorListener onAnimationRepeat : this.f6292b) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7168b() {
        for (AnimatorListener onAnimationCancel : this.f6292b) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo7170c() {
        for (AnimatorUpdateListener onAnimationUpdate : this.f6291a) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public void addListener(AnimatorListener animatorListener) {
        this.f6292b.add(animatorListener);
    }

    public void addUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.f6291a.add(animatorUpdateListener);
    }

    public void removeListener(AnimatorListener animatorListener) {
        this.f6292b.remove(animatorListener);
    }

    public void removeUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.f6291a.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7165a(boolean z) {
        for (AnimatorListener animatorListener : this.f6292b) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7169b(boolean z) {
        for (AnimatorListener animatorListener : this.f6292b) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }
}
