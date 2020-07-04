package com.bytedance.jirafast.models;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.jirafast.models.b */
public final class C12010b {

    /* renamed from: m */
    private static String f31931m = "AME";

    /* renamed from: a */
    public String f31932a;

    /* renamed from: b */
    public String f31933b;

    /* renamed from: c */
    public String f31934c;

    /* renamed from: d */
    public String f31935d;

    /* renamed from: e */
    public String f31936e;

    /* renamed from: f */
    public String f31937f;

    /* renamed from: g */
    public String f31938g;

    /* renamed from: h */
    public String f31939h;

    /* renamed from: i */
    public List<String> f31940i;

    /* renamed from: j */
    public String f31941j;

    /* renamed from: k */
    public String f31942k;

    /* renamed from: l */
    public List<String> f31943l;

    /* renamed from: b */
    private static String m35080b() {
        return f31931m;
    }

    /* renamed from: a */
    public final JSONObject mo29660a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("key", m35080b());
            jSONObject2.put("project", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            if ("AME".equals(m35080b())) {
                jSONObject4.put("name", "Bug");
            } else {
                jSONObject4.put("name", "缺陷");
            }
            jSONObject2.put("issuetype", jSONObject4);
            jSONObject2.put("summary", this.f31932a);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("id", this.f31935d);
            jSONObject2.put("priority", jSONObject5);
            if (this.f31940i != null && !this.f31940i.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.f31940i) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("name", str);
                    jSONArray.put(jSONObject6);
                }
                jSONObject2.put("components", jSONArray);
            }
            if (!this.f31937f.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("name", this.f31937f);
                jSONArray2.put(jSONObject7);
                jSONObject2.put("versions", jSONArray2);
            }
            if (!this.f31938g.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("name", this.f31938g);
                jSONArray3.put(jSONObject8);
                jSONObject2.put("fixVersions", jSONArray3);
            }
            if (this.f31941j != null && !this.f31941j.isEmpty()) {
                jSONObject2.put("customfield_10100", this.f31941j);
            }
            if (this.f31933b != null && !this.f31933b.isEmpty()) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("name", this.f31933b);
                jSONObject2.put("assignee", jSONObject9);
            }
            if (this.f31934c != null && !this.f31934c.isEmpty()) {
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put("name", this.f31934c);
                jSONObject2.put("reporter", jSONObject10);
            }
            jSONObject2.put("description", this.f31939h);
            jSONObject.put("fields", jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m35079a(String str) {
        f31931m = str;
    }

    public C12010b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<String> list) {
        this.f31932a = str;
        this.f31933b = str2;
        this.f31934c = str3;
        this.f31935d = str4;
        this.f31936e = str5;
        this.f31937f = str6;
        this.f31938g = str7;
        this.f31939h = str9;
        this.f31940i = list;
        this.f31941j = str8;
    }
}
