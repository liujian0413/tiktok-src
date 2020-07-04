package com.bytedance.apm.p248k;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p241f.p243b.C9600e;
import com.bytedance.apm.p245h.C6212a;
import com.bytedance.apm.p245h.C9606g;
import com.bytedance.apm.p245h.C9608i;
import com.bytedance.apm.p245h.C9609j;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.util.C9656t;
import com.bytedance.frameworks.core.apm.C6360b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.d */
public final class C6249d extends C6244a {

    /* renamed from: a */
    public int f18385a;

    /* renamed from: d */
    public int f18386d;

    /* renamed from: e */
    public int f18387e;

    /* renamed from: f */
    public int f18388f;

    /* renamed from: g */
    public final Context f18389g = C6174c.m19129a();

    /* renamed from: h */
    public volatile long f18390h = -1;

    /* renamed from: i */
    public volatile C9608i f18391i;

    /* renamed from: j */
    public C9608i f18392j;

    /* renamed from: k */
    public List<C9609j> f18393k;

    /* renamed from: l */
    public List<C9609j> f18394l;

    /* renamed from: m */
    private boolean f18395m = true;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo14865c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo14866d() {
        return 600000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14862a(JSONObject jSONObject) {
        this.f18387e = jSONObject.optInt("front_minute_limit", 80);
        this.f18388f = jSONObject.optInt("back_minute_limit", 70);
        this.f18395m = jSONObject.optBoolean("enable_exception_traffic", true);
        this.f18385a = jSONObject.optInt("traffic_monitor_warn_threshold", 800);
        this.f18386d = jSONObject.optInt("traffic_monitor_warn_threshold_mobile", 650);
    }

    /* renamed from: a */
    public final boolean mo15031a() {
        if (!C9656t.m28554a() || !this.f18395m) {
            return false;
        }
        if (this.f18390h == -1) {
            this.f18390h = System.currentTimeMillis();
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f18390h;
        if (currentTimeMillis >= 120000 && currentTimeMillis <= 600000) {
            return true;
        }
        this.f18390h = System.currentTimeMillis();
        return false;
    }

    /* renamed from: j */
    private void m19374j() {
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                long a = C9656t.m28551a(C6249d.this.f18389g, System.currentTimeMillis() - 600000, System.currentTimeMillis(), 1);
                long a2 = C9656t.m28551a(C6249d.this.f18389g, System.currentTimeMillis() - 600000, System.currentTimeMillis(), 0);
                long j = a + a2;
                C6249d.this.f18392j = C9656t.m28555b();
                if (C6249d.this.f18392j != null) {
                    C6249d.this.f18394l = C6249d.this.f18392j.mo23955a();
                }
                if (j > ((long) C6249d.this.f18385a) * 1048576 || a2 > ((long) C6249d.this.f18386d) * 1048576) {
                    C6249d.this.mo15032i();
                }
                C6249d.this.f18391i = C6249d.this.f18392j;
                C6249d.this.f18393k = C6249d.this.f18394l;
            }
        });
    }

    /* renamed from: i */
    public final void mo15032i() {
        mo15030a(m19375k(), (JSONObject) null);
    }

    /* renamed from: k */
    private List<C9606g> m19375k() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(8);
        for (C9609j jVar : this.f18394l) {
            Iterator it = this.f18393k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9609j jVar2 = (C9609j) it.next();
                if (m19373a(jVar, jVar2)) {
                    m19372a((List<C9606g>) arrayList, jVar, jVar2, currentTimeMillis);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final void mo14867e() {
        if (C9656t.m28554a() && this.f18395m) {
            if (this.f18391i == null) {
                C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                    public final void run() {
                        C6249d.this.f18391i = C9656t.m28555b();
                        if (C6249d.this.f18391i != null) {
                            C6249d.this.f18393k = C6249d.this.f18391i.mo23955a();
                        }
                    }
                });
            } else {
                m19374j();
            }
        }
    }

    /* renamed from: a */
    public final void mo14861a(Activity activity) {
        super.mo14861a(activity);
        m19370a(activity, true);
    }

    /* renamed from: b */
    public final void mo14864b(Activity activity) {
        super.mo14864b(activity);
        m19370a(activity, false);
    }

    /* renamed from: a */
    private void m19370a(final Activity activity, final boolean z) {
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                int i;
                if (C6249d.this.mo15031a()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long currentTimeMillis2 = System.currentTimeMillis() - C6249d.this.f18390h;
                    long a = C9656t.m28551a(activity, C6249d.this.f18390h, System.currentTimeMillis(), 1);
                    long a2 = C9656t.m28551a(activity, C6249d.this.f18390h, System.currentTimeMillis(), 0);
                    long j = (currentTimeMillis2 / 60000) + 1;
                    long j2 = (a + a2) / 1048576;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("currentTime", currentTimeMillis);
                        jSONObject.put("lastRecordTime", C6249d.this.f18390h);
                        jSONObject.put("netStatsWifi", a);
                        jSONObject.put("netStatsCell", a2);
                        jSONObject.put("currentThreadId", Thread.currentThread().getId());
                    } catch (JSONException unused) {
                    }
                    if (z) {
                        i = C6249d.this.f18387e;
                    } else {
                        i = C6249d.this.f18388f;
                    }
                    if (j2 > j * ((long) i)) {
                        C6249d.this.mo15030a(C6249d.this.mo15029a(z, currentTimeMillis, a, a2), jSONObject);
                    }
                    C6249d.this.f18390h = System.currentTimeMillis();
                }
            }
        });
    }

    /* renamed from: a */
    private static boolean m19373a(C9609j jVar, C9609j jVar2) {
        if (jVar.f26299e == jVar2.f26299e && jVar.f26297c == jVar2.f26297c && jVar.f26298d == jVar2.f26298d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo15030a(List<C9606g> list, JSONObject jSONObject) {
        long j;
        long j2 = 0;
        long j3 = 0;
        long j4 = Long.MAX_VALUE;
        for (C9606g gVar : list) {
            if (gVar.f26299e == 0) {
                j2 += gVar.f26296b;
            }
            if (j4 > gVar.mo23953a()) {
                j4 = gVar.mo23953a();
            }
            if (j3 < gVar.f26281a) {
                j3 = gVar.f26281a;
            }
        }
        if (j4 == Long.MAX_VALUE || System.currentTimeMillis() - j4 > 900000) {
            j = System.currentTimeMillis() - 600000;
        } else {
            j = j4;
        }
        int i = 2;
        m19369a(2, j2, j, j3);
        for (C9606g a : list) {
            i = m19368a(i, a, jSONObject);
        }
    }

    /* renamed from: a */
    private static void m19371a(ContentValues contentValues, String str, String[] strArr) {
        C6360b.m19768a().mo15268a(C6212a.class).mo15236a(contentValues, str, strArr);
    }

    /* renamed from: a */
    private static int m19368a(int i, C9606g gVar, JSONObject jSONObject) {
        try {
            if (gVar.f26296b == 0) {
                return i;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", gVar.f26296b);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("send", gVar.f26298d);
            jSONObject3.put("network_type", gVar.f26297c);
            jSONObject3.put("front", gVar.f26299e);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("sid", gVar.f26301g);
            jSONObject4.put("start_time", gVar.mo23953a());
            jSONObject4.put("end_time", gVar.f26281a);
            jSONObject4.put("timestamp", gVar.f26281a);
            jSONObject4.put("hit_rules", i);
            if (jSONObject != null) {
                jSONObject4.put("debug_values", jSONObject);
            }
            boolean z = false;
            if (ApmDelegate.getInstance().getServiceNameSwitch("smart_traffic")) {
                i |= 4;
            }
            if ((i & 2) > 0) {
                z = true;
            }
            C9600e eVar = new C9600e();
            eVar.mo23944a("smart_traffic").mo23946a(z).mo23945a(jSONObject2).mo23948b(jSONObject3).mo23949c(jSONObject4);
            m19342a(eVar);
            return i;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m19372a(List<C9606g> list, C9609j jVar, C9609j jVar2, long j) {
        C9609j jVar3 = jVar;
        C9609j jVar4 = jVar2;
        C9606g gVar = new C9606g(jVar3.f26296b - jVar4.f26296b, jVar3.f26299e, jVar3.f26297c, jVar3.f26298d, jVar4.f26300f, jVar3.f26300f, j);
        List<C9606g> list2 = list;
        list.add(gVar);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0041 A[Catch:{ Exception -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0059 A[Catch:{ Exception -> 0x0076 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19369a(int r5, long r6, long r8, long r10) {
        /*
            r4 = this;
            r5 = 2
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001f }
            r0.<init>()     // Catch:{ JSONException -> 0x001f }
            java.lang.String r1 = "value"
            r0.put(r1, r6)     // Catch:{ JSONException -> 0x001f }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x001f }
            r6.<init>()     // Catch:{ JSONException -> 0x001f }
            java.lang.String r7 = "start_time"
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x001f }
            java.lang.String r7 = "end_time"
            r6.put(r7, r10)     // Catch:{ JSONException -> 0x001f }
            java.lang.String r7 = "traffic_warn"
            com.bytedance.apm.C6159b.m19103a(r7, r5, r0, r6)     // Catch:{ JSONException -> 0x001f }
        L_0x001f:
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ Exception -> 0x0076 }
            r6.<init>()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r7 = "is_sampled"
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0076 }
            r6.put(r7, r1)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r7 = "hit_rules"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0076 }
            r6.put(r7, r1)     // Catch:{ Exception -> 0x0076 }
            android.content.Context r7 = r4.f18389g     // Catch:{ Exception -> 0x0076 }
            boolean r7 = com.bytedance.apm.util.C6294k.m19532d(r7)     // Catch:{ Exception -> 0x0076 }
            r1 = 0
            r2 = 3
            if (r7 == 0) goto L_0x0059
            java.lang.String r7 = "timestamp > ? AND timestamp < ? AND is_sampled = ?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0076 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0076 }
            r2[r1] = r8     // Catch:{ Exception -> 0x0076 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0076 }
            r2[r0] = r8     // Catch:{ Exception -> 0x0076 }
            java.lang.String r8 = "0"
            r2[r5] = r8     // Catch:{ Exception -> 0x0076 }
            m19371a(r6, r7, r2)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0076
        L_0x0059:
            java.lang.String r7 = "timestamp > ? AND timestamp < ? AND front = ? AND is_sampled = ?"
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0076 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0076 }
            r3[r1] = r8     // Catch:{ Exception -> 0x0076 }
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x0076 }
            r3[r0] = r8     // Catch:{ Exception -> 0x0076 }
            java.lang.String r8 = "0"
            r3[r5] = r8     // Catch:{ Exception -> 0x0076 }
            java.lang.String r5 = "0"
            r3[r2] = r5     // Catch:{ Exception -> 0x0076 }
            m19371a(r6, r7, r3)     // Catch:{ Exception -> 0x0076 }
            return
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p248k.C6249d.m19369a(int, long, long, long):void");
    }

    /* renamed from: a */
    public final List<C9606g> mo15029a(boolean z, long j, long j2, long j3) {
        ArrayList arrayList = new ArrayList(2);
        C9606g gVar = new C9606g(j2, z ? 1 : 0, 1, 0, this.f18390h, j, j);
        C9606g gVar2 = new C9606g(j3, z ? 1 : 0, 0, 0, this.f18390h, j, j);
        arrayList.add(gVar);
        arrayList.add(gVar2);
        return arrayList;
    }
}
