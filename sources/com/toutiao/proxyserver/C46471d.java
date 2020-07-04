package com.toutiao.proxyserver;

import com.toutiao.proxyserver.p1841c.C46470c;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.toutiao.proxyserver.d */
public final class C46471d implements Runnable, Callable<Void> {

    /* renamed from: d */
    private static final ExecutorService f119741d;

    /* renamed from: a */
    private volatile boolean f119742a;

    /* renamed from: b */
    private boolean f119743b = C46534r.f119916w;

    /* renamed from: c */
    private BlockingQueue<C46473a> f119744c;

    /* renamed from: e */
    private C46562u f119745e;

    /* renamed from: f */
    private C46563a f119746f;

    /* renamed from: com.toutiao.proxyserver.d$a */
    static class C46473a {

        /* renamed from: f */
        private static final Queue<C46473a> f119747f = new LinkedBlockingQueue(16);

        /* renamed from: a */
        public int f119748a;

        /* renamed from: b */
        private C46562u f119749b;

        /* renamed from: c */
        private byte[] f119750c;

        /* renamed from: d */
        private int f119751d;

        /* renamed from: e */
        private int f119752e;

        private C46473a() {
        }

        /* renamed from: b */
        public final void mo115604b() {
            if (this.f119749b != null) {
                this.f119749b.mo115744a();
            }
        }

        /* renamed from: c */
        public final void mo115605c() {
            this.f119749b = null;
            this.f119748a = 0;
            this.f119751d = 0;
            this.f119752e = 0;
            f119747f.offer(this);
        }

        /* renamed from: a */
        public final C46562u mo115603a() throws C46563a {
            if (this.f119749b != null) {
                try {
                    this.f119749b.mo115746a(this.f119750c, this.f119751d, this.f119752e);
                } catch (C46563a e) {
                    this.f119749b.mo115744a();
                    throw e;
                }
            }
            return this.f119749b;
        }

        /* renamed from: a */
        public static C46473a m146096a(C46562u uVar) {
            C46473a a = m146095a(2);
            a.f119749b = uVar;
            return a;
        }

        /* renamed from: a */
        private static C46473a m146095a(int i) {
            C46473a aVar = (C46473a) f119747f.poll();
            if (aVar == null) {
                aVar = new C46473a();
            }
            aVar.f119748a = i;
            return aVar;
        }

        /* renamed from: a */
        private void m146098a(byte[] bArr) {
            if (this.f119750c == null || this.f119750c.length != bArr.length) {
                this.f119750c = new byte[bArr.length];
            }
            System.arraycopy(bArr, 0, this.f119750c, 0, bArr.length);
        }

        /* renamed from: a */
        public static C46473a m146097a(C46562u uVar, byte[] bArr, int i, int i2) {
            C46473a a = m146095a(1);
            a.f119749b = uVar;
            a.m146098a(bArr);
            a.f119751d = i;
            a.f119752e = i2;
            return a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Void call() throws Exception {
        run();
        return null;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 10, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder("video-cache-writer-");
                sb.append(thread.getId());
                thread.setName(sb.toString());
                return thread;
            }
        });
        f119741d = threadPoolExecutor;
    }

    /* renamed from: b */
    public final Future<Void> mo115599b() {
        if (!this.f119743b || this.f119742a) {
            return null;
        }
        this.f119742a = true;
        try {
            return f119741d.submit(this);
        } catch (Exception unused) {
            this.f119743b = false;
            return null;
        }
    }

    /* renamed from: a */
    public final void mo115597a() {
        if (!this.f119743b || this.f119744c == null || !this.f119742a) {
            if (this.f119745e != null) {
                this.f119745e.mo115744a();
            }
            return;
        }
        this.f119744c.clear();
        this.f119744c.offer(C46473a.m146096a(this.f119745e));
    }

    public final void run() {
        while (this.f119742a) {
            C46473a aVar = null;
            try {
                aVar = (C46473a) this.f119744c.poll(1000, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                C46470c.m146089d("CacheWriter", C46470c.m146081a((Throwable) e));
            }
            if (aVar != null) {
                switch (aVar.f119748a) {
                    case 1:
                        try {
                            aVar.mo115603a();
                            break;
                        } catch (C46563a e2) {
                            StringBuilder sb = new StringBuilder("append to cache file error in network task!!! ");
                            sb.append(C46470c.m146081a((Throwable) e2));
                            C46470c.m146089d("CacheWriter", sb.toString());
                            this.f119742a = false;
                            this.f119746f = e2;
                            this.f119744c.clear();
                            aVar.mo115604b();
                            return;
                        }
                    case 2:
                        aVar.mo115604b();
                        break;
                    case 3:
                        break;
                }
                this.f119742a = false;
                aVar.mo115605c();
                continue;
            }
        }
    }

    public C46471d(C46562u uVar) {
        if (this.f119743b) {
            this.f119744c = new LinkedBlockingQueue();
        }
        this.f119745e = uVar;
        this.f119742a = false;
    }

    /* renamed from: a */
    public final void mo115598a(byte[] bArr, int i, int i2) throws C46563a {
        if (this.f119743b) {
            if (this.f119746f == null && this.f119742a) {
                this.f119744c.offer(C46473a.m146097a(this.f119745e, bArr, 0, i2));
            } else if (!(this.f119746f == null || this.f119745e == null)) {
                this.f119745e = null;
                throw this.f119746f;
            }
        } else if (this.f119745e != null) {
            this.f119745e.mo115746a(bArr, 0, i2);
        }
    }
}
