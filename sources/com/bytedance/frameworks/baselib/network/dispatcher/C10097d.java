package com.bytedance.frameworks.baselib.network.dispatcher;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.d */
final class C10097d implements C6310a {

    /* renamed from: a */
    static C10097d f27465a = new C10097d();

    /* renamed from: f */
    private static AtomicInteger f27466f = new AtomicInteger();

    /* renamed from: b */
    private C6309f f27467b = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: c */
    private ThreadPoolExecutor f27468c;

    /* renamed from: d */
    private ThreadPoolExecutor f27469d;

    /* renamed from: e */
    private ThreadPoolExecutor f27470e;

    /* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.d$a */
    static class C10098a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f27471a = new AtomicInteger(1);

        /* renamed from: b */
        private String f27472b = "ApiExecutor";

        C10098a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f27472b = str;
            }
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27472b);
            sb.append("#");
            sb.append(this.f27471a.getAndIncrement());
            C100991 r1 = new Thread(runnable, sb.toString()) {
                public final void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            };
            r1.setDaemon(false);
            return r1;
        }
    }

    /* renamed from: c */
    private static int m29982c() {
        return f27466f.incrementAndGet();
    }

    /* renamed from: d */
    private static C10101f m29983d() {
        return C10100e.m29989a();
    }

    private C10097d() {
    }

    /* renamed from: e */
    private synchronized ExecutorService m29984e() {
        if (this.f27470e == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(m29983d().f27482f, m29983d().f27480d, m29983d().f27484h, TimeUnit.SECONDS, new PriorityBlockingQueue(), new C10098a("NetDownload"));
            this.f27470e = threadPoolExecutor;
            this.f27470e.allowCoreThreadTimeOut(C10100e.m29989a().f27486j);
        }
        return this.f27470e;
    }

    /* renamed from: a */
    public final synchronized ExecutorService mo24752a() {
        if (this.f27468c == null) {
            this.f27468c = m29983d().f27477a;
            if (this.f27468c == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, m29983d().f27485i, TimeUnit.SECONDS, new SynchronousQueue(), new C10098a("NetImmediate"));
                this.f27468c = threadPoolExecutor;
            }
        }
        return this.f27468c;
    }

    /* renamed from: b */
    public final synchronized ExecutorService mo24754b() {
        if (this.f27469d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(m29983d().f27481e, m29983d().f27479c, m29983d().f27483g, TimeUnit.SECONDS, new PriorityBlockingQueue(), new C10098a("NetNormal"));
            this.f27469d = threadPoolExecutor;
            this.f27469d.allowCoreThreadTimeOut(C10100e.m29989a().f27486j);
        }
        return this.f27469d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0029
            java.lang.Object r0 = r2.obj
            boolean r0 = r0 instanceof java.lang.Runnable
            if (r0 != 0) goto L_0x0009
            goto L_0x0029
        L_0x0009:
            int r0 = r2.what     // Catch:{ Throwable -> 0x0028 }
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x000f;
                default: goto L_0x000e;
            }     // Catch:{ Throwable -> 0x0028 }
        L_0x000e:
            goto L_0x0027
        L_0x000f:
            java.util.concurrent.ExecutorService r0 = r1.mo24752a()     // Catch:{ Throwable -> 0x0028 }
            java.lang.Object r2 = r2.obj     // Catch:{ Throwable -> 0x0028 }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ Throwable -> 0x0028 }
            r0.execute(r2)     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0027
        L_0x001b:
            java.util.concurrent.ExecutorService r0 = r1.mo24754b()     // Catch:{ Throwable -> 0x0028 }
            java.lang.Object r2 = r2.obj     // Catch:{ Throwable -> 0x0028 }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ Throwable -> 0x0028 }
            r0.execute(r2)     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            return
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.dispatcher.C10097d.handleMsg(android.os.Message):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24753a(C10095b bVar) {
        if (bVar != null && !bVar.mo24749c()) {
            bVar.mo24746a(m29982c());
            if (bVar.mo24744a() == Priority.IMMEDIATE) {
                mo24752a().execute(bVar);
                return;
            }
            long j = (long) bVar.f27463e;
            if (j > 0) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = bVar;
                this.f27467b.sendMessageDelayed(obtain, j);
                return;
            }
            m29984e().execute(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo24755b(C10095b bVar) {
        if (bVar != null && !bVar.mo24749c()) {
            bVar.mo24746a(m29982c());
            if (bVar.mo24744a() == Priority.IMMEDIATE) {
                mo24752a().execute(bVar);
                return;
            }
            long j = (long) bVar.f27463e;
            if (j > 0) {
                Message obtain = Message.obtain();
                obtain.what = 0;
                obtain.obj = bVar;
                this.f27467b.sendMessageDelayed(obtain, j);
                return;
            }
            mo24754b().execute(bVar);
        }
    }
}
