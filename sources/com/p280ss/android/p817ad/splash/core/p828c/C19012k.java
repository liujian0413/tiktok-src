package com.p280ss.android.p817ad.splash.core.p828c;

import com.p280ss.android.p817ad.splash.p836g.C19126e;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.k */
public final class C19012k {

    /* renamed from: a */
    public List<String> f51349a;

    /* renamed from: b */
    public List<String> f51350b;

    /* renamed from: c */
    public List<String> f51351c;

    /* renamed from: d */
    public String f51352d;

    /* renamed from: e */
    public long f51353e;

    /* renamed from: f */
    public boolean f51354f;

    /* renamed from: g */
    public int f51355g;

    /* renamed from: h */
    public int f51356h;

    /* renamed from: a */
    public final boolean mo50509a() {
        if (C19132j.m62736a(this.f51352d) || this.f51355g <= 0 || C19126e.m62680a(this.f51351c) || C19132j.m62736a((String) this.f51351c.get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo50508a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("play_track_url_list");
        if (!(optJSONArray == null || optJSONArray.length() == 0)) {
            this.f51349a = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    this.f51349a.add(optJSONArray.getString(i));
                } catch (JSONException unused) {
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("playover_track_url_list");
        if (!(optJSONArray2 == null || optJSONArray2.length() == 0)) {
            this.f51350b = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                try {
                    this.f51350b.add(optJSONArray2.getString(i2));
                } catch (Exception unused2) {
                }
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("video_url_list");
        if (!(optJSONArray3 == null || optJSONArray3.length() == 0)) {
            this.f51351c = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                try {
                    this.f51351c.add(optJSONArray3.getString(i3));
                } catch (Exception unused3) {
                }
            }
        }
        this.f51352d = jSONObject.optString("video_id");
        this.f51353e = jSONObject.optLong("video_group_id");
        this.f51354f = jSONObject.optBoolean("voice_switch");
        String optString = jSONObject.optString("video_density");
        int indexOf = optString.indexOf("x");
        if (indexOf >= 0) {
            int i4 = indexOf + 1;
            if (i4 < optString.length()) {
                this.f51356h = Integer.parseInt(optString.substring(0, indexOf));
                this.f51355g = Integer.parseInt(optString.substring(i4));
            }
        }
    }
}
