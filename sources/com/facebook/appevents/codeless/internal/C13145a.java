package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.codeless.internal.a */
public final class C13145a {

    /* renamed from: a */
    public final String f34834a;

    /* renamed from: b */
    public final String f34835b;

    /* renamed from: c */
    public final List<PathComponent> f34836c;

    /* renamed from: d */
    public final String f34837d;

    public C13145a(JSONObject jSONObject) throws JSONException {
        this.f34834a = jSONObject.getString("name");
        this.f34835b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new PathComponent(optJSONArray.getJSONObject(i)));
            }
        }
        this.f34836c = arrayList;
        this.f34837d = jSONObject.optString("path_type", "absolute");
    }
}
