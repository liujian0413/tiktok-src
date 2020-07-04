package com.p280ss.android.socialbase.downloader.downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p280ss.android.socialbase.downloader.notification.DownloadNotificationService;

/* renamed from: com.ss.android.socialbase.downloader.downloader.DownloadReceiver */
public class DownloadReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f54708a = "DownloadReceiver";

    /* renamed from: a */
    private static void m66693a(Context context, String str) {
        try {
            Intent intent = new Intent(context, DownloadNotificationService.class);
            intent.setAction(str);
            context.startService(intent);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private static void m66694b(Context context, String str) {
        try {
            Intent intent = new Intent(context, DownloadNotificationService.class);
            intent.setAction(str);
            context.startService(intent);
        } catch (Throwable unused) {
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    m66693a(context, action);
                    return;
                }
                if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                    m66694b(context, action);
                }
            }
        }
    }
}
