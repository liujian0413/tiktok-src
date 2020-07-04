package com.bytedance.apm.p249l;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p236a.p237b.C6152a;
import com.bytedance.apm.p240d.C6186b;
import com.bytedance.apm.p241f.C6202e;
import com.bytedance.apm.p245h.C6213e;
import com.bytedance.apm.p247j.C6240a;
import com.bytedance.apm.p247j.C6242c;
import com.bytedance.apm.p249l.p250a.C6267b;
import com.bytedance.apm.p249l.p250a.C9612c;
import com.bytedance.apm.p249l.p251b.C6268c;
import com.bytedance.apm.p249l.p251b.C9614a;
import com.bytedance.apm.p249l.p251b.C9618b;
import com.bytedance.apm.p249l.p251b.C9619d;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.p252m.C6273b.C6276b;
import com.bytedance.apm.p468e.C9596a;
import com.bytedance.apm.util.C6291h;
import com.bytedance.apm.util.C6292i;
import com.bytedance.frameworks.baselib.p511a.C10076d;
import com.bytedance.frameworks.baselib.p511a.C10076d.C10078b;
import com.bytedance.frameworks.core.apm.C6348a;
import com.bytedance.frameworks.core.apm.C6360b;
import com.bytedance.frameworks.core.apm.C6363c;
import com.bytedance.frameworks.core.apm.p257a.p258a.C6354a;
import com.bytedance.framwork.core.monitor.MonitorNetUtil;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.bytedance.services.apm.api.C6478c;
import com.bytedance.services.apm.api.C6479g;
import com.bytedance.services.slardar.config.C6480a;
import com.bytedance.services.slardar.config.C6481b;
import com.bytedance.services.slardar.config.IConfigManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.c */
public final class C6269c implements C6267b, C6268c, C6276b, C6478c, C6480a {

    /* renamed from: w */
    private static final List<String> f18466w = Arrays.asList(new String[]{"timer", "count", "disk", "memory", "cpu", "fps", "traffic", "start", "page_load", "image_monitor", "api_all", "api_error", "common_log", "service_monitor", "performance_monitor", "ui_action"});

    /* renamed from: x */
    private static final List<String> f18467x = Arrays.asList(new String[]{"block_monitor", "memory_object_monitor", "drop_frame_stack"});

    /* renamed from: a */
    private volatile boolean f18468a;

    /* renamed from: b */
    private long f18469b;

    /* renamed from: c */
    private int f18470c;

    /* renamed from: d */
    private List<C6354a<? extends C6213e>> f18471d;

    /* renamed from: e */
    private volatile boolean f18472e;

    /* renamed from: f */
    private List<String> f18473f;

    /* renamed from: g */
    private List<String> f18474g;

    /* renamed from: h */
    private int f18475h;

    /* renamed from: i */
    private long f18476i;

    /* renamed from: j */
    private boolean f18477j;

    /* renamed from: k */
    private boolean f18478k;

    /* renamed from: l */
    private long f18479l;

    /* renamed from: m */
    private long f18480m;

    /* renamed from: n */
    private int f18481n;

    /* renamed from: o */
    private int f18482o;

    /* renamed from: p */
    private volatile int f18483p;

    /* renamed from: q */
    private int f18484q;

    /* renamed from: r */
    private int f18485r;

    /* renamed from: s */
    private long f18486s;

    /* renamed from: t */
    private C9614a f18487t;

    /* renamed from: u */
    private C9614a f18488u;

    /* renamed from: v */
    private final List<String> f18489v;

    /* renamed from: y */
    private List<C6481b> f18490y;

    /* renamed from: com.bytedance.apm.l.c$a */
    static final class C6272a {

        /* renamed from: a */
        public static final C6269c f18493a = new C6269c();
    }

    /* renamed from: a */
    public static C6269c m19445a() {
        return C6272a.f18493a;
    }

    /* renamed from: b */
    public final int mo15052b() {
        return this.f18484q;
    }

