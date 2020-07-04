package com.p280ss.optimizer.live.sdk.dns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p022v4.util.ArrayMap;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.optimizer.live.sdk.base.C45889d;
import com.p280ss.optimizer.live.sdk.base.C45890e.C45894a;
import com.p280ss.optimizer.live.sdk.base.model.C45898a;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.optimizer.live.sdk.dns.a */
public final class C45899a implements C45914d {

    /* renamed from: a */
    public final Handler f117332a = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            if (message.what == 1024) {
                if (C45899a.this.f117337f) {
                    C45899a.this.mo111186b();
                    return;
                }
                C45889d.m143985a().f117308c.mo111169a();
            }
        }
    };

    /* renamed from: b */
    public final List<Callable<?>> f117333b;

    /* renamed from: c */
    public Set<String> f117334c;

    /* renamed from: d */
    public long f117335d;

    /* renamed from: e */
    public boolean f117336e;

    /* renamed from: f */
    public boolean f117337f;

    /* renamed from: g */
    public int f117338g;

    /* renamed from: h */
    private final ThreadPoolExecutor f117339h;

    /* renamed from: i */
    private final Context f117340i;

    /* renamed from: j */
    private final BroadcastReceiver f117341j;

    /* renamed from: k */
    private final Map<String, C45917g> f117342k;

    /* renamed from: l */
    private final Map<String, C45917g> f117343l;

    /* renamed from: m */
    private boolean f117344m;

    /* renamed from: n */
    private boolean f117345n;

    /* renamed from: o */
    private C45894a f117346o;

    /* renamed from: com.ss.optimizer.live.sdk.dns.a$a */
    interface C45909a<T> {
        /* renamed from: a */
        void mo111192a(T t);
    }

    /* renamed from: com.ss.optimizer.live.sdk.dns.a$b */
    static class C45910b implements ThreadFactory {

        /* renamed from: a */
        private final ThreadGroup f117361a;

        /* renamed from: b */
        private final AtomicInteger f117362b;

        /* renamed from: c */
        private final String f117363c;

        private C45910b() {
            ThreadGroup threadGroup;
            this.f117362b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f117361a = threadGroup;
            this.f117363c = "dns-optimizer-";
        }

        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f117361a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f117363c);
            sb.append(this.f117362b.getAndIncrement());
            Thread thread = new Thread(threadGroup, runnable, sb.toString(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            return thread;
        }
    }

    static {
        C45916f.m144022a(false);
    }

    /* renamed from: b */
    public final void mo111186b() {
        if (this.f117337f && this.f117343l != null) {
            if (this.f117343l.size() == 0) {
                mo111185a((Callable<T>) new C45913c<T>(mo111189c()), (C45909a<T>) new C45909a<C45898a>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void mo111192a(C45898a aVar) {
                        C45899a.this.mo111187b(aVar);
                        C45899a.this.f117332a.removeMessages(PreloadTask.BYTE_UNIT_NUMBER);
                        C45899a.this.f117332a.sendEmptyMessageDelayed(PreloadTask.BYTE_UNIT_NUMBER, C45899a.this.f117335d);
                    }
                });
                return;
            }
            this.f117338g = 0;
            for (C45917g b : this.f117343l.values()) {
                m143995b(b);
            }
        }
    }

    /* renamed from: c */
    public final String mo111189c() {
        if (this.f117343l == null) {
            return null;
        }
        int i = 0;
        String str = "{ \"IpMap\":{";
        for (C45917g gVar : this.f117343l.values()) {
            C45921j jVar = gVar.f117370b;
            if (jVar != null) {
                if (i != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(",");
                    str = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(jVar.toString());
                str = sb2.toString();
                i++;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("}}");
        return sb3.toString();
    }

    /* renamed from: a */
    public final void mo111182a() {
        this.f117344m = true;
        this.f117340i.registerReceiver(this.f117341j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        C45889d.m143985a().f117308c.mo111169a();
    }

    /* renamed from: b */
    private void m143995b(final C45917g gVar) {
        mo111185a((Callable<T>) new C45915e<T>(gVar.f117369a), (C45909a<T>) new C45909a<C45921j>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo111192a(C45921j jVar) {
                if (jVar == null) {
                    jVar = new C45921j(gVar.f117369a, null, 0);
                }
                gVar.mo111204b(jVar);
                C45899a.this.f117338g++;
                if (C45899a.this.f117338g == C45899a.this.f117334c.size()) {
                    C45899a.this.mo111185a((Callable<T>) new C45913c<T>(C45899a.this.mo111189c()), (C45909a<T>) new C45909a<C45898a>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void mo111192a(C45898a aVar) {
                            C45899a.this.mo111187b(aVar);
                            C45899a.this.f117332a.removeMessages(PreloadTask.BYTE_UNIT_NUMBER);
                            C45899a.this.f117332a.sendEmptyMessageDelayed(PreloadTask.BYTE_UNIT_NUMBER, C45899a.this.f117335d);
                        }
                    });
                }
                if (C45899a.this.f117336e) {
                    C45899a.this.mo111184a(gVar);
                }
            }
        });
    }

    /* renamed from: a */
    public static boolean m143994a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo111188b(String str) {
        if (!this.f117344m) {
            return false;
        }
        return this.f117345n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo111180a(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = r2.f117344m
            r1 = 0
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.f117345n
            if (r0 != 0) goto L_0x000a
            goto L_0x0029
        L_0x000a:
            java.util.Map<java.lang.String, com.ss.optimizer.live.sdk.dns.g> r0 = r2.f117343l
            java.lang.Object r0 = r0.get(r3)
            com.ss.optimizer.live.sdk.dns.g r0 = (com.p280ss.optimizer.live.sdk.dns.C45917g) r0
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = r0.mo111199a()
            if (r1 != 0) goto L_0x0028
        L_0x001a:
            java.util.Map<java.lang.String, com.ss.optimizer.live.sdk.dns.g> r0 = r2.f117342k
            java.lang.Object r3 = r0.get(r3)
            com.ss.optimizer.live.sdk.dns.g r3 = (com.p280ss.optimizer.live.sdk.dns.C45917g) r3
            if (r3 == 0) goto L_0x0028
            java.lang.String r1 = r3.mo111199a()
        L_0x0028:
            return r1
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.optimizer.live.sdk.dns.C45899a.mo111180a(java.lang.String):java.lang.String");
    }

    public C45899a(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C45910b());
        this.f117339h = threadPoolExecutor;
        this.f117339h.allowCoreThreadTimeOut(true);
        this.f117341j = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    return;
                }
                if (!C45899a.m143994a(context)) {
                    C45899a.this.f117332a.removeMessages(PreloadTask.BYTE_UNIT_NUMBER);
                    return;
                }
                C45899a.this.f117332a.removeMessages(PreloadTask.BYTE_UNIT_NUMBER);
                C45899a.this.f117332a.sendEmptyMessageDelayed(PreloadTask.BYTE_UNIT_NUMBER, 2000);
            }
        };
        this.f117342k = new ArrayMap();
        this.f117343l = new ArrayMap();
        this.f117333b = new LinkedList();
        this.f117344m = false;
        this.f117335d = 300000;
        this.f117345n = true;
        this.f117336e = false;
        this.f117337f = true;
        this.f117338g = 0;
        this.f117346o = null;
        this.f117340i = context;
        if (this.f117346o == null) {
            this.f117346o = new C45894a() {
                /* renamed from: a */
                public final void mo111175a(C45898a aVar) {
                    C45899a.this.mo111183a(aVar);
                }
            };
            C45889d.m143985a().f117308c.mo111171a(this.f117346o);
        }
    }

    /* renamed from: b */
    public final void mo111187b(C45898a aVar) {
        if (aVar != null) {
            this.f117334c = aVar.mo111179a();
            long j = 300000;
            if (((long) (aVar.f117326b * 1000)) >= 300000) {
                j = (long) (aVar.f117326b * 1000);
            }
            this.f117335d = j;
            this.f117345n = aVar.f117327c;
            this.f117337f = aVar.f117328d;
            if (this.f117334c == null || this.f117334c.size() == 0) {
                this.f117343l.clear();
                return;
            }
            for (String str : this.f117334c) {
                C45917g gVar = new C45917g(str);
                this.f117343l.put(str, gVar);
                gVar.mo111202a(new C45921j(str, aVar.mo111178a(str), 0));
                gVar.f117372d = aVar.f117325a;
            }
        }
    }

    /* renamed from: a */
    public final void mo111183a(C45898a aVar) {
        if (aVar != null && this.f117344m) {
            mo111187b(aVar);
            if (this.f117345n) {
                mo111186b();
            }
        }
    }

    /* renamed from: a */
    public final void mo111184a(final C45917g gVar) {
        List<String> b = gVar.mo111203b();
        if (!b.isEmpty()) {
            for (String iVar : b) {
                mo111185a((Callable<T>) new C45920i<T>(iVar, 10), (C45909a<T>) new C45909a<C45919h>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void mo111192a(C45919h hVar) {
                        gVar.mo111201a(hVar);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final String mo111181a(String str, String str2) {
        if (!this.f117344m) {
            return null;
        }
        C45917g gVar = (C45917g) this.f117343l.get(str);
        if (gVar != null) {
            return gVar.mo111200a(str2);
        }
        C45917g gVar2 = (C45917g) this.f117342k.get(str);
        if (gVar2 != null) {
            return gVar2.mo111200a(str2);
        }
        return null;
    }

    /* renamed from: a */
    public final <T> void mo111185a(final Callable<T> callable, final C45909a<T> aVar) {
        if (this.f117344m) {
            synchronized (this.f117333b) {
                this.f117333b.add(callable);
            }
            this.f117339h.submit(new Runnable() {
                public final void run() {
                    boolean z;
                    synchronized (C45899a.this.f117333b) {
                        z = !C45899a.this.f117333b.contains(callable);
                    }
                    if (!z) {
                        final Object obj = null;
                        try {
                            obj = callable.call();
                        } catch (Exception unused) {
                        }
                        C45899a.this.f117332a.post(new Runnable() {
                            public final void run() {
                                boolean z;
                                synchronized (C45899a.this.f117333b) {
                                    z = !C45899a.this.f117333b.remove(callable);
                                }
                                if (!z) {
                                    aVar.mo111192a(obj);
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
