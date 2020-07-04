package com.benchmark;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.benchmark.C1999g.C2000a;
import com.benchmark.C2002h.C2003a;
import com.benchmark.C2007k.C2008a;
import com.benchmark.C2010l.C2011a;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.benchmark.b */
public final class C1977b {

    /* renamed from: h */
    private static C1977b f7016h;

    /* renamed from: a */
    public Context f7017a;

    /* renamed from: b */
    public C2005i f7018b;

    /* renamed from: c */
    public C1981c f7019c = null;

    /* renamed from: d */
    public C2002h f7020d;

    /* renamed from: e */
    public C2010l f7021e;

    /* renamed from: f */
    Handler f7022f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private boolean f7023g;

    /* renamed from: i */
    private C1979a f7024i = new C1979a();

    /* renamed from: j */
    private C1982d f7025j = null;

    /* renamed from: k */
    private C1980b f7026k = null;

    /* renamed from: com.benchmark.b$a */
    class C1979a extends C2000a {

        /* renamed from: a */
        Benchmark f7027a;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ void mo7616b(Benchmark benchmark) {
            this.f7027a = benchmark;
        }

        private C1979a() {
        }

        /* renamed from: a */
        public final void mo7614a(Benchmark benchmark) {
            C1977b.this.mo7612a((Runnable) new C1997e(this, benchmark));
        }

        /* renamed from: b */
        public final void mo7617b(Benchmark benchmark, BenchmarkResult benchmarkResult) {
            C1977b.this.mo7612a((Runnable) new C1996d(this, benchmark, benchmarkResult));
        }

        /* renamed from: a */
        public final void mo7615a(Benchmark benchmark, BenchmarkResult benchmarkResult) {
            C1977b.this.mo7612a((Runnable) new C1995c(this, benchmark, benchmarkResult));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final /* synthetic */ void mo7618c(Benchmark benchmark, BenchmarkResult benchmarkResult) {
            this.f7027a = null;
            if (C1977b.this.f7018b != null) {
                C1977b.this.f7018b.mo7633b(benchmark, benchmarkResult);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final /* synthetic */ void mo7619d(Benchmark benchmark, BenchmarkResult benchmarkResult) {
            this.f7027a = null;
            if (C1977b.this.f7018b != null) {
                C1977b.this.f7018b.mo7630a(benchmark, benchmarkResult);
            }
        }
    }

    /* renamed from: com.benchmark.b$b */
    class C1980b implements ServiceConnection {

        /* renamed from: a */
        public C1979a f7029a;

        /* renamed from: c */
        private List<Benchmark> f7031c = new ArrayList();

        /* renamed from: a */
        public final void mo7620a(List<Benchmark> list) {
            this.f7031c.clear();
            this.f7031c.addAll(list);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C1977b.this.f7020d = null;
            if (C1977b.this.f7018b != null) {
                if (this.f7029a.f7027a != null) {
                    C2005i iVar = C1977b.this.f7018b;
                    Benchmark benchmark = this.f7029a.f7027a;
                    BenchmarkResult benchmarkResult = new BenchmarkResult(this.f7029a.f7027a, 10001, "ServiceDisconnected", null, null);
                    iVar.mo7633b(benchmark, benchmarkResult);
                }
                C1977b.this.f7018b.mo7628a();
            }
        }

        C1980b(C1979a aVar) {
            this.f7029a = aVar;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1977b.this.f7020d = C2003a.m9057a(iBinder);
            if (C1977b.this.f7020d != null) {
                try {
                    C1977b.this.f7020d.mo7603a(this.f7031c, this.f7029a);
                } catch (Throwable th) {
                    C1957a.m8943a(th);
                }
            }
        }
    }

    /* renamed from: com.benchmark.b$c */
    class C1981c implements ServiceConnection {

        /* renamed from: a */
        C1982d f7032a;

        /* renamed from: b */
        final /* synthetic */ C1977b f7033b;

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f7033b.f7021e = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f7033b.f7021e = C2011a.m9069a(iBinder);
            if (this.f7033b.f7021e != null) {
                try {
                    this.f7033b.f7021e.mo7602a(this.f7032a);
                } catch (Throwable th) {
                    C1957a.m8943a(th);
                }
            }
        }
    }

    /* renamed from: com.benchmark.b$d */
    class C1982d extends C2008a {

        /* renamed from: a */
        final /* synthetic */ C1977b f7034a;

        /* renamed from: a */
        public final void mo7625a(Map map) {
            this.f7034a.f7017a.unbindService(this.f7034a.f7019c);
            this.f7034a.f7021e = null;
        }
    }

    /* renamed from: a */
    public final void mo7611a() {
        m9009b();
    }

    static {
        TENativeLibsLoader.m67982a(((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().getLibraryLoader(AwemeApplication.m21341a()));
    }

    /* renamed from: b */
    private void m9009b() {
        try {
            if (this.f7023g) {
                this.f7017a.unbindService(this.f7026k);
                this.f7020d = null;
                this.f7023g = false;
            }
        } catch (Throwable th) {
            C1957a.m8943a(th);
        }
    }

    /* renamed from: a */
    public final void mo7612a(Runnable runnable) {
        this.f7022f.post(runnable);
    }

    /* renamed from: a */
    public static C1977b m9007a(Context context) {
        if (f7016h == null) {
            f7016h = new C1977b(context);
        }
        return f7016h;
    }

    private C1977b(Context context) {
        this.f7017a = context;
    }

    /* renamed from: a */
    public final void mo7613a(List<Benchmark> list) throws RemoteException {
        if (this.f7020d == null) {
            if (this.f7026k == null) {
                this.f7026k = new C1980b(this.f7024i);
            }
            this.f7026k.mo7620a(list);
            m9008a(0, this.f7026k);
            return;
        }
        this.f7020d.mo7603a(list, this.f7024i);
    }

    /* renamed from: a */
    private void m9008a(int i, ServiceConnection serviceConnection) {
        try {
            Intent intent = new Intent(this.f7017a, BenchmarkService.class);
            intent.setPackage(this.f7017a.getPackageName());
            intent.putExtra("bind_type", 0);
            if (this.f7017a.bindService(intent, serviceConnection, 1)) {
                this.f7023g = true;
            }
        } catch (Throwable th) {
            C1957a.m8943a(th);
        }
    }
}
