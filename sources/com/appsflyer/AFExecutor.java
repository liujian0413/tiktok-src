package com.appsflyer;

import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AFExecutor {

    /* renamed from: ˋ */
    private static AFExecutor f6677;

    /* renamed from: ˊ */
    private ScheduledExecutorService f6678;

    /* renamed from: ˎ */
    private Executor f6679;

    class _lancet {
        /* renamed from: com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool */
        static ExecutorService m8635x638be38b(int i) {
            return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(i).mo18996a());
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool */
        static ScheduledExecutorService m8636x62f20904(int i) {
            return (ScheduledExecutorService) C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SCHEDULED).mo18993a(i).mo18996a());
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor */
        static ExecutorService m8637x6416be54() {
            return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(1).mo18996a());
        }
    }

    private AFExecutor() {
    }

    public static AFExecutor getInstance() {
        if (f6677 == null) {
            f6677 = new AFExecutor();
        }
        return f6677;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final void mo7383() {
        try {
            m8632(this.f6678);
            if (this.f6679 instanceof ThreadPoolExecutor) {
                m8632((ThreadPoolExecutor) this.f6679);
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("failed to stop Executors", th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public final ScheduledThreadPoolExecutor mo7382() {
        boolean z;
        if (this.f6678 == null || this.f6678.isShutdown() || this.f6678.isTerminated()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f6678 = _lancet.m8636x62f20904(2);
        }
        return (ScheduledThreadPoolExecutor) this.f6678;
    }

    public Executor getThreadPoolExecutor() {
        boolean z;
        if (this.f6679 == null || ((this.f6679 instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) this.f6679).isShutdown() || ((ThreadPoolExecutor) this.f6679).isTerminated() || ((ThreadPoolExecutor) this.f6679).isTerminating()))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (VERSION.SDK_INT < 11) {
                return _lancet.m8637x6416be54();
            }
            this.f6679 = _lancet.m8635x638be38b(2);
        }
        return this.f6679;
    }

    /* renamed from: ॱ */
    private static void m8632(ExecutorService executorService) {
        try {
            AFLogger.afRDLog("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            AFLogger.afRDLog("InterruptedException!!!");
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }
}
