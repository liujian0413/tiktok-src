package com.p280ss.ttvideoengine.p1812e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.e.d */
public final class C46079d {

    /* renamed from: a */
    public String f117785a;

    /* renamed from: b */
    public int f117786b;

    /* renamed from: c */
    public int f117787c;

    /* renamed from: d */
    public int f117788d;

    /* renamed from: e */
    public long f117789e;

    /* renamed from: f */
    public String f117790f;

    /* renamed from: g */
    public List<String> f117791g;

    /* renamed from: h */
    public List<String> f117792h;

    /* renamed from: i */
    public List<String> f117793i;

    /* renamed from: a */
    public final void mo112213a(JSONObject jSONObject) {
        this.f117789e = jSONObject.optLong("id");
        this.f117785a = jSONObject.optString("log_extra");
        this.f117786b = jSONObject.optInt("skip_time");
        this.f117787c = jSONObject.optInt("patch_position");
        this.f117788d = jSONObject.optInt("duration");
        this.f117790f = jSONObject.optString("external_url");
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("play_track_url_list");
            if (jSONArray != null) {
                this.f117791g = m144390a(jSONArray, new String[1]);
            }
        } catch (JSONException unused) {
        }
        try {
            JSONArray jSONArray2 = jSONObject.getJSONArray("playover_track_url_list");
            if (jSONArray2 != null) {
                this.f117792h = m144390a(jSONArray2, new String[1]);
            }
        } catch (JSONException unused2) {
        }
        try {
            JSONArray jSONArray3 = jSONObject.getJSONArray("action_track_url_list");
            if (jSONArray3 != null) {
                this.f117793i = m144390a(jSONArray3, new String[1]);
            }
        } catch (JSONException unused3) {
        }
    }

    /* renamed from: a */
    private static List<String> m144390a(Object obj, String[] strArr) {
        strArr[0] = null;
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                if (length == 0) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                strArr[0] = jSONArray.toString();
                return arrayList;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
