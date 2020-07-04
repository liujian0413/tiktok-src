package android.support.p022v4.view;

import android.view.MotionEvent;

/* renamed from: android.support.v4.view.j */
public final class C0978j {
    /* renamed from: a */
    public static int m4129a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    /* renamed from: b */
    public static int m4131b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    /* renamed from: c */
    public static float m4133c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    /* renamed from: d */
    public static float m4134d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* renamed from: a */
    public static int m4130a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    /* renamed from: b */
    public static int m4132b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    /* renamed from: e */
    public static boolean m4135e(MotionEvent motionEvent, int i) {
        if ((motionEvent.getSource() & 8194) == 8194) {
            return true;
        }
        return false;
    }
}
