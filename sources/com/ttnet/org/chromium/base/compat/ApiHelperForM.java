package com.ttnet.org.chromium.base.compat;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Process;
import android.view.ActionMode;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class ApiHelperForM {
    private ApiHelperForM() {
    }

    public static long getDefaultActionModeHideDuration() {
        return ViewConfiguration.getDefaultActionModeHideDuration();
    }

    public static boolean isProcess64Bit() {
        return Process.is64Bit();
    }

    public static void invalidateContentRectOnActionMode(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public static int getActionModeType(ActionMode actionMode) {
        return actionMode.getType();
    }

    public static Network getActiveNetwork(ConnectivityManager connectivityManager) {
        return connectivityManager.getActiveNetwork();
    }

    public static Network getBoundNetworkForProcess(ConnectivityManager connectivityManager) {
        return connectivityManager.getBoundNetworkForProcess();
    }

    public static long getNetworkHandle(Network network) {
        return network.getNetworkHandle();
    }

    public static void hideActionMode(ActionMode actionMode, long j) {
        actionMode.hide(j);
    }

    public static void onWindowFocusChangedOnActionMode(ActionMode actionMode, boolean z) {
        actionMode.onWindowFocusChanged(z);
    }

    public static NetworkInfo getNetworkInfo(ConnectivityManager connectivityManager, Network network) {
        return connectivityManager.getNetworkInfo(network);
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static boolean isPermissionRevokedByPolicy(Activity activity, String str) {
        return activity.getPackageManager().isPermissionRevokedByPolicy(str, activity.getPackageName());
    }

    public static void onPageCommitVisible(WebViewClient webViewClient, WebView webView, String str) {
        webViewClient.onPageCommitVisible(webView, str);
    }

    public static void requestActivityPermissions(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }
}
