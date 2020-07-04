package com.p280ss.android.socialbase.appdownloader.depend;

import android.content.Context;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventListener */
public interface IAppDownloadEventListener {
    String getNotifyProcessName();

    boolean installIntercept(boolean z);

    void onAppDownloadCancel(DownloadInfo downloadInfo);

    void onAppDownloadEvent(int i, String str, int i2, long j);

    void onAppInstallError(int i, String str, String str2, String str3);

    void onAppInstalled(Context context, String str);
}
