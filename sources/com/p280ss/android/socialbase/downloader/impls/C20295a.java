package com.p280ss.android.socialbase.downloader.impls;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.constants.C20195c;
import com.p280ss.android.socialbase.downloader.constants.EnqueueType;
import com.p280ss.android.socialbase.downloader.constants.ListenerType;
import com.p280ss.android.socialbase.downloader.constants.RetryDelayStatus;
import com.p280ss.android.socialbase.downloader.depend.C20241o;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.depend.C20259y;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20275e;
import com.p280ss.android.socialbase.downloader.downloader.C20285j;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.notification.C20354b;
import com.p280ss.android.socialbase.downloader.p906d.C20198c;
import com.p280ss.android.socialbase.downloader.p906d.C20204f;
import com.p280ss.android.socialbase.downloader.p906d.C20204f.C20205a;
import com.p280ss.android.socialbase.downloader.utils.C20356b;
import com.p280ss.android.socialbase.downloader.utils.C20358d;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import com.p280ss.android.socialbase.downloader.utils.LruCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.ss.android.socialbase.downloader.impls.a */
public abstract class C20295a implements C20205a {

    /* renamed from: a */
    protected final C20204f f54838a = new C20204f(Looper.getMainLooper(), this);

    /* renamed from: b */
    private final SparseArray<DownloadTask> f54839b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<DownloadTask> f54840c = new SparseArray<>();

    /* renamed from: d */
    private final SparseArray<DownloadTask> f54841d = new SparseArray<>();

    /* renamed from: e */
    private final SparseArray<DownloadTask> f54842e = new SparseArray<>();

    /* renamed from: f */
    private final SparseArray<DownloadTask> f54843f = new SparseArray<>();

    /* renamed from: g */
    private final LruCache<Integer, DownloadTask> f54844g = new LruCache<>();

    /* renamed from: h */
    private final SparseArray<Long> f54845h = new SparseArray<>();

    /* renamed from: i */
    private final LinkedBlockingDeque<DownloadTask> f54846i = new LinkedBlockingDeque<>();

    /* renamed from: j */
    private final C20285j f54847j = C20269b.m66754m();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<Integer> mo54482a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo54487a(int i, DownloadTask downloadTask);

    /* renamed from: a */
    public abstract void mo54488a(C20198c cVar);

    /* renamed from: a */
    public abstract boolean mo54491a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo54493b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C20198c mo54495c(int i);

