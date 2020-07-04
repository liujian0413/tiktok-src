package com.bytedance.crash.p491b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.C9900g;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.p501j.p502a.C9921b;
import com.bytedance.crash.p504l.C9972a;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.File;
import java.util.HashMap;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.b */
public final class C9857b {

    /* renamed from: a */
    static volatile boolean f26869a = true;

    /* renamed from: e */
    private static volatile boolean f26870e;

    /* renamed from: b */
    private C9859c f26871b;

    /* renamed from: c */
    private final Context f26872c;

    /* renamed from: d */
    private volatile boolean f26873d;

    /* renamed from: f */
    private long f26874f = -1;

    /* renamed from: g */
    private boolean f26875g = true;

    /* renamed from: h */
    private JSONObject f26876h;

    /* renamed from: i */
    private JSONObject f26877i;

    /* renamed from: j */
    private JSONArray f26878j;

    /* renamed from: k */
    private JSONObject f26879k;

    /* renamed from: l */
    private long f26880l = -1;

    /* renamed from: m */
    private JSONArray f26881m;

    /* renamed from: n */
    private JSONArray f26882n;

    /* renamed from: o */
    private boolean f26883o;

    /* renamed from: p */
    private final Object f26884p = new Object();

    /* renamed from: q */
    private volatile boolean f26885q;

    /* renamed from: r */
    private long f26886r = -1;

    /* renamed from: s */
    private final Runnable f26887s = new Runnable() {
        public final void run() {
            try {
                C9857b.this.mo24427a((int) C34943c.f91127w, 25);
            } catch (Throwable th) {
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            }
        }
    };

