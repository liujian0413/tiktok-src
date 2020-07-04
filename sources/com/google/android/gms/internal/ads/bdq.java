package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.ahs.C15480a;
import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.util.LinkedList;

public abstract class bdq implements bdp {

    /* renamed from: a */
    protected static volatile beh f41704a;

    /* renamed from: b */
    protected MotionEvent f41705b;

    /* renamed from: c */
    protected LinkedList<MotionEvent> f41706c = new LinkedList<>();

    /* renamed from: d */
    protected long f41707d = 0;

    /* renamed from: e */
    protected long f41708e = 0;

    /* renamed from: f */
    protected long f41709f = 0;

    /* renamed from: g */
    protected long f41710g = 0;

    /* renamed from: h */
    protected long f41711h = 0;

    /* renamed from: i */
    protected long f41712i = 0;

    /* renamed from: j */
    protected long f41713j = 0;

    /* renamed from: k */
    protected double f41714k;

    /* renamed from: l */
    protected float f41715l;

    /* renamed from: m */
    protected float f41716m;

    /* renamed from: n */
    protected float f41717n;

    /* renamed from: o */
    protected float f41718o;

    /* renamed from: p */
    protected boolean f41719p = false;

    /* renamed from: q */
    protected DisplayMetrics f41720q;

    /* renamed from: r */
    private double f41721r;

    /* renamed from: s */
    private double f41722s;

    /* renamed from: t */
    private boolean f41723t = false;

