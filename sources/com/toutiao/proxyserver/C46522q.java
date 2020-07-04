package com.toutiao.proxyserver;

import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import com.toutiao.proxyserver.C46494h.C46498b;
import com.toutiao.proxyserver.net.C46513c;
import com.toutiao.proxyserver.p1840b.C46461a;
import com.toutiao.proxyserver.p1840b.C46462b;
import com.toutiao.proxyserver.p1840b.C46463c;
import com.toutiao.proxyserver.p1841c.C46470c;
import com.toutiao.proxyserver.p1842d.C46474a;
import com.toutiao.proxyserver.p1842d.C46476c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.toutiao.proxyserver.q */
public class C46522q {

    /* renamed from: g */
    public static final C46521p f119859g = new C46521p();

    /* renamed from: l */
    private static volatile C46522q f119860l;

    /* renamed from: a */
    public final SparseArray<Map<String, C46494h>> f119861a = new SparseArray<>(2);

    /* renamed from: b */
    public final BlockingQueue<Runnable> f119862b;

    /* renamed from: c */
    public volatile C46463c f119863c;

    /* renamed from: d */
    public volatile C46482g f119864d;

    /* renamed from: e */
    public volatile C46480f f119865e;

    /* renamed from: f */
    public List<Object> f119866f;

    /* renamed from: h */
    volatile long f119867h = 10000;

    /* renamed from: i */
    volatile long f119868i = 10000;

    /* renamed from: j */
    volatile long f119869j = 10000;

    /* renamed from: k */
    private final ExecutorService f119870k;

