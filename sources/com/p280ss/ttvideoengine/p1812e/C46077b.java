package com.p280ss.ttvideoengine.p1812e;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.e.b */
public final class C46077b {

    /* renamed from: a */
    public String f117772a;

    /* renamed from: b */
    public String f117773b;

    /* renamed from: c */
    public int f117774c;

    /* renamed from: d */
    public int f117775d;

    /* renamed from: e */
    public int f117776e;

    /* renamed from: f */
    public long f117777f;

    /* renamed from: g */
    public long f117778g;

    /* renamed from: h */
    public C46076a f117779h;

    /* renamed from: i */
    public C46076a f117780i;

    /* renamed from: a */
    public final C46076a mo112211a() {
        if (this.f117779h != null) {
            return this.f117779h;
        }
        if (this.f117780i != null) {
            return this.f117780i;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo112212a(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("live_info");
            try {
                if (optJSONObject.has("live_0")) {
                    this.f117779h = new C46076a();
                    this.f117779h.mo112210a(optJSONObject.getJSONObject("live_0"));
                }
                if (optJSONObject.has("live_1")) {
                    this.f117780i = new C46076a();
                    this.f117780i.mo112210a(optJSONObject.getJSONObject("live_1"));
                }
                this.f117774c = optJSONObject.optInt("backup_status");
                this.f117775d = optJSONObject.optInt("live_status");
                this.f117776e = optJSONObject.optInt("status");
                this.f117777f = optJSONObject.optLong("start_time");
                this.f117778g = optJSONObject.optLong("end_time");
            } catch (JSONException unused) {
            }
            this.f117772a = jSONObject.optString("user_id");
            this.f117773b = jSONObject.optString("live_id");
        }
    }
}
