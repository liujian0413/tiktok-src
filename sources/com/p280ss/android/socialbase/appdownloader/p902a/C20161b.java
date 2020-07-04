package com.p280ss.android.socialbase.appdownloader.p902a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p280ss.android.socialbase.appdownloader.AppDownloadUtils;
import com.p280ss.android.socialbase.appdownloader.AppDownloader;
import com.p280ss.android.socialbase.appdownloader.AppTaskBuilder;
import com.p280ss.android.socialbase.appdownloader.C20158a;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadLaunchResumeListener;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20287l;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.impls.C20327r;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.notification.C20353a;
import com.p280ss.android.socialbase.downloader.notification.C20354b;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.socialbase.appdownloader.a.b */
public final class C20161b implements C20287l {

    /* renamed from: a */
    public List<Integer> f54565a;

    /* renamed from: b */
    public BroadcastReceiver f54566b;

    /* renamed from: a */
    public final List<String> mo54005a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("application/vnd.android.package-archive");
        return arrayList;
    }

    /* renamed from: a */
    public final void mo54007a(final List<DownloadInfo> list) {
        if (C20359e.m67593d()) {
            C20269b.m66749h().execute(new Runnable() {
                public final void run() {
                    try {
                        C20161b.this.mo54008b(list);
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            mo54008b(list);
        }
    }

    /* renamed from: b */
    public final void mo54008b(List<DownloadInfo> list) {
        if (list != null && !list.isEmpty()) {
            IAppDownloadLaunchResumeListener iAppDownloadLaunchResumeListener = AppDownloader.getInstance().appDownloadLaunchResumeListener;
            if (iAppDownloadLaunchResumeListener != null) {
                iAppDownloadLaunchResumeListener.onLaunchResume(list);
            }
            Context x = C20269b.m66765x();
            if (x != null) {
                boolean a = C20359e.m67562a(x);
                for (DownloadInfo a2 : list) {
                    mo54006a(x, a2, a);
                }
                if (this.f54565a != null && !this.f54565a.isEmpty() && this.f54566b == null) {
                    this.f54566b = new BroadcastReceiver() {
                        public final void onReceive(Context context, Intent intent) {
                            final Context applicationContext = context.getApplicationContext();
                            if (C20359e.m67562a(applicationContext)) {
                                C20269b.m66749h().execute(new Runnable() {
                                    public final void run() {
                                        try {
                                            if (C20161b.this.f54565a != null) {
                                                if (!C20161b.this.f54565a.isEmpty()) {
                                                    Integer[] numArr = new Integer[C20161b.this.f54565a.size()];
                                                    C20161b.this.f54565a.toArray(numArr);
                                                    C20161b.this.f54565a.clear();
                                                    for (Integer intValue : numArr) {
                                                        DownloadInfo downloadInfo = Downloader.getInstance(applicationContext).getDownloadInfo(intValue.intValue());
                                                        if (downloadInfo != null && downloadInfo.getRealStatus() == -5) {
                                                            C20161b.this.mo54006a(applicationContext, downloadInfo, true);
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
                                });
                                try {
                                    applicationContext.unregisterReceiver(C20161b.this.f54566b);
                                } catch (Throwable unused) {
                                }
                                C20161b.this.f54566b = null;
                            }
                        }
                    };
                    try {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        x.registerReceiver(this.f54566b, intentFilter);
                    } catch (Throwable unused) {
                        this.f54566b = null;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m66420a(DownloadInfo downloadInfo, boolean z) {
        boolean z2;
        AppTaskBuilder showNotification = new AppTaskBuilder(C20269b.m66765x(), downloadInfo.getUrl()).name(downloadInfo.getTitle()).saveName(downloadInfo.getName()).savePath(downloadInfo.getSavePath()).showNotification(downloadInfo.isShowNotification());
        if (downloadInfo.isOnlyWifi() || downloadInfo.isFailedResumeNeedWifi()) {
            z2 = true;
        } else {
            z2 = false;
        }
        AppDownloader.getInstance().addDownloadTask(showNotification.needWifi(z2).extra(downloadInfo.getExtra()).mimeType(downloadInfo.getMimeType()).headers(downloadInfo.getExtraHeaders()).autoResumed(true).retryCount(downloadInfo.getRetryCount()).backUpUrlRetryCount(downloadInfo.getBackUpUrlRetryCount()).backUpUrls(downloadInfo.getBackUpUrls()).minProgressTimeMsInterval(downloadInfo.getMinProgressTimeMsInterval()).maxProgressCount(downloadInfo.getMaxProgressCount()).showNotificationForAutoResumed(z).needHttpsToHttpRetry(downloadInfo.isNeedHttpsToHttpRetry()).packageName(downloadInfo.getPackageName()).md5(downloadInfo.getMd5()).needDefaultHttpServiceBackUp(downloadInfo.isNeedDefaultHttpServiceBackUp()).needReuseFirstConnection(downloadInfo.isNeedReuseFirstConnection()).needIndependentProcess(downloadInfo.isNeedIndependentProcess()).enqueueType(downloadInfo.getEnqueueType()).force(downloadInfo.isForce()).headConnectionAvailable(downloadInfo.isHeadConnectionAvailable()).needRetryDelay(downloadInfo.isNeedRetryDelay()).retryDelayTimeArray(downloadInfo.getRetryDelayTimeArray()).retryScheduleMinutes(downloadInfo.getRetryScheduleMinutes()));
    }

    /* renamed from: a */
    public final void mo54006a(Context context, DownloadInfo downloadInfo, boolean z) {
        boolean z2;
        long j;
        C20158a aVar;
        boolean z3;
        DownloadInfo downloadInfo2 = downloadInfo;
        if (downloadInfo2 != null && downloadInfo.isShowNotification()) {
            int realStatus = downloadInfo.getRealStatus();
            boolean z4 = false;
            if (realStatus != -5 || downloadInfo.isDownloaded()) {
                if (realStatus == -3 && downloadInfo.isDownloaded()) {
                    if (!AppDownloadUtils.isApkInstalled(context, downloadInfo.getSavePath(), downloadInfo.getName())) {
                        long uninstallResumeMinInterval = downloadInfo.getUninstallResumeMinInterval();
                        if (uninstallResumeMinInterval < 0) {
                            uninstallResumeMinInterval = AppDownloader.getInstance().minResumeUnInstallIntervalTime;
                        }
                        int uninstallResumeMaxCount = downloadInfo.getUninstallResumeMaxCount();
                        if (uninstallResumeMaxCount < 0) {
                            uninstallResumeMaxCount = AppDownloader.getInstance().maxUnInstallNotificationShowCount;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - downloadInfo.getLastDownloadTime() >= downloadInfo.getUninstallResumeMaxTimeInterval() || currentTimeMillis - downloadInfo.getLastUninstallResumeTime() <= uninstallResumeMinInterval || downloadInfo.getUninstallResumeCount() >= uninstallResumeMaxCount) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            C20353a b = C20354b.m67519a().mo54921b(downloadInfo.getId());
                            if (b == 0) {
                                j = currentTimeMillis;
                                C20158a aVar2 = new C20158a(context, downloadInfo.getId(), downloadInfo.getTitle(), downloadInfo.getSavePath(), downloadInfo.getName(), downloadInfo.getExtra());
                                C20354b.m67519a().mo54919a((C20353a) aVar2);
                                aVar = aVar2;
                            } else {
                                j = currentTimeMillis;
                                b.mo54004a(downloadInfo2);
                                aVar = b;
                            }
                            aVar.f55020c = downloadInfo.getTotalBytes();
                            aVar.f55019b = downloadInfo.getTotalBytes();
                            aVar.mo54915a(downloadInfo.getStatus(), null, false);
                            downloadInfo2.setLastUninstallResumeTime(j);
                            downloadInfo2.setUninstallResumeCount(downloadInfo.getUninstallResumeCount() + 1);
                            downloadInfo.updateSpData();
                        }
                    }
                }
                return;
            }
            long failedResumeMinInterval = downloadInfo.getFailedResumeMinInterval();
            if (failedResumeMinInterval < 0) {
                failedResumeMinInterval = AppDownloader.getInstance().minResumeFailedIntervalTime;
            }
            int failedResumeMaxCount = downloadInfo.getFailedResumeMaxCount();
            if (failedResumeMaxCount < 0) {
                failedResumeMaxCount = AppDownloader.getInstance().maxFailedNotificationShowCount;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 - downloadInfo.getLastDownloadTime() >= downloadInfo.getFailedResumeMaxInterval() || currentTimeMillis2 - downloadInfo.getLastFailedResumeTime() <= failedResumeMinInterval || downloadInfo.getFailedResumeCount() >= failedResumeMaxCount) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                if (z || !downloadInfo.isFailedResumeNeedWifi() || !downloadInfo.isFailedResumeNeedWaitWifi()) {
                    m66420a(downloadInfo2, z3);
                    downloadInfo2.setLastFailedResumeTime(currentTimeMillis2);
                    downloadInfo2.setFailedResumeCount(downloadInfo.getFailedResumeCount() + 1);
                    downloadInfo.updateSpData();
                    z4 = true;
                } else {
                    if (this.f54565a == null) {
                        this.f54565a = new ArrayList();
                    }
                    int id = downloadInfo.getId();
                    if (!this.f54565a.contains(Integer.valueOf(id))) {
                        this.f54565a.add(Integer.valueOf(id));
                    }
                    C20327r.m67371a().mo54529a(downloadInfo2, true);
                }
            }
            StringBuilder sb = new StringBuilder("launchResume, name = ");
            sb.append(downloadInfo.getTitle());
            sb.append(", canShowNotification = ");
            sb.append(z3);
            sb.append(", downloadResumed = ");
            sb.append(z4);
            C20190a.m66500a("DefaultDownloadLaunchHandler", sb.toString());
            IAppDownloadLaunchResumeListener iAppDownloadLaunchResumeListener = AppDownloader.getInstance().appDownloadLaunchResumeListener;
            if (iAppDownloadLaunchResumeListener != null) {
                iAppDownloadLaunchResumeListener.onResumeDownload(downloadInfo2, z4);
            }
        }
    }
}
