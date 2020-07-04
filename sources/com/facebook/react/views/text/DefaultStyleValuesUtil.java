package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.ColorStateList;

public final class DefaultStyleValuesUtil {
    private DefaultStyleValuesUtil() {
        throw new AssertionError("Never invoke this for an Utility class!");
    }

    public static ColorStateList getDefaultTextColor(Context context) {
        return getDefaultTextAttribute(context, 16842904);
    }

    public static ColorStateList getDefaultTextColorHint(Context context) {
        return getDefaultTextAttribute(context, 16842906);
    }

    public static int getDefaultTextColorHighlight(Context context) {
        return getDefaultTextAttribute(context, 16842905).getDefaultColor();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList getDefaultTextAttribute(android.content.Context r3, int r4) {
        /*
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r0 = 1
            r1 = 0
            int[] r0 = new int[r0]     // Catch:{ all -> 0x001c }
            r2 = 0
            r0[r2] = r4     // Catch:{ all -> 0x001c }
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r0)     // Catch:{ all -> 0x001c }
            android.content.res.ColorStateList r4 = r3.getColorStateList(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0018
            r3.recycle()
        L_0x0018:
            return r4
        L_0x0019:
            r4 = move-exception
            r1 = r3
            goto L_0x001d
        L_0x001c:
            r4 = move-exception
        L_0x001d:
            if (r1 == 0) goto L_0x0022
            r1.recycle()
        L_0x0022:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.DefaultStyleValuesUtil.getDefaultTextAttribute(android.content.Context, int):android.content.res.ColorStateList");
    }
}
