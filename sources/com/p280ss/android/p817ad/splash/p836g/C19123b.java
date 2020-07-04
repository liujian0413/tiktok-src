package com.p280ss.android.p817ad.splash.p836g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.g.b */
public final class C19123b {

    /* renamed from: a */
    private static Boolean f51706a;

    /* renamed from: b */
    private static List<String> f51707b;

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m62659a() {
        /*
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r0 = r0.toLowerCase()
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 0
            switch(r1) {
                case -1206476313: goto L_0x0038;
                case -759499589: goto L_0x002e;
                case 3418016: goto L_0x0024;
                case 3620012: goto L_0x001a;
                case 97536331: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0042
        L_0x0010:
            java.lang.String r1 = "flyme"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = 4
            goto L_0x0043
        L_0x001a:
            java.lang.String r1 = "vivo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = 2
            goto L_0x0043
        L_0x0024:
            java.lang.String r1 = "oppo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x002e:
            java.lang.String r1 = "xiaomi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = 3
            goto L_0x0043
        L_0x0038:
            java.lang.String r1 = "huawei"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x0046
            return r3
        L_0x0046:
            java.util.List<java.lang.String> r0 = f51707b
            if (r0 != 0) goto L_0x0056
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r1 = "GLK-AL00"
            r0[r3] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            f51707b = r0
        L_0x0056:
            java.util.List<java.lang.String> r0 = f51707b
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.contains(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p817ad.splash.p836g.C19123b.m62659a():boolean");
    }

    /* renamed from: i */
    private static boolean m62668i(View view) {
        if (view != null && VERSION.SDK_INT >= 28) {
            return m62669j(view);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m62660a(String str) {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!TextUtils.isEmpty(lowerCase)) {
            return lowerCase.equals(str);
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m62664e(View view) {
        if (view == null) {
            return false;
        }
        return view.getContext().getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* renamed from: j */
    private static boolean m62669j(View view) {
        if (view == null || !view.isAttachedToWindow()) {
            return false;
        }
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return false;
        }
        DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
        if (displayCutout != null && displayCutout.getSafeInsetTop() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m62670k(View view) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        Activity m = m62672m(view);
        if (m != null) {
            Window window = m.getWindow();
            if ((window.getAttributes().flags & PreloadTask.BYTE_UNIT_NUMBER) == 1024) {
                z = true;
            }
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if ((systemUiVisibility & 4) == 4 && (systemUiVisibility & PreloadTask.BYTE_UNIT_NUMBER) == 1024) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: m */
    private static Activity m62672m(View view) {
        if (view == null) {
            return null;
        }
        while (view != null) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return null;
    }

    /* renamed from: a */
    private static int m62657a(View view) {
        if (view == null) {
            return 0;
        }
        Boolean valueOf = Boolean.valueOf(m62661b(view));
        f51706a = valueOf;
        if (valueOf.booleanValue()) {
            if (VERSION.SDK_INT >= 28) {
                Activity m = m62672m(view);
                if (m == null) {
                    return 0;
                }
                int i = m.getWindow().getAttributes().layoutInDisplayCutoutMode;
                if (i == 2) {
                    return 0;
                }
                if (i == 1) {
                    if (m62670k(view) || m62671l(view)) {
                        return m62662c(view);
                    }
                } else if (m62671l(view)) {
                    return m62662c(view);
                }
            } else if (m62670k(view) || m62671l(view)) {
                return m62662c(view);
            }
        } else if (m62671l(view)) {
            return m62662c(view);
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m62661b(View view) {
        if (m62659a()) {
            return true;
        }
        if (m62660a("huawei")) {
            return m62663d(view);
        }
        if (m62660a("oppo")) {
            return m62664e(view);
        }
        if (m62660a("vivo")) {
            return m62665f(view);
        }
        if (m62660a("xiaomi")) {
            return m62666g(view);
        }
        if (m62660a("flyme")) {
            return m62667h(view);
        }
        return m62668i(view);
    }

    /* renamed from: c */
    private static int m62662c(View view) {
        if (view == null) {
            return 0;
        }
        Context context = view.getContext();
        if (context.getResources().getConfiguration().orientation != 1) {
            return 0;
        }
        if (m62660a("oppo")) {
            return C19137n.m62751b(context);
        }
        if (VERSION.SDK_INT >= 28 && (context instanceof Activity) && view.isAttachedToWindow()) {
            DisplayCutout displayCutout = view.getRootWindowInsets().getDisplayCutout();
            if (displayCutout != null) {
                return displayCutout.getSafeInsetTop();
            }
        }
        return C19137n.m62751b(context);
    }

    /* renamed from: d */
    private static boolean m62663d(View view) {
        Class cls;
        if (VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m62669j(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
                return false;
            }
        } else {
            cls = Class.forName("com.huawei.android.util.HwNotchSizeUtil");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getMethod("hasNotchInScreen", new Class[0]).invoke(cls, new Object[0])).booleanValue();
    }

    /* renamed from: f */
    private static boolean m62665f(View view) {
        Class cls;
        if (VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m62669j(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("android.util.FtFeature");
            } catch (ClassNotFoundException | Exception | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return false;
            }
        } else {
            cls = Class.forName("android.util.FtFeature");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", new Class[]{Integer.TYPE}).invoke(cls, new Object[]{Integer.valueOf(32)})).booleanValue();
    }

    /* renamed from: g */
    private static boolean m62666g(View view) {
        if (VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m62669j(view);
        }
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            Method declaredMethod = cls.getDeclaredMethod("getInt", new Class[]{String.class, Integer.TYPE});
            declaredMethod.setAccessible(true);
            if (((Integer) declaredMethod.invoke(cls, new Object[]{"ro.miui.notch", Integer.valueOf(0)})).intValue() == 1) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException e) {
            e.getMessage();
            return false;
        } catch (NoSuchMethodException e2) {
            e2.getMessage();
            return false;
        } catch (IllegalAccessException e3) {
            e3.getMessage();
            return false;
        } catch (InvocationTargetException e4) {
            e4.getMessage();
            return false;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* renamed from: h */
    private static boolean m62667h(View view) {
        Class cls;
        if (VERSION.SDK_INT >= 28 && view != null && view.isAttachedToWindow()) {
            return m62669j(view);
        }
        if (view != null) {
            try {
                cls = view.getClass().getClassLoader().loadClass("flyme.config.FlymeFeature");
            } catch (ClassNotFoundException | Exception | IllegalAccessException | NoSuchFieldException unused) {
                return false;
            }
        } else {
            cls = Class.forName("flyme.config.FlymeFeature");
        }
        if (cls == null) {
            return false;
        }
        return ((Boolean) cls.getDeclaredField("IS_FRINGE_DEVICE").get(Boolean.valueOf(false))).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if ((r4 & com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask.BYTE_UNIT_NUMBER) == 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if ((r4 & com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask.BYTE_UNIT_NUMBER) == 0) goto L_0x004d;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m62671l(android.view.View r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.app.Activity r4 = m62672m(r4)
            r1 = 1
            if (r4 == 0) goto L_0x004e
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 < r3) goto L_0x0034
            android.view.Window r2 = r4.getWindow()
            android.view.View r2 = r2.getDecorView()
            int r2 = r2.getSystemUiVisibility()
            android.view.Window r4 = r4.getWindow()
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
            int r4 = r4.flags
            r3 = r2 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x004e
            r2 = r2 & 4
            if (r2 != 0) goto L_0x004e
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L_0x004e
            goto L_0x004d
        L_0x0034:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            if (r2 < r3) goto L_0x004e
            android.view.Window r4 = r4.getWindow()
            android.view.WindowManager$LayoutParams r4 = r4.getAttributes()
            int r4 = r4.flags
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r4
            if (r2 == 0) goto L_0x004e
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L_0x004e
        L_0x004d:
            r0 = 1
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p817ad.splash.p836g.C19123b.m62671l(android.view.View):boolean");
    }

    /* renamed from: a */
    public static int m62658a(View view, int i) {
        if (view == null) {
            return 0;
        }
        Context context = view.getContext();
        if (context == null) {
            return 0;
        }
        int a = m62657a(view);
        if (f51706a.booleanValue() && a == 0 && i == 0) {
            return C19137n.m62751b(context);
        }
        return a;
    }
}
