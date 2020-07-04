package com.p280ss.ttvideoengine.p1813f;

import android.content.Context;
import android.os.SystemClock;
import com.p280ss.ttvideoengine.TTVideoEngine;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.f.c */
public final class C46091c extends C46088a implements C46090b {

    /* renamed from: f */
    public boolean f117941f;

    /* renamed from: g */
    public boolean f117942g;

    /* renamed from: h */
    public int f117943h = 120;

    /* renamed from: i */
    private int f117944i;

    /* renamed from: j */
    private int f117945j;

    /* renamed from: k */
    private int[] f117946k = {0, 1};

    /* renamed from: l */
    private C46088a f117947l;

    /* renamed from: m */
    private Context f117948m;

    /* renamed from: n */
    private boolean f117949n;

    /* renamed from: o */
    private C46097f f117950o;

    /* renamed from: p */
    private boolean f117951p;

    /* renamed from: q */
    private boolean f117952q;

    /* renamed from: r */
    private boolean f117953r;

    /* renamed from: s */
    private JSONObject f117954s;

    /* renamed from: t */
    private long f117955t;

    /* renamed from: u */
    private long f117956u;

    /* renamed from: a */
    public final void mo112094a() {
    }

    /* renamed from: a */
    public final void mo112095a(C46117c cVar) {
    }

    /* renamed from: f */
    public final void mo112268f() {
        this.f117951p = true;
    }

    /* renamed from: c */
    public final void mo112262c() {
        if (!this.f117936b) {
            this.f117936b = true;
            if (this.f117947l != null) {
                this.f117947l.mo112262c();
            }
        }
    }

    /* renamed from: g */
    public final String mo112269g() {
        if (this.f117952q) {
            return "FromCache";
        }
        if (this.f117953r) {
            return "FromServer";
        }
        switch (this.f117946k[this.f117945j]) {
            case 0:
                return "local";
            case 1:
                return "HTTP 203.107.1.4";
            case 2:
                return "TT_HTTP";
            default:
                return "";
        }
    }

