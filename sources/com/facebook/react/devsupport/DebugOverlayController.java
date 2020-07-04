package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.ReactContext;

class DebugOverlayController {
    private FrameLayout mFPSDebugViewContainer;
    private final ReactContext mReactContext;
    private final WindowManager mWindowManager;

    public DebugOverlayController(ReactContext reactContext) {
        this.mReactContext = reactContext;
        this.mWindowManager = (WindowManager) reactContext.getSystemService("window");
    }

    private static boolean permissionCheck(Context context) {
        if (VERSION.SDK_INT < 23) {
            return hasPermission(context, "android.permission.SYSTEM_ALERT_WINDOW");
        }
        if (!Settings.canDrawOverlays(context)) {
            return false;
        }
        return true;
    }

    public static void requestPermission(Context context) {
        if (VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(context)) {
            StringBuilder sb = new StringBuilder("package:");
            sb.append(context.getPackageName());
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(sb.toString()));
            intent.setFlags(268435456);
            C13286a.m38860c("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
            if (canHandleIntent(context, intent)) {
                context.startActivity(intent);
            }
        }
    }

    public void setFpsDebugViewVisible(boolean z) {
        if (!z || this.mFPSDebugViewContainer != null) {
            if (!z && this.mFPSDebugViewContainer != null) {
                this.mFPSDebugViewContainer.removeAllViews();
                this.mWindowManager.removeView(this.mFPSDebugViewContainer);
                this.mFPSDebugViewContainer = null;
            }
        } else if (!permissionCheck(this.mReactContext)) {
            C13286a.m38842a("ReactNative", "Wait for overlay permission to be set");
        } else {
            this.mFPSDebugViewContainer = new FpsView(this.mReactContext);
            LayoutParams layoutParams = new LayoutParams(-1, -1, WindowOverlayCompat.TYPE_SYSTEM_OVERLAY, 24, -3);
            this.mWindowManager.addView(this.mFPSDebugViewContainer, layoutParams);
        }
    }

    private static boolean canHandleIntent(Context context, Intent intent) {
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return true;
        }
        return false;
    }

    private static boolean hasPermission(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions != null) {
                for (String equals : packageInfo.requestedPermissions) {
                    if (equals.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (NameNotFoundException e) {
            C13286a.m38861c("ReactNative", "Error while retrieving package info", (Throwable) e);
        }
        return false;
    }
}