    protected bdq(Context context) {
        try {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43808bB)).booleanValue()) {
                bbd.m48303a();
            } else {
                beo.m48548a(f41704a);
            }
            this.f41720q = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo40527a(StackTraceElement[] stackTraceElementArr) throws zzdu;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C16247a mo40528a(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C16247a mo40529a(Context context, C15480a aVar);

    /* renamed from: a */
    public void mo37778a(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bep mo40530b(MotionEvent motionEvent) throws zzdu;

    /* renamed from: a */
    public final String mo37773a(Context context) {
        if (beq.m48554a()) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43810bD)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m48478a(context, null, false, null, null, null);
    }

    /* renamed from: a */
    public final String mo37774a(Context context, String str, View view) {
        return mo37775a(context, str, view, null);
    }

    /* renamed from: a */
    public final String mo37775a(Context context, String str, View view, Activity activity) {
        return m48478a(context, str, true, view, activity, null);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37777a(android.view.MotionEvent r13) {
        /*
            r12 = this;
            boolean r0 = r12.f41723t
            r1 = 0
            if (r0 == 0) goto L_0x0035
            r2 = 0
            r12.f41710g = r2
            r12.f41709f = r2
            r12.f41708e = r2
            r12.f41707d = r2
            r12.f41711h = r2
            r12.f41713j = r2
            r12.f41712i = r2
            java.util.LinkedList<android.view.MotionEvent> r0 = r12.f41706c
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            r2.recycle()
            goto L_0x001b
        L_0x002b:
            java.util.LinkedList<android.view.MotionEvent> r0 = r12.f41706c
            r0.clear()
            r0 = 0
            r12.f41705b = r0
            r12.f41723t = r1
        L_0x0035:
            int r0 = r13.getAction()
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x003d;
                case 2: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x007a
        L_0x003d:
            float r0 = r13.getRawX()
            double r2 = (double) r0
            float r0 = r13.getRawY()
            double r4 = (double) r0
            double r6 = r12.f41721r
            java.lang.Double.isNaN(r2)
            double r6 = r2 - r6
            double r8 = r12.f41722s
            java.lang.Double.isNaN(r4)
            double r8 = r4 - r8
            double r10 = r12.f41714k
            double r6 = r6 * r6
            double r8 = r8 * r8
            double r6 = r6 + r8
            double r6 = java.lang.Math.sqrt(r6)
            double r10 = r10 + r6
            r12.f41714k = r10
            r12.f41721r = r2
            r12.f41722s = r4
            goto L_0x007a
        L_0x0068:
            r2 = 0
            r12.f41714k = r2
            float r0 = r13.getRawX()
            double r2 = (double) r0
            r12.f41721r = r2
            float r0 = r13.getRawY()
            double r2 = (double) r0
            r12.f41722s = r2
        L_0x007a:
            int r0 = r13.getAction()
            r2 = 1
            r4 = 1
            switch(r0) {
                case 0: goto L_0x0115;
                case 1: goto L_0x00df;
                case 2: goto L_0x008d;
                case 3: goto L_0x0086;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x0132
        L_0x0086:
            long r0 = r12.f41710g
            long r0 = r0 + r2
            r12.f41710g = r0
            goto L_0x0132
        L_0x008d:
            long r2 = r12.f41708e
            int r0 = r13.getHistorySize()
            int r0 = r0 + r4
            long r5 = (long) r0
            long r2 = r2 + r5
            r12.f41708e = r2
            com.google.android.gms.internal.ads.bep r13 = r12.mo40530b(r13)     // Catch:{ zzdu -> 0x0132 }
            java.lang.Long r0 = r13.f41792d     // Catch:{ zzdu -> 0x0132 }
            if (r0 == 0) goto L_0x00a6
            java.lang.Long r0 = r13.f41795g     // Catch:{ zzdu -> 0x0132 }
            if (r0 == 0) goto L_0x00a6
            r0 = 1
            goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            if (r0 == 0) goto L_0x00bc
            long r2 = r12.f41712i     // Catch:{ zzdu -> 0x0132 }
            java.lang.Long r0 = r13.f41792d     // Catch:{ zzdu -> 0x0132 }
            long r5 = r0.longValue()     // Catch:{ zzdu -> 0x0132 }
            java.lang.Long r0 = r13.f41795g     // Catch:{ zzdu -> 0x0132 }
            long r7 = r0.longValue()     // Catch:{ zzdu -> 0x0132 }
            r0 = 0
            long r5 = r5 + r7
            long r2 = r2 + r5
            r12.f41712i = r2     // Catch:{ zzdu -> 0x0132 }
        L_0x00bc:
            android.util.DisplayMetrics r0 = r12.f41720q     // Catch:{ zzdu -> 0x0132 }
            if (r0 == 0) goto L_0x00c9
            java.lang.Long r0 = r13.f41793e     // Catch:{ zzdu -> 0x0132 }
            if (r0 == 0) goto L_0x00c9
            java.lang.Long r0 = r13.f41796h     // Catch:{ zzdu -> 0x0132 }
            if (r0 == 0) goto L_0x00c9
            r1 = 1
        L_0x00c9:
            if (r1 == 0) goto L_0x0132
            long r0 = r12.f41713j     // Catch:{ zzdu -> 0x0132 }
            java.lang.Long r2 = r13.f41793e     // Catch:{ zzdu -> 0x0132 }
            long r2 = r2.longValue()     // Catch:{ zzdu -> 0x0132 }
            java.lang.Long r13 = r13.f41796h     // Catch:{ zzdu -> 0x0132 }
            long r5 = r13.longValue()     // Catch:{ zzdu -> 0x0132 }
            r13 = 0
            long r2 = r2 + r5
            long r0 = r0 + r2
            r12.f41713j = r0     // Catch:{ zzdu -> 0x0132 }
            goto L_0x0132
        L_0x00df:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r13)
            r12.f41705b = r13
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f41706c
            android.view.MotionEvent r0 = r12.f41705b
            r13.add(r0)
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f41706c
            int r13 = r13.size()
            r0 = 6
            if (r13 <= r0) goto L_0x0100
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f41706c
            java.lang.Object r13 = r13.remove()
            android.view.MotionEvent r13 = (android.view.MotionEvent) r13
            r13.recycle()
        L_0x0100:
            long r0 = r12.f41709f
            long r0 = r0 + r2
            r12.f41709f = r0
            java.lang.Throwable r13 = new java.lang.Throwable     // Catch:{ zzdu -> 0x0132 }
            r13.<init>()     // Catch:{ zzdu -> 0x0132 }
            java.lang.StackTraceElement[] r13 = r13.getStackTrace()     // Catch:{ zzdu -> 0x0132 }
            long r0 = r12.mo40527a(r13)     // Catch:{ zzdu -> 0x0132 }
            r12.f41711h = r0     // Catch:{ zzdu -> 0x0132 }
            goto L_0x0132
        L_0x0115:
            float r0 = r13.getX()
            r12.f41715l = r0
            float r0 = r13.getY()
            r12.f41716m = r0
            float r0 = r13.getRawX()
            r12.f41717n = r0
            float r13 = r13.getRawY()
            r12.f41718o = r13
            long r0 = r12.f41707d
            long r0 = r0 + r2
            r12.f41707d = r0
        L_0x0132:
            r12.f41719p = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bdq.mo37777a(android.view.MotionEvent):void");
    }

    /* renamed from: a */
    public final void mo37776a(int i, int i2, int i3) {
        if (this.f41705b != null) {
            this.f41705b.recycle();
        }
        if (this.f41720q != null) {
            this.f41705b = MotionEvent.obtain(0, (long) i3, 1, this.f41720q.density * ((float) i), this.f41720q.density * ((float) i2), 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f41705b = null;
        }
        this.f41719p = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC, Splitter:B:17:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a A[Catch:{ Exception -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066 A[SYNTHETIC, Splitter:B:32:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024 A[SYNTHETIC, Splitter:B:8:0x0024] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m48478a(android.content.Context r9, java.lang.String r10, boolean r11, android.view.View r12, android.app.Activity r13, byte[] r14) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.beh r14 = f41704a
            r0 = 0
            if (r14 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r14 = com.google.android.gms.internal.ads.C15585bw.f43850br
            com.google.android.gms.internal.ads.bt r1 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r14 = r1.mo41272a(r14)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.beh r14 = f41704a
            com.google.android.gms.internal.ads.bdm r14 = r14.f41767h
            goto L_0x001d
        L_0x001c:
            r14 = r0
        L_0x001d:
            long r1 = java.lang.System.currentTimeMillis()
            r7 = -1
            if (r11 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.zzbo$zza$a r9 = r8.mo40528a(r9, r12, r13)     // Catch:{ Exception -> 0x0030 }
            r12 = 1
            r8.f41723t = r12     // Catch:{ Exception -> 0x002c }
            goto L_0x0037
        L_0x002c:
            r12 = move-exception
            r0 = r9
            r6 = r12
            goto L_0x004b
        L_0x0030:
            r9 = move-exception
            r6 = r9
            goto L_0x004b
        L_0x0033:
            com.google.android.gms.internal.ads.zzbo$zza$a r9 = r8.mo40529a(r9, r0)     // Catch:{ Exception -> 0x0030 }
        L_0x0037:
            r0 = r9
            if (r14 == 0) goto L_0x0060
            if (r11 == 0) goto L_0x003f
            r9 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0041
        L_0x003f:
            r9 = 1000(0x3e8, float:1.401E-42)
        L_0x0041:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0030 }
            r3 = 0
            long r12 = r12 - r1
            r14.mo40522a(r9, r7, r12)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0060
        L_0x004b:
            if (r14 == 0) goto L_0x0060
            if (r11 == 0) goto L_0x0052
            r9 = 1003(0x3eb, float:1.406E-42)
            goto L_0x0054
        L_0x0052:
            r9 = 1001(0x3e9, float:1.403E-42)
        L_0x0054:
            r3 = -1
            long r12 = java.lang.System.currentTimeMillis()
            long r4 = r12 - r1
            r1 = r14
            r2 = r9
            r1.mo40523a(r2, r3, r4, r6)
        L_0x0060:
            long r12 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto L_0x0097
            com.google.android.gms.internal.ads.aza r9 = r0.mo40293e()     // Catch:{ Exception -> 0x0094 }
            com.google.android.gms.internal.ads.axu r9 = (com.google.android.gms.internal.ads.axu) r9     // Catch:{ Exception -> 0x0094 }
            com.google.android.gms.internal.ads.zzbo$zza r9 = (com.google.android.gms.internal.ads.zzbo.zza) r9     // Catch:{ Exception -> 0x0094 }
            int r9 = r9.mo40285j()     // Catch:{ Exception -> 0x0094 }
            if (r9 != 0) goto L_0x0075
            goto L_0x0097
        L_0x0075:
            com.google.android.gms.internal.ads.aza r9 = r0.mo40293e()     // Catch:{ Exception -> 0x0094 }
            com.google.android.gms.internal.ads.axu r9 = (com.google.android.gms.internal.ads.axu) r9     // Catch:{ Exception -> 0x0094 }
            com.google.android.gms.internal.ads.zzbo$zza r9 = (com.google.android.gms.internal.ads.zzbo.zza) r9     // Catch:{ Exception -> 0x0094 }
            java.lang.String r9 = com.google.android.gms.internal.ads.bbd.m48300a(r9, r10)     // Catch:{ Exception -> 0x0094 }
            if (r14 == 0) goto L_0x00ba
            if (r11 == 0) goto L_0x0088
            r10 = 1006(0x3ee, float:1.41E-42)
            goto L_0x008a
        L_0x0088:
            r10 = 1004(0x3ec, float:1.407E-42)
        L_0x008a:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0094 }
            r2 = 0
            long r0 = r0 - r12
            r14.mo40522a(r10, r7, r0)     // Catch:{ Exception -> 0x0094 }
            goto L_0x00ba
        L_0x0094:
            r9 = move-exception
            r6 = r9
            goto L_0x009d
        L_0x0097:
            r9 = 5
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ Exception -> 0x0094 }
            goto L_0x00ba
        L_0x009d:
            r9 = 7
            java.lang.String r9 = java.lang.Integer.toString(r9)
            if (r14 == 0) goto L_0x00ba
            if (r11 == 0) goto L_0x00ab
            r10 = 1007(0x3ef, float:1.411E-42)
            r2 = 1007(0x3ef, float:1.411E-42)
            goto L_0x00af
        L_0x00ab:
            r10 = 1005(0x3ed, float:1.408E-42)
            r2 = 1005(0x3ed, float:1.408E-42)
        L_0x00af:
            r3 = -1
            long r10 = java.lang.System.currentTimeMillis()
            long r4 = r10 - r12
            r1 = r14
            r1.mo40523a(r2, r3, r4, r6)
        L_0x00ba:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bdq.m48478a(android.content.Context, java.lang.String, boolean, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }
}
