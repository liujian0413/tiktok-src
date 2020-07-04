package com.p280ss.android.ugc.aweme.lego;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.lego.b */
public final class C7149b {

    /* renamed from: a */
    public static final C7149b f20055a = new C7149b();

    /* renamed from: b */
    private static ExecutorService f20056b;

    /* renamed from: c */
    private static final ExecutorService f20057c;

    /* renamed from: d */
    private static final ExecutorService f20058d;

    /* renamed from: e */
    private static final HandlerThread f20059e = new HandlerThread("LegoHandler");

    /* renamed from: f */
    private static Handler f20060f = new Handler(f20059e.getLooper());

    private C7149b() {
    }

    /* renamed from: a */
    public static ExecutorService m22310a() {
        return f20056b;
    }

    /* renamed from: b */
    public static Handler m22312b() {
        return f20060f;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f20056b = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 90, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f20057c = threadPoolExecutor2;
        ExecutorService c = C7258h.m22730c();
        C7573i.m23582a((Object) c, "ThreadPoolHelper.getIOExecutor()");
        f20058d = c;
        ExecutorService executorService = f20056b;
        if (executorService != null) {
            ((ThreadPoolExecutor) executorService).allowCoreThreadTimeOut(true);
            f20059e.start();
            Process.setThreadPriority(f20059e.getThreadId(), -20);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
    }

    /* renamed from: a */
    public static ExecutorService m22311a(RequestType requestType) {
        C7573i.m23587b(requestType, "requestType");
        if (requestType == RequestType.P0) {
            return f20058d;
        }
        return f20057c;
    }
}