    /* renamed from: a */
    private static String m29085a(float f) {
        return f <= 0.0f ? "0%" : f <= 0.1f ? "0% - 10%" : f <= 0.3f ? "10% - 30%" : f <= 0.6f ? "30% - 60%" : f <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    /* renamed from: a */
    public final void mo24426a() {
        if (!this.f26873d) {
            this.f26871b = new C9859c(this);
            this.f26874f = C9918j.m29345j();
            this.f26873d = true;
        }
    }

    /* renamed from: a */
    private void m29092a(JSONArray jSONArray) {
        if (jSONArray != null) {
            this.f26876h = null;
            this.f26879k = null;
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            String str = null;
            boolean z = false;
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    switch (z) {
                        case false:
                            if (optString.startsWith("DALVIK THREADS") || optString.startsWith("suspend") || optString.startsWith("\"")) {
                                z = true;
                            }
                            jSONArray3.put(optString);
                            break;
                        case true:
                            if (!optString.contains(" prio=")) {
                                if (!TextUtils.isEmpty(str)) {
                                    jSONArray4.put(optString);
                                    break;
                                } else {
                                    jSONArray3.put(optString);
                                    break;
                                }
                            } else {
                                if (jSONArray4.length() > 0 && !TextUtils.isEmpty(str)) {
                                    if (this.f26876h != null || !"main".equals(str)) {
                                        jSONArray2.put(m29087a(str, jSONArray4));
                                    } else {
                                        this.f26876h = m29094b(jSONArray4);
                                    }
                                }
                                String substring = optString.substring(1, optString.indexOf(34, 1));
                                if (!"main".equals(substring)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(substring);
                                    sb.append("  (");
                                    sb.append(optString.substring(optString.indexOf(34, 2) + 1));
                                    sb.append(" )");
                                    substring = sb.toString();
                                }
                                if (jSONArray4.length() > 0) {
                                    jSONArray4 = new JSONArray();
                                }
                                jSONArray4.put(optString);
                                str = substring;
                                break;
                            }
                    }
                } else {
                    if (jSONArray4.length() > 0 && !TextUtils.isEmpty(str)) {
                        if (this.f26876h != null || !"main".equals(str)) {
                            jSONArray2.put(m29087a(str, jSONArray4));
                        } else {
                            this.f26876h = m29094b(jSONArray4);
                        }
                    }
                    if (jSONArray4.length() > 0) {
                        jSONArray4 = new JSONArray();
                    }
                    str = null;
                }
            }
            if (jSONArray2.length() > 0) {
                this.f26878j = jSONArray3;
                try {
                    this.f26879k = new JSONObject();
                    this.f26879k.put("thread_all_count", jSONArray2.length());
                    this.f26879k.put("thread_stacks", jSONArray2);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x022f */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0179 A[SYNTHETIC, Splitter:B:64:0x0179] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f2 A[Catch:{ Throwable -> 0x0224, Throwable -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01f5 A[Catch:{ Throwable -> 0x0224, Throwable -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0218 A[Catch:{ Throwable -> 0x0224, Throwable -> 0x022f }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x021b A[Catch:{ Throwable -> 0x0224, Throwable -> 0x022f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24427a(int r20, int r21) {
        /*
            r19 = this;
            r1 = r19
            boolean r0 = com.bytedance.crash.p491b.C9862e.m29106a()
            long r2 = android.os.SystemClock.uptimeMillis()
            r1.m29088a(r2)
            android.content.Context r4 = r1.f26872c
            r5 = 1
            java.lang.String r4 = com.bytedance.crash.p491b.C9861d.m29102a(r4, r5)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = "normal"
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            r10 = 20000(0x4e20, double:9.8813E-320)
            r12 = 0
            r13 = 0
            if (r9 != 0) goto L_0x0065
            java.lang.Object r9 = r1.f26884p
            monitor-enter(r9)
            monitor-exit(r9)     // Catch:{ all -> 0x0062 }
            org.json.JSONObject r6 = r1.f26876h
            if (r6 == 0) goto L_0x003b
            long r6 = java.lang.System.currentTimeMillis()
            long r14 = r1.f26874f
            long r6 = r6 - r14
            int r9 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x003b
            java.lang.String r6 = "trace_last"
        L_0x0039:
            r8 = r6
            goto L_0x0044
        L_0x003b:
            boolean r6 = r1.f26885q
            if (r6 == 0) goto L_0x0044
            r1.f26885q = r12
            java.lang.String r6 = "trace_after"
            goto L_0x0039
        L_0x0044:
            r1.m29095b(r2)
            org.json.JSONObject r6 = r1.f26876h
            org.json.JSONArray r7 = r1.f26878j
            org.json.JSONArray r9 = r1.f26882n
            org.json.JSONArray r14 = r1.f26881m
            org.json.JSONObject r15 = r1.f26877i
            boolean r5 = r1.f26883o
            long r10 = r1.f26880l
            r1.f26876h = r13
            r1.f26878j = r13
            r1.f26881m = r13
            r1.f26877i = r13
            r1.f26882n = r13
            r17 = 1
            goto L_0x006e
        L_0x0062:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0062 }
            throw r0
        L_0x0065:
            r10 = r6
            r6 = r13
            r7 = r6
            r9 = r7
            r14 = r9
            r15 = r14
            r5 = 0
            r17 = 0
        L_0x006e:
            boolean r18 = android.text.TextUtils.isEmpty(r4)
            if (r18 == 0) goto L_0x0091
            org.json.JSONObject r0 = r1.f26876h
            if (r0 == 0) goto L_0x0090
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.f26874f
            long r2 = r2 - r4
            r4 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0090
            r1.f26876h = r13
            r1.f26878j = r13
            r1.f26881m = r13
            r1.f26877i = r13
            r1.f26882n = r13
            return r12
        L_0x0090:
            return r12
        L_0x0091:
            if (r6 != 0) goto L_0x00b0
            org.json.JSONArray r16 = com.bytedance.crash.p491b.C9864g.m29119c()     // Catch:{ Throwable -> 0x00af }
            r9 = 100
            org.json.JSONArray r9 = com.bytedance.crash.p491b.C9864g.m29112a(r9, r2)     // Catch:{ Throwable -> 0x00aa }
            org.json.JSONObject r2 = com.bytedance.crash.p491b.C9864g.m29113a(r2)     // Catch:{ Throwable -> 0x00a9 }
            boolean r3 = f26869a     // Catch:{ Throwable -> 0x00ad }
            org.json.JSONObject r3 = com.bytedance.crash.p491b.C9861d.m29103a(r3)     // Catch:{ Throwable -> 0x00ad }
            r15 = r2
            r6 = r3
        L_0x00a9:
            r14 = r9
        L_0x00aa:
            r9 = r16
            goto L_0x00b0
        L_0x00ad:
            r15 = r2
            goto L_0x00a9
        L_0x00af:
        L_0x00b0:
            if (r6 == 0) goto L_0x0248
            int r2 = r6.length()
            if (r2 <= 0) goto L_0x0248
            com.bytedance.crash.a.a r2 = com.bytedance.crash.p490a.C9848a.m29064a()     // Catch:{ Throwable -> 0x023e }
            com.bytedance.crash.CrashType r3 = com.bytedance.crash.CrashType.ANR     // Catch:{ Throwable -> 0x023e }
            java.lang.String r13 = com.bytedance.crash.C9918j.m29340e()     // Catch:{ Throwable -> 0x023e }
            r2.mo24412a(r3, r10, r13)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r2 = "pid"
            int r3 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x023e }
            r6.put(r2, r3)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r2 = "package"
            android.content.Context r3 = r1.f26872c     // Catch:{ Throwable -> 0x023e }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Throwable -> 0x023e }
            r6.put(r2, r3)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r2 = "is_remote_process"
            r6.put(r2, r12)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r2 = "is_new_stack"
            r3 = 10
            r6.put(r2, r3)     // Catch:{ Throwable -> 0x023e }
            com.bytedance.crash.f.a r2 = new com.bytedance.crash.f.a     // Catch:{ Throwable -> 0x023e }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x023e }
            r3.<init>()     // Catch:{ Throwable -> 0x023e }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r3 = "data"
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x023e }
            r2.mo24492a(r3, r6)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r3 = "is_anr"
            r6 = 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x023e }
            r2.mo24492a(r3, r12)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r3 = "anrType"
            r2.mo24492a(r3, r8)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r3 = "history_message"
            r2.mo24492a(r3, r9)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r3 = "current_message"
            r2.mo24492a(r3, r15)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r3 = "pending_messages"
            r2.mo24492a(r3, r14)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r3 = "anr_time"
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x023e }
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ Throwable -> 0x023e }
            r2.mo24492a(r3, r6)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r3 = "crash_time"
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ Throwable -> 0x023e }
            r2.mo24492a(r3, r6)     // Catch:{ Throwable -> 0x023e }
            com.bytedance.crash.p492c.C9874b.m29129b()     // Catch:{ Throwable -> 0x023e }
            android.content.Context r3 = r1.f26872c     // Catch:{ Throwable -> 0x023e }
            org.json.JSONObject r6 = r2.f26984a     // Catch:{ Throwable -> 0x023e }
            com.bytedance.crash.p504l.C9972a.m29501a(r3, r6)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r3 = "anr_info"
            r2.mo24492a(r3, r4)     // Catch:{ Throwable -> 0x023e }
            if (r7 == 0) goto L_0x0142
            java.lang.String r3 = "dump_trace"
            r2.mo24492a(r3, r7)     // Catch:{ Throwable -> 0x023e }
        L_0x0142:
            java.lang.String r3 = "all_thread_stacks"
            org.json.JSONObject r6 = r1.f26879k     // Catch:{ Throwable -> 0x023e }
            if (r6 == 0) goto L_0x0154
            org.json.JSONObject r6 = r1.f26879k     // Catch:{ Throwable -> 0x023e }
            int r6 = r6.length()     // Catch:{ Throwable -> 0x023e }
            if (r6 != 0) goto L_0x0151
            goto L_0x0154
        L_0x0151:
            org.json.JSONObject r6 = r1.f26879k     // Catch:{ Throwable -> 0x023e }
            goto L_0x0159
        L_0x0154:
            r6 = 0
            org.json.JSONObject r6 = com.bytedance.crash.p504l.C9999s.m29654b(r6)     // Catch:{ Throwable -> 0x023e }
        L_0x0159:
            r2.mo24492a(r3, r6)     // Catch:{ Throwable -> 0x023e }
            com.bytedance.crash.j.a.f r3 = com.bytedance.crash.p501j.p502a.C9930f.m29397a()     // Catch:{ Throwable -> 0x023e }
            com.bytedance.crash.CrashType r6 = com.bytedance.crash.CrashType.ANR     // Catch:{ Throwable -> 0x023e }
            com.bytedance.crash.f.a r2 = r3.mo24554a(r6, r2)     // Catch:{ Throwable -> 0x023e }
            java.lang.String r3 = "is_background"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x023e }
            r2.mo24492a(r3, r5)     // Catch:{ Throwable -> 0x023e }
            org.json.JSONObject r3 = r2.f26984a     // Catch:{ Throwable -> 0x023e }
            java.lang.String r5 = "filters"
            org.json.JSONObject r3 = r3.optJSONObject(r5)     // Catch:{ Throwable -> 0x023e }
            if (r3 != 0) goto L_0x0183
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x022f }
            r3.<init>()     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "filters"
            r2.mo24492a(r5, r3)     // Catch:{ Throwable -> 0x022f }
        L_0x0183:
            java.lang.String r5 = "anrType"
            r3.put(r5, r8)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "npth_force_apm_crash"
            boolean r6 = com.bytedance.crash.p492c.C9874b.m29129b()     // Catch:{ Throwable -> 0x022f }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x022f }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "sdk_version"
            java.lang.String r6 = "3.1.2-rc.0-oversea"
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "has_logcat"
            boolean r6 = r2.mo24493a()     // Catch:{ Throwable -> 0x022f }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x022f }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "memory_leak"
            boolean r6 = r2.mo24504e()     // Catch:{ Throwable -> 0x022f }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x022f }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "is_64_devices"
            boolean r6 = com.bytedance.crash.p497f.C9898c.m29252a()     // Catch:{ Throwable -> 0x022f }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x022f }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "is_64_runtime"
            boolean r6 = com.bytedance.crash.nativecrash.NativeImpl.m29695e()     // Catch:{ Throwable -> 0x022f }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x022f }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "is_x86_devices"
            boolean r6 = com.bytedance.crash.p497f.C9898c.m29254b()     // Catch:{ Throwable -> 0x022f }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x022f }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "has_meminfo_file"
            boolean r6 = r2.mo24505f()     // Catch:{ Throwable -> 0x022f }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x022f }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "is_root"
            boolean r6 = com.bytedance.crash.nativecrash.C10008c.m29714p()     // Catch:{ Throwable -> 0x022f }
            if (r6 == 0) goto L_0x01f5
            java.lang.String r6 = "true"
            goto L_0x01f7
        L_0x01f5:
            java.lang.String r6 = "false"
        L_0x01f7:
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "anr_normal_trace"
            boolean r6 = r1.f26885q     // Catch:{ Throwable -> 0x022f }
            r7 = 1
            r6 = r6 ^ r7
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x022f }
            r3.put(r5, r6)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "anr_no_run"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x022f }
            r3.put(r5, r0)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r0 = "crash_after_crash"
            boolean r5 = com.bytedance.crash.C9912i.m29321c()     // Catch:{ Throwable -> 0x022f }
            if (r5 == 0) goto L_0x021b
            java.lang.String r5 = "true"
            goto L_0x021d
        L_0x021b:
            java.lang.String r5 = "false"
        L_0x021d:
            r3.put(r0, r5)     // Catch:{ Throwable -> 0x022f }
            r1.m29090a(r4, r3)     // Catch:{ Throwable -> 0x0224 }
            goto L_0x022f
        L_0x0224:
            r0 = move-exception
            r3 = r0
            com.bytedance.crash.e r0 = com.bytedance.crash.C9875d.m29130a()     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "NPTH_CATCH"
            r0.mo24453a(r5, r3)     // Catch:{ Throwable -> 0x022f }
        L_0x022f:
            com.bytedance.crash.upload.a r0 = com.bytedance.crash.upload.C10016a.m29765a()     // Catch:{ Throwable -> 0x023e }
            org.json.JSONObject r2 = r2.f26984a     // Catch:{ Throwable -> 0x023e }
            boolean r3 = r1.f26875g     // Catch:{ Throwable -> 0x023e }
            r0.mo24639a(r2, r10, r3)     // Catch:{ Throwable -> 0x023e }
            m29089a(r4)     // Catch:{ Throwable -> 0x023e }
            goto L_0x0248
        L_0x023e:
            r0 = move-exception
            com.bytedance.crash.e r2 = com.bytedance.crash.C9875d.m29130a()
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo24453a(r3, r0)
        L_0x0248:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p491b.C9857b.mo24427a(int, int):boolean");
    }

    /* renamed from: e */
    private boolean m29096e() {
        boolean z = !C9972a.m29504a(this.f26872c);
        if (!z || C9921b.m29364a().mo24534b() > 2000) {
            return z;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo24428b() {
        if (!f26870e) {
            synchronized (this.f26884p) {
                if (!f26870e) {
                    this.f26887s.run();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo24429c() {
        try {
            File filesDir = this.f26872c.getFilesDir();
            StringBuilder sb = new StringBuilder("has_anr_signal_");
            sb.append(C9972a.m29507c(this.f26872c).replaceAll(":", "_"));
            new File(filesDir, sb.toString()).createNewFile();
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
        this.f26886r = SystemClock.uptimeMillis();
        this.f26885q = true;
    }

    /* renamed from: d */
    public final void mo24430d() {
        try {
            File filesDir = this.f26872c.getFilesDir();
            StringBuilder sb = new StringBuilder("has_anr_signal_");
            sb.append(C9972a.m29507c(this.f26872c).replaceAll(":", "_"));
            File file = new File(filesDir, sb.toString());
            if (file.exists()) {
                file.delete();
                C9875d.m29130a().mo24453a("NPTH_DEAD_ANR", (Throwable) new RuntimeException());
            }
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
    }

    /* renamed from: b */
    private static String m29093b(float f) {
        return m29085a(f / 100.0f);
    }

    public C9857b(Context context) {
        this.f26872c = context;
        C9864g.m29116a(100, (int) C34943c.f91128x);
    }

    /* renamed from: b */
    private static JSONObject m29094b(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jSONArray.length(); i++) {
                sb.append(jSONArray.getString(i));
                sb.append(10);
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m29088a(long j) {
        if (this.f26885q) {
            this.f26885q = false;
            if (this.f26886r != -1 && j - this.f26886r > DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
                C9875d.m29130a().mo24455b("ANR_SIGNAL_LOSE");
            }
            m29095b(j);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x002e */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009c A[Catch:{ Throwable -> 0x008e, Throwable -> 0x00aa }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29095b(long r7) {
        /*
            r6 = this;
            r0 = -1
            r6.f26886r = r0
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x002e }
            android.content.Context r1 = r6.f26872c     // Catch:{ Throwable -> 0x002e }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ Throwable -> 0x002e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x002e }
            java.lang.String r3 = "has_anr_signal_"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x002e }
            android.content.Context r3 = r6.f26872c     // Catch:{ Throwable -> 0x002e }
            java.lang.String r3 = com.bytedance.crash.p504l.C9972a.m29507c(r3)     // Catch:{ Throwable -> 0x002e }
            java.lang.String r4 = ":"
            java.lang.String r5 = "_"
            java.lang.String r3 = r3.replaceAll(r4, r5)     // Catch:{ Throwable -> 0x002e }
            r2.append(r3)     // Catch:{ Throwable -> 0x002e }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x002e }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x002e }
            r0.delete()     // Catch:{ Throwable -> 0x002e }
        L_0x002e:
            org.json.JSONArray r0 = com.bytedance.crash.p491b.C9864g.m29119c()     // Catch:{ Throwable -> 0x00aa }
            r6.f26882n = r0     // Catch:{ Throwable -> 0x00aa }
            r0 = 100
            org.json.JSONArray r0 = com.bytedance.crash.p491b.C9864g.m29112a(r0, r7)     // Catch:{ Throwable -> 0x00aa }
            r6.f26881m = r0     // Catch:{ Throwable -> 0x00aa }
            org.json.JSONObject r7 = com.bytedance.crash.p491b.C9864g.m29113a(r7)     // Catch:{ Throwable -> 0x00aa }
            r6.f26877i = r7     // Catch:{ Throwable -> 0x00aa }
            boolean r7 = r6.m29096e()     // Catch:{ Throwable -> 0x00aa }
            r6.f26883o = r7     // Catch:{ Throwable -> 0x00aa }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00aa }
            r6.f26874f = r7     // Catch:{ Throwable -> 0x00aa }
            long r7 = r6.f26874f     // Catch:{ Throwable -> 0x00aa }
            r6.f26880l = r7     // Catch:{ Throwable -> 0x00aa }
            boolean r7 = com.bytedance.crash.C9912i.m29321c()     // Catch:{ Throwable -> 0x00aa }
            r8 = 1
            r7 = r7 ^ r8
            r6.f26875g = r7     // Catch:{ Throwable -> 0x00aa }
            java.io.File r7 = new java.io.File     // Catch:{ Throwable -> 0x00aa }
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x00aa }
            android.content.Context r1 = r6.f26872c     // Catch:{ Throwable -> 0x00aa }
            java.io.File r1 = com.bytedance.crash.p504l.C9992m.m29591a(r1)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r2 = com.bytedance.crash.p504l.C9992m.m29597b()     // Catch:{ Throwable -> 0x00aa }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r1 = "trace"
            r7.<init>(r0, r1)     // Catch:{ Throwable -> 0x00aa }
            java.io.File r0 = r7.getParentFile()     // Catch:{ Throwable -> 0x00aa }
            r0.mkdirs()     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ Throwable -> 0x00aa }
            com.bytedance.crash.nativecrash.NativeImpl.m29694e(r0)     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ Throwable -> 0x008e }
            org.json.JSONArray r0 = com.bytedance.crash.p504l.C9982g.m29550b(r0)     // Catch:{ Throwable -> 0x008e }
            r6.f26878j = r0     // Catch:{ Throwable -> 0x008e }
            org.json.JSONArray r0 = r6.f26878j     // Catch:{ Throwable -> 0x008e }
            r6.m29092a(r0)     // Catch:{ Throwable -> 0x008e }
            goto L_0x0098
        L_0x008e:
            r0 = move-exception
            com.bytedance.crash.e r1 = com.bytedance.crash.C9875d.m29130a()     // Catch:{ Throwable -> 0x00aa }
            java.lang.String r2 = "NPTH_CATCH"
            r1.mo24453a(r2, r0)     // Catch:{ Throwable -> 0x00aa }
        L_0x0098:
            org.json.JSONObject r0 = r6.f26876h     // Catch:{ Throwable -> 0x00aa }
            if (r0 != 0) goto L_0x00a2
            org.json.JSONObject r8 = com.bytedance.crash.p491b.C9861d.m29103a(r8)     // Catch:{ Throwable -> 0x00aa }
            r6.f26876h = r8     // Catch:{ Throwable -> 0x00aa }
        L_0x00a2:
            java.io.File r7 = r7.getParentFile()     // Catch:{ Throwable -> 0x00aa }
            com.bytedance.crash.p504l.C9982g.m29547a(r7)     // Catch:{ Throwable -> 0x00aa }
            return
        L_0x00aa:
            r7 = move-exception
            com.bytedance.crash.e r8 = com.bytedance.crash.C9875d.m29130a()
            java.lang.String r0 = "NPTH_CATCH"
            r8.mo24453a(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p491b.C9857b.m29095b(long):void");
    }

    /* renamed from: a */
    private static void m29089a(String str) {
        for (C9900g a : C9918j.m29337b().f26863e) {
            try {
                a.mo24413a(CrashType.ANR, str, null);
            } catch (Throwable th) {
                C9875d.m29130a().mo24453a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: a */
    private static String m29086a(float f, float f2) {
        if (f2 > 0.0f) {
            return m29085a(f / f2);
        }
        if (f > 0.0f) {
            return "100%";
        }
        return "0%";
    }

    /* renamed from: a */
    private static JSONObject m29087a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArray);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0363, code lost:
        r0 = r5.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x036d, code lost:
        if (r0.startsWith("Load:") == false) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x036f, code lost:
        r0 = r0.replace("Load:", "").trim().split("/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0383, code lost:
        if (3 != r0.length) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0385, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0387, code lost:
        if (r2 >= r0.length) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0389, code lost:
        r6[r2] = java.lang.Float.valueOf(r0[r2]).floatValue();
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0398, code lost:
        r0 = 4;
        r5 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x039b, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0196, code lost:
        if (r4 >= r13.length) goto L_0x0198;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02b1 A[LOOP:3: B:92:0x01ed->B:133:0x02b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0402 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03f0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x02ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29090a(java.lang.String r28, org.json.JSONObject r29) throws org.json.JSONException {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            android.os.SystemClock.uptimeMillis()
            java.lang.String r2 = "\n"
            r3 = r28
            java.lang.String[] r2 = r3.split(r2)
            java.lang.String r3 = "unknown"
            java.lang.String r4 = "unknown"
            r5 = 3
            float[] r6 = new float[r5]
            r6 = {-1082130432, -1082130432, -1082130432} // fill-array
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            int r12 = r2.length
            r14 = r3
            r15 = r4
            r3 = 0
            r4 = 0
            r16 = 0
        L_0x0039:
            if (r3 >= r12) goto L_0x03fe
            r5 = r2[r3]
            boolean r17 = android.text.TextUtils.isEmpty(r5)
            if (r17 != 0) goto L_0x03e1
            r17 = 1
            switch(r4) {
                case 0: goto L_0x03ae;
                case 1: goto L_0x02db;
                case 2: goto L_0x02cd;
                case 3: goto L_0x0057;
                default: goto L_0x0048;
            }
        L_0x0048:
            r20 = r2
            r21 = r4
            r26 = r10
            r23 = r12
            r24 = r15
            r4 = 3
            r18 = 0
            goto L_0x03d9
        L_0x0057:
            java.lang.String r13 = "\\s"
            java.lang.String[] r13 = r5.split(r13)
            r20 = r2
            int r2 = r13.length
            r21 = r4
            r4 = 2
            if (r2 < r4) goto L_0x02c2
            java.lang.String r2 = "CPU"
            r18 = 0
            r4 = r13[r18]
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x00b7
            java.lang.String r2 = "usage"
            r4 = r13[r17]
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x00b7
            java.lang.String r2 = "ago"
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x0085
            r16 = 1
        L_0x0085:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x00ae
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x00ae
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x00ae
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x00ae
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L_0x00a4
            goto L_0x00ae
        L_0x00a4:
            r26 = r10
            r23 = r12
            r5 = r21
            r0 = 4
            r4 = 3
            goto L_0x03de
        L_0x00ae:
            r26 = r10
            r23 = r12
            r0 = 4
            r4 = 3
            r5 = 4
            goto L_0x03de
        L_0x00b7:
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x00d6
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x00d6
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L_0x00d6
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto L_0x00d6
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L_0x00d6
            goto L_0x00ae
        L_0x00d6:
            java.lang.String r2 = ""
            boolean r4 = r7.isEmpty()
            r19 = 0
            if (r4 == 0) goto L_0x00f3
            r4 = r13[r17]
            r22 = r2
            java.lang.String r2 = "TOTAL:"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x00f5
            r0 = r7
            r23 = r12
        L_0x00ef:
            r2 = r22
            goto L_0x0186
        L_0x00f3:
            r22 = r2
        L_0x00f5:
            android.content.Context r2 = r0.f26872c
            java.lang.String r2 = r2.getPackageName()
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L_0x014e
            r2 = 0
        L_0x0102:
            int r4 = r13.length
            if (r2 >= r4) goto L_0x014a
            r4 = r13[r2]
            android.content.Context r5 = r0.f26872c
            java.lang.String r5 = r5.getPackageName()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0141
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = r13[r2]
            r0 = r13[r2]
            r23 = r12
            r12 = 47
            int r0 = r0.indexOf(r12)
            int r0 = r0 + 1
            r12 = r13[r2]
            int r12 = r12.length()
            int r12 = r12 + -1
            java.lang.String r0 = r5.substring(r0, r12)
            r4.append(r0)
            r0 = 95
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r22 = r0
            goto L_0x0143
        L_0x0141:
            r23 = r12
        L_0x0143:
            int r2 = r2 + 1
            r12 = r23
            r0 = r27
            goto L_0x0102
        L_0x014a:
            r23 = r12
            r0 = r9
            goto L_0x00ef
        L_0x014e:
            r23 = r12
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = "system_server:"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0160
            r0 = r8
            goto L_0x00ef
        L_0x0160:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0171
            java.lang.String r0 = "kswapd"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0171
            r0 = r11
            goto L_0x00ef
        L_0x0171:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0182
            java.lang.String r0 = "dex2oat"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0182
            r0 = r10
            goto L_0x00ef
        L_0x0182:
            r0 = r19
            goto L_0x00ef
        L_0x0186:
            if (r0 == 0) goto L_0x02bd
            r4 = 0
        L_0x0189:
            r5 = r13[r4]
            java.lang.String r12 = "%"
            boolean r5 = r5.contains(r12)
            if (r5 != 0) goto L_0x0198
            int r4 = r4 + 1
            int r5 = r13.length
            if (r4 < r5) goto L_0x0189
        L_0x0198:
            r12 = r13[r4]     // Catch:{ Throwable -> 0x01ce }
            java.lang.String r5 = "%"
            r24 = r15
            java.lang.String r15 = ""
            java.lang.String r5 = r12.replace(r5, r15)     // Catch:{ Throwable -> 0x01d0 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Throwable -> 0x01d0 }
            float r5 = r5.floatValue()     // Catch:{ Throwable -> 0x01d0 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01d0 }
            r12.<init>()     // Catch:{ Throwable -> 0x01d0 }
            r12.append(r2)     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r15 = "total"
            r12.append(r15)     // Catch:{ Throwable -> 0x01d0 }
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x01d0 }
            if (r0 != r7) goto L_0x01c0
            goto L_0x01c6
        L_0x01c0:
            int r15 = com.bytedance.crash.p504l.C9978d.m29528d()     // Catch:{ Throwable -> 0x01d0 }
            float r15 = (float) r15     // Catch:{ Throwable -> 0x01d0 }
            float r5 = r5 / r15
        L_0x01c6:
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Throwable -> 0x01d0 }
            r0.put(r12, r5)     // Catch:{ Throwable -> 0x01d0 }
            goto L_0x01ea
        L_0x01ce:
            r24 = r15
        L_0x01d0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r12 = "total"
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r15 = java.lang.Float.valueOf(r12)
            r0.put(r5, r15)
        L_0x01ea:
            int r4 = r4 + 3
            r5 = 0
        L_0x01ed:
            int r12 = r13.length
            if (r4 >= r12) goto L_0x02ba
            switch(r5) {
                case 0: goto L_0x01f4;
                case 1: goto L_0x0202;
                case 2: goto L_0x0210;
                case 3: goto L_0x021e;
                case 4: goto L_0x022c;
                case 5: goto L_0x023a;
                default: goto L_0x01f3;
            }
        L_0x01f3:
            goto L_0x0248
        L_0x01f4:
            java.lang.String r15 = "user"
            r12 = r13[r4]
            boolean r12 = r15.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x0202
            java.lang.String r5 = "user"
            r12 = 1
            goto L_0x024b
        L_0x0202:
            java.lang.String r12 = "kernel"
            r15 = r13[r4]
            boolean r12 = r12.equalsIgnoreCase(r15)
            if (r12 == 0) goto L_0x0210
            java.lang.String r5 = "kernel"
            r12 = 2
            goto L_0x024b
        L_0x0210:
            java.lang.String r12 = "iowait"
            r15 = r13[r4]
            boolean r12 = r12.equalsIgnoreCase(r15)
            if (r12 == 0) goto L_0x021e
            java.lang.String r5 = "iowait"
            r12 = 3
            goto L_0x024b
        L_0x021e:
            java.lang.String r12 = "irq"
            r15 = r13[r4]
            boolean r12 = r12.equalsIgnoreCase(r15)
            if (r12 == 0) goto L_0x022c
            java.lang.String r5 = "irq"
            r12 = 4
            goto L_0x024b
        L_0x022c:
            java.lang.String r12 = "softirq"
            r15 = r13[r4]
            boolean r12 = r12.equalsIgnoreCase(r15)
            if (r12 == 0) goto L_0x023a
            java.lang.String r5 = "softirq"
            r12 = 5
            goto L_0x024b
        L_0x023a:
            java.lang.String r12 = "softirq"
            r15 = r13[r4]
            boolean r12 = r12.equalsIgnoreCase(r15)
            if (r12 == 0) goto L_0x0248
            java.lang.String r5 = "softirq"
            r12 = 6
            goto L_0x024b
        L_0x0248:
            r12 = r5
            r5 = r19
        L_0x024b:
            if (r5 == 0) goto L_0x02a8
            int r15 = r4 + -1
            r15 = r13[r15]     // Catch:{ Throwable -> 0x028b }
            r25 = r13
            java.lang.String r13 = "%"
            r26 = r10
            java.lang.String r10 = ""
            java.lang.String r10 = r15.replace(r13, r10)     // Catch:{ Throwable -> 0x028f }
            java.lang.Float r10 = java.lang.Float.valueOf(r10)     // Catch:{ Throwable -> 0x028f }
            float r10 = r10.floatValue()     // Catch:{ Throwable -> 0x028f }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x028f }
            r13.<init>()     // Catch:{ Throwable -> 0x028f }
            r13.append(r2)     // Catch:{ Throwable -> 0x028f }
            r13.append(r5)     // Catch:{ Throwable -> 0x028f }
            java.lang.String r13 = r13.toString()     // Catch:{ Throwable -> 0x028f }
            if (r0 != r7) goto L_0x0277
            goto L_0x027d
        L_0x0277:
            int r15 = com.bytedance.crash.p504l.C9978d.m29528d()     // Catch:{ Throwable -> 0x028f }
            float r15 = (float) r15     // Catch:{ Throwable -> 0x028f }
            float r10 = r10 / r15
        L_0x027d:
            java.lang.Float r10 = java.lang.Float.valueOf(r10)     // Catch:{ Throwable -> 0x028f }
            r0.put(r13, r10)     // Catch:{ Throwable -> 0x028f }
            r5 = 6
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x02af
        L_0x0288:
            r26 = r10
            goto L_0x028f
        L_0x028b:
            r26 = r10
            r25 = r13
        L_0x028f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r13 = java.lang.Float.valueOf(r10)
            r0.put(r5, r13)
            goto L_0x02ae
        L_0x02a8:
            r26 = r10
            r25 = r13
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x02ae:
            r5 = 6
        L_0x02af:
            if (r12 >= r5) goto L_0x02ca
            int r4 = r4 + 3
            r5 = r12
            r13 = r25
            r10 = r26
            goto L_0x01ed
        L_0x02ba:
            r26 = r10
            goto L_0x02ca
        L_0x02bd:
            r26 = r10
            r24 = r15
            goto L_0x02ca
        L_0x02c2:
            r26 = r10
            r23 = r12
            r24 = r15
            r18 = 0
        L_0x02ca:
            r4 = 3
            goto L_0x03d9
        L_0x02cd:
            r20 = r2
            r21 = r4
            r26 = r10
            r23 = r12
            r24 = r15
            r18 = 0
            goto L_0x0363
        L_0x02db:
            r20 = r2
            r21 = r4
            r26 = r10
            r23 = r12
            r24 = r15
            r18 = 0
            java.lang.String r5 = r5.trim()
            java.lang.String r0 = r5.toLowerCase()
            java.lang.String r2 = "shortmsg"
            boolean r2 = r0.startsWith(r2)
            r4 = 58
            if (r2 == 0) goto L_0x0303
            int r2 = r5.indexOf(r4)
            r5.substring(r2)
            r17 = 0
            goto L_0x0312
        L_0x0303:
            java.lang.String r2 = "reason:"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x039f
            int r2 = r5.indexOf(r4)
            r5.substring(r2)
        L_0x0312:
            java.lang.String r2 = "input dispatch"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x031e
            java.lang.String r0 = "Input dispatching timed out"
        L_0x031c:
            r15 = r0
            goto L_0x035c
        L_0x031e:
            java.lang.String r2 = "broadcast of intent"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0329
            java.lang.String r0 = "Broadcast of Intent"
            goto L_0x031c
        L_0x0329:
            java.lang.String r2 = "executing service"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x034e
            java.lang.String r0 = "executing service"
            java.lang.String r2 = "null"
            boolean r2 = r2.equalsIgnoreCase(r14)
            if (r2 == 0) goto L_0x031c
            java.lang.String r2 = "service "
            int r2 = r5.indexOf(r2)
            int r2 = r2 + 8
            java.lang.String r2 = r5.substring(r2)
            java.lang.String r2 = r2.trim()
            r15 = r0
            r14 = r2
            goto L_0x035c
        L_0x034e:
            java.lang.String r2 = "service.startforeground"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0359
            java.lang.String r0 = "not call Service.startForeground"
            goto L_0x031c
        L_0x0359:
            java.lang.String r0 = "unknown"
            goto L_0x031c
        L_0x035c:
            if (r17 == 0) goto L_0x0363
            r0 = 4
            r4 = 3
            r5 = 2
            goto L_0x03de
        L_0x0363:
            java.lang.String r0 = r5.trim()
            java.lang.String r2 = "Load:"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x039b
            java.lang.String r2 = "Load:"
            java.lang.String r4 = ""
            java.lang.String r0 = r0.replace(r2, r4)
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = "/"
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
            r4 = 3
            if (r4 != r2) goto L_0x0398
            r2 = 0
        L_0x0386:
            int r5 = r0.length
            if (r2 >= r5) goto L_0x0398
            r5 = r0[r2]
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            float r5 = r5.floatValue()
            r6[r2] = r5
            int r2 = r2 + 1
            goto L_0x0386
        L_0x0398:
            r0 = 4
            r5 = 3
            goto L_0x03de
        L_0x039b:
            r4 = 3
            r5 = r21
            goto L_0x03dd
        L_0x039f:
            r4 = 3
            java.lang.String r2 = "appfreeze"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x03d9
            java.lang.String r0 = "AppFreeze"
            r5 = 10
            r15 = r0
            goto L_0x03dd
        L_0x03ae:
            r20 = r2
            r21 = r4
            r26 = r10
            r23 = r12
            r24 = r15
            r4 = 3
            r18 = 0
            java.lang.String r0 = r5.trim()
            java.lang.String r2 = "tag:"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x03d9
            java.lang.String r2 = "tag:"
            java.lang.String r5 = ""
            java.lang.String r0 = r0.replace(r2, r5)
            java.lang.String r0 = r0.trim()
            r14 = r0
            r15 = r24
            r0 = 4
            r5 = 1
            goto L_0x03de
        L_0x03d9:
            r5 = r21
            r15 = r24
        L_0x03dd:
            r0 = 4
        L_0x03de:
            if (r5 >= r0) goto L_0x0402
            goto L_0x03f0
        L_0x03e1:
            r20 = r2
            r21 = r4
            r26 = r10
            r23 = r12
            r24 = r15
            r4 = 3
            r18 = 0
            r5 = r21
        L_0x03f0:
            int r3 = r3 + 1
            r4 = r5
            r2 = r20
            r12 = r23
            r10 = r26
            r0 = r27
            r5 = 3
            goto L_0x0039
        L_0x03fe:
            r26 = r10
            r24 = r15
        L_0x0402:
            java.lang.String r0 = "anr_tag"
            r1.put(r0, r14)
            java.lang.String r0 = "anr_has_ago"
            java.lang.String r2 = java.lang.String.valueOf(r16)
            r1.put(r0, r2)
            java.lang.String r0 = "anr_reason"
            r1.put(r0, r15)
            java.lang.String r0 = "app"
            m29091a(r9, r1, r0)
            java.lang.String r0 = "total"
            m29091a(r7, r1, r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x042d
            java.lang.String r0 = "npth_anr_systemserver_total"
            java.lang.String r2 = "not found"
            r1.put(r0, r2)
            goto L_0x043e
        L_0x042d:
            java.lang.String r0 = "npth_anr_systemserver_total"
            java.lang.Float r2 = com.bytedance.crash.p504l.C9995o.m29624a(r8)
            float r2 = r2.floatValue()
            java.lang.String r2 = m29093b(r2)
            r1.put(r0, r2)
        L_0x043e:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x044c
            java.lang.String r0 = "npth_anr_kswapd_total"
            java.lang.String r2 = "not found"
            r1.put(r0, r2)
            goto L_0x045d
        L_0x044c:
            java.lang.String r0 = "npth_anr_kswapd_total"
            java.lang.Float r2 = com.bytedance.crash.p504l.C9995o.m29624a(r11)
            float r2 = r2.floatValue()
            java.lang.String r2 = m29093b(r2)
            r1.put(r0, r2)
        L_0x045d:
            boolean r0 = r26.isEmpty()
            if (r0 == 0) goto L_0x046b
            java.lang.String r0 = "npth_anr_dex2oat_total"
            java.lang.String r2 = "not found"
            r1.put(r0, r2)
            return
        L_0x046b:
            java.lang.String r0 = "npth_anr_dex2oat_total"
            java.lang.Float r2 = com.bytedance.crash.p504l.C9995o.m29624a(r26)
            float r2 = r2.floatValue()
            java.lang.String r2 = m29093b(r2)
            r1.put(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p491b.C9857b.m29090a(java.lang.String, org.json.JSONObject):void");
    }

    /* renamed from: a */
    private static void m29091a(HashMap<String, Float> hashMap, JSONObject jSONObject, String str) throws JSONException {
        StringBuilder sb = new StringBuilder("npth_anr_");
        sb.append(str);
        String sb2 = sb.toString();
        if (hashMap.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("_total");
            jSONObject.put(sb3.toString(), "not found");
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            if (str2.endsWith("user")) {
                f += ((Float) entry.getValue()).floatValue();
            } else if (str2.endsWith("kernel")) {
                f2 += ((Float) entry.getValue()).floatValue();
            } else if (str2.endsWith("iowait")) {
                f3 += ((Float) entry.getValue()).floatValue();
            } else if (str2.endsWith("irq")) {
                f4 += ((Float) entry.getValue()).floatValue();
            } else if (str2.endsWith("softirq")) {
                f5 += ((Float) entry.getValue()).floatValue();
            }
        }
        float f6 = f + f2 + f3 + f4 + f5;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb2);
        sb4.append("_total");
        jSONObject.put(sb4.toString(), m29093b(f6));
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb2);
        sb5.append("_kernel_user_ratio");
        jSONObject.put(sb5.toString(), m29086a(f2, f6));
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb2);
        sb6.append("_iowait_user_ratio");
        jSONObject.put(sb6.toString(), m29086a(f3, f6));
    }
}
