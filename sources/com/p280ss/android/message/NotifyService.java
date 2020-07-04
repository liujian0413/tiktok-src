package com.p280ss.android.message;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.message.C19828b.C19829a;
import com.p280ss.android.message.log.C19848a;
import com.p280ss.android.message.p885a.C19813b;
import com.p280ss.android.message.push.p886a.C19853a;
import com.p280ss.android.message.push.p886a.C19855c;
import com.p280ss.android.message.push.p886a.C19856d;
import com.p280ss.android.message.push.p886a.C19856d.C19859a;
import com.p280ss.android.message.sswo.C19894a;
import com.p280ss.android.pushmanager.C20074g;
import com.p280ss.android.pushmanager.C20078k;
import com.p280ss.android.pushmanager.app.C20047d;
import com.p280ss.android.pushmanager.setting.C20089a;
import com.p280ss.android.pushmanager.setting.C20090b;
import com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.message.NotifyService */
public class NotifyService extends Service implements C6310a {

    /* renamed from: f */
    private static volatile int f53719f = 0;

    /* renamed from: g */
    private static volatile boolean f53720g = false;

    /* renamed from: h */
    private static volatile String f53721h = "";

    /* renamed from: i */
    private static volatile boolean f53722i = true;

    /* renamed from: j */
    private static volatile boolean f53723j = false;

    /* renamed from: k */
    private static volatile String f53724k = "";

    /* renamed from: l */
    private static volatile boolean f53725l = true;

    /* renamed from: a */
    public C19838g f53726a;

    /* renamed from: b */
    public C6309f f53727b = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: c */
    boolean f53728c = false;

    /* renamed from: d */
    public Map<Long, C19853a> f53729d = new HashMap();

    /* renamed from: e */
    private C19856d f53730e = null;

    /* renamed from: m */
    private boolean f53731m = true;

    /* renamed from: n */
    private C19829a f53732n = new C19829a() {
        /* renamed from: b */
        public final void mo53132b(C19831c cVar) {
        }

        /* renamed from: a */
        public final void mo53131a(final C19831c cVar) {
            NotifyService.this.f53727b.post(new Runnable() {
                public final void run() {
                    try {
                        C197941.this.mo53133c(cVar);
                    } catch (Exception unused) {
                    }
                }
            });
        }

        /* renamed from: c */
        public final void mo53133c(C19831c cVar) {
            C19855c cVar2;
            if (cVar != null) {
                try {
                    long c = cVar.mo53177c();
                    if (NotifyService.this.f53729d == null || !NotifyService.this.f53729d.containsKey(Long.valueOf(c))) {
                        cVar2 = new C19855c();
                    } else {
                        cVar2 = (C19855c) NotifyService.this.f53729d.get(Long.valueOf(c));
                    }
                    cVar2.f53840d = cVar.mo53177c();
                    cVar2.f53837a = cVar.mo53178d();
                    cVar2.f53838b = cVar.mo53179e();
                    cVar2.f53839c = cVar.mo53180f();
                    cVar2.f53841e = cVar.mo53175a();
                    cVar2.f53842f = cVar.mo53176b();
                    cVar2.f53843g = cVar.mo53181g();
                    NotifyService.this.f53729d.put(Long.valueOf(c), cVar2);
                    NotifyService.this.mo53118b();
                } catch (Exception | NullPointerException unused) {
                }
                NotifyService.this.mo53120d();
            }
        }
    };

    /* renamed from: o */
    private HandlerThread f53733o = new HandlerThread("NotifyService");

    /* renamed from: p */
    private volatile Looper f53734p;

    /* renamed from: q */
    private ContentObserver f53735q = new ContentObserver(this.f53727b) {
        public final void onChange(boolean z) {
            C20090b.m66187a();
            NotifyService.this.mo53121e();
        }
    };

    /* renamed from: r */
    private ContentObserver f53736r = new ContentObserver(this.f53727b) {
        public final void onChange(boolean z) {
            C20090b.m66187a();
            NotifyService.this.mo53122f();
        }
    };

