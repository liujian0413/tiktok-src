package com.gyf.barlibrary;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;

class BarConfig {
    private final int mActionBarHeight;
    private final boolean mHasNavigationBar;
    private final boolean mHasNotchScreen;
    private final boolean mInPortrait;
    private final int mNavigationBarHeight;
    private final int mNavigationBarWidth;
    private final float mSmallestWidthDp;
    private final int mStatusBarHeight;

    /* access modifiers changed from: 0000 */
    public int getActionBarHeight() {
        return this.mActionBarHeight;
    }

    /* access modifiers changed from: 0000 */
    public int getNavigationBarHeight() {
        return this.mNavigationBarHeight;
    }

    /* access modifiers changed from: 0000 */
    public int getNavigationBarWidth() {
        return this.mNavigationBarWidth;
    }

    /* access modifiers changed from: 0000 */
    public int getStatusBarHeight() {
        return this.mStatusBarHeight;
    }

    /* access modifiers changed from: 0000 */
    public boolean hasNavigationBar() {
        return this.mHasNavigationBar;
    }

    /* access modifiers changed from: 0000 */
    public boolean hasNotchScreen() {
        return this.mHasNotchScreen;
    }

    /* access modifiers changed from: 0000 */
    public boolean isNavigationAtBottom() {
        if (this.mSmallestWidthDp >= 600.0f || this.mInPortrait) {
            return true;
        }
        return false;
    }

    private int getNavigationBarHeight(Context context) {
        String str;
        if (VERSION.SDK_INT < 14 || !hasNavBar((Activity) context)) {
            return 0;
        }
        if (this.mInPortrait) {
            str = "navigation_bar_height";
        } else {
            str = "navigation_bar_height_landscape";
        }
        return getInternalDimensionSize(context, str);
    }

    private int getNavigationBarWidth(Context context) {
        if (VERSION.SDK_INT < 14 || !hasNavBar((Activity) context)) {
            return 0;
        }
        return getInternalDimensionSize(context, "navigation_bar_width");
    }

    private int getActionBarHeight(Context context) {
        if (VERSION.SDK_INT < 14) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843499, typedValue, true);
        return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    private float getSmallestWidthDp(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (VERSION.SDK_INT >= 16) {
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        return Math.min(((float) displayMetrics.widthPixels) / displayMetrics.density, ((float) displayMetrics.heightPixels) / displayMetrics.density);
    }

    BarConfig(Activity activity) {
        boolean z;
        boolean z2 = false;
        if (activity.getResources().getConfiguration().orientation == 1) {
            z = true;
        } else {
            z = false;
        }
        this.mInPortrait = z;
        this.mSmallestWidthDp = getSmallestWidthDp(activity);
        this.mStatusBarHeight = getInternalDimensionSize(activity, "status_bar_height");
        this.mActionBarHeight = getActionBarHeight(activity);
        this.mNavigationBarHeight = getNavigationBarHeight(activity);
        this.mNavigationBarWidth = getNavigationBarWidth(activity);
        if (this.mNavigationBarHeight > 0) {
            z2 = true;
        }
        this.mHasNavigationBar = z2;
        this.mHasNotchScreen = NotchUtils.hasNotchScreen(activity);
    }

    private boolean hasNavBar(Activity activity) {
        if (VERSION.SDK_INT >= 17 && Global.getInt(activity.getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
            return false;
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        }
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i3 = displayMetrics2.heightPixels;
        if (i2 - displayMetrics2.widthPixels > 0 || i - i3 > 0) {
            return true;
        }
        return false;
    }

    private int getInternalDimensionSize(Context context, String str) {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
            int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
            if (dimensionPixelSize2 >= dimensionPixelSize) {
                return dimensionPixelSize2;
            }
            return Math.round((((float) dimensionPixelSize) * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density);
        } catch (NotFoundException unused) {
            return 0;
        }
    }
}
