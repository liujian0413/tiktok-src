package com.p280ss.android.newmedia.redbadge;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C9709a;
import com.p280ss.android.message.log.C19851c;
import com.p280ss.android.newmedia.redbadge.p895b.C19979a;
import com.p280ss.android.pushmanager.C20071d;
import com.p280ss.android.pushmanager.app.C20044c;
import com.p280ss.android.pushmanager.setting.C20089a;
import com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.newmedia.redbadge.d */
public class C19983d implements C6310a {

    /* renamed from: p */
    private static volatile C19983d f54082p;

    /* renamed from: a */
    public boolean f54083a;

    /* renamed from: b */
    public C20071d f54084b;

    /* renamed from: c */
    public Context f54085c;

    /* renamed from: d */
    public final C6309f f54086d = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: e */
    public boolean f54087e;

    /* renamed from: f */
    public int f54088f;

    /* renamed from: g */
    public String f54089g;

    /* renamed from: h */
    public String f54090h;

    /* renamed from: i */
    public String f54091i;

    /* renamed from: j */
    public long f54092j;

    /* renamed from: k */
    public long f54093k;

    /* renamed from: l */
    public long f54094l;

    /* renamed from: m */
    public int f54095m;

    /* renamed from: n */
    final BroadcastReceiver f54096n = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (context != null && intent != null) {
                try {
                    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && C19989e.m65900a(context) && C19983d.this.f54083a) {
                        C19983d.this.f54086d.sendEmptyMessage(0);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: o */
    public AtomicBoolean f54097o = new AtomicBoolean(false);

    /* renamed from: q */
    private int f54098q;

    /* renamed from: r */
    private long f54099r;

    /* renamed from: s */
    private boolean f54100s = false;

    /* renamed from: t */
    private ContentObserver f54101t = new ContentObserver(this.f54086d) {
        public final void onChange(boolean z) {
            C19983d.this.mo53498a(C19983d.this.f54085c);
        }
    };

    /* renamed from: u */
    private ContentObserver f54102u = new ContentObserver(this.f54086d) {
        public final void onChange(boolean z) {
            C19983d.this.mo53498a(C19983d.this.f54085c);
        }
    };

    /* renamed from: v */
    private ContentObserver f54103v = new ContentObserver(this.f54086d) {
        public final void onChange(boolean z) {
            C19983d.this.mo53501b(C19983d.this.f54085c);
        }
    };

    /* renamed from: a */
    public final void mo53497a() {
        if (this.f54087e) {
            this.f54086d.sendEmptyMessage(1);
        }
    }

    /* renamed from: b */
    public final void mo53500b() {
        if (this.f54087e) {
            this.f54086d.sendEmptyMessage(2);
        }
    }

    /* renamed from: e */
    private void m65891e() {
        if (this.f54087e) {
            this.f54100s = true;
            if (!this.f54086d.hasMessages(0)) {
                this.f54086d.sendEmptyMessageDelayed(0, (long) (this.f54095m * 1000));
            }
        }
    }

    /* renamed from: f */
    private void m65892f() {
        if (this.f54087e) {
            this.f54100s = false;
            this.f54086d.removeMessages(0);
            this.f54086d.sendEmptyMessageDelayed(0, (long) (this.f54098q * 1000));
        }
    }

    /* renamed from: d */
    private void m65890d() {
        long j;
        if (this.f54087e) {
            try {
                this.f54086d.removeMessages(0);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis < this.f54094l) {
                    this.f54094l = currentTimeMillis - ((long) (this.f54095m * 1000));
                    C19979a.m65855a(this.f54085c).mo53474a(this.f54094l);
                }
                if (!C20089a.m66179a().mo53744c() || !C20044c.m66007b().mo53671g()) {
                    if (this.f54099r < this.f54092j) {
                        j = (currentTimeMillis - this.f54092j) - 900000;
                    } else {
                        j = currentTimeMillis - this.f54099r;
                    }
                    if (j < ((long) (this.f54098q * 1000)) || currentTimeMillis - this.f54094l < ((long) (this.f54095m * 1000))) {
                        this.f54086d.sendMessage(this.f54086d.obtainMessage(4, Long.valueOf(currentTimeMillis)));
                    } else {
                        m65886a(currentTimeMillis);
                    }
                } else {
                    this.f54086d.sendMessage(this.f54086d.obtainMessage(4, Long.valueOf(currentTimeMillis)));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|17|(1:22)(1:21)|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00c7 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53502c() {
        /*
            r12 = this;
            android.content.Context r0 = r12.f54085c
            com.ss.android.newmedia.redbadge.b.a r0 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r0)
            java.lang.String r0 = r0.mo53494k()
            android.content.Context r1 = r12.f54085c
            com.ss.android.newmedia.redbadge.b.a r1 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r1)
            boolean r1 = r1.mo53495l()
            if (r1 == 0) goto L_0x00e9
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00e9
            android.content.Context r1 = r12.f54085c     // Catch:{ Exception -> 0x00e9 }
            com.ss.android.newmedia.redbadge.b.a r1 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r1)     // Catch:{ Exception -> 0x00e9 }
            int r1 = r1.mo53491h()     // Catch:{ Exception -> 0x00e9 }
            long r2 = r12.f54093k     // Catch:{ Exception -> 0x00e9 }
            boolean r2 = android.text.format.DateUtils.isToday(r2)     // Catch:{ Exception -> 0x00e9 }
            r3 = 0
            if (r2 != 0) goto L_0x0032
            if (r1 <= 0) goto L_0x0032
            r1 = 0
        L_0x0032:
            int r2 = r12.f54088f     // Catch:{ Exception -> 0x00e9 }
            if (r1 < r2) goto L_0x0046
            android.content.Context r4 = r12.f54085c     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r5 = "umeng"
            java.lang.String r6 = "red_badge"
            java.lang.String r7 = "outdo_max_show_times"
            long r8 = (long) r1     // Catch:{ Exception -> 0x00e9 }
            int r0 = r12.f54088f     // Catch:{ Exception -> 0x00e9 }
            long r10 = (long) r0     // Catch:{ Exception -> 0x00e9 }
            com.p280ss.android.message.log.C19851c.m65553a(r4, r5, r6, r7, r8, r10)     // Catch:{ Exception -> 0x00e9 }
            return
        L_0x0046:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e9 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r0 = "success"
            java.lang.String r2 = "reason"
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x00e9 }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = "content"
            int r0 = r1.optInt(r0, r3)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r2 = "content"
            r4 = 1
            int r0 = r0 + r4
            r1.put(r2, r0)     // Catch:{ Exception -> 0x00e9 }
            android.content.Context r0 = r12.f54085c     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r2 = "red_badge"
            java.lang.String r5 = "use_last_valid_response"
            org.json.JSONObject[] r6 = new org.json.JSONObject[r4]     // Catch:{ Exception -> 0x00e9 }
            r6[r3] = r1     // Catch:{ Exception -> 0x00e9 }
            com.p280ss.android.message.log.C19851c.m65555a(r0, r2, r5, r6)     // Catch:{ Exception -> 0x00e9 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00e9 }
            r12.f54094l = r5     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r0 = "next_query_interval"
            int r0 = r1.optInt(r0, r3)     // Catch:{ Exception -> 0x00e9 }
            int r0 = r0 + 600
            r12.f54095m = r0     // Catch:{ Exception -> 0x00e9 }
            android.content.Context r0 = r12.f54085c     // Catch:{ Throwable -> 0x00c7 }
            com.ss.android.newmedia.redbadge.b.a r0 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r0)     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r2 = r1.toString()     // Catch:{ Throwable -> 0x00c7 }
            r0.mo53489f(r2)     // Catch:{ Throwable -> 0x00c7 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r2 = "com.ss.android.redbadge.message"
            r0.<init>(r2)     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r2 = "message_data"
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x00c7 }
            r0.putExtra(r2, r1)     // Catch:{ Throwable -> 0x00c7 }
            android.content.Context r1 = r12.f54085c     // Catch:{ Throwable -> 0x00c7 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Throwable -> 0x00c7 }
            r0.setPackage(r1)     // Catch:{ Throwable -> 0x00c7 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00c7 }
            r2 = 26
            if (r1 < r2) goto L_0x00c2
            int r1 = com.p280ss.android.message.C19809a.m65410b()     // Catch:{ Throwable -> 0x00c7 }
            if (r1 < r2) goto L_0x00c2
            android.content.Context r1 = r12.f54085c     // Catch:{ Throwable -> 0x00c7 }
            com.ss.android.newmedia.redbadge.k r2 = new com.ss.android.newmedia.redbadge.k     // Catch:{ Throwable -> 0x00c7 }
            android.content.Context r3 = r12.f54085c     // Catch:{ Throwable -> 0x00c7 }
            r2.<init>(r0, r4, r3)     // Catch:{ Throwable -> 0x00c7 }
            r1.bindService(r0, r2, r4)     // Catch:{ Throwable -> 0x00c7 }
            goto L_0x00c7
        L_0x00c2:
            android.content.Context r1 = r12.f54085c     // Catch:{ Throwable -> 0x00c7 }
            r1.startService(r0)     // Catch:{ Throwable -> 0x00c7 }
        L_0x00c7:
            android.content.Context r0 = r12.f54085c     // Catch:{ Exception -> 0x00e9 }
            com.ss.android.newmedia.redbadge.b.a r0 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r0)     // Catch:{ Exception -> 0x00e9 }
            long r1 = r12.f54094l     // Catch:{ Exception -> 0x00e9 }
            r0.mo53474a(r1)     // Catch:{ Exception -> 0x00e9 }
            android.content.Context r0 = r12.f54085c     // Catch:{ Exception -> 0x00e9 }
            com.ss.android.newmedia.redbadge.b.a r0 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r0)     // Catch:{ Exception -> 0x00e9 }
            int r1 = r12.f54095m     // Catch:{ Exception -> 0x00e9 }
            r0.mo53473a(r1)     // Catch:{ Exception -> 0x00e9 }
        L_0x00dd:
            android.content.Context r0 = r12.f54085c     // Catch:{ Exception -> 0x00e9 }
            com.ss.android.newmedia.redbadge.b.a r0 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r0)     // Catch:{ Exception -> 0x00e9 }
            long r1 = r12.f54094l     // Catch:{ Exception -> 0x00e9 }
            r0.mo53474a(r1)     // Catch:{ Exception -> 0x00e9 }
            return
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.newmedia.redbadge.C19983d.mo53502c():void");
    }

    /* renamed from: a */
    public static C19983d m65885a(C20071d dVar) {
        if (f54082p == null) {
            synchronized (C19983d.class) {
                if (f54082p == null) {
                    f54082p = new C19983d(dVar);
                }
            }
        }
        return f54082p;
    }

    /* renamed from: b */
    public static long m65888b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return new JSONObject(str).optLong("rule_id");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private void m65886a(final long j) {
        if (!this.f54097o.get()) {
            this.f54097o.getAndSet(true);
            C9709a.m28647a(new AsyncTask() {
                /* access modifiers changed from: protected */
                /* JADX WARNING: Can't wrap try/catch for region: R(11:18|(1:20)|21|22|23|24|(1:26)|27|(5:29|30|(9:32|(1:34)|35|36|(1:41)(1:40)|42|43|44|(2:48|49))|45|(0))(1:50)|54|56) */
                /* JADX WARNING: Can't wrap try/catch for region: R(9:32|(1:34)|35|36|(1:41)(1:40)|42|43|44|(2:48|49)) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x014b */
                /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0247 */
                /* JADX WARNING: Removed duplicated region for block: B:26:0x0151 A[Catch:{ Throwable -> 0x02bf, Throwable -> 0x02e2 }] */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x01a2 A[SYNTHETIC, Splitter:B:29:0x01a2] */
                /* JADX WARNING: Removed duplicated region for block: B:48:0x026a A[SYNTHETIC, Splitter:B:48:0x026a] */
                /* JADX WARNING: Removed duplicated region for block: B:50:0x02ac A[Catch:{ Throwable -> 0x02bf, Throwable -> 0x02e2 }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object doInBackground(java.lang.Object[] r15) {
                    /*
                        r14 = this;
                        r15 = 0
                        r0 = 3
                        r1 = 1
                        r2 = 0
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        android.content.Context r3 = r3.f54085c     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r4 = "red_badge"
                        java.lang.String r5 = "start_send_request"
                        org.json.JSONObject[] r6 = new org.json.JSONObject[r2]     // Catch:{ Throwable -> 0x02bf }
                        com.p280ss.android.message.log.C19851c.m65555a(r3, r4, r5, r6)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        android.content.Context r3 = r3.f54085c     // Catch:{ Throwable -> 0x02bf }
                        boolean r3 = com.p280ss.android.newmedia.redbadge.C19990f.m65901a(r3)     // Catch:{ Throwable -> 0x02bf }
                        if (r3 != 0) goto L_0x004a
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        android.content.Context r3 = r3.f54085c     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r4 = "red_badge"
                        java.lang.String r5 = "network_not_available"
                        org.json.JSONObject[] r6 = new org.json.JSONObject[r2]     // Catch:{ Throwable -> 0x02bf }
                        com.p280ss.android.message.log.C19851c.m65555a(r3, r4, r5, r6)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        r3.mo53502c()     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        com.bytedance.common.utility.collection.f r3 = r3.f54086d     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r4 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        com.bytedance.common.utility.collection.f r4 = r4.f54086d     // Catch:{ Throwable -> 0x02bf }
                        long r5 = r3     // Catch:{ Throwable -> 0x02bf }
                        java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Throwable -> 0x02bf }
                        android.os.Message r4 = r4.obtainMessage(r0, r5)     // Catch:{ Throwable -> 0x02bf }
                        r3.sendMessage(r4)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        java.util.concurrent.atomic.AtomicBoolean r3 = r3.f54097o     // Catch:{ Throwable -> 0x02bf }
                        r3.getAndSet(r2)     // Catch:{ Throwable -> 0x02bf }
                        return r15
                    L_0x004a:
                        org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02bf }
                        r3.<init>()     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r4 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        android.content.Context r4 = r4.f54085c     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.b.a r4 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r4)     // Catch:{ Throwable -> 0x02bf }
                        int r4 = r4.mo53490g()     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        long r5 = r5.f54092j     // Catch:{ Throwable -> 0x02bf }
                        boolean r5 = android.text.format.DateUtils.isToday(r5)     // Catch:{ Throwable -> 0x02bf }
                        if (r5 != 0) goto L_0x0068
                        if (r4 <= 0) goto L_0x0068
                        r4 = 0
                    L_0x0068:
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        android.content.Context r5 = r5.f54085c     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.b.a r5 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r5)     // Catch:{ Throwable -> 0x02bf }
                        int r5 = r5.mo53491h()     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r6 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        long r6 = r6.f54093k     // Catch:{ Throwable -> 0x02bf }
                        boolean r6 = android.text.format.DateUtils.isToday(r6)     // Catch:{ Throwable -> 0x02bf }
                        if (r6 != 0) goto L_0x0081
                        if (r5 <= 0) goto L_0x0081
                        r5 = 0
                    L_0x0081:
                        java.lang.String r6 = "launch_times"
                        r3.put(r6, r4)     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r4 = "badge_show_times"
                        r3.put(r4, r5)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r4 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        int r4 = r4.f54088f     // Catch:{ Throwable -> 0x02bf }
                        if (r5 < r4) goto L_0x00c1
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        android.content.Context r6 = r3.f54085c     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r7 = "umeng"
                        java.lang.String r8 = "red_badge"
                        java.lang.String r9 = "outdo_max_show_times"
                        long r10 = (long) r5     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        int r3 = r3.f54088f     // Catch:{ Throwable -> 0x02bf }
                        long r12 = (long) r3     // Catch:{ Throwable -> 0x02bf }
                        com.p280ss.android.message.log.C19851c.m65553a(r6, r7, r8, r9, r10, r12)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        com.bytedance.common.utility.collection.f r3 = r3.f54086d     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r4 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        com.bytedance.common.utility.collection.f r4 = r4.f54086d     // Catch:{ Throwable -> 0x02bf }
                        long r5 = r3     // Catch:{ Throwable -> 0x02bf }
                        java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Throwable -> 0x02bf }
                        android.os.Message r4 = r4.obtainMessage(r0, r5)     // Catch:{ Throwable -> 0x02bf }
                        r3.sendMessage(r4)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        java.util.concurrent.atomic.AtomicBoolean r3 = r3.f54097o     // Catch:{ Throwable -> 0x02bf }
                        r3.getAndSet(r2)     // Catch:{ Throwable -> 0x02bf }
                        return r15
                    L_0x00c1:
                        java.lang.String r4 = "last_time_paras"
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r6 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r6 = r6.f54090h     // Catch:{ Throwable -> 0x02bf }
                        org.json.JSONObject r5 = r5.mo53496a(r6)     // Catch:{ Throwable -> 0x02bf }
                        r3.put(r4, r5)     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r4 = "last_last_time_paras"
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r6 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r6 = r6.f54091i     // Catch:{ Throwable -> 0x02bf }
                        org.json.JSONObject r5 = r5.mo53496a(r6)     // Catch:{ Throwable -> 0x02bf }
                        r3.put(r4, r5)     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r4 = "desktop_red_badge_strategy"
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r5 = r5.f54089g     // Catch:{ Throwable -> 0x02bf }
                        r3.put(r4, r5)     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r4 = "client_current_time"
                        long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x02bf }
                        r7 = 1000(0x3e8, double:4.94E-321)
                        long r5 = r5 / r7
                        r3.put(r4, r5)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r4 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        android.content.Context r4 = r4.f54085c     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.b.a r4 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r4)     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r4 = r4.mo53492i()     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r5 = "session_key"
                        r3.put(r5, r4)     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r4 = "device_id"
                        com.ss.android.pushmanager.setting.a r5 = com.p280ss.android.pushmanager.setting.C20089a.m66179a()     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r5 = r5.mo53742b()     // Catch:{ Throwable -> 0x02bf }
                        r3.put(r4, r5)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r4 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.pushmanager.d r4 = r4.f54084b     // Catch:{ Throwable -> 0x02bf }
                        if (r4 == 0) goto L_0x0125
                        java.lang.String r4 = "app_id"
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.pushmanager.d r5 = r5.f54084b     // Catch:{ Throwable -> 0x02bf }
                        int r5 = r5.mo53702c()     // Catch:{ Throwable -> 0x02bf }
                        r3.put(r4, r5)     // Catch:{ Throwable -> 0x02bf }
                    L_0x0125:
                        com.ss.android.newmedia.redbadge.d r4 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x014b }
                        android.content.Context r4 = r4.f54085c     // Catch:{ Throwable -> 0x014b }
                        com.ss.android.newmedia.redbadge.b.a r4 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r4)     // Catch:{ Throwable -> 0x014b }
                        java.lang.String r4 = r4.mo53493j()     // Catch:{ Throwable -> 0x014b }
                        java.lang.String r5 = "rom"
                        r3.put(r5, r4)     // Catch:{ Throwable -> 0x014b }
                        java.lang.String r4 = "brand"
                        java.lang.String r5 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x014b }
                        r3.put(r4, r5)     // Catch:{ Throwable -> 0x014b }
                        java.lang.String r4 = "model"
                        java.lang.String r5 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x014b }
                        r3.put(r4, r5)     // Catch:{ Throwable -> 0x014b }
                        java.lang.String r4 = "os_api"
                        int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x014b }
                        r3.put(r4, r5)     // Catch:{ Throwable -> 0x014b }
                    L_0x014b:
                        com.ss.android.newmedia.redbadge.d r4 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.pushmanager.d r4 = r4.f54084b     // Catch:{ Throwable -> 0x02bf }
                        if (r4 == 0) goto L_0x015e
                        java.lang.String r4 = "ver"
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.pushmanager.d r5 = r5.f54084b     // Catch:{ Throwable -> 0x02bf }
                        int r5 = r5.mo53705f()     // Catch:{ Throwable -> 0x02bf }
                        r3.put(r4, r5)     // Catch:{ Throwable -> 0x02bf }
                    L_0x015e:
                        java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x02bf }
                        r4.<init>()     // Catch:{ Throwable -> 0x02bf }
                        android.util.Pair r5 = new android.util.Pair     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r6 = "data"
                        java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x02bf }
                        r5.<init>(r6, r3)     // Catch:{ Throwable -> 0x02bf }
                        r4.add(r5)     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r3 = com.p280ss.android.newmedia.redbadge.C19992h.f54114a     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.pushmanager.app.c$b r5 = com.p280ss.android.pushmanager.app.C20044c.m66007b()     // Catch:{ Throwable -> 0x02bf }
                        java.util.Map r5 = r5.mo53672h()     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r3 = com.p280ss.android.message.p885a.C19826j.m65467a(r3, r5)     // Catch:{ Throwable -> 0x02bf }
                        android.os.Bundle r5 = new android.os.Bundle     // Catch:{ Throwable -> 0x02bf }
                        r5.<init>()     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r6 = "red_badge_is_open"
                        com.ss.android.newmedia.redbadge.d r7 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        boolean r7 = r7.f54087e     // Catch:{ Throwable -> 0x02bf }
                        r5.putInt(r6, r7)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r6 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r7 = "red_badge_request"
                        r6.mo53499a(r7, r5)     // Catch:{ Throwable -> 0x02bf }
                        com.bytedance.common.utility.k r5 = com.bytedance.common.utility.C6317k.m19580a()     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r3 = r5.mo15151a(r3, r4)     // Catch:{ Throwable -> 0x02bf }
                        boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r3)     // Catch:{ Throwable -> 0x02bf }
                        if (r4 != 0) goto L_0x02ac
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0267 }
                        r4.<init>(r3)     // Catch:{ JSONException -> 0x0267 }
                        java.lang.String r5 = "success"
                        java.lang.String r6 = "reason"
                        java.lang.String r6 = r4.getString(r6)     // Catch:{ JSONException -> 0x0267 }
                        boolean r5 = r5.equals(r6)     // Catch:{ JSONException -> 0x0267 }
                        if (r5 == 0) goto L_0x0267
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ JSONException -> 0x0267 }
                        android.content.Context r5 = r5.f54085c     // Catch:{ JSONException -> 0x0267 }
                        java.lang.String r6 = "red_badge"
                        java.lang.String r7 = "send_request_success"
                        org.json.JSONObject[] r8 = new org.json.JSONObject[r2]     // Catch:{ JSONException -> 0x0267 }
                        com.p280ss.android.message.log.C19851c.m65555a(r5, r6, r7, r8)     // Catch:{ JSONException -> 0x0267 }
                        long r5 = com.p280ss.android.newmedia.redbadge.C19983d.m65888b(r3)     // Catch:{ JSONException -> 0x0267 }
                        android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x0267 }
                        r7.<init>()     // Catch:{ JSONException -> 0x0267 }
                        java.lang.String r8 = "red_badge_is_open"
                        com.ss.android.newmedia.redbadge.d r9 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ JSONException -> 0x0267 }
                        boolean r9 = r9.f54087e     // Catch:{ JSONException -> 0x0267 }
                        r7.putInt(r8, r9)     // Catch:{ JSONException -> 0x0267 }
                        java.lang.String r8 = "rule_id"
                        r7.putLong(r8, r5)     // Catch:{ JSONException -> 0x0267 }
                        java.lang.String r5 = "resp"
                        r7.putString(r5, r3)     // Catch:{ JSONException -> 0x0267 }
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ JSONException -> 0x0267 }
                        java.lang.String r6 = "red_badge_request_success"
                        r5.mo53499a(r6, r7)     // Catch:{ JSONException -> 0x0267 }
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ JSONException -> 0x0267 }
                        long r6 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0267 }
                        r5.f54094l = r6     // Catch:{ JSONException -> 0x0267 }
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ JSONException -> 0x0267 }
                        java.lang.String r6 = "next_query_interval"
                        int r6 = r4.optInt(r6, r2)     // Catch:{ JSONException -> 0x0267 }
                        int r6 = r6 + 600
                        r5.f54095m = r6     // Catch:{ JSONException -> 0x0267 }
                        java.lang.String r5 = "content"
                        int r4 = r4.optInt(r5, r2)     // Catch:{ JSONException -> 0x0267 }
                        if (r4 <= 0) goto L_0x020c
                        com.ss.android.newmedia.redbadge.d r4 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ JSONException -> 0x0267 }
                        android.content.Context r4 = r4.f54085c     // Catch:{ JSONException -> 0x0267 }
                        com.ss.android.newmedia.redbadge.b.a r4 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r4)     // Catch:{ JSONException -> 0x0267 }
                        r4.mo53489f(r3)     // Catch:{ JSONException -> 0x0267 }
                    L_0x020c:
                        android.content.Intent r4 = new android.content.Intent     // Catch:{ Throwable -> 0x0247 }
                        java.lang.String r5 = "com.ss.android.redbadge.message"
                        r4.<init>(r5)     // Catch:{ Throwable -> 0x0247 }
                        java.lang.String r5 = "message_data"
                        r4.putExtra(r5, r3)     // Catch:{ Throwable -> 0x0247 }
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x0247 }
                        android.content.Context r5 = r5.f54085c     // Catch:{ Throwable -> 0x0247 }
                        java.lang.String r5 = r5.getPackageName()     // Catch:{ Throwable -> 0x0247 }
                        r4.setPackage(r5)     // Catch:{ Throwable -> 0x0247 }
                        int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0247 }
                        r6 = 26
                        if (r5 < r6) goto L_0x0240
                        int r5 = com.p280ss.android.message.C19809a.m65410b()     // Catch:{ Throwable -> 0x0247 }
                        if (r5 < r6) goto L_0x0240
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x0247 }
                        android.content.Context r5 = r5.f54085c     // Catch:{ Throwable -> 0x0247 }
                        com.ss.android.newmedia.redbadge.k r6 = new com.ss.android.newmedia.redbadge.k     // Catch:{ Throwable -> 0x0247 }
                        com.ss.android.newmedia.redbadge.d r7 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x0247 }
                        android.content.Context r7 = r7.f54085c     // Catch:{ Throwable -> 0x0247 }
                        r6.<init>(r4, r1, r7)     // Catch:{ Throwable -> 0x0247 }
                        r5.bindService(r4, r6, r1)     // Catch:{ Throwable -> 0x0247 }
                        goto L_0x0247
                    L_0x0240:
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x0247 }
                        android.content.Context r5 = r5.f54085c     // Catch:{ Throwable -> 0x0247 }
                        r5.startService(r4)     // Catch:{ Throwable -> 0x0247 }
                    L_0x0247:
                        com.ss.android.newmedia.redbadge.d r4 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ JSONException -> 0x0267 }
                        android.content.Context r4 = r4.f54085c     // Catch:{ JSONException -> 0x0267 }
                        com.ss.android.newmedia.redbadge.b.a r4 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r4)     // Catch:{ JSONException -> 0x0267 }
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ JSONException -> 0x0267 }
                        long r5 = r5.f54094l     // Catch:{ JSONException -> 0x0267 }
                        r4.mo53474a(r5)     // Catch:{ JSONException -> 0x0267 }
                        com.ss.android.newmedia.redbadge.d r4 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ JSONException -> 0x0267 }
                        android.content.Context r4 = r4.f54085c     // Catch:{ JSONException -> 0x0267 }
                        com.ss.android.newmedia.redbadge.b.a r4 = com.p280ss.android.newmedia.redbadge.p895b.C19979a.m65855a(r4)     // Catch:{ JSONException -> 0x0267 }
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ JSONException -> 0x0267 }
                        int r5 = r5.f54095m     // Catch:{ JSONException -> 0x0267 }
                        r4.mo53473a(r5)     // Catch:{ JSONException -> 0x0267 }
                        r4 = 1
                        goto L_0x0268
                    L_0x0267:
                        r4 = 0
                    L_0x0268:
                        if (r4 != 0) goto L_0x02e2
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02bf }
                        r4.<init>()     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r5 = "response"
                        r4.put(r5, r3)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        android.content.Context r5 = r5.f54085c     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r6 = "red_badge"
                        java.lang.String r7 = "send_request_fail"
                        org.json.JSONObject[] r8 = new org.json.JSONObject[r1]     // Catch:{ Throwable -> 0x02bf }
                        r8[r2] = r4     // Catch:{ Throwable -> 0x02bf }
                        com.p280ss.android.message.log.C19851c.m65555a(r5, r6, r7, r8)     // Catch:{ Throwable -> 0x02bf }
                        android.os.Bundle r4 = new android.os.Bundle     // Catch:{ Throwable -> 0x02bf }
                        r4.<init>()     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r5 = "response"
                        r4.putString(r5, r3)     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r5 = "rule_id"
                        long r6 = com.p280ss.android.newmedia.redbadge.C19983d.m65888b(r3)     // Catch:{ Throwable -> 0x02bf }
                        r4.putLong(r5, r6)     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r3 = "red_badge_is_open"
                        com.ss.android.newmedia.redbadge.d r5 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        boolean r5 = r5.f54087e     // Catch:{ Throwable -> 0x02bf }
                        r4.putInt(r3, r5)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r5 = "red_badge_request_fail"
                        r3.mo53499a(r5, r4)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        r3.mo53502c()     // Catch:{ Throwable -> 0x02bf }
                        goto L_0x02e2
                    L_0x02ac:
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        android.content.Context r3 = r3.f54085c     // Catch:{ Throwable -> 0x02bf }
                        java.lang.String r4 = "red_badge"
                        java.lang.String r5 = "send_request_fail_no_response"
                        org.json.JSONObject[] r6 = new org.json.JSONObject[r2]     // Catch:{ Throwable -> 0x02bf }
                        com.p280ss.android.message.log.C19851c.m65555a(r3, r4, r5, r6)     // Catch:{ Throwable -> 0x02bf }
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02bf }
                        r3.mo53502c()     // Catch:{ Throwable -> 0x02bf }
                        goto L_0x02e2
                    L_0x02bf:
                        r3 = move-exception
                        org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02e2 }
                        r4.<init>()     // Catch:{ Throwable -> 0x02e2 }
                        java.lang.String r5 = "th"
                        java.lang.String r3 = r3.getMessage()     // Catch:{ Throwable -> 0x02e2 }
                        r4.put(r5, r3)     // Catch:{ Throwable -> 0x02e2 }
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02e2 }
                        android.content.Context r3 = r3.f54085c     // Catch:{ Throwable -> 0x02e2 }
                        java.lang.String r5 = "red_badge"
                        java.lang.String r6 = "send_request_fail_with_exception"
                        org.json.JSONObject[] r1 = new org.json.JSONObject[r1]     // Catch:{ Throwable -> 0x02e2 }
                        r1[r2] = r4     // Catch:{ Throwable -> 0x02e2 }
                        com.p280ss.android.message.log.C19851c.m65555a(r3, r5, r6, r1)     // Catch:{ Throwable -> 0x02e2 }
                        com.ss.android.newmedia.redbadge.d r1 = com.p280ss.android.newmedia.redbadge.C19983d.this     // Catch:{ Throwable -> 0x02e2 }
                        r1.mo53502c()     // Catch:{ Throwable -> 0x02e2 }
                    L_0x02e2:
                        com.ss.android.newmedia.redbadge.d r1 = com.p280ss.android.newmedia.redbadge.C19983d.this
                        com.bytedance.common.utility.collection.f r1 = r1.f54086d
                        com.ss.android.newmedia.redbadge.d r3 = com.p280ss.android.newmedia.redbadge.C19983d.this
                        com.bytedance.common.utility.collection.f r3 = r3.f54086d
                        long r4 = r3
                        java.lang.Long r4 = java.lang.Long.valueOf(r4)
                        android.os.Message r0 = r3.obtainMessage(r0, r4)
                        r1.sendMessage(r0)
                        com.ss.android.newmedia.redbadge.d r0 = com.p280ss.android.newmedia.redbadge.C19983d.this
                        java.util.concurrent.atomic.AtomicBoolean r0 = r0.f54097o
                        r0.getAndSet(r2)
                        return r15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.newmedia.redbadge.C19983d.C199852.doInBackground(java.lang.Object[]):java.lang.Object");
                }
            }, new Object[0]);
        }
    }

    /* renamed from: c */
    private void m65889c(Context context) {
        if (context != null) {
            try {
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(context, "is_desktop_red_badge_show", "boolean"), true, this.f54101t);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(context, "desktop_red_badge_args", "string"), true, this.f54102u);
                context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m66154a(context, "red_badge_last_time_paras", "string"), true, this.f54103v);
            } catch (Throwable unused) {
            }
        }
    }

    private C19983d(C20071d dVar) {
        this.f54084b = dVar;
        this.f54085c = dVar.mo53700a().getApplicationContext();
        mo53498a(this.f54085c);
        m65889c(this.f54085c);
        if (this.f54087e) {
            this.f54085c.registerReceiver(this.f54096n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            mo53501b(this.f54085c);
            this.f54086d.sendEmptyMessageDelayed(0, 10000);
        }
        this.f54083a = true;
    }

    /* renamed from: b */
    public final void mo53501b(Context context) {
        if (context != null) {
            try {
                this.f54094l = C19979a.m65855a(this.f54085c).mo53481c();
                this.f54095m = C19979a.m65855a(this.f54085c).mo53484d();
                this.f54090h = C19979a.m65855a(this.f54085c).mo53486e();
                this.f54091i = C19979a.m65855a(this.f54085c).mo53488f();
                if (!C6319n.m19593a(this.f54090h)) {
                    JSONObject jSONObject = new JSONObject(this.f54090h);
                    this.f54092j = jSONObject.optLong("launch");
                    this.f54099r = jSONObject.optLong("leave");
                    this.f54093k = jSONObject.optLong("badge");
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r11.what     // Catch:{ Throwable -> 0x004a }
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0045;
                case 1: goto L_0x0041;
                case 2: goto L_0x003d;
                case 3: goto L_0x002b;
                case 4: goto L_0x000a;
                default: goto L_0x0009;
            }     // Catch:{ Throwable -> 0x004a }
        L_0x0009:
            goto L_0x0049
        L_0x000a:
            java.lang.Object r11 = r11.obj     // Catch:{ Throwable -> 0x004a }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ Throwable -> 0x004a }
            long r2 = r11.longValue()     // Catch:{ Throwable -> 0x004a }
            int r11 = r10.f54095m     // Catch:{ Throwable -> 0x004a }
            int r11 = r11 * 1000
            long r4 = (long) r11     // Catch:{ Throwable -> 0x004a }
            long r6 = r10.f54094l     // Catch:{ Throwable -> 0x004a }
            int r11 = r10.f54095m     // Catch:{ Throwable -> 0x004a }
            int r11 = r11 * 1000
            long r8 = (long) r11     // Catch:{ Throwable -> 0x004a }
            long r6 = r6 + r8
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x0025
            long r4 = r6 - r2
        L_0x0025:
            com.bytedance.common.utility.collection.f r11 = r10.f54086d     // Catch:{ Throwable -> 0x004a }
            r11.sendEmptyMessageDelayed(r1, r4)     // Catch:{ Throwable -> 0x004a }
            goto L_0x004a
        L_0x002b:
            java.lang.Object r11 = r11.obj     // Catch:{ Throwable -> 0x004a }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ Throwable -> 0x004a }
            r11.longValue()     // Catch:{ Throwable -> 0x004a }
            int r11 = r10.f54095m     // Catch:{ Throwable -> 0x004a }
            int r11 = r11 * 1000
            long r2 = (long) r11     // Catch:{ Throwable -> 0x004a }
            com.bytedance.common.utility.collection.f r11 = r10.f54086d     // Catch:{ Throwable -> 0x004a }
            r11.sendEmptyMessageDelayed(r1, r2)     // Catch:{ Throwable -> 0x004a }
            goto L_0x0049
        L_0x003d:
            r10.m65892f()     // Catch:{ Throwable -> 0x004a }
            goto L_0x004a
        L_0x0041:
            r10.m65891e()     // Catch:{ Throwable -> 0x004a }
            goto L_0x004a
        L_0x0045:
            r10.m65890d()     // Catch:{ Throwable -> 0x004a }
            goto L_0x004a
        L_0x0049:
            return
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.newmedia.redbadge.C19983d.handleMsg(android.os.Message):void");
    }

    /* renamed from: a */
    public final JSONObject mo53496a(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (C6319n.m19593a(str)) {
            return jSONObject2;
        }
        try {
            jSONObject = new JSONObject(str);
            try {
                m65887a(jSONObject, "launch");
                m65887a(jSONObject, "leave");
                m65887a(jSONObject, "badge");
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo53498a(Context context) {
        if (context != null) {
            try {
                this.f54087e = C19979a.m65855a(this.f54085c).mo53477a();
                String b = C19979a.m65855a(this.f54085c).mo53478b();
                if (!C6319n.m19593a(b)) {
                    JSONObject jSONObject = new JSONObject(b);
                    this.f54088f = jSONObject.optInt("max_show_times", 5);
                    this.f54098q = jSONObject.optInt("query_waiting_duration", 30);
                    this.f54089g = jSONObject.optString("strategy");
                    if (!this.f54087e) {
                        this.f54086d.removeMessages(0);
                        this.f54086d.removeMessages(1);
                        this.f54086d.removeMessages(2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m65887a(JSONObject jSONObject, String str) {
        if (!C6319n.m19593a(str)) {
            try {
                jSONObject.put(str, jSONObject.optLong(str) / 1000);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo53499a(String str, Bundle bundle) {
        if (!C6319n.m19593a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle.get(str2));
                }
            } catch (Throwable unused) {
            }
            C19851c.m65554a(this.f54085c, "event_v3", str, null, 0, 0, jSONObject);
        }
    }
}
