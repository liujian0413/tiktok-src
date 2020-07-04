package android.support.p029v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.support.p022v4.graphics.drawable.C0733f;
import android.support.p029v7.graphics.drawable.C1131b;

/* renamed from: android.support.v7.widget.w */
public final class C1433w {

    /* renamed from: a */
    public static final Rect f5556a = new Rect();

    /* renamed from: b */
    private static Class<?> f5557b;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f5557b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: b */
    static void m7202b(Drawable drawable) {
        if (VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m7204d(drawable);
        }
    }

    /* renamed from: d */
    private static void m7204d(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(C1361ar.f5332e);
        } else {
            drawable.setState(C1361ar.f5335h);
        }
        drawable.setState(state);
    }

    /* renamed from: c */
    public static boolean m7203c(Drawable drawable) {
        while (true) {
            if (VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT >= 17 || !(drawable instanceof LayerDrawable)) {
                if (!(drawable instanceof DrawableContainer)) {
                    if (!(drawable instanceof C0733f)) {
                        if (!(drawable instanceof C1131b)) {
                            if (!(drawable instanceof ScaleDrawable)) {
                                break;
                            }
                            drawable = ((ScaleDrawable) drawable).getDrawable();
                        } else {
                            drawable = ((C1131b) drawable).f4068k;
                        }
                    } else {
                        drawable = ((C0733f) drawable).mo2904a();
                    }
                } else {
                    ConstantState constantState = drawable.getConstantState();
                    if (constantState instanceof DrawableContainerState) {
                        for (Drawable c : ((DrawableContainerState) constantState).getChildren()) {
                            if (!m7203c(c)) {
                                return false;
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0078 A[Catch:{ Exception -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079 A[Catch:{ Exception -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080 A[Catch:{ Exception -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087 A[Catch:{ Exception -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e A[Catch:{ Exception -> 0x0098 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Rect m7201a(android.graphics.drawable.Drawable r10) {
        /*
            java.lang.Class<?> r0 = f5557b
            if (r0 == 0) goto L_0x0098
            android.graphics.drawable.Drawable r10 = android.support.p022v4.graphics.drawable.C0727a.m3117h(r10)     // Catch:{ Exception -> 0x0098 }
            java.lang.Class r0 = r10.getClass()     // Catch:{ Exception -> 0x0098 }
            java.lang.String r1 = "getOpticalInsets"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0098 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x0098 }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0098 }
            java.lang.Object r10 = r0.invoke(r10, r1)     // Catch:{ Exception -> 0x0098 }
            if (r10 == 0) goto L_0x0098
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ Exception -> 0x0098 }
            r0.<init>()     // Catch:{ Exception -> 0x0098 }
            java.lang.Class<?> r1 = f5557b     // Catch:{ Exception -> 0x0098 }
            java.lang.reflect.Field[] r1 = r1.getFields()     // Catch:{ Exception -> 0x0098 }
            int r3 = r1.length     // Catch:{ Exception -> 0x0098 }
            r4 = 0
        L_0x002a:
            if (r4 >= r3) goto L_0x0097
            r5 = r1[r4]     // Catch:{ Exception -> 0x0098 }
            java.lang.String r6 = r5.getName()     // Catch:{ Exception -> 0x0098 }
            r7 = -1
            int r8 = r6.hashCode()     // Catch:{ Exception -> 0x0098 }
            r9 = -1383228885(0xffffffffad8d9a2b, float:-1.6098308E-11)
            if (r8 == r9) goto L_0x006a
            r9 = 115029(0x1c155, float:1.6119E-40)
            if (r8 == r9) goto L_0x0060
            r9 = 3317767(0x32a007, float:4.649182E-39)
            if (r8 == r9) goto L_0x0056
            r9 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r8 == r9) goto L_0x004c
            goto L_0x0074
        L_0x004c:
            java.lang.String r8 = "right"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x0098 }
            if (r6 == 0) goto L_0x0074
            r6 = 2
            goto L_0x0075
        L_0x0056:
            java.lang.String r8 = "left"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x0098 }
            if (r6 == 0) goto L_0x0074
            r6 = 0
            goto L_0x0075
        L_0x0060:
            java.lang.String r8 = "top"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x0098 }
            if (r6 == 0) goto L_0x0074
            r6 = 1
            goto L_0x0075
        L_0x006a:
            java.lang.String r8 = "bottom"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x0098 }
            if (r6 == 0) goto L_0x0074
            r6 = 3
            goto L_0x0075
        L_0x0074:
            r6 = -1
        L_0x0075:
            switch(r6) {
                case 0: goto L_0x008e;
                case 1: goto L_0x0087;
                case 2: goto L_0x0080;
                case 3: goto L_0x0079;
                default: goto L_0x0078;
            }     // Catch:{ Exception -> 0x0098 }
        L_0x0078:
            goto L_0x0094
        L_0x0079:
            int r5 = r5.getInt(r10)     // Catch:{ Exception -> 0x0098 }
            r0.bottom = r5     // Catch:{ Exception -> 0x0098 }
            goto L_0x0094
        L_0x0080:
            int r5 = r5.getInt(r10)     // Catch:{ Exception -> 0x0098 }
            r0.right = r5     // Catch:{ Exception -> 0x0098 }
            goto L_0x0094
        L_0x0087:
            int r5 = r5.getInt(r10)     // Catch:{ Exception -> 0x0098 }
            r0.top = r5     // Catch:{ Exception -> 0x0098 }
            goto L_0x0094
        L_0x008e:
            int r5 = r5.getInt(r10)     // Catch:{ Exception -> 0x0098 }
            r0.left = r5     // Catch:{ Exception -> 0x0098 }
        L_0x0094:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x0097:
            return r0
        L_0x0098:
            android.graphics.Rect r10 = f5556a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.C1433w.m7201a(android.graphics.drawable.Drawable):android.graphics.Rect");
    }

    /* renamed from: a */
    public static Mode m7200a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }
}