    /* renamed from: s */
    private ContentObserver f53737s = new ContentObserver(this.f53727b) {
        public final void onChange(boolean z) {
            C20090b.m66187a();
            NotifyService.m65384g();
        }
    };

    /* renamed from: t */
    private ContentObserver f53738t = new ContentObserver(this.f53727b) {
        public final void onChange(boolean z) {
            NotifyService.this.mo53123h();
        }
    };

    /* renamed from: u */
    private ContentObserver f53739u = new ContentObserver(this.f53727b) {
        public final void onChange(boolean z) {
            NotifyService.this.f53726a.mo53193d();
        }
    };

    /* renamed from: v */
    private ContentObserver f53740v = new ContentObserver(this.f53727b) {
        public final void onChange(boolean z) {
            NotifyService.this.mo53124i();
        }
    };

    /* renamed from: w */
    private ContentObserver f53741w = new ContentObserver(this.f53727b) {
        public final void onChange(boolean z) {
            C20090b.m66187a();
            NotifyService.m65385j();
            NotifyService.this.f53726a.mo53193d();
        }
    };

    /* renamed from: x */
    private ContentObserver f53742x = new ContentObserver(this.f53727b) {
        public final void onChange(boolean z) {
            C20090b.m66187a();
            NotifyService.this.mo53125k();
        }
    };

    public void handleMsg(Message message) {
    }

    /* renamed from: l */
    private void m65386l() {
        this.f53726a = new C19838g(this);
    }

    /* renamed from: h */
    public final void mo53123h() {
        C20090b.m66187a();
        f53722i = true;
    }

    /* renamed from: n */
    private static long m65388n() {
        return (long) C20047d.m66018a().mo53673b().mo53702c();
    }

    /* renamed from: d */
    public final void mo53120d() {
        if (this.f53729d != null) {
            mo53119c();
        }
    }

