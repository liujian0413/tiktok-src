package p346io.reactivex.internal.disposables;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.util.C47836e;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.disposables.b */
public final class C47606b implements C7321c, C47605a {

    /* renamed from: a */
    List<C7321c> f122049a;

    /* renamed from: b */
    volatile boolean f122050b;

    public final boolean isDisposed() {
        return this.f122050b;
    }

    public final void dispose() {
        if (!this.f122050b) {
            synchronized (this) {
                if (!this.f122050b) {
                    this.f122050b = true;
                    List<C7321c> list = this.f122049a;
                    this.f122049a = null;
                    m148398a(list);
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo119663b(C7321c cVar) {
        if (!mo119664c(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    /* renamed from: a */
    public final boolean mo119661a(C7321c cVar) {
        C7364b.m23081a(cVar, "d is null");
        if (!this.f122050b) {
            synchronized (this) {
                if (!this.f122050b) {
                    List list = this.f122049a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f122049a = list;
                    }
                    list.add(cVar);
                    return true;
                }
            }
        }
        cVar.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo119664c(p346io.reactivex.p347b.C7321c r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            p346io.reactivex.internal.p352a.C7364b.m23081a(r3, r0)
            boolean r0 = r2.f122050b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f122050b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<io.reactivex.b.c> r0 = r2.f122049a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.internal.disposables.C47606b.mo119664c(io.reactivex.b.c):boolean");
    }

    /* renamed from: a */
    private static void m148398a(List<C7321c> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (C7321c dispose : list) {
                try {
                    dispose.dispose();
                } catch (Throwable th) {
                    C7331a.m23009b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C47836e.m148716a((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }
}
