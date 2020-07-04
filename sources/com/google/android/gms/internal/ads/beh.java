package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzbo.zza;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class beh {

    /* renamed from: m */
    private static final String f41759m = "beh";

    /* renamed from: a */
    public Context f41760a;

    /* renamed from: b */
    public ExecutorService f41761b;

    /* renamed from: c */
    public DexClassLoader f41762c;

    /* renamed from: d */
    public bdu f41763d;

    /* renamed from: e */
    public byte[] f41764e;

    /* renamed from: f */
    public volatile zza f41765f;

    /* renamed from: g */
    public Future f41766g;

    /* renamed from: h */
    public bdm f41767h;

    /* renamed from: i */
    public boolean f41768i;

    /* renamed from: j */
    public boolean f41769j;

    /* renamed from: k */
    public boolean f41770k;

    /* renamed from: l */
    public boolean f41771l = true;

    /* renamed from: n */
    private volatile C14733a f41772n;

    /* renamed from: o */
    private volatile boolean f41773o;

    /* renamed from: p */
    private Future f41774p;

    /* renamed from: q */
    private boolean f41775q;

    /* renamed from: r */
    private Map<Pair<String, String>, bfu> f41776r;

    /* renamed from: s */
    private boolean f41777s;

    /* renamed from: com.google.android.gms.internal.ads.beh$a */
    final class C15565a extends BroadcastReceiver {
        private C15565a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                beh.this.f41771l = true;
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                beh.this.f41771l = false;
            }
        }

        /* synthetic */ C15565a(beh beh, bej bej) {
            this();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|27|(14:28|29|(2:31|(1:33)(2:34|35))|36|(1:38)|39|40|41|42|43|44|45|(1:47)|48)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004b */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054 A[Catch:{ zzdj -> 0x0152, zzdu -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[Catch:{ all -> 0x011f, FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2 A[Catch:{ all -> 0x011f, FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fa A[Catch:{ zzdj -> 0x0152, zzdu -> 0x0159 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.beh m48529a(android.content.Context r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            com.google.android.gms.internal.ads.beh r0 = new com.google.android.gms.internal.ads.beh
            r0.<init>(r8)
            com.google.android.gms.internal.ads.bej r8 = new com.google.android.gms.internal.ads.bej     // Catch:{ zzdu -> 0x0159 }
            r8.<init>()     // Catch:{ zzdu -> 0x0159 }
            java.util.concurrent.ExecutorService r8 = com.google.android.gms.internal.ads.bei.m48547a(r8)     // Catch:{ zzdu -> 0x0159 }
            r0.f41761b = r8     // Catch:{ zzdu -> 0x0159 }
            r0.f41773o = r11     // Catch:{ zzdu -> 0x0159 }
            if (r11 == 0) goto L_0x0021
            java.util.concurrent.ExecutorService r8 = r0.f41761b     // Catch:{ zzdu -> 0x0159 }
            com.google.android.gms.internal.ads.bek r11 = new com.google.android.gms.internal.ads.bek     // Catch:{ zzdu -> 0x0159 }
            r11.<init>(r0)     // Catch:{ zzdu -> 0x0159 }
            java.util.concurrent.Future r8 = r8.submit(r11)     // Catch:{ zzdu -> 0x0159 }
            r0.f41774p = r8     // Catch:{ zzdu -> 0x0159 }
        L_0x0021:
            java.util.concurrent.ExecutorService r8 = r0.f41761b     // Catch:{ zzdu -> 0x0159 }
            com.google.android.gms.internal.ads.ben r11 = new com.google.android.gms.internal.ads.ben     // Catch:{ zzdu -> 0x0159 }
            r11.<init>(r0)     // Catch:{ zzdu -> 0x0159 }
            r8.execute(r11)     // Catch:{ zzdu -> 0x0159 }
            r8 = 1
            r11 = 0
            com.google.android.gms.common.c r1 = com.google.android.gms.common.C15167c.getInstance()     // Catch:{ Throwable -> 0x004b }
            android.content.Context r2 = r0.f41760a     // Catch:{ Throwable -> 0x004b }
            int r2 = r1.getApkVersion(r2)     // Catch:{ Throwable -> 0x004b }
            if (r2 <= 0) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            r0.f41768i = r2     // Catch:{ Throwable -> 0x004b }
            android.content.Context r2 = r0.f41760a     // Catch:{ Throwable -> 0x004b }
            int r1 = r1.isGooglePlayServicesAvailable(r2)     // Catch:{ Throwable -> 0x004b }
            if (r1 != 0) goto L_0x0048
            r1 = 1
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            r0.f41769j = r1     // Catch:{ Throwable -> 0x004b }
        L_0x004b:
            r0.mo40553a(r11, r8)     // Catch:{ zzdu -> 0x0159 }
            boolean r1 = com.google.android.gms.internal.ads.beq.m48554a()     // Catch:{ zzdu -> 0x0159 }
            if (r1 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C15585bw.f43809bC     // Catch:{ zzdu -> 0x0159 }
            com.google.android.gms.internal.ads.bt r2 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ zzdu -> 0x0159 }
            java.lang.Object r1 = r2.mo41272a(r1)     // Catch:{ zzdu -> 0x0159 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ zzdu -> 0x0159 }
            boolean r1 = r1.booleanValue()     // Catch:{ zzdu -> 0x0159 }
            if (r1 != 0) goto L_0x0067
            goto L_0x006f
        L_0x0067:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ zzdu -> 0x0159 }
            java.lang.String r9 = "Task Context initialization must not be called from the UI thread."
            r8.<init>(r9)     // Catch:{ zzdu -> 0x0159 }
            throw r8     // Catch:{ zzdu -> 0x0159 }
        L_0x006f:
            com.google.android.gms.internal.ads.bdu r1 = new com.google.android.gms.internal.ads.bdu     // Catch:{ zzdu -> 0x0159 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ zzdu -> 0x0159 }
            r0.f41763d = r1     // Catch:{ zzdu -> 0x0159 }
            com.google.android.gms.internal.ads.bdu r1 = r0.f41763d     // Catch:{ zzdj -> 0x0152 }
            byte[] r9 = r1.mo40539a(r9)     // Catch:{ zzdj -> 0x0152 }
            r0.f41764e = r9     // Catch:{ zzdj -> 0x0152 }
            android.content.Context r9 = r0.f41760a     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            java.io.File r9 = r9.getCacheDir()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            if (r9 != 0) goto L_0x0098
            android.content.Context r9 = r0.f41760a     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r1 = "dex"
            java.io.File r9 = r9.getDir(r1, r11)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            if (r9 == 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            com.google.android.gms.internal.ads.zzdu r8 = new com.google.android.gms.internal.ads.zzdu     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            throw r8     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
        L_0x0098:
            java.lang.String r1 = "1541627490455"
            java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r4 = "%s/%s.jar"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r6[r11] = r9     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r6[r8] = r1     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r4 = com.C1642a.m8034a(r4, r6)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            boolean r4 = r3.exists()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            if (r4 != 0) goto L_0x00c9
            com.google.android.gms.internal.ads.bdu r4 = r0.f41763d     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            byte[] r6 = r0.f41764e     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            byte[] r10 = r4.mo40540a(r6, r10)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r3.createNewFile()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            int r6 = r10.length     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r4.write(r10, r11, r6)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
        L_0x00c9:
            r0.m48538b(r9, r1)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            dalvik.system.DexClassLoader r10 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x011f }
            java.lang.String r4 = r3.getAbsolutePath()     // Catch:{ all -> 0x011f }
            java.lang.String r6 = r9.getAbsolutePath()     // Catch:{ all -> 0x011f }
            android.content.Context r7 = r0.f41760a     // Catch:{ all -> 0x011f }
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ all -> 0x011f }
            r10.<init>(r4, r6, r2, r7)     // Catch:{ all -> 0x011f }
            r0.f41762c = r10     // Catch:{ all -> 0x011f }
            m48532a(r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r0.m48533a(r9, r1)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r10 = "%s/%s.dex"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r3[r11] = r9     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r3[r8] = r1     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r9 = com.C1642a.m8034a(r10, r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            m48534a(r9)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            boolean r9 = r0.f41777s     // Catch:{ zzdu -> 0x0159 }
            if (r9 != 0) goto L_0x0115
            android.content.IntentFilter r9 = new android.content.IntentFilter     // Catch:{ zzdu -> 0x0159 }
            r9.<init>()     // Catch:{ zzdu -> 0x0159 }
            java.lang.String r10 = "android.intent.action.USER_PRESENT"
            r9.addAction(r10)     // Catch:{ zzdu -> 0x0159 }
            java.lang.String r10 = "android.intent.action.SCREEN_OFF"
            r9.addAction(r10)     // Catch:{ zzdu -> 0x0159 }
            android.content.Context r10 = r0.f41760a     // Catch:{ zzdu -> 0x0159 }
            com.google.android.gms.internal.ads.beh$a r11 = new com.google.android.gms.internal.ads.beh$a     // Catch:{ zzdu -> 0x0159 }
            r11.<init>(r0, r2)     // Catch:{ zzdu -> 0x0159 }
            r10.registerReceiver(r11, r9)     // Catch:{ zzdu -> 0x0159 }
            r0.f41777s = r8     // Catch:{ zzdu -> 0x0159 }
        L_0x0115:
            com.google.android.gms.internal.ads.bdm r9 = new com.google.android.gms.internal.ads.bdm     // Catch:{ zzdu -> 0x0159 }
            r9.<init>(r0)     // Catch:{ zzdu -> 0x0159 }
            r0.f41767h = r9     // Catch:{ zzdu -> 0x0159 }
            r0.f41770k = r8     // Catch:{ zzdu -> 0x0159 }
            goto L_0x0159
        L_0x011f:
            r10 = move-exception
            m48532a(r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r0.m48533a(r9, r1)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r2 = "%s/%s.dex"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r3[r11] = r9     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            r3[r8] = r1     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r8 = com.C1642a.m8034a(r2, r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            m48534a(r8)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
            throw r10     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzdj -> 0x013d, NullPointerException -> 0x0136 }
        L_0x0136:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzdu r9 = new com.google.android.gms.internal.ads.zzdu     // Catch:{ zzdu -> 0x0159 }
            r9.<init>(r8)     // Catch:{ zzdu -> 0x0159 }
            throw r9     // Catch:{ zzdu -> 0x0159 }
        L_0x013d:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzdu r9 = new com.google.android.gms.internal.ads.zzdu     // Catch:{ zzdu -> 0x0159 }
            r9.<init>(r8)     // Catch:{ zzdu -> 0x0159 }
            throw r9     // Catch:{ zzdu -> 0x0159 }
        L_0x0144:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzdu r9 = new com.google.android.gms.internal.ads.zzdu     // Catch:{ zzdu -> 0x0159 }
            r9.<init>(r8)     // Catch:{ zzdu -> 0x0159 }
            throw r9     // Catch:{ zzdu -> 0x0159 }
        L_0x014b:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzdu r9 = new com.google.android.gms.internal.ads.zzdu     // Catch:{ zzdu -> 0x0159 }
            r9.<init>(r8)     // Catch:{ zzdu -> 0x0159 }
            throw r9     // Catch:{ zzdu -> 0x0159 }
        L_0x0152:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzdu r9 = new com.google.android.gms.internal.ads.zzdu     // Catch:{ zzdu -> 0x0159 }
            r9.<init>(r8)     // Catch:{ zzdu -> 0x0159 }
            throw r9     // Catch:{ zzdu -> 0x0159 }
        L_0x0159:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.beh.m48529a(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.beh");
    }

    private beh(Context context) {
        boolean z = true;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            z = false;
        }
        this.f41775q = z;
        if (this.f41775q) {
            context = applicationContext;
        }
        this.f41760a = context;
        this.f41776r = new HashMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00c4 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d6 A[SYNTHETIC, Splitter:B:39:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db A[SYNTHETIC, Splitter:B:43:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5 A[SYNTHETIC, Splitter:B:52:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ea A[SYNTHETIC, Splitter:B:56:0x00ea] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m48533a(java.io.File r8, java.lang.String r9) {
        /*
            r7 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "%s/%s.tmp"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r8
            r5 = 1
            r3[r5] = r9
            java.lang.String r1 = com.C1642a.m8034a(r1, r3)
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x001b
            return
        L_0x001b:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "%s/%s.dex"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r8
            r2[r5] = r9
            java.lang.String r8 = com.C1642a.m8034a(r3, r2)
            r1.<init>(r8)
            boolean r8 = r1.exists()
            if (r8 != 0) goto L_0x0033
            return
        L_0x0033:
            long r2 = r1.length()
            r5 = 0
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x003e
            return
        L_0x003e:
            int r8 = (int) r2
            byte[] r8 = new byte[r8]
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00d2 }
            r3.<init>(r1)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e2, all -> 0x00d2 }
            int r5 = r3.read(r8)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            if (r5 > 0) goto L_0x0054
            r3.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            m48532a(r1)
            return
        L_0x0054:
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            java.lang.String r6 = "test"
            r5.print(r6)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            java.lang.String r6 = "test"
            r5.print(r6)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            java.lang.String r6 = "test"
            r5.print(r6)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            com.google.android.gms.internal.ads.zzbo$b$a r5 = com.google.android.gms.internal.ads.zzbo.C16239b.m52676a()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            byte[] r6 = r6.getBytes()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            com.google.android.gms.internal.ads.zzcce r6 = com.google.android.gms.internal.ads.zzcce.zzy(r6)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            com.google.android.gms.internal.ads.zzbo$b$a r5 = r5.mo42189d(r6)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            byte[] r9 = r9.getBytes()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            com.google.android.gms.internal.ads.zzcce r9 = com.google.android.gms.internal.ads.zzcce.zzy(r9)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            com.google.android.gms.internal.ads.zzbo$b$a r9 = r5.mo42188c(r9)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            com.google.android.gms.internal.ads.bdu r5 = r7.f41763d     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            byte[] r6 = r7.f41764e     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            java.lang.String r8 = r5.mo40538a(r6, r8)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            byte[] r8 = r8.getBytes()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            com.google.android.gms.internal.ads.zzcce r5 = com.google.android.gms.internal.ads.zzcce.zzy(r8)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            com.google.android.gms.internal.ads.zzbo$b$a r5 = r9.mo42186a(r5)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            byte[] r8 = com.google.android.gms.internal.ads.bbd.m48304a(r8)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            com.google.android.gms.internal.ads.zzcce r8 = com.google.android.gms.internal.ads.zzcce.zzy(r8)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            r5.mo42187b(r8)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            r0.createNewFile()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            r8.<init>(r0)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00d0 }
            com.google.android.gms.internal.ads.aza r9 = r9.mo40293e()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00cb }
            com.google.android.gms.internal.ads.axu r9 = (com.google.android.gms.internal.ads.axu) r9     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00cb }
            com.google.android.gms.internal.ads.zzbo$b r9 = (com.google.android.gms.internal.ads.zzbo.C16239b) r9     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00cb }
            byte[] r9 = r9.mo40082g()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00cb }
            int r0 = r9.length     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00cb }
            r8.write(r9, r4, r0)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00cb }
            r8.close()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00ce, all -> 0x00cb }
            r3.close()     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            r8.close()     // Catch:{ IOException -> 0x00c7 }
        L_0x00c7:
            m48532a(r1)
            return
        L_0x00cb:
            r9 = move-exception
            r2 = r8
            goto L_0x00d4
        L_0x00ce:
            r2 = r8
            goto L_0x00e3
        L_0x00d0:
            r9 = move-exception
            goto L_0x00d4
        L_0x00d2:
            r9 = move-exception
            r3 = r2
        L_0x00d4:
            if (r3 == 0) goto L_0x00d9
            r3.close()     // Catch:{ IOException -> 0x00d9 }
        L_0x00d9:
            if (r2 == 0) goto L_0x00de
            r2.close()     // Catch:{ IOException -> 0x00de }
        L_0x00de:
            m48532a(r1)
            throw r9
        L_0x00e2:
            r3 = r2
        L_0x00e3:
            if (r3 == 0) goto L_0x00e8
            r3.close()     // Catch:{ IOException -> 0x00e8 }
        L_0x00e8:
            if (r2 == 0) goto L_0x00ed
            r2.close()     // Catch:{ IOException -> 0x00ed }
        L_0x00ed:
            m48532a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.beh.m48533a(java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private static void m48534a(String str) {
        m48532a(new File(str));
    }

    /* renamed from: a */
    private static void m48532a(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00bb */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d1 A[SYNTHETIC, Splitter:B:52:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d6 A[SYNTHETIC, Splitter:B:56:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00dd A[SYNTHETIC, Splitter:B:64:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e2 A[SYNTHETIC, Splitter:B:68:0x00e2] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m48538b(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "%s/%s.tmp"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r10
            r5 = 1
            r3[r5] = r11
            java.lang.String r1 = com.C1642a.m8034a(r1, r3)
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x001b
            return r4
        L_0x001b:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "%s/%s.dex"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r10
            r2[r5] = r11
            java.lang.String r10 = com.C1642a.m8034a(r3, r2)
            r1.<init>(r10)
            boolean r10 = r1.exists()
            if (r10 == 0) goto L_0x0033
            return r4
        L_0x0033:
            r10 = 0
            long r2 = r0.length()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00da, all -> 0x00cd }
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0042
            m48532a(r0)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00da, all -> 0x00cd }
            return r4
        L_0x0042:
            int r2 = (int) r2     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00da, all -> 0x00cd }
            byte[] r2 = new byte[r2]     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00da, all -> 0x00cd }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00da, all -> 0x00cd }
            r3.<init>(r0)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00da, all -> 0x00cd }
            int r6 = r3.read(r2)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            if (r6 > 0) goto L_0x0057
            m48532a(r0)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            r3.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            return r4
        L_0x0057:
            com.google.android.gms.internal.ads.axi r6 = com.google.android.gms.internal.ads.axi.m47630b()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            com.google.android.gms.internal.ads.zzbo$b r2 = com.google.android.gms.internal.ads.zzbo.C16239b.m52677a(r2, r6)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            com.google.android.gms.internal.ads.zzcce r7 = r2.zzkg     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            byte[] r7 = r7.toByteArray()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            r6.<init>(r7)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            boolean r11 = r11.equals(r6)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            if (r11 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.zzcce r11 = r2.zzkf     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            byte[] r11 = r11.toByteArray()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            com.google.android.gms.internal.ads.zzcce r6 = r2.zzke     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            byte[] r6 = r6.toByteArray()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            byte[] r6 = com.google.android.gms.internal.ads.bbd.m48304a(r6)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            if (r11 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.zzcce r11 = r2.zzkh     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            byte[] r11 = r11.toByteArray()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            byte[] r6 = r6.getBytes()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            if (r11 != 0) goto L_0x0099
            goto L_0x00c4
        L_0x0099:
            com.google.android.gms.internal.ads.bdu r11 = r9.f41763d     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            byte[] r0 = r9.f41764e     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            com.google.android.gms.internal.ads.zzcce r2 = r2.zzke     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            byte[] r2 = r2.toByteArray()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            r6.<init>(r2)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            byte[] r11 = r11.mo40540a(r0, r6)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            r1.createNewFile()     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            r0.<init>(r1)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            int r10 = r11.length     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00c2, all -> 0x00bf }
            r0.write(r11, r4, r10)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00c2, all -> 0x00bf }
            r3.close()     // Catch:{ IOException -> 0x00bb }
        L_0x00bb:
            r0.close()     // Catch:{ IOException -> 0x00be }
        L_0x00be:
            return r5
        L_0x00bf:
            r11 = move-exception
            r10 = r0
            goto L_0x00cf
        L_0x00c2:
            r10 = r0
            goto L_0x00db
        L_0x00c4:
            m48532a(r0)     // Catch:{ zzdj | IOException | NoSuchAlgorithmException -> 0x00db, all -> 0x00cb }
            r3.close()     // Catch:{ IOException -> 0x00ca }
        L_0x00ca:
            return r4
        L_0x00cb:
            r11 = move-exception
            goto L_0x00cf
        L_0x00cd:
            r11 = move-exception
            r3 = r10
        L_0x00cf:
            if (r3 == 0) goto L_0x00d4
            r3.close()     // Catch:{ IOException -> 0x00d4 }
        L_0x00d4:
            if (r10 == 0) goto L_0x00d9
            r10.close()     // Catch:{ IOException -> 0x00d9 }
        L_0x00d9:
            throw r11
        L_0x00da:
            r3 = r10
        L_0x00db:
            if (r3 == 0) goto L_0x00e0
            r3.close()     // Catch:{ IOException -> 0x00e0 }
        L_0x00e0:
            if (r10 == 0) goto L_0x00e5
            r10.close()     // Catch:{ IOException -> 0x00e5 }
        L_0x00e5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.beh.m48538b(java.io.File, java.lang.String):boolean");
    }

    /* renamed from: a */
    public final boolean mo40554a(String str, String str2, Class<?>... clsArr) {
        if (this.f41776r.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f41776r.put(new Pair(str, str2), new bfu(this, str, str2, clsArr));
        return true;
    }

    /* renamed from: a */
    public final Method mo40552a(String str, String str2) {
        bfu bfu = (bfu) this.f41776r.get(new Pair(str, str2));
        if (bfu == null) {
            return null;
        }
        return bfu.mo40584a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m48539c() {
        try {
            if (this.f41772n == null && this.f41775q) {
                C14733a aVar = new C14733a(this.f41760a);
                aVar.mo37413a();
                this.f41772n = aVar;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.f41772n = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40553a(int i, boolean z) {
        if (this.f41769j) {
            Future submit = this.f41761b.submit(new bem(this, i, z));
            if (i == 0) {
                this.f41766g = submit;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final zza mo40556b(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep((long) (i * 1000));
            } catch (InterruptedException unused) {
            }
        }
        return m48540d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m48537b(int i, zza zza) {
        if (i >= 4 || (zza != null && zza.mo42195a() && !zza.zzei.equals("0000000000000000000000000000000000000000000000000000000000000000") && zza.mo42196b() && zza.mo42197c().mo42190a() && zza.mo42197c().zzjv != -2)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final zza m48540d() {
        try {
            return aov.m46831a(this.f41760a, this.f41760a.getPackageName(), Integer.toString(this.f41760a.getPackageManager().getPackageInfo(this.f41760a.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C14733a mo40551a() {
        if (!this.f41773o) {
            return null;
        }
        if (this.f41772n != null) {
            return this.f41772n;
        }
        if (this.f41774p != null) {
            try {
                this.f41774p.get(2000, TimeUnit.MILLISECONDS);
                this.f41774p = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.f41774p.cancel(true);
            }
        }
        return this.f41772n;
    }

    /* renamed from: b */
    public final int mo40555b() {
        if (this.f41767h != null) {
            return bdm.m48462a();
        }
        return Integer.MIN_VALUE;
    }
}
