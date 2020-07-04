package com.p280ss.android.download.p856a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C9713b;
import com.p280ss.android.download.p856a.C19361c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.download.a.a */
abstract class C19358a<K, T, E, V, R, C, N extends C19361c<K, T, E, V, R, C, N>> implements C6310a {

    /* renamed from: a */
    public static final AtomicInteger f52379a = new AtomicInteger();

    /* renamed from: g */
    private static final ExecutorService f52380g = C19360b.m63556a(new C9713b("AsyncLoader-Worker", true));

    /* renamed from: b */
    final String f52381b;

    /* renamed from: c */
    final int f52382c;

    /* renamed from: d */
    final int f52383d;

    /* renamed from: e */
    final Object f52384e;

    /* renamed from: f */
    public final Handler f52385f;

    /* renamed from: h */
    private final HashMap<K, N> f52386h;

    /* renamed from: i */
    private N f52387i;

    /* renamed from: j */
    private N f52388j;

    /* renamed from: k */
    private volatile boolean f52389k;

    /* renamed from: l */
    private final AtomicBoolean f52390l;

    /* renamed from: m */
    private final AtomicBoolean f52391m;

    /* renamed from: n */
    private volatile int f52392n;

    /* renamed from: o */
    private final LinkedList<C19359a> f52393o;

    /* renamed from: p */
    private ArrayList<N> f52394p;

    /* renamed from: com.ss.android.download.a.a$a */
    class C19359a implements Runnable {

        /* renamed from: a */
        N f52395a;

        /* renamed from: b */
        int f52396b;

        public final void run() {
            if (this.f52395a != null) {
                R r = null;
                try {
                    r = C19358a.this.mo51325a(this.f52395a.f52400c, this.f52395a.f52401d, this.f52395a.f52402e);
                } catch (Exception unused) {
                }
                this.f52395a.f52403f = r;
                Message obtainMessage = C19358a.this.f52385f.obtainMessage(1001);
                obtainMessage.obj = this;
                obtainMessage.arg1 = this.f52396b;
                C19358a.this.f52385f.sendMessage(obtainMessage);
                return;
            }
            Message obtainMessage2 = C19358a.this.f52385f.obtainMessage(1002);
            obtainMessage2.obj = this;
            C19358a.this.f52385f.sendMessage(obtainMessage2);
        }

        C19359a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract N mo51324a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo51325a(K k, T t, E e);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo51327a(K k, T t, E e, C c, R r);

    /* renamed from: c */
    public void mo51329c() {
        synchronized (this.f52384e) {
            this.f52391m.set(true);
        }
    }

    /* renamed from: e */
    private void m63544e() {
        if (!this.f52389k) {
            this.f52387i = m63545f();
            this.f52388j = m63545f();
            this.f52387i.f52399b = this.f52388j;
            this.f52388j.f52398a = this.f52387i;
            this.f52389k = true;
        }
    }

    /* renamed from: f */
    private N m63545f() {
        int size = this.f52394p.size();
        if (size <= 0) {
            return mo51324a();
        }
        return (C19361c) this.f52394p.remove(size - 1);
    }

