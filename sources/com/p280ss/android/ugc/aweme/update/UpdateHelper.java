package com.p280ss.android.ugc.aweme.update;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p022v4.app.NotificationCompat.C0575b;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.common.utility.p481c.C9721b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.feedback.C29118w;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.task.CancelNotificationForUpdateTask;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.dialogmanager.HomeDialogManager.C32984a;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.share.C38275x;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper */
public final class UpdateHelper {

    /* renamed from: f */
    static UpdateHelper f111124f;

    /* renamed from: A */
    boolean f111125A;

    /* renamed from: B */
    boolean f111126B;

    /* renamed from: C */
    boolean f111127C;

    /* renamed from: D */
    String f111128D = "";

    /* renamed from: E */
    String f111129E = "";

    /* renamed from: F */
    String f111130F = "";

    /* renamed from: G */
    String f111131G = "";

    /* renamed from: H */
    boolean f111132H;

    /* renamed from: I */
    int f111133I = 2;

    /* renamed from: J */
    long f111134J = -1;

    /* renamed from: K */
    int f111135K;

    /* renamed from: L */
    String f111136L = "";

    /* renamed from: M */
    int f111137M;

    /* renamed from: N */
    int f111138N;

    /* renamed from: O */
    volatile boolean f111139O;

    /* renamed from: P */
    final C42781a f111140P;

    /* renamed from: Q */
    C42778c f111141Q;

    /* renamed from: R */
    C42780e f111142R;

    /* renamed from: S */
    int f111143S;

    /* renamed from: T */
    volatile boolean f111144T;

    /* renamed from: U */
    final C42781a f111145U;

    /* renamed from: V */
    C42778c f111146V;

    /* renamed from: W */
    C42776a f111147W;

    /* renamed from: X */
    final IDownloadListener f111148X = new C42777b();

    /* renamed from: Y */
    private boolean f111149Y;

    /* renamed from: Z */
    private C0575b f111150Z;

    /* renamed from: a */
    public int f111151a = 1;

    /* renamed from: b */
    protected int f111152b;

    /* renamed from: c */
    protected long f111153c;

    /* renamed from: d */
    protected int f111154d;

    /* renamed from: e */
    protected long f111155e;

    /* renamed from: g */
    NotificationManager f111156g;

    /* renamed from: h */
    final Context f111157h = C6399b.m19921a();

    /* renamed from: i */
    final String f111158i = C6399b.m19929e();

    /* renamed from: j */
    final Handler f111159j;

    /* renamed from: k */
    String f111160k;

    /* renamed from: l */
    String f111161l;

    /* renamed from: m */
    String f111162m;

    /* renamed from: n */
    String f111163n;

    /* renamed from: o */
    String f111164o;

    /* renamed from: p */
    boolean f111165p;

    /* renamed from: q */
    String f111166q = "";

    /* renamed from: r */
    int f111167r;

    /* renamed from: s */
    int f111168s;

    /* renamed from: t */
    int f111169t;

    /* renamed from: u */
    String f111170u = "";

    /* renamed from: v */
    String f111171v = "";

    /* renamed from: w */
    String f111172w = "";

    /* renamed from: x */
    long f111173x;

    /* renamed from: y */
    String f111174y = "";

