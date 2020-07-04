package com.facebook.cache.p683a;

import android.content.Context;
import com.facebook.binaryresource.C13231a;
import com.facebook.cache.common.C13265a;
import com.facebook.cache.common.C13266b;
import com.facebook.cache.common.C13271g;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.CacheEventListener.EvictionReason;
import com.facebook.cache.p683a.C13248d.C13249a;
import com.facebook.cache.p683a.C13248d.C13250b;
import com.facebook.common.p684a.C13272a;
import com.facebook.common.p684a.C13273b;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.statfs.StatFsHelper;
import com.facebook.common.statfs.StatFsHelper.StorageType;
import com.facebook.common.time.C13330a;
import com.facebook.common.time.C13332c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.cache.a.e */
public class C13251e implements C13259i, C13272a {

    /* renamed from: e */
    private static final Class<?> f35106e = C13251e.class;

    /* renamed from: f */
    private static final long f35107f = TimeUnit.HOURS.toMillis(2);

    /* renamed from: g */
    private static final long f35108g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final CountDownLatch f35109a;

    /* renamed from: b */
    final Set<String> f35110b;

    /* renamed from: c */
    public final Object f35111c = new Object();

    /* renamed from: d */
    public boolean f35112d;

    /* renamed from: h */
    private final long f35113h;

    /* renamed from: i */
    private final long f35114i;

    /* renamed from: j */
    private long f35115j;

    /* renamed from: k */
    private final CacheEventListener f35116k;

    /* renamed from: l */
    private long f35117l;

    /* renamed from: m */
    private final long f35118m;

    /* renamed from: n */
    private final StatFsHelper f35119n;

    /* renamed from: o */
    private final C13248d f35120o;

    /* renamed from: p */
    private final C13258h f35121p;

    /* renamed from: q */
    private final CacheErrorLogger f35122q;

    /* renamed from: r */
    private final boolean f35123r;

    /* renamed from: s */
    private final C13253a f35124s;

    /* renamed from: t */
    private final C13330a f35125t;

    /* renamed from: com.facebook.cache.a.e$a */
    static class C13253a {

        /* renamed from: a */
        private boolean f35127a;

        /* renamed from: b */
        private long f35128b = -1;

        /* renamed from: c */
        private long f35129c = -1;

        /* renamed from: a */
        public final synchronized boolean mo32470a() {
            return this.f35127a;
        }

        /* renamed from: c */
        public final synchronized long mo32473c() {
            return this.f35128b;
        }

        /* renamed from: d */
        public final synchronized long mo32474d() {
            return this.f35129c;
        }

        C13253a() {
        }

        /* renamed from: b */
        public final synchronized void mo32471b() {
            this.f35127a = false;
            this.f35129c = -1;
            this.f35128b = -1;
        }

        /* renamed from: a */
        public final synchronized void mo32469a(long j, long j2) {
            this.f35129c = j2;
            this.f35128b = j;
            this.f35127a = true;
        }

        /* renamed from: b */
        public final synchronized void mo32472b(long j, long j2) {
            if (this.f35127a) {
                this.f35128b += j;
                this.f35129c += j2;
            }
        }
    }

    /* renamed from: com.facebook.cache.a.e$b */
    public static class C13254b {

        /* renamed from: a */
        public final long f35130a;

        /* renamed from: b */
        public final long f35131b;

        /* renamed from: c */
        public final long f35132c;

        public C13254b(long j, long j2, long j3) {
            this.f35130a = j;
            this.f35131b = j2;
            this.f35132c = j3;
        }
    }

    /* renamed from: c */
    public final void mo32464c() {
        mo32461a();
    }

    /* renamed from: e */
    private void m38743e() throws IOException {
        synchronized (this.f35111c) {
            boolean d = mo32466d();
            m38744f();
            long c = this.f35124s.mo32473c();
            if (c > this.f35115j && !d) {
                this.f35124s.mo32471b();
                mo32466d();
            }
            if (c > this.f35115j) {
                m38742a((this.f35115j * 9) / 10, EvictionReason.CACHE_FULL);
            }
        }
    }

    /* renamed from: f */
    private void m38744f() {
        StorageType storageType;
        if (this.f35120o.mo32435a()) {
            storageType = StorageType.EXTERNAL;
        } else {
            storageType = StorageType.INTERNAL;
        }
        if (this.f35119n.mo32620a(storageType, this.f35114i - this.f35124s.mo32473c())) {
            this.f35115j = this.f35113h;
        } else {
            this.f35115j = this.f35114i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32462b() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f35111c
            monitor-enter(r0)
            r8.mo32466d()     // Catch:{ all -> 0x003d }
            com.facebook.cache.a.e$a r1 = r8.f35124s     // Catch:{ all -> 0x003d }
            long r1 = r1.mo32473c()     // Catch:{ all -> 0x003d }
            long r3 = r8.f35118m     // Catch:{ all -> 0x003d }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x003b
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            long r3 = r8.f35118m     // Catch:{ all -> 0x003d }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001f
            goto L_0x003b
        L_0x001f:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r5 = r8.f35118m     // Catch:{ all -> 0x003d }
            double r5 = (double) r5
            double r1 = (double) r1
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r1)
            double r5 = r5 / r1
            double r3 = r3 - r5
            r1 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0039
            r8.m38741a(r3)     // Catch:{ all -> 0x003d }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return
        L_0x003d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.p683a.C13251e.mo32462b():void");
    }

