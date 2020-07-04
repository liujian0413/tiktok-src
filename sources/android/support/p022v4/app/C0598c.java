package android.support.p022v4.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.util.C0902i;
import android.util.Pair;
import android.view.View;

/* renamed from: android.support.v4.app.c */
public class C0598c {

    /* renamed from: android.support.v4.app.c$a */
    static class C0599a extends C0598c {

        /* renamed from: a */
        private final ActivityOptions f2358a;

        /* renamed from: a */
        public final Bundle mo2580a() {
            return this.f2358a.toBundle();
        }

        C0599a(ActivityOptions activityOptions) {
            this.f2358a = activityOptions;
        }
    }

    protected C0598c() {
    }

    /* renamed from: a */
    public Bundle mo2580a() {
        return null;
    }

    /* renamed from: a */
    public static C0598c m2484a(Activity activity, C0902i<View, String>... iVarArr) {
        if (VERSION.SDK_INT >= 21) {
            return new C0599a(ActivityOptions.makeSceneTransitionAnimation(activity, new Pair[0]));
        }
        return new C0598c();
    }

    /* renamed from: a */
    public static C0598c m2483a(Activity activity, View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            return new C0599a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
        }
        return new C0598c();
    }

    /* renamed from: a */
    public static C0598c m2485a(Context context, int i, int i2) {
        if (VERSION.SDK_INT >= 16) {
            return new C0599a(ActivityOptions.makeCustomAnimation(context, i, i2));
        }
        return new C0598c();
    }

    /* renamed from: b */
    public static C0598c m2487b(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 23) {
            return new C0599a(ActivityOptions.makeClipRevealAnimation(view, 0, 0, i3, i4));
        }
        return new C0598c();
    }

    /* renamed from: a */
    public static C0598c m2486a(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 16) {
            return new C0599a(ActivityOptions.makeScaleUpAnimation(view, i, i2, 0, 0));
        }
        return new C0598c();
    }
}
