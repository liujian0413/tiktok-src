package com.p280ss.android.downloadlib;

import com.p280ss.android.socialbase.downloader.p906d.C20196a;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.downloadlib.c */
public class C19507c {

    /* renamed from: a */
    public final ThreadPoolExecutor f52806a;

    /* renamed from: com.ss.android.downloadlib.c$1 */
    class C195081 implements Runnable {
        /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(3:18|(2:20|31)(1:32)|21)|23|24|25) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0083 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                java.lang.Class<com.ss.android.downloadlib.c> r0 = com.p280ss.android.downloadlib.C19507c.class
                monitor-enter(r0)
                r1 = 8
                java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ Throwable -> 0x0083 }
                java.lang.String r3 = "sp_ad_download_event"
                r4 = 0
                r2[r4] = r3     // Catch:{ Throwable -> 0x0083 }
                java.lang.String r3 = "sp_download_finish_cache"
                r5 = 1
                r2[r5] = r3     // Catch:{ Throwable -> 0x0083 }
                r3 = 2
                java.lang.String r6 = "sp_delay_operation_info"
                r2[r3] = r6     // Catch:{ Throwable -> 0x0083 }
                r3 = 3
                java.lang.String r6 = "sp_ttdownloader_md5"
                r2[r3] = r6     // Catch:{ Throwable -> 0x0083 }
                r3 = 4
                java.lang.String r6 = "sp_name_installed_app"
                r2[r3] = r6     // Catch:{ Throwable -> 0x0083 }
                r3 = 5
                java.lang.String r6 = "misc_config"
                r2[r3] = r6     // Catch:{ Throwable -> 0x0083 }
                r3 = 6
                java.lang.String r6 = "sp_ad_install_back_dialog"
                r2[r3] = r6     // Catch:{ Throwable -> 0x0083 }
                r3 = 7
                java.lang.String r6 = "sp_appdownloader"
                r2[r3] = r6     // Catch:{ Throwable -> 0x0083 }
                r3 = 0
            L_0x0030:
                if (r3 >= r1) goto L_0x004c
                r6 = r2[r3]     // Catch:{ Throwable -> 0x0083 }
                android.content.Context r7 = com.p280ss.android.downloadlib.addownload.C19491j.m64206a()     // Catch:{ Throwable -> 0x0083 }
                android.content.SharedPreferences r6 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r7, r6, r4)     // Catch:{ Throwable -> 0x0083 }
                if (r6 == 0) goto L_0x0049
                android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ Throwable -> 0x0083 }
                android.content.SharedPreferences$Editor r6 = r6.clear()     // Catch:{ Throwable -> 0x0083 }
                r6.apply()     // Catch:{ Throwable -> 0x0083 }
            L_0x0049:
                int r3 = r3 + 1
                goto L_0x0030
            L_0x004c:
                com.ss.android.socialbase.downloader.downloader.j r1 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66754m()     // Catch:{ Throwable -> 0x0083 }
                boolean r2 = r1 instanceof com.p280ss.android.socialbase.downloader.impls.C20302d     // Catch:{ Throwable -> 0x0083 }
                if (r2 != 0) goto L_0x0056
                monitor-exit(r0)     // Catch:{ all -> 0x0081 }
                return
            L_0x0056:
                com.ss.android.socialbase.downloader.impls.d r1 = (com.p280ss.android.socialbase.downloader.impls.C20302d) r1     // Catch:{ Throwable -> 0x0083 }
                com.ss.android.socialbase.downloader.impls.k r1 = r1.f54859a     // Catch:{ Throwable -> 0x0083 }
                android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r1 = r1.f54877a     // Catch:{ Throwable -> 0x0083 }
                int r2 = r1.size()     // Catch:{ Throwable -> 0x0083 }
                int r2 = r2 - r5
            L_0x0061:
                if (r2 < 0) goto L_0x0083
                int r3 = r1.keyAt(r2)     // Catch:{ Throwable -> 0x0083 }
                java.lang.Object r3 = r1.get(r3)     // Catch:{ Throwable -> 0x0083 }
                com.ss.android.socialbase.downloader.model.DownloadInfo r3 = (com.p280ss.android.socialbase.downloader.model.DownloadInfo) r3     // Catch:{ Throwable -> 0x0083 }
                if (r3 == 0) goto L_0x007e
                android.content.Context r4 = com.p280ss.android.downloadlib.addownload.C19491j.m64206a()     // Catch:{ Throwable -> 0x0083 }
                com.ss.android.socialbase.downloader.downloader.Downloader r4 = com.p280ss.android.socialbase.downloader.downloader.Downloader.getInstance(r4)     // Catch:{ Throwable -> 0x0083 }
                int r3 = r3.getId()     // Catch:{ Throwable -> 0x0083 }
                r4.clearDownloadData(r3)     // Catch:{ Throwable -> 0x0083 }
            L_0x007e:
                int r2 = r2 + -1
                goto L_0x0061
            L_0x0081:
                r1 = move-exception
                goto L_0x0085
            L_0x0083:
                monitor-exit(r0)     // Catch:{ all -> 0x0081 }
                return
            L_0x0085:
                monitor-exit(r0)     // Catch:{ all -> 0x0081 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.downloadlib.C19507c.C195081.run():void");
        }
    }

    /* renamed from: com.ss.android.downloadlib.c$a */
    static class C19509a {

        /* renamed from: a */
        public static C19507c f52807a = new C19507c(null);
    }

    /* renamed from: a */
    public static C19507c m64274a() {
        return C19509a.f52807a;
    }

    private C19507c() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        StringBuilder sb = new StringBuilder();
        sb.append(C19535g.class.getName());
        sb.append("-ThreadPool");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30, timeUnit, synchronousQueue, new C20196a(sb.toString()));
        this.f52806a = threadPoolExecutor;
    }

    /* synthetic */ C19507c(C195081 r1) {
        this();
    }

    /* renamed from: a */
    public final void mo51638a(Runnable runnable) {
        try {
            this.f52806a.submit(runnable);
        } catch (Throwable unused) {
        }
    }
}