    /* renamed from: m */
    private final C46498b f119871m = new C46498b() {
        /* renamed from: a */
        public final void mo115648a(C46494h hVar) {
            StringBuilder sb = new StringBuilder("onLazyUrlsProvided, key: ");
            sb.append(hVar.f119663h);
            C46470c.m146083a("TAG_PROXY_Preloader", sb.toString());
            int g = hVar.mo115568g();
            synchronized (C46522q.this.f119861a) {
                Map map = (Map) C46522q.this.f119861a.get(g);
                if (!map.containsKey(hVar.f119663h)) {
                    map.put(hVar.f119663h, hVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo115649b(final C46494h hVar) {
            final int g = hVar.mo115568g();
            synchronized (C46522q.this.f119861a) {
                Map map = (Map) C46522q.this.f119861a.get(g);
                if (map != null) {
                    map.remove(hVar.f119663h);
                }
            }
            if (C46522q.this.mo115688d()) {
                C46522q.this.mo115689e();
            }
            final C46506n nVar = C46534r.f119898e;
            if (nVar != null) {
                C46476c.m146132b((Runnable) new Runnable() {
                    public final void run() {
                        nVar.mo105068a(C46462b.m146064a(g), "preloader", hVar.f119658c.get(), 0, hVar.f119659d.get());
                    }
                });
            }
            StringBuilder sb = new StringBuilder("afterExecute, key: ");
            sb.append(hVar.f119663h);
            C46470c.m146083a("TAG_PROXY_Preloader", sb.toString());
        }
    };

    /* renamed from: com.toutiao.proxyserver.q$a */
    public class C46532a {

        /* renamed from: b */
        private boolean f119886b;

        /* renamed from: c */
        private int f119887c = C46522q.f119859g.f119857b;

        /* renamed from: d */
        private String f119888d;

        /* renamed from: e */
        private List<C46513c> f119889e;

        /* renamed from: f */
        private String[] f119890f;

        /* renamed from: g */
        private C46520o f119891g;

        /* renamed from: a */
        public final void mo115703a() {
            if (this.f119891g == null) {
                C46522q.this.mo115682a(this.f119886b, this.f119887c, this.f119888d, this.f119889e, this.f119890f);
            } else {
                C46522q.this.mo115681a(this.f119886b, this.f119887c, this.f119888d, this.f119889e, this.f119891g);
            }
        }

        /* renamed from: a */
        public final C46532a mo115699a(int i) {
            this.f119887c = i;
            return this;
        }

        /* renamed from: a */
        public final C46532a mo115700a(C46520o oVar) {
            this.f119891g = oVar;
            return this;
        }

        public C46532a() {
        }

        /* renamed from: a */
        public final C46532a mo115701a(String str) {
            this.f119888d = str;
            return this;
        }

        /* renamed from: a */
        public final C46532a mo115702a(String... strArr) {
            this.f119890f = strArr;
            return this;
        }
    }

    /* renamed from: com.toutiao.proxyserver.q$b */
    static final class C46533b<T> extends LinkedBlockingDeque<T> {

        /* renamed from: a */
        private ThreadPoolExecutor f119892a;

        private C46533b() {
        }

        /* renamed from: a */
        public final void mo115704a(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.f119892a != null) {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                } else if (threadPoolExecutor != null) {
                    this.f119892a = threadPoolExecutor;
                } else {
                    throw new NullPointerException("executor argument can't be null!");
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            return offerFirst(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean offer(T r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.ThreadPoolExecutor r0 = r3.f119892a     // Catch:{ all -> 0x0027 }
                int r0 = r0.getPoolSize()     // Catch:{ all -> 0x0027 }
                java.util.concurrent.ThreadPoolExecutor r1 = r3.f119892a     // Catch:{ all -> 0x0027 }
                int r1 = r1.getActiveCount()     // Catch:{ all -> 0x0027 }
                java.util.concurrent.ThreadPoolExecutor r2 = r3.f119892a     // Catch:{ all -> 0x0027 }
                int r2 = r2.getMaximumPoolSize()     // Catch:{ all -> 0x0027 }
                if (r1 < r0) goto L_0x0021
                if (r0 >= r2) goto L_0x0021
                java.lang.String r4 = "TAG_PROXY_TT"
                java.lang.String r0 = "create new preloader thread"
                com.toutiao.proxyserver.p1841c.C46470c.m146085b(r4, r0)     // Catch:{ all -> 0x0027 }
                r4 = 0
                monitor-exit(r3)     // Catch:{ all -> 0x0027 }
                return r4
            L_0x0021:
                monitor-exit(r3)     // Catch:{ all -> 0x0027 }
                boolean r4 = r3.offerFirst(r4)
                return r4
            L_0x0027:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0027 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C46522q.C46533b.offer(java.lang.Object):boolean");
        }
    }

    /* renamed from: f */
    public static int m146233f() {
        return C46521p.f119856a;
    }

    /* renamed from: a */
    public final void mo115681a(boolean z, int i, String str, List<C46513c> list, C46520o oVar) {
        m146229a(z, i, str, list, oVar, null);
    }

    /* renamed from: a */
    public final void mo115682a(boolean z, int i, String str, List<C46513c> list, String... strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            m146229a(z, i, str, list, null, new C46571z(C46476c.m146116a(strArr)));
        }
    }

    /* renamed from: a */
    public final void mo115683a(boolean z, final String str) {
        if (!TextUtils.isEmpty(str)) {
            C46476c.m146121a((Runnable) new Runnable(false) {
                public final void run() {
                    C46522q.this.mo115677a(C46462b.m146063a(false), C46474a.m146102a(str));
                }
            });
        }
    }

    /* renamed from: g */
    public final C46532a mo115690g() {
        return new C46532a();
    }

    /* renamed from: b */
    public final void mo115685b() {
        C46476c.m146121a((Runnable) new Runnable() {
            public final void run() {
                ArrayList<C46494h> arrayList = new ArrayList<>();
                synchronized (C46522q.this.f119861a) {
                    int size = C46522q.this.f119861a.size();
                    for (int i = 0; i < size; i++) {
                        Map map = (Map) C46522q.this.f119861a.get(C46522q.this.f119861a.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    C46522q.this.f119862b.clear();
                }
                C46522q.this.mo115689e();
                for (C46494h hVar : arrayList) {
                    hVar.mo115555a();
                    StringBuilder sb = new StringBuilder("PreloadTask: ");
                    sb.append(hVar);
                    sb.append(", canceled!!!");
                    C46470c.m146087c("TAG_PROXY_Preloader", sb.toString());
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo115686c() {
        C46476c.m146121a((Runnable) new Runnable() {
            public final void run() {
                ArrayList<C46494h> arrayList = new ArrayList<>();
                synchronized (C46522q.this.f119861a) {
                    int size = C46522q.this.f119861a.size();
                    for (int i = 0; i < size; i++) {
                        Map map = (Map) C46522q.this.f119861a.get(C46522q.this.f119861a.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                        }
                    }
                    for (C46494h hVar : arrayList) {
                        hVar.mo115555a();
                        StringBuilder sb = new StringBuilder("PreloadTask: ");
                        sb.append(hVar);
                        sb.append(", canceled!!!");
                        C46470c.m146087c("TAG_PROXY_Preloader", sb.toString());
                    }
                    int size2 = C46522q.this.f119861a.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Map map2 = (Map) C46522q.this.f119861a.get(C46522q.this.f119861a.keyAt(i2));
                        if (map2 != null) {
                            map2.clear();
                        }
                    }
                    C46522q.this.f119862b.clear();
                }
                C46522q.this.mo115689e();
            }
        });
    }

    /* renamed from: e */
    public final void mo115689e() {
        C46476c.m146132b((Runnable) new Runnable() {
            public final void run() {
                Iterator it = C46522q.this.f119866f.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        });
    }

    /* renamed from: a */
    public static C46522q m146227a() {
        if (f119860l == null) {
            synchronized (C46522q.class) {
                if (f119860l == null) {
                    f119860l = new C46522q();
                }
            }
        }
        return f119860l;
    }

    /* renamed from: d */
    public final boolean mo115688d() {
        synchronized (this.f119861a) {
            for (int i = 0; i < this.f119861a.size(); i++) {
                Map map = (Map) this.f119861a.get(this.f119861a.keyAt(i));
                if (map != null && map.size() > 0) {
                    return false;
                }
            }
            return true;
        }
    }

    private C46522q() {
        if (f119859g.f119858c == null) {
            f119859g.f119858c = new C46533b();
        }
        this.f119862b = f119859g.f119858c;
        this.f119870k = m146228a(this.f119862b);
        if (this.f119862b instanceof C46533b) {
            ((C46533b) this.f119862b).mo115704a((ThreadPoolExecutor) this.f119870k);
        }
        this.f119866f = new ArrayList();
        this.f119861a.put(0, new HashMap());
        this.f119861a.put(1, new HashMap());
    }

    /* renamed from: a */
    public final long mo115676a(String str) {
        return m146231b(false, str);
    }

    /* renamed from: b */
    public final long mo115684b(String str) {
        return m146232c(false, str);
    }

    /* renamed from: c */
    public final void mo115687c(String str) {
        mo115683a(false, str);
    }

    /* renamed from: a */
    private static ExecutorService m146228a(final BlockingQueue<Runnable> blockingQueue) {
        int i;
        int a = C46476c.m146107a();
        if (a <= 0) {
            a = 1;
        } else if (a > 4) {
            a = 4;
        }
        if (C46521p.f119856a == 1) {
            i = 1;
        } else {
            i = a;
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, blockingQueue, new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                C465301 r0 = new Thread(runnable) {
                    public final void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable unused) {
                        }
                        super.run();
                    }
                };
                StringBuilder sb = new StringBuilder("video-preload-");
                sb.append(r0.getId());
                r0.setName(sb.toString());
                r0.setDaemon(true);
                StringBuilder sb2 = new StringBuilder("new preload thead: ");
                sb2.append(r0.getName());
                C46470c.m146085b("TAG_PROXY_Preloader", sb2.toString());
                return r0;
            }
        }, new RejectedExecutionHandler() {
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    blockingQueue.offer(runnable);
                    C46470c.m146085b("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                } catch (Throwable unused) {
                }
            }
        });
        return threadPoolExecutor;
    }

    /* renamed from: b */
    private long m146231b(boolean z, String str) {
        C46463c cVar = this.f119863c;
        if (cVar == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        C46461a a = cVar.mo115584a(C46474a.m146102a(str), C46462b.m146063a(false));
        if (a == null) {
            return 0;
        }
        return (long) a.f119727c;
    }

    /* renamed from: c */
    private long m146232c(boolean z, String str) {
        C46482g gVar = this.f119864d;
        if (gVar == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        File e = gVar.mo115596e(C46474a.m146102a(str));
        if (e == null) {
            return 0;
        }
        long length = e.length();
        if (length > 0) {
            return length;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo115677a(int i, String str) {
        C46494h hVar;
        synchronized (this.f119861a) {
            Map map = (Map) this.f119861a.get(i);
            if (map != null) {
                hVar = (C46494h) map.remove(str);
            } else {
                hVar = null;
            }
        }
        if (hVar != null) {
            hVar.mo115555a();
        }
        if (mo115688d()) {
            mo115689e();
        }
    }

    /* renamed from: a */
    public final void mo115679a(String str, C46520o oVar) {
        mo115681a(false, f119859g.f119857b, str, null, oVar);
    }

    /* renamed from: a */
    public final void mo115680a(String str, String... strArr) {
        m146230a(false, str, strArr);
    }

    /* renamed from: a */
    private void m146230a(boolean z, String str, String... strArr) {
        mo115682a(false, f119859g.f119857b, str, null, strArr);
    }

    /* renamed from: a */
    public final void mo115678a(long j, long j2, long j3) {
        this.f119867h = j;
        this.f119868i = 30000;
        this.f119869j = 30000;
    }

    /* renamed from: a */
    private void m146229a(boolean z, int i, String str, List<C46513c> list, C46520o oVar, C46571z zVar) {
        C46467c cVar;
        C46494h hVar;
        if (z) {
            cVar = this.f119865e;
        } else {
            cVar = this.f119864d;
        }
        C46463c cVar2 = this.f119863c;
        if (cVar == null || cVar2 == null) {
            C46470c.m146089d("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!");
            return;
        }
        if (i <= 0) {
            i = f119859g.f119857b;
        }
        StringBuilder sb = new StringBuilder("Preload urlsLazyProvider:");
        sb.append(oVar);
        C46470c.m146087c("TAG_PROXY_Preloader", sb.toString());
        if (oVar != null) {
            hVar = new C46497a().mo115638a(cVar).mo115637a(cVar2).mo115644a(list).mo115640a(oVar).mo115636a(i).mo115639a(this.f119871m).mo115645a(true).mo115646a();
        } else if (!TextUtils.isEmpty(str) && zVar != null) {
            String a = C46474a.m146102a(str);
            C46456aa.m146053a().mo115579a(str, a);
            File e = cVar.mo115596e(a);
            if (e != null && e.length() >= ((long) i)) {
                StringBuilder sb2 = new StringBuilder("no need preload, file size: ");
                sb2.append(e.length());
                sb2.append(", need preload size: ");
                sb2.append(i);
                C46470c.m146085b("TAG_PROXY_Preloader", sb2.toString());
                return;
            } else if (C46536s.m146278a().mo115708a(C46462b.m146063a(z), a)) {
                StringBuilder sb3 = new StringBuilder("has pending proxy task, skip preload for key: ");
                sb3.append(str);
                C46470c.m146087c("TAG_PROXY_Preloader", sb3.toString());
                return;
            } else {
                synchronized (this.f119861a) {
                    Map map = (Map) this.f119861a.get(z ? 1 : 0);
                    C46476c.m146124a(list);
                    hVar = new C46497a().mo115638a(cVar).mo115637a(cVar2).mo115643a(str).mo115647b(a).mo115642a(zVar).mo115644a(list).mo115636a(i).mo115639a(this.f119871m).mo115645a(true).mo115646a();
                    map.put(a, hVar);
                }
            }
        } else {
            return;
        }
        this.f119870k.execute(hVar);
    }
}
