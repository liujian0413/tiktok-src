package com.p280ss.android.p817ad.splash.core.p828c;

import com.p280ss.android.p817ad.splash.p836g.C19126e;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c.e */
public final class C19006e {

    /* renamed from: a */
    public List<String> f51327a;

    /* renamed from: b */
    public int f51328b;

    /* renamed from: c */
    public int f51329c;

    /* renamed from: d */
    public String f51330d;

    /* renamed from: a */
    public final boolean mo50507a() {
        if (this.f51328b <= 0 || this.f51329c <= 0 || C19126e.m62680a(this.f51327a) || C19132j.m62736a(this.f51330d)) {
            return false;
        }
        String str = (String) this.f51327a.get(0);
        if (C19132j.m62736a(str) && this.f51327a.size() >= 2) {
            str = (String) this.f51327a.get(1);
            if (C19132j.m62736a(str) && this.f51327a.size() >= 3) {
                str = (String) this.f51327a.get(2);
            }
        }
        if (!C19132j.m62736a(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C19006e m62065a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("url_list");
        ArrayList arrayList = new ArrayList(3);
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("url");
                if (!C19132j.m62736a(optString)) {
                    arrayList.add(optString);
                }
            }
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString2 = jSONObject.optString("uri");
        if (C19132j.m62736a(optString2)) {
            return null;
        }
        return new C19006e(arrayList, optInt, optInt2, optString2);
    }

    private C19006e(List<String> list, int i, int i2, String str) {
        this.f51327a = list;
        this.f51328b = i;
        this.f51329c = i2;
        this.f51330d = str;
    }
}
