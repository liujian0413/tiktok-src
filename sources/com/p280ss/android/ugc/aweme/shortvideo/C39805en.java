package com.p280ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.utils.C43041d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.en */
public final class C39805en {
    /* renamed from: a */
    public static boolean m127445a() {
        return C35574k.m114859a().mo70096k().mo93305a(Property.EnableFullScreenAdapt);
    }

    /* renamed from: b */
    private static boolean m127449b() {
        return C35574k.m114859a().mo70096k().mo93305a(Property.IsForcedToDefaultFullScreenPlan);
    }

    /* renamed from: f */
    public static int m127453f(Context context) {
        return m127448b(context, -1);
    }

    /* renamed from: h */
    private static boolean m127455h(Context context) {
        if (m127451d(context) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m127443a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (defaultDisplay == null) {
            return 0;
        }
        defaultDisplay.getSize(point);
        return point.y;
    }

    /* renamed from: b */
    public static int m127447b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    /* renamed from: c */
    public static int m127450c(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static void m127444a(Activity activity) {
        if (m127449b()) {
            C23487o.m77136a(activity);
        } else if (C6776h.m20953d()) {
            C10994a.m32205a(activity);
        } else {
            C10994a.m32208b(activity);
        }
    }

    /* renamed from: e */
    public static int m127452e(Context context) {
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
            return m127443a(context);
        }
    }

    /* renamed from: d */
    public static int m127451d(Context context) {
        int i;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        Rect rect = new Rect();
        Activity a = C43041d.m136566a(context);
        if (a != null) {
            a.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return Math.min(Math.max((m127452e(context) - m127450c(context)) - rect.height(), 0), i);
        } else if (!m127454g(context)) {
            return 0;
        } else {
            return i;
        }
    }

    /* renamed from: g */
    private static boolean m127454g(Context context) {
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

    /* renamed from: a */
    public static boolean m127446a(Context context, int i) {
        try {
            float e = ((float) m127452e(context)) / context.getResources().getDisplayMetrics().density;
            double d = (double) (i * 52);
            Double.isNaN(d);
            if (((double) e) < d + 274.5d) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r3 < r6) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r2 <= r11) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (r3 < r6) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m127448b(android.content.Context r11, int r12) {
        /*
            r0 = 0
            if (r11 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = m127452e(r11)
            int r2 = m127447b(r11)
            int r3 = m127450c(r11)
            r4 = -1
            if (r12 != r4) goto L_0x0018
            int r5 = m127451d(r11)
            goto L_0x0019
        L_0x0018:
            r5 = r12
        L_0x0019:
            android.content.res.Resources r6 = r11.getResources()
            r7 = 2131165310(0x7f07007e, float:1.7944834E38)
            int r6 = r6.getDimensionPixelSize(r7)
            int r2 = r2 * 16
            int r2 = r2 / 9
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 2
            if (r12 == 0) goto L_0x0057
            if (r12 != r4) goto L_0x0037
            boolean r11 = m127455h(r11)
            if (r11 != 0) goto L_0x0037
            goto L_0x0057
        L_0x0037:
            int r1 = r1 - r5
            if (r2 >= r1) goto L_0x0055
            int r11 = r1 - r3
            int r12 = r11 - r6
            if (r2 > r12) goto L_0x0042
            r11 = 4
            goto L_0x0073
        L_0x0042:
            if (r2 > r11) goto L_0x004d
            int r12 = r1 - r6
            if (r2 > r12) goto L_0x004d
            if (r3 >= r6) goto L_0x004b
            goto L_0x0050
        L_0x004b:
            r11 = 6
            goto L_0x0073
        L_0x004d:
            int r1 = r1 - r6
            if (r2 > r1) goto L_0x0052
        L_0x0050:
            r11 = 5
            goto L_0x0073
        L_0x0052:
            if (r2 > r11) goto L_0x0055
            goto L_0x004b
        L_0x0055:
            r11 = 7
            goto L_0x0073
        L_0x0057:
            int r11 = r1 - r3
            int r12 = r11 - r6
            if (r2 > r12) goto L_0x005f
            r11 = 1
            goto L_0x0073
        L_0x005f:
            if (r2 > r11) goto L_0x006a
            int r12 = r1 - r6
            if (r2 > r12) goto L_0x006a
            if (r3 >= r6) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            r11 = 3
            goto L_0x0073
        L_0x006a:
            int r1 = r1 - r6
            if (r2 > r1) goto L_0x006f
        L_0x006d:
            r11 = 2
            goto L_0x0073
        L_0x006f:
            if (r2 > r11) goto L_0x0072
            goto L_0x0068
        L_0x0072:
            r11 = 0
        L_0x0073:
            com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            boolean r12 = m127449b()
            if (r12 == 0) goto L_0x007d
            r11 = 0
        L_0x007d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.C39805en.m127448b(android.content.Context, int):int");
    }
}
