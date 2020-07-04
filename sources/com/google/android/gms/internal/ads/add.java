package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class add extends adc {
    /* renamed from: a */
    public final boolean mo39199a(Activity activity, Configuration configuration) {
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43862cC)).booleanValue()) {
            return false;
        }
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43864cE)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        int a = afb.m45721a((Context) activity, configuration.screenHeightDp);
        int a2 = afb.m45721a((Context) activity, configuration.screenWidthDp);
        DisplayMetrics a3 = acl.m45514a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a3.heightPixels;
        int i2 = a3.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int round = ((int) Math.round(d + 0.5d)) * ((Integer) bym.m50299d().mo41272a(C15585bw.f43861cB)).intValue();
        if (!(m45625a(i, a + dimensionPixelSize, round) && m45625a(i2, a2, round))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m45625a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }
}
