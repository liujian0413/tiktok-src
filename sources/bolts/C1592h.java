package bolts;

import com.C1642a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bolts.h */
public class C1592h<TResult> {

    /* renamed from: a */
    public static final ExecutorService f5957a = C1584b.m7828a();

    /* renamed from: b */
    public static final Executor f5958b = C1581a.m7827b();

    /* renamed from: c */
    private static final Executor f5959c = C1584b.m7830c();

    /* renamed from: d */
    private static volatile C1605a f5960d;

    /* renamed from: m */
    private static C1592h<?> f5961m = new C1592h<>((TResult) null);

    /* renamed from: n */
    private static C1592h<Boolean> f5962n = new C1592h<>((TResult) Boolean.valueOf(true));

    /* renamed from: o */
    private static C1592h<Boolean> f5963o = new C1592h<>((TResult) Boolean.valueOf(false));

    /* renamed from: p */
    private static C1592h<?> f5964p = new C1592h<>(true);

    /* renamed from: e */
    private final Object f5965e = new Object();

    /* renamed from: f */
    private boolean f5966f;

    /* renamed from: g */
    private boolean f5967g;

    /* renamed from: h */
    private TResult f5968h;

    /* renamed from: i */
    private Exception f5969i;

    /* renamed from: j */
    private boolean f5970j;

    /* renamed from: k */
    private C1607j f5971k;

    /* renamed from: l */
    private List<C1591g<TResult, Void>> f5972l = new ArrayList();

    /* renamed from: bolts.h$a */
    public interface C1605a {
    }

    /* renamed from: a */
    public static C1605a m7847a() {
        return f5960d;
    }

    /* renamed from: h */
    public static <TResult> C1592h<TResult> m7865h() {
        return f5964p;
    }

    /* renamed from: a */
    public final boolean mo6878a(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean b;
        synchronized (this.f5965e) {
            if (!mo6882b()) {
                this.f5965e.wait(timeUnit.toMillis(j));
            }
            b = mo6882b();
        }
        return b;
    }

    /* renamed from: a */
    public final <TContinuationResult> C1592h<TContinuationResult> mo6876a(C1591g<TResult, TContinuationResult> gVar, Executor executor) {
        return mo6877a(gVar, executor, (C1588d) null);
    }

