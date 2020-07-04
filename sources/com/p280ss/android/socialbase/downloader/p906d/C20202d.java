package com.p280ss.android.socialbase.downloader.p906d;

import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.p905c.C20192a;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.android.socialbase.downloader.d.d */
public class C20202d {

    /* renamed from: a */
    private volatile SparseArray<C20198c> f54690a = new SparseArray<>();

    /* renamed from: b */
    private int f54691b;

    /* renamed from: a */
    public final List<Integer> mo54113a() {
        ArrayList arrayList;
        synchronized (C20202d.class) {
            m66580b();
            arrayList = new ArrayList();
            for (int i = 0; i < this.f54690a.size(); i++) {
                C20198c cVar = (C20198c) this.f54690a.get(this.f54690a.keyAt(i));
                if (cVar != null) {
                    arrayList.add(Integer.valueOf(cVar.mo54106d()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m66580b() {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f54690a.size(); i++) {
                int keyAt = this.f54690a.keyAt(i);
                if (!((C20198c) this.f54690a.get(keyAt)).mo54105c()) {
                    arrayList.add(Integer.valueOf(keyAt));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                try {
                    Integer num = (Integer) arrayList.get(i2);
                    if (num != null) {
                        this.f54690a.remove(num.intValue());
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: c */
    private static void m66581c(C20198c cVar) {
        try {
            ExecutorService g = C20269b.m66748g();
            if (g != null && (g instanceof ThreadPoolExecutor)) {
                ((ThreadPoolExecutor) g).remove(cVar);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final C20198c mo54116b(int i) {
        synchronized (C20202d.class) {
            m66580b();
            C20198c cVar = (C20198c) this.f54690a.get(i);
            if (cVar == null) {
                return null;
            }
            cVar.mo54102b();
            m66581c(cVar);
            this.f54690a.remove(i);
            return cVar;
        }
    }

    /* renamed from: c */
    public final void mo54118c(int i) {
        synchronized (C20202d.class) {
            m66580b();
            C20198c cVar = (C20198c) this.f54690a.get(i);
            if (cVar != null) {
                cVar.mo54095a();
                m66581c(cVar);
                this.f54690a.remove(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54115a(int r4) {
        /*
            r3 = this;
            java.lang.Class<com.ss.android.socialbase.downloader.d.d> r0 = com.p280ss.android.socialbase.downloader.p906d.C20202d.class
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.d.c> r1 = r3.f54690a     // Catch:{ all -> 0x0026 }
            r2 = 0
            if (r1 == 0) goto L_0x0024
            android.util.SparseArray<com.ss.android.socialbase.downloader.d.c> r1 = r3.f54690a     // Catch:{ all -> 0x0026 }
            int r1 = r1.size()     // Catch:{ all -> 0x0026 }
            if (r1 > 0) goto L_0x0011
            goto L_0x0024
        L_0x0011:
            android.util.SparseArray<com.ss.android.socialbase.downloader.d.c> r1 = r3.f54690a     // Catch:{ all -> 0x0026 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0026 }
            com.ss.android.socialbase.downloader.d.c r4 = (com.p280ss.android.socialbase.downloader.p906d.C20198c) r4     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0022
            boolean r4 = r4.mo54105c()     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0022
            r2 = 1
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r2
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r2
        L_0x0026:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p906d.C20202d.mo54115a(int):boolean");
    }

    /* renamed from: a */
    public final void mo54114a(C20198c cVar) {
        int i;
        int i2;
        cVar.mo54107e();
        synchronized (C20202d.class) {
            i = 0;
            if (this.f54691b >= 500) {
                m66580b();
                this.f54691b = 0;
            } else {
                this.f54691b++;
            }
            this.f54690a.put(cVar.mo54106d(), cVar);
        }
        DownloadTask downloadTask = cVar.f54660a;
        try {
            ExecutorService g = C20269b.m66748g();
            if (g != null) {
                g.execute(cVar);
                return;
            }
            IDownloadMonitorDepend monitorDepend = downloadTask.getMonitorDepend();
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            BaseException baseException = new BaseException(1003, "execute failed cpu thread executor service is null");
            if (downloadTask.getDownloadInfo() != null) {
                i2 = downloadTask.getDownloadInfo().getStatus();
            } else {
                i2 = 0;
            }
            C20192a.m66504a(monitorDepend, downloadInfo, baseException, i2);
        } catch (Exception e) {
            if (downloadTask != null) {
                IDownloadMonitorDepend monitorDepend2 = downloadTask.getMonitorDepend();
                DownloadInfo downloadInfo2 = downloadTask.getDownloadInfo();
                BaseException baseException2 = new BaseException(1003, C20359e.m67575b((Throwable) e, "DownloadThreadPoolExecute"));
                if (downloadTask.getDownloadInfo() != null) {
                    i = downloadTask.getDownloadInfo().getStatus();
                }
                C20192a.m66504a(monitorDepend2, downloadInfo2, baseException2, i);
            }
        } catch (OutOfMemoryError unused) {
            if (downloadTask != null) {
                IDownloadMonitorDepend monitorDepend3 = downloadTask.getMonitorDepend();
                DownloadInfo downloadInfo3 = downloadTask.getDownloadInfo();
                BaseException baseException3 = new BaseException(1003, "execute OOM");
                if (downloadTask.getDownloadInfo() != null) {
                    i = downloadTask.getDownloadInfo().getStatus();
                }
                C20192a.m66504a(monitorDepend3, downloadInfo3, baseException3, i);
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0028 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54117b(com.p280ss.android.socialbase.downloader.p906d.C20198c r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Class<com.ss.android.socialbase.downloader.d.d> r0 = com.p280ss.android.socialbase.downloader.p906d.C20202d.class
            monitor-enter(r0)
            r1 = 524288(0x80000, float:7.34684E-40)
            boolean r1 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r1)     // Catch:{ Throwable -> 0x0028 }
            if (r1 == 0) goto L_0x001c
            android.util.SparseArray<com.ss.android.socialbase.downloader.d.c> r1 = r2.f54690a     // Catch:{ Throwable -> 0x0028 }
            int r3 = r1.indexOfValue(r3)     // Catch:{ Throwable -> 0x0028 }
            if (r3 < 0) goto L_0x0028
            android.util.SparseArray<com.ss.android.socialbase.downloader.d.c> r1 = r2.f54690a     // Catch:{ Throwable -> 0x0028 }
            r1.removeAt(r3)     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0028
        L_0x001c:
            android.util.SparseArray<com.ss.android.socialbase.downloader.d.c> r1 = r2.f54690a     // Catch:{ Throwable -> 0x0028 }
            int r3 = r3.mo54106d()     // Catch:{ Throwable -> 0x0028 }
            r1.remove(r3)     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0028
        L_0x0026:
            r3 = move-exception
            goto L_0x002a
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p906d.C20202d.mo54117b(com.ss.android.socialbase.downloader.d.c):void");
    }
}