    /* renamed from: g */
    public static void m65384g() {
        try {
            String d = C20090b.m66187a().mo53769d();
            if (!C6319n.m19593a(d) && !d.equals(f53721h)) {
                f53721h = d;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public static void m65385j() {
        try {
            String f = C20090b.m66187a().mo53775f();
            if (!C6319n.m19593a(f) && !f.equals(f53724k)) {
                f53724k = f;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public final void mo53124i() {
        try {
            boolean b = C20090b.m66187a().mo53764b();
            f53723j = b;
            if (b) {
                stopSelf();
            }
        } catch (Exception unused) {
        }
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            m65387m();
            if (this.f53733o != null) {
                if (VERSION.SDK_INT >= 18) {
                    this.f53733o.quitSafely();
                    return;
                }
                this.f53733o.quit();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: m */
    private void m65387m() {
        this.f53728c = true;
        if (this.f53730e != null) {
            this.f53730e.mo53224a();
            this.f53730e = null;
        }
        m65390p();
        C19894a.m65685a(this).mo53314b();
        try {
            this.f53726a.mo53191b();
        } catch (Exception unused) {
        }
        C19848a.m65547a();
        try {
            if (C20074g.m66102a().mo53714e() != null) {
                C20074g.m66102a().mo53714e().mo53187a();
            }
            C20078k.m66122b().mo53187a();
        } catch (Exception unused2) {
        }
    }

    /* renamed from: e */
    public final void mo53121e() {
        long c = (long) C20047d.m66018a().mo53673b().mo53702c();
        boolean o = C20090b.m66187a().mo53789o();
        if (o != f53719f) {
            f53719f = o ? 1 : 0;
            if (this.f53729d != null) {
                C19855c cVar = (C19855c) this.f53729d.get(Long.valueOf(c));
                if (cVar != null) {
                    cVar.f53842f = o;
                    this.f53729d.put(Long.valueOf(c), cVar);
                    mo53118b();
                }
            }
        }
        mo53119c();
    }

    /* renamed from: k */
    public final void mo53125k() {
        boolean g = C20090b.m66187a().mo53780g();
        if (g != f53725l) {
            f53725l = g;
        }
        if (f53725l) {
            if (VERSION.SDK_INT >= 21) {
                PushJobService.m65406a(this);
            }
        } else if (VERSION.SDK_INT >= 21) {
            PushJobService.m65407b(this);
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f53733o.start();
        this.f53734p = this.f53733o.getLooper();
        this.f53727b = new C6309f(this.f53734p, this);
        this.f53727b.post(new Runnable() {
            public final void run() {
                try {
                    NotifyService.this.mo53116a();
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: p */
    private void m65390p() {
        try {
            getContentResolver().unregisterContentObserver(this.f53735q);
            getContentResolver().unregisterContentObserver(this.f53736r);
            getContentResolver().unregisterContentObserver(this.f53737s);
            getContentResolver().unregisterContentObserver(this.f53738t);
            getContentResolver().unregisterContentObserver(this.f53739u);
            getContentResolver().unregisterContentObserver(this.f53740v);
            getContentResolver().unregisterContentObserver(this.f53741w);
            getContentResolver().unregisterContentObserver(this.f53742x);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004b */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo53118b() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004b }
            r1.<init>()     // Catch:{ Exception -> 0x004b }
            java.util.Map<java.lang.Long, com.ss.android.message.push.a.a> r2 = r7.f53729d     // Catch:{ Exception -> 0x004b }
            java.util.Set r2 = r2.entrySet()     // Catch:{ Exception -> 0x004b }
            r3 = 0
            java.util.Iterator r4 = r2.iterator()     // Catch:{ Exception -> 0x004b }
        L_0x0013:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x004b }
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x004b }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Exception -> 0x004b }
            java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x004b }
            com.ss.android.message.push.a.a r5 = (com.p280ss.android.message.push.p886a.C19853a) r5     // Catch:{ Exception -> 0x004b }
            if (r5 == 0) goto L_0x0013
            int r6 = r2.size()     // Catch:{ Exception -> 0x004b }
            int r6 = r6 + -1
            if (r3 == r6) goto L_0x003c
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x004b }
            r1.append(r5)     // Catch:{ Exception -> 0x004b }
            java.lang.String r5 = "@"
            r1.append(r5)     // Catch:{ Exception -> 0x004b }
            goto L_0x0043
        L_0x003c:
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x004b }
            r1.append(r5)     // Catch:{ Exception -> 0x004b }
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0046:
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x004b }
            r0 = r1
        L_0x004b:
            boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0058
            com.ss.android.pushmanager.setting.b r1 = com.p280ss.android.pushmanager.setting.C20090b.m66187a()     // Catch:{ all -> 0x005a }
            r1.mo53776f(r0)     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r7)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.NotifyService.mo53118b():void");
    }

    /* renamed from: c */
    public final void mo53119c() {
        int i;
        if (C6312h.m19578b()) {
            StringBuilder sb = new StringBuilder("doPushStart mPushApps Contains ");
            if (this.f53729d == null) {
                i = 0;
            } else {
                i = this.f53729d.size();
            }
            sb.append(i);
        }
        if (!C20090b.m66187a().mo53789o()) {
            try {
                if (this.f53730e != null) {
                    this.f53730e.mo53224a();
                }
            } catch (Exception unused) {
            }
        } else {
            if (!(this.f53730e == null || this.f53729d == null || this.f53729d.isEmpty())) {
                for (C19853a a : this.f53729d.values()) {
                    m65382a(a);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo53122f() {
        long c = (long) C20047d.m66018a().mo53673b().mo53702c();
        Boolean valueOf = Boolean.valueOf(C20090b.m66187a().mo53768c());
        if (valueOf.booleanValue() != f53720g) {
            if (this.f53729d != null) {
                C19855c cVar = (C19855c) this.f53729d.get(Long.valueOf(c));
                if (cVar != null) {
                    cVar.f53841e = C20090b.m66187a().mo53768c();
                    this.f53729d.put(Long.valueOf(c), cVar);
                    mo53118b();
                }
            }
            f53720g = valueOf.booleanValue();
            if (this.f53730e != null) {
                this.f53730e.mo53232c(getApplicationContext(), new C19859a() {
                    /* renamed from: a */
                    public final void mo53145a() {
                        NotifyService.this.mo53119c();
                    }
                });
            }
            if (C20090b.m66187a().mo53788n()) {
                stopSelf();
                try {
                    C19813b.m65416a(getApplicationContext());
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: o */
    private void m65389o() {
        try {
            getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(this, "allow_self_push_enable", "boolean"), true, this.f53735q);
            getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(this, "push_notify_enable", "boolean"), true, this.f53736r);
            getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(this, "loc", "string"), true, this.f53737s);
            getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(this, "allow_network", "boolean"), true, this.f53738t);
            getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(this, "ssids", "string"), true, this.f53739u);
            getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(this, "shut_push_on_stop_service", "boolean"), true, this.f53740v);
            getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(this, "uninstall_question_url", "string"), true, this.f53741w);
            getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(this, "allow_push_job_service", "boolean"), true, this.f53742x);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(1:2)|3|4|(1:6)|7|8|(2:10|(1:12)(2:13|(3:17|(1:22)(1:21)|(1:24))))|25|26|27|28|(1:30)|31|32|(1:34)|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        com.p280ss.android.message.p885a.C19813b.m65416a(getApplicationContext());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00ae */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00ce */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00f0 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4 A[Catch:{ Throwable -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d8 A[Catch:{ Throwable -> 0x00ef }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53116a() {
        /*
            r4 = this;
            r4.m65386l()
            boolean r0 = com.bytedance.common.utility.C6312h.m19578b()
            if (r0 == 0) goto L_0x0010
            android.content.Context r0 = r4.getApplicationContext()
            com.p280ss.android.pushmanager.app.C20051g.m66039b(r0)
        L_0x0010:
            com.ss.android.push.daemon.c r0 = com.p280ss.android.push.daemon.C20013c.m65938a(r4)     // Catch:{ Throwable -> 0x00f0 }
            r0.mo53594a()     // Catch:{ Throwable -> 0x00f0 }
            com.ss.android.pushmanager.app.c$a r0 = com.p280ss.android.pushmanager.app.C20044c.m66004a()     // Catch:{ Throwable -> 0x00f0 }
            if (r0 == 0) goto L_0x0020
            r0.mo53663a(r4)     // Catch:{ Throwable -> 0x00f0 }
        L_0x0020:
            com.ss.android.pushmanager.setting.b r0 = com.p280ss.android.pushmanager.setting.C20090b.m66187a()     // Catch:{ Throwable -> 0x0078 }
            boolean r0 = r0.mo53748D()     // Catch:{ Throwable -> 0x0078 }
            if (r0 == 0) goto L_0x0078
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0078 }
            r1 = 18
            if (r0 >= r1) goto L_0x003b
            r0 = -2048(0xfffffffffffff800, float:NaN)
            android.app.Notification r1 = new android.app.Notification     // Catch:{ Throwable -> 0x0078 }
            r1.<init>()     // Catch:{ Throwable -> 0x0078 }
            r4.startForeground(r0, r1)     // Catch:{ Throwable -> 0x0078 }
            goto L_0x0078
        L_0x003b:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0078 }
            if (r0 < r1) goto L_0x0078
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0078 }
            r1 = 24
            if (r0 >= r1) goto L_0x0078
            boolean r0 = com.p280ss.android.message.p885a.C19821g.m65450c()     // Catch:{ Throwable -> 0x0078 }
            r1 = 1
            if (r0 == 0) goto L_0x0054
            boolean r0 = com.p280ss.android.message.p885a.C19821g.m65447b()     // Catch:{ Throwable -> 0x0078 }
            if (r0 == 0) goto L_0x0054
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r0 != 0) goto L_0x0078
            android.app.Notification$Builder r0 = new android.app.Notification$Builder     // Catch:{ Throwable -> 0x0078 }
            android.content.Context r2 = r4.getApplicationContext()     // Catch:{ Throwable -> 0x0078 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0078 }
            r2 = 2131233873(0x7f080c51, float:1.8083896E38)
            android.app.Notification$Builder r0 = r0.setSmallIcon(r2)     // Catch:{ Throwable -> 0x0078 }
            android.app.Notification r0 = r0.build()     // Catch:{ Throwable -> 0x0078 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Throwable -> 0x0078 }
            java.lang.Class<com.ss.android.message.NotifyIntentService> r3 = com.p280ss.android.message.NotifyIntentService.class
            r2.<init>(r4, r3)     // Catch:{ Throwable -> 0x0078 }
            r4.startService(r2)     // Catch:{ Throwable -> 0x0078 }
            r4.startForeground(r1, r0)     // Catch:{ Throwable -> 0x0078 }
        L_0x0078:
            com.ss.android.pushmanager.setting.b r0 = com.p280ss.android.pushmanager.setting.C20090b.m66187a()     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r0 = r0.mo53786l()     // Catch:{ Throwable -> 0x00ae }
            r4.m65383a(r0)     // Catch:{ Throwable -> 0x00ae }
            com.ss.android.message.push.a.d r0 = new com.ss.android.message.push.a.d     // Catch:{ Throwable -> 0x00ae }
            long r1 = m65388n()     // Catch:{ Throwable -> 0x00ae }
            android.content.Context r3 = r4.getApplicationContext()     // Catch:{ Throwable -> 0x00ae }
            r0.<init>(r1, r3)     // Catch:{ Throwable -> 0x00ae }
            r4.f53730e = r0     // Catch:{ Throwable -> 0x00ae }
            r4.m65389o()     // Catch:{ Throwable -> 0x00ae }
            r4.mo53123h()     // Catch:{ Throwable -> 0x00ae }
            m65384g()     // Catch:{ Throwable -> 0x00ae }
            r4.mo53122f()     // Catch:{ Throwable -> 0x00ae }
            r4.mo53124i()     // Catch:{ Throwable -> 0x00ae }
            m65385j()     // Catch:{ Throwable -> 0x00ae }
            r4.mo53125k()     // Catch:{ Throwable -> 0x00ae }
            com.ss.android.message.sswo.a r0 = com.p280ss.android.message.sswo.C19894a.m65685a(r4)     // Catch:{ Throwable -> 0x00ae }
            r0.mo53313a()     // Catch:{ Throwable -> 0x00ae }
        L_0x00ae:
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ Throwable -> 0x00ce }
            com.p280ss.android.pushmanager.app.C20051g.m66037a(r0)     // Catch:{ Throwable -> 0x00ce }
            com.ss.android.message.g r0 = r4.f53726a     // Catch:{ Throwable -> 0x00ce }
            r0.mo53192c()     // Catch:{ Throwable -> 0x00ce }
            com.ss.android.pushmanager.setting.b r0 = com.p280ss.android.pushmanager.setting.C20090b.m66187a()     // Catch:{ Throwable -> 0x00ce }
            boolean r0 = r0.mo53750F()     // Catch:{ Throwable -> 0x00ce }
            if (r0 == 0) goto L_0x00ce
            com.ss.android.message.g r0 = r4.f53726a     // Catch:{ Throwable -> 0x00ce }
            r0.mo53190a()     // Catch:{ Throwable -> 0x00ce }
            com.ss.android.message.g r0 = r4.f53726a     // Catch:{ Throwable -> 0x00ce }
            r0.mo53193d()     // Catch:{ Throwable -> 0x00ce }
        L_0x00ce:
            com.ss.android.pushmanager.e r0 = com.p280ss.android.pushmanager.C20074g.m66102a()     // Catch:{ Throwable -> 0x00ef }
            com.ss.android.message.e r0 = r0.mo53714e()     // Catch:{ Throwable -> 0x00ef }
            if (r0 == 0) goto L_0x00e3
            com.ss.android.pushmanager.e r0 = com.p280ss.android.pushmanager.C20074g.m66102a()     // Catch:{ Throwable -> 0x00ef }
            com.ss.android.message.e r0 = r0.mo53714e()     // Catch:{ Throwable -> 0x00ef }
            r0.mo53188a(r4)     // Catch:{ Throwable -> 0x00ef }
        L_0x00e3:
            com.ss.android.pushmanager.k r0 = com.p280ss.android.pushmanager.C20078k.m66122b()     // Catch:{ Throwable -> 0x00ef }
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ Throwable -> 0x00ef }
            r0.mo53188a(r1)     // Catch:{ Throwable -> 0x00ef }
            return
        L_0x00ef:
            return
        L_0x00f0:
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ Throwable -> 0x00f8 }
            com.p280ss.android.message.p885a.C19813b.m65416a(r0)     // Catch:{ Throwable -> 0x00f8 }
            return
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.NotifyService.mo53116a():void");
    }

    public IBinder onBind(Intent intent) {
        return this.f53732n;
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    /* renamed from: a */
    private void m65381a(long j) {
        if (this.f53730e != null) {
            this.f53730e.mo53225a(j, (Context) this);
        }
    }

    /* renamed from: a */
    private void m65382a(C19853a aVar) {
        if (this.f53730e != null && aVar != null) {
            this.f53730e.mo53229a(aVar, (Context) this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m65383a(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r6)
            return
        L_0x0009:
            java.util.Map<java.lang.Long, com.ss.android.message.push.a.a> r0 = r6.f53729d     // Catch:{ Exception -> 0x0036 }
            r0.clear()     // Catch:{ Exception -> 0x0036 }
            java.lang.String r0 = "@"
            java.lang.String[] r7 = r7.split(r0)     // Catch:{ Exception -> 0x0036 }
            if (r7 == 0) goto L_0x0034
            int r0 = r7.length     // Catch:{ Exception -> 0x0036 }
            r1 = 0
        L_0x0018:
            if (r1 >= r0) goto L_0x0034
            r2 = r7[r1]     // Catch:{ Exception -> 0x0036 }
            com.ss.android.message.push.a.c r3 = new com.ss.android.message.push.a.c     // Catch:{ Exception -> 0x0036 }
            r3.<init>()     // Catch:{ Exception -> 0x0036 }
            r3.mo53223a(r2)     // Catch:{ Exception -> 0x0036 }
            java.util.Map<java.lang.Long, com.ss.android.message.push.a.a> r2 = r6.f53729d     // Catch:{ Exception -> 0x0036 }
            long r4 = r3.mo53219d()     // Catch:{ Exception -> 0x0036 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0036 }
            r2.put(r4, r3)     // Catch:{ Exception -> 0x0036 }
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0034:
            monitor-exit(r6)
            return
        L_0x0036:
            monitor-exit(r6)
            return
        L_0x0038:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.NotifyService.m65383a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo53117a(Intent intent) {
        try {
            if (C20074g.m66102a().mo53714e() != null) {
                C20074g.m66102a().mo53714e().mo53189a(intent);
            }
            C20078k.m66122b().mo53189a(intent);
        } catch (Throwable unused) {
        }
        if (this.f53731m) {
            this.f53731m = false;
        }
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                C20090b.m66187a();
                if (C20090b.m66187a().mo53788n()) {
                    try {
                        C19813b.m65416a(getApplicationContext());
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                } else if (extras != null) {
                    if (extras.getBoolean("push_heart_beat")) {
                        if (this.f53730e != null) {
                            this.f53730e.mo53228a(getApplicationContext(), (C19859a) new C19859a() {
                                /* renamed from: a */
                                public final void mo53145a() {
                                    NotifyService.this.mo53119c();
                                }
                            });
                        }
                        return;
                    } else if (extras.getBoolean("remove_app")) {
                        String string = extras.getString("remove_app_package");
                        if (!C6319n.m19593a(string)) {
                            for (C19853a aVar : this.f53729d.values()) {
                                if (string.equals(aVar.mo53221f())) {
                                    m65381a(aVar.mo53219d());
                                }
                            }
                        }
                        return;
                    }
                }
            } catch (Exception unused3) {
                return;
            }
        }
        mo53119c();
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        this.f53727b.post(new Runnable() {
            public final void run() {
                try {
                    NotifyService.this.mo53117a(intent);
                } catch (Exception unused) {
                }
            }
        });
        if (C20089a.m66179a().mo53741a("is_notify_service_stick", Boolean.valueOf(true))) {
            return 1;
        }
        return 0;
    }
}
