package com.bytedance.frameworks.apm.trace;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.frameworks.apm.trace.C10066g.C10067a;

public class MethodTracer implements C10059c {
    private static HandlerThread sAnalyseThread;
    private static Context sContext;
    private static MethodTracer sInstance;
    private boolean isSupport = true;
    private Handler sAnalyseHandler = new Handler(sAnalyseThread.getLooper());

    public static MethodTracer getInstance() {
        if (sInstance == null) {
            synchronized (MethodTracer.class) {
                if (sInstance == null) {
                    sInstance = new MethodTracer();
                }
            }
        }
        return sInstance;
    }

    public static void release() {
        ActivityLifeObserver.getInstance().unregister(C10063e.m29890a());
        C10063e.m29896b((C10059c) getInstance());
        C10063e.m29890a().mo24708h();
    }

    private MethodTracer() {
        HandlerThread handlerThread = new HandlerThread("trace-analyse-thread", 10);
        sAnalyseThread = handlerThread;
        handlerThread.start();
    }

    public static void init(Application application) {
        C10060d.m29881d("MethodTracer", "method tracer init", new Object[0]);
        sContext = application;
        ActivityLifeObserver.getInstance().register(C10063e.m29890a());
        C10063e.m29892a((C10059c) getInstance());
        C10063e.m29890a().mo24707g();
    }

    public void pushFullBuffer(int i, int i2, long[] jArr) {
        C10058b bVar = new C10058b(Type.FULL, ((System.nanoTime() / 1000000) - C10063e.m29897c()) - (jArr[0] & 8796093022207L), System.currentTimeMillis(), "");
        handleBuffer(i, i2, jArr, bVar);
    }

    public void doFrame(boolean z, String str, long j, C10067a aVar) {
        if (this.isSupport) {
            int e = C10063e.m29899e();
            if (z) {
                C10058b bVar = new C10058b(Type.NORMAL, j, System.currentTimeMillis(), str);
                bVar.f27371e = aVar;
                C10060d.m29878a("MethodTracer", "[doFrame] dropped frame too much! lastIndex:%s index:%s", Integer.valueOf(0), Integer.valueOf(e));
                handleBuffer(0, e - 1, C10063e.m29901f(), bVar);
            }
            C10063e.m29898d();
        }
    }

    private void handleBuffer(int i, int i2, long[] jArr, C10058b bVar) {
        if (jArr == null) {
            C10060d.m29878a("MethodTracer", "null == buffer", new Object[0]);
        } else if (bVar.f27368b < 0 || bVar.f27368b >= 6000) {
            C10060d.m29878a("MethodTracer", "[analyse] trace cost invalid:%d", Long.valueOf(bVar.f27368b));
        } else {
            int max = Math.max(0, i);
            int min = Math.min(jArr.length - 1, i2);
            if (max <= min) {
                int i3 = (min - max) + 1;
                long[] jArr2 = new long[i3];
                System.arraycopy(jArr, max, jArr2, 0, i3);
                if (this.sAnalyseHandler != null) {
                    this.sAnalyseHandler.post(new C10057a(jArr2, bVar));
                }
            }
        }
    }
}
