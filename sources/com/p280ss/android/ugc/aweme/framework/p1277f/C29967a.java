package com.p280ss.android.ugc.aweme.framework.p1277f;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.framework.f.a */
public final class C29967a {

    /* renamed from: a */
    private static boolean f78764a;

    /* renamed from: b */
    private static boolean f78765b;

    /* renamed from: a */
    private static boolean m98253a() {
        if (!f78765b) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f78764a = true;
                    f78765b = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            f78765b = true;
        }
        return f78764a;
    }

    /* renamed from: b */
    private static boolean m98255b() {
        if ((TextUtils.isEmpty(Build.DISPLAY) || !Build.DISPLAY.contains("Flyme")) && (TextUtils.isEmpty(Build.USER) || !Build.USER.equals("flyme"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m98252a(boolean z, Window window) {
        int i;
        try {
            Class cls = window.getClass();
            Class cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m98254b(boolean z, Window window) {
        try {
            LayoutParams attributes = window.getAttributes();
            Field declaredField = LayoutParams.class.getDeclaredField("meizuFlags");
            if (z) {
                declaredField.set(attributes, Integer.valueOf(declaredField.getInt(attributes) | 512));
            } else {
                declaredField.set(attributes, Integer.valueOf(declaredField.getInt(attributes) & -513));
            }
            window.setAttributes(attributes);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m98251a(Context context, Window window, boolean z) {
        if (context != null && window != null) {
            try {
                if (VERSION.SDK_INT >= 23) {
                    if (m98253a()) {
                        if (!z) {
                            m98252a(false, window);
                        } else {
                            m98252a(true, window);
                        }
                    } else if (!m98255b()) {
                        View decorView = window.getDecorView();
                        int systemUiVisibility = decorView.getSystemUiVisibility();
                        if (!z) {
                            decorView.setSystemUiVisibility(systemUiVisibility & -8193);
                        } else {
                            decorView.setSystemUiVisibility(systemUiVisibility | VideoCacheReadBuffersizeExperiment.DEFAULT);
                        }
                    } else if (!z) {
                        m98254b(false, window);
                    } else {
                        m98254b(true, window);
                    }
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
