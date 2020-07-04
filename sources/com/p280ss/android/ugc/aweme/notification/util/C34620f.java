package com.p280ss.android.ugc.aweme.notification.util;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.notification.util.f */
public final class C34620f {
    /* renamed from: a */
    public static void m111872a(View view, int i, int i2, float f, float f2) {
        View view2 = (View) view.getParent();
        final View view3 = view;
        final int i3 = i;
        final int i4 = i2;
        final float f3 = f;
        final float f4 = f2;
        C346211 r1 = new Runnable() {
            public final void run() {
                Rect rect = new Rect();
                view3.setEnabled(true);
                view3.getHitRect(rect);
                rect.top -= i3;
                rect.bottom += i4;
                rect.left = (int) (((float) rect.left) - f3);
                rect.right = (int) (((float) rect.right) + f4);
                TouchDelegate touchDelegate = new TouchDelegate(rect, view3);
                if (View.class.isInstance(view3.getParent())) {
                    ((View) view3.getParent()).setTouchDelegate(touchDelegate);
                }
            }
        };
        view2.post(r1);
    }
}
