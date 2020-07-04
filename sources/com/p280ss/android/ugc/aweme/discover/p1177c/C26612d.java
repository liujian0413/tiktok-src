package com.p280ss.android.ugc.aweme.discover.p1177c;

import com.p280ss.android.ugc.aweme.app.api.C22832g;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27029ba;

/* renamed from: com.ss.android.ugc.aweme.discover.c.d */
public final class C26612d {

    /* renamed from: a */
    public static final C26612d f70187a = new C26612d();

    /* renamed from: b */
    private static long f70188b;

    /* renamed from: c */
    private static long f70189c;

    /* renamed from: d */
    private static long f70190d;

    /* renamed from: e */
    private static C26611c f70191e;

    /* renamed from: f */
    private static C22832g f70192f;

    private C26612d() {
    }

    /* renamed from: a */
    public final C26612d mo68301a() {
        f70189c = System.currentTimeMillis();
        return this;
    }

    /* renamed from: b */
    public final C26612d mo68305b() {
        long j;
        if (f70189c != 0) {
            j = f70189c;
        } else {
            j = f70188b;
        }
        f70190d = System.currentTimeMillis();
        C26611c cVar = f70191e;
        if (cVar != null) {
            cVar.f70182f = (int) (f70190d - j);
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0187 A[Catch:{ Exception -> 0x0289, all -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0100 A[Catch:{ Exception -> 0x0289, all -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011b A[Catch:{ Exception -> 0x0289, all -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0136 A[Catch:{ Exception -> 0x0289, all -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0151 A[Catch:{ Exception -> 0x0289, all -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x016c A[Catch:{ Exception -> 0x0289, all -> 0x0292 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m87397c() {
        /*
            com.ss.android.ugc.aweme.discover.c.c r0 = f70191e
            if (r0 == 0) goto L_0x029c
            long r0 = f70188b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000e
            goto L_0x029c
        L_0x000e:
            r0 = 0
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            com.ss.android.ugc.aweme.discover.c.c r1 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r1 != 0) goto L_0x001a
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x001a:
            long r6 = f70188b     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r8 = 0
            long r6 = r4 - r6
            int r6 = (int) r6     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.f70181e = r6     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.<init>()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "tabType"
            com.ss.android.ugc.aweme.discover.c.c r7 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r7 != 0) goto L_0x0030
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x0030:
            int r7 = r7.f70177a     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "trigger"
            com.ss.android.ugc.aweme.discover.c.c r7 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r7 != 0) goto L_0x003e
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x003e:
            int r7 = r7.f70178b     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "displayType"
            com.ss.android.ugc.aweme.discover.c.c r7 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r7 != 0) goto L_0x004c
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x004c:
            int r7 = r7.f70179c     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "itemCount"
            com.ss.android.ugc.aweme.discover.c.c r7 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r7 != 0) goto L_0x005a
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x005a:
            int r7 = r7.f70180d     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "cost"
            com.ss.android.ugc.aweme.discover.c.c r7 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r7 != 0) goto L_0x0068
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x0068:
            int r7 = r7.f70181e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "netCost"
            com.ss.android.ugc.aweme.discover.c.c r7 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r7 != 0) goto L_0x0076
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x0076:
            int r7 = r7.f70182f     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "netLogId"
            com.ss.android.ugc.aweme.discover.c.c r7 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r7 != 0) goto L_0x0084
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x0084:
            java.lang.String r7 = r7.f70183g     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "status"
            com.ss.android.ugc.aweme.discover.c.c r7 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r7 != 0) goto L_0x0092
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x0092:
            int r7 = r7.f70184h     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "errorMsg"
            com.ss.android.ugc.aweme.discover.c.c r7 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r7 != 0) goto L_0x00a0
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x00a0:
            java.lang.String r7 = r7.f70185i     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "errorCode"
            com.ss.android.ugc.aweme.discover.c.c r7 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r7 != 0) goto L_0x00ae
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x00ae:
            int r7 = r7.f70186j     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "triggerNetStart"
            long r7 = f70189c     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "triggerStart"
            long r7 = f70188b     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            com.ss.android.ugc.aweme.app.api.g r6 = f70192f     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r6 == 0) goto L_0x022a
            com.ss.android.ugc.aweme.app.api.g r6 = f70192f     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r6 != 0) goto L_0x00cc
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x00cc:
            com.ss.android.ugc.aweme.app.api.i r6 = r6.getRequestLog()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r6 == 0) goto L_0x019c
            java.lang.String r7 = "libcore"
            com.ss.android.ugc.aweme.app.api.i$b r8 = r6.f60553a     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x00db
            java.lang.String r8 = r8.f60563a     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            goto L_0x00dc
        L_0x00db:
            r8 = r0
        L_0x00dc:
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "body_recv"
            com.ss.android.ugc.aweme.app.api.i$c r8 = r6.f60554b     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x00f6
            com.ss.android.ugc.aweme.app.api.i$a r8 = r8.f60564a     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x00f6
            java.lang.String r8 = r8.f60555a     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x00f6
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            goto L_0x00f7
        L_0x00f6:
            r8 = r0
        L_0x00f7:
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "dns"
            com.ss.android.ugc.aweme.app.api.i$c r8 = r6.f60554b     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x0111
            com.ss.android.ugc.aweme.app.api.i$a r8 = r8.f60564a     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x0111
            java.lang.String r8 = r8.f60556b     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x0111
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            goto L_0x0112
        L_0x0111:
            r8 = r0
        L_0x0112:
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "inner"
            com.ss.android.ugc.aweme.app.api.i$c r8 = r6.f60554b     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x012c
            com.ss.android.ugc.aweme.app.api.i$a r8 = r8.f60564a     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x012c
            java.lang.String r8 = r8.f60557c     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x012c
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            goto L_0x012d
        L_0x012c:
            r8 = r0
        L_0x012d:
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "rtt"
            com.ss.android.ugc.aweme.app.api.i$c r8 = r6.f60554b     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x0147
            com.ss.android.ugc.aweme.app.api.i$a r8 = r8.f60564a     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x0147
            java.lang.String r8 = r8.f60558d     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x0147
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            goto L_0x0148
        L_0x0147:
            r8 = r0
        L_0x0148:
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "send"
            com.ss.android.ugc.aweme.app.api.i$c r8 = r6.f60554b     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x0162
            com.ss.android.ugc.aweme.app.api.i$a r8 = r8.f60564a     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x0162
            java.lang.String r8 = r8.f60559e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x0162
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            goto L_0x0163
        L_0x0162:
            r8 = r0
        L_0x0163:
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "tcp"
            com.ss.android.ugc.aweme.app.api.i$c r8 = r6.f60554b     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x017d
            com.ss.android.ugc.aweme.app.api.i$a r8 = r8.f60564a     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x017d
            java.lang.String r8 = r8.f60561g     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 == 0) goto L_0x017d
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            goto L_0x017e
        L_0x017d:
            r8 = r0
        L_0x017e:
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "ttfb"
            com.ss.android.ugc.aweme.app.api.i$c r6 = r6.f60554b     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r6 == 0) goto L_0x0198
            com.ss.android.ugc.aweme.app.api.i$a r6 = r6.f60564a     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r6 == 0) goto L_0x0198
            java.lang.String r6 = r6.f60562h     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r6 == 0) goto L_0x0198
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            goto L_0x0199
        L_0x0198:
            r6 = r0
        L_0x0199:
            r1.put(r7, r6)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x019c:
            com.ss.android.ugc.aweme.app.api.g r6 = f70192f     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r6 != 0) goto L_0x01a3
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x01a3:
            com.bytedance.frameworks.baselib.network.http.a r6 = r6.getRequestInfo()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r6 == 0) goto L_0x022a
            java.lang.String r7 = "timing_total"
            long r8 = r6.f27515r     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "requestStart"
            long r8 = r6.f27502e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "appLevelRequestStart"
            long r8 = r6.f27500c     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "inner"
            int r7 = r1.optInt(r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r7 <= 0) goto L_0x020e
            long r8 = r6.f27515r     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            long r10 = (long) r7     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            long r8 = r8 - r10
            java.lang.String r7 = "triggerNetCost"
            long r10 = f70189c     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            long r12 = f70188b     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r14 = 0
            long r10 = r10 - r12
            r1.put(r7, r10)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "timing_net"
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            long r7 = r6.f27502e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            long r9 = r6.f27500c     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r11 = 0
            long r7 = r7 - r9
            java.lang.String r9 = "timing_retrofit"
            r1.put(r9, r7)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "timing_gap"
            com.ss.android.ugc.aweme.discover.c.c r8 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 != 0) goto L_0x01ee
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x01ee:
            int r8 = r8.f70182f     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            long r8 = (long) r8     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            long r10 = r6.f27515r     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r12 = 0
            long r8 = r8 - r10
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "timing_gap_start"
            long r8 = r6.f27502e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            long r10 = f70189c     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r12 = 0
            long r8 = r8 - r10
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r7 = "timing_gap_end"
            long r8 = f70190d     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            long r10 = r6.f27505h     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r12 = 0
            long r8 = r8 - r10
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x020e:
            java.lang.String r7 = "client_cost"
            com.ss.android.ugc.aweme.discover.c.c r8 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r8 != 0) goto L_0x0217
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x0217:
            int r8 = r8.f70181e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            long r8 = (long) r8     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            long r10 = r6.f27515r     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r6 = 0
            long r8 = r8 - r10
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r6 = "view_draw_cost"
            long r7 = f70190d     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r9 = 0
            long r4 = r4 - r7
            r1.put(r6, r4)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x022a:
            java.lang.String r4 = "search_trigger_refresh_monitor"
            com.p280ss.android.ugc.aweme.base.C6893q.m21447a(r4, r1)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r4 = "search_trigger_refresh_monitor"
            com.p280ss.android.common.p288d.C6759a.m20910a(r4, r1)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.<init>()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r4 = "total_cost"
            com.ss.android.ugc.aweme.discover.c.c r5 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r5 != 0) goto L_0x0242
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x0242:
            int r5 = r5.f70181e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r4, r5)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r4 = "net_cost"
            com.ss.android.ugc.aweme.discover.c.c r5 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r5 != 0) goto L_0x0250
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x0250:
            int r5 = r5.f70182f     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r1.put(r4, r5)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r4.<init>()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r5 = "tab_type"
            com.ss.android.ugc.aweme.discover.c.c r6 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r6 != 0) goto L_0x0263
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x0263:
            int r6 = r6.f70177a     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r5 = "display_type"
            com.ss.android.ugc.aweme.discover.c.c r6 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r6 != 0) goto L_0x0271
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x0271:
            int r6 = r6.f70179c     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r5 = "net_status"
            com.ss.android.ugc.aweme.discover.c.c r6 = f70191e     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            if (r6 != 0) goto L_0x027f
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x027f:
            int r6 = r6.f70184h     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
            java.lang.String r5 = "search_performance_result_show"
            com.bytedance.framwork.core.monitor.C6379c.m19828a(r5, r4, r1, r0)     // Catch:{ Exception -> 0x0289, all -> 0x0292 }
        L_0x0289:
            f70188b = r2
            f70191e = r0
            f70189c = r2
            f70192f = r0
            return
        L_0x0292:
            r1 = move-exception
            f70188b = r2
            f70191e = r0
            f70189c = r2
            f70192f = r0
            throw r1
        L_0x029c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1177c.C26612d.m87397c():void");
    }

    /* renamed from: a */
    public final C26612d mo68303a(C22832g gVar) {
        f70192f = gVar;
        return this;
    }

    /* renamed from: b */
    public final C26612d mo68307b(String str) {
        C26611c cVar = f70191e;
        if (cVar != null) {
            cVar.f70185i = str;
        }
        return this;
    }

    /* renamed from: c */
    public final C26612d mo68308c(int i) {
        C26611c cVar = f70191e;
        if (cVar != null) {
            cVar.f70180d = i;
        }
        return this;
    }

    /* renamed from: e */
    private C26612d m87398e(int i) {
        if (f70191e == null) {
            mo68302a(6);
        }
        C26611c cVar = f70191e;
        if (cVar != null) {
            cVar.f70177a = i;
        }
        return this;
    }

    /* renamed from: a */
    public final C26612d mo68304a(String str) {
        C26611c cVar = f70191e;
        if (cVar != null) {
            cVar.f70183g = str;
        }
        return this;
    }

    /* renamed from: a */
    public final C26612d mo68302a(int i) {
        f70188b = System.currentTimeMillis();
        f70189c = 0;
        C26611c cVar = new C26611c();
        f70191e = cVar;
        cVar.f70178b = i;
        return this;
    }

    /* renamed from: b */
    public final C26612d mo68306b(int i) {
        C26611c cVar = f70191e;
        if (cVar != null) {
            cVar.f70184h = i;
        }
        if (i == 0) {
            C26611c cVar2 = f70191e;
            if (cVar2 != null) {
                cVar2.f70185i = null;
            }
            C26611c cVar3 = f70191e;
            if (cVar3 != null) {
                cVar3.f70186j = 0;
            }
        } else {
            C26611c cVar4 = f70191e;
            if (cVar4 != null) {
                cVar4.f70186j = 1;
            }
        }
        return this;
    }

    /* renamed from: d */
    public final C26612d mo68309d(int i) {
        if (i == C27029ba.f71321c) {
            m87398e(2);
        } else if (i == C27029ba.f71320b) {
            m87398e(1);
        } else if (i == C27029ba.f71322d) {
            m87398e(3);
        } else if (i == C27029ba.f71323e) {
            m87398e(4);
        } else if (i == C27029ba.f71324f) {
            m87398e(5);
        } else if (i == C27029ba.f71319a) {
            m87398e(0);
        } else if (i == C27029ba.f71325g) {
            m87398e(6);
        }
        return this;
    }
}
