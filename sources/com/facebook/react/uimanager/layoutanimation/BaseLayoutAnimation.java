package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.IllegalViewOperationException;

abstract class BaseLayoutAnimation extends AbstractLayoutAnimation {
    BaseLayoutAnimation() {
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean isReverse();

    /* access modifiers changed from: 0000 */
    public boolean isValid() {
        if (this.mDurationMs <= 0 || this.mAnimatedProperty == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public Animation createAnimationImpl(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        if (this.mAnimatedProperty != null) {
            float f4 = 0.0f;
            switch (this.mAnimatedProperty) {
                case OPACITY:
                    if (isReverse()) {
                        f = view.getAlpha();
                    } else {
                        f = 0.0f;
                    }
                    if (!isReverse()) {
                        f4 = view.getAlpha();
                    }
                    return new OpacityAnimation(view, f, f4);
                case SCALE_XY:
                    if (isReverse()) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (isReverse()) {
                        f3 = 0.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
                    return scaleAnimation;
                default:
                    StringBuilder sb = new StringBuilder("Missing animation for property : ");
                    sb.append(this.mAnimatedProperty);
                    throw new IllegalViewOperationException(sb.toString());
            }
        } else {
            throw new IllegalViewOperationException("Missing animated property from animation config");
        }
    }
}
