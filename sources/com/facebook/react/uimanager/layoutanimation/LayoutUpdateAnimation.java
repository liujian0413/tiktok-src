package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;

class LayoutUpdateAnimation extends AbstractLayoutAnimation {
    LayoutUpdateAnimation() {
    }

    /* access modifiers changed from: 0000 */
    public boolean isValid() {
        if (this.mDurationMs > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public Animation createAnimationImpl(View view, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2 = false;
        if (view.getX() == ((float) i) && view.getY() == ((float) i2)) {
            z = false;
        } else {
            z = true;
        }
        if (!(view.getWidth() == i3 && view.getHeight() == i4)) {
            z2 = true;
        }
        if (!z && !z2) {
            return null;
        }
        PositionAndSizeAnimation positionAndSizeAnimation = new PositionAndSizeAnimation(view, i, i2, i3, i4);
        return positionAndSizeAnimation;
    }
}
