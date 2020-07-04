package com.ttnet.org.chromium.base.compat;

import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.view.Display;
import android.view.View;

public final class ApiHelperForO {
    private ApiHelperForO() {
    }

    public static boolean isInstantApp(PackageManager packageManager) {
        return packageManager.isInstantApp();
    }

    public static boolean isScreenWideColorGamut(Configuration configuration) {
        return configuration.isScreenWideColorGamut();
    }

    public static boolean isWideColorGamut(Display display) {
        return display.isWideColorGamut();
    }

    public static void setDefaultFocusHighlightEnabled(View view, boolean z) {
        view.setDefaultFocusHighlightEnabled(z);
    }
}
