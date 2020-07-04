package com.p280ss.android.ugc.aweme.flowfeed.p1254h;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.h.g */
public final class C29373g {
    /* renamed from: a */
    private static int m96482a(Context context) {
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() * 3;
        return scaledTouchSlop * scaledTouchSlop;
    }

    /* renamed from: b */
    private static int m96485b(Context context) {
        int scaledDoubleTapSlop = ViewConfiguration.get(context).getScaledDoubleTapSlop();
        return scaledDoubleTapSlop * scaledDoubleTapSlop;
    }

    /* renamed from: a */
    public static boolean m96483a(int i, MotionEvent motionEvent, MotionEvent motionEvent2, Context context) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        int x = (int) (motionEvent2.getX() - motionEvent.getX());
        int y = (int) (motionEvent2.getY() - motionEvent.getY());
        int i2 = (x * x) + (y * y);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() * 3;
        if (i2 > m96482a(context) || Math.abs(x) >= scaledTouchSlop) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m96484a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3, Context context) {
        int b = m96485b(context);
        if (motionEvent == null || motionEvent2 == null || motionEvent3 == null) {
            return false;
        }
        long eventTime = motionEvent3.getEventTime() - motionEvent2.getEventTime();
        if (eventTime > ((long) ViewConfiguration.getDoubleTapTimeout()) || eventTime < 40) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
        int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
        if ((x * x) + (y * y) < b) {
            return true;
        }
        return false;
    }
}
