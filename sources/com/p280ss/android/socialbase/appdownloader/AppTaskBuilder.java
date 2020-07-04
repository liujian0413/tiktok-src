package com.p280ss.android.socialbase.appdownloader;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadEventListener;
import com.p280ss.android.socialbase.downloader.constants.EnqueueType;
import com.p280ss.android.socialbase.downloader.depend.C20240n;
import com.p280ss.android.socialbase.downloader.depend.C20241o;
import com.p280ss.android.socialbase.downloader.depend.C20259y;
import com.p280ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.p280ss.android.socialbase.downloader.downloader.C20280g;
import com.p280ss.android.socialbase.downloader.downloader.C20281h;
import com.p280ss.android.socialbase.downloader.downloader.C20292q;
import com.p280ss.android.socialbase.downloader.model.HttpHeader;
import com.p280ss.android.socialbase.downloader.notification.C20353a;
import java.util.List;

/* renamed from: com.ss.android.socialbase.appdownloader.AppTaskBuilder */
public class AppTaskBuilder {
    public Activity activity;
    public C20280g adjustCalculator;
    public IAppDownloadEventListener appDownloadEventListener;
    public boolean autoInstallWithNotification = true;
    public boolean autoInstallWithoutNotification;
    public boolean autoResumed;
    public int backUpUrlRetryCount;
    public List<String> backUpUrls;
    public C20281h chunkStrategy;
    public Context context;
    public IDownloadDepend depend;
    public C20240n diskSpaceHandler;
    public EnqueueType enqueueType = EnqueueType.ENQUEUE_NONE;
    public String extra;
    public int failedResumeMaxCount = -1;
    public long failedResumeMinInterval = -1;
    public boolean failedResumeNeedWaitWifi;
    public boolean failedResumeNeedWifi = true;
    public C20241o fileUriProvider;
    public boolean force;
    public boolean headConnectionAvailable = true;
    public List<HttpHeader> headers;
    public IDownloadListener mainThreadListener;
    public int maxProgressCount;
    public String md5;
    public String mimeType = "application/vnd.android.package-archive";
    public int minProgressTimeMsInterval = NormalGiftView.MASK_TRANSLATE_VALUE;
    public IDownloadMonitorDepend monitorDepend;
    public String name;
    public boolean needChunkDowngradeRetry;
    public boolean needDefaultHttpServiceBackUp;
    public boolean needHttpsToHttpRetry;
    public boolean needIndependentProcess;
    public boolean needNotificationPermission;
    public boolean needRetryDelay;
    public boolean needReuseChunkRunnable;
    public boolean needReuseFirstConnection;
    public boolean needWifi;
    public C20259y notificationClickCallback;
    public C20353a notificationItem;
    public IDownloadListener notificationListener;
    public String packageName;
    public int retryCount = 5;
    public String retryDelayTimeArray;
    public C20292q retryDelayTimeCalculator;
    public int retryScheduleMinutes;
    public String saveName;
    public String savePath;
    public boolean showNotification = true;
    public boolean showNotificationForAutoResumed;
    public String url;

    public AppTaskBuilder activity(Activity activity2) {
        this.activity = activity2;
        return this;
    }

    public AppTaskBuilder adjustChunkCalculator(C20280g gVar) {
        this.adjustCalculator = gVar;
        return this;
    }

    public AppTaskBuilder appDownloadEventListener(IAppDownloadEventListener iAppDownloadEventListener) {
        this.appDownloadEventListener = iAppDownloadEventListener;
        return this;
    }

    public AppTaskBuilder autoInstallWithNotification(boolean z) {
        this.autoInstallWithNotification = z;
        return this;
    }

    public AppTaskBuilder autoInstallWithoutNotification(boolean z) {
        this.autoInstallWithoutNotification = z;
        return this;
    }

    public AppTaskBuilder autoResumed(boolean z) {
        this.autoResumed = z;
        return this;
    }

    public AppTaskBuilder backUpUrlRetryCount(int i) {
        this.backUpUrlRetryCount = i;
        return this;
    }

    public AppTaskBuilder backUpUrls(List<String> list) {
        this.backUpUrls = list;
        return this;
    }

    public AppTaskBuilder chunkStrategy(C20281h hVar) {
        this.chunkStrategy = hVar;
        return this;
    }

    public AppTaskBuilder depend(IDownloadDepend iDownloadDepend) {
        this.depend = iDownloadDepend;
        return this;
    }

    public AppTaskBuilder diskSpaceHandler(C20240n nVar) {
        this.diskSpaceHandler = nVar;
        return this;
    }

    public AppTaskBuilder enqueueType(EnqueueType enqueueType2) {
        this.enqueueType = enqueueType2;
        return this;
    }

    public AppTaskBuilder extra(String str) {
        this.extra = str;
        return this;
    }

