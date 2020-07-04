package com.bytedance.ttnet.p672d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C6312h;
import com.bytedance.ttnet.utils.C13002e;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.d.b */
public final class C12970b {

    /* renamed from: d */
    private static final Object f34338d = new Object();

    /* renamed from: a */
    public C12969a f34339a;

    /* renamed from: b */
    private Context f34340b;

    /* renamed from: c */
    private boolean f34341c = true;

    /* renamed from: b */
    public final void mo31488b() {
        String str;
        try {
            String a = C13002e.m37943a(this.f34340b, 4);
            if (!TextUtils.isEmpty(a)) {
                C12969a b = m37796b(new JSONObject(a));
                if (C6312h.m19578b()) {
                    StringBuilder sb = new StringBuilder("loadLocalConfigForOtherProcess, config: ");
                    if (b == null) {
                        str = TEVideoRecorder.FACE_BEAUTY_NULL;
                    } else {
                        str = b.toString();
                    }
                    sb.append(str);
                }
                if (b != null) {
                    this.f34339a = b;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo31486a() {
        String str;
        if (this.f34341c) {
            String string = C7285c.m22838a(this.f34340b, "ttnet_tnc_config", 0).getString("tnc_config_str", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    C12969a b = m37796b(new JSONObject(string));
                    if (b != null) {
                        this.f34339a = b;
                    }
                    if (C6312h.m19578b()) {
                        StringBuilder sb = new StringBuilder("loadLocalConfig: ");
                        if (b == null) {
                            str = TEVideoRecorder.FACE_BEAUTY_NULL;
                        } else {
                            str = b.toString();
                        }
                        sb.append(str);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private static C12969a m37796b(JSONObject jSONObject) {
        boolean z;
        try {
            C12969a aVar = new C12969a();
            boolean z2 = true;
            if (jSONObject.has("local_enable")) {
                if (jSONObject.getInt("local_enable") == 0) {
                    z = false;
                } else {
                    z = true;
                }
                aVar.f34325a = z;
            }
            if (jSONObject.has("probe_enable")) {
                if (jSONObject.getInt("probe_enable") == 0) {
                    z2 = false;
                }
                aVar.f34326b = z2;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, Integer.valueOf(0));
                        }
                    }
                }
                aVar.f34327c = hashMap;
            } else {
                aVar.f34327c = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap hashMap2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        String string2 = jSONObject2.getString(str);
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(string2)) {
                            hashMap2.put(str, string2);
                        }
                    }
                }
                aVar.f34328d = hashMap2;
            } else {
                aVar.f34328d = null;
            }
            aVar.f34329e = jSONObject.optInt("req_to_cnt", aVar.f34329e);
            aVar.f34330f = jSONObject.optInt("req_to_api_cnt", aVar.f34330f);
            aVar.f34331g = jSONObject.optInt("req_to_ip_cnt", aVar.f34331g);
            aVar.f34332h = jSONObject.optInt("req_err_cnt", aVar.f34332h);
            aVar.f34333i = jSONObject.optInt("req_err_api_cnt", aVar.f34333i);
            aVar.f34334j = jSONObject.optInt("req_err_ip_cnt", aVar.f34334j);
            aVar.f34335k = jSONObject.optInt("update_interval", aVar.f34335k);
            aVar.f34336l = jSONObject.optInt("update_random_range", aVar.f34336l);
            aVar.f34337m = jSONObject.optString("http_code_black", aVar.f34337m);
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x011c, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r10.f34339a = new com.bytedance.ttnet.p672d.C12969a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0127, code lost:
        monitor-enter(f34338d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r10.f34340b, "ttnet_tnc_config", 0).edit().putString("tnc_config_str", r0).apply();
        com.bytedance.ttnet.utils.C13002e.m37944a(r10.f34340b, 4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0149, code lost:
        monitor-enter(f34338d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r10.f34340b, "ttnet_tnc_config", 0).edit().putString("tnc_config_str", r0).apply();
        com.bytedance.ttnet.utils.C13002e.m37944a(r10.f34340b, 4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0165, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x011e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31487a(org.json.JSONObject r11) {
        /*
            r10 = this;
            boolean r0 = r10.f34341c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = ""
            r1 = 4
            r2 = 0
            java.lang.String r3 = "ttnet_url_dispatcher_enabled"
            int r3 = r11.optInt(r3, r2)     // Catch:{ Throwable -> 0x011e }
            if (r3 <= 0) goto L_0x0013
            r3 = 1
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            java.lang.String r4 = "ttnet_dispatch_actions"
            org.json.JSONArray r4 = r11.optJSONArray(r4)     // Catch:{ Throwable -> 0x011e }
            r5 = 0
            boolean r6 = com.bytedance.ttnet.C12961d.m37791g()     // Catch:{ Throwable -> 0x011e }
            if (r6 == 0) goto L_0x008c
            if (r3 == 0) goto L_0x008c
            if (r4 == 0) goto L_0x008c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x011e }
            r3.<init>()     // Catch:{ Throwable -> 0x011e }
            r6 = 0
        L_0x002b:
            int r7 = r4.length()     // Catch:{ Throwable -> 0x011e }
            if (r6 >= r7) goto L_0x0059
            java.lang.Object r7 = r4.get(r6)     // Catch:{ Throwable -> 0x011e }
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ Throwable -> 0x011e }
            java.lang.String r8 = "param"
            org.json.JSONObject r7 = r7.getJSONObject(r8)     // Catch:{ Throwable -> 0x011e }
            java.lang.String r8 = "service_name"
            java.lang.String r9 = ""
            java.lang.String r8 = r7.optString(r8, r9)     // Catch:{ Throwable -> 0x011e }
            java.lang.String r9 = "idc_selection"
            boolean r8 = r8.equals(r9)     // Catch:{ Throwable -> 0x011e }
            if (r8 == 0) goto L_0x0056
            java.lang.String r8 = "strategy_info"
            org.json.JSONObject r7 = r7.getJSONObject(r8)     // Catch:{ Throwable -> 0x011e }
            r3.add(r7)     // Catch:{ Throwable -> 0x011e }
        L_0x0056:
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0059:
            boolean r4 = r3.isEmpty()     // Catch:{ Throwable -> 0x011e }
            if (r4 != 0) goto L_0x008c
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x011e }
            r5.<init>()     // Catch:{ Throwable -> 0x011e }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x011e }
        L_0x0068:
            boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x011e }
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x011e }
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ Throwable -> 0x011e }
            java.util.Iterator r6 = r4.keys()     // Catch:{ Throwable -> 0x011e }
        L_0x0078:
            boolean r7 = r6.hasNext()     // Catch:{ Throwable -> 0x011e }
            if (r7 == 0) goto L_0x0068
            java.lang.Object r7 = r6.next()     // Catch:{ Throwable -> 0x011e }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x011e }
            java.lang.String r8 = r4.getString(r7)     // Catch:{ Throwable -> 0x011e }
            r5.put(r7, r8)     // Catch:{ Throwable -> 0x011e }
            goto L_0x0078
        L_0x008c:
            java.lang.String r3 = "tnc_config"
            org.json.JSONObject r11 = r11.optJSONObject(r3)     // Catch:{ Throwable -> 0x011e }
            if (r11 != 0) goto L_0x009f
            if (r5 == 0) goto L_0x0097
            goto L_0x009f
        L_0x0097:
            org.json.JSONException r11 = new org.json.JSONException     // Catch:{ Throwable -> 0x011e }
            java.lang.String r3 = "tnc config is null"
            r11.<init>(r3)     // Catch:{ Throwable -> 0x011e }
            throw r11     // Catch:{ Throwable -> 0x011e }
        L_0x009f:
            if (r11 != 0) goto L_0x00ac
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Throwable -> 0x011e }
            r11.<init>()     // Catch:{ Throwable -> 0x011e }
            java.lang.String r3 = "host_replace_map"
            r11.put(r3, r5)     // Catch:{ Throwable -> 0x011e }
            goto L_0x00b3
        L_0x00ac:
            if (r5 == 0) goto L_0x00b3
            java.lang.String r3 = "host_replace_map"
            r11.put(r3, r5)     // Catch:{ Throwable -> 0x011e }
        L_0x00b3:
            com.bytedance.ttnet.d.a r3 = m37796b(r11)     // Catch:{ Throwable -> 0x011e }
            boolean r4 = com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ Throwable -> 0x011e }
            if (r4 == 0) goto L_0x00d0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x011e }
            java.lang.String r5 = "handleConfigChanged, newConfig: "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x011e }
            if (r3 != 0) goto L_0x00c9
            java.lang.String r5 = "null"
            goto L_0x00cd
        L_0x00c9:
            java.lang.String r5 = r3.toString()     // Catch:{ Throwable -> 0x011e }
        L_0x00cd:
            r4.append(r5)     // Catch:{ Throwable -> 0x011e }
        L_0x00d0:
            if (r3 != 0) goto L_0x00f4
            java.lang.Object r4 = f34338d
            monitor-enter(r4)
            android.content.Context r11 = r10.f34340b     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = "ttnet_tnc_config"
            android.content.SharedPreferences r11 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r11, r3, r2)     // Catch:{ all -> 0x00f1 }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = "tnc_config_str"
            android.content.SharedPreferences$Editor r11 = r11.putString(r2, r0)     // Catch:{ all -> 0x00f1 }
            r11.apply()     // Catch:{ all -> 0x00f1 }
            android.content.Context r11 = r10.f34340b     // Catch:{ all -> 0x00f1 }
            com.bytedance.ttnet.utils.C13002e.m37944a(r11, r1, r0)     // Catch:{ all -> 0x00f1 }
            monitor-exit(r4)     // Catch:{ all -> 0x00f1 }
            return
        L_0x00f1:
            r11 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f1 }
            throw r11
        L_0x00f4:
            r10.f34339a = r3     // Catch:{ Throwable -> 0x011e }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x011e }
            java.lang.Object r3 = f34338d
            monitor-enter(r3)
            android.content.Context r0 = r10.f34340b     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = "ttnet_tnc_config"
            android.content.SharedPreferences r0 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r0, r4, r2)     // Catch:{ all -> 0x0119 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0119 }
            java.lang.String r2 = "tnc_config_str"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r11)     // Catch:{ all -> 0x0119 }
            r0.apply()     // Catch:{ all -> 0x0119 }
            android.content.Context r0 = r10.f34340b     // Catch:{ all -> 0x0119 }
            com.bytedance.ttnet.utils.C13002e.m37944a(r0, r1, r11)     // Catch:{ all -> 0x0119 }
            monitor-exit(r3)     // Catch:{ all -> 0x0119 }
            goto L_0x0143
        L_0x0119:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0119 }
            throw r11
        L_0x011c:
            r11 = move-exception
            goto L_0x0147
        L_0x011e:
            com.bytedance.ttnet.d.a r11 = new com.bytedance.ttnet.d.a     // Catch:{ all -> 0x011c }
            r11.<init>()     // Catch:{ all -> 0x011c }
            r10.f34339a = r11     // Catch:{ all -> 0x011c }
            java.lang.Object r11 = f34338d
            monitor-enter(r11)
            android.content.Context r3 = r10.f34340b     // Catch:{ all -> 0x0144 }
            java.lang.String r4 = "ttnet_tnc_config"
            android.content.SharedPreferences r2 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r3, r4, r2)     // Catch:{ all -> 0x0144 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "tnc_config_str"
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r0)     // Catch:{ all -> 0x0144 }
            r2.apply()     // Catch:{ all -> 0x0144 }
            android.content.Context r2 = r10.f34340b     // Catch:{ all -> 0x0144 }
            com.bytedance.ttnet.utils.C13002e.m37944a(r2, r1, r0)     // Catch:{ all -> 0x0144 }
            monitor-exit(r11)     // Catch:{ all -> 0x0144 }
        L_0x0143:
            return
        L_0x0144:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0144 }
            throw r0
        L_0x0147:
            java.lang.Object r3 = f34338d
            monitor-enter(r3)
            android.content.Context r4 = r10.f34340b     // Catch:{ all -> 0x0166 }
            java.lang.String r5 = "ttnet_tnc_config"
            android.content.SharedPreferences r2 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r4, r5, r2)     // Catch:{ all -> 0x0166 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x0166 }
            java.lang.String r4 = "tnc_config_str"
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r0)     // Catch:{ all -> 0x0166 }
            r2.apply()     // Catch:{ all -> 0x0166 }
            android.content.Context r2 = r10.f34340b     // Catch:{ all -> 0x0166 }
            com.bytedance.ttnet.utils.C13002e.m37944a(r2, r1, r0)     // Catch:{ all -> 0x0166 }
            monitor-exit(r3)     // Catch:{ all -> 0x0166 }
            throw r11
        L_0x0166:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0166 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p672d.C12970b.mo31487a(org.json.JSONObject):void");
    }

    public C12970b(Context context, boolean z) {
        this.f34340b = context;
        this.f34341c = z;
        this.f34339a = new C12969a();
    }
}