    /* renamed from: z */
    String f111175z = "";

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper$UpdateApi */
    interface UpdateApi {
        @C6457h
        C18253l<String> doGet(@C6450ac String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper$a */
    class C42776a implements Runnable {

        /* renamed from: b */
        private CountDownLatch f111186b;

        /* renamed from: c */
        private AtomicBoolean f111187c;

        /* renamed from: a */
        public final void mo104420a() {
            if (this.f111186b != null) {
                this.f111186b.countDown();
            }
        }

        /* renamed from: b */
        public final void mo104421b() {
            long j;
            this.f111187c.getAndSet(true);
            if (this.f111186b == null) {
                j = 0;
            } else {
                j = this.f111186b.getCount();
            }
            for (int i = 0; ((long) i) < j; i++) {
                this.f111186b.countDown();
            }
        }

        public final void run() {
            Thread.currentThread().setName("DownloadCountDownLatchThread");
            try {
                this.f111186b.await();
                if (!this.f111187c.get()) {
                    C42790h.m135814b(UpdateHelper.this.f111157h, UpdateHelper.this.f111131G);
                    UpdateHelper.this.f111156g.cancel(R.id.d_4);
                    UpdateHelper.this.f111156g.cancel(R.id.d_5);
                    UpdateHelper.this.f111156g.cancel(R.id.d_2);
                    UpdateHelper.this.mo104414y();
                }
            } catch (InterruptedException unused) {
            }
        }

        private C42776a(CountDownLatch countDownLatch) {
            this.f111187c = new AtomicBoolean(false);
            this.f111186b = countDownLatch;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper$b */
    class C42777b extends AbsDownloadListener {

        /* renamed from: b */
        private boolean f111189b;

        /* renamed from: a */
        private void m135792a() {
            try {
                if (!this.f111189b) {
                    this.f111189b = true;
                    UpdateHelper.this.mo104410u();
                }
            } catch (Exception unused) {
            }
        }

        public final void onFirstSuccess(DownloadInfo downloadInfo) {
            m135792a();
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            m135792a();
        }

        C42777b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper$c */
    class C42778c extends Thread {

        /* renamed from: a */
        volatile boolean f111190a;

        /* renamed from: b */
        C42782b f111191b;

        /* renamed from: d */
        private volatile boolean f111193d;

        /* renamed from: e */
        private volatile boolean f111194e;

        /* renamed from: a */
        public final void mo104423a() {
            this.f111190a = true;
            this.f111191b.mo104430a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x011f A[Catch:{ Exception -> 0x0152 }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x012a A[Catch:{ Exception -> 0x0152 }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0133 A[Catch:{ Exception -> 0x0152 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x015c  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0173 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                boolean r0 = r13.f111193d
                if (r0 != 0) goto L_0x000c
                com.ss.android.ugc.aweme.update.UpdateHelper r0 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this
                android.os.Handler r0 = r0.f111159j
                r1 = 3
                r0.sendEmptyMessage(r1)
            L_0x000c:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                r1 = 0
                r10 = 1
                r11 = 0
                boolean r2 = r13.f111194e     // Catch:{ Exception -> 0x0154 }
                if (r2 == 0) goto L_0x0025
                com.ss.android.ugc.aweme.update.UpdateHelper r2 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                boolean r2 = r2.mo104407r()     // Catch:{ Exception -> 0x0154 }
                if (r2 != 0) goto L_0x0025
                java.lang.String r1 = "fetchUpdateData = false"
            L_0x0022:
                r3 = 0
                goto L_0x015a
            L_0x0025:
                com.ss.android.ugc.aweme.update.UpdateHelper r2 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                boolean r2 = r2.mo104398i()     // Catch:{ Exception -> 0x0154 }
                if (r2 != 0) goto L_0x0030
                java.lang.String r1 = "isRealCurrentVersionOut = false"
                goto L_0x0022
            L_0x0030:
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r3 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r3 = r3.f111160k     // Catch:{ Exception -> 0x0154 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0154 }
                boolean r3 = r2.isDirectory()     // Catch:{ Exception -> 0x0154 }
                if (r3 != 0) goto L_0x0058
                boolean r2 = r2.mkdirs()     // Catch:{ Exception -> 0x0154 }
                if (r2 != 0) goto L_0x0058
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
                java.lang.String r2 = "can not mkdir files dir: "
                r1.<init>(r2)     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r2 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r2 = r2.f111160k     // Catch:{ Exception -> 0x0154 }
                r1.append(r2)     // Catch:{ Exception -> 0x0154 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0154 }
                goto L_0x0022
            L_0x0058:
                java.lang.Exception[] r2 = new java.lang.Exception[r10]     // Catch:{ Exception -> 0x0154 }
                boolean r3 = r13.f111193d     // Catch:{ Exception -> 0x0154 }
                if (r3 == 0) goto L_0x00b8
                com.ss.android.ugc.aweme.update.b r3 = r13.f111191b     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r4 = r4.f111166q     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r5 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r5 = r5.f111164o     // Catch:{ Exception -> 0x0154 }
                boolean r6 = r13.f111193d     // Catch:{ Exception -> 0x0154 }
                boolean r3 = r3.mo104431a(r4, r5, r6, r2)     // Catch:{ Exception -> 0x0154 }
                java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r5 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r5 = r5.f111163n     // Catch:{ Exception -> 0x0154 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0154 }
                r4.delete()     // Catch:{ Exception -> 0x0154 }
                if (r3 == 0) goto L_0x0116
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r5 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r5 = r5.f111164o     // Catch:{ Exception -> 0x0154 }
                r3.<init>(r5)     // Catch:{ Exception -> 0x0154 }
                boolean r5 = r3.isFile()     // Catch:{ Exception -> 0x0154 }
                if (r5 != 0) goto L_0x00a1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
                r1.<init>()     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r2 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r2 = r2.f111164o     // Catch:{ Exception -> 0x0154 }
                r1.append(r2)     // Catch:{ Exception -> 0x0154 }
                java.lang.String r2 = " is not a file."
                r1.append(r2)     // Catch:{ Exception -> 0x0154 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0154 }
                goto L_0x0022
            L_0x00a1:
                boolean r3 = r3.renameTo(r4)     // Catch:{ Exception -> 0x0154 }
                if (r3 == 0) goto L_0x0113
                java.lang.String r4 = com.bytedance.common.utility.C6306c.m19560a(r4)     // Catch:{ Exception -> 0x0152 }
                com.ss.android.ugc.aweme.update.UpdateHelper r5 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0152 }
                java.lang.String r5 = r5.f111163n     // Catch:{ Exception -> 0x0152 }
                byte[] r5 = com.bytedance.common.utility.C9736l.m28686a(r5)     // Catch:{ Exception -> 0x0152 }
                java.lang.String r5 = com.bytedance.common.utility.C6306c.m19564b(r5)     // Catch:{ Exception -> 0x0152 }
                goto L_0x0119
            L_0x00b8:
                com.ss.android.ugc.aweme.update.b r3 = r13.f111191b     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r4 = r4.f111166q     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r5 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r5 = r5.f111162m     // Catch:{ Exception -> 0x0154 }
                boolean r6 = r13.f111193d     // Catch:{ Exception -> 0x0154 }
                boolean r3 = r3.mo104431a(r4, r5, r6, r2)     // Catch:{ Exception -> 0x0154 }
                java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r5 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r5 = r5.f111161l     // Catch:{ Exception -> 0x0154 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0154 }
                r4.delete()     // Catch:{ Exception -> 0x0154 }
                if (r3 == 0) goto L_0x0116
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r5 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r5 = r5.f111162m     // Catch:{ Exception -> 0x0154 }
                r3.<init>(r5)     // Catch:{ Exception -> 0x0154 }
                boolean r5 = r3.isFile()     // Catch:{ Exception -> 0x0154 }
                if (r5 != 0) goto L_0x00fc
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
                r1.<init>()     // Catch:{ Exception -> 0x0154 }
                com.ss.android.ugc.aweme.update.UpdateHelper r2 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0154 }
                java.lang.String r2 = r2.f111162m     // Catch:{ Exception -> 0x0154 }
                r1.append(r2)     // Catch:{ Exception -> 0x0154 }
                java.lang.String r2 = " is not a file."
                r1.append(r2)     // Catch:{ Exception -> 0x0154 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0154 }
                goto L_0x0022
            L_0x00fc:
                boolean r3 = r3.renameTo(r4)     // Catch:{ Exception -> 0x0154 }
                if (r3 == 0) goto L_0x0113
                java.lang.String r4 = com.bytedance.common.utility.C6306c.m19560a(r4)     // Catch:{ Exception -> 0x0152 }
                com.ss.android.ugc.aweme.update.UpdateHelper r5 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0152 }
                java.lang.String r5 = r5.f111161l     // Catch:{ Exception -> 0x0152 }
                byte[] r5 = com.bytedance.common.utility.C9736l.m28686a(r5)     // Catch:{ Exception -> 0x0152 }
                java.lang.String r5 = com.bytedance.common.utility.C6306c.m19564b(r5)     // Catch:{ Exception -> 0x0152 }
                goto L_0x0119
            L_0x0113:
                r4 = r1
                r5 = r4
                goto L_0x0119
            L_0x0116:
                r4 = r1
                r5 = r4
                r3 = 0
            L_0x0119:
                boolean r6 = com.bytedance.common.utility.C6319n.m19593a(r4)     // Catch:{ Exception -> 0x0152 }
                if (r6 != 0) goto L_0x0124
                java.lang.String r6 = "md5"
                com.p280ss.android.ugc.aweme.update.UpdateHelper.m135751a(r0, r6, r4)     // Catch:{ Exception -> 0x0152 }
            L_0x0124:
                boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r5)     // Catch:{ Exception -> 0x0152 }
                if (r4 != 0) goto L_0x012f
                java.lang.String r4 = "sig_hash"
                com.p280ss.android.ugc.aweme.update.UpdateHelper.m135751a(r0, r4, r5)     // Catch:{ Exception -> 0x0152 }
            L_0x012f:
                r4 = r2[r11]     // Catch:{ Exception -> 0x0152 }
                if (r4 == 0) goto L_0x015a
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ Exception -> 0x0152 }
                android.content.Context r4 = r4.f111157h     // Catch:{ Exception -> 0x0152 }
                r5 = r2[r11]     // Catch:{ Exception -> 0x0152 }
                int r4 = com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a.m75246b(r4, r5)     // Catch:{ Exception -> 0x0152 }
                r5 = 18
                if (r5 == r4) goto L_0x014b
                java.lang.String r2 = "errorCode"
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0152 }
                com.p280ss.android.ugc.aweme.update.UpdateHelper.m135751a(r0, r2, r4)     // Catch:{ Exception -> 0x0152 }
                goto L_0x015a
            L_0x014b:
                r1 = r2[r11]     // Catch:{ Exception -> 0x0152 }
                java.lang.String r1 = r1.getMessage()     // Catch:{ Exception -> 0x0152 }
                goto L_0x015a
            L_0x0152:
                r1 = move-exception
                goto L_0x0156
            L_0x0154:
                r1 = move-exception
                r3 = 0
            L_0x0156:
                java.lang.String r1 = r1.getMessage()
            L_0x015a:
                if (r3 == 0) goto L_0x016d
                java.io.File r2 = new java.io.File
                com.ss.android.ugc.aweme.update.UpdateHelper r4 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this
                java.lang.String r4 = r4.f111161l
                r2.<init>(r4)
                boolean r2 = r2.isFile()
                if (r2 != 0) goto L_0x016d
                r12 = 0
                goto L_0x016e
            L_0x016d:
                r12 = r3
            L_0x016e:
                com.ss.android.ugc.aweme.update.UpdateHelper r2 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this
                com.ss.android.ugc.aweme.update.a r2 = r2.f111140P
                monitor-enter(r2)
                boolean r3 = r13.f111193d     // Catch:{ all -> 0x0207 }
                if (r3 == 0) goto L_0x017c
                com.ss.android.ugc.aweme.update.UpdateHelper r3 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ all -> 0x0207 }
                r3.f111144T = r11     // Catch:{ all -> 0x0207 }
                goto L_0x01a0
            L_0x017c:
                com.ss.android.ugc.aweme.update.UpdateHelper r3 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ all -> 0x0207 }
                r3.f111139O = r11     // Catch:{ all -> 0x0207 }
                if (r12 == 0) goto L_0x018a
                com.ss.android.ugc.aweme.update.UpdateHelper r3 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ all -> 0x0207 }
                android.os.Handler r3 = r3.f111159j     // Catch:{ all -> 0x0207 }
                r3.sendEmptyMessage(r10)     // Catch:{ all -> 0x0207 }
                goto L_0x01a0
            L_0x018a:
                boolean r3 = r13.f111190a     // Catch:{ all -> 0x0207 }
                if (r3 == 0) goto L_0x0198
                com.ss.android.ugc.aweme.update.UpdateHelper r3 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ all -> 0x0207 }
                android.os.Handler r3 = r3.f111159j     // Catch:{ all -> 0x0207 }
                r4 = 13
                r3.sendEmptyMessage(r4)     // Catch:{ all -> 0x0207 }
                goto L_0x01a0
            L_0x0198:
                com.ss.android.ugc.aweme.update.UpdateHelper r3 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this     // Catch:{ all -> 0x0207 }
                android.os.Handler r3 = r3.f111159j     // Catch:{ all -> 0x0207 }
                r4 = 4
                r3.sendEmptyMessage(r4)     // Catch:{ all -> 0x0207 }
            L_0x01a0:
                monitor-exit(r2)     // Catch:{ all -> 0x0207 }
                java.lang.String r2 = "errorMsg"
                com.p280ss.android.ugc.aweme.update.UpdateHelper.m135751a(r0, r2, r1)
                java.lang.String r1 = "remote_ip"
                com.ss.android.ugc.aweme.update.UpdateHelper r2 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this
                java.lang.String r2 = r2.f111166q
                java.lang.String r2 = com.p280ss.android.ugc.aweme.update.C42784d.m135803a(r2)
                com.p280ss.android.ugc.aweme.update.UpdateHelper.m135751a(r0, r1, r2)
                java.lang.String r1 = "client_ip"
                com.ss.android.ugc.aweme.update.UpdateHelper r2 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this
                android.content.Context r2 = r2.f111157h
                java.lang.String r2 = com.p280ss.android.ugc.aweme.update.C42784d.m135802a(r2)
                com.p280ss.android.ugc.aweme.update.UpdateHelper.m135751a(r0, r1, r2)
                java.lang.String r1 = "url"
                com.ss.android.ugc.aweme.update.UpdateHelper r2 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this
                java.lang.String r2 = r2.f111166q
                com.p280ss.android.ugc.aweme.update.UpdateHelper.m135751a(r0, r1, r2)
                java.lang.String r1 = "pre"
                boolean r2 = r13.f111193d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                com.p280ss.android.ugc.aweme.update.UpdateHelper.m135751a(r0, r1, r2)
                java.lang.String r1 = "cancled"
                boolean r2 = r13.f111190a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                com.p280ss.android.ugc.aweme.update.UpdateHelper.m135751a(r0, r1, r2)
                java.lang.String r1 = "success"
                java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
                com.p280ss.android.ugc.aweme.update.UpdateHelper.m135751a(r0, r1, r2)
                com.ss.android.ugc.aweme.update.UpdateHelper r1 = com.p280ss.android.ugc.aweme.update.UpdateHelper.this
                android.content.Context r2 = r1.f111157h
                java.lang.String r3 = "app_update"
                java.lang.String r4 = "download"
                r5 = 0
                r7 = 0
                r9 = r0
                com.p280ss.android.common.p288d.C19282c.m63184a(r2, r3, r4, r5, r7, r9)
                if (r12 != 0) goto L_0x01ff
                boolean r1 = r13.f111190a
                if (r1 != 0) goto L_0x01ff
                r11 = 1
            L_0x01ff:
                java.lang.String r1 = "service_apk_download_info"
                r2 = r11 ^ 1
                com.p280ss.android.ugc.aweme.base.C6893q.m21444a(r1, r2, r0)
                return
            L_0x0207:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0207 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.update.UpdateHelper.C42778c.run():void");
        }

