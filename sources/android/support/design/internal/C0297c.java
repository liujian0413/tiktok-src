package android.support.design.internal;

import android.graphics.PorterDuff.Mode;
import android.support.p022v4.view.C0991u;
import android.view.View;

/* renamed from: android.support.design.internal.c */
public final class C0297c {
    /* renamed from: a */
    public static boolean m1178a(View view) {
        if (C0991u.m4220h(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Mode m1177a(int i, Mode mode) {
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