    /* renamed from: a */
    public final void mo54489a(DownloadTask downloadTask) {
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                if (downloadInfo.getEnqueueType() != EnqueueType.ENQUEUE_NONE) {
                    m67073b(downloadTask);
                } else {
                    m67072a(downloadTask, true);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo54490a(List<String> list) {
        try {
            boolean a = C20356b.m67535a(1048576) ? C20359e.m67562a(C20269b.m66765x()) : true;
            for (int i = 0; i < this.f54841d.size(); i++) {
                DownloadTask downloadTask = (DownloadTask) this.f54841d.get(this.f54841d.keyAt(i));
                if (downloadTask != null) {
                    DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                    if (downloadInfo != null && list.contains(downloadInfo.getMimeType()) && (!downloadInfo.isOnlyWifi() || a)) {
                        downloadInfo.setAutoResumed(true);
                        downloadInfo.setShowNotificationForNetworkResumed(true);
                        mo54489a(downloadTask);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo54120a(Message message) {
        int i = message.arg1;
        BaseException baseException = message.obj instanceof Exception ? (BaseException) message.obj : null;
        synchronized (C20295a.class) {
            DownloadTask downloadTask = (DownloadTask) this.f54839b.get(i);
            if (downloadTask != null) {
                m67070a(message.what, baseException, downloadTask);
                mo54484a(i, message.what);
            }
        }
    }

    /* renamed from: b */
    public final void mo54492b() {
        List<Integer> a = mo54482a();
        if (a != null) {
            for (Integer intValue : a) {
                mo54497e(intValue.intValue());
            }
        }
    }

    protected C20295a() {
    }

    /* renamed from: d */
    public final DownloadInfo mo54496d(int i) {
        DownloadInfo b = this.f54847j.mo54052b(i);
        if (b == null) {
            synchronized (this.f54839b) {
                DownloadTask downloadTask = (DownloadTask) this.f54839b.get(i);
                if (downloadTask != null) {
                    b = downloadTask.getDownloadInfo();
                }
            }
        }
        return b;
    }

    /* renamed from: g */
    public final synchronized boolean mo54499g(int i) {
        DownloadTask downloadTask = (DownloadTask) this.f54839b.get(i);
        if (downloadTask != null) {
            mo54489a(downloadTask);
        } else {
            mo54500h(i);
        }
        return true;
    }

    /* renamed from: p */
    public final synchronized void mo54508p(int i) {
        DownloadTask downloadTask = (DownloadTask) this.f54839b.get(i);
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setForceIgnoreRecommendSize(true);
                mo54489a(downloadTask);
            }
        }
    }

    /* renamed from: r */
    private DownloadTask m67074r(int i) {
        DownloadTask downloadTask = (DownloadTask) this.f54839b.get(i);
        if (downloadTask != null) {
            return downloadTask;
        }
        DownloadTask downloadTask2 = (DownloadTask) this.f54841d.get(i);
        if (downloadTask2 != null) {
            return downloadTask2;
        }
        DownloadTask downloadTask3 = (DownloadTask) this.f54840c.get(i);
        if (downloadTask3 != null) {
            return downloadTask3;
        }
        DownloadTask downloadTask4 = (DownloadTask) this.f54842e.get(i);
        if (downloadTask4 == null) {
            return (DownloadTask) this.f54843f.get(i);
        }
        return downloadTask4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m67075s(int r3) {
        /*
            r2 = this;
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r2.f54846i
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r2.f54846i
            monitor-enter(r0)
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.model.DownloadTask> r1 = r2.f54846i     // Catch:{ all -> 0x003b }
            java.lang.Object r1 = r1.getFirst()     // Catch:{ all -> 0x003b }
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = (com.p280ss.android.socialbase.downloader.model.DownloadTask) r1     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0021
            int r1 = r1.getDownloadId()     // Catch:{ all -> 0x003b }
            if (r1 != r3) goto L_0x0021
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r2.f54846i     // Catch:{ all -> 0x003b }
            r3.poll()     // Catch:{ all -> 0x003b }
        L_0x0021:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r2.f54846i     // Catch:{ all -> 0x003b }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x002b:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r2.f54846i     // Catch:{ all -> 0x003b }
            java.lang.Object r3 = r3.getFirst()     // Catch:{ all -> 0x003b }
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = (com.p280ss.android.socialbase.downloader.model.DownloadTask) r3     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0039
            r1 = 1
            r2.m67072a(r3, r1)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.impls.C20295a.m67075s(int):void");
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo54483a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : mo54482a()) {
            DownloadInfo d = mo54496d(intValue.intValue());
            if (d != null && str.equals(d.getMimeType())) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final synchronized boolean mo54500h(int i) {
        DownloadTask downloadTask = (DownloadTask) this.f54841d.get(i);
        if (downloadTask != null) {
            mo54489a(downloadTask);
        } else {
            DownloadTask downloadTask2 = (DownloadTask) this.f54842e.get(i);
            if (downloadTask2 == null) {
                return false;
            }
            mo54489a(downloadTask2);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        return false;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo54504l(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.f54842e     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0036 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = (com.p280ss.android.socialbase.downloader.model.DownloadTask) r0     // Catch:{ all -> 0x0036 }
            r1 = 0
            if (r0 == 0) goto L_0x001e
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r0.getDownloadInfo()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x001e
            boolean r4 = r2.canStartRetryDelayTask()     // Catch:{ all -> 0x0036 }
            if (r4 == 0) goto L_0x001b
            r3.m67072a(r0, r1)     // Catch:{ all -> 0x0036 }
        L_0x001b:
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x001e:
            com.ss.android.socialbase.downloader.downloader.j r0 = r3.f54847j     // Catch:{ all -> 0x0036 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r0.mo54052b(r4)     // Catch:{ all -> 0x0036 }
            if (r4 == 0) goto L_0x0034
            boolean r0 = r4.canStartRetryDelayTask()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = new com.ss.android.socialbase.downloader.model.DownloadTask     // Catch:{ all -> 0x0036 }
            r0.<init>(r4)     // Catch:{ all -> 0x0036 }
            r3.m67072a(r0, r1)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r3)
            return r1
        L_0x0036:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.impls.C20295a.mo54504l(int):boolean");
    }

    /* renamed from: m */
    public final synchronized boolean mo54505m(int i) {
        DownloadTask downloadTask = (DownloadTask) this.f54843f.get(i);
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                if (downloadInfo.canReStartAsyncTask()) {
                    mo54489a(downloadTask);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final void mo54506n(final int i) {
        DownloadInfo b = this.f54847j.mo54052b(i);
        if (b != null) {
            m67071a(b);
        }
        mo54495c(i);
        this.f54838a.post(new Runnable() {
            public final void run() {
                C20354b.m67519a().mo54922c(i);
            }
        });
        if (C20359e.m67593d()) {
            C202983 r0 = new Runnable() {
                public final void run() {
                    C20295a.this.mo54507o(i);
                }
            };
            ExecutorService h = C20269b.m66749h();
            if (h != null) {
                h.execute(r0);
            }
            return;
        }
        mo54507o(i);
    }

    /* renamed from: q */
    public final synchronized boolean mo54509q(int i) {
        boolean z;
        if (i != 0) {
            if (!((this.f54839b == null || this.f54839b.get(i) == null) && (this.f54841d == null || this.f54841d.get(i) == null))) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: a */
    private static void m67071a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            try {
                if (downloadInfo.getStatus() == 7 || downloadInfo.getRetryDelayStatus() != RetryDelayStatus.DELAY_RETRY_NONE) {
                    downloadInfo.setStatus(5);
                    downloadInfo.setRetryDelayStatus(RetryDelayStatus.DELAY_RETRY_NONE);
                    AlarmManager e = C20269b.m66746e();
                    Intent intent = new Intent("com.ss.android.downloader.action.DOWNLOAD_WAKEUP");
                    intent.putExtra("extra_download_id", downloadInfo.getId());
                    intent.setClass(C20269b.m66765x(), DownloadHandleService.class);
                    e.cancel(PendingIntent.getService(C20269b.m66765x(), downloadInfo.getId(), intent, 1073741824));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    public final boolean mo54497e(int i) {
        mo54493b(i);
        DownloadInfo b = this.f54847j.mo54052b(i);
        if (b == null) {
            synchronized (this.f54839b) {
                DownloadTask downloadTask = (DownloadTask) this.f54839b.get(i);
                if (downloadTask != null) {
                    new C20275e(downloadTask, this.f54838a).mo54335d();
                    return true;
                }
            }
        } else {
            m67071a(b);
            if (b.getStatus() == 1) {
                synchronized (this.f54839b) {
                    DownloadTask downloadTask2 = (DownloadTask) this.f54839b.get(i);
                    if (downloadTask2 != null) {
                        new C20275e(downloadTask2, this.f54838a).mo54335d();
                        return true;
                    }
                }
            } else if (C20195c.m66506b(b.getStatus())) {
                b.setStatus(-2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo54498f(int i) {
        DownloadTask downloadTask = (DownloadTask) this.f54839b.get(i);
        if (downloadTask == null && C20356b.m67535a(65536)) {
            downloadTask = m67074r(i);
        }
        if (downloadTask != null) {
            new C20275e(downloadTask, this.f54838a).mo54334c();
            final DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            final SparseArray downloadListeners = downloadTask.getDownloadListeners(ListenerType.MAIN);
            final SparseArray downloadListeners2 = downloadTask.getDownloadListeners(ListenerType.NOTIFICATION);
            this.f54838a.post(new Runnable() {
                public final void run() {
                    if (downloadListeners != null) {
                        synchronized (downloadListeners) {
                            for (int i = 0; i < downloadListeners.size(); i++) {
                                IDownloadListener iDownloadListener = (IDownloadListener) downloadListeners.get(downloadListeners.keyAt(i));
                                if (iDownloadListener != null) {
                                    iDownloadListener.onCanceled(downloadInfo);
                                }
                            }
                        }
                    }
                    if (downloadInfo != null && downloadInfo.canShowNotification() && downloadListeners2 != null) {
                        synchronized (downloadListeners2) {
                            for (int i2 = 0; i2 < downloadListeners2.size(); i2++) {
                                IDownloadListener iDownloadListener2 = (IDownloadListener) downloadListeners2.get(downloadListeners2.keyAt(i2));
                                if (iDownloadListener2 != null) {
                                    iDownloadListener2.onCanceled(downloadInfo);
                                }
                            }
                        }
                    }
                }
            });
        }
        DownloadInfo b = this.f54847j.mo54052b(i);
        if (C20356b.m67535a(65536)) {
            if (b != null) {
                b.setStatus(-4);
            }
        } else if (b != null && C20195c.m66506b(b.getStatus())) {
            b.setStatus(-4);
        }
        mo54506n(i);
        return true;
    }

    /* renamed from: i */
    public final synchronized C20259y mo54501i(int i) {
        DownloadTask downloadTask = (DownloadTask) this.f54839b.get(i);
        if (downloadTask != null) {
            return downloadTask.getNotificationClickCallback();
        }
        DownloadTask downloadTask2 = (DownloadTask) this.f54840c.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationClickCallback();
        }
        DownloadTask downloadTask3 = (DownloadTask) this.f54841d.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationClickCallback();
        }
        DownloadTask downloadTask4 = (DownloadTask) this.f54842e.get(i);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationClickCallback();
        }
        DownloadTask downloadTask5 = (DownloadTask) this.f54843f.get(i);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getNotificationClickCallback();
    }

    /* renamed from: j */
    public final synchronized C20254v mo54502j(int i) {
        DownloadTask downloadTask = (DownloadTask) this.f54839b.get(i);
        if (downloadTask != null) {
            return downloadTask.getNotificationEventListener();
        }
        DownloadTask downloadTask2 = (DownloadTask) this.f54840c.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationEventListener();
        }
        DownloadTask downloadTask3 = (DownloadTask) this.f54841d.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationEventListener();
        }
        DownloadTask downloadTask4 = (DownloadTask) this.f54842e.get(i);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationEventListener();
        }
        DownloadTask downloadTask5 = (DownloadTask) this.f54843f.get(i);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getNotificationEventListener();
    }

    /* renamed from: k */
    public final synchronized C20241o mo54503k(int i) {
        DownloadTask downloadTask = (DownloadTask) this.f54839b.get(i);
        if (downloadTask != null) {
            return downloadTask.getFileUriProvider();
        }
        DownloadTask downloadTask2 = (DownloadTask) this.f54840c.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getFileUriProvider();
        }
        DownloadTask downloadTask3 = (DownloadTask) this.f54841d.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getFileUriProvider();
        }
        DownloadTask downloadTask4 = (DownloadTask) this.f54842e.get(i);
        if (downloadTask4 != null) {
            return downloadTask4.getFileUriProvider();
        }
        DownloadTask downloadTask5 = (DownloadTask) this.f54843f.get(i);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getFileUriProvider();
    }

    /* renamed from: o */
    public final synchronized void mo54507o(int i) {
        try {
            DownloadInfo b = this.f54847j.mo54052b(i);
            if (b != null) {
                C20359e.m67550a(b);
                b.clearSpData();
            }
            try {
                this.f54847j.mo54069f(i);
            } catch (SQLiteException unused) {
            }
            mo54484a(i, -4);
            if (this.f54841d.get(i) != null) {
                this.f54841d.remove(i);
            }
            if (this.f54840c.get(i) != null) {
                this.f54840c.remove(i);
            }
            synchronized (this.f54844g) {
                this.f54844g.remove(Integer.valueOf(i));
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    private void m67073b(DownloadTask downloadTask) {
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                try {
                    synchronized (this.f54846i) {
                        if (this.f54846i.isEmpty()) {
                            m67072a(downloadTask, true);
                            this.f54846i.put(downloadTask);
                        } else if (downloadInfo.getEnqueueType() != EnqueueType.ENQUEUE_TAIL) {
                            DownloadTask downloadTask2 = (DownloadTask) this.f54846i.getFirst();
                            if (downloadTask2.getDownloadId() != downloadTask.getDownloadId() || !mo54491a(downloadTask.getDownloadId())) {
                                mo54497e(downloadTask2.getDownloadId());
                                m67072a(downloadTask, true);
                                if (downloadTask2.getDownloadId() != downloadTask.getDownloadId()) {
                                    this.f54846i.putFirst(downloadTask);
                                }
                            }
                        } else if (((DownloadTask) this.f54846i.getFirst()).getDownloadId() != downloadTask.getDownloadId() || !mo54491a(downloadTask.getDownloadId())) {
                            Iterator it = this.f54846i.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                DownloadTask downloadTask3 = (DownloadTask) it.next();
                                if (downloadTask3 != null && downloadTask3.getDownloadId() == downloadTask.getDownloadId()) {
                                    it.remove();
                                    break;
                                }
                            }
                            this.f54846i.put(downloadTask);
                            new C20275e(downloadTask, this.f54838a).mo54325a();
                        }
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo54484a(int r2, int r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            switch(r3) {
                case -7: goto L_0x006f;
                case -6: goto L_0x005b;
                case -4: goto L_0x0052;
                case -3: goto L_0x003f;
                case -1: goto L_0x006f;
                case 7: goto L_0x001e;
                case 8: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            goto L_0x0093
        L_0x0006:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f54839b     // Catch:{ all -> 0x0090 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0090 }
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = (com.p280ss.android.socialbase.downloader.model.DownloadTask) r3     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x0057
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f54843f     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0057
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f54843f     // Catch:{ all -> 0x0090 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0090 }
            goto L_0x0057
        L_0x001e:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f54839b     // Catch:{ all -> 0x0090 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0090 }
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = (com.p280ss.android.socialbase.downloader.model.DownloadTask) r3     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x003a
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f54842e     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0035
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f54842e     // Catch:{ all -> 0x0090 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0090 }
        L_0x0035:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f54839b     // Catch:{ all -> 0x0090 }
            r3.remove(r2)     // Catch:{ all -> 0x0090 }
        L_0x003a:
            r1.m67075s(r2)     // Catch:{ all -> 0x0090 }
            monitor-exit(r1)
            return
        L_0x003f:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f54839b     // Catch:{ all -> 0x0090 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0090 }
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = (com.p280ss.android.socialbase.downloader.model.DownloadTask) r3     // Catch:{ all -> 0x0090 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f54840c     // Catch:{ all -> 0x0090 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0090 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f54839b     // Catch:{ all -> 0x0090 }
            r3.remove(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x0057
        L_0x0052:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f54839b     // Catch:{ all -> 0x0090 }
            r3.remove(r2)     // Catch:{ all -> 0x0090 }
        L_0x0057:
            r1.m67075s(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x0093
        L_0x005b:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f54839b     // Catch:{ all -> 0x0090 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0090 }
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = (com.p280ss.android.socialbase.downloader.model.DownloadTask) r3     // Catch:{ all -> 0x0090 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f54840c     // Catch:{ all -> 0x0090 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0090 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f54839b     // Catch:{ all -> 0x0090 }
            r3.remove(r2)     // Catch:{ all -> 0x0090 }
            monitor-exit(r1)
            return
        L_0x006f:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f54839b     // Catch:{ all -> 0x0090 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0090 }
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = (com.p280ss.android.socialbase.downloader.model.DownloadTask) r3     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x008b
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f54841d     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0086
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f54841d     // Catch:{ all -> 0x0090 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0090 }
        L_0x0086:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f54839b     // Catch:{ all -> 0x0090 }
            r3.remove(r2)     // Catch:{ all -> 0x0090 }
        L_0x008b:
            r1.m67075s(r2)     // Catch:{ all -> 0x0090 }
            monitor-exit(r1)
            return
        L_0x0090:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0093:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.impls.C20295a.mo54484a(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0160  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m67072a(com.p280ss.android.socialbase.downloader.model.DownloadTask r12, boolean r13) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r12.getDownloadInfo()
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            boolean r1 = r0.isEntityInvalid()
            r2 = 1003(0x3eb, float:1.406E-42)
            r3 = 0
            if (r1 == 0) goto L_0x0050
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r12 = r12.getMonitorDepend()
            com.ss.android.socialbase.downloader.exception.BaseException r13 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "downloadInfo is Invalid, url is "
            r1.<init>(r4)
            java.lang.String r4 = r0.getUrl()
            r1.append(r4)
            java.lang.String r4 = " name is "
            r1.append(r4)
            java.lang.String r4 = r0.getName()
            r1.append(r4)
            java.lang.String r4 = " savePath is "
            r1.append(r4)
            java.lang.String r4 = r0.getSavePath()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r13.<init>(r2, r1)
            if (r0 == 0) goto L_0x004c
            int r3 = r0.getStatus()
        L_0x004c:
            com.p280ss.android.socialbase.downloader.p905c.C20192a.m66504a(r12, r0, r13, r3)
            return
        L_0x0050:
            int r1 = r0.getId()
            if (r13 == 0) goto L_0x0059
            m67071a(r0)
        L_0x0059:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r13 = r11.f54841d
            monitor-enter(r13)
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r4 = r11.f54841d     // Catch:{ all -> 0x01c2 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x01c2 }
            if (r4 == 0) goto L_0x0069
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r4 = r11.f54841d     // Catch:{ all -> 0x01c2 }
            r4.remove(r1)     // Catch:{ all -> 0x01c2 }
        L_0x0069:
            monitor-exit(r13)     // Catch:{ all -> 0x01c2 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r4 = r11.f54840c
            monitor-enter(r4)
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r13 = r11.f54840c     // Catch:{ all -> 0x01bf }
            java.lang.Object r13 = r13.get(r1)     // Catch:{ all -> 0x01bf }
            if (r13 == 0) goto L_0x007a
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r13 = r11.f54840c     // Catch:{ all -> 0x01bf }
            r13.remove(r1)     // Catch:{ all -> 0x01bf }
        L_0x007a:
            monitor-exit(r4)     // Catch:{ all -> 0x01bf }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r13 = r11.f54842e
            monitor-enter(r13)
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r4 = r11.f54842e     // Catch:{ all -> 0x01bc }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x01bc }
            if (r4 == 0) goto L_0x008b
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r4 = r11.f54842e     // Catch:{ all -> 0x01bc }
            r4.remove(r1)     // Catch:{ all -> 0x01bc }
        L_0x008b:
            monitor-exit(r13)     // Catch:{ all -> 0x01bc }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r4 = r11.f54843f
            monitor-enter(r4)
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r13 = r11.f54843f     // Catch:{ all -> 0x01b9 }
            java.lang.Object r13 = r13.get(r1)     // Catch:{ all -> 0x01b9 }
            if (r13 == 0) goto L_0x009c
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r13 = r11.f54843f     // Catch:{ all -> 0x01b9 }
            r13.remove(r1)     // Catch:{ all -> 0x01b9 }
        L_0x009c:
            monitor-exit(r4)     // Catch:{ all -> 0x01b9 }
            r13 = 512(0x200, float:7.175E-43)
            boolean r13 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r13)
            if (r13 == 0) goto L_0x00c6
            boolean r13 = r11.mo54491a(r1)
            if (r13 == 0) goto L_0x00c6
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r13 = r11.f54839b
            monitor-enter(r13)
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r4 = r11.f54839b     // Catch:{ all -> 0x00c3 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x00c3 }
            com.ss.android.socialbase.downloader.model.DownloadTask r4 = (com.p280ss.android.socialbase.downloader.model.DownloadTask) r4     // Catch:{ all -> 0x00c3 }
            if (r4 == 0) goto L_0x00bc
            r4.copyInterfaceFromNewTask(r12)     // Catch:{ all -> 0x00c3 }
            goto L_0x00c1
        L_0x00bc:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r4 = r11.f54839b     // Catch:{ all -> 0x00c3 }
            r4.put(r1, r12)     // Catch:{ all -> 0x00c3 }
        L_0x00c1:
            monitor-exit(r13)     // Catch:{ all -> 0x00c3 }
            goto L_0x00c6
        L_0x00c3:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00c3 }
            throw r12
        L_0x00c6:
            boolean r13 = r11.mo54491a(r1)
            if (r13 == 0) goto L_0x00f0
            boolean r13 = r0.canReStartAsyncTask()
            if (r13 != 0) goto L_0x00f0
            boolean r13 = r0.isAddListenerToSameTask()
            if (r13 == 0) goto L_0x00db
            r12.addListenerToDownloadingSameTask()
        L_0x00db:
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r12 = r12.getMonitorDepend()
            com.ss.android.socialbase.downloader.exception.BaseException r13 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.lang.String r1 = "downloadInfo is isDownloading and addListenerToSameTask is false"
            r13.<init>(r2, r1)
            if (r0 == 0) goto L_0x00ec
            int r3 = r0.getStatus()
        L_0x00ec:
            com.p280ss.android.socialbase.downloader.p905c.C20192a.m66504a(r12, r0, r13, r3)
            return
        L_0x00f0:
            boolean r13 = r0.canReStartAsyncTask()
            if (r13 == 0) goto L_0x00fb
            com.ss.android.socialbase.downloader.constants.AsyncHandleStatus r13 = com.p280ss.android.socialbase.downloader.constants.AsyncHandleStatus.ASYNC_HANDLE_RESTART
            r0.setAsyncHandleStatus(r13)
        L_0x00fb:
            r13 = 32768(0x8000, float:4.5918E-41)
            boolean r13 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r13)
            if (r13 == 0) goto L_0x011d
            com.ss.android.socialbase.downloader.utils.LruCache<java.lang.Integer, com.ss.android.socialbase.downloader.model.DownloadTask> r13 = r11.f54844g
            monitor-enter(r13)
            com.ss.android.socialbase.downloader.utils.LruCache<java.lang.Integer, com.ss.android.socialbase.downloader.model.DownloadTask> r4 = r11.f54844g     // Catch:{ all -> 0x011a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x011a }
            java.lang.Object r4 = r4.remove(r5)     // Catch:{ all -> 0x011a }
            com.ss.android.socialbase.downloader.model.DownloadTask r4 = (com.p280ss.android.socialbase.downloader.model.DownloadTask) r4     // Catch:{ all -> 0x011a }
            monitor-exit(r13)     // Catch:{ all -> 0x011a }
            if (r4 == 0) goto L_0x011d
            r12.copyListenerFromPendingTask(r4)
            goto L_0x011d
        L_0x011a:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x011a }
            throw r12
        L_0x011d:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r13 = r11.f54839b
            monitor-enter(r13)
            android.util.SparseArray<java.lang.Long> r4 = r11.f54845h     // Catch:{ all -> 0x01b6 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x01b6 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x01b6 }
            if (r4 == 0) goto L_0x012f
            long r4 = r4.longValue()     // Catch:{ all -> 0x01b6 }
            goto L_0x0131
        L_0x012f:
            r4 = 0
        L_0x0131:
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01b6 }
            r8 = 0
            long r4 = r6 - r4
            r8 = 50
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x01a3
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r4 = r11.f54839b     // Catch:{ all -> 0x01b6 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x01b6 }
            com.ss.android.socialbase.downloader.model.DownloadTask r4 = (com.p280ss.android.socialbase.downloader.model.DownloadTask) r4     // Catch:{ all -> 0x01b6 }
            if (r4 == 0) goto L_0x015c
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r4.getDownloadInfo()     // Catch:{ all -> 0x01b6 }
            if (r4 == 0) goto L_0x015c
            int r4 = r4.getStatus()     // Catch:{ all -> 0x01b6 }
            if (r4 != 0) goto L_0x015d
            boolean r5 = com.p280ss.android.socialbase.downloader.constants.C20195c.m66506b(r4)     // Catch:{ all -> 0x01b6 }
            if (r5 == 0) goto L_0x015d
            r5 = 1
            goto L_0x015e
        L_0x015c:
            r4 = 0
        L_0x015d:
            r5 = 0
        L_0x015e:
            if (r5 == 0) goto L_0x0191
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b6 }
            java.lang.String r8 = "can add listener, oldTaskStatus is :"
            r5.<init>(r8)     // Catch:{ all -> 0x01b6 }
            r5.append(r4)     // Catch:{ all -> 0x01b6 }
            if (r4 < 0) goto L_0x0173
            r5 = 2
            if (r4 >= r5) goto L_0x0173
            r12.addListenerToDownloadingSameTask()     // Catch:{ all -> 0x01b6 }
            goto L_0x01b4
        L_0x0173:
            boolean r4 = r0.isAddListenerToSameTask()     // Catch:{ all -> 0x01b6 }
            if (r4 == 0) goto L_0x017d
            r12.addListenerToDownloadingSameTask()     // Catch:{ all -> 0x01b6 }
            goto L_0x01b4
        L_0x017d:
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r4 = r12.getMonitorDepend()     // Catch:{ all -> 0x01b6 }
            com.ss.android.socialbase.downloader.exception.BaseException r5 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x01b6 }
            java.lang.String r8 = "has another same task within 50 milliseconds and addListenerToSameTask is false"
            r5.<init>(r2, r8)     // Catch:{ all -> 0x01b6 }
            if (r0 == 0) goto L_0x018e
            int r3 = r0.getStatus()     // Catch:{ all -> 0x01b6 }
        L_0x018e:
            com.p280ss.android.socialbase.downloader.p905c.C20192a.m66504a(r4, r0, r5, r3)     // Catch:{ all -> 0x01b6 }
        L_0x0191:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r11.f54839b     // Catch:{ all -> 0x01b6 }
            r0.put(r1, r12)     // Catch:{ all -> 0x01b6 }
            android.util.SparseArray<java.lang.Long> r0 = r11.f54845h     // Catch:{ all -> 0x01b6 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01b6 }
            r0.put(r1, r2)     // Catch:{ all -> 0x01b6 }
            r11.mo54487a(r1, r12)     // Catch:{ all -> 0x01b6 }
            goto L_0x01b4
        L_0x01a3:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r11.f54839b     // Catch:{ all -> 0x01b6 }
            r0.put(r1, r12)     // Catch:{ all -> 0x01b6 }
            android.util.SparseArray<java.lang.Long> r0 = r11.f54845h     // Catch:{ all -> 0x01b6 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01b6 }
            r0.put(r1, r2)     // Catch:{ all -> 0x01b6 }
            r11.mo54487a(r1, r12)     // Catch:{ all -> 0x01b6 }
        L_0x01b4:
            monitor-exit(r13)     // Catch:{ all -> 0x01b6 }
            return
        L_0x01b6:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01b6 }
            throw r12
        L_0x01b9:
            r12 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01b9 }
            throw r12
        L_0x01bc:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01bc }
            throw r12
        L_0x01bf:
            r12 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01bf }
            throw r12
        L_0x01c2:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01c2 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.impls.C20295a.m67072a(com.ss.android.socialbase.downloader.model.DownloadTask, boolean):void");
    }

    /* renamed from: a */
    public final void mo54486a(int i, C20254v vVar) {
        synchronized (this.f54839b) {
            DownloadTask downloadTask = (DownloadTask) this.f54839b.get(i);
            if (downloadTask != null) {
                downloadTask.setNotificationEventListener(vVar);
            }
        }
    }

    /* renamed from: a */
    private static void m67070a(int i, BaseException baseException, DownloadTask downloadTask) {
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            SparseArray downloadListeners = downloadTask.getDownloadListeners(ListenerType.MAIN);
            SparseArray downloadListeners2 = downloadTask.getDownloadListeners(ListenerType.NOTIFICATION);
            boolean canShowNotification = downloadTask.canShowNotification();
            C20358d.m67537a(i, downloadListeners, true, downloadInfo, baseException);
            C20358d.m67537a(i, downloadListeners2, canShowNotification, downloadInfo, baseException);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0078, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo54494b(int r4, int r5, final com.p280ss.android.socialbase.downloader.depend.IDownloadListener r6, com.p280ss.android.socialbase.downloader.constants.ListenerType r7, boolean r8) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r3.m67074r(r4)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0038
            r0.addDownloadListener(r5, r6, r7, r8)     // Catch:{ all -> 0x0079 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r0.getDownloadInfo()     // Catch:{ all -> 0x0079 }
            if (r5 == 0) goto L_0x0036
            boolean r4 = r3.mo54491a(r4)     // Catch:{ all -> 0x0079 }
            if (r4 != 0) goto L_0x0036
            com.ss.android.socialbase.downloader.constants.ListenerType r4 = com.p280ss.android.socialbase.downloader.constants.ListenerType.MAIN     // Catch:{ all -> 0x0079 }
            if (r7 == r4) goto L_0x001e
            com.ss.android.socialbase.downloader.constants.ListenerType r4 = com.p280ss.android.socialbase.downloader.constants.ListenerType.NOTIFICATION     // Catch:{ all -> 0x0079 }
            if (r7 != r4) goto L_0x0036
        L_0x001e:
            r4 = 1
            com.ss.android.socialbase.downloader.constants.ListenerType r8 = com.p280ss.android.socialbase.downloader.constants.ListenerType.NOTIFICATION     // Catch:{ all -> 0x0079 }
            if (r7 != r8) goto L_0x002a
            boolean r7 = r5.canShowNotification()     // Catch:{ all -> 0x0079 }
            if (r7 != 0) goto L_0x002a
            r4 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x0036
            com.ss.android.socialbase.downloader.d.f r4 = r3.f54838a     // Catch:{ all -> 0x0079 }
            com.ss.android.socialbase.downloader.impls.a$4 r7 = new com.ss.android.socialbase.downloader.impls.a$4     // Catch:{ all -> 0x0079 }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x0079 }
            r4.post(r7)     // Catch:{ all -> 0x0079 }
        L_0x0036:
            monitor-exit(r3)
            return
        L_0x0038:
            r0 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r0)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0077
            com.ss.android.socialbase.downloader.downloader.j r0 = r3.f54847j     // Catch:{ all -> 0x0079 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r0.mo54052b(r4)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0077
            int r1 = r0.getStatus()     // Catch:{ all -> 0x0079 }
            r2 = -3
            if (r1 == r2) goto L_0x0077
            com.ss.android.socialbase.downloader.utils.LruCache<java.lang.Integer, com.ss.android.socialbase.downloader.model.DownloadTask> r1 = r3.f54844g     // Catch:{ all -> 0x0079 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0079 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0079 }
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = (com.p280ss.android.socialbase.downloader.model.DownloadTask) r1     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x0074
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = new com.ss.android.socialbase.downloader.model.DownloadTask     // Catch:{ all -> 0x0079 }
            r1.<init>(r0)     // Catch:{ all -> 0x0079 }
            com.ss.android.socialbase.downloader.utils.LruCache<java.lang.Integer, com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.f54844g     // Catch:{ all -> 0x0079 }
            monitor-enter(r0)     // Catch:{ all -> 0x0079 }
            com.ss.android.socialbase.downloader.utils.LruCache<java.lang.Integer, com.ss.android.socialbase.downloader.model.DownloadTask> r2 = r3.f54844g     // Catch:{ all -> 0x0071 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0071 }
            r2.put(r4, r1)     // Catch:{ all -> 0x0071 }
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            goto L_0x0074
        L_0x0071:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0079 }
        L_0x0074:
            r1.addDownloadListener(r5, r6, r7, r8)     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r3)
            return
        L_0x0079:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.impls.C20295a.mo54494b(int, int, com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.constants.ListenerType, boolean):void");
    }

    /* renamed from: a */
    public final synchronized void mo54485a(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        DownloadTask r = m67074r(i);
        if (r == null) {
            r = (DownloadTask) this.f54844g.get(Integer.valueOf(i));
        }
        if (r != null) {
            r.removeDownloadListener(i2, iDownloadListener, listenerType, z);
        }
    }
}
