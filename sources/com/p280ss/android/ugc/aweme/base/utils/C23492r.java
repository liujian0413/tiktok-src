package com.p280ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.base.utils.r */
public final class C23492r {

    /* renamed from: a */
    public static final C23492r f61970a = new C23492r();

    private C23492r() {
    }

    /* renamed from: a */
    private static boolean m77159a() {
        if (VERSION.SDK_INT >= 17) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m77160a(Context context) {
        int i;
        if (context == null || !m77159a()) {
            i = 0;
        } else {
            i = Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0);
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final float mo61097a(Activity activity) {
        boolean z;
        C7573i.m23587b(activity, "activity");
        if (!C6776h.m20950c() || !m77160a((Context) activity)) {
            z = false;
        } else {
            z = true;
        }
        C23482j.m77101d();
        if (z) {
            return 0.0f;
        }
        return m77161b(activity);
    }

    /* renamed from: b */
    private static float m77161b(Activity activity) {
        int i;
        Object systemService = C6399b.m19921a().getSystemService("window");
        if (systemService != null) {
            WindowManager windowManager = (WindowManager) systemService;
            if (windowManager == null) {
                return 0.0f;
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            int i2 = 0;
            try {
                Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
                int i3 = displayMetrics.heightPixels;
                if (activity == null || !TextUtils.equals("OnePlus", Build.BRAND)) {
                    C7573i.m23582a((Object) defaultDisplay, "display");
                    i = defaultDisplay.getHeight();
                } else {
                    Window window = activity.getWindow();
                    C7573i.m23582a((Object) window, "activity.window");
                    View decorView = window.getDecorView();
                    Rect rect = new Rect();
                    decorView.getWindowVisibleDisplayFrame(rect);
                    i = rect.bottom;
                }
                i2 = i3 - i;
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
            return (float) i2;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
