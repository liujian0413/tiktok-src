package com.bytedance.p073ad.symphony.p085h;

import com.bytedance.p073ad.symphony.util.C2203f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.h.a */
public final class C2159a {

    /* renamed from: a */
    public static final C2159a f7326a = new C2159a();

    /* renamed from: b */
    public int f7327b;

    /* renamed from: c */
    public Map<String, String> f7328c;

    /* renamed from: d */
    public String f7329d;

    /* renamed from: e */
    String f7330e;

    /* renamed from: f */
    private List<Integer> f7331f;

    /* renamed from: g */
    private List<List<Integer>> f7332g;

    /* renamed from: h */
    private List<String> f7333h;

    /* renamed from: i */
    private List<Integer> f7334i;

    /* renamed from: a */
    public final String mo7847a() {
        return this.f7330e;
    }

    /* renamed from: c */
    public final List<List<Integer>> mo7849c() {
        if (this.f7332g != null) {
            return this.f7332g;
        }
        return new ArrayList();
    }

    /* renamed from: d */
    public final List<String> mo7850d() {
        if (this.f7333h == null) {
            this.f7333h = new ArrayList();
        }
        return this.f7333h;
    }

    /* renamed from: e */
    public final List<Integer> mo7851e() {
        if (this.f7334i == null) {
            this.f7334i = new ArrayList();
        }
        return this.f7334i;
    }

    /* renamed from: b */
    public final List<Integer> mo7848b() {
        this.f7331f = m9418a(this.f7331f);
        if (this.f7331f != null) {
            return this.f7331f;
        }
        return new ArrayList();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("displaySort-->");
        sb.append(mo7848b());
        if (C2203f.m9514a(this.f7332g)) {
            sb.append("preloadSort-->");
            sb.append(mo7849c());
        }
        if (this.f7334i != null && !this.f7334i.isEmpty()) {
            sb.append(this.f7334i);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static List<Integer> m9418a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next()) == null) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C2159a m9417a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                C2159a aVar = new C2159a();
                aVar.f7330e = jSONObject.toString();
                JSONArray optJSONArray = jSONObject.optJSONArray("display_sort");
                if (optJSONArray != null) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(Integer.valueOf(optJSONArray.getInt(i)));
                    }
                    aVar.f7331f = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("preload_sort");
                if (optJSONArray2 != null) {
                    ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i2);
                        if (optJSONArray3 != null) {
                            ArrayList arrayList3 = new ArrayList(optJSONArray3.length());
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                arrayList3.add(Integer.valueOf(optJSONArray3.getInt(i3)));
                            }
                            arrayList2.add(arrayList3);
                        }
                        aVar.f7332g = arrayList2;
                    }
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("keywords");
                if (optJSONArray4 != null) {
                    ArrayList arrayList4 = new ArrayList(optJSONArray4.length());
                    for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                        arrayList4.add(optJSONArray4.optString(i4, ""));
                    }
                    aVar.f7333h = arrayList4;
                }
                aVar.f7327b = jSONObject.optInt("gender");
                JSONArray optJSONArray5 = jSONObject.optJSONArray("separated_preload_sort");
                if (optJSONArray5 != null) {
                    ArrayList arrayList5 = new ArrayList(optJSONArray5.length());
                    for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                        arrayList5.add(Integer.valueOf(optJSONArray5.getInt(i5)));
                    }
                    aVar.f7334i = arrayList5;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("custom_targeting");
                if (optJSONObject != null) {
                    aVar.f7328c = new HashMap();
                    Iterator keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        aVar.f7328c.put(str, optJSONObject.optString(str));
                    }
                }
                return aVar;
            } catch (JSONException unused) {
                new StringBuilder("strategy json is not valid,json string:").append(jSONObject.toString());
            }
        }
        return null;
    }
}
