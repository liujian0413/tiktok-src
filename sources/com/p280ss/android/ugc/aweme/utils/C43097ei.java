package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import com.gyf.barlibrary.FlymeOSStatusBarFontUtils;
import com.gyf.barlibrary.OSUtils;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.ei */
public final class C43097ei {

    /* renamed from: a */
    public static final C43097ei f111719a = new C43097ei();

    private C43097ei() {
    }

    /* renamed from: a */
    private static void m136706a(boolean z, Window window) {
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

    /* renamed from: a */
    public final void mo104758a(Activity activity, Window window, boolean z) {
        if (activity != null && window != null) {
            try {
                if (VERSION.SDK_INT >= 23) {
                    View decorView = window.getDecorView();
                    C7573i.m23582a((Object) decorView, "decorView");
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    if (!z) {
                        decorView.setSystemUiVisibility(systemUiVisibility & -8193);
                    } else {
                        decorView.setSystemUiVisibility(systemUiVisibility | VideoCacheReadBuffersizeExperiment.DEFAULT);
                    }
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                }
                if (OSUtils.isMIUI6Later()) {
                    m136706a(z, window);
                }
                if (OSUtils.isFlymeOS4Later()) {
                    FlymeOSStatusBarFontUtils.setStatusBarDarkIcon(activity, z);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