    /* renamed from: h */
    private void m144452h() {
        switch (this.f117946k[this.f117945j]) {
            case 0:
                this.f117947l = new C46099g(this.f117937c);
                break;
            case 1:
                this.f117947l = new C46094e(this.f117937c, this.f117939e, 1);
                break;
            case 2:
                this.f117947l = new C46094e(this.f117937c, this.f117939e, 2);
                break;
        }
        if (this.f117947l != null) {
            this.f117947l.f117938d = this;
            this.f117947l.mo112260b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112260b() {
        /*
            r12 = this;
            boolean r0 = r12.f117936b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r12.f117945j
            int r1 = r12.f117944i
            if (r0 < r1) goto L_0x000c
            return
        L_0x000c:
            com.p280ss.ttvideoengine.p1813f.C46092d.m144461a()
            boolean r0 = r12.f117951p
            if (r0 != 0) goto L_0x0126
            boolean r0 = r12.f117941f
            if (r0 != 0) goto L_0x001d
            boolean r0 = r12.f117942g
            if (r0 != 0) goto L_0x001d
            goto L_0x0126
        L_0x001d:
            android.content.Context r0 = r12.f117948m
            android.net.NetworkInfo r0 = com.p280ss.ttvideoengine.p1813f.C46102h.m144480a(r0)
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x0036
            boolean r3 = r0.isAvailable()
            if (r3 == 0) goto L_0x0036
            int r3 = r0.getType()
            java.lang.String r0 = r0.getExtraInfo()
            goto L_0x0038
        L_0x0036:
            r0 = r2
            r3 = -1
        L_0x0038:
            int r4 = com.p280ss.ttvideoengine.p1813f.C46097f.m144472c()
            r5 = 0
            r6 = 1
            if (r3 == r1) goto L_0x005f
            if (r3 == r4) goto L_0x004a
            long r7 = java.lang.System.currentTimeMillis()
            r12.f117956u = r7
        L_0x0048:
            r7 = 1
            goto L_0x0060
        L_0x004a:
            java.lang.String r7 = com.p280ss.ttvideoengine.p1813f.C46097f.m144473d()
            if (r0 == 0) goto L_0x005f
            if (r7 == 0) goto L_0x0058
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L_0x005f
        L_0x0058:
            long r7 = java.lang.System.currentTimeMillis()
            r12.f117956u = r7
            goto L_0x0048
        L_0x005f:
            r7 = 0
        L_0x0060:
            boolean r8 = r12.f117942g
            if (r8 == 0) goto L_0x0085
            long r8 = r12.f117956u
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r10
            long r10 = r12.f117955t
            long r8 = r8 - r10
            if (r7 == 0) goto L_0x0078
            if (r4 != r1) goto L_0x0078
            com.p280ss.ttvideoengine.p1813f.C46097f.m144471b(r0)
            com.p280ss.ttvideoengine.p1813f.C46097f.m144470a(r3)
            r7 = 0
            goto L_0x0085
        L_0x0078:
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0085
            long r8 = r12.f117955t
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0085
            r7 = 1
        L_0x0085:
            if (r7 == 0) goto L_0x0096
            com.ss.ttvideoengine.f.f r1 = r12.f117950o
            r1.mo112274b()
            com.p280ss.ttvideoengine.p1813f.C46097f.m144471b(r0)
            com.p280ss.ttvideoengine.p1813f.C46097f.m144470a(r3)
            r12.m144452h()
            return
        L_0x0096:
            boolean r0 = r12.f117942g
            if (r0 == 0) goto L_0x00df
            org.json.JSONObject r0 = r12.f117954s
            if (r0 == 0) goto L_0x00df
            org.json.JSONObject r0 = r12.f117954s
            java.lang.String r1 = r12.f117937c
            org.json.JSONArray r0 = r0.optJSONArray(r1)
            if (r0 == 0) goto L_0x00d8
            int r1 = r0.length()
            if (r1 != 0) goto L_0x00af
            goto L_0x00d8
        L_0x00af:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "ip"
            java.lang.String r0 = r0.optString(r5)     // Catch:{ Exception -> 0x00c6 }
            r1.put(r3, r0)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = "time"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00c6 }
            r1.put(r0, r3)     // Catch:{ Exception -> 0x00c6 }
        L_0x00c6:
            r12.f117953r = r6
            int r0 = r12.f117943h
            long r3 = (long) r0
            r12.m144451a(r1, r3)
            com.ss.ttvideoengine.f.b r0 = r12.f117938d
            if (r0 == 0) goto L_0x00d7
            com.ss.ttvideoengine.f.b r0 = r12.f117938d
            r0.mo112096a(r1, r2)
        L_0x00d7:
            return
        L_0x00d8:
            java.lang.String r0 = "DNSParser"
            java.lang.String r1 = "dns_info ips empty"
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r0, r1)
        L_0x00df:
            boolean r0 = r12.f117941f
            if (r0 == 0) goto L_0x0122
            com.ss.ttvideoengine.f.f r0 = r12.f117950o
            if (r0 == 0) goto L_0x00f0
            com.ss.ttvideoengine.f.f r0 = r12.f117950o
            java.lang.String r1 = r12.f117937c
            com.ss.ttvideoengine.f.f$a r0 = r0.mo112272a(r1)
            goto L_0x00f1
        L_0x00f0:
            r0 = r2
        L_0x00f1:
            if (r0 == 0) goto L_0x0122
            java.lang.String r1 = "DNSParser"
            java.lang.String r3 = "DNS from cache"
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r1, r3)
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r7 = r0.f117969b
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x0109
            r12.f117949n = r6
            r12.m144452h()
        L_0x0109:
            r12.f117952q = r6
            org.json.JSONObject r1 = r0.f117968a     // Catch:{ Exception -> 0x0116 }
            java.lang.String r3 = "time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0116 }
            r1.put(r3, r4)     // Catch:{ Exception -> 0x0116 }
        L_0x0116:
            com.ss.ttvideoengine.f.b r1 = r12.f117938d
            if (r1 == 0) goto L_0x0121
            com.ss.ttvideoengine.f.b r1 = r12.f117938d
            org.json.JSONObject r0 = r0.f117968a
            r1.mo112096a(r0, r2)
        L_0x0121:
            return
        L_0x0122:
            r12.m144452h()
            return
        L_0x0126:
            r12.m144452h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.p1813f.C46091c.mo112260b():void");
    }

    /* renamed from: a */
    public final void mo112267a(JSONObject jSONObject, Long l) {
        this.f117954s = jSONObject;
        this.f117955t = l.longValue();
    }

    /* renamed from: a */
    private void m144451a(JSONObject jSONObject, long j) {
        if (this.f117950o != null) {
            C46098a aVar = new C46098a();
            aVar.f117968a = jSONObject;
            aVar.f117969b = SystemClock.elapsedRealtime() + (j * 1000);
            this.f117950o.mo112273a(this.f117937c, aVar);
        }
    }

    /* renamed from: a */
    public final void mo112096a(JSONObject jSONObject, C46117c cVar) {
        if (this.f117936b) {
            if (!this.f117949n || this.f117951p) {
                mo112265e();
            }
        } else if (cVar == null) {
            JSONArray jSONArray = null;
            if (jSONObject != null) {
                jSONArray = jSONObject.optJSONArray("ips");
            }
            if (jSONArray == null || jSONArray.length() == 0) {
                if (this.f117946k[this.f117945j] == 0) {
                    StringBuilder sb = new StringBuilder("dns result empty,type:");
                    sb.append(this.f117946k[this.f117945j]);
                    mo112263c(new C46117c("kTTVideoErrorDomainLocalDNS", -9997, sb.toString()));
                } else {
                    StringBuilder sb2 = new StringBuilder("dns result empty,type:");
                    sb2.append(this.f117946k[this.f117945j]);
                    mo112263c(new C46117c("kTTVideoErrorDomainHTTPDNS", -9997, sb2.toString()));
                }
                C46123h.m144545a("DNSParser", "ips empty");
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ip", jSONArray.optString(0));
            } catch (Exception unused) {
            }
            long optLong = jSONObject.optLong("ttl");
            if (optLong == 0) {
                optLong = (long) this.f117943h;
            }
            m144451a(jSONObject2, optLong);
            if (!this.f117949n || this.f117951p) {
                try {
                    jSONObject2.put("time", jSONObject.optLong("time"));
                } catch (Exception e) {
                    C46123h.m144545a("DNSParser", e.toString());
                }
                mo112259a(jSONObject2);
            }
        } else if (this.f117945j == this.f117944i - 1) {
            if (!this.f117949n || this.f117951p) {
                mo112263c(cVar);
            }
        } else {
            if (!this.f117949n || this.f117951p) {
                mo112261b(cVar);
            }
            this.f117945j++;
            mo112260b();
        }
    }

    public C46091c(Context context, String str, C46106j jVar) {
        super(str, jVar);
        this.f117948m = context;
        this.f117944i = this.f117946k.length;
        int[] dNSType = TTVideoEngine.getDNSType();
        if (dNSType != null && dNSType.length > 0) {
            for (int i = 0; i < dNSType.length; i++) {
                switch (dNSType[i]) {
                    case 0:
                    case 1:
                    case 2:
                        this.f117946k[i] = dNSType[i];
                        break;
                }
            }
        } else if (TTVideoEngine.isHttpDnsFirst()) {
            this.f117946k[0] = 1;
            this.f117946k[1] = 0;
        }
        StringBuilder sb = new StringBuilder("DNSType:");
        sb.append(Arrays.toString(this.f117946k));
        C46123h.m144545a("DNSParser", sb.toString());
        this.f117950o = C46097f.m144469a();
    }
}
