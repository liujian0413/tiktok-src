package com.p280ss.android.download;

import android.app.AlarmManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.p280ss.android.download.DownloadInfo.C19353a;
import com.p280ss.android.download.p861b.C19405c.C19406a;
import com.p280ss.android.download.p861b.C19407d;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.download.DownloadService */
public class DownloadService extends Service {

    /* renamed from: a */
    C19439q f52356a;

    /* renamed from: b */
    public C19355a f52357b;

    /* renamed from: c */
    public C19414d f52358c;

    /* renamed from: d */
    public final Map<Long, DownloadInfo> f52359d = new HashMap();

    /* renamed from: e */
    public final ExecutorService f52360e = m63532d();

    /* renamed from: f */
    public C19426g f52361f;

    /* renamed from: g */
    public HandlerThread f52362g;

    /* renamed from: h */
    private AlarmManager f52363h;

    /* renamed from: i */
    private C19437p f52364i;

    /* renamed from: j */
    private Handler f52365j;

    /* renamed from: k */
    private volatile int f52366k;

    /* renamed from: l */
    private Callback f52367l = new Callback() {
        public final boolean handleMessage(Message message) {
            boolean c;
            Process.setThreadPriority(10);
            int i = message.arg1;
            synchronized (DownloadService.this.f52359d) {
                c = DownloadService.this.mo51312c();
            }
            if (message.what == 2) {
                for (Entry key : Thread.getAllStackTraces().entrySet()) {
                    ((Thread) key.getKey()).getName().startsWith("pool");
                }
                DownloadService.this.f52358c.mo51444b();
            }
            if (c) {
                DownloadService.this.mo51311b();
            } else if (DownloadService.this.stopSelfResult(i)) {
                if (DownloadService.this.f52357b != null) {
                    DownloadService.this.getContentResolver().unregisterContentObserver(DownloadService.this.f52357b);
                }
                if (DownloadService.this.f52361f != null) {
                    DownloadService.this.f52361f.mo51457a();
                }
                if (DownloadService.this.f52362g != null) {
                    DownloadService.this.f52362g.quit();
                }
                if (DownloadService.this.f52360e != null) {
                    DownloadService.this.f52360e.shutdown();
                }
            }
            return true;
        }
    };

    /* renamed from: com.ss.android.download.DownloadService$a */
    class C19355a extends ContentObserver {
        public final void onChange(boolean z) {
            DownloadService.this.mo51310a();
        }

        public C19355a() {
            super(new Handler());
        }
    }

