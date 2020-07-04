package com.p280ss.android.socialbase.appdownloader.depend;

import android.content.Context;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.appdownloader.depend.AbsAppDownloadEventHandler */
public class AbsAppDownloadEventHandler implements IAppDownloadEventHandler {
    public void handleAppInstallError(int i, int i2, String str, String str2, String str3) {
    }

    public void handleAppInstalled(Context context, String str) {
    }

    public void handleDownloadCancel(DownloadInfo downloadInfo) {
    }

    public void handleDownloadEvent(int i, int i2, String str, int i3, long j) {
    }

    public boolean installIntercept(int i, boolean z) {
        return false;
    }

    public boolean isForbidInvalidatePackageInstall() {
        return false;
    }
}
