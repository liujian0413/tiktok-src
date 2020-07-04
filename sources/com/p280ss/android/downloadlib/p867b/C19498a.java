package com.p280ss.android.downloadlib.p867b;

import com.p280ss.android.downloadlib.C19444a;
import com.p280ss.android.downloadlib.addownload.C19490i;
import com.p280ss.android.downloadlib.addownload.C19495l;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadLaunchResumeListener;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* renamed from: com.ss.android.downloadlib.b.a */
public final class C19498a implements IAppDownloadLaunchResumeListener {
    public final void onLaunchResume(List<DownloadInfo> list) {
    }

    public final void onResumeDownload(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null && C19495l.m64243a(downloadInfo.getId()).mo51596a("report_download_uncompleted_event", 0) != 0) {
            long a = C19490i.m64191a(downloadInfo);
            if (a > 0) {
                C19444a.m63957a();
                C19444a.m63960a(a, downloadInfo, downloadInfo.getRealStatus(), z);
            }
        }
    }
}
