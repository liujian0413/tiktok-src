package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Pair;

final class bla implements Callback, bpu, bpw, bqz {

    /* renamed from: A */
    private int f42436A;

    /* renamed from: B */
    private bld f42437B;

    /* renamed from: C */
    private long f42438C;

    /* renamed from: D */
    private blb f42439D;

    /* renamed from: E */
    private blb f42440E;

    /* renamed from: F */
    private blb f42441F;

    /* renamed from: G */
    private blm f42442G;

    /* renamed from: a */
    private final blj[] f42443a;

    /* renamed from: b */
    private final blk[] f42444b;

    /* renamed from: c */
    private final bqy f42445c;

    /* renamed from: d */
    private final blh f42446d;

    /* renamed from: e */
    private final bsd f42447e;

    /* renamed from: f */
    private final Handler f42448f;

    /* renamed from: g */
    private final HandlerThread f42449g;

    /* renamed from: h */
    private final Handler f42450h;

    /* renamed from: i */
    private final bks f42451i;

    /* renamed from: j */
    private final blp f42452j;

    /* renamed from: k */
    private final blo f42453k;

    /* renamed from: l */
    private blc f42454l;

    /* renamed from: m */
    private bli f42455m;

    /* renamed from: n */
    private blj f42456n;

    /* renamed from: o */
    private brv f42457o;

    /* renamed from: p */
    private bpv f42458p;

    /* renamed from: q */
    private blj[] f42459q;

    /* renamed from: r */
    private boolean f42460r;

    /* renamed from: s */
    private boolean f42461s;

    /* renamed from: t */
    private boolean f42462t;

    /* renamed from: u */
    private boolean f42463u;

    /* renamed from: v */
    private int f42464v = 1;

    /* renamed from: w */
    private int f42465w;

    /* renamed from: x */
    private int f42466x;

    /* renamed from: y */
    private int f42467y;

    /* renamed from: z */
    private long f42468z;

    public bla(blj[] bljArr, bqy bqy, blh blh, boolean z, int i, Handler handler, blc blc, bks bks) {
        this.f42443a = bljArr;
        this.f42445c = bqy;
        this.f42446d = blh;
        this.f42461s = z;
        this.f42450h = handler;
        this.f42454l = blc;
        this.f42451i = bks;
        this.f42444b = new blk[bljArr.length];
        for (int i2 = 0; i2 < bljArr.length; i2++) {
            bljArr[i2].mo40824a(i2);
            this.f42444b[i2] = bljArr[i2].mo40832b();
        }
        this.f42447e = new bsd();
        this.f42459q = new blj[0];
        this.f42452j = new blp();
        this.f42453k = new blo();
        bqy.f43300a = this;
        this.f42455m = bli.f42500a;
        this.f42449g = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f42449g.start();
        this.f42448f = new Handler(this.f42449g.getLooper(), this);
    }

    /* renamed from: a */
    public final void mo40876a(bpv bpv, boolean z) {
        this.f42448f.obtainMessage(0, 1, 0, bpv).sendToTarget();
    }

