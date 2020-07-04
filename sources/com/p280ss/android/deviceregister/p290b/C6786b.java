package com.p280ss.android.deviceregister.p290b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.CommonHttpException;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.deviceregister.C6789d.C6790a;
import com.p280ss.android.deviceregister.C6792f;
import com.p280ss.android.deviceregister.p289a.C6778a;
import com.p280ss.android.deviceregister.p289a.C6779b;
import com.p280ss.android.deviceregister.p289a.C6780c;
import com.p280ss.android.deviceregister.p289a.C6781d;
import com.p280ss.android.deviceregister.p290b.p291a.C6784a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.b.b */
public final class C6786b {

    /* renamed from: a */
    public static C6779b f19328a;

    /* renamed from: b */
    public static final Object f19329b = new Object();

    /* renamed from: d */
    public static final Bundle f19330d = new Bundle();

    /* renamed from: e */
    public static volatile boolean f19331e = false;

    /* renamed from: f */
    public static volatile boolean f19332f = false;

    /* renamed from: l */
    public static long f19333l = 0;

    /* renamed from: q */
    public static volatile boolean f19334q = false;

    /* renamed from: s */
    public static final ThreadLocal<Boolean> f19335s = new ThreadLocal<>();

    /* renamed from: t */
    public static boolean f19336t = false;

    /* renamed from: u */
    private static C6780c f19337u;

    /* renamed from: w */
    private static List<WeakReference<C6790a>> f19338w = new ArrayList();

    /* renamed from: c */
    public final Object f19339c = new Object();

    /* renamed from: g */
    public int f19340g;

    /* renamed from: h */
    public final C6784a f19341h;

    /* renamed from: i */
    public final Context f19342i;

    /* renamed from: j */
    public final SharedPreferences f19343j;

    /* renamed from: k */
    public JSONObject f19344k;

    /* renamed from: m */
    public long f19345m = 0;

    /* renamed from: n */
    public long f19346n = 0;

    /* renamed from: o */
    public long f19347o = 0;

    /* renamed from: p */
    public String f19348p;

    /* renamed from: r */
    public String f19349r;

    /* renamed from: v */
    private C6787a f19350v;

    /* renamed from: com.ss.android.deviceregister.b.b$a */
    class C6787a extends Thread {

        /* renamed from: a */
        int f19351a;

        /* renamed from: c */
        private final int f19353c;

        /* renamed from: b */
        private boolean m21040b(String str, int i) {
            return C19313c.m63337a(this, str, i);
        }

        /* renamed from: c */
        private static boolean m21041c() {
            return C6782a.m21002e();
        }

        /* renamed from: d */
        private boolean m21042d() {
            boolean z;
            if (this.f19351a >= 2 || (!NetUtil.isBadId(C6786b.this.mo16584b()) && !NetUtil.isBadId(C6786b.this.f19348p))) {
                z = false;
            } else {
                z = true;
            }
            this.f19351a++;
            return z;
        }

