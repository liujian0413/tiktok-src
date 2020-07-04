package com.p280ss.android.socialbase.downloader.impls;

import com.p280ss.android.socialbase.downloader.constants.C20195c;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.p904b.C20190a;
import com.p280ss.android.socialbase.downloader.p906d.C20198c;
import com.p280ss.android.socialbase.downloader.p906d.C20202d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.android.socialbase.downloader.impls.e */
public final class C20306e extends C20295a {

    /* renamed from: b */
    private static C20202d f54867b;

    /* renamed from: a */
    public final List<Integer> mo54482a() {
        return f54867b.mo54113a();
    }

    public C20306e() {
        f54867b = new C20202d();
    }

    /* renamed from: b */
    public static void m67145b(List<Callable<Object>> list) throws InterruptedException {
        ExecutorService i = C20269b.m66750i();
        if (i != null) {
            i.invokeAll(list);
        }
    }

    /* renamed from: a */
    public final void mo54488a(C20198c cVar) {
        if (f54867b != null) {
            f54867b.mo54117b(cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C20198c mo54495c(int i) {
        if (f54867b == null) {
            return null;
        }
        return f54867b.mo54116b(i);
    }

    /* renamed from: b */
    public final void mo54493b(int i) {
        if (f54867b != null) {
            f54867b.mo54118c(i);
        }
    }

    /* renamed from: c */
    public static List<Future> m67146c(List<Runnable> list) {
        ExecutorService i = C20269b.m66750i();
        ArrayList arrayList = new ArrayList(list.size());
        for (Runnable submit : list) {
            arrayList.add(i.submit(submit));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo54491a(int i) {
        if (f54867b == null || !f54867b.mo54115a(i)) {
            return false;
        }
        DownloadInfo d = mo54496d(i);
        if (d == null) {
            return false;
        }
        if (C20195c.m66506b(d.getStatus())) {
            return true;
        }
        mo54493b(i);
        return false;
    }

    /* renamed from: d */
    public static Runnable m67147d(List<Future> list) {
        Runnable runnable;
        if (list == null || list.isEmpty()) {
            return null;
        }
        try {
            ExecutorService i = C20269b.m66750i();
            if (i instanceof ThreadPoolExecutor) {
                BlockingQueue queue = ((ThreadPoolExecutor) i).getQueue();
                if (queue != null && !queue.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            runnable = null;
                            break;
                        }
                        Future future = (Future) it.next();
                        if ((future instanceof Runnable) && queue.remove(future)) {
                            runnable = (Runnable) future;
                            break;
                        }
                    }
                    if (runnable != null) {
                        list.remove(runnable);
                        return runnable;
                    }
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("getUnstartedTask() error: ");
            sb.append(th.toString());
            C20190a.m66502b("DefaultDownloadEngine", sb.toString());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo54487a(int i, DownloadTask downloadTask) {
        if (downloadTask != null) {
            new StringBuilder("start doDownload for task : ").append(i);
            f54867b.mo54114a(new C20198c(downloadTask, this.f54838a));
        }
    }
}