    /* renamed from: a */
    public final void mo40878a(boolean z) {
        this.f42448f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: a */
    public final void mo40873a(blm blm, int i, long j) {
        this.f42448f.obtainMessage(3, new bld(blm, i, j)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo40872a() {
        this.f42448f.sendEmptyMessage(5);
    }

    /* renamed from: a */
    public final void mo40879a(bkv... bkvArr) {
        if (!this.f42460r) {
            this.f42466x++;
            this.f42448f.obtainMessage(11, bkvArr).sendToTarget();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|22|19|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0018, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0020 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40881b(com.google.android.gms.internal.ads.bkv... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f42460r     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            int r0 = r3.f42466x     // Catch:{ all -> 0x002a }
            int r1 = r0 + 1
            r3.f42466x = r1     // Catch:{ all -> 0x002a }
            android.os.Handler r1 = r3.f42448f     // Catch:{ all -> 0x002a }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x002a }
            r4.sendToTarget()     // Catch:{ all -> 0x002a }
        L_0x0018:
            int r4 = r3.f42467y     // Catch:{ all -> 0x002a }
            if (r4 > r0) goto L_0x0028
            r3.wait()     // Catch:{ InterruptedException -> 0x0020 }
            goto L_0x0018
        L_0x0020:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002a }
            r4.interrupt()     // Catch:{ all -> 0x002a }
            goto L_0x0018
        L_0x0028:
            monitor-exit(r3)
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bla.mo40881b(com.google.android.gms.internal.ads.bkv[]):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40880b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f42460r     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f42448f     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f42460r     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f42449g     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bla.mo40880b():void");
    }

    /* renamed from: a */
    public final void mo40874a(blm blm, Object obj) {
        this.f42448f.obtainMessage(7, Pair.create(blm, obj)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo40875a(bpt bpt) {
        this.f42448f.obtainMessage(8, bpt).sendToTarget();
    }

    /* renamed from: c */
    public final void mo40882c() {
        this.f42448f.sendEmptyMessage(10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0886, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0887, code lost:
        r8.f42450h.obtainMessage(8, com.google.android.gms.internal.ads.zzkt.zza(r0)).sendToTarget();
        m49189g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x089a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x089b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x089c, code lost:
        r3 = 8;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x08b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x08b1, code lost:
        r3 = 8;
        r1 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0290 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0293 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0297 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0359 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x036d A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0522 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0529 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0544 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0547 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0582 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0598 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x05b4 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }, LOOP:8: B:321:0x05b4->B:325:0x05c6, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x07bd A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0886 A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            r34 = this;
            r8 = r34
            r1 = r35
            r10 = 1
            int r2 = r1.what     // Catch:{ zzkt -> 0x08b0, IOException -> 0x089b, RuntimeException -> 0x0886 }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x0845;
                case 1: goto L_0x0818;
                case 2: goto L_0x0465;
                case 3: goto L_0x03b6;
                case 4: goto L_0x0395;
                case 5: goto L_0x0391;
                case 6: goto L_0x037a;
                case 7: goto L_0x021c;
                case 8: goto L_0x01e6;
                case 9: goto L_0x01d3;
                case 10: goto L_0x00dd;
                case 11: goto L_0x009f;
                case 12: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            return r9
        L_0x0019:
            int r1 = r1.arg1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42465w = r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.blb r2 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0026:
            if (r2 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.blb r3 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.blb r4 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != r4) goto L_0x0037
            r4 = r3
            r3 = r2
            r2 = 1
            goto L_0x003a
        L_0x0037:
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x003a:
            com.google.android.gms.internal.ads.blm r11 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r12 = r3.f42474f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r13 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blp r14 = r8.f42452j     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r11 = r11.mo40902a(r12, r13, r14, r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r12 = r3.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 == 0) goto L_0x0065
            if (r11 == r5) goto L_0x0065
            com.google.android.gms.internal.ads.blb r12 = r3.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r12 = r12.f42474f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 != r11) goto L_0x0065
            com.google.android.gms.internal.ads.blb r3 = r3.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r11 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 != r11) goto L_0x005a
            r11 = 1
            goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            r4 = r4 | r11
            com.google.android.gms.internal.ads.blb r11 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 != r11) goto L_0x0062
            r11 = 1
            goto L_0x0063
        L_0x0062:
            r11 = 0
        L_0x0063:
            r2 = r2 | r11
            goto L_0x003a
        L_0x0065:
            com.google.android.gms.internal.ads.blb r5 = r3.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r5 == 0) goto L_0x0070
            com.google.android.gms.internal.ads.blb r5 = r3.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            m49174a(r5)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.f42479k = r6     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0070:
            int r5 = r3.f42474f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r5 = r8.m49183b(r5)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.f42476h = r5     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x007c
            r8.f42439D = r3     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x007c:
            if (r4 != 0) goto L_0x0095
            com.google.android.gms.internal.ads.blb r2 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.blb r2 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.f42474f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r3 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r3.f42490c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r8.m49168a(r2, r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r5 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5.<init>(r2, r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r5     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0095:
            int r2 = r8.f42464v     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != r15) goto L_0x009e
            if (r1 == 0) goto L_0x009e
            r8.m49171a(r7)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x009e:
            return r10
        L_0x009f:
            java.lang.Object r1 = r1.obj     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bkv[] r1 = (com.google.android.gms.internal.ads.bkv[]) r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r1.length     // Catch:{ all -> 0x00cc }
        L_0x00a4:
            if (r9 >= r2) goto L_0x00b4
            r3 = r1[r9]     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.bku r4 = r3.f42403a     // Catch:{ all -> 0x00cc }
            int r5 = r3.f42404b     // Catch:{ all -> 0x00cc }
            java.lang.Object r3 = r3.f42405c     // Catch:{ all -> 0x00cc }
            r4.mo40825a(r5, r3)     // Catch:{ all -> 0x00cc }
            int r9 = r9 + 1
            goto L_0x00a4
        L_0x00b4:
            com.google.android.gms.internal.ads.bpv r1 = r8.f42458p     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00bd
            android.os.Handler r1 = r8.f42448f     // Catch:{ all -> 0x00cc }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00cc }
        L_0x00bd:
            monitor-enter(r34)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = r8.f42467y     // Catch:{ all -> 0x00c8 }
            int r1 = r1 + r10
            r8.f42467y = r1     // Catch:{ all -> 0x00c8 }
            r34.notifyAll()     // Catch:{ all -> 0x00c8 }
            monitor-exit(r34)     // Catch:{ all -> 0x00c8 }
            return r10
        L_0x00c8:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00c8 }
            throw r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x00cc:
            r0 = move-exception
            r1 = r0
            monitor-enter(r34)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r8.f42467y     // Catch:{ all -> 0x00d9 }
            int r2 = r2 + r10
            r8.f42467y = r2     // Catch:{ all -> 0x00d9 }
            r34.notifyAll()     // Catch:{ all -> 0x00d9 }
            monitor-exit(r34)     // Catch:{ all -> 0x00d9 }
            throw r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x00d9:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00d9 }
            throw r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x00dd:
            com.google.android.gms.internal.ads.blb r1 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x01d2
            com.google.android.gms.internal.ads.blb r1 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = 1
        L_0x00e4:
            if (r1 == 0) goto L_0x01d2
            boolean r3 = r1.f42477i     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 != 0) goto L_0x00ec
            goto L_0x01d2
        L_0x00ec:
            boolean r3 = r1.mo40889c()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 != 0) goto L_0x00fa
            com.google.android.gms.internal.ads.blb r3 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != r3) goto L_0x00f7
            r2 = 0
        L_0x00f7:
            com.google.android.gms.internal.ads.blb r1 = r1.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x00e4
        L_0x00fa:
            if (r2 == 0) goto L_0x0198
            com.google.android.gms.internal.ads.blb r2 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == r3) goto L_0x0104
            r2 = 1
            goto L_0x0105
        L_0x0104:
            r2 = 0
        L_0x0105:
            com.google.android.gms.internal.ads.blb r3 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r3.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            m49174a(r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.f42479k = r6     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42439D = r3     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42440E = r3     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blj[] r3 = r8.f42443a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r3 = r3.length     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean[] r3 = new boolean[r3]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r4 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r5 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r11 = r5.f42490c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r4 = r4.mo40886a(r11, r2, r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r2 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r11 = r2.f42490c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0136
            com.google.android.gms.internal.ads.blc r2 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.f42490c = r4     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m49172a(r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0136:
            com.google.android.gms.internal.ads.blj[] r2 = r8.f42443a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.length     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean[] r2 = new boolean[r2]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r4 = 0
            r5 = 0
        L_0x013d:
            com.google.android.gms.internal.ads.blj[] r11 = r8.f42443a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r11 = r11.length     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r4 >= r11) goto L_0x0189
            com.google.android.gms.internal.ads.blj[] r11 = r8.f42443a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11 = r11[r4]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r12 = r11.mo40835d()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 == 0) goto L_0x014e
            r12 = 1
            goto L_0x014f
        L_0x014e:
            r12 = 0
        L_0x014f:
            r2[r4] = r12     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r12 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bqf[] r12 = r12.f42472d     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r12 = r12[r4]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 == 0) goto L_0x015b
            int r5 = r5 + 1
        L_0x015b:
            boolean r13 = r2[r4]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r13 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.bqf r13 = r11.mo40837f()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 == r13) goto L_0x017d
            com.google.android.gms.internal.ads.blj r13 = r8.f42456n     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r11 != r13) goto L_0x0176
            if (r12 != 0) goto L_0x0172
            com.google.android.gms.internal.ads.bsd r12 = r8.f42447e     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.brv r13 = r8.f42457o     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r12.mo41244a(r13)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0172:
            r8.f42457o = r6     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42456n = r6     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0176:
            m49175a(r11)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11.mo40842k()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0186
        L_0x017d:
            boolean r12 = r3[r4]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 == 0) goto L_0x0186
            long r12 = r8.f42438C     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11.mo40826a(r12)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0186:
            int r4 = r4 + 1
            goto L_0x013d
        L_0x0189:
            android.os.Handler r3 = r8.f42450h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bra r1 = r1.f42480l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m49177a(r2, r5)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x01c7
        L_0x0198:
            r8.f42439D = r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r1.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x019e:
            if (r1 == 0) goto L_0x01a6
            r1.mo40890d()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r1.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x019e
        L_0x01a6:
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.f42479k = r6     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r1 = r1.f42477i     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x01c7
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r1 = r1.f42475g     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r4 = r8.f42438C     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r11 = r3.mo40884a()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3 = 0
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r1, r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.mo40885a(r1, r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x01c7:
            r34.m49190h()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r34.m49188f()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r1 = r8.f42448f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendEmptyMessage(r7)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x01d2:
            return r10
        L_0x01d3:
            java.lang.Object r1 = r1.obj     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bpt r1 = (com.google.android.gms.internal.ads.bpt) r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x01e5
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bpt r2 = r2.f42469a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == r1) goto L_0x01e2
            goto L_0x01e5
        L_0x01e2:
            r34.m49190h()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x01e5:
            return r10
        L_0x01e6:
            java.lang.Object r1 = r1.obj     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bpt r1 = (com.google.android.gms.internal.ads.bpt) r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x021b
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bpt r2 = r2.f42469a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == r1) goto L_0x01f5
            goto L_0x021b
        L_0x01f5:
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.f42477i = r10     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.mo40889c()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r2 = r1.f42475g     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r2 = r1.mo40885a(r2, r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.f42475g = r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != 0) goto L_0x0218
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42440E = r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r1 = r1.f42475g     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m49172a(r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m49180b(r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0218:
            r34.m49190h()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x021b:
            return r10
        L_0x021c:
            java.lang.Object r1 = r1.obj     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blm r2 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r3 = r1.first     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blm r3 = (com.google.android.gms.internal.ads.blm) r3     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42442G = r3     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r1 = r1.second     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x028b
            int r3 = r8.f42436A     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 <= 0) goto L_0x025b
            com.google.android.gms.internal.ads.bld r3 = r8.f42437B     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.util.Pair r3 = r8.m49169a(r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r4 = r8.f42436A     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42436A = r9     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42437B = r6     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 != 0) goto L_0x0243
            r8.m49176a(r1, r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0379
        L_0x0243:
            com.google.android.gms.internal.ads.blc r7 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r11 = r3.first     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r11 = r11.intValue()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r3 = r3.second     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r14 = r3.longValue()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r7.<init>(r11, r14)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r7     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x028c
        L_0x025b:
            com.google.android.gms.internal.ads.blc r3 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r3.f42489b     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x028b
            com.google.android.gms.internal.ads.blm r3 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r3 = r3.mo40907a()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 == 0) goto L_0x0270
            r8.m49176a(r1, r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0379
        L_0x0270:
            android.util.Pair r3 = r8.m49178b(r9, r12)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r4 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r7 = r3.first     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r7 = r7.intValue()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r3 = r3.second     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r14 = r3.longValue()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r4.<init>(r7, r14)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r4     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x028b:
            r4 = 0
        L_0x028c:
            com.google.android.gms.internal.ads.blb r3 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 == 0) goto L_0x0293
            com.google.android.gms.internal.ads.blb r3 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0295
        L_0x0293:
            com.google.android.gms.internal.ads.blb r3 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0295:
            if (r3 == 0) goto L_0x0376
            com.google.android.gms.internal.ads.blm r7 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r11 = r3.f42470b     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r7 = r7.mo40903a(r11)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r7 != r5) goto L_0x02f9
            int r6 = r3.f42474f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blm r7 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r8.m49167a(r6, r2, r7)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != r5) goto L_0x02b0
            r8.m49176a(r1, r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0379
        L_0x02b0:
            com.google.android.gms.internal.ads.blm r6 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r7 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r6.mo40904a(r2, r7, r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.util.Pair r2 = r8.m49178b(r9, r12)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r6 = r2.first     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r6 = r6.intValue()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r2 = r2.second     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r11 = r2.longValue()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blm r2 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r7 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.mo40904a(r6, r7, r10)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r2 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r2 = r2.f42507a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.f42474f = r5     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x02d8:
            com.google.android.gms.internal.ads.blb r7 = r3.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r7 == 0) goto L_0x02ec
            com.google.android.gms.internal.ads.blb r3 = r3.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r7 = r3.f42470b     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r7 = r7.equals(r2)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r7 == 0) goto L_0x02e8
            r7 = r6
            goto L_0x02e9
        L_0x02e8:
            r7 = -1
        L_0x02e9:
            r3.f42474f = r7     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x02d8
        L_0x02ec:
            long r2 = r8.m49168a(r6, r11)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r5 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5.<init>(r6, r2)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r5     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0376
        L_0x02f9:
            boolean r2 = r8.m49183b(r7)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.mo40887a(r7, r2)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 != r2) goto L_0x0306
            r2 = 1
            goto L_0x0307
        L_0x0306:
            r2 = 0
        L_0x0307:
            com.google.android.gms.internal.ads.blc r11 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r11 = r11.f42488a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r7 == r11) goto L_0x0320
            com.google.android.gms.internal.ads.blc r11 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r12 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r13 = r11.f42489b     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r12.<init>(r7, r13)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r13 = r11.f42490c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r12.f42490c = r13     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r13 = r11.f42491d     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r12.f42491d = r13     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r12     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0320:
            com.google.android.gms.internal.ads.blb r11 = r3.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r11 == 0) goto L_0x0376
            com.google.android.gms.internal.ads.blb r11 = r3.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blm r12 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r13 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blp r14 = r8.f42452j     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r15 = r8.f42465w     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r7 = r12.mo40902a(r7, r13, r14, r15)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r7 == r5) goto L_0x0357
            java.lang.Object r12 = r11.f42470b     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blm r13 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r14 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r13 = r13.mo40904a(r7, r14, r10)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r13 = r13.f42507a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r12 = r12.equals(r13)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 == 0) goto L_0x0357
            boolean r3 = r8.m49183b(r7)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11.mo40887a(r7, r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r11 != r3) goto L_0x0353
            r3 = 1
            goto L_0x0354
        L_0x0353:
            r3 = 0
        L_0x0354:
            r2 = r2 | r3
            r3 = r11
            goto L_0x0320
        L_0x0357:
            if (r2 != 0) goto L_0x036d
            com.google.android.gms.internal.ads.blb r2 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.f42474f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r3 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r5 = r3.f42490c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r5 = r8.m49168a(r2, r5)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r3 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.<init>(r2, r5)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r3     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0376
        L_0x036d:
            r8.f42439D = r3     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.f42479k = r6     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            m49174a(r11)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0376:
            r8.m49181b(r1, r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0379:
            return r10
        L_0x037a:
            r8.m49185c(r10)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blh r1 = r8.f42446d     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.mo39608c()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m49171a(r10)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            monitor-enter(r34)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42460r = r10     // Catch:{ all -> 0x038d }
            r34.notifyAll()     // Catch:{ all -> 0x038d }
            monitor-exit(r34)     // Catch:{ all -> 0x038d }
            return r10
        L_0x038d:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x038d }
            throw r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0391:
            r34.m49189g()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            return r10
        L_0x0395:
            java.lang.Object r1 = r1.obj     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bli r1 = (com.google.android.gms.internal.ads.bli) r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.brv r2 = r8.f42457o     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x03a4
            com.google.android.gms.internal.ads.brv r2 = r8.f42457o     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bli r1 = r2.mo40967a(r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x03aa
        L_0x03a4:
            com.google.android.gms.internal.ads.bsd r2 = r8.f42447e     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bli r1 = r2.mo40967a(r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x03aa:
            r8.f42455m = r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r2 = r8.f42450h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            return r10
        L_0x03b6:
            java.lang.Object r1 = r1.obj     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bld r1 = (com.google.android.gms.internal.ads.bld) r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blm r2 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x03c7
            int r2 = r8.f42436A     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2 + r10
            r8.f42436A = r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42437B = r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x044f
        L_0x03c7:
            android.util.Pair r2 = r8.m49169a(r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x03ed
            com.google.android.gms.internal.ads.blc r1 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.<init>(r9, r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r1 = r8.f42450h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r2 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r1.obtainMessage(r15, r10, r9, r2)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r1 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.<init>(r9, r12)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m49171a(r15)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m49185c(r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x044f
        L_0x03ed:
            long r3 = r1.f42494c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03f5
            r1 = 1
            goto L_0x03f6
        L_0x03f5:
            r1 = 0
        L_0x03f6:
            java.lang.Object r3 = r2.first     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r3 = r3.intValue()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r2 = r2.second     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r4 = r2.longValue()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r2 = r8.f42454l     // Catch:{ all -> 0x0450 }
            int r2 = r2.f42488a     // Catch:{ all -> 0x0450 }
            if (r3 != r2) goto L_0x042c
            r6 = 1000(0x3e8, double:4.94E-321)
            long r11 = r4 / r6
            com.google.android.gms.internal.ads.blc r2 = r8.f42454l     // Catch:{ all -> 0x0450 }
            long r13 = r2.f42490c     // Catch:{ all -> 0x0450 }
            long r13 = r13 / r6
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x042c
            com.google.android.gms.internal.ads.blc r2 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.<init>(r3, r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r2 = r8.f42450h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r3 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x044f
        L_0x042c:
            long r6 = r8.m49168a(r3, r4)     // Catch:{ all -> 0x0450 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0436
            r2 = 1
            goto L_0x0437
        L_0x0436:
            r2 = 0
        L_0x0437:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.blc r2 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.<init>(r3, r6)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r2 = r8.f42450h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x0445
            r1 = 1
            goto L_0x0446
        L_0x0445:
            r1 = 0
        L_0x0446:
            com.google.android.gms.internal.ads.blc r3 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x044f:
            return r10
        L_0x0450:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.blc r6 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r6.<init>(r3, r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r6     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r3 = r8.f42450h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r4 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            throw r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0465:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blm r1 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x06c7
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != 0) goto L_0x0476
            com.google.android.gms.internal.ads.blc r1 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = r1.f42488a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x04b5
        L_0x0476:
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = r1.f42474f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r2 = r2.f42476h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x0593
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r2 = r2.mo40888b()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x0593
            com.google.android.gms.internal.ads.blm r2 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r7 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r2 = r2.mo40904a(r1, r7, r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r14 = r2.f42509c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0498
            goto L_0x0593
        L_0x0498:
            com.google.android.gms.internal.ads.blb r2 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x04a9
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.f42471c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r7 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r7 = r7.f42471c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2 - r7
            r7 = 100
            if (r2 == r7) goto L_0x0593
        L_0x04a9:
            com.google.android.gms.internal.ads.blm r2 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r7 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blp r14 = r8.f42452j     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r15 = r8.f42465w     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = r2.mo40902a(r1, r7, r14, r15)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x04b5:
            com.google.android.gms.internal.ads.blm r2 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.mo40909c()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 >= r2) goto L_0x0593
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x04c7
            com.google.android.gms.internal.ads.blc r2 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r2.f42490c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x04c5:
            r14 = r5
            goto L_0x051e
        L_0x04c7:
            com.google.android.gms.internal.ads.blm r2 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r7 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.mo40904a(r1, r7, r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blm r2 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blp r7 = r8.f42452j     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.mo40905a(r9, r7, r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x04d8
            goto L_0x04c5
        L_0x04d8:
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r1 = r1.mo40884a()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blm r7 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r14 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r14 = r14.f42474f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r15 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r7 = r7.mo40904a(r14, r15, r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r14 = r7.f42509c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r7 = 0
            long r1 = r1 + r14
            long r14 = r8.f42438C     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r7 = 0
            long r1 = r1 - r14
            com.google.android.gms.internal.ads.blm r7 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r14 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r18 = java.lang.Math.max(r3, r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1 = r34
            r2 = r7
            r3 = r14
            r14 = r5
            r4 = r16
            r6 = r18
            android.util.Pair r1 = r1.m49170a(r2, r3, r4, r6)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x0594
            java.lang.Object r2 = r1.first     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.intValue()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r1 = r1.second     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r1.longValue()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1 = r2
        L_0x051e:
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x0529
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x0526:
            r23 = r5
            goto L_0x0540
        L_0x0529:
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r5 = r2.mo40884a()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blm r2 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r7 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r7 = r7.f42474f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r11 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r2 = r2.mo40904a(r7, r11, r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r12 = r2.f42509c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = 0
            long r5 = r5 + r12
            goto L_0x0526
        L_0x0540:
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x0547
            r29 = 0
            goto L_0x054e
        L_0x0547:
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.f42471c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2 + r10
            r29 = r2
        L_0x054e:
            boolean r31 = r8.m49183b(r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blm r2 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r5 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.mo40904a(r1, r5, r10)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = new com.google.android.gms.internal.ads.blb     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blj[] r5 = r8.f42443a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blk[] r6 = r8.f42444b     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bqy r7 = r8.f42445c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blh r11 = r8.f42446d     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bpv r12 = r8.f42458p     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r13 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r13 = r13.f42507a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r20 = r2
            r21 = r5
            r22 = r6
            r25 = r7
            r26 = r11
            r27 = r12
            r28 = r13
            r30 = r1
            r32 = r3
            r20.<init>(r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x0586
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.f42479k = r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0586:
            r8.f42439D = r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bpt r1 = r1.f42469a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.mo41091a(r8, r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m49182b(r10)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0594
        L_0x0593:
            r14 = r5
        L_0x0594:
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x05ad
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r1 = r1.mo40888b()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x05a1
            goto L_0x05ad
        L_0x05a1:
            com.google.android.gms.internal.ads.blb r1 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x05b0
            boolean r1 = r8.f42463u     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != 0) goto L_0x05b0
            r34.m49190h()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x05b0
        L_0x05ad:
            r8.m49182b(r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x05b0:
            com.google.android.gms.internal.ads.blb r1 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x06c8
        L_0x05b4:
            com.google.android.gms.internal.ads.blb r1 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == r2) goto L_0x05f1
            long r1 = r8.f42438C     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r3.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r3.f42473e     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x05f1
            com.google.android.gms.internal.ads.blb r1 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.mo40890d()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r1.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m49180b(r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r1 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.f42474f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r3.f42475g     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.<init>(r2, r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r34.m49188f()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r1 = r8.f42450h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = 5
            com.google.android.gms.internal.ads.blc r3 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x05b4
        L_0x05f1:
            com.google.android.gms.internal.ads.blb r1 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r1 = r1.f42476h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x061b
            r1 = 0
        L_0x05f8:
            com.google.android.gms.internal.ads.blj[] r2 = r8.f42443a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.length     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 >= r2) goto L_0x06c8
            com.google.android.gms.internal.ads.blj[] r2 = r8.f42443a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = r2[r1]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bqf[] r3 = r3.f42472d     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3 = r3[r1]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 == 0) goto L_0x0618
            com.google.android.gms.internal.ads.bqf r4 = r2.mo40837f()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r4 != r3) goto L_0x0618
            boolean r3 = r2.mo40838g()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 == 0) goto L_0x0618
            r2.mo40839h()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0618:
            int r1 = r1 + 1
            goto L_0x05f8
        L_0x061b:
            r1 = 0
        L_0x061c:
            com.google.android.gms.internal.ads.blj[] r2 = r8.f42443a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.length     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 >= r2) goto L_0x063e
            com.google.android.gms.internal.ads.blj[] r2 = r8.f42443a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = r2[r1]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bqf[] r3 = r3.f42472d     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3 = r3[r1]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bqf r4 = r2.mo40837f()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r4 != r3) goto L_0x06c8
            if (r3 == 0) goto L_0x063b
            boolean r2 = r2.mo40838g()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x063b
            goto L_0x06c8
        L_0x063b:
            int r1 = r1 + 1
            goto L_0x061c
        L_0x063e:
            com.google.android.gms.internal.ads.blb r1 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r1.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x06c8
            com.google.android.gms.internal.ads.blb r1 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r1 = r1.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r1 = r1.f42477i     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x06c8
            com.google.android.gms.internal.ads.blb r1 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bra r1 = r1.f42480l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r2.f42479k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42440E = r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bra r2 = r2.f42480l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bpt r3 = r3.f42469a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r3.mo41099d()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x066d
            r3 = 1
            goto L_0x066e
        L_0x066d:
            r3 = 0
        L_0x066e:
            r4 = 0
        L_0x066f:
            com.google.android.gms.internal.ads.blj[] r5 = r8.f42443a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r5 = r5.length     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r4 >= r5) goto L_0x06c8
            com.google.android.gms.internal.ads.blj[] r5 = r8.f42443a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5 = r5[r4]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bqx r6 = r1.f43305b     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bqv r6 = r6.mo41176a(r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r6 == 0) goto L_0x06c4
            if (r3 != 0) goto L_0x06c1
            boolean r6 = r5.mo40840i()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r6 != 0) goto L_0x06c4
            com.google.android.gms.internal.ads.bqx r6 = r2.f43305b     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bqv r6 = r6.mo41176a(r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bll[] r7 = r1.f43307d     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r7 = r7[r4]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bll[] r11 = r2.f43307d     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11 = r11[r4]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r6 == 0) goto L_0x06c1
            boolean r7 = r11.equals(r7)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r7 == 0) goto L_0x06c1
            int r7 = r6.mo41165b()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.zzlg[] r7 = new com.google.android.gms.internal.ads.zzlg[r7]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11 = 0
        L_0x06a5:
            int r12 = r7.length     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r11 >= r12) goto L_0x06b1
            com.google.android.gms.internal.ads.zzlg r12 = r6.mo41164a(r11)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r7[r11] = r12     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r11 = r11 + 1
            goto L_0x06a5
        L_0x06b1:
            com.google.android.gms.internal.ads.blb r6 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bqf[] r6 = r6.f42472d     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r6 = r6[r4]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r11 = r8.f42440E     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r11 = r11.mo40884a()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5.mo40831a(r7, r6, r11)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x06c4
        L_0x06c1:
            r5.mo40839h()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x06c4:
            int r4 = r4 + 1
            goto L_0x066f
        L_0x06c7:
            r14 = r5
        L_0x06c8:
            com.google.android.gms.internal.ads.blb r1 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = 10
            if (r1 != 0) goto L_0x06d3
            r8.m49173a(r14, r2)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0817
        L_0x06d3:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.bse.m49930a(r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r34.m49188f()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blc r1 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r4 = r1.f42490c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blj[] r1 = r8.f42459q     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r4 = r1.length     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5 = 0
            r6 = 1
            r7 = 1
        L_0x06e5:
            if (r5 >= r4) goto L_0x0717
            r11 = r1[r5]     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r12 = r8.f42438C     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r2 = r8.f42468z     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11.mo40896a(r12, r2)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r6 == 0) goto L_0x06fa
            boolean r2 = r11.mo40898r()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x06fa
            r6 = 1
            goto L_0x06fb
        L_0x06fa:
            r6 = 0
        L_0x06fb:
            boolean r2 = r11.mo40897q()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x070a
            boolean r2 = r11.mo40898r()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x0708
            goto L_0x070a
        L_0x0708:
            r2 = 0
            goto L_0x070b
        L_0x070a:
            r2 = 1
        L_0x070b:
            if (r7 == 0) goto L_0x0711
            if (r2 == 0) goto L_0x0711
            r7 = 1
            goto L_0x0712
        L_0x0711:
            r7 = 0
        L_0x0712:
            int r5 = r5 + 1
            r2 = 10
            goto L_0x06e5
        L_0x0717:
            com.google.android.gms.internal.ads.brv r1 = r8.f42457o     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x073c
            com.google.android.gms.internal.ads.brv r1 = r8.f42457o     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bli r1 = r1.mo40975t()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bli r2 = r8.f42455m     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r2 = r1.equals(r2)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x073c
            r8.f42455m = r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bsd r2 = r8.f42447e     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.brv r3 = r8.f42457o     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.mo41244a(r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r2 = r8.f42450h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x073c:
            com.google.android.gms.internal.ads.blm r1 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.f42474f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r3 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r1 = r1.mo40904a(r2, r3, r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r1 = r1.f42509c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r6 == 0) goto L_0x076d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x075d
            com.google.android.gms.internal.ads.blc r3 = r8.f42454l     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r3.f42490c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x076d
        L_0x075d:
            com.google.android.gms.internal.ads.blb r3 = r8.f42441F     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r3 = r3.f42476h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 == 0) goto L_0x076d
            r3 = 4
            r8.m49171a(r3)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r34.m49187e()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r4 = 2
            goto L_0x07ee
        L_0x076d:
            int r3 = r8.f42464v     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r4 = 2
            if (r3 != r4) goto L_0x07d3
            com.google.android.gms.internal.ads.blj[] r3 = r8.f42459q     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r3 = r3.length     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 <= 0) goto L_0x07c1
            if (r7 == 0) goto L_0x07bf
            boolean r1 = r8.f42462t     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r2 = r2.f42477i     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x0786
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r2 = r2.f42475g     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x078e
        L_0x0786:
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bpt r2 = r2.f42469a     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r2 = r2.mo41100e()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x078e:
            r5 = -9223372036854775808
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x07aa
            com.google.android.gms.internal.ads.blb r2 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r2 = r2.f42476h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x079c
            r1 = 1
            goto L_0x07bb
        L_0x079c:
            com.google.android.gms.internal.ads.blm r2 = r8.f42442G     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r3 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r3 = r3.f42474f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r5 = r8.f42453k     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blo r2 = r2.mo40904a(r3, r5, r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r2 = r2.f42509c     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x07aa:
            com.google.android.gms.internal.ads.blh r5 = r8.f42446d     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blb r6 = r8.f42439D     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r11 = r8.f42438C     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r6 = r6.mo40884a()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r13 = 0
            long r11 = r11 - r6
            long r2 = r2 - r11
            boolean r1 = r5.mo39605a(r2, r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x07bb:
            if (r1 == 0) goto L_0x07bf
            r1 = 1
            goto L_0x07c5
        L_0x07bf:
            r1 = 0
            goto L_0x07c5
        L_0x07c1:
            boolean r1 = r8.m49184b(r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x07c5:
            if (r1 == 0) goto L_0x07ee
            r1 = 3
            r8.m49171a(r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r1 = r8.f42461s     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x07ee
            r34.m49186d()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x07ee
        L_0x07d3:
            int r3 = r8.f42464v     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5 = 3
            if (r3 != r5) goto L_0x07ee
            com.google.android.gms.internal.ads.blj[] r3 = r8.f42459q     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r3 = r3.length     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 <= 0) goto L_0x07de
            goto L_0x07e2
        L_0x07de:
            boolean r7 = r8.m49184b(r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x07e2:
            if (r7 != 0) goto L_0x07ee
            boolean r1 = r8.f42461s     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42462t = r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m49171a(r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r34.m49187e()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x07ee:
            boolean r1 = r8.f42461s     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x07fb
            int r1 = r8.f42464v     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = 3
            if (r1 == r2) goto L_0x07f8
            goto L_0x07fb
        L_0x07f8:
            r1 = 10
            goto L_0x0800
        L_0x07fb:
            int r1 = r8.f42464v     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != r4) goto L_0x0804
            goto L_0x07f8
        L_0x0800:
            r8.m49173a(r14, r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0814
        L_0x0804:
            com.google.android.gms.internal.ads.blj[] r1 = r8.f42459q     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = r1.length     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x080f
            r1 = 1000(0x3e8, double:4.94E-321)
            r8.m49173a(r14, r1)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0814
        L_0x080f:
            android.os.Handler r1 = r8.f42448f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.removeMessages(r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0814:
            com.google.android.gms.internal.ads.bse.m49929a()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0817:
            return r10
        L_0x0818:
            r4 = 2
            int r1 = r1.arg1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x081f
            r1 = 1
            goto L_0x0820
        L_0x081f:
            r1 = 0
        L_0x0820:
            r8.f42462t = r9     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42461s = r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != 0) goto L_0x082d
            r34.m49187e()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r34.m49188f()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0844
        L_0x082d:
            int r1 = r8.f42464v     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = 3
            if (r1 != r2) goto L_0x083b
            r34.m49186d()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r1 = r8.f42448f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0844
        L_0x083b:
            int r1 = r8.f42464v     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != r4) goto L_0x0844
            android.os.Handler r1 = r8.f42448f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0844:
            return r10
        L_0x0845:
            r4 = 2
            java.lang.Object r2 = r1.obj     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bpv r2 = (com.google.android.gms.internal.ads.bpv) r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = r1.arg1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x0850
            r1 = 1
            goto L_0x0851
        L_0x0850:
            r1 = 0
        L_0x0851:
            android.os.Handler r3 = r8.f42450h     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.sendEmptyMessage(r9)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m49185c(r10)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blh r3 = r8.f42446d     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.mo39601a()     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x086c
            com.google.android.gms.internal.ads.blc r1 = new com.google.android.gms.internal.ads.blc     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r9, r5)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42454l = r1     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x086c:
            r8.f42458p = r2     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bks r1 = r8.f42451i     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.mo41116a(r1, r10, r8)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m49171a(r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r1 = r8.f42448f     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzkt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            return r10
        L_0x087c:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x089f
        L_0x0881:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x08b4
        L_0x0886:
            r0 = move-exception
            r1 = r0
            android.os.Handler r2 = r8.f42450h
            com.google.android.gms.internal.ads.zzkt r1 = com.google.android.gms.internal.ads.zzkt.zza(r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.m49189g()
            return r10
        L_0x089b:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x089f:
            android.os.Handler r2 = r8.f42450h
            com.google.android.gms.internal.ads.zzkt r1 = com.google.android.gms.internal.ads.zzkt.zza(r1)
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.m49189g()
            return r10
        L_0x08b0:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x08b4:
            android.os.Handler r2 = r8.f42450h
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.m49189g()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bla.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: a */
    private final void m49171a(int i) {
        if (this.f42464v != i) {
            this.f42464v = i;
            this.f42450h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: b */
    private final void m49182b(boolean z) {
        if (this.f42463u != z) {
            this.f42463u = z;
            this.f42450h.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: d */
    private final void m49186d() throws zzkt {
        this.f42462t = false;
        this.f42447e.mo41242a();
        for (blj e : this.f42459q) {
            e.mo40836e();
        }
    }

    /* renamed from: e */
    private final void m49187e() throws zzkt {
        this.f42447e.mo41245b();
        for (blj a : this.f42459q) {
            m49175a(a);
        }
    }

    /* renamed from: f */
    private final void m49188f() throws zzkt {
        long j;
        if (this.f42441F != null) {
            long d = this.f42441F.f42469a.mo41099d();
            if (d != -9223372036854775807L) {
                m49172a(d);
            } else {
                if (this.f42456n == null || this.f42456n.mo40898r()) {
                    this.f42438C = this.f42447e.mo40974s();
                } else {
                    this.f42438C = this.f42457o.mo40974s();
                    this.f42447e.mo41243a(this.f42438C);
                }
                d = this.f42438C - this.f42441F.mo40884a();
            }
            this.f42454l.f42490c = d;
            this.f42468z = SystemClock.elapsedRealtime() * 1000;
            if (this.f42459q.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f42441F.f42469a.mo41100e();
            }
            blc blc = this.f42454l;
            if (j == Long.MIN_VALUE) {
                j = this.f42442G.mo40904a(this.f42441F.f42474f, this.f42453k, false).f42509c;
            }
            blc.f42491d = j;
        }
    }

    /* renamed from: a */
    private final void m49173a(long j, long j2) {
        this.f42448f.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f42448f.sendEmptyMessage(2);
        } else {
            this.f42448f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: a */
    private final long m49168a(int i, long j) throws zzkt {
        blb blb;
        m49187e();
        this.f42462t = false;
        m49171a(2);
        if (this.f42441F == null) {
            if (this.f42439D != null) {
                this.f42439D.mo40890d();
            }
            blb = null;
        } else {
            blb = null;
            for (blb blb2 = this.f42441F; blb2 != null; blb2 = blb2.f42479k) {
                if (blb2.f42474f != i || !blb2.f42477i) {
                    blb2.mo40890d();
                } else {
                    blb = blb2;
                }
            }
        }
        if (!(this.f42441F == blb && this.f42441F == this.f42440E)) {
            for (blj k : this.f42459q) {
                k.mo40842k();
            }
            this.f42459q = new blj[0];
            this.f42457o = null;
            this.f42456n = null;
            this.f42441F = null;
        }
        if (blb != null) {
            blb.f42479k = null;
            this.f42439D = blb;
            this.f42440E = blb;
            m49180b(blb);
            if (this.f42441F.f42478j) {
                j = this.f42441F.f42469a.mo41096b(j);
            }
            m49172a(j);
            m49190h();
        } else {
            this.f42439D = null;
            this.f42440E = null;
            this.f42441F = null;
            m49172a(j);
        }
        this.f42448f.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: a */
    private final void m49172a(long j) throws zzkt {
        long j2;
        if (this.f42441F == null) {
            j2 = j + 60000000;
        } else {
            j2 = j + this.f42441F.mo40884a();
        }
        this.f42438C = j2;
        this.f42447e.mo41243a(this.f42438C);
        for (blj a : this.f42459q) {
            a.mo40826a(this.f42438C);
        }
    }

    /* renamed from: g */
    private final void m49189g() {
        m49185c(true);
        this.f42446d.mo39606b();
        m49171a(1);
    }

    /* renamed from: c */
    private final void m49185c(boolean z) {
        blj[] bljArr;
        blb blb;
        this.f42448f.removeMessages(2);
        this.f42462t = false;
        this.f42447e.mo41245b();
        this.f42457o = null;
        this.f42456n = null;
        this.f42438C = 60000000;
        for (blj blj : this.f42459q) {
            try {
                m49175a(blj);
                blj.mo40842k();
            } catch (zzkt | RuntimeException unused) {
            }
        }
        this.f42459q = new blj[0];
        if (this.f42441F != null) {
            blb = this.f42441F;
        } else {
            blb = this.f42439D;
        }
        m49174a(blb);
        this.f42439D = null;
        this.f42440E = null;
        this.f42441F = null;
        m49182b(false);
        if (z) {
            if (this.f42458p != null) {
                this.f42458p.mo41115a();
                this.f42458p = null;
            }
            this.f42442G = null;
        }
    }

    /* renamed from: a */
    private static void m49175a(blj blj) throws zzkt {
        if (blj.mo40835d() == 2) {
            blj.mo40841j();
        }
    }

    /* renamed from: b */
    private final boolean m49184b(long j) {
        return j == -9223372036854775807L || this.f42454l.f42490c < j || (this.f42441F.f42479k != null && this.f42441F.f42479k.f42477i);
    }

    /* renamed from: a */
    private final void m49176a(Object obj, int i) {
        this.f42454l = new blc(0, 0);
        m49181b(obj, i);
        this.f42454l = new blc(0, -9223372036854775807L);
        m49171a(4);
        m49185c(false);
    }

    /* renamed from: b */
    private final void m49181b(Object obj, int i) {
        this.f42450h.obtainMessage(6, new ble(this.f42442G, obj, this.f42454l, i)).sendToTarget();
    }

    /* renamed from: a */
    private final int m49167a(int i, blm blm, blm blm2) {
        int c = blm.mo40909c();
        int i2 = i;
        int i3 = -1;
        for (int i4 = 0; i4 < c && i3 == -1; i4++) {
            i2 = blm.mo40902a(i2, this.f42453k, this.f42452j, this.f42465w);
            i3 = blm2.mo40903a(blm.mo40904a(i2, this.f42453k, true).f42507a);
        }
        return i3;
    }

    /* renamed from: b */
    private final boolean m49183b(int i) {
        this.f42442G.mo40904a(i, this.f42453k, false);
        if (this.f42442G.mo40905a(0, this.f42452j, false).f42517e || this.f42442G.mo40902a(i, this.f42453k, this.f42452j, this.f42465w) != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final Pair<Integer, Long> m49169a(bld bld) {
        blm blm = bld.f42492a;
        if (blm.mo40907a()) {
            blm = this.f42442G;
        }
        try {
            Pair<Integer, Long> b = m49179b(blm, bld.f42493b, bld.f42494c);
            if (this.f42442G == blm) {
                return b;
            }
            int a = this.f42442G.mo40903a(blm.mo40904a(((Integer) b.first).intValue(), this.f42453k, true).f42507a);
            if (a != -1) {
                return Pair.create(Integer.valueOf(a), (Long) b.second);
            }
            int a2 = m49167a(((Integer) b.first).intValue(), blm, this.f42442G);
            if (a2 == -1) {
                return null;
            }
            this.f42442G.mo40904a(a2, this.f42453k, false);
            return m49178b(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzlj(this.f42442G, bld.f42493b, bld.f42494c);
        }
    }

    /* renamed from: b */
    private final Pair<Integer, Long> m49178b(int i, long j) {
        return m49179b(this.f42442G, 0, -9223372036854775807L);
    }

    /* renamed from: b */
    private final Pair<Integer, Long> m49179b(blm blm, int i, long j) {
        return m49170a(blm, i, j, 0);
    }

    /* renamed from: a */
    private final Pair<Integer, Long> m49170a(blm blm, int i, long j, long j2) {
        brr.m49868a(i, 0, blm.mo40908b());
        blm.mo40906a(i, this.f42452j, false, j2);
        if (j == -9223372036854775807L) {
            j = this.f42452j.f42520h;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        long j3 = this.f42452j.f42522j + j;
        blm.mo40904a(0, this.f42453k, false);
        return Pair.create(Integer.valueOf(0), Long.valueOf(j3));
    }

    /* renamed from: h */
    private final void m49190h() {
        long j;
        if (!this.f42439D.f42477i) {
            j = 0;
        } else {
            j = this.f42439D.f42469a.mo41085H_();
        }
        if (j == Long.MIN_VALUE) {
            m49182b(false);
            return;
        }
        long a = this.f42438C - this.f42439D.mo40884a();
        boolean a2 = this.f42446d.mo39604a(j - a);
        m49182b(a2);
        if (a2) {
            this.f42439D.f42469a.mo41086a(a);
        }
    }

    /* renamed from: a */
    private static void m49174a(blb blb) {
        while (blb != null) {
            blb.mo40890d();
            blb = blb.f42479k;
        }
    }

    /* renamed from: b */
    private final void m49180b(blb blb) throws zzkt {
        if (this.f42441F != blb) {
            boolean[] zArr = new boolean[this.f42443a.length];
            int i = 0;
            for (int i2 = 0; i2 < this.f42443a.length; i2++) {
                blj blj = this.f42443a[i2];
                zArr[i2] = blj.mo40835d() != 0;
                bqv a = blb.f42480l.f43305b.mo41176a(i2);
                if (a != null) {
                    i++;
                }
                if (zArr[i2] && (a == null || (blj.mo40840i() && blj.mo40837f() == this.f42441F.f42472d[i2]))) {
                    if (blj == this.f42456n) {
                        this.f42447e.mo41244a(this.f42457o);
                        this.f42457o = null;
                        this.f42456n = null;
                    }
                    m49175a(blj);
                    blj.mo40842k();
                }
            }
            this.f42441F = blb;
            this.f42450h.obtainMessage(3, blb.f42480l).sendToTarget();
            m49177a(zArr, i);
        }
    }

    /* renamed from: a */
    private final void m49177a(boolean[] zArr, int i) throws zzkt {
        this.f42459q = new blj[i];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f42443a.length; i3++) {
            blj blj = this.f42443a[i3];
            bqv a = this.f42441F.f42480l.f43305b.mo41176a(i3);
            if (a != null) {
                int i4 = i2 + 1;
                this.f42459q[i2] = blj;
                if (blj.mo40835d() == 0) {
                    bll bll = this.f42441F.f42480l.f43307d[i3];
                    boolean z = this.f42461s && this.f42464v == 3;
                    boolean z2 = !zArr[i3] && z;
                    zzlg[] zzlgArr = new zzlg[a.mo41165b()];
                    for (int i5 = 0; i5 < zzlgArr.length; i5++) {
                        zzlgArr[i5] = a.mo41164a(i5);
                    }
                    blj.mo40828a(bll, zzlgArr, this.f42441F.f42472d[i3], this.f42438C, z2, this.f42441F.mo40884a());
                    brv c = blj.mo40834c();
                    if (c != null) {
                        if (this.f42457o == null) {
                            this.f42457o = c;
                            this.f42456n = blj;
                            this.f42457o.mo40967a(this.f42455m);
                        } else {
                            throw zzkt.zza((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        blj.mo40836e();
                    }
                }
                i2 = i4;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo40877a(bqg bqg) {
        this.f42448f.obtainMessage(9, (bpt) bqg).sendToTarget();
    }
}