    /* renamed from: c */
    public final int mo15053c() {
        return this.f18485r;
    }

    /* renamed from: c */
    public final void mo14870c(Activity activity) {
    }

    /* renamed from: d */
    public final long mo15054d() {
        return this.f18476i;
    }

    /* renamed from: d */
    public final void mo14871d(Activity activity) {
    }

    /* renamed from: a */
    public final void mo15057a(C6186b bVar) {
        C10076d.m29937a((C10078b) new C10078b() {
            /* renamed from: a */
            public final boolean mo15063a(Context context) {
                return MonitorNetUtil.m19817b(context);
            }
        });
        ((IConfigManager) C6446c.m20127a(IConfigManager.class)).registerConfigListener(this);
        ActivityLifeObserver.getInstance().register(this);
        C9612c.m28450a((C6267b) this);
        m19449a(bVar.f18196b);
        m19453b(bVar.f18197c);
        C9619d.m28472a(this);
        this.f18487t = new C9614a("monitor");
        this.f18488u = new C9614a("exception");
        C9619d.m28473a("monitor", (C9618b) this.f18487t);
        C9619d.m28473a("exception", (C9618b) this.f18488u);
        this.f18486s = bVar.f18210p;
    }

    /* renamed from: a */
    public final void mo15058a(C6481b bVar) {
        if (bVar != null) {
            if (this.f18490y == null) {
                this.f18490y = new CopyOnWriteArrayList();
            }
            if (!this.f18490y.contains(bVar)) {
                this.f18490y.add(bVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo7731a(long j) {
        if (this.f18480m > 0 && j - this.f18479l > this.f18480m) {
            this.f18472e = false;
            C6202e.m19259a().f18259a = false;
            mo15060a(true, 0);
        }
        mo15059a(false);
    }

    /* renamed from: a */
    public final void mo15059a(boolean z) {
        if (this.f18468a && this.f18475h == 1 && this.f18483p >= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f18486s <= 0 || currentTimeMillis - C6174c.m19154l() >= this.f18486s * 1000) {
                long f = m19456f();
                if (f > 0) {
                    if (z || f > ((long) this.f18470c) || currentTimeMillis - this.f18469b > ((long) (this.f18483p * 1000))) {
                        if (C6174c.m19149g()) {
                            StringBuilder sb = new StringBuilder("packAndSendLog, case: count > threshold ? count -> ");
                            sb.append(f);
                            sb.append(" threshold-> ");
                            sb.append(this.f18470c);
                            sb.append(" , passedTime: ");
                            sb.append((currentTimeMillis - this.f18469b) / 1000);
                            sb.append(" 秒，interval: ");
                            sb.append(this.f18483p);
                            String[] strArr = {sb.toString()};
                        }
                        this.f18469b = currentTimeMillis;
                        for (String str : this.f18489v) {
                            m19448a(str, m19452b(str), this.f18470c);
                        }
                    }
                    return;
                }
                return;
            }
            this.f18486s = -1;
        }
    }

    /* renamed from: a */
    public final void mo15060a(boolean z, long j) {
        this.f18468a = z;
        if (!z) {
            this.f18479l = System.currentTimeMillis();
            this.f18480m = j;
        }
    }

    /* renamed from: a */
    public final void mo14861a(Activity activity) {
        this.f18483p = this.f18482o;
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                C6269c.this.mo15059a(true);
            }
        });
    }

    public final void onReady() {
        C6273b.m19475a().mo15065a((C6276b) this);
    }

    /* renamed from: e */
    public final boolean mo15055e() {
        if (this.f18472e) {
            return this.f18472e;
        }
        return this.f18477j;
    }

    private C6269c() {
        this.f18468a = true;
        this.f18470c = 100;
        this.f18473f = C9596a.f26221d;
        this.f18474g = C9596a.f26224g;
        this.f18475h = 1;
        this.f18478k = true;
        this.f18489v = Arrays.asList(new String[]{"monitor", "exception"});
        try {
            this.f18471d = C6360b.m19768a().f18642a;
        } catch (SQLiteDatabaseLockedException e) {
            C2077a.m9161a((Throwable) e, "apm_LogReportManager");
        }
    }