    public AppTaskBuilder failedResumeMaxCount(int i) {
        this.failedResumeMaxCount = i;
        return this;
    }

    public AppTaskBuilder failedResumeMinInterval(long j) {
        this.failedResumeMinInterval = j;
        return this;
    }

    public AppTaskBuilder failedResumeNeedWaitWifi(boolean z) {
        this.failedResumeNeedWaitWifi = z;
        return this;
    }

    public AppTaskBuilder failedResumeNeedWifi(boolean z) {
        this.failedResumeNeedWifi = z;
        return this;
    }

    public AppTaskBuilder fileUriProvider(C20241o oVar) {
        this.fileUriProvider = oVar;
        return this;
    }

    public AppTaskBuilder force(boolean z) {
        this.force = z;
        return this;
    }

    public AppTaskBuilder headConnectionAvailable(boolean z) {
        this.headConnectionAvailable = z;
        return this;
    }

    public AppTaskBuilder headers(List<HttpHeader> list) {
        this.headers = list;
        return this;
    }

    public AppTaskBuilder mainThreadListener(IDownloadListener iDownloadListener) {
        this.mainThreadListener = iDownloadListener;
        return this;
    }

    public AppTaskBuilder maxProgressCount(int i) {
        this.maxProgressCount = i;
        return this;
    }

    public AppTaskBuilder md5(String str) {
        this.md5 = str;
        return this;
    }

    public AppTaskBuilder mimeType(String str) {
        this.mimeType = str;
        return this;
    }

    public AppTaskBuilder minProgressTimeMsInterval(int i) {
        this.minProgressTimeMsInterval = i;
        return this;
    }

    public AppTaskBuilder monitorDepend(IDownloadMonitorDepend iDownloadMonitorDepend) {
        this.monitorDepend = iDownloadMonitorDepend;
        return this;
    }

    public AppTaskBuilder name(String str) {
        this.name = str;
        return this;
    }

    public AppTaskBuilder needChunkDowngradeRetry(boolean z) {
        this.needChunkDowngradeRetry = z;
        return this;
    }

    public AppTaskBuilder needDefaultHttpServiceBackUp(boolean z) {
        this.needDefaultHttpServiceBackUp = z;
        return this;
    }

    public AppTaskBuilder needHttpsToHttpRetry(boolean z) {
        this.needHttpsToHttpRetry = z;
        return this;
    }

    public AppTaskBuilder needIndependentProcess(boolean z) {
        this.needIndependentProcess = z;
        return this;
    }

    public AppTaskBuilder needNotificationPermission(boolean z) {
        this.needNotificationPermission = z;
        return this;
    }

    public AppTaskBuilder needRetryDelay(boolean z) {
        this.needRetryDelay = z;
        return this;
    }

    public AppTaskBuilder needReuseChunkRunnable(boolean z) {
        this.needReuseChunkRunnable = z;
        return this;
    }

    public AppTaskBuilder needReuseFirstConnection(boolean z) {
        this.needReuseFirstConnection = z;
        return this;
    }

    public AppTaskBuilder needWifi(boolean z) {
        this.needWifi = z;
        return this;
    }

    public AppTaskBuilder notificationClickCallback(C20259y yVar) {
        this.notificationClickCallback = yVar;
        return this;
    }

    public AppTaskBuilder notificationItem(C20353a aVar) {
        this.notificationItem = aVar;
        return this;
    }

    public AppTaskBuilder notificationListener(IDownloadListener iDownloadListener) {
        this.notificationListener = iDownloadListener;
        return this;
    }

    public AppTaskBuilder packageName(String str) {
        this.packageName = str;
        return this;
    }

    public AppTaskBuilder retryCount(int i) {
        this.retryCount = i;
        return this;
    }

    public AppTaskBuilder retryDelayTimeArray(String str) {
        this.retryDelayTimeArray = str;
        return this;
    }

    public AppTaskBuilder retryDelayTimeCalculator(C20292q qVar) {
        this.retryDelayTimeCalculator = qVar;
        return this;
    }

    public AppTaskBuilder retryScheduleMinutes(int i) {
        this.retryScheduleMinutes = i;
        return this;
    }

    public AppTaskBuilder saveName(String str) {
        this.saveName = str;
        return this;
    }

    public AppTaskBuilder savePath(String str) {
        this.savePath = str;
        return this;
    }

    public AppTaskBuilder showNotification(boolean z) {
        this.showNotification = z;
        return this;
    }

    public AppTaskBuilder showNotificationForAutoResumed(boolean z) {
        this.showNotificationForAutoResumed = z;
        return this;
    }

    public AppTaskBuilder(Context context2, String str) {
        this.context = context2.getApplicationContext();
        this.url = str;
    }
}
