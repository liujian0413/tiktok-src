package com.facebook.fbui.textlayoutbuilder.p701c;

import android.os.Build.VERSION;
import android.text.Layout;
import android.text.StaticLayout;

/* renamed from: com.facebook.fbui.textlayoutbuilder.c.a */
public final class C13459a {
    /* renamed from: a */
    public static int m39554a(Layout layout) {
        if (layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        int i = 0;
        for (int i2 = 0; i2 < lineCount; i2++) {
            i = Math.max(i, (int) layout.getLineRight(i2));
        }
        return i;
    }

    /* renamed from: b */
    public static int m39555b(Layout layout) {
        int i = 0;
        if (layout == null) {
            return 0;
        }
        if (VERSION.SDK_INT < 20 && (layout instanceof StaticLayout)) {
            float lineDescent = (float) (layout.getLineDescent(layout.getLineCount() - 1) - layout.getLineAscent(layout.getLineCount() - 1));
            float spacingAdd = lineDescent - ((lineDescent - layout.getSpacingAdd()) / layout.getSpacingMultiplier());
            if (spacingAdd >= 0.0f) {
                double d = (double) spacingAdd;
                Double.isNaN(d);
                i = (int) (d + 0.5d);
            } else {
                double d2 = (double) (-spacingAdd);
                Double.isNaN(d2);
                i = -((int) (d2 + 0.5d));
            }
        }
        return layout.getHeight() - i;
    }
}
