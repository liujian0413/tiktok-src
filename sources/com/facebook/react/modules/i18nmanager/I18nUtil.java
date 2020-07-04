package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.support.p022v4.p026d.C0720f;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Locale;

public class I18nUtil {
    private static I18nUtil sharedI18nUtilInstance;

    private I18nUtil() {
    }

    public static I18nUtil getInstance() {
        if (sharedI18nUtilInstance == null) {
            sharedI18nUtilInstance = new I18nUtil();
        }
        return sharedI18nUtilInstance;
    }

    private boolean isDevicePreferredLanguageRTL() {
        if (C0720f.m3043a(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    private boolean isRTLAllowed(Context context) {
        return isPrefSet(context, "RCTI18nUtil_allowRTL", true);
    }

    private boolean isRTLForced(Context context) {
        return isPrefSet(context, "RCTI18nUtil_forceRTL", false);
    }

    public boolean doLeftAndRightSwapInRTL(Context context) {
        return isPrefSet(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public boolean isRTL(Context context) {
        if (isRTLForced(context)) {
            return true;
        }
        if (!isRTLAllowed(context) || !isDevicePreferredLanguageRTL()) {
            return false;
        }
        return true;
    }

    public void allowRTL(Context context, boolean z) {
        setPref(context, "RCTI18nUtil_allowRTL", z);
    }

    public void forceRTL(Context context, boolean z) {
        setPref(context, "RCTI18nUtil_forceRTL", z);
    }

    public void swapLeftAndRightInRTL(Context context, boolean z) {
        setPref(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }

    private boolean isPrefSet(Context context, String str, boolean z) {
        return C7285c.m22838a(context, "com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z);
    }

    private void setPref(Context context, String str, boolean z) {
        Editor edit = C7285c.m22838a(context, "com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }
}
