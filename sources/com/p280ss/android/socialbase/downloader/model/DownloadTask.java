package com.p280ss.android.socialbase.downloader.model;

import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.constants.EnqueueType;
import com.p280ss.android.socialbase.downloader.constants.ListenerType;
import com.p280ss.android.socialbase.downloader.depend.C20240n;
import com.p280ss.android.socialbase.downloader.depend.C20241o;
import com.p280ss.android.socialbase.downloader.depend.C20249s;
import com.p280ss.android.socialbase.downloader.depend.C20250t;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.depend.C20259y;
import com.p280ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.p280ss.android.socialbase.downloader.downloader.C20271c;
import com.p280ss.android.socialbase.downloader.downloader.C20280g;
import com.p280ss.android.socialbase.downloader.downloader.C20281h;
import com.p280ss.android.socialbase.downloader.downloader.C20292q;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo.C20335a;
import com.p280ss.android.socialbase.downloader.p905c.C20192a;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.socialbase.downloader.model.DownloadTask */
public class DownloadTask {
    private C20280g chunkAdjustCalculator;
    private C20281h chunkStrategy;
    private IDownloadDepend depend;
    private C20240n diskSpaceHandler;
    private DownloadInfo downloadInfo;
    private C20335a downloadInfoBuilder;
    private C20241o fileUriProvider;
    private C20249s forbiddenHandler;
    private C20250t interceptor;
    private final SparseArray<IDownloadListener> mainThreadListeners;
    private IDownloadMonitorDepend monitorDepend;
    private boolean needDelayForCacheSync;
    private C20259y notificationClickCallback;
    private C20254v notificationEventListener;
    private final SparseArray<IDownloadListener> notificationListeners;
    private C20292q retryDelayTimeCalculator;
    private final SparseArray<ListenerType> singleListenerHashCodeMap;
    private final Map<ListenerType, IDownloadListener> singleListenerMap;
    private final SparseArray<IDownloadListener> subThreadListeners;

    public C20280g getChunkAdjustCalculator() {
        return this.chunkAdjustCalculator;
    }

    public C20281h getChunkStrategy() {
        return this.chunkStrategy;
    }

    public IDownloadDepend getDepend() {
        return this.depend;
    }

    public C20240n getDiskSpaceHandler() {
        return this.diskSpaceHandler;
    }

    public DownloadInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public C20241o getFileUriProvider() {
        return this.fileUriProvider;
    }

    public C20249s getForbiddenHandler() {
        return this.forbiddenHandler;
    }

    public C20250t getInterceptor() {
        return this.interceptor;
    }

    public IDownloadMonitorDepend getMonitorDepend() {
        return this.monitorDepend;
    }

    public C20259y getNotificationClickCallback() {
        return this.notificationClickCallback;
    }

    public C20254v getNotificationEventListener() {
        return this.notificationEventListener;
    }

    public C20292q getRetryDelayTimeCalculator() {
        return this.retryDelayTimeCalculator;
    }

    public boolean isNeedDelayForCacheSync() {
        return this.needDelayForCacheSync;
    }

    public boolean canShowNotification() {
        if (this.downloadInfo != null) {
            return this.downloadInfo.canShowNotification();
        }
        return false;
    }

    public int getDownloadId() {
        if (this.downloadInfo == null) {
            return 0;
        }
        return this.downloadInfo.getId();
    }

    public void addListenerToDownloadingSameTask() {
        addListenerToDownloadingSameTask(ListenerType.MAIN);
        addListenerToDownloadingSameTask(ListenerType.SUB);
        C20192a.m66504a(this.monitorDepend, this.downloadInfo, new BaseException(1003, "has another same task, add Listener to old task"), 0);
    }

    public int download() {
        this.downloadInfo = this.downloadInfoBuilder.mo54758a();
        C20271c.m66769a().mo54290a(this);
        if (this.downloadInfo == null) {
            return 0;
        }
        return this.downloadInfo.getId();
    }

