package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.p748c.C15168a;
import com.google.android.gms.common.util.C15337t;
import com.google.android.gms.common.util.C15339v;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.stats.a */
public final class C16977a {

    /* renamed from: n */
    private static ScheduledExecutorService f47589n;

    /* renamed from: o */
    private static volatile C16978a f47590o = new C16979b();

    /* renamed from: a */
    private final Object f47591a;

    /* renamed from: b */
    private final WakeLock f47592b;

    /* renamed from: c */
    private WorkSource f47593c;

    /* renamed from: d */
    private final int f47594d;

    /* renamed from: e */
    private final String f47595e;

    /* renamed from: f */
    private final String f47596f;

    /* renamed from: g */
    private final String f47597g;

    /* renamed from: h */
    private final Context f47598h;

    /* renamed from: i */
    private boolean f47599i;

    /* renamed from: j */
    private final Map<String, Integer[]> f47600j;

    /* renamed from: k */
    private final Set<Future<?>> f47601k;

    /* renamed from: l */
    private int f47602l;

    /* renamed from: m */
    private AtomicInteger f47603m;

    /* renamed from: com.google.android.gms.stats.a$a */
    public interface C16978a {
    }

    public C16977a(Context context, int i, String str) {
        this(context, 1, str, null, context == null ? null : context.getPackageName());
    }

