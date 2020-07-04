package com.p280ss.android.socialbase.downloader.downloader;

import android.content.Context;
import com.p280ss.android.socialbase.downloader.constants.ListenerType;
import com.p280ss.android.socialbase.downloader.depend.C20232j;
import com.p280ss.android.socialbase.downloader.depend.C20241o;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.depend.C20255w;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.utils.C20356b;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.Downloader */
public class Downloader {
    private static volatile Downloader instance;

    private Downloader() {
    }

    public void destoryDownloader() {
        C20269b.m66723a();
    }

    public boolean isDownloadCacheSyncSuccess() {
        C20271c.m66769a();
        return C20271c.m66777e();
    }

    public boolean isHttpServiceInit() {
        C20271c.m66769a();
        return C20271c.m66776d();
    }

    public void pauseAll() {
        C20271c.m66769a();
        C20271c.m66775c();
    }

    public void setDownloadInMultiProcess() {
        if (C20356b.m67535a(4194304)) {
            synchronized (this) {
                C20269b.m66739b();
            }
            return;
        }
        C20269b.m66739b();
    }

    Downloader(C20279f fVar) {
        C20269b.m66730a(fVar);
    }

    public void cancel(int i) {
        C20271c.m66769a().mo54303e(i);
    }

    public void clearDownloadData(int i) {
        C20271c.m66769a().mo54313o(i);
    }

    public void forceDownloadIngoreRecommendSize(int i) {
        C20271c.m66769a().mo54314p(i);
    }

    public void pause(int i) {
        C20271c.m66769a().mo54302d(i);
    }

    public void registerDownloadCacheSyncListener(C20232j jVar) {
        C20271c.m66769a();
        C20271c.m66771a(jVar);
    }

    public void registerDownloaderProcessConnectedListener(C20255w wVar) {
        C20271c.m66769a().mo54289a(wVar);
    }

    public void restart(int i) {
        C20271c.m66769a().mo54306h(i);
    }

    public void restartAllFailedDownloadTasks(List<String> list) {
        C20271c.m66769a();
        C20271c.m66772a(list);
    }

    public void resume(int i) {
        C20271c.m66769a().mo54305g(i);
    }

    public void setLogLevel(int i) {
        C20271c.m66769a();
        C20271c.m66778r(i);
    }

    public void unRegisterDownloadCacheSyncListener(C20232j jVar) {
        C20271c.m66769a();
        C20271c.m66774b(jVar);
    }

    public void unRegisterDownloaderProcessConnectedListener(C20255w wVar) {
        C20271c.m66769a().mo54298b(wVar);
    }

    public static DownloadTask with(Context context) {
        getInstance(context);
        return new DownloadTask();
    }

    public boolean canResume(int i) {
        return C20271c.m66769a().mo54304f(i);
    }

    public long getCurBytes(int i) {
        return C20271c.m66769a().mo54307i(i);
    }

    public C20241o getDownloadFileUriProvider(int i) {
        return C20271c.m66769a().mo54317t(i);
    }

    public DownloadInfo getDownloadInfo(int i) {
        return C20271c.m66769a().mo54310l(i);
    }

    public C20254v getDownloadNotificationEventListener(int i) {
        return C20271c.m66769a().mo54311m(i);
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        return C20271c.m66769a().mo54301d(str);
    }

    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) {
        return C20271c.m66769a().mo54285a(str);
    }

    public int getStatus(int i) {
        return C20271c.m66769a().mo54308j(i);
    }

    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return C20271c.m66769a().mo54294b(str);
    }

    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return C20271c.m66769a().mo54300c(str);
    }

    public boolean isDownloadServiceForeground(int i) {
        return C20271c.m66769a().mo54299c(i).mo54429b();
    }

    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        return C20271c.m66769a().mo54291a(downloadInfo);
    }

    public void removeTaskMainListener(int i) {
        C20271c.m66769a().mo54286a(i, null, ListenerType.MAIN, true);
    }

    public void removeTaskNotificationListener(int i) {
        C20271c.m66769a().mo54286a(i, null, ListenerType.NOTIFICATION, true);
    }

    public void removeTaskSubListener(int i) {
        C20271c.m66769a().mo54286a(i, null, ListenerType.SUB, true);
    }

    public static Downloader getInstance(Context context) {
        if (instance == null) {
            synchronized (Downloader.class) {
                if (instance == null) {
                    C20269b.m66725a(context);
                    instance = new Downloader();
                }
            }
        }
        return instance;
    }

    public static synchronized void init(C20279f fVar) {
        synchronized (Downloader.class) {
            if (fVar != null) {
                if (instance == null) {
                    instance = fVar.mo54342a();
                } else {
                    C20269b.m66730a(fVar);
                }
            }
        }
    }

    public boolean isDownloading(int i) {
        boolean k;
        if (!C20356b.m67535a(4194304)) {
            return C20271c.m66769a().mo54309k(i);
        }
        synchronized (this) {
            k = C20271c.m66769a().mo54309k(i);
        }
        return k;
    }

    public int getDownloadId(String str, String str2) {
        C20271c.m66769a();
        return C20271c.m66768a(str, str2);
    }

    public void setDownloadNotificationEventListener(int i, C20254v vVar) {
        C20271c.m66769a().mo54287a(i, vVar);
    }

    public void addMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C20271c.m66769a().mo54296b(i, iDownloadListener, ListenerType.MAIN, false);
        }
    }

    public void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C20271c.m66769a().mo54296b(i, iDownloadListener, ListenerType.NOTIFICATION, false);
        }
    }

    public void addSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C20271c.m66769a().mo54296b(i, iDownloadListener, ListenerType.SUB, false);
        }
    }

    public void removeMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C20271c.m66769a().mo54286a(i, iDownloadListener, ListenerType.MAIN, false);
        }
    }

    public void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C20271c.m66769a().mo54286a(i, iDownloadListener, ListenerType.NOTIFICATION, false);
        }
    }

    public void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C20271c.m66769a().mo54286a(i, iDownloadListener, ListenerType.SUB, false);
        }
    }

    public void setMainThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C20271c.m66769a().mo54296b(i, iDownloadListener, ListenerType.MAIN, true);
        }
    }

    public void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C20271c.m66769a().mo54296b(i, iDownloadListener, ListenerType.NOTIFICATION, true);
        }
    }

    public void setSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            C20271c.m66769a().mo54296b(i, iDownloadListener, ListenerType.SUB, true);
        }
    }

    public DownloadInfo getDownloadInfo(String str, String str2) {
        return C20271c.m66769a().mo54293b(str, str2);
    }
}