    public DownloadTask() {
        this.singleListenerMap = new ConcurrentHashMap();
        this.singleListenerHashCodeMap = new SparseArray<>();
        this.needDelayForCacheSync = false;
        this.downloadInfoBuilder = new C20335a();
        this.mainThreadListeners = new SparseArray<>();
        this.subThreadListeners = new SparseArray<>();
        this.notificationListeners = new SparseArray<>();
    }

    public DownloadTask chunkAdjustCalculator(C20280g gVar) {
        this.chunkAdjustCalculator = gVar;
        return this;
    }

    public DownloadTask chunkStategy(C20281h hVar) {
        this.chunkStrategy = hVar;
        return this;
    }

    public DownloadTask depend(IDownloadDepend iDownloadDepend) {
        this.depend = iDownloadDepend;
        return this;
    }

    public DownloadTask diskSpaceHandler(C20240n nVar) {
        this.diskSpaceHandler = nVar;
        return this;
    }

    public DownloadTask fileUriProvider(C20241o oVar) {
        this.fileUriProvider = oVar;
        return this;
    }

    public DownloadTask forbiddenHandler(C20249s sVar) {
        this.forbiddenHandler = sVar;
        return this;
    }

    public DownloadTask interceptor(C20250t tVar) {
        this.interceptor = tVar;
        return this;
    }

    public DownloadTask monitorDepend(IDownloadMonitorDepend iDownloadMonitorDepend) {
        this.monitorDepend = iDownloadMonitorDepend;
        return this;
    }

    public DownloadTask notificationClickCallback(C20259y yVar) {
        this.notificationClickCallback = yVar;
        return this;
    }

    public DownloadTask notificationEventListener(C20254v vVar) {
        this.notificationEventListener = vVar;
        return this;
    }

    public DownloadTask retryDelayTimeCalculator(C20292q qVar) {
        this.retryDelayTimeCalculator = qVar;
        return this;
    }

    public void setNeedDelayForCacheSync(boolean z) {
        this.needDelayForCacheSync = z;
    }

    public void setNotificationEventListener(C20254v vVar) {
        this.notificationEventListener = vVar;
    }

    public DownloadTask(DownloadInfo downloadInfo2) {
        this();
        this.downloadInfo = downloadInfo2;
    }

    public DownloadTask addListenerToSameTask(boolean z) {
        this.downloadInfoBuilder.mo54789q(z);
        return this;
    }

    public DownloadTask autoResumed(boolean z) {
        this.downloadInfoBuilder.mo54774f(z);
        return this;
    }

    public DownloadTask backUpUrlRetryCount(int i) {
        this.downloadInfoBuilder.mo54763c(i);
        return this;
    }

    public DownloadTask backUpUrls(List<String> list) {
        this.downloadInfoBuilder.mo54761b(list);
        return this;
    }

    public DownloadTask enqueueType(EnqueueType enqueueType) {
        this.downloadInfoBuilder.mo54752a(enqueueType);
        return this;
    }

    public DownloadTask extra(String str) {
        this.downloadInfoBuilder.mo54773f(str);
        return this;
    }

    public DownloadTask extraHeaders(List<HttpHeader> list) {
        this.downloadInfoBuilder.mo54754a(list);
        return this;
    }

    public DownloadTask force(boolean z) {
        this.downloadInfoBuilder.mo54762b(z);
        return this;
    }

    public DownloadTask headConnectionAvailable(boolean z) {
        this.downloadInfoBuilder.mo54785m(z);
        return this;
    }

    public DownloadTask ignoreDataVerify(boolean z) {
        this.downloadInfoBuilder.mo54786n(z);
        return this;
    }

    public DownloadTask maxBytes(int i) {
        this.downloadInfoBuilder.mo54751a(i);
        return this;
    }

    public DownloadTask maxProgressCount(int i) {
        this.downloadInfoBuilder.mo54766d(i);
        return this;
    }

    public DownloadTask md5(String str) {
        this.downloadInfoBuilder.mo54779i(str);
        return this;
    }