    /* renamed from: a */
    public final <TContinuationResult> C1592h<TContinuationResult> mo6877a(C1591g<TResult, TContinuationResult> gVar, Executor executor, C1588d dVar) {
        boolean b;
        C1606i iVar = new C1606i();
        synchronized (this.f5965e) {
            b = mo6882b();
            if (!b) {
                List<C1591g<TResult, Void>> list = this.f5972l;
                final C1606i iVar2 = iVar;
                final C1591g<TResult, TContinuationResult> gVar2 = gVar;
                final Executor executor2 = executor;
                final C1588d dVar2 = dVar;
                C15962 r0 = new C1591g<TResult, Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(C1592h<TResult> hVar) {
                        C1592h.m7857a(iVar2, gVar2, hVar, executor2, dVar2);
                        return null;
                    }
                };
                list.add(r0);
            }
        }
        if (b) {
            m7857a(iVar, gVar, this, executor, dVar);
        }
        return iVar.f6010a;
    }

    /* renamed from: a */
    public final <TContinuationResult> C1592h<TContinuationResult> mo6875a(C1591g<TResult, TContinuationResult> gVar) {
        return mo6877a(gVar, f5959c, (C1588d) null);
    }

    /* renamed from: a */
    public static <TContinuationResult, TResult> void m7857a(final C1606i<TContinuationResult> iVar, final C1591g<TResult, TContinuationResult> gVar, final C1592h<TResult> hVar, Executor executor, final C1588d dVar) {
        try {
            executor.execute(new Runnable() {
                public final void run() {
                    if (dVar == null || !dVar.mo6864a()) {
                        try {
                            iVar.mo6903b(gVar.then(hVar));
                        } catch (CancellationException unused) {
                            iVar.mo6901b();
                        } catch (Exception e) {
                            iVar.mo6902b(e);
                        }
                    } else {
                        iVar.mo6901b();
                    }
                }
            });
        } catch (Exception e) {
            iVar.mo6902b((Exception) new ExecutorException(e));
        }
    }

    /* renamed from: e */
    public final TResult mo6890e() {
        TResult tresult;
        synchronized (this.f5965e) {
            tresult = this.f5968h;
        }
        return tresult;
    }

    C1592h() {
    }

    /* renamed from: f */
    public final Exception mo6891f() {
        Exception exc;
        synchronized (this.f5965e) {
            if (this.f5969i != null) {
                this.f5970j = true;
                if (this.f5971k != null) {
                    this.f5971k.mo6904a();
                    this.f5971k = null;
                }
            }
            exc = this.f5969i;
        }
        return exc;
    }

    /* renamed from: g */
    public final void mo6892g() throws InterruptedException {
        synchronized (this.f5965e) {
            if (!mo6882b()) {
                this.f5965e.wait();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo6893i() {
        synchronized (this.f5965e) {
            if (this.f5966f) {
                return false;
            }
            this.f5966f = true;
            this.f5967g = true;
            this.f5965e.notifyAll();
            m7866j();
            return true;
        }
    }

    /* renamed from: j */
    private void m7866j() {
        synchronized (this.f5965e) {
            for (C1591g then : this.f5972l) {
                try {
                    then.then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f5972l = null;
        }
    }

    /* renamed from: c */
    public final boolean mo6887c() {
        boolean z;
        synchronized (this.f5965e) {
            z = this.f5967g;
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo6889d() {
        boolean z;
        synchronized (this.f5965e) {
            if (mo6891f() != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo6882b() {
        boolean z;
        synchronized (this.f5965e) {
            z = this.f5966f;
        }
        return z;
    }

    /* renamed from: a */
    public static <TResult> C1592h<TResult> m7853a(Callable<TResult> callable) {
        return m7856a(callable, (Executor) f5957a, (C1588d) null);
    }

    /* renamed from: b */
    public static <TResult> C1592h<TResult> m7859b(Callable<TResult> callable) {
        return m7856a(callable, f5959c, (C1588d) null);
    }

    /* renamed from: c */
    public final <TContinuationResult> C1592h<TContinuationResult> mo6885c(C1591g<TResult, TContinuationResult> gVar) {
        return m7861c(gVar, f5959c, null);
    }

    /* renamed from: a */
    public static C1592h<Void> m7848a(long j) {
        return m7849a(j, C1584b.m7829b(), (C1588d) null);
    }

    /* renamed from: b */
    public static <TResult> C1592h<List<TResult>> m7858b(final Collection<? extends C1592h<TResult>> collection) {
        return m7862c(collection).mo6885c((C1591g<TResult, TContinuationResult>) new C1591g<Void, List<TResult>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<TResult> then(C1592h<Void> hVar) throws Exception {
                if (collection.size() == 0) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (C1592h e : collection) {
                    arrayList.add(e.mo6890e());
                }
                return arrayList;
            }
        });
    }

    /* renamed from: d */
    public final <TContinuationResult> C1592h<TContinuationResult> mo6888d(C1591g<TResult, C1592h<TContinuationResult>> gVar) {
        return m7863d(gVar, f5959c);
    }

    private C1592h(TResult tresult) {
        mo6884b(tresult);
    }

    /* renamed from: a */
    public static <TResult> C1592h<TResult> m7850a(Exception exc) {
        C1606i iVar = new C1606i();
        iVar.mo6902b(exc);
        return iVar.f6010a;
    }

    /* renamed from: b */
    public final <TContinuationResult> C1592h<TContinuationResult> mo6879b(C1591g<TResult, C1592h<TContinuationResult>> gVar) {
        return mo6881b(gVar, f5959c, null);
    }

    private C1592h(boolean z) {
        mo6893i();
    }

    /* renamed from: a */
    public static <TResult> C1592h<TResult> m7851a(TResult tresult) {
        if (tresult == null) {
            return f5961m;
        }
        if (!(tresult instanceof Boolean)) {
            C1606i iVar = new C1606i();
            iVar.mo6903b(tresult);
            return iVar.f6010a;
        } else if (((Boolean) tresult).booleanValue()) {
            return f5962n;
        } else {
            return f5963o;
        }
    }

    /* renamed from: c */
    public static C1592h<Void> m7862c(Collection<? extends C1592h<?>> collection) {
        if (collection.size() == 0) {
            return m7851a((TResult) null);
        }
        C1606i iVar = new C1606i();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (C1592h hVar : collection) {
            final Object obj2 = obj;
            final ArrayList arrayList2 = arrayList;
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            final AtomicInteger atomicInteger2 = atomicInteger;
            final C1606i iVar2 = iVar;
            C159511 r0 = new C1591g<Object, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1592h<Object> hVar) {
                    if (hVar.mo6889d()) {
                        synchronized (obj2) {
                            arrayList2.add(hVar.mo6891f());
                        }
                    }
                    if (hVar.mo6887c()) {
                        atomicBoolean2.set(true);
                    }
                    if (atomicInteger2.decrementAndGet() == 0) {
                        if (arrayList2.size() != 0) {
                            if (arrayList2.size() == 1) {
                                iVar2.mo6902b((Exception) arrayList2.get(0));
                            } else {
                                iVar2.mo6902b((Exception) new AggregateException(C1642a.m8034a("There were %d exceptions.", new Object[]{Integer.valueOf(arrayList2.size())}), (List<? extends Throwable>) arrayList2));
                            }
                        } else if (atomicBoolean2.get()) {
                            iVar2.mo6901b();
                        } else {
                            iVar2.mo6903b(null);
                        }
                    }
                    return null;
                }
            };
            hVar.mo6875a((C1591g<TResult, TContinuationResult>) r0);
        }
        return iVar.f6010a;
    }

    /* renamed from: a */
    public static C1592h<C1592h<?>> m7852a(Collection<? extends C1592h<?>> collection) {
        if (collection.size() == 0) {
            return m7851a((TResult) null);
        }
        final C1606i iVar = new C1606i();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (C1592h a : collection) {
            a.mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<Object, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1592h<Object> hVar) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        iVar.mo6903b(hVar);
                    } else {
                        hVar.mo6891f();
                    }
                    return null;
                }
            });
        }
        return iVar.f6010a;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6883b(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5965e
            monitor-enter(r0)
            boolean r1 = r3.f5966f     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x000a:
            r1 = 1
            r3.f5966f = r1     // Catch:{ all -> 0x002c }
            r3.f5969i = r4     // Catch:{ all -> 0x002c }
            r3.f5970j = r2     // Catch:{ all -> 0x002c }
            java.lang.Object r4 = r3.f5965e     // Catch:{ all -> 0x002c }
            r4.notifyAll()     // Catch:{ all -> 0x002c }
            r3.m7866j()     // Catch:{ all -> 0x002c }
            boolean r4 = r3.f5970j     // Catch:{ all -> 0x002c }
            if (r4 != 0) goto L_0x002a
            bolts.h$a r4 = m7847a()     // Catch:{ all -> 0x002c }
            if (r4 == 0) goto L_0x002a
            bolts.j r4 = new bolts.j     // Catch:{ all -> 0x002c }
            r4.<init>(r3)     // Catch:{ all -> 0x002c }
            r3.f5971k = r4     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r1
        L_0x002c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bolts.C1592h.mo6883b(java.lang.Exception):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo6884b(TResult tresult) {
        synchronized (this.f5965e) {
            if (this.f5966f) {
                return false;
            }
            this.f5966f = true;
            this.f5968h = tresult;
            this.f5965e.notifyAll();
            m7866j();
            return true;
        }
    }

    /* renamed from: d */
    private <TContinuationResult> C1592h<TContinuationResult> m7863d(C1591g<TResult, C1592h<TContinuationResult>> gVar, Executor executor) {
        return m7864d(gVar, executor, null);
    }

    /* renamed from: c */
    public final <TContinuationResult> C1592h<TContinuationResult> mo6886c(C1591g<TResult, TContinuationResult> gVar, Executor executor) {
        return m7861c(gVar, executor, null);
    }

    /* renamed from: b */
    public final <TContinuationResult> C1592h<TContinuationResult> mo6880b(C1591g<TResult, C1592h<TContinuationResult>> gVar, Executor executor) {
        return mo6881b(gVar, executor, null);
    }

    /* renamed from: a */
    public static <TResult> C1592h<TResult> m7854a(Callable<TResult> callable, C1588d dVar) {
        return m7856a(callable, (Executor) f5957a, dVar);
    }

    /* renamed from: a */
    public static <TResult> C1592h<TResult> m7855a(Callable<TResult> callable, Executor executor) {
        return m7856a(callable, executor, (C1588d) null);
    }

    /* renamed from: c */
    private <TContinuationResult> C1592h<TContinuationResult> m7861c(final C1591g<TResult, TContinuationResult> gVar, Executor executor, C1588d dVar) {
        return mo6880b(new C1591g<TResult, C1592h<TContinuationResult>>(null) {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C1592h<TContinuationResult> then(C1592h<TResult> hVar) {
                if (null != null && null.mo6864a()) {
                    return C1592h.m7865h();
                }
                if (hVar.mo6889d()) {
                    return C1592h.m7850a(hVar.mo6891f());
                }
                if (hVar.mo6887c()) {
                    return C1592h.m7865h();
                }
                return hVar.mo6875a(gVar);
            }
        }, executor);
    }

    /* renamed from: d */
    private <TContinuationResult> C1592h<TContinuationResult> m7864d(final C1591g<TResult, C1592h<TContinuationResult>> gVar, Executor executor, C1588d dVar) {
        return mo6880b(new C1591g<TResult, C1592h<TContinuationResult>>(null) {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C1592h<TContinuationResult> then(C1592h<TResult> hVar) {
                if (null != null && null.mo6864a()) {
                    return C1592h.m7865h();
                }
                if (hVar.mo6889d()) {
                    return C1592h.m7850a(hVar.mo6891f());
                }
                if (hVar.mo6887c()) {
                    return C1592h.m7865h();
                }
                return hVar.mo6879b(gVar);
            }
        }, executor);
    }

    /* renamed from: a */
    private static C1592h<Void> m7849a(long j, ScheduledExecutorService scheduledExecutorService, C1588d dVar) {
        if (j <= 0) {
            return m7851a((TResult) null);
        }
        final C1606i iVar = new C1606i();
        scheduledExecutorService.schedule(new Runnable() {
            public final void run() {
                iVar.mo6900a(null);
            }
        }, j, TimeUnit.MILLISECONDS);
        return iVar.f6010a;
    }

    /* renamed from: b */
    public final <TContinuationResult> C1592h<TContinuationResult> mo6881b(C1591g<TResult, C1592h<TContinuationResult>> gVar, Executor executor, C1588d dVar) {
        boolean b;
        C1606i iVar = new C1606i();
        synchronized (this.f5965e) {
            b = mo6882b();
            if (!b) {
                List<C1591g<TResult, Void>> list = this.f5972l;
                final C1606i iVar2 = iVar;
                final C1591g<TResult, C1592h<TContinuationResult>> gVar2 = gVar;
                final Executor executor2 = executor;
                final C1588d dVar2 = dVar;
                C15973 r0 = new C1591g<TResult, Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(C1592h<TResult> hVar) {
                        C1592h.m7860b(iVar2, gVar2, hVar, executor2, dVar2);
                        return null;
                    }
                };
                list.add(r0);
            }
        }
        if (b) {
            m7860b(iVar, gVar, this, executor, dVar);
        }
        return iVar.f6010a;
    }

    /* renamed from: a */
    private static <TResult> C1592h<TResult> m7856a(final Callable<TResult> callable, Executor executor, final C1588d dVar) {
        final C1606i iVar = new C1606i();
        try {
            executor.execute(new Runnable() {
                public final void run() {
                    if (dVar == null || !dVar.mo6864a()) {
                        try {
                            iVar.mo6903b(callable.call());
                        } catch (CancellationException unused) {
                            iVar.mo6901b();
                        } catch (Exception e) {
                            iVar.mo6902b(e);
                        }
                    } else {
                        iVar.mo6901b();
                    }
                }
            });
        } catch (Exception e) {
            iVar.mo6902b((Exception) new ExecutorException(e));
        }
        return iVar.f6010a;
    }

    /* renamed from: b */
    public static <TContinuationResult, TResult> void m7860b(final C1606i<TContinuationResult> iVar, final C1591g<TResult, C1592h<TContinuationResult>> gVar, final C1592h<TResult> hVar, Executor executor, final C1588d dVar) {
        try {
            executor.execute(new Runnable() {
                public final void run() {
                    if (dVar == null || !dVar.mo6864a()) {
                        try {
                            C1592h hVar = (C1592h) gVar.then(hVar);
                            if (hVar == null) {
                                iVar.mo6903b(null);
                            } else {
                                hVar.mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<TContinuationResult, Void>() {
                                    /* access modifiers changed from: private */
                                    /* renamed from: a */
                                    public Void then(C1592h<TContinuationResult> hVar) {
                                        if (dVar == null || !dVar.mo6864a()) {
                                            if (hVar.mo6887c()) {
                                                iVar.mo6901b();
                                            } else if (hVar.mo6889d()) {
                                                iVar.mo6902b(hVar.mo6891f());
                                            } else {
                                                iVar.mo6903b(hVar.mo6890e());
                                            }
                                            return null;
                                        }
                                        iVar.mo6901b();
                                        return null;
                                    }
                                });
                            }
                        } catch (CancellationException unused) {
                            iVar.mo6901b();
                        } catch (Exception e) {
                            iVar.mo6902b(e);
                        }
                    } else {
                        iVar.mo6901b();
                    }
                }
            });
        } catch (Exception e) {
            iVar.mo6902b((Exception) new ExecutorException(e));
        }
    }
}
