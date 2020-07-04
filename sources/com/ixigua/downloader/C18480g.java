package com.ixigua.downloader;

import com.bytedance.common.utility.p254b.C9713b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ixigua.downloader.g */
public class C18480g {

    /* renamed from: b */
    private static ThreadPoolExecutor f50101b;

    /* renamed from: a */
    public ExecutorService f50102a;

    /* renamed from: com.ixigua.downloader.g$a */
    static class C18482a {

        /* renamed from: a */
        private ExecutorService f50103a;

        C18482a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C18480g mo47983a() {
            return new C18480g(this.f50103a);
        }
    }

    /* renamed from: a */
    static ExecutorService m60893a() {
        if (f50101b == null) {
            synchronized (C18480g.class) {
                if (f50101b == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(6, 6, 60, TimeUnit.SECONDS, new PriorityBlockingQueue(), new C9713b("downloader"));
                    f50101b = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f50101b;
    }

    private C18480g(ExecutorService executorService) {
        if (executorService != null) {
            this.f50102a = executorService;
        } else {
            this.f50102a = m60893a();
        }
    }
}
