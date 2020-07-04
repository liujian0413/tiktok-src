package bolts;

import com.C1642a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: bolts.f */
public final class C1590f implements Closeable {

    /* renamed from: a */
    public final Object f5951a = new Object();

    /* renamed from: b */
    public ScheduledFuture<?> f5952b;

    /* renamed from: c */
    private final List<C1589e> f5953c = new ArrayList();

    /* renamed from: d */
    private final ScheduledExecutorService f5954d = C1584b.m7829b();

    /* renamed from: e */
    private boolean f5955e;

    /* renamed from: f */
    private boolean f5956f;

    /* renamed from: d */
    private void m7841d() {
        if (this.f5956f) {
            throw new IllegalStateException("Object already closed");
        }
    }

    /* renamed from: e */
    private void m7842e() {
        if (this.f5952b != null) {
            this.f5952b.cancel(true);
            this.f5952b = null;
        }
    }

    /* renamed from: b */
    public final C1588d mo6870b() {
        C1588d dVar;
        synchronized (this.f5951a) {
            m7841d();
            dVar = new C1588d(this);
        }
        return dVar;
    }

    /* renamed from: a */
    public final boolean mo6869a() {
        boolean z;
        synchronized (this.f5951a) {
            m7841d();
            z = this.f5955e;
        }
        return z;
    }

    /* renamed from: c */
    public final void mo6871c() {
        synchronized (this.f5951a) {
            m7841d();
            if (!this.f5955e) {
                m7842e();
                this.f5955e = true;
                ArrayList arrayList = new ArrayList(this.f5953c);
                m7840a((List<C1589e>) arrayList);
            }
        }
    }

    public final void close() {
        synchronized (this.f5951a) {
            if (!this.f5956f) {
                m7842e();
                for (C1589e close : this.f5953c) {
                    close.close();
                }
                this.f5953c.clear();
                this.f5956f = true;
            }
        }
    }

    public final String toString() {
        return C1642a.m8035a(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(mo6869a())});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6868a(C1589e eVar) {
        synchronized (this.f5951a) {
            m7841d();
            this.f5953c.remove(eVar);
        }
    }

    /* renamed from: a */
    private static void m7840a(List<C1589e> list) {
        for (C1589e a : list) {
            a.mo6866a();
        }
    }
}