        /* renamed from: b */
        private long m21039b() {
            boolean z;
            long j;
            long j2;
            long currentTimeMillis = System.currentTimeMillis();
            if (C6786b.this.f19340g == C6781d.m20988e()) {
                z = true;
            } else {
                z = false;
            }
            if (C6782a.m21001d() || C6786b.f19333l >= 0 || !z) {
                j = 21600000;
            } else {
                j = 43200000;
            }
            if (z) {
                j2 = 180000;
            } else {
                j2 = 30000;
            }
            if (m21042d()) {
                j2 = C40413c.f105051b;
            }
            return Math.max(j - (currentTimeMillis - C6786b.this.f19345m), j2 - (currentTimeMillis - C6786b.this.f19346n));
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:5|(3:7|8|(3:10|11|12)(2:13|14))|16|17|(3:28|19|20)) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
            mo16591a();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003a */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x003e A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                super.run()
                com.ss.android.deviceregister.b.b r0 = com.p280ss.android.deviceregister.p290b.C6786b.this
                org.json.JSONObject r0 = r0.f19344k
                java.lang.String r1 = "device_id"
                r2 = 0
                java.lang.String r0 = r0.optString(r1, r2)
                boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)
                r0 = r0 ^ 1
                com.p280ss.android.deviceregister.p290b.C6786b.m21022a(r0)
            L_0x0017:
                boolean r0 = com.p280ss.android.deviceregister.p290b.C6786b.f19334q
                if (r0 != 0) goto L_0x0047
                long r0 = r6.m21039b()
                com.ss.android.deviceregister.b.b r2 = com.p280ss.android.deviceregister.p290b.C6786b.this
                java.lang.Object r2 = r2.f19339c
                monitor-enter(r2)
                r3 = 0
                int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r5 <= 0) goto L_0x003a
                boolean r3 = com.p280ss.android.deviceregister.p290b.C6786b.f19334q     // Catch:{ InterruptedException -> 0x003a }
                if (r3 == 0) goto L_0x0030
                monitor-exit(r2)     // Catch:{ all -> 0x0038 }
                return
            L_0x0030:
                com.ss.android.deviceregister.b.b r3 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ InterruptedException -> 0x003a }
                java.lang.Object r3 = r3.f19339c     // Catch:{ InterruptedException -> 0x003a }
                r3.wait(r0)     // Catch:{ InterruptedException -> 0x003a }
                goto L_0x003a
            L_0x0038:
                r0 = move-exception
                goto L_0x0045
            L_0x003a:
                boolean r0 = com.p280ss.android.deviceregister.p290b.C6786b.f19334q     // Catch:{ all -> 0x0038 }
                if (r0 == 0) goto L_0x0040
                monitor-exit(r2)     // Catch:{ all -> 0x0038 }
                return
            L_0x0040:
                monitor-exit(r2)     // Catch:{ all -> 0x0038 }
                r6.mo16591a()
                goto L_0x0017
            L_0x0045:
                monitor-exit(r2)     // Catch:{ all -> 0x0038 }
                throw r0
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.p290b.C6786b.C6787a.run():void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Can't wrap try/catch for region: R(7:55|56|57|58|59|60|61) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00f4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0139 */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0143 A[Catch:{ Exception -> 0x0156 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo16591a() {
            /*
                r6 = this;
                boolean r0 = com.p280ss.android.deviceregister.p290b.C6786b.f19332f
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                com.ss.android.deviceregister.b.b r0 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Exception -> 0x0156 }
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0156 }
                r0.f19346n = r1     // Catch:{ Exception -> 0x0156 }
                com.ss.android.deviceregister.b.b r0 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Exception -> 0x0156 }
                android.content.Context r0 = r0.f19342i     // Catch:{ Exception -> 0x0156 }
                boolean r0 = com.p280ss.android.deviceregister.p290b.C19313c.m63336a(r0)     // Catch:{ Exception -> 0x0156 }
                if (r0 != 0) goto L_0x0018
                return
            L_0x0018:
                com.ss.android.deviceregister.b.b r0 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Exception -> 0x0156 }
                android.content.Context r0 = r0.f19342i     // Catch:{ Exception -> 0x0156 }
                java.lang.String r0 = com.p280ss.android.deviceregister.p289a.C6781d.m20980b(r0)     // Catch:{ Exception -> 0x0156 }
                boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x0156 }
                if (r1 != 0) goto L_0x002f
                com.ss.android.deviceregister.b.b r1 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Exception -> 0x0156 }
                org.json.JSONObject r1 = r1.f19344k     // Catch:{ Exception -> 0x0156 }
                java.lang.String r2 = "user_agent"
                r1.put(r2, r0)     // Catch:{ Exception -> 0x0156 }
            L_0x002f:
                com.ss.android.deviceregister.b.b r0 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Exception -> 0x0156 }
                java.lang.String r0 = r0.f19349r     // Catch:{ Exception -> 0x0156 }
                boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x0156 }
                if (r0 != 0) goto L_0x0046
                com.ss.android.deviceregister.b.b r0 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Exception -> 0x0156 }
                org.json.JSONObject r0 = r0.f19344k     // Catch:{ Exception -> 0x0156 }
                java.lang.String r1 = "app_track"
                com.ss.android.deviceregister.b.b r2 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Exception -> 0x0156 }
                java.lang.String r2 = r2.f19349r     // Catch:{ Exception -> 0x0156 }
                r0.put(r1, r2)     // Catch:{ Exception -> 0x0156 }
            L_0x0046:
                com.ss.android.deviceregister.k r0 = com.p280ss.android.deviceregister.C6793k.m21104a()     // Catch:{ Exception -> 0x0156 }
                int r1 = r6.f19353c     // Catch:{ Exception -> 0x0156 }
                r0.mo16605b(r1)     // Catch:{ Exception -> 0x0156 }
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0156 }
                org.json.JSONTokener r1 = new org.json.JSONTokener     // Catch:{ Exception -> 0x0156 }
                com.ss.android.deviceregister.b.b r2 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Exception -> 0x0156 }
                org.json.JSONObject r2 = r2.f19344k     // Catch:{ Exception -> 0x0156 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0156 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0156 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x0156 }
                boolean r1 = com.p280ss.android.deviceregister.p290b.C6782a.m21000c()     // Catch:{ Exception -> 0x0156 }
                if (r1 == 0) goto L_0x0074
                boolean r1 = com.p280ss.android.deviceregister.p289a.C6781d.m20992h()     // Catch:{ Exception -> 0x0156 }
                if (r1 == 0) goto L_0x0074
                com.ss.android.deviceregister.b.b r1 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Exception -> 0x0156 }
                android.content.Context r1 = r1.f19342i     // Catch:{ Exception -> 0x0156 }
                com.p280ss.android.deviceregister.C19295a.m63226a(r0, r1)     // Catch:{ Exception -> 0x0156 }
            L_0x0074:
                android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Throwable -> 0x00f4 }
                r1.<init>()     // Catch:{ Throwable -> 0x00f4 }
                android.os.Bundle r2 = com.p280ss.android.deviceregister.p290b.C6786b.f19330d     // Catch:{ Throwable -> 0x00f4 }
                monitor-enter(r2)     // Catch:{ Throwable -> 0x00f4 }
                android.os.Bundle r3 = com.p280ss.android.deviceregister.p290b.C6786b.f19330d     // Catch:{ all -> 0x00f1 }
                r1.putAll(r3)     // Catch:{ all -> 0x00f1 }
                monitor-exit(r2)     // Catch:{ all -> 0x00f1 }
                int r2 = r1.size()     // Catch:{ Throwable -> 0x00f4 }
                if (r2 <= 0) goto L_0x00ae
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00f4 }
                r2.<init>()     // Catch:{ Throwable -> 0x00f4 }
                java.util.Set r3 = r1.keySet()     // Catch:{ Throwable -> 0x00f4 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x00f4 }
            L_0x0095:
                boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x00f4 }
                if (r4 == 0) goto L_0x00a9
                java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x00f4 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x00f4 }
                java.lang.Object r5 = r1.get(r4)     // Catch:{ Throwable -> 0x00f4 }
                r2.put(r4, r5)     // Catch:{ Throwable -> 0x00f4 }
                goto L_0x0095
            L_0x00a9:
                java.lang.String r1 = "custom"
                r0.put(r1, r2)     // Catch:{ Throwable -> 0x00f4 }
            L_0x00ae:
                r1 = 0
                boolean r2 = com.p280ss.android.deviceregister.C6789d.m21091k()     // Catch:{ Throwable -> 0x00f4 }
                if (r2 == 0) goto L_0x00bd
                com.ss.android.deviceregister.b.b r1 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Throwable -> 0x00f4 }
                android.content.Context r1 = r1.f19342i     // Catch:{ Throwable -> 0x00f4 }
                java.lang.String r1 = com.p280ss.android.deviceregister.p855c.C19319c.m63370m(r1)     // Catch:{ Throwable -> 0x00f4 }
            L_0x00bd:
                boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x00f4 }
                if (r2 == 0) goto L_0x00c7
                java.lang.String r1 = com.p280ss.android.C6725a.m20835a()     // Catch:{ Throwable -> 0x00f4 }
            L_0x00c7:
                java.lang.String r2 = com.p280ss.android.C6725a.m20837b()     // Catch:{ Throwable -> 0x00f4 }
                java.lang.String r3 = com.p280ss.android.C6725a.m20839c()     // Catch:{ Throwable -> 0x00f4 }
                boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x00f4 }
                if (r4 != 0) goto L_0x00da
                java.lang.String r4 = "google_aid"
                r0.put(r4, r1)     // Catch:{ Throwable -> 0x00f4 }
            L_0x00da:
                boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ Throwable -> 0x00f4 }
                if (r1 != 0) goto L_0x00e5
                java.lang.String r1 = "app_language"
                r0.put(r1, r2)     // Catch:{ Throwable -> 0x00f4 }
            L_0x00e5:
                boolean r1 = com.bytedance.common.utility.C6319n.m19593a(r3)     // Catch:{ Throwable -> 0x00f4 }
                if (r1 != 0) goto L_0x00f4
                java.lang.String r1 = "app_region"
                r0.put(r1, r3)     // Catch:{ Throwable -> 0x00f4 }
                goto L_0x00f4
            L_0x00f1:
                r1 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00f1 }
                throw r1     // Catch:{ Throwable -> 0x00f4 }
            L_0x00f4:
                com.p280ss.android.deviceregister.p289a.C6781d.m20975a(r0)     // Catch:{ Exception -> 0x0156 }
                com.ss.android.deviceregister.k r1 = com.p280ss.android.deviceregister.C6793k.m21104a()     // Catch:{ Exception -> 0x0156 }
                int r2 = r6.f19353c     // Catch:{ Exception -> 0x0156 }
                r1.mo16608c(r2)     // Catch:{ Exception -> 0x0156 }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0156 }
                r1.<init>()     // Catch:{ Exception -> 0x0156 }
                java.lang.String r2 = "magic_tag"
                java.lang.String r3 = "ss_app_log"
                r1.put(r2, r3)     // Catch:{ Exception -> 0x0156 }
                java.lang.String r2 = "header"
                r1.put(r2, r0)     // Catch:{ Exception -> 0x0156 }
                java.lang.String r0 = "_gen_time"
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0156 }
                r1.put(r0, r2)     // Catch:{ Exception -> 0x0156 }
                r0 = 1
                com.p280ss.android.deviceregister.p290b.C6786b.f19332f = r0     // Catch:{ Exception -> 0x0156 }
                java.lang.ThreadLocal<java.lang.Boolean> r2 = com.p280ss.android.deviceregister.p290b.C6786b.f19335s     // Catch:{ Exception -> 0x0156 }
                java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0156 }
                r2.set(r3)     // Catch:{ Exception -> 0x0156 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0156 }
                int r2 = r6.f19353c     // Catch:{ Exception -> 0x0156 }
                boolean r1 = r6.m21040b(r1, r2)     // Catch:{ Exception -> 0x0156 }
                java.lang.Object r2 = com.p280ss.android.deviceregister.p290b.C6786b.f19329b     // Catch:{ Exception -> 0x0156 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x0156 }
                r3 = 0
                com.p280ss.android.deviceregister.p290b.C6786b.f19332f = r3     // Catch:{ all -> 0x0153 }
                java.lang.Object r4 = com.p280ss.android.deviceregister.p290b.C6786b.f19329b     // Catch:{ Exception -> 0x0139 }
                r4.notifyAll()     // Catch:{ Exception -> 0x0139 }
            L_0x0139:
                monitor-exit(r2)     // Catch:{ all -> 0x0153 }
                com.p280ss.android.deviceregister.p290b.C6786b.f19331e = r0     // Catch:{ Exception -> 0x0156 }
                java.lang.ThreadLocal<java.lang.Boolean> r0 = com.p280ss.android.deviceregister.p290b.C6786b.f19335s     // Catch:{ Exception -> 0x0156 }
                r0.remove()     // Catch:{ Exception -> 0x0156 }
                if (r1 != 0) goto L_0x0152
                com.ss.android.deviceregister.b.b r0 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Exception -> 0x0156 }
                com.ss.android.deviceregister.b.a.a r0 = r0.f19341h     // Catch:{ Exception -> 0x0156 }
                java.lang.String r0 = r0.mo16580e()     // Catch:{ Exception -> 0x0156 }
                boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Exception -> 0x0156 }
                com.p280ss.android.deviceregister.p290b.C6786b.m21023a(r3, r0)     // Catch:{ Exception -> 0x0156 }
            L_0x0152:
                return
            L_0x0153:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0153 }
                throw r0     // Catch:{ Exception -> 0x0156 }
            L_0x0156:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.p290b.C6786b.C6787a.mo16591a():void");
        }

        /* renamed from: a */
        private void m21038a(JSONObject jSONObject) {
            boolean z;
            JSONObject jSONObject2 = jSONObject;
            C6786b.this.f19340g = C6781d.m20988e();
            boolean z2 = false;
            if (jSONObject2.optInt("new_user", 0) > 0) {
                z = true;
            } else {
                z = false;
            }
            C6786b.f19336t = z;
            Editor edit = C6786b.this.f19343j.edit();
            edit.putInt("last_config_version", C6786b.this.f19340g);
            String str = C6786b.this.f19348p;
            String e = C6786b.this.f19341h.mo16580e();
            boolean a = C6319n.m19593a(e);
            String optString = jSONObject2.optString("install_id", null);
            String optString2 = jSONObject2.optString("device_id", null);
            boolean isBadId = NetUtil.isBadId(optString2);
            boolean isBadId2 = NetUtil.isBadId(optString);
            if (!isBadId && !isBadId2) {
                C6786b.this.f19345m = System.currentTimeMillis();
                edit.putLong("last_config_time", C6786b.this.f19345m);
            }
            if (!isBadId2 && !optString.equals(C6786b.this.f19348p)) {
                C6786b.this.f19348p = optString;
                if (!C6319n.m19593a(str)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("old_id", str);
                        jSONObject3.put("new_id", optString);
                        C6786b.m21016a(null, "umeng", "iid_change", null, 0, 0, jSONObject3);
                    } catch (Exception unused) {
                    }
                }
                z2 = true;
            }
            if (!isBadId && !optString2.equals(e)) {
                if (!C6319n.m19593a(e)) {
                    try {
                        String a2 = C6786b.this.f19341h.mo16575a(true);
                        String d = C6786b.this.f19341h.mo16579d();
                        String a3 = C6786b.this.f19341h.mo16574a();
                        String b = C6786b.this.f19341h.mo16577b();
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("old_id", e);
                        jSONObject4.put("new_id", optString2);
                        jSONObject4.put("openudid", a2);
                        jSONObject4.put("clientudid", a3);
                        if (!C6319n.m19593a(d)) {
                            jSONObject4.put("udid", d);
                        }
                        if (!C6319n.m19593a(b)) {
                            jSONObject4.put("serial_number", b);
                        }
                        if (C6781d.m20992h()) {
                            String[] c = C6786b.this.f19341h.mo16578c();
                            if (c != null && c.length > 0) {
                                jSONObject4.put("sim_serial_number", Arrays.toString(c));
                            }
                        }
                        C6786b.m21016a(null, "umeng", "did_change", null, 0, 0, jSONObject4);
                    } catch (Exception unused2) {
                    }
                }
                z2 = true;
            }
            if (z2) {
                try {
                    C6786b.this.f19344k.put("install_id", C6786b.this.f19348p);
                    C6786b.this.f19344k.put("device_id", optString2);
                    edit.putString("install_id", C6786b.this.f19348p);
                    edit.putString("device_id", optString2);
                } catch (Exception unused3) {
                }
            }
            edit.commit();
            if (z2) {
                C6786b.this.f19341h.mo16576a(optString2);
                C6786b.this.mo16590i();
            }
            C6786b.m21023a(true, a);
        }

        C6787a(int i) {
            super("DeviceRegisterThread");
            this.f19353c = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a2, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a3, code lost:
            r3 = r10;
            r23 = r11;
            r24 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
            r9 = r3;
            r19 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
            r16 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b1, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
            r3 = r10;
            r23 = r11;
            r24 = r12;
            r25 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0148, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0179, code lost:
            r16 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0180, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0181, code lost:
            r9 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0183, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0184, code lost:
            r3 = r10;
            r23 = r11;
            r24 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x018b, code lost:
            r9 = r3;
            r19 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0190, code lost:
            if (r19 > 0) goto L_0x0192;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            com.p280ss.android.deviceregister.C6793k.m21104a().mo16599a(r4, java.lang.Long.valueOf(r19), java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()), r9, r27, r0, r0.getMessage(), java.lang.Integer.valueOf(r23));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b5, code lost:
            if (com.p280ss.android.deviceregister.p290b.C6786b.m21024a(r0) != false) goto L_0x01b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b8, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f4, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f5, code lost:
            com.p280ss.android.deviceregister.C6793k.m21104a().mo16610c(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x01fc, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x01fd, code lost:
            com.p280ss.android.deviceregister.C6793k.m21104a().mo16610c(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0205, code lost:
            return false;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x01b8 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8 A[SYNTHETIC, Splitter:B:42:0x00c8] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0192 A[SYNTHETIC, Splitter:B:71:0x0192] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7 A[Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01cc A[Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x01f4 A[ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo16592a(java.lang.String r27, int r28) {
            /*
                r26 = this;
                r1 = r26
                java.lang.String[] r2 = com.p280ss.android.deviceregister.p290b.C6782a.m20996a()
                if (r2 != 0) goto L_0x000a
                r0 = 0
                goto L_0x000b
            L_0x000a:
                int r0 = r2.length
            L_0x000b:
                com.ss.android.deviceregister.k r4 = com.p280ss.android.deviceregister.C6793k.m21104a()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5 = r28
                java.lang.Integer r4 = r4.mo16597a(r0, r5)
                java.lang.String r0 = "UTF-8"
                r14 = r27
                byte[] r15 = r14.getBytes(r0)     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                com.ss.android.deviceregister.b.b r0 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                long r7 = r0.f19347o     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                r0 = 0
                long r7 = r5 - r7
                r9 = 600000(0x927c0, double:2.964394E-318)
                r13 = 1
                int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r0 >= 0) goto L_0x0036
                r12 = 1
                goto L_0x0037
            L_0x0036:
                r12 = 0
            L_0x0037:
                com.ss.android.deviceregister.b.b r0 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                r0.f19347o = r5     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                r0 = 0
                if (r2 == 0) goto L_0x01ec
                r16 = r0
                r11 = 0
            L_0x0041:
                int r0 = r2.length     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                if (r11 >= r0) goto L_0x01c6
                r0 = r2[r11]     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                java.lang.Object r5 = r15.clone()     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                byte[] r5 = (byte[]) r5     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                boolean r6 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                if (r6 != 0) goto L_0x01b9
                com.ss.android.deviceregister.b.b r6 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                android.content.Context r6 = r6.f19342i     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                java.lang.String r0 = com.p280ss.android.usergrowth.C7304c.m22878a(r6, r0)     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                java.lang.String r10 = com.p280ss.android.common.applog.NetUtil.addCommonParams(r0, r13)     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                r17 = 0
                boolean r0 = m21041c()     // Catch:{ Throwable -> 0x0183, all -> 0x01f4 }
                if (r0 == 0) goto L_0x012c
                long r19 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0183, all -> 0x01f4 }
                com.ss.android.deviceregister.b.b r0 = com.p280ss.android.deviceregister.p290b.C6786b.this     // Catch:{ RuntimeException -> 0x00bd }
                android.content.Context r0 = r0.f19342i     // Catch:{ RuntimeException -> 0x00bd }
                java.lang.String r21 = com.p280ss.android.common.applog.NetUtil.sendEncryptLog(r10, r5, r0, r12)     // Catch:{ RuntimeException -> 0x00bd }
                com.ss.android.deviceregister.k r5 = com.p280ss.android.deviceregister.C6793k.m21104a()     // Catch:{ RuntimeException -> 0x00b1, Throwable -> 0x00a2, all -> 0x01f4 }
                java.lang.Long r7 = java.lang.Long.valueOf(r19)     // Catch:{ RuntimeException -> 0x00b1, Throwable -> 0x00a2, all -> 0x01f4 }
                long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ RuntimeException -> 0x00b1, Throwable -> 0x00a2, all -> 0x01f4 }
                java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ RuntimeException -> 0x00b1, Throwable -> 0x00a2, all -> 0x01f4 }
                r0 = 0
                r16 = 0
                java.lang.Integer r22 = java.lang.Integer.valueOf(r11)     // Catch:{ RuntimeException -> 0x00b1, Throwable -> 0x00a2, all -> 0x01f4 }
                r6 = r4
                r9 = r10
                r3 = r10
                r10 = r27
                r23 = r11
                r11 = r0
                r24 = r12
                r12 = r16
                r25 = 1
                r13 = r22
                r5.mo16599a(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ RuntimeException -> 0x00a0, Throwable -> 0x009e, all -> 0x01f4 }
                goto L_0x0179
            L_0x009e:
                r0 = move-exception
                goto L_0x00aa
            L_0x00a0:
                r0 = move-exception
                goto L_0x00b9
            L_0x00a2:
                r0 = move-exception
                r3 = r10
                r23 = r11
                r24 = r12
                r25 = 1
            L_0x00aa:
                r9 = r3
                r19 = r17
            L_0x00ad:
                r16 = r21
                goto L_0x018e
            L_0x00b1:
                r0 = move-exception
                r3 = r10
                r23 = r11
                r24 = r12
                r25 = 1
            L_0x00b9:
                r11 = r0
                r16 = r21
                goto L_0x00c6
            L_0x00bd:
                r0 = move-exception
                r3 = r10
                r23 = r11
                r24 = r12
                r25 = 1
                r11 = r0
            L_0x00c6:
                if (r24 == 0) goto L_0x00da
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                r0.<init>()     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                r0.append(r3)     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                java.lang.String r5 = "&config_retry=b"
                r0.append(r5)     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                r3 = r0
            L_0x00da:
                com.ss.android.deviceregister.k r5 = com.p280ss.android.deviceregister.C6793k.m21104a()     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                java.lang.Long r7 = java.lang.Long.valueOf(r19)     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                java.lang.String r12 = r11.getMessage()     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r23)     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                r6 = r4
                r9 = r3
                r10 = r27
                r5.mo16599a(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                long r19 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                com.bytedance.common.utility.k r5 = com.bytedance.common.utility.C6317k.m19580a()     // Catch:{ Throwable -> 0x0180, all -> 0x01f4 }
                r8 = 1
                java.lang.String r9 = "application/json; charset=utf-8"
                r10 = 0
                r6 = r3
                r7 = r15
                java.lang.String r21 = r5.mo15155a(r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x0180, all -> 0x01f4 }
                com.ss.android.deviceregister.k r5 = com.p280ss.android.deviceregister.C6793k.m21104a()     // Catch:{ Throwable -> 0x017c, all -> 0x01f4 }
                java.lang.Long r7 = java.lang.Long.valueOf(r19)     // Catch:{ Throwable -> 0x017c, all -> 0x01f4 }
                long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x017c, all -> 0x01f4 }
                java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x017c, all -> 0x01f4 }
                r11 = 0
                r12 = 0
                java.lang.Integer r13 = java.lang.Integer.valueOf(r23)     // Catch:{ Throwable -> 0x017c, all -> 0x01f4 }
                r6 = r4
                r9 = r3
                r10 = r27
                r5.mo16599a(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Throwable -> 0x017c, all -> 0x01f4 }
                r0 = r21
                goto L_0x01ca
            L_0x012c:
                r3 = r10
                r23 = r11
                r24 = r12
                r25 = 1
                if (r24 == 0) goto L_0x014a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                r0.<init>()     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                r0.append(r3)     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                java.lang.String r5 = "&config_retry=b"
                r0.append(r5)     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                r3 = r0
                goto L_0x014a
            L_0x0148:
                r0 = move-exception
                goto L_0x018b
            L_0x014a:
                long r19 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0148, all -> 0x01f4 }
                com.bytedance.common.utility.k r5 = com.bytedance.common.utility.C6317k.m19580a()     // Catch:{ Throwable -> 0x0180, all -> 0x01f4 }
                r8 = 1
                java.lang.String r9 = "application/json; charset=utf-8"
                r10 = 0
                r6 = r3
                r7 = r15
                java.lang.String r21 = r5.mo15155a(r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x0180, all -> 0x01f4 }
                com.ss.android.deviceregister.k r5 = com.p280ss.android.deviceregister.C6793k.m21104a()     // Catch:{ Throwable -> 0x017c, all -> 0x01f4 }
                java.lang.Long r7 = java.lang.Long.valueOf(r19)     // Catch:{ Throwable -> 0x017c, all -> 0x01f4 }
                long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x017c, all -> 0x01f4 }
                java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x017c, all -> 0x01f4 }
                r11 = 0
                r12 = 0
                java.lang.Integer r13 = java.lang.Integer.valueOf(r23)     // Catch:{ Throwable -> 0x017c, all -> 0x01f4 }
                r6 = r4
                r9 = r3
                r10 = r27
                r5.mo16599a(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Throwable -> 0x017c, all -> 0x01f4 }
            L_0x0179:
                r16 = r21
                goto L_0x01c8
            L_0x017c:
                r0 = move-exception
                r9 = r3
                goto L_0x00ad
            L_0x0180:
                r0 = move-exception
                r9 = r3
                goto L_0x018e
            L_0x0183:
                r0 = move-exception
                r3 = r10
                r23 = r11
                r24 = r12
                r25 = 1
            L_0x018b:
                r9 = r3
                r19 = r17
            L_0x018e:
                int r3 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
                if (r3 <= 0) goto L_0x01b1
                com.ss.android.deviceregister.k r5 = com.p280ss.android.deviceregister.C6793k.m21104a()     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                java.lang.Long r7 = java.lang.Long.valueOf(r19)     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                long r10 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                java.lang.String r12 = r0.getMessage()     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r23)     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                r6 = r4
                r10 = r27
                r11 = r0
                r5.mo16599a(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
            L_0x01b1:
                boolean r3 = com.p280ss.android.deviceregister.p290b.C6786b.m21024a(r0)     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                if (r3 == 0) goto L_0x01b8
                goto L_0x01bf
            L_0x01b8:
                throw r0     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
            L_0x01b9:
                r23 = r11
                r24 = r12
                r25 = 1
            L_0x01bf:
                int r11 = r23 + 1
                r12 = r24
                r13 = 1
                goto L_0x0041
            L_0x01c6:
                r25 = 1
            L_0x01c8:
                r0 = r16
            L_0x01ca:
                if (r0 == 0) goto L_0x01e3
                int r2 = r0.length()     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                if (r2 != 0) goto L_0x01d3
                goto L_0x01e3
            L_0x01d3:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                r2.<init>(r0)     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                r1.m21038a(r2)     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                com.ss.android.deviceregister.k r0 = com.p280ss.android.deviceregister.C6793k.m21104a()
                r0.mo16610c(r4)
                return r25
            L_0x01e3:
                com.ss.android.deviceregister.k r0 = com.p280ss.android.deviceregister.C6793k.m21104a()
                r0.mo16610c(r4)
                r2 = 0
                return r2
            L_0x01ec:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                java.lang.String r2 = "url is null"
                r0.<init>(r2)     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
                throw r0     // Catch:{ Throwable -> 0x01fd, all -> 0x01f4 }
            L_0x01f4:
                r0 = move-exception
                com.ss.android.deviceregister.k r2 = com.p280ss.android.deviceregister.C6793k.m21104a()
                r2.mo16610c(r4)
                throw r0
            L_0x01fd:
                com.ss.android.deviceregister.k r0 = com.p280ss.android.deviceregister.C6793k.m21104a()
                r0.mo16610c(r4)
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.p290b.C6786b.C6787a.mo16592a(java.lang.String, int):boolean");
        }
    }

    /* renamed from: a */
    public final void mo16582a(int i) {
        this.f19344k = new JSONObject();
        m21027j();
        if (C6781d.m20978a(this.f19342i, this.f19344k) || !C6312h.m19578b()) {
            this.f19350v = new C6787a(i);
            this.f19350v.start();
            return;
        }
        throw new RuntimeException("init header error.");
    }

    /* renamed from: a */
    public final void mo16581a() {
        if (this.f19350v != null) {
            this.f19350v.mo16591a();
        }
    }

    /* renamed from: a */
    public final void mo16583a(Context context, String str) {
        if (!C6319n.m19593a(str)) {
            try {
                this.f19349r = str;
            } catch (Exception unused) {
            }
        }
        C6781d.m20981b(context, str);
    }

    /* renamed from: c */
    public static void m21026c() {
        f19333l = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final String mo16584b() {
        return this.f19341h.mo16580e();
    }

    /* renamed from: d */
    public final String mo16585d() {
        return this.f19341h.mo16575a(true);
    }

    /* renamed from: e */
    public final String mo16586e() {
        return this.f19341h.mo16579d();
    }

    /* renamed from: f */
    public final String mo16587f() {
        return this.f19341h.mo16574a();
    }

    /* renamed from: g */
    public final String[] mo16588g() {
        return this.f19341h.mo16578c();
    }

    /* renamed from: h */
    public final String mo16589h() {
        return this.f19341h.mo16577b();
    }

    /* renamed from: i */
    public final void mo16590i() {
        m21021a("install_id", (Object) this.f19348p);
        m21021a("device_id", (Object) this.f19341h.mo16580e());
        int size = f19338w.size();
        for (int i = 0; i < size; i++) {
            WeakReference weakReference = (WeakReference) f19338w.get(i);
            if (weakReference != null) {
                C6790a aVar = (C6790a) weakReference.get();
                if (aVar != null) {
                    try {
                        aVar.onDeviceRegistrationInfoChanged(this.f19341h.mo16580e(), this.f19348p);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private void m21027j() {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences a = C6778a.m20959a(this.f19342i);
        this.f19340g = a.getInt("last_config_version", 0);
        this.f19348p = a.getString("install_id", "");
        if (this.f19340g == C6781d.m20988e()) {
            long j = a.getLong("last_config_time", 0);
            if (j <= currentTimeMillis) {
                currentTimeMillis = j;
            }
            boolean isBadId = NetUtil.isBadId(mo16584b());
            boolean isBadId2 = NetUtil.isBadId(this.f19348p);
            if (!isBadId && !isBadId2) {
                this.f19345m = currentTimeMillis;
            }
        }
    }

    /* renamed from: a */
    public static void m21018a(C6779b bVar) {
        f19328a = bVar;
    }

    /* renamed from: a */
    public static void m21019a(C6780c cVar) {
        f19337u = cVar;
        C6781d.m20970a(cVar);
    }

    /* renamed from: a */
    public static void m21020a(C6790a aVar) {
        if (aVar != null) {
            f19338w.add(new WeakReference(aVar));
        }
    }

    /* renamed from: b */
    private static String m21025b(Context context) {
        try {
            return C6792f.m21098a(context).mo16580e();
        } catch (Exception unused) {
            return null;
        }
    }

    public C6786b(Context context) {
        this.f19342i = context;
        this.f19341h = C6792f.m21098a(context);
        this.f19343j = C6778a.m20959a(context);
    }

    /* renamed from: a */
    public static void m21015a(Context context) {
        if (f19335s.get() == null && C6319n.m19593a(m21025b(context))) {
            synchronized (f19329b) {
                if (!f19331e) {
                    if (C6319n.m19593a(m21025b(context))) {
                        long j = 1500;
                        if (f19332f) {
                            j = 4000;
                        }
                        try {
                            f19329b.wait(j);
                        } catch (Exception unused) {
                        }
                        f19331e = true;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m21017a(Bundle bundle) {
        if (bundle != null && bundle.size() > 0) {
            synchronized (f19330d) {
                f19330d.putAll(bundle);
            }
        }
    }

    /* renamed from: a */
    public static void m21022a(boolean z) {
        int size = f19338w.size();
        for (int i = 0; i < size; i++) {
            WeakReference weakReference = (WeakReference) f19338w.get(i);
            if (weakReference != null) {
                C6790a aVar = (C6790a) weakReference.get();
                if (aVar != null) {
                    try {
                        aVar.onDidLoadLocally(z);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m21024a(Throwable th) {
        if (!(th instanceof CommonHttpException)) {
            return true;
        }
        int responseCode = ((CommonHttpException) th).getResponseCode();
        if (responseCode < 200 || responseCode == 301 || responseCode == 302) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m21021a(String str, Object obj) {
        C6781d.m20973a(str, obj);
    }

    /* renamed from: a */
    public static void m21023a(boolean z, boolean z2) {
        int size = f19338w.size();
        for (int i = 0; i < size; i++) {
            WeakReference weakReference = (WeakReference) f19338w.get(i);
            if (weakReference != null) {
                C6790a aVar = (C6790a) weakReference.get();
                if (aVar != null) {
                    try {
                        aVar.onRemoteConfigUpdate(z, z2);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m21016a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (f19337u != null) {
            f19337u.onDeviceRegisterEvent(null, str, str2, null, 0, 0, jSONObject);
        }
    }
}
