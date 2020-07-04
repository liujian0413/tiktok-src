package com.facebook.react.animation;

import android.view.View;
import com.facebook.infer.p728a.C13854a;

public abstract class Animation {
    private View mAnimatedView;
    private final int mAnimationID;
    private AnimationListener mAnimationListener;
    private volatile boolean mCancelled;
    private volatile boolean mIsFinished;
    private final AnimationPropertyUpdater mPropertyUpdater;

    public int getAnimationID() {
        return this.mAnimationID;
    }

    public abstract void run();

    public final void cancel() {
        if (!this.mIsFinished && !this.mCancelled) {
            this.mCancelled = true;
            if (this.mAnimationListener != null) {
                this.mAnimationListener.onCancel();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finish() {
        C13854a.m40915a(!this.mIsFinished, "Animation must not already be finished!");
        this.mIsFinished = true;
        if (!this.mCancelled) {
            if (this.mAnimatedView != null) {
                this.mPropertyUpdater.onFinish(this.mAnimatedView);
            }
            if (this.mAnimationListener != null) {
                this.mAnimationListener.onFinished();
            }
        }
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.mAnimationListener = animationListener;
    }

    public final void start(View view) {
        this.mAnimatedView = view;
        this.mPropertyUpdater.prepare(view);
        run();
    }

    /* access modifiers changed from: protected */
    public final boolean onUpdate(float f) {
        C13854a.m40915a(!this.mIsFinished, "Animation must not already be finished!");
        if (!this.mCancelled) {
            this.mPropertyUpdater.onUpdate((View) C13854a.m40916b(this.mAnimatedView), f);
        }
        if (!this.mCancelled) {
            return true;
        }
        return false;
    }

    public Animation(int i, AnimationPropertyUpdater animationPropertyUpdater) {
        this.mAnimationID = i;
        this.mPropertyUpdater = animationPropertyUpdater;
    }
}
