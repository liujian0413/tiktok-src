package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.em */
public final class C39804em {

    /* renamed from: a */
    public static int f103457a;

    /* renamed from: b */
    public static int f103458b;

    /* renamed from: c */
    public static int f103459c;

    /* renamed from: a */
    public static boolean m127437a(int i, int i2) {
        if (i2 * 9 < i * 16) {
            double d = (double) i2;
            double d2 = (double) i;
            Double.isNaN(d);
            Double.isNaN(d2);
            if (Math.abs((d / d2) - 1.7777777910232544d) >= 0.1d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m127436a() {
        if (f103457a == 1 || f103457a == 3 || f103457a == 4 || f103457a == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m127428a(Context context) {
        return m127440c(context, -1);
    }

    /* renamed from: b */
    public static int m127438b(Context context, int i) {
        int c = C39805en.m127450c(context);
        switch (i) {
            case 1:
            case 3:
            case 4:
            case 6:
                return c;
            default:
                return 0;
        }
    }

    /* renamed from: c */
    private static int m127440c(Context context, int i) {
        f103459c = C39805en.m127450c(context);
        f103457a = C39805en.m127448b(context, i);
        f103458b = m127442d(context, f103457a);
        return f103457a;
    }

    /* renamed from: a */
    public static int m127429a(Context context, int i) {
        int d = C39805en.m127451d(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cp);
        switch (i) {
            case 1:
            case 2:
                return dimensionPixelSize;
            case 4:
                return d + dimensionPixelSize;
            case 5:
                return d + dimensionPixelSize;
            case 6:
            case 7:
                return d;
            default:
                return 0;
        }
    }

    /* renamed from: d */
    private static int m127442d(Context context, int i) {
        int c = C39805en.m127450c(context);
        int d = C39805en.m127451d(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cp);
        int e = C39805en.m127452e(context);
        switch (f103457a) {
            case 1:
                return (e - c) - dimensionPixelSize;
            case 2:
                return e - dimensionPixelSize;
            case 3:
                return e - c;
            case 4:
                return ((e - d) - c) - dimensionPixelSize;
            case 5:
                return (e - d) - dimensionPixelSize;
            case 6:
                return (e - d) - c;
            case 7:
                return e - d;
            default:
                return e;
        }
    }

    /* renamed from: b */
    public static void m127439b(View view, int i, int i2) {
        m127435a(view, i, i2, false);
    }

    /* renamed from: a */
    public static LayoutParams m127432a(Context context, int i, int i2) {
        return m127433a(context, i, i2, -1);
    }

    /* renamed from: a */
    public static void m127434a(View view, int i, int i2) {
        int i3;
        if (view != null) {
            Context context = view.getContext();
            int e = C39805en.m127452e(context);
            int b = C39805en.m127447b(context);
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            if (e * 9 < b * 16 || i >= i2) {
                layoutParams.width = b;
                layoutParams.height = (i2 * b) / i;
                layoutParams.topMargin = (e - layoutParams.height) / 2;
                if (layoutParams.topMargin >= 0) {
                    i3 = layoutParams.topMargin;
                } else {
                    i3 = 0;
                }
                layoutParams.topMargin = i3;
                layoutParams.leftMargin = 0;
            } else {
                layoutParams.width = (i * e) / i2;
                layoutParams.height = e;
                layoutParams.leftMargin = (b - layoutParams.width) / 2;
                layoutParams.topMargin = 0;
            }
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(layoutParams.leftMargin);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: c */
    public static void m127441c(View view, int i, int i2) {
        int i3;
        Context context = view.getContext();
        int e = C39805en.m127452e(context);
        int b = C39805en.m127447b(context);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        if (i2 * 9 < i * 16 || e * 9 < b * 16) {
            layoutParams.width = b;
            layoutParams.height = (i2 * b) / i;
            layoutParams.topMargin = (e - layoutParams.height) / 2;
            if (layoutParams.topMargin >= 0) {
                i3 = layoutParams.topMargin;
            } else {
                i3 = 0;
            }
            layoutParams.topMargin = i3;
            layoutParams.leftMargin = 0;
        } else {
            layoutParams.width = (i * e) / i2;
            layoutParams.height = e;
            layoutParams.leftMargin = (b - layoutParams.width) / 2;
            layoutParams.topMargin = 0;
        }
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static int m127430a(View view, Context context, int i, int i2) {
        return m127431a(view, context, i, i2, C39805en.m127451d(context));
    }

    /* renamed from: a */
    public static LayoutParams m127433a(Context context, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int e = C39805en.m127452e(context);
        int b = C39805en.m127447b(context);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        if (C39805en.m127445a()) {
            m127428a(context);
            i5 = C39805en.m127450c(context);
            int d = C39805en.m127451d(context);
            if (i3 == -1) {
                i3 = context.getResources().getDimensionPixelSize(R.dimen.cp);
            }
            switch (f103457a) {
                case 1:
                    i4 = (e - i5) - i3;
                    break;
                case 2:
                    i4 = e - i3;
                    break;
                case 3:
                    i4 = e - i5;
                    break;
                case 4:
                    i4 = ((e - d) - i5) - i3;
                    break;
                case 5:
                    i4 = (e - d) - i3;
                    break;
                case 6:
                    i4 = (e - d) - i5;
                    break;
                case 7:
                    i4 = e - d;
                    break;
            }
        }
        i4 = e;
        i5 = 0;
        if (i2 * 9 < i * 16 || e * 9 < b * 16) {
            layoutParams.width = b;
            layoutParams.height = (i2 * b) / i;
            layoutParams.topMargin = i5 + ((i4 - layoutParams.height) / 2);
            if (layoutParams.topMargin >= 0) {
                i6 = layoutParams.topMargin;
            } else {
                i6 = 0;
            }
            layoutParams.topMargin = i6;
            layoutParams.leftMargin = 0;
        } else {
            layoutParams.height = i4;
            layoutParams.topMargin = i5;
            layoutParams.width = (i * i4) / i2;
            layoutParams.leftMargin = (C39805en.m127447b(context) - layoutParams.width) / 2;
        }
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
        }
        return layoutParams;
    }

    /* renamed from: a */
    private static void m127435a(View view, int i, int i2, boolean z) {
        Context context = view.getContext();
        int e = C39805en.m127452e(context) - 0;
        int b = C39805en.m127447b(context);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        if (e * 9 < b * 16 || i >= i2) {
            layoutParams.width = b;
            layoutParams.height = e;
            layoutParams.topMargin = 0;
            layoutParams.leftMargin = 0;
        } else {
            layoutParams.width = (i * e) / i2;
            layoutParams.height = e;
            layoutParams.leftMargin = (b - layoutParams.width) / 2;
            layoutParams.topMargin = 0;
        }
        if (VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m127431a(android.view.View r11, android.content.Context r12, int r13, int r14, int r15) {
        /*
            android.app.Activity r12 = com.p280ss.android.ugc.aweme.utils.C43041d.m136566a(r12)
            r0 = 0
            if (r11 == 0) goto L_0x00b2
            if (r12 == 0) goto L_0x00b2
            if (r13 == 0) goto L_0x00b2
            if (r14 != 0) goto L_0x000f
            goto L_0x00b2
        L_0x000f:
            int r1 = com.p280ss.android.ugc.aweme.shortvideo.C39805en.m127452e(r12)
            int r2 = com.p280ss.android.ugc.aweme.shortvideo.C39805en.m127447b(r12)
            int r3 = com.p280ss.android.ugc.aweme.shortvideo.C39805en.m127450c(r12)
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131165310(0x7f07007e, float:1.7944834E38)
            int r4 = r4.getDimensionPixelSize(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r6)
            int r6 = r1 * 9
            int r7 = r2 * 16
            if (r6 <= r7) goto L_0x004e
            int r6 = m127440c(r12, r15)
            switch(r6) {
                case 1: goto L_0x004b;
                case 2: goto L_0x0049;
                case 3: goto L_0x0047;
                case 4: goto L_0x0043;
                case 5: goto L_0x0040;
                case 6: goto L_0x003d;
                case 7: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            r3 = 0
            goto L_0x0050
        L_0x003b:
            int r1 = r1 - r15
            goto L_0x0039
        L_0x003d:
            int r1 = r1 - r15
            int r1 = r1 - r3
            goto L_0x0050
        L_0x0040:
            int r1 = r1 - r15
            int r1 = r1 - r4
            goto L_0x0039
        L_0x0043:
            int r1 = r1 - r15
            int r1 = r1 - r3
            int r1 = r1 - r4
            goto L_0x0050
        L_0x0047:
            int r1 = r1 - r3
            goto L_0x0050
        L_0x0049:
            int r1 = r1 - r4
            goto L_0x0039
        L_0x004b:
            int r1 = r1 - r3
            int r1 = r1 - r4
            goto L_0x0050
        L_0x004e:
            r3 = 0
            r6 = 0
        L_0x0050:
            int r15 = r14 * 9
            int r4 = r13 * 16
            if (r15 >= r4) goto L_0x008f
            double r7 = (double) r14
            double r9 = (double) r13
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r9)
            double r7 = r7 / r9
            r9 = 4610685218569846784(0x3ffc71c720000000, double:1.7777777910232544)
            double r7 = r7 - r9
            double r7 = java.lang.Math.abs(r7)
            r9 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 >= 0) goto L_0x0073
            goto L_0x008f
        L_0x0073:
            r5.width = r2
            int r14 = r14 * r2
            int r14 = r14 / r13
            r5.height = r14
            int r12 = r5.height
            int r1 = r1 - r12
            int r1 = r1 / 2
            int r3 = r3 + r1
            r5.topMargin = r3
            int r12 = r5.topMargin
            if (r12 < 0) goto L_0x0089
            int r12 = r5.topMargin
            goto L_0x008a
        L_0x0089:
            r12 = 0
        L_0x008a:
            r5.topMargin = r12
            r5.leftMargin = r0
            goto L_0x00a3
        L_0x008f:
            r5.height = r1
            r5.topMargin = r3
            int r13 = r13 * r1
            int r13 = r13 / r14
            r5.width = r13
            int r12 = com.p280ss.android.ugc.aweme.shortvideo.C39805en.m127447b(r12)
            int r13 = r5.width
            int r12 = r12 - r13
            int r12 = r12 / 2
            r5.leftMargin = r12
        L_0x00a3:
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 17
            if (r12 < r13) goto L_0x00ae
            int r12 = r5.leftMargin
            r5.setMarginStart(r12)
        L_0x00ae:
            r11.setLayoutParams(r5)
            return r6
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.C39804em.m127431a(android.view.View, android.content.Context, int, int, int):int");
    }
}
