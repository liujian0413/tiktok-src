package com.p1848vk.sdk.api.model;

import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.c */
public final class C47209c {
    /* renamed from: a */
    public static int m147658a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        String optString = jSONObject.optString("type");
        if ("all".equals(optString)) {
            return 0;
        }
        if ("friends".equals(optString)) {
            return 1;
        }
        if ("friends_of_friends".equals(optString)) {
            return 2;
        }
        if ("nobody".equals(optString)) {
            return 3;
        }
        return 4;
    }
}
