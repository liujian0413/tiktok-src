package com.p280ss.android.deviceregister;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.C6317k;
import com.bytedance.common.utility.C6317k.C6318a;
import com.bytedance.common.utility.CommonHttpException;
import com.bytedance.common.utility.p254b.C6304f;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.deviceregister.p290b.C6782a;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.usergrowth.C7304c;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.m */
final class C6794m {

    /* renamed from: a */
    private static volatile C6794m f19384a;

    /* renamed from: c */
    private static final AtomicBoolean f19385c = new AtomicBoolean(false);

    /* renamed from: d */
    private static String[] f19386d;

    /* renamed from: b */
    private final AtomicLong f19387b = new AtomicLong(-1);

    /* renamed from: com.ss.android.deviceregister.m$a */
    interface C6799a {
        /* renamed from: a */
        void mo16616a(Object obj);
    }

    /* renamed from: com.ss.android.deviceregister.m$b */
    static final class C6800b implements Runnable {

        /* renamed from: a */
        private final String f19389a;

        /* renamed from: b */
        private final String[] f19390b;

        /* renamed from: c */
        private final boolean f19391c = false;

        /* renamed from: d */
        private final C6799a f19392d;

        /* renamed from: e */
        private final Object f19393e;

        public final void run() {
            String str;
            StringBuilder sb = new StringBuilder("encrypt=");
            sb.append(this.f19391c);
            sb.append(" urls=");
            sb.append(Arrays.toString(this.f19390b));
            if (this.f19390b != null && this.f19390b.length != 0) {
                String[] strArr = this.f19390b;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    new StringBuilder("for-loop-start, url=").append(str2);
                    try {
                        if (this.f19391c) {
                            byte[] b = C6794m.m21131b(this.f19389a);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append("?tt_data=a");
                            String sb3 = sb2.toString();
                            HashMap hashMap = new HashMap();
                            hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
                            str = C6317k.m19580a().mo15154a(sb3, b, (Map<String, String>) hashMap, (C6318a) null);
                        } else {
                            str = C6317k.m19580a().mo15155a(str2, C6794m.m21128a(this.f19389a), true, "application/json; charset=utf-8", false);
                        }
                        new StringBuilder("response=").append(str);
                        if (this.f19392d != null) {
                            this.f19392d.mo16616a(this.f19393e);
                        }
                        return;
                    } catch (CommonHttpException | IOException unused) {
                        i++;
                    }
                }
            }
        }