    /* renamed from: f */
    private long m19456f() {
        Iterator it = this.f18471d.iterator();
        long j = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            C6354a aVar = (C6354a) it.next();
            if (aVar != null) {
                j += aVar.mo15260f();
            }
        }
        if (C6174c.m19149g()) {
            StringBuilder sb = new StringBuilder("getLogSampledCount: ");
            sb.append(j);
            String[] strArr = {sb.toString()};
        }
        return j;
    }

    /* renamed from: b */
    public final void mo14864b(Activity activity) {
        this.f18483p = this.f18481n;
    }

    /* renamed from: a */
    private void m19449a(List<String> list) {
        if (!C6292i.m19525a(list)) {
            this.f18473f = list;
        }
    }

    /* renamed from: b */
    private void m19453b(List<String> list) {
        if (!C6292i.m19525a(list)) {
            this.f18474g = list;
        }
    }

    /* renamed from: a */
    private void m19450a(JSONObject jSONObject) {
        if (this.f18490y != null) {
            Iterator it = this.f18490y.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: b */
    private static List<String> m19452b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "monitor")) {
            return f18466w;
        }
        if (TextUtils.equals(str, "exception")) {
            return f18467x;
        }
        return null;
    }

    /* renamed from: a */
    private static List<String> m19447a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList(2);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string) && string.indexOf(46) > 0) {
                            arrayList.add(string);
                        }
                    }
                    return arrayList;
                }
            } catch (JSONException unused) {
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: b */
    private void m19454b(JSONObject jSONObject) {
        if (jSONObject.length() > 0) {
            JSONObject optJSONObject = jSONObject.optJSONObject("configs");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                m19450a(optJSONObject);
            }
        }
    }

    /* renamed from: b */
    public final void mo15061b(C6186b bVar) {
        m19449a(bVar.f18196b);
        m19453b(bVar.f18197c);
        if (this.f18487t != null) {
            this.f18487t.mo23960a();
        }
        if (this.f18488u != null) {
            this.f18488u.mo23960a();
        }
    }

    /* renamed from: c */
    private static int m19455c(List<? extends C6213e> list) {
        int i;
        if (C6292i.m19525a(list)) {
            return -1;
        }
        if (C6174c.m19149g()) {
            StringBuilder sb = new StringBuilder("need deleteUploadedLogs count: ");
            sb.append(list.size());
            String[] strArr = {sb.toString()};
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (C6213e eVar : list) {
            if (eVar != null) {
                if (TextUtils.equals(eVar.f18294g, "api_all")) {
                    linkedList.add(Long.valueOf(eVar.f18293f));
                } else {
                    linkedList2.add(Long.valueOf(eVar.f18293f));
                }
            }
        }
        if (!linkedList2.isEmpty()) {
            i = C6360b.m19768a().mo15267a("", linkedList2) + 0;
        } else {
            i = 0;
        }
        if (!linkedList.isEmpty()) {
            i += C6360b.m19768a().mo15267a("api_all", linkedList);
        }
        if (C6174c.m19149g()) {
            StringBuilder sb2 = new StringBuilder("finish deleteUploadedLogs count: ");
            sb2.append(i);
            String[] strArr2 = {sb2.toString()};
        }
        C6363c.m19777a();
        return i;
    }

    /* renamed from: b */
    public final void mo15062b(C6481b bVar) {
        if (!(bVar == null || this.f18490y == null)) {
            this.f18490y.remove(bVar);
        }
    }

    /* renamed from: a */
    public final List<String> mo15051a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "monitor")) {
            return this.f18473f;
        }
        if (TextUtils.equals(str, "exception")) {
            return this.f18474g;
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    private List<C6213e> m19446a(List<String> list, int i) {
        if (this.f18471d == null) {
            C2077a.m9159a("apm_getLogSampled");
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f18471d.iterator();
        if (it == null) {
            return Collections.emptyList();
        }
        int i2 = i;
        while (it.hasNext()) {
            C6354a aVar = (C6354a) it.next();
            if (aVar != null) {
                List a = aVar.mo15256a(list, i2);
                if (!C6292i.m19525a(a)) {
                    linkedList.addAll(a);
                    if (linkedList.size() >= i) {
                        return linkedList;
                    }
                    i2 = i - linkedList.size();
                } else {
                    continue;
                }
            }
        }
        return linkedList;
    }

    public final void onRefresh(JSONObject jSONObject, boolean z) {
        List<String> a = m19447a(jSONObject.optJSONArray("report_host_new"));
        if (!C6292i.m19525a(a)) {
            this.f18473f = a;
            C6479g gVar = new C6479g();
            gVar.f18799a = this.f18473f;
            ApmDelegate.getInstance().notifyPluginsParams(gVar);
            try {
                String host = new URL((String) this.f18473f.get(0)).getHost();
                C6265a.m19435a(host);
                C6152a.m19097a(host);
            } catch (MalformedURLException unused) {
            }
        }
        List<String> a2 = m19447a(jSONObject.optJSONArray("report_exception_host"));
        if (!C6292i.m19525a(a2)) {
            this.f18474g = a2;
            C2077a.m9165b((String) this.f18474g.get(0));
        }
        int optInt = jSONObject.optInt("polling_interval", 120);
        if (optInt <= 0) {
            optInt = 120;
        }
        this.f18481n = optInt;
        this.f18482o = jSONObject.optInt("polling_interval_background", this.f18481n);
        this.f18483p = this.f18481n;
        int optInt2 = jSONObject.optInt("once_max_count", 100);
        if (optInt2 <= 0) {
            optInt2 = 100;
        }
        this.f18470c = optInt2;
        this.f18484q = jSONObject.optInt("max_retry_count", 4);
        this.f18485r = jSONObject.optInt("report_fail_base_time", 15);
        this.f18476i = jSONObject.optLong("more_channel_stop_interval", 600);
        this.f18477j = jSONObject.optBoolean("log_remvove_switch", false);
        this.f18478k = jSONObject.optBoolean("monitor_encrypt_switch", true);
        this.f18475h = jSONObject.optInt("log_send_switch", 1);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[ExcHandler: IOException | Exception | JSONException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:12:0x003b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.apm.p249l.p251b.C9620e mo15056a(java.lang.String r3, byte[] r4) {
        /*
            r2 = this;
            com.bytedance.apm.l.b.e r0 = new com.bytedance.apm.l.b.e
            r0.<init>()
            if (r4 == 0) goto L_0x005a
            int r1 = r4.length
            if (r1 != 0) goto L_0x000b
            goto L_0x005a
        L_0x000b:
            com.bytedance.apm.l.d r1 = new com.bytedance.apm.l.d     // Catch:{  }
            r1.<init>(r3, r4)     // Catch:{  }
            boolean r3 = r2.f18478k     // Catch:{  }
            com.bytedance.apm.impl.a r3 = r1.mo23974a(r3)     // Catch:{  }
            java.lang.String r4 = r3.f26302a     // Catch:{  }
            byte[] r1 = r3.f26304c     // Catch:{  }
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f26303b     // Catch:{  }
            com.bytedance.services.apm.api.b r3 = com.bytedance.apm.C6174c.m19131a(r4, r1, r3)     // Catch:{  }
            if (r3 != 0) goto L_0x0023
            return r0
        L_0x0023:
            int r4 = r3.f18797a     // Catch:{  }
            r0.f26316a = r4     // Catch:{  }
            int r4 = r3.f18797a     // Catch:{  }
            r1 = 200(0xc8, float:2.8E-43)
            if (r4 != r1) goto L_0x0058
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{  }
            java.lang.String r1 = new java.lang.String     // Catch:{  }
            byte[] r3 = r3.f18798b     // Catch:{  }
            r1.<init>(r3)     // Catch:{  }
            r4.<init>(r1)     // Catch:{  }
            java.lang.String r3 = "data"
            java.lang.String r3 = r4.optString(r3)     // Catch:{ IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059 }
            boolean r1 = r3.isEmpty()     // Catch:{ IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059 }
            if (r1 != 0) goto L_0x0052
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059 }
            byte[] r3 = r3.getBytes()     // Catch:{ IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059 }
            java.lang.String r3 = com.bytedance.apm.util.C9641d.m28529a(r3)     // Catch:{ IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059 }
            r4.<init>(r3)     // Catch:{ IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059 }
        L_0x0052:
            r2.m19454b(r4)     // Catch:{ IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059 }
            r0.f26317b = r4     // Catch:{ IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059, IOException | Exception | JSONException -> 0x0059 }
            goto L_0x0059
        L_0x0058:
            return r0
        L_0x0059:
            return r0
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p249l.C6269c.mo15056a(java.lang.String, byte[]):com.bytedance.apm.l.b.e");
    }

    /* renamed from: a */
    private void m19448a(String str, List<String> list, int i) {
        List<C6213e> a = m19446a(list, i);
        if (!C6292i.m19525a(a)) {
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                LinkedList linkedList = new LinkedList();
                JSONArray jSONArray3 = jSONArray;
                JSONArray jSONArray4 = jSONArray2;
                long j = -1;
                for (C6213e eVar : a) {
                    if (j == -1) {
                        j = eVar.f18297j;
                    } else if (eVar.f18297j != j) {
                        if (m19451a(str, jSONArray3, jSONArray4, j, false)) {
                            m19455c((List<? extends C6213e>) linkedList);
                            linkedList.clear();
                        }
                        long j2 = eVar.f18297j;
                        JSONArray jSONArray5 = new JSONArray();
                        jSONArray4 = new JSONArray();
                        j = j2;
                        jSONArray3 = jSONArray5;
                    }
                    long j3 = eVar.f18293f;
                    String str2 = eVar.f18294g;
                    linkedList.add(eVar);
                    try {
                        JSONObject jSONObject = eVar.f18296i;
                        char c = 65535;
                        if (str2.hashCode() == 110364485) {
                            if (str2.equals("timer")) {
                                c = 0;
                            }
                        }
                        if (c != 0) {
                            jSONObject.put("log_id", j3);
                            jSONObject.put("d_s_t", System.currentTimeMillis());
                            jSONArray3.put(jSONObject);
                        } else {
                            jSONArray4.put(jSONObject);
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (m19451a(str, jSONArray3, jSONArray4, j, false)) {
                    m19455c((List<? extends C6213e>) linkedList);
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m19451a(String str, JSONArray jSONArray, JSONArray jSONArray2, long j, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (C6291h.m19521b(jSONArray)) {
                jSONObject.put("data", jSONArray);
            }
            if (C6291h.m19521b(jSONArray2)) {
                jSONObject.put("timer", jSONArray2);
            }
            if (C6291h.m19522b(jSONObject)) {
                return false;
            }
            if (C6174c.m19152j() == null) {
                return true;
            }
            JSONObject a = C9613b.m28454a(new JSONObject(C6174c.m19152j().toString()), C6348a.m19690a().mo15234a(j));
            a.put("current_update_version_code", C6174c.m19152j().optString("update_version_code"));
            a.put("debug_fetch", 0);
            if (C6174c.m19153k() != null) {
                a.put("uid", C6174c.m19153k().mo14887c());
            }
            jSONObject.put("header", a);
            if (C6174c.m19149g()) {
                C6242c.m19340a(C6240a.f18364i, "report", jSONObject.toString());
            }
            return C9619d.m28474a(str, jSONObject.toString());
        } catch (Exception unused) {
            return false;
        }
    }
}
