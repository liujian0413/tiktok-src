package com.p280ss.android.socialbase.appdownloader.depend;

import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* renamed from: com.ss.android.socialbase.appdownloader.depend.IAppDownloadLaunchResumeListener */
public interface IAppDownloadLaunchResumeListener {
    void onLaunchResume(List<DownloadInfo> list);

    void onResumeDownload(DownloadInfo downloadInfo, boolean z);
}
