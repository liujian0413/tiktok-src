package androidx.work.impl.background.systemalarm;

import com.C1642a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.work.impl.background.systemalarm.g */
final class C1531g {

    /* renamed from: a */
    final Map<String, C1533b> f5814a = new HashMap();

    /* renamed from: b */
    final Map<String, C1532a> f5815b = new HashMap();

    /* renamed from: c */
    final Object f5816c = new Object();

    /* renamed from: d */
    private final ScheduledExecutorService f5817d = C1534h.m7557a();

    /* renamed from: androidx.work.impl.background.systemalarm.g$a */
    interface C1532a {
        /* renamed from: a */
        void mo6783a(String str);
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$b */
    static class C1533b implements Runnable {

        /* renamed from: a */
        private final C1531g f5818a;

        /* renamed from: b */
        private final String f5819b;

        public final void run() {
            synchronized (this.f5818a.f5816c) {
                if (((C1533b) this.f5818a.f5814a.remove(this.f5819b)) != null) {
                    C1532a aVar = (C1532a) this.f5818a.f5815b.remove(this.f5819b);
                    if (aVar != null) {
                        aVar.mo6783a(this.f5819b);
                    }
                } else {
                    C1642a.m8034a("Timer with %s is already marked as complete.", new Object[]{this.f5819b});
                }
            }
        }

        C1533b(C1531g gVar, String str) {
            this.f5818a = gVar;
            this.f5819b = str;
        }
    }

    C1531g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6792a(String str) {
        synchronized (this.f5816c) {
            if (((C1533b) this.f5814a.remove(str)) != null) {
                C1642a.m8034a("Stopping timer for %s", new Object[]{str});
                this.f5815b.remove(str);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6793a(String str, long j, C1532a aVar) {
        synchronized (this.f5816c) {
            C1642a.m8034a("Starting timer for %s", new Object[]{str});
            mo6792a(str);
            C1533b bVar = new C1533b(this, str);
            this.f5814a.put(str, bVar);
            this.f5815b.put(str, aVar);
            this.f5817d.schedule(bVar, 600000, TimeUnit.MILLISECONDS);
        }
    }
}
