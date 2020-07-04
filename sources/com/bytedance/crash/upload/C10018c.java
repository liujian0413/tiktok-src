package com.bytedance.crash.upload;

import android.text.TextUtils;
import com.bytedance.crash.C9912i;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p497f.C9897b;
import com.bytedance.crash.p501j.C9954g;
import com.bytedance.crash.p501j.C9961k;
import com.bytedance.crash.p501j.p502a.C9930f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;

/* renamed from: com.bytedance.crash.upload.c */
public final class C10018c {

    /* renamed from: a */
    public static final HashMap<String, ConcurrentLinkedQueue<C9897b>> f27281a = new HashMap<>();

    /* renamed from: d */
    private static final ConcurrentLinkedQueue<C9897b> f27282d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    private static volatile C10018c f27283e;

    /* renamed from: b */
    public final C9961k f27284b = C9954g.m29460b();

    /* renamed from: c */
    public Runnable f27285c = new Runnable() {
        public final void run() {
            if (!C9912i.m29324f()) {
                if (!C10018c.f27281a.isEmpty() && C9918j.m29344i().mo24559b() != null) {
                    C10018c.m29778b();
                }
                C10018c.this.mo24641d();
                C10018c.this.f27284b.mo24597a(C10018c.this.f27285c, 30000);
            }
        }
    };

    /* renamed from: f */
    private volatile boolean f27286f;

    private C10018c() {
    }

    /* renamed from: a */
    public static C10018c m29775a() {
        if (f27283e == null) {
            synchronized (C10018c.class) {
                if (f27283e == null) {
                    f27283e = new C10018c();
                }
            }
        }
        return f27283e;
    }

    /* renamed from: f */
    private static void m29782f() {
        if (C9912i.m29316a() && !C9912i.m29324f()) {
            try {
                C9954g.m29460b().mo24596a(new Runnable() {
                    public final void run() {
                        C10018c.m29775a().mo24641d();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo24640c() {
        if (f27282d.isEmpty()) {
            this.f27284b.mo24597a(this.f27285c, 30000);
        } else {
            this.f27284b.mo24596a(this.f27285c);
        }
    }

    /* renamed from: e */
    private static void m29781e() {
        if (C9918j.m29344i().mo24559b() == null) {
            if (System.currentTimeMillis() - C9918j.m29345j() > 180000) {
                try {
                    C9954g.m29460b().mo24596a(new Runnable() {
                        public final void run() {
                            C10018c.m29778b();
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        } else if (!f27281a.isEmpty()) {
            try {
                C9954g.m29460b().mo24596a(new Runnable() {
                    public final void run() {
                        C10018c.m29778b();
                    }
                });
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: b */
    public static void m29778b() {
        HashMap hashMap;
        synchronized (f27281a) {
            hashMap = new HashMap(f27281a);
            f27281a.clear();
        }
        if (C9918j.m29344i().mo24559b() != null) {
            for (Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) entry.getValue();
                if (concurrentLinkedQueue != null && (C9918j.m29344i().mo24559b() == null || C9918j.m29344i().mo24559b().getLogTypeSwitch(str))) {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        try {
                            C9897b bVar = (C9897b) concurrentLinkedQueue.poll();
                            if (bVar == null) {
                                break;
                            }
                            m29779b(bVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        r0 = new java.util.LinkedList();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24641d() {
        /*
            r4 = this;
            com.bytedance.crash.j.k r0 = r4.f27284b
            monitor-enter(r0)
            boolean r1 = r4.f27286f     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            return
        L_0x0009:
            r1 = 1
            r4.f27286f = r1     // Catch:{ all -> 0x0057 }
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L_0x0012:
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.f.b> r1 = f27282d
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L_0x0054
            r1 = 0
        L_0x001c:
            r3 = 10
            if (r1 >= r3) goto L_0x0036
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.f.b> r3 = f27282d     // Catch:{ Throwable -> 0x0034 }
            boolean r3 = r3.isEmpty()     // Catch:{ Throwable -> 0x0034 }
            if (r3 != 0) goto L_0x0036
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.f.b> r3 = f27282d     // Catch:{ Throwable -> 0x0034 }
            java.lang.Object r3 = r3.poll()     // Catch:{ Throwable -> 0x0034 }
            r0.add(r3)     // Catch:{ Throwable -> 0x0034 }
            int r1 = r1 + 1
            goto L_0x001c
        L_0x0034:
            goto L_0x0012
        L_0x0036:
            boolean r1 = r0.isEmpty()     // Catch:{ Throwable -> 0x0034 }
            if (r1 == 0) goto L_0x003d
            goto L_0x0054
        L_0x003d:
            com.bytedance.crash.j.a.f r1 = com.bytedance.crash.p501j.p502a.C9930f.m29397a()     // Catch:{ Throwable -> 0x0034 }
            com.bytedance.crash.f.a r1 = r1.mo24556a(r0)     // Catch:{ Throwable -> 0x0034 }
            if (r1 == 0) goto L_0x0050
            com.bytedance.crash.upload.a r2 = com.bytedance.crash.upload.C10016a.m29765a()     // Catch:{ Throwable -> 0x0034 }
            org.json.JSONObject r1 = r1.f26984a     // Catch:{ Throwable -> 0x0034 }
            r2.mo24638a(r1)     // Catch:{ Throwable -> 0x0034 }
        L_0x0050:
            r0.clear()     // Catch:{ Throwable -> 0x0034 }
            goto L_0x0012
        L_0x0054:
            r4.f27286f = r2
            return
        L_0x0057:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.C10018c.mo24641d():void");
    }

    /* renamed from: a */
    public static void m29776a(C9896a aVar) {
        C9896a a = C9930f.m29397a().mo24556a(Arrays.asList(new C9896a[]{aVar}));
        if (a != null) {
            C10016a.m29765a().mo24638a(a.f26984a);
        }
    }

    /* renamed from: b */
    private static void m29779b(C9897b bVar) {
        boolean z;
        f27282d.add(bVar);
        int size = f27282d.size();
        if (size >= 10) {
            z = true;
        } else {
            z = false;
        }
        new StringBuilder("[enqueue] size=").append(size);
        if (z) {
            m29782f();
        }
    }

    /* renamed from: c */
    private static void m29780c(C9897b bVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        try {
            String string = bVar.f26984a.getString("log_type");
            synchronized (f27281a) {
                concurrentLinkedQueue = (ConcurrentLinkedQueue) f27281a.get(string);
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    f27281a.put(string, concurrentLinkedQueue);
                }
            }
            concurrentLinkedQueue.add(bVar);
            if (concurrentLinkedQueue.size() > 100) {
                concurrentLinkedQueue.poll();
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m29777a(C9897b bVar) {
        m29781e();
        if (C9918j.m29344i().mo24559b() != null || System.currentTimeMillis() - C9918j.m29345j() >= 180000) {
            String str = null;
            try {
                str = bVar.f26984a.getString("log_type");
            } catch (JSONException unused) {
            }
            if (!TextUtils.isEmpty(str) && C9918j.m29344i().mo24559b() != null && C9918j.m29344i().mo24559b().getLogTypeSwitch(str)) {
                m29779b(bVar);
            }
            return;
        }
        m29780c(bVar);
    }
}
