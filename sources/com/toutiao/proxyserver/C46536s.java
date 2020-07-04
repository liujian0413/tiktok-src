package com.toutiao.proxyserver;

import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.toutiao.proxyserver.C46554t.C46561c;
import com.toutiao.proxyserver.p1840b.C46461a;
import com.toutiao.proxyserver.p1840b.C46462b;
import com.toutiao.proxyserver.p1840b.C46463c;
import com.toutiao.proxyserver.p1841c.C46470c;
import com.toutiao.proxyserver.p1842d.C46474a;
import com.toutiao.proxyserver.p1842d.C46476c;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.toutiao.proxyserver.s */
public class C46536s {

    /* renamed from: e */
    public static volatile C46536s f119920e;

    /* renamed from: a */
    public volatile ServerSocket f119921a;

    /* renamed from: b */
    public volatile int f119922b;

    /* renamed from: c */
    public final AtomicInteger f119923c = new AtomicInteger(0);

    /* renamed from: d */
    public final ExecutorService f119924d;

    /* renamed from: f */
    public volatile C46463c f119925f;

    /* renamed from: g */
    public volatile C46482g f119926g;

    /* renamed from: h */
    public final SparseArray<Set<C46554t>> f119927h;

    /* renamed from: i */
    public final C46561c f119928i;

    /* renamed from: j */
    volatile long f119929j;

    /* renamed from: k */
    volatile long f119930k;

    /* renamed from: l */
    volatile long f119931l;

    /* renamed from: m */
    private final Runnable f119932m;

    /* renamed from: n */
    private final AtomicBoolean f119933n;

    /* renamed from: com.toutiao.proxyserver.s$a */
    static final class C46542a implements Callable<Boolean> {

        /* renamed from: a */
        private final String f119945a;

        /* renamed from: b */
        private final int f119946b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean call() throws Exception {
            Socket socket;
            Throwable th;
            Socket socket2 = null;
            try {
                socket = new Socket(this.f119945a, this.f119946b);
                try {
                    socket.setSoTimeout(AdError.SERVER_ERROR_CODE);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(C46476c.f119755a));
                    outputStream.flush();
                    if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                        Boolean valueOf = Boolean.valueOf(true);
                        C46476c.m146123a(socket);
                        return valueOf;
                    }
                    C46476c.m146123a(socket);
                    return Boolean.valueOf(false);
                } catch (Throwable th2) {
                    th = th2;
                    C46476c.m146123a(socket);
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                socket = null;
                th = th4;
                C46476c.m146123a(socket);
                throw th;
            }
        }

