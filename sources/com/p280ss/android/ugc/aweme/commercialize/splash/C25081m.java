package com.p280ss.android.ugc.aweme.commercialize.splash;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.m */
public final class C25081m {

    /* renamed from: a */
    public static final C25081m f66204a = new C25081m();

    private C25081m() {
    }

    /* renamed from: c */
    private final boolean m82602c(Activity activity) {
        if (VERSION.SDK_INT >= 28) {
            return m82605f(activity);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m82601b(android.app.Activity r4) {
        /*
            r3 = this;
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r1 = "com.oppo.feature.screen.heteromorphism"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L_0x002e
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002d }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x002d }
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = com.p280ss.android.ugc.aweme.commercialize.splash.C25082n.m82607a(r1, r4, r2)     // Catch:{ NameNotFoundException -> 0x002d }
            if (r4 == 0) goto L_0x0028
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x002d }
            if (r4 == 0) goto L_0x0028
            java.lang.String r1 = "android.max_aspect"
            java.lang.Object r4 = r4.get(r1)     // Catch:{ NameNotFoundException -> 0x002d }
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            if (r4 == 0) goto L_0x002d
            r4 = 1
            r0 = 1
        L_0x002d:
            return r0
        L_0x002e:
            boolean r4 = r3.m82605f(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.splash.C25081m.m82601b(android.app.Activity):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m82603d(android.app.Activity r5) {
        /*
            r4 = this;
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch:{ Exception -> 0x0033 }
            java.lang.String r1 = "com.huawei.android.util.HwNotchSizeUtil"
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r1 = "hasNotchInScreen"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0033 }
            r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x0033 }
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0032 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0032 }
            r1 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = com.p280ss.android.ugc.aweme.commercialize.splash.C25082n.m82607a(r0, r5, r1)     // Catch:{ NameNotFoundException -> 0x0032 }
            if (r5 == 0) goto L_0x002d
            android.os.Bundle r5 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0032 }
            if (r5 == 0) goto L_0x002d
            java.lang.String r0 = "android.notch_support"
            java.lang.Object r5 = r5.get(r0)     // Catch:{ NameNotFoundException -> 0x0032 }
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            if (r5 == 0) goto L_0x0032
            r5 = 1
            r2 = 1
        L_0x0032:
            return r2
        L_0x0033:
            boolean r5 = r4.m82605f(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.splash.C25081m.m82603d(android.app.Activity):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m82604e(android.app.Activity r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ro.miui.notch"
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            int r0 = com.p280ss.android.ugc.aweme.app.p1028c.C22911a.m75399a(r0, r1)
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x0039
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r0 < r3) goto L_0x0019
            return r2
        L_0x0019:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0038 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0038 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = com.p280ss.android.ugc.aweme.commercialize.splash.C25082n.m82607a(r0, r5, r3)     // Catch:{ NameNotFoundException -> 0x0038 }
            if (r5 == 0) goto L_0x0034
            android.os.Bundle r5 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0038 }
            if (r5 == 0) goto L_0x0034
            java.lang.String r0 = "notch.config"
            java.lang.Object r5 = r5.get(r0)     // Catch:{ NameNotFoundException -> 0x0038 }
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x0038
            r1 = 1
        L_0x0038:
            return r1
        L_0x0039:
            boolean r5 = r4.m82605f(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.splash.C25081m.m82604e(android.app.Activity):boolean");
    }

    /* renamed from: f */
    private final boolean m82605f(Activity activity) {
        if (VERSION.SDK_INT < 28) {
            return true;
        }
        Window window = activity.getWindow();
        C7573i.m23582a((Object) window, "activity.window");
        LayoutParams attributes = window.getAttributes();
        if (attributes.layoutInDisplayCutoutMode == 1) {
            return true;
        }
        if (attributes.layoutInDisplayCutoutMode != 0 || m82606g(activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m82606g(Activity activity) {
        TypedValue typedValue = new TypedValue();
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(R.style.m_, new int[]{16843277});
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.getValue(0, typedValue);
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        if (typedValue.type != 18 || typedValue.data == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r0.equals("huawei") != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        return f66204a.m82603d(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        return f66204a.m82605f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r0.equals("honor") != false) goto L_0x005a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m82600a(android.app.Activity r3) {
        /*
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "Build.BRAND"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "Xiaomi"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = "Xiaomi"
        L_0x0023:
            int r1 = r0.hashCode()
            switch(r1) {
                case -1675632421: goto L_0x0061;
                case -1206476313: goto L_0x0052;
                case 3418016: goto L_0x0043;
                case 3620012: goto L_0x0034;
                case 99462250: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0070
        L_0x002b:
            java.lang.String r1 = "honor"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            goto L_0x005a
        L_0x0034:
            java.lang.String r1 = "vivo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            com.ss.android.ugc.aweme.commercialize.splash.m r0 = f66204a
            boolean r3 = r0.m82602c(r3)
            return r3
        L_0x0043:
            java.lang.String r1 = "oppo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            com.ss.android.ugc.aweme.commercialize.splash.m r0 = f66204a
            boolean r3 = r0.m82601b(r3)
            return r3
        L_0x0052:
            java.lang.String r1 = "huawei"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
        L_0x005a:
            com.ss.android.ugc.aweme.commercialize.splash.m r0 = f66204a
            boolean r3 = r0.m82603d(r3)
            return r3
        L_0x0061:
            java.lang.String r1 = "Xiaomi"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0070
            com.ss.android.ugc.aweme.commercialize.splash.m r0 = f66204a
            boolean r3 = r0.m82604e(r3)
            return r3
        L_0x0070:
            com.ss.android.ugc.aweme.commercialize.splash.m r0 = f66204a
            boolean r3 = r0.m82605f(r3)
            return r3
        L_0x0077:
            kotlin.TypeCastException r3 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.splash.C25081m.m82600a(android.app.Activity):boolean");
    }
}
