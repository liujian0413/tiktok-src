package com.bytedance.p532i;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.i.a */
public final class C10280a {

    /* renamed from: a */
    public static String f27919a = "TTVideofetchSettingTime";

    /* renamed from: b */
    public static String f27920b = "TTVideoSettingFetchQuery";

    /* renamed from: f */
    public static String f27921f = "setting_config";

    /* renamed from: h */
    private static C10280a f27922h = null;

    /* renamed from: i */
    private static String f27923i = "fetchSettingInterval";

    /* renamed from: c */
    public HashMap<String, Object> f27924c;

    /* renamed from: d */
    public Context f27925d;

    /* renamed from: e */
    public boolean f27926e;

    /* renamed from: g */
    private int f27927g;

    /* renamed from: b */
    public final void mo25002b() {
        new Timer().schedule(new TimerTask() {
            public final void run() {
                C10280a.this.mo25000a();
            }
        }, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30445c() {
        /*
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            android.content.Context r2 = r11.f27925d
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r3 = f27919a
            r4 = 0
            long r2 = com.bytedance.p532i.C10285d.m30462b(r2, r3, r4)
            r6 = 86400(0x15180, double:4.26873E-319)
            android.content.Context r8 = r11.f27925d     // Catch:{ JSONException -> 0x0042 }
            com.bytedance.p532i.C10284c.m30450a(r8)     // Catch:{ JSONException -> 0x0042 }
            android.content.Context r8 = r11.f27925d     // Catch:{ JSONException -> 0x0042 }
            android.content.Context r8 = r8.getApplicationContext()     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r9 = f27921f     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r8 = com.bytedance.p532i.C10285d.m30456a(r8, r9)     // Catch:{ JSONException -> 0x0042 }
            if (r8 == 0) goto L_0x0042
            boolean r9 = r8.isEmpty()     // Catch:{ JSONException -> 0x0042 }
            if (r9 != 0) goto L_0x0042
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0042 }
            r9.<init>(r8)     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r8 = f27923i     // Catch:{ JSONException -> 0x0042 }
            boolean r8 = r9.isNull(r8)     // Catch:{ JSONException -> 0x0042 }
            if (r8 != 0) goto L_0x0042
            java.lang.String r8 = f27923i     // Catch:{ JSONException -> 0x0042 }
            long r8 = r9.getLong(r8)     // Catch:{ JSONException -> 0x0042 }
            goto L_0x0043
        L_0x0042:
            r8 = r6
        L_0x0043:
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r6 = r8
        L_0x0049:
            r4 = 0
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r2
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0056
            r11.mo25000a()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p532i.C10280a.m30445c():void");
    }

    /* renamed from: a */
    public final void mo25000a() {
        if (this.f27927g > 10) {
            this.f27927g = 0;
            return;
        }
        this.f27927g++;
        final HashMap hashMap = new HashMap();
        if (this.f27924c != null && !this.f27924c.isEmpty()) {
            Object obj = this.f27924c.get(f27920b);
            if (obj != null && (obj instanceof Map)) {
                hashMap = (HashMap) obj;
            }
        }
        hashMap.put("caller_name", C10285d.m30455a());
        hashMap.put("device_platform", "android");
        hashMap.put("os_version", C10285d.m30464c());
        hashMap.put("app", Integer.valueOf(1));
        if (hashMap.get("device_brand") == null) {
            hashMap.put("device_brand", C10285d.m30465d());
        }
        if (hashMap.get("device_type") == null) {
            hashMap.put("device_type", C10285d.m30466e().toLowerCase());
        }
        if (this.f27926e) {
            hashMap.put("debug", Integer.valueOf(1));
        }
        new Thread(new Runnable() {
            public final void run() {
                String str = "?";
                for (Entry entry : hashMap.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append("&");
                    str = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C10285d.m30463b());
                sb2.append(str);
                String a = C10285d.m30458a(sb2.toString());
                if (a == null || a.isEmpty()) {
                    C10280a.this.mo25002b();
                    return;
                }
                C10285d.m30459a(C10280a.this.f27925d.getApplicationContext(), C10280a.f27919a, System.currentTimeMillis());
                try {
                    JSONObject jSONObject = new JSONObject(a);
                    if (C10280a.this.f27926e) {
                        String str2 = C10285d.f27940a;
                        StringBuilder sb3 = new StringBuilder("videoSetting respone");
                        sb3.append(a);
                        C10285d.m30461a(str2, sb3.toString());
                    }
                    JSONObject jSONObject2 = (JSONObject) jSONObject.get("data");
                    if (jSONObject2 != null) {
                        if (!jSONObject2.isNull("app")) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("app");
                            if (jSONObject3 == null) {
                                C10280a.this.mo25002b();
                                return;
                            }
                            C10284c a2 = C10284c.m30450a(C10280a.this.f27925d);
                            if (!jSONObject3.isNull(C10280a.f27921f)) {
                                C10285d.m30460a(C10280a.this.f27925d, C10280a.f27921f, jSONObject3.getJSONObject(C10280a.f27921f).toString());
                            }
                            a2.mo25007a(jSONObject3);
                            return;
                        }
                    }
                    C10280a.this.mo25002b();
                } catch (JSONException unused) {
                }
            }
        }).start();
    }

    private C10280a(Context context) {
        this.f27925d = context;
    }

    /* renamed from: a */
    public final void mo25001a(boolean z) {
        this.f27927g = 0;
        if (z) {
            mo25000a();
        } else {
            m30445c();
        }
    }

    /* renamed from: a */
    public static synchronized C10280a m30444a(Context context) {
        C10280a aVar;
        synchronized (C10280a.class) {
            if (f27922h == null) {
                f27922h = new C10280a(context);
            }
            aVar = f27922h;
        }
        return aVar;
    }
}
