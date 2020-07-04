package bolts;

import java.io.Closeable;

/* renamed from: bolts.e */
public final class C1589e implements Closeable {

    /* renamed from: a */
    private final Object f5947a;

    /* renamed from: b */
    private C1590f f5948b;

    /* renamed from: c */
    private Runnable f5949c;

    /* renamed from: d */
    private boolean f5950d;

    /* renamed from: b */
    private void m7838b() {
        if (this.f5950d) {
            throw new IllegalStateException("Object already closed");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6866a() {
        synchronized (this.f5947a) {
            m7838b();
            this.f5949c.run();
            close();
        }
    }

    public final void close() {
        synchronized (this.f5947a) {
            if (!this.f5950d) {
                this.f5950d = true;
                this.f5948b.mo6868a(this);
                this.f5948b = null;
                this.f5949c = null;
            }
        }
    }
}