        C42778c(UpdateHelper updateHelper, boolean z) {
            this(true, true);
        }

        C42778c(boolean z, boolean z2) {
            this.f111191b = new C42782b(UpdateHelper.this, UpdateHelper.this.f111157h);
            this.f111193d = z;
            this.f111194e = z2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper$d */
    static class C42779d extends Handler {

        /* renamed from: a */
        private WeakReference<UpdateHelper> f111195a;

        public final void handleMessage(Message message) {
            UpdateHelper updateHelper = (UpdateHelper) this.f111195a.get();
            if (updateHelper != null) {
                updateHelper.mo104388a(message);
            }
        }

        C42779d(Looper looper, UpdateHelper updateHelper) {
            super(looper);
            this.f111195a = new WeakReference<>(updateHelper);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.update.UpdateHelper$e */
    class C42780e extends Thread {

        /* renamed from: a */
        volatile boolean f111196a;

        /* renamed from: a */
        public final void mo104426a() {
            this.f111196a = true;
        }

        public final void run() {
            while (true) {
                try {
                    Thread.sleep(1500);
                } catch (Exception unused) {
                }
                synchronized (UpdateHelper.this.f111140P) {
                    if (!this.f111196a) {
                        if (UpdateHelper.this.f111139O) {
                            long j = UpdateHelper.this.f111140P.f111198a;
                            long j2 = UpdateHelper.this.f111140P.f111199b;
                            int i = 1;
                            if (j2 > 0) {
                                i = (int) ((j * 100) / j2);
                                if (i > 99) {
                                    i = 99;
                                }
                            }
                            Message obtainMessage = UpdateHelper.this.f111159j.obtainMessage(5);
                            obtainMessage.arg1 = i;
                            UpdateHelper.this.f111159j.sendMessage(obtainMessage);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        C42780e() {
        }
    }

    /* renamed from: b */
    public static UpdateHelper m135755b() {
        return f111124f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo104390a(C47870u uVar) throws Exception {
        uVar.mo19239a((Object) (C29118w) C6887b.m21436b().mo16895a(this.f111157h, "update_params", C29118w.class));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo104388a(Message message) {
        switch (message.what) {
            case 1:
                if (this.f111147W == null) {
                    this.f111156g.cancel(R.id.d_4);
                    this.f111156g.cancel(R.id.d_5);
                    this.f111156g.cancel(R.id.d_2);
                    mo104414y();
                    return;
                }
                mo104410u();
                return;
            case 2:
                this.f111156g.cancel(R.id.d_3);
                this.f111156g.cancel(R.id.d_2);
                m135744P();
                return;
            case 3:
                this.f111156g.cancel(R.id.d_4);
                this.f111156g.cancel(R.id.d_2);
                this.f111156g.cancel(R.id.d_3);
                this.f111156g.cancel(R.id.d_5);
                this.f111156g.notify(R.id.d_4, m135746a(0));
                return;
            case 4:
                this.f111156g.cancel(R.id.d_4);
                this.f111156g.cancel(R.id.d_3);
                this.f111156g.cancel(R.id.d_5);
                m135743O();
                return;
            case 5:
                int i = message.arg1;
                if (i < 0) {
                    i = 0;
                }
                if (i > 99) {
                    i = 99;
                }
                this.f111156g.notify(R.id.d_4, m135746a(i));
                return;
            case 6:
                m135745Q();
                return;
            case 7:
                mo104410u();
                return;
            case 10:
                this.f111156g.cancel(R.id.d_3);
                break;
            case 11:
                this.f111156g.cancel(R.id.d_5);
                return;
            case 12:
                this.f111156g.cancel(R.id.d_2);
                return;
            case 13:
                this.f111156g.cancel(R.id.d_4);
                mo104410u();
                return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo104385a(int i, String str, boolean z) {
        if (z) {
            try {
                this.f111143S = i;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            this.f111138N = i;
        }
        this.f111136L = str;
        Editor edit = C7285c.m22838a(this.f111157h, "update_info", 0).edit();
        if (z) {
            edit.putInt("pre_download_size", this.f111143S);
        } else {
            edit.putInt("download_size", this.f111138N);
        }
        edit.putString("download_etag", this.f111136L);
        C9721b.m28656a(edit);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo104384a(int i, int i2) {
        synchronized (this.f111140P) {
            this.f111140P.f111198a = (long) i;
            this.f111140P.f111199b = (long) i2;
        }
    }

    /* renamed from: a */
    public final void mo104389a(C42781a aVar) {
        synchronized (this.f111140P) {
            aVar.f111198a = this.f111140P.f111198a;
            aVar.f111199b = this.f111140P.f111199b;
        }
    }

    /* renamed from: a */
    public final void mo104387a(Context context, String str, String str2, final String str3) {
        if (mo104398i()) {
            String a = m135747a(mo104396g());
            final Context context2 = context;
            final String str4 = str3;
            C427732 r0 = new OnClickListener(null, null) {

                /* renamed from: a */
                final /* synthetic */ String f111177a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (UpdateHelper.this.mo104398i()) {
                        UpdateHelper.this.mo104392c();
                        if (this.f111177a != null) {
                            C19282c.m63182a(context2, this.f111177a, null);
                        }
                        File q = UpdateHelper.this.mo104406q();
                        if (q != null) {
                            UpdateHelper.this.mo104393d();
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.addFlags(1);
                            intent.setDataAndType(C19929d.m65754a(context2, q), "application/vnd.android.package-archive");
                            context2.startActivity(intent);
                        } else {
                            UpdateHelper.this.mo104412w();
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            C38275x.m122276c(UpdateHelper.this.f111157h, str4);
                            C38275x.m122268a(UpdateHelper.this.f111157h, str4);
                        }
                    }
                }

                {
                    this.f111177a = r2;
                }
            };
            if (!TextUtils.isEmpty(str3)) {
                C427743 r8 = new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C38275x.m122277d(UpdateHelper.this.f111157h, str3);
                    }
                };
                C10741a aVar = new C10741a(context);
                aVar.mo25649a((int) R.string.e1r).mo25657b((int) R.string.e1p).mo25650a((int) R.string.e1s, (OnClickListener) r0).mo25658b((int) R.string.e1q, (OnClickListener) r8);
                aVar.mo25656a().mo25638b().setCanceledOnTouchOutside(false);
                return;
            }
            C10741a aVar2 = new C10741a(context);
            aVar2.mo25649a((int) R.string.fju).mo25660b(a).mo25650a((int) R.string.by1, (OnClickListener) r0).mo25658b((int) R.string.w_, (OnClickListener) null);
            aVar2.mo25656a().mo25637a();
        }
    }

    /* renamed from: a */
    public final void mo104391a(JSONObject jSONObject) {
        if (jSONObject != null) {
            C29118w wVar = new C29118w();
            wVar.f76862a = jSONObject.optInt("update_sdk", 1);
            wVar.f76863b = jSONObject.optInt("pre_download_version", 0);
            wVar.f76864c = jSONObject.optInt("pre_download_start_time", 0);
            wVar.f76865d = jSONObject.optInt("pre_download_delay_days", 0);
            wVar.f76866e = jSONObject.optLong("pre_download_delay_second", -1);
            C6887b.m21436b().mo16900a(this.f111157h, "update_params", (Object) wVar);
        }
    }

    /* renamed from: a */
    public final void mo104386a(Context context) {
        if (!this.f111149Y) {
            UpdateHelper b = m135755b();
            if (b.m135731C()) {
                long currentTimeMillis = System.currentTimeMillis();
                int e = b.mo104394e();
                if (b.m135732D()) {
                    if (e != this.f111152b) {
                        this.f111152b = e;
                        this.f111154d = b.m135733E();
                        this.f111155e = b.m135734F();
                        this.f111153c = currentTimeMillis;
                        Editor edit = m135754b(context).edit();
                        edit.putInt("pre_download_version", this.f111152b);
                        edit.putInt("pre_download_delay_days", this.f111154d);
                        edit.putLong("pre_download_delay_second", this.f111155e);
                        edit.putLong("pre_download_start_time", this.f111153c);
                        C9721b.m28656a(edit);
                    }
                    if (b.mo104406q() == null && NetworkUtils.isWifi(context)) {
                        b.m135740L();
                    }
                }
                if (this.f111155e == -1) {
                    long j = ((long) (this.f111154d * 24 * 3600)) * 1000;
                    if (b.m135732D() && currentTimeMillis - this.f111153c < j) {
                        return;
                    }
                } else if (b.m135732D() && currentTimeMillis - this.f111153c < this.f111155e * 1000) {
                    return;
                }
                C9721b.m28656a(m135754b(context).edit());
                b.m135750a(context, true);
            }
        }
    }

    /* renamed from: c */
    public final void mo104392c() {
        this.f111159j.sendEmptyMessage(11);
    }

    /* renamed from: d */
    public final void mo104393d() {
        this.f111159j.sendEmptyMessage(10);
    }

    /* renamed from: h */
    public final synchronized boolean mo104397h() {
        return this.f111139O;
    }

    /* renamed from: w */
    public final void mo104412w() {
        m135752a(true);
    }

    /* renamed from: K */
    private boolean m135739K() {
        if (!C6319n.m19593a(this.f111166q)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m135748a() {
        if (f111124f == null) {
            try {
                f111124f = new UpdateHelper();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: u */
    public final void mo104410u() {
        if (this.f111147W != null) {
            this.f111147W.mo104420a();
        }
    }

    /* renamed from: v */
    public final void mo104411v() {
        if (this.f111147W != null) {
            this.f111147W.mo104421b();
        }
    }

    /* renamed from: C */
    private synchronized boolean m135731C() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        if (this.f111168s > this.f111169t || this.f111167r >= this.f111168s) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    private synchronized boolean m135732D() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        return this.f111132H;
    }

    /* renamed from: E */
    private synchronized int m135733E() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        return this.f111133I;
    }

    /* renamed from: F */
    private synchronized long m135734F() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        return this.f111134J;
    }

    /* renamed from: G */
    private synchronized int m135735G() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        return Math.min(Math.max(this.f111135K, 0), 60);
    }

    /* renamed from: H */
    private boolean m135736H() {
        boolean a = C42790h.m135813a(this.f111157h, this.f111131G);
        if (C6319n.m19593a(this.f111130F) || !C6776h.m20948b(this.f111157h, this.f111130F)) {
            return a;
        }
        return false;
    }

    /* renamed from: e */
    public final synchronized int mo104394e() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        return this.f111168s;
    }

    /* renamed from: f */
    public final synchronized String mo104395f() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        if (!TextUtils.isEmpty(this.f111171v)) {
            return this.f111171v;
        }
        return this.f111170u;
    }

    /* renamed from: g */
    public final synchronized String mo104396g() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        return this.f111172w;
    }

    /* renamed from: i */
    public final synchronized boolean mo104398i() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        if (this.f111167r < this.f111169t) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final synchronized boolean mo104399j() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        return this.f111125A;
    }

    /* renamed from: k */
    public final synchronized String mo104400k() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        return this.f111174y;
    }

    /* renamed from: l */
    public final synchronized String mo104401l() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        return this.f111175z;
    }

    /* renamed from: m */
    public final synchronized boolean mo104402m() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        if (m135736H()) {
            return false;
        }
        return this.f111126B;
    }

    /* renamed from: n */
    public final synchronized boolean mo104403n() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        return this.f111127C;
    }

    /* renamed from: o */
    public final synchronized String mo104404o() {
        if (!this.f111165p) {
            m135742N();
            this.f111165p = true;
        }
        return this.f111128D;
    }

    /* renamed from: s */
    public final void mo104408s() {
        if (this.f111147W == null) {
            this.f111147W = new C42776a(new CountDownLatch(2));
            new C6304f(this.f111147W, "DownloadCountDownLatchThread", true).start();
        }
    }

    /* renamed from: A */
    private void m135729A() {
        C7492s.m23282a((C7495v<T>) new C42799l<T>(this)).mo19294a(C47549a.m148327a()).mo19304b(C7333a.m23044b()).mo19189a((C7498y<? super T>) new C7498y<C29118w>() {
            public final void onComplete() {
            }

            public final void onError(Throwable th) {
            }

            public final void onSubscribe(C7321c cVar) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNext(C29118w wVar) {
                if (wVar != null) {
                    UpdateHelper.this.f111151a = wVar.f76862a;
                    UpdateHelper.this.f111152b = wVar.f76863b;
                    UpdateHelper.this.f111153c = (long) wVar.f76864c;
                    UpdateHelper.this.f111154d = wVar.f76865d;
                    UpdateHelper.this.f111155e = wVar.f76866e;
                }
            }
        });
    }

    /* renamed from: B */
    private void m135730B() {
        this.f111156g = (NotificationManager) this.f111157h.getSystemService("notification");
        if (VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("update_notification", C6399b.f18694b.mo15328d(), 2);
            notificationChannel.setSound(null, null);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            this.f111156g.createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: I */
    private synchronized void m135737I() {
        try {
            File file = new File(this.f111162m);
            if (file.exists()) {
                file.delete();
            }
            File file2 = new File(this.f111161l);
            if (file2.exists()) {
                file2.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: J */
    private synchronized void m135738J() {
        try {
            File file = new File(this.f111164o);
            if (file.exists()) {
                file.delete();
            }
            File file2 = new File(this.f111163n);
            if (file2.exists()) {
                file2.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: Q */
    private void m135745Q() {
        C6887b.m21436b().mo16899a(this.f111157h, "last_check_update_time", System.currentTimeMillis());
        this.f111159j.postDelayed(new Runnable() {
            public final void run() {
                Activity g = C6405d.m19984g();
                if (g != null && (g instanceof AbsActivity)) {
                    AbsActivity absActivity = (AbsActivity) g;
                    if (absActivity.isActive()) {
                        UpdateHelper.m135755b().mo104386a((Context) absActivity);
                    }
                }
            }
        }, (long) (m135755b().m135735G() * 1000));
    }

    /* renamed from: t */
    public final void mo104409t() {
        if (TextUtils.isEmpty(this.f111131G) || TextUtils.isEmpty(this.f111129E)) {
            mo104410u();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("label", "detail_ad");
            jSONObject.put("ext_json", null);
        } catch (Exception unused) {
        }
        if (m135753a(this.f111157h, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            C42790h.m135812a(this.f111131G, this.f111129E, this.f111157h, true, true, false, this.f111148X);
        }
    }

    /* renamed from: x */
    public final void mo104413x() {
        synchronized (this.f111140P) {
            if (this.f111142R != null) {
                this.f111142R.mo104426a();
            }
            if (this.f111141Q != null) {
                this.f111141Q.mo104423a();
            }
            this.f111159j.sendEmptyMessage(13);
        }
    }

    /* renamed from: z */
    public final C42791i mo104415z() {
        if (this.f111151a == -1 || this.f111151a == 0) {
            return C42791i.f111211a;
        }
        if (this.f111151a == 2) {
            try {
                return (C42791i) Class.forName("MMUpdateChecker").newInstance();
            } catch (Throwable unused) {
            }
        }
        return new C42789g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r4.f111146V = new com.p280ss.android.ugc.aweme.update.UpdateHelper.C42778c(r4, true);
        r4.f111146V.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        return;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m135740L() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f111165p     // Catch:{ all -> 0x0040 }
            r1 = 1
            if (r0 != 0) goto L_0x000b
            r4.m135742N()     // Catch:{ all -> 0x0040 }
            r4.f111165p = r1     // Catch:{ all -> 0x0040 }
        L_0x000b:
            boolean r0 = r4.f111144T     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0011
            monitor-exit(r4)     // Catch:{ all -> 0x0040 }
            return
        L_0x0011:
            com.ss.android.ugc.aweme.update.a r0 = r4.f111145U     // Catch:{ all -> 0x0040 }
            r2 = 0
            r0.f111198a = r2     // Catch:{ all -> 0x0040 }
            com.ss.android.ugc.aweme.update.a r0 = r4.f111145U     // Catch:{ all -> 0x0040 }
            r0.f111199b = r2     // Catch:{ all -> 0x0040 }
            r4.f111144T = r1     // Catch:{ all -> 0x0040 }
            r4.m135738J()     // Catch:{ all -> 0x0040 }
            int r0 = r4.f111137M     // Catch:{ all -> 0x0040 }
            int r2 = r4.f111169t     // Catch:{ all -> 0x0040 }
            if (r0 == r2) goto L_0x0032
            int r0 = r4.f111169t     // Catch:{ all -> 0x0040 }
            r4.f111137M = r0     // Catch:{ all -> 0x0040 }
            int r0 = r4.f111137M     // Catch:{ all -> 0x0040 }
            r2 = -1
            java.lang.String r3 = ""
            r4.m135749a(r0, r2, r3, r1)     // Catch:{ all -> 0x0040 }
        L_0x0032:
            monitor-exit(r4)     // Catch:{ all -> 0x0040 }
            com.ss.android.ugc.aweme.update.UpdateHelper$c r0 = new com.ss.android.ugc.aweme.update.UpdateHelper$c
            r0.<init>(r4, r1)
            r4.f111146V = r0
            com.ss.android.ugc.aweme.update.UpdateHelper$c r0 = r4.f111146V
            r0.start()
            return
        L_0x0040:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0040 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.update.UpdateHelper.m135740L():void");
    }

    /* renamed from: O */
    private void m135743O() {
        if (mo104398i()) {
            String d = C6399b.f18694b.mo15328d();
            String string = this.f111157h.getString(R.string.dz6);
            PendingIntent activity = PendingIntent.getActivity(this.f111157h, 0, new Intent(), 0);
            C0575b bVar = new C0575b(this.f111157h, "update_notification");
            bVar.mo2519a(17301624).mo2545d((CharSequence) string).mo2523a(System.currentTimeMillis());
            bVar.mo2530a((CharSequence) d).mo2537b((CharSequence) string).mo2524a(activity).mo2539b(true);
            this.f111156g.notify(R.id.d_2, bVar.mo2534b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        return false;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo104405p() {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.f111165p     // Catch:{ all -> 0x005f }
            r1 = 1
            if (r0 != 0) goto L_0x000b
            r10.m135742N()     // Catch:{ all -> 0x005f }
            r10.f111165p = r1     // Catch:{ all -> 0x005f }
        L_0x000b:
            int r0 = r10.f111137M     // Catch:{ all -> 0x005f }
            int r2 = r10.f111169t     // Catch:{ all -> 0x005f }
            r3 = 0
            if (r0 == r2) goto L_0x0014
            monitor-exit(r10)
            return r3
        L_0x0014:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005f }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r10.f111161l     // Catch:{ all -> 0x005f }
            r0.<init>(r2)     // Catch:{ all -> 0x005f }
            boolean r2 = r0.exists()     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x003b
            boolean r2 = r0.isFile()     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x003b
            long r6 = r0.lastModified()     // Catch:{ all -> 0x005f }
            r0 = 0
            long r6 = r4 - r6
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x003b
            monitor-exit(r10)
            return r3
        L_0x003b:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r10.f111163n     // Catch:{ all -> 0x005f }
            r0.<init>(r2)     // Catch:{ all -> 0x005f }
            boolean r2 = r0.exists()     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x005d
            boolean r2 = r0.isFile()     // Catch:{ all -> 0x005f }
            if (r2 == 0) goto L_0x005d
            long r6 = r0.lastModified()     // Catch:{ all -> 0x005f }
            r0 = 0
            long r4 = r4 - r6
            r6 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            monitor-exit(r10)
            return r1
        L_0x005d:
            monitor-exit(r10)
            return r3
        L_0x005f:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.update.UpdateHelper.mo104405p():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[Catch:{ Throwable -> 0x005f }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.io.File mo104406q() {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.f111165p     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x000b
            r9.m135742N()     // Catch:{ all -> 0x0061 }
            r0 = 1
            r9.f111165p = r0     // Catch:{ all -> 0x0061 }
        L_0x000b:
            r0 = 0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x005f }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x005f }
            java.lang.String r4 = r9.f111161l     // Catch:{ Throwable -> 0x005f }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x005f }
            boolean r4 = r3.exists()     // Catch:{ Throwable -> 0x005f }
            if (r4 == 0) goto L_0x0035
            int r4 = r9.f111137M     // Catch:{ Throwable -> 0x005f }
            int r5 = r9.f111169t     // Catch:{ Throwable -> 0x005f }
            if (r4 != r5) goto L_0x0032
            long r4 = r3.lastModified()     // Catch:{ Throwable -> 0x005f }
            r6 = 0
            long r4 = r1 - r4
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            r3.delete()     // Catch:{ Throwable -> 0x005f }
        L_0x0035:
            r3 = r0
        L_0x0036:
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x005f }
            java.lang.String r5 = r9.f111163n     // Catch:{ Throwable -> 0x005f }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x005f }
            boolean r5 = r4.exists()     // Catch:{ Throwable -> 0x005f }
            if (r5 == 0) goto L_0x005d
            int r5 = r9.f111137M     // Catch:{ Throwable -> 0x005f }
            int r6 = r9.f111169t     // Catch:{ Throwable -> 0x005f }
            if (r5 != r6) goto L_0x005a
            long r5 = r4.lastModified()     // Catch:{ Throwable -> 0x005f }
            r7 = 0
            long r1 = r1 - r5
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x005a
            if (r3 != 0) goto L_0x005d
            r3 = r4
            goto L_0x005d
        L_0x005a:
            r4.delete()     // Catch:{ Throwable -> 0x005f }
        L_0x005d:
            monitor-exit(r9)
            return r3
        L_0x005f:
            monitor-exit(r9)
            return r0
        L_0x0061:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.update.UpdateHelper.mo104406q():java.io.File");
    }

    /* renamed from: M */
    private void m135741M() {
        Editor edit = C7285c.m22838a(this.f111157h, "update_info", 0).edit();
        edit.putInt("tip_version_code", this.f111168s);
        edit.putInt("real_version_code", this.f111169t);
        edit.putString("tip_version_name", this.f111170u);
        edit.putString("real_version_name", this.f111171v);
        edit.putString("title", this.f111175z);
        edit.putString("download_url", this.f111166q);
        edit.putString("whats_new", this.f111172w);
        edit.putLong("last_check_time", this.f111173x);
        edit.putBoolean("force_update", this.f111125A);
        edit.putString("already_download_tips", this.f111174y);
        edit.putBoolean("pre_download", this.f111132H);
        edit.putInt("interval_since_notify_update", this.f111133I);
        edit.putLong("pre_download_max_wait_seconds", this.f111134J);
        edit.putInt("latency", this.f111135K);
        edit.putBoolean("bind_download_data", this.f111126B);
        edit.putBoolean("hint_checked", this.f111127C);
        edit.putString("hint_text", this.f111128D);
        edit.putString("name", this.f111129E);
        edit.putString("package", this.f111130F);
        edit.putString("download_url", this.f111131G);
        C9721b.m28656a(edit);
    }

    /* renamed from: N */
    private void m135742N() {
        this.f111167r = (int) C6399b.m19932h();
        if (this.f111167r <= 0) {
            this.f111167r = 1;
        }
        SharedPreferences a = C7285c.m22838a(this.f111157h, "update_info", 0);
        this.f111168s = a.getInt("tip_version_code", 0);
        this.f111169t = a.getInt("real_version_code", 0);
        this.f111170u = a.getString("tip_version_name", "");
        this.f111171v = a.getString("real_version_name", "");
        this.f111172w = a.getString("whats_new", "");
        this.f111173x = a.getLong("last_check_time", 0);
        this.f111175z = a.getString("title", "");
        this.f111166q = a.getString("download_url", "");
        this.f111125A = a.getBoolean("force_update", false);
        this.f111174y = a.getString("already_download_tips", "");
        this.f111132H = a.getBoolean("pre_download", false);
        this.f111133I = a.getInt("interval_since_notify_update", 2);
        this.f111134J = a.getLong("pre_download_max_wait_seconds", -1);
        this.f111135K = a.getInt("latency", 0);
        this.f111136L = a.getString("download_etag", "");
        this.f111137M = a.getInt("download_version", 0);
        this.f111138N = a.getInt("download_size", -1);
        this.f111143S = a.getInt("pre_download_size", -1);
        this.f111126B = a.getBoolean("bind_download_data", false);
        this.f111127C = a.getBoolean("hint_checked", false);
        this.f111128D = a.getString("hint_text", "");
        this.f111129E = a.getString("name", "");
        this.f111130F = a.getString("package", "");
        this.f111131G = a.getString("download_url", "");
    }

    /* renamed from: P */
    private void m135744P() {
        if (mo104398i()) {
            String d = C6399b.f18694b.mo15328d();
            String a = C1642a.m8034a(this.f111157h.getString(R.string.dza), new Object[]{d, mo104395f()});
            String a2 = C1642a.m8034a(this.f111157h.getString(R.string.dz_), new Object[]{mo104395f()});
            Intent intent = new Intent(this.f111157h, UpdateActivity.class);
            intent.putExtra("from_update_avail", true);
            intent.addFlags(536870912);
            PendingIntent activity = PendingIntent.getActivity(this.f111157h, 0, intent, 0);
            C0575b bVar = new C0575b(this.f111157h, "update_notification");
            bVar.mo2519a((int) R.drawable.status_icon).mo2545d((CharSequence) a).mo2523a(System.currentTimeMillis()).mo2530a((CharSequence) d).mo2537b((CharSequence) a2).mo2524a(activity).mo2539b(true);
            this.f111156g.notify(R.id.d_5, bVar.mo2534b());
        }
    }

    /* renamed from: y */
    public final void mo104414y() {
        File file = new File(this.f111161l);
        if (file.exists() && file.isFile()) {
            String e = C6399b.m19929e();
            String a = C1642a.m8034a(this.f111157h.getString(R.string.dzd), new Object[]{e, mo104395f()});
            String a2 = C1642a.m8034a(this.f111157h.getString(R.string.dzc), new Object[]{mo104395f()});
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(1);
            intent.setDataAndType(C19929d.m65754a(this.f111157h, file), "application/vnd.android.package-archive");
            PendingIntent activity = PendingIntent.getActivity(this.f111157h, 0, intent, 0);
            C0575b bVar = new C0575b(this.f111157h, "update_notification");
            bVar.mo2519a((int) R.drawable.status_icon);
            bVar.mo2545d((CharSequence) a);
            bVar.mo2523a(System.currentTimeMillis());
            bVar.mo2530a((CharSequence) e).mo2537b((CharSequence) a2);
            bVar.mo2524a(activity);
            bVar.mo2539b(true);
            this.f111156g.notify(R.id.d_3, bVar.mo2534b());
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.addFlags(1);
                intent2.setDataAndType(C19929d.m65754a(this.f111157h, file), "application/vnd.android.package-archive");
                intent2.addFlags(268435456);
                this.f111157h.startActivity(intent2);
            } catch (Exception unused) {
            }
        }
    }

    private UpdateHelper() {
        m135730B();
        this.f111159j = new C42779d(Looper.getMainLooper(), this);
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/Android/data/");
        sb.append(this.f111157h.getPackageName());
        sb.append("/files");
        this.f111160k = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f111160k);
        sb2.append("/install_dmt.apk");
        this.f111161l = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f111160k);
        sb3.append("/install_dmt.apk.part");
        this.f111162m = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f111160k);
        sb4.append("/predownload.apk");
        this.f111163n = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f111160k);
        sb5.append("/predownload.apk.part");
        this.f111164o = sb5.toString();
        this.f111140P = new C42781a();
        this.f111140P.f111198a = 0;
        this.f111140P.f111199b = 0;
        this.f111145U = new C42781a();
        this.f111145U.f111198a = 0;
        this.f111145U.f111199b = 0;
        m135729A();
        C7121a.m22248b().mo18559a(new CancelNotificationForUpdateTask(this.f111156g)).mo18560a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:96:0x01c1 A[SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo104407r() {
        /*
            r31 = this;
            r1 = r31
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            r10 = 0
            com.ss.android.ugc.aweme.update.e r0 = com.p280ss.android.ugc.aweme.update.C42785e.C42786a.m135804a()     // Catch:{ Throwable -> 0x022e }
            boolean r0 = r0.f111206a     // Catch:{ Throwable -> 0x022e }
            r2 = 3
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "EvilsoulM"
            java.lang.String r3 = "inHouse update check version"
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r0, r3)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r0 = ""
            java.lang.String r0 = m135756b(r0)     // Catch:{ Throwable -> 0x022e }
            goto L_0x0046
        L_0x001f:
            java.lang.String r0 = "EvilsoulM"
            java.lang.String r3 = "origin update check version"
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r0, r3)     // Catch:{ Throwable -> 0x022e }
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()     // Catch:{ Throwable -> 0x022e }
            if (r0 == 0) goto L_0x0040
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x022e }
            r0.<init>()     // Catch:{ Throwable -> 0x022e }
            java.lang.String r3 = com.p280ss.android.ugc.aweme.app.api.Api.f60502b     // Catch:{ Throwable -> 0x022e }
            r0.append(r3)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r3 = "/appbeta/check_version/check_beta"
            r0.append(r3)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x022e }
            goto L_0x0046
        L_0x0040:
            java.lang.String r0 = com.p280ss.android.ugc.aweme.update.C42793j.f111212a     // Catch:{ Throwable -> 0x022e }
            java.lang.String r0 = m135756b(r0)     // Catch:{ Throwable -> 0x022e }
        L_0x0046:
            java.lang.String r3 = "request"
            m135751a(r9, r3, r0)     // Catch:{ Throwable -> 0x022e }
            r3 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r0 = com.p280ss.android.common.util.NetworkUtils.executeGet(r3, r0)     // Catch:{ Throwable -> 0x022e }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x022e }
            if (r3 == 0) goto L_0x0065
            android.content.Context r2 = r1.f111157h
            java.lang.String r3 = "app_update"
            java.lang.String r4 = "check"
            r5 = 0
            r7 = 0
            com.p280ss.android.common.p288d.C19282c.m63184a(r2, r3, r4, r5, r7, r9)
            return r10
        L_0x0065:
            java.lang.String r3 = "EvilsoulM"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x022e }
            java.lang.String r5 = "responseStr is "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x022e }
            r4.append(r0)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x022e }
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r2, r3, r4)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r3 = "response"
            m135751a(r9, r3, r0)     // Catch:{ Throwable -> 0x022e }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x022e }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r0 = "success"
            java.lang.String r4 = "message"
            java.lang.String r4 = r3.getString(r4)     // Catch:{ Throwable -> 0x022e }
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch:{ Throwable -> 0x022e }
            if (r0 != 0) goto L_0x009e
            android.content.Context r2 = r1.f111157h
            java.lang.String r3 = "app_update"
            java.lang.String r4 = "check"
            r5 = 0
            r7 = 0
            com.p280ss.android.common.p288d.C19282c.m63184a(r2, r3, r4, r5, r7, r9)
            return r10
        L_0x009e:
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r3 = "tip_version_code"
            r4 = -1
            int r3 = r0.optInt(r3, r4)     // Catch:{ Throwable -> 0x022e }
            r11 = 1
            if (r3 > 0) goto L_0x00ce
            monitor-enter(r31)     // Catch:{ Throwable -> 0x022e }
            boolean r0 = r1.f111165p     // Catch:{ all -> 0x00cb }
            if (r0 != 0) goto L_0x00b8
            r31.m135742N()     // Catch:{ all -> 0x00cb }
            r1.f111165p = r11     // Catch:{ all -> 0x00cb }
        L_0x00b8:
            monitor-exit(r31)     // Catch:{ all -> 0x00cb }
            boolean r0 = r31.m135739K()     // Catch:{ Throwable -> 0x022e }
            android.content.Context r2 = r1.f111157h
            java.lang.String r3 = "app_update"
            java.lang.String r4 = "check"
            r5 = 0
            r7 = 0
            com.p280ss.android.common.p288d.C19282c.m63184a(r2, r3, r4, r5, r7, r9)
            return r0
        L_0x00cb:
            r0 = move-exception
            monitor-exit(r31)     // Catch:{ all -> 0x00cb }
            throw r0     // Catch:{ Throwable -> 0x022e }
        L_0x00ce:
            java.lang.String r4 = "tip_version_name"
            java.lang.String r4 = r0.optString(r4)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r5 = "real_version_name"
            java.lang.String r5 = r0.optString(r5)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r6 = "real_version_code"
            int r6 = r0.optInt(r6)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r7 = "download_url"
            java.lang.String r7 = r0.getString(r7)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r8 = "whats_new"
            java.lang.String r12 = ""
            java.lang.String r8 = r0.optString(r8, r12)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r12 = "title"
            java.lang.String r13 = ""
            java.lang.String r12 = r0.optString(r12, r13)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r13 = "force_update"
            int r13 = r0.optInt(r13, r10)     // Catch:{ Throwable -> 0x022e }
            if (r13 != r11) goto L_0x0100
            r13 = 1
            goto L_0x0101
        L_0x0100:
            r13 = 0
        L_0x0101:
            java.lang.String r14 = "already_download_tips"
            java.lang.String r15 = ""
            java.lang.String r14 = r0.optString(r14, r15)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r15 = "pre_download"
            int r15 = r0.optInt(r15, r10)     // Catch:{ Throwable -> 0x022e }
            if (r15 != r11) goto L_0x0113
            r15 = 1
            goto L_0x0114
        L_0x0113:
            r15 = 0
        L_0x0114:
            java.lang.String r2 = "interval_since_notify_update"
            r11 = 2
            int r2 = r0.optInt(r2, r11)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r11 = "pre_download_max_wait_seconds"
            r16 = r14
            r17 = r15
            r14 = -1
            long r14 = r0.optLong(r11, r14)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r11 = "latency"
            int r11 = r0.optInt(r11, r10)     // Catch:{ Throwable -> 0x022e }
            java.lang.String r18 = ""
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            java.lang.String r21 = ""
            java.lang.String r10 = "bind_download_data"
            boolean r10 = r0.has(r10)     // Catch:{ Exception -> 0x01ac }
            r22 = r10
            java.lang.String r10 = "bind_download_data"
            org.json.JSONObject r0 = r0.optJSONObject(r10)     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r10 = "hint_checked"
            r23 = r9
            r9 = 1
            int r10 = r0.optInt(r10, r9)     // Catch:{ Exception -> 0x01a9 }
            if (r10 != r9) goto L_0x0152
            r9 = 1
            goto L_0x0153
        L_0x0152:
            r9 = 0
        L_0x0153:
            java.lang.String r10 = "hint_text"
            r24 = r9
            java.lang.String r9 = ""
            java.lang.String r9 = r0.optString(r10, r9)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r10 = "name"
            r25 = r9
            java.lang.String r9 = ""
            java.lang.String r9 = r0.optString(r10, r9)     // Catch:{ Exception -> 0x018e }
            java.lang.String r10 = "package"
            r26 = r9
            java.lang.String r9 = ""
            java.lang.String r9 = r0.optString(r10, r9)     // Catch:{ Exception -> 0x0185 }
            java.lang.String r10 = "download_url"
            java.lang.String r0 = r0.optString(r10)     // Catch:{ Exception -> 0x0180 }
            r21 = r0
            r20 = r9
            r18 = r25
            r19 = r26
            goto L_0x019c
        L_0x0180:
            r20 = r9
            goto L_0x0185
        L_0x0183:
            r26 = r9
        L_0x0185:
            r10 = r22
            r18 = r25
            r19 = r26
            goto L_0x01b1
        L_0x018c:
            r25 = r9
        L_0x018e:
            r10 = r22
            r18 = r25
            goto L_0x01b1
        L_0x0193:
            r24 = r9
        L_0x0195:
            r10 = r22
            goto L_0x01b1
        L_0x0198:
            r23 = r9
            r24 = 1
        L_0x019c:
            r30 = r18
            r27 = r19
            r28 = r20
            r29 = r21
            r10 = r22
            goto L_0x01b9
        L_0x01a7:
            r23 = r9
        L_0x01a9:
            r10 = r22
            goto L_0x01af
        L_0x01ac:
            r23 = r9
            r10 = 0
        L_0x01af:
            r24 = 1
        L_0x01b1:
            r30 = r18
            r27 = r19
            r28 = r20
            r29 = r21
        L_0x01b9:
            r0 = r24
            java.net.URL r9 = new java.net.URL     // Catch:{ Throwable -> 0x022a }
            r9.<init>(r7)     // Catch:{ Throwable -> 0x022a }
            monitor-enter(r31)     // Catch:{ Throwable -> 0x022a }
            boolean r9 = r1.f111165p     // Catch:{ all -> 0x0227 }
            if (r9 != 0) goto L_0x01cb
            r31.m135742N()     // Catch:{ all -> 0x0227 }
            r9 = 1
            r1.f111165p = r9     // Catch:{ all -> 0x0227 }
        L_0x01cb:
            r1.f111168s = r3     // Catch:{ all -> 0x0227 }
            r1.f111169t = r6     // Catch:{ all -> 0x0227 }
            r1.f111170u = r4     // Catch:{ all -> 0x0227 }
            r1.f111171v = r5     // Catch:{ all -> 0x0227 }
            r1.f111166q = r7     // Catch:{ all -> 0x0227 }
            r1.f111172w = r8     // Catch:{ all -> 0x0227 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0227 }
            r1.f111173x = r3     // Catch:{ all -> 0x0227 }
            r1.f111175z = r12     // Catch:{ all -> 0x0227 }
            r1.f111125A = r13     // Catch:{ all -> 0x0227 }
            r3 = r16
            r1.f111174y = r3     // Catch:{ all -> 0x0227 }
            r3 = r17
            r1.f111132H = r3     // Catch:{ all -> 0x0227 }
            r1.f111133I = r2     // Catch:{ all -> 0x0227 }
            r1.f111134J = r14     // Catch:{ all -> 0x0227 }
            r1.f111135K = r11     // Catch:{ all -> 0x0227 }
            r1.f111126B = r10     // Catch:{ all -> 0x0227 }
            r1.f111127C = r0     // Catch:{ all -> 0x0227 }
            r0 = r30
            r1.f111128D = r0     // Catch:{ all -> 0x0227 }
            r0 = r27
            r1.f111129E = r0     // Catch:{ all -> 0x0227 }
            r0 = r28
            r1.f111130F = r0     // Catch:{ all -> 0x0227 }
            r0 = r29
            r1.f111131G = r0     // Catch:{ all -> 0x0227 }
            java.lang.String r0 = "EvilsoulM"
            java.lang.String r2 = "before saveData"
            r3 = 3
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r3, r0, r2)     // Catch:{ all -> 0x0227 }
            r31.m135741M()     // Catch:{ all -> 0x0227 }
            java.lang.String r0 = "EvilsoulM"
            java.lang.String r2 = "after saveData"
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21552a(r3, r0, r2)     // Catch:{ all -> 0x0227 }
            monitor-exit(r31)     // Catch:{ all -> 0x0227 }
            android.content.Context r2 = r1.f111157h
            java.lang.String r3 = "app_update"
            java.lang.String r4 = "check"
            r5 = 0
            r7 = 0
            r9 = r23
            com.p280ss.android.common.p288d.C19282c.m63184a(r2, r3, r4, r5, r7, r9)
            r0 = 1
            return r0
        L_0x0227:
            r0 = move-exception
            monitor-exit(r31)     // Catch:{ all -> 0x0227 }
            throw r0     // Catch:{ Throwable -> 0x022a }
        L_0x022a:
            r0 = move-exception
            goto L_0x0231
        L_0x022c:
            r0 = move-exception
            goto L_0x026c
        L_0x022e:
            r0 = move-exception
            r23 = r9
        L_0x0231:
            boolean r2 = r0 instanceof java.util.concurrent.ExecutionException     // Catch:{ all -> 0x0269 }
            if (r2 == 0) goto L_0x0239
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x0269 }
        L_0x0239:
            android.content.Context r2 = r1.f111157h     // Catch:{ all -> 0x0269 }
            int r2 = com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a.m75246b(r2, r0)     // Catch:{ all -> 0x0269 }
            r3 = 18
            if (r3 == r2) goto L_0x024f
            java.lang.String r0 = "errorCode"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0269 }
            r9 = r23
            m135751a(r9, r0, r2)     // Catch:{ all -> 0x022c }
            goto L_0x025a
        L_0x024f:
            r9 = r23
            java.lang.String r2 = "errorMsg"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x022c }
            m135751a(r9, r2, r0)     // Catch:{ all -> 0x022c }
        L_0x025a:
            android.content.Context r2 = r1.f111157h
            java.lang.String r3 = "app_update"
            java.lang.String r4 = "check"
            r5 = 0
            r7 = 0
            com.p280ss.android.common.p288d.C19282c.m63184a(r2, r3, r4, r5, r7, r9)
            r2 = 0
            return r2
        L_0x0269:
            r0 = move-exception
            r9 = r23
        L_0x026c:
            android.content.Context r2 = r1.f111157h
            r5 = 0
            r7 = 0
            java.lang.String r3 = "app_update"
            java.lang.String r4 = "check"
            com.p280ss.android.common.p288d.C19282c.m63184a(r2, r3, r4, r5, r7, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.update.UpdateHelper.mo104407r():boolean");
    }

    /* renamed from: b */
    private static SharedPreferences m135754b(Context context) {
        return C7285c.m22838a(context, "app_setting", 0);
    }

    /* renamed from: a */
    public static String m135747a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        String[] split = str.split("\\\\n");
        StringBuilder sb = new StringBuilder();
        for (String trim : split) {
            sb.append(trim.trim());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m135756b(String str) {
        C19290j jVar = new C19290j(str);
        if (C6399b.m19932h() > 0) {
            jVar.mo51188a("update_version_code", String.valueOf(C6399b.m19932h()));
        }
        if (C6399b.m19939o() > 0) {
            jVar.mo51188a("manifest_version_code", String.valueOf(C6399b.m19939o()));
        }
        return jVar.mo51184a();
    }

    /* renamed from: a */
    private Notification m135746a(int i) {
        String d = C6399b.f18694b.mo15328d();
        String a = C1642a.m8034a(this.f111157h.getString(R.string.dzb), new Object[]{d, mo104395f()});
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("%");
        String sb2 = sb.toString();
        Intent intent = new Intent(this.f111157h, UpdateActivity.class);
        intent.addFlags(536870912);
        PendingIntent activity = PendingIntent.getActivity(this.f111157h, 0, intent, 0);
        if (i != 0 && this.f111150Z != null) {
            return C42788f.m135807a(this.f111157h, this.f111150Z, a, sb2, i);
        }
        this.f111150Z = new C0575b(this.f111157h, "update_notification");
        return C42788f.m135806a(this.f111157h, this.f111150Z, 17301633, null, d, a, sb2, i, activity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r4.f111141Q = new com.p280ss.android.ugc.aweme.update.UpdateHelper.C42778c(r4, false, true);
        r4.f111141Q.start();
        r4.f111142R = new com.p280ss.android.ugc.aweme.update.UpdateHelper.C42780e(r4);
        r4.f111142R.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m135752a(boolean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r5 = r4.f111165p     // Catch:{ all -> 0x004d }
            r0 = 1
            if (r5 != 0) goto L_0x000b
            r4.m135742N()     // Catch:{ all -> 0x004d }
            r4.f111165p = r0     // Catch:{ all -> 0x004d }
        L_0x000b:
            boolean r5 = r4.f111139O     // Catch:{ all -> 0x004d }
            if (r5 == 0) goto L_0x0011
            monitor-exit(r4)     // Catch:{ all -> 0x004d }
            return
        L_0x0011:
            com.ss.android.ugc.aweme.update.a r5 = r4.f111140P     // Catch:{ all -> 0x004d }
            r1 = 0
            r5.f111198a = r1     // Catch:{ all -> 0x004d }
            com.ss.android.ugc.aweme.update.a r5 = r4.f111140P     // Catch:{ all -> 0x004d }
            r5.f111199b = r1     // Catch:{ all -> 0x004d }
            r4.f111139O = r0     // Catch:{ all -> 0x004d }
            r4.m135737I()     // Catch:{ all -> 0x004d }
            int r5 = r4.f111137M     // Catch:{ all -> 0x004d }
            int r1 = r4.f111169t     // Catch:{ all -> 0x004d }
            r2 = 0
            if (r5 == r1) goto L_0x0033
            int r5 = r4.f111169t     // Catch:{ all -> 0x004d }
            r4.f111137M = r5     // Catch:{ all -> 0x004d }
            int r5 = r4.f111137M     // Catch:{ all -> 0x004d }
            r1 = -1
            java.lang.String r3 = ""
            r4.m135749a(r5, r1, r3, r2)     // Catch:{ all -> 0x004d }
        L_0x0033:
            monitor-exit(r4)     // Catch:{ all -> 0x004d }
            com.ss.android.ugc.aweme.update.UpdateHelper$c r5 = new com.ss.android.ugc.aweme.update.UpdateHelper$c
            r5.<init>(r2, r0)
            r4.f111141Q = r5
            com.ss.android.ugc.aweme.update.UpdateHelper$c r5 = r4.f111141Q
            r5.start()
            com.ss.android.ugc.aweme.update.UpdateHelper$e r5 = new com.ss.android.ugc.aweme.update.UpdateHelper$e
            r5.<init>()
            r4.f111142R = r5
            com.ss.android.ugc.aweme.update.UpdateHelper$e r5 = r4.f111142R
            r5.start()
            return
        L_0x004d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.update.UpdateHelper.m135752a(boolean):void");
    }

    /* renamed from: a */
    private void m135750a(Context context, boolean z) {
        if (mo104398i() && C6405d.m19984g() != null && (C6405d.m19984g() instanceof MainActivity) && !C32984a.m106625a()) {
            C42794k kVar = new C42794k(context, true);
            if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                kVar.show();
            }
            C19282c.m63182a(this.f111157h, "update", "show");
        }
    }

    /* renamed from: a */
    private boolean m135753a(Context context, String str) {
        if (context == null || C0683b.m2909b(this.f111157h, str) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m135751a(JSONObject jSONObject, String str, Object obj) {
        if (!C6319n.m19593a(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private synchronized void m135749a(int i, int i2, String str, boolean z) {
        this.f111137M = i;
        if (z) {
            this.f111143S = -1;
        } else {
            this.f111138N = -1;
        }
        this.f111136L = str;
        Editor edit = C7285c.m22838a(this.f111157h, "update_info", 0).edit();
        edit.putInt("download_version", this.f111137M);
        if (z) {
            edit.putInt("pre_download_size", this.f111143S);
        } else {
            edit.putInt("download_size", this.f111138N);
        }
        edit.putString("download_etag", this.f111136L);
        C9721b.m28656a(edit);
    }
}
