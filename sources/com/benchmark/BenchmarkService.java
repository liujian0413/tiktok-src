package com.benchmark;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.benchmark.C2002h.C2003a;
import com.benchmark.C2010l.C2011a;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.vesdk.VEBenchmark;
import java.util.List;

public class BenchmarkService extends Service {

    /* renamed from: a */
    private volatile Looper f6999a;

    /* renamed from: b */
    private volatile C1956a f7000b;

    /* renamed from: c */
    private final C2011a f7001c = new C2011a() {
        /* renamed from: a */
        public final void mo7602a(C2007k kVar) {
            BenchmarkService.this.mo7597a(kVar);
        }
    };

    /* renamed from: d */
    private final C2003a f7002d = new C2003a() {
        /* renamed from: a */
        public final void mo7603a(List list, C1999g gVar) {
            BenchmarkService.this.mo7598a(list, gVar);
        }
    };

    /* renamed from: com.benchmark.BenchmarkService$a */
    final class C1956a extends Handler {
        public final void handleMessage(Message message) {
            if (message.what == 0) {
                C1998f fVar = (C1998f) message.obj;
                int b = fVar.f7069b.mo7605b();
                if (b == 0) {
                    fVar.run();
                } else {
                    try {
                        C1999g gVar = fVar.f7070c;
                        Benchmark benchmark = fVar.f7068a;
                        BenchmarkResult benchmarkResult = new BenchmarkResult(fVar.f7068a, b, "depend runtime is not ready", null, null);
                        gVar.mo7617b(benchmark, benchmarkResult);
                    } catch (RemoteException e) {
                        C1957a.m8943a((Throwable) e);
                    }
                }
                try {
                    fVar.f7069b.mo7606c();
                } catch (Throwable th) {
                    C1957a.m8943a(th);
                }
                if (fVar.f7071d) {
                    C2013m.m9071a().mo7659c();
                }
                return;
            }
            if (1 == message.what) {
                C2007k kVar = (C2007k) message.obj;
                if (C2013m.m9071a().mo7658b() == 0) {
                    try {
                        kVar.mo7625a(VEBenchmark.m142412a().mo107779c());
                    } catch (RemoteException e2) {
                        C1957a.m8943a((Throwable) e2);
                    }
                    C2013m.m9071a().mo7659c();
                }
            }
        }

        C1956a(Looper looper) {
            super(looper);
        }
    }

    public void onDestroy() {
        this.f6999a.quit();
    }

    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("com/benchmark");
        handlerThread.start();
        this.f6999a = handlerThread.getLooper();
        this.f7000b = new C1956a(this.f6999a);
    }

    /* renamed from: a */
    private void m8934a(C1998f fVar) {
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = fVar;
        this.f7000b.sendMessage(obtain);
    }

    /* renamed from: a */
    public final void mo7597a(C2007k kVar) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = kVar;
        this.f7000b.sendMessage(obtain);
    }

    public IBinder onBind(Intent intent) {
        if (1 == intent.getIntExtra("bind_type", 0)) {
            return this.f7001c.asBinder();
        }
        return this.f7002d.asBinder();
    }

    /* renamed from: a */
    public final void mo7598a(List<Benchmark> list, C1999g gVar) {
        if (!C6311g.m19573a(list)) {
            for (int i = 0; i < list.size(); i++) {
                Benchmark benchmark = (Benchmark) list.get(i);
                C1998f fVar = new C1998f(benchmark, C1957a.m8942a(getApplicationContext(), benchmark), gVar);
                if (i == list.size() - 1) {
                    fVar.f7071d = true;
                }
                m8934a(fVar);
            }
        }
    }
}
