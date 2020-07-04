package com.bytedance.android.livesdkapi.depend.p441d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdkapi.depend.p441d.C9303a.C9305a;
import com.bytedance.android.livesdkapi.depend.p441d.C9303a.C9307c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.android.livesdkapi.depend.d.b */
public class C9309b {

    /* renamed from: a */
    public static final String f25492a = "b";

    /* renamed from: b */
    public static volatile C9307c f25493b;

    /* renamed from: c */
    private static final String f25494c;

    /* renamed from: d */
    private static final C9307c f25495d = new C9307c() {
        /* renamed from: a */
        public final void mo21812a() {
            if (C9309b.f25493b != null) {
                C9309b.f25493b.mo21812a();
            }
        }
    };

    /* renamed from: e */
    private static volatile C9309b f25496e;

    /* renamed from: f */
    private boolean f25497f;

    /* renamed from: g */
    private Executor f25498g;

    /* renamed from: h */
    private Handler f25499h;

    private C9309b() {
    }

    /* renamed from: a */
    public final void mo22790a(Callable callable) {
        m27671b(null, callable, 0);
    }

    /* renamed from: b */
    private synchronized void m27670b() {
        m27665a(64);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f25492a);
        sb.append("-Thread");
        f25494c = sb.toString();
    }

    /* renamed from: a */
    public static C9309b m27663a() {
        if (f25496e == null) {
            synchronized (C9309b.class) {
                if (f25496e == null) {
                    C9309b bVar = new C9309b();
                    f25496e = bVar;
                    bVar.m27670b();
                }
            }
        }
        return f25496e;
    }

    /* renamed from: a */
    private synchronized void m27665a(int i) {
        m27666a(64, f25494c);
    }

    /* renamed from: a */
    private static void m27668a(C9309b bVar) {
        if (!bVar.f25497f) {
            throw new IllegalStateException("LiveTaskManager: Must call init() before use.");
        }
    }

    /* renamed from: a */
    private synchronized void m27669a(Executor executor) {
        this.f25498g = executor;
        this.f25499h = new Handler(Looper.getMainLooper());
        this.f25497f = true;
    }

    /* renamed from: a */
    public final synchronized void mo22788a(C9307c cVar) {
        f25493b = cVar;
    }

    /* renamed from: a */
    public final void mo22789a(Runnable runnable) {
        m27668a(this);
        if (this.f25499h != null) {
            this.f25499h.post(runnable);
        }
    }

    /* renamed from: a */
    private synchronized void m27666a(int i, String str) {
        m27667a(i, str, f25495d);
    }

    /* renamed from: a */
    private static Runnable m27664a(final Handler handler, final Callable callable, final int i) {
        return new Runnable() {
            public final void run() {
                if (handler == null) {
                    try {
                        callable.call();
                    } catch (Exception unused) {
                    }
                } else {
                    Message obtainMessage = handler.obtainMessage(i);
                    try {
                        obtainMessage.obj = callable.call();
                    } catch (Exception e) {
                        obtainMessage.obj = e;
                    }
                    handler.sendMessage(obtainMessage);
                }
            }
        };
    }

    /* renamed from: b */
    private void m27671b(Handler handler, Callable callable, int i) {
        m27668a(this);
        this.f25498g.execute(m27664a((Handler) null, callable, 0));
    }

    /* renamed from: a */
    private synchronized void m27667a(int i, String str, C9307c cVar) {
        m27669a((Executor) new C9305a().mo22782a(i).mo22784a(str).mo22783a(cVar).mo22785a());
    }
}
