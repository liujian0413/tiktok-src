package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

public final class bss {

    /* renamed from: a */
    private final bst f43459a;

    /* renamed from: b */
    private final boolean f43460b;

    /* renamed from: c */
    private final long f43461c;

    /* renamed from: d */
    private final long f43462d;

    /* renamed from: e */
    private long f43463e;

    /* renamed from: f */
    private long f43464f;

    /* renamed from: g */
    private long f43465g;

    /* renamed from: h */
    private boolean f43466h;

    /* renamed from: i */
    private long f43467i;

    /* renamed from: j */
    private long f43468j;

    /* renamed from: k */
    private long f43469k;

    public bss() {
        this(-1.0d);
    }

    public bss(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this(windowManager.getDefaultDisplay() != null ? (double) windowManager.getDefaultDisplay().getRefreshRate() : -1.0d);
    }

    private bss(double d) {
        this.f43460b = d != -1.0d;
        if (this.f43460b) {
            this.f43459a = bst.m49994a();
            this.f43461c = (long) (1.0E9d / d);
            this.f43462d = (this.f43461c * 80) / 100;
            return;
        }
        this.f43459a = null;
        this.f43461c = -1;
        this.f43462d = -1;
    }

    /* renamed from: a */
    public final void mo41255a() {
        this.f43466h = false;
        if (this.f43460b) {
            this.f43459a.mo41257b();
        }
    }

    /* renamed from: b */
    public final void mo41256b() {
        if (this.f43460b) {
            this.f43459a.mo41258c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo41254a(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.f43466h
            if (r2 == 0) goto L_0x0044
            long r2 = r11.f43463e
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r11.f43469k
            r4 = 1
            long r2 = r2 + r4
            r11.f43469k = r2
            long r2 = r11.f43465g
            r11.f43464f = r2
        L_0x0019:
            long r2 = r11.f43469k
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003c
            long r2 = r11.f43468j
            long r2 = r0 - r2
            long r4 = r11.f43469k
            long r2 = r2 / r4
            long r4 = r11.f43464f
            long r2 = r2 + r4
            boolean r4 = r11.m49990b(r2, r14)
            if (r4 == 0) goto L_0x0035
            r11.f43466h = r6
            goto L_0x0044
        L_0x0035:
            long r4 = r11.f43467i
            long r4 = r4 + r2
            long r6 = r11.f43468j
            long r4 = r4 - r6
            goto L_0x0046
        L_0x003c:
            boolean r2 = r11.m49990b(r0, r14)
            if (r2 == 0) goto L_0x0044
            r11.f43466h = r6
        L_0x0044:
            r4 = r14
            r2 = r0
        L_0x0046:
            boolean r6 = r11.f43466h
            r7 = 0
            if (r6 != 0) goto L_0x0055
            r11.f43468j = r0
            r11.f43467i = r14
            r11.f43469k = r7
            r14 = 1
            r11.f43466h = r14
        L_0x0055:
            r11.f43463e = r12
            r11.f43465g = r2
            com.google.android.gms.internal.ads.bst r12 = r11.f43459a
            if (r12 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.bst r12 = r11.f43459a
            long r12 = r12.f43471a
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x0066
            goto L_0x008c
        L_0x0066:
            com.google.android.gms.internal.ads.bst r12 = r11.f43459a
            long r12 = r12.f43471a
            long r14 = r11.f43461c
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0079
            long r14 = r12 - r14
            goto L_0x007e
        L_0x0079:
            r0 = 0
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L_0x007e:
            r0 = 0
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r12 = r14
        L_0x0088:
            long r14 = r11.f43462d
            long r12 = r12 - r14
            return r12
        L_0x008c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bss.mo41254a(long, long):long");
    }

    /* renamed from: b */
    private final boolean m49990b(long j, long j2) {
        return Math.abs((j2 - this.f43467i) - (j - this.f43468j)) > 20000000;
    }
}
