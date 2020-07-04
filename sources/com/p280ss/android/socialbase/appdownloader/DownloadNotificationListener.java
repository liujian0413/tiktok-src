package com.p280ss.android.socialbase.appdownloader;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.p280ss.android.socialbase.downloader.depend.C20213c;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.notification.C20353a;
import com.p280ss.android.socialbase.downloader.utils.C20356b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.File;

/* renamed from: com.ss.android.socialbase.appdownloader.DownloadNotificationListener */
public class DownloadNotificationListener extends C20213c {
    public Context context;
    private String extra;

    /* renamed from: id */
    private int f54551id;
    private C20353a notificationItem;
    private String targetFileName;
    private String targetSavePath;
    private String title;

    public C20353a createNotificationItem() {
        if (this.notificationItem != null || this.context == null) {
            return this.notificationItem;
        }
        C20158a aVar = new C20158a(this.context, this.f54551id, this.title, this.targetSavePath, this.targetFileName, this.extra);
        return aVar;
    }

    public DownloadNotificationListener(C20353a aVar) {
        this.context = C20269b.m66765x();
        this.notificationItem = aVar;
    }

    public void onPause(DownloadInfo downloadInfo) {
        if (downloadInfo != null && !AppDownloadUtils.isAutoInstallWithoutNotification(downloadInfo.getExtra())) {
            super.onPause(downloadInfo);
        }
    }

    public void onPrepare(DownloadInfo downloadInfo) {
        if (downloadInfo != null && !AppDownloadUtils.isAutoInstallWithoutNotification(downloadInfo.getExtra())) {
            super.onPrepare(downloadInfo);
        }
    }

    public void onProgress(DownloadInfo downloadInfo) {
        if (downloadInfo != null && !AppDownloadUtils.isAutoInstallWithoutNotification(downloadInfo.getExtra())) {
            super.onProgress(downloadInfo);
        }
    }

    public void onStart(DownloadInfo downloadInfo) {
        if (downloadInfo != null && !AppDownloadUtils.isAutoInstallWithoutNotification(downloadInfo.getExtra())) {
            super.onStart(downloadInfo);
        }
    }

    public void onSuccessed(final DownloadInfo downloadInfo) {
        final int i;
        if (downloadInfo != null && this.context != null) {
            if (downloadInfo.canShowNotification() && !AppDownloadUtils.isAutoInstallWithoutNotification(downloadInfo.getExtra())) {
                super.onSuccessed(downloadInfo);
            }
            boolean z = true;
            if ((downloadInfo.isAutoResumed() && !downloadInfo.isShowNotificationForNetworkResumed()) || AppDownloadUtils.canNotAutoInstall(downloadInfo.getExtra()) || TextUtils.isEmpty(downloadInfo.getMimeType()) || !downloadInfo.getMimeType().equals("application/vnd.android.package-archive")) {
                if (C20356b.m67535a(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH)) {
                    z = false;
                } else {
                    return;
                }
            }
            if (z) {
                i = AppDownloadUtils.startViewIntent(this.context, downloadInfo.getId(), false);
            } else {
                i = 2;
            }
            C20269b.m66749h().execute(new Runnable() {
                public final void run() {
                    IAppDownloadEventHandler iAppDownloadEventHandler = AppDownloader.getInstance().appDownloadEventHandler;
                    C20254v downloadNotificationEventListener = Downloader.getInstance(DownloadNotificationListener.this.context).getDownloadNotificationEventListener(downloadInfo.getId());
                    if (!(iAppDownloadEventHandler == null && downloadNotificationEventListener == null)) {
                        File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                        if (file.exists()) {
                            try {
                                PackageInfo packageArchiveInfo = DownloadNotificationListener.this.context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), AppDownloadUtils.getPackageInfoFlag());
                                if (packageArchiveInfo != null) {
                                    String str = packageArchiveInfo.packageName;
                                    if (i != 1 && !TextUtils.isEmpty(downloadInfo.getPackageName())) {
                                        str = downloadInfo.getPackageName();
                                    }
                                    String str2 = str;
                                    if (iAppDownloadEventHandler != null) {
                                        iAppDownloadEventHandler.handleDownloadEvent(downloadInfo.getId(), 1, str2, -3, downloadInfo.getDownloadTime());
                                    }
                                    if (downloadNotificationEventListener != null) {
                                        downloadNotificationEventListener.mo53943a(1, downloadInfo, str2, "");
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            });
        }
    }

    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        if (downloadInfo != null && this.context != null && downloadInfo.canShowNotification() && !AppDownloadUtils.isAutoInstallWithoutNotification(downloadInfo.getExtra())) {
            super.onFailed(downloadInfo, baseException);
        }
    }

    public DownloadNotificationListener(Context context2, DownloadInfo downloadInfo) {
        if (context2 != null) {
            this.context = context2.getApplicationContext();
        } else {
            this.context = C20269b.m66765x();
        }
        if (downloadInfo != null) {
            this.f54551id = downloadInfo.getId();
            this.title = downloadInfo.getTitle();
            this.targetSavePath = downloadInfo.getSavePath();
            this.targetFileName = downloadInfo.getName();
            this.extra = downloadInfo.getExtra();
        }
    }

    public DownloadNotificationListener(Context context2, int i, String str, String str2, String str3, String str4) {
        if (context2 != null) {
            this.context = context2.getApplicationContext();
        } else {
            this.context = C20269b.m66765x();
        }
        this.f54551id = i;
        this.title = str;
        this.targetSavePath = str2;
        this.targetFileName = str3;
        this.extra = str4;
    }
}
