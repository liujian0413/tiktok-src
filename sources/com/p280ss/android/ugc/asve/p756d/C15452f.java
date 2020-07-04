package com.p280ss.android.ugc.asve.p756d;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.d.f */
public final class C15452f {

    /* renamed from: a */
    public static final C15452f f39754a = new C15452f();

    private C15452f() {
    }

    /* renamed from: a */
    public static final boolean m45254a(Context context) {
        C7573i.m23587b(context, "context");
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        Resources resources = context.getResources();
        C7573i.m23582a((Object) resources, "resources");
        Configuration configuration = resources.getConfiguration();
        C7573i.m23582a((Object) configuration, "configuration");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final int m45255b(Context context) {
        C7573i.m23587b(context, "context");
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            return point.x;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: d */
    private static int m45257d(Context context) {
        C7573i.m23587b(context, "context");
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Point point = new Point();
            if (defaultDisplay == null) {
                return 0;
            }
            defaultDisplay.getSize(point);
            return point.y;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: c */
    public static final int m45256c(Context context) {
        WindowManager windowManager;
        C7573i.m23587b(context, "context");
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
            C7573i.m23582a((Object) windowManager, "context.windowManager");
        } else {
            Object systemService = context.getSystemService("window");
            if (systemService != null) {
                windowManager = (WindowManager) systemService;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
            }
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class cls = Class.forName("android.view.Display");
            C7573i.m23582a((Object) cls, "Class.forName(\"android.view.Display\")");
            cls.getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
            return displayMetrics.heightPixels;
        } catch (Exception unused) {
            return m45257d(context);
        }
    }
}
