package com.bytedance.p073ad.symphony.p086i;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.view.View;

/* renamed from: com.bytedance.ad.symphony.i.c */
final class C2165c {
    /* renamed from: a */
    private static boolean m9433a(Context context) throws Exception {
        return ((PowerManager) context.getSystemService("power")).isScreenOn();
    }

    /* renamed from: a */
    private static boolean m9434a(View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m9438b(View view, int i) {
        if (view.getWidth() <= 1 || view.getHeight() <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m9435a(View view, int i) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null) {
            return false;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return false;
        }
        long height = ((long) rect.height()) * ((long) rect.width());
        long height2 = ((long) view.getHeight()) * ((long) view.getWidth());
        if (height2 > 0 && height * 100 >= ((long) i) * height2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m9436a(View view, int i, int i2) {
        try {
            if (m9437b(view, 0, i2) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static int m9437b(View view, int i, int i2) throws Exception {
        if (!m9433a(view.getContext())) {
            return 4;
        }
        if (!m9434a(view)) {
            return 1;
        }
        if (!m9438b(view, i2)) {
            return 6;
        }
        if (!m9435a(view, i)) {
            return 3;
        }
        return 0;
    }
}