    public DownloadTask mimeType(String str) {
        this.downloadInfoBuilder.mo54775g(str);
        return this;
    }

    public DownloadTask minProgressTimeMsInterval(int i) {
        this.downloadInfoBuilder.mo54769e(i);
        return this;
    }

    public DownloadTask name(String str) {
        this.downloadInfoBuilder.mo54753a(str);
        return this;
    }

    public DownloadTask needChunkDowngradeRetry(boolean z) {
        this.downloadInfoBuilder.mo54787o(z);
        return this;
    }

    public DownloadTask needDefaultHttpServiceBackUp(boolean z) {
        this.downloadInfoBuilder.mo54778h(z);
        return this;
    }

    public DownloadTask needHttpsToHttpRetry(boolean z) {
        this.downloadInfoBuilder.mo54768d(z);
        return this;
    }

    public DownloadTask needIndependentProcess(boolean z) {
        this.downloadInfoBuilder.mo54784l(z);
        return this;
    }

    public DownloadTask needPostProgress(boolean z) {
        this.downloadInfoBuilder.mo54765c(z);
        return this;
    }

    public DownloadTask needRetryDelay(boolean z) {
        this.downloadInfoBuilder.mo54782j(z);
        return this;
    }

    public DownloadTask needReuseChunkRunnable(boolean z) {
        this.downloadInfoBuilder.mo54780i(z);
        return this;
    }

    public DownloadTask needReuseFirstConnection(boolean z) {
        this.downloadInfoBuilder.mo54783k(z);
        return this;
    }

    public DownloadTask newSaveTempFileEnable(boolean z) {
        this.downloadInfoBuilder.mo54788p(z);
        return this;
    }

    public DownloadTask onlyWifi(boolean z) {
        this.downloadInfoBuilder.mo54755a(z);
        return this;
    }

    public DownloadTask outIp(String[] strArr) {
        this.downloadInfoBuilder.mo54757a(strArr);
        return this;
    }

    public DownloadTask outSize(int[] iArr) {
        this.downloadInfoBuilder.mo54756a(iArr);
        return this;
    }

    public DownloadTask packageName(String str) {
        this.downloadInfoBuilder.mo54777h(str);
        return this;
    }

    public DownloadTask retryCount(int i) {
        this.downloadInfoBuilder.mo54759b(i);
        return this;
    }

    public DownloadTask retryDelayTimeArray(String str) {
        this.downloadInfoBuilder.mo54781j(str);
        return this;
    }

    public DownloadTask retryScheduleMinutes(int i) {
        this.downloadInfoBuilder.mo54772f(i);
        return this;
    }

    public DownloadTask savePath(String str) {
        this.downloadInfoBuilder.mo54767d(str);
        return this;
    }

    public DownloadTask showNotification(boolean z) {
        this.downloadInfoBuilder.mo54771e(z);
        return this;
    }

    public DownloadTask showNotificationForAutoResumed(boolean z) {
        this.downloadInfoBuilder.mo54776g(z);
        return this;
    }

    public DownloadTask tempPath(String str) {
        this.downloadInfoBuilder.mo54770e(str);
        return this;
    }

    public DownloadTask title(String str) {
        this.downloadInfoBuilder.mo54760b(str);
        return this;
    }

    public DownloadTask url(String str) {
        this.downloadInfoBuilder.mo54764c(str);
        return this;
    }

    public IDownloadListener getSingleDownloadListener(ListenerType listenerType) {
        return (IDownloadListener) this.singleListenerMap.get(listenerType);
    }

