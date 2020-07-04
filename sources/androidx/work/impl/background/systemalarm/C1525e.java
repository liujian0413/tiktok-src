package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import androidx.work.impl.C1466a;
import androidx.work.impl.C1490b;
import androidx.work.impl.C1544f;
import androidx.work.impl.utils.C1574f;
import com.C1642a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.e */
public final class C1525e implements C1466a {

    /* renamed from: a */
    final Context f5799a;

    /* renamed from: b */
    public final C1531g f5800b;

    /* renamed from: c */
    public final C1490b f5801c;

    /* renamed from: d */
    public final C1544f f5802d;

    /* renamed from: e */
    final C1522b f5803e;

    /* renamed from: f */
    final List<Intent> f5804f;

    /* renamed from: g */
    Intent f5805g;

    /* renamed from: h */
    private final Handler f5806h;

    /* renamed from: i */
    private C1528b f5807i;

    /* renamed from: androidx.work.impl.background.systemalarm.e$a */
    static class C1527a implements Runnable {

        /* renamed from: a */
        private final C1525e f5809a;

        /* renamed from: b */
        private final Intent f5810b;

        /* renamed from: c */
        private final int f5811c;

        public final void run() {
            this.f5809a.mo6787a(this.f5810b, this.f5811c);
        }

        C1527a(C1525e eVar, Intent intent, int i) {
            this.f5809a = eVar;
            this.f5810b = intent;
            this.f5811c = i;
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$b */
    interface C1528b {
        /* renamed from: a */
        void mo6778a();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$c */
    static class C1529c implements Runnable {

        /* renamed from: a */
        private final C1525e f5812a;

        public final void run() {
            this.f5812a.mo6788b();
        }

        C1529c(C1525e eVar) {
            this.f5812a = eVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6784a() {
        this.f5801c.mo6741b((C1466a) this);
        this.f5807i = null;
    }

    /* renamed from: d */
    private void m7543d() {
        if (this.f5806h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: c */
    private void m7542c() {
        m7543d();
        WakeLock a = C1574f.m7666a(this.f5799a, "ProcessCommand");
        try {
            a.acquire();
            this.f5802d.f5837d.mo6840a(new Runnable() {
                public final void run() {
                    C1525e eVar;
                    C1529c cVar;
                    synchronized (C1525e.this.f5804f) {
                        C1525e.this.f5805g = (Intent) C1525e.this.f5804f.get(0);
                    }
                    if (C1525e.this.f5805g != null) {
                        String action = C1525e.this.f5805g.getAction();
                        int intExtra = C1525e.this.f5805g.getIntExtra("KEY_START_ID", 0);
                        C1642a.m8034a("Processing command %s, %s", new Object[]{C1525e.this.f5805g, Integer.valueOf(intExtra)});
                        WakeLock a = C1574f.m7666a(C1525e.this.f5799a, C1642a.m8034a("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                        try {
                            C1642a.m8034a("Acquiring operation wake lock (%s) %s", new Object[]{action, a});
                            a.acquire();
                            C1525e.this.f5803e.mo6779a(C1525e.this.f5805g, intExtra, C1525e.this);
                            C1642a.m8034a("Releasing operation wake lock (%s) %s", new Object[]{action, a});
                            a.release();
                            eVar = C1525e.this;
                            cVar = new C1529c(C1525e.this);
                        } catch (Throwable th) {
                            C1642a.m8034a("Releasing operation wake lock (%s) %s", new Object[]{action, a});
                            a.release();
                            C1525e.this.mo6786a((Runnable) new C1529c(C1525e.this));
                            throw th;
                        }
                        eVar.mo6786a((Runnable) cVar);
                    }
                }
            });
        } finally {
            a.release();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6788b() {
        m7543d();
        synchronized (this.f5804f) {
            if (this.f5805g != null) {
                C1642a.m8034a("Removing command %s", new Object[]{this.f5805g});
                if (((Intent) this.f5804f.remove(0)).equals(this.f5805g)) {
                    this.f5805g = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            if (this.f5803e.mo6780a() || !this.f5804f.isEmpty()) {
                if (!this.f5804f.isEmpty()) {
                    m7542c();
                }
            } else if (this.f5807i != null) {
                this.f5807i.mo6778a();
            }
        }
    }

    C1525e(Context context) {
        this(context, null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6785a(C1528b bVar) {
        if (this.f5807i == null) {
            this.f5807i = bVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6786a(Runnable runnable) {
        this.f5806h.post(runnable);
    }

    /* renamed from: a */
    private boolean m7541a(String str) {
        m7543d();
        synchronized (this.f5804f) {
            for (Intent action : this.f5804f) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo6707a(String str, boolean z) {
        mo6786a((Runnable) new C1527a(this, C1522b.m7519a(this.f5799a, str, z), 0));
    }

    /* renamed from: a */
    public final boolean mo6787a(Intent intent, int i) {
        C1642a.m8034a("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)});
        m7543d();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m7541a("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f5804f) {
            boolean z = !this.f5804f.isEmpty();
            this.f5804f.add(intent);
            if (!z) {
                m7542c();
            }
        }
        return true;
    }

    private C1525e(Context context, C1490b bVar, C1544f fVar) {
        this.f5799a = context.getApplicationContext();
        this.f5803e = new C1522b(this.f5799a);
        this.f5800b = new C1531g();
        this.f5802d = C1544f.m7577c();
        this.f5801c = this.f5802d.f5839f;
        this.f5801c.mo6738a((C1466a) this);
        this.f5804f = new ArrayList();
        this.f5805g = null;
        this.f5806h = new Handler(Looper.getMainLooper());
    }
}
