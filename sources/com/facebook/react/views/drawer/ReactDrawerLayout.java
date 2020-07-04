package com.facebook.react.views.drawer;

import android.support.p022v4.widget.DrawerLayout;
import android.support.p022v4.widget.DrawerLayout.LayoutParams;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.NativeGestureUtil;

class ReactDrawerLayout extends DrawerLayout {
    private int mDrawerPosition = 8388611;
    private int mDrawerWidth = -1;

    /* access modifiers changed from: 0000 */
    public void closeDrawer() {
        closeDrawer(this.mDrawerPosition);
    }

    /* access modifiers changed from: 0000 */
    public void openDrawer() {
        openDrawer(this.mDrawerPosition);
    }

    /* access modifiers changed from: 0000 */
    public void setDrawerProperties() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.f3465a = this.mDrawerPosition;
            layoutParams.width = this.mDrawerWidth;
            childAt.setLayoutParams(layoutParams);
            childAt.setClickable(true);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setDrawerPosition(int i) {
        this.mDrawerPosition = i;
        setDrawerProperties();
    }

    /* access modifiers changed from: 0000 */
    public void setDrawerWidth(int i) {
        this.mDrawerWidth = i;
        setDrawerProperties();
    }

    public ReactDrawerLayout(ReactContext reactContext) {
        super(reactContext);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
                return true;
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }
}