    public DownloadTask mainThreadListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        return mainThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
    }

    public DownloadTask notificationListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        return notificationListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
    }

    public DownloadTask subThreadListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        return subThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
    }

    public int getDownloadListenerSize(ListenerType listenerType) {
        int size;
        SparseArray downloadListeners = getDownloadListeners(listenerType);
        if (downloadListeners == null) {
            return 0;
        }
        synchronized (downloadListeners) {
            size = downloadListeners.size();
        }
        return size;
    }

    public SparseArray<IDownloadListener> getDownloadListeners(ListenerType listenerType) {
        if (listenerType == ListenerType.MAIN) {
            return this.mainThreadListeners;
        }
        if (listenerType == ListenerType.SUB) {
            return this.subThreadListeners;
        }
        if (listenerType == ListenerType.NOTIFICATION) {
            return this.notificationListeners;
        }
        return null;
    }

    private void addListenerToDownloadingSameTask(ListenerType listenerType) {
        SparseArray downloadListeners = getDownloadListeners(listenerType);
        synchronized (downloadListeners) {
            for (int i = 0; i < downloadListeners.size(); i++) {
                IDownloadListener iDownloadListener = (IDownloadListener) downloadListeners.get(downloadListeners.keyAt(i));
                if (iDownloadListener != null) {
                    C20271c.m66769a().mo54296b(getDownloadId(), iDownloadListener, listenerType, false);
                }
            }
        }
    }

    public void copyInterfaceFromNewTask(DownloadTask downloadTask) {
        this.chunkAdjustCalculator = downloadTask.chunkAdjustCalculator;
        this.chunkStrategy = downloadTask.chunkStrategy;
        this.singleListenerMap.clear();
        this.singleListenerMap.putAll(downloadTask.singleListenerMap);
        this.mainThreadListeners.clear();
        addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
        this.subThreadListeners.clear();
        addAll(downloadTask.subThreadListeners, this.subThreadListeners);
        this.notificationListeners.clear();
        addAll(downloadTask.notificationListeners, this.notificationListeners);
        this.notificationEventListener = downloadTask.notificationEventListener;
        this.interceptor = downloadTask.interceptor;
        this.depend = downloadTask.depend;
        this.monitorDepend = downloadTask.monitorDepend;
        this.forbiddenHandler = downloadTask.forbiddenHandler;
        this.diskSpaceHandler = downloadTask.diskSpaceHandler;
        this.retryDelayTimeCalculator = downloadTask.retryDelayTimeCalculator;
        this.notificationClickCallback = downloadTask.notificationClickCallback;
        this.fileUriProvider = downloadTask.fileUriProvider;
    }

    public void copyListenerFromPendingTask(DownloadTask downloadTask) {
        for (Entry entry : downloadTask.singleListenerMap.entrySet()) {
            if (entry != null && !this.singleListenerMap.containsKey(entry.getKey())) {
                this.singleListenerMap.put(entry.getKey(), entry.getValue());
            }
        }
        try {
            if (downloadTask.mainThreadListeners.size() != 0) {
                synchronized (this.mainThreadListeners) {
                    removeAll(this.mainThreadListeners, downloadTask.mainThreadListeners);
                    addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
                }
            }
            if (downloadTask.subThreadListeners.size() != 0) {
                synchronized (this.subThreadListeners) {
                    removeAll(this.subThreadListeners, downloadTask.subThreadListeners);
                    addAll(downloadTask.subThreadListeners, this.subThreadListeners);
                }
            }
            if (downloadTask.notificationListeners.size() != 0) {
                synchronized (this.notificationListeners) {
                    removeAll(this.notificationListeners, downloadTask.notificationListeners);
                    addAll(downloadTask.notificationListeners, this.notificationListeners);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void addAll(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray != null && sparseArray2 != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                sparseArray2.put(keyAt, sparseArray.get(keyAt));
            }
        }
    }

    private void copyListeners(SparseArray<IDownloadListener> sparseArray, SparseArray<IDownloadListener> sparseArray2) {
        sparseArray.clear();
        for (int i = 0; i < sparseArray2.size(); i++) {
            int keyAt = sparseArray2.keyAt(i);
            IDownloadListener iDownloadListener = (IDownloadListener) sparseArray2.get(keyAt);
            if (iDownloadListener != null) {
                sparseArray.put(keyAt, iDownloadListener);
            }
        }
    }

    private void removeAll(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray != null && sparseArray2 != null) {
            int size = sparseArray2.size();
            for (int i = 0; i < size; i++) {
                sparseArray.remove(sparseArray2.keyAt(i));
            }
        }
    }

    public IDownloadListener getDownloadListenerByIndex(ListenerType listenerType, int i) {
        SparseArray downloadListeners = getDownloadListeners(listenerType);
        if (downloadListeners == null || i < 0) {
            return null;
        }
        synchronized (downloadListeners) {
            if (i >= downloadListeners.size()) {
                return null;
            }
            IDownloadListener iDownloadListener = (IDownloadListener) downloadListeners.get(downloadListeners.keyAt(i));
            return iDownloadListener;
        }
    }

    public DownloadTask mainThreadListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.mainThreadListeners) {
                this.mainThreadListeners.put(i, iDownloadListener);
            }
            this.singleListenerMap.put(ListenerType.MAIN, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, ListenerType.MAIN);
            }
        }
        return this;
    }

    public DownloadTask notificationListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.notificationListeners) {
                this.notificationListeners.put(i, iDownloadListener);
            }
            this.singleListenerMap.put(ListenerType.NOTIFICATION, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, ListenerType.NOTIFICATION);
            }
        }
        return this;
    }

    public void setDownloadListeners(SparseArray<IDownloadListener> sparseArray, ListenerType listenerType) {
        if (sparseArray != null) {
            try {
                if (listenerType == ListenerType.MAIN) {
                    synchronized (this.mainThreadListeners) {
                        copyListeners(this.mainThreadListeners, sparseArray);
                    }
                } else if (listenerType == ListenerType.SUB) {
                    synchronized (this.subThreadListeners) {
                        copyListeners(this.subThreadListeners, sparseArray);
                    }
                } else if (listenerType == ListenerType.NOTIFICATION) {
                    synchronized (this.notificationListeners) {
                        copyListeners(this.notificationListeners, sparseArray);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public DownloadTask subThreadListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.subThreadListeners) {
                this.subThreadListeners.put(i, iDownloadListener);
            }
            this.singleListenerMap.put(ListenerType.SUB, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                this.singleListenerHashCodeMap.put(i, ListenerType.SUB);
            }
        }
        return this;
    }

    public void addDownloadListener(int i, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        if (iDownloadListener != null) {
            if (z && this.singleListenerMap != null) {
                this.singleListenerMap.put(listenerType, iDownloadListener);
                synchronized (this.singleListenerHashCodeMap) {
                    this.singleListenerHashCodeMap.put(i, listenerType);
                }
            }
            SparseArray downloadListeners = getDownloadListeners(listenerType);
            if (downloadListeners != null) {
                synchronized (downloadListeners) {
                    downloadListeners.put(i, iDownloadListener);
                }
            }
        }
    }

    public void removeDownloadListener(int i, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        SparseArray downloadListeners = getDownloadListeners(listenerType);
        if (downloadListeners == null) {
            if (z && this.singleListenerMap.containsKey(listenerType)) {
                this.singleListenerMap.remove(listenerType);
            }
            return;
        }
        synchronized (downloadListeners) {
            if (z) {
                try {
                    if (this.singleListenerMap.containsKey(listenerType)) {
                        iDownloadListener = (IDownloadListener) this.singleListenerMap.get(listenerType);
                        this.singleListenerMap.remove(listenerType);
                    }
                    if (iDownloadListener != null) {
                        int indexOfValue = downloadListeners.indexOfValue(iDownloadListener);
                        if (indexOfValue >= 0 && indexOfValue < downloadListeners.size()) {
                            downloadListeners.removeAt(indexOfValue);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                downloadListeners.remove(i);
                synchronized (this.singleListenerHashCodeMap) {
                    ListenerType listenerType2 = (ListenerType) this.singleListenerHashCodeMap.get(i);
                    if (listenerType2 != null && this.singleListenerMap.containsKey(listenerType2)) {
                        this.singleListenerMap.remove(listenerType2);
                        this.singleListenerHashCodeMap.remove(i);
                    }
                }
            }
        }
    }
}
