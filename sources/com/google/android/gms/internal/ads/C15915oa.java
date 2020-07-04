package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.oa */
public final class C15915oa {

    /* renamed from: a */
    public final String f44715a;

    /* renamed from: b */
    public final String f44716b;

    /* renamed from: c */
    public final List<String> f44717c;

    /* renamed from: d */
    public final String f44718d;

    /* renamed from: e */
    public final String f44719e;

    /* renamed from: f */
    public final List<String> f44720f;

    /* renamed from: g */
    public final List<String> f44721g;

    /* renamed from: h */
    public final List<String> f44722h;

    /* renamed from: i */
    public final List<String> f44723i;

    /* renamed from: j */
    public final List<String> f44724j;

    /* renamed from: k */
    public final String f44725k;

    /* renamed from: l */
    public final List<String> f44726l;

    /* renamed from: m */
    public final List<String> f44727m;

    /* renamed from: n */
    public final List<String> f44728n;

    /* renamed from: o */
    public final String f44729o;

    /* renamed from: p */
    public final String f44730p;

    /* renamed from: q */
    public final String f44731q;

    /* renamed from: r */
    public final String f44732r;

    /* renamed from: s */
    public final String f44733s;

    /* renamed from: t */
    public final List<String> f44734t;

    /* renamed from: u */
    public final String f44735u;

    /* renamed from: v */
    public final long f44736v;

    /* renamed from: w */
    private final String f44737w;

    public C15915oa(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str5, String str6, List<String> list6, List<String> list7, List<String> list8, String str7, String str8, String str9, String str10, String str11, List<String> list9, String str12, List<String> list10, String str13, long j) {
        this.f44715a = str;
        this.f44717c = list;
        this.f44720f = list2;
        this.f44721g = list3;
        this.f44722h = list4;
        this.f44723i = list5;
        this.f44725k = str5;
        this.f44726l = list6;
        this.f44727m = list7;
        this.f44728n = list8;
        this.f44729o = str7;
        this.f44730p = str8;
        this.f44724j = list10;
        this.f44736v = -1;
    }

    public C15915oa(JSONObject jSONObject) throws JSONException {
        this.f44716b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f44717c = Collections.unmodifiableList(arrayList);
        this.f44718d = jSONObject.optString("allocation_id", null);
        this.f44720f = C15924oj.m51487a(jSONObject, "clickurl");
        this.f44721g = C15924oj.m51487a(jSONObject, "imp_urls");
        this.f44722h = C15924oj.m51487a(jSONObject, "downloaded_imp_urls");
        this.f44724j = C15924oj.m51487a(jSONObject, "fill_urls");
        this.f44726l = C15924oj.m51487a(jSONObject, "video_start_urls");
        this.f44728n = C15924oj.m51487a(jSONObject, "video_complete_urls");
        this.f44727m = C15924oj.m51487a(jSONObject, "video_reward_urls");
        this.f44729o = jSONObject.optString("transaction_id");
        this.f44730p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        this.f44723i = optJSONObject != null ? C15924oj.m51487a(optJSONObject, "manual_impression_urls") : null;
        this.f44715a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f44725k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f44719e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f44731q = jSONObject.optString("html_template", null);
        this.f44732r = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f44733s = optJSONObject3 != null ? optJSONObject3.toString() : null;
        this.f44734t = C15924oj.m51487a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f44735u = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f44737w = jSONObject.optString("response_type", null);
        this.f44736v = jSONObject.optLong("ad_network_timeout_millis", -1);
    }

    /* renamed from: a */
    public final boolean mo41778a() {
        return "banner".equalsIgnoreCase(this.f44737w);
    }

    /* renamed from: b */
    public final boolean mo41779b() {
        return "native".equalsIgnoreCase(this.f44737w);
    }
}
