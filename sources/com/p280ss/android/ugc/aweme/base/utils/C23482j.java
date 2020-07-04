package com.p280ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;

/* renamed from: com.ss.android.ugc.aweme.base.utils.j */
public final class C23482j {

    /* renamed from: a */
    private static int f61958a = -1;

    /* renamed from: b */
    private static int f61959b = -1;

    /* renamed from: c */
    private static int f61960c = -1;

    /* renamed from: d */
    private static int f61961d = -1;

    /* renamed from: c */
    public static int m77099c() {
        return m77098b(C6399b.m19921a());
    }

    /* renamed from: d */
    public static int m77101d() {
        Resources resources = C6399b.m19921a().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: e */
    public static int m77103e() {
        Resources resources = C6399b.m19921a().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static int[] m77096a() {
        DisplayMetrics displayMetrics = C6399b.m19921a().getResources().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    /* renamed from: b */
    public static int m77097b() {
        WindowManager windowManager = (WindowManager) C6399b.m19921a().getSystemService("window");
        if (windowManager == null) {
            return C6399b.m19921a().getResources().getDisplayMetrics().heightPixels;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        if (defaultDisplay == null) {
            return 0;
        }
        defaultDisplay.getSize(point);
        return point.y;
    }

    /* renamed from: i */
    private static boolean m77108i(Context context) {
        return "com.ss.android.ugc.aweme".equals(context.getPackageName());
    }

    /* renamed from: a */
    public static int m77095a(Context context) {
        if (f61959b > 0) {
            return f61959b;
        }
        if (context == null) {
            return 0;
        }
        m77106g(context);
        if (f61959b > 0) {
            return f61959b;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m77098b(Context context) {
        if (f61958a > 0) {
            return f61958a;
        }
        if (context == null) {
            return 0;
        }
        m77106g(context);
        if (f61958a > 0) {
            return f61958a;
        }
        return 0;
    }

    /* renamed from: c */
    public static int m77100c(Context context) {
        int i;
        int i2;
        if (m77108i(context)) {
            if (C6776h.m20942a()) {
                i2 = m77107h(context);
            } else {
                i2 = C9738o.m28691a(context);
            }
            i = C9738o.m28709b(context);
        } else {
            i2 = m77098b(context);
            i = m77095a(context);
        }
        if (i2 > i) {
            return i;
        }
        return i2;
    }

    /* renamed from: d */
    public static int m77102d(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        if (VERSION.SDK_INT >= 17) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                if (i > i2) {
                    i = i2;
                }
            }
        }
        if (i == 0) {
            i = m77098b(context);
        }
        return i;
    }

    /* renamed from: e */
    public static int m77104e(Context context) {
        int i = 0;
        if (!m77109j(context)) {
            return 0;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        }
        return i;
    }

    /* renamed from: f */
    public static int m77105f(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) context.getSystemService("window");
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
            return displayMetrics.heightPixels;
        } catch (Exception unused) {
            return m77095a(context);
        }
    }

    /* renamed from: h */
    private static int m77107h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return m77098b(context);
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            if (defaultDisplay == null) {
                return 0;
            }
            defaultDisplay.getSize(point);
            return point.x;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: g */
    private static void m77106g(Context context) {
        if (context != null) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    if (defaultDisplay != null) {
                        if (VERSION.SDK_INT >= 17) {
                            defaultDisplay.getRealSize(point);
                        } else {
                            defaultDisplay.getSize(point);
                        }
                        f61959b = point.y;
                        f61958a = point.x;
                        return;
                    }
                    return;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                f61959b = displayMetrics.heightPixels;
                f61958a = displayMetrics.widthPixels;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: j */
    private static boolean m77109j(Context context) {
        boolean z;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier > 0) {
            z = resources.getBoolean(identifier);
        } else {
            z = false;
        }
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"qemu.hw.mainkeys"});
            if ("1".equals(str)) {
                return false;
            }
            if ("0".equals(str)) {
                return true;
            }
            return z;
        } catch (Exception unused) {
        }
    }
}
