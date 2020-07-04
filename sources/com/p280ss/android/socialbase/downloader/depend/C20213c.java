package com.p280ss.android.socialbase.downloader.depend;

import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.notification.C20353a;
import com.p280ss.android.socialbase.downloader.notification.C20354b;

/* renamed from: com.ss.android.socialbase.downloader.depend.c */
public abstract class C20213c extends AbsDownloadListener {
    /* access modifiers changed from: protected */
    public abstract C20353a createNotificationItem();

    public void onProgress(DownloadInfo downloadInfo) {
        super.onProgress(downloadInfo);
        updateNotificationProgress(downloadInfo);
    }

    public void onPause(DownloadInfo downloadInfo) {
        super.onPause(downloadInfo);
        updateNotification(-2, downloadInfo, null, false);
    }

    public void onPrepare(DownloadInfo downloadInfo) {
        super.onPrepare(downloadInfo);
        addNotificationItem(downloadInfo);
        updateNotification(1, downloadInfo, null, true);
    }

    public void onStart(DownloadInfo downloadInfo) {
        super.onStart(downloadInfo);
        updateNotification(2, downloadInfo, null, false);
    }

    public void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        updateNotification(-3, downloadInfo, null, false);
    }

    private void addNotificationItem(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.canShowNotification()) {
            C20353a b = C20354b.m67519a().mo54921b(downloadInfo.getId());
            if (b == null) {
                C20354b.m67519a().mo54919a(createNotificationItem());
                return;
            }
            b.mo54004a(downloadInfo);
        }
    }

    private void updateNotificationProgress(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.canShowNotification() && downloadInfo.getStatus() == 4) {
            C20353a b = C20354b.m67519a().mo54921b(downloadInfo.getId());
            if (b == null) {
                b = createNotificationItem();
            }
            b.mo54916a(downloadInfo.getCurBytes(), downloadInfo.getTotalBytes());
        }
    }

    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        updateNotification(-1, downloadInfo, baseException, false);
    }

    private void updateNotification(int i, DownloadInfo downloadInfo, BaseException baseException, boolean z) {
        if (downloadInfo != null && downloadInfo.canShowNotification() && i != 4) {
            C20353a b = C20354b.m67519a().mo54921b(downloadInfo.getId());
            if (b == null) {
                b = createNotificationItem();
            }
            b.f55020c = downloadInfo.getTotalBytes();
            if (i == -3) {
                b.f55019b = downloadInfo.getTotalBytes();
            } else {
                b.f55019b = downloadInfo.getCurBytes();
            }
            b.mo54915a(i, baseException, z);
        }
    }
}