    /* renamed from: d */
    private static ExecutorService m63532d() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
        if (VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public final void mo51311b() {
        this.f52365j.removeMessages(2);
        this.f52365j.sendMessageDelayed(this.f52365j.obtainMessage(2, this.f52366k, -1), 300000);
    }

    public void onDestroy() {
        try {
            if (this.f52357b != null) {
                getContentResolver().unregisterContentObserver(this.f52357b);
            }
            if (this.f52361f != null) {
                this.f52361f.mo51457a();
            }
            if (this.f52362g != null) {
                this.f52362g.quit();
            }
            if (this.f52360e != null) {
                this.f52360e.shutdown();
            }
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        if (!C19431j.m63889a(getApplicationContext())) {
            stopSelf();
        } else if (!C19431j.m63893b()) {
            stopSelf();
        } else {
            if (this.f52356a == null) {
                this.f52356a = C19435n.m63904a((Context) this);
            }
            this.f52363h = (AlarmManager) getSystemService("alarm");
            this.f52364i = new C19437p(this);
            this.f52362g = new HandlerThread("SsDownloadManager-UpdateThread");
            this.f52362g.start();
            this.f52365j = new Handler(this.f52362g.getLooper(), this.f52367l);
            this.f52361f = new C19426g(this);
            this.f52358c = C19414d.m63796a((Context) this);
            this.f52358c.mo51437a();
            this.f52357b = new C19355a();
            getContentResolver().registerContentObserver(C19406a.f52513a, true, this.f52357b);
        }
    }

    /* renamed from: a */
    public final void mo51310a() {
        this.f52365j.removeMessages(1);
        this.f52365j.obtainMessage(1, this.f52366k, -1).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c7, code lost:
        if (r5 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ce, code lost:
        if (r5 != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d4, code lost:
        r11 = Long.MAX_VALUE;
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00da, code lost:
        if (r5 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cd A[ExcHandler: all (r0v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0026] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo51312c() {
        /*
            r18 = this;
            r1 = r18
            com.ss.android.download.q r0 = r1.f52356a
            long r2 = r0.mo51469a()
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Map<java.lang.Long, com.ss.android.download.DownloadInfo> r4 = r1.f52359d
            java.util.Set r4 = r4.keySet()
            r0.<init>(r4)
            android.content.Context r4 = r18.getApplicationContext()
            com.ss.android.download.f r4 = com.p280ss.android.download.C19422f.m63833a(r4)
            android.net.Uri r6 = com.p280ss.android.download.p861b.C19405c.C19406a.f52513a
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r4
            android.database.Cursor r5 = r5.mo51451a(r6, r7, r8, r9, r10)
            com.ss.android.download.DownloadInfo$a r9 = new com.ss.android.download.DownloadInfo$a     // Catch:{ Exception -> 0x00d4, all -> 0x00cd }
            r9.<init>(r4, r5)     // Catch:{ Exception -> 0x00d4, all -> 0x00cd }
            java.lang.String r10 = "_id"
            int r10 = r5.getColumnIndexOrThrow(r10)     // Catch:{ Exception -> 0x00d4, all -> 0x00cd }
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 0
        L_0x0037:
            boolean r14 = r5.moveToNext()     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            if (r14 == 0) goto L_0x00c7
            long r14 = r5.getLong(r10)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            java.lang.Long r8 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            r0.remove(r8)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            java.util.Map<java.lang.Long, com.ss.android.download.DownloadInfo> r8 = r1.f52359d     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            java.lang.Object r8 = r8.get(r14)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            com.ss.android.download.DownloadInfo r8 = (com.p280ss.android.download.DownloadInfo) r8     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            if (r8 == 0) goto L_0x005a
            m63530a(r9, r8, r2)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            goto L_0x005e
        L_0x005a:
            com.ss.android.download.DownloadInfo r8 = r1.m63527a(r9, r2)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
        L_0x005e:
            boolean r14 = r8.f52348w     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            if (r14 == 0) goto L_0x00a2
            java.lang.String r14 = r8.f52349x     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            r15 = 0
            if (r14 != 0) goto L_0x0078
            android.content.ContentResolver r14 = r18.getContentResolver()     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            java.lang.String r6 = r8.f52349x     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            r14.delete(r6, r15, r15)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
        L_0x0078:
            java.util.Map<java.lang.Long, com.ss.android.download.DownloadInfo> r6 = r1.f52359d     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            r16 = r9
            r17 = r10
            long r9 = r8.f52326a     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            r6.remove(r7)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            java.lang.String r6 = r8.f52330e     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            m63531a(r6)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            android.net.Uri r6 = r8.mo51306e()     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            r4.mo51450a(r6, r15, r15)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            com.ss.android.download.d r6 = r1.f52358c     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            r6.mo51440a(r8)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            com.ss.android.download.d r6 = r1.f52358c     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            java.lang.String r7 = com.p280ss.android.download.C19414d.m63805b(r8)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            r6.mo51441a(r7)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            goto L_0x00b8
        L_0x00a2:
            r16 = r9
            r17 = r10
            r8.mo51305d()     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            java.util.concurrent.ExecutorService r6 = r1.f52360e     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            boolean r6 = r8.mo51302a(r6)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            com.ss.android.download.g r7 = r1.f52361f     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            boolean r7 = r8.mo51301a(r7)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            r6 = r6 | r13
            r6 = r6 | r7
            r13 = r6
        L_0x00b8:
            long r6 = r8.mo51297a(r2)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            long r6 = java.lang.Math.min(r6, r11)     // Catch:{ Exception -> 0x00da, all -> 0x00cd }
            r11 = r6
            r9 = r16
            r10 = r17
            goto L_0x0037
        L_0x00c7:
            if (r5 == 0) goto L_0x00dd
        L_0x00c9:
            r5.close()     // Catch:{ Exception -> 0x00dd }
            goto L_0x00dd
        L_0x00cd:
            r0 = move-exception
            if (r5 == 0) goto L_0x00d3
            r5.close()     // Catch:{ Exception -> 0x00d3 }
        L_0x00d3:
            throw r0
        L_0x00d4:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 0
        L_0x00da:
            if (r5 == 0) goto L_0x00dd
            goto L_0x00c9
        L_0x00dd:
            java.util.Iterator r0 = r0.iterator()
        L_0x00e1:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00f5
            java.lang.Object r4 = r0.next()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r1.m63528a(r4)
            goto L_0x00e1
        L_0x00f5:
            com.ss.android.download.d r0 = r1.f52358c
            java.util.Map<java.lang.Long, com.ss.android.download.DownloadInfo> r4 = r1.f52359d
            java.util.Collection r4 = r4.values()
            r0.mo51442a(r4)
            r4 = 0
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x012f
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x012f
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r4 = "android.ss.intent.action.DOWNLOAD_WAKEUP"
            r0.<init>(r4)
            java.lang.Class<com.ss.android.download.DownloadHandlerService> r4 = com.p280ss.android.download.DownloadHandlerService.class
            r0.setClass(r1, r4)
            boolean r4 = com.p280ss.android.download.C19431j.m63894c()
            r4 = r4 ^ 1
            android.app.AlarmManager r5 = r1.f52363h     // Catch:{ Exception -> 0x012f }
            r6 = 0
            long r2 = r2 + r11
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r1, r7, r0, r6)     // Catch:{ Exception -> 0x012f }
            com.bytedance.common.p479c.C9692d.m28627a(r5, r4, r2, r0)     // Catch:{ Exception -> 0x012f }
        L_0x012f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.DownloadService.mo51312c():boolean");
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Cannot bind to Download Manager Service");
    }

    /* renamed from: a */
    public static void m63529a(Context context) {
        try {
            context.startService(new Intent(context, DownloadService.class));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m63528a(long j) {
        DownloadInfo downloadInfo = (DownloadInfo) this.f52359d.get(Long.valueOf(j));
        if (downloadInfo.f52335j == 192) {
            downloadInfo.f52335j = 490;
        }
        if (!(downloadInfo.f52332g == 0 || downloadInfo.f52330e == null)) {
            m63531a(downloadInfo.f52330e);
        }
        this.f52358c.mo51441a(C19414d.m63805b(downloadInfo));
        this.f52359d.remove(Long.valueOf(downloadInfo.f52326a));
    }

    /* renamed from: a */
    private static void m63531a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    private DownloadInfo m63527a(C19353a aVar, long j) {
        DownloadInfo a = aVar.mo51307a(this, this.f52356a, this.f52364i, this.f52358c);
        this.f52359d.put(Long.valueOf(a.f52326a), a);
        return a;
    }

    /* renamed from: a */
    private static void m63530a(C19353a aVar, DownloadInfo downloadInfo, long j) {
        aVar.mo51308a(downloadInfo);
    }

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C19407d dVar = new C19407d(printWriter, "  ");
        synchronized (this.f52359d) {
            ArrayList<Long> arrayList = new ArrayList<>(this.f52359d.keySet());
            Collections.sort(arrayList);
            for (Long l : arrayList) {
                ((DownloadInfo) this.f52359d.get(l)).mo51299a(dVar);
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (!C19431j.m63889a(getApplicationContext())) {
            stopSelf();
            return onStartCommand;
        } else if (!C19431j.m63893b()) {
            stopSelf();
            return onStartCommand;
        } else {
            this.f52366k = i2;
            mo51310a();
            return onStartCommand;
        }
    }
}
