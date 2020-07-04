package com.google.common.util.concurrent;

import com.google.common.base.C17439m;
import java.lang.Throwable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: com.google.common.util.concurrent.a */
abstract class C18223a<V, X extends Throwable, F, T> extends C18235h<V> implements Runnable {

    /* renamed from: a */
    C18253l<? extends V> f49587a;

    /* renamed from: b */
    Class<X> f49588b;

    /* renamed from: c */
    F f49589c;

    /* renamed from: com.google.common.util.concurrent.a$a */
    static final class C18224a<V, X extends Throwable> extends C18223a<V, X, C18241d<? super X, ? extends V>, C18253l<? extends V>> {
        /* access modifiers changed from: private */
        /* renamed from: c */
        public void mo47082a(C18253l<? extends V> lVar) {
            mo47086a(lVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo47080a(Object obj, Throwable th) throws Exception {
            return m60148a((C18241d) obj, (X) th);
        }

        /* renamed from: a */
        private static C18253l<? extends V> m60148a(C18241d<? super X, ? extends V> dVar, X x) throws Exception {
            C18253l<? extends V> a = dVar.mo47108a(x);
            C17439m.m57963a(a, (Object) "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)?");
            return a;
        }

        C18224a(C18253l<? extends V> lVar, Class<X> cls, C18241d<? super X, ? extends V> dVar) {
            super(lVar, cls, dVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo47080a(F f, X x) throws Exception;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo47082a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47083b() {
        mo47085a((Future<?>) this.f49587a);
        this.f49587a = null;
        this.f49588b = null;
        this.f49589c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo47081a() {
        C18253l<? extends V> lVar = this.f49587a;
        Class<X> cls = this.f49588b;
        F f = this.f49589c;
        String a = super.mo47081a();
        String str = "";
        if (lVar != null) {
            StringBuilder sb = new StringBuilder("inputFuture=[");
            sb.append(lVar);
            sb.append("], ");
            str = sb.toString();
        }
        if (cls != null && f != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(cls);
            sb2.append("], fallback=[");
            sb2.append(f);
            sb2.append("]");
            return sb2.toString();
        } else if (a == null) {
            return null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(a);
            return sb3.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.common.util.concurrent.l<? extends V> r0 = r7.f49587a
            java.lang.Class<X> r1 = r7.f49588b
            F r2 = r7.f49589c
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            r3 = 1
        L_0x0016:
            r3 = r3 | r5
            boolean r4 = r7.isCancelled()
            r3 = r3 | r4
            if (r3 == 0) goto L_0x001f
            return
        L_0x001f:
            r3 = 0
            r7.f49587a = r3
            java.lang.Object r0 = com.google.common.util.concurrent.C18246h.m60212a(r0)     // Catch:{ ExecutionException -> 0x002b, Throwable -> 0x0029 }
            r4 = r0
            r0 = r3
            goto L_0x0037
        L_0x0029:
            r0 = move-exception
            goto L_0x0036
        L_0x002b:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Object r0 = com.google.common.base.C17439m.m57962a(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L_0x0036:
            r4 = r3
        L_0x0037:
            if (r0 != 0) goto L_0x003d
            r7.mo47088b(r4)
            return
        L_0x003d:
            boolean r1 = com.google.common.util.concurrent.C18258n.m60219a(r0, r1)
            if (r1 != 0) goto L_0x0047
            r7.mo47087a(r0)
            return
        L_0x0047:
            java.lang.Object r0 = r7.mo47080a(r2, r0)     // Catch:{ Throwable -> 0x0055 }
            r7.f49588b = r3
            r7.f49589c = r3
            r7.mo47082a(r0)
            return
        L_0x0053:
            r0 = move-exception
            goto L_0x005e
        L_0x0055:
            r0 = move-exception
            r7.mo47087a(r0)     // Catch:{ all -> 0x0053 }
            r7.f49588b = r3
            r7.f49589c = r3
            return
        L_0x005e:
            r7.f49588b = r3
            r7.f49589c = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C18223a.run():void");
    }

    C18223a(C18253l<? extends V> lVar, Class<X> cls, F f) {
        this.f49587a = (C18253l) C17439m.m57962a(lVar);
        this.f49588b = (Class) C17439m.m57962a(cls);
        this.f49589c = C17439m.m57962a(f);
    }

    /* renamed from: a */
    static <X extends Throwable, V> C18253l<V> m60143a(C18253l<? extends V> lVar, Class<X> cls, C18241d<? super X, ? extends V> dVar, Executor executor) {
        C18224a aVar = new C18224a(lVar, cls, dVar);
        lVar.mo6818a(aVar, C18254m.m60218a(executor, aVar));
        return aVar;
    }
}
