package android.support.p029v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p029v7.appcompat.R$styleable;
import android.view.ViewConfiguration;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.view.a */
public final class C1152a {

    /* renamed from: a */
    private Context f4150a;

    /* renamed from: c */
    public final int mo4572c() {
        return this.f4150a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public final boolean mo4573d() {
        return this.f4150a.getResources().getBoolean(R.bool.a);
    }

    /* renamed from: f */
    public final boolean mo4575f() {
        if (this.f4150a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int mo4576g() {
        return this.f4150a.getResources().getDimensionPixelSize(R.dimen.n);
    }

    /* renamed from: b */
    public final boolean mo4571b() {
        if (VERSION.SDK_INT < 19 && ViewConfiguration.get(this.f4150a).hasPermanentMenuKey()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo4570a() {
        Configuration configuration = this.f4150a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    /* renamed from: e */
    public final int mo4574e() {
        TypedArray obtainStyledAttributes = this.f4150a.obtainStyledAttributes(null, R$styleable.ActionBar, R.attr.h, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = this.f4150a.getResources();
        if (!mo4573d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.m));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    private C1152a(Context context) {
        this.f4150a = context;
    }

    /* renamed from: a */
    public static C1152a m5114a(Context context) {
        return new C1152a(context);
    }
}