    private C16977a(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, null, str3, null);
    }

    private C16977a(Context context, int i, String str, String str2, String str3, String str4) {
        this.f47591a = this;
        this.f47599i = true;
        this.f47600j = new HashMap();
        this.f47601k = Collections.synchronizedSet(new HashSet());
        this.f47603m = new AtomicInteger(0);
        C15267r.m44385a(context, (Object) "WakeLock: context must not be null");
        C15267r.m44387a(str, (Object) "WakeLock: wakeLockName must not be empty");
        this.f47594d = i;
        this.f47596f = null;
        this.f47597g = null;
        this.f47598h = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf("*gcore*:");
            String valueOf2 = String.valueOf(str);
            this.f47595e = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else {
            this.f47595e = str;
        }
        this.f47592b = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (C15339v.m44619a(context)) {
            if (C15337t.m44610a(str3)) {
                str3 = context.getPackageName();
            }
            this.f47593c = C15339v.m44614a(context, str3);
            WorkSource workSource = this.f47593c;
            if (workSource != null && C15339v.m44619a(this.f47598h)) {
                if (this.f47593c != null) {
                    this.f47593c.add(workSource);
                } else {
                    this.f47593c = workSource;
                }
                try {
                    this.f47592b.setWorkSource(this.f47593c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f47589n == null) {
            f47589n = C15168a.m44141a().mo38459a();
        }
    }

    /* renamed from: c */
    private final List<String> m56427c() {
        return C15339v.m44617a(this.f47593c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r0 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r11.f47602l == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        com.google.android.gms.common.stats.C15310d.m44546a(r11.f47598h, com.google.android.gms.common.stats.C15309c.m44544a(r11.f47592b, r4), 7, r11.f47595e, r4, null, r11.f47594d, m56427c(), 1000);
        r11.f47602l++;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44199a(long r12) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicInteger r12 = r11.f47603m
            r12.incrementAndGet()
            r12 = 0
            java.lang.String r4 = r11.m56424a(r12)
            java.lang.Object r12 = r11.f47591a
            monitor-enter(r12)
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r11.f47600j     // Catch:{ all -> 0x008f }
            boolean r13 = r13.isEmpty()     // Catch:{ all -> 0x008f }
            r0 = 0
            if (r13 == 0) goto L_0x001a
            int r13 = r11.f47602l     // Catch:{ all -> 0x008f }
            if (r13 <= 0) goto L_0x0029
        L_0x001a:
            android.os.PowerManager$WakeLock r13 = r11.f47592b     // Catch:{ all -> 0x008f }
            boolean r13 = r13.isHeld()     // Catch:{ all -> 0x008f }
            if (r13 != 0) goto L_0x0029
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r11.f47600j     // Catch:{ all -> 0x008f }
            r13.clear()     // Catch:{ all -> 0x008f }
            r11.f47602l = r0     // Catch:{ all -> 0x008f }
        L_0x0029:
            boolean r13 = r11.f47599i     // Catch:{ all -> 0x008f }
            r10 = 1
            if (r13 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r11.f47600j     // Catch:{ all -> 0x008f }
            java.lang.Object r13 = r13.get(r4)     // Catch:{ all -> 0x008f }
            java.lang.Integer[] r13 = (java.lang.Integer[]) r13     // Catch:{ all -> 0x008f }
            if (r13 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.lang.Integer[]> r13 = r11.f47600j     // Catch:{ all -> 0x008f }
            java.lang.Integer[] r1 = new java.lang.Integer[r10]     // Catch:{ all -> 0x008f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x008f }
            r1[r0] = r2     // Catch:{ all -> 0x008f }
            r13.put(r4, r1)     // Catch:{ all -> 0x008f }
            r0 = 1
            goto L_0x0054
        L_0x0047:
            r1 = r13[r0]     // Catch:{ all -> 0x008f }
            int r1 = r1.intValue()     // Catch:{ all -> 0x008f }
            int r1 = r1 + r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x008f }
            r13[r0] = r1     // Catch:{ all -> 0x008f }
        L_0x0054:
            if (r0 != 0) goto L_0x005e
        L_0x0056:
            boolean r13 = r11.f47599i     // Catch:{ all -> 0x008f }
            if (r13 != 0) goto L_0x007a
            int r13 = r11.f47602l     // Catch:{ all -> 0x008f }
            if (r13 != 0) goto L_0x007a
        L_0x005e:
            android.content.Context r0 = r11.f47598h     // Catch:{ all -> 0x008f }
            android.os.PowerManager$WakeLock r13 = r11.f47592b     // Catch:{ all -> 0x008f }
            java.lang.String r1 = com.google.android.gms.common.stats.C15309c.m44544a(r13, r4)     // Catch:{ all -> 0x008f }
            r2 = 7
            java.lang.String r3 = r11.f47595e     // Catch:{ all -> 0x008f }
            r5 = 0
            int r6 = r11.f47594d     // Catch:{ all -> 0x008f }
            java.util.List r7 = r11.m56427c()     // Catch:{ all -> 0x008f }
            r8 = 1000(0x3e8, double:4.94E-321)
            com.google.android.gms.common.stats.C15310d.m44546a(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x008f }
            int r13 = r11.f47602l     // Catch:{ all -> 0x008f }
            int r13 = r13 + r10
            r11.f47602l = r13     // Catch:{ all -> 0x008f }
        L_0x007a:
            monitor-exit(r12)     // Catch:{ all -> 0x008f }
            android.os.PowerManager$WakeLock r12 = r11.f47592b
            r12.acquire()
            java.util.concurrent.ScheduledExecutorService r12 = f47589n
            com.google.android.gms.stats.c r13 = new com.google.android.gms.stats.c
            r13.<init>(r11)
            r0 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r12.schedule(r13, r0, r2)
            return
        L_0x008f:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x008f }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.C16977a.mo44199a(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r1 != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r12.f47602l == 1) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        com.google.android.gms.common.stats.C15310d.m44545a().mo38677a(r12.f47598h, com.google.android.gms.common.stats.C15309c.m44544a(r12.f47592b, r6), 8, r12.f47595e, r6, null, r12.f47594d, m56427c());
        r12.f47602l--;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44198a() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f47603m
            r0.decrementAndGet()
            r0 = 0
            java.lang.String r6 = r12.m56424a(r0)
            java.lang.Object r0 = r12.f47591a
            monitor-enter(r0)
            boolean r1 = r12.f47599i     // Catch:{ all -> 0x006a }
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x003e
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f47600j     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x006a }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x001f
        L_0x001d:
            r1 = 0
            goto L_0x003c
        L_0x001f:
            r2 = r1[r11]     // Catch:{ all -> 0x006a }
            int r2 = r2.intValue()     // Catch:{ all -> 0x006a }
            if (r2 != r10) goto L_0x002e
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f47600j     // Catch:{ all -> 0x006a }
            r1.remove(r6)     // Catch:{ all -> 0x006a }
            r1 = 1
            goto L_0x003c
        L_0x002e:
            r2 = r1[r11]     // Catch:{ all -> 0x006a }
            int r2 = r2.intValue()     // Catch:{ all -> 0x006a }
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x006a }
            r1[r11] = r2     // Catch:{ all -> 0x006a }
            goto L_0x001d
        L_0x003c:
            if (r1 != 0) goto L_0x0046
        L_0x003e:
            boolean r1 = r12.f47599i     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x0065
            int r1 = r12.f47602l     // Catch:{ all -> 0x006a }
            if (r1 != r10) goto L_0x0065
        L_0x0046:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.C15310d.m44545a()     // Catch:{ all -> 0x006a }
            android.content.Context r2 = r12.f47598h     // Catch:{ all -> 0x006a }
            android.os.PowerManager$WakeLock r3 = r12.f47592b     // Catch:{ all -> 0x006a }
            java.lang.String r3 = com.google.android.gms.common.stats.C15309c.m44544a(r3, r6)     // Catch:{ all -> 0x006a }
            r4 = 8
            java.lang.String r5 = r12.f47595e     // Catch:{ all -> 0x006a }
            r7 = 0
            int r8 = r12.f47594d     // Catch:{ all -> 0x006a }
            java.util.List r9 = r12.m56427c()     // Catch:{ all -> 0x006a }
            r1.mo38677a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x006a }
            int r1 = r12.f47602l     // Catch:{ all -> 0x006a }
            int r1 = r1 - r10
            r12.f47602l = r1     // Catch:{ all -> 0x006a }
        L_0x0065:
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            r12.m56425a(r11)
            return
        L_0x006a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.C16977a.mo44198a():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m56425a(int i) {
        if (this.f47592b.isHeld()) {
            try {
                this.f47592b.release();
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
            }
            this.f47592b.isHeld();
        }
    }

    /* renamed from: a */
    private final String m56424a(String str) {
        if (!this.f47599i) {
            return this.f47596f;
        }
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        return this.f47596f;
    }

    /* renamed from: a */
    public final void mo44200a(boolean z) {
        this.f47592b.setReferenceCounted(false);
        this.f47599i = false;
    }

    /* renamed from: b */
    public final boolean mo44201b() {
        return this.f47592b.isHeld();
    }
}
