package com.p280ss.android.socialbase.appdownloader.depend;

import android.content.Context;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.appdownloader.depend.AbsAppDownloadEventListener */
public class AbsAppDownloadEventListener implements IAppDownloadEventListener {
    public String getNotifyProcessName() {
        return null;
    }

    public boolean installIntercept(boolean z) {
        return false;
    }

    public void onAppDownloadCancel(DownloadInfo downloadInfo) {
    }

    public void onAppDownloadEvent(int i, String str, int i2, long j) {
    }

    public void onAppInstallError(int i, String str, String str2, String str3) {
    }

    public void onAppInstalled(Context context, String str) {
    }
}
