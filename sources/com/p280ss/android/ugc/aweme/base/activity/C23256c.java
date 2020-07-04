package com.p280ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import com.p280ss.android.sdk.activity.SSActivity;

/* renamed from: com.ss.android.ugc.aweme.base.activity.c */
public final class C23256c {

    /* renamed from: a */
    public static final int c2 = 2130772070;

    /* renamed from: b */
    public static final int cf = 2130772084;

    /* renamed from: c */
    public static final int c4 = 2130772072;

    /* renamed from: d */
    public static final int cc = 2130772081;

    /* renamed from: e */
    public static final int c3 = 2130772071;

    /* renamed from: f */
    public static final int cg = 2130772085;

    /* renamed from: g */
    public static final int c6 = 2130772074;

    /* renamed from: h */
    public static final int ce = 2130772083;

    /* renamed from: i */
    public static final int s = 2130771986;

    /* renamed from: j */
    public static final int t = 2130771987;

    /* renamed from: a */
    public static void m76347a(Activity activity, int i) {
        int i2;
        int i3 = 0;
        switch (i) {
            case 0:
                i3 = c4;
                i2 = cc;
                break;
            case 1:
                break;
            case 2:
                i3 = c6;
                i2 = ce;
                break;
            case 3:
                i3 = s;
                break;
            case 4:
                i3 = c2;
                i2 = cf;
                break;
            default:
                i3 = c4;
                i2 = cc;
                break;
        }
        i2 = 0;
        if (activity instanceof SSActivity) {
            ((SSActivity) activity).mo53828a(i3, i2);
        } else {
            activity.overridePendingTransition(i3, i2);
        }
    }

    /* renamed from: b */
    public static void m76348b(Activity activity, int i) {
        int i2;
        if (activity != null) {
            int i3 = 0;
            switch (i) {
                case 0:
                    i3 = c2;
                    i2 = cf;
                    break;
                case 1:
                    i2 = 0;
                    break;
                case 2:
                    i3 = c3;
                    i2 = cg;
                    break;
                case 3:
                    i2 = t;
                    break;
                case 4:
                    i3 = c4;
                    i2 = cc;
                    break;
                default:
                    i3 = c2;
                    i2 = cf;
                    break;
            }
            if (activity instanceof SSActivity) {
                ((SSActivity) activity).mo53828a(i3, i2);
            } else {
                activity.overridePendingTransition(i3, i2);
            }
        }
    }
}