        C6800b(String str, String[] strArr, boolean z, C6799a aVar, Object obj) {
            this.f19389a = str;
            this.f19390b = strArr;
            this.f19392d = aVar;
            this.f19393e = obj;
        }
    }

    /* renamed from: com.ss.android.deviceregister.m$c */
    static class C6801c extends C6304f {
        private C6801c() {
        }

        public final void run() {
            List<C19331j> f = C19335n.m63429a().mo51265f();
            if (f != null && !f.isEmpty()) {
                for (C19331j jVar : f) {
                    if (!C6793k.m21104a().mo16607b(jVar.f52271a)) {
                        C6794m.m21126a(jVar);
                    }
                }
                for (C19331j jVar2 : f) {
                    if (System.currentTimeMillis() - jVar2.f52272b.longValue() > TimeUnit.DAYS.toMillis(7)) {
                        new StringBuilder("timestampActiveUserId=").append(jVar2.f52271a);
                        C19335n.m63429a().mo51260b(jVar2.f52271a.intValue());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.deviceregister.m$d */
    static class C6802d extends C6304f {
        private C6802d() {
        }

        public final void run() {
            List<C19334l> g = C19335n.m63429a().mo51266g();
            if (g != null && !g.isEmpty()) {
                for (C19334l a : g) {
                    C6794m.m21127a(a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.deviceregister.m$e */
    static class C6803e extends C6304f {
        private C6803e() {
        }

        public final void run() {
            List<C19326i> e = C19335n.m63429a().mo51264e();
            if (e != null && !e.isEmpty()) {
                for (C19326i iVar : e) {
                    if (!C6793k.m21104a().mo16603a(iVar.f52245k)) {
                        C6794m.m21125a(iVar);
                    }
                }
                for (C19326i iVar2 : e) {
                    if (System.currentTimeMillis() - iVar2.f52235a.longValue() > TimeUnit.DAYS.toMillis(7)) {
                        new StringBuilder("timestampPrimaryId=").append(iVar2.f52245k);
                        C19335n.m63429a().mo51255a(iVar2.f52245k.intValue());
                    }
                }
            }
        }
    }

    private C6794m() {
    }

    /* renamed from: a */
    static C6794m m21123a() {
        if (f19384a == null) {
            synchronized (C6794m.class) {
                if (f19384a == null) {
                    f19384a = new C6794m();
                }
            }
        }
        return f19384a;
    }

    /* renamed from: c */
    private static String[] m21132c() {
        if (f19385c.compareAndSet(false, true)) {
            String[] b = C6782a.m20999b();
            String[] strArr = new String[b.length];
            for (int i = 0; i < b.length; i++) {
                String str = b[i];
                Context context = AppProvider.f19295a;
                if (context != null) {
                    str = C7304c.m22878a(context, str);
                }
                strArr[i] = NetUtil.addCommonParams(str, true);
            }
            f19386d = strArr;
        }
        return f19386d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo16614b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f19387b.compareAndSet(-1, currentTimeMillis)) {
            new StringBuilder(" currentTimeMillis=").append(currentTimeMillis);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public final void run() {
                    new C6803e().start();
                    new C6801c().start();
                    new C6802d().start();
                }
            }, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
    }

    /* renamed from: a */
    public static byte[] m21128a(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    static void m21125a(C19326i iVar) {
        String[] c = m21132c();
        boolean e = C6782a.m21002e();
        C6800b bVar = new C6800b(m21124a(m21129b(iVar), "device_register").toString(), c, false, new C6799a() {
            /* renamed from: a */
            public final void mo16616a(Object obj) {
                C19335n.m63429a().mo51255a(((C19326i) obj).f52245k.intValue());
            }
        }, iVar);
        StringBuilder sb = new StringBuilder("encrypt=");
        sb.append(e);
        sb.append(" timestamp=");
        sb.append(iVar);
        new C6304f(bVar, "TimestampSender", false).start();
    }

    /* renamed from: b */
    private static JSONObject m21130b(C19331j jVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp_active_user_id", jVar.f52271a);
            jSONObject.put("active_user_invoke_internal_start", jVar.f52272b);
            jSONObject.put("active_user_invoke_internal_end", jVar.f52273c);
            jSONObject.put("internal_json_object", jVar.f52274d);
            jSONObject.put("active_thread_run", jVar.f52275e);
            jSONObject.put("active_user_start", jVar.f52276f);
            jSONObject.put("active_user_end", jVar.f52277g);
            jSONObject.put("active_user_net_start", jVar.f52278h);
            jSONObject.put("active_user_net_stacktrace", jVar.f52279i);
            jSONObject.put("net_url", jVar.f52280j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    static void m21126a(C19331j jVar) {
        String[] c = m21132c();
        boolean e = C6782a.m21002e();
        C6800b bVar = new C6800b(m21124a(m21130b(jVar), "active_user").toString(), c, false, new C6799a() {
            /* renamed from: a */
            public final void mo16616a(Object obj) {
                C19335n.m63429a().mo51260b(((C19331j) obj).f52271a.intValue());
            }
        }, jVar);
        StringBuilder sb = new StringBuilder("encrypt=");
        sb.append(e);
        sb.append(" timestampActiveUser=");
        sb.append(jVar);
        new C6304f(bVar, "TimestampSender", false).start();
    }

    /* renamed from: b */
    private static JSONObject m21129b(C19326i iVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (C19328a aVar : iVar.f52242h) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("net_request_start", aVar.f52246a);
                jSONObject2.put("net_request_end", aVar.f52247b);
                jSONObject2.put("url", aVar.f52248c);
                jSONObject2.put("data", aVar.f52249d);
                jSONObject2.put("exception", aVar.f52250e);
                jSONObject2.put("error_message", aVar.f52251f);
                jSONObject2.put("n_try", aVar.f52252g);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("timestampPrimaryId", iVar.f52245k);
            jSONObject.put("init_start", iVar.f52235a);
            jSONObject.put("init_end", iVar.f52236b);
            jSONObject.put("prepare_param_start", iVar.f52237c);
            jSONObject.put("prepare_param_end", iVar.f52238d);
            jSONObject.put("load_cache_start", iVar.f52239e);
            jSONObject.put("load_cache_end", iVar.f52240f);
            jSONObject.put("max_try_times", iVar.f52241g);
            jSONObject.put("calls", jSONArray);
            jSONObject.put("current_did", iVar.f52243i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    static void m21127a(C19334l lVar) {
        String[] c = m21132c();
        boolean e = C6782a.m21002e();
        C6800b bVar = new C6800b(m21124a(lVar.mo51253a(), "header").toString(), c, false, new C6799a() {
            /* renamed from: a */
            public final void mo16616a(Object obj) {
                C19335n.m63429a().mo51262c(((C19334l) obj).f52292b.intValue());
            }
        }, lVar);
        StringBuilder sb = new StringBuilder("encrypt=");
        sb.append(e);
        sb.append(" timestampHeader=");
        sb.append(lVar);
        new C6304f(bVar, "TimestampSender", false).start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m21131b(java.lang.String r3) throws java.io.IOException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "data="
            r0.<init>(r1)
            r0.append(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x006b
            byte[] r3 = m21128a(r3)
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x005e }
            int r2 = r3.length     // Catch:{ all -> 0x005e }
            r1.<init>(r2)     // Catch:{ all -> 0x005e }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x005a }
            r2.<init>(r1)     // Catch:{ all -> 0x005a }
            r2.write(r3)     // Catch:{ all -> 0x0058 }
            r1.close()
            r2.close()
            byte[] r3 = r1.toByteArray()
            if (r3 == 0) goto L_0x0050
            int r0 = r3.length
            if (r0 == 0) goto L_0x0050
            int r0 = r3.length
            byte[] r3 = com.bytedance.frameworks.core.encrypt.TTEncryptUtils.m19789a(r3, r0)
            if (r3 == 0) goto L_0x0048
            int r0 = r3.length
            if (r0 == 0) goto L_0x0048
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "success, encryptBytes' length="
            r0.<init>(r1)
            int r1 = r3.length
            r0.append(r1)
            return r3
        L_0x0048:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "encrypt failed!"
            r3.<init>(r0)
            throw r3
        L_0x0050:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "gzip failed!"
            r3.<init>(r0)
            throw r3
        L_0x0058:
            r3 = move-exception
            goto L_0x005c
        L_0x005a:
            r3 = move-exception
            r2 = r0
        L_0x005c:
            r0 = r1
            goto L_0x0060
        L_0x005e:
            r3 = move-exception
            r2 = r0
        L_0x0060:
            if (r0 == 0) goto L_0x0065
            r0.close()
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.close()
        L_0x006a:
            throw r3
        L_0x006b:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "empty input!"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.C6794m.m21131b(java.lang.String):byte[]");
    }

    /* renamed from: a */
    private static JSONObject m21124a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("data", jSONObject);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }
}
