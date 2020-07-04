package com.p280ss.android.ugc.aweme.setting;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.setting.TiktokSkinHelper */
public class TiktokSkinHelper {

    /* renamed from: a */
    private static boolean f20145a;

    /* renamed from: a */
    public static void m22464a(Context context) {
        m22465a(context.getResources());
        f20145a = true;
    }

    /* renamed from: a */
    public static void m22465a(Resources resources) {
        if (f20145a) {
            if (C7212bb.m22493a()) {
                Configuration configuration = resources.getConfiguration();
                if ((configuration.uiMode & 48) != 16) {
                    configuration.uiMode = (configuration.uiMode & -49) | 16;
                    resources.updateConfiguration(configuration, null);
                    m22466b(resources);
                }
                return;
            }
            Configuration configuration2 = resources.getConfiguration();
            if ((configuration2.uiMode & 48) != 32) {
                configuration2.uiMode = (configuration2.uiMode & -49) | 32;
                resources.updateConfiguration(configuration2, null);
                m22466b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m22466b(Resources resources) {
        if (VERSION.SDK_INT >= 21 && VERSION.SDK_INT < 26) {
            try {
                Method declaredMethod = Class.forName("android.support.v7.app.ResourcesFlusher").getDeclaredMethod("flush", new Class[]{Resources.class});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, new Object[]{resources});
            } catch (Exception unused) {
            }
        }
    }
}
