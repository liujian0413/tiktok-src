package com.p280ss.android.socialbase.appdownloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadDepend;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.socialbase.appdownloader.DownloadReceiver */
public class DownloadReceiver extends BroadcastReceiver {
    private static final String TAG = "DownloadReceiver";

    private void autoRefreshUnsuccessDownloadTask(Context context, String str) {
        try {
            Intent intent = new Intent(context, DownloadHandlerService.class);
            intent.setAction(str);
            context.startService(intent);
        } catch (Throwable unused) {
        }
    }

    public void onReceive(final Context context, final Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                IAppDownloadDepend iAppDownloadDepend = AppDownloader.getInstance().appDownloadDepend;
                if (action.equals("android.intent.action.BOOT_COMPLETED") && (iAppDownloadDepend == null || iAppDownloadDepend.getAllowBootReceiver())) {
                    autoRefreshUnsuccessDownloadTask(context, action);
                } else if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
                    autoRefreshUnsuccessDownloadTask(context, action);
                } else {
                    if (action.equals("android.intent.action.PACKAGE_ADDED") || action.equals("android.intent.action.PACKAGE_REPLACED")) {
                        C20269b.m66749h().execute(new Runnable() {
                            public final void run() {
                                Uri data = intent.getData();
                                if (data != null) {
                                    String schemeSpecificPart = data.getSchemeSpecificPart();
                                    IAppDownloadEventHandler iAppDownloadEventHandler = AppDownloader.getInstance().appDownloadEventHandler;
                                    if (iAppDownloadEventHandler != null) {
                                        iAppDownloadEventHandler.handleAppInstalled(context, schemeSpecificPart);
                                    }
                                    List successedDownloadInfosWithMimeType = Downloader.getInstance(context).getSuccessedDownloadInfosWithMimeType("application/vnd.android.package-archive");
                                    if (successedDownloadInfosWithMimeType != null) {
                                        Iterator it = successedDownloadInfosWithMimeType.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            DownloadInfo downloadInfo = (DownloadInfo) it.next();
                                            if (downloadInfo != null && AppDownloadUtils.isPackageNameValid(downloadInfo, schemeSpecificPart)) {
                                                C20254v downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(downloadInfo.getId());
                                                if (downloadNotificationEventListener != null && C20359e.m67599e(downloadNotificationEventListener.mo53942a())) {
                                                    downloadNotificationEventListener.mo53943a(9, downloadInfo, schemeSpecificPart, "");
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
