package com.p280ss.android.ugc.aweme.discover.p1177c;

import com.p280ss.android.ugc.aweme.app.api.C22832g;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.c.b */
public final class C26610b {

    /* renamed from: a */
    public static final C26610b f70175a = new C26610b();

    /* renamed from: b */
    private static C26609a f70176b;

    private C26610b() {
    }

    /* renamed from: a */
    public final C26610b mo68293a() {
        C26609a aVar = new C26609a();
        f70176b = aVar;
        aVar.f70167a = System.currentTimeMillis();
        return this;
    }

    /* renamed from: b */
    public final C26610b mo68297b() {
        C26609a aVar = f70176b;
        if (aVar != null) {
            aVar.f70168b = System.currentTimeMillis();
        }
        return this;
    }

    /* renamed from: c */
    public final C26610b mo68299c() {
        long j;
        if (f70176b != null) {
            C26609a aVar = f70176b;
            if (aVar == null) {
                C7573i.m23580a();
            }
            if (aVar.f70168b != 0) {
                C26609a aVar2 = f70176b;
                if (aVar2 == null) {
                    C7573i.m23580a();
                }
                j = aVar2.f70168b;
            } else {
                C26609a aVar3 = f70176b;
                if (aVar3 == null) {
                    C7573i.m23580a();
                }
                j = aVar3.f70167a;
            }
            C26609a aVar4 = f70176b;
            if (aVar4 == null) {
                C7573i.m23580a();
            }
            aVar4.f70169c = (int) (System.currentTimeMillis() - j);
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0165  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m87389d() {
        /*
            com.ss.android.ugc.aweme.discover.c.a r0 = f70176b
            if (r0 == 0) goto L_0x01b0
            com.ss.android.ugc.aweme.discover.c.a r0 = f70176b
            if (r0 != 0) goto L_0x000b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x000b:
            long r0 = r0.f70167a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0015
            goto L_0x01b0
        L_0x0015:
            long r0 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.discover.c.a r2 = f70176b
            if (r2 != 0) goto L_0x0020
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0020:
            long r2 = r2.f70167a
            long r0 = r0 - r2
            int r0 = (int) r0
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "cost"
            r1.put(r2, r0)
            java.lang.String r0 = "netCost"
            com.ss.android.ugc.aweme.discover.c.a r2 = f70176b
            if (r2 != 0) goto L_0x0037
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0037:
            int r2 = r2.f70169c
            r1.put(r0, r2)
            java.lang.String r0 = "netLogId"
            com.ss.android.ugc.aweme.discover.c.a r2 = f70176b
            if (r2 != 0) goto L_0x0045
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0045:
            java.lang.String r2 = r2.f70170d
            r1.put(r0, r2)
            java.lang.String r0 = "status"
            com.ss.android.ugc.aweme.discover.c.a r2 = f70176b
            if (r2 != 0) goto L_0x0053
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0053:
            int r2 = r2.f70171e
            r1.put(r0, r2)
            java.lang.String r0 = "errorMsg"
            com.ss.android.ugc.aweme.discover.c.a r2 = f70176b
            if (r2 != 0) goto L_0x0061
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0061:
            java.lang.String r2 = r2.f70173g
            r1.put(r0, r2)
            java.lang.String r0 = "triggerNetStart"
            com.ss.android.ugc.aweme.discover.c.a r2 = f70176b
            if (r2 != 0) goto L_0x006f
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x006f:
            long r2 = r2.f70168b
            r1.put(r0, r2)
            java.lang.String r0 = "triggerStart"
            com.ss.android.ugc.aweme.discover.c.a r2 = f70176b
            if (r2 != 0) goto L_0x007d
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x007d:
            long r2 = r2.f70167a
            r1.put(r0, r2)
            java.lang.String r0 = "itemCount"
            com.ss.android.ugc.aweme.discover.c.a r2 = f70176b
            if (r2 != 0) goto L_0x008b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x008b:
            int r2 = r2.f70172f
            r1.put(r0, r2)
            com.ss.android.ugc.aweme.discover.c.a r0 = f70176b
            if (r0 != 0) goto L_0x0097
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0097:
            com.ss.android.ugc.aweme.app.api.g r0 = r0.f70174h
            r2 = 0
            if (r0 == 0) goto L_0x01a3
            com.ss.android.ugc.aweme.discover.c.a r0 = f70176b
            if (r0 != 0) goto L_0x00a3
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00a3:
            com.ss.android.ugc.aweme.app.api.g r0 = r0.f70174h
            if (r0 != 0) goto L_0x00aa
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00aa:
            com.ss.android.ugc.aweme.app.api.i r0 = r0.getRequestLog()
            if (r0 == 0) goto L_0x017a
            java.lang.String r3 = "libcore"
            com.ss.android.ugc.aweme.app.api.i$b r4 = r0.f60553a
            if (r4 == 0) goto L_0x00b9
            java.lang.String r4 = r4.f60563a
            goto L_0x00ba
        L_0x00b9:
            r4 = r2
        L_0x00ba:
            r1.put(r3, r4)
            java.lang.String r3 = "body_recv"
            com.ss.android.ugc.aweme.app.api.i$c r4 = r0.f60554b
            if (r4 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.app.api.i$a r4 = r4.f60564a
            if (r4 == 0) goto L_0x00d4
            java.lang.String r4 = r4.f60555a
            if (r4 == 0) goto L_0x00d4
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x00d5
        L_0x00d4:
            r4 = r2
        L_0x00d5:
            r1.put(r3, r4)
            java.lang.String r3 = "dns"
            com.ss.android.ugc.aweme.app.api.i$c r4 = r0.f60554b
            if (r4 == 0) goto L_0x00ef
            com.ss.android.ugc.aweme.app.api.i$a r4 = r4.f60564a
            if (r4 == 0) goto L_0x00ef
            java.lang.String r4 = r4.f60556b
            if (r4 == 0) goto L_0x00ef
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x00f0
        L_0x00ef:
            r4 = r2
        L_0x00f0:
            r1.put(r3, r4)
            java.lang.String r3 = "inner"
            com.ss.android.ugc.aweme.app.api.i$c r4 = r0.f60554b
            if (r4 == 0) goto L_0x010a
            com.ss.android.ugc.aweme.app.api.i$a r4 = r4.f60564a
            if (r4 == 0) goto L_0x010a
            java.lang.String r4 = r4.f60557c
            if (r4 == 0) goto L_0x010a
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x010b
        L_0x010a:
            r4 = r2
        L_0x010b:
            r1.put(r3, r4)
            java.lang.String r3 = "rtt"
            com.ss.android.ugc.aweme.app.api.i$c r4 = r0.f60554b
            if (r4 == 0) goto L_0x0125
            com.ss.android.ugc.aweme.app.api.i$a r4 = r4.f60564a
            if (r4 == 0) goto L_0x0125
            java.lang.String r4 = r4.f60558d
            if (r4 == 0) goto L_0x0125
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0126
        L_0x0125:
            r4 = r2
        L_0x0126:
            r1.put(r3, r4)
            java.lang.String r3 = "send"
            com.ss.android.ugc.aweme.app.api.i$c r4 = r0.f60554b
            if (r4 == 0) goto L_0x0140
            com.ss.android.ugc.aweme.app.api.i$a r4 = r4.f60564a
            if (r4 == 0) goto L_0x0140
            java.lang.String r4 = r4.f60559e
            if (r4 == 0) goto L_0x0140
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0141
        L_0x0140:
            r4 = r2
        L_0x0141:
            r1.put(r3, r4)
            java.lang.String r3 = "tcp"
            com.ss.android.ugc.aweme.app.api.i$c r4 = r0.f60554b
            if (r4 == 0) goto L_0x015b
            com.ss.android.ugc.aweme.app.api.i$a r4 = r4.f60564a
            if (r4 == 0) goto L_0x015b
            java.lang.String r4 = r4.f60561g
            if (r4 == 0) goto L_0x015b
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x015c
        L_0x015b:
            r4 = r2
        L_0x015c:
            r1.put(r3, r4)
            java.lang.String r3 = "ttfb"
            com.ss.android.ugc.aweme.app.api.i$c r0 = r0.f60554b
            if (r0 == 0) goto L_0x0176
            com.ss.android.ugc.aweme.app.api.i$a r0 = r0.f60564a
            if (r0 == 0) goto L_0x0176
            java.lang.String r0 = r0.f60562h
            if (r0 == 0) goto L_0x0176
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0177
        L_0x0176:
            r0 = r2
        L_0x0177:
            r1.put(r3, r0)
        L_0x017a:
            com.ss.android.ugc.aweme.discover.c.a r0 = f70176b
            if (r0 != 0) goto L_0x0181
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0181:
            com.ss.android.ugc.aweme.app.api.g r0 = r0.f70174h
            if (r0 != 0) goto L_0x0188
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0188:
            com.bytedance.frameworks.baselib.network.http.a r0 = r0.getRequestInfo()
            if (r0 == 0) goto L_0x01a3
            java.lang.String r3 = "timing_total"
            long r4 = r0.f27515r
            r1.put(r3, r4)
            java.lang.String r3 = "requestStart"
            long r4 = r0.f27502e
            r1.put(r3, r4)
            java.lang.String r3 = "appLevelRequestStart"
            long r4 = r0.f27500c
            r1.put(r3, r4)
        L_0x01a3:
            java.lang.String r0 = "search_intermediate_show_monitor"
            com.p280ss.android.ugc.aweme.base.C6893q.m21447a(r0, r1)
            java.lang.String r0 = "search_intermediate_show_monitor"
            com.p280ss.android.common.p288d.C6759a.m20910a(r0, r1)
            f70176b = r2
            return
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1177c.C26610b.m87389d():void");
    }

    /* renamed from: a */
    public final C26610b mo68294a(int i) {
        C26609a aVar = f70176b;
        if (aVar != null) {
            aVar.f70171e = i;
        }
        return this;
    }

    /* renamed from: b */
    public final C26610b mo68298b(String str) {
        C26609a aVar = f70176b;
        if (aVar != null) {
            aVar.f70173g = str;
        }
        return this;
    }

    /* renamed from: a */
    public final C26610b mo68295a(C22832g gVar) {
        C26609a aVar = f70176b;
        if (aVar != null) {
            aVar.f70174h = gVar;
        }
        return this;
    }

    /* renamed from: a */
    public final C26610b mo68296a(String str) {
        C26609a aVar = f70176b;
        if (aVar != null) {
            aVar.f70170d = str;
        }
        return this;
    }
}
