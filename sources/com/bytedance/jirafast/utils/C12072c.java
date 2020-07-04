package com.bytedance.jirafast.utils;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.jirafast.models.JIRADevice;

/* renamed from: com.bytedance.jirafast.utils.c */
public class C12072c {

    /* renamed from: a */
    public static JIRADevice f32159a;

    /* renamed from: a */
    public static String m35216a() {
        return VERSION.RELEASE;
    }

    /* renamed from: b */
    private static String m35217b() {
        return Build.BRAND;
    }

    /* renamed from: c */
    private static String m35219c() {
        return Build.MODEL;
    }

    /* renamed from: b */
    private static String m35218b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("*");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public static JIRADevice m35215a(Context context) {
        if (f32159a == null) {
            synchronized (C12072c.class) {
                if (f32159a == null) {
                    JIRADevice jIRADevice = new JIRADevice();
                    f32159a = jIRADevice;
                    jIRADevice.f31923a = "Android";
                    f32159a.f31924b = m35217b();
                    f32159a.f31925c = m35219c();
                    if (VERSION.SDK_INT >= 17) {
                        f32159a.f31927e = m35218b(context);
                    }
                }
            }
        }
        f32159a.f31926d = m35216a();
        return f32159a;
    }
}
