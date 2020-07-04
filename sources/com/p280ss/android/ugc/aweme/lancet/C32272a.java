package com.p280ss.android.ugc.aweme.lancet;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.lancet.a */
public final class C32272a {
    /* renamed from: a */
    public static void m104795a(Activity activity) {
        if (VERSION.SDK_INT == 26) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16842840});
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            int requestedOrientation = activity.getRequestedOrientation();
            obtainStyledAttributes.recycle();
            if (z && requestedOrientation != -1) {
                try {
                    Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                    declaredField.setAccessible(true);
                    ((ActivityInfo) declaredField.get(activity)).screenOrientation = -1;
                    declaredField.setAccessible(false);
                } catch (Exception unused) {
                }
            }
        }
    }
}