        C46542a(String str, int i) {
            this.f119945a = str;
            this.f119946b = i;
        }
    }

    /* renamed from: a */
    public static C46536s m146278a() {
        if (f119920e == null) {
            synchronized (C46536s.class) {
                if (f119920e == null) {
                    f119920e = new C46536s();
                }
            }
        }
        return f119920e;
    }

    /* renamed from: b */
    public final void mo115709b() {
        if (this.f119933n.compareAndSet(false, true)) {
            new Thread(this.f119932m).start();
        }
    }

    /* renamed from: c */
    public final void mo115710c() {
        if (this.f119923c.compareAndSet(1, 2) || this.f119923c.compareAndSet(0, 2)) {
            C46476c.m146122a(this.f119921a);
            this.f119924d.shutdownNow();
            m146280e();
        }
    }

    private C46536s() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder("video-proxyserver-");
                sb.append(thread.getId());
                thread.setName(sb.toString());
                return thread;
            }
        });
        this.f119924d = threadPoolExecutor;
        this.f119927h = new SparseArray<>(2);
        this.f119928i = new C46561c() {
            /* renamed from: a */
            public final void mo115713a(C46554t tVar) {
                StringBuilder sb = new StringBuilder("startExecute, ProxyTask: ");
                sb.append(tVar);
                C46470c.m146083a("TAG_PROXY_ProxyServer", sb.toString());
                synchronized (C46536s.this.f119927h) {
                    Set set = (Set) C46536s.this.f119927h.get(tVar.mo115568g());
                    if (set != null) {
                        set.add(tVar);
                    }
                }
            }

            /* renamed from: b */
            public final void mo115714b(final C46554t tVar) {
                StringBuilder sb = new StringBuilder("afterExecute, ProxyTask: ");
                sb.append(tVar);
                C46470c.m146083a("TAG_PROXY_ProxyServer", sb.toString());
                final int g = tVar.mo115568g();
                synchronized (C46536s.this.f119927h) {
                    Set set = (Set) C46536s.this.f119927h.get(g);
                    if (set != null) {
                        set.remove(tVar);
                    }
                }
                final C46506n nVar = C46534r.f119898e;
                if (nVar != null) {
                    C46476c.m146132b((Runnable) new Runnable() {
                        public final void run() {
                            nVar.mo105068a(C46462b.m146064a(g), "proxy", tVar.f119658c.get(), 0, tVar.f119659d.get());
                        }
                    });
                }
            }
        };
        this.f119929j = 10000;
        this.f119930k = 10000;
        this.f119931l = 10000;
        this.f119932m = new Runnable() {
            public final void run() {
                try {
                    int i = 0;
                    C46536s.this.f119921a = new ServerSocket(0, 50, InetAddress.getByName("127.0.0.1"));
                    C46536s.this.f119922b = C46536s.this.f119921a.getLocalPort();
                    if (C46536s.this.f119922b == -1) {
                        C46536s.this.mo115710c();
                        return;
                    }
                    C46568w.m146345a("127.0.0.1", C46536s.this.f119922b);
                    if (C46536s.this.mo115711d() && C46536s.this.f119923c.compareAndSet(0, 1)) {
                        C46470c.m146085b("TAG_PROXY_ProxyServer", "proxy server start!");
                        while (C46536s.this.f119923c.get() == 1) {
                            try {
                                try {
                                    Socket accept = C46536s.this.f119921a.accept();
                                    C46470c.m146085b("TAG_PROXY_ProxyServer", "proxy server new task!");
                                    C46463c cVar = C46536s.this.f119925f;
                                    if (cVar != null) {
                                        C46536s.this.f119924d.execute(new C46559a().mo115735a(cVar).mo115738a(C46536s.this.f119924d).mo115737a(accept).mo115736a(C46536s.this.f119928i).mo115739a());
                                    } else {
                                        C46476c.m146123a(accept);
                                    }
                                } catch (IOException unused) {
                                    i++;
                                    if (i > 3) {
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
                                StringBuilder sb = new StringBuilder("proxy server crashed!  ");
                                sb.append(C46470c.m146081a(th));
                                C46470c.m146089d("TAG_PROXY_ProxyServer", sb.toString());
                            }
                        }
                        C46470c.m146085b("TAG_PROXY_ProxyServer", "proxy server closed!");
                        C46536s.this.mo115710c();
                    }
                } catch (IOException e) {
                    StringBuilder sb2 = new StringBuilder("create ServerSocket error!  ");
                    sb2.append(C46470c.m146081a((Throwable) e));
                    C46470c.m146089d("TAG_PROXY_ProxyServer", sb2.toString());
                    C46536s.this.mo115710c();
                }
            }
        };
        this.f119933n = new AtomicBoolean();
        this.f119927h.put(0, new HashSet());
        this.f119927h.put(1, new HashSet());
    }

    /* renamed from: e */
    private void m146280e() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f119927h) {
            int size = this.f119927h.size();
            for (int i = 0; i < size; i++) {
                Set set = (Set) this.f119927h.get(this.f119927h.keyAt(i));
                if (set != null) {
                    arrayList.addAll(set);
                    set.clear();
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C46554t) it.next()).mo115555a();
        }
    }

    /* renamed from: f */
    private void m146281f() {
        Socket socket;
        Throwable th;
        Socket socket2 = null;
        try {
            socket = this.f119921a.accept();
            try {
                socket.setSoTimeout(AdError.SERVER_ERROR_CODE);
                if ("Ping".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("OK\n".getBytes(C46476c.f119755a));
                    outputStream.flush();
                }
                C46476c.m146123a(socket);
            } catch (IOException unused) {
                socket2 = socket;
                C46476c.m146123a(socket2);
            } catch (Throwable th2) {
                th = th2;
                C46476c.m146123a(socket);
                throw th;
            }
        } catch (IOException unused2) {
            C46476c.m146123a(socket2);
        } catch (Throwable th3) {
            Throwable th4 = th3;
            socket = null;
            th = th4;
            C46476c.m146123a(socket);
            throw th;
        }
    }

    /* renamed from: d */
    public final boolean mo115711d() {
        Future submit = this.f119924d.submit(new C46542a("127.0.0.1", this.f119922b));
        m146281f();
        try {
            if (!((Boolean) submit.get()).booleanValue()) {
                C46470c.m146089d("TAG_PROXY_ProxyServer", "Ping error");
                mo115710c();
                return false;
            }
            C46470c.m146085b("TAG_PROXY_ProxyServer", "Ping OK!");
            return true;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Error happen in ping. ");
            sb.append(C46470c.m146081a(th));
            C46470c.m146089d("TAG_PROXY_ProxyServer", sb.toString());
            mo115710c();
            return false;
        }
    }

    /* renamed from: a */
    public final String mo115706a(String str, String... strArr) {
        return m146279a(false, str, strArr);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo115708a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.util.SparseArray<java.util.Set<com.toutiao.proxyserver.t>> r1 = r3.f119927h
            monitor-enter(r1)
            android.util.SparseArray<java.util.Set<com.toutiao.proxyserver.t>> r2 = r3.f119927h     // Catch:{ all -> 0x0030 }
            java.lang.Object r4 = r2.get(r4)     // Catch:{ all -> 0x0030 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x002e
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0030 }
        L_0x0015:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0030 }
            com.toutiao.proxyserver.t r2 = (com.toutiao.proxyserver.C46554t) r2     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = r2.f119663h     // Catch:{ all -> 0x0030 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0015
            r4 = 1
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r4
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r0
        L_0x0030:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C46536s.mo115708a(int, java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo115707a(long j, long j2, long j3) {
        this.f119929j = j;
        this.f119930k = 10000;
        this.f119931l = 10000;
    }

    /* renamed from: a */
    private String m146279a(boolean z, final String str, String... strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        C46482g gVar = this.f119926g;
        if (gVar == null || this.f119925f == null) {
            return strArr[0];
        }
        String a = C46474a.m146102a(str);
        C46456aa.m146053a().mo115579a(str, a);
        if (C46534r.f119907n) {
            File d = gVar.mo115595d(a);
            if (d.exists() && d.isFile()) {
                final C46461a a2 = this.f119925f.mo115584a(a, C46462b.m146063a(false));
                if (a2 != null && d.length() >= ((long) a2.f119727c)) {
                    if (C46534r.f119898e != null) {
                        C46476c.m146132b((Runnable) new Runnable(false) {
                            public final void run() {
                                C46534r.f119898e.mo105066a(false, str, a2.f119727c, a2.f119727c);
                                C46456aa.m146053a().mo115578a(str, (long) a2.f119727c);
                            }
                        });
                    }
                    return d.getAbsolutePath();
                }
            }
        }
        List a3 = C46476c.m146116a(strArr);
        if (this.f119923c.get() != 1 || a3 == null) {
            return strArr[0];
        }
        String a4 = C46564v.m146341a(str, a, a3);
        if (a4 == null) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder("http://127.0.0.1:");
        sb.append(this.f119922b);
        sb.append("?");
        sb.append(a4);
        return sb.toString();
    }
}
