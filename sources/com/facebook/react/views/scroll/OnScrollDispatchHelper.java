package com.facebook.react.views.scroll;

import android.os.SystemClock;

public class OnScrollDispatchHelper {
    private long mLastScrollEventTimeMs = -11;
    private int mPrevX = Integer.MIN_VALUE;
    private int mPrevY = Integer.MIN_VALUE;
    private float mXFlingVelocity;
    private float mYFlingVelocity;

    public float getXFlingVelocity() {
        return this.mXFlingVelocity;
    }

    public float getYFlingVelocity() {
        return this.mYFlingVelocity;
    }

    public boolean onScrollChanged(int i, int i2) {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.mLastScrollEventTimeMs <= 10 && this.mPrevX == i && this.mPrevY == i2) {
            z = false;
        } else {
            z = true;
        }
        if (uptimeMillis - this.mLastScrollEventTimeMs != 0) {
            this.mXFlingVelocity = ((float) (i - this.mPrevX)) / ((float) (uptimeMillis - this.mLastScrollEventTimeMs));
            this.mYFlingVelocity = ((float) (i2 - this.mPrevY)) / ((float) (uptimeMillis - this.mLastScrollEventTimeMs));
        }
        this.mLastScrollEventTimeMs = uptimeMillis;
        this.mPrevX = i;
        this.mPrevY = i2;
        return z;
    }
}
