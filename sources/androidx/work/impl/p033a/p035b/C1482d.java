package androidx.work.impl.p033a.p035b;

import android.content.Context;
import androidx.work.impl.p033a.C1467a;
import com.C1642a;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: androidx.work.impl.a.b.d */
public abstract class C1482d<T> {

    /* renamed from: a */
    protected final Context f5692a;

    /* renamed from: b */
    private final Object f5693b = new Object();

    /* renamed from: c */
    private final Set<C1467a<T>> f5694c = new LinkedHashSet();

    /* renamed from: d */
    private T f5695d;

    /* renamed from: b */
    public abstract T mo6722b();

    /* renamed from: c */
    public abstract void mo6723c();

    /* renamed from: d */
    public abstract void mo6724d();

    C1482d(Context context) {
        this.f5692a = context.getApplicationContext();
    }

    /* renamed from: b */
    public final void mo6728b(C1467a<T> aVar) {
        synchronized (this.f5693b) {
            if (this.f5694c.remove(aVar) && this.f5694c.isEmpty()) {
                mo6724d();
            }
        }
    }

    /* renamed from: a */
    public final void mo6726a(C1467a<T> aVar) {
        synchronized (this.f5693b) {
            if (this.f5694c.add(aVar)) {
                if (this.f5694c.size() == 1) {
                    this.f5695d = mo6722b();
                    C1642a.m8034a("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f5695d});
                    mo6723c();
                }
                aVar.mo6708a(this.f5695d);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6727a(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5693b
            monitor-enter(r0)
            T r1 = r3.f5695d     // Catch:{ all -> 0x0037 }
            if (r1 == r4) goto L_0x0035
            T r1 = r3.f5695d     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0014
            T r1 = r3.f5695d     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0035
        L_0x0014:
            r3.f5695d = r4     // Catch:{ all -> 0x0037 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0037 }
            java.util.Set<androidx.work.impl.a.a<T>> r1 = r3.f5694c     // Catch:{ all -> 0x0037 }
            r4.<init>(r1)     // Catch:{ all -> 0x0037 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0021:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0037 }
            androidx.work.impl.a.a r1 = (androidx.work.impl.p033a.C1467a) r1     // Catch:{ all -> 0x0037 }
            T r2 = r3.f5695d     // Catch:{ all -> 0x0037 }
            r1.mo6708a(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x0021
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p033a.p035b.C1482d.mo6727a(java.lang.Object):void");
    }
}
