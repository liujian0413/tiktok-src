package com.swmansion.gesturehandler;

import android.view.MotionEvent;

/* renamed from: com.swmansion.gesturehandler.f */
public final class C46352f {
    /* renamed from: a */
    public static float m145555a(MotionEvent motionEvent, boolean z) {
        int i;
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        if (motionEvent.getActionMasked() == 6) {
            i = motionEvent.getActionIndex();
        } else {
            i = -1;
        }
        if (z) {
            float f = 0.0f;
            int pointerCount = motionEvent.getPointerCount();
            int i2 = 0;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (i3 != i) {
                    f += motionEvent.getX(i3) + rawX;
                    i2++;
                }
            }
            return f / ((float) i2);
        }
        int pointerCount2 = motionEvent.getPointerCount() - 1;
        if (pointerCount2 == i) {
            pointerCount2--;
        }
        return motionEvent.getX(pointerCount2) + rawX;
    }

    /* renamed from: b */
    public static float m145556b(MotionEvent motionEvent, boolean z) {
        int i;
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        if (motionEvent.getActionMasked() == 6) {
            i = motionEvent.getActionIndex();
        } else {
            i = -1;
        }
        if (z) {
            float f = 0.0f;
            int pointerCount = motionEvent.getPointerCount();
            int i2 = 0;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (i3 != i) {
                    f += motionEvent.getY(i3) + rawY;
                    i2++;
                }
            }
            return f / ((float) i2);
        }
        int pointerCount2 = motionEvent.getPointerCount() - 1;
        if (pointerCount2 == i) {
            pointerCount2--;
        }
        return motionEvent.getY(pointerCount2) + rawY;
    }
}
