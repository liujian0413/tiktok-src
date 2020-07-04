package com.facebook.appevents.codeless.internal;

import org.json.JSONException;
import org.json.JSONObject;

public final class PathComponent {

    /* renamed from: a */
    public final String f34825a;

    /* renamed from: b */
    public final int f34826b;

    /* renamed from: c */
    public final int f34827c;

    /* renamed from: d */
    public final String f34828d;

    /* renamed from: e */
    public final String f34829e;

    /* renamed from: f */
    public final String f34830f;

    /* renamed from: g */
    public final String f34831g;

    /* renamed from: h */
    public final int f34832h;

    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private MatchBitmaskType(int i) {
            this.value = i;
        }
    }

    PathComponent(JSONObject jSONObject) throws JSONException {
        this.f34825a = jSONObject.getString("class_name");
        this.f34826b = jSONObject.optInt("index", -1);
        this.f34827c = jSONObject.optInt("id");
        this.f34828d = jSONObject.optString("text");
        this.f34829e = jSONObject.optString("tag");
        this.f34830f = jSONObject.optString("description");
        this.f34831g = jSONObject.optString("hint");
        this.f34832h = jSONObject.optInt("match_bitmask");
    }
}