    /* renamed from: d */
    public final boolean mo32466d() {
        long a = this.f35125t.mo32622a();
        if (!this.f35124s.mo32470a() || this.f35117l == -1 || a - this.f35117l > f35108g) {
            return m38745g();
        }
        return false;
    }

    /* renamed from: g */
    private boolean m38745g() {
        Set<String> set;
        long a = this.f35125t.mo32622a();
        long j = f35107f + a;
        if (this.f35123r && this.f35110b.isEmpty()) {
            set = this.f35110b;
        } else if (this.f35123r) {
            set = new HashSet<>();
        } else {
            set = null;
        }
        try {
            Iterator it = this.f35120o.mo32441d().iterator();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            int i3 = 0;
            long j2 = -1;
            long j3 = 0;
            while (it.hasNext()) {
                C13249a aVar = (C13249a) it.next();
                i3++;
                j3 += aVar.mo32445c();
                if (aVar.mo32444b() > j) {
                    i++;
                    Iterator it2 = it;
                    i2 = (int) (((long) i2) + aVar.mo32445c());
                    j2 = Math.max(aVar.mo32444b() - a, j2);
                    it = it2;
                    z = true;
                } else {
                    Iterator it3 = it;
                    if (this.f35123r) {
                        set.add(aVar.mo32443a());
                    }
                    it = it3;
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder("Future timestamp found in ");
                sb.append(i);
                sb.append(" files , with a total size of ");
                sb.append(i2);
                sb.append(" bytes, and a maximum time delta of ");
                sb.append(j2);
                sb.append("ms");
            }
            long j4 = (long) i3;
            if (!(this.f35124s.mo32474d() == j4 && this.f35124s.mo32473c() == j3)) {
                if (this.f35123r && this.f35110b != set) {
                    this.f35110b.clear();
                    this.f35110b.addAll(set);
                }
                this.f35124s.mo32469a(j3, j4);
            }
            this.f35117l = a;
            return true;
        } catch (IOException e) {
            new StringBuilder("calcFileCacheSize: ").append(e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public final void mo32461a() {
        synchronized (this.f35111c) {
            try {
                this.f35120o.mo32439c();
                this.f35110b.clear();
            } catch (IOException | NullPointerException e) {
                new StringBuilder("clearAll: ").append(e.getMessage());
            }
            this.f35124s.mo32471b();
        }
    }

    /* renamed from: a */
    private void m38741a(double d) {
        synchronized (this.f35111c) {
            try {
                this.f35124s.mo32471b();
                mo32466d();
                long c = this.f35124s.mo32473c();
                double d2 = (double) c;
                Double.isNaN(d2);
                m38742a(c - ((long) (d * d2)), EvictionReason.CACHE_MANAGER_TRIMMED);
            } catch (IOException e) {
                new StringBuilder("trimBy: ").append(e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public final boolean mo32465c(C13265a aVar) {
        synchronized (this.f35111c) {
            List a = C13266b.m38802a(aVar);
            for (int i = 0; i < a.size(); i++) {
                if (this.f35110b.contains((String) a.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private Collection<C13249a> m38740a(Collection<C13249a> collection) {
        long a = this.f35125t.mo32622a() + f35107f;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (C13249a aVar : collection) {
            if (aVar.mo32444b() > a) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f35121p.mo32452a());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: b */
    public final void mo32463b(C13265a aVar) {
        synchronized (this.f35111c) {
            try {
                List a = C13266b.m38802a(aVar);
                for (int i = 0; i < a.size(); i++) {
                    String str = (String) a.get(i);
                    this.f35120o.mo32436b(str);
                    this.f35110b.remove(str);
                }
            } catch (IOException e) {
                new StringBuilder("delete: ").append(e.getMessage());
            }
        }
    }

    /* renamed from: d */
    public final boolean mo32467d(C13265a aVar) {
        synchronized (this.f35111c) {
            if (mo32465c(aVar)) {
                return true;
            }
            try {
                List a = C13266b.m38802a(aVar);
                for (int i = 0; i < a.size(); i++) {
                    String str = (String) a.get(i);
                    if (this.f35120o.mo32440c(str, aVar)) {
                        this.f35110b.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    public final C13231a mo32459a(C13265a aVar) {
        C13231a aVar2;
        C13260j a = C13260j.m38782a().mo32477a(aVar);
        try {
            synchronized (this.f35111c) {
                List a2 = C13266b.m38802a(aVar);
                String str = null;
                aVar2 = null;
                for (int i = 0; i < a2.size(); i++) {
                    str = (String) a2.get(i);
                    a.mo32479a(str);
                    aVar2 = this.f35120o.mo32437b(str, aVar);
                    if (aVar2 != null) {
                        break;
                    }
                }
                if (aVar2 == null) {
                    this.f35110b.remove(str);
                } else {
                    this.f35110b.add(str);
                }
            }
            a.mo32481b();
            return aVar2;
        } catch (IOException e) {
            try {
                a.mo32478a(e);
                return null;
            } finally {
                a.mo32481b();
            }
        }
    }

    /* renamed from: a */
    private C13250b m38739a(String str, C13265a aVar) throws IOException {
        m38743e();
        return this.f35120o.mo32433a(str, aVar);
    }

    /* renamed from: a */
    private void m38742a(long j, EvictionReason evictionReason) throws IOException {
        long j2 = j;
        try {
            Collection<C13249a> a = m38740a(this.f35120o.mo32441d());
            long c = this.f35124s.mo32473c();
            long j3 = c - j2;
            int i = 0;
            long j4 = 0;
            for (C13249a aVar : a) {
                if (j4 > j3) {
                    break;
                }
                long a2 = this.f35120o.mo32431a(aVar);
                this.f35110b.remove(aVar.mo32443a());
                if (a2 > 0) {
                    i++;
                    j4 += a2;
                    C13260j.m38782a().mo32479a(aVar.mo32443a()).mo32476a(evictionReason).mo32475a(a2).mo32480b(c - j4).mo32482c(j2).mo32481b();
                } else {
                    EvictionReason evictionReason2 = evictionReason;
                }
            }
            this.f35124s.mo32472b(-j4, (long) (-i));
            this.f35120o.mo32438b();
        } catch (IOException e) {
            new StringBuilder("evictAboveSize: ").append(e.getMessage());
            throw e;
        }
    }

    /* renamed from: a */
    public final C13231a mo32460a(C13265a aVar, C13271g gVar) throws IOException {
        String b;
        C13250b a;
        C13260j a2 = C13260j.m38782a().mo32477a(aVar);
        synchronized (this.f35111c) {
            b = C13266b.m38803b(aVar);
        }
        a2.mo32479a(b);
        try {
            a = m38739a(b, aVar);
            a.mo32450a(gVar, aVar);
            C13231a a3 = m38738a(a, aVar, b);
            a2.mo32475a(a3.mo32428b()).mo32480b(this.f35124s.mo32473c());
            if (!a.mo32451a()) {
                C13286a.m38857c(f35106e, "Failed to delete temp file");
            }
            a2.mo32481b();
            return a3;
        } catch (IOException e) {
            try {
                a2.mo32478a(e);
                C13286a.m38850b(f35106e, "Failed inserting a file into the cache", (Throwable) e);
                throw e;
            } catch (Throwable th) {
                a2.mo32481b();
                throw th;
            }
        } catch (Throwable th2) {
            if (!a.mo32451a()) {
                C13286a.m38857c(f35106e, "Failed to delete temp file");
            }
            throw th2;
        }
    }

    /* renamed from: a */
    private C13231a m38738a(C13250b bVar, C13265a aVar, String str) throws IOException {
        C13231a a;
        synchronized (this.f35111c) {
            a = bVar.mo32449a(aVar);
            this.f35110b.add(str);
            this.f35124s.mo32472b(a.mo32428b(), 1);
        }
        return a;
    }

    public C13251e(C13248d dVar, C13258h hVar, C13254b bVar, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, C13273b bVar2, Context context, Executor executor, boolean z) {
        this.f35113h = bVar.f35131b;
        this.f35114i = bVar.f35132c;
        this.f35115j = bVar.f35132c;
        this.f35119n = StatFsHelper.m39016a();
        this.f35120o = dVar;
        this.f35121p = hVar;
        this.f35117l = -1;
        this.f35116k = cacheEventListener;
        this.f35118m = bVar.f35130a;
        this.f35122q = cacheErrorLogger;
        this.f35124s = new C13253a();
        this.f35125t = C13332c.m39022b();
        this.f35123r = z;
        this.f35110b = new HashSet();
        if (this.f35123r) {
            this.f35109a = new CountDownLatch(1);
            executor.execute(new Runnable() {
                public final void run() {
                    synchronized (C13251e.this.f35111c) {
                        C13251e.this.mo32466d();
                    }
                    C13251e.this.f35112d = true;
                    C13251e.this.f35109a.countDown();
                }
            });
            return;
        }
        this.f35109a = new CountDownLatch(0);
    }
}
