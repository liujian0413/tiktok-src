package com.p280ss.android.ugc.aweme.thread;

import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.thread.g */
final class C7252g {

    /* renamed from: c */
    private static ExecutorService f20278c;

    /* renamed from: a */
    public Map<C7244b, Object> f20279a;

    /* renamed from: b */
    public ReentrantLock f20280b;

    /* renamed from: d */
    private Object f20281d;

    /* renamed from: com.ss.android.ugc.aweme.thread.g$a */
    static class C7256a {

        /* renamed from: a */
        public static C7252g f20298a = new C7252g();
    }

    /* renamed from: com.ss.android.ugc.aweme.thread.g$b */
    class C7257b implements Runnable {
        public final void run() {
            if (C7258h.m22729b().mo18969d()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList<C7244b> arrayList = new ArrayList<>();
                C7252g.this.f20280b.lock();
                try {
                    if (C7252g.this.f20279a.size() <= 0) {
                        C7252g.this.f20280b.unlock();
                        return;
                    }
                    Iterator it = C7252g.this.f20279a.entrySet().iterator();
                    while (it.hasNext()) {
                        C7244b bVar = (C7244b) ((Entry) it.next()).getKey();
                        if (uptimeMillis - bVar.f20257c >= C7258h.m22723a().f20312f) {
                            arrayList.add(bVar);
                            it.remove();
                        }
                    }
                    C7252g.this.f20280b.unlock();
                    for (C7244b bVar2 : arrayList) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            String a = C7273p.m22769a((Object) bVar2.f20255a);
                            if (!C7258h.m22727a(a)) {
                                jSONObject.put("task_name", a);
                                jSONObject.put("pool_type", bVar2.f20256b.f20254a.name());
                                jSONObject.put("pool_size", bVar2.f20256b.getPoolSize());
                                jSONObject.put("queue_size", bVar2.f20256b.getQueue().size());
                                jSONObject.put("duration", uptimeMillis - bVar2.f20257c);
                                if (bVar2.f20258d != null) {
                                    jSONObject.put("task_stack", C7273p.m22771a(bVar2.f20258d.getStackTrace()));
                                }
                                C7258h.m22729b().mo18968d(jSONObject);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    arrayList.clear();
                } catch (Exception unused2) {
                } catch (Throwable th) {
                    C7252g.this.f20280b.unlock();
                    throw th;
                }
            }
        }

        C7257b() {
        }
    }

    /* renamed from: a */
    static C7252g m22716a() {
        return C7256a.f20298a;
    }

    private C7252g() {
        this.f20281d = new Object();
        this.f20280b = new ReentrantLock();
        this.f20279a = new WeakHashMap();
        ExecutorService a = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SCHEDULED).mo18993a(1).mo18994a("TaskMonitor").mo18996a());
        f20278c = a;
        ((ScheduledExecutorService) a).scheduleAtFixedRate(new C7257b(), C7258h.m22723a().f20312f, C7258h.m22723a().f20312f, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo18980b(C7244b bVar) {
        if (C7258h.m22729b().mo18969d()) {
            this.f20280b.lock();
            try {
                this.f20279a.remove(bVar);
            } finally {
                this.f20280b.unlock();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18977a(C7244b bVar) {
        if (C7258h.m22729b().mo18969d()) {
            this.f20280b.lock();
            try {
                this.f20279a.put(bVar, this.f20281d);
            } finally {
                this.f20280b.unlock();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18979a(final Runnable runnable, final ThreadPoolExecutor threadPoolExecutor) {
        if (C7258h.m22729b().mo18971e()) {
            final Exception exc = new Exception();
            f20278c.execute(new Runnable() {
                public final void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (runnable instanceof C7244b) {
                            jSONObject.put("task_name", ((C7244b) runnable).f20255a);
                        } else {
                            jSONObject.put("task_name", runnable);
                        }
                        if (threadPoolExecutor instanceof C7243a) {
                            jSONObject.put("pool_type", ((C7243a) threadPoolExecutor).f20254a.name());
                            jSONObject.put("pool_size", threadPoolExecutor.getPoolSize());
                            jSONObject.put("task_stack", C7273p.m22770a((Throwable) exc));
                        }
                    } catch (Exception unused) {
                    }
                    C7258h.m22729b().mo18970e(jSONObject);
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18978a(Object obj, String str, int i, int i2, long j) {
        final WeakReference weakReference = new WeakReference(obj);
        ExecutorService executorService = f20278c;
        final String str2 = str;
        final int i3 = i;
        final int i4 = i2;
        final long j2 = j;
        C72531 r0 = new Runnable() {
            public final void run() {
                JSONObject a = C7252g.m22717a(weakReference, str2, i3, i4, j2);
                if (a != null) {
                    C7258h.m22729b().mo18964b(a);
                }
            }
        };
        executorService.execute(r0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo18981b(Object obj, String str, int i, int i2, long j) {
        final WeakReference weakReference = new WeakReference(obj);
        ExecutorService executorService = f20278c;
        final String str2 = str;
        final int i3 = i;
        final int i4 = i2;
        final long j2 = j;
        C72542 r0 = new Runnable() {
            public final void run() {
                JSONObject a = C7252g.m22717a(weakReference, str2, i3, i4, j2);
                if (a != null) {
                    C7258h.m22729b().mo18966c(a);
                }
            }
        };
        executorService.execute(r0);
    }

    /* renamed from: a */
    public static JSONObject m22717a(WeakReference<Object> weakReference, String str, int i, int i2, long j) {
        Object obj = weakReference.get();
        if (obj == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String a = C7273p.m22769a(obj);
            if (C7258h.m22727a(a)) {
                return null;
            }
            jSONObject.put("task_name", a);
            jSONObject.put("pool_type", str);
            jSONObject.put("pool_size", i);
            jSONObject.put("queue_size", i2);
            jSONObject.put("duration", j);
            return jSONObject;
        } catch (Exception unused) {
        }
    }
}
