package com.p280ss.android.socialbase.downloader.downloader;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.p280ss.android.socialbase.downloader.constants.ListenerType;
import com.p280ss.android.socialbase.downloader.depend.C20232j;
import com.p280ss.android.socialbase.downloader.depend.C20241o;
import com.p280ss.android.socialbase.downloader.depend.C20254v;
import com.p280ss.android.socialbase.downloader.depend.C20255w;
import com.p280ss.android.socialbase.downloader.depend.C20259y;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.impls.C20315l;
import com.p280ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.p905c.C20192a;
import com.p280ss.android.socialbase.downloader.utils.C20356b;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.c */
public class C20271c {

    /* renamed from: a */
    private static volatile C20271c f54769a;

    /* renamed from: b */
    private volatile SparseArray<Boolean> f54770b = new SparseArray<>();

    /* renamed from: c */
    private Handler f54771c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private volatile List<C20255w> f54772d = new ArrayList();

    /* renamed from: a */
    public final void mo54289a(C20255w wVar) {
        if (wVar != null && !C20359e.m67590c()) {
            C20315l.m67199a(true);
            synchronized (this.f54772d) {
                if (!this.f54772d.contains(wVar)) {
                    this.f54772d.add(wVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo54298b(C20255w wVar) {
        if (wVar != null) {
            synchronized (this.f54772d) {
                if (this.f54772d.contains(wVar)) {
                    this.f54772d.remove(wVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo54291a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        C20288m c = mo54299c(downloadInfo.getId());
        if (c == null) {
            return false;
        }
        return c.mo54421a(downloadInfo);
    }

    /* renamed from: a */
    public final void mo54290a(final DownloadTask downloadTask) {
        final C20288m b = m66773b(downloadTask);
        if (b == null) {
            C20192a.m66504a(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, "tryDownload but getDownloadHandler failed"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
        } else if (downloadTask.isNeedDelayForCacheSync()) {
            this.f54771c.postDelayed(new Runnable() {
                public final void run() {
                    b.mo54418a(downloadTask);
                }
            }, 500);
        } else {
            b.mo54418a(downloadTask);
        }
    }

    /* renamed from: d */
    public static boolean m66776d() {
        return C20269b.m66767z();
    }

    /* renamed from: e */
    public static boolean m66777e() {
        C20288m a = C20315l.m67199a(false);
        if (a != null) {
            return a.mo54438e();
        }
        return false;
    }

    /* renamed from: a */
    public static C20271c m66769a() {
        if (f54769a == null) {
            synchronized (C20271c.class) {
                f54769a = new C20271c();
            }
        }
        return f54769a;
    }

    /* renamed from: c */
    public static void m66775c() {
        C20288m a = C20315l.m67199a(false);
        if (a != null) {
            a.mo54405a();
        }
        C20288m a2 = C20315l.m67199a(true);
        if (a2 != null) {
            a2.mo54405a();
        }
    }

    /* renamed from: b */
    public final void mo54295b() {
        synchronized (this.f54772d) {
            Iterator it = this.f54772d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    public static void m66771a(C20232j jVar) {
        C20269b.m66728a(jVar);
    }

    /* renamed from: b */
    public static void m66774b(C20232j jVar) {
        C20269b.m66740b(jVar);
    }

    /* renamed from: d */
    public final void mo54302d(int i) {
        C20288m c = mo54299c(i);
        if (c != null) {
            c.mo54406a(i);
        }
    }

    /* renamed from: f */
    public final boolean mo54304f(int i) {
        C20288m c = mo54299c(i);
        if (c == null) {
            return false;
        }
        return c.mo54432c(i);
    }

    /* renamed from: g */
    public final void mo54305g(int i) {
        C20288m c = mo54299c(i);
        if (c != null) {
            c.mo54436d(i);
        }
    }

    /* renamed from: h */
    public final void mo54306h(int i) {
        C20288m c = mo54299c(i);
        if (c != null) {
            c.mo54437e(i);
        }
    }

    /* renamed from: i */
    public final long mo54307i(int i) {
        C20288m c = mo54299c(i);
        if (c == null) {
            return 0;
        }
        return c.mo54439f(i);
    }

    /* renamed from: j */
    public final int mo54308j(int i) {
        C20288m c = mo54299c(i);
        if (c == null) {
            return 0;
        }
        return c.mo54441g(i);
    }

    /* renamed from: k */
    public final boolean mo54309k(int i) {
        C20288m c = mo54299c(i);
        if (c == null) {
            return false;
        }
        return c.mo54443h(i);
    }

    /* renamed from: l */
    public final DownloadInfo mo54310l(int i) {
        C20288m c = mo54299c(i);
        if (c == null) {
            return null;
        }
        return c.mo54444i(i);
    }

    /* renamed from: m */
    public final C20254v mo54311m(int i) {
        C20288m c = mo54299c(i);
        if (c == null) {
            return null;
        }
        return c.mo54454s(i);
    }

    /* renamed from: n */
    public final C20259y mo54312n(int i) {
        C20288m c = mo54299c(i);
        if (c == null) {
            return null;
        }
        return c.mo54455t(i);
    }

    /* renamed from: o */
    public final void mo54313o(int i) {
        C20288m c = mo54299c(i);
        if (c != null) {
            c.mo54446k(i);
        }
    }

    /* renamed from: p */
    public final void mo54314p(int i) {
        C20288m c = mo54299c(i);
        if (c != null) {
            c.mo54447l(i);
        }
    }

    /* renamed from: q */
    public final boolean mo54315q(int i) {
        C20288m c = mo54299c(i);
        if (c == null) {
            return false;
        }
        return c.mo54449n(i);
    }

    /* renamed from: t */
    public final C20241o mo54317t(int i) {
        C20288m c = mo54299c(i);
        if (c == null) {
            return null;
        }
        return c.mo54456u(i);
    }

    /* renamed from: r */
    public static void m66778r(int i) {
        C20288m a = C20315l.m67199a(false);
        if (a != null) {
            a.mo54448m(i);
        }
        C20288m a2 = C20315l.m67199a(true);
        if (a2 != null) {
            a2.mo54448m(i);
        }
    }

    /* renamed from: s */
    public final void mo54316s(int i) {
        if (i != 0) {
            mo54297b(i, Boolean.TRUE.booleanValue());
            C20288m a = C20315l.m67199a(true);
            if (a != null) {
                a.mo54435d();
            }
        }
    }

    /* renamed from: a */
    public static void m66772a(List<String> list) {
        C20288m a = C20315l.m67199a(false);
        if (a != null) {
            a.mo54419a(list);
        }
        C20288m a2 = C20315l.m67199a(true);
        if (a2 != null) {
            a2.mo54419a(list);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo54292b(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<java.lang.Boolean> r0 = r1.f54770b     // Catch:{ all -> 0x001f }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x000c
            r2 = -1
            monitor-exit(r1)
            return r2
        L_0x000c:
            android.util.SparseArray<java.lang.Boolean> r0 = r1.f54770b     // Catch:{ all -> 0x001f }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001f }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x001f }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x001d
            r2 = 1
        L_0x001b:
            monitor-exit(r1)
            return r2
        L_0x001d:
            r2 = 0
            goto L_0x001b
        L_0x001f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.downloader.C20271c.mo54292b(int):int");
    }

    /* renamed from: c */
    public final C20288m mo54299c(int i) {
        boolean z = true;
        if (mo54284a(i) != 1 || C20359e.m67590c()) {
            z = false;
        }
        return C20315l.m67199a(z);
    }

    /* renamed from: d */
    public final List<DownloadInfo> mo54301d(String str) {
        List list;
        SparseArray sparseArray = new SparseArray();
        C20288m a = C20315l.m67199a(false);
        List list2 = null;
        if (a != null) {
            list = a.mo54434d(str);
        } else {
            list = null;
        }
        C20288m a2 = C20315l.m67199a(true);
        if (a2 != null) {
            list2 = a2.mo54434d(str);
        }
        return m66770a(list, list2, sparseArray);
    }

    /* renamed from: b */
    public final List<DownloadInfo> mo54294b(String str) {
        List list;
        SparseArray sparseArray = new SparseArray();
        C20288m a = C20315l.m67199a(false);
        List list2 = null;
        if (a != null) {
            list = a.mo54423b(str);
        } else {
            list = null;
        }
        C20288m a2 = C20315l.m67199a(true);
        if (a2 != null) {
            list2 = a2.mo54423b(str);
        }
        return m66770a(list, list2, sparseArray);
    }

    /* renamed from: c */
    public final List<DownloadInfo> mo54300c(String str) {
        List list;
        SparseArray sparseArray = new SparseArray();
        C20288m a = C20315l.m67199a(false);
        List list2 = null;
        if (a != null) {
            list = a.mo54430c(str);
        } else {
            list = null;
        }
        C20288m a2 = C20315l.m67199a(true);
        if (a2 != null) {
            list2 = a2.mo54430c(str);
        }
        return m66770a(list, list2, sparseArray);
    }

    /* renamed from: e */
    public final void mo54303e(int i) {
        if (!C20359e.m67556a()) {
            C20288m c = mo54299c(i);
            if (c != null) {
                c.mo54424b(i);
            }
            C20315l.m67199a(true).mo54407a(2, i);
        } else if (C20356b.m67535a(8388608)) {
            C20288m a = C20315l.m67199a(true);
            if (a != null) {
                a.mo54424b(i);
            }
            C20288m a2 = C20315l.m67199a(false);
            if (a2 != null) {
                a2.mo54424b(i);
            }
        } else {
            C20288m a3 = C20315l.m67199a(false);
            if (a3 != null) {
                a3.mo54424b(i);
            }
            C20288m a4 = C20315l.m67199a(true);
            if (a4 != null) {
                a4.mo54424b(i);
            }
        }
    }

    /* renamed from: b */
    private C20288m m66773b(DownloadTask downloadTask) {
        boolean z;
        if (downloadTask == null) {
            return null;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo == null) {
            return null;
        }
        boolean isNeedIndependentProcess = downloadInfo.isNeedIndependentProcess();
        boolean z2 = true;
        if (C20359e.m67590c() || !C20359e.m67556a()) {
            isNeedIndependentProcess = true;
        }
        int a = mo54284a(downloadInfo.getId());
        if (a >= 0 && a != isNeedIndependentProcess) {
            if (a == 1) {
                try {
                    if (C20359e.m67556a()) {
                        C20315l.m67199a(true).mo54406a(downloadInfo.getId());
                        DownloadInfo i = C20315l.m67199a(true).mo54444i(downloadInfo.getId());
                        if (i != null) {
                            C20315l.m67199a(false).mo54427b(i);
                        }
                        if (i.getChunkCount() > 1) {
                            List j = C20315l.m67199a(true).mo54445j(downloadInfo.getId());
                            if (j != null) {
                                C20315l.m67199a(false).mo54414a(downloadInfo.getId(), C20359e.m67546a(j));
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            } else if (C20359e.m67556a()) {
                C20315l.m67199a(false).mo54406a(downloadInfo.getId());
                List j2 = C20315l.m67199a(false).mo54445j(downloadInfo.getId());
                if (j2 != null) {
                    C20315l.m67199a(true).mo54414a(downloadInfo.getId(), C20359e.m67546a(j2));
                }
            } else {
                downloadTask.setNeedDelayForCacheSync(true);
                C20315l.m67199a(true).mo54407a(1, downloadInfo.getId());
            }
        }
        int id = downloadInfo.getId();
        if (isNeedIndependentProcess) {
            z = true;
        } else {
            z = false;
        }
        mo54288a(id, z);
        if (!isNeedIndependentProcess) {
            z2 = false;
        }
        return C20315l.m67199a(z2);
    }

    /* renamed from: a */
    public final int mo54284a(int i) {
        if (C20359e.m67590c() || !C20315l.m67199a(true).mo54442g()) {
            return mo54292b(i);
        }
        return C20315l.m67199a(true).mo54450o(i);
    }

    /* renamed from: a */
    public final List<DownloadInfo> mo54285a(String str) {
        List list;
        SparseArray sparseArray = new SparseArray();
        C20288m a = C20315l.m67199a(false);
        List list2 = null;
        if (a != null) {
            list = a.mo54404a(str);
        } else {
            list = null;
        }
        C20288m a2 = C20315l.m67199a(true);
        if (a2 != null) {
            list2 = a2.mo54404a(str);
        }
        return m66770a(list, list2, sparseArray);
    }

    /* renamed from: a */
    public static int m66768a(String str, String str2) {
        return C20269b.m66720a(str, str2);
    }

    /* renamed from: a */
    public final void mo54287a(int i, C20254v vVar) {
        C20288m c = mo54299c(i);
        if (c != null) {
            c.mo54413a(i, vVar);
        }
    }

    /* renamed from: b */
    public final DownloadInfo mo54293b(String str, String str2) {
        int a = m66768a(str, str2);
        C20288m c = mo54299c(a);
        if (c == null) {
            return null;
        }
        return c.mo54444i(a);
    }

    /* renamed from: a */
    public final void mo54288a(int i, boolean z) {
        mo54297b(i, z);
        if (!C20359e.m67590c() && C20315l.m67199a(true).mo54442g()) {
            C20315l.m67199a(true).mo54415a(i, z);
        }
        if (!C20269b.m66743c() && !C20359e.m67590c() && !C20359e.m67556a()) {
            try {
                Intent intent = new Intent(C20269b.m66765x(), DownloadHandleService.class);
                intent.setAction("com.ss.android.downloader.action.PROCESS_NOTIFY");
                intent.putExtra("extra_download_id", i);
                C20269b.m66765x().startService(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo54297b(int i, boolean z) {
        Boolean bool;
        SparseArray<Boolean> sparseArray = this.f54770b;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        sparseArray.put(i, bool);
    }

    /* renamed from: a */
    private static List<DownloadInfo> m66770a(List<DownloadInfo> list, List<DownloadInfo> list2, SparseArray<DownloadInfo> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && sparseArray.get(downloadInfo.getId()) == null) {
                    sparseArray.put(downloadInfo.getId(), downloadInfo);
                }
            }
        }
        if (list2 != null) {
            for (DownloadInfo downloadInfo2 : list2) {
                if (downloadInfo2 != null && sparseArray.get(downloadInfo2.getId()) == null) {
                    sparseArray.put(downloadInfo2.getId(), downloadInfo2);
                }
            }
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add((DownloadInfo) sparseArray.get(sparseArray.keyAt(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo54286a(int i, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        int i2;
        C20288m c = mo54299c(i);
        if (c != null) {
            if (iDownloadListener == null) {
                i2 = 0;
            } else {
                i2 = iDownloadListener.hashCode();
            }
            c.mo54425b(i, i2, iDownloadListener, listenerType, z);
        }
    }

    /* renamed from: b */
    public final void mo54296b(int i, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        C20288m c = mo54299c(i);
        if (c != null) {
            c.mo54411a(i, iDownloadListener.hashCode(), iDownloadListener, listenerType, z);
        }
    }
}