    /* renamed from: g */
    private boolean m63546g() {
        if (this.f52390l.get() || this.f52391m.get() || this.f52387i.f52399b == this.f52388j) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private N m63547h() {
        if (this.f52390l.get() || this.f52391m.get() || this.f52387i.f52399b == this.f52388j) {
            return null;
        }
        N n = this.f52387i.f52399b;
        m63539a(n);
        n.f52399b = null;
        n.f52398a = null;
        return n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0003, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:26:0x0003, LOOP_START, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m63548i() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f52384e
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r4.m63546g()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            java.util.LinkedList<com.ss.android.download.a.a$a<>> r1 = r4.f52393o     // Catch:{ Throwable -> 0x0003 }
            java.lang.Object r1 = r1.poll()     // Catch:{ Throwable -> 0x0003 }
            com.ss.android.download.a.a$a r1 = (com.p280ss.android.download.p856a.C19358a.C19359a) r1     // Catch:{ Throwable -> 0x0003 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0015:
            com.ss.android.download.a.c r2 = r4.m63547h()     // Catch:{ Throwable -> 0x0003 }
            if (r2 != 0) goto L_0x0022
            java.util.LinkedList<com.ss.android.download.a.a$a<>> r2 = r4.f52393o     // Catch:{ Throwable -> 0x0003 }
            r2.add(r1)     // Catch:{ Throwable -> 0x0003 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0022:
            int r3 = r4.f52392n     // Catch:{ Throwable -> 0x0003 }
            r1.f52396b = r3     // Catch:{ Throwable -> 0x0003 }
            r1.f52395a = r2     // Catch:{ Throwable -> 0x0003 }
            java.util.concurrent.ExecutorService r2 = f52380g     // Catch:{ Throwable -> 0x0003 }
            r2.submit(r1)     // Catch:{ Throwable -> 0x0003 }
            goto L_0x0003
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.p856a.C19358a.m63548i():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo51330d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f52384e
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f52390l     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x000d:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f52391m     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001e
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.f52391m     // Catch:{ all -> 0x0020 }
            r2 = 0
            r1.set(r2)     // Catch:{ all -> 0x0020 }
            r3.m63548i()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.p856a.C19358a.mo51330d():void");
    }

    /* renamed from: b */
    public void mo51328b() {
        synchronized (this.f52384e) {
            if (!this.f52390l.get()) {
                f52379a.decrementAndGet();
                this.f52390l.set(true);
                for (C19361c a : this.f52386h.values()) {
                    a.mo51332a();
                }
                this.f52386h.clear();
                this.f52387i.f52399b = this.f52388j;
                this.f52388j.f52398a = this.f52387i;
            }
        }
        this.f52385f.removeMessages(1001);
    }

    /* renamed from: a */
    private static void m63539a(N n) {
        n.f52398a.f52399b = n.f52399b;
        n.f52399b.f52398a = n.f52398a;
    }

    /* renamed from: b */
    private void m63542b(N n) {
        if (n != null) {
            n.f52400c = null;
            n.f52398a = null;
            n.f52399b = null;
            n.f52402e = null;
            n.f52401d = null;
            n.f52403f = null;
            n.mo51332a();
            if (this.f52394p.size() < 50) {
                this.f52394p.add(n);
            }
        }
    }

    public void handleMsg(Message message) {
        C19361c cVar;
        if (message.what == 1001 || message.what == 1002) {
            C19359a aVar = (C19359a) message.obj;
            if (aVar != null) {
                synchronized (this.f52384e) {
                    if (message.what == 1001) {
                        cVar = aVar.f52395a;
                    } else {
                        cVar = null;
                    }
                    aVar.f52395a = null;
                    aVar.f52396b = 0;
                    this.f52393o.add(aVar);
                    if (cVar != null) {
                        if (!this.f52390l.get() && message.arg1 == this.f52392n) {
                            this.f52386h.remove(cVar.f52400c);
                        }
                        mo51327a(cVar.f52400c, cVar.f52401d, cVar.f52402e, (C) cVar.mo51334b(), cVar.f52403f);
                        m63542b(cVar);
                    }
                }
                m63548i();
            }
        }
    }

    /* renamed from: a */
    private static void m63540a(N n, N n2) {
        n2.f52399b = n.f52399b;
        n2.f52398a = n;
        n2.f52399b.f52398a = n2;
        n.f52399b = n2;
    }

    protected C19358a(int i, int i2, String str) {
        this(i, i2, str, false);
    }

    /* renamed from: b */
    private void m63543b(K k, T t, E e, V v) {
        m63541a(k, t, e, v, false);
    }

    /* renamed from: a */
    public void mo51326a(K k, T t, E e, V v) {
        if (k != null) {
            synchronized (this.f52384e) {
                if (!this.f52390l.get()) {
                    m63543b(k, t, e, v);
                    m63548i();
                }
            }
        }
    }

    protected C19358a(int i, int i2, String str, boolean z) {
        this.f52384e = new Object();
        this.f52389k = false;
        this.f52393o = new LinkedList<>();
        this.f52394p = new ArrayList<>();
        if (i2 > 0) {
            if (i <= i2) {
                i = i2 + 1;
            }
            this.f52382c = i;
            this.f52383d = i2;
            this.f52381b = str;
            this.f52392n = 1;
            this.f52390l = new AtomicBoolean();
            this.f52391m = new AtomicBoolean();
            this.f52386h = new HashMap<>();
            m63544e();
            if (z) {
                this.f52385f = new C6309f(Looper.getMainLooper(), this);
            } else {
                this.f52385f = new C6309f(this);
            }
            for (int i3 = 0; i3 < i2; i3++) {
                this.f52393o.add(new C19359a());
            }
            return;
        }
        throw new IllegalArgumentException("maxWorker must be great than 1");
    }

    /* renamed from: a */
    private void m63541a(K k, T t, E e, V v, boolean z) {
        C19361c cVar = (C19361c) this.f52386h.get(k);
        if (cVar != null) {
            if (v != null) {
                cVar.mo51333a(v);
            }
            if (!(cVar.f52399b == null || cVar.f52398a == null || cVar.f52398a == this.f52387i)) {
                m63539a(cVar);
                m63540a(this.f52387i, cVar);
            }
        } else {
            C19361c f = m63545f();
            f.f52400c = k;
            f.f52401d = t;
            if (v != null) {
                f.mo51333a(v);
            }
            f.f52402e = e;
            m63540a(this.f52387i, f);
            this.f52386h.put(k, f);
            if (this.f52386h.size() > this.f52382c) {
                this.f52386h.remove(this.f52388j.f52398a.f52400c);
                N n = this.f52388j.f52398a;
                m63539a(this.f52388j.f52398a);
                m63542b(n);
            }
        }
    }
}
