package p346io.reactivex.p347b;

import java.util.ArrayList;
import java.util.List;
import p346io.reactivex.exceptions.C7331a;
import p346io.reactivex.exceptions.CompositeException;
import p346io.reactivex.internal.disposables.C47605a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.util.C47836e;
import p346io.reactivex.internal.util.C47840h;

/* renamed from: io.reactivex.b.b */
public final class C47562b implements C7321c, C47605a {

    /* renamed from: a */
    C47840h<C7321c> f122012a;

    /* renamed from: b */
    volatile boolean f122013b;

    public final boolean isDisposed() {
        return this.f122013b;
    }

    /* renamed from: a */
    public final void mo119660a() {
        if (!this.f122013b) {
            synchronized (this) {
                if (!this.f122013b) {
                    C47840h<C7321c> hVar = this.f122012a;
                    this.f122012a = null;
                    m148342a(hVar);
                }
            }
        }
    }

    public final void dispose() {
        if (!this.f122013b) {
            synchronized (this) {
                if (!this.f122013b) {
                    this.f122013b = true;
                    C47840h<C7321c> hVar = this.f122012a;
                    this.f122012a = null;
                    m148342a(hVar);
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
        if (!this.f122013b) {
            synchronized (this) {
                if (!this.f122013b) {
                    C47840h<C7321c> hVar = this.f122012a;
                    if (hVar == null) {
                        hVar = new C47840h<>();
                        this.f122012a = hVar;
                    }
                    hVar.mo119916a(cVar);
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
            boolean r0 = r2.f122013b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f122013b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            io.reactivex.internal.util.h<io.reactivex.b.c> r0 = r2.f122012a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo119917b(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p346io.reactivex.p347b.C47562b.mo119664c(io.reactivex.b.c):boolean");
    }

    /* renamed from: a */
    private static void m148342a(C47840h<C7321c> hVar) {
        T[] tArr;
        if (hVar != null) {
            List list = null;
            for (T t : hVar.f122627e) {
                if (t instanceof C7321c) {
                    try {
                        ((C7321c) t).dispose();
                    } catch (Throwable th) {
                        C7331a.m23009b(th);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(th);
                    }
                }
            }
            if (list == null) {
                return;
            }
            if (list.size() == 1) {
                throw C47836e.m148716a((Throwable) list.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) list);
        }
    }

    /* renamed from: a */
    public final boolean mo119662a(C7321c... cVarArr) {
        C7364b.m23081a(cVarArr, "ds is null");
        if (!this.f122013b) {
            synchronized (this) {
                if (!this.f122013b) {
                    C47840h<C7321c> hVar = this.f122012a;
                    if (hVar == null) {
                        hVar = new C47840h<>(3);
                        this.f122012a = hVar;
                    }
                    for (int i = 0; i < 2; i++) {
                        C7321c cVar = cVarArr[i];
                        C7364b.m23081a(cVar, "d is null");
                        hVar.mo119916a(cVar);
                    }
                    return true;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            cVarArr[i2].dispose();
        }
        return false;
    }
}
