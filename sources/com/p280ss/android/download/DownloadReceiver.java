package com.p280ss.android.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.ss.android.download.DownloadReceiver */
public class DownloadReceiver extends BroadcastReceiver {

    /* renamed from: a */
    C19439q f52355a;

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null && C19431j.m63889a(context)) {
            try {
                if (C19431j.m63893b()) {
                    String action = intent.getAction();
                    if (!TextUtils.isEmpty(action) && !"android.intent.action.BOOT_COMPLETED".equals(action)) {
                        if (this.f52355a == null) {
                            this.f52355a = C19435n.m63904a(context);
                        }
                        if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                            DownloadService.m63529a(context);
                        } else if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
                            DownloadService.m63529a(context);
                        } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                                DownloadService.m63529a(context);
                            }
                        } else {
                            if (action.equals("android.intent.action.PACKAGE_ADDED") || action.equals("android.intent.action.PACKAGE_REPLACED")) {
                                Uri data = intent.getData();
                                if (data != null) {
                                    data.getSchemeSpecificPart();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
