package com.p280ss.android.socialbase.appdownloader.depend;

import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: com.ss.android.socialbase.appdownloader.depend.IAppDownloadMonitorListener */
public interface IAppDownloadMonitorListener {
    void onAppDownloadMonitorSend(DownloadInfo downloadInfo, BaseException baseException, int i);
}
