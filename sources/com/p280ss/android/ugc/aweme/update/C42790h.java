package com.p280ss.android.ugc.aweme.update;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.socialbase.appdownloader.AppDownloadUtils;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.update.h */
public final class C42790h {

    /* renamed from: a */
    private static C42790h f111210a = new C42790h();

    private C42790h() {
    }

    /* renamed from: b */
    static void m135814b(Context context, String str) {
        DownloadInfo appDownloadInfo = AppDownloader.getInstance().getAppDownloadInfo(context, str);
        if (appDownloadInfo != null && appDownloadInfo.getStatus() == -3) {
            AppDownloader.startInstall(context, appDownloadInfo.getId());
        }
    }

    /* renamed from: a */
    static boolean m135813a(Context context, String str) {
        DownloadInfo appDownloadInfo = AppDownloader.getInstance().getAppDownloadInfo(context, str);
        if (appDownloadInfo == null || TextUtils.isEmpty(appDownloadInfo.getSavePath()) || TextUtils.isEmpty(appDownloadInfo.getName()) || AppDownloadUtils.isApkInstalled(context, appDownloadInfo.getSavePath(), appDownloadInfo.getName())) {
            return false;
        }
        File file = new File(appDownloadInfo.getSavePath(), appDownloadInfo.getName());
        if (appDownloadInfo.getStatus() != -3 || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static int m135812a(String str, String str2, Context context, boolean z, boolean z2, boolean z3, IDownloadListener iDownloadListener) {
        return AppDownloader.getInstance().addDownloadTask(new AppTaskBuilder(context, str).name(str2).showNotification(true).needWifi(false).mainThreadListener(iDownloadListener));
    }
}
